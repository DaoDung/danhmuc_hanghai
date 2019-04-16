<%@page import="java.util.Date"%>
<%@page import="vn.gt.portlet.business.Constans"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryDocType"%>
<%@page import="vn.gt.utils.GetNameFunction"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryPort"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryPortWharfLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryPortWharf"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryShipAgencyLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryShipAgency"%>
<%@page import="vn.gt.dao.danhmuc.model.DmState"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryState"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="vn.gt.portlet.thongtintau.ThongTinTauAction"%>
<%@page import="vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.InterfaceRequest"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePortClearance"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueAcceptance"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page pageEncoding="UTF-8"%>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/main.js"></script>

<%
	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter("maritimeCode", maritimeCode);
	portletUrl.setParameter("shipName", shipName);
	portletUrl.setParameter("callSign", callSign);
	portletUrl.setParameter("shipDateFrom", shipDateFrom);
	portletUrl.setParameter("shipDateTo", shipDateTo);
	portletUrl.setParameter("certificateNumber", certificateNumber);
	portletUrl.setParameter("flagMenu", flagMenu);

	String transactionKeyword = URLDecoder.decode(ParamUtil.getString(request, "transactionKeyword"), StringPool.UTF8);

	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM,
		20, portletUrl, null, null);
	
	String tenLoaiThuTuc = "Danh sách thông tin tàu biển";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC_TEN, PortletSession.APPLICATION_SCOPE) != null) {
		tenLoaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC_TEN, PortletSession.APPLICATION_SCOPE);
	}
	
	
	String typePaginator = "en";
	if(flagLanguage.contains("EN")) {
		typePaginator = "en";
	}

%>

