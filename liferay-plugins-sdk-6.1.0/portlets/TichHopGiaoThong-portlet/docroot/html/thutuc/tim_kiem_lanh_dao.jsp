<%@page import="vn.gt.utils.config.ConfigurationManager"%>
<%@page import="vn.gt.utils.DateUtils"%>
<%@page import="vn.gt.portlet.thutuc.LanhDaoAction"%>
<%@page import="vn.gt.portlet.thutuc.VanThuAction"%>
<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmShipAgencyLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmShipAgency"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortRegion"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtStatus"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGTShipPositionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGTShipPosition"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.danhmuc.service.DmShipTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmShipType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmState"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/datetimepicker.js?modified=<%=DateUtils.CURRENT_TIME_STAMP%>"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/dmShipAgencies.js?modified=<%=DateUtils.CURRENT_TIME_STAMP%>"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/findDmShipAgency.js?modified=<%=DateUtils.CURRENT_TIME_STAMP%>"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.autocomplete.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.mockjax.js"></script>
<script type="text/javascript">var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>

<%

	PortletURL searchThuTucUrl = renderResponse.createActionURL();
	searchThuTucUrl.setParameter(ActionRequest.ACTION_NAME, "searchThuTuc");
	
	List<DmState> states = DmStateLocalServiceUtil.getDmStates(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	List<DmShipType> dmShipTypes = DmShipTypeLocalServiceUtil.getDmShipTypes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	//Cang vu
	List<DmMaritime> maritimes = DmMaritimeLocalServiceUtil.getAll();
	if (maritimes == null) { maritimes = new ArrayList<DmMaritime>(); }
	
	// List Tau den - roi
	List<DmGTShipPosition> dmGTShipPositions = DmGTShipPositionLocalServiceUtil.findByRoleAndThuTuc(
		CheckBusinessUtil.getListShipPositionCode(MessageType.ROLE_THU_TUC, Utils.checkLoaiThuTuc(loaiThuTuc)));
	
	List<DmGtStatus> gtStatus = DmGtStatusLocalServiceUtil.findByType(MessageType.ROLE_THU_TUC);
	
	List<DmPort> dmPortsCangRoi = DmPortLocalServiceUtil.getDmPorts(0, 50);
	
	//---------- Dai Ly den & Dai ly di ----------
	List<DmShipAgency> dmShipAgencies = DmShipAgencyLocalServiceUtil.getDmShipAgencies(0, 5);
	
	User userLogin = PortalUtil.getUser(request);
	UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());

	if (Validator.isNull(portDefault)) {
		//not do something
	} else {
		if (Validator.isNull(maritimeCode)) {
			maritimeCode = portDefault.getPortCode();;
		}
	}
	
	boolean checkRoleBGTVT = false;
	UserPort userPort = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
	if (userPort == null) {
		checkRoleBGTVT= true;
	}
	
	String menuLoaiThuTuc = Utils.checkLoaiThuTuc(loaiThuTuc);

%>

