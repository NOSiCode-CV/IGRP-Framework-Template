package nosi.webapps.poser_2020.pages.mapas_lst;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Mapas_lst extends Model{		

	@RParam(rParamName = "p_mapas_lst_flt_text")
	private String mapas_lst_flt_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setMapas_lst_flt_text(String mapas_lst_flt_text){
		this.mapas_lst_flt_text = mapas_lst_flt_text;
	}
	public String getMapas_lst_flt_text(){
		return this.mapas_lst_flt_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String titulo_mapa_lst;
		private String codigo_mapa_lst;
		private String enquadramento;
		private Integer id;
		public void setTitulo_mapa_lst(String titulo_mapa_lst){
			this.titulo_mapa_lst = titulo_mapa_lst;
		}
		public String getTitulo_mapa_lst(){
			return this.titulo_mapa_lst;
		}

		public void setCodigo_mapa_lst(String codigo_mapa_lst){
			this.codigo_mapa_lst = codigo_mapa_lst;
		}
		public String getCodigo_mapa_lst(){
			return this.codigo_mapa_lst;
		}

		public void setEnquadramento(String enquadramento){
			this.enquadramento = enquadramento;
		}
		public String getEnquadramento(){
			return this.enquadramento;
		}

		public void setId(Integer id){
			this.id = id;
		}
		public Integer getId(){
			return this.id;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
