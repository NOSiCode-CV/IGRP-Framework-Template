package nosi.webapps.poser_2020.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

/**
 * @author: claudina.moreira
 * 2020-03-13
*/

@Entity
@Table(name="poser_t_selection_menu",schema="poser")
@NamedQuery(name="PoserTSelectionMenu.findAll", query="SELECT b FROM PoserTSelectionMenu b")
public class PoserTSelectionMenu extends BaseActiveRecord<PoserTSelectionMenu> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="layer_id", foreignKey=@ForeignKey(name="layer_id"), nullable=true)
	private PoserTLayers layerId;
	@Column(name="tipo_pagina",nullable=true,length=50)
	private String tipoPagina;
	@Column(name="link",nullable=true,length=50)
	private String link;
	@Column(name="endereco_pag",nullable=true,length=50)
	private String enderecoPag;
	@Column(name="valores",nullable=true,length=50)
	private String valores;
	@Column(name="ordem",nullable=true,length=11)
	private Integer ordem;
	@Column(name="icon",nullable=true,length=50)
	private String icon;
	@Column(name="parametros",nullable=true,length=50)
	private String parametros;
	@Column(name="atributos",nullable=true,length=50)
	private String atributos;
	@Column(name="pagina_igrp",nullable=true,length=50)
	private String paginaIgrp;
	@ManyToOne
	@JoinColumn(name="widgets_id", foreignKey=@ForeignKey(name="widgets_id"), nullable=true)
	private PoserTMapWidgets widgetsId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public PoserTLayers getLayerId() {
		return layerId;
	}
	public void setLayerId(PoserTLayers layerId) {
		this.layerId = layerId;
	}
	public String getTipoPagina() {
		return tipoPagina;
	}
	public void setTipoPagina(String tipoPagina) {
		this.tipoPagina = tipoPagina;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getEnderecoPag() {
		return enderecoPag;
	}
	public void setEnderecoPag(String enderecoPag) {
		this.enderecoPag = enderecoPag;
	}
	public String getValores() {
		return valores;
	}
	public void setValores(String valores) {
		this.valores = valores;
	}
	public Integer getOrdem() {
		return ordem;
	}
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getParametros() {
		return parametros;
	}
	public void setParametros(String parametros) {
		this.parametros = parametros;
	}
	public String getAtributos() {
		return atributos;
	}
	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}
	public String getPaginaIgrp() {
		return paginaIgrp;
	}
	public void setPaginaIgrp(String paginaIgrp) {
		this.paginaIgrp = paginaIgrp;
	}
	public PoserTMapWidgets getWidgetsId() {
		return widgetsId;
	}
	public void setWidgetsId(PoserTMapWidgets widgetsId) {
		this.widgetsId = widgetsId;
	}
}