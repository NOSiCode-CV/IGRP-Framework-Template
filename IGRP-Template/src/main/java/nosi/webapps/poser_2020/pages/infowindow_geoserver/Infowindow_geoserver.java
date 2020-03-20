package nosi.webapps.poser_2020.pages.infowindow_geoserver;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
public class Infowindow_geoserver extends Model{		

	@RParam(rParamName = "p_iden_text")
	private String iden_text;
	
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
	
	public void setIden_text(String iden_text){
		this.iden_text = iden_text;
	}
	public String getIden_text(){
		return this.iden_text;
	}


	public static class Separatorlist_1{
		private Pair separatorlist_1_id;
private Pair layer_idt;
private Pair label_idf;
private Pair ordem_idf;
private Pair campo_idf;
private Pair editavel_ed;
		public void setSeparatorlist_1_id(Pair separatorlist_1_id){
			this.separatorlist_1_id = separatorlist_1_id;
		}
		public Pair getSeparatorlist_1_id(){
			return this.separatorlist_1_id;
		}
		public void setLayer_idt(Pair layer_idt){
			this.layer_idt = layer_idt;
		}
		public Pair getLayer_idt(){
			return this.layer_idt;
		}

		public void setLabel_idf(Pair label_idf){
			this.label_idf = label_idf;
		}
		public Pair getLabel_idf(){
			return this.label_idf;
		}

		public void setOrdem_idf(Pair ordem_idf){
			this.ordem_idf = ordem_idf;
		}
		public Pair getOrdem_idf(){
			return this.ordem_idf;
		}

		public void setCampo_idf(Pair campo_idf){
			this.campo_idf = campo_idf;
		}
		public Pair getCampo_idf(){
			return this.campo_idf;
		}

		public void setEditavel_ed(Pair editavel_ed){
			this.editavel_ed = editavel_ed;
		}
		public Pair getEditavel_ed(){
			return this.editavel_ed;
		}

	}

	public void loadSeparatorlist_1(BaseQueryInterface query) {
		this.setSeparatorlist_1(this.loadFormList(query,Separatorlist_1.class));
	}

}
