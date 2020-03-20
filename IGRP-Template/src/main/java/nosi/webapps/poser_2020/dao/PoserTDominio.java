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
@Table(name="poser_t_dominio",schema="poser")
@NamedQuery(name="PoserTDominio.findAll", query="SELECT b FROM PoserTDominio b")
public class PoserTDominio extends BaseActiveRecord<PoserTDominio> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="rv_low_value",nullable=true,length=100)
	private String rvLowValue;
	@Column(name="rv_domain",nullable=true,length=100)
	private String rvDomain;
	@Column(name="estado",nullable=true,length=2)
	private String estado;
	@Column(name="rv_meaning",nullable=true,length=100)
	private String rvMeaning;
	@Column(name="rv_order",nullable=true,length=11)
	private Integer rvOrder;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRvLowValue() {
		return rvLowValue;
	}
	public void setRvLowValue(String rvLowValue) {
		this.rvLowValue = rvLowValue;
	}
	public String getRvDomain() {
		return rvDomain;
	}
	public void setRvDomain(String rvDomain) {
		this.rvDomain = rvDomain;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRvMeaning() {
		return rvMeaning;
	}
	public void setRvMeaning(String rvMeaning) {
		this.rvMeaning = rvMeaning;
	}
	public Integer getRvOrder() {
		return rvOrder;
	}
	public void setRvOrder(Integer rvOrder) {
		this.rvOrder = rvOrder;
	}
}