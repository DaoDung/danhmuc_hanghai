<%@page import="vn.gt.utils.config.ConfigurationManager"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.gt.utils.ConvertUtil"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="java.util.Date"%>
<%@page import="vn.gt.dao.danhmuc.service.DmStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmState"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortRegion"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGTShipPositionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGTShipPosition"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtStatus"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.portlet.Utils" %>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>


<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>

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
    
    String documentName = renderRequest.getParameter(PageType.DOCUMENT_NAME);
    String messageType = renderRequest.getParameter(PageType.MESSAGE_TYPE);
    int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
    
    String loaiThuTuc = "";
    if (portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE) != null) {
        loaiThuTuc = (String) portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
    }
    
    //Cang vu
    List<DmMaritime> maritimes = DmMaritimeLocalServiceUtil.getAll();
    if (maritimes == null) {
        maritimes = new ArrayList<DmMaritime>();
    }
    
    //Trang thai ke hoach, type = 2;
    int typeKEHOACH = 2;
    List<DmGtStatus> statusKeHoachs = DmGtStatusLocalServiceUtil.findByType(typeKEHOACH);
    if (statusKeHoachs == null) {
        statusKeHoachs = new ArrayList<DmGtStatus>();
    }
    
    //Tau den/roi
    List<DmGTShipPosition> shipPositions = DmGTShipPositionLocalServiceUtil.findByRoleAndThuTuc(
    		CheckBusinessUtil.getListShipPositionCode(MessageType.ROLE_KE_HOACH, Utils.checkLoaiThuTuc(loaiThuTuc)));
    if (shipPositions == null) {
        shipPositions = new ArrayList<DmGTShipPosition>();
    }
    
    //quoc tich
    List<DmState> states = DmStateLocalServiceUtil.getDmStates(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
    if (states == null) {
        states = new ArrayList<DmState>();
    }
    
    String holdMaritimeCode = request.getParameter(KeyParams.MARITIME_CODE);
    String holdShipName = request.getParameter(KeyParams.SHIP_NAME);
    String holdPositionCode = request.getParameter(KeyParams.POSITION_CODE);
    String holdPortRegionCode = request.getParameter(KeyParams.PORT_REGION_CODE);
    String holdMabankhai = request.getParameter(KeyParams.MA_BAN_KHAI);
    String holdStateCode = request.getParameter(KeyParams.STATE_CODE);
    
    String holdShipDateFromStart = request.getParameter(KeyParams.SHIP_DATE_FROM_START);
    String holdShipDateFromEnd = request.getParameter(KeyParams.SHIP_DATE_FROM_END);
    
    String holdShipDateToStart = request.getParameter(KeyParams.SHIP_DATE_TO_START);
    String holdShipDateToEnd = request.getParameter(KeyParams.SHIP_DATE_TO_END);
    
    
    String holdRequestState = request.getParameter(KeyParams.REQUEST_STATUS);
    String holdCallSign = request.getParameter(KeyParams.CALL_SIGN);
    String holdIMO = request.getParameter(KeyParams.IMO);
    
    String holdNgayLamThuTucFrom = ParamUtil.getString(request, "ngayLamThuTucFrom").trim();
    String holdNgayLamThuTucTo = ParamUtil.getString(request, "ngayLamThuTucTo").trim();
	
    String maBanKhai = ParamUtil.getString(request, "maBanKhai");
    
    //if (Validator.isNull(holdMaritimeCode)) { holdMaritimeCode = "12"; }
    if (Validator.isNull(holdShipName)) { holdShipName = ""; }
    if (Validator.isNull(holdPositionCode)) { holdPositionCode = ""; }
    if (Validator.isNull(holdPortRegionCode)) { holdPortRegionCode = ""; }
    
    if (Validator.isNull(holdMabankhai)) { holdMabankhai = ""; }
    if (Validator.isNull(holdStateCode)) { holdStateCode = ""; }
    
    if (Validator.isNull(holdShipDateFromStart)) { holdShipDateFromStart = ""; }
    if (Validator.isNull(holdShipDateFromEnd)) { holdShipDateFromEnd = ""; }
    
    if (Validator.isNull(holdShipDateToStart)) { holdShipDateToStart = ""; }
    if (Validator.isNull(holdShipDateToEnd)) { holdShipDateToEnd = ""; }
    
    if (Validator.isNull(holdRequestState)) { holdRequestState = ""; }
    if (Validator.isNull(holdCallSign)) {holdCallSign = "";}
    if(Validator.isNull(holdIMO)) { holdIMO = ""; }
    
    User userLogin = PortalUtil.getUser(request);
    UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
    
    if (Validator.isNull(portDefault)) {
        //not do something
    } else {
        if (Validator.isNull(holdMaritimeCode)) {
            holdMaritimeCode = portDefault.getPortCode();
            
        }
    }
    boolean checkRoleBGTVT = false;
    UserPort userPort = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
    if (userPort == null) {
    	checkRoleBGTVT= true;
    }
    
    String menuLoaiThuTuc = Utils.checkLoaiThuTuc(loaiThuTuc);
	
    
    
    PortletURL actionUrltimkiemKeHoach = renderResponse.createActionURL();
    actionUrltimkiemKeHoach.setParameter(ActionRequest.ACTION_NAME, "timKiemKeHoach");
    if (messageType != null) {
        actionUrltimkiemKeHoach.setParameter(PageType.MESSAGE_TYPE, messageType);
    }
    actionUrltimkiemKeHoach.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
    actionUrltimkiemKeHoach.setParameter(PageType.PAGE_TYPE, pageType);
    actionUrltimkiemKeHoach.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));
