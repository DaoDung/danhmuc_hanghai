
<%@page import="com.liferay.portal.model.Organization"%>
<%@ include file="/html/init.jsp"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.1.js"></script>
<link href='<%= request.getContextPath() + "/css/bootstrap.min.css" %>' rel="stylesheet">
<link href='<%= request.getContextPath() + "/css/font-awesome.min.css" %>' rel="stylesheet">

<style type="text/css">
	a.btn-primary {
		color: #FFF !important;
	}
	
	button.btn {
		text-shadow: initial !important;
	}
	
	button.btn:HOVER,
	button.btn:VISITED {
		background-image: none !important;
	}
	
	.portlet-msg-success {
		display: none;
	}
	
	.file-preview {
		margin-bottom: 5px;
	}
	
	.container-user-sign {
		margin: 20px;
	}
	/* Fix alignment issue of label on extra small devices in Bootstrap 3.2 */
	.form-horizontal .control-label{
		padding-top: 2px;
	}
</style>

<%
String returnUrl = "/web/guest";
if (user != null) {
	List<Organization> organizations = user.getOrganizations();
	
	if (organizations.size() > 0 ) {
		returnUrl = "/group" + organizations.get(0).getGroup().getFriendlyURL();
	}
}
%>
