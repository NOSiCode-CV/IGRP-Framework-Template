package nosi.webapps.poser_2020.pages.mapas_lst;

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
import java.util.List;
import nosi.webapps.poser_2020.dao.PoserTMapa;
import nosi.webapps.poser_2020.dao.PoserTFraming;
/*----#end-code----*/
		
public class Mapas_lstController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapas_lst model = new Mapas_lst();
		model.load();
		Mapas_lstView view = new Mapas_lstView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Deserunt ipsum stract sed sit' as titulo_mapa_lst,'Perspiciatis voluptatem sed do' as codigo_mapa_lst,'Deserunt perspiciatis sed natu' as enquadramento,'hidden-a8b3_e31f' as id "));
		  ----#gen-example */
		/*----#start-code(index)----*/
	
      try{
	
	PoserTMapa posertmapafilter = new PoserTMapa().find();
	List<PoserTMapa> posertmapaList = posertmapafilter.all();
	List<Mapas_lst.Table_1> posertmapaTable = new ArrayList<>();
	if(posertmapaList != null){
		for(PoserTMapa posertmapa : posertmapaList){
			Mapas_lst.Table_1 row = new Mapas_lst.Table_1();
			row.setTitulo_mapa_lst(posertmapa.getTituliMapa());
			row.setCodigo_mapa_lst(posertmapa.getCodeMap());
			row.setEnquadramento(posertmapa.getIdFraming().getNome()!=null?posertmapa.getIdFraming().getNome():null);
			row.setId(posertmapa.getId());
			posertmapaTable.add(row);
		}
	}
	model.setTable_1(posertmapaTable);
	}catch(Exception e){
	e.printStackTrace();
	}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapas_lst model = new Mapas_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Mapas_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Mapas_form","index", this.queryString());	
	}
	
	public Response actionVer_mapa() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapas_lst model = new Mapas_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Ver_mapa","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(ver_mapa)----*/
		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Ver_mapa","index", this.queryString());	
	}
	
	public Response actionEditar_map() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapas_lst model = new Mapas_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Mapas_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar_map)----*/
	this.addQueryString("p_id", Core.getParam("p_id"));
	
	this.addQueryString("isEdit", "true");
		/*----#end-code----*/
		return this.redirect("poser_2020","Mapas_form","index", this.queryString());	
	}
	
	public Response actionElimnar_map() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapas_lst model = new Mapas_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Mapas_lst","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(elimnar_map)----*/
	PoserTMapa posertmapa = new PoserTMapa().findOne(Core.getParamInt("p_id"));
	if (posertmapa != null && !posertmapa.hasError()) {
		boolean del = posertmapa.delete(Core.getParamInt("p_id"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(posertmapa.getError().toString());
	}	
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Mapas_lst","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/

/*----#end-code----*/
}