%>

<aui:form action="<%=actionUrltimkiemKeHoach.toString()%>" name="myForm" id="myForm" method="POST">
	<div class="bgtlemain">
		<h2 class="tlemenu tlemain"><liferay-ui:message key="vn.dtt.kehoach.timkiem" /></h2>
		<%@ include file="/html/kehoach/notification.jsp"%>

		<!-- VaiTro -->
		<%@ include file="/html/menu/vai-tro-kehoach.jsp"%>
	</div>
	<div class="wd-main-content wd-page-staff bgsearch">
		<div class="boxsearch">
			<!-- ----------------- COLUMN 1--------------- -->
			<div class="tbl_left boxlabel">
				<table class="table_noboder">
					<thead>
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.cangvu" /> 
								<input type="hidden" name="<%=MenuConstraint.SESSION_MENU_SELECTED %>" id="<%=MenuConstraint.SESSION_MENU_SELECTED %>"	value="<%=KeHoachAction.getUrlFlag( Utils.checkLoaiThuTuc(loaiThuTuc))%>" />
							</th>
							<%if (checkRoleBGTVT) {%>
							
							<td class="text-leftu">
								<select name="maritimeCode" id="maritimeCode" style="width: 98%;">
									<%if (Validator.isNull(portDefault)) {
										if (Validator.isNull(holdMaritimeCode)) {%>
											<option style="width: 100%" selected value="LUA_CHON">---- Lựa chọn ------</option>
										<%} else {%>
											<option style="width: 100%" value="LUA_CHON">----Lựa chọn------</option>
										<%}%>
									<%} else {%>
											<option style="width: 100%" value="LUA_CHON">----Lựa chọn ------</option>
									<%}%>
									
									<%for (DmMaritime maritime : maritimes) {%>
										<option <%=maritime.getMaritimeCode().trim().equals(holdMaritimeCode) ? "selected" : ""%>
												value="<%=maritime.getMaritimeCode().trim()%>"><%=maritime.getCitycode()%></option>
									<%}%>
								</select>
							</td>
							
							<%} else {%>
							<td class="text-leftu">
								<input type="hidden" name="maritimeCode" id="maritimeCode"	value="<%=holdMaritimeCode%>"/>
								<%
								DmMaritime dmMaritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(holdMaritimeCode);
								if (dmMaritime != null) {
								%>
									<%=dmMaritime.getCitycode() %>
								<%}%>
							</td>
							<%}%>
						</tr>
						
						
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.tentau" /></th>
							<td class="text-leftu">
								<input type="text" name="shipName" id="shipName" class="egov-inputfield" style="width: 98%" 
								value='<%=holdShipName%>'/>
							</td>
						</tr>
						
						
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.taudenorroicang" /></th>
							<td class="text-leftu">
							<select name="positionCode" id="positionCode" style="width: 98%;">
								<%if (Utils.checkLoaiThuTuc(loaiThuTuc) == MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN) {%>
									<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
								<%}%>
								
								<%for (DmGTShipPosition item: shipPositions) {%>
									<option <%=FormatData.checkedData(item.getPositionCode(), holdPositionCode) %>
									value="<%=item.getPositionCode()%>"><%=item.getPositionName()%></option>
								<%}%>
								<%-- <%
								String message = Utils.checkLoaiThuTuc(loaiThuTuc);
								String[] code;
								if (MessageType.LOAT_THU_TUC_NHAP_CANH == message || MessageType.LOAT_THU_TUC_QUA_CANH == message) {
									code = new String[] { "1", "2" };
									for (DmGTShipPosition position : shipPositions) {
										if (!position.getPositionCode().trim().equals("3")) {
								%>
											<option style="width: 100%"
													<%=position.getPositionCode().trim().equals(holdPositionCode) ? "selected" : ""%>
													value="<%=position.getPositionCode()%>"><%=position.getPositionName()%></option>
										<%}
											}%>
										<%}else if (MessageType.LOAT_THU_TUC_XUAT_CANH == message) {
											code = new String[] { "3" };
											for (DmGTShipPosition position : shipPositions) {
												if (position.getPositionCode().trim().equals(code[0])) {
									%>
										<option
											<%=position.getPositionCode().trim().equals(holdPositionCode) ? "selected" : ""%>
											value="<%=position.getPositionCode()%>" style="width: 100%"><%=position.getPositionName()%></option>
										<%}%>
									<%}%>
								<%}else if(MessageType.LOAT_THU_TUC_VAO_CANG == message){
										code = new String[] { "4" };																			
										for (DmGTShipPosition position : shipPositions) {
											if (position.getPositionCode().trim().equals(code[0])) {
									%>
										<option
											<%=position.getPositionCode().trim().equals(holdPositionCode) ? "selected" : ""%>
											value="<%=position.getPositionCode()%>" style="width: 100%"><%=position.getPositionName()%></option>
										<%}%>
									<%}%>
								<%}else if(MessageType.LOAT_THU_TUC_ROI_CANG == message){
										code = new String[] { "5" };																				
										for (DmGTShipPosition position : shipPositions) {
											if (position.getPositionCode().trim().equals(code[0])) {
									%>
										<option
											<%=position.getPositionCode().trim().equals(holdPositionCode) ? "selected" : ""%>
											value="<%=position.getPositionCode()%>" style="width: 100%"><%=position.getPositionName()%></option>
										<%}%>
									<%}%>
								<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == message) {%>
									<option value="">---- Lựa chọn ------</option>
									<%for (DmGTShipPosition position : shipPositions) {%>
									<option
										<%=position.getPositionCode().trim().equals(holdPositionCode) ? "selected" : ""%>
										value="<%=position.getPositionCode()%>" style="width: 100%"><%=position.getPositionName()%></option>
									<%}%>
								<%}%> --%>
							</select>
							</td>
						</tr>
						
						
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.khuvuccang" /></th>
							<td class="text-leftu">
								<select name="portRegionCode" id="portRegionCode" style="width: 98%;">
									<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%
									String portRegionRef = ConvertUtil.getValueString(request, "portRegionRef");
							
									//khu vuc cang
									if (portRegionRef.length() == 0) {
										portRegionRef = holdMaritimeCode;
									}
									List<DmPortRegion> portRegions = DmPortRegionLocalServiceUtil.findPortRegionByPortRegionRef(portRegionRef);
									if (Validator.isNull(portRegions)) {
										portRegions = new ArrayList<DmPortRegion>();
									}
									for (DmPortRegion region : portRegions) {
									%>
										<option <%=region.getPortRegionCode().trim().equals(holdPortRegionCode) ? "selected" : ""%>
											value="<%=region.getPortRegionCode()%>"><%=region.getPortRegionName()%></option>
									<%
									}
									%>
								</select>
							</td>
						</tr>
						
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.trangthai" /></th>
							<td class="text-leftu">
								<select name="requestState" id="requestState" style="width: 98%;">
									<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%for (DmGtStatus status : statusKeHoachs) {%>
										<option
											<%=(status.getStatusCode() == FormatData.convertToInt(holdRequestState)) ? "selected" : ""%>
											value="<%=status.getStatusCode()%>"><%=status.getStatusName()%></option>
									<%}%>
								</select>
							</td>
						</tr>
					</thead>
				</table>
			</div>
			
			<!-- ---------COLUMN 2 ------------------ -->
			<div class="tbl_left boxlabel">
				<table class="table_noboder">
					<thead>
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.mabankhai" /></th>
							<td class="text-leftu">
								<input type="text" class="egov-inputfield" style="width: 98%"
									name="documentName" id="documentName" value="<%=holdMabankhai%>" />
							</td>
						</tr>
						
						
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.quoctich" /></th>
							<td class="text-leftu">
								<select name="stateCode" id="stateCode" style="width: 98%;">
									<option value="" style="width: 100%">---- Lựa chọn ------</option>
									<%
									    for (DmState state : states) {
									%>
										<option
										<%=state.getStateCode().trim().equals(holdStateCode) ? "selected" : ""%>
										value="<%=state.getStateCode()%>" style="width: 100%"><%=state.getStateName()%></option>
									<%
									    }
									%>
								</select>
							</td>
						</tr>
						
						<!-- thoi gian den FROM - TO, thoi gian roi FROM - TO -->
						<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_QUA_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
							<tr>
								<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigiandenFrom" /></th>
								<td class="text-leftu">
									<input type="text" class="egov-inputfield"
											style="width: 86%"
											name="shipDateFromStart"
											id="shipDateFromStart"
											value="<%=holdShipDateFromStart%>"
											onclick="gtCalendar('shipDateFromStart')" />
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('shipDateFromStart')">
								</td>
							</tr>
						<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc) {%>
							<tr>
								<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigianroiFrom" /></th>
								<td class="text-leftu">
									<input type="text" class="egov-inputfield"
											style="width: 86%"
											name="shipDateToStart"
											id="shipDateToStart"
											value="<%=holdShipDateToStart%>"
											onclick="gtCalendar('shipDateToStart')" />
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('shipDateToStart')">
								</td>
							</tr>
						<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == menuLoaiThuTuc) {%>
							<tr>
								<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigiandenFrom" /></th>
								<td class="text-leftu">
									<input type="text" class="egov-inputfield"
											style="width: 86%"
											name="shipDateFromStart"
											id="shipDateFromStart"
											value="<%=holdShipDateFromStart%>"
											onclick="gtCalendar('shipDateFromStart')" />
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('shipDateFromStart')">
								</td>
							</tr>
							<tr>
								<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigianroiFrom" /></th>
								<td class="text-leftu">
									<input type="text" class="egov-inputfield"
											style="width: 86%"
											name="shipDateToStart"
											id="shipDateToStart"
											value="<%=holdShipDateToStart%>"
											onclick="gtCalendar('shipDateToStart')" />
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('shipDateToStart')">
								</td>
							</tr>
						<%}%>
						
						
						
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.kehoach.ngaylamthutucfrom" /></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="ngayLamThuTucFrom"
										id="ngayLamThuTucFrom"
										value="<%=holdNgayLamThuTucFrom %>"
										onclick="gtCalendar('ngayLamThuTucFrom')"/>
								<img src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('ngayLamThuTucFrom')">
							</td>
						</tr>
					</thead>
				</table>
			</div>
			
			<!-- ---------COLMN 3 -------------- -->
			<div class="tbl_left boxlabel">
				<table class="table_noboder">
					<thead>
						
						<tr>
							<%if (MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.sodangky" /></th>
							<%} else  {%>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
							<%} %>							
							<td class="text-leftu">
								<input type="text" name="callSign" id="callSign" class="egov-inputfield"
									style="width: 98%" value="<%=holdCallSign%>" />
							</td>
						</tr>
						
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.IMO" /></th>
							<td class="text-leftu">
								<input type="text" name="imo" id="imo" class="egov-inputfield"
									style="width: 98%" value="<%=holdIMO%>" />
							</td>
						</tr>

						<!-- thoi gian den TO, thoi gian roi TO -->
						<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_QUA_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
							<tr>
								<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigiandenTo" /></th>
								<td class="text-leftu">
									<input type="text" class="egov-inputfield" style="width: 86%"
											name="shipDateFromEnd"
											id="shipDateFromEnd"
											value="<%=holdShipDateFromEnd%>"
											onclick="gtCalendar('shipDateFromEnd')" />
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('shipDateFromEnd')">
								</td>
							</tr>
						<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc) {%>
							<tr>
								<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigianroiTo" /></th>
								<td class="text-leftu">
									<input type="text" class="egov-inputfield" style="width: 86%"
											name="shipDateToEnd"
											id="shipDateToEnd"
											value="<%=holdShipDateToEnd%>"
											onclick="gtCalendar('shipDateToEnd')" />
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('shipDateToEnd')">
								</td>
							</tr>
						<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == menuLoaiThuTuc) {%>
							<tr>
								<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigiandenTo" /></th>
								<td class="text-leftu">
									<input type="text" class="egov-inputfield" style="width: 86%"
											name="shipDateFromEnd"
											id="shipDateFromEnd"
											value="<%=holdShipDateFromEnd%>"
											onclick="gtCalendar('shipDateFromEnd')" />
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('shipDateFromEnd')">
								</td>
							</tr>
							<tr>
								<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigianroiTo" /></th>
								<td class="text-leftu">
									<input type="text" class="egov-inputfield" style="width: 86%"
											name="shipDateToEnd"
											id="shipDateToEnd"
											value="<%=holdShipDateToEnd%>"
											onclick="gtCalendar('shipDateToEnd')" />
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
											onclick="gtCalendar('shipDateToEnd')">
								</td>
							</tr>
						<%} %>
						
						<tr>
							<th class="text-left"width="30%"><liferay-ui:message key="vn.dtt.kehoach.ngayLamThuTucTo"/></th>
							<td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="ngayLamThuTucTo"
										id="ngayLamThuTucTo"
										value="<%=holdNgayLamThuTucTo%>"
										onclick="gtCalendar('ngayLamThuTucTo')" />
								<img src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('ngayLamThuTucTo')">
							</td>
						</tr>
					</thead>
				</table>
			</div>
			<div class="wd-select">
				<button type="submit">
					<i class="icon-fl ico_icon-search"></i>
					<liferay-ui:message key="vn.dtt.kehoach.timkiem" />
				</button>
			</div>
		</div>
	</div>
