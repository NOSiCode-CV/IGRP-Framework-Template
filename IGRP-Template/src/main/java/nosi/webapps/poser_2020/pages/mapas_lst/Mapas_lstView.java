package nosi.webapps.poser_2020.pages.mapas_lst;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Mapas_lstView extends View {

	public Field mapas_lst_flt_text;
	public Field titulo_mapa_lst;
	public Field codigo_mapa_lst;
	public Field enquadramento;
	public Field id;
	public IGRPSectionHeader mapas_lst_flt;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_ver_mapa;
	public IGRPButton btn_editar_map;
	public IGRPButton btn_elimnar_map;

	public Mapas_lstView(){

		this.setPageTitle("Listar/Filtrar Mapas");
			
		mapas_lst_flt = new IGRPSectionHeader("mapas_lst_flt","");

		table_1 = new IGRPTable("table_1","Lista");

		mapas_lst_flt_text = new TextField(model,"mapas_lst_flt_text");
		mapas_lst_flt_text.setLabel(gt(""));
		mapas_lst_flt_text.setValue(gt("<p>Gest&atilde;o de Mapas</p>"));
		mapas_lst_flt_text.propertie().add("type","text").add("name","p_mapas_lst_flt_text").add("maxlength","4000");
		
		titulo_mapa_lst = new TextField(model,"titulo_mapa_lst");
		titulo_mapa_lst.setLabel(gt("Título Mapa"));
		titulo_mapa_lst.propertie().add("name","p_titulo_mapa_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		codigo_mapa_lst = new TextField(model,"codigo_mapa_lst");
		codigo_mapa_lst.setLabel(gt("Código Mapa"));
		codigo_mapa_lst.propertie().add("name","p_codigo_mapa_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		enquadramento = new TextField(model,"enquadramento");
		enquadramento.setLabel(gt("Enquadramento"));
		enquadramento.propertie().add("name","p_enquadramento").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","poser_2020","Mapas_lst","novo","modal|refresh","success|fa-plus-square","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_ver_mapa = new IGRPButton("Ver Mapa","poser_2020","Mapas_lst","ver_mapa","modal|refresh","info|fa-map-o","","");
		btn_ver_mapa.propertie.add("type","specific").add("class","info").add("rel","ver_mapa").add("refresh_components","");

		btn_editar_map = new IGRPButton("Editar","poser_2020","Mapas_lst","editar_map","mpsubmit|refresh","warning|fa-pencil","","");
		btn_editar_map.propertie.add("type","specific").add("class","warning").add("rel","editar_map").add("refresh_components","");

		btn_elimnar_map = new IGRPButton("Eliminar","poser_2020","Mapas_lst","elimnar_map","confirm","danger|fa-times","","");
		btn_elimnar_map.propertie.add("type","specific").add("class","danger").add("rel","elimnar_map").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		mapas_lst_flt.addField(mapas_lst_flt_text);


		table_1.addField(titulo_mapa_lst);
		table_1.addField(codigo_mapa_lst);
		table_1.addField(enquadramento);
		table_1.addField(id);

		toolsbar_1.addButton(btn_novo);
		table_1.addButton(btn_ver_mapa);
		table_1.addButton(btn_editar_map);
		table_1.addButton(btn_elimnar_map);
		this.addToPage(mapas_lst_flt);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		titulo_mapa_lst.setValue(model);
		codigo_mapa_lst.setValue(model);
		enquadramento.setValue(model);
		id.setValue(model);	

		table_1.loadModel(((Mapas_lst) model).getTable_1());
		}
}
