<!DOCTYPE html>

<#include init />

<html dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>Hệ thống dịch vụ hành chính công trực tuyến</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<base href="/">

	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons" rel="stylesheet" type="text/css">
	
	<link type="text/css" href="${themeDisplay.getPathThemeRoot()}css/app.2f39b7f9be40e6fda979272793a3adbd.css" rel="stylesheet">

</head>

<body class="mBody">

	<#if selectable>
        ${theme.include(content_include)}
    <#else>
        ${portletDisplay.recycle()}

        ${portletDisplay.setTitle(the_title)}

        ${theme.wrapPortlet("portlet.ftl", content_include)}
    </#if>
	<div id="app"></div>
	<script type="text/javascript" src="${themeDisplay.getPathThemeRoot()}js/manifest.b444ce00244d59c45e18.js"></script>
	<script type="text/javascript" src="${themeDisplay.getPathThemeRoot()}js/vendor.b7accd1e78813cbc2f83.js"></script>
	<script type="text/javascript" src="${themeDisplay.getPathThemeRoot()}js/app.e404e2290792464d76c8.js"></script>

</body>

</html>