</aui:form>

<portlet:actionURL var="findPortRegionByPortRegionRef" name="findPortRegionByPortRegionRef"/>

<script>
var url = '<%=findPortRegionByPortRegionRef.toString()%>';

$(document).ready(function() {

	changeDmGtStatus();
	
	$('#positionCode').change(function(event){
		changeDmGtStatus();
	});
	
	$('#maritimeCode').change(function(event) {
		
		var code = $("select#maritimeCode").val();
		if (code == "")
			return;
		$.ajax({
			type : 'GET',
			url : url,
			data : {
				portRegionRef : code
			},
			success : function(data) {
				//preferred
				var data2 = JSON.parse(data);
				
				//console.log(data2);
				//xoa du lieu cu trong khu vuc cang
				var select = $('#portRegionCode');
				select.find('option').remove();
				
				$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
				for ( var i = 0; i < data2.id.length; i++) {
					$('<option>').val(data2.id[i]).text(data2.name[i]).appendTo(select);
				};
			}
		});
	});
});



function changeDmGtStatus(){			
	var positionCode = $('#positionCode').val();
	var menuThuTuc = '<%=loaiThuTuc%>';
	var ttNc = '<%=MessageType.LOAT_THU_TUC_NHAP_CANH%>';
	var ttXc = '<%=MessageType.LOAT_THU_TUC_XUAT_CANH%>';
	var ttQc = '<%=MessageType.LOAT_THU_TUC_QUA_CANH%>';
	
	var ttVc = '<%=MessageType.LOAT_THU_TUC_VAO_CANG%>';
	var ttRc = '<%=MessageType.LOAT_THU_TUC_ROI_CANG%>';
	var pttndVc = '<%=MessageType.LOAT_THU_TUC_VAO_CANG_PTTND%>';
	var pttndRc = '<%=MessageType.LOAT_THU_TUC_ROI_CANG_PTTND%>';
	
	var tauDenCang = '<%=MessageType.SHIP_POSSITION_DEN_CANG%>';
	var tauTrongCang = '<%=MessageType.SHIP_POSSITION_TRONG_CANG%>';
	
	// Ke hoach - Nhap canh, Qua canh
	if(menuThuTuc == ttNc || menuThuTuc == ttQc ||  menuThuTuc == ttVc ){						
		$('#requestState option').each(function(){
			var statusCode = $(this).val();
			var statusName = $(this).text();					
					
			//Tau den cang - Bo 'Da cap LDD' & 'Da huy LDD'
			if(positionCode == tauDenCang){
				if(statusCode == 15 || statusCode == 16){											
					$(this).hide();
				}else{
					$(this).show();
				}
			}

			//Tau trong cang - Chi de 'Da cap LDD' & 'Da huy LDD'
			if(positionCode == tauTrongCang){
				if(statusCode != 15 && statusCode != 16){			
					$(this).hide();
				}else{
					$(this).show();
				}
			}
		});							
	}

	// Ke hoach - Xuat canh - Chi de Cho tiep nhan, Da tiep nhan, Tu choi tiep nhan, Yeu cau sua doi bo sung
	if(menuThuTuc == ttXc || menuThuTuc == ttRc || menuThuTuc == pttndVc || menuThuTuc == pttndRc ){
		$('#requestState option').each(function(){
			var statusCode = $(this).val();
			var statusName = $(this).text();			
			
			if(statusCode != 11 && statusCode != 12 && statusCode != 13 && statusCode != 27){									
				$(this).hide();
			}else{
				$(this).show();
			}
		});						
	}				
}

