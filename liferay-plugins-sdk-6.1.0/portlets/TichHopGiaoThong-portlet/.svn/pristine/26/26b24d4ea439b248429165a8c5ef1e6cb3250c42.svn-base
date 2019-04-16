<%@page import="java.util.Date"%>
<%@page import="vn.gt.dao.common.service.UserSignLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserSign"%>
<%@page import="vn.gt.dao.common.model.impl.UserSignImpl"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiQuaCanh"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhai"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiXuatCanh"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePortClearance"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueAcceptance"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtStatus"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.impl.DmGtStatusImpl"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGTShipPositionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGTShipPosition"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryDocType"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmHistoryDocTypeImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.DmDocType"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryState"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryMaritime"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.utils.document.ChuKiSoConstant"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="javax.portlet.PortletURL"%>

<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiNhapCanh"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil_IW"%>
<%@page import="vn.gt.dao.noticeandmessage.service.NoticeShipMessageLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderImpl"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>

<%@page pageEncoding="UTF-8"%>

<style>
	.bt{ float: center; }
	 #reject_data {}
</style>

<script type="text/javascript">
	var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>

<div style="visibility: hidden; height: 0px; width: 0px;">
	<object id="plugin0" type="application/x-cryptolib05plugin" width="0" height="0"></object>
