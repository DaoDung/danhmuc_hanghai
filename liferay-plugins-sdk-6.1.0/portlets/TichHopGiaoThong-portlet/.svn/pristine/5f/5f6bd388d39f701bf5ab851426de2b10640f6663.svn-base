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
<%@page import="vn.gt.dao.danhmuc.service.impl.DmHistoryShipAgencyLocalServiceImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryShipAgencyLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryShipAgency"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.dao.danhmuc.service.DmDocTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmDocTypeImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.impl.DmDocTypeLocalServiceImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.DmDocType"%>
<%@page import="vn.gt.dao.danhmuc.service.impl.DmArrivalPurposeLocalServiceImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.DmArrivalPurpose"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiQuaCanh"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueAcceptance"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePortClearance"%>
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
	
	if (documentStatusCode.trim().length() == 0) {
		documentStatusCode = CheckBusinessUtil.getTrangThaiHoSoDefaultForm(MessageType.ROLE_THU_TUC);
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
		else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == message) {
			shipPosition="";
		} 
	}
	
	results = TempDocumentLocalServiceUtil.findDanhSachHoSoRoleThuTuc(
		Utils.checkLoaiThuTuc(loaiThuTuc), maritimeCode, portCode, lastPortCode,
		shipName, stateCode, callSign, imo, shipPosition,
		shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd,
		documentStatusCode, arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency, portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai,
		searchContainer.getStart(), searchContainer.getEnd());
	
	if (results == null) { results = new ArrayList<TempDocument>(); }
	
	long longTotal = TempDocumentLocalServiceUtil.countDanhSachHoSoRoleThuTuc(
		Utils.checkLoaiThuTuc(loaiThuTuc), maritimeCode, portCode, lastPortCode,
		shipName, stateCode, callSign, imo, shipPosition,
		shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd,
		documentStatusCode, arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency, portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai);
	
	searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
	searchContainer.setResults(results);
	
	String tenLoaiThuTuc = "Danh sách tàu thuyền đến và rời cảng biển";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC_TEN, PortletSession.APPLICATION_SCOPE) != null) {
		tenLoaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC_TEN, PortletSession.APPLICATION_SCOPE);
	}
%>

