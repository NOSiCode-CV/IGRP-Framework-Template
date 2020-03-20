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
@Table(name="poser_param_tp_servico",schema="poser")
@NamedQuery(name="PoserParamTpServico.findAll", query="SELECT b FROM PoserParamTpServico b")
public class PoserParamTpServico extends BaseActiveRecord<PoserParamTpServico> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="estado",nullable=true,length=255)
	private String estado;
	@Column(name="parametro",nullable=true,length=255)
	private String parametro;
	@Column(name="tipo",nullable=true,length=255)
	private String tipo;
	@Column(name="valor",nullable=true,length=255)
	private String valor;
	@ManyToOne
	@JoinColumn(name="id_layers", foreignKey=@ForeignKey(name="layers_id"), nullable=true)
	private PoserTLayers idLayers;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getParametro() {
		return parametro;
	}
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public PoserTLayers getIdLayers() {
		return idLayers;
	}
	public void setIdLayers(PoserTLayers idLayers) {
		this.idLayers = idLayers;
	}
}