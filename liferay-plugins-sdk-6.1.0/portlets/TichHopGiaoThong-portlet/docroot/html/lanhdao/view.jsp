<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/datetimepicker.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />
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
	String requestCodethuTuc = renderRequest.getParameter(PageType.REQUEST_CODE);
	if (requestCodethuTuc == null) {
		requestCodethuTuc = "";
	}
	
	///
	String maritimeCode= ParamUtil.getString(request, "maritimeCode").trim();
	String portCode= ParamUtil.getString(request, "portCode").trim();
	String lastPortCode= ParamUtil.getString(request, "lastPortCode").trim();
	
	String shipName= ParamUtil.getString(request, "shipName").trim(); 
	String stateCode= ParamUtil.getString(request, "stateCode").trim();
	String callSign= ParamUtil.getString(request, "callSign").trim();
	String imo= ParamUtil.getString(request, "imo").trim();
	
	String shipPosition= ParamUtil.getString(request, "shipPosition").trim();
	
	String shipDateFromStart = ParamUtil.getString(request, "shipDateFromStart").trim();
	String shipDateFromEnd = ParamUtil.getString(request, "shipDateFromEnd").trim();
	
	String shipDateToStart = ParamUtil.getString(request, "shipDateToStart").trim();
	String shipDateToEnd = ParamUtil.getString(request, "shipDateToEnd").trim();
	
	String ngayLamThuTucFrom = ParamUtil.getString(request, "ngayLamThuTucFrom").trim();
	String ngayLamThuTucTo = ParamUtil.getString(request, "ngayLamThuTucTo").trim();
	
	String maBanKhai = ParamUtil.getString(request, "maBanKhai");
	
	String documentStatusCode = ParamUtil.getString(request, "documentStatusCode").trim();
	
	String arrivalShipAgency= ParamUtil.getString(request, "arrivalShipAgency").trim();//id
	String nameArrivalShipAgency = ParamUtil.getString(request, "nameArrivalShipAgency").trim();//name
	
	String departureShipAgency= ParamUtil.getString(request, "departureShipAgency").trim();//id
	String nameDepartureShipAgency= ParamUtil.getString(request, "nameDepartureShipAgency").trim();//name
	
	String portRegionCode = ParamUtil.getString(request, "portRegionCode").trim();
	
	if (documentStatusCode.trim().length() == 0) {
		//documentStatusCode=CheckBusinessUtil.getTrangThaiHoSoDefaultForm(MessageType.ROLE_THU_TUC);
	}
// 	(String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE)
%>
<div class="wd-content-container">
	<%@ include file="/html/menu/menu-left-lanh-dao.jsp"%>
	<%
	if (pageType.trim().length() > 0  && FormatData.convertToInt(pageType.toString()) == PageType.THU_TUC_DETAIL) {
	%>
		<%@ include file="/html/thutuc/thong_tin_chung_ho_so.jsp"%>
	<%} else {%>
		<%@ include file="/html/thutuc/tim_kiem_lanh_dao.jsp"%>
	<%
	}
	%>
</div>
<%
if (pageType.trim().length() == 0 || FormatData.convertToInt(pageType.toString()) == PageType.THU_TUC_LIST) {
%>
	<%@ include file="/html/thutuc/ket_qua_tim_kiem_lanh_dao.jsp"%>
<%
}
%>