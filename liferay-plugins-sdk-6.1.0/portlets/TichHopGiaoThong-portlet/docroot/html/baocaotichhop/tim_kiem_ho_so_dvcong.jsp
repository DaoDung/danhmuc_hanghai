<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="java.util.Date"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtReportTemplateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtReportTemplateLocalService"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtReportTemplate"%>
<%@page import="vn.gt.portlet.baocao.BaoCaoConstant"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/datetimepicker_tichhop.js"></script>
<script type="text/javascript">	
	var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>
<style>
.bt{
   float: center;
}
</style>
<%
List<Layout> rootLayouts = LayoutLocalServiceUtil.getLayouts(themeDisplay.getLayout().getGroup().getGroupId(),true);
String requestUrl = themeDisplay.getURLCurrent().replaceAll("%2F", "/");

PortletURL actionUrlTimKiemHoSo = renderResponse.createActionURL();
actionUrlTimKiemHoSo.setParameter(ActionRequest.ACTION_NAME, "searchHoSoDichVuHanhChinhCongMotCua");


Calendar cal = Calendar.getInstance();
cal.set(Calendar.DAY_OF_MONTH, 1);
Date firstDayOfMonth = cal.getTime();

cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
Date lastDateOfMonth = cal.getTime();

%>

	<p class="tieude"><liferay-ui:message key="vn.dtt.baocao.timkiem.tieude"/></p>
	<aui:form action="<%=actionUrlTimKiemHoSo.toString() %>"	name="userForm" id="userForm"	method="POST" style="margin-top: 30px">
		
					<table class="tble_bg" border="0" cellpadding="0" style="border-collapse: collapse" width="100%">
						<thead>
							
							<tr>
								<td class="tble_bg_textright" style="width: 10%"><liferay-ui:message key="vn.dtt.baocao.tungay"/></td>
								<td class="text-leftu">
									<input type="text"
											name="tuNgay"
											style="width: 80%"
											required="true" id="tuNgay" 
											value="<%=Validator.isNotNull(tuNgay) ? tuNgay : FormatData.parseDateToTringType3(firstDayOfMonth) %>"
											onclick="gtCalendar('tuNgay')">
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('tuNgay')">
								</td>
								<td class="tble_bg_textright" style="width: 12%"><liferay-ui:message key="vn.dtt.baocao.denngay"/></td>
								<td class="text-leftu">
									<input type="text"
											name="denNgay"
											style="width: 80%"
											required="true" 
											id="denNgay" 
											value="<%=Validator.isNotNull(denNgay) ? denNgay : FormatData.parseDateToTringType3(new Date()) %>"
											onclick="gtCalendar('denNgay')">
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('denNgay')">
								</td>
								<td style="width: 20%">
									<button class="bt" type="submit">
										<i class="icon-fl ico_icon-search"></i><liferay-ui:message key="vn.dtt.baocao.timkiem"/>
									</button>
								</td>
							</tr>
						</thead>
					</table>
				
	</aui:form>
	<h1 class="tlemenu"><liferay-ui:message key="vn.dtt.baocao.thongke.noidungthongke"/></h1>
