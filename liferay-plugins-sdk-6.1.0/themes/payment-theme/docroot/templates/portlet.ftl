<#assign portlet_display = portletDisplay />

<#assign portlet_id = htmlUtil.escapeAttribute(portlet_display.getId()) />
<#assign portlet_title = portlet_display.getTitle() />
<#assign portlet_back_url = htmlUtil.escapeAttribute(portlet_display.getURLBack()) />

<section class="portlet" id="portlet_${portlet_id}">
	<div class="portlet-content">
		${portlet_display.writeContent(writer)}
	</div>
</section>