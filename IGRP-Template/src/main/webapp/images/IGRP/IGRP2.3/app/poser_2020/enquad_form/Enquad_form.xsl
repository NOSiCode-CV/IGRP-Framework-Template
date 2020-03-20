<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-cbea81f9"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/tt_eng"><section class="content-header gen-container-item " gen-class="" item-name="tt_eng"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/tt_eng/fields/tt_eng_text/value"/></h2></section></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-274a2b46"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/nome_enq"><div class="form-group col-sm-3   gen-fields-holder" item-name="nome_enq" item-type="text" required="required"><label for="{rows/content/form_1/fields/nome_enq/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nome_enq/label"/></span></label><input type="text" value="{rows/content/form_1/fields/nome_enq/value}" class="form-control  " id="{rows/content/form_1/fields/nome_enq/@name}" name="{rows/content/form_1/fields/nome_enq/@name}" required="required" maxlength="100" placeholder="{rows/content/form_1/fields/nome_enq/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nome_enq"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/c_latitude"><div class="form-group col-sm-3   gen-fields-holder" item-name="c_latitude" item-type="text"><label for="{rows/content/form_1/fields/c_latitude/@name}"><span><xsl:value-of select="rows/content/form_1/fields/c_latitude/label"/></span></label><input type="text" value="{rows/content/form_1/fields/c_latitude/value}" class="form-control  " id="{rows/content/form_1/fields/c_latitude/@name}" name="{rows/content/form_1/fields/c_latitude/@name}" maxlength="2000" placeholder="{rows/content/form_1/fields/c_latitude/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/c_latitude"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/c_longitude"><div class="form-group col-sm-3   gen-fields-holder" item-name="c_longitude" item-type="text"><label for="{rows/content/form_1/fields/c_longitude/@name}"><span><xsl:value-of select="rows/content/form_1/fields/c_longitude/label"/></span></label><input type="text" value="{rows/content/form_1/fields/c_longitude/value}" class="form-control  " id="{rows/content/form_1/fields/c_longitude/@name}" name="{rows/content/form_1/fields/c_longitude/@name}" maxlength="2000" placeholder="{rows/content/form_1/fields/c_longitude/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/c_longitude"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/zoom_enq"><div class="form-group col-sm-3   gen-fields-holder" item-name="zoom_enq" item-type="text"><label for="{rows/content/form_1/fields/zoom_enq/@name}"><span><xsl:value-of select="rows/content/form_1/fields/zoom_enq/label"/></span></label><input type="text" value="{rows/content/form_1/fields/zoom_enq/value}" class="form-control  " id="{rows/content/form_1/fields/zoom_enq/@name}" name="{rows/content/form_1/fields/zoom_enq/@name}" maxlength="250" placeholder="{rows/content/form_1/fields/zoom_enq/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/zoom_enq"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=3"/></xsl:stylesheet>
