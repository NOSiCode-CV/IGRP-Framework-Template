<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/formlist/igrp.formlist.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-a1cea659"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/title_ins_layer"><section class="content-header gen-container-item " gen-class="" item-name="title_ins_layer"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/title_ins_layer/fields/title_ins_layer_text/value"/></h2></section></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-ed2069ca"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/form_layer"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_layer"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_layer/fields"/><xsl:if test="rows/content/form_layer/fields/nome_layer_form"><div class="form-group col-sm-3   gen-fields-holder" item-name="nome_layer_form" item-type="text"><label for="{rows/content/form_layer/fields/nome_layer_form/@name}"><span><xsl:value-of select="rows/content/form_layer/fields/nome_layer_form/label"/></span></label><input type="text" value="{rows/content/form_layer/fields/nome_layer_form/value}" class="form-control  " id="{rows/content/form_layer/fields/nome_layer_form/@name}" name="{rows/content/form_layer/fields/nome_layer_form/@name}" maxlength="250" placeholder="{rows/content/form_layer/fields/nome_layer_form/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/nome_layer_form"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_layer/fields/codigo_layer_form"><div class="form-group col-sm-3   gen-fields-holder" item-name="codigo_layer_form" item-type="text"><label for="{rows/content/form_layer/fields/codigo_layer_form/@name}"><span><xsl:value-of select="rows/content/form_layer/fields/codigo_layer_form/label"/></span></label><input type="text" value="{rows/content/form_layer/fields/codigo_layer_form/value}" class="form-control  " id="{rows/content/form_layer/fields/codigo_layer_form/@name}" name="{rows/content/form_layer/fields/codigo_layer_form/@name}" maxlength="250" placeholder="{rows/content/form_layer/fields/codigo_layer_form/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/codigo_layer_form"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_layer/fields/url_layer_form"><div class="form-group col-sm-6   gen-fields-holder" item-name="url_layer_form" item-type="text"><label for="{rows/content/form_layer/fields/url_layer_form/@name}"><span><xsl:value-of select="rows/content/form_layer/fields/url_layer_form/label"/></span></label><input type="text" value="{rows/content/form_layer/fields/url_layer_form/value}" class="form-control  " id="{rows/content/form_layer/fields/url_layer_form/@name}" name="{rows/content/form_layer/fields/url_layer_form/@name}" maxlength="250" placeholder="{rows/content/form_layer/fields/url_layer_form/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/url_layer_form"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_layer/fields/tipo_layer_form"><div class="col-sm-3 form-group  gen-fields-holder" item-name="tipo_layer_form" item-type="select"><label for="{rows/content/form_layer/fields/tipo_layer_form/@name}"><xsl:value-of select="rows/content/form_layer/fields/tipo_layer_form/label"/></label><select class="form-control select2 " id="form_layer_tipo_layer_form" name="{rows/content/form_layer/fields/tipo_layer_form/@name}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/tipo_layer_form"/></xsl:call-template><xsl:for-each select="rows/content/form_layer/fields/tipo_layer_form/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_layer/fields/type_name"><div class="form-group col-sm-3   gen-fields-holder" item-name="type_name" item-type="text"><label for="{rows/content/form_layer/fields/type_name/@name}"><span><xsl:value-of select="rows/content/form_layer/fields/type_name/label"/></span></label><input type="text" value="{rows/content/form_layer/fields/type_name/value}" class="form-control  " id="{rows/content/form_layer/fields/type_name/@name}" name="{rows/content/form_layer/fields/type_name/@name}" maxlength="250" placeholder="{rows/content/form_layer/fields/type_name/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/type_name"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_layer/fields/layers_wms"><div class="form-group col-sm-3   gen-fields-holder" item-name="layers_wms" item-type="text"><label for="{rows/content/form_layer/fields/layers_wms/@name}"><span><xsl:value-of select="rows/content/form_layer/fields/layers_wms/label"/></span></label><input type="text" value="{rows/content/form_layer/fields/layers_wms/value}" class="form-control  " id="{rows/content/form_layer/fields/layers_wms/@name}" name="{rows/content/form_layer/fields/layers_wms/@name}" maxlength="250" placeholder="{rows/content/form_layer/fields/layers_wms/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/layers_wms"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_layer/fields/output_format_wms"><div class="form-group col-sm-3   gen-fields-holder" item-name="output_format_wms" item-type="text"><label for="{rows/content/form_layer/fields/output_format_wms/@name}"><span><xsl:value-of select="rows/content/form_layer/fields/output_format_wms/label"/></span></label><input type="text" value="{rows/content/form_layer/fields/output_format_wms/value}" class="form-control  " id="{rows/content/form_layer/fields/output_format_wms/@name}" name="{rows/content/form_layer/fields/output_format_wms/@name}" maxlength="250" placeholder="{rows/content/form_layer/fields/output_format_wms/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/output_format_wms"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_layer/fields/geom_ty_form"><div class="col-sm-3 form-group  gen-fields-holder" item-name="geom_ty_form" item-type="select"><label for="{rows/content/form_layer/fields/geom_ty_form/@name}"><xsl:value-of select="rows/content/form_layer/fields/geom_ty_form/label"/></label><select class="form-control select2 " id="form_layer_geom_ty_form" name="{rows/content/form_layer/fields/geom_ty_form/@name}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/geom_ty_form"/></xsl:call-template><xsl:for-each select="rows/content/form_layer/fields/geom_ty_form/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_layer/fields/estado_form"><div class="col-sm-3  gen-fields-holder" item-name="estado_form" item-type="checkbox"><div class="form-group"><div class="checkbox form-check-offset"><label class="container-box checkbox-switch switch"><xsl:value-of select="rows/content/form_layer/fields/estado_form/label"/><input type="checkbox" name="{rows/content/form_layer/fields/estado_form/@name}" value="1" class="checkbox " label="{rows/content/form_layer/fields/estado_form/label}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/estado_form"/></xsl:call-template><xsl:if test="rows/content/form_layer/fields/estado_form/value = '1'"><xsl:attribute name="checked">checked</xsl:attribute></xsl:if></input><span class="slider round"/><span class="checkmark"/></label></div></div></div></xsl:if><xsl:if test="rows/content/form_layer/fields/mais_parametros_form"><div class="col-sm-3  gen-fields-holder" item-name="mais_parametros_form" item-type="checkbox"><div class="form-group"><div class="checkbox form-check-offset"><label class="container-box checkbox-switch switch"><xsl:value-of select="rows/content/form_layer/fields/mais_parametros_form/label"/><input type="checkbox" name="{rows/content/form_layer/fields/mais_parametros_form/@name}" value="1" class="checkbox " label="{rows/content/form_layer/fields/mais_parametros_form/label}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_layer/fields/mais_parametros_form"/></xsl:call-template><xsl:if test="rows/content/form_layer/fields/mais_parametros_form/value = '1'"><xsl:attribute name="checked">checked</xsl:attribute></xsl:if></input><span class="slider round"/><span class="checkmark"/></label></div></div></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_layer/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div><div class="row " id="row-7d222801"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/mais_parm"><div class="box box-table-contents gen-container-item " gen-class="" item-name="mais_parm"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/mais_parm/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body table-box"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/mais_parm/fields"/><table id="mais_parm" class="table table-striped gen-data-table  IGRP_formlist    " rel="T_mais_parm" data-control="data-mais_parm"><thead><tr><xsl:if test="rows/content/mais_parm/fields/param_wms"><th td-name="param_wms" align="" show-label="" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/mais_parm/fields/param_wms/label"/></span></th></xsl:if><xsl:if test="rows/content/mais_parm/fields/valor_wms"><th td-name="valor_wms" align="" show-label="" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/mais_parm/fields/valor_wms/label"/></span></th></xsl:if><xsl:if test="not(rows/content/mais_parm/table/value/row[position() = 1]/@noupdate) or not(rows/content/mais_parm/table/value/row[position() = 1]/@nodelete)"><th class="table-btn add"><xsl:if test="not(rows/content/mais_parm/table/value/row[position() = 1]/@noupdate)"><a class="formlist-row-add btn btn-primary" rel="mais_parm" title="Add" data-toggle="tooltip" data-placement="left"><i class="fa fa-plus"/></a></xsl:if></th></xsl:if></tr></thead><tbody><xsl:for-each select="rows/content/mais_parm/table/value/row"><tr row="{position()}"><input type="hidden" name="p_mais_parm_id" value="{mais_parm_id}"/><input type="hidden" name="p_id_param_fk" value="{id_param}"/><input type="hidden" name="p_id_param_fk_desc" value="{id_param_desc}"/><xsl:apply-templates mode="form-hidden-fields" select="."/><xsl:if test="param_wms"><xsl:if test="not(param_wms/@visible)"><td align="" data-row="{position()}" data-title="{../../../fields/param_wms/label}" class="text" item-name="param_wms"><input type="hidden" name="{../../../fields/param_wms/@name}_fk_desc" value="{param_wms_desc}"/><div class="form-group" item-name="param_wms" item-type="text"><input type="text" name="{../../../fields/param_wms/@name}_fk" value="{param_wms}" class="text form-control" rel="F_mais_parm" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/mais_parm/fields/param_wms"/></xsl:call-template></input></div></td></xsl:if></xsl:if><xsl:if test="valor_wms"><xsl:if test="not(valor_wms/@visible)"><td align="" data-row="{position()}" data-title="{../../../fields/valor_wms/label}" class="text" item-name="valor_wms"><input type="hidden" name="{../../../fields/valor_wms/@name}_fk_desc" value="{valor_wms_desc}"/><div class="form-group" item-name="valor_wms" item-type="text"><input type="text" name="{../../../fields/valor_wms/@name}_fk" value="{valor_wms}" class="text form-control" rel="F_mais_parm" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/mais_parm/fields/valor_wms"/></xsl:call-template></input></div></td></xsl:if></xsl:if><xsl:if test="not(@nodelete) or not(@noupdate)"><td class="table-btn delete" data-row="{position()}"><xsl:if test="not(@nodelete)"><span class="formlist-row-remove btn btn-danger" rel="mais_parm" title="Remove" data-toggle="tooltip" data-placement="bottom"><i class="fa fa-times"/></span></xsl:if></td></xsl:if></tr></xsl:for-each></tbody></table></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/igrp.table.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/formlist/igrp.formlist.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/><script src="{$path}/core/igrp/IGRP.rules.class.js"/><script>
$.IGRP.rules.set({"p_tipo_layer_form":[{"name":"Show WMS Fields","events":"load,change","isTable":false,"conditions":{"rules":[{"condition":"equal","value":"WMS ","value2":"","patern":"","patern_custom":"","opposite":"1"}],"actions":[{"action":"show","targets":"layers_wms,output_format_wms","procedure":"","request_fields":"","msg_type":"","msg":""},{"action":"hide","targets":"type_name","procedure":"","request_fields":"","msg_type":"","msg":""}]}},{"name":"Show WFS Fields","events":"load,change","isTable":false,"conditions":{"rules":[{"condition":"equal","value":"WFS","value2":"","patern":"","patern_custom":"","opposite":""}],"actions":[{"action":"show","targets":"type_name","procedure":"","request_fields":"","msg_type":"","msg":""}]}},{"name":"Hide","events":"load,change","isTable":false,"conditions":{"rules":[{"condition":"null","value":"","value2":"","patern":"","patern_custom":"","opposite":""}],"actions":[{"action":"hide","targets":"type_name,layers_wms,output_format_wms","procedure":"","request_fields":"","msg_type":"","msg":""}]}}],"p_mais_parametros_form":[{"name":"Show Mais Params","events":"load,change","isTable":false,"conditions":{"rules":[{"condition":"checked","value":"","value2":"","patern":"","patern_custom":"","opposite":"1"}],"actions":[{"action":"show","targets":"mais_parm","procedure":"","request_fields":"","msg_type":"info","msg":""}]}}]},'actionsList');</script></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=10"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=10"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=10"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=10"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=10"/><xsl:include href="../../../xsl/tmpl/IGRP-table-utils.tmpl.xsl?v=10"/></xsl:stylesheet>