</div>
<%
String lCode = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
//Lay thong tin vao lenh dieu dong
IssueShiftingOrder shiftingOrderEdit = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCodethuTuc);
Boolean rolequantri = false;
Boolean rolevanthu = false;
Boolean rolelanhdao = false;
User currentuser = UserLocalServiceUtil.fetchUser(themeDisplay.getUserId());
for (Organization og : currentuser.getOrganizations()) {
	if (og.getGroup().getFriendlyURL().contains("dong-bo")) {
		rolequantri = true;    		
	}
	if (og.getGroup().getFriendlyURL().contains("van-thu")) {
		rolevanthu = true;    		
	}
	if (og.getGroup().getFriendlyURL().contains("lanh-dao")) {
		rolelanhdao = true;    		
	}
}
	TempDocument temp = null;
	List<TempDocument> liTempDocuments1 = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (liTempDocuments1 != null && liTempDocuments1.size() > 0) {
		temp = liTempDocuments1.get(0);
	}
	String tieuDeBanKhai = "";
	if (renderRequest.getParameter(PageType.TIEU_DE_BAN_KHAI) != null && renderRequest.getParameter(PageType.TIEU_DE_BAN_KHAI).trim().length() > 0) {
		tieuDeBanKhai = renderRequest.getParameter(PageType.TIEU_DE_BAN_KHAI).trim();
	}
	
	String loaiThuTucBandau = loaiThuTuc;	
	if(loaiThuTuc == MessageType.LOAT_THU_TUC_CHO_DONG_DAU) {		
		LogFactoryUtil.getLog(ThuTucAction.class).info("===loaiThuTucBandau===MessageType.LOAT_THU_TUC_CHO_DONG_DAU======" + MessageType.LOAT_THU_TUC_CHO_DONG_DAU);
		// reset lCode, loaiThuTuc
		loaiThuTuc = temp.getDocumentTypeCode();
		
		lCode = temp.getDocumentTypeCode();
	}
	if(loaiThuTuc == MessageType.LOAT_THU_TUC_CHO_KY_SO) {		
		LogFactoryUtil.getLog(ThuTucAction.class).info("===loaiThuTucBandau===MessageType.LOAT_THU_TUC_CHO_KY_SO======" + MessageType.LOAT_THU_TUC_CHO_KY_SO);
		// reset lCode, loaiThuTuc
		loaiThuTuc = temp.getDocumentTypeCode();
		
		lCode = temp.getDocumentTypeCode();
	}
	String loaiThongTinChung = Utils.checkLoaiThuTuc(loaiThuTuc);
	// 
			
	// 
	if (temp != null) {

		DmHistoryMaritime dmHisMaritime1 = DmHistoryMaritimeLocalServiceUtil.getByMaritimeCode(temp.getMaritimeCode());
		DmHistoryState dmHisState1 = DmHistoryStateLocalServiceUtil.getByStateCode(temp.getStateCode());
		DmGtStatus dmGtStatus1 = DmGtStatusLocalServiceUtil.findByStatusCode(temp.getDocumentStatusCode(), MessageType.ROLE_THU_TUC);
		DmGtStatus dmGtStatusKH = DmGtStatusLocalServiceUtil.findByStatusCode(temp.getRequestState(), MessageType.ROLE_KE_HOACH);
		DmGTShipPosition dmShipPosition1 = DmGTShipPositionLocalServiceUtil.getByPositionCode(String.valueOf(temp.getShipPosition()));
		DmHistoryDocType dmHistoryDocType1 = DmHistoryDocTypeLocalServiceUtil.findByDocumentType(temp.getDocumentTypeCode());
		
		if (dmGtStatus1 == null){
			dmGtStatus1 = new DmGtStatusImpl();
		}
		if (dmGtStatusKH == null){
			dmGtStatusKH = new DmGtStatusImpl();
		}
		String statusName = "";
				
		if (loaiThuTucBandau == MessageType.LOAT_THU_TUC_CHO_DONG_DAU || loaiThuTucBandau == MessageType.LOAT_THU_TUC_CHO_KY_SO 
				|| loaiThuTucBandau == MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN) {
			if (temp.getDocumentStatusCode() > 0) {
				if (temp.getRequestState()== TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG){
					statusName = dmGtStatusKH.getStatusName();
				} else if (temp.getRequestState()== TrangThaiBanKhai.DA_CAP_LENH_DIEU_DONG && temp.getDocumentStatusCode() == TrangThaiBanKhai.DA_TIEP_NHAN_THU_TUC){
					statusName = dmGtStatusKH.getStatusName();
				} else { statusName = dmGtStatus1.getStatusName();
				}
			} else { statusName = dmGtStatusKH.getStatusName();
			}
		} else { statusName = dmGtStatus1.getStatusName();
		}
		%>
		<liferay-portlet:renderURL var="reTurnHomeURL" >
		<liferay-portlet:param name="mvcPath" value="/html/thutuc/view.jsp"/>
		</liferay-portlet:renderURL>
		<div class="bgtlemain">
		<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_QUA_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_VAO_CANG == loaiThongTinChung) {%>
				
				<% if (temp.getShipPosition() == 1) {%>
				<h2 class="tlemenu tlemain">Tàu đến cảng</h2>
				<% } else if (temp.getShipPosition() == 2) {%>
				<h2 class="tlemenu tlemain">Tàu trong cảng</h2>
				<%}%>
				
			<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_ROI_CANG == loaiThongTinChung) {%>
				<h2 class="tlemenu tlemain">Tàu rời cảng</h2>
				
			<%} else if (MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == loaiThongTinChung) {%>
			<h2 class="tlemenu tlemain">PT thủy nội địa rời cảng</h2>
			
			<%} else if (MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == loaiThongTinChung) {%>
			<h2 class="tlemenu tlemain">PT thủy nội địa vào cảng</h2>
			
			<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == loaiThongTinChung) {%>
				<h2 class="tlemenu tlemain">Tàu đến/ rời cảng</h2>
			<%} else {%>
			<h2 class="tlemenu tlemain">Tàu trong cảng</h2>
			<%} %>
			<!-- VaiTro -->
			<%@ include file="/html/menu/vai-tro.jsp"%>
		</div>
		<form id="userForm" name="userForm" method="post">
			<div class="wd-main-content wd-page-staff">
				<div id="Accordion1" class="Accordion" tabindex="0">
					<div class="AccordionPanel">
						<div class="AccordionPanelTab">
							<h4>Thông tin chung<img src="<%=request.getContextPath()%>/img/front/next_tle.png"></h4>
							<div class="righttle"></div>
						</div>
						<div class="AccordionPanelContent">
							<div class="tbl_left">
								<table class="table_noboder">
									<thead>
										<tr>
											<th class="text-left" width="90px"><liferay-ui:message key="vn.dtt.thutuc.cangvu" /></th>
											<td class="text-leftu"><%=Validator.isNotNull(dmHisMaritime1) ? dmHisMaritime1.getMaritimeNameVN() : temp.getMaritimeCode()%></td>
										</tr>
										<tr>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.tentau" /></th>
											<td class="text-leftu"><%=temp.getShipName()%></td>
										</tr>
										<tr>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.taudenroi" /></th>
											<td class="text-leftu"><%=Validator.isNotNull(dmShipPosition1) ? dmShipPosition1.getRemarks() : temp.getShipPosition()%></td>
										</tr>
										<tr>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.trangthai" /></th>
											<td class="text-leftu"><i><%=Validator.isNotNull(statusName) ? statusName : ""%></i></td>
										</tr>
									</thead>
								</table>
							</div>
								<div class="tbl_left">
								<table class="table_noboder">
									<thead>
										<tr>
											<th class="text-left" width="150px"><liferay-ui:message key="vn.dtt.thutuc.mabankhai" /></th>
										<td class="text-left"><%=temp.getDocumentName()%></td>
										</tr>
										<tr>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.quoctich" /></th>
										<td class="text-leftu"><%=Validator.isNotNull(dmHisState1) ? dmHisState1.getStateName() : temp.getStateCode()%></td>
										</tr>
										
										<%if ( loaiThongTinChung.equals(MessageType.LOAT_THU_TUC_VAO_CANG) || loaiThongTinChung.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
										|| loaiThongTinChung.equals(MessageType.LOAT_THU_TUC_NHAP_CANH) || loaiThongTinChung.equals(MessageType.LOAT_THU_TUC_QUA_CANH)) {%>
										<tr>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.thoigianden" /></th>
											<td class="text-leftu"><%=FormatData.parseDateToTringType3(temp.getShipDateFrom())%></td>
										</tr>	
										<%} else if ( loaiThongTinChung.equals(MessageType.LOAT_THU_TUC_XUAT_CANH) || loaiThongTinChung.equals(MessageType.LOAT_THU_TUC_ROI_CANG) 
										|| loaiThongTinChung.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)	) {%>
										<tr>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.thoigianroi" /></th>
											<td class="text-leftu"><%=FormatData.parseDateToTringType3(temp.getShipDateTo())%></td>
										</tr>
											
										<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == loaiThongTinChung) {%>
										<tr>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.thoigianden" /></th>
											<td class="text-leftu"><%=FormatData.parseDateToTringType3(temp.getShipDateFrom())%></td>
										</tr>
										<%}%>
										
									</thead>
								</table>
							</div>
			                <div class="tbl_left">
			                    <table class="table_noboder">
			                        <thead>
			                            <tr>
			                                <th class="text-left" width="150px"><liferay-ui:message key="vn.dtt.thutuc.loaibankhai" /></th>
			                                <td class="text-leftu"><%=Validator.isNotNull(dmHistoryDocType1) ? dmHistoryDocType1.getDocumentTypeName() : temp.getDocumentTypeCode()%></td>
			                            </tr>
			                            <tr>
			                            	<%if (MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == loaiThongTinChung || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == loaiThongTinChung) {%>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.sodangky" /></th>
											<%} else  {%>
											<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.hohieu" /></th>
											<%} %>                                
			                                <td class="text-leftu"><%=temp.getCallSign()%></td>
			                            </tr>
			                            <%if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == loaiThongTinChung) {%>
			                            <tr>
			                                <th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.thoigianroi" /></th>
			                                <td class="text-leftu"><%=FormatData.parseDateToTringType3(temp.getShipDateTo())%></td>
			                            </tr>
			                            <%}%>                            
			                        </thead>
			                    </table>
			                </div>
						</div>
					</div>
			       <%
			       	//giay phep roi cang
					List<IssuePortClearance> liIssuePortClearances = IssuePortClearanceLocalServiceUtil.findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
							FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);       
					List<IssuePortClearance> lstTaoOrSuaGiayPhepXuatCanh = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(
							FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);		
					//giay phep qua canh
					IssuePermissionForTransit issueIssuePermissionForTransits = IssuePermissionForTransitLocalServiceUtil.findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
							FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);		
					List<IssuePermissionForTransit> lstTaoOrSuaGiayPhepQuaCanh = IssuePermissionForTransitLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(
							FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);		
					//giay phep vao cang
					List<IssueAcceptance> liIssueAcceptances =  new ArrayList <IssueAcceptance>() ;
					liIssueAcceptances = IssueAcceptanceLocalServiceUtil.findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(
							FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);			
					List<IssueAcceptance> lstTaoOrSuaGiayPhepVaoCang = new ArrayList <IssueAcceptance>() ;
					lstTaoOrSuaGiayPhepVaoCang = IssueAcceptanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(
							FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
					String requestCodeReportThuTuc = ParamUtil.getString(request, PageType.REQUEST_CODE);
					
					IssuePortClearance suaGiayPhepXuatCanh = null;
					IssuePermissionForTransit suaGiayPhepQuaCanh = null;
					IssueAcceptance suaGiayPhepVaoCang = null;
					
					if (requestCodeReportThuTuc != null && requestCodeReportThuTuc.trim().length() > 0) {
						suaGiayPhepXuatCanh = IssuePortClearanceLocalServiceUtil.getByRequestCode(requestCodeReportThuTuc);
						suaGiayPhepQuaCanh = IssuePermissionForTransitLocalServiceUtil.getByrequestCode(requestCodeReportThuTuc);
						suaGiayPhepVaoCang = IssueAcceptanceLocalServiceUtil.getByRequestCode(requestCodeReportThuTuc);
					}		
					LogFactoryUtil.getLog(ThuTucAction.class).info("===thong_tin_chung_ho_so.jsp===DocumentStatusCode======" + temp.getDocumentStatusCode());		
					if (messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) == 0) {
						// La thanh phan ho so
			      		%>
						<%@ include file="/html/thutuc/thanh_phan_ho_so_thu_tuc.jsp"%>
						<%
					} else {
						// Chi tiet ho so
						if (messageType.compareTo(String.valueOf(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC)) != 0 &&
							messageType.compareTo(String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)) != 0) {
						%>
							<!-- Thong tin lich su ho so -->
							<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so.jsp"%>
						<%}%>
					
			        <!------------- /thong_tin_chung_ho_so.jsp-------- -->
			        <div class="AccordionPanel">
			            <div class="AccordionPanelTab"><h4>Nội dung giấy tờ<img src="<%=request.getContextPath()%>/img/front/next_tle.png"></h4>
			                <div class="righttle"></div>
			            </div>
			            <%
			           		if (// truong hop GPRC XuatCanh && RoiCang           				
			         			(messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0 && temp.getDocumentTypeCode().equalsIgnoreCase(MessageType.LOAT_THU_TUC_VAO_CANG) != true &&
			         				lstTaoOrSuaGiayPhepXuatCanh != null && lstTaoOrSuaGiayPhepXuatCanh.size() == 0 && temp.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP) |       				
			       				(messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0 && temp.getDocumentTypeCode().equalsIgnoreCase(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) != true  &&
			       					lstTaoOrSuaGiayPhepXuatCanh != null && lstTaoOrSuaGiayPhepXuatCanh.size() == 0 && temp.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP) |	
			       				//sua lan mot
			       				(ParamUtil.getString(request, PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE).length() > 0 && 
			       						temp.getDocumentTypeCode().equalsIgnoreCase(MessageType.LOAT_THU_TUC_VAO_CANG) != true && temp.getDocumentTypeCode().equalsIgnoreCase(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) != true &&
			       					Validator.isNotNull(suaGiayPhepXuatCanh.getRequestState()) && temp.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP) |       				
			       				//sua lan n
			       				(ParamUtil.getString(request, String.valueOf(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE_LAN_THU_N)).length() > 0 && 
			       						temp.getDocumentTypeCode().equalsIgnoreCase(MessageType.LOAT_THU_TUC_VAO_CANG) != true && temp.getDocumentTypeCode().equalsIgnoreCase(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) != true ) ) 
			           		{  
			            		%>
								<!-- Cai nay chi tiet cho tung ho so o day -->
								<%
								if(loaiThuTuc == MessageType.LOAT_THU_TUC_ROI_CANG) {
									%>
									<jsp:include page="/html/thutuc/inland_tao_giay_phep_roi_cang.jsp"/>
									<% 
								} else if(loaiThuTuc == MessageType.LOAT_THU_TUC_ROI_CANG_PTTND ) {
									%>
									<jsp:include page="/html/thutuc/pttnd_tao_giay_phep_roi_cang.jsp"/>
									<% 
								} else  {
									%>
									<jsp:include page="/html/thutuc/tao_giay_phep_roi_cang.jsp"/>
									<%
								}
			           		} else if (//truong hop PTTND Vao cang
			         			(messageType.compareTo(String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)) == 0 &&
			         				lstTaoOrSuaGiayPhepVaoCang != null && lstTaoOrSuaGiayPhepVaoCang.size() == 0 && temp.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP) |
			         				
			       				//sua lan mot
			       				(ParamUtil.getString(request, PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_ISSUE_ACCEPTANCE).length() > 0 &&
			       					Validator.isNotNull(suaGiayPhepVaoCang.getRequestState()) && temp.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP) |
			       				
			       				//sua lan n
			       				(ParamUtil.getString(request, String.valueOf(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_ISSUE_ACCEPTANCE_LAN_THU_N)).length() > 0)) {
			            		%>
								<!-- Cai nay chi tiet cho tung ho so o day -->
								<%
								if(loaiThuTuc == MessageType.LOAT_THU_TUC_VAO_CANG_PTTND ) {
									%>
									<jsp:include page="/html/thutuc/tao_giay_phep_vao_cang.jsp"/>
									<% 
								}
							} else if (
								//truong hop GPQC
								(messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_QUA_CANH)) == 0 && lstTaoOrSuaGiayPhepQuaCanh != null &&
									lstTaoOrSuaGiayPhepQuaCanh.size() == 0 && temp.getDocumentStatusCode() == TrangThaiBanKhaiQuaCanh.DE_NGHI_CAP_GIAY_PHEP) |
									
								//sua lan mot
								(ParamUtil.getString(request, PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PERMISSION_FOR_TRANSIT).length() > 0 &&
									Validator.isNotNull(suaGiayPhepQuaCanh.getRequestState()) && temp.getDocumentStatusCode() == TrangThaiBanKhaiQuaCanh.DE_NGHI_CAP_GIAY_PHEP) |
								
								//sua lan n
								(ParamUtil.getString(request, String.valueOf(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PERMISSION_FOR_TRANSIT_LAN_THU_N)).length() > 0)) {
								%>
								<!-- Cai nay chi tiet cho tung ho so o day -->
								<jsp:include page="/html/thutuc/tao_giay_phep_qua_canh.jsp"/>
							<%
							} else if (messageType.compareTo(String.valueOf(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC)) == 0) {
											
									if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0 || loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG) == 0) {
							%>
									<!-- Cai nay chi tiet cho tung ho so o day -->
									<jsp:include page="/html/thutuc/xac_nhan_hoan_thanh_thu_tuc_nhap_canh.jsp"/>
									<%
									} else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0 || loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0) {
									%>
									<!-- Cai nay chi tiet cho tung ho so o day -->
									<jsp:include page="/html/thutuc/xac_nhan_hoan_thanh_thu_tuc_xuat_canh.jsp"/>
									<%
									} else if (loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0 
											|| loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0) {
									%>
									<!-- Cai nay chi tiet cho tung ho so o day -->
									<jsp:include page="/html/thutuc/xac_nhan_hoan_thanh_cap_nhat_du_lieu_pttnd.jsp"/>
									<%
									} else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0) {
									%>
									<!-- Cai nay chi tiet cho tung ho so o day -->
									<jsp:include page="/html/thutuc/xac_nhan_hoan_thanh_thu_tuc_qua_canh.jsp"/>
									<%
									}
							} else if (messageType.compareTo(String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)) == 0) {
							%>
								<jsp:include page="/html/thutuc/cac_giay_to_phai_xuat_trinh.jsp"/>
							<% 
								} else {
							%>
							<!-- Cai nay chi tiet cho tung ho so o day, XUAT RA FILE BAO CAO  -->
							<%@ include file="/html/thutuc/chi_tiet_ho_so.jsp" %>
						<%
							}
						%>
					</div>
					<%
						}
					%>

			<div class="boxbt">
				<%
				String formDate = UUID.randomUUID().toString();
				PortletURL actionUrlTiepNHan = renderResponse.createActionURL();
				PortletURL actionUrlTuChoi = renderResponse.createActionURL();
				PortletURL actionUrlDoiChieu = renderResponse.createActionURL();
				PortletURL actionUrlXacNhanHoanThanhThuTuc = renderResponse.createActionURL();
				PortletURL actionUrlHuy = renderResponse.createActionURL();
				PortletURL actionUrlKiemDuyet = renderResponse.createActionURL();
				PortletURL actionUrlKyso = renderResponse.createActionURL();
				PortletURL actionUrlDongDau = renderResponse.createActionURL();	
				PortletURL actionUrlSua = renderResponse.createActionURL();
				PortletURL actionUrlDuyet = renderResponse.createActionURL();
				PortletURL actionUrlChoLanhDaoDuyet = renderResponse.createActionURL();
				PortletURL actionUrlChuyenTraHoSo = renderResponse.createActionURL();
				PortletURL actionUrlChuyenGiaoDien = renderResponse.createActionURL();
				PortletURL actionUrlYeuCauBoSungHoSo = renderResponse.createActionURL();	
				PortletURL actionUrlYeuCauXuatTrinh = renderResponse.createActionURL();
				PortletURL actionUrlChapNhanGiayTo = renderResponse.createActionURL();
				PortletURL actionUrlTuChoiGiayTo = renderResponse.createActionURL();	
				PortletURL actionUrlNotifySuaDoiBoXung = renderResponse.createActionURL();
				
				if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0) {
					actionUrlTiepNHan.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlDoiChieu.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlXacNhanHoanThanhThuTuc.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlKiemDuyet.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");		
					actionUrlYeuCauBoSungHoSo.setParameter(ActionRequest.ACTION_NAME, "yeuCauBoSungHoSo");		
					actionUrlYeuCauXuatTrinh.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");
					actionUrlChapNhanGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");
					actionUrlTuChoiGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");
					
					actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanhKysoLanhDao"); 
					actionUrlKyso.setParameter("lCode", lCode);
					actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucVanThuDongDauLenhDieuDong");
					actionUrlDongDau.setParameter("lCode", lCode);
					actionUrlDongDau.setParameter("successPage", reTurnHomeURL.toString());
					actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					actionUrlNotifySuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "thuTucNhapCanh");
					
				}if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG) == 0) {
					actionUrlTiepNHan.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");
					actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");
					actionUrlDoiChieu.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");
					actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");
					actionUrlXacNhanHoanThanhThuTuc.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");
					actionUrlKiemDuyet.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");		
					actionUrlYeuCauXuatTrinh.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");
					actionUrlChapNhanGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");
					actionUrlTuChoiGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");		
					actionUrlYeuCauBoSungHoSo.setParameter(ActionRequest.ACTION_NAME, "yeuCauBoSungHoSo");		
					actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");
					actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");	
					actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");	
					actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");	
					actionUrlNotifySuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCang");
					
					if ((FormatData.convertToInt(messageType) == MessageType.LENH_DIEU_DONG)){
						actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucVanThuDongDauLenhDieuDong");
						actionUrlDongDau.setParameter("lCode", lCode);
						actionUrlDongDau.setParameter("successPage", reTurnHomeURL.toString());
						actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanhKysoLanhDao");
			            actionUrlKyso.setParameter("lCode", lCode);
			            actionUrlKyso.setParameter("successPage", reTurnHomeURL.toString());
					}
					
				}else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0) {
					actionUrlTiepNHan.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlDoiChieu.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlXacNhanHoanThanhThuTuc.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlKiemDuyet.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlYeuCauBoSungHoSo.setParameter(ActionRequest.ACTION_NAME, "yeuCauBoSungHoSo");		
					actionUrlYeuCauXuatTrinh.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlChapNhanGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlTuChoiGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");		
					actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					
					actionUrlNotifySuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienRoiCang");
					 actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanhDongDau");
					 actionUrlDongDau.setParameter("lCode", lCode);
			         actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanhKyso");
			         actionUrlKyso.setParameter("lCode", lCode);
			         actionUrlKyso.setParameter("successPage", reTurnHomeURL.toString());
			         actionUrlDongDau.setParameter("successPage", reTurnHomeURL.toString());
			         
				}else if (loaiThuTuc != null && 
			  		  (loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0) ) { 
					actionUrlTiepNHan.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlDoiChieu.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlXacNhanHoanThanhThuTuc.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlKiemDuyet.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlYeuCauBoSungHoSo.setParameter(ActionRequest.ACTION_NAME, "yeuCauBoSungHoSo");		
					actionUrlYeuCauXuatTrinh.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlChapNhanGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlTuChoiGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");		
					actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					
					actionUrlNotifySuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienRoiCang");
					 actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCangDongDau");
					 actionUrlDongDau.setParameter("lCode", lCode);
			         actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCangKyso");
			         actionUrlKyso.setParameter("lCode", lCode);
			         actionUrlKyso.setParameter("successPage", reTurnHomeURL.toString());
			         actionUrlDongDau.setParameter("successPage", reTurnHomeURL.toString()); 
			         
				} else if (loaiThuTuc != null && 	  		  
			  		  loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0) { 
					actionUrlTiepNHan.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlDoiChieu.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlXacNhanHoanThanhThuTuc.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlKiemDuyet.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlYeuCauBoSungHoSo.setParameter(ActionRequest.ACTION_NAME, "yeuCauBoSungHoSo");		
					actionUrlYeuCauXuatTrinh.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlChapNhanGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlTuChoiGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");		
					actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					
					actionUrlNotifySuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "thuTucRoiCang");
					actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienVaoCang");
				 	actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCangDongDau");
				 	actionUrlDongDau.setParameter("lCode", lCode);
			        actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "thuTucVaoCangKyso");
			        actionUrlKyso.setParameter("lCode", lCode);        
			        if ((FormatData.convertToInt(messageType) == MessageType.LENH_DIEU_DONG)){
						actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucVanThuDongDauLenhDieuDong");
						actionUrlDongDau.setParameter("lCode", lCode);
						actionUrlDongDau.setParameter("successPage", reTurnHomeURL.toString());
						actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanhKysoLanhDao");
			            actionUrlKyso.setParameter("lCode", lCode);
			            actionUrlKyso.setParameter("successPage", reTurnHomeURL.toString());
					}
			        
				} else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0) {
					actionUrlTiepNHan.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");
					actionUrlDoiChieu.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");
					actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");
					actionUrlXacNhanHoanThanhThuTuc.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");
					actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");
					actionUrlKiemDuyet.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoXuatCanh");
					actionUrlYeuCauBoSungHoSo.setParameter(ActionRequest.ACTION_NAME, "yeuCauBoSungHoSo");
					actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanhKyso");
					actionUrlKyso.setParameter("lCode", lCode);
			        actionUrlDongDau.setParameter("lCode", lCode);
					actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanhDongDau");
					actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");
					actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");	
					actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");	
					actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");	
					actionUrlYeuCauXuatTrinh.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlChapNhanGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");
					actionUrlTuChoiGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoRoiCang");				
					actionUrlNotifySuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "thuTucXuatCanh");		
					actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienXuatCanh");
					
				} else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0) {
					actionUrlTiepNHan.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlDoiChieu.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlXacNhanHoanThanhThuTuc.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlKiemDuyet.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoQuaCanh");	
					actionUrlYeuCauXuatTrinh.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");
					actionUrlChapNhanGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");
					actionUrlTuChoiGiayTo.setParameter(ActionRequest.ACTION_NAME, "kiemDuyetHoSoNhapCanh");		
					actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");
					actionUrlYeuCauBoSungHoSo.setParameter(ActionRequest.ACTION_NAME, "yeuCauBoSungHoSo");
					actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanhKyso");
					actionUrlKyso.setParameter("lCode", lCode);
			        actionUrlDongDau.setParameter("lCode", lCode);
					actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanhDongDau");
					actionUrlNotifySuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "thuTucQuaCanh");		
					actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienQuaCanh");		
					if ((FormatData.convertToInt(messageType) == MessageType.LENH_DIEU_DONG)){
						actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "thuTucVanThuDongDauLenhDieuDong");
						actionUrlDongDau.setParameter("lCode", lCode);
						actionUrlDongDau.setParameter("successPage", reTurnHomeURL.toString());
						actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanhKysoLanhDao");
			            actionUrlKyso.setParameter("lCode", lCode);
			            actionUrlKyso.setParameter("successPage", reTurnHomeURL.toString());
					}
				}	
				if (messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) == 0) {
					actionUrlTiepNHan.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlDoiChieu.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlTuChoi.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlHuy.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));		
					actionUrlSua.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlDuyet.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlKyso.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlDongDau.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlNotifySuaDoiBoXung.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlChoLanhDaoDuyet.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
					actionUrlChuyenTraHoSo.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
				} else {
					actionUrlTiepNHan.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlTuChoi.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlDoiChieu.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlKiemDuyet.setParameter(PageType.MESSAGE_TYPE, messageType);		
					actionUrlYeuCauXuatTrinh.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlChapNhanGiayTo.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlTuChoiGiayTo.setParameter(PageType.MESSAGE_TYPE, messageType);			
					actionUrlKyso.setParameter(PageType.MESSAGE_TYPE, messageType);		
					actionUrlDongDau.setParameter(PageType.MESSAGE_TYPE, messageType);		
					actionUrlHuy.setParameter(PageType.MESSAGE_TYPE, messageType);		
					actionUrlSua.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlDuyet.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlYeuCauBoSungHoSo.setParameter(PageType.MESSAGE_TYPE, messageType);		
					actionUrlNotifySuaDoiBoXung.setParameter(PageType.MESSAGE_TYPE, messageType);		
					actionUrlChuyenGiaoDien.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlChoLanhDaoDuyet.setParameter(PageType.MESSAGE_TYPE, messageType);
					actionUrlChuyenTraHoSo.setParameter(PageType.MESSAGE_TYPE, messageType);
				}	
				if (FormatData.convertToInt(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC) == FormatData.convertToInt(messageType)) {
					actionUrlXacNhanHoanThanhThuTuc.setParameter(PageType.MESSAGE_TYPE, MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC);
					actionUrlHuy.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
				}	
				actionUrlYeuCauBoSungHoSo.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlYeuCauBoSungHoSo.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlYeuCauBoSungHoSo.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlYeuCauBoSungHoSo.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlYeuCauBoSungHoSo.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TU_CHOI));
				actionUrlYeuCauBoSungHoSo.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
				actionUrlYeuCauBoSungHoSo.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlKiemDuyet.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlKiemDuyet.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlKiemDuyet.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlKiemDuyet.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlKiemDuyet.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));
				actionUrlKiemDuyet.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
				actionUrlKiemDuyet.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlYeuCauXuatTrinh.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlYeuCauXuatTrinh.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlYeuCauXuatTrinh.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlYeuCauXuatTrinh.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlYeuCauXuatTrinh.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));				
				actionUrlYeuCauXuatTrinh.setParameter("BTN_ACTION_TYPE", String.valueOf(1));
				actionUrlYeuCauXuatTrinh.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
				actionUrlYeuCauXuatTrinh.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlChapNhanGiayTo.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlChapNhanGiayTo.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlChapNhanGiayTo.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlChapNhanGiayTo.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlChapNhanGiayTo.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));				
				actionUrlChapNhanGiayTo.setParameter("BTN_ACTION_TYPE", String.valueOf(2));
				actionUrlChapNhanGiayTo.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
				actionUrlChapNhanGiayTo.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlTuChoiGiayTo.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlTuChoiGiayTo.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlTuChoiGiayTo.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlTuChoiGiayTo.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlTuChoiGiayTo.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));				
				actionUrlTuChoiGiayTo.setParameter("BTN_ACTION_TYPE", String.valueOf(0));
				actionUrlTuChoiGiayTo.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
				actionUrlTuChoiGiayTo.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlYeuCauXuatTrinh.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlYeuCauXuatTrinh.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlYeuCauXuatTrinh.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlYeuCauXuatTrinh.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlYeuCauXuatTrinh.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));
				actionUrlYeuCauXuatTrinh.setParameter(PageType.BTN_ACTION_TYPE, String.valueOf(PageType.BTN_ACTION_TYPE));
				actionUrlYeuCauXuatTrinh.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
				actionUrlYeuCauXuatTrinh.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));		
				
				actionUrlKyso.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlKyso.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlKyso.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlKyso.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlKyso.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_KYSODUYET));
				if (messageType.compareTo(String.valueOf(MessageType.LENH_DIEU_DONG)) == 0){		
					actionUrlKyso.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_KYSO));
				}
				actionUrlKyso.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlKyso.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlDongDau.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlDongDau.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlDongDau.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlDongDau.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlDongDau.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_DONGDAUDUYET));
				if (messageType.compareTo(String.valueOf(MessageType.LENH_DIEU_DONG)) == 0){		
					actionUrlDongDau.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_DONGDAU));
				}
				actionUrlDongDau.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlDongDau.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
				actionUrlTiepNHan.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlTiepNHan.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlTiepNHan.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlTiepNHan.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlTiepNHan.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));
				actionUrlTiepNHan.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlTiepNHan.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlXacNhanHoanThanhThuTuc.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlXacNhanHoanThanhThuTuc.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlXacNhanHoanThanhThuTuc.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlXacNhanHoanThanhThuTuc.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_HOAN_THANH_THU_TUC));
				actionUrlXacNhanHoanThanhThuTuc.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlXacNhanHoanThanhThuTuc.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlXacNhanHoanThanhThuTuc.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlTuChoi.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlTuChoi.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlTuChoi.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlTuChoi.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlTuChoi.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TU_CHOI));
				actionUrlTuChoi.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlTuChoi.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlDoiChieu.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlDoiChieu.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlDoiChieu.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlDoiChieu.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlDoiChieu.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_DOI_CHIEU));
				actionUrlDoiChieu.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlDoiChieu.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlHuy.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlHuy.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlHuy.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlHuy.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlHuy.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_HUY));
				actionUrlHuy.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlHuy.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlSua.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlSua.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlSua.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlSua.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlSua.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_SUA));
				actionUrlSua.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlSua.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlDuyet.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlDuyet.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlDuyet.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlDuyet.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlDuyet.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_DUYET));
				actionUrlDuyet.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlDuyet.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlNotifySuaDoiBoXung.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlNotifySuaDoiBoXung.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlNotifySuaDoiBoXung.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlNotifySuaDoiBoXung.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlNotifySuaDoiBoXung.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_SUA_DOI));
				actionUrlNotifySuaDoiBoXung.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
				actionUrlNotifySuaDoiBoXung.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				actionUrlChuyenGiaoDien.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlChuyenGiaoDien.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlChuyenGiaoDien.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlChuyenGiaoDien.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlChuyenGiaoDien.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_CHUYEN_GIAO_DIEN));
				actionUrlChuyenGiaoDien.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
				actionUrlChuyenGiaoDien.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));

				actionUrlChoLanhDaoDuyet.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlChoLanhDaoDuyet.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlChoLanhDaoDuyet.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlChoLanhDaoDuyet.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlChoLanhDaoDuyet.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_CHO_LANH_DAO_DUYET));
				actionUrlChoLanhDaoDuyet.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlChoLanhDaoDuyet.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));

				actionUrlChuyenTraHoSo.setParameter(PageType.DOCUMENT_NAME, documentName);
				actionUrlChuyenTraHoSo.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
				actionUrlChuyenTraHoSo.setParameter(PageType.PAGE_TYPE, pageType);
				actionUrlChuyenTraHoSo.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
				actionUrlChuyenTraHoSo.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_CHUYEN_TRA_HO_SO));
				actionUrlChuyenTraHoSo.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
				actionUrlChuyenTraHoSo.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
				
				int resultT = CheckBusinessUtil.checkRoleDisplayButton(loaiThuTuc, FormatData.convertToInt(messageType), newValue, temp, requestCodethuTuc, request);		
				LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC==thong_tin_chung_ho_so.jsp==MESSAGE_TYPE==" + messageType + "====RESULTT===" + resultT);
			%>
			<%	if ((resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_HOAN_THANH)
					|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CHAP_NHAN_TU_CHOI)
					|| (resultT == CheckBusinessUtil.THAO_TAC_KIEM_DUYET_HO_SO) 
					|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_DOI_CHIEU) ) {
				%>
									<% 
					request.setAttribute("resultT", String.valueOf(resultT));
					request.setAttribute("requestCodethuTuc", String.valueOf(requestCodethuTuc));
					request.setAttribute("loaiThuTuc", String.valueOf(loaiThuTuc));
					request.setAttribute("loaiThongTinChung", String.valueOf(loaiThongTinChung));
					request.setAttribute("newValue", String.valueOf(newValue));
					request.setAttribute("lCode", String.valueOf(lCode));
					request.setAttribute("reTurnHomeURL", reTurnHomeURL.toString());
					request.setAttribute("pageType", String.valueOf(pageType));
					request.setAttribute("tieuDeBanKhai", String.valueOf(tieuDeBanKhai));
					%>
					<jsp:include page="/html/thutuc/thong_tin_chung_ho_so_included_part2x1.jsp" />
			<%	} else if ((resultT == CheckBusinessUtil.THAO_TAC_CHUYEN_GIAO_DIEN_CAP_NHAP)
					|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_LAI_OR_HUY) 
					|| (resultT == CheckBusinessUtil.THAO_TAC_CHUYEN_GIAO_DIEN_INSERT_LAN_THU_N) 
					|| (resultT == CheckBusinessUtil.THAO_TAC_CHUYEN_GIAO_DIEN_UPDATE_LAN_THU_N)  ) {
				%>
					<% 
					request.setAttribute("resultT", String.valueOf(resultT));
					request.setAttribute("requestCodethuTuc", String.valueOf(requestCodethuTuc));
					request.setAttribute("loaiThuTuc", String.valueOf(loaiThuTuc));
					request.setAttribute("loaiThongTinChung", String.valueOf(loaiThongTinChung));
					request.setAttribute("newValue", String.valueOf(newValue));
					request.setAttribute("lCode", String.valueOf(lCode));
					request.setAttribute("reTurnHomeURL", reTurnHomeURL.toString());
					request.setAttribute("pageType", String.valueOf(pageType));
					request.setAttribute("tieuDeBanKhai", String.valueOf(tieuDeBanKhai));
					%>
					<jsp:include page="/html/thutuc/thong_tin_chung_ho_so_included_part2x4.jsp" />
				<%	
				} else if ((resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI) 
					|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_LAI) 
					|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_LAI_LAN_THU_N) ) {
				%>
					<% 
					request.setAttribute("resultT", String.valueOf(resultT));
					request.setAttribute("requestCodethuTuc", String.valueOf(requestCodethuTuc));
					request.setAttribute("loaiThuTuc", String.valueOf(loaiThuTuc));
					request.setAttribute("loaiThongTinChung", String.valueOf(loaiThongTinChung));
					request.setAttribute("newValue", String.valueOf(newValue));
					request.setAttribute("lCode", String.valueOf(lCode));
					request.setAttribute("reTurnHomeURL", reTurnHomeURL.toString());
					request.setAttribute("pageType", String.valueOf(pageType));
					request.setAttribute("tieuDeBanKhai", String.valueOf(tieuDeBanKhai));
					request.setAttribute("rolevanthu", String.valueOf(rolevanthu));
					request.setAttribute("rolequantri", String.valueOf(rolequantri));
					request.setAttribute("rolelanhdao", String.valueOf(rolelanhdao));					
					%>
					<jsp:include page="/html/thutuc/thong_tin_chung_ho_so_included_part2x2.jsp" />
				<%
				} else if ((resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_DONG_DAU)
					|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_DONG_DAU_THU_TUC_QC) 
					|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_DONG_DAU_THU_TUC_XC) 
					|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_DONG_DAU_THU_TUC_VC) ) {
				%>
					<% 
					request.setAttribute("resultT", String.valueOf(resultT));
					request.setAttribute("requestCodethuTuc", String.valueOf(requestCodethuTuc));
					request.setAttribute("loaiThuTuc", String.valueOf(loaiThuTuc));
					request.setAttribute("loaiThongTinChung", String.valueOf(loaiThongTinChung));
					request.setAttribute("newValue", String.valueOf(newValue));
					request.setAttribute("lCode", String.valueOf(lCode));
					request.setAttribute("reTurnHomeURL", reTurnHomeURL.toString());
					request.setAttribute("pageType", String.valueOf(pageType));
					request.setAttribute("tieuDeBanKhai", String.valueOf(tieuDeBanKhai));
					request.setAttribute("rolevanthu", String.valueOf(rolevanthu));
					request.setAttribute("rolequantri", String.valueOf(rolequantri));
					request.setAttribute("rolelanhdao", String.valueOf(rolelanhdao));					
					%>
					<jsp:include page="/html/thutuc/thong_tin_chung_ho_so_included_part2x3.jsp" />
				<%		
				} else if ((resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_KY_SO)
						|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_KY_SO_THU_TUC_QC) 
						|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_KY_SO_THU_TUC_XC) 
						|| (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_KY_SO_THU_TUC_VC) ) {
					%>
					<% 
					request.setAttribute("resultT", String.valueOf(resultT));
					request.setAttribute("requestCodethuTuc", String.valueOf(requestCodethuTuc));
					request.setAttribute("loaiThuTuc", String.valueOf(loaiThuTuc));
					request.setAttribute("loaiThongTinChung", String.valueOf(loaiThongTinChung));
					request.setAttribute("newValue", String.valueOf(newValue));
					request.setAttribute("lCode", String.valueOf(lCode));
					request.setAttribute("reTurnHomeURL", reTurnHomeURL.toString());
					request.setAttribute("pageType", String.valueOf(pageType));
					request.setAttribute("tieuDeBanKhai", String.valueOf(tieuDeBanKhai));
					request.setAttribute("rolevanthu", String.valueOf(rolevanthu));
					request.setAttribute("rolequantri", String.valueOf(rolequantri));
					request.setAttribute("rolelanhdao", String.valueOf(rolelanhdao));					
					%>
					<jsp:include page="/html/thutuc/thong_tin_chung_ho_so_included_part2x5.jsp" />			
					<%		
						}					
					%>
					
						<div class="tbl_left boxlabel" id="kstable1" style="width: 49%">
						<table class="table_noboder">
							<thead>
								<tr>
									<th class="text-left" width="30%">Người ký&nbsp;<span style="color:#FF0000;">(*)</span>
									</th>
									<td class="text-leftu">
										<%
										String portCode_ = Validator.isNotNull(dmHisMaritime1) ? dmHisMaritime1.getMaritimeCode() : temp.getMaritimeCode();
										List<UserSign> userSigns = UserSignLocalServiceUtil.getByPortCode(portCode_, -1, -1);
										UserSign userSignDefault = UserSignLocalServiceUtil.getByUserId(themeDisplay.getUserId());
										if (userSignDefault == null) { userSignDefault = new UserSignImpl(); } 
										String userTitle = userSignDefault.getTitle();
										if (userTitle.isEmpty() || userTitle== null){
											userTitle = "Thiếu thông tin ký số";
										}else{
											
										}
										%>
										<label ><%=  userTitle%></label>							
										<select id="signName" name="signName" style="display: none;">
											<option value="" data-user-sign-id="">-- Chọn cán bộ --</option>
											<%
											for(UserSign userSign : userSigns) {
												
												User user_ = UserLocalServiceUtil.getUser(userSign.getUserId());
												User userLoginDefault = PortalUtil.getUser(request);
												String seld = "";
												
												String signName_ = Validator.isNotNull(shiftingOrderEdit) ? shiftingOrderEdit.getSignName() : "";
												if(userSign.getTitle().equalsIgnoreCase(signName_)) {
													seld = "selected=\"selected\"";
												}
											%>								
											<option value="<%= userSign.getTitle() %>" <%=userSign.getUserId()== userLoginDefault.getUserId()? "selected" : "" %> data-user-sign-id="<%= userSign.getId() %>">
												<%= userSign.getTitle() + " - " + user_.getEmailAddress() %></option>								
											<% } %>
										</select>							
									</td>
								</tr>
								<tr>
									<th class="text-left" width="30%">Ngày ký&nbsp;<span style="color:#FF0000;">(*)</span></th>
									<td class="text-leftu">
										<input type="text" style="width: 91%"
												name="signDate" id="signDate" value="<%=FormatData.parseDateToTringType3(new Date())%>"
												onclick="gtCalendar('signDate')">
										<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('signDate')">
									</td>
								</tr>
								<tr> 
									<th class="text-left" width="30%">Địa điểm ký&nbsp;<span style="color:#FF0000;">(*)</span></th>
									<td class="text-leftu">
										<input type="text" class="egov-inputfield" style="width: 98%" id="signPlace" name="signPlace" value="<%=dmHisMaritime1.getCitycode()%>">
									</td>
									<input type="hidden" id="fileId" name="fileId" value="">
									<input type="hidden" id="Representative" name="Representative" value="">
								</tr>
								
								<tr>
			                          <td style="text-align: center;"></td>
			                          <td style="text-align: center;">
			                          		<%
											 if ((rolelanhdao) || (rolequantri)) {
											%>
											<button class="bt" type="button" onclick="if(validatorTTKS()) getFileComputerHash('<%=actionUrlKyso.toString()%>')"><i class="tiepnhan"></i>Thực hiện</button>
											<%    } else { %>
			               					
			               					<%    }  %>
			                          	
			                            <button class="bt" type="button" id="quaylai1"><i class="tiepnhan"></i>Quay lại</button>
			                          </td>
			                     </tr>
							</thead>
						</table>
					</div>
						
						<div align = "left" id = "canbothutuc_huy" style="display: none;"><br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color:#FF0000;">(*)</span>:</td></tr>
								<tr></tr>
								<%						
									if (temp.getDocumentStatusCode() == TrangThaiBanKhai.THU_TUC_DA_TIEP_NHAN || temp.getDocumentStatusCode() == TrangThaiBanKhai.TU_CHOI_TIEP_NHAN) {
									%>
									<tr>
										<td style="width: 100%">
											<textarea id = "LY_DO_HUY23" name = "<%=PageType.HUY_HO_SO%>" rows="4" cols="100" maxlength="300" required="true"></textarea>
										</td>
									</tr>
								
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorXacNhanHuy23()) summitForm('<%=actionUrlHuy.toString()%>')"><i class="tiepnhan"></i>Xác nhận hủy</button>
									</td>
								</tr>
								<%
									} 
								%>
								
							</table>
						</div>
						
						<!-- the textarea nhap noi dung cua mot so trang thai ho so -->
						<div align = "left" id = "reject_data" style="display: none;"><br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color:#FF0000;">(*)</span>:</td></tr>
								<tr></tr>
								<%
								if (temp.getDocumentStatusCode() == TrangThaiBanKhai.CHO_PHE_DUYET_HOAN_THANH_THU_TUC) {
									%>
								<tr>
									<td style="width: 100%" class="text-left">
											<textarea id = "LY_DO_HUY" name = "<%=PageType.HUY_HO_SO%>" rows="4" cols="100" maxlength="300" required="true"></textarea>
									</td>
								</tr>
								
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorXacNhanHuy()) summitForm('<%=actionUrlHuy.toString()%>')"><i class="tiepnhan"></i>Hủy</button>
									</td>
								</tr>
									<%
								} else {
									if (temp.getDocumentStatusCode() == TrangThaiBanKhai.THU_TUC_DA_TIEP_NHAN || temp.getDocumentStatusCode() == TrangThaiBanKhai.TU_CHOI_TIEP_NHAN) {
									%>
								<tr>
									<td style="width: 100%">
										<textarea id = "<%=PageType.LY_DO_TU_CHOI%>" name = "<%=PageType.LY_DO_TU_CHOI%>" rows="4" cols="100" maxlength="300" required="true"></textarea>
									</td>
								</tr>					
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorYeuCauBoSung()) summitForm('<%=actionUrlTuChoi.toString()%>')"><i class="tiepnhan"></i>Sửa đổi bổ sung</button>
									</td>
								</tr>
								<%
									} else {
								%>
								<tr>
									<td style="width: 100%">
										<textarea id = "<%=PageType.LY_DO_TU_CHOI%>" name = "<%=PageType.LY_DO_TU_CHOI%>" rows="4" cols="100" maxlength="300" required="true"></textarea>
									</td>
								</tr>
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="summitForm('<%=actionUrlTuChoi.toString()%>')"><i class="tiepnhan"></i>Xác nhận từ chối</button>
									</td>
								</tr>
								<%
									}
								}
								%>
							</table>
						</div>
						
						<!-- div hien thong displayInputThongBaoChamHoanThanhTt goi fucntion 99   27 cho Thông báo chậm hoàn thành thủ tục đi
						btn name  = "Thông báo chậm hoàn thành TT"
						-->			
						<div align="left" id="divInputThongBaoChamHoanThanhTt" style="display: none;">
							<br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color: #FF0000;">(*)</span>:</td></tr>
								<tr><td style="width: 100%" class="text-left"><textarea id="ly_do_thongbao_chamhoanthanhtt" name="<%=PageType.LY_DO_THONGBAO_CHAMHOANTHANHTT%>" rows="4" cols="100" maxlength="3000"></textarea></td></tr>
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorThongBaoChamHoanThanhTt()) summitForm('<%=actionUrlNotifySuaDoiBoXung.toString()%>')"><i class="tiepnhan"></i>Xác nhận</button>
									</td>
								</tr>
							</table>
						</div>
						
						<!-- div hien thi noi dung trong TRUONG HOP THONG BAO SUA DOI BO SUNG tu co quan hang hai den bo giao thong, truong hop nay, hien tai ko su dung -->
						<div align="left" id="modify_data" style="display: none;">
							<br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color: #FF0000;">(*)</span>:</td></tr>
								<tr><td style="width: 100%" class="text-left"><textarea id="ly_do_suadoi_bosung" name="<%=PageType.LY_DO_SUADOI_BOSUNG%>" rows="4" cols="100" maxlength="3000"></textarea></td></tr>
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorModify()) summitForm('<%=actionUrlNotifySuaDoiBoXung.toString()%>')">
											<i class="tiepnhan"></i>Xác nhận
										</button>
									</td>
								</tr>
							</table>
						</div>
			
						<div align="left" id="reject_data1" style="display: none;">
							<br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color: #FF0000;">(*)</span>:</td></tr>
								<tr><td style="width: 100%" class="text-left"><textarea id="LY_DO_HUY1" name="<%=PageType.HUY_HO_SO%>" rows="4" cols="100" maxlength="300" required="true"></textarea></td></tr>
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorXacNhanHuy1()) summitForm('<%=actionUrlHuy.toString()%>')">
											<i class="tiepnhan"></i>Xác nhận
										</button>
									</td>
								</tr>
							</table>
						</div>
			
						<div align="left" id="reject_data2" style="display: none;">
							<br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color: #FF0000;">(*)</span>:</td></tr>
								<tr>
									<td style="width: 100%" class="text-left">
										<textarea id="<%=PageType.LY_DO_YEU_CAU_BO_SUNG%>" name="<%=PageType.LY_DO_YEU_CAU_BO_SUNG%>" rows="4" cols="100" maxlength="300" required="true"></textarea>
									</td>
								</tr>
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorYeCauBoSung()) summitForm('<%=actionUrlHuy.toString()%>')">
											<i class="tiepnhan"></i>Xác nhận
										</button>
									</td>
								</tr>
							</table>
						</div>
						
						<div align="left" id="reject_data3" style="display: none;">
							<br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color: #FF0000;">(*)</span>:</td></tr>
								<tr>
									<td style="width: 100%" class="text-left">
										<textarea id="<%=PageType.LY_DO_TU_CHOI_GIAY_TO%>" name="<%=PageType.LY_DO_TU_CHOI_GIAY_TO%>" rows="4" cols="100" maxlength="300" required="true"></textarea>
									</td>
								</tr>
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorTuChoiGiayTo()) summitForm('<%=actionUrlTuChoiGiayTo.toString()%>')">
											<i class="tiepnhan"></i>Yêu cầu bổ sung
										</button>
									</td>
								</tr>
							</table>
						</div>
						
						<div align="left" id="reject_data4" style="display: none;">
							<br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color: #FF0000;">(*)</span>:</td></tr>
								<tr>
									<td style="width: 100%" class="text-left">
										<textarea style="display: none;" id="<%=PageType.LY_DO_YEU_CAU_XUAT_TRINH%>" name="<%=PageType.LY_DO_YEU_CAU_XUAT_TRINH%>" rows="4" cols="100" maxlength="300" required="true">
										<liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" />
										</textarea>
									</td>
								</tr>
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="validateChecked1('<%=actionUrlYeuCauXuatTrinh.toString()%>')">
											<i class="tiepnhan"></i>Yêu cầu xuất trình
										</button>
									</td>
								</tr>
							</table>
						</div>
						
						<div align="left" id="reject_data5" style="display: none;">
							<br>
							<table style="width: 60%">
								<tr><td style="width: 100%">Nhập lý do&nbsp;<span style="color: #FF0000;">(*)</span>:</td></tr>
								<tr>
									<td style="width: 100%" class="text-left">
										<textarea id="<%=PageType.LY_DO_TRA_LAI_HO_SO%>" name="<%=PageType.LY_DO_TRA_LAI_HO_SO%>" rows="4" cols="100" maxlength="300" required="true"></textarea>
									</td>
								</tr>
								<tr>
									<td style="text-align: left;">
										<button class="bt" type="button" onclick="if(validatorXacNhanTraLaiHoSo()) summitForm('<%=actionUrlChuyenTraHoSo.toString()%>')">
											<i class="tiepnhan"></i>Xác nhận
										</button>
									</td>
								</tr>
							</table>
						</div>
						
						<div id="div_WarningMsg" style="display: none;">
							<table width="100%">
								<tr><td colspan="2" style="width: 100%;"><label class="egov-label">Hồ sơ chưa được đối chiếu đầy đủ. Có tiếp tục duyệt ?</label></td></tr>
								<tr><td>&nbsp;</td></tr>
								<tr>
									<td colspan="2" align="center">
										<input type="button" class="bt" value="Đồng ý" onclick="javascript: func_xacnhanPheDuyet('<%=actionUrlXacNhanHoanThanhThuTuc.toString()%>');">
										&nbsp;&nbsp;
										<input type="button" class="bt" value="Quay lại" onclick="javascript: func_huyPheDuyet();" >
									</td>
								</tr>
							</table>
						</div>
						
						<div id="div_KysoMsg" style="display: none;">
							<table width="100%">
								<tr><td colspan="2" style="width: 100%;"><label class="egov-label">Thiết bị token đã ngắt kết nối. Người dùng cần khắc phục trước khi ký.</label></td></tr>								
								<tr>
									<td colspan="2" align="center"><input type="button" class="bt" value="Quay lại" onclick="javascript: func_huyKySoBCY();" ></td>
								</tr>
							</table>
						</div>
						
					</div>
				</div>				
			</div>
		</form>
	<%
	}
	%>

