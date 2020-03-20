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

/**
 * @author: claudina.moreira
 * 2020-03-13
*/

@Entity
@Table(name="poser_t_widgets",schema="poser")
@NamedQuery(name="PoserTWidgets.findAll", query="SELECT b FROM PoserTWidgets b")
public class PoserTWidgets extends BaseActiveRecord<PoserTWidgets> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="aplicacao",nullable=true,length=255)
	private String aplicacao;
	@Column(name="estado",nullable=true,length=255)
	private String estado;
	@Column(name="icon",nullable=true,length=255)
	private String icon;
	@Column(name="label",nullable=true,length=255)
	private String label;
	@Column(name="nome",nullable=true,length=255)
	private String nome;
	@Column(name="pagina_igrp",nullable=true,length=255)
	private String paginaIgrp;
	@Column(name="posicao",nullable=true,length=255)
	private String posicao;
	@Column(name="tooltip",nullable=true,length=255)
	private String tooltip;
	@Column(name="xml",nullable=true,length=255)
	private String xml;
	@Column(name="xml_default",nullable=true,length=255)
	private String xmlDefault;
	@Column(name="xml_proc",nullable=true,length=255)
	private String xmlProc;
	@Column(name="ordem",nullable=true,length=255)
	private String ordem;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPaginaIgrp() {
		return paginaIgrp;
	}
	public void setPaginaIgrp(String paginaIgrp) {
		this.paginaIgrp = paginaIgrp;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getTooltip() {
		return tooltip;
	}
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}
	public String getXmlDefault() {
		return xmlDefault;
	}
	public void setXmlDefault(String xmlDefault) {
		this.xmlDefault = xmlDefault;
	}
	public String getXmlProc() {
		return xmlProc;
	}
	public void setXmlProc(String xmlProc) {
		this.xmlProc = xmlProc;
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
}