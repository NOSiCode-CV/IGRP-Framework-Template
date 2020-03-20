package nosi.webapps.poser_2020.pages.lst_widg_form;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lst_widg_form extends Model{		

	@RParam(rParamName = "p_lst_wdg_text")
	private String lst_wdg_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setLst_wdg_text(String lst_wdg_text){
		this.lst_wdg_text = lst_wdg_text;
	}
	public String getLst_wdg_text(){
		return this.lst_wdg_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String nome_lst;
		private String tooltip_lst;
		private String posicao_lst;
		private String id;
		public void setNome_lst(String nome_lst){
			this.nome_lst = nome_lst;
		}
		public String getNome_lst(){
			return this.nome_lst;
		}

		public void setTooltip_lst(String tooltip_lst){
			this.tooltip_lst = tooltip_lst;
		}
		public String getTooltip_lst(){
			return this.tooltip_lst;
		}

		public void setPosicao_lst(String posicao_lst){
			this.posicao_lst = posicao_lst;
		}
		public String getPosicao_lst(){
			return this.posicao_lst;
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
