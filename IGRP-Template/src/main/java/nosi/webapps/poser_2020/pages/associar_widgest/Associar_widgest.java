package nosi.webapps.poser_2020.pages.associar_widgest;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

import nosi.core.validator.constraints.*;

public class Associar_widgest extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_lista_de_widgest")
	private String lista_de_widgest;

	@RParam(rParamName = "p_associar_widgest")
	private String associar_widgest;

	@RParam(rParamName = "p_widgest")
	private Integer widgest;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_posicao")
	private String posicao;

	@RParam(rParamName = "p_icone")
	private String icone;

	@RParam(rParamName = "p_ordem")
	private Integer ordem;

	@RParam(rParamName = "p_tooltip")
	private String tooltip;
	
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
	
	public void setLista_de_widgest(String lista_de_widgest){
		this.lista_de_widgest = lista_de_widgest;
	}
	public String getLista_de_widgest(){
		return this.lista_de_widgest;
	}
	
	public void setAssociar_widgest(String associar_widgest){
		this.associar_widgest = associar_widgest;
	}
	public String getAssociar_widgest(){
		return this.associar_widgest;
	}
	
	public void setWidgest(Integer widgest){
		this.widgest = widgest;
	}
	public Integer getWidgest(){
		return this.widgest;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setPosicao(String posicao){
		this.posicao = posicao;
	}
	public String getPosicao(){
		return this.posicao;
	}
	
	public void setIcone(String icone){
		this.icone = icone;
	}
	public String getIcone(){
		return this.icone;
	}
	
	public void setOrdem(Integer ordem){
		this.ordem = ordem;
	}
	public Integer getOrdem(){
		return this.ordem;
	}
	
	public void setTooltip(String tooltip){
		this.tooltip = tooltip;
	}
	public String getTooltip(){
		return this.tooltip;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String widgest_ls;
		private String nome_ls;
		private String posicao_ls;
		private Integer ordem_ls;
		private String tooltip_ls;
		private String id;
		public void setWidgest_ls(String widgest_ls){
			this.widgest_ls = widgest_ls;
		}
		public String getWidgest_ls(){
			return this.widgest_ls;
		}

		public void setNome_ls(String nome_ls){
			this.nome_ls = nome_ls;
		}
		public String getNome_ls(){
			return this.nome_ls;
		}

		public void setPosicao_ls(String posicao_ls){
			this.posicao_ls = posicao_ls;
		}
		public String getPosicao_ls(){
			return this.posicao_ls;
		}

		public void setOrdem_ls(Integer ordem_ls){
			this.ordem_ls = ordem_ls;
		}
		public Integer getOrdem_ls(){
			return this.ordem_ls;
		}

		public void setTooltip_ls(String tooltip_ls){
			this.tooltip_ls = tooltip_ls;
		}
		public String getTooltip_ls(){
			return this.tooltip_ls;
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