<style>
 .autocomplete-suggestions {
    position: absolute;
    max-height: 300px;
    z-index: 9999;
    top: 121.8125px;
    display: block;
    left: 67% !important;
    width: 31.6% !important;
    background-color: antiquewhite;
    overflow-x: scroll !important;
    
    padding: 1px;
    margin: 0px;
    font: inherit;
    color: black;
    padding: 1px;
    font-family: inherit;
    font-size: inherit;
    font-style: inherit;
    font-variant: inherit;
    font-weight: inherit;
    font-stretch: inherit;
    line-height: inherit;
    background-color: white;
    border: 1px solid #d4d4d4 !important;
  }
  
  .autocomplete-selected {
    background-color: #7A9EE8;
  }
  
  .autocomplete-ajax{position: absolute; z-index: 2; background: transparent;}
  .autocomplete-ajax-x{color: #CCC; position: absolute; background: transparent; z-index: 1;}
</style>

<aui:form action="<%=searchThuTucUrl.toString() %>"	name="myForm" id="myForm" method="POST">
<div class="bgtlemain">
	<h2 class="tlemenu tlemain"><liferay-ui:message key="vn.dtt.thutuc.timkiem" /></h2>
	
	<!-- VaiTro -->
	<%@ include file="/html/menu/vai-tro.jsp"%>
</div>
<div class="wd-main-content wd-page-staff bgsearch">
	<div class="boxsearch">
		<!----------------------- column 1 ----------------------->
		<div class="tbl_left boxlabel">
			<table class="table_noboder">
				<thead>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.cangvu"/>
							<input type="hidden" name="<%=MenuConstraint.SESSION_MENU_SELECTED %>" id="<%=MenuConstraint.SESSION_MENU_SELECTED %>"	value="<%=LanhDaoAction.getUrlFlag( Utils.checkLoaiThuTuc(loaiThuTuc))%>" />
						</th>

						<%if (checkRoleBGTVT) { %>
							<td class="text-leftu">
								<select name="maritimeCode" id="maritimeCode" style="width: 98%;">
									<%if (Validator.isNull(portDefault)) {
										if (Validator.isNull(maritimeCode)) {%>
											<option selected value="LUA_CHON" style="width: 100%">---- Lựa chọn ------</option>
										<%} else {%>
											<option value="LUA_CHON" style="width: 100%">---- Lựa chọn ------</option>
										<%}%>
									<%} else {%>
										<option value="LUA_CHON" style="width: 100%">---- Lựa chọn ------</option>
									<%}%>
									
									<% for (DmMaritime item : maritimes) { %>
										<option
											<%=item.getMaritimeCode().trim().equals(maritimeCode) ? "selected" : "" %>
											value="<%=item.getMaritimeCode().trim()%>"><%=item.getCitycode() %>
										</option>
									<% } %>
								</select>
							</td>
						
						
						<%} else {%>
							<td class="text-leftu">
							
								<input type="hidden" name="maritimeCode" id="maritimeCode"	value="<%=maritimeCode%>" />
								<%
								DmMaritime dmMaritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(maritimeCode);
								if (dmMaritime!=null) {
								%>
									<%=dmMaritime.getCitycode() %>
								<%}%>
							</td>
						<%}%>
					</tr>
					
					<tr>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.tentau"/></th>
						<td class="text-leftu">
							<input type="text" class="egov-inputfield" style="width: 98%"
								name="shipName" id="shipName"	value="<%=shipName%>" />
						</td>
					</tr>
					
					<tr>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.taudenroi"/></th>
						<td class="text-leftu">
							<select name="shipPosition" id="shipPosition" style="width: 98%;">
								<%if (Utils.checkLoaiThuTuc(loaiThuTuc) == MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN
								|| Utils.checkLoaiThuTuc(loaiThuTuc) == MessageType.LOAT_THU_TUC_CHO_DONG_DAU
								|| Utils.checkLoaiThuTuc(loaiThuTuc) == MessageType.LOAT_THU_TUC_CHO_KY_SO) {%>
									<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
								<%}%>
								
								<%for (DmGTShipPosition item: dmGTShipPositions) {%>
									<option <%=FormatData.checkedData(item.getPositionCode(), shipPosition) %>
									value="<%=item.getPositionCode()%>"><%=item.getPositionName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
					
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.khuvuccang"/></th>
						<td class="text-leftu">
							<select name="portRegionCode" id="portRegionCode" style="width: 98%;">
								<option value="" style="width: 100%">---- Lựa chọn ------</option>
								<%
									//khu vuc cang
									List<DmPortRegion> portRegions = DmPortRegionLocalServiceUtil.findPortRegionByPortRegionRef(maritimeCode);
									if (Validator.isNull(portRegions)) { portRegions = new ArrayList<DmPortRegion>(); }
									for (DmPortRegion item : portRegions) { %>
									<option
										<%=item.getPortRegionCode().trim().equals(portRegionCode) ? "selected" : "" %>
										value="<%=item.getPortRegionCode()%>"><%=item.getPortRegionName() %></option>
								<% } %>
							</select>
						</td>
					</tr>
					
					<tr hidden="true">
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.trangthai"/></th>
						<td class="text-leftu">
							<select name="documentStatusCode" id="documentStatusCode" style="width: 98%;">
								<option value="" style="width: 100%">---- Lựa chọn ------</option>
								<%for (DmGtStatus item: gtStatus) {%>
									<option <%=FormatData.checkedData(String.valueOf(item.getStatusCode()), documentStatusCode) %>
										value="<%=item.getStatusCode()%>"><%=item.getStatusName()%></option>
								<%} %>
							</select>
						</td>
					</tr>
					
					<% if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == menuLoaiThuTuc
							|| MessageType.LOAT_THU_TUC_CHO_KY_SO == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.thutuc.cangden"/></th>
							<td class="text-leftu">
								<select name="portCode" id="portCode" style="width: 98%;">
									<%//TODO hash code cang den, do PortFindByLoCode, in db co portCode=null%>
									
									<%
									List<DmPort> dmPorts = null;
									if (Validator.isNull(maritimeCode)) {
										dmPorts = DmPortLocalServiceUtil.getDmPorts(0, 50);
										%>
										<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
									<%} else {
										dmPorts = DmPortLocalServiceUtil.findByLoCode(maritimeCode);
										%>
										<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%}%>
									
									<%
									if (Validator.isNull(dmPorts)) { dmPorts = new ArrayList<DmPort>(); };
									for (DmPort item: dmPorts) {
										%>
										<option value="<%=item.getPortCode()%>"
												<%=item.getPortCode().trim().equals(portCode) ? "selected" : ""%>><%=item.getPortName() %></option>
									<%}%>
								</select>
							</td>
						</tr>
						<tr>
							<th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.thutuc.cangroicuoicungcangdich"/></th>
							<td class="text-leftu">
								<select name="lastPortCode" id="lastPortCode" style="width: 98%;">
								<option value="" style="width: 100%">---- Lựa chọn ------</option>
								<%for (DmPort item: dmPortsCangRoi) {%>
									<option <%=FormatData.checkedData(item.getPortCode(), lastPortCode) %> 
										value="<%=item.getPortCode()%>"><%=item.getPortName() %></option>
								<%}%>
								</select>
							</td>
						</tr>
					<%}%>
					
					
				</thead>
			</table>
		</div>
		
		
		<!----------------------- column 2 ----------------------->
		<div class="tbl_left boxlabel">
			<table class="table_noboder">
				<thead>
					
					<tr>
						<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.mabankhai"/></th>
						<td class="text-leftu">
							<input type="text" class="egov-inputfield" style="width: 98%"
								name="maBanKhai" id="maBanKhai"	value="<%=maBanKhai%>" />
						</td>
					</tr>
					
					<tr>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.quoctich" /></th>
						<td class="text-leftu">
							<select name="stateCode" id="stateCode" style="width: 98%;">
								<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%for (DmState item : states) {%>
										<option
											<%=item.getStateCode().trim().equals(stateCode) ? "selected" : "" %>
											value="<%=item.getStateCode()%>" style="width: 100%"><%=item.getStateName()%></option>
									<%}%>
							</select>
						</td>
					</tr>
					
					
					<!-- thoi gian den form - to (nhap canh, qua canh), thoi gian roi form - to -->
					<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_QUA_CANH == menuLoaiThuTuc 
					    || MessageType.LOAT_THU_TUC_VAO_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigiandenFrom" /></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateFromStart"
										id="shipDateFromStart"
										value="<%=shipDateFromStart%>"
										onclick="gtCalendar('shipDateFromStart')"/>
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateFromStart')">
							</td>
						</tr>
					<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG == menuLoaiThuTuc 
								|| MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigianroiFrom"/></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateToStart"
										id="shipDateToStart"
										value="<%=shipDateToStart%>"
										onclick="gtCalendar('shipDateToStart')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateToStart')">
							</td>
						</tr>
					<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == menuLoaiThuTuc
							|| MessageType.LOAT_THU_TUC_CHO_KY_SO == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigiandenFrom" /></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateFromStart"
										id="shipDateFromStart"
										value="<%=shipDateFromStart%>"
										onclick="gtCalendar('shipDateFromStart')"/>
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateFromStart')">
							</td>
						</tr>
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigianroiFrom"/></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateToStart"
										id="shipDateToStart"
										value="<%=shipDateToStart%>"
										onclick="gtCalendar('shipDateToStart')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateToStart')">
							</td>
						</tr>
					<%}%>
	
					
					
					<tr>
						<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.ngaylamthutucfrom" /></th>
						<td class="text-leftu">
							<input type="text"
									class="egov-inputfield"
									style="width: 86%"
									name="ngayLamThuTucFrom"
									id="ngayLamThuTucFrom"
									value="<%=ngayLamThuTucFrom %>"
									onclick="gtCalendar('ngayLamThuTucFrom')"/>
							<img src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('ngayLamThuTucFrom')">
						</td>
					</tr>
					<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_QUA_CANH == menuLoaiThuTuc
							|| MessageType.LOAT_THU_TUC_VAO_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.thutuc.cangden"/></th>
							<td class="text-leftu">
								<select name="portCode" id="portCode" style="width: 98%;">
									<%//TODO hash code cang den, do PortFindByLoCode, in db co portCode=null%>
									
									<%
									List<DmPort> dmPorts = null;
									if (Validator.isNull(maritimeCode)) {
										dmPorts = DmPortLocalServiceUtil.getDmPorts(0, 50);
										%>
										<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
									<%} else {
										dmPorts = DmPortLocalServiceUtil.findByLoCode(maritimeCode);
										%>
										<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%}%>
									
									<%
									if (Validator.isNull(dmPorts)) { dmPorts = new ArrayList<DmPort>(); };
									for (DmPort item: dmPorts) {
										%>
										<option value="<%=item.getPortCode()%>"
												<%=item.getPortCode().trim().equals(portCode) ? "selected" : ""%>><%=item.getPortName() %></option>
									<%}%>
								</select>
							</td>
						</tr>
						
					<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG == menuLoaiThuTuc 
							|| MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.thutuc.cangroicuoicungcangdich"/></th>
							<td class="text-leftu">
								<select name="lastPortCode" id="lastPortCode" style="width: 98%;">
								<option value="" style="width: 100%">---- Lựa chọn ------</option>
								<%for (DmPort item: dmPortsCangRoi) {%>
									<option <%=FormatData.checkedData(item.getPortCode(), lastPortCode) %> 
										value="<%=item.getPortCode()%>"><%=item.getPortName() %></option>
								<%}%>
								</select>
							</td>
						</tr>
					<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == menuLoaiThuTuc
							|| MessageType.LOAT_THU_TUC_CHO_KY_SO == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.thutuc.dailyden"/></th>
							<td class="text-leftu">
								
								<input type="text" name="nameArrivalShipAgency" id="nameArrivalShipAgency" value="<%=nameArrivalShipAgency%>"/>
								<input type="hidden" name="nameArrivalShipAgency" id="autocomplete-ajax-ArrivalShipAgency"/>
								<input type="hidden" name="arrivalShipAgency" id="arrivalShipAgency" value="<%=arrivalShipAgency%>"/>
								
								<%--
								<input type="text" class="egov-inputfield" style="width: 98%" id="arrivalShipAgency" name="arrivalShipAgency" value="<%=arrivalShipAgency%>" />
								<select name="arrivalShipAgency" id="arrivalShipAgency" style="width: 98%;">
									<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%for (DmShipAgency item: dmShipAgencies) {%>
										<option <%=FormatData.checkedData(item.getShipAgencyCode(), arrivalShipAgency) %> 
											value="<%=item.getShipAgencyCode()%>"><%=item.getShipAgencyName() %></option>
									<%}%>
								</select>
								--%>
							</td>
						</tr>
						
					<%}%>
					
				</thead>
			</table>
		</div>
		
		
		<!----------------------- column 3 ----------------------->
		<div class="tbl_left boxlabel">
		    <table class="table_noboder">
		       <thead>
	                <tr>
	                    <%if (MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
							<th class="text-left" width="91px"><liferay-ui:message key="vn.dtt.thutuc.sodangky" /></th>
							<%} else  {%>
							<th class="text-left" width="91px"><liferay-ui:message key="vn.dtt.thutuc.hohieu" /></th>
							<%} %>
	                     <td class="text-leftu">
	                        <input type="text" class="egov-inputfield" style="width: 98%"
								name="callSign" id="callSign" value="<%=callSign%>" />
	                     </td>
	                </tr>
	                
	                <tr>
	                    <th class="text-left" width="91px"><liferay-ui:message key="vn.dtt.thutuc.IMO" /></th>
	                     <td class="text-leftu">
	                        <input type="text" class="egov-inputfield" style="width: 98%"
								name="imo" id="imo"	value="<%=imo%>" />
	                     </td>
					</tr>
					
					<!-- thoi gian den form - to (nhap canh, qua canh), thoi gian roi form - to -->
					<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_QUA_CANH == menuLoaiThuTuc 
							|| MessageType.LOAT_THU_TUC_VAO_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigiandenTo"/></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateFromEnd"
										id="shipDateFromEnd"
										value="<%=shipDateFromEnd%>"
										onclick="gtCalendar('shipDateFromEnd')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateFromEnd')">
							</td>
						</tr>
						
					<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG == menuLoaiThuTuc
							|| MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigianroiTo"/></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateToEnd"
										id="shipDateToEnd"
										value="<%=shipDateToEnd%>"
										onclick="gtCalendar('shipDateToEnd')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateToEnd')">
							</td>
						</tr>
					<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == menuLoaiThuTuc
							|| MessageType.LOAT_THU_TUC_CHO_KY_SO == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigiandenTo"/></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateFromEnd"
										id="shipDateFromEnd"
										value="<%=shipDateFromEnd%>"
										onclick="gtCalendar('shipDateFromEnd')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateFromEnd')">
							</td>
						</tr>
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigianroiTo"/></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateToEnd"
										id="shipDateToEnd"
										value="<%=shipDateToEnd%>"
										onclick="gtCalendar('shipDateToEnd')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateToEnd')">
							</td>
						</tr>
					<%}%>
					
	                
	                
	                <tr>
						<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.thutuc.ngayLamThuTucTo"/></th>
						<td class="text-leftu">
							<input type="text"
									class="egov-inputfield"
									style="width: 86%"
									name="ngayLamThuTucTo"
									id="ngayLamThuTucTo"
									value="<%=ngayLamThuTucTo%>"
									onclick="gtCalendar('ngayLamThuTucTo')" />
							<img src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('ngayLamThuTucTo')">
						</td>
					</tr>
					
					<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_QUA_CANH == menuLoaiThuTuc 
							|| MessageType.LOAT_THU_TUC_VAO_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.thutuc.dailyden"/></th>
							<td class="text-leftu">
								<%--
								<aui:input name="nameArrivalShipAgency" value='<%=nameArrivalShipAgency%>' label="" id="nameArrivalShipAgency">
									<aui:validator name="minLength" errorMessage="Đề nghị nhập tối thiểu 5 kí tự đề tìm kiếm theo Đại lý đến !" >5</aui:validator>
								</aui:input>
								 --%>
								<input type="text" name="nameArrivalShipAgency" id="nameArrivalShipAgency" value="<%=nameArrivalShipAgency%>"/>
								<input type="hidden" name="nameArrivalShipAgency" id="autocomplete-ajax-ArrivalShipAgency"/>
								<input type="hidden" name="arrivalShipAgency" id="arrivalShipAgency" value="<%=arrivalShipAgency%>"/>
								
								<%--
								
								<input type="text" class="egov-inputfield" style="width: 98%" id="arrivalShipAgency" name="arrivalShipAgency" value="<%=arrivalShipAgency%>" />
								<select name="" id="arrivalShipAgency" style="width: 98%;">
									<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%for (DmShipAgency item: dmShipAgencies) {%>
										<option <%=FormatData.checkedData(item.getShipAgencyCode(), arrivalShipAgency) %> 
											value="<%=item.getShipAgencyCode()%>"><%=item.getShipAgencyName() %></option>
									<%}%>
								</select>
								--%>
							</td>
						</tr>
					<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG == menuLoaiThuTuc
							|| MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc) {%>
						<tr>
							<th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.thutuc.dailydi"/></th>
							<td class="text-leftu">
							
								<input type="text" name="nameDepartureShipAgency" id="nameDepartureShipAgency" value="<%=nameDepartureShipAgency%>"/>
								<input type="hidden" name="nameDepartureShipAgency" id="autocomplete-ajax-DepartureShipAgency"/>
								<input type="hidden" name="departureShipAgency" id="departureShipAgency" value="<%=departureShipAgency%>"/>
								
								<%--
								<input type="text" class="egov-inputfield" style="width: 98%" id="departureShipAgency" name="departureShipAgency" value="<%=departureShipAgency%>" />
								<select name="departureShipAgency" id="departureShipAgency" style="width: 98%;">
									<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<% for (DmShipAgency item: dmShipAgencies) { %>
										<option <%=FormatData.checkedData(item.getShipAgencyCode(), departureShipAgency) %> 
											value="<%=item.getShipAgencyCode()%>"><%=item.getShipAgencyNameVN() %></option>
									<% } %>
								</select>
								--%>
							</td>
						</tr>
					<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == menuLoaiThuTuc
							|| MessageType.LOAT_THU_TUC_CHO_KY_SO == menuLoaiThuTuc) {%>						
						<tr>
							<th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.thutuc.dailydi"/></th>
							<td class="text-leftu">
								
								<input type="text" name="nameDepartureShipAgency" id="nameDepartureShipAgency" value="<%=nameDepartureShipAgency%>" />
								<input type="hidden" name="nameDepartureShipAgency" id="autocomplete-ajax-DepartureShipAgency"/>
								<input type="hidden" name="departureShipAgency" id="departureShipAgency" value="<%=departureShipAgency%>"/>
								
								<%--
								<input type="text" class="egov-inputfield" style="width: 98%" id="departureShipAgency" name="departureShipAgency" value="<%=departureShipAgency%>" />
								<select name="departureShipAgency" id="departureShipAgency" style="width: 98%;">
									<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<% for (DmShipAgency item: dmShipAgencies) { %>
										<option <%=FormatData.checkedData(item.getShipAgencyCode(), departureShipAgency) %> 
											value="<%=item.getShipAgencyCode()%>"><%=item.getShipAgencyNameVN() %></option>
									<% } %>
								</select>
								--%>
							</td>
						</tr>
					<%}%>


					<!-- ma loai ho so -->
					<tr style="display: none">
						<th class="text-left" width="107px"><liferay-ui:message key="vn.dtt.thutuc.maloaihoso" /></th>
						<td class="text-leftu">
							<input type="text" class="egov-inputfield" style="width: 98%"
							name="documentTypeCode" id="documentTypeCode"	value="<%= Utils.checkLoaiThuTuc(loaiThuTuc)%>" />
						</td>
					</tr>
	        	</thead>
	    	</table>
		</div>
	    <div class="wd-select">
	    	<%--
	        <button type="button" onclick="if(validatorDataForm()) summitForm('<%=searchThuTucUrl.toString()%>')">
	        	<i class="icon-fl ico_icon-search">
	        	</i><liferay-ui:message key="vn.dtt.thutuc.timkiem" />
	        </button>
	         --%>
	         <button type="submit" >
	        	<i class="icon-fl ico_icon-search">
	        	</i><liferay-ui:message key="vn.dtt.thutuc.timkiem" />
	        </button>
	    </div>  
	</div>  
