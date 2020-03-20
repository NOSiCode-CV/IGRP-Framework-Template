package nosi.webapps.poser_2020.pages.associar_layer;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Associar_layer extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_lista_de_layer")
	private String lista_de_layer;

	@RParam(rParamName = "p_associar_layer")
	private String associar_layer;

	@RParam(rParamName = "p_layers")
	private Integer layers;

	@RParam(rParamName = "p_label")
	private String label;

	@RParam(rParamName = "p_ordem")
	private Integer ordem;

	@RParam(rParamName = "p_id_layer")
	private Integer id_layer;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setLista_de_layer(String lista_de_layer){
		this.lista_de_layer = lista_de_layer;
	}
	public String getLista_de_layer(){
		return this.lista_de_layer;
	}
	
	public void setAssociar_layer(String associar_layer){
		this.associar_layer = associar_layer;
	}
	public String getAssociar_layer(){
		return this.associar_layer;
	}
	
	public void setLayers(Integer layers){
		this.layers = layers;
	}
	public Integer getLayers(){
		return this.layers;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	public String getLabel(){
		return this.label;
	}
	
	public void setOrdem(Integer ordem){
		this.ordem = ordem;
	}
	public Integer getOrdem(){
		return this.ordem;
	}
	
	public void setId_layer(Integer id_layer){
		this.id_layer = id_layer;
	}
	public Integer getId_layer(){
		return this.id_layer;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String layers_ls;
		private String ordem_ls;
		private String label_ls;
		private String id;
		public void setLayers_ls(String layers_ls){
			this.layers_ls = layers_ls;
		}
		public String getLayers_ls(){
			return this.layers_ls;
		}

		public void setOrdem_ls(String ordem_ls){
			this.ordem_ls = ordem_ls;
		}
		public String getOrdem_ls(){
			return this.ordem_ls;
		}

		public void setLabel_ls(String label_ls){
			this.label_ls = label_ls;
		}
		public String getLabel_ls(){
			return this.label_ls;
		}

		public void setId(String id){
			this.id = id;
		}
		public String getId(){
			return this.id;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