<%
if (loaiThuTuc.equals(ThongTinTauAction.GIAY_PHEP_ROI_CANG)) {
%>
<div class="wd-content-container bgdanhsach">
<% if (flagLanguage.contains("EN")) { %>
      <h2 class="tlemenu"><%=tenLoaiThuTuc %> /<%="PORT CLEARANCE" %></h2>
                <div class="boxnd">
                    <table class="wd-table">
                        <thead>
                            <tr>
                                <!-- <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.sogiayphep" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.IMO" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.ngayhieuluc" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.cangbien" /></th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotac" /></th> -->
	                            <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /><br>No</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.sogiayphep" /><br>Number of Port Clearance</th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /><br>Name of Ship</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.IMO" /><br>IMO Number</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /><br>Call Sign</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.ngayhieuluc" /><br>Date of Issue</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.cangroi" /><br>Port of Departure</th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotacxem" /><br>View</th>
                            </tr>
                        </thead>
      <%} else{ %>
      <h2 class="tlemenu"><%=tenLoaiThuTuc %></h2>
                <div class="boxnd">
                    <table class="wd-table">
                        <thead>
                            <tr>
                                <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.sogiayphep" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.IMO" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.ngayhieuluc" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.cangbien" /></th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotac" /></th>
                            </tr>
                        </thead>
      <%
	}
%>

                      <tbody>
                        <%
                        List<IssuePortClearance> result = null;
                        if (flagLanguage.contains("EN")) {
                        	result = IssuePortClearanceLocalServiceUtil.findIssuePortClearanceInfo(Constans.REQUEST_STATE_FOR_FILTER, maritimeCode, portCode, shipName, callSign, shipDateFrom, shipDateTo, certificateNumber, searchContainer.getStart(), searchContainer.getEnd());
                        } else {
                    		result = IssuePortClearanceLocalServiceUtil.findIssuePortClearanceInfoByCertificateNumber(Constans.REQUEST_STATE_FOR_FILTER, maritimeCode, portCode, shipName, callSign, shipDateFrom, shipDateTo, certificateNumber, searchContainer.getStart(), searchContainer.getEnd());
                        }

                    	if (result == null) { result = new ArrayList<IssuePortClearance>(); }
                    	long longTotal = IssuePortClearanceLocalServiceUtil.countIssuePortClearanceInfoByCertificateNumber(Constans.REQUEST_STATE_FOR_FILTER, maritimeCode, portCode, shipName, callSign, shipDateFrom, shipDateTo, certificateNumber);
                    	if (flagLanguage.contains("EN")) {
                    		longTotal = IssuePortClearanceLocalServiceUtil.countIssuePortClearanceInfo(Constans.REQUEST_STATE_FOR_FILTER, maritimeCode, portCode, shipName, callSign, shipDateFrom, shipDateTo, certificateNumber);
                        } 
                    	searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
                    	searchContainer.setResults(result);
                    	
                        IssuePortClearance instance = null;
                        for(int i = 0; i < result.size(); i++) {
                        	String PortName = "";
                        	instance = (IssuePortClearance)result.get(i);
                        	TempDocument temp = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(instance.getDocumentName(), instance.getDocumentYear());
                        	PortName = GetNameFunction.getPortName(temp.getCreatedDate(), temp.getPortCode());
                        	
                        	String messageType = "";
                        	
                        	PortletURL thongTinTauURL = renderResponse.createRenderURL();
                        	thongTinTauURL.setParameter("jspPage", "/html/report_export.jsp");
                        	thongTinTauURL.setParameter(PageType.DOCUMENT_NAME, String.valueOf(instance.getDocumentName()));
                        	thongTinTauURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(instance.getDocumentYear()));
                        	thongTinTauURL.setParameter(PageType.MESSAGE_TYPE, "60");
                        	thongTinTauURL.setParameter(PageType.DOCUMENT_TYPE, "XC");
                        	thongTinTauURL.setParameter(PageType.REQUEST_CODE, instance.getRequestCode());
                        	thongTinTauURL.setWindowState(LiferayWindowState.POP_UP);
                        	thongTinTauURL.setPortletMode(PortletMode.VIEW);
                        	
                        	
                        	PortletURL tauRoiURL = renderResponse.createRenderURL();
                        	tauRoiURL.setParameter("jspPage", "/html/report_export.jsp");
                        	tauRoiURL.setParameter(PageType.DOCUMENT_NAME, String.valueOf(instance.getDocumentName()));
                        	tauRoiURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(instance.getDocumentYear()));
                        	tauRoiURL.setParameter(PageType.MESSAGE_TYPE, "60");
                        	tauRoiURL.setParameter(PageType.DOCUMENT_TYPE, "5");
                        	tauRoiURL.setParameter(PageType.REQUEST_CODE, instance.getRequestCode());
                        	tauRoiURL.setWindowState(LiferayWindowState.POP_UP);
                        	tauRoiURL.setPortletMode(PortletMode.VIEW);
                        	
                        	PortletURL thongTinTauRoiPttndURL = renderResponse.createRenderURL();
                        	thongTinTauRoiPttndURL.setParameter("jspPage", "/html/report_export.jsp");
                        	thongTinTauRoiPttndURL.setParameter(PageType.DOCUMENT_NAME, String.valueOf(instance.getDocumentName()));
                        	thongTinTauRoiPttndURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(instance.getDocumentYear()));
                        	thongTinTauRoiPttndURL.setParameter(PageType.MESSAGE_TYPE, "61");
                        	thongTinTauRoiPttndURL.setParameter(PageType.DOCUMENT_TYPE, "7");
                        	thongTinTauRoiPttndURL.setParameter(PageType.REQUEST_CODE, instance.getRequestCode());
                        	thongTinTauRoiPttndURL.setWindowState(LiferayWindowState.POP_UP);
                        	thongTinTauRoiPttndURL.setPortletMode(PortletMode.VIEW);

                        	
                        %>
	                            <tr>
	                           
	                                <td><%=(searchContainer.getStart() +  (i+1))%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getCertificateNo()) ? instance.getCertificateNo() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getNameOfShip()) ? instance.getNameOfShip() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(temp) ? temp.getImo() : ""%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getCallSign()) ? instance.getCallSign() : ""%></td>
	                                <td class="text-left"><%=FormatData.parseDateToTringType3(instance.getSignDate()) %></td>
	                                <td class="text-left"><%=Validator.isNotNull(PortName) ? PortName : "" %></td>
	                                <% //System.out.println(temp.getDocumentTypeCode()+"  temp.getDocumentTypeCode(). ");
	                                if (flagLanguage.contains("EN")) {
	                                if(temp.getDocumentTypeCode()!=null&&temp.getDocumentTypeCode().equals("XC")){ %>
	                                	<td class="text-left"><a href="javascript:viewKetQuaHoSoEnglish('<%=thongTinTauURL.toString()%>', 'PORT CLEARANCE')">View</a></td>
	                                
	                                <%} else if(temp.getDocumentTypeCode()!=null&&temp.getDocumentTypeCode().equals("5")){ %>
                                	<td class="text-left"><a href="javascript:viewKetQuaHoSoEnglish('<%=tauRoiURL.toString()%>', 'PORT CLEARANCE')">View</a></td>
	                                
                                	<%} else if(temp.getDocumentTypeCode()!=null&&temp.getDocumentTypeCode().equals("7")){ %>
                                	<td class="text-left"><a href="javascript:viewKetQuaHoSoEnglish('<%=thongTinTauRoiPttndURL.toString()%>', 'PORT CLEARANCE')">View</a></td>
	                                
                               	 	<%} else{ %>
	                                	<td class="text-left"><a href="javascript:viewKetQuaHoSoEnglish('<%=tauRoiURL.toString()%>', 'PORT CLEARANCE')">View</a></td>
	                                <%} %>
	                                <%} else { %>
	                                <% if(temp.getDocumentTypeCode()!=null&&temp.getDocumentTypeCode().equals("XC")){ %>
                                	<td class="text-left"><a href="javascript:viewKetQuaHoSo('<%=thongTinTauURL.toString()%>', 'GIẤY PHÉP RỜI CẢNG')">Xem</a></td>
	                                
	                                <%} else if(temp.getDocumentTypeCode()!=null&&temp.getDocumentTypeCode().equals("5")){ %>
	                            	<td class="text-left"><a href="javascript:viewKetQuaHoSo('<%=tauRoiURL.toString()%>', 'GIẤY PHÉP RỜI CẢNG')">Xem</a></td>
	                                
	                            	<%} else if(temp.getDocumentTypeCode()!=null&&temp.getDocumentTypeCode().equals("7")){ %>
	                            	<td class="text-left"><a href="javascript:viewKetQuaHoSo('<%=thongTinTauRoiPttndURL.toString()%>', 'GIẤY PHÉP RỜI CẢNG')">Xem</a></td>
	                                
	                           	 	<%} else{ %>
	                                	<td class="text-left"><a href="javascript:viewKetQuaHoSo('<%=tauRoiURL.toString()%>', 'GIẤY PHÉP RỜI CẢNG')">Xem</a></td>
	                                <%} %> 
	                                 <%} %>
	                            </tr>
	                            <%
                        }
	                            %>
                      </tbody>
                      </table>
        		<div class="tongso">
          			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" type="<%= typePaginator %>" />
      			</div>
         </div>
	<%
	
	} else if (loaiThuTuc.equals(ThongTinTauAction.KE_HOACH_DIEU_DONG_TAU)){
	%>
<div class="wd-content-container bgdanhsach">
<% if (flagLanguage.contains("EN")) { %>
      <h2 class="tlemenu"><%=tenLoaiThuTuc %> /<%="SHIFTING ORDER" %></h2>
                <div class="boxnd">
                    <table class="wd-table">
                         <thead>
                            <tr>
                                <!-- <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
                                <th><liferay-ui:message key="vn.dtt.kehoach.sogiayphep" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.tentau" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.quoctich" /> </th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.daily" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.vitrineodaudukienden" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.thoigianden" /></th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotac" /></th> -->
	                            <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /><br>No</th>
	                            <th>Số giấy phép<br>Number of Shifting Order</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.tentau" /><br>Name of Ship</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.quoctich" /><br>Flag State of Ship</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /><br>Call Sign</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.daily" /><br>Ship Agency</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.vitrineodaudukienden" /><br>Shifted To</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.thoigianden" /><br>Time of arrival</th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotacxem" /><br>View</th>
                            </tr>
                        </thead>
      <%} else{ %>
      <h2 class="tlemenu"><%=tenLoaiThuTuc %></h2>
                <div class="boxnd">
                    <table class="wd-table">
                         <thead>
                            <tr>
                                <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
                                <th><liferay-ui:message key="vn.dtt.kehoach.sogiayphep" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.quoctich" /> </th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.daily" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.vitrineodaudukienden" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.thoigianden" /></th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotac" /></th>
                            </tr>
                        </thead>
      <%
	}
%>

                        <tbody>
                        <%
                        List<IssueShiftingOrder> results = null;
                        if (flagLanguage.contains("EN")) {
                    		results = IssueShiftingOrderLocalServiceUtil.findIssueShiftingOrderInfo(Constans.REQUEST_STATE_FOR_FILTER,maritimeCode,portCode, shipName, callSign, shipDateFrom, shipDateTo, certificateNumber, searchContainer.getStart(), searchContainer.getEnd());
                        } else {
                    		results = IssueShiftingOrderLocalServiceUtil.findIssueShiftingOrderInfoByCertificateNumber(Constans.REQUEST_STATE_FOR_FILTER,maritimeCode,portCode, shipName, callSign, shipDateFrom, shipDateTo, certificateNumber, searchContainer.getStart(), searchContainer.getEnd());
                        }

                    	if (results == null) { results = new ArrayList<IssueShiftingOrder>(); }
                    	long longTotal = IssueShiftingOrderLocalServiceUtil.countIssueShiftingOrderInfoByCertificateNumber(Constans.REQUEST_STATE_FOR_FILTER,maritimeCode,portCode,shipName, callSign, shipDateFrom, shipDateTo, certificateNumber);
                    	 if (flagLanguage.contains("EN")) {
                    		 longTotal = IssueShiftingOrderLocalServiceUtil.countIssueShiftingOrderInfo(Constans.REQUEST_STATE_FOR_FILTER,maritimeCode,portCode,shipName, callSign, shipDateFrom, shipDateTo, certificateNumber);
                    	 }
                    	searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
                    	searchContainer.setResults(results);
                    	
                    	IssueShiftingOrder instances = null;
                        for(int i =0;i<results.size();i++){
                        	String PortWharfName = "";
                        	instances = (IssueShiftingOrder)results.get(i);
                        	TempDocument temp = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(instances.getDocumentName(), instances.getDocumentYear());
                        	DmHistoryState dmHisState = DmHistoryStateLocalServiceUtil.getByStateCode(instances.getFlagStateOfShip());
                        	DmHistoryShipAgency dmHisShipAgency = DmHistoryShipAgencyLocalServiceUtil.getByShipAgencyCode(temp.getShipAgencyCode());
                        	PortWharfName = GetNameFunction.getPortWharfNameVN(temp.getCreatedDate(), instances.getAnchoringPortWharfCode());
                        	String messageType = "";
                        	
                        	PortletURL thongTinTausURL = renderResponse.createRenderURL();
                        	thongTinTausURL.setParameter("jspPage", "/html/report_export.jsp");
                        	thongTinTausURL.setParameter(PageType.DOCUMENT_NAME, String.valueOf(instances.getDocumentName()));
                        	thongTinTausURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(instances.getDocumentYear()));
                        	thongTinTausURL.setParameter(PageType.MESSAGE_TYPE, "70");
                        	thongTinTausURL.setParameter(PageType.REQUEST_CODE, instances.getRequestCode());
                        	thongTinTausURL.setWindowState(LiferayWindowState.POP_UP);
                        	thongTinTausURL.setPortletMode(PortletMode.VIEW);
                        	
                        %>
	                            <tr>
	                           
	                                <td><%=(searchContainer.getStart() +  (i+1))%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instances.getCertificateNo()) ? instances.getCertificateNo() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(instances.getNameOfShip()) ? instances.getNameOfShip() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(dmHisState) ? dmHisState.getStateName() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(temp.getCallSign()) ? temp.getCallSign() : ""%></td>
	                                <td class="text-left"><%=Validator.isNotNull(dmHisShipAgency) ? dmHisShipAgency.getShipAgencyNameVN() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(PortWharfName) ? PortWharfName : ""%></td>
	                                <td class="text-left"><%=FormatData.parseDateToTringType3(instances.getShiftingDate()) %></td>
	                                <% if (flagLanguage.contains("EN")) { %>
	                                <td class="text-left"><a href="javascript:viewKetQuaHoSoEnglish('<%=thongTinTausURL.toString()%>', 'SHIFTING ORDER')">View</a></td>
	                                <%} else{ %>
	                                <td class="text-left"><a href="javascript:viewKetQuaHoSo('<%=thongTinTausURL.toString()%>', 'KẾ HOẠCH ĐIỀU ĐỘNG TÀU')">Xem</a></td>
	                                <%
			                        	}
			                        %>
	                            </tr>
                        <%
                        	}
                        %>
                        </tbody>
                        </table>
               	<div class="tongso">
          			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" type="<%= typePaginator %>" />
      			</div>
         	</div>
