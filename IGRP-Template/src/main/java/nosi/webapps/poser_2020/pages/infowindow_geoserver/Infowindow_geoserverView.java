package nosi.webapps.poser_2020.pages.infowindow_geoserver;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Infowindow_geoserverView extends View {

	public Field iden_text;
	public Field layer_idt;
	public Field label_idf;
	public Field ordem_idf;
	public Field campo_idf;
	public Field editavel_ed;
	public IGRPSectionHeader iden;
	public IGRPSeparatorList separatorlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_idt;

	public Infowindow_geoserverView(){

		this.setPageTitle("Identify");
			
		iden = new IGRPSectionHeader("iden","");

		separatorlist_1 = new IGRPSeparatorList("separatorlist_1","");

		iden_text = new TextField(model,"iden_text");
		iden_text.setLabel(gt(""));
		iden_text.setValue(gt("<p>Identify</p>"));
		iden_text.propertie().add("type","text").add("name","p_iden_text").add("maxlength","40");
		
		layer_idt = new ListField(model,"layer_idt");
		layer_idt.setLabel(gt("Layer"));
		layer_idt.propertie().add("name","p_layer_idt").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		
		label_idf = new TextField(model,"label_idf");
		label_idf.setLabel(gt("Label"));
		label_idf.propertie().add("name","p_label_idf").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		ordem_idf = new NumberField(model,"ordem_idf");
		ordem_idf.setLabel(gt("Ordem"));
		ordem_idf.propertie().add("name","p_ordem_idf").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("desc","true");
		
		campo_idf = new ListField(model,"campo_idf");
		campo_idf.setLabel(gt("Campo"));
		campo_idf.propertie().add("name","p_campo_idf").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		
		editavel_ed = new ListField(model,"editavel_ed");
		editavel_ed.setLabel(gt("Editavel"));
		editavel_ed.propertie().add("name","p_editavel_ed").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_idt = new IGRPButton("Gravar","poser_2020","Infowindow_geoserver","gravar_idt","confirm","success|fa-save","","");
		btn_gravar_idt.propertie.add("type","specific").add("rel","gravar_idt").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		iden.addField(iden_text);


		separatorlist_1.addField(layer_idt);
		separatorlist_1.addField(label_idf);
		separatorlist_1.addField(ordem_idf);
		separatorlist_1.addField(campo_idf);
		separatorlist_1.addField(editavel_ed);

		toolsbar_1.addButton(btn_gravar_idt);
		this.addToPage(iden);
		this.addToPage(separatorlist_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		layer_idt.setValue(model);
		label_idf.setValue(model);
		ordem_idf.setValue(model);
		campo_idf.setValue(model);
		editavel_ed.setValue(model);	

		separatorlist_1.loadModel(((Infowindow_geoserver) model).getSeparatorlist_1());
		}
}
