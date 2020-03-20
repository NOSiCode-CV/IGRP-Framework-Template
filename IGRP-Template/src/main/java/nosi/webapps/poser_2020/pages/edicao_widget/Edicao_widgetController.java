package nosi.webapps.poser_2020.pages.edicao_widget;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.poser_2020.helpers.ComboHelper;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.dao.PoserTEdicao;
import nosi.webapps.poser_2020.dao.PoserTLayers;
/*----#end-code----*/
		
public class Edicao_widgetController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Edicao_widget model = new Edicao_widget();
		model.load();
		Edicao_widgetView view = new Edicao_widgetView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.layer_edi.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		 view.layer_edi.setValue(ComboHelper.getAllActivesLayers());
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_edi() throws IOException, IllegalArgumentException, IllegalAccessException{
		Edicao_widget model = new Edicao_widget();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Edicao_widget","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_edi)----*/
			Session session = null;
	Transaction transaction = null;
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTEdicao posertedicao  = new PoserTEdicao();
			//posertedicao.setId(model.getId());
      
         PoserTLayers poserTLayers = session.find(PoserTLayers.class,model.getLayer_edi()); 
          
          if(poserTLayers != null){
            posertedicao.setLayerId(poserTLayers);
          }
			posertedicao.setProcedimento(model.getProcedimento());
		session.persist(posertedicao);
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
		/*----#end-code----*/
		return this.redirect("poser_2020","Edicao_widget","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
