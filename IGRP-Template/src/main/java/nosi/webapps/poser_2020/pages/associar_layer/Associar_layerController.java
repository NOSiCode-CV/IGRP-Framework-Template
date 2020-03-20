package nosi.webapps.poser_2020.pages.associar_layer;

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
import nosi.webapps.poser_2020.dao.PoserTLayerMap;
import nosi.webapps.poser_2020.dao.PoserTLayers;
import nosi.webapps.poser_2020.dao.PoserTMapa;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
/*----#end-code----*/
		
public class Associar_layerController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_layer model = new Associar_layer();
		model.load();
		Associar_layerView view = new Associar_layerView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Unde sit natus anim stract' as layers_ls,'Anim accusantium consectetur d' as ordem_ls,'Dolor sit sed magna omnis' as label_ls,'hidden-164f_a63b' as id "));
		view.layers.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.label.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		 view.layers.setValue(ComboHelper.getAllActivesLayers());
		
      
      try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserTLayerMap posertlayermap = new PoserTLayerMap().findOne(Core.getParamInt("p_id"));
		if (posertlayermap!=null && !posertlayermap.hasError()) {
           PoserTLayers poserTLayers = posertlayermap.getLayerId();
			model.setLayers(poserTLayers.getId());
			model.setLabel(posertlayermap.getLabel());
			model.setOrdem(Core.toInt(posertlayermap.getOrdem()));
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
      
      
      try{
	
	PoserTLayerMap posertlayermapfilter = new PoserTLayerMap().find();
	List<PoserTLayerMap> posertlayermapList = posertlayermapfilter.all();
	List<Associar_layer.Table_1> posertlayermapTable = new ArrayList<>();
	if(posertlayermapList != null){
		for(PoserTLayerMap posertlayermap : posertlayermapList){
			Associar_layer.Table_1 row = new Associar_layer.Table_1();
            PoserTLayers poserTLayers = posertlayermap.getLayerId();
         // row.setId();
            if (poserTLayers != null) {
              row.setLayers_ls(poserTLayers.getNome());
            }			
			row.setOrdem_ls(posertlayermap.getOrdem());
			row.setLabel_ls(posertlayermap.getLabel());
            row.setId(""+posertlayermap.getId());
			posertlayermapTable.add(row);
		}
	}
	model.setTable_1(posertlayermapTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_layer model = new Associar_layer();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Associar_layer","index",this.queryString()); //if submit, loads the values
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
		PoserTLayerMap posertlayermap  = new PoserTLayerMap();
		if(Core.isNotNull(isEdit)) {
			 posertlayermap = session.find(PoserTLayerMap.class, Core.getParamInt("p_id"));
		}
		if (posertlayermap != null){
	        PoserTLayers poserTLayers = session.find(PoserTLayers.class, model.getLayers()); 
          
          if(poserTLayers != null){
            posertlayermap.setLayerId(poserTLayers);
          }
            
			posertlayermap.setLabel(model.getLabel());
			posertlayermap.setOrdem(""+model.getOrdem());
          PoserTMapa poserTMapa = session.find(PoserTMapa.class, Core.getParamInt("p_id"));
           if(poserTMapa != null){
          Core.setMessageInfo(""+poserTMapa);
            posertlayermap.setMapaId(poserTMapa);
           }
		}
		session.persist(posertlayermap);
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
		return this.forward("poser_2020","Associar_layer","index",this.queryString());
	}
     
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Associar_layer","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_layer model = new Associar_layer();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Associar_layer","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
		this.addQueryString("p_id", Core.getParam("p_id"));
	
	   this.addQueryString("isEdit", "true");
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Associar_layer","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Associar_layer model = new Associar_layer();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("poser_2020","Associar_layer","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(eliminar)----*/
		PoserTLayerMap posertlayermap = new PoserTLayerMap().findOne(Core.getParamInt("p_id"));
	if (posertlayermap != null && !posertlayermap.hasError()) {
		boolean del = posertlayermap.delete(Core.getParamInt("p_id"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(posertlayermap.getError().toString());
	}
	
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Associar_layer","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
