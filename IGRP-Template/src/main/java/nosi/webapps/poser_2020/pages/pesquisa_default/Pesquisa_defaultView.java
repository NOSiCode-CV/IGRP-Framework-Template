package nosi.webapps.poser_2020.pages.pesquisa_default;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Pesquisa_defaultView extends View {

	public Field pes_default_wdg_text;
	public Field layer_pd_wdg;
	public Field campo_pes;
	public Field id;
	public IGRPSectionHeader pes_default_wdg;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_pd_wdg;

	public Pesquisa_defaultView(){

		this.setPageTitle("Pesquisa");
			
		pes_default_wdg = new IGRPSectionHeader("pes_default_wdg","");

		form_1 = new IGRPForm("form_1","");

		pes_default_wdg_text = new TextField(model,"pes_default_wdg_text");
		pes_default_wdg_text.setLabel(gt(""));
		pes_default_wdg_text.setValue(gt("<p>Pesquisa</p>"));
		pes_default_wdg_text.propertie().add("type","text").add("name","p_pes_default_wdg_text").add("maxlength","4000");
		
		layer_pd_wdg = new ListField(model,"layer_pd_wdg");
		layer_pd_wdg.setLabel(gt("Layer"));
		layer_pd_wdg.propertie().add("name","p_layer_pd_wdg").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","Integer");
		
		campo_pes = new TextField(model,"campo_pes");
		campo_pes.setLabel(gt("Campo"));
		campo_pes.propertie().add("name","p_campo_pes").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_pd_wdg = new IGRPButton("Gravar","poser_2020","Pesquisa_default","gravar_pd_wdg","submit","success|fa-floppy-o","","");
		btn_gravar_pd_wdg.propertie.add("type","specific").add("rel","gravar_pd_wdg").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		pes_default_wdg.addField(pes_default_wdg_text);


		form_1.addField(layer_pd_wdg);
		form_1.addField(campo_pes);
		form_1.addField(id);

		toolsbar_1.addButton(btn_gravar_pd_wdg);
		this.addToPage(pes_default_wdg);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		layer_pd_wdg.setValue(model);
		campo_pes.setValue(model);
		id.setValue(model);	

		}
}
