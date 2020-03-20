package nosi.webapps.poser_2020.pages.lst_basemap;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lst_basemapView extends View {

	public Field lst_bm_text;
	public Field nom_lst;
	public Field codi_lst;
	public Field link_lst;
	public Field id;
	public IGRPSectionHeader lst_bm;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_editar_bm;
	public IGRPButton btn_eliminar;

	public Lst_basemapView(){

		this.setPageTitle("Filtrar/Listar Basemap");
			
		lst_bm = new IGRPSectionHeader("lst_bm","");

		table_1 = new IGRPTable("table_1","");

		lst_bm_text = new TextField(model,"lst_bm_text");
		lst_bm_text.setLabel(gt(""));
		lst_bm_text.setValue(gt("<p>Listar Basemap</p>"));
		lst_bm_text.propertie().add("type","text").add("name","p_lst_bm_text").add("maxlength","40");
		
		nom_lst = new TextField(model,"nom_lst");
		nom_lst.setLabel(gt("Nome"));
		nom_lst.propertie().add("name","p_nom_lst").add("type","text").add("maxlength","52").add("showLabel","true").add("group_in","");
		
		codi_lst = new TextField(model,"codi_lst");
		codi_lst.setLabel(gt("Código"));
		codi_lst.propertie().add("name","p_codi_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		link_lst = new TextField(model,"link_lst");
		link_lst.setLabel(gt("Link"));
		link_lst.propertie().add("name","p_link_lst").add("type","text").add("maxlength","2000").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","poser_2020","Lst_basemap","novo","modal|refresh","success|fa-plus","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_editar_bm = new IGRPButton("Editar","poser_2020","Lst_basemap","editar_bm","modal|refresh","warning|fa-pencil-square-o","","");
		btn_editar_bm.propertie.add("type","specific").add("class","warning").add("rel","editar_bm").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","poser_2020","Lst_basemap","eliminar","confirm","danger|fa-trash-o","","");
		btn_eliminar.propertie.add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		lst_bm.addField(lst_bm_text);


		table_1.addField(nom_lst);
		table_1.addField(codi_lst);
		table_1.addField(link_lst);
		table_1.addField(id);

		toolsbar_1.addButton(btn_novo);
		table_1.addButton(btn_editar_bm);
		table_1.addButton(btn_eliminar);
		this.addToPage(lst_bm);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nom_lst.setValue(model);
		codi_lst.setValue(model);
		link_lst.setValue(model);
		id.setValue(model);	

		table_1.loadModel(((Lst_basemap) model).getTable_1());
		}
}
