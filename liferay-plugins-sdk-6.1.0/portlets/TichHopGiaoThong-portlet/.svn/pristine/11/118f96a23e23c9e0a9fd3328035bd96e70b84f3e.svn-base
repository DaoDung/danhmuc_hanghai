<%@page pageEncoding="UTF-8"%>

<%
String isSuaLenhDieuDong = ParamUtil.getString(request, PageType.SUA_LENH_DIEU_DONG).trim();

if (flagKeHoachLenhDieuDong == false || (isSuaLenhDieuDong != null && isSuaLenhDieuDong.length() > 0)) {
%>
    <jsp:include page="/html/kehoach/cap_lenh_dieu_dong.jsp"/>
    <%
} else if (flagKeHoachLenhDieuDong == true) {
%>
	
    <div class="AccordionPanelContent">
    	<jsp:include page="/html/report_export.jsp"/>
    </div>
<%
}
%>