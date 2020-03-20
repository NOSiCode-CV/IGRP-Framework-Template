package nosi.webapps.poser_2020.pages.basemapform;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Basemapform extends Model{		

	@RParam(rParamName = "p_form_bm_text")
	private String form_bm_text;

	@RParam(rParamName = "p_nome_bs")
	private String nome_bs;

	@NotNull()
	@RParam(rParamName = "p_cod_bm")
	private String cod_bm;

	@RParam(rParamName = "p_link_bs")
	private String link_bs;

	@RParam(rParamName = "p_zoom_enq")
	private Integer zoom_enq;

	@RParam(rParamName = "p_id")
	private String id;
	
	public void setForm_bm_text(String form_bm_text){
		this.form_bm_text = form_bm_text;
	}
	public String getForm_bm_text(){
		return this.form_bm_text;
	}
	
	public void setNome_bs(String nome_bs){
		this.nome_bs = nome_bs;
	}
	public String getNome_bs(){
		return this.nome_bs;
	}
	
	public void setCod_bm(String cod_bm){
		this.cod_bm = cod_bm;
	}
	public String getCod_bm(){
		return this.cod_bm;
	}
	
	public void setLink_bs(String link_bs){
		this.link_bs = link_bs;
	}
	public String getLink_bs(){
		return this.link_bs;
	}
	
	public void setZoom_enq(Integer zoom_enq){
		this.zoom_enq = zoom_enq;
	}
	public Integer getZoom_enq(){
		return this.zoom_enq;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}



}
