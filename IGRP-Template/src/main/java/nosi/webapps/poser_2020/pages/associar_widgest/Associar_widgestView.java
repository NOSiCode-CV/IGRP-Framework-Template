package nosi.webapps.poser_2020.pages.associar_widgest;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Associar_widgestView extends View {

	public Field sectionheader_1_text;
	public Field lista_de_widgest;
	public Field associar_widgest;
	public Field widgest_ls;
	public Field nome_ls;
	public Field posicao_ls;
	public Field ordem_ls;
	public Field tooltip_ls;
	public Field id;
	public Field widgest;
	public Field nome;
	public Field posicao;
	public Field icone;
	public Field ordem;
	public Field tooltip;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTabContent tabcontent_1;
	public IGRPTable table_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_2;
	public IGRPButton btn_gravar;
	public IGRPButton btn_configuracoes;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Associar_widgestView(){

		this.setPageTitle("Associar Widgest");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		tabcontent_1 = new IGRPTabContent("tabcontent_1","");

		table_1 = new IGRPTable("table_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Associar Widgest</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		lista_de_widgest = new TextField(model,"lista_de_widgest");
		lista_de_widgest.setLabel(gt("Lista de Widgest"));
		lista_de_widgest.propertie().add("name","p_lista_de_widgest").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("img","fa-google-wallet").add("maxlength","50");
		
		associar_widgest = new TextField(model,"associar_widgest");
		associar_widgest.setLabel(gt("Associar Widgest"));
		associar_widgest.propertie().add("name","p_associar_widgest").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("img","fa-google-wallet").add("maxlength","50");
		
		widgest_ls = new TextField(model,"widgest_ls");
		widgest_ls.setLabel(gt("Widgest"));
		widgest_ls.propertie().add("name","p_widgest_ls").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nome_ls = new TextField(model,"nome_ls");
		nome_ls.setLabel(gt("Nome"));
		nome_ls.propertie().add("name","p_nome_ls").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		posicao_ls = new TextField(model,"posicao_ls");
		posicao_ls.setLabel(gt("Posição"));
		posicao_ls.propertie().add("name","p_posicao_ls").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		ordem_ls = new NumberField(model,"ordem_ls");
		ordem_ls.setLabel(gt("Ordem"));
		ordem_ls.propertie().add("name","p_ordem_ls").add("type","number").add("min","").add("max","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","");
		
		tooltip_ls = new TextField(model,"tooltip_ls");
		tooltip_ls.setLabel(gt("Tooltip"));
		tooltip_ls.propertie().add("name","p_tooltip_ls").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id");
		
		widgest = new ListField(model,"widgest");
		widgest.setLabel(gt("Widgest"));
		widgest.propertie().add("name","p_widgest").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","Integer");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		posicao = new ListField(model,"posicao");
		posicao.setLabel(gt("Posição"));
		posicao.propertie().add("name","p_posicao").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		icone = new LookupField(model,"icone");
		icone.setLabel(gt("Icone"));
		icone.setLookup("poser_2020","Associar_widgest","index");
		icone.addParam("target","_blank");
		icone.propertie().add("name","p_icone").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		ordem = new NumberField(model,"ordem");
		ordem.setLabel(gt("Ordem"));
		ordem.propertie().add("name","p_ordem").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		tooltip = new TextField(model,"tooltip");
		tooltip.setLabel(gt("Tooltip"));
		tooltip.propertie().add("name","p_tooltip").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		

		toolsbar_2 = new IGRPToolsBar("toolsbar_2");

		btn_gravar = new IGRPButton("Gravar","poser_2020","Associar_widgest","gravar","submit","success|fa-floppy-o","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		btn_configuracoes = new IGRPButton("Configurações","poser_2020","Associar_widgest","configuracoes","mpsubmit|refresh","link|fa-link","","");
		btn_configuracoes.propertie.add("type","specific").add("class","link").add("rel","configuracoes").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","poser_2020","Associar_widgest","editar","mpsubmit|refresh","warning|fa-pencil","","");
		btn_editar.propertie.add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","poser_2020","Associar_widgest","eliminar","confirm","danger|fa-times","","");
		btn_eliminar.propertie.add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		tabcontent_1.addField(lista_de_widgest);
		tabcontent_1.addField(associar_widgest);

		table_1.addField(widgest_ls);
		table_1.addField(nome_ls);
		table_1.addField(posicao_ls);
		table_1.addField(ordem_ls);
		table_1.addField(tooltip_ls);
		table_1.addField(id);


		form_1.addField(widgest);
		form_1.addField(nome);
		form_1.addField(posicao);
		form_1.addField(icone);
		form_1.addField(ordem);
		form_1.addField(tooltip);

		toolsbar_2.addButton(btn_gravar);
		table_1.addButton(btn_configuracoes);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(sectionheader_1);
		this.addToPage(tabcontent_1);
		this.addToPage(table_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_2);
	}
		
	@Override
	public void setModel(Model model) {
		
		lista_de_widgest.setValue(model);
		associar_widgest.setValue(model);
		widgest_ls.setValue(model);
		nome_ls.setValue(model);
		posicao_ls.setValue(model);
		ordem_ls.setValue(model);
		tooltip_ls.setValue(model);
		id.setValue(model);
		widgest.setValue(model);
		nome.setValue(model);
		posicao.setValue(model);
		icone.setValue(model);
		ordem.setValue(model);
		tooltip.setValue(model);	

		table_1.loadModel(((Associar_widgest) model).getTable_1());
		}
}