<portlet:resourceURL var="getDataAjax"></portlet:resourceURL>

<portlet:actionURL var="signatureURL" name="signature"></portlet:actionURL>
<portlet:actionURL var="signatureDongDauURL" name="signatureDongDau"></portlet:actionURL>
<portlet:actionURL var="rollbackSignatureURL" name="rollbackSignature"></portlet:actionURL>
<script type="text/javascript">

	$(document).ready(function() {
		$("#kstable1").hide();
		
		$("#showdatakyso1").click(function() {
			$("#kstable1").show();
			$("#duyetkylenhdieudong1").hide();
		});
	});
	
	$(document).ready(function() {
		$("#quaylai1").click(function() {
			$("#kstable1").hide();
			$("#duyetkylenhdieudong1").show();
		});
	});
	
	function validateChecked1(url) {
		
		var isCheck = false;
		$('input.mandatoryChecked:checkbox:checked').each(function() {			
			isCheck = true;
		});
		
		if (isCheck) {
			summitForm(url);
		} else {
			alert('Chưa chọn giấy tờ yêu cầu xuất trình.');
		}
		
	}

var complateSignatureURL = '<%=signatureURL%>';

function getFileComputerHash(urlFromSubmit) {
	var url = '<%=getDataAjax%>';
	var nanoTime = $('#nanoTimePDF').val();	
	url = url + "&nanoTimePDF=" + nanoTime;	
	
	var rollbackSignatureURL = '<%=rollbackSignatureURL%>';
	var tieuDeBanKhai = '<%=tieuDeBanKhai%>';
	var documentName = '<%=documentName%>';
	var lCode = '<%=lCode%>';
	
	var userSignId = 0;
	if($('#signName').length > 0) {
		userSignId = $('#signName option:selected').attr('data-user-sign-id');
	}

	$.ajax({
		type : 'POST',
		url : url,
		data : {
			tieuDeBanKhai : tieuDeBanKhai, 
			documentName : documentName,
			userSignId: userSignId,
			type: 'getComputerHash'
		},
		success : function(data) {
			if(data){
				var jsonData = JSON.parse(data);
				var hashComputers = jsonData.hashComputers;
				
				var signFieldNames = jsonData.signFieldNames;
				var filePaths = jsonData.filePaths;
				var msgs = jsonData.msg;
				
				for ( var i = 0; i < hashComputers.length; i++) {
				//	alert("----------hashComputers.length---------"+hashComputers.length);
					var hashComputer = hashComputers[i];
					var signFieldName = signFieldNames[i];
					var filePath = filePaths[i];
					var msg = msgs[i];
					
					if (plugin().valid) {
						if (msg == 'success') {
							var code = plugin().Sign(hashComputer);
						//	alert("code: " + code);
							if(code ===0 || code === 7){
								var sign = plugin().Signature;
								completeSignature(sign, signFieldName, filePath, urlFromSubmit, lCode);							
							}else{
								alert("Không ký được hồ sơ (" + code + ")");
								//rollbackSignature(plugin().ErrorMessage, filePath);
				            }
						}else{
							alert(msg);
						}			        	
			        } else {
			         	alert("CryptoLib05Plugin trên trình duyệt không hoạt động.");
			        }
				}
			}
		}
	});
}

