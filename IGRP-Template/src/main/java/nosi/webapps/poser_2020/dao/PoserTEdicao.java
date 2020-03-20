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
@Table(name="poser_t_edicao",schema="poser")
@NamedQuery(name="PoserTEdicao.findAll", query="SELECT b FROM PoserTEdicao b")
public class PoserTEdicao extends BaseActiveRecord<PoserTEdicao> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="layer_id", foreignKey=@ForeignKey(name="layer_id"), nullable=true)
	private PoserTLayers layerId;
	@Column(name="procedimento",nullable=true,length=11)
	private Integer procedimento;
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
	public Integer getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(Integer procedimento) {
		this.procedimento = procedimento;
	}
	public PoserTMapWidgets getWidgetsId() {
		return widgetsId;
	}
	public void setWidgetsId(PoserTMapWidgets widgetsId) {
		this.widgetsId = widgetsId;
	}
}