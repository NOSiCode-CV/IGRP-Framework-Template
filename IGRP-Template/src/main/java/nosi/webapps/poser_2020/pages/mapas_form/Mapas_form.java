package nosi.webapps.poser_2020.pages.mapas_form;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import nosi.core.validator.constraints.*;

public class Mapas_form extends Model{		

	@RParam(rParamName = "p_tt_map_text")
	private String tt_map_text;

	@RParam(rParamName = "p_titulo_map_form")
	private String titulo_map_form;

	@NotNull()
	@RParam(rParamName = "p_codigo_map_form")
	private String codigo_map_form;

	@RParam(rParamName = "p_enquad_form")
	private Integer enquad_form;

	@RParam(rParamName = "p_id_map")
	private String id_map;

	@RParam(rParamName = "p_id")
	private String id;

	@RParam(rParamName = "p_ass_layer")
	private String ass_layer;

	@RParam(rParamName = "p_associar_widgets")
	private String associar_widgets;

	@RParam(rParamName = "p_associar_basemap")
	private String associar_basemap;
	
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
	
	@SeparatorList(name = Separatorlist_2.class)
	@Valid
	private List<Separatorlist_2> separatorlist_2 = new ArrayList<>();	
	public void setSeparatorlist_2(List<Separatorlist_2> separatorlist_2){
		this.separatorlist_2 = separatorlist_2;
	}
	public List<Separatorlist_2> getSeparatorlist_2(){
		return this.separatorlist_2;
	}
	@RParam(rParamName = "p_separatorlist_2_id")
	private String[] p_separatorlist_2_id;
	@RParam(rParamName = "p_separatorlist_2_del")
	private String[] p_separatorlist_2_del;
	@RParam(rParamName = "p_separatorlist_2_edit")
	private String[] p_separatorlist_2_edit;
	
	public void setP_separatorlist_2_id(String[] p_separatorlist_2_id){
		this.p_separatorlist_2_id = p_separatorlist_2_id;
	}
	public String[] getP_separatorlist_2_id(){
		return this.p_separatorlist_2_id;
	}
	
	public void setP_separatorlist_2_del(String[] p_separatorlist_2_del){
		this.p_separatorlist_2_del = p_separatorlist_2_del;
	}
	public String[] getP_separatorlist_2_del(){
		return this.p_separatorlist_2_del;
	}
	
	public void setP_separatorlist_2_edit(String[] p_separatorlist_2_edit){
		this.p_separatorlist_2_edit = p_separatorlist_2_edit;
	}
	public String[] getP_separatorlist_2_edit(){
		return this.p_separatorlist_2_edit;
	}
	
	@SeparatorList(name = Separatorlist_3.class)
	@Valid
	private List<Separatorlist_3> separatorlist_3 = new ArrayList<>();	
	public void setSeparatorlist_3(List<Separatorlist_3> separatorlist_3){
		this.separatorlist_3 = separatorlist_3;
	}
	public List<Separatorlist_3> getSeparatorlist_3(){
		return this.separatorlist_3;
	}
	@RParam(rParamName = "p_separatorlist_3_id")
	private String[] p_separatorlist_3_id;
	@RParam(rParamName = "p_separatorlist_3_del")
	private String[] p_separatorlist_3_del;
	@RParam(rParamName = "p_separatorlist_3_edit")
	private String[] p_separatorlist_3_edit;
	
	public void setP_separatorlist_3_id(String[] p_separatorlist_3_id){
		this.p_separatorlist_3_id = p_separatorlist_3_id;
	}
	public String[] getP_separatorlist_3_id(){
		return this.p_separatorlist_3_id;
	}
	
	public void setP_separatorlist_3_del(String[] p_separatorlist_3_del){
		this.p_separatorlist_3_del = p_separatorlist_3_del;
	}
	public String[] getP_separatorlist_3_del(){
		return this.p_separatorlist_3_del;
	}
	
