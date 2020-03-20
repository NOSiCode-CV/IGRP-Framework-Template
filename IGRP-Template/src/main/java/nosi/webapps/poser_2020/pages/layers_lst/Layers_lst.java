package nosi.webapps.poser_2020.pages.layers_lst;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

import nosi.core.validator.constraints.*;

public class Layers_lst extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_nome_layer_flt")
	private String nome_layer_flt;

	@RParam(rParamName = "p_tipo_servico_lst")
	private String tipo_servico_lst;
	
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
	
	public void setNome_layer_flt(String nome_layer_flt){
		this.nome_layer_flt = nome_layer_flt;
	}
	public String getNome_layer_flt(){
		return this.nome_layer_flt;
	}
	
	public void setTipo_servico_lst(String tipo_servico_lst){
		this.tipo_servico_lst = tipo_servico_lst;
	}
	public String getTipo_servico_lst(){
		return this.tipo_servico_lst;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String nome_layer_lst;
		private String codigo_layer_lst;
		private String tp_layer_lst;
		private String url_layer_lst;
		private String id;
		public void setNome_layer_lst(String nome_layer_lst){
			this.nome_layer_lst = nome_layer_lst;
		}
		public String getNome_layer_lst(){
			return this.nome_layer_lst;
		}

		public void setCodigo_layer_lst(String codigo_layer_lst){
			this.codigo_layer_lst = codigo_layer_lst;
		}
		public String getCodigo_layer_lst(){
			return this.codigo_layer_lst;
		}

		public void setTp_layer_lst(String tp_layer_lst){
			this.tp_layer_lst = tp_layer_lst;
		}
		public String getTp_layer_lst(){
			return this.tp_layer_lst;
		}

		public void setUrl_layer_lst(String url_layer_lst){
			this.url_layer_lst = url_layer_lst;
		}
		public String getUrl_layer_lst(){
			return this.url_layer_lst;
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
