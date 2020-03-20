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
 * 2020-03-16
*/

@Entity
@Table(name="poser_t_mapa",schema="poser")
@NamedQuery(name="PoserTMapa.findAll", query="SELECT b FROM PoserTMapa b")
public class PoserTMapa extends BaseActiveRecord<PoserTMapa> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="code_aplicacao",nullable=true,length=20)
	private Integer codeAplicacao;
	@Column(name="code_map",nullable=true,length=255)
	private String codeMap;
	@Column(name="estado",nullable=true,length=255)
	private String estado;
	@Column(name="tituli_mapa",nullable=true,length=255)
	private String tituliMapa;
	@Column(name="url",nullable=true,length=2000)
	private String url;
	@ManyToOne
	@JoinColumn(name="id_framing", foreignKey=@ForeignKey(name="id_framing"), nullable=true)
	private PoserTFraming idFraming;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//Change Integer to BigDecimal if the number is very large!
	public Integer getCodeAplicacao() {
		return codeAplicacao;
	}
	public void setCodeAplicacao(Integer codeAplicacao) {
		this.codeAplicacao = codeAplicacao;
	}
	public String getCodeMap() {
		return codeMap;
	}
	public void setCodeMap(String codeMap) {
		this.codeMap = codeMap;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTituliMapa() {
		return tituliMapa;
	}
	public void setTituliMapa(String tituliMapa) {
		this.tituliMapa = tituliMapa;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public PoserTFraming getIdFraming() {
		return idFraming;
	}
	public void setIdFraming(PoserTFraming idFraming) {
		this.idFraming = idFraming;
	}
}