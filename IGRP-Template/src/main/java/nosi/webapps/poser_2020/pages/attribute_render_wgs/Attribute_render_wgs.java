package nosi.webapps.poser_2020.pages.attribute_render_wgs;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Attribute_render_wgs extends Model{		

	@RParam(rParamName = "p_attribute_render_text")
	private String attribute_render_text;

	@RParam(rParamName = "p_layer")
	private Integer layer;

	@RParam(rParamName = "p_operador")
	private String operador;

	@NotNull()
	@RParam(rParamName = "p_label")
	private String label;

	@RParam(rParamName = "p_valor")
	private String valor;

	@RParam(rParamName = "p_cor")
	private String cor;

	@NotNull()
	@RParam(rParamName = "p_campo")
	private String campo;

	@RParam(rParamName = "p_id")
	private String id;
	
	public void setAttribute_render_text(String attribute_render_text){
		this.attribute_render_text = attribute_render_text;
	}
	public String getAttribute_render_text(){
		return this.attribute_render_text;
	}
	
	public void setLayer(Integer layer){
		this.layer = layer;
	}
	public Integer getLayer(){
		return this.layer;
	}
	
	public void setOperador(String operador){
		this.operador = operador;
	}
	public String getOperador(){
		return this.operador;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	public String getLabel(){
		return this.label;
	}
	
	public void setValor(String valor){
		this.valor = valor;
	}
	public String getValor(){
		return this.valor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	public String getCor(){
		return this.cor;
	}
	
	public void setCampo(String campo){
		this.campo = campo;
	}
	public String getCampo(){
		return this.campo;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}



}
