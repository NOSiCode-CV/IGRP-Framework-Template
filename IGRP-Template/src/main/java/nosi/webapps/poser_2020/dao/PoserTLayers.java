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
@Table(name="poser_t_layers",schema="poser")
@NamedQuery(name="PoserTLayers.findAll", query="SELECT b FROM PoserTLayers b")
public class PoserTLayers extends BaseActiveRecord<PoserTLayers> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="code",nullable=true,length=255)
	private String code;
	@Column(name="estado",nullable=true,length=255)
	private String estado;
	@Column(name="nome",nullable=true,length=255)
	private String nome;
	@Column(name="url",nullable=true,length=2000)
	private String url;
	@Column(name="visivel",nullable=true,length=11)
	private Integer visivel;
	@Column(name="schema",nullable=true,length=255)
	private String schema;
	@Column(name="tabela",nullable=true,length=255)
	private String tabela;
	@Column(name="tipo",nullable=true,length=255)
	private String tipo;
	@Column(name="codigo",nullable=true)
	private String codigo;
	@Column(name="type_name",nullable=true,length=255)
	private String typeName;
	@Column(name="layers",nullable=true,length=255)
	private String layers;
	@Column(name="output_format",nullable=true,length=255)
	private String outputFormat;
	@Column(name="id_tp_color",nullable=true,length=11)
	private Integer idTpColor;
	@Column(name="parametro",nullable=true,length=255)
	private String parametro;
	@Column(name="valor",nullable=true,length=255)
	private String valor;
	@ManyToOne
	@JoinColumn(name="id_par_tp_servico", foreignKey=@ForeignKey(name="id_par_tp_servico"), nullable=true)
	private PoserParamTpServico idParTpServico;

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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getVisivel() {
		return visivel;
	}
	public void setVisivel(Integer visivel) {
		this.visivel = visivel;
	}
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getTabela() {
		return tabela;
	}
	public void setTabela(String tabela) {
		this.tabela = tabela;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getLayers() {
		return layers;
	}
	public void setLayers(String layers) {
		this.layers = layers;
	}
	public String getOutputFormat() {
		return outputFormat;
	}
	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	public Integer getIdTpColor() {
		return idTpColor;
	}
	public void setIdTpColor(Integer idTpColor) {
		this.idTpColor = idTpColor;
	}
	public String getParametro() {
		return parametro;
	}
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public PoserParamTpServico getIdParTpServico() {
		return idParTpServico;
	}
	public void setIdParTpServico(PoserParamTpServico idParTpServico) {
		this.idParTpServico = idParTpServico;
	}
}