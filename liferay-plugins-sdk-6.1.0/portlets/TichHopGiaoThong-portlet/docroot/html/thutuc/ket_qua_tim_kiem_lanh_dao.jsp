<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtStatus"%>
<%@page import="vn.gt.dao.danhmucgt.model.impl.DmGtStatusImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.impl.DmHistoryShipAgencyLocalServiceImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryShipAgencyLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryShipAgency"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.dao.common.service.UserSignLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserSign"%>
<%@page import="vn.gt.dao.common.model.impl.UserSignImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.impl.DmArrivalPurposeLocalServiceImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.DmArrivalPurpose"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhai"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>

<%@page import="vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryDocType"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmHistoryDocTypeImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.DmDocType"%>
<%@page pageEncoding="UTF-8"%>

<%
	PortletURL portletUrl = renderResponse.createRenderURL();
	
	//Cảng vụ
	portletUrl.setParameter("maritimeCode", maritimeCode);
	portletUrl.setParameter("portCode", portCode);
	portletUrl.setParameter("lastPortCode", lastPortCode);
	
	portletUrl.setParameter("shipName", shipName);
	portletUrl.setParameter("stateCode", stateCode);
	portletUrl.setParameter("callSign", callSign);
	portletUrl.setParameter("imo", imo);
	portletUrl.setParameter("shipPosition", shipPosition);
	
	portletUrl.setParameter("shipDateFromStart", shipDateFromStart);
	portletUrl.setParameter("shipDateFromEnd", shipDateFromEnd);
	
	portletUrl.setParameter("shipDateToStart", shipDateToStart);
	portletUrl.setParameter("shipDateToEnd", shipDateToEnd);
	
	portletUrl.setParameter("ngayLamThuTucFrom", ngayLamThuTucFrom);
	portletUrl.setParameter("ngayLamThuTucTo", ngayLamThuTucTo);
	portletUrl.setParameter("maBanKhai", maBanKhai);
	
	portletUrl.setParameter("documentStatusCode", documentStatusCode);
	
	portletUrl.setParameter("arrivalShipAgency", arrivalShipAgency);
	portletUrl.setParameter("nameArrivalShipAgency", nameArrivalShipAgency);
	
	portletUrl.setParameter("departureShipAgency", departureShipAgency);
	portletUrl.setParameter("nameDepartureShipAgency", nameDepartureShipAgency);
	//Khu vực cảng
	portletUrl.setParameter("portRegionCode", portRegionCode);
	
	portletUrl.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));

	
	String transactionKeyword = URLDecoder.decode(ParamUtil.getString(request, "transactionKeyword"), StringPool.UTF8);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 20, portletUrl, null, null);
	
	List<TempDocument> results = null;
	
	User userLogin = PortalUtil.getUser(request);
	UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
	if (Validator.isNull(portDefault)) {
		
	} else {
		if (Validator.isNull(maritimeCode)) {
			maritimeCode = portDefault.getPortCode();;
		}
	}
	
	UserSign userSignDefault = UserSignLocalServiceUtil.getByUserId(themeDisplay.getUserId());
	if (userSignDefault == null) { userSignDefault = new UserSignImpl(); } 
	String userTitle = userSignDefault.getTitle();
	String representative = userSignDefault.getRepresentative();
	if (userTitle.isEmpty() || userTitle== null || representative.isEmpty() || representative == null 
			|| userSignDefault.getFileChungThuSoId() == 0 || userSignDefault.getFileChuKyId() == 0){
		userTitle = "Cấu hình thông tin ký số chưa đầy đủ !";
		representative = "---";
	}else{
		
	}
	if (documentStatusCode.trim().length() == 0) {
		documentStatusCode = CheckBusinessUtil.getTrangThaiHoSoChoKySoDongDau(MessageType.ROLE_THU_TUC);
	}
	
	String message = Utils.checkLoaiThuTuc(loaiThuTuc);
	
	if (Validator.isNull(shipPosition)) {
		if (MessageType.LOAT_THU_TUC_NHAP_CANH == message || MessageType.LOAT_THU_TUC_QUA_CANH == message || MessageType.LOAT_THU_TUC_VAO_CANG == message ) {
			shipPosition = "2";
		} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == message) {
			shipPosition = "3";
		} else if(MessageType.LOAT_THU_TUC_ROI_CANG == message){
			shipPosition = "3";
		} else if(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == message){
			shipPosition = "3";
		} else if (MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == message){
			shipPosition = "2";
		}
		else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == message || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == message
				|| MessageType.LOAT_THU_TUC_CHO_KY_SO == message) {
			shipPosition="";
		} 
	}
	
	if (MessageType.LOAT_THU_TUC_CHO_KY_SO == message) {
		results = TempDocumentLocalServiceUtil.findDanhSachHoSoLanhDaoChoKySo(
				Utils.checkLoaiThuTuc(loaiThuTuc), maritimeCode, portCode, lastPortCode,
				shipName, stateCode, callSign, imo, shipPosition,
				shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd,
				documentStatusCode, arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency, 
				portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai, representative, 
				searchContainer.getStart(), searchContainer.getEnd());
			
			if (results == null) { results = new ArrayList<TempDocument>(); }
			
			long longTotal = TempDocumentLocalServiceUtil.countDanhSachHoSoLanhDaoChoKySo(
				Utils.checkLoaiThuTuc(loaiThuTuc), maritimeCode, portCode, lastPortCode,
				shipName, stateCode, callSign, imo, shipPosition,
				shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd,
				documentStatusCode, arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency, 
				portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai, representative);
			
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			searchContainer.setResults(results);
	} else if (MessageType.LOAT_THU_TUC_CHO_DONG_DAU == message) {
		results = TempDocumentLocalServiceUtil.findDanhSachHoSoVanThuChoDongDau(
				Utils.checkLoaiThuTuc(loaiThuTuc), maritimeCode, portCode, lastPortCode,
				shipName, stateCode, callSign, imo, shipPosition,
				shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd,
				documentStatusCode, arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency, 
				portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai,
				searchContainer.getStart(), searchContainer.getEnd());
			
			if (results == null) { results = new ArrayList<TempDocument>(); }
			
			long longTotal = TempDocumentLocalServiceUtil.countDanhSachHoSoVanThuChoDongDau(
				Utils.checkLoaiThuTuc(loaiThuTuc), maritimeCode, portCode, lastPortCode,
				shipName, stateCode, callSign, imo, shipPosition,
				shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd,
				documentStatusCode, arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency, 
				portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai);
			
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			searchContainer.setResults(results);
	} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == message ) {
		results = TempDocumentLocalServiceUtil.findDanhSachHoSoRoleThuTuc(
				Utils.checkLoaiThuTuc(loaiThuTuc), maritimeCode, portCode, lastPortCode,
				shipName, stateCode, callSign, imo, shipPosition,
				shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd,
				documentStatusCode, arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency, 
				portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai,
				searchContainer.getStart(), searchContainer.getEnd());
			
			if (results == null) { results = new ArrayList<TempDocument>(); }
			
			long longTotal = TempDocumentLocalServiceUtil.countDanhSachHoSoRoleThuTuc(
				Utils.checkLoaiThuTuc(loaiThuTuc), maritimeCode, portCode, lastPortCode,
				shipName, stateCode, callSign, imo, shipPosition,
				shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd,
				documentStatusCode, arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency, 
				portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai);
			
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			searchContainer.setResults(results);
	}
		
	if (results == null) { results = new ArrayList<TempDocument>(); }
	
	String tenLoaiThuTuc = "Danh sách tàu thuyền đến và rời cảng biển";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC_TEN, PortletSession.APPLICATION_SCOPE) != null) {
		tenLoaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC_TEN, PortletSession.APPLICATION_SCOPE);
	}
