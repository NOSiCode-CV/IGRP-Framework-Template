package nosi.webapps.poser_2020.pages.enquad_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Enquad_formView extends View {

	public Field tt_eng_text;
	public Field nome_enq;
	public Field c_latitude;
	public Field c_longitude;
	public Field zoom_enq;
	public Field id;
	public IGRPSectionHeader tt_eng;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_enq;

	public Enquad_formView(){

		this.setPageTitle("Inserir / Editar Enquadramento");
			
		tt_eng = new IGRPSectionHeader("tt_eng","");

		form_1 = new IGRPForm("form_1","");

		tt_eng_text = new TextField(model,"tt_eng_text");
		tt_eng_text.setLabel(gt(""));
		tt_eng_text.setValue(gt(""));
		tt_eng_text.propertie().add("type","text").add("name","p_tt_eng_text").add("maxlength","50");
		
		nome_enq = new TextField(model,"nome_enq");
		nome_enq.setLabel(gt("Nome"));
		nome_enq.propertie().add("name","p_nome_enq").add("type","text").add("maxlength","100").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		c_latitude = new TextField(model,"c_latitude");
		c_latitude.setLabel(gt("Latitude"));
		c_latitude.propertie().add("name","p_c_latitude").add("type","text").add("maxlength","2000").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		c_longitude = new TextField(model,"c_longitude");
		c_longitude.setLabel(gt("Longitude"));
		c_longitude.propertie().add("name","p_c_longitude").add("type","text").add("maxlength","2000").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		zoom_enq = new TextField(model,"zoom_enq");
		zoom_enq.setLabel(gt("Zoom"));
		zoom_enq.propertie().add("name","p_zoom_enq").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_enq = new IGRPButton("Gravar","poser_2020","Enquad_form","gravar_enq","submit","success|fa-save","","");
		btn_gravar_enq.propertie.add("type","specific").add("rel","gravar_enq").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		tt_eng.addField(tt_eng_text);


		form_1.addField(nome_enq);
		form_1.addField(c_latitude);
		form_1.addField(c_longitude);
		form_1.addField(zoom_enq);
		form_1.addField(id);

		toolsbar_1.addButton(btn_gravar_enq);
		this.addToPage(tt_eng);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_enq.setValue(model);
		c_latitude.setValue(model);
		c_longitude.setValue(model);
		zoom_enq.setValue(model);
		id.setValue(model);	

		}
}
