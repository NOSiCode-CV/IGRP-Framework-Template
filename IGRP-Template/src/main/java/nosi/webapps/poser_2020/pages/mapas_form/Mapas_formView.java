package nosi.webapps.poser_2020.pages.mapas_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Mapas_formView extends View {

	public Field tt_map_text;
	public Field titulo_map_form;
	public Field codigo_map_form;
	public Field enquad_form;
	public Field id_map;
	public Field id;
	public Field ass_layer;
	public Field associar_widgets;
	public Field associar_basemap;
	public Field layers_aass;
	public Field map_id;
	public Field widgets_ass_form;
	public Field id_mapa;
	public Field basemap;
	public IGRPSectionHeader tt_map;
	public IGRPForm form_1;
	public IGRPTabContent tabcontent_1;
	public IGRPSeparatorList separatorlist_1;
	public IGRPSeparatorList separatorlist_2;
	public IGRPSeparatorList separatorlist_3;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_grav_map;

	public Mapas_formView(){

		this.setPageTitle("Inserir/Editar Mapas");
			
		tt_map = new IGRPSectionHeader("tt_map","");

		form_1 = new IGRPForm("form_1","");

		tabcontent_1 = new IGRPTabContent("tabcontent_1","");

		separatorlist_1 = new IGRPSeparatorList("separatorlist_1","");

		separatorlist_2 = new IGRPSeparatorList("separatorlist_2","");

		separatorlist_3 = new IGRPSeparatorList("separatorlist_3","");

		tt_map_text = new TextField(model,"tt_map_text");
		tt_map_text.setLabel(gt(""));
		tt_map_text.setValue(gt("<p>Inserir/Editar Mapas</p>"));
		tt_map_text.propertie().add("type","text").add("name","p_tt_map_text").add("maxlength","40");
		
		titulo_map_form = new TextField(model,"titulo_map_form");
		titulo_map_form.setLabel(gt("Titulo Mapa"));
		titulo_map_form.propertie().add("name","p_titulo_map_form").add("type","text").add("maxlength","50").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		codigo_map_form = new TextField(model,"codigo_map_form");
		codigo_map_form.setLabel(gt("Código Mapa"));
		codigo_map_form.propertie().add("name","p_codigo_map_form").add("type","text").add("maxlength","50").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		enquad_form = new ListField(model,"enquad_form");
		enquad_form.setLabel(gt("Enquadramento"));
		enquad_form.propertie().add("name","p_enquad_form").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","Integer");
		
		id_map = new HiddenField(model,"id_map");
		id_map.setLabel(gt(""));
		id_map.propertie().add("name","p_id_map").add("type","hidden").add("maxlength","50").add("java-type","").add("tag","id_map");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id");
		
		ass_layer = new TextField(model,"ass_layer");
		ass_layer.setLabel(gt("Associar Layer"));
		ass_layer.propertie().add("name","p_ass_layer").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("img","fa-map-o").add("maxlength","50");
		
		associar_widgets = new TextField(model,"associar_widgets");
		associar_widgets.setLabel(gt("Associar Widgets"));
		associar_widgets.propertie().add("name","p_associar_widgets").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("img","fa-google-wallet").add("maxlength","50");
		
		associar_basemap = new TextField(model,"associar_basemap");
		associar_basemap.setLabel(gt("Associar BaseMap"));
		associar_basemap.propertie().add("name","p_associar_basemap").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("img","fa-map").add("maxlength","50");
		
		layers_aass = new ListField(model,"layers_aass");
		layers_aass.setLabel(gt("Layers"));
		layers_aass.propertie().add("name","p_layers_aass").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		
		map_id = new HiddenField(model,"map_id");
		map_id.setLabel(gt(""));
		map_id.propertie().add("name","p_map_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","map_id").add("desc","true");
		
		widgets_ass_form = new ListField(model,"widgets_ass_form");
		widgets_ass_form.setLabel(gt("Widgets"));
		widgets_ass_form.propertie().add("name","p_widgets_ass_form").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		
		id_mapa = new HiddenField(model,"id_mapa");
		id_mapa.setLabel(gt(""));
		id_mapa.propertie().add("name","p_id_mapa").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_mapa").add("desc","true");
		
		basemap = new ListField(model,"basemap");
		basemap.setLabel(gt("BaseMap"));
		basemap.propertie().add("name","p_basemap").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_grav_map = new IGRPButton("Gravar","poser_2020","Mapas_form","grav_map","submit|refresh","success|fa-save","","");
		btn_grav_map.propertie.add("type","specific").add("rel","grav_map").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		tt_map.addField(tt_map_text);


		form_1.addField(titulo_map_form);
		form_1.addField(codigo_map_form);
		form_1.addField(enquad_form);
		form_1.addField(id_map);
		form_1.addField(id);

		tabcontent_1.addField(ass_layer);
		tabcontent_1.addField(associar_widgets);
		tabcontent_1.addField(associar_basemap);

		separatorlist_1.addField(layers_aass);
		separatorlist_1.addField(map_id);

		separatorlist_2.addField(widgets_ass_form);
		separatorlist_2.addField(id_mapa);

		separatorlist_3.addField(basemap);

		toolsbar_1.addButton(btn_grav_map);
		this.addToPage(tt_map);
		this.addToPage(form_1);
		this.addToPage(tabcontent_1);
		this.addToPage(separatorlist_1);
		this.addToPage(separatorlist_2);
		this.addToPage(separatorlist_3);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		titulo_map_form.setValue(model);
		codigo_map_form.setValue(model);
		enquad_form.setValue(model);
		id_map.setValue(model);
		id.setValue(model);
		ass_layer.setValue(model);
		associar_widgets.setValue(model);
		associar_basemap.setValue(model);
		layers_aass.setValue(model);
		map_id.setValue(model);
		widgets_ass_form.setValue(model);
		id_mapa.setValue(model);
		basemap.setValue(model);	

		separatorlist_1.loadModel(((Mapas_form) model).getSeparatorlist_1());
		separatorlist_2.loadModel(((Mapas_form) model).getSeparatorlist_2());
		separatorlist_3.loadModel(((Mapas_form) model).getSeparatorlist_3());
		}
}