%>

<div class="wd-content-container bgdanhsach">
	<% if (userTitle.isEmpty() || userTitle== null || representative.isEmpty() || representative == null 
		|| userSignDefault.getFileChungThuSoId() == 0 || userSignDefault.getFileChuKyId() == 0){
		if (MessageType.LOAT_THU_TUC_CHO_KY_SO == message) {
	%>
		<h2 class="tlemenu"><%=tenLoaiThuTuc %> -- <b><font color="red"><%= userTitle %> </font></b></h2>
		<%} else  {%>
	<h2 class="tlemenu"><%=tenLoaiThuTuc %></h2>
	<%}%>
	<%} else  {%>
	<h2 class="tlemenu"><%=tenLoaiThuTuc %></h2>
	<%}%>

		<div class="boxnd">
			<table class="wd-table">
				<thead>
					<tr>
						<th width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>						
						<th ><liferay-ui:message key="vn.dtt.thutuc.tinhtrang" /></th>
						<%if (MessageType.LOAT_THU_TUC_CHO_KY_SO == message || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == message) {%>
							<th>Tên thủ tục</th>							
						<%} %>
						<th><liferay-ui:message key="vn.dtt.thutuc.mabankhai" /></th>
						<th><liferay-ui:message key="vn.dtt.thutuc.tentau" /></th>
						<%if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0 || loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0) {%>
							<th><liferay-ui:message key="vn.dtt.thutuc.sodangky" /></th>
							<%} else  {%>
							<th><liferay-ui:message key="vn.dtt.thutuc.hohieu" /></th>
							<%} %>						
						<th><liferay-ui:message key="vn.dtt.thutuc.IMO" /></th>
						
						<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == message || MessageType.LOAT_THU_TUC_QUA_CANH == message || MessageType.LOAT_THU_TUC_VAO_CANG == message) {%>
							<th><liferay-ui:message key="vn.dtt.thutuc.ngayden" /></th>
							<th><liferay-ui:message  key="vn.dtt.thutuc.dailyden" /></th>
						<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == message || MessageType.LOAT_THU_TUC_ROI_CANG == message) {%>
							<th><liferay-ui:message key="vn.dtt.thutuc.ngayroi" /></th>
							<th><liferay-ui:message key="vn.dtt.thutuc.dailydi" /></th>
						<%} else if (MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == message) {%>
							<th><liferay-ui:message key="vn.dtt.thutuc.ngayroi" /></th>
							<th><liferay-ui:message key="vn.dtt.thutuc.dailydi" /></th>
						<%} else if (MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == message) {%>
							<th><liferay-ui:message key="vn.dtt.thutuc.ngayden" /></th>
							<th><liferay-ui:message  key="vn.dtt.thutuc.dailyden" /></th>
						<%} else if (MessageType.LOAT_THU_TUC_CHO_KY_SO == message || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == message) {%>
							<th><liferay-ui:message key="vn.dtt.thutuc.ngayden" /></th>
							<th><liferay-ui:message key="vn.dtt.thutuc.ngayroi" /></th>
							<th><liferay-ui:message  key="vn.dtt.thutuc.daily" /></th>
						<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == message) {%>						
							<th><liferay-ui:message key="vn.dtt.thutuc.ngayden" /></th>
							<th><liferay-ui:message key="vn.dtt.thutuc.ngayroi" /></th>
							<th><liferay-ui:message  key="vn.dtt.thutuc.dailyden" /></th>
							<th><liferay-ui:message key="vn.dtt.thutuc.dailydi" /></th>
						<%}%>
						
						<th><liferay-ui:message  key="vn.dtt.thutuc.ngaygiolamthutuc" /></th>
						<th width="100px"><liferay-ui:message  key="vn.dtt.thutuc.thaotac" /></th>
					</tr>
				</thead>
				<tbody>
				<%
				TempDocument tempDoc = null;
				DmGtStatus dmGtStatus1 = null;
				DmGtStatus dmGtStatusKH = null;
				DmHistoryShipAgency agencyDaiLyDen = null;
				DmHistoryShipAgency agencyDaiLyDi = null;
								
				for (int i = 0; i < results.size(); i++) {
					tempDoc = (TempDocument) results.get (i);
					dmGtStatus1 = DmGtStatusLocalServiceUtil.findByStatusCode(tempDoc.getDocumentStatusCode(), MessageType.ROLE_THU_TUC);
					dmGtStatusKH = DmGtStatusLocalServiceUtil.findByStatusCode(tempDoc.getRequestState(), MessageType.ROLE_KE_HOACH);
					agencyDaiLyDen = DmHistoryShipAgencyLocalServiceUtil.getByShipAgencyCode(tempDoc.getArrivalShipAgency());
					agencyDaiLyDi = DmHistoryShipAgencyLocalServiceUtil.getByShipAgencyCode(tempDoc.getDepartureShipAgency());
					
					int statusColor = tempDoc.getDocumentStatusCode();
					if (statusColor == 0) {
						statusColor = tempDoc.getRequestState(); // trang thai Ke hoach
					};
					if (dmGtStatus1 == null){
						dmGtStatus1 = new DmGtStatusImpl();
					}
					if (dmGtStatusKH == null){
						dmGtStatusKH = new DmGtStatusImpl();
					}
					String statusName = "";
					if (tempDoc.getDocumentStatusCode() > 0) {
						if (tempDoc.getRequestState()== TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG){
							statusName = dmGtStatusKH.getStatusName();
						} else {
							statusName = dmGtStatus1.getStatusName();
						}
					} else {
						statusName = dmGtStatusKH.getStatusName();
					}
					
					DmHistoryDocType dmHistoryDocType2 = DmHistoryDocTypeLocalServiceUtil.findByDocumentType(tempDoc.getDocumentTypeCode());
				%>
				<portlet:renderURL var="xemHoSo">
					<portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
					<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=String.valueOf(tempDoc.getDocumentName())%>" />
					<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(tempDoc.getDocumentYear())%>" />
					<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(PageType.THANH_PHAN_HO_SO)%>" />
					<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=String.valueOf(PageType.THU_TUC_DETAIL)%>" />
					<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
				</portlet:renderURL>
					
					<tr <%=(tempDoc.getDocumentStatusCode() > 0) ? CheckBusinessUtil.checkColorDongdauKyso(statusColor) : (tempDoc.getRequestState()== TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG) ? CheckBusinessUtil.checkColorDongdauKyso(statusColor) : CheckBusinessUtil.checkColorKeHoach(statusColor) %>>
						<td><%=(searchContainer.getStart() +  (i+1))%></td>
						<td class="text-left"><%=Validator.isNotNull(statusName) ? statusName : ""%></td>	
						<%if (MessageType.LOAT_THU_TUC_CHO_KY_SO == message || MessageType.LOAT_THU_TUC_CHO_DONG_DAU == message) {%>
							<td class="text-left"><%=Validator.isNotNull(dmHistoryDocType2) ? dmHistoryDocType2.getDocumentTypeName() : "---"%></td>							
						<%} %>					
						<% if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_NHAP_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_QUA_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_XUAT_CANH) 
								|| tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG ) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG)) {
						%>
						<td class="text-left"><%=Validator.isNotNull(tempDoc.getDocumentName()) ? tempDoc.getDocumentName() : ""%></td>
						<%} else if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
							%>
							<% if (tempDoc.getShipTypeCode().equals("SMS")) {
							%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getDocumentName()) ? tempDoc.getDocumentName() : ""%> <img src="<%=request.getContextPath()%>/img/icon/call_icon_16.png"> </td>												
							<%} else {%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getDocumentName()) ? tempDoc.getDocumentName() : ""%></td>
							<%}%>
							<%}%>
						
						<% if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_NHAP_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_QUA_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_XUAT_CANH) 
								|| tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG ) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG)) {
						%>
						<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipName()) ? tempDoc.getShipName() : ""%></td>
						<%} else if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
							%>
							<% if (tempDoc.getShipTypeCode().equals("SMS")) {
							%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipName()) ? tempDoc.getShipName() : ""%> <img src="<%=request.getContextPath()%>/img/icon/call_icon_16.png"> </td>												
							<%} else {%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipName()) ? tempDoc.getShipName() : ""%></td>
							<%}%>
							<%}%>		
							
						<% if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_NHAP_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_QUA_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_XUAT_CANH) 
								|| tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG ) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG)) {
						%>
						<td class="text-left"><%=Validator.isNotNull(tempDoc.getCallSign()) ? tempDoc.getCallSign() : ""%></td>
						<%} else if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
							%>
							<% if (tempDoc.getShipTypeCode().equals("SMS")) {
							%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getCallSign()) ? tempDoc.getCallSign() : ""%> <img src="<%=request.getContextPath()%>/img/icon/call_icon_16.png"> </td>												
							<%} else {%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getCallSign()) ? tempDoc.getCallSign() : ""%></td>
							<%}%>
							<%}%>				
						
						<td class="text-left"><%=Validator.isNotNull(tempDoc.getImo()) ? tempDoc.getImo() : ""%></td>

						<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == message || MessageType.LOAT_THU_TUC_QUA_CANH == message || MessageType.LOAT_THU_TUC_VAO_CANG == message  || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == message) {%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipDateFrom()) ? FormatData.parseDateToTringType3(tempDoc.getShipDateFrom()) : ""%></td>
							<td class="text-left"><%=Validator.isNotNull(agencyDaiLyDen) ? agencyDaiLyDen.getShipAgencyName() : tempDoc.getArrivalShipAgency()%></td>
							
						<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == message || MessageType.LOAT_THU_TUC_ROI_CANG == message || MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == message) {%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipDateTo()) ? FormatData.parseDateToTringType3(tempDoc.getShipDateTo()) : ""%></td>
							<td class="text-left"><%=Validator.isNotNull(agencyDaiLyDi) ? agencyDaiLyDi.getShipAgencyName() : tempDoc.getDepartureShipAgency()%></td>
							
						<%} else if (MessageType.LOAT_THU_TUC_CHO_DONG_DAU == message || MessageType.LOAT_THU_TUC_CHO_KY_SO == message) {
							if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_NHAP_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_QUA_CANH) 
									|| tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG ) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
							%>
								<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipDateFrom()) ? FormatData.parseDateToTringType3(tempDoc.getShipDateFrom()) : ""%></td>
								<td class="text-left"></td>
								
								<td class="text-left"><%=Validator.isNotNull(agencyDaiLyDen) ? agencyDaiLyDen.getShipAgencyName() : tempDoc.getArrivalShipAgency()%></td>
