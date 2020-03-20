package nosi.webapps.poser_2020.pages.lst_widg_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lst_widg_formView extends View {

	public Field lst_wdg_text;
	public Field nome_lst;
	public Field tooltip_lst;
	public Field posicao_lst;
	public Field id;
	public IGRPSectionHeader lst_wdg;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar_wg;

	public Lst_widg_formView(){

		this.setPageTitle("Listar / Filtrar Widgets");
			
		lst_wdg = new IGRPSectionHeader("lst_wdg","");

		table_1 = new IGRPTable("table_1","Listar");

		lst_wdg_text = new TextField(model,"lst_wdg_text");
		lst_wdg_text.setLabel(gt(""));
		lst_wdg_text.setValue(gt("<p>Gest&atilde;o Widgets</p>"));
		lst_wdg_text.propertie().add("type","text").add("name","p_lst_wdg_text").add("maxlength","35");
		
		nome_lst = new TextField(model,"nome_lst");
		nome_lst.setLabel(gt("Nome"));
		nome_lst.propertie().add("name","p_nome_lst").add("type","text").add("maxlength","50").add("showLabel","true").add("group_in","");
		
		tooltip_lst = new TextField(model,"tooltip_lst");
		tooltip_lst.setLabel(gt("Tooltip"));
		tooltip_lst.propertie().add("name","p_tooltip_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		posicao_lst = new TextField(model,"posicao_lst");
		posicao_lst.setLabel(gt("Posição"));
		posicao_lst.propertie().add("name","p_posicao_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","poser_2020","Lst_widg_form","novo","modal|refresh","success|fa-plus","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","poser_2020","Lst_widg_form","editar","modal|refresh","warning|fa-pencil-square-o","","");
		btn_editar.propertie.add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar_wg = new IGRPButton("Eliminar","poser_2020","Lst_widg_form","eliminar_wg","confirm","danger|fa-trash-o","","");
		btn_eliminar_wg.propertie.add("type","specific").add("class","danger").add("rel","eliminar_wg").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		lst_wdg.addField(lst_wdg_text);


		table_1.addField(nome_lst);
		table_1.addField(tooltip_lst);
		table_1.addField(posicao_lst);
		table_1.addField(id);

		toolsbar_1.addButton(btn_novo);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar_wg);
		this.addToPage(lst_wdg);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_lst.setValue(model);
		tooltip_lst.setValue(model);
		posicao_lst.setValue(model);
		id.setValue(model);	

		table_1.loadModel(((Lst_widg_form) model).getTable_1());
		}
}
