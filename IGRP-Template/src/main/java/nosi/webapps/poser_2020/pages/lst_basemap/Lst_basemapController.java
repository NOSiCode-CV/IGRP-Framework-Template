package nosi.webapps.poser_2020.pages.lst_basemap;

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
import nosi.webapps.poser_2020.dao.PoserParBasemap;

/*----#end-code----*/
		
public class Lst_basemapController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lst_basemap model = new Lst_basemap();
		model.load();
		Lst_basemapView view = new Lst_basemapView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Dolor ut officia mollit sed' as nom_lst,'Iste anim totam adipiscing omn' as codi_lst,'Unde voluptatem doloremque stract dolor' as link_lst,'hidden-9bad_98f1' as id "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try{
	
	PoserParBasemap poserparbasemapfilter = new PoserParBasemap().find();
	List<PoserParBasemap> poserparbasemapList = poserparbasemapfilter.all();
	List<Lst_basemap.Table_1> poserparbasemapTable = new ArrayList<>();
	if(poserparbasemapList != null){
		for(PoserParBasemap poserparbasemap : poserparbasemapList){
			Lst_basemap.Table_1 row = new Lst_basemap.Table_1();
			row.setCodi_lst(poserparbasemap.getCode());
			row.setLink_lst(poserparbasemap.getLink());
			row.setNom_lst(poserparbasemap.getNome());
            row.setId(poserparbasemap.getId());
			poserparbasemapTable.add(row);
		}
	}
	model.setTable_1(poserparbasemapTable);
	}catch(Exception e){
	e.printStackTrace();
	}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lst_basemap model = new Lst_basemap();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Basemapform","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Basemapform","index", this.queryString());	
	}
	
	public Response actionEditar_bm() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lst_basemap model = new Lst_basemap();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Basemapform","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar_bm)----*/
		this.addQueryString("p_id", Core.getParam("p_id"));
	
	    this.addQueryString("isEdit", "true");
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Basemapform","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lst_basemap model = new Lst_basemap();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Lst_basemap","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(eliminar)----*/
		PoserParBasemap poserparbasemap = new PoserParBasemap().findOne(Core.getParamInt("p_id"));
	if (poserparbasemap != null && !poserparbasemap.hasError()) {
		boolean del = poserparbasemap.delete(Core.getParamInt("p_id"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(poserparbasemap.getError().toString());
	}
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Lst_basemap","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
