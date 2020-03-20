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
@Table(name="poser_t_layer_map",schema="poser")
@NamedQuery(name="PoserTLayerMap.findAll", query="SELECT b FROM PoserTLayerMap b")
public class PoserTLayerMap extends BaseActiveRecord<PoserTLayerMap> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="cache",nullable=true,length=255)
	private String cache;
	@Column(name="label",nullable=true,length=255)
	private String label;
	@Column(name="ordem",nullable=true,length=19)
	private String ordem;
	@Column(name="visivel",nullable=true,length=255)
	private String visivel;
	@ManyToOne
	@JoinColumn(name="layer_id", foreignKey=@ForeignKey(name="layer_id"), nullable=true)
	private PoserTLayers layerId;
	@ManyToOne
	@JoinColumn(name="mapa_id", foreignKey=@ForeignKey(name="mapa_id"), nullable=true)
	private PoserTMapa mapaId;
	@Column(name="nome",nullable=true,length=50)
	private String nome;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCache() {
		return cache;
	}
	public void setCache(String cache) {
		this.cache = cache;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	public String getVisivel() {
		return visivel;
	}
	public void setVisivel(String visivel) {
		this.visivel = visivel;
	}
	public PoserTLayers getLayerId() {
		return layerId;
	}
	public void setLayerId(PoserTLayers layerId) {
		this.layerId = layerId;
	}
	public PoserTMapa getMapaId() {
		return mapaId;
	}
	public void setMapaId(PoserTMapa mapaId) {
		this.mapaId = mapaId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}