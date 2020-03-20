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
@Table(name="poser_tp_color",schema="poser")
@NamedQuery(name="PoserTpColor.findAll", query="SELECT b FROM PoserTpColor b")
public class PoserTpColor extends BaseActiveRecord<PoserTpColor> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="descricao",nullable=true,length=250)
	private String descricao;
	@Column(name="estado",nullable=true,length=50)
	private String estado;
	@Column(name="hexa_color",nullable=true,length=250)
	private String hexaColor;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getHexaColor() {
		return hexaColor;
	}
	public void setHexaColor(String hexaColor) {
		this.hexaColor = hexaColor;
	}
}