package nosi.webapps.poser_2020.pages.flt_enquad;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.poser_2020.dao.PoserTFraming;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.poser_2020.dao.PoserTFraming;

/*----#end-code----*/
		
public class Flt_enquadController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Flt_enquad model = new Flt_enquad();
		model.load();
		Flt_enquadView view = new Flt_enquadView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Accusantium adipiscing labore' as nome_lst_enq,'Aperiam iste voluptatem magna sed' as c_latitude_flt,'Totam deserunt accusantium adipiscing elit' as c_long_ls,'Anim elit unde lorem consectet' as zoom_lst,'hidden-7842_4b51' as id,'hidden-6088_d25a' as teste "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
     /// view.button_1.setVisible(false);
      
      try{
	
	PoserTFraming posertframingfilter = new PoserTFraming().find();
	List<PoserTFraming> posertframingList = posertframingfilter.all();
	List<Flt_enquad.Table_1> posertframingTable = new ArrayList<>();
	if(posertframingList != null){
		for(PoserTFraming posertframing : posertframingList){
			Flt_enquad.Table_1 row = new Flt_enquad.Table_1();
			row.setNome_lst_enq(posertframing.getNome());
			row.setC_latitude_flt(posertframing.getCLatitude());
			row.setC_long_ls(posertframing.getCLongitude());
			row.setZoom_lst(""+posertframing.getZoom());
            row.setId(""+posertframing.getId());
            row.setTeste(posertframing.getNome());
			posertframingTable.add(row);
		}
	}
	model.setTable_1(posertframingTable);
	}catch(Exception e){
	e.printStackTrace();
	}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo_enq() throws IOException, IllegalArgumentException, IllegalAccessException{
		Flt_enquad model = new Flt_enquad();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Enquad_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_enq)----*/
		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Enquad_form","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Flt_enquad model = new Flt_enquad();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Enquad_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
	this.addQueryString("p_id", Core.getParam("p_id"));
	
	this.addQueryString("isEdit", "true");
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Enquad_form","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Flt_enquad model = new Flt_enquad();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Flt_enquad","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(eliminar)----*/
		PoserTFraming posertframing = new PoserTFraming().findOne(Core.getParamInt("p_id"));
	if (posertframing != null && !posertframing.hasError()) {
		boolean del = posertframing.delete(Core.getParamInt("p_id"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(posertframing.getError().toString());
	}
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Flt_enquad","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