function completeSignature(sign, signFieldName, filePath, urlFromSubmit, lCode) {
var msg = '';
$.ajax({
	type : 'POST',
	url : complateSignatureURL,
	async : true,
	data : {
		sign : sign,
		signFieldName : signFieldName,
		filePath : filePath,
		lCode : lCode
	},
	success : function(data) {
		console.log("--data--", data);
		if (data){
			var jsonData = JSON.parse(data);
			msg = jsonData.msg;
			console.log("--msg--", msg);
			console.log("--msg--", jsonData.filePath);
			console.log("--fileId--", jsonData.fileId);
			
			$("#fileId").val(jsonData.fileId);			
			//alert( "----vao day data- data------", data, "---- filePath---", data.filePath);
			
			if (msg === 'success') {
				var urlAction = document.getElementById('userForm').action;
				if (urlAction == '') {
					document.getElementById('userForm').action = urlFromSubmit;
				}
				document.getElementById('userForm').submit();
			} else {
				showThongBaoMsgKySo();
			}
		}
	}
});

}

var url = '<%=getDataAjax%>';	
var completeSignatureDongDauURL = '<%=signatureDongDauURL%>';
var rollbackSignatureURL = '<%=rollbackSignatureURL%>';

function getFileComputerHashDongDau(urlFromSubmit) {
	var RequestCode = document.getElementById("RequestCode").value;
	var tieuDeBanKhai = '<%=tieuDeBanKhai%>';
	var documentName = '<%=documentName%>';
	var lCode = '<%=lCode%>';
	var messageType = '<%=messageType%>';

	var userSignId = 0;
	if($('#signName').length > 0) {
		userSignId = $('#signName option:selected').attr('data-user-sign-id');
	}

$.ajax({
	type : 'POST',
	url : url,
	data : {
		tieuDeBanKhai : tieuDeBanKhai, 
		documentName : documentName,
		RequestCode:RequestCode,
		userSignId: userSignId,
		type:'getComputerHashDongDau'
	},
	success : function(data) {
		if(data){
			var jsonData = JSON.parse(data);
			var hashComputers = jsonData.hashComputers;
			var signFieldNames = jsonData.signFieldNames;
			var filePaths = jsonData.filePaths;
			var msgs = jsonData.msg;
		
			
			for ( var i = 0; i < hashComputers.length; i++) {
				var hashComputer = hashComputers[i];
				var signFieldName = signFieldNames[i];
				var filePath = filePaths[i];
				var msg = msgs[i];
				if(plugin().valid){
					if(msg == 'success'){
						var code = plugin().Sign(hashComputer);
						if(code ===0 || code === 7){
							var sign = plugin().Signature;
							completeSignatureDongDau(sign, signFieldName, filePath, urlFromSubmit, lCode, messageType);						
						}else{
							alert("Không ký được hồ sơ (" + code + ")");
							//rollbackSignature(plugin().ErrorMessage, filePath);
			            }
					}else{
						alert(msg);
					}
		        	
		        } else {
		        	alert("CryptoLib05Plugin trên trình duyệt không hoạt động.");
		        }
			}
		}
	}
});
}

