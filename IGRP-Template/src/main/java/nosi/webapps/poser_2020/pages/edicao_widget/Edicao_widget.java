package nosi.webapps.poser_2020.pages.edicao_widget;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Edicao_widget extends Model{		

	@RParam(rParamName = "p_wdg_edicao_text")
	private String wdg_edicao_text;

	@RParam(rParamName = "p_layer_edi")
	private Integer layer_edi;

	@RParam(rParamName = "p_procedimento")
	private String procedimento;

	@RParam(rParamName = "p_id")
	private Integer id;
	
	public void setWdg_edicao_text(String wdg_edicao_text){
		this.wdg_edicao_text = wdg_edicao_text;
	}
	public String getWdg_edicao_text(){
		return this.wdg_edicao_text;
	}
	
	public void setLayer_edi(Integer layer_edi){
		this.layer_edi = layer_edi;
	}
	public Integer getLayer_edi(){
		return this.layer_edi;
	}
	
	public void setProcedimento(String procedimento){
		this.procedimento = procedimento;
	}
	public String getProcedimento(){
		return this.procedimento;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}



}
