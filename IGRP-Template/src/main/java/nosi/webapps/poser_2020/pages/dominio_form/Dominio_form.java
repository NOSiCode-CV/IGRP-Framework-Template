package nosi.webapps.poser_2020.pages.dominio_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Dominio_form extends Model{		

	@RParam(rParamName = "p_gest_d_text")
	private String gest_d_text;

	@NotNull()
	@RParam(rParamName = "p_dominio_reg")
	private String dominio_reg;

	@NotNull()
	@RParam(rParamName = "p_codigo_reg")
	private String codigo_reg;

	@NotNull()
	@RParam(rParamName = "p_signif_reg")
	private String signif_reg;

	@RParam(rParamName = "p_est_form")
	private String est_form;

	@RParam(rParamName = "p_id")
	private Integer id;
	
	public void setGest_d_text(String gest_d_text){
		this.gest_d_text = gest_d_text;
	}
	public String getGest_d_text(){
		return this.gest_d_text;
	}
	
	public void setDominio_reg(String dominio_reg){
		this.dominio_reg = dominio_reg;
	}
	public String getDominio_reg(){
		return this.dominio_reg;
	}
	
	public void setCodigo_reg(String codigo_reg){
		this.codigo_reg = codigo_reg;
	}
	public String getCodigo_reg(){
		return this.codigo_reg;
	}
	
	public void setSignif_reg(String signif_reg){
		this.signif_reg = signif_reg;
	}
	public String getSignif_reg(){
		return this.signif_reg;
	}
	
	public void setEst_form(String est_form){
		this.est_form = est_form;
	}
	public String getEst_form(){
		return this.est_form;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}



}
