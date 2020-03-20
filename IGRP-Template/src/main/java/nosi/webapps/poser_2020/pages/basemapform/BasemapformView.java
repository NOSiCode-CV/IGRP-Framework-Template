package nosi.webapps.poser_2020.pages.basemapform;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class BasemapformView extends View {

	public Field form_bm_text;
	public Field nome_bs;
	public Field cod_bm;
	public Field link_bs;
	public Field zoom_enq;
	public Field id;
	public IGRPSectionHeader form_bm;
	public IGRPForm form_2;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_bs;

	public BasemapformView(){

		this.setPageTitle("Inserir/Editar Basemap");
			
		form_bm = new IGRPSectionHeader("form_bm","");

		form_2 = new IGRPForm("form_2","");

		form_bm_text = new TextField(model,"form_bm_text");
		form_bm_text.setLabel(gt(""));
		form_bm_text.setValue(gt(""));
		form_bm_text.propertie().add("type","text").add("name","p_form_bm_text").add("maxlength","50");
		
		nome_bs = new TextField(model,"nome_bs");
		nome_bs.setLabel(gt("Nome"));
		nome_bs.propertie().add("name","p_nome_bs").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		cod_bm = new TextField(model,"cod_bm");
		cod_bm.setLabel(gt("Código"));
		cod_bm.propertie().add("name","p_cod_bm").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		link_bs = new TextField(model,"link_bs");
		link_bs.setLabel(gt("Link"));
		link_bs.propertie().add("name","p_link_bs").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		zoom_enq = new NumberField(model,"zoom_enq");
		zoom_enq.setLabel(gt("Zoom"));
		zoom_enq.propertie().add("name","p_zoom_enq").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_bs = new IGRPButton("Gravar","poser_2020","Basemapform","gravar_bs","submit","success|fa-save","","");
		btn_gravar_bs.propertie.add("type","specific").add("rel","gravar_bs").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_bm.addField(form_bm_text);


		form_2.addField(nome_bs);
		form_2.addField(cod_bm);
		form_2.addField(link_bs);
		form_2.addField(zoom_enq);
		form_2.addField(id);

		toolsbar_1.addButton(btn_gravar_bs);
		this.addToPage(form_bm);
		this.addToPage(form_2);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_bs.setValue(model);
		cod_bm.setValue(model);
		link_bs.setValue(model);
		zoom_enq.setValue(model);
		id.setValue(model);	

		}
}
