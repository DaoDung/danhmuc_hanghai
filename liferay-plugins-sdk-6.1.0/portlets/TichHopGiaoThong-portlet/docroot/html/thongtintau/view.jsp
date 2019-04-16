<%@page import="vn.gt.portlet.thongtintau.ThongTinTauUtils"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gt.portlet.thongtintau.ThongTinTauAction"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="java.util.List"%>

<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8"%>

<%
List<Layout> rootLayoutsInstance = LayoutLocalServiceUtil.getLayouts(themeDisplay.getLayout().getGroup().getGroupId(), themeDisplay.getLayout().getPrivateLayout());
String flagLanguage = "VN";
if (themeDisplay.getScopeGroup().getName().equalsIgnoreCase("guest")) {
	flagLanguage = "EN";
}
//String loaiThuTuc = Validator.isNotNull(renderRequest.getParameter("loaiThuTuc")) ? renderRequest.getParameter("loaiThuTuc") : "";
String maritimeCode= ParamUtil.getString(request, "maritimeCode").trim();
String portCode= ParamUtil.getString(request, "portCode").trim();
String shipName = ParamUtil.getString(request, "shipName").trim();
String callSign = ParamUtil.getString(request, "callSign").trim();
String shipDateFrom = ParamUtil.getString(request, "shipDateFrom").trim();
String shipDateTo = ParamUtil.getString(request, "shipDateTo").trim();
String certificateNumber = ParamUtil.getString(request, "certificateNumber").trim();
String flagMenu = ParamUtil.getString(request, "flagMenu").trim();
%>

<div class="wd-content-container">
    <%@ include file="/html/thongtintau/menu-left-thong-tin-tau.jsp"%>
    <%@ include file="/html/thongtintau/tim_kiem_thong_tin_tau.jsp"%>
</div>

<%@ include file="/html/thongtintau/ket_qua_tim_kiem_thong_tin_tau.jsp"%>