<!-- 								<td class="text-left"></td> -->
							<%
							} else if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_XUAT_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)) {
							%>
								<td class="text-left"></td>
								<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipDateTo()) ? FormatData.parseDateToTringType3(tempDoc.getShipDateTo()) : ""%></td>
								
<!-- 								<td class="text-left"></td> -->
								<td class="text-left"><%=Validator.isNotNull(agencyDaiLyDi) ? agencyDaiLyDi.getShipAgencyName() : tempDoc.getDepartureShipAgency()%></td>
							<%
							}
						%>							
						<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == message) {
							if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_NHAP_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_QUA_CANH) 
									|| tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG ) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
							%>
								<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipDateFrom()) ? FormatData.parseDateToTringType3(tempDoc.getShipDateFrom()) : ""%></td>
								<td class="text-left"></td>
								
								<td class="text-left"><%=Validator.isNotNull(agencyDaiLyDen) ? agencyDaiLyDen.getShipAgencyName() : tempDoc.getArrivalShipAgency()%></td>
								<td class="text-left"></td>
							<%
							} else if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_XUAT_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)) {
							%>
								<td class="text-left"></td>
								<td class="text-left"><%=Validator.isNotNull(tempDoc.getShipDateTo()) ? FormatData.parseDateToTringType3(tempDoc.getShipDateTo()) : ""%></td>
								
								<td class="text-left"></td>
								<td class="text-left"><%=Validator.isNotNull(agencyDaiLyDi) ? agencyDaiLyDi.getShipAgencyName() : tempDoc.getDepartureShipAgency()%></td>
							<%
							}
						%>
							
						<%}%>
						<% if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_NHAP_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_QUA_CANH) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_XUAT_CANH) 
								|| tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG ) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG)) {
						%>
						<td class="text-left"><%=Validator.isNotNull(tempDoc.getCreatedDate()) ? FormatData.parseDateToTringType3(tempDoc.getCreatedDate()) : ""%></td>
						<%} else if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) || tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
							%>
							<% if (tempDoc.getShipTypeCode().equals("SMS")) {
							%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getCreatedDate()) ? FormatData.parseDateToTringType3(tempDoc.getCreatedDate()) : ""%> <img src="<%=request.getContextPath()%>/img/icon/call_icon_16.png"> </td>										
							<%} else {%>
							<td class="text-left"><%=Validator.isNotNull(tempDoc.getCreatedDate()) ? FormatData.parseDateToTringType3(tempDoc.getCreatedDate()) : ""%></td>
							<%}%>
							<%}%>
							<% if (userTitle.isEmpty() || userTitle== null || representative.isEmpty() || representative == null 
									|| userSignDefault.getFileChungThuSoId() == 0 || userSignDefault.getFileChuKyId() == 0){
								 if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == message) {%>	
								<td class="text-left">
									<a href="<%=xemHoSo.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_xemhs.png"></a>
								</td>	
								<%} else  {%>							
									<td class="text-left"> </td>
									<%}%>
								<%} else  {%>
								<td class="text-left">
									<a href="<%=xemHoSo.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_xemhs.png"></a>
								</td>
								<%}%>
						
					</tr>
	             	<%
						}
	           		%>
	            	</tbody>
	        	</table>
			<div class="tongso"><liferay-ui:search-paginator searchContainer="<%= searchContainer %>" /></div>
		</div>