function completeSignatureDongDau(sign, signFieldName, filePath, urlFromSubmit, lCode, messageType) {
var msg = '';
$.ajax({
	type : 'POST',
	url : completeSignatureDongDauURL,
	async : true,
	data : {
		sign : sign,
		signFieldName : signFieldName,
		filePath : filePath,
		lCode: lCode, 
		messageType: messageType
	},
	success : function(data) {
		console.log("--data--", data);
		if (data){
			var jsonData = JSON.parse(data);
			msg = jsonData.msg;
			console.log("--msg--", msg);
			console.log("--msg--", jsonData.filePath);
			console.log("--fileId--", jsonData.fileId);
			$("#fileId").val(jsonData.fileId);
			
			if (msg === 'success') {
	  			var urlAction = document.getElementById('userForm').action;
	  			if (urlAction == '') {
	  				document.getElementById('userForm').action = urlFromSubmit;
	  			}
	  			document.getElementById('userForm').submit();
	  		} else {
	  			showThongBaoMsgKySo();
	  		}			
		}
	}
});
	
}

function plugin0()
 {
  return document.getElementById('plugin0');
 }
 plugin = plugin0;
    
 function ShowSetting()
    {
        if(plugin().valid){
            plugin().ShowSetting();    
        } else {
            alert("CryptoLib05Plugin trên trình duyệt không hoạt động :(");
        }
    } 
 
function Sign()
{
	 alert("-----Sign-----");
if(plugin().valid){
    var str = document.getElementById("inHash").value;
    alert("-----Sign----- str: " +str);
    var x = plugin().Sign(str);
	alert(x);
    if(x===0 || x===7){
        document.getElementById("Signature").value = plugin().Signature;
    }else{
        document.getElementById("Signature").value = plugin().ErrorMessage;
    }
} else {
    alert("CryptoLib05Plugin trên trình duyệt không hoạt động :(");
}
}
function showThongBaoMsgKySo() {
	console.log("==showThongBaoMsg ==");
	$("#div_KysoMsg").dialog({
		title:'Xác nhận thay đổi tình trạng thiết bị',
		resizable: false,
		modal: true,
		width: '400px',
		closeOnEscape: false,
		open: function() {
			jQuery('.ui-widget-overlay').bind('click', function() {
				$('#div_KysoMsg').dialog('close');
			});
		}
	});
}


function validatorTTKS(){
	var valuesignName = $("#signName").val();
	var datasignName =$.trim(valuesignName);

	var valuesignDate = $("input[id=signDate]").val();
if(valuesignDate ===''){
	alert("Đề nghị nhập ngày ký !");
	return false;
}
if (datasignName ===''){
	alert("Đề nghị nhập Tên người ký !");
	return false;
}
return true;
}

function summitForm(url) {
	
	var urlAction = document.getElementById('userForm').action;
	if (urlAction == '') {
		document.getElementById('userForm').action = url;
	}
	
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	if (status) {
		document.getElementById('userForm').submit();
	} else {
		document.getElementById('userForm').action = '';
	}
}

function displayInputReject_canbothutuc_huy() {
	var component = document.getElementById('canbothutuc_huy');
	if (component.style.display == 'none') {
		component.style.display = '';
	} else if (component.style.display == '') {
		component.style.display = 'none';
	}
}

function displayInputReject() {
	var component = document.getElementById('reject_data');
	if (component.style.display == 'none') {
		component.style.display = '';
	} else if (component.style.display == '') {
		component.style.display = 'none';
	}
}

function displayInputRejectAndChangeAction(url) {
	var component = document.getElementById('reject_data1');
	if (component.style.display == 'none') {
		component.style.display = '';
		document.getElementById('userForm').action = url;
	} else if (component.style.display == '') {
		component.style.display = 'none';
		document.getElementById('userForm').action = '';
	}
}

function displayInputRejectAndChangeActionYeuCauBoSung(url) {
	var component = document.getElementById('reject_data2');
	if (component.style.display == 'none') {
		component.style.display = '';
		document.getElementById('userForm').action = url;
	} else if (component.style.display == '') {
		component.style.display = 'none';
		document.getElementById('userForm').action = '';
	}
}