var NowMoment = moment();

function validateSubmit() {

	<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_QUA_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == menuLoaiThuTuc) {%>
		
		if (isValidateDateThoiGianDen()) { return true; } else { return false; }
		
	<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG == menuLoaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == menuLoaiThuTuc) {%>
		
		if (isValidateDateThoiGianRoi()) { return true; } else { return false; }
		
	<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == menuLoaiThuTuc) {%>
		
		if (isValidateDateThoiGianDen()) { return true; } else { return false; }
		if (isValidateDateThoiGianRoi()) { return true; } else { return false; }
		
	<%} %>
	
	var ngayLamThuTucFrom = $("input[id=ngayLamThuTucFrom]").val();
	ngayLamThuTucFrom = moment(ngayLamThuTucFrom, 'DD/MM/YYYY HH:mm');

	var ngayLamThuTucTo = $("input[id=ngayLamThuTucTo]").val();
	ngayLamThuTucTo = moment(ngayLamThuTucTo, 'DD/MM/YYYY HH:mm');
	
	if (ngayLamThuTucFrom.valueOf() > ngayLamThuTucTo.valueOf()) {
		alert("Ngày nộp hồ sơ từ phải trước Ngày nộp hồ sơ đến ! Mời nhập lại");
		$("input[id=ngayLamThuTucFrom]").focus();
		return false;
	}
	return true;
}

