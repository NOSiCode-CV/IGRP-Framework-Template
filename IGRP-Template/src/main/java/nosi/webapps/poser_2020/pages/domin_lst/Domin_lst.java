package nosi.webapps.poser_2020.pages.domin_lst;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Domin_lst extends Model{		

	@RParam(rParamName = "p_ls_dom_text")
	private String ls_dom_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setLs_dom_text(String ls_dom_text){
		this.ls_dom_text = ls_dom_text;
	}
	public String getLs_dom_text(){
		return this.ls_dom_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String dom_lst;
		private String codigo_lst;
		private String significado_lst;
		private String id;
		private String teste;
		public void setDom_lst(String dom_lst){
			this.dom_lst = dom_lst;
		}
		public String getDom_lst(){
			return this.dom_lst;
		}

		public void setCodigo_lst(String codigo_lst){
			this.codigo_lst = codigo_lst;
		}
		public String getCodigo_lst(){
			return this.codigo_lst;
		}

		public void setSignificado_lst(String significado_lst){
			this.significado_lst = significado_lst;
		}
		public String getSignificado_lst(){
			return this.significado_lst;
		}

		public void setId(String id){
			this.id = id;
		}
		public String getId(){
			return this.id;
		}

		public void setTeste(String teste){
			this.teste = teste;
		}
		public String getTeste(){
			return this.teste;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
