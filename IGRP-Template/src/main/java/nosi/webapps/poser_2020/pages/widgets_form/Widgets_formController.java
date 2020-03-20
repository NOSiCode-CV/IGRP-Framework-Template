package nosi.webapps.poser_2020.pages.widgets_form;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.Map;
import java.util.LinkedHashMap;
import nosi.webapps.poser_2020.helpers.ComboHelper; 

import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.dao.PoserTWidgets;
import nosi.webapps.poser_2020.enums.GrupoDominio;

/*----#end-code----*/
		
public class Widgets_formController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Widgets_form model = new Widgets_form();
		model.load();
		Widgets_formView view = new Widgets_formView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.posic_wdg.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		view.ins_wdg_text.setValue("Inserção de Widget");
      
      
      view.posic_wdg.setValue(ComboHelper.getAtivesDominioPosicao(GrupoDominio.TPPOSITION.getDominio()));
      
  
      	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserTWidgets posertwidgets = new PoserTWidgets().findOne(Core.getParamInt("p_id"));
		if (posertwidgets!=null && !posertwidgets.hasError()) {
			model.setNome_wgt_form(posertwidgets.getNome());
			model.setLabel_wdg_form(posertwidgets.getLabel());
			model.setXlm_proc_form(posertwidgets.getXmlProc());
			model.setPosic_wdg(posertwidgets.getPosicao());
			model.setIcon_form(posertwidgets.getIcon());
			model.setTooltip_wdg(posertwidgets.getTooltip());
			model.setPag_igrpweb_wdg(posertwidgets.getPaginaIgrp());
			model.setXml_def_form(posertwidgets.getXmlDefault());
          
          view.ins_wdg_text.setValue("Editar de Widget");
          
         // view.btn_grava_wdg.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
      /*	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserTWidgets posertwidgets = new PoserTWidgets().findOne(Core.getParamInt("p_id"));
		if (posertwidgets!=null && !posertwidgets.hasError()) {
			model.setNome_wgt_form(posertwidgets.getNome());
			model.setLabel_wdg_form(posertwidgets.getLabel());
			model.setXlm_proc_form(posertwidgets.getXmlProc());
			model.setPosic_wdg(posertwidgets.getPosicao());
			model.setIcon_form(posertwidgets.getIcon());
			model.setTooltip_wdg(posertwidgets.getTooltip());
			model.setPag_igrpweb_wdg(posertwidgets.getPaginaIgrp());
			model.setXml_def_form(posertwidgets.getXmlDefault());
	
	view.btn_grava_wdg.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
      */
  
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGrava_wdg() throws IOException, IllegalArgumentException, IllegalAccessException{
		Widgets_form model = new Widgets_form();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Widgets_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(grava_wdg)----*/
	
      	Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTWidgets posertwidgets  = new PoserTWidgets();
		if(Core.isNotNull(isEdit)) {
			 posertwidgets = session.find(PoserTWidgets.class, Core.getParamInt("p_id"));
		}
		if (posertwidgets != null){
			posertwidgets.setNome(model.getNome_wgt_form());
			posertwidgets.setLabel(model.getLabel_wdg_form());
			posertwidgets.setXmlProc(model.getXlm_proc_form());
			posertwidgets.setPosicao(model.getPosic_wdg());
			posertwidgets.setIcon(model.getIcon_form());
			posertwidgets.setTooltip(model.getTooltip_wdg());
			posertwidgets.setPaginaIgrp(model.getPag_igrpweb_wdg());
			posertwidgets.setXmlDefault(model.getXml_def_form());
			//posertwidgets.setId(Core.toInt(model.getForm_id_wdg()));
		}
		session.persist(posertwidgets);
		transaction.commit();
		Core.setMessageSuccess();
	}
	else
		Core.setMessageError();
	}catch ( Exception e ) {
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
	if(Core.isNotNull(isEdit)) {
		this.addQueryString("isEdit", "true");
		return this.forward("poser_2020","Widgets_form","index",this.queryString());
	}
      
      
      
      /*	Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTWidgets posertwidgets  = new PoserTWidgets();
		if(Core.isNotNull(isEdit)) {
			 posertwidgets = session.find(PoserTWidgets.class, Core.getParamInt("p_id"));
		}
		if (posertwidgets != null){
			posertwidgets.setNome(model.getNome_wgt_form());
			posertwidgets.setLabel(model.getLabel_wdg_form());
			posertwidgets.setXmlProc(model.getXlm_proc_form());
			posertwidgets.setPosicao(model.getPosic_wdg());
			posertwidgets.setIcon(model.getIcon_form());
			posertwidgets.setTooltip(model.getTooltip_wdg());
			posertwidgets.setPaginaIgrp(model.getPag_igrpweb_wdg());
			posertwidgets.setXmlDefault(model.getXml_def_form());
		}
		session.persist(posertwidgets);
		transaction.commit();
		Core.setMessageSuccess();
	}
	else
		Core.setMessageError();
	}catch ( Exception e ) {
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
	if(Core.isNotNull(isEdit)) {
		this.addQueryString("isEdit", "true");
		return this.forward("poser_2020","Widgets_form","index",this.queryString());
	
    }*/
		/*----#end-code----*/
		return this.redirect("poser_2020","Widgets_form","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
