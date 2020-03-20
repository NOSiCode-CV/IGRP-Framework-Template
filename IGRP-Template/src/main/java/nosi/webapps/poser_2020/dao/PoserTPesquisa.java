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
@Table(name="poser_t_pesquisa",schema="poser")
@NamedQuery(name="PoserTPesquisa.findAll", query="SELECT b FROM PoserTPesquisa b")
public class PoserTPesquisa extends BaseActiveRecord<PoserTPesquisa> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="layer_id", foreignKey=@ForeignKey(name="layer_id"), nullable=true)
	private PoserTLayers layerId;
	@Column(name="campo",nullable=true)
	private String campo;
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
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public PoserTMapWidgets getWidgetsId() {
		return widgetsId;
	}
	public void setWidgetsId(PoserTMapWidgets widgetsId) {
		this.widgetsId = widgetsId;
	}
}