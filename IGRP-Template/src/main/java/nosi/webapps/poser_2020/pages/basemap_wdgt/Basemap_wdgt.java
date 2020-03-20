package nosi.webapps.poser_2020.pages.basemap_wdgt;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
public class Basemap_wdgt extends Model{		

	@RParam(rParamName = "p_base_wgts_text")
	private String base_wgts_text;
	
	@SeparatorList(name = Separatorlist_1.class)
	@Valid
	private List<Separatorlist_1> separatorlist_1 = new ArrayList<>();	
	public void setSeparatorlist_1(List<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public List<Separatorlist_1> getSeparatorlist_1(){
		return this.separatorlist_1;
	}
	@RParam(rParamName = "p_separatorlist_1_id")
	private String[] p_separatorlist_1_id;
	@RParam(rParamName = "p_separatorlist_1_del")
	private String[] p_separatorlist_1_del;
	@RParam(rParamName = "p_separatorlist_1_edit")
	private String[] p_separatorlist_1_edit;
	
	public void setP_separatorlist_1_id(String[] p_separatorlist_1_id){
		this.p_separatorlist_1_id = p_separatorlist_1_id;
	}
	public String[] getP_separatorlist_1_id(){
		return this.p_separatorlist_1_id;
	}
	
	public void setP_separatorlist_1_del(String[] p_separatorlist_1_del){
		this.p_separatorlist_1_del = p_separatorlist_1_del;
	}
	public String[] getP_separatorlist_1_del(){
		return this.p_separatorlist_1_del;
	}
	
	public void setP_separatorlist_1_edit(String[] p_separatorlist_1_edit){
		this.p_separatorlist_1_edit = p_separatorlist_1_edit;
	}
	public String[] getP_separatorlist_1_edit(){
		return this.p_separatorlist_1_edit;
	}
	
	public void setBase_wgts_text(String base_wgts_text){
		this.base_wgts_text = base_wgts_text;
	}
	public String getBase_wgts_text(){
		return this.base_wgts_text;
	}


	public static class Separatorlist_1{
		private Pair separatorlist_1_id;
private Pair nome_basemap;
private Pair tipo_bs_wdg;
private Pair link_wdg;
private Pair id_basemap;
		public void setSeparatorlist_1_id(Pair separatorlist_1_id){
			this.separatorlist_1_id = separatorlist_1_id;
		}
		public Pair getSeparatorlist_1_id(){
			return this.separatorlist_1_id;
		}
		public void setNome_basemap(Pair nome_basemap){
			this.nome_basemap = nome_basemap;
		}
		public Pair getNome_basemap(){
			return this.nome_basemap;
		}

		public void setTipo_bs_wdg(Pair tipo_bs_wdg){
			this.tipo_bs_wdg = tipo_bs_wdg;
		}
		public Pair getTipo_bs_wdg(){
			return this.tipo_bs_wdg;
		}

		public void setLink_wdg(Pair link_wdg){
			this.link_wdg = link_wdg;
		}
		public Pair getLink_wdg(){
			return this.link_wdg;
		}

		public void setId_basemap(Pair id_basemap){
			this.id_basemap = id_basemap;
		}
		public Pair getId_basemap(){
			return this.id_basemap;
		}

	}

	public void loadSeparatorlist_1(BaseQueryInterface query) {
		this.setSeparatorlist_1(this.loadFormList(query,Separatorlist_1.class));
	}

}
