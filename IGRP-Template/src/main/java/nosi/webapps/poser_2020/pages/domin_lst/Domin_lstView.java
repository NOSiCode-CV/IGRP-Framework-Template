package nosi.webapps.poser_2020.pages.domin_lst;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Domin_lstView extends View {

	public Field ls_dom_text;
	public Field dom_lst;
	public Field codigo_lst;
	public Field significado_lst;
	public Field id;
	public Field teste;
	public IGRPSectionHeader ls_dom;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_alt_est;
	public IGRPButton btn_editar_lst;
	public IGRPButton btn_elimin_lst;

	public Domin_lstView(){

		this.setPageTitle("Listar / Filtrar Dominio");
			
		ls_dom = new IGRPSectionHeader("ls_dom","");

		table_1 = new IGRPTable("table_1","");

		ls_dom_text = new TextField(model,"ls_dom_text");
		ls_dom_text.setLabel(gt(""));
		ls_dom_text.setValue(gt("<p>Gest&atilde;o Dom&iacute;nios&nbsp;</p>"));
		ls_dom_text.propertie().add("type","text").add("name","p_ls_dom_text").add("maxlength","70");
		
		dom_lst = new TextField(model,"dom_lst");
		dom_lst.setLabel(gt("Domínio"));
		dom_lst.propertie().add("name","p_dom_lst").add("type","text").add("maxlength","50").add("showLabel","true").add("group_in","");
		
		codigo_lst = new TextField(model,"codigo_lst");
		codigo_lst.setLabel(gt("Código"));
		codigo_lst.propertie().add("name","p_codigo_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		significado_lst = new TextField(model,"significado_lst");
		significado_lst.setLabel(gt("Significado"));
		significado_lst.propertie().add("name","p_significado_lst").add("type","text").add("maxlength","100").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id");
		
		teste = new HiddenField(model,"teste");
		teste.setLabel(gt(""));
		teste.propertie().add("name","p_teste").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","teste");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","poser_2020","Domin_lst","novo","right_panel","success|fa-plus","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_alt_est = new IGRPButton("Alterar Estado","poser_2020","Domin_lst","alt_est","confirm","info|fa-toggle-on","","");
		btn_alt_est.propertie.add("type","specific").add("class","info").add("rel","alt_est").add("refresh_components","");

		btn_editar_lst = new IGRPButton("Editar","poser_2020","Domin_lst","editar_lst","right_panel|refresh","warning|fa-pencil-square-o","","");
		btn_editar_lst.propertie.add("type","specific").add("class","warning").add("rel","editar_lst").add("refresh_components","");

		btn_elimin_lst = new IGRPButton("Eliminar","poser_2020","Domin_lst","elimin_lst","confirm","danger|fa-trash","","");
		btn_elimin_lst.propertie.add("type","specific").add("class","danger").add("rel","elimin_lst").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ls_dom.addField(ls_dom_text);


		table_1.addField(dom_lst);
		table_1.addField(codigo_lst);
		table_1.addField(significado_lst);
		table_1.addField(id);
		table_1.addField(teste);

		toolsbar_1.addButton(btn_novo);
		table_1.addButton(btn_alt_est);
		table_1.addButton(btn_editar_lst);
		table_1.addButton(btn_elimin_lst);
		this.addToPage(ls_dom);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		dom_lst.setValue(model);
		codigo_lst.setValue(model);
		significado_lst.setValue(model);
		id.setValue(model);
		teste.setValue(model);	

		table_1.loadModel(((Domin_lst) model).getTable_1());
		}
}
