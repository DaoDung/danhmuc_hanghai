<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.autosize.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/datetimepicker.js"></script>
<!-- Add them moment.js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/moment.js"></script>

<%
	String pageType = renderRequest.getParameter(PageType.PAGE_TYPE);
	if (pageType == null || pageType.toString().trim().length() == 0) {
		if (renderRequest.getAttribute(PageType.PAGE_TYPE) != null) {
			 pageType = renderRequest.getAttribute(PageType.PAGE_TYPE).toString();
		}
	}
	if (pageType == null) {
		pageType = "";
	}
	String titleListVersionHoSo = "";
	String documentName = renderRequest.getParameter(PageType.DOCUMENT_NAME);
	String messageType = renderRequest.getParameter(PageType.MESSAGE_TYPE);
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
	String requestCodeKeHoach = renderRequest.getParameter(PageType.REQUEST_CODE);
	if (requestCodeKeHoach == null) {
		requestCodeKeHoach = "";
	}
	if (messageType == null) {
		messageType = "";
	}
	
	
	LogFactoryUtil.getLog(KeHoachAction.class).info("==view.jsp===pageType===== " + pageType);
	LogFactoryUtil.getLog(KeHoachAction.class).info("==view.jsp===MessageType===== " + messageType);
%>

<div class="wd-content-container">
	<%@ include file="/html/menu/menu-left-ke-hoach.jsp"%>
	
	<%
	if (pageType.trim().length() > 0  && FormatData.convertToInt(pageType.toString()) == PageType.KE_HOACH_DETAIL) {
	%>
		<%@ include file="/html/kehoach/thong_tin_chung_ho_so.jsp"%>
	<%
	} else {
	%>
		<jsp:include page="/html/kehoach/tim_kiem_ke_hoach.jsp"></jsp:include>
	<%
	}
	%>
</div>
<%if (pageType.trim().length() == 0 || FormatData.convertToInt(pageType.toString()) == PageType.KE_HOACH_LIST) {%>
	<jsp:include page="/html/kehoach/ket_qua_tim_kiem_ke_hoach.jsp"></jsp:include>
<%}%>



<%! private static Log _log = LogFactoryUtil.getLog("html.kehoach.view.jsp"); %>