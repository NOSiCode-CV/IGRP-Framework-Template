package nosi.webapps.poser_2020.pages.infowindow_geoserver;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Infowindow_geoserverController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Infowindow_geoserver model = new Infowindow_geoserver();
		model.load();
		Infowindow_geoserverView view = new Infowindow_geoserverView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSeparatorlist_1(Core.query(null,"SELECT '2' as layer_idt,'Elit sit sed accusantium totam' as label_idf,'63' as ordem_idf,'2' as campo_idf,'2' as editavel_ed "));
		view.layer_idt.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.campo_idf.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.editavel_ed.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_idt() throws IOException, IllegalArgumentException, IllegalAccessException{
		Infowindow_geoserver model = new Infowindow_geoserver();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Mapas_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_idt)----*/
		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Mapas_form","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
