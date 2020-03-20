package nosi.webapps.poser_2020.pages.domin_lst;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.poser_2020.dao.PoserTDominio;
import java.util.ArrayList;
import java.util.List;

/*----#end-code----*/
		
public class Domin_lstController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Domin_lst model = new Domin_lst();
		model.load();
		Domin_lstView view = new Domin_lstView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Magna iste omnis doloremque adipiscing' as dom_lst,'Ipsum sit aliqua sit anim' as codigo_lst,'Adipiscing laudantium totam magna aliqua' as significado_lst,'hidden-3396_9538' as id,'hidden-f7b4_5ec8' as teste "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try{
	
	PoserTDominio posertdominiofilter = new PoserTDominio().find().andWhere("estado","=","A");
                    
	List<PoserTDominio> posertdominioList = posertdominiofilter.all();
	List<Domin_lst.Table_1> posertdominioTable = new ArrayList<>();
	if(posertdominioList != null){
		for(PoserTDominio posertdominio : posertdominioList){
			Domin_lst.Table_1 row = new Domin_lst.Table_1();
			row.setDom_lst(posertdominio.getRvDomain());
			row.setCodigo_lst(posertdominio.getRvLowValue());
			row.setSignificado_lst(posertdominio.getRvMeaning());
            row.setId(""+posertdominio.getId());
			posertdominioTable.add(row);
		}
	}
	model.setTable_1(posertdominioTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Domin_lst model = new Domin_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Dominio_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Dominio_form","index", this.queryString());	
	}
	
	public Response actionAlt_est() throws IOException, IllegalArgumentException, IllegalAccessException{
		Domin_lst model = new Domin_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Domin_lst","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(alt_est)----*/
					
	String pId = Core.getParam("p_id");
      
      if(Core.isNotNull(pId)) {
        PoserTDominio posertdominiofilter = new PoserTDominio().findOne(Core.getParamInt("p_id"));
		posertdominiofilter.setEstado("I");
        posertdominiofilter = posertdominiofilter.update();
        
         if(posertdominiofilter!=null){
            Core.setMessageSuccess();
          }else
            Core.setMessageError(); 
          }
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Domin_lst","index", this.queryString());	
	}
	
	public Response actionEditar_lst() throws IOException, IllegalArgumentException, IllegalAccessException{
		Domin_lst model = new Domin_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Dominio_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar_lst)----*/
		this.addQueryString("isEdit", "true");
	
	    this.addQueryString("p_id", Core.getParam("p_id"));
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Dominio_form","index", this.queryString());	
	}
	
	public Response actionElimin_lst() throws IOException, IllegalArgumentException, IllegalAccessException{
		Domin_lst model = new Domin_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Mapas_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(elimin_lst)----*/
		PoserTDominio posertdominio = new PoserTDominio().findOne(Core.getParamInt("p_id"));
	if (posertdominio != null && !posertdominio.hasError()) {
		boolean del = posertdominio.delete(Core.getParamInt("p_id"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(posertdominio.getError().toString());
	}
	
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Mapas_form","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
