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

<script type="text/javascript" src="<%=request.getContextPath()%>/js/datetimepicker.js"></script>
<script type="text/javascript">var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<style>
.bt { float: center; }
</style>
<%
	User userLogin = PortalUtil.getUser(request);
	UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
	
	if (Validator.isNull(portDefault)) {
		//not do something
	} else {
		if (Validator.isNull(maritimeCode)) {
			maritimeCode = portDefault.getPortCode();;
		}
	}
	List<DmMaritime> allDmMaritimes = DmMaritimeLocalServiceUtil.getAll();
	
	List<DmGtReportTemplate> allReportTemplate = DmGtReportTemplateLocalServiceUtil.findByreportType(BaoCaoConstant.LOAI_BAO_CAO_TONG_HOP);
	
	if (allDmMaritimes != null) {
		System.out.println("tim_kiem_bao_cao.jsp---danh muc allDmMaritimes size:  " + allDmMaritimes.size());
	}
	
	if (allDmMaritimes == null) { 
		allDmMaritimes = new ArrayList<DmMaritime>(); 
	}
	
	PortletURL actionUrlTimKiemTau = renderResponse.createActionURL();
	actionUrlTimKiemTau.setParameter(ActionRequest.ACTION_NAME, "searchReportShipInMaritime");
	
	Calendar c = Calendar.getInstance();
	c.add(Calendar.DAY_OF_YEAR, -1);
	Date yesterday = c.getTime();

%>
<aui:form action="<%=actionUrlTimKiemTau.toString() %>"	name="userForm" id="userForm"	method="POST">
	<div class="bgtlemain timkiemfull">
	     <h2 class="tlemenu tlemain"><liferay-ui:message key="vn.dtt.baocao.timkiem" /></h2>
	     <!-- VaiTro -->
	     <%@ include file="/html/menu/vai-tro.jsp"%>
	</div>
	<div class="wd-main-content wd-page-staff bgsearch">
	<div class="boxsearch" width="60%">
		<div class="tbl_center boxlabel" width="60%">
			<div class="tbl_left boxlabel" style="width: 49%">
				<table class="table_noboder">
					<thead>
						<tr>
							<th class="text-left" width="25%"><liferay-ui:message key="Loại báo cáo"/></th>
							<td class="text-leftu">
								<select name="<%=BaoCaoConstant.MAU_BAO_CAO %>" id="<%=BaoCaoConstant.MAU_BAO_CAO %>" required="true">
									<%if (Validator.isNull(reportCode)) {%>
										<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
									<%} else {%>
										<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%}%>
									
									<% for (DmGtReportTemplate item : allReportTemplate) { %>
										<option
											<%=String.valueOf(item.getReportCode()).trim().equals(reportCode) ? "selected" : "" %>
											value="<%=String.valueOf(item.getReportCode()).trim()%>"><%=item.getReportName() %>
										</option>
									<% } %>
								</select>
							</td>
						</tr>
						<tr>
							<th class="text-left" width="25%"><liferay-ui:message key="vn.dtt.baocao.cangvu"/></th>
							<td class="text-leftu">
								<select name="maritimeCode" id="maritimeCode">
									<%if (Validator.isNull(portDefault)) {
											if (Validator.isNull(maritimeCode)) {%>
												<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
											<%} else {%>
												<option value="" style="width: 100%">---- Lựa chọn ------</option>
											<%}%>
									<%} else {%>
											<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%}%>
									
									<% for (DmMaritime item : allDmMaritimes) { %>
										<option
											<%=item.getMaritimeCode().trim().equals(maritimeCode) ? "selected" : "" %>
											value="<%=item.getMaritimeCode().trim()%>"><%=item.getCitycode() %>
										</option>
									<% } %>
								</select>
							</td>
						</tr>
						<tr>
							<th class="text-left" width="25%"><liferay-ui:message key="vn.dtt.baocao.tungay"/></th>
							<td class="text-leftu">
								<input type="text" class="egov-inputfield" style="width: 91%" required="true" 
										name="tuNgay"
										id="tuNgay" 
										value="<%=Validator.isNotNull(tuNgay) ? tuNgay : FormatData.parseDateToTringType3(yesterday) %>"
										onclick="gtCalendar('tuNgay')">
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('tuNgay')">
							</td>
						</tr>
					</thead>
				</table>
			</div>
			<div class="tbl_left boxlabel" style="width: 49%">
				<table class="table_noboder">
					<thead>
						<tr>
							<td class="text-leftu"><div style="height: 25px"></div></td>
						</tr>
						<tr>
							<th class="text-left" width="25%"><liferay-ui:message key="vn.dtt.baocao.ngaylap"/></th>
							<td class="text-leftu">
								<input type="text" class="egov-inputfield" style="width: 91%" required="true" 
										name="ngayLap" 
										id="ngayLap" 
										value="<%=Validator.isNotNull(ngayLap) ? ngayLap : FormatData.parseDateToTringType3(new Date()) %>"
										onclick="gtCalendar('ngayLap')">
										
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('ngayLap')">
							</td>
						</tr>
						<tr>
							<th class="text-left" width="25%" id ='labelDenNgay'><liferay-ui:message key="vn.dtt.baocao.denngay"/></th>
							<td class="text-leftu">
								<input type="text" class="egov-inputfield" style="width: 91%" required="true"
										name="denNgay"
										id="denNgay" 
										value="<%=Validator.isNotNull(denNgay) ? denNgay : FormatData.parseDateToTringType3(new Date()) %>"
										onclick="gtCalendar('denNgay')">
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('denNgay')">
							</td>
						</tr>
					</thead>
				</table>
			</div>
		</div>
			
		<div class="wd-select">
			<button type="submit">
				<i class="icon-fl ico_icon-search"></i><liferay-ui:message key="vn.dtt.baocao.timkiem"/>
			</button>
		</div>
	</div>
</div>
</aui:form>

<script type="text/javascript">
     var Accordion1 = new Spry.Widget.Accordion("Accordion1");
     var Accordion2 = new Spry.Widget.Accordion("Accordion2");

     function goBack() {
         //window.history.back()
         window.history.go(-2);
     }

     function summitForm(url) {
         alert();
         document.getElementById('userForm').action = url;
               document.getElementById('userForm').submit();
     }

     function displayInputReject() {
         var component = document.getElementById('reject_data');
         if (component.style.display == 'none') { 
             component.style.display = '';
         } else if (component.style.display == '') { 
             component.style.display = 'none';
         }
    }

     function validatorGiayPhepRoiCang() {
 		var valDenNgay = $.trim($("input[id=denNgay]").val());
 		var valTuNgay = $.trim($("input[id=tuNgay]").val());
 		if (valDenNgay < valTuNgay) {
 			alert("Đến ngày nhỏ hơn từ ngày, nhập lại dữ liệu");
 			document.getElementById('denNgay').focus();
 			document.getElementById('labelDenNgay').style.color ='red';
 		} else {
 			return true;
 		}
 	}
</script>
