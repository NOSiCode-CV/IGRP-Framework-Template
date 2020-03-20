package nosi.webapps.poser_2020.pages.layers_inserir;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Layers_inserirView extends View {

	public Field title_ins_layer_text;
	public Field nome_layer_form;
	public Field codigo_layer_form;
	public Field url_layer_form;
	public Field tipo_layer_form;
	public Field type_name;
	public Field layers_wms;
	public Field output_format_wms;
	public Field geom_ty_form;
	public Field estado_form;
	public Field estado_form_check;
	public Field mais_parametros_form;
	public Field mais_parametros_form_check;
	public Field id;
	public Field id_output_format_wms;
	public Field id_layers_wms;
	public Field id_type_name;
	public Field param_wms;
	public Field valor_wms;
	public Field id_param_desc;
	public Field id_param;
	public IGRPSectionHeader title_ins_layer;
	public IGRPForm form_layer;
	public IGRPFormList mais_parm;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;

	public Layers_inserirView(){

		this.setPageTitle("Layers - Inserir/Editar");
			
		title_ins_layer = new IGRPSectionHeader("title_ins_layer","");

		form_layer = new IGRPForm("form_layer","");

		mais_parm = new IGRPFormList("mais_parm","Parâmetros");

		title_ins_layer_text = new TextField(model,"title_ins_layer_text");
		title_ins_layer_text.setLabel(gt(""));
		title_ins_layer_text.setValue(gt(""));
		title_ins_layer_text.propertie().add("type","text").add("name","p_title_ins_layer_text").add("maxlength","4000");
		
		nome_layer_form = new TextField(model,"nome_layer_form");
		nome_layer_form.setLabel(gt("Nome"));
		nome_layer_form.propertie().add("name","p_nome_layer_form").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		codigo_layer_form = new TextField(model,"codigo_layer_form");
		codigo_layer_form.setLabel(gt("Código"));
		codigo_layer_form.propertie().add("name","p_codigo_layer_form").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		url_layer_form = new TextField(model,"url_layer_form");
		url_layer_form.setLabel(gt("URL"));
		url_layer_form.propertie().add("name","p_url_layer_form").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		tipo_layer_form = new ListField(model,"tipo_layer_form");
		tipo_layer_form.setLabel(gt("Origem"));
		tipo_layer_form.propertie().add("name","p_tipo_layer_form").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","String");
		
		type_name = new TextField(model,"type_name");
		type_name.setLabel(gt("Type Name"));
		type_name.propertie().add("name","p_type_name").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		layers_wms = new TextField(model,"layers_wms");
		layers_wms.setLabel(gt("Layers"));
		layers_wms.propertie().add("name","p_layers_wms").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		output_format_wms = new TextField(model,"output_format_wms");
		output_format_wms.setLabel(gt("Output Format"));
		output_format_wms.propertie().add("name","p_output_format_wms").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		geom_ty_form = new ListField(model,"geom_ty_form");
		geom_ty_form.setLabel(gt("Geom Type"));
		geom_ty_form.propertie().add("name","p_geom_ty_form").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		estado_form = new CheckBoxField(model,"estado_form");
		estado_form.setLabel(gt("Estado"));
		estado_form.propertie().add("name","p_estado_form").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("switch","true").add("check","true");
		
		mais_parametros_form = new CheckBoxField(model,"mais_parametros_form");
		mais_parametros_form.setLabel(gt("Mais Parametros"));
		mais_parametros_form.propertie().add("name","p_mais_parametros_form").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("switch","true").add("check","true");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tag","id");
		
		id_output_format_wms = new HiddenField(model,"id_output_format_wms");
		id_output_format_wms.setLabel(gt(""));
		id_output_format_wms.propertie().add("name","p_id_output_format_wms").add("type","hidden").add("maxlength","250").add("java-type","String").add("tag","id_output_format_wms");
		
		id_layers_wms = new HiddenField(model,"id_layers_wms");
		id_layers_wms.setLabel(gt(""));
		id_layers_wms.propertie().add("name","p_id_layers_wms").add("type","hidden").add("maxlength","250").add("java-type","String").add("tag","id_layers_wms");
		
		id_type_name = new HiddenField(model,"id_type_name");
		id_type_name.setLabel(gt(""));
		id_type_name.propertie().add("name","p_id_type_name").add("type","hidden").add("maxlength","250").add("java-type","String").add("tag","id_type_name");
		
		param_wms = new TextField(model,"param_wms");
		param_wms.setLabel(gt("Parâmetro"));
		param_wms.propertie().add("name","p_param_wms").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		valor_wms = new TextField(model,"valor_wms");
		valor_wms.setLabel(gt("Valor"));
		valor_wms.propertie().add("name","p_valor_wms").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		id_param = new HiddenField(model,"id_param");
		id_param.setLabel(gt(""));
		id_param.propertie().add("name","p_id_param").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_param").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar = new IGRPButton("Gravar","poser_2020","Layers_inserir","gravar","submit","success|fa-floppy-o","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		title_ins_layer.addField(title_ins_layer_text);


		form_layer.addField(nome_layer_form);
		form_layer.addField(codigo_layer_form);
		form_layer.addField(url_layer_form);
		form_layer.addField(tipo_layer_form);
		form_layer.addField(type_name);
		form_layer.addField(layers_wms);
		form_layer.addField(output_format_wms);
		form_layer.addField(geom_ty_form);
		form_layer.addField(estado_form);
		form_layer.addField(mais_parametros_form);
		form_layer.addField(id);
		form_layer.addField(id_output_format_wms);
		form_layer.addField(id_layers_wms);
		form_layer.addField(id_type_name);

		mais_parm.addField(param_wms);
		mais_parm.addField(valor_wms);
		mais_parm.addField(id_param);

		toolsbar_1.addButton(btn_gravar);
		this.addToPage(title_ins_layer);
		this.addToPage(form_layer);
		this.addToPage(mais_parm);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_layer_form.setValue(model);
		codigo_layer_form.setValue(model);
		url_layer_form.setValue(model);
		tipo_layer_form.setValue(model);
		type_name.setValue(model);
		layers_wms.setValue(model);
		output_format_wms.setValue(model);
		geom_ty_form.setValue(model);
		estado_form.setValue(model);
		mais_parametros_form.setValue(model);
		id.setValue(model);
		id_output_format_wms.setValue(model);
		id_layers_wms.setValue(model);
		id_type_name.setValue(model);
		param_wms.setValue(model);
		valor_wms.setValue(model);
		id_param.setValue(model);	

		mais_parm.loadModel(((Layers_inserir) model).getMais_parm());
		}
}
