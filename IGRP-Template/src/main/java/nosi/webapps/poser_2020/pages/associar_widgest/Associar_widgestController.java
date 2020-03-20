package nosi.webapps.poser_2020.pages.associar_widgest;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.stream.Collectors;
import nosi.webapps.poser_2020.dao.PoserTMapWidgets;
import nosi.webapps.poser_2020.helpers.ComboHelper;
import nosi.webapps.poser_2020.enums.GrupoDominio;
import nosi.webapps.poser_2020.dao.PoserTWidgets;
import nosi.webapps.poser_2020.helpers.ComboHelper; 
/*----#end-code----*/
		
public class Associar_widgestController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_widgest model = new Associar_widgest();
		model.load();
		Associar_widgestView view = new Associar_widgestView();
		view.widgest_ls.setParam(true);
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Accusantium rem sit voluptatem' as widgest_ls,'Labore totam mollit totam unde' as nome_ls,'Accusantium consectetur rem na' as posicao_ls,'3' as ordem_ls,'Consectetur elit adipiscing la' as tooltip_ls,'hidden-926d_a2a1' as id "));
		view.widgest.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.posicao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
      
      view.widgest.setValue(ComboHelper.getAllActivesWidgest());
      view.posicao.setValue(ComboHelper.getAtivesDominio(GrupoDominio.TPPOSITION.getDominio()));
      
      /*String teste=Core.getParam("p_widgest");
       String email = Core.getTaskVariableString("Associar_widgest","p_widgest"); //para imprimir o destinatario
            Core.setMessageInfo(email);*/

     try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserTMapWidgets posertmapwidgets = new PoserTMapWidgets().findOne(Core.getParamInt("p_id"));
		if (posertmapwidgets!=null && !posertmapwidgets.hasError()) {
			//model.setWidgest(posertmapwidgets.getWidgetsId());
			model.setNome(posertmapwidgets.getNome());
			model.setOrdem(posertmapwidgets.getOrdem());
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
      
      
      try{
	
	PoserTMapWidgets posertmapwidgetsfilter = new PoserTMapWidgets().find();
      //PoserTMapWidgets posertmapwidgets = new PoserTMapWidgets().findOne(Core.getParamInt("p_id"));  
        
       //  if(posertmapwidgets.getNome()="teste"){
        
    //  }
        
        
	List<PoserTMapWidgets> posertmapwidgetsList = posertmapwidgetsfilter.all();
	List<Associar_widgest.Table_1> posertmapwidgetsTable = new ArrayList<>();
	if(posertmapwidgetsList != null){
		for(PoserTMapWidgets posertmapwidgets : posertmapwidgetsList){
			Associar_widgest.Table_1 row = new Associar_widgest.Table_1();
          PoserTWidgets poserTWidgets=posertmapwidgets.getWidgetsId();
            
             if (poserTWidgets != null) {
               
              row.setWidgest_ls(poserTWidgets.getNome());
            }
			row.setNome_ls(posertmapwidgets.getNome());
			row.setOrdem_ls(posertmapwidgets.getOrdem());
			row.setId(""+posertmapwidgets.getId());         

			posertmapwidgetsTable.add(row);
          
           view.btn_configuracoes.setVisible(false);
		}
	}
	model.setTable_1(posertmapwidgetsTable);
	}catch(Exception e){
	e.printStackTrace();
	}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_widgest model = new Associar_widgest();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_widgest_ls",Core.getParam("p_widgest_ls"));
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Associar_widgest","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar)----*/
	
      Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTMapWidgets posertmapwidgets  = new PoserTMapWidgets();
		if(Core.isNotNull(isEdit)) {
			 posertmapwidgets = session.find(PoserTMapWidgets.class, Core.getParamInt("p_id"));
		}
		if (posertmapwidgets != null){
          PoserTWidgets poserTWidgets= session.find(PoserTWidgets.class, model.getWidgest()); 
           if(poserTWidgets != null){
            posertmapwidgets.setWidgetsId(poserTWidgets);
          }
			posertmapwidgets.setNome(model.getNome());
			posertmapwidgets.setOrdem(model.getOrdem());
		}
		session.persist(posertmapwidgets);
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
		return this.forward("poser_2020","Associar_widgest","index",this.queryString());
	}
      

		/*----#end-code----*/
		return this.redirect("poser_2020","Associar_widgest","index", this.queryString());	
	}
	
	public Response actionConfiguracoes() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_widgest model = new Associar_widgest();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_widgest_ls",Core.getParam("p_widgest_ls"));
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Associar_widgest","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(configuracoes)----*/
		String action = Core.getParam("p_widgest_ls");
      	if( Core.isNotNull(action)){
        	if(action.equals("Merge")){
              return this.redirect("poser_2020","Marge_wdg","index", this.queryString());
            }
          if( action.equals("Pesquisa")){
              return this.redirect("poser_2020","Pesquisa_default","index", this.queryString());
          }
          if( action.equals("Time Splider")){
		return this.redirect("poser_2020","Time_slider_wdg","index", this.queryString());	
            }
          if( action.equals("Identify")){
         // view.btn_configuracoes.setVisible(false);
          }
          if( action.equals("Edicao")){
           return this.redirect("poser_2020","Edicao_widget","index", this.queryString());	
          }
          if( action.equals("BaseMap")){
		return this.redirect("poser_2020","Basemap_wdgt","index", this.queryString());	
            }
          if( action.equals("Attribute Render")){
		return this.redirect("poser_2020","Attribute_render_wgs","index", this.queryString());	
            }
          if( action.equals("Selection Menu")){
		return this.redirect("poser_2020","Selection_menu_wgs","index", this.queryString());	
            }
        }
        Core.setMessageError();
        return this.redirect("poser_2020","Associar_widgest","index", this.queryString());	
		
		/*----#end-code----*/
			
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_widgest model = new Associar_widgest();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_widgest_ls",Core.getParam("p_widgest_ls"));
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Associar_widgest","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
	this.addQueryString("p_id", Core.getParam("p_id"));
	
	this.addQueryString("isEdit", "true");		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Associar_widgest","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_widgest model = new Associar_widgest();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_widgest_ls",Core.getParam("p_widgest_ls"));
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Associar_widgest","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(eliminar)----*/
	PoserTMapWidgets posertmapwidgets = new PoserTMapWidgets().findOne(Core.getParamInt("p_id"));
	if (posertmapwidgets != null && !posertmapwidgets.hasError()) {
		boolean del = posertmapwidgets.delete(Core.getParamInt("p_id"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(posertmapwidgets.getError().toString());
	}
			
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Associar_widgest","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/
 


/*----#end-code----*/
}