<%
} else if (loaiThuTuc.equals(ThongTinTauAction.GIAY_PHEP_QUA_CANH)){
%>
<div class="wd-content-container bgdanhsach">
<% if (flagLanguage.contains("EN")) { %>
      <h2 class="tlemenu"><%=tenLoaiThuTuc %> /<%="PERMISSION FOR TRANSIT" %></h2>
                <div class="boxnd">
                    <table class="wd-table">
                        <thead>
                            <tr>
                                <!-- <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.sogiayphep" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.IMO" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.ngayhieuluc" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.cangbien" /></th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotac" /></th> -->
	                            <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /><br>No</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.sogiayphep" /><br>Number of Permission for Transit</th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /><br>Name of Ship</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.IMO" /><br>IMO Number</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /><br>Call Sign</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.ngayhieuluc" /><br>Date of Issue</th>	                            
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotacxem" /><br>View</th>
                            </tr>
                        </thead>
      <%} else{ %>
      <h2 class="tlemenu"><%=tenLoaiThuTuc %></h2>
                <div class="boxnd">
                    <table class="wd-table">
                        <thead>
                            <tr>
                                <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.sogiayphep" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.IMO" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.ngayhieuluc" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.cangbien" /></th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotac" /></th>
                            </tr>
                        </thead>
      <%
	}
%>

                        <tbody>
                        <%
                        List<IssuePermissionForTransit> result = null;
                        if (flagLanguage.contains("EN")) {
                        	result = IssuePermissionForTransitLocalServiceUtil.findIssuePermissionForTransitInfo(Constans.REQUEST_STATE_FOR_FILTER,maritimeCode,portCode, shipName, callSign, shipDateFrom, shipDateTo, certificateNumber, searchContainer.getStart(), searchContainer.getEnd());
                        } else {                    	
                    		result = IssuePermissionForTransitLocalServiceUtil.findIssuePermissionForTransitInfoByCertificateNumber(Constans.REQUEST_STATE_FOR_FILTER,maritimeCode,portCode, shipName, callSign, shipDateFrom, shipDateTo, certificateNumber, searchContainer.getStart(), searchContainer.getEnd());
                        }
                    	
                    	if (result == null) { result = new ArrayList<IssuePermissionForTransit>(); }
                    	
                    	long longTotal = IssuePermissionForTransitLocalServiceUtil.countIssuePermissionForTransitInfoByCertificateNumber(Constans.REQUEST_STATE_FOR_FILTER,maritimeCode,portCode,shipName, callSign, shipDateFrom, shipDateTo, certificateNumber);
                    	if (flagLanguage.contains("EN")) {
                    		longTotal = IssuePermissionForTransitLocalServiceUtil.countIssuePermissionForTransitInfo(Constans.REQUEST_STATE_FOR_FILTER,maritimeCode,portCode,shipName, callSign, shipDateFrom, shipDateTo, certificateNumber);
                    	}
                    	searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
                    	searchContainer.setResults(result);
                    	
                    	IssuePermissionForTransit instance = null;
                        for(int i =0;i<result.size();i++){
                        	String PortName = "";
                        	instance = (IssuePermissionForTransit)result.get(i);
                        	TempDocument temp = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(instance.getDocumentName(), instance.getDocumentYear());
                        	PortName = GetNameFunction.getPortName(temp.getCreatedDate(), temp.getPortCode());
                        	String messageType = "";
                        	
                        	PortletURL thongTinTauURL = renderResponse.createRenderURL();
                        	thongTinTauURL.setParameter("jspPage", "/html/report_export.jsp");
                        	thongTinTauURL.setParameter(PageType.DOCUMENT_NAME, String.valueOf(instance.getDocumentName()));
                        	thongTinTauURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(instance.getDocumentYear()));
                        	thongTinTauURL.setParameter(PageType.MESSAGE_TYPE, "90");
                        	thongTinTauURL.setParameter(PageType.REQUEST_CODE, instance.getRequestCode());
                        	thongTinTauURL.setWindowState(LiferayWindowState.POP_UP);
                        	thongTinTauURL.setPortletMode(PortletMode.VIEW);
                        %>
	                            <tr>
	                                <td><%=(searchContainer.getStart() +  (i+1))%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getCertificateNo()) ? instance.getCertificateNo() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getNameOfShip()) ? instance.getNameOfShip() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(temp) ? temp.getImo() : ""%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getCallSign()) ? instance.getCallSign() : ""%></td>
	                                <td class="text-left"><%=FormatData.parseDateToTringType3(instance.getSignDate()) %></td>
	                                
	                                <% if (flagLanguage.contains("EN")) { %>
	                                <td class="text-left"><a href="javascript:viewKetQuaHoSoEnglish('<%=thongTinTauURL.toString()%>', 'PERMISSION FOR TRANSIT')">View</a></td>
	                                <%} else{ %>
	                                <td class="text-left"><%=Validator.isNotNull(PortName) ? PortName : "" %></td>
	                                <td class="text-left"><a href="javascript:viewKetQuaHoSo('<%=thongTinTauURL.toString()%>', 'GIẤY PHÉP QUÁ CẢNH')">Xem</a></td>
	                                <%
			                        	}
			                        %>
	                                
	                            </tr>
                       	<%
                        }
                        %>
                        </tbody>
                        </table>
               	<div class="tongso">
          			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" type="<%= typePaginator %>" />
      			</div>
         	</div>
