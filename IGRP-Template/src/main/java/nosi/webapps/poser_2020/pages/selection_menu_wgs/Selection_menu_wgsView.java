package nosi.webapps.poser_2020.pages.selection_menu_wgs;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Selection_menu_wgsView extends View {

	public Field selection_menu_text;
	public Field layer;
	public Field tipo_de_pagina;
	public Field target;
	public Field endereco_de_pagina;
	public Field label;
	public Field valores;
	public Field link_wdg;
	public Field pagina_igrp;
	public Field ordem;
	public Field icon;
	public Field parametros;
	public Field atributos;
	public Field id;
	public IGRPSectionHeader selection_menu;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_mn;

	public Selection_menu_wgsView(){

		this.setPageTitle("Selection Menu");
			
		selection_menu = new IGRPSectionHeader("selection_menu","");

		form_1 = new IGRPForm("form_1","");

		selection_menu_text = new TextField(model,"selection_menu_text");
		selection_menu_text.setLabel(gt(""));
		selection_menu_text.setValue(gt("<p>Selection Menus</p>"));
		selection_menu_text.propertie().add("type","text").add("name","p_selection_menu_text").add("maxlength","4000");
		
		layer = new ListField(model,"layer");
		layer.setLabel(gt("Layer"));
		layer.propertie().add("name","p_layer").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","Integer");
		
		tipo_de_pagina = new ListField(model,"tipo_de_pagina");
		tipo_de_pagina.setLabel(gt("Tipo de Página"));
		tipo_de_pagina.propertie().add("name","p_tipo_de_pagina").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		target = new ListField(model,"target");
		target.setLabel(gt("Target"));
		target.propertie().add("name","p_target").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		endereco_de_pagina = new TextField(model,"endereco_de_pagina");
		endereco_de_pagina.setLabel(gt("Endereço de Página"));
		endereco_de_pagina.propertie().add("name","p_endereco_de_pagina").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		label = new TextField(model,"label");
		label.setLabel(gt("Label"));
		label.propertie().add("name","p_label").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		valores = new TextField(model,"valores");
		valores.setLabel(gt("Valores"));
		valores.propertie().add("name","p_valores").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		link_wdg = new TextField(model,"link_wdg");
		link_wdg.setLabel(gt("Link"));
		link_wdg.propertie().add("name","p_link_wdg").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		pagina_igrp = new LookupField(model,"pagina_igrp");
		pagina_igrp.setLabel(gt("Página IGRP"));
		pagina_igrp.setLookup("poser_2020","Selection_menu_wgs","index");
		pagina_igrp.addParam("target","_blank");
		pagina_igrp.propertie().add("name","p_pagina_igrp").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		ordem = new TextField(model,"ordem");
		ordem.setLabel(gt("Ordem"));
		ordem.propertie().add("name","p_ordem").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		icon = new LookupField(model,"icon");
		icon.setLabel(gt("Icon"));
		icon.setLookup("poser_2020","Selection_menu_wgs","index");
		icon.addParam("target","_blank");
		icon.propertie().add("name","p_icon").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		parametros = new TextField(model,"parametros");
		parametros.setLabel(gt("Parametros"));
		parametros.propertie().add("name","p_parametros").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		atributos = new TextField(model,"atributos");
		atributos.setLabel(gt("Atributos"));
		atributos.propertie().add("name","p_atributos").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_mn = new IGRPButton("Gravar","poser_2020","Selection_menu_wgs","gravar_mn","submit","success|fa-floppy-o","","");
		btn_gravar_mn.propertie.add("type","specific").add("rel","gravar_mn").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		selection_menu.addField(selection_menu_text);


		form_1.addField(layer);
		form_1.addField(tipo_de_pagina);
		form_1.addField(target);
		form_1.addField(endereco_de_pagina);
		form_1.addField(label);
		form_1.addField(valores);
		form_1.addField(link_wdg);
		form_1.addField(pagina_igrp);
		form_1.addField(ordem);
		form_1.addField(icon);
		form_1.addField(parametros);
		form_1.addField(atributos);
		form_1.addField(id);

		toolsbar_1.addButton(btn_gravar_mn);
		this.addToPage(selection_menu);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		layer.setValue(model);
		tipo_de_pagina.setValue(model);
		target.setValue(model);
		endereco_de_pagina.setValue(model);
		label.setValue(model);
		valores.setValue(model);
		link_wdg.setValue(model);
		pagina_igrp.setValue(model);
		ordem.setValue(model);
		icon.setValue(model);
		parametros.setValue(model);
		atributos.setValue(model);
		id.setValue(model);	

		}
}
