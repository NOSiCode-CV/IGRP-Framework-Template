package nosi.webapps.poser_2020.pages.dominio_form;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.dao.PoserTDominio;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.poser_2020.dao.PoserTDominio;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*----#end-code----*/
		
public class Dominio_formController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dominio_form model = new Dominio_form();
		model.load();
		Dominio_formView view = new Dominio_formView();
		view.est_form.loadDomain("DM_ESTADO","poser_2020","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  ----#gen-example */
		/*----#start-code(index)----*/
		view.gest_d_text.setValue("Inserção de Domínio");
      
      try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserTDominio posertdominio = new PoserTDominio().findOne(Core.getParamInt("p_id"));
      
      
		if (posertdominio!=null && !posertdominio.hasError()) {
			model.setDominio_reg(posertdominio.getRvDomain());
			model.setCodigo_reg(posertdominio.getRvLowValue());
			model.setSignif_reg(posertdominio.getRvMeaning());
			model.setEst_form(posertdominio.getEstado());
	
          		view.gest_d_text.setValue("Editar de Domínio");

	view.btn_gravar_dom.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_dom() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dominio_form model = new Dominio_form();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Dominio_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_dom)----*/
     Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTDominio posertdominio  = new PoserTDominio();
		if(Core.isNotNull(isEdit)) {
			 posertdominio = session.find(PoserTDominio.class, model.getId());
		}
		if (posertdominio != null){
			posertdominio.setId(model.getId());
			posertdominio.setRvLowValue(model.getCodigo_reg());
			posertdominio.setRvDomain(model.getDominio_reg());
			posertdominio.setRvMeaning(model.getSignif_reg());
			posertdominio.setEstado(model.getEst_form());
		}
		session.persist(posertdominio);
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
		return this.forward("poser_2020","Dominio_form","index",this.queryString());
	}
      
    	
		/*----#end-code----*/
		return this.redirect("poser_2020","Dominio_form","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
