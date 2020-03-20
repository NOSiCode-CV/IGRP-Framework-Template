package nosi.webapps.poser_2020.pages.appnosigis;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import nosi.webapps.poser_2020.dao.PoserTLayers;
import nosi.webapps.poser_2020.dao.PoserTMapa;
import nosi.webapps.poser_2020.dao.PoserParBasemap;
import nosi.webapps.poser_2020.dao.PoserTWidgets;
import nosi.webapps.poser_2020.dao.PoserTFraming;
import nosi.webapps.poser_2020.dao.PoserTMapBasemap;
import nosi.webapps.poser_2020.dao.PoserTLayerMap;
import nosi.webapps.poser_2020.dao.PoserTMapWidgets;
/*----#end-code----*/
		
public class AppnosigisController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Appnosigis model = new Appnosigis();
		model.load();
		AppnosigisView view = new AppnosigisView();
		/*----#start-code(index)----*/
		String p_param =  Core.getParam("p_param");
               try {
         System.out.println("teste");
         //JsonArray jsonArray = new JsonArray();
                              
         JsonObject map= new JsonObject();
                 
          PoserTMapa poserTMapa = new PoserTMapa().find().andWhere("id","=",Core.getParamInt("p_id"));
          map.addProperty("TITULO_MAPA", poserTMapa.getTituliMapa());
          map.addProperty("CODIGO", poserTMapa.getCodeMap());
          map.addProperty("ID", poserTMapa.getId());
         
             PoserTFraming poserTFraming=poserTMapa.getIdFraming();
                 
              //map.addProperty("zoom", poserTFraming.getZoom());
                 
                // map.addProperty("f",poserTFraming);

                 JsonArray enquadramento = new JsonArray();

                 map.add("center",enquadramento);
                 enquadramento.add(poserTFraming.getCLatitude());
                 enquadramento.add(poserTFraming.getCLongitude());
               
                 
          JsonArray basemaps = new JsonArray();
         map.add("basemaps",basemaps);
          
         JsonArray groupLayers = new JsonArray();
         map.add("groupLayers",groupLayers);
          
         JsonArray widgets = new JsonArray();
         map.add("widgets",widgets);
                 
        
                      /*  PoserTMapBasemap poserParBasemapa = new PoserTMapBasemap().find().andWhere("idMapa","=",Core.getParamInt("p_id"));
         
                   List<PoserTMapBasemap> listBasemap = poserParBasemapa.all();
           
                for(PoserTMapBasemap b : listBasemap) {
                    JsonObject c = new JsonObject();
                  
                c.addProperty("ID", b.getId());
                  
                    basemaps.add(c);
                  }
                 
                 
                PoserTLayerMap posertlayers = new PoserTLayerMap().find().andWhere("mapaId","=",Core.getParamInt("p_id"));
                List<PoserTLayerMap> listLayers = posertlayers.all();
               
                for(PoserTLayerMap la : listLayers) {
                    JsonObject l = new JsonObject();
                
                l.addProperty("ID", la.getId());
              
                    groupLayers.add(l);
                  }
                  
                   PoserTMapWidgets posertWidgest= new PoserTMapWidgets().find().andWhere("mapaId","=",Core.getParamInt("p_id"));
                    List<PoserTMapWidgets> listWidgest = posertWidgest.all();
                  // List<PoserTMapWidgets> listWidgest = new PoserTMapWidgets().findAll();
                for(PoserTMapWidgets lw : listWidgest) {
                    JsonObject jw = new JsonObject();
                
                jw.addProperty("ID", lw.getId());
                  
                    jsonArray.add(jw);
                  }
                  
                  }*/
           
       
                  String json = map.toString();
                  this.format = Response.FORMAT_JSON;
                
                  return this.renderView(json);
                 
         
         } catch (Exception e) {
          e.printStackTrace();
       }
    
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
