package nosi.webapps.poser_2020.pages.basemap_wdgt;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Basemap_wdgtView extends View {

	public Field base_wgts_text;
	public Field nome_basemap;
	public Field tipo_bs_wdg;
	public Field link_wdg;
	public Field id_basemap;
	public IGRPSectionHeader base_wgts;
	public IGRPSeparatorList separatorlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar_wdg;

	public Basemap_wdgtView(){

		this.setPageTitle("BaseMap");
			
		base_wgts = new IGRPSectionHeader("base_wgts","");

		separatorlist_1 = new IGRPSeparatorList("separatorlist_1","");

		base_wgts_text = new TextField(model,"base_wgts_text");
		base_wgts_text.setLabel(gt(""));
		base_wgts_text.setValue(gt("<p>BaseMap</p>"));
		base_wgts_text.propertie().add("type","text").add("name","p_base_wgts_text").add("maxlength","40");
		
		nome_basemap = new TextField(model,"nome_basemap");
		nome_basemap.setLabel(gt("Nome BaseMap"));
		nome_basemap.propertie().add("name","p_nome_basemap").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		tipo_bs_wdg = new TextField(model,"tipo_bs_wdg");
		tipo_bs_wdg.setLabel(gt("Tipo"));
		tipo_bs_wdg.propertie().add("name","p_tipo_bs_wdg").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		link_wdg = new TextField(model,"link_wdg");
		link_wdg.setLabel(gt("Link"));
		link_wdg.propertie().add("name","p_link_wdg").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		id_basemap = new HiddenField(model,"id_basemap");
		id_basemap.setLabel(gt(""));
		id_basemap.propertie().add("name","p_id_basemap").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_basemap").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar_wdg = new IGRPButton("Gravar","poser_2020","Basemap_wdgt","gravar_wdg","submit","success|fa-save","","");
		btn_gravar_wdg.propertie.add("type","specific").add("rel","gravar_wdg").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		base_wgts.addField(base_wgts_text);


		separatorlist_1.addField(nome_basemap);
		separatorlist_1.addField(tipo_bs_wdg);
		separatorlist_1.addField(link_wdg);
		separatorlist_1.addField(id_basemap);

		toolsbar_1.addButton(btn_gravar_wdg);
		this.addToPage(base_wgts);
		this.addToPage(separatorlist_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_basemap.setValue(model);
		tipo_bs_wdg.setValue(model);
		link_wdg.setValue(model);
		id_basemap.setValue(model);	

		separatorlist_1.loadModel(((Basemap_wdgt) model).getSeparatorlist_1());
		}
}
