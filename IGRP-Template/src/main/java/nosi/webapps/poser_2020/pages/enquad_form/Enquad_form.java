package nosi.webapps.poser_2020.pages.enquad_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Enquad_form extends Model{		

	@RParam(rParamName = "p_tt_eng_text")
	private String tt_eng_text;

	@NotNull()
	@RParam(rParamName = "p_nome_enq")
	private String nome_enq;

	@RParam(rParamName = "p_c_latitude")
	private String c_latitude;

	@RParam(rParamName = "p_c_longitude")
	private String c_longitude;

	@RParam(rParamName = "p_zoom_enq")
	private String zoom_enq;

	@RParam(rParamName = "p_id")
	private String id;
	
	public void setTt_eng_text(String tt_eng_text){
		this.tt_eng_text = tt_eng_text;
	}
	public String getTt_eng_text(){
		return this.tt_eng_text;
	}
	
	public void setNome_enq(String nome_enq){
		this.nome_enq = nome_enq;
	}
	public String getNome_enq(){
		return this.nome_enq;
	}
	
	public void setC_latitude(String c_latitude){
		this.c_latitude = c_latitude;
	}
	public String getC_latitude(){
		return this.c_latitude;
	}
	
	public void setC_longitude(String c_longitude){
		this.c_longitude = c_longitude;
	}
	public String getC_longitude(){
		return this.c_longitude;
	}
	
	public void setZoom_enq(String zoom_enq){
		this.zoom_enq = zoom_enq;
	}
	public String getZoom_enq(){
		return this.zoom_enq;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}



}
