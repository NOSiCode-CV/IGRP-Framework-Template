package nosi.webapps.poser_2020.pages.pesquisa_default;

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
import nosi.webapps.poser_2020.dao.PoserTPesquisa;
import nosi.webapps.poser_2020.dao.PoserTLayers;
/*----#end-code----*/
		
public class Pesquisa_defaultController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Pesquisa_default model = new Pesquisa_default();
		model.load();
		Pesquisa_defaultView view = new Pesquisa_defaultView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.layer_pd_wdg.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
	    view.layer_pd_wdg.setValue(ComboHelper.getAllActivesLayers());

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_pd_wdg() throws IOException, IllegalArgumentException, IllegalAccessException{
		Pesquisa_default model = new Pesquisa_default();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Pesquisa_default","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_pd_wdg)----*/

      Session session = null;
	Transaction transaction = null;
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTPesquisa posertpesquisa  = new PoserTPesquisa();
			
       PoserTLayers poserTLayers = session.find(PoserTLayers.class,model.getLayer_pd_wdg()); 
          
          if(poserTLayers != null){
            posertpesquisa.setLayerId(poserTLayers);
          }
			posertpesquisa.setCampo(model.getCampo_pes());
		session.persist(posertpesquisa);
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
      
      
      
      
      /*Session session = null;
	Transaction transaction = null;
	try{
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		List<String> posertpesquisaeditList = new ArrayList<>();
		if(model.getP_pd_wdg_edit() != null){
			posertpesquisaeditList =  new ArrayList<>(Arrays.asList(model.getP_pd_wdg_edit()));
		}
		for(Pesquisa_default.Pd_wdg row : model.getPd_wdg()){
			PoserTPesquisa posertpesquisa = new PoserTPesquisa();
			if( Core.isNotNull( row.getPd_wdg_id()) && Core.isNotNull( row.getPd_wdg_id().getKey())){
				if(!posertpesquisaeditList.isEmpty() && posertpesquisaeditList.remove(row.getPd_wdg_id().getKey())) {
					posertpesquisa = session.find(PoserTPesquisa.class, Core.toInt(row.getPd_wdg_id().getKey()));
				}
				else
					continue;
			}
			PoserTLayers posertlayers =new PoserTLayers();	
			posertpesquisa.setLayerId(posertlayers);
			posertpesquisa.setCampo(row.getCampo_pes().getKey());
			session.persist(posertpesquisa);
		}
	String [] posertpesquisadeletedIdsArray = model.getP_pd_wdg_del();
	if ( Core.isNotNull(posertpesquisadeletedIdsArray ) ) {
	for ( String docId : posertpesquisadeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			PoserTPesquisa posertpesquisa = session.find(PoserTPesquisa.class, Core.toInt(docId));
			session.delete(posertpesquisa);
			}
		}
	}
	
		transaction.commit();
		Core.setMessageSuccess();
	}catch ( Exception e ) {
		e.printStackTrace();
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}*/
	
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Pesquisa_default","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