<div class="wd-content-container bgdanhsach">
	<h2 class="tlemenu"><%=tenLoaiThuTuc %></h2>
		<div class="boxnd">
			<table class="wd-table">
				<thead>
					<tr>
						<th width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>						
						<th><liferay-ui:message key="vn.dtt.thutuc.tinhtrang" /></th>
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
				DmHistoryShipAgency agencyDaiLyDen = null;
				DmHistoryShipAgency agencyDaiLyDi = null;
				
				for (int i = 0; i < results.size(); i++) {
					tempDoc = (TempDocument) results.get (i);
					dmGtStatus1 = DmGtStatusLocalServiceUtil.findByStatusCode(tempDoc.getDocumentStatusCode(), MessageType.ROLE_THU_TUC);
					agencyDaiLyDen = DmHistoryShipAgencyLocalServiceUtil.getByShipAgencyCode(tempDoc.getArrivalShipAgency());
					agencyDaiLyDi = DmHistoryShipAgencyLocalServiceUtil.getByShipAgencyCode(tempDoc.getDepartureShipAgency());
				%>
				<portlet:renderURL var="xemHoSo">
					<portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
					<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=String.valueOf(tempDoc.getDocumentName())%>" />
					<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(tempDoc.getDocumentYear())%>" />
					<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(PageType.THANH_PHAN_HO_SO)%>" />
					<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=String.valueOf(PageType.THU_TUC_DETAIL)%>" />
					<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
				</portlet:renderURL>
				
					<tr <%=CheckBusinessUtil.checkColorThuTuc(tempDoc.getDocumentStatusCode()) %>>
						<td><%=(searchContainer.getStart() +  (i+1))%></td>
						<% 
						String ghichu = "";   
			            String tralai = "";
						
						if ((tempDoc.getDocumentStatusCode() == TrangThaiBanKhaiQuaCanh.DE_NGHI_CAP_GIAY_PHEP) || (tempDoc.getDocumentStatusCode() == TrangThaiBanKhaiQuaCanh.PHE_DUYET_HOAN_THANH_THU_TUC) ){							
				           
							if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_QUA_CANH)) {
								List<IssuePermissionForTransit> listPerForTransitQuaCanh = IssuePermissionForTransitLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(tempDoc.getDocumentName(), tempDoc.getDocumentYear(), KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);					               
					               if (Validator.isNotNull(listPerForTransitQuaCanh) && (listPerForTransitQuaCanh.size() > 0) ){ 
					            	   if (listPerForTransitQuaCanh.get(0).getRequestCode().length()> 0 && listPerForTransitQuaCanh.get(0).getStampStatus() == 11 && listPerForTransitQuaCanh.get(0).getIsApproval() == 0)					            	   
					            	   {
					            		   ghichu = "Đã chuyển lãnh đạo, chờ ký.";					            	   
					            	   } else if (listPerForTransitQuaCanh.get(0).getRequestCode().length()> 0 && listPerForTransitQuaCanh.get(0).getStampStatus() == 1)
					            	   {
					            		   ghichu = "Đã chuyển văn thư, chờ đóng dấu.";	
					            	   }  else if (listPerForTransitQuaCanh.get(0).getRequestCode().length()> 0 && listPerForTransitQuaCanh.get(0).getStampStatus() == 0 && listPerForTransitQuaCanh.get(0).getIsCancel() == 0 && listPerForTransitQuaCanh.get(0).getCancelNote().length() > 0)
					            	   {
					            		   tralai = "Lý do trả lại: " + listPerForTransitQuaCanh.get(0).getCancelNote();	
					            	   } else {ghichu = ""; }
					               } else {ghichu = ""; }
							} else if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_XUAT_CANH) 
									|| tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG)
									|| tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)){
								 List<IssuePortClearance> listIssuePortClearances = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(tempDoc.getDocumentName(), tempDoc.getDocumentYear(), KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
								 if (Validator.isNotNull(listIssuePortClearances) &&  (listIssuePortClearances.size() > 0)) {
									 if (listIssuePortClearances.get(0).getRequestCode().length()> 0 && listIssuePortClearances.get(0).getStampStatus() == 11 && listIssuePortClearances.get(0).getIsApproval() == 0)						            	   
						            	   {
						            		   ghichu = "Đã chuyển lãnh đạo, chờ ký.";					            	   
						            	   } else if (listIssuePortClearances.get(0).getRequestCode().length()> 0 && listIssuePortClearances.get(0).getStampStatus() == 1)
						            	   {
						            		   ghichu = "Đã chuyển văn thư, chờ đóng dấu.";	
						            	   }  else if (listIssuePortClearances.get(0).getRequestCode().length()> 0 && listIssuePortClearances.get(0).getStampStatus() == 0 && listIssuePortClearances.get(0).getIsCancel() == 0 && listIssuePortClearances.get(0).getCancelNote().length() > 0)
						            	   {
						            		   tralai = "Lý do trả lại: " + listIssuePortClearances.get(0).getCancelNote();	
						            	   } else {ghichu = ""; }
								 } else {ghichu = ""; }														
							} else if (tempDoc.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)){
								List<IssueAcceptance> listIssueAcceptances = IssueAcceptanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(tempDoc.getDocumentName(), tempDoc.getDocumentYear(), KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
								if (Validator.isNotNull(listIssueAcceptances) &&  (listIssueAcceptances.size() > 0)) {
									 if (listIssueAcceptances.get(0).getRequestCode().length()> 0 && listIssueAcceptances.get(0).getStampStatus() == 11 && listIssueAcceptances.get(0).getIsApproval() == 0)						            	   
						            	   {
						            		   ghichu = "Đã chuyển lãnh đạo, chờ ký.";					            	   
						            	   } else if (listIssueAcceptances.get(0).getRequestCode().length()> 0 && listIssueAcceptances.get(0).getStampStatus() == 1)
						            	   {
						            		   ghichu = "Đã chuyển văn thư, chờ đóng dấu.";	
						            	   }  else if (listIssueAcceptances.get(0).getRequestCode().length()> 0 && listIssueAcceptances.get(0).getStampStatus() == 0 && listIssueAcceptances.get(0).getIsCancel() == 0 &&listIssueAcceptances.get(0).getCancelNote().length() > 0)
						            	   {
						            		   tralai = "Lý do trả lại: " + listIssueAcceptances.get(0).getCancelNote();	
						            	   } else {ghichu = ""; }
								 } else {ghichu = ""; }	
							%>
							<%								
							}
							%>
							
						<%}%>
						
						<% if (ghichu.trim().length() >0 )
							{ 
								%>
								<td class="text-left"><%=Validator.isNotNull(dmGtStatus1.getStatusName()) ? dmGtStatus1.getStatusName() : ""%> <label title="<%=ghichu.trim()  %>" style="text-decoration: underline; font-weight: normal;"> (xem ghi chú...) </label></td>
								<% 	
							}  else if (tralai.trim().length() >0 )
							{ 
								%>
								<td class="text-left"> <label title="<%=tralai.trim()  %>" ><strong> Lãnh đạo trả lại </strong></label></td>
							
								<% 	
							} else {%>
								<td class="text-left"><%=Validator.isNotNull(dmGtStatus1.getStatusName()) ? dmGtStatus1.getStatusName() : ""%></td>
							<%								
							}
							%>
							
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
						
						<td class="text-left">
							<a href="<%=xemHoSo.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_xemhs.png"></a>
						</td>
					</tr>
					
	             	<%
						}
	           		%>
	            	</tbody>
	        	</table>
			<div class="tongso">
				<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
			
			</div>
		</div>