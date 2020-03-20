package nosi.webapps.poser_2020.pages.basemapform;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.LinkedHashMap;
import nosi.webapps.poser_2020.helpers.ComboHelper;

import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.dao.PoserParBasemap;
/*----#end-code----*/
		
public class BasemapformController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Basemapform model = new Basemapform();
		model.load();
		BasemapformView view = new BasemapformView();
		/*----#start-code(index)----*/
			
      view.form_bm_text.setValue("Inserção de BaseMap");

     // view.origem.setValue(ComboHelper.getAtivesDominio());
      
      try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserParBasemap poserparbasemap = new PoserParBasemap().findOne(Core.getParamInt("p_id"));
		if (poserparbasemap!=null && !poserparbasemap.hasError()) {
			model.setCod_bm(poserparbasemap.getCode());
			model.setLink_bs(poserparbasemap.getLink());
			//model.setImpr_bs(poserparbasemap.getMimeType());
			model.setNome_bs(poserparbasemap.getNome());
			//model.setOrigem(poserparbasemap.getOrigem());
			//model.setOrigem_id(poserparbasemap.getOrigemId());

                view.form_bm_text.setValue("Editar de BaseMap");

           view.btn_gravar_bs.addParameter("isEdit", "true");
      }
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_bs() throws IOException, IllegalArgumentException, IllegalAccessException{
		Basemapform model = new Basemapform();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Basemapform","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_bs)----*/
    Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserParBasemap poserparbasemap  = new PoserParBasemap();
		if(Core.isNotNull(isEdit)) {
			 poserparbasemap = session.find(PoserParBasemap.class, Core.getParamInt("p_id"));
		}
		if (poserparbasemap != null){
			poserparbasemap.setCode(model.getCod_bm());
			poserparbasemap.setLink(model.getLink_bs());
			poserparbasemap.setNome(model.getNome_bs());
			//poserparbasemap.setMimeType(model.getImpr_bs());
			//poserparbasemap.setOrigem(model.getOrigem());
			//poserparbasemap.setOrigemId(model.getOrigem_id());
		}
		session.persist(poserparbasemap);
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
		return this.forward("poser_2020","Basemapform","index",this.queryString());
	}
		/*----#end-code----*/
		return this.redirect("poser_2020","Basemapform","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
