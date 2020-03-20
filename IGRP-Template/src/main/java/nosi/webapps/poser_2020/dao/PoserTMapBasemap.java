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
@Table(name="poser_t_map_basemap",schema="poser")
@NamedQuery(name="PoserTMapBasemap.findAll", query="SELECT b FROM PoserTMapBasemap b")
public class PoserTMapBasemap extends BaseActiveRecord<PoserTMapBasemap> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="id_basemap", foreignKey=@ForeignKey(name="id_basemap"), nullable=true)
	private PoserParBasemap idBasemap;
	@ManyToOne
	@JoinColumn(name="id_mapa", foreignKey=@ForeignKey(name="id_mapa"), nullable=true)
	private PoserTMapa idMapa;
	@Column(name="nome",nullable=true)
	private String nome;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public PoserParBasemap getIdBasemap() {
		return idBasemap;
	}
	public void setIdBasemap(PoserParBasemap idBasemap) {
		this.idBasemap = idBasemap;
	}
	public PoserTMapa getIdMapa() {
		return idMapa;
	}
	public void setIdMapa(PoserTMapa idMapa) {
		this.idMapa = idMapa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}