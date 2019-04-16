<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page pageEncoding="UTF-8"%>

<%
/**
 * Copyright (c) 2014 DTT Technology, JSC. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
 %>

<%
String check=request.getParameter("ACTIONNAME");
		 
			System.out.println("---JSP ---"+check);

%>

<!-- xuat bao cao -->
<portlet:resourceURL var="exportFiles" id="exportFiles">
</portlet:resourceURL>

<portlet:resourceURL var="exportFilesExcel" id="exportFilesExcel">
</portlet:resourceURL>
	<portlet:actionURL var="actionExport" name="actionExport">
	</portlet:actionURL>
<div class="bieumau_baocao">
	
	<form action="<%=exportFiles%>" method="post" target="_blank" id="exportFiles" name="exportFiles" >
	
	<button type="submit">export File</button>
		<button type="submit" value="1111111111111" name="tenchuky" id="tenchuky" />
	</form>
	
	<aui:form action="<%=actionExport%>" method="POST" id="frm1" name = "myForm">
		<input name="" type="submit" id="sm" size="20" 	class="egov-button-normal" 
		value="Submit form Action" />
		
		<button type="submit">Vinh test</button>
	</aui:form>
	
</div>
<div>
	Action thành công, mở ra file Pdf
						<OBJECT data="<%=request.getContextPath()%>/export/ShipSecurityNotification.pdfs#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0" type="text/html" TITLE="SamplePdf" 
						WIDTH="100%" HEIGHT="800px"  style="background: white;min-height: 100%;"  >
						    <a href="<%=request.getContextPath()%>/html/company/giayxacnhannoidungquangcao.pdf">shree</a> 
						</object>
						
						
						
						<div class="media" style="width: 100%;height:100%; background-color: rgb(255, 255, 255);">
						<iframe width="100%" height="400" src="<%=request.getContextPath()%>/export/ShipSecurityNotification.pdfs">
						</iframe><div>PDF File</div></div>
</div>
