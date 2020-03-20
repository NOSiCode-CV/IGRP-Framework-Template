package nosi.webapps.poser_2020.pages.associar_layer;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Associar_layerView extends View {

	public Field sectionheader_1_text;
	public Field lista_de_layer;
	public Field associar_layer;
	public Field layers_ls;
	public Field ordem_ls;
	public Field label_ls;
	public Field id;
	public Field layers;
	public Field label;
	public Field ordem;
	public Field id_layer;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTabContent tabcontent_1;
	public IGRPTable table_1;
	public IGRPForm form_1;

	public IGRPButton btn_gravar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Associar_layerView(){

		this.setPageTitle("Associar Layer");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		tabcontent_1 = new IGRPTabContent("tabcontent_1","");

		table_1 = new IGRPTable("table_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Associar Layer</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		lista_de_layer = new TextField(model,"lista_de_layer");
		lista_de_layer.setLabel(gt("Lista de Layer"));
		lista_de_layer.propertie().add("name","p_lista_de_layer").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("img","fa-map").add("maxlength","50");
		
		associar_layer = new TextField(model,"associar_layer");
		associar_layer.setLabel(gt("Associar Layer"));
		associar_layer.propertie().add("name","p_associar_layer").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("img","fa-map-o").add("maxlength","50");
		
		layers_ls = new TextField(model,"layers_ls");
		layers_ls.setLabel(gt("Layers"));
		layers_ls.propertie().add("name","p_layers_ls").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		ordem_ls = new TextField(model,"ordem_ls");
		ordem_ls.setLabel(gt("Ordem"));
		ordem_ls.propertie().add("name","p_ordem_ls").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		label_ls = new TextField(model,"label_ls");
		label_ls.setLabel(gt("Label"));
		label_ls.propertie().add("name","p_label_ls").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id");
		
		layers = new ListField(model,"layers");
		layers.setLabel(gt("Layers"));
		layers.propertie().add("name","p_layers").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","Integer");
		
		label = new ListField(model,"label");
		label.setLabel(gt("Label"));
		label.propertie().add("name","p_label").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		ordem = new NumberField(model,"ordem");
		ordem.setLabel(gt("Ordem"));
		ordem.propertie().add("name","p_ordem").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		id_layer = new HiddenField(model,"id_layer");
		id_layer.setLabel(gt(""));
		id_layer.propertie().add("name","p_id_layer").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id_layer");
		


		btn_gravar = new IGRPButton("Gravar","poser_2020","Associar_layer","gravar","submit","success|fa-floppy-o","","");
		btn_gravar.propertie.add("type","form").add("class","success").add("rel","gravar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","poser_2020","Associar_layer","editar","mpsubmit","warning|fa-pencil","","");
		btn_editar.propertie.add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","poser_2020","Associar_layer","eliminar","confirm","danger|fa-remove","","");
		btn_eliminar.propertie.add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		tabcontent_1.addField(lista_de_layer);
		tabcontent_1.addField(associar_layer);

		table_1.addField(layers_ls);
		table_1.addField(ordem_ls);
		table_1.addField(label_ls);
		table_1.addField(id);

		form_1.addField(layers);
		form_1.addField(label);
		form_1.addField(ordem);
		form_1.addField(id_layer);

		form_1.addButton(btn_gravar);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(sectionheader_1);
		this.addToPage(tabcontent_1);
		this.addToPage(table_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		lista_de_layer.setValue(model);
		associar_layer.setValue(model);
		layers_ls.setValue(model);
		ordem_ls.setValue(model);
		label_ls.setValue(model);
		id.setValue(model);
		layers.setValue(model);
		label.setValue(model);
		ordem.setValue(model);
		id_layer.setValue(model);	

		table_1.loadModel(((Associar_layer) model).getTable_1());
		}
}
