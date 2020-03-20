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
@Table(name="poser_par_basemap",schema="poser")
@NamedQuery(name="PoserParBasemap.findAll", query="SELECT b FROM PoserParBasemap b")
public class PoserParBasemap extends BaseActiveRecord<PoserParBasemap> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="code",nullable=true,length=255)
	private String code;
	@Column(name="link",nullable=true,length=255)
	private String link;
	@Column(name="mime_type",nullable=true,length=255)
	private String mimeType;
	@Column(name="nome",nullable=true,length=255)
	private String nome;
	@Column(name="origem",nullable=true,length=255)
	private String origem;
	@Column(name="origem_id",nullable=true,length=20)
	private Integer origemId;
	@Column(name="estado",nullable=true)
	private String estado;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	//Change Integer to BigDecimal if the number is very large!
	public Integer getOrigemId() {
		return origemId;
	}
	public void setOrigemId(Integer origemId) {
		this.origemId = origemId;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}