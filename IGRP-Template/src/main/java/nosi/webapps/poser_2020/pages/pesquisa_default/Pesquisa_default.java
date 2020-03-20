package nosi.webapps.poser_2020.pages.pesquisa_default;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Pesquisa_default extends Model{		

	@RParam(rParamName = "p_pes_default_wdg_text")
	private String pes_default_wdg_text;

	@RParam(rParamName = "p_layer_pd_wdg")
	private Integer layer_pd_wdg;

	@RParam(rParamName = "p_campo_pes")
	private String campo_pes;

	@RParam(rParamName = "p_id")
	private Integer id;
	
	public void setPes_default_wdg_text(String pes_default_wdg_text){
		this.pes_default_wdg_text = pes_default_wdg_text;
	}
	public String getPes_default_wdg_text(){
		return this.pes_default_wdg_text;
	}
	
	public void setLayer_pd_wdg(Integer layer_pd_wdg){
		this.layer_pd_wdg = layer_pd_wdg;
	}
	public Integer getLayer_pd_wdg(){
		return this.layer_pd_wdg;
	}
	
	public void setCampo_pes(String campo_pes){
		this.campo_pes = campo_pes;
	}
	public String getCampo_pes(){
		return this.campo_pes;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}



}
