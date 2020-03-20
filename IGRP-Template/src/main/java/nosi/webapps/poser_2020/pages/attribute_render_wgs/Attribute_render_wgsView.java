package nosi.webapps.poser_2020.pages.attribute_render_wgs;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Attribute_render_wgsView extends View {

	public Field attribute_render_text;
	public Field layer;
	public Field operador;
	public Field label;
	public Field valor;
	public Field cor;
	public Field campo;
	public Field id;
	public IGRPSectionHeader attribute_render;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_wgs;

	public Attribute_render_wgsView(){

		this.setPageTitle("Attribute Render");
			
		attribute_render = new IGRPSectionHeader("attribute_render","");

		form_1 = new IGRPForm("form_1","");

		attribute_render_text = new TextField(model,"attribute_render_text");
		attribute_render_text.setLabel(gt(""));
		attribute_render_text.setValue(gt("<p>Attribute Render</p>"));
		attribute_render_text.propertie().add("type","text").add("name","p_attribute_render_text").add("maxlength","4000");
		
		layer = new ListField(model,"layer");
		layer.setLabel(gt("Layer"));
		layer.propertie().add("name","p_layer").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","Integer");
		
		operador = new ListField(model,"operador");
		operador.setLabel(gt("Operador"));
		operador.propertie().add("name","p_operador").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		label = new TextField(model,"label");
		label.setLabel(gt("Label"));
		label.propertie().add("name","p_label").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		valor = new TextField(model,"valor");
		valor.setLabel(gt("Valor"));
		valor.propertie().add("name","p_valor").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		cor = new ColorField(model,"cor");
		cor.setLabel(gt("Cor"));
		cor.propertie().add("name","p_cor").add("type","color").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		campo = new TextField(model,"campo");
		campo.setLabel(gt("Campo"));
		campo.propertie().add("name","p_campo").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_wgs = new IGRPButton("Gravar","poser_2020","Attribute_render_wgs","gravar_wgs","submit","success|fa-save","","");
		btn_gravar_wgs.propertie.add("type","specific").add("rel","gravar_wgs").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		attribute_render.addField(attribute_render_text);


		form_1.addField(layer);
		form_1.addField(operador);
		form_1.addField(label);
		form_1.addField(valor);
		form_1.addField(cor);
		form_1.addField(campo);
		form_1.addField(id);

		toolsbar_1.addButton(btn_gravar_wgs);
		this.addToPage(attribute_render);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		layer.setValue(model);
		operador.setValue(model);
		label.setValue(model);
		valor.setValue(model);
		cor.setValue(model);
		campo.setValue(model);
		id.setValue(model);	

		}
}