</div>
</aui:form>

<portlet:actionURL var="findPortRegionAndPortBymaritimeCode" name="findPortRegionAndPortBymaritimeCode"/>
<script>
var url = '<%=findPortRegionAndPortBymaritimeCode.toString()%>';

$(document).ready(function() {
	changeDmGtStatus();
	
	$('#shipPosition').change(function(event){
		changeDmGtStatus();
	});

	function changeDmGtStatus(){				
		var menuThuTuc = '<%=loaiThuTuc%>';
		var ttNc = '<%=MessageType.LOAT_THU_TUC_NHAP_CANH%>';		
		
		// Thu tuc - Nhap canh, bo 'De nghi cap giay phep'
		if(menuThuTuc == ttNc){						
			$('#documentStatusCode option').each(function(){
				var statusCode = $(this).val();
				var statusName = $(this).text();					
							
				if(statusCode == 20){													
					$(this).hide();
				}else{
					$(this).show();			
				}			
			});							
		}
	}


	$('#maritimeCode').change(function(event) {
		
		var code = $("select#maritimeCode").val();
		if (code == "")
			return;
		$.ajax({
			type : 'POST',
			url : url,
			data : {
				maritimeCode : code
			},
			success : function(dataJSON) {
				//preferred
				var data2 = JSON.parse(dataJSON);
				
				console.log(data2);
				
				//khu vuc cang
				var selPortRegion = $('#portRegionCode');
				selPortRegion.find('option').remove();//xoa du lieu cu trong khu vuc cang

				$('<option>').val("").text("---- Lựa chọn ------").appendTo(selPortRegion);
				for ( var i = 0; i < data2.idPortRegion.length; i++) {
					$('<option>').val(data2.idPortRegion[i]).text(data2.namePortRegion[i]).appendTo(selPortRegion);
				};

				//Cang den
				var selPortCode = $('#portCode');
				selPortCode.find('option').remove();//xoa du lieu
				$('<option>').val("").text("---- Lựa chọn ------").appendTo(selPortCode);
				for ( var i = 0; i < data2.idPort.length; i++) {
					$('<option>').val(data2.idPort[i]).text(data2.namePort[i]).appendTo(selPortCode);
				}
			}
		});
	});
});

