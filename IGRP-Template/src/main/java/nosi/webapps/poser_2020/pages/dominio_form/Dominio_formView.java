package nosi.webapps.poser_2020.pages.dominio_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Dominio_formView extends View {

	public Field gest_d_text;
	public Field dominio_reg;
	public Field codigo_reg;
	public Field signif_reg;
	public Field est_form;
	public Field id;
	public IGRPSectionHeader gest_d;
	public IGRPForm reg_domin;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_dom;

	public Dominio_formView(){

		this.setPageTitle("Inserir / Editar Domínio");
			
		gest_d = new IGRPSectionHeader("gest_d","");

		reg_domin = new IGRPForm("reg_domin","");

		gest_d_text = new TextField(model,"gest_d_text");
		gest_d_text.setLabel(gt(""));
		gest_d_text.setValue(gt(""));
		gest_d_text.propertie().add("type","text").add("name","p_gest_d_text").add("maxlength","4000");
		
		dominio_reg = new TextField(model,"dominio_reg");
		dominio_reg.setLabel(gt("Domínio"));
		dominio_reg.propertie().add("name","p_dominio_reg").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		codigo_reg = new TextField(model,"codigo_reg");
		codigo_reg.setLabel(gt("Código"));
		codigo_reg.propertie().add("name","p_codigo_reg").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		signif_reg = new TextField(model,"signif_reg");
		signif_reg.setLabel(gt("Significado"));
		signif_reg.propertie().add("name","p_signif_reg").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		est_form = new ListField(model,"est_form");
		est_form.setLabel(gt("Estado"));
		est_form.propertie().add("name","p_est_form").add("type","select").add("multiple","false").add("tags","false").add("domain","DM_ESTADO « poser_2020").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_dom = new IGRPButton("Gravar","poser_2020","Dominio_form","gravar_dom","submit","success|fa-save","","");
		btn_gravar_dom.propertie.add("type","specific").add("rel","gravar_dom").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		gest_d.addField(gest_d_text);


		reg_domin.addField(dominio_reg);
		reg_domin.addField(codigo_reg);
		reg_domin.addField(signif_reg);
		reg_domin.addField(est_form);
		reg_domin.addField(id);

		toolsbar_1.addButton(btn_gravar_dom);
		this.addToPage(gest_d);
		this.addToPage(reg_domin);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		dominio_reg.setValue(model);
		codigo_reg.setValue(model);
		signif_reg.setValue(model);
		est_form.setValue(model);
		id.setValue(model);	

		}
}
