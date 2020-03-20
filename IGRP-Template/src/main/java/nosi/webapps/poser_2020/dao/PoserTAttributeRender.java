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
@Table(name="poser_t_attribute_render",schema="poser")
@NamedQuery(name="PoserTAttributeRender.findAll", query="SELECT b FROM PoserTAttributeRender b")
public class PoserTAttributeRender extends BaseActiveRecord<PoserTAttributeRender> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="descricao",nullable=true)
	private String descricao;
	@Column(name="estado",nullable=true)
	private String estado;
	@Column(name="hexa_color",nullable=true,length=50)
	private String hexaColor;
	@ManyToOne
	@JoinColumn(name="layer_id", foreignKey=@ForeignKey(name="layer_id"), nullable=true)
	private PoserTLayers layerId;
	@Column(name="operador",nullable=true,length=5)
	private String operador;
	@Column(name="campo",nullable=true,length=50)
	private String campo;
	@Column(name="valor",nullable=true,length=50)
	private String valor;
	@ManyToOne
	@JoinColumn(name="widgets_id", foreignKey=@ForeignKey(name="widgest_id"), nullable=true)
	private PoserTWidgets widgetsId;
	@Column(name="label",nullable=true,length=1)
	private String label;

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
	public PoserTLayers getLayerId() {
		return layerId;
	}
	public void setLayerId(PoserTLayers layerId) {
		this.layerId = layerId;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public PoserTWidgets getWidgetsId() {
		return widgetsId;
	}
	public void setWidgetsId(PoserTWidgets widgetsId) {
		this.widgetsId = widgetsId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}