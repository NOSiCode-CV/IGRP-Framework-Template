package nosi.webapps.poser_2020.pages.mapas_form;

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
import nosi.webapps.poser_2020.enums.GrupoDominio;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.pages.mapas_form.Mapas_form.Separatorlist_1;
import nosi.webapps.poser_2020.pages.mapas_form.Mapas_form.Separatorlist_2;
import nosi.webapps.poser_2020.dao.PoserTLayers;
import nosi.webapps.poser_2020.dao.PoserTMapa;
import nosi.webapps.poser_2020.dao.PoserTMapWidgets;
import nosi.webapps.poser_2020.dao.PoserTWidgets;
import nosi.webapps.poser_2020.dao.PoserTLayerMap;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.webapps.poser_2020.dao.PoserTFraming;
import nosi.webapps.poser_2020.dao.PoserParBasemap;
import nosi.webapps.poser_2020.dao.PoserTMapBasemap;
import nosi.webapps.poser_2020.dao.PoserTMapBasemap;
import nosi.webapps.poser_2020.dao.PoserParBasemap;
/*----#end-code----*/
		
public class Mapas_formController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapas_form model = new Mapas_form();
		model.load();
		Mapas_formView view = new Mapas_formView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSeparatorlist_1(Core.query(null,"SELECT '2' as layers_aass,'hidden-2ce0_dace' as map_id "));
		model.loadSeparatorlist_2(Core.query(null,"SELECT '2' as widgets_ass_form,'hidden-d077_ac3b' as id_mapa "));
		model.loadSeparatorlist_3(Core.query(null,"SELECT '2' as basemap "));
		view.enquad_form.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.layers_aass.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.widgets_ass_form.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.basemap.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
				 view.layers_aass.setValue(ComboHelper.getAllActivesLayers());
                 view.enquad_form.setValue(ComboHelper.getAllActivesFraming());
                 view.basemap.setValue(ComboHelper.getAllBaseMap());
                 view.widgets_ass_form.setValue(ComboHelper.getAllActivesWidgest());
      
     try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserTMapa posertmapa = new PoserTMapa().findOne(Core.getParamInt("p_id"));
		if (posertmapa!=null && !posertmapa.hasError()) {
			model.setTitulo_map_form(posertmapa.getTituliMapa());
			model.setCodigo_map_form(posertmapa.getCodeMap());
           PoserTFraming poserTFraming = posertmapa.getIdFraming();
			model.setEnquad_form(poserTFraming.getId());
         
         view.btn_grav_map.addParameter("isEdit", "true"); 
		}
      
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
 
    try{
	PoserTLayerMap posertlayermapfilter = new PoserTLayerMap().find().andWhere("mapaId","=",Core.getParamInt("p_id"));
	List<PoserTLayerMap> posertlayermapList = posertlayermapfilter.all();
	if ( Core.isNotNull(posertlayermapList) ) {
			List <Mapas_form.Separatorlist_1>  separatorlistDocs =new ArrayList<>();
			posertlayermapList.forEach(posertlayermap-> {
				Mapas_form.Separatorlist_1 row = new Mapas_form.Separatorlist_1();
				row.setSeparatorlist_1_id(new Pair( ""+ posertlayermap.getId(), ""+posertlayermap.getId()));
				row.setLayers_aass( new Pair(posertlayermap.getLayerId().getNome(),posertlayermap.getLayerId().getNome()) );
				separatorlistDocs.add(row);
			});
			model.setSeparatorlist_1( separatorlistDocs);
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
   try{
	PoserTMapWidgets posertmapwidgetsfilter = new PoserTMapWidgets().find().andWhere("mapaId","=",Core.getParamInt("p_id"));
	List<PoserTMapWidgets> posertmapwidgetsList = posertmapwidgetsfilter.all();
	if ( Core.isNotNull(posertmapwidgetsList) ) {
			List <Mapas_form.Separatorlist_2>  separatorlistDocs =new ArrayList<>();
			posertmapwidgetsList.forEach(posertmapwidgets-> {
				Mapas_form.Separatorlist_2 row = new Mapas_form.Separatorlist_2();
				row.setSeparatorlist_2_id(new Pair( ""+ posertmapwidgets.getId(), ""+posertmapwidgets.getId()));
				row.setWidgets_ass_form( new Pair(posertmapwidgets.getWidgetsId().getNome(),posertmapwidgets.getWidgetsId().getNome()) );
				separatorlistDocs.add(row);
			});
			model.setSeparatorlist_2( separatorlistDocs);
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	try{
	PoserTMapBasemap posertmapbasemapfilter = new PoserTMapBasemap().find().andWhere("idMapa","=",Core.getParamInt("p_id"));
	List<PoserTMapBasemap> posertmapbasemapList = posertmapbasemapfilter.all();
	if ( Core.isNotNull(posertmapbasemapList) ) {
			List <Mapas_form.Separatorlist_3>  separatorlistDocs =new ArrayList<>();
			posertmapbasemapList.forEach(posertmapbasemap-> {
				Mapas_form.Separatorlist_3 row = new Mapas_form.Separatorlist_3();
				row.setSeparatorlist_3_id(new Pair( ""+ posertmapbasemap.getId(), ""+posertmapbasemap.getId()));
				row.setBasemap( new Pair(posertmapbasemap.getIdBasemap().getNome(),posertmapbasemap.getIdBasemap().getNome()) );
				separatorlistDocs.add(row);
			});
			model.setSeparatorlist_3( separatorlistDocs);
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGrav_map() throws IOException, IllegalArgumentException, IllegalAccessException{
		Mapas_form model = new Mapas_form();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Mapas_form","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(grav_map)----*/
      	Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTMapa posertmapa  = new PoserTMapa();
		if(Core.isNotNull(isEdit)) {
			 posertmapa = session.find(PoserTMapa.class, Core.getParamInt("p_id"));
		}
		if (posertmapa != null){
			posertmapa.setTituliMapa(model.getTitulo_map_form());
			posertmapa.setCodeMap(model.getCodigo_map_form());
		
	        PoserTFraming poserTFraming = session.find(PoserTFraming.class,model.getEnquad_form()); 
          
          if(poserTFraming != null){
            posertmapa.setIdFraming(poserTFraming);
          }
			
		}
		session.persist(posertmapa);
      
      List<String> posertmapwidgetseditList = new ArrayList<>();
		if(model.getP_separatorlist_2_edit() != null){
			posertmapwidgetseditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_2_edit()));
		}
		for(Mapas_form.Separatorlist_2 row : model.getSeparatorlist_2()){
			PoserTMapWidgets posertmapwidgets = new PoserTMapWidgets();
			if( Core.isNotNull( row.getSeparatorlist_2_id()) && Core.isNotNull( row.getSeparatorlist_2_id().getKey())){
				if(!posertmapwidgetseditList.isEmpty() && posertmapwidgetseditList.remove(row.getSeparatorlist_2_id().getKey())) {
					posertmapwidgets = session.find(PoserTMapWidgets.class, Core.toInt(row.getSeparatorlist_2_id().getKey()));
				}
				else
					continue;
			}
				
			PoserTWidgets posertwidgets_foreign = session.find(PoserTWidgets.class, Core.toInt(row.getWidgets_ass_form().getKey()));
	        posertmapwidgets.setWidgetsId(posertwidgets_foreign);
            //PoserTMapa posertmapa_foreign = session.find(PoserTMapa.class, Core.getParam("p_id"));
	          posertmapwidgets.setMapaId(posertmapa);
			session.persist(posertmapwidgets);
		}
	String [] posertmapwidgetsdeletedIdsArray = model.getP_separatorlist_2_del();
	if ( Core.isNotNull(posertmapwidgetsdeletedIdsArray ) ) {
	for ( String docId : posertmapwidgetsdeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			PoserTMapWidgets posertmapwidgets = session.find(PoserTMapWidgets.class, Core.toInt(docId));
			session.delete(posertmapwidgets);
			}
		}
	}
      
      List<String> posertlayermapeditList = new ArrayList<>();
		if(model.getP_separatorlist_1_edit() != null){
			posertlayermapeditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_1_edit()));
		}
		for(Mapas_form.Separatorlist_1 row : model.getSeparatorlist_1()){
			PoserTLayerMap posertlayermap = new PoserTLayerMap();
			if( Core.isNotNull( row.getSeparatorlist_1_id()) && Core.isNotNull( row.getSeparatorlist_1_id().getKey())){
				if(!posertlayermapeditList.isEmpty() && posertlayermapeditList.remove(row.getSeparatorlist_1_id().getKey())) {
					posertlayermap = session.find(PoserTLayerMap.class, Core.toInt(row.getSeparatorlist_1_id().getKey()));
				}
				else
					continue;
			}
				
			PoserTLayers posertlayers_foreign = session.find(PoserTLayers.class, Core.toInt(row.getLayers_aass().getKey()));
	          posertlayermap.setLayerId(posertlayers_foreign);
           //PoserTMapa posertmapa_foreign = session.find(PoserTMapa.class, Core.toInt(row.getMap_id().getKey()));
	          posertlayermap.setMapaId(posertmapa);
			session.persist(posertlayermap);
		}
	String [] posertlayermapdeletedIdsArray = model.getP_separatorlist_1_del();
	if ( Core.isNotNull(posertlayermapdeletedIdsArray ) ) {
	for ( String docId : posertlayermapdeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			PoserTLayerMap posertlayermap = session.find(PoserTLayerMap.class, Core.toInt(docId));
			session.delete(posertlayermap);
			}
		}
	}
      
    List<String> posertmapbasemapeditList = new ArrayList<>();
		if(model.getP_separatorlist_3_edit() != null){
			posertmapbasemapeditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_3_edit()));
		}
		for(Mapas_form.Separatorlist_3 row : model.getSeparatorlist_3()){
			PoserTMapBasemap posertmapbasemap = new PoserTMapBasemap();
			if( Core.isNotNull( row.getSeparatorlist_3_id()) && Core.isNotNull( row.getSeparatorlist_3_id().getKey())){
				if(!posertmapbasemapeditList.isEmpty() && posertmapbasemapeditList.remove(row.getSeparatorlist_3_id().getKey())) {
					posertmapbasemap = session.find(PoserTMapBasemap.class, Core.toInt(row.getSeparatorlist_3_id().getKey()));
				}
				else
					continue;
			}
				
			PoserParBasemap poserparbasemap_foreign = session.find(PoserParBasemap.class, Core.toInt(row.getBasemap().getKey()));
	          posertmapbasemap.setIdBasemap(poserparbasemap_foreign);
              posertmapbasemap.setIdMapa(posertmapa);
          
			session.persist(posertmapbasemap);
		}
	String [] posertmapbasemapdeletedIdsArray = model.getP_separatorlist_3_del();
	if ( Core.isNotNull(posertmapbasemapdeletedIdsArray ) ) {
	for ( String docId : posertmapbasemapdeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			PoserTMapBasemap posertmapbasemap = session.find(PoserTMapBasemap.class, Core.toInt(docId));
			session.delete(posertmapbasemap);
			}
		}
	}
	
      
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

   
   /*   try{
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		List<String> posertmapwidgetseditList = new ArrayList<>();
		if(model.getP_separatorlist_2_edit() != null){
			posertmapwidgetseditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_2_edit()));
		}
		for(Mapas_form.Separatorlist_2 row : model.getSeparatorlist_2()){
			PoserTMapWidgets posertmapwidgets = new PoserTMapWidgets();
			if( Core.isNotNull( row.getSeparatorlist_2_id()) && Core.isNotNull( row.getSeparatorlist_2_id().getKey())){
				if(!posertmapwidgetseditList.isEmpty() && posertmapwidgetseditList.remove(row.getSeparatorlist_2_id().getKey())) {
					posertmapwidgets = session.find(PoserTMapWidgets.class, Core.toInt(row.getSeparatorlist_2_id().getKey()));
				}
				else
					continue;
			}
				
			PoserTWidgets posertwidgets_foreign = session.find(PoserTWidgets.class, Core.toInt(row.getWidgets_ass_form().getKey()));
	        posertmapwidgets.setWidgetsId(posertwidgets_foreign);
            PoserTMapa posertmapa_foreign = session.find(PoserTMapa.class, Core.getParam("p_id"));
	          posertmapwidgets.setMapaId(posertmapa_foreign);
			session.persist(posertmapwidgets);
		}
	String [] posertmapwidgetsdeletedIdsArray = model.getP_separatorlist_2_del();
	if ( Core.isNotNull(posertmapwidgetsdeletedIdsArray ) ) {
	for ( String docId : posertmapwidgetsdeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			PoserTMapWidgets posertmapwidgets = session.find(PoserTMapWidgets.class, Core.toInt(docId));
			session.delete(posertmapwidgets);
			}
		}
	}
	
		transaction.commit();
		Core.setMessageSuccess();
	}catch ( Exception e ) {
		e.printStackTrace();
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
      
      try{
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		List<String> posertlayermapeditList = new ArrayList<>();
		if(model.getP_separatorlist_1_edit() != null){
			posertlayermapeditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_1_edit()));
		}
		for(Mapas_form.Separatorlist_1 row : model.getSeparatorlist_1()){
			PoserTLayerMap posertlayermap = new PoserTLayerMap();
			if( Core.isNotNull( row.getSeparatorlist_1_id()) && Core.isNotNull( row.getSeparatorlist_1_id().getKey())){
				if(!posertlayermapeditList.isEmpty() && posertlayermapeditList.remove(row.getSeparatorlist_1_id().getKey())) {
					posertlayermap = session.find(PoserTLayerMap.class, Core.toInt(row.getSeparatorlist_1_id().getKey()));
				}
				else
					continue;
			}
				
			PoserTLayers posertlayers_foreign = session.find(PoserTLayers.class, Core.toInt(row.getLayers_aass().getKey()));
	          posertlayermap.setLayerId(posertlayers_foreign);
           PoserTMapa posertmapa_foreign = session.find(PoserTMapa.class, Core.toInt(row.getMap_id().getKey()));
	          posertlayermap.setMapaId(posertmapa_foreign);
			session.persist(posertlayermap);
		}
	String [] posertlayermapdeletedIdsArray = model.getP_separatorlist_1_del();
	if ( Core.isNotNull(posertlayermapdeletedIdsArray ) ) {
	for ( String docId : posertlayermapdeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			PoserTLayerMap posertlayermap = session.find(PoserTLayerMap.class, Core.toInt(docId));
			session.delete(posertlayermap);
			}
		}
	}
	
		transaction.commit();
		Core.setMessageSuccess();
	}catch ( Exception e ) {
		e.printStackTrace();
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
      	try{
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		List<String> posertmapbasemapeditList = new ArrayList<>();
		if(model.getP_separatorlist_3_edit() != null){
			posertmapbasemapeditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_3_edit()));
		}
		for(Mapas_form.Separatorlist_3 row : model.getSeparatorlist_3()){
			PoserTMapBasemap posertmapbasemap = new PoserTMapBasemap();
			if( Core.isNotNull( row.getSeparatorlist_3_id()) && Core.isNotNull( row.getSeparatorlist_3_id().getKey())){
				if(!posertmapbasemapeditList.isEmpty() && posertmapbasemapeditList.remove(row.getSeparatorlist_3_id().getKey())) {
					posertmapbasemap = session.find(PoserTMapBasemap.class, Core.toInt(row.getSeparatorlist_3_id().getKey()));
				}
				else
					continue;
			}
				
			PoserParBasemap poserparbasemap_foreign = session.find(PoserParBasemap.class, Core.toInt(row.getBasemap().getKey()));
	posertmapbasemap.setIdBasemap(poserparbasemap_foreign);
			session.persist(posertmapbasemap);
		}
	String [] posertmapbasemapdeletedIdsArray = model.getP_separatorlist_3_del();
	if ( Core.isNotNull(posertmapbasemapdeletedIdsArray ) ) {
	for ( String docId : posertmapbasemapdeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			PoserTMapBasemap posertmapbasemap = session.find(PoserTMapBasemap.class, Core.toInt(docId));
			session.delete(posertmapbasemap);
			}
		}
	}
	
		transaction.commit();
		Core.setMessageSuccess();
	}catch ( Exception e ) {
		e.printStackTrace();
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
		return this.forward("poser_2020","Mapas_form","index",this.queryString());
	}*/
		/*----#end-code----*/
		return this.redirect("poser_2020","Mapas_form","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
