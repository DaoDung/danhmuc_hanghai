<%@page import="vn.gt.dao.common.service.UserSignLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserSign"%>
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
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>


<%@page pageEncoding="UTF-8"%>

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
           			//System.out.println("===THU TUC MESSAGETYPE=: 999999999" + messageType + "PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE_LAN_THU_N" + PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE_LAN_THU_N);           			
           			if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0 && temp.getDocumentTypeCode() != MessageType.LOAT_THU_TUC_VAO_CANG &&
             				lstTaoOrSuaGiayPhepXuatCanh != null && lstTaoOrSuaGiayPhepXuatCanh.size() == 0 && temp.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP)
           			{
           				//System.out.println("===THU TUC MESSAGETYPE=: 999999999  MODE11111111  messageType"  + messageType + "      temp.getDocumentTypeCode()" + temp.getDocumentTypeCode());           			
           			}
           			if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0 && temp.getDocumentTypeCode() != MessageType.LOAT_THU_TUC_VAO_CANG_PTTND &&
           					lstTaoOrSuaGiayPhepXuatCanh != null && lstTaoOrSuaGiayPhepXuatCanh.size() == 0 && temp.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP)
           			{
           				//System.out.println("===THU TUC MESSAGETYPE=: 999999999  MODE2222222      messageType" + messageType + "      temp.getDocumentTypeCode()" + temp.getDocumentTypeCode());
           			}
           			if (ParamUtil.getString(request, PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE).length() > 0 && 
       						temp.getDocumentTypeCode() != MessageType.LOAT_THU_TUC_VAO_CANG && temp.getDocumentTypeCode() != MessageType.LOAT_THU_TUC_VAO_CANG_PTTND &&
       					Validator.isNotNull(suaGiayPhepXuatCanh.getRequestState()) && temp.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP)
           			{           				
           				//System.out.println("===THU TUC MESSAGETYPE=: 999999999  MODE333333      messageType" + messageType);
           			}
           			if (ParamUtil.getString(request, String.valueOf(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE_LAN_THU_N)).length() > 0 && 
       						temp.getDocumentTypeCode() != MessageType.LOAT_THU_TUC_VAO_CANG && temp.getDocumentTypeCode() != MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) 
           			{
           				//System.out.println("===THU TUC MESSAGETYPE=: 999999999  MODE444444444      messageType" + messageType);
           			}
           			
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
	</div>
	
</div>	
	

