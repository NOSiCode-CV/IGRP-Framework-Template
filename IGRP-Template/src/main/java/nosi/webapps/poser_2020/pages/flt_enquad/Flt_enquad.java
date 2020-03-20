package nosi.webapps.poser_2020.pages.flt_enquad;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Flt_enquad extends Model{		

	@RParam(rParamName = "p_flt_enq_text")
	private String flt_enq_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setFlt_enq_text(String flt_enq_text){
		this.flt_enq_text = flt_enq_text;
	}
	public String getFlt_enq_text(){
		return this.flt_enq_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String nome_lst_enq;
		private String c_latitude_flt;
		private String c_long_ls;
		private String zoom_lst;
		private String id;
		private String teste;
		public void setNome_lst_enq(String nome_lst_enq){
			this.nome_lst_enq = nome_lst_enq;
		}
		public String getNome_lst_enq(){
			return this.nome_lst_enq;
		}

		public void setC_latitude_flt(String c_latitude_flt){
			this.c_latitude_flt = c_latitude_flt;
		}
		public String getC_latitude_flt(){
			return this.c_latitude_flt;
		}

		public void setC_long_ls(String c_long_ls){
			this.c_long_ls = c_long_ls;
		}
		public String getC_long_ls(){
			return this.c_long_ls;
		}

		public void setZoom_lst(String zoom_lst){
			this.zoom_lst = zoom_lst;
		}
		public String getZoom_lst(){
			return this.zoom_lst;
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
