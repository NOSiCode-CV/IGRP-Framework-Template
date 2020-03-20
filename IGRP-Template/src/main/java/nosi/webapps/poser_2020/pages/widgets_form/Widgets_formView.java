package nosi.webapps.poser_2020.pages.widgets_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Widgets_formView extends View {

	public Field ins_wdg_text;
	public Field nome_wgt_form;
	public Field label_wdg_form;
	public Field xlm_proc_form;
	public Field posic_wdg;
	public Field icon_form;
	public Field tooltip_wdg;
	public Field pag_igrpweb_wdg;
	public Field xml_def_form;
	public Field form_id_wdg;
	public IGRPSectionHeader ins_wdg;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_grava_wdg;

	public Widgets_formView(){

		this.setPageTitle("Inserir/Editar Widgets");
			
		ins_wdg = new IGRPSectionHeader("ins_wdg","");

		form_1 = new IGRPForm("form_1","");

		ins_wdg_text = new TextField(model,"ins_wdg_text");
		ins_wdg_text.setLabel(gt(""));
		ins_wdg_text.setValue(gt(""));
		ins_wdg_text.propertie().add("type","text").add("name","p_ins_wdg_text").add("maxlength","40");
		
		nome_wgt_form = new TextField(model,"nome_wgt_form");
		nome_wgt_form.setLabel(gt("Nome"));
		nome_wgt_form.propertie().add("name","p_nome_wgt_form").add("type","text").add("maxlength","200").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		label_wdg_form = new TextField(model,"label_wdg_form");
		label_wdg_form.setLabel(gt("Label"));
		label_wdg_form.propertie().add("name","p_label_wdg_form").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		xlm_proc_form = new TextField(model,"xlm_proc_form");
		xlm_proc_form.setLabel(gt("XLM_Proc"));
		xlm_proc_form.propertie().add("name","p_xlm_proc_form").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		posic_wdg = new ListField(model,"posic_wdg");
		posic_wdg.setLabel(gt("Posição"));
		posic_wdg.propertie().add("name","p_posic_wdg").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","100").add("required","true").add("disabled","false").add("java-type","");
		
		icon_form = new LookupField(model,"icon_form");
		icon_form.setLabel(gt("Icon"));
		icon_form.setLookup("poser_2020","Mapas_lst","index");
		icon_form.addParam("target","_blank");
		icon_form.propertie().add("name","p_icon_form").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		tooltip_wdg = new TextField(model,"tooltip_wdg");
		tooltip_wdg.setLabel(gt("Tooltip"));
		tooltip_wdg.propertie().add("name","p_tooltip_wdg").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		pag_igrpweb_wdg = new LookupField(model,"pag_igrpweb_wdg");
		pag_igrpweb_wdg.setLabel(gt("Pagina IGRPWeb"));
		pag_igrpweb_wdg.setLookup("poser_2020","Mapas_lst","index");
		pag_igrpweb_wdg.addParam("target","_blank");
		pag_igrpweb_wdg.propertie().add("name","p_pag_igrpweb_wdg").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		xml_def_form = new TextAreaField(model,"xml_def_form");
		xml_def_form.setLabel(gt("XML Defeault"));
		xml_def_form.propertie().add("name","p_xml_def_form").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		form_id_wdg = new HiddenField(model,"form_id_wdg");
		form_id_wdg.setLabel(gt(""));
		form_id_wdg.propertie().add("name","p_form_id_wdg").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","form_id_wdg");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_grava_wdg = new IGRPButton("Gravar","poser_2020","Widgets_form","grava_wdg","submit","success|fa-save","","");
		btn_grava_wdg.propertie.add("type","specific").add("rel","grava_wdg").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_wdg.addField(ins_wdg_text);


		form_1.addField(nome_wgt_form);
		form_1.addField(label_wdg_form);
		form_1.addField(xlm_proc_form);
		form_1.addField(posic_wdg);
		form_1.addField(icon_form);
		form_1.addField(tooltip_wdg);
		form_1.addField(pag_igrpweb_wdg);
		form_1.addField(xml_def_form);
		form_1.addField(form_id_wdg);

		toolsbar_1.addButton(btn_grava_wdg);
		this.addToPage(ins_wdg);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_wgt_form.setValue(model);
		label_wdg_form.setValue(model);
		xlm_proc_form.setValue(model);
		posic_wdg.setValue(model);
		icon_form.setValue(model);
		tooltip_wdg.setValue(model);
		pag_igrpweb_wdg.setValue(model);
		xml_def_form.setValue(model);
		form_id_wdg.setValue(model);	

		}
}
