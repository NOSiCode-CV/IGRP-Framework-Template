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
@Table(name="poser_t_map_widgets",schema="poser")
@NamedQuery(name="PoserTMapWidgets.findAll", query="SELECT b FROM PoserTMapWidgets b")
public class PoserTMapWidgets extends BaseActiveRecord<PoserTMapWidgets> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="pagina_igrp",nullable=true)
	private String paginaIgrp;
	@Column(name="nome",nullable=true)
	private String nome;
	@ManyToOne
	@JoinColumn(name="mapa_id", foreignKey=@ForeignKey(name="mapa_id"), nullable=true)
	private PoserTMapa mapaId;
	@ManyToOne
	@JoinColumn(name="widgets_id", foreignKey=@ForeignKey(name="widgets_id"), nullable=true)
	private PoserTWidgets widgetsId;
	@Column(name="ordem",nullable=true,length=131089)
	private Integer ordem;
	@Column(name="label",nullable=true,length=50)
	private String label;
	@Column(name="icon",nullable=true,length=100)
	private String icon;
	@Column(name="posicao",nullable=true,length=50)
	private String posicao;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPaginaIgrp() {
		return paginaIgrp;
	}
	public void setPaginaIgrp(String paginaIgrp) {
		this.paginaIgrp = paginaIgrp;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PoserTMapa getMapaId() {
		return mapaId;
	}
	public void setMapaId(PoserTMapa mapaId) {
		this.mapaId = mapaId;
	}
	public PoserTWidgets getWidgetsId() {
		return widgetsId;
	}
	public void setWidgetsId(PoserTWidgets widgetsId) {
		this.widgetsId = widgetsId;
	}
	//Change Integer to BigDecimal if the number is very large!
	public Integer getOrdem() {
		return ordem;
	}
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
}