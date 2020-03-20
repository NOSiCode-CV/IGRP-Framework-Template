package nosi.webapps.poser_2020.pages.attribute_render_wgs;

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
import nosi.webapps.poser_2020.dao.PoserTAttributeRender;
import nosi.webapps.poser_2020.dao.PoserTLayers;
import nosi.webapps.poser_2020.enums.GrupoDominio;

/*----#end-code----*/
		
public class Attribute_render_wgsController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Attribute_render_wgs model = new Attribute_render_wgs();
		model.load();
		Attribute_render_wgsView view = new Attribute_render_wgsView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.layer.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.operador.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
			    view.layer.setValue(ComboHelper.getAllActivesLayers());
		        view.operador.setValue(ComboHelper.getAtivesDominio(GrupoDominio.OPERADOR.getDominio()));

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_wgs() throws IOException, IllegalArgumentException, IllegalAccessException{
		Attribute_render_wgs model = new Attribute_render_wgs();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Attribute_render_wgs","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_wgs)----*/
		Session session = null;
	Transaction transaction = null;
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTAttributeRender posertattributerender  = new PoserTAttributeRender();
      
      PoserTLayers poserTLayers = session.find(PoserTLayers.class,model.getLayer()); 
          
          if(poserTLayers != null){
            posertattributerender.setLayerId(poserTLayers);
          }			
            posertattributerender.setOperador(model.getOperador());
			//posertattributerender.setLabel(model.getLabel());
			posertattributerender.setValor(model.getValor());
			posertattributerender.setHexaColor(model.getCor());
			posertattributerender.setCampo(model.getCampo());
		session.persist(posertattributerender);
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
		return this.redirect("poser_2020","Attribute_render_wgs","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
