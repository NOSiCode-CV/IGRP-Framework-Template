package nosi.webapps.poser_2020.pages.basemap_wdgt;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.pages.basemap_wdgt.Basemap_wdgt.Separatorlist_1;
import nosi.webapps.poser_2020.dao.PoserParBasemap;
import nosi.core.gui.components.IGRPSeparatorList.Pair;

/*----#end-code----*/
		
public class Basemap_wdgtController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Basemap_wdgt model = new Basemap_wdgt();
		model.load();
		Basemap_wdgtView view = new Basemap_wdgtView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSeparatorlist_1(Core.query(null,"SELECT 'Omnis sed magna sed laudantium' as nome_basemap,'Sit mollit amet ut totam' as tipo_bs_wdg,'Labore lorem laudantium elit totam' as link_wdg,'hidden-9a91_c7bc' as id_basemap "));
		  ----#gen-example */
		/*----#start-code(index)----*/
	
		try{
	PoserParBasemap poserparbasemapfilter = new PoserParBasemap().find();
	List<PoserParBasemap> poserparbasemapList = poserparbasemapfilter.all();
	if ( Core.isNotNull(poserparbasemapList) ) {
			List <Basemap_wdgt.Separatorlist_1>  separatorlistDocs =new ArrayList<>();
			poserparbasemapList.forEach(poserparbasemap-> {
				Basemap_wdgt.Separatorlist_1 row = new Basemap_wdgt.Separatorlist_1();
				row.setSeparatorlist_1_id(new Pair( ""+ poserparbasemap.getId(), ""+poserparbasemap.getId()));
				row.setNome_basemap( new Pair(poserparbasemap.getNome(),poserparbasemap.getNome()) );
	row.setTipo_bs_wdg( new Pair(poserparbasemap.getMimeType(),poserparbasemap.getMimeType()) );
	row.setLink_wdg( new Pair(poserparbasemap.getLink(),poserparbasemap.getLink()) );
	row.setId_basemap( new Pair(""+poserparbasemap.getId(),""+poserparbasemap.getId()) );
				separatorlistDocs.add(row);
			});
			model.setSeparatorlist_1( separatorlistDocs);
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_wdg() throws IOException, IllegalArgumentException, IllegalAccessException{
		Basemap_wdgt model = new Basemap_wdgt();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Basemap_wdgt","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_wdg)----*/
		Session session = null;
	Transaction transaction = null;
	try{
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		List<String> poserparbasemapeditList = new ArrayList<>();
		if(model.getP_separatorlist_1_edit() != null){
			poserparbasemapeditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_1_edit()));
		}
		for(Basemap_wdgt.Separatorlist_1 row : model.getSeparatorlist_1()){
			PoserParBasemap poserparbasemap = new PoserParBasemap();
			if( Core.isNotNull( row.getSeparatorlist_1_id()) && Core.isNotNull( row.getSeparatorlist_1_id().getKey())){
				if(!poserparbasemapeditList.isEmpty() && poserparbasemapeditList.remove(row.getSeparatorlist_1_id().getKey())) {
					poserparbasemap = session.find(PoserParBasemap.class, Core.toInt(row.getSeparatorlist_1_id().getKey()));
				}
				else
					continue;
			}
				
			poserparbasemap.setNome(row.getNome_basemap().getKey());
			poserparbasemap.setMimeType(row.getTipo_bs_wdg().getKey());
			poserparbasemap.setLink(row.getLink_wdg().getKey());
			session.persist(poserparbasemap);
		}
	String [] poserparbasemapdeletedIdsArray = model.getP_separatorlist_1_del();
	if ( Core.isNotNull(poserparbasemapdeletedIdsArray ) ) {
	for ( String docId : poserparbasemapdeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			PoserParBasemap poserparbasemap = session.find(PoserParBasemap.class, Core.toInt(docId));
			session.delete(poserparbasemap);
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
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Basemap_wdgt","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
