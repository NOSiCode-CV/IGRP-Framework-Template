package nosi.webapps.poser_2020.pages.enquad_form;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.dao.PoserTFraming;
/*----#end-code----*/
		
public class Enquad_formController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Enquad_form model = new Enquad_form();
		model.load();
		Enquad_formView view = new Enquad_formView();
		/*----#start-code(index)----*/
 
      view.tt_eng_text.setValue("Inserção de Enquadramento");
      
      try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserTFraming posertframing = new PoserTFraming().findOne(Core.getParamInt("p_id"));
		if (posertframing!=null && !posertframing.hasError()) {
			model.setNome_enq(posertframing.getNome());
			model.setC_latitude(posertframing.getCLatitude());
			model.setC_longitude(posertframing.getCLongitude());
			model.setZoom_enq(""+posertframing.getZoom());
          
           view.tt_eng_text.setValue("Editar de Enquadramento");
          
         view.btn_gravar_enq.addParameter("isEdit", "true");		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_enq() throws IOException, IllegalArgumentException, IllegalAccessException{
		Enquad_form model = new Enquad_form();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Enquad_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_enq)----*/
Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTFraming posertframing  = new PoserTFraming();
		if(Core.isNotNull(isEdit)) {
			 posertframing = session.find(PoserTFraming.class, Core.getParamInt("p_id"));
		}
		if (posertframing != null){
			//posertframing.setId(Core.toInt(model.getId()));
			posertframing.setCLatitude(model.getC_latitude());
			posertframing.setCLongitude(model.getC_longitude());
			posertframing.setNome(model.getNome_enq());
			posertframing.setZoom(Core.toInt(model.getZoom_enq()));
		}
		session.persist(posertframing);
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
		return this.forward("poser_2020","Enquad_form","index",this.queryString());
	}
		/*----#end-code----*/
		return this.redirect("poser_2020","Enquad_form","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
