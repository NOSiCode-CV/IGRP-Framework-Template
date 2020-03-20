package nosi.webapps.poser_2020.pages.lst_widg_form;

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
import nosi.webapps.poser_2020.dao.PoserTWidgets;
import nosi.webapps.poser_2020.dao.PoserTDominio;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
/*----#end-code----*/
		
public class Lst_widg_formController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lst_widg_form model = new Lst_widg_form();
		model.load();
		Lst_widg_formView view = new Lst_widg_formView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Aliqua amet totam sed natus' as nome_lst,'Doloremque aliqua mollit strac' as tooltip_lst,'Anim adipiscing ipsum perspici' as posicao_lst,'hidden-c3a4_4bb4' as id "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try{
	
	PoserTWidgets posertwidgetsfilter = new PoserTWidgets().find();
	List<PoserTWidgets> posertwidgetsList = posertwidgetsfilter.all();
	List<Lst_widg_form.Table_1> posertwidgetsTable = new ArrayList<>();
	if(posertwidgetsList != null){
		for(PoserTWidgets posertwidgets : posertwidgetsList){
			Lst_widg_form.Table_1 row = new Lst_widg_form.Table_1();
			row.setNome_lst(posertwidgets.getNome());
			row.setTooltip_lst(posertwidgets.getTooltip());
          
           PoserTDominio dominio=new PoserTDominio().find().andWhere("id","=",posertwidgets.getPosicao());
			//if(dominio != null){
          row.setPosicao_lst(dominio.getRvDomain());
            //    } 
			//row.setPosicao_lst(posertwidgets.getPosicao());
			row.setId(""+posertwidgets.getId());
			posertwidgetsTable.add(row);
		}
	}
	model.setTable_1(posertwidgetsTable);
	}catch(Exception e){
	e.printStackTrace();
	}
		
        try {

         JsonArray jsonArray = new JsonArray();
          List<PoserTWidgets> listP = new PoserTWidgets().findAll();
                for(PoserTWidgets w : listP) {
                    JsonObject j = new JsonObject();
                  
                j.addProperty("NOME", w.getNome());
                j.addProperty("LABEL", w.getLabel());
                j.addProperty("XML PROC", w.getXmlProc());
                j.addProperty("POSICAO", w.getPosicao());
                j.addProperty("ICON", w.getIcon());
                j.addProperty("TOOLTIP", w.getTooltip());
                j.addProperty("PAGINA IGRP", w.getPaginaIgrp());
                j.addProperty("XML DEFAULT", w.getXmlDefault());
                j.addProperty("ID", w.getId());
                  
                    jsonArray.add(j);
                  }
                   String json = jsonArray.toString();
                   Core.setMessageInfo(json);
                   System.out.println(json);
                  } catch (Exception e) {
                   e.printStackTrace();
                   }
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lst_widg_form model = new Lst_widg_form();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Widgets_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Widgets_form","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lst_widg_form model = new Lst_widg_form();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Widgets_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
		this.addQueryString("p_id", Core.getParam("p_id"));
	
	    this.addQueryString("isEdit", "true");
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Widgets_form","index", this.queryString());	
	}
	
	public Response actionEliminar_wg() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lst_widg_form model = new Lst_widg_form();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Lst_widg_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(eliminar_wg)----*/
		PoserTWidgets posertwidgets = new PoserTWidgets().findOne(Core.getParamInt("p_id"));
	if (posertwidgets != null && !posertwidgets.hasError()) {
		boolean del = posertwidgets.delete(Core.getParamInt("p_id"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(posertwidgets.getError().toString());
	}
	
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Lst_widg_form","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