function isValidateDateThoiGianDen() {
	// kiem tra Thời gian đến FROM - TO
	var shipDateFromStart = $("input[id=shipDateFromStart]").val();
	shipDateFromStart = moment(shipDateFromStart, 'DD/MM/YYYY HH:mm');

	var shipDateFromEnd = $("input[id=shipDateFromEnd]").val();
	shipDateFromEnd = moment(shipDateFromEnd, 'DD/MM/YYYY HH:mm');
	
	if (shipDateFromStart.valueOf() > shipDateFromEnd.valueOf()) {
		alert("Thời gian đến từ phải trước Thời gian đến tới ! Mời nhập lại");
		$("input[id=shipDateFromStart]").focus();
		return false;
	}
	return true;
}

function isValidateDateThoiGianRoi() {
	var shipDateToStart = $("input[id=shipDateToStart]").val();
	shipDateToStart = moment(shipDateToStart, 'DD/MM/YYYY HH:mm');

	var shipDateToEnd = $("input[id=shipDateToEnd]").val();
	shipDateToEnd = moment(shipDateToEnd, 'DD/MM/YYYY HH:mm');
	
	if (shipDateToStart.valueOf() > shipDateToEnd.valueOf()) {
		alert("Thời gian rời từ phải trước Thời gian rời tới ! Mời nhập lại");
		$("input[id=shipDateToStart]").focus();
		return false;
	}
	return true;
}

function submitForm() {
	document.getElementById("_kehoachaction_WAR_TichHopGiaoThongportlet_myForm").submit();
}

</script>