	public void setP_separatorlist_3_edit(String[] p_separatorlist_3_edit){
		this.p_separatorlist_3_edit = p_separatorlist_3_edit;
	}
	public String[] getP_separatorlist_3_edit(){
		return this.p_separatorlist_3_edit;
	}
	
	public void setTt_map_text(String tt_map_text){
		this.tt_map_text = tt_map_text;
	}
	public String getTt_map_text(){
		return this.tt_map_text;
	}
	
	public void setTitulo_map_form(String titulo_map_form){
		this.titulo_map_form = titulo_map_form;
	}
	public String getTitulo_map_form(){
		return this.titulo_map_form;
	}
	
	public void setCodigo_map_form(String codigo_map_form){
		this.codigo_map_form = codigo_map_form;
	}
	public String getCodigo_map_form(){
		return this.codigo_map_form;
	}
	
	public void setEnquad_form(Integer enquad_form){
		this.enquad_form = enquad_form;
	}
	public Integer getEnquad_form(){
		return this.enquad_form;
	}
	
	public void setId_map(String id_map){
		this.id_map = id_map;
	}
	public String getId_map(){
		return this.id_map;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	
	public void setAss_layer(String ass_layer){
		this.ass_layer = ass_layer;
	}
	public String getAss_layer(){
		return this.ass_layer;
	}
	
	public void setAssociar_widgets(String associar_widgets){
		this.associar_widgets = associar_widgets;
	}
	public String getAssociar_widgets(){
		return this.associar_widgets;
	}
	
	public void setAssociar_basemap(String associar_basemap){
		this.associar_basemap = associar_basemap;
	}
	public String getAssociar_basemap(){
		return this.associar_basemap;
	}


	public static class Separatorlist_1{
		private Pair separatorlist_1_id;
private Pair layers_aass;
private Pair map_id;
		public void setSeparatorlist_1_id(Pair separatorlist_1_id){
			this.separatorlist_1_id = separatorlist_1_id;
		}
		public Pair getSeparatorlist_1_id(){
			return this.separatorlist_1_id;
		}
		public void setLayers_aass(Pair layers_aass){
			this.layers_aass = layers_aass;
		}
		public Pair getLayers_aass(){
			return this.layers_aass;
		}

		public void setMap_id(Pair map_id){
			this.map_id = map_id;
		}
		public Pair getMap_id(){
			return this.map_id;
		}

	}
	public static class Separatorlist_2{
		private Pair separatorlist_2_id;
private Pair widgets_ass_form;
private Pair id_mapa;
		public void setSeparatorlist_2_id(Pair separatorlist_2_id){
			this.separatorlist_2_id = separatorlist_2_id;
		}
		public Pair getSeparatorlist_2_id(){
			return this.separatorlist_2_id;
		}
		public void setWidgets_ass_form(Pair widgets_ass_form){
			this.widgets_ass_form = widgets_ass_form;
		}
		public Pair getWidgets_ass_form(){
			return this.widgets_ass_form;
		}

		public void setId_mapa(Pair id_mapa){
			this.id_mapa = id_mapa;
		}
		public Pair getId_mapa(){
			return this.id_mapa;
		}

	}
	public static class Separatorlist_3{
		private Pair separatorlist_3_id;
private Pair basemap;
		public void setSeparatorlist_3_id(Pair separatorlist_3_id){
			this.separatorlist_3_id = separatorlist_3_id;
		}
		public Pair getSeparatorlist_3_id(){
			return this.separatorlist_3_id;
		}
		public void setBasemap(Pair basemap){
			this.basemap = basemap;
		}
		public Pair getBasemap(){
			return this.basemap;
		}

	}

	public void loadSeparatorlist_1(BaseQueryInterface query) {
		this.setSeparatorlist_1(this.loadFormList(query,Separatorlist_1.class));
	}

	public void loadSeparatorlist_2(BaseQueryInterface query) {
		this.setSeparatorlist_2(this.loadFormList(query,Separatorlist_2.class));
	}

	public void loadSeparatorlist_3(BaseQueryInterface query) {
		this.setSeparatorlist_3(this.loadFormList(query,Separatorlist_3.class));
	}

}