<%	
} else if (loaiThuTuc.equals(ThongTinTauAction.THONG_TIN_TAU)){
%>
<div class="wd-content-container bgdanhsach">
<% if (flagLanguage.contains("EN")) { %>
      <h2 class="tlemenu"><%=tenLoaiThuTuc %> /<%="Ship Certificate Review" %></h2>
                <div class="boxnd">
                    <table class="wd-table">
                        <thead>
                            <tr>
                                <!-- <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.quoctich" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.GT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.NT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.DWT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.thuyentruong" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hoso" /></th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotac" /></th> -->
	                            <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /><br>No</th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /><br>Name of Ship</th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.quoctich" /><br>Flag State of Ship</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /><br>Call Sign</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.GT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.NT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.DWT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.thuyentruong" /><br>Name of Master</th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hoso" /><br>Public Services</th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotacxem" /><br>View</th>
                            </tr>
                        </thead>

      <%} else{ %>
      <h2 class="tlemenu"><%=tenLoaiThuTuc %></h2>
                <div class="boxnd">
                    <table class="wd-table">
                        <thead>
                            <tr>
                                <th  width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
	                            <th><liferay-ui:message  key="vn.dtt.kehoach.quoctich" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.GT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.NT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.DWT" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.thuyentruong" /></th>
	                            <th><liferay-ui:message key="vn.dtt.kehoach.hoso" /></th>
	                            <th width="100px"><liferay-ui:message key="vn.dtt.kehoach.thaotac" /></th>
                            </tr>
                        </thead>

      <%
	}
%>
                        <tbody>
                        <%
                        List<TempDocument> result = null;
                    	result = TempDocumentLocalServiceUtil.findTempDocumentInfo("10,12,13,18,19", maritimeCode,portCode, shipName, callSign, shipDateFrom, shipDateTo, searchContainer.getStart(), searchContainer.getEnd());
                    	if (result == null) { result = new ArrayList<TempDocument>(); }
                    	long longTotal = TempDocumentLocalServiceUtil.countTempDocumentInfo("10,12,13,18,19", maritimeCode,portCode, shipName, callSign, shipDateFrom, shipDateTo); 
                    	searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
                    	searchContainer.setResults(result);
                    	
                    	TempDocument instance = null;
                        for(int i =0;i<result.size();i++){
                        	instance = (TempDocument)result.get(i);
                        	DmHistoryState dmHisState = DmHistoryStateLocalServiceUtil.getByStateCode(instance.getStateCode());
                        	DmHistoryDocType dmHisDocType = DmHistoryDocTypeLocalServiceUtil.findByDocumentType(instance.getDocumentTypeCode());
                        	String messageType = "";
                        	
                        	PortletURL thongTinTauURL = renderResponse.createRenderURL();
                        	thongTinTauURL.setParameter("jspPage", "/html/baocao/thongtintau/bao_cao_kiem_tra_thong_tin_tau_export.jsp");
                        	thongTinTauURL.setParameter(PageType.DOCUMENT_NAME, String.valueOf(instance.getDocumentName()));
                        	thongTinTauURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(instance.getDocumentYear()));
                        	thongTinTauURL.setWindowState(LiferayWindowState.POP_UP);
                        	thongTinTauURL.setPortletMode(PortletMode.VIEW);
                        %>
	                            <tr>
	                                <td><%=(searchContainer.getStart() +  (i+1))%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getShipName()) ? instance.getShipName() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(dmHisState) ? dmHisState.getStateName() : "" %></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getCallSign()) ? instance.getCallSign() : ""%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getGrt()) ? instance.getGrt() : ""%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getNt()) ? instance.getNt() : ""%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getDwt()) ? instance.getDwt() : ""%></td>
	                                <td class="text-left"><%=Validator.isNotNull(instance.getShipCaptain()) ? instance.getShipCaptain() : ""%></td>
	                                <td class="text-left"><%=Validator.isNotNull(dmHisDocType) ? dmHisDocType.getDocumentTypeName() : instance.getDocumentTypeCode()%></td>
	                                <% if (flagLanguage.contains("EN")) { %>
	                                <td class="text-left"><a href="javascript:viewKetQuaHoSoEnglish('<%=thongTinTauURL.toString()%>', 'SHIP CERTIFICATE REVIEW')">View</a></td>
	                                <%} else{ %>
	                                <td class="text-left"><a href="javascript:viewKetQuaHoSo('<%=thongTinTauURL.toString()%>', 'THÔNG TIN TÀU')">Xem</a></td>
	                                <%
			                        	}
			                        %>
	                                
	                            </tr>
	                             <%
                        }
	                            %>
                        </tbody>
                        </table>
               	<div class="tongso">
          			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" type="<%= typePaginator %>" />
      			</div>
         	</div>
<%
}
%>
