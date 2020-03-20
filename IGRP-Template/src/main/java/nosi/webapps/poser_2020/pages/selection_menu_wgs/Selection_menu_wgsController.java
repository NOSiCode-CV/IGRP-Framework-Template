package nosi.webapps.poser_2020.pages.selection_menu_wgs;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.poser_2020.dao.PoserTSelectionMenu;
import nosi.webapps.poser_2020.dao.PoserTLayers;
import nosi.webapps.poser_2020.helpers.ComboHelper;
/*----#end-code----*/
		
public class Selection_menu_wgsController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Selection_menu_wgs model = new Selection_menu_wgs();
		model.load();
		Selection_menu_wgsView view = new Selection_menu_wgsView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.layer.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.tipo_de_pagina.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.target.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		view.layer.setValue(ComboHelper.getAllActivesLayers());
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar_mn() throws IOException, IllegalArgumentException, IllegalAccessException{
		Selection_menu_wgs model = new Selection_menu_wgs();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("poser_2020","Selection_menu_wgs","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar_mn)----*/
		Session session = null;
	Transaction transaction = null;
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		PoserTSelectionMenu posertselectionmenu  = new PoserTSelectionMenu();
			
           PoserTLayers poserTLayers = session.find(PoserTLayers.class,model.getLayer()); 
          
          if(poserTLayers != null){
            posertselectionmenu.setLayerId(poserTLayers);
          }
			posertselectionmenu.setTipoPagina(model.getTipo_de_pagina());
			posertselectionmenu.setLink(model.getLink_wdg());
			posertselectionmenu.setEnderecoPag(model.getEndereco_de_pagina());
			posertselectionmenu.setValores(model.getValores());
			posertselectionmenu.setOrdem(Core.toInt(model.getOrdem()));
			posertselectionmenu.setIcon(model.getIcon());
			posertselectionmenu.setParametros(model.getParametros());
			posertselectionmenu.setAtributos(model.getAtributos());
			posertselectionmenu.setPaginaIgrp(model.getPagina_igrp());
		session.persist(posertselectionmenu);
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
		
		/*----#end-code----*/
		return this.redirect("poser_2020","Selection_menu_wgs","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
