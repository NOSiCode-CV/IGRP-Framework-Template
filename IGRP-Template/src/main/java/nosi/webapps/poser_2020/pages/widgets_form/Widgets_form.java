package nosi.webapps.poser_2020.pages.widgets_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Widgets_form extends Model{		

	@RParam(rParamName = "p_ins_wdg_text")
	private String ins_wdg_text;

	@NotNull()
	@RParam(rParamName = "p_nome_wgt_form")
	private String nome_wgt_form;

	@RParam(rParamName = "p_label_wdg_form")
	private String label_wdg_form;

	@RParam(rParamName = "p_xlm_proc_form")
	private String xlm_proc_form;

	@RParam(rParamName = "p_posic_wdg")
	private String posic_wdg;

	@RParam(rParamName = "p_icon_form")
	private String icon_form;

	@NotNull()
	@RParam(rParamName = "p_tooltip_wdg")
	private String tooltip_wdg;

	@RParam(rParamName = "p_pag_igrpweb_wdg")
	private String pag_igrpweb_wdg;

	@RParam(rParamName = "p_xml_def_form")
	private String xml_def_form;

	@RParam(rParamName = "p_form_id_wdg")
	private String form_id_wdg;
	
	public void setIns_wdg_text(String ins_wdg_text){
		this.ins_wdg_text = ins_wdg_text;
	}
	public String getIns_wdg_text(){
		return this.ins_wdg_text;
	}
	
	public void setNome_wgt_form(String nome_wgt_form){
		this.nome_wgt_form = nome_wgt_form;
	}
	public String getNome_wgt_form(){
		return this.nome_wgt_form;
	}
	
	public void setLabel_wdg_form(String label_wdg_form){
		this.label_wdg_form = label_wdg_form;
	}
	public String getLabel_wdg_form(){
		return this.label_wdg_form;
	}
	
	public void setXlm_proc_form(String xlm_proc_form){
		this.xlm_proc_form = xlm_proc_form;
	}
	public String getXlm_proc_form(){
		return this.xlm_proc_form;
	}
	
	public void setPosic_wdg(String posic_wdg){
		this.posic_wdg = posic_wdg;
	}
	public String getPosic_wdg(){
		return this.posic_wdg;
	}
	
	public void setIcon_form(String icon_form){
		this.icon_form = icon_form;
	}
	public String getIcon_form(){
		return this.icon_form;
	}
	
	public void setTooltip_wdg(String tooltip_wdg){
		this.tooltip_wdg = tooltip_wdg;
	}
	public String getTooltip_wdg(){
		return this.tooltip_wdg;
	}
	
	public void setPag_igrpweb_wdg(String pag_igrpweb_wdg){
		this.pag_igrpweb_wdg = pag_igrpweb_wdg;
	}
	public String getPag_igrpweb_wdg(){
		return this.pag_igrpweb_wdg;
	}
	
	public void setXml_def_form(String xml_def_form){
		this.xml_def_form = xml_def_form;
	}
	public String getXml_def_form(){
		return this.xml_def_form;
	}
	
	public void setForm_id_wdg(String form_id_wdg){
		this.form_id_wdg = form_id_wdg;
	}
	public String getForm_id_wdg(){
		return this.form_id_wdg;
	}



}
