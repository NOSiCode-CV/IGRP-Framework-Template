package nosi.webapps.poser_2020.pages.edicao_widget;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Edicao_widgetView extends View {

	public Field wdg_edicao_text;
	public Field layer_edi;
	public Field procedimento;
	public Field id;
	public IGRPSectionHeader wdg_edicao;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_edi;

	public Edicao_widgetView(){

		this.setPageTitle("Edição");
			
		wdg_edicao = new IGRPSectionHeader("wdg_edicao","");

		form_1 = new IGRPForm("form_1","");

		wdg_edicao_text = new TextField(model,"wdg_edicao_text");
		wdg_edicao_text.setLabel(gt(""));
		wdg_edicao_text.setValue(gt("<p>Edi&ccedil;&atilde;o</p>"));
		wdg_edicao_text.propertie().add("type","text").add("name","p_wdg_edicao_text").add("maxlength","4000");
		
		layer_edi = new ListField(model,"layer_edi");
		layer_edi.setLabel(gt("Layer"));
		layer_edi.propertie().add("name","p_layer_edi").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","Integer");
		
		procedimento = new TextField(model,"procedimento");
		procedimento.setLabel(gt("Procedimento"));
		procedimento.propertie().add("name","p_procedimento").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_edi = new IGRPButton("Gravar","poser_2020","Edicao_widget","gravar_edi","submit","success|fa-floppy-o","","");
		btn_gravar_edi.propertie.add("type","specific").add("rel","gravar_edi").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		wdg_edicao.addField(wdg_edicao_text);


		form_1.addField(layer_edi);
		form_1.addField(procedimento);
		form_1.addField(id);

		toolsbar_1.addButton(btn_gravar_edi);
		this.addToPage(wdg_edicao);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		layer_edi.setValue(model);
		procedimento.setValue(model);
		id.setValue(model);	

		}
}
