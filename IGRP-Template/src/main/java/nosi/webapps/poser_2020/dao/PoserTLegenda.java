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
@Table(name="poser_t_legenda",schema="poser")
@NamedQuery(name="PoserTLegenda.findAll", query="SELECT b FROM PoserTLegenda b")
public class PoserTLegenda extends BaseActiveRecord<PoserTLegenda> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="nome_leg",nullable=true,length=50)
	private String nomeLeg;
	@ManyToOne
	@JoinColumn(name="layer_id", foreignKey=@ForeignKey(name="layer_id"), nullable=true)
	private PoserTLayers layerId;
	@Column(name="estado",nullable=true,length=2)
	private String estado;
	@Column(name="utilizador_id",nullable=true,length=11)
	private Integer utilizadorId;
	@ManyToOne
	@JoinColumn(name="widgets_id", foreignKey=@ForeignKey(name="widgets_id"), nullable=true)
	private PoserTMapWidgets widgetsId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeLeg() {
		return nomeLeg;
	}
	public void setNomeLeg(String nomeLeg) {
		this.nomeLeg = nomeLeg;
	}
	public PoserTLayers getLayerId() {
		return layerId;
	}
	public void setLayerId(PoserTLayers layerId) {
		this.layerId = layerId;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getUtilizadorId() {
		return utilizadorId;
	}
	public void setUtilizadorId(Integer utilizadorId) {
		this.utilizadorId = utilizadorId;
	}
	public PoserTMapWidgets getWidgetsId() {
		return widgetsId;
	}
	public void setWidgetsId(PoserTMapWidgets widgetsId) {
		this.widgetsId = widgetsId;
	}
}