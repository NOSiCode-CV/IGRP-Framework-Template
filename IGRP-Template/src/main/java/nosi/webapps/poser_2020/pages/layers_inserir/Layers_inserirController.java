package nosi.webapps.poser_2020.pages.layers_inserir;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.dao.PoserTLayers;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.Map;
import java.util.LinkedHashMap;
import nosi.webapps.poser_2020.helpers.ComboHelper; 

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.dao.PoserTLayers;
import nosi.webapps.poser_2020.dao.PoserParamTpServico;
import nosi.webapps.poser_2020.enums.GrupoDominio;
import nosi.webapps.poser_2020.restapi.RestLayer;
/*----#end-code----*/
		
public class Layers_inserirController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Layers_inserir model = new Layers_inserir();
		model.load();
		Layers_inserirView view = new Layers_inserirView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadMais_parm(Core.query(null,"SELECT 'Labore consectetur lorem omnis lorem' as param_wms,'Aperiam iste doloremque iste accusantium' as valor_wms,'hidden-d74b_fde3' as id_param "));
		view.tipo_layer_form.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.geom_ty_form.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
       view.title_ins_layer_text.setValue("Inserção de Layer");
      
		 view.tipo_layer_form.setValue(ComboHelper.getAtivesDominio(GrupoDominio.TPSERVICO.getDominio()));
         view.geom_ty_form.setValue(ComboHelper.getAtivesDominioPosicao(GrupoDominio.GEOMTYPE.getDominio()));
         model.setEstado_form(1);
         
  
      try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		PoserTLayers posertlayers = new PoserTLayers().findOne(Core.getParamInt("p_id"));
		if (posertlayers!=null && !posertlayers.hasError()) {
			model.setNome_layer_form(posertlayers.getNome());
			model.setCodigo_layer_form(posertlayers.getCode());
			model.setUrl_layer_form(posertlayers.getUrl());
			model.setType_name(posertlayers.getTypeName());
			model.setLayers_wms(posertlayers.getLayers());
			model.setOutput_format_wms(posertlayers.getOutputFormat());
	
               view.title_ins_layer_text.setValue("Editar Layer");

	view.btn_gravar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Layers_inserir model = new Layers_inserir();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Layers_inserir","index",this.queryString()); //if submit, loads the values
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
		PoserTLayers posertlayers  = new PoserTLayers();
		if(Core.isNotNull(isEdit)) {
			 posertlayers = session.find(PoserTLayers.class, Core.getParamInt("p_id"));
		}
		if (posertlayers != null){
            posertlayers.setNome(model.getNome_layer_form());
			posertlayers.setCode(model.getCodigo_layer_form());
			posertlayers.setUrl(model.getUrl_layer_form());
			posertlayers.setTypeName(model.getType_name());
			posertlayers.setLayers(model.getLayers_wms());
			posertlayers.setOutputFormat(model.getOutput_format_wms());
			posertlayers.setEstado("A");
		}
		session.persist(posertlayers);
		for ( Layers_inserir.Mais_parm row : model.getMais_parm()){
			//PoserTLayers posertlayers = new PoserTLayers();
			if(Core.isNotNull( row.getMais_parm_id().getKey())){
					posertlayers = session.find(PoserTLayers.class, Core.toInt(row.getMais_parm_id().getKey()));
			}
					posertlayers.setParametro(row.getParam_wms().getKey());
			posertlayers.setValor(row.getValor_wms().getKey());
			session.persist(posertlayers);
		}
	String [] posertlayersdeletedIdsArray = model.getP_mais_parm_del();
	if ( Core.isNotNull( posertlayersdeletedIdsArray ) ) {
	for ( String docId : posertlayersdeletedIdsArray ) {
		if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
			//PoserTLayers posertlayers = session.find(PoserTLayers.class, Core.toInt(docId));
			session.delete(posertlayers);
		
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
  
      
	if(Core.isNotNull(isEdit)) {
		this.addQueryString("isEdit", "true");
		return this.forward("poser_2020","Layers_inserir","index",this.queryString());
	} 
      
		/*----#end-code----*/
		return this.redirect("poser_2020","Layers_inserir","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/
	public boolean validacao(Layers_inserir model) {
		boolean r = true;
		int id = model.getId();
       PoserTLayers posertlayers  = new PoserTLayers().find()
         .andWhere("nome", "=", model.getNome_layer_form())
         .andWhere("code","=", model.getCodigo_layer_form());
       posertlayers = posertlayers.one();
           
		if (id == 0) {
			if (posertlayers != null) {
				Core.setMessageWarning("Este nome ou código já se encontra registado.");
				r = false;
			 
            }
		} 
		return r;
	}

	private Session s = null;
	private Transaction t = null;


/*----#end-code----*/
}
