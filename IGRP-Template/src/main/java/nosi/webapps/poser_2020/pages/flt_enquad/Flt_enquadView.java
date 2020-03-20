package nosi.webapps.poser_2020.pages.flt_enquad;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Flt_enquadView extends View {

	public Field flt_enq_text;
	public Field nome_lst_enq;
	public Field c_latitude_flt;
	public Field c_long_ls;
	public Field zoom_lst;
	public Field id;
	public Field teste;
	public IGRPSectionHeader flt_enq;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo_enq;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Flt_enquadView(){

		this.setPageTitle("Listar/Filtrar Enquadramento");
			
		flt_enq = new IGRPSectionHeader("flt_enq","");

		table_1 = new IGRPTable("table_1","");

		flt_enq_text = new TextField(model,"flt_enq_text");
		flt_enq_text.setLabel(gt(""));
		flt_enq_text.setValue(gt("<p>Listar / Filtrar Enquadramento</p>"));
		flt_enq_text.propertie().add("type","text").add("name","p_flt_enq_text").add("maxlength","40");
		
		nome_lst_enq = new TextField(model,"nome_lst_enq");
		nome_lst_enq.setLabel(gt("Nome"));
		nome_lst_enq.propertie().add("name","p_nome_lst_enq").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		c_latitude_flt = new TextField(model,"c_latitude_flt");
		c_latitude_flt.setLabel(gt(" Latitude"));
		c_latitude_flt.propertie().add("name","p_c_latitude_flt").add("type","text").add("maxlength","1000").add("showLabel","true").add("group_in","");
		
		c_long_ls = new TextField(model,"c_long_ls");
		c_long_ls.setLabel(gt(" Longitude"));
		c_long_ls.propertie().add("name","p_c_long_ls").add("type","text").add("maxlength","1000").add("showLabel","true").add("group_in","");
		
		zoom_lst = new TextField(model,"zoom_lst");
		zoom_lst.setLabel(gt("Zoom"));
		zoom_lst.propertie().add("name","p_zoom_lst").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id");
		
		teste = new HiddenField(model,"teste");
		teste.setLabel(gt(""));
		teste.propertie().add("name","p_teste").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","teste");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo_enq = new IGRPButton("Novo","poser_2020","Flt_enquad","novo_enq","modal|refresh","success|fa-plus","","");
		btn_novo_enq.propertie.add("type","specific").add("rel","novo_enq").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","poser_2020","Flt_enquad","editar","modal|refresh","warning|fa-pencil","","");
		btn_editar.propertie.add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","poser_2020","Flt_enquad","eliminar","confirm","danger|fa-remove","","");
		btn_eliminar.propertie.add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		flt_enq.addField(flt_enq_text);


		table_1.addField(nome_lst_enq);
		table_1.addField(c_latitude_flt);
		table_1.addField(c_long_ls);
		table_1.addField(zoom_lst);
		table_1.addField(id);
		table_1.addField(teste);

		toolsbar_1.addButton(btn_novo_enq);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(flt_enq);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_lst_enq.setValue(model);
		c_latitude_flt.setValue(model);
		c_long_ls.setValue(model);
		zoom_lst.setValue(model);
		id.setValue(model);
		teste.setValue(model);	

		table_1.loadModel(((Flt_enquad) model).getTable_1());
		}
}
