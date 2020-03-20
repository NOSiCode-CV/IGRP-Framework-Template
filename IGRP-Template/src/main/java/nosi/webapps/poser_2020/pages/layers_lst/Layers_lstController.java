package nosi.webapps.poser_2020.pages.layers_lst;

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

import org.hibernate.Transaction;
import org.hibernate.Session;

import java.util.LinkedHashMap;
import nosi.webapps.poser_2020.helpers.ComboHelper; 

import nosi.webapps.poser_2020.dao.PoserTLayers;
import nosi.webapps.poser_2020.dao.PoserTDominio;
import nosi.webapps.poser_2020.enums.GrupoDominio;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
/*----#end-code----*/
		
public class Layers_lstController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Layers_lst model = new Layers_lst();
		model.load();
		Layers_lstView view = new Layers_lstView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Officia sit amet natus deserun' as nome_layer_lst,'Magna stract ipsum deserunt na' as codigo_layer_lst,'Accusantium adipiscing aliqua' as tp_layer_lst,'Doloremque lorem unde amet ali' as url_layer_lst,'hidden-bb85_606e' as id "));
		view.tipo_servico_lst.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
      view.tipo_servico_lst.setValue(ComboHelper.getAtivesDominio(GrupoDominio.TPSERVICO.getDominio()));
     try{
	
	PoserTLayers posertlayersfilter = new PoserTLayers().find().andWhere("estado","=","A");
          
          if(Core.isNotNullOrZero(model.getNome_layer_flt())){
                      posertlayersfilter.andWhere("nome","=",model.getNome_layer_flt());
                  } 
        if(Core.isNotNullOrZero(model.getTipo_servico_lst())){
                      posertlayersfilter.andWhere("tipo","=",model.getTipo_servico_lst());
                  }
          
          
	List<PoserTLayers> posertlayersList = posertlayersfilter.all();
	List<Layers_lst.Table_1> posertlayersTable = new ArrayList<>();
	if(posertlayersList != null){
		for(PoserTLayers posertlayers : posertlayersList){
			Layers_lst.Table_1 row = new Layers_lst.Table_1();
			row.setNome_layer_lst(posertlayers.getNome());
			row.setCodigo_layer_lst(posertlayers.getCodigo());
          
          PoserTDominio dominio=new PoserTDominio().find().andWhere("id","=",posertlayers.getTipo());
			if(dominio != null){
          row.setTp_layer_lst(dominio.getRvDomain());
                } 
          
            //row.setTp_layer_lst(dominio.getRvDomain());
            //row.setTp_layer_lst(posertlayers.getTipo());
			row.setUrl_layer_lst(posertlayers.getUrl());
          	row.setId(""+posertlayers.getId());

			posertlayersTable.add(row);
		}
	}
	model.setTable_1(posertlayersTable);
	}catch(Exception e){
	e.printStackTrace();
	}
      
      try {

         JsonArray jsonArray = new JsonArray();
          List<PoserTLayers> listP = new PoserTLayers().findAll();
                for(PoserTLayers w : listP) {
                    JsonObject j = new JsonObject();
                  
                j.addProperty("NOME", w.getNome());
                j.addProperty("CODIGO", w.getCode());
                j.addProperty("URL", w.getUrl());
                j.addProperty("TYPE NAME", w.getTypeName());
                j.addProperty("LAYERS", w.getLayers());
                j.addProperty("OUTPUT FORMAT", w.getOutputFormat());
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
		Layers_lst model = new Layers_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Layers_inserir","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Layers_inserir","index", this.queryString());	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Layers_lst model = new Layers_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Mapas_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(pesquisar)----*/
		return this.forward("poser_2020","Layers_lst","index",this.queryString());
		
		/*----#end-code----*/
			
	}
	
	public Response actionEstd_layer() throws IOException, IllegalArgumentException, IllegalAccessException{
		Layers_lst model = new Layers_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Layers_lst","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(estd_layer)----*/
			
	String pId = Core.getParam("p_id");
      
      if(Core.isNotNull(pId)) {
        PoserTLayers posertlayers  = new PoserTLayers().findOne(Core.getParamInt("p_id"));
		posertlayers.setEstado("I");
        posertlayers = posertlayers.update();
        
         if(posertlayers!=null){
            Core.setMessageSuccess();
          }else
            Core.setMessageError(); 
          }
     
		/*----#end-code----*/
		return this.redirect("poser_2020","Layers_lst","index", this.queryString());	
	}
	
	public Response actionEditar_layer() throws IOException, IllegalArgumentException, IllegalAccessException{
		Layers_lst model = new Layers_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Layers_inserir","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar_layer)----*/
	this.addQueryString("p_id", Core.getParam("p_id"));
	
	this.addQueryString("isEdit", "true");
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Layers_inserir","index", this.queryString());	
	}
	
	public Response actionEliminar_layer() throws IOException, IllegalArgumentException, IllegalAccessException{
		Layers_lst model = new Layers_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Layers_lst","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(eliminar_layer)----*/
		PoserTLayers posertlayers = new PoserTLayers().findOne(Core.getParamInt("p_id"));
	if (posertlayers != null && !posertlayers.hasError()) {
		boolean del = posertlayers.delete(Core.getParamInt("p_id"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(posertlayers.getError().toString());
	}
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Layers_lst","index", this.queryString());	
	}
	
	public Response actionServico() throws IOException, IllegalArgumentException, IllegalAccessException{
		Layers_lst model = new Layers_lst();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Appnosigis","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(servico)----*/
		this.addQueryString("p_id", Core.getParam("p_id"));
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Appnosigis","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