function summitForm(url) {
	//var urlAction = document.getElementById('<portlet:namespace/>myForm').action;
	//if (urlAction == '') {
	//	document.getElementById('<portlet:namespace/>myForm').action = url;
	//}
	//document.getElementById('<portlet:namespace/>myForm').submit();
	/**
	$('#<portlet:namespace/>myForm').submit(function() { //listen for submit event
		$.each(params, function(i, param) {
			$('<input />').attr('type', 'hidden').attr('name', param.name).attr('value', param.value).appendTo('#<portlet:namespace/>myForm');
			$('<input />').attr('type', 'text').attr('name', param.name).attr('value', param.value).appendTo('#<portlet:namespace/>myForm');
			$('<select />').attr('name', param.name).attr('value', $('option:selected', param)).appendTo('#<portlet:namespace/>myForm');
		});
		return true;
	});
	document.getElementById('<portlet:namespace/>myForm').submit()
	*/
}

function validatorDataForm() {
	var nameArrivalShipAgency = $('#nameArrivalShipAgency').val();
	var nameDepartureShipAgency = $('#nameDepartureShipAgency').val();
	
	nameArrivalShipAgency = $.trim(nameArrivalShipAgency);
	nameDepartureShipAgency = $.trim(nameDepartureShipAgency);

	
	if (typeof nameArrivalShipAgency != 'undefined' && nameArrivalShipAgency.length > 0 && nameArrivalShipAgency.length < 5) {
		alert("Đề nghị nhập tối thiểu 5 kí tự đề tìm kiếm theo Đại lý đến !");
		return false;
	} else if (typeof nameDepartureShipAgency != 'undefined' && nameDepartureShipAgency.length > 0 && nameDepartureShipAgency.length < 5) {
		alert("Đề nghị nhập tối thiểu 5 kí tự đề tìm kiếm theo Đại lý đi !");
		return false;
	} else {
		return true;
	}
}

/**
$('#<portlet:namespace/>myForm').keypress(function(event) {
	if (event.keyCode == 10 || event.keyCode == 13) {
		event.preventDefault();
	}
});
*/

</script>