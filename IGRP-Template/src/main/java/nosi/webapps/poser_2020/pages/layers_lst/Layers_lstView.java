package nosi.webapps.poser_2020.pages.layers_lst;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Layers_lstView extends View {

	public Field sectionheader_1_text;
	public Field nome_layer_flt;
	public Field tipo_servico_lst;
	public Field nome_layer_lst;
	public Field codigo_layer_lst;
	public Field tp_layer_lst;
	public Field url_layer_lst;
	public Field id;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_pesquisar;
	public IGRPButton btn_estd_layer;
	public IGRPButton btn_editar_layer;
	public IGRPButton btn_eliminar_layer;
	public IGRPButton btn_servico;

	public Layers_lstView(){

		this.setPageTitle("Layers - Filtrar/Listar");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Gest&atilde;o Layers</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		nome_layer_flt = new TextField(model,"nome_layer_flt");
		nome_layer_flt.setLabel(gt("Nome"));
		nome_layer_flt.propertie().add("name","p_nome_layer_flt").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		tipo_servico_lst = new ListField(model,"tipo_servico_lst");
		tipo_servico_lst.setLabel(gt("Tipo Serviço"));
		tipo_servico_lst.propertie().add("name","p_tipo_servico_lst").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","50").add("required","false").add("disabled","false").add("java-type","");
		
		nome_layer_lst = new TextField(model,"nome_layer_lst");
		nome_layer_lst.setLabel(gt("Nome"));
		nome_layer_lst.propertie().add("name","p_nome_layer_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		codigo_layer_lst = new TextField(model,"codigo_layer_lst");
		codigo_layer_lst.setLabel(gt("Código"));
		codigo_layer_lst.propertie().add("name","p_codigo_layer_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		tp_layer_lst = new TextField(model,"tp_layer_lst");
		tp_layer_lst.setLabel(gt("Tipo Serviço"));
		tp_layer_lst.propertie().add("name","p_tp_layer_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		url_layer_lst = new TextField(model,"url_layer_lst");
		url_layer_lst.setLabel(gt("URL"));
		url_layer_lst.propertie().add("name","p_url_layer_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","poser_2020","Layers_lst","novo","modal|refresh","success|fa-plus","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_pesquisar = new IGRPButton("Pesquisar","poser_2020","Layers_lst","pesquisar","submit","primary|fa-search","","");
		btn_pesquisar.propertie.add("type","form").add("class","primary").add("rel","pesquisar").add("refresh_components","");

		btn_estd_layer = new IGRPButton("Alterar Estado","poser_2020","Layers_lst","estd_layer","alert_submit|refresh","info|fa-toggle-on","","");
		btn_estd_layer.propertie.add("type","specific").add("class","info").add("rel","estd_layer").add("refresh_components","");

		btn_editar_layer = new IGRPButton("Editar","poser_2020","Layers_lst","editar_layer","modal|refresh","warning|fa-pencil","","");
		btn_editar_layer.propertie.add("type","specific").add("class","warning").add("rel","editar_layer").add("refresh_components","");

		btn_eliminar_layer = new IGRPButton("Eliminar","poser_2020","Layers_lst","eliminar_layer","confirm","danger|fa-remove","","");
		btn_eliminar_layer.propertie.add("type","specific").add("class","danger").add("rel","eliminar_layer").add("refresh_components","");

		btn_servico = new IGRPButton("Serviço","poser_2020","Layers_lst","servico","_blank","purple|fa-server","","");
		btn_servico.propertie.add("type","specific").add("class","purple").add("rel","servico").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		form_1.addField(nome_layer_flt);
		form_1.addField(tipo_servico_lst);

		table_1.addField(nome_layer_lst);
		table_1.addField(codigo_layer_lst);
		table_1.addField(tp_layer_lst);
		table_1.addField(url_layer_lst);
		table_1.addField(id);

		toolsbar_1.addButton(btn_novo);
		form_1.addButton(btn_pesquisar);
		table_1.addButton(btn_estd_layer);
		table_1.addButton(btn_editar_layer);
		table_1.addButton(btn_eliminar_layer);
		table_1.addButton(btn_servico);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_layer_flt.setValue(model);
		tipo_servico_lst.setValue(model);
		nome_layer_lst.setValue(model);
		codigo_layer_lst.setValue(model);
		tp_layer_lst.setValue(model);
		url_layer_lst.setValue(model);
		id.setValue(model);	

		table_1.loadModel(((Layers_lst) model).getTable_1());
		}
}
