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
@Table(name="poser_t_framing",schema="poser")
@NamedQuery(name="PoserTFraming.findAll", query="SELECT b FROM PoserTFraming b")
public class PoserTFraming extends BaseActiveRecord<PoserTFraming> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="c_latitude",nullable=true,length=255)
	private String cLatitude;
	@Column(name="c_longitude",nullable=true,length=255)
	private String cLongitude;
	@Column(name="estado",nullable=true,length=255)
	private String estado;
	@Column(name="nome",nullable=true,length=100)
	private String nome;
	@Column(name="zoom",nullable=true,length=21)
	private Integer zoom;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCLatitude() {
		return cLatitude;
	}
	public void setCLatitude(String cLatitude) {
		this.cLatitude = cLatitude;
	}
	public String getCLongitude() {
		return cLongitude;
	}
	public void setCLongitude(String cLongitude) {
		this.cLongitude = cLongitude;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Change Integer to BigDecimal if the number is very large!
	public Integer getZoom() {
		return zoom;
	}
	public void setZoom(Integer zoom) {
		this.zoom = zoom;
	}
}