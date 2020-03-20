package nosi.webapps.poser_2020.pages.selection_menu_wgs;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Selection_menu_wgs extends Model{		

	@RParam(rParamName = "p_selection_menu_text")
	private String selection_menu_text;

	@RParam(rParamName = "p_layer")
	private Integer layer;

	@RParam(rParamName = "p_tipo_de_pagina")
	private String tipo_de_pagina;

	@RParam(rParamName = "p_target")
	private String target;

	@RParam(rParamName = "p_endereco_de_pagina")
	private String endereco_de_pagina;

	@NotNull()
	@RParam(rParamName = "p_label")
	private String label;

	@RParam(rParamName = "p_valores")
	private String valores;

	@RParam(rParamName = "p_link_wdg")
	private String link_wdg;

	@RParam(rParamName = "p_pagina_igrp")
	private String pagina_igrp;

	@RParam(rParamName = "p_ordem")
	private String ordem;

	@RParam(rParamName = "p_icon")
	private String icon;

	@RParam(rParamName = "p_parametros")
	private String parametros;

	@RParam(rParamName = "p_atributos")
	private String atributos;

	@RParam(rParamName = "p_id")
	private String id;
	
	public void setSelection_menu_text(String selection_menu_text){
		this.selection_menu_text = selection_menu_text;
	}
	public String getSelection_menu_text(){
		return this.selection_menu_text;
	}
	
	public void setLayer(Integer layer){
		this.layer = layer;
	}
	public Integer getLayer(){
		return this.layer;
	}
	
	public void setTipo_de_pagina(String tipo_de_pagina){
		this.tipo_de_pagina = tipo_de_pagina;
	}
	public String getTipo_de_pagina(){
		return this.tipo_de_pagina;
	}
	
	public void setTarget(String target){
		this.target = target;
	}
	public String getTarget(){
		return this.target;
	}
	
	public void setEndereco_de_pagina(String endereco_de_pagina){
		this.endereco_de_pagina = endereco_de_pagina;
	}
	public String getEndereco_de_pagina(){
		return this.endereco_de_pagina;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	public String getLabel(){
		return this.label;
	}
	
	public void setValores(String valores){
		this.valores = valores;
	}
	public String getValores(){
		return this.valores;
	}
	
	public void setLink_wdg(String link_wdg){
		this.link_wdg = link_wdg;
	}
	public String getLink_wdg(){
		return this.link_wdg;
	}
	
	public void setPagina_igrp(String pagina_igrp){
		this.pagina_igrp = pagina_igrp;
	}
	public String getPagina_igrp(){
		return this.pagina_igrp;
	}
	
	public void setOrdem(String ordem){
		this.ordem = ordem;
	}
	public String getOrdem(){
		return this.ordem;
	}
	
	public void setIcon(String icon){
		this.icon = icon;
	}
	public String getIcon(){
		return this.icon;
	}
	
	public void setParametros(String parametros){
		this.parametros = parametros;
	}
	public String getParametros(){
		return this.parametros;
	}
	
	public void setAtributos(String atributos){
		this.atributos = atributos;
	}
	public String getAtributos(){
		return this.atributos;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}



}
