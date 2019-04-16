<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestFieldImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.InterfaceRequestFieldLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.InterfaceRequestField"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.tichhop.report.ReportFunction"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gt.dao.result.service.ResultNotificationLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultNotification"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePortClearance"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempPlantQuarantine"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempPlantQuarantineLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDeclarationOfHealthLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempPassengerListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempPassengerList"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewList"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCargoDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.model.InterfaceRequest"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage"%>
<%@page import="vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalServiceUtil"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page pageEncoding="UTF-8"%>
<%
if (renderRequest.getParameter(PageType.DOCUMENT_NAME) != null) {
    titleListVersionHoSo = renderRequest.getParameter(PageType.TIEU_DE_BAN_KHAI);
}
%>
<div class="AccordionPanel">
	<div class="AccordionPanelTab"><h4><liferay-ui:message  key="<%=titleListVersionHoSo %>" /><img src="<%=request.getContextPath()%>/img/front/next_tle.png"></h4>
	    <div class="righttle"></div>
	</div>
	<div class="AccordionPanelContent">
	    <table class="table_noboder boder">
	        <thead>
	            <tr>
	                <th class="text-center" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
	                <th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.thutuc.phienban" /></th>
	                <th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.thutuc.trangthaibankhai" /></th>
	                <th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.thutuc.ngaynopsua" /></th>
	                <th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.thutuc.nguoilamthutuc" /></th>
	                <th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.thutuc.nguoinopcanbo" /></th>
	                <th class="text-center" ><liferay-ui:message key="vn.dtt.thutuc.ghichu" /></th>
	            </tr>
	        </thead>
	        <tbody>
	<%
	String requestCodeThuTuc = "";
	String requestCodeThuTucDetail = "";
	InterfaceRequestField interfaceRequest = null;
	
	String versionNo = "";
	int requestStateThuTuc = 0;
	int isApproval = 0;
	
	LogFactoryUtil.getLog(ThuTucAction.class).info("==84==thong_tin_chung_ho_so_lich_su_ho_so.jsp==documentName==" + documentName + "==documentYear==" + documentYear);
	
	if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_AN_NINH_TAU_BIEN)) == 0) {
	
		List<TempShipSecurityMessage> results = TempShipSecurityMessageLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempShipSecurityMessage>();
		}
		for (int i = 0; i < results.size(); i++) {
			interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
	
			PortletURL banKhaiAnNinhThuTucURL = renderResponse.createRenderURL();
			banKhaiAnNinhThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiAnNinhThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiAnNinhThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiAnNinhThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiAnNinhThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiAnNinhThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiAnNinhThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiAnNinhThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	                                   
			requestCodeThuTuc = banKhaiAnNinhThuTucURL.toString();
			requestStateThuTuc = results.get(i).getRequestState();
			requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
	                               }
	}else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_HANG_HOA)) == 0) {
		List<TempCargoDeclaration> results = TempCargoDeclarationLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempCargoDeclaration>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
			
			PortletURL banKhaiHangHoaThuTucURL = renderResponse.createRenderURL();
			banKhaiHangHoaThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiHangHoaThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
            banKhaiHangHoaThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
            banKhaiHangHoaThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
            banKhaiHangHoaThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
            banKhaiHangHoaThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
            banKhaiHangHoaThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
            banKhaiHangHoaThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
            
            requestCodeThuTuc = banKhaiHangHoaThuTucURL.toString();
            requestStateThuTuc = results.get(i).getRequestState();
            requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
		}
	} else if (messageType != null && (messageType.compareTo(String.valueOf(MessageType.THONG_BAO_TAU_DEN_CANG)) == 0 || messageType.compareTo(String.valueOf(MessageType.THONG_BAO_TAU_QUA_CANH)) == 0 || messageType.compareTo(String.valueOf(MessageType.THONG_BAO_TAU_ROI_CANG)) == 0)) {
		
		//List<TempNoTiceShipMessage> results = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG);
		List<TempNoTiceShipMessage> results = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
		if (results == null) {
			results = new ArrayList<TempNoTiceShipMessage>();
		}
		for (int i = 0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
	
			PortletURL banKhaiThongBaoTauDenCangThuTucURL = renderResponse.createRenderURL();
			banKhaiThongBaoTauDenCangThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiThongBaoTauDenCangThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiThongBaoTauDenCangThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiThongBaoTauDenCangThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiThongBaoTauDenCangThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiThongBaoTauDenCangThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiThongBaoTauDenCangThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiThongBaoTauDenCangThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
			
			requestCodeThuTuc = banKhaiThongBaoTauDenCangThuTucURL.toString();
			requestStateThuTuc = results.get(i).getRequestState();
			requestCodeThuTucDetail = results.get(i).getRequestCode();
	   %>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	             <%
		}
	} else if (messageType != null && (messageType.compareTo(String.valueOf(MessageType.XAC_BAO_TAU_DEN_CANG)) == 0 || messageType.compareTo(String.valueOf(MessageType.XAC_BAO_TAU_QUA_CANH)) == 0)) {
		
		List<TempNoTiceShipMessage> results = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
		if (results == null) {
			results = new ArrayList<TempNoTiceShipMessage>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
	
			PortletURL banKhaiXacBaoTauDenCangThuTucURL = renderResponse.createRenderURL();
			banKhaiXacBaoTauDenCangThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiXacBaoTauDenCangThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiXacBaoTauDenCangThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiXacBaoTauDenCangThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiXacBaoTauDenCangThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiXacBaoTauDenCangThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiXacBaoTauDenCangThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiXacBaoTauDenCangThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	                                   
	                                   requestCodeThuTuc = banKhaiXacBaoTauDenCangThuTucURL.toString();
	                                   requestStateThuTuc = results.get(i).getRequestState();
	                                   requestCodeThuTucDetail = results.get(i).getRequestCode();
	   %>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	              <%
	                               }
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)) == 0) {
		List<TempCrewList> results = TempCrewListLocalServiceUtil.findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempCrewList>();
		}
		
		
		
		for (int i = 0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
	
			PortletURL banKhaiThuyenVienThuTucURL = renderResponse.createRenderURL();
			banKhaiThuyenVienThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
            banKhaiThuyenVienThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
            banKhaiThuyenVienThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
            banKhaiThuyenVienThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
            banKhaiThuyenVienThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
            banKhaiThuyenVienThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
            banKhaiThuyenVienThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
            banKhaiThuyenVienThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
            
            requestCodeThuTuc = banKhaiThuyenVienThuTucURL.toString();
            requestStateThuTuc = results.get(i).getRequestState();
            requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
	                               }
	}else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)) == 0) {
		List<TempPassengerList> results = TempPassengerListLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempPassengerList>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
	
			PortletURL banKhaiHanhKhachThuTucURL = renderResponse.createRenderURL();
			banKhaiHanhKhachThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiHanhKhachThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiHanhKhachThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiHanhKhachThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
            banKhaiHanhKhachThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
            banKhaiHanhKhachThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
            banKhaiHanhKhachThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
            banKhaiHanhKhachThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
            
            requestCodeThuTuc = banKhaiHanhKhachThuTucURL.toString();
            requestStateThuTuc = results.get(i).getRequestState();
            requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
		}
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANG_HOA_NGUY_HIEM)) == 0) {
		List<TempDangerousGoodsNanifest> results = TempDangerousGoodsNanifestLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempDangerousGoodsNanifest>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
			
			PortletURL banKhaiHangHoaNguyenHiemThuTucURL = renderResponse.createRenderURL();
			banKhaiHangHoaNguyenHiemThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiHangHoaNguyenHiemThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiHangHoaNguyenHiemThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiHangHoaNguyenHiemThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiHangHoaNguyenHiemThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiHangHoaNguyenHiemThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiHangHoaNguyenHiemThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiHangHoaNguyenHiemThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	                                   
	                                   requestCodeThuTuc = banKhaiHangHoaNguyenHiemThuTucURL.toString();
	                                   requestStateThuTuc = results.get(i).getRequestState();
	                                   requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
	                               }
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DU_TRU_CUA_TAU)) == 0) {
		List<TempShipStoresDeclaration> results = TempShipStoresDeclarationLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempShipStoresDeclaration>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
			
			PortletURL banKhaiDuTruTauThuTucURL = renderResponse.createRenderURL();
			banKhaiDuTruTauThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiDuTruTauThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiDuTruTauThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiDuTruTauThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiDuTruTauThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiDuTruTauThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiDuTruTauThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiDuTruTauThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	                                   
	                                   requestCodeThuTuc = banKhaiDuTruTauThuTucURL.toString();
	                                   requestStateThuTuc = results.get(i).getRequestState();
	                                   requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	<%
	   }
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN)) == 0) {
		List<TempCrewEffectsDeclaration> results = TempCrewEffectsDeclarationLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempCrewEffectsDeclaration>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
	
			PortletURL banKhaiThuyenVienThuTucURL = renderResponse.createRenderURL();
			banKhaiThuyenVienThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiThuyenVienThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiThuyenVienThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiThuyenVienThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiThuyenVienThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiThuyenVienThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiThuyenVienThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiThuyenVienThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	                                   
	                                   requestCodeThuTuc = banKhaiThuyenVienThuTucURL.toString();
	                                   requestStateThuTuc = results.get(i).getRequestState();
	                                   requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	             <%
	                                } 
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI)) == 0) {
		List<TempDeclarationOfHealth> results = TempDeclarationOfHealthLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempDeclarationOfHealth>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
			
			PortletURL banKhaiBaoYTeHangHaiThuTucURL = renderResponse.createRenderURL();
			banKhaiBaoYTeHangHaiThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiBaoYTeHangHaiThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiBaoYTeHangHaiThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiBaoYTeHangHaiThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiBaoYTeHangHaiThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiBaoYTeHangHaiThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiBaoYTeHangHaiThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiBaoYTeHangHaiThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	                                   
	                                   requestCodeThuTuc = banKhaiBaoYTeHangHaiThuTucURL.toString();
	                                   requestStateThuTuc = results.get(i).getRequestState();
	                                   requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	           <%
	                              }
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_KIEM_DICH_THUC_VAT)) == 0) {
		List<TempPlantQuarantine> results = TempPlantQuarantineLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempPlantQuarantine>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
			
			PortletURL banKhaiKiemDichThucVatThuTucURL = renderResponse.createRenderURL();
			banKhaiKiemDichThucVatThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiKiemDichThucVatThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiKiemDichThucVatThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiKiemDichThucVatThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiKiemDichThucVatThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiKiemDichThucVatThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiKiemDichThucVatThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiKiemDichThucVatThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	                                   
	                                   requestCodeThuTuc = banKhaiKiemDichThucVatThuTucURL.toString();
	                                   requestStateThuTuc = results.get(i).getRequestState();
	                                   requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	             <%
	                                }
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_KIEM_DICH_DONG_VAT)) == 0) {
		List<TempAnimalQuarantine> results = TempAnimalQuarantineLocalServiceUtil.
				findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
		if (results == null) {
			results = new ArrayList<TempAnimalQuarantine>();
		}
		for (int i=0; i < results.size(); i++) {
			interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
	
			PortletURL banKhaiKiemDichDongVatThuTucURL = renderResponse.createRenderURL();
			banKhaiKiemDichDongVatThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiKiemDichDongVatThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiKiemDichDongVatThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiKiemDichDongVatThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiKiemDichDongVatThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiKiemDichDongVatThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiKiemDichDongVatThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiKiemDichDongVatThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	        
            requestCodeThuTuc = banKhaiKiemDichDongVatThuTucURL.toString();
            requestStateThuTuc = results.get(i).getRequestState();
            requestCodeThuTucDetail = results.get(i).getRequestCode();
	%>
	<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
		}
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0) {
		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
		
        List<IssuePortClearance> results = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
        if (results == null) {
        	results = new ArrayList<IssuePortClearance>();
        }
        for (int i = 0; i < results.size(); i++) {
        	
        	interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
        	if (interfaceRequest == null) {
        		interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(tempDocument.getRequestCode());
        		interfaceRequest.setRemarks("");
        	}
        	
            PortletURL banKhaiGiayPhepRoiCangThuTucURL = renderResponse.createRenderURL();
            banKhaiGiayPhepRoiCangThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
            
            requestCodeThuTuc = banKhaiGiayPhepRoiCangThuTucURL.toString();
            requestStateThuTuc = results.get(i).getRequestState();
            requestCodeThuTucDetail = results.get(i).getRequestCode();
            isApproval = results.get(i).getIsApproval();
            
            versionNo = results.get(i).getVersionNo();
	                           %>
	            <%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
		}
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0) {
		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
		
        
        List<IssuePortClearance> results = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
        if (results == null) {
        	results = new ArrayList<IssuePortClearance>();
        }
        for (int i = 0; i < results.size(); i++) {
        	
        	interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
        	if (interfaceRequest == null) {
        		interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(tempDocument.getRequestCode());
        		interfaceRequest.setRemarks("");
        	}
        	
            PortletURL banKhaiGiayPhepRoiCangThuTucURL = renderResponse.createRenderURL();
            banKhaiGiayPhepRoiCangThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
            banKhaiGiayPhepRoiCangThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
            
            requestCodeThuTuc = banKhaiGiayPhepRoiCangThuTucURL.toString();
            requestStateThuTuc = results.get(i).getRequestState();
            requestCodeThuTucDetail = results.get(i).getRequestCode();
            isApproval = results.get(i).getIsApproval();
            
            versionNo = results.get(i).getVersionNo();
	                           %>
	            <%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
		}
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)) == 0) {
		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
		
        
        List<IssueAcceptance> results = IssueAcceptanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
        
        if (results == null) {
        	results = new ArrayList<IssueAcceptance>();
        }
        for (int i = 0; i < results.size(); i++) {
        	
        	interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
        	if (interfaceRequest == null) {
        		interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(tempDocument.getRequestCode());
        		interfaceRequest.setRemarks("");
        	}
        	
            PortletURL banKhaiGiayPhepVaoCangThuTucURL = renderResponse.createRenderURL();
            banKhaiGiayPhepVaoCangThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
            banKhaiGiayPhepVaoCangThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
            banKhaiGiayPhepVaoCangThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
            banKhaiGiayPhepVaoCangThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
            banKhaiGiayPhepVaoCangThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
            banKhaiGiayPhepVaoCangThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
            banKhaiGiayPhepVaoCangThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
            banKhaiGiayPhepVaoCangThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
            
            requestCodeThuTuc = banKhaiGiayPhepVaoCangThuTucURL.toString();
            requestStateThuTuc = results.get(i).getRequestState();
            requestCodeThuTucDetail = results.get(i).getRequestCode();
            isApproval = results.get(i).getIsApproval();
            
            versionNo = results.get(i).getVersionNo();
	                           %>
	            <%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
		}
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.LENH_DIEU_DONG)) == 0) {
		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
		List<IssueShiftingOrder> results = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
		
		if (results == null) { results = new ArrayList<IssueShiftingOrder>(); }
		
		for (int i = 0; i < results.size(); i++) {
			
			interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
			if (interfaceRequest == null) {
				interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(tempDocument.getRequestCode());
				interfaceRequest.setRemarks("");
			}
			
			PortletURL banKhaiLenhDieuDongThuTucURL = renderResponse.createRenderURL();
			banKhaiLenhDieuDongThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
			banKhaiLenhDieuDongThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
			banKhaiLenhDieuDongThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
			banKhaiLenhDieuDongThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
			banKhaiLenhDieuDongThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
			banKhaiLenhDieuDongThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
			banKhaiLenhDieuDongThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
			banKhaiLenhDieuDongThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
			
			requestCodeThuTuc = banKhaiLenhDieuDongThuTucURL.toString();
			requestStateThuTuc = results.get(i).getRequestState();
			requestCodeThuTucDetail = results.get(i).getRequestCode();
			
			versionNo = results.get(i).getVersionNo();
			
			isApproval = results.get(i).getIsApproval();
			%>
			<%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
			<%
	                               }
	                           
	} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_CHUNG)) == 0) {
         List<TempGeneralDeclaration> results = TempGeneralDeclarationLocalServiceUtil.findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
                     if (results == null) {
                     	results = new ArrayList<TempGeneralDeclaration>();
                     }
                     for (int i=0; i < results.size(); i++) {
           
                         interfaceRequest= InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
                        
                         PortletURL banKhaiChungThuTucURL = renderResponse.createRenderURL();
                         banKhaiChungThuTucURL.setParameter("jspPage", "/html/thutuc/view.jsp");
                         banKhaiChungThuTucURL.setParameter(PageType.DOCUMENT_NAME, documentName);
                         banKhaiChungThuTucURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                         banKhaiChungThuTucURL.setParameter(PageType.MESSAGE_TYPE, messageType);
                         banKhaiChungThuTucURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
                         banKhaiChungThuTucURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
                         banKhaiChungThuTucURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
                         banKhaiChungThuTucURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                         
                         requestCodeThuTuc = banKhaiChungThuTucURL.toString();
                         requestStateThuTuc = results.get(i).getRequestState();
                         requestCodeThuTucDetail = results.get(i).getRequestCode();
                 %>
	            <%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
	             }
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_QUA_CANH)) == 0) {
	            TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);	            
	            
	            List<IssuePermissionForTransit> results = IssuePermissionForTransitLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
	            if (results == null) {
	            	results = new ArrayList<IssuePermissionForTransit>();
	            }
	            for (int i = 0; i < results.size(); i++) {
	            	
	            	interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
	            	if (Validator.isNull(interfaceRequest)) {
	            		interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(tempDocument.getRequestCode());
	            	}
	            	
	            	
	            	
	                PortletURL banKhaiGiayPhepQuaCanhURL = renderResponse.createRenderURL();
	                banKhaiGiayPhepQuaCanhURL.setParameter("jspPage", "/html/thutuc/view.jsp");
	                banKhaiGiayPhepQuaCanhURL.setParameter(PageType.DOCUMENT_NAME, documentName);
	                banKhaiGiayPhepQuaCanhURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
	                banKhaiGiayPhepQuaCanhURL.setParameter(PageType.MESSAGE_TYPE, messageType);
	                banKhaiGiayPhepQuaCanhURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
	                banKhaiGiayPhepQuaCanhURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
	                banKhaiGiayPhepQuaCanhURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
	                banKhaiGiayPhepQuaCanhURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	                
	                requestCodeThuTuc = banKhaiGiayPhepQuaCanhURL.toString();
	                requestStateThuTuc = results.get(i).getRequestState();
	                requestCodeThuTucDetail = results.get(i).getRequestCode();
	                
	                versionNo = results.get(i).getVersionNo();
	                
	                isApproval = results.get(i).getIsApproval();
	        %>
	            <%@ include file="/html/thutuc/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
	            <%
			}
		}
		%>
	        </tbody>
	    </table>
	    <br>
	    <!-- thutuc/thong_tin_chung_ho_so_lich_su_ho_so.jsp----------------- -->
	    <%
	    if (messageType != null && messageType.compareTo(String.valueOf(MessageType.LENH_DIEU_DONG)) == 0) {
	    ResultNotification resultLenhDieuDong = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("40,42,71, 9970", FormatData.convertToLong(documentName), documentYear);
	    %>
	    <table class="table_noboder">
	    		<tbody>
	    		<%
	    		if(resultLenhDieuDong != null && (resultLenhDieuDong.getBusinessTypeCode() == 40 || resultLenhDieuDong.getBusinessTypeCode() == 42)){
	    			if(resultLenhDieuDong.getLatestDate() != null && resultLenhDieuDong.getBusinessTypeCode() == 40 && resultLenhDieuDong.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI XÁC BÁO TÀU ĐẾN CẢNG : <%=Validator.isNotNull(resultLenhDieuDong.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultLenhDieuDong.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getRemarks()) ? (resultLenhDieuDong.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultLenhDieuDong.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    			} else if(resultLenhDieuDong.getLatestDate() != null && resultLenhDieuDong.getBusinessTypeCode() == 42 && resultLenhDieuDong.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI XÁC BÁO TÀU QUÁ CẢNH : <%=Validator.isNotNull(resultLenhDieuDong.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultLenhDieuDong.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getRemarks()) ? (resultLenhDieuDong.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultLenhDieuDong.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    		} if(resultLenhDieuDong.getResponseTime() != null){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultLenhDieuDong.getOfficerName()) ? resultLenhDieuDong.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponseTime()) ? FormatData.parseDateToTringType3(resultLenhDieuDong.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponse()) ? resultLenhDieuDong.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		} else if(resultLenhDieuDong != null && resultLenhDieuDong.getBusinessTypeCode() == 71){
	    			if(resultLenhDieuDong.getLatestDate() != null && resultLenhDieuDong.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU HỦY LỆNH ĐIỀU ĐỘNG : <%=Validator.isNotNull(resultLenhDieuDong.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultLenhDieuDong.getLatestDate())) : StringPool.BLANK%> : <%=Validator.isNotNull(resultLenhDieuDong.getRemarks()) ? (resultLenhDieuDong.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultLenhDieuDong.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    		} if(resultLenhDieuDong.getResponseTime() != null){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultLenhDieuDong.getOfficerName()) ? resultLenhDieuDong.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponseTime()) ? FormatData.parseDateToTringType3(resultLenhDieuDong.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponse()) ? resultLenhDieuDong.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		} 
	    		%>
	    		</tbody>
	    </table>
	    <%
	    } if (messageType != null && messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0) {
	    	 ResultNotification resultGPRoiCang = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("62, 63, 9960", FormatData.convertToLong(documentName), documentYear);
	    %>
	    <table class="table_noboder">
	    		<tbody>
	    		<%
	    		if(resultGPRoiCang != null && resultGPRoiCang.getBusinessTypeCode() == 62){
	    			if(resultGPRoiCang.getLatestDate() != null && resultGPRoiCang.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU HỦY GIẤY PHÉP RỜI CẢNG : <%=Validator.isNotNull(resultGPRoiCang.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPRoiCang.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCang.getRemarks()) ? (resultGPRoiCang.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPRoiCang.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    			}
	    		if(resultGPRoiCang.getResponseTime() != null){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPRoiCang.getOfficerName()) ? resultGPRoiCang.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCang.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPRoiCang.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCang.getResponse()) ? resultGPRoiCang.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		}  else if(resultGPRoiCang != null && resultGPRoiCang.getBusinessTypeCode() == 63){
	    			if(resultGPRoiCang.getLatestDate() != null && resultGPRoiCang.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU CẤP LẠI GIẤY PHÉP RỜI CẢNG : <%=Validator.isNotNull(resultGPRoiCang.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPRoiCang.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCang.getRemarks()) ? (resultGPRoiCang.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPRoiCang.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    			}
	    		if(resultGPRoiCang.getResponseTime() != null){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPRoiCang.getOfficerName()) ? resultGPRoiCang.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCang.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPRoiCang.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCang.getResponse()) ? resultGPRoiCang.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		} else if(resultGPRoiCang != null && resultGPRoiCang.getBusinessTypeCode() == 9960){
	    			if(resultGPRoiCang.getLatestDate() != null && resultGPRoiCang.getRemarks().length() > 0){
	    		%>	    	
	    		<% } else if ((resultGPRoiCang.getResponseTime() != null) && (resultGPRoiCang.getIsReply() == 1)) {%>
	    		<tr>
	    		<td align="center"><b><font color="blue">LÃNH ĐẠO TRẢ LẠI HỒ SƠ : <%=Validator.isNotNull(resultGPRoiCang.getOfficerName()) ? resultGPRoiCang.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCang.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPRoiCang.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCang.getResponse()) ? resultGPRoiCang.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		}
	    		%>
	    		</tbody>
	    </table>
	    <%
	    } if (messageType != null && messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0) {
	    	 ResultNotification resultGPRoiCangPTTND = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("62, 63, 9961", FormatData.convertToLong(documentName), documentYear);
	    %>
	    <table class="table_noboder">
	    		<tbody>
	    		<%
	    		if(resultGPRoiCangPTTND != null && resultGPRoiCangPTTND.getBusinessTypeCode() == 62){
	    			if(resultGPRoiCangPTTND.getLatestDate() != null && resultGPRoiCangPTTND.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU HỦY GIẤY PHÉP RỜI CẢNG : <%=Validator.isNotNull(resultGPRoiCangPTTND.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPRoiCangPTTND.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCangPTTND.getRemarks()) ? (resultGPRoiCangPTTND.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPRoiCangPTTND.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    			}
	    		if(resultGPRoiCangPTTND.getResponseTime() != null){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPRoiCangPTTND.getOfficerName()) ? resultGPRoiCangPTTND.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCangPTTND.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPRoiCangPTTND.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCangPTTND.getResponse()) ? resultGPRoiCangPTTND.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		}  else if(resultGPRoiCangPTTND != null && resultGPRoiCangPTTND.getBusinessTypeCode() == 63){
	    			if(resultGPRoiCangPTTND.getLatestDate() != null && resultGPRoiCangPTTND.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU CẤP LẠI GIẤY PHÉP RỜI CẢNG : <%=Validator.isNotNull(resultGPRoiCangPTTND.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPRoiCangPTTND.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCangPTTND.getRemarks()) ? (resultGPRoiCangPTTND.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPRoiCangPTTND.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    			}
	    		if(resultGPRoiCangPTTND.getResponseTime() != null){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPRoiCangPTTND.getOfficerName()) ? resultGPRoiCangPTTND.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCangPTTND.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPRoiCangPTTND.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCangPTTND.getResponse()) ? resultGPRoiCangPTTND.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		} else if(resultGPRoiCangPTTND != null && resultGPRoiCangPTTND.getBusinessTypeCode() == 9961){
	    			if(resultGPRoiCangPTTND.getLatestDate() != null && resultGPRoiCangPTTND.getRemarks().length() > 0){
	    		%>
	    		<% } else if ((resultGPRoiCangPTTND.getResponseTime() != null) && (resultGPRoiCangPTTND.getIsReply() == 1)) { %>	    		
	    		<tr>
	    		<td align="center"><b><font color="blue">LÃNH ĐẠO TRẢ LẠI HỒ SƠ : <%=Validator.isNotNull(resultGPRoiCangPTTND.getOfficerName()) ? resultGPRoiCangPTTND.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCangPTTND.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPRoiCangPTTND.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPRoiCangPTTND.getResponse()) ? resultGPRoiCangPTTND.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		}
	    		%>
	    		</tbody>
	    </table>
	    <%
	    } if (messageType != null && messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_QUA_CANH)) == 0) {
	   	 ResultNotification resultGPQuaCanh = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("93, 94, 9990", FormatData.convertToLong(documentName), documentYear);
	    %>
	    <table class="table_noboder">
	    		<tbody>
	    		<%
	    		if (resultGPQuaCanh != null && resultGPQuaCanh.getBusinessTypeCode() == 93) {
	    			if (resultGPQuaCanh.getLatestDate() != null && resultGPQuaCanh.getRemarks().length() > 0) {
	    			%>
		    		<tr>
		    			<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU HỦY GIẤY PHÉP QUÁ CẢNH : <%=Validator.isNotNull(resultGPQuaCanh.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPQuaCanh.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getRemarks()) ? (resultGPQuaCanh.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPQuaCanh.getRemarks()) : StringPool.BLANK %></font></b></td>
		    		</tr>
	    			<%
	    			}
	    			if (resultGPQuaCanh.getResponseTime() != null) {
    				%>
		    		<tr>
		    			<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPQuaCanh.getOfficerName()) ? resultGPQuaCanh.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPQuaCanh.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponse()) ? resultGPQuaCanh.getResponse() : StringPool.BLANK%></font></b></td>
		    		</tr>
    				<%
	    			}
	    		} else if (resultGPQuaCanh != null && resultGPQuaCanh.getBusinessTypeCode() == 94) {
	    			if (resultGPQuaCanh.getLatestDate() != null && resultGPQuaCanh.getRemarks().length() > 0) {
	    			%>
		    		<tr>
		    			<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU CẤP LẠI GIẤY PHÉP QUÁ CẢNH : <%=Validator.isNotNull(resultGPQuaCanh.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPQuaCanh.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getRemarks()) ? (resultGPQuaCanh.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPQuaCanh.getRemarks()) : StringPool.BLANK %></font></b></td>
		    		</tr>
	    			<%
	    			}
		    		if (resultGPQuaCanh.getResponseTime() != null) {
		    		%>
		    		<tr>
		    			<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPQuaCanh.getOfficerName()) ? resultGPQuaCanh.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPQuaCanh.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponse()) ? resultGPQuaCanh.getResponse() : StringPool.BLANK%></font></b></td>
		    		</tr>
		    		<%
	    			}
	    		} else if (resultGPQuaCanh != null && resultGPQuaCanh.getBusinessTypeCode() == 9990) {
	    			if (resultGPQuaCanh.getLatestDate() != null && resultGPQuaCanh.getRemarks().length() > 0) {
	    			%>
	    			<% } else if ((resultGPQuaCanh.getResponseTime() != null) && (resultGPQuaCanh.getIsReply() == 1)) {%>
		    		
		    		<tr>
		    			<td align="center"><b><font color="blue">LÃNH ĐẠO TRẢ LẠI HỒ SƠ : <%=Validator.isNotNull(resultGPQuaCanh.getOfficerName()) ? resultGPQuaCanh.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPQuaCanh.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponse()) ? resultGPQuaCanh.getResponse() : StringPool.BLANK%></font></b></td>
		    		</tr>
		    		<%
	    			}
	    		}
	    		%>
	    		</tbody>
	    </table>
	    <%
	    } if (messageType != null && messageType.compareTo(String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)) == 0) {
	    	 ResultNotification resultGPVaoCangPTTND = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("82, 83, 9981", FormatData.convertToLong(documentName), documentYear);
	    %>
	    <table class="table_noboder">
	    		<tbody>
	    		<%
	    		if(resultGPVaoCangPTTND != null && resultGPVaoCangPTTND.getBusinessTypeCode() == 82){
	    			if(resultGPVaoCangPTTND.getLatestDate() != null && resultGPVaoCangPTTND.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU HỦY GIẤY PHÉP VÀO CẢNG : <%=Validator.isNotNull(resultGPVaoCangPTTND.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPVaoCangPTTND.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPVaoCangPTTND.getRemarks()) ? (resultGPVaoCangPTTND.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPVaoCangPTTND.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    			}
	    		if(resultGPVaoCangPTTND.getResponseTime() != null){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPVaoCangPTTND.getOfficerName()) ? resultGPVaoCangPTTND.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPVaoCangPTTND.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPVaoCangPTTND.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPVaoCangPTTND.getResponse()) ? resultGPVaoCangPTTND.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		}  else if(resultGPVaoCangPTTND != null && resultGPVaoCangPTTND.getBusinessTypeCode() == 83){
	    			if(resultGPVaoCangPTTND.getLatestDate() != null && resultGPVaoCangPTTND.getRemarks().length() > 0){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU CẤP LẠI GIẤY PHÉP VÀO CẢNG : <%=Validator.isNotNull(resultGPVaoCangPTTND.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPVaoCangPTTND.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPVaoCangPTTND.getRemarks()) ? (resultGPVaoCangPTTND.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPVaoCangPTTND.getRemarks()) : StringPool.BLANK %></font></b></td>
	    		</tr>
	    		<%
	    			}
	    		if(resultGPVaoCangPTTND.getResponseTime() != null){
	    		%>
	    		<tr>
	    		<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPVaoCangPTTND.getOfficerName()) ? resultGPVaoCangPTTND.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPVaoCangPTTND.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPVaoCangPTTND.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPVaoCangPTTND.getResponse()) ? resultGPVaoCangPTTND.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		} else if(resultGPVaoCangPTTND != null && resultGPVaoCangPTTND.getBusinessTypeCode() == 9981){
	    			if(resultGPVaoCangPTTND.getLatestDate() != null && resultGPVaoCangPTTND.getRemarks().length() > 0){
	    		%>
	    		<% } else if ((resultGPVaoCangPTTND.getResponseTime() != null) && (resultGPVaoCangPTTND.getIsReply() == 1)) { %>
	    		<tr>
	    		<td align="center"><b><font color="blue">LÃNH ĐẠO TRẢ LẠI HỒ SƠ : <%=Validator.isNotNull(resultGPVaoCangPTTND.getOfficerName()) ? resultGPVaoCangPTTND.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPVaoCangPTTND.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPVaoCangPTTND.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPVaoCangPTTND.getResponse()) ? resultGPVaoCangPTTND.getResponse() : StringPool.BLANK%></font></b></td>
	    		</tr>
	    		<%
	    		}
	    		}
	    		%>
	    		</tbody>
	    </table>
	    <%
	    } if (messageType != null && (messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_CHUNG)) == 0)) {
		   	 ResultNotification resultGPQuaCanh = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("50", FormatData.convertToLong(documentName), documentYear); 
	    %>
	    <table class="table_noboder">
	    		<tbody>
	    		<%
	    		if (resultGPQuaCanh != null && resultGPQuaCanh.getBusinessTypeCode() == 50) {
	    			if (resultGPQuaCanh.getLatestDate() != null && resultGPQuaCanh.getRemarks().length() > 0) {
	    			%>
		    		<tr>
		    			<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU BỔ SUNG BẢN KHAI CHUNG: <%=Validator.isNotNull(resultGPQuaCanh.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPQuaCanh.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getRemarks()) ? (resultGPQuaCanh.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPQuaCanh.getRemarks()) : StringPool.BLANK %></font></b></td>
		    		</tr>
	    			<%
	    			}
	    			if (resultGPQuaCanh.getResponseTime() != null) {
    				%>
		    		<tr>
		    			<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPQuaCanh.getOfficerName()) ? resultGPQuaCanh.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPQuaCanh.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponse()) ? resultGPQuaCanh.getResponse() : StringPool.BLANK%></font></b></td>
		    		</tr>
    				<%
	    			}	    		
	    		}
	    		%>
	    		</tbody>
	    </table>
	    <% }  if (messageType != null && (messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)) == 0) ) {
		   	 ResultNotification resultGPQuaCanh = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("51", FormatData.convertToLong(documentName), documentYear); %>
	    	<table class="table_noboder">
	    		<tbody>
	    		<%
	    		if (resultGPQuaCanh != null && resultGPQuaCanh.getBusinessTypeCode() == 51) {
	    			if (resultGPQuaCanh.getLatestDate() != null && resultGPQuaCanh.getRemarks().length() > 0) {
	    			%>
		    		<tr>
		    			<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU BỔ SUNG BẢN KHAI DSTV: <%=Validator.isNotNull(resultGPQuaCanh.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultGPQuaCanh.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getRemarks()) ? (resultGPQuaCanh.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultGPQuaCanh.getRemarks()) : StringPool.BLANK %></font></b></td>
		    		</tr>
	    			<%
	    			}
	    			if (resultGPQuaCanh.getResponseTime() != null) {
    				%>
		    		<tr>
		    			<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultGPQuaCanh.getOfficerName()) ? resultGPQuaCanh.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponseTime()) ? FormatData.parseDateToTringType3(resultGPQuaCanh.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultGPQuaCanh.getResponse()) ? resultGPQuaCanh.getResponse() : StringPool.BLANK%></font></b></td>
		    		</tr>
    				<%
	    			}
	    		} 
	    		}
	    		%>
	    		</tbody>
	    </table>
	    
	    </div>
	</div>
