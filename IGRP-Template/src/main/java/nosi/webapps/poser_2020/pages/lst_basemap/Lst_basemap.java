package nosi.webapps.poser_2020.pages.lst_basemap;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lst_basemap extends Model{		

	@RParam(rParamName = "p_lst_bm_text")
	private String lst_bm_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setLst_bm_text(String lst_bm_text){
		this.lst_bm_text = lst_bm_text;
	}
	public String getLst_bm_text(){
		return this.lst_bm_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String nom_lst;
		private String codi_lst;
		private String link_lst;
		private Integer id;
		public void setNom_lst(String nom_lst){
			this.nom_lst = nom_lst;
		}
		public String getNom_lst(){
			return this.nom_lst;
		}

		public void setCodi_lst(String codi_lst){
			this.codi_lst = codi_lst;
		}
		public String getCodi_lst(){
			return this.codi_lst;
		}

		public void setLink_lst(String link_lst){
			this.link_lst = link_lst;
		}
		public String getLink_lst(){
			return this.link_lst;
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
