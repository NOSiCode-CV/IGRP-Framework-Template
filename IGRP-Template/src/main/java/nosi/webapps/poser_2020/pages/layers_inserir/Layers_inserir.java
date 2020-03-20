package nosi.webapps.poser_2020.pages.layers_inserir;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
public class Layers_inserir extends Model{		

	@RParam(rParamName = "p_title_ins_layer_text")
	private String title_ins_layer_text;

	@RParam(rParamName = "p_nome_layer_form")
	private String nome_layer_form;

	@RParam(rParamName = "p_codigo_layer_form")
	private String codigo_layer_form;

	@RParam(rParamName = "p_url_layer_form")
	private String url_layer_form;

	@RParam(rParamName = "p_tipo_layer_form")
	private String tipo_layer_form;

	@RParam(rParamName = "p_type_name")
	private String type_name;

	@RParam(rParamName = "p_layers_wms")
	private String layers_wms;

	@RParam(rParamName = "p_output_format_wms")
	private String output_format_wms;

	@RParam(rParamName = "p_geom_ty_form")
	private String geom_ty_form;

	@RParam(rParamName = "p_estado_form")
	private int estado_form;
	@RParam(rParamName = "p_estado_form_check")
	private int estado_form_check;

	@RParam(rParamName = "p_mais_parametros_form")
	private int mais_parametros_form;
	@RParam(rParamName = "p_mais_parametros_form_check")
	private int mais_parametros_form_check;

	@RParam(rParamName = "p_id")
	private Integer id;

	@RParam(rParamName = "p_id_output_format_wms")
	private String id_output_format_wms;

	@RParam(rParamName = "p_id_layers_wms")
	private String id_layers_wms;

	@RParam(rParamName = "p_id_type_name")
	private String id_type_name;
	
	@SeparatorList(name = Mais_parm.class)
	@Valid
	private List<Mais_parm> mais_parm = new ArrayList<>();	
	public void setMais_parm(List<Mais_parm> mais_parm){
		this.mais_parm = mais_parm;
	}
	public List<Mais_parm> getMais_parm(){
		return this.mais_parm;
	}
	@RParam(rParamName = "p_mais_parm_id")
	private String[] p_mais_parm_id;
	@RParam(rParamName = "p_mais_parm_del")
	private String[] p_mais_parm_del;
	@RParam(rParamName = "p_mais_parm_edit")
	private String[] p_mais_parm_edit;
	
	public void setP_mais_parm_id(String[] p_mais_parm_id){
		this.p_mais_parm_id = p_mais_parm_id;
	}
	public String[] getP_mais_parm_id(){
		return this.p_mais_parm_id;
	}
	
	public void setP_mais_parm_del(String[] p_mais_parm_del){
		this.p_mais_parm_del = p_mais_parm_del;
	}
	public String[] getP_mais_parm_del(){
		return this.p_mais_parm_del;
	}
	
	public void setP_mais_parm_edit(String[] p_mais_parm_edit){
		this.p_mais_parm_edit = p_mais_parm_edit;
	}
	public String[] getP_mais_parm_edit(){
		return this.p_mais_parm_edit;
	}
	
	public void setTitle_ins_layer_text(String title_ins_layer_text){
		this.title_ins_layer_text = title_ins_layer_text;
	}
	public String getTitle_ins_layer_text(){
		return this.title_ins_layer_text;
	}
	
	public void setNome_layer_form(String nome_layer_form){
		this.nome_layer_form = nome_layer_form;
	}
	public String getNome_layer_form(){
		return this.nome_layer_form;
	}
	
	public void setCodigo_layer_form(String codigo_layer_form){
		this.codigo_layer_form = codigo_layer_form;
	}
	public String getCodigo_layer_form(){
		return this.codigo_layer_form;
	}
	
	public void setUrl_layer_form(String url_layer_form){
		this.url_layer_form = url_layer_form;
	}
	public String getUrl_layer_form(){
		return this.url_layer_form;
	}
	
	public void setTipo_layer_form(String tipo_layer_form){
		this.tipo_layer_form = tipo_layer_form;
	}
	public String getTipo_layer_form(){
		return this.tipo_layer_form;
	}
	
	public void setType_name(String type_name){
		this.type_name = type_name;
	}
	public String getType_name(){
		return this.type_name;
	}
	
	public void setLayers_wms(String layers_wms){
		this.layers_wms = layers_wms;
	}
	public String getLayers_wms(){
		return this.layers_wms;
	}
	
	public void setOutput_format_wms(String output_format_wms){
		this.output_format_wms = output_format_wms;
	}
	public String getOutput_format_wms(){
		return this.output_format_wms;
	}
	
	public void setGeom_ty_form(String geom_ty_form){
		this.geom_ty_form = geom_ty_form;
	}
	public String getGeom_ty_form(){
		return this.geom_ty_form;
	}
	
	public void setEstado_form(int estado_form){
		this.estado_form = estado_form;
	}
	public int getEstado_form(){
		return this.estado_form;
	}
	public void setEstado_form_check(int estado_form_check){
		this.estado_form_check = estado_form_check;
	}
	public int getEstado_form_check(){
		return this.estado_form_check;
	}
	
	public void setMais_parametros_form(int mais_parametros_form){
		this.mais_parametros_form = mais_parametros_form;
	}
	public int getMais_parametros_form(){
		return this.mais_parametros_form;
	}
	public void setMais_parametros_form_check(int mais_parametros_form_check){
		this.mais_parametros_form_check = mais_parametros_form_check;
	}
	public int getMais_parametros_form_check(){
		return this.mais_parametros_form_check;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
	
	public void setId_output_format_wms(String id_output_format_wms){
		this.id_output_format_wms = id_output_format_wms;
	}
	public String getId_output_format_wms(){
		return this.id_output_format_wms;
	}
	
	public void setId_layers_wms(String id_layers_wms){
		this.id_layers_wms = id_layers_wms;
	}
	public String getId_layers_wms(){
		return this.id_layers_wms;
	}
	
	public void setId_type_name(String id_type_name){
		this.id_type_name = id_type_name;
	}
	public String getId_type_name(){
		return this.id_type_name;
	}


	public static class Mais_parm{
		private Pair mais_parm_id;
private Pair param_wms;
private Pair valor_wms;
private Pair id_param;
		public void setMais_parm_id(Pair mais_parm_id){
			this.mais_parm_id = mais_parm_id;
		}
		public Pair getMais_parm_id(){
			return this.mais_parm_id;
		}
		public void setParam_wms(Pair param_wms){
			this.param_wms = param_wms;
		}
		public Pair getParam_wms(){
			return this.param_wms;
		}

		public void setValor_wms(Pair valor_wms){
			this.valor_wms = valor_wms;
		}
		public Pair getValor_wms(){
			return this.valor_wms;
		}

		public void setId_param(Pair id_param){
			this.id_param = id_param;
		}
		public Pair getId_param(){
			return this.id_param;
		}

	}

	public void loadMais_parm(BaseQueryInterface query) {
		this.setMais_parm(this.loadFormList(query,Mais_parm.class));
	}

}