function displayInputRejectAndChangeActionTuChoiGiayTo(url) {
	var component = document.getElementById('reject_data3');
	if (component.style.display == 'none') {
		component.style.display = '';
		document.getElementById('userForm').action = url;
	} else if (component.style.display == '') {
		component.style.display = 'none';
		document.getElementById('userForm').action = '';
	}
}

function displayTraLaiHoSo(url) {
	var component = document.getElementById('reject_data5');
	if (component.style.display == 'none') {
		component.style.display = '';
		document.getElementById('userForm').action = url;
	} else if (component.style.display == '') {
		component.style.display = 'none';
		document.getElementById('userForm').action = '';
	}
}
// Add new logic to vaidate giay phep roi cang form
	function validatorGiayPhepRoiCang() {
		var valTimeOfDeparture = $("input[id=timeOfDeparture]").val();
		var valTimeOfValidUntil = $("input[id=timeOfValidUntil]").val();
		
		var valTimeOfValidUntil = $("input[id=timeOfValidUntil]").val();

		var varCertificateNo = $("input[id=certificateNo]").val();

		var dataTimeOfDeparture = $.trim(valTimeOfDeparture);
		var dataTimeValidUntil = $.trim(valTimeOfValidUntil);

		var dataCertificateNo = $.trim(varCertificateNo);

		if (dataTimeOfDeparture.length == 0
				|| dataTimeValidUntil.length == 0 || dataCertificateNo.length == 0) {
			alert("Đề nghị nhập dữ liệu còn thiếu !");
			return false;
		} else {
			
			// kiem tra ngay cap phep phai truoc ngay roi cang
			var valNgayCapPhep = $("input[id=issueDate]").val();
			var NowMoment = moment();
			var dateNgayCapPhep = moment(valNgayCapPhep, 'DD/MM/YYYY HH:mm');
			var dateThoiGianRoiCang = moment(dataTimeOfDeparture, 'DD/MM/YYYY HH:mm');
			
			if (dateNgayCapPhep.valueOf() > dateThoiGianRoiCang.valueOf()) {
				alert("Thời gian rời cảng phải sau thời gian cấp phép! Mời nhập lại");
				$("input[id=timeOfDeparture]").focus();
				return false;
			}
			
			return true;
		}
	}
	
function validatorGiayPhepVaoCang() {
	var valTimeOfDeparture = $("input[id=timeOfDeparture]").val();
	var valTimeOfValidUntil = $("input[id=timeOfValidUntil]").val();
	
	var valTimeOfValidUntil = $("input[id=timeOfValidUntil]").val();

	var varCertificateNo = $("input[id=certificateNo]").val();

	var dataTimeOfDeparture = $.trim(valTimeOfDeparture);
	var dataTimeValidUntil = $.trim(valTimeOfValidUntil);

	var dataCertificateNo = $.trim(varCertificateNo);

	if (dataTimeOfDeparture.length == 0
			|| dataTimeValidUntil.length == 0 || dataCertificateNo.length == 0) {
		alert("Đề nghị nhập dữ liệu còn thiếu !");
		return false;
	} else {
		
		// kiem tra ngay cap phep phai truoc ngay roi cang
		var valNgayCapPhep = $("input[id=issueDate]").val();
		var NowMoment = moment();
		var dateNgayCapPhep = moment(valNgayCapPhep, 'DD/MM/YYYY HH:mm');
		var dateThoiGianVaoCang = moment(dataTimeOfDeparture, 'DD/MM/YYYY HH:mm');
		var dateThoiGianRoiCang = moment(valTimeOfValidUntil, 'DD/MM/YYYY HH:mm');
		
		if (dateThoiGianVaoCang.valueOf() > dateThoiGianRoiCang.valueOf()) {
			alert("Thời gian rời cảng (Đến ngày) phải sau thời gian vào cảng (Từ ngày)! Mời nhập lại");
			$("input[id=timeOfDeparture]").focus();
			return false;
		}
		
		return true;
	}
}

function validatorThongBaoChamHoanThanhTt() {
	var value = $("textarea[id=ly_do_thongbao_chamhoanthanhtt]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do !");
		return false;
	} else {
		return true;
	}
}

function validatorGiayPhepQuaCanh() {
	//permittedTransitFrom, thoi gian qua canh vien nam tu
	//timeOfDeparture, thoi gian khoi hanh
	//dateOfSign, ngay cap giay phep
	//volumeTransitCargo, so luong loai hang hoa qua canh
	//permittedTransitTo, duoc phep qua canh den
	//validUntil, thoi gian hieu luc
	//certificateNo, giay phep so
	var valPermittedTransitFrom = $("input[id=permittedTransitFrom]").val();
	var valTimeOfDeparture = $("input[id=timeOfDeparture]").val();
	var valDateOfSign = $("input[id=dateOfSign]").val();
	var valVolumeTransitCargo = $("input[id=volumeTransitCargo]").val();
	var valPermittedTransitTo = $("input[id=permittedTransitTo]").val();
	var valValidUntil = $("input[id=validUntil]").val();
	var valCertificateNo = $("input[id=certificateNo]").val();

	var dataPermittedTransitFrom = $.trim(valPermittedTransitFrom);
	var dataTimeOfDeparture = $.trim(valTimeOfDeparture);
	var dataDateOfSign = $.trim(valDateOfSign);
	var dataVolumeTransitCargo = $.trim(valVolumeTransitCargo);
	var dataPermittedTransitTo = $.trim(valPermittedTransitTo);
	var dataValidUntil = $.trim(valValidUntil);
	var dataCertificateNo = $.trim(valCertificateNo);

	if (dataPermittedTransitFrom.length == 0 || dataTimeOfDeparture.length == 0 || dataDateOfSign.length == 0
			|| dataVolumeTransitCargo.length == 0 || dataPermittedTransitTo.length == 0 || dataValidUntil.length == 0
			|| dataCertificateNo.length == 0) {
		alert("Đề nghị nhập dữ liệu còn thiếu");
		return false;
	} else {
		return true;
	}
}

function showWarningMsg(check, url) {
	if (check == 'false') {
		$("#div_WarningMsg").dialog({
			title : 'Xác nhận phê duyệt',
			resizable : false,
			modal : true,
			width : '400px',
			closeOnEscape : false,
			open : function() {
				jQuery('.ui-widget-overlay').bind('click', function() {
					$('#div_WarningMsg').dialog('close');
				});
			}
		});
	} else {
		var status = confirm("Bạn có muốn tiếp tục xử lý ?");
		if (status) {
			document.getElementById('userForm').action = url;
			document.getElementById('userForm').submit();
		} else {
			//khong lam j ca
		}
	}
}

function func_xacnhanPheDuyet(url) {
	document.getElementById('userForm').action = url;
	document.getElementById('userForm').submit();
}
function func_huyKySoBCY() {
	$('#div_KysoMsg').dialog('close');
}
function func_huyPheDuyet() {
	$('#div_WarningMsg').dialog('close');
}

function displayInputModify() {
	var component = document.getElementById('modify_data');
	if (component.style.display == 'none') {
		component.style.display = '';
	} else if (component.style.display == '') {
		component.style.display = 'none';
	}
}

function validatorModify() {
	var value = $("textarea[id=ly_do_suadoi_bosung]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do !");
		return false;
	} else {
		return true;
	}
}

function validatorYeuCauBoSung() {
	var value = $("textarea[id=LY_DO_TU_CHOI]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do sửa đổi bổ sung.");
		return false;
	} else {
		return true;
	}
}

function validatorXacNhanHuy() {
	var value = $("textarea[id=LY_DO_HUY]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do !");
		return false;
	} else {
		return true;
	}
}
function validatorXacNhanHuy1() {
	var value = $("textarea[id=LY_DO_HUY1]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do !");
		return false;
	} else {
		return true;
	}
}

function validatorXacNhanHuy23() {
	var value = $("textarea[id=LY_DO_HUY23]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do !");
		return false;
	} else {
		return true;
	}
}

function displayInputThongBaoChamHoanThanhTt() {
	var component = document.getElementById('divInputThongBaoChamHoanThanhTt');
	if (component.style.display == 'none') {
		component.style.display = '';
	} else if (component.style.display == '') {
		component.style.display = 'none';
	}
}

function validatorYeCauBoSung() {
	var value = $("textarea[id=LY_DO_YEU_CAU_BO_SUNG]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do yêu cầu bổ sung.");
		return false;
	} else {
		return true;
	}
}

function validatorTuChoiGiayTo() {
	var value = $("textarea[id=LY_DO_TU_CHOI_GIAY_TO]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do từ chối.");
		return false;
	} else {
		return true;
	}
}

function validatorXacNhanCapLai() {
	var value = $("textarea[id=LY_DO_CAP_LAI]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do cấp lại.");
		return false;
	} else {
		return true;
	}
}

function validatorXacNhanTraLaiHoSo() {
	var value = $("textarea[id=LY_DO_TRA_LAI_HO_SO]").val();
	var data = $.trim(value);
	if (data.length == 0) {
		alert("Đề nghị nhập lý do trả lại hồ sơ.");
		return false;
	} else {
		return true;
	}
}
function goBack() {
	window.history.go(-2);
}

</script>
