<%@page import="vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestFieldImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.model.InterfaceRequestField"%>
<%@page import="vn.gt.dao.noticeandmessage.service.InterfaceRequestFieldLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gt.tichhop.report.ReportFunction"%>
<%@page import="vn.gt.dao.result.service.ResultNotificationLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultNotification"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
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
	if (titleListVersionHoSo == null) {
		titleListVersionHoSo = "";
	}
%>
<div class="AccordionPanel">
	<div class="AccordionPanelTab">
		<h4><liferay-ui:message key="<%=titleListVersionHoSo%>" /><img src="<%=request.getContextPath()%>/img/front/next_tle.png"></h4>
		<div class="righttle"></div>
	</div>
	<div class="AccordionPanelContent">
	<table class="table_noboder boder">
		<thead>
			<tr>
				<th class="text-center" width="15px"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
				<th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.kehoach.phienban" /></th>
				<th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.kehoach.trangthaibankhai" /></th>
				<th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.kehoach.ngaynopsua" /></th>
				<th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.kehoach.nguoilamthutuc" /></th>
				<th class="text-center" width="15%"><liferay-ui:message key="vn.dtt.kehoach.nguoinopcanbo" /></th>
				<th class="text-center" ><liferay-ui:message key="vn.dtt.kehoach.ghichu" /></th>
			</tr>
		</thead>
		<tbody>
		<%
			String chiTietHoSoKeHoachTheoVersion = "";
			String requestCodeKeHoachDetail = "";
			InterfaceRequestField interfaceRequest = null;
			
			String versionNo = "";
			int requestStateKeHoach = 0;
			int isApproval = 0;
			
			if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_AN_NINH_TAU_BIEN)) == 0) {
				
				List<TempShipSecurityMessage> results = TempShipSecurityMessageLocalServiceUtil.
					findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				if (results == null) {
					results = new ArrayList<TempShipSecurityMessage>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiAnNinhKeHoachURL = renderResponse.createRenderURL();
					banKhaiAnNinhKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiAnNinhKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiAnNinhKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiAnNinhKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiAnNinhKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiAnNinhKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiAnNinhKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiAnNinhKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiAnNinhKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					int sizes = results.size();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_HANG_HOA)) == 0) {
				List<TempCargoDeclaration> results = TempCargoDeclarationLocalServiceUtil.
					findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				if (results == null) {
					results = new ArrayList<TempCargoDeclaration>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiHangHoaKeHoachURL = renderResponse.createRenderURL();
					banKhaiHangHoaKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiHangHoaKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiHangHoaKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiHangHoaKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiHangHoaKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiHangHoaKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiHangHoaKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					banKhaiHangHoaKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					
					chiTietHoSoKeHoachTheoVersion = banKhaiHangHoaKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && (messageType.compareTo(String.valueOf(MessageType.THONG_BAO_TAU_DEN_CANG)) == 0 
						|| messageType.compareTo(String.valueOf(MessageType.THONG_BAO_TAU_QUA_CANH)) == 0
						|| messageType.compareTo(String.valueOf(MessageType.THONG_BAO_TAU_ROI_CANG)) == 0)) {
				
				List<TempNoTiceShipMessage> results = TempNoTiceShipMessageLocalServiceUtil
					.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
				
				if (results == null) { results = new ArrayList<TempNoTiceShipMessage>(); }
				
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiThongBaoTauDenCangKeHoachURL = renderResponse.createRenderURL();
					banKhaiThongBaoTauDenCangKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiThongBaoTauDenCangKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiThongBaoTauDenCangKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiThongBaoTauDenCangKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiThongBaoTauDenCangKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiThongBaoTauDenCangKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiThongBaoTauDenCangKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiThongBaoTauDenCangKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
			
					chiTietHoSoKeHoachTheoVersion = banKhaiThongBaoTauDenCangKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
				%>
				<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
				<%
				}
			} else if (messageType != null && (messageType.compareTo(String.valueOf(MessageType.XAC_BAO_TAU_DEN_CANG)) == 0
						|| messageType.compareTo(String.valueOf(MessageType.XAC_BAO_TAU_QUA_CANH)) == 0)) {
				
				List<TempNoTiceShipMessage> results = TempNoTiceShipMessageLocalServiceUtil
						.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
				if (results == null) {
					results = new ArrayList<TempNoTiceShipMessage>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiXacBaoTauDenCangKeHoachURL = renderResponse.createRenderURL();
					banKhaiXacBaoTauDenCangKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiXacBaoTauDenCangKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiXacBaoTauDenCangKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiXacBaoTauDenCangKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiXacBaoTauDenCangKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiXacBaoTauDenCangKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiXacBaoTauDenCangKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiXacBaoTauDenCangKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiXacBaoTauDenCangKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)) == 0) {
				
				List<TempCrewList> results = TempCrewListLocalServiceUtil.
					findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				if (results == null) {
					results = new ArrayList<TempCrewList>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiThuyenVienKeHoachURL = renderResponse.createRenderURL();
					banKhaiThuyenVienKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiThuyenVienKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiThuyenVienKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiThuyenVienKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiThuyenVienKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiThuyenVienKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiThuyenVienKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					banKhaiThuyenVienKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					
					chiTietHoSoKeHoachTheoVersion = banKhaiThuyenVienKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
				%>
				<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
				<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)) == 0) {
				
				List<TempPassengerList> results = TempPassengerListLocalServiceUtil.
					findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				if (results == null) {
					results = new ArrayList<TempPassengerList>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiHanhKhachKeHoachURL = renderResponse.createRenderURL();
					banKhaiHanhKhachKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiHanhKhachKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiHanhKhachKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiHanhKhachKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiHanhKhachKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiHanhKhachKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiHanhKhachKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED,ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					banKhaiHanhKhachKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					
					chiTietHoSoKeHoachTheoVersion = banKhaiHanhKhachKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANG_HOA_NGUY_HIEM)) == 0) {
				
				List<TempDangerousGoodsNanifest> results = TempDangerousGoodsNanifestLocalServiceUtil.
					findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				
				if (results == null) {
					results = new ArrayList<TempDangerousGoodsNanifest>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiHangHoaNguyenHiemKeHoachURL = renderResponse.createRenderURL();
					banKhaiHangHoaNguyenHiemKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiHangHoaNguyenHiemKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiHangHoaNguyenHiemKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiHangHoaNguyenHiemKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiHangHoaNguyenHiemKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiHangHoaNguyenHiemKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiHangHoaNguyenHiemKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiHangHoaNguyenHiemKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED,
					ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiHangHoaNguyenHiemKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
				%>
				<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
				<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_DU_TRU_CUA_TAU)) == 0) {
				
				List<TempShipStoresDeclaration> results = TempShipStoresDeclarationLocalServiceUtil.
					findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				
				if (results == null) {
					results = new ArrayList<TempShipStoresDeclaration>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiDuTruTauKeHoachURL = renderResponse.createRenderURL();
					banKhaiDuTruTauKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiDuTruTauKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiDuTruTauKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiDuTruTauKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiDuTruTauKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiDuTruTauKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiDuTruTauKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiDuTruTauKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED,
					ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiDuTruTauKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN)) == 0) {
				
				List<TempCrewEffectsDeclaration> results = TempCrewEffectsDeclarationLocalServiceUtil.
					findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				
				if (results == null) {
					results = new ArrayList<TempCrewEffectsDeclaration>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiThuyenVienKeHoachURL = renderResponse.createRenderURL();
					banKhaiThuyenVienKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiThuyenVienKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiThuyenVienKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiThuyenVienKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiThuyenVienKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiThuyenVienKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiThuyenVienKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiThuyenVienKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED,
					ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiThuyenVienKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI)) == 0) {
				
				List<TempDeclarationOfHealth> results = TempDeclarationOfHealthLocalServiceUtil
						.findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				
				if (results == null) {
					results = new ArrayList<TempDeclarationOfHealth>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiBaoYTeHangHaiKeHoachURL = renderResponse.createRenderURL();
					banKhaiBaoYTeHangHaiKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiBaoYTeHangHaiKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiBaoYTeHangHaiKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiBaoYTeHangHaiKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiBaoYTeHangHaiKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiBaoYTeHangHaiKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiBaoYTeHangHaiKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiBaoYTeHangHaiKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiBaoYTeHangHaiKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_KIEM_DICH_THUC_VAT)) == 0) {
				
				List<TempPlantQuarantine> results = TempPlantQuarantineLocalServiceUtil
					.findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				if (results == null) {
					results = new ArrayList<TempPlantQuarantine>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiKiemDichThucVatKeHoachURL = renderResponse.createRenderURL();
					banKhaiKiemDichThucVatKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiKiemDichThucVatKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiKiemDichThucVatKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiKiemDichThucVatKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiKiemDichThucVatKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiKiemDichThucVatKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiKiemDichThucVatKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					banKhaiKiemDichThucVatKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					
					chiTietHoSoKeHoachTheoVersion = banKhaiKiemDichThucVatKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_KIEM_DICH_DONG_VAT)) == 0) {
				
				List<TempAnimalQuarantine> results = TempAnimalQuarantineLocalServiceUtil
						.findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				
				if (results == null) {
					results = new ArrayList<TempAnimalQuarantine>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiKiemDichDongVatKeHoachURL = renderResponse.createRenderURL();
					banKhaiKiemDichDongVatKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiKiemDichDongVatKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiKiemDichDongVatKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiKiemDichDongVatKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiKiemDichDongVatKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiKiemDichDongVatKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiKiemDichDongVatKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiKiemDichDongVatKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiKiemDichDongVatKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0) {
				
				TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
				interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(tempDocument.getRequestCode());
				List<IssuePortClearance> results = IssuePortClearanceLocalServiceUtil.
						findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
				if (results == null) {
					results = new ArrayList<IssuePortClearance>();
				}
				for (int i = 0; i < results.size(); i++) {
					
					PortletURL banKhaiGiayPhepRoiCangKeHoachURL = renderResponse.createRenderURL();
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiGiayPhepRoiCangKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					isApproval = results.get(i).getIsApproval();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0) {
				
				TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
				interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(tempDocument.getRequestCode());
				List<IssuePortClearance> results = IssuePortClearanceLocalServiceUtil.
						findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
				if (results == null) {
					results = new ArrayList<IssuePortClearance>();
				}
				for (int i = 0; i < results.size(); i++) {
					
					PortletURL banKhaiGiayPhepRoiCangKeHoachURL = renderResponse.createRenderURL();
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiGiayPhepRoiCangKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiGiayPhepRoiCangKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					isApproval = results.get(i).getIsApproval();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.LENH_DIEU_DONG)) == 0) {
				
				TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
				
				List<IssueShiftingOrder> results = IssueShiftingOrderLocalServiceUtil.
						findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName),documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
				
				if (results == null) {
					results = new ArrayList<IssueShiftingOrder>();
				}
				for (int i = 0; i < results.size(); i++) {
					
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					if (interfaceRequest == null) {
						interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(tempDocument.getRequestCode());
						interfaceRequest.setRemarks("");
					}
					
					PortletURL banKhaiLenhDieuDongKeHoachURL = renderResponse.createRenderURL();
					banKhaiLenhDieuDongKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiLenhDieuDongKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiLenhDieuDongKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiLenhDieuDongKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiLenhDieuDongKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiLenhDieuDongKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiLenhDieuDongKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiLenhDieuDongKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiLenhDieuDongKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					isApproval = results.get(i).getIsApproval();
					
					versionNo = results.get(i).getVersionNo();
					
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			} else if (messageType != null && messageType.compareTo(String.valueOf(MessageType.BAN_KHAI_CHUNG)) == 0) {
				List<TempGeneralDeclaration> results = TempGeneralDeclarationLocalServiceUtil.
					findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
				if (results == null) {
					results = new ArrayList<TempGeneralDeclaration>();
				}
				for (int i = 0; i < results.size(); i++) {
					interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());
					
					PortletURL banKhaiChungKeHoachURL = renderResponse.createRenderURL();
					banKhaiChungKeHoachURL.setParameter("jspPage", "/html/kehoach/view.jsp");
					banKhaiChungKeHoachURL.setParameter(PageType.DOCUMENT_NAME, documentName);
					banKhaiChungKeHoachURL.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
					banKhaiChungKeHoachURL.setParameter(PageType.MESSAGE_TYPE, messageType);
					banKhaiChungKeHoachURL.setParameter(String.valueOf(PageType.PAGE_TYPE), pageType);
					banKhaiChungKeHoachURL.setParameter(String.valueOf(PageType.REQUEST_CODE), results.get(i).getRequestCode());
					banKhaiChungKeHoachURL.setParameter(PageType.TIEU_DE_BAN_KHAI, titleListVersionHoSo);
					banKhaiChungKeHoachURL.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
					
					chiTietHoSoKeHoachTheoVersion = banKhaiChungKeHoachURL.toString();
					requestStateKeHoach = results.get(i).getRequestState();
					requestCodeKeHoachDetail = results.get(i).getRequestCode();
					%>
					<%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so_detail.jspf"%>
					<%
				}
			}
			
			%>
		</tbody>
	</table>
	<br>
	<!-- ----------kehoach/thong_tin_chung_ho_so_lich_su_ho_so.jsp -->
	<%
	if (messageType != null && messageType.compareTo(String.valueOf(MessageType.LENH_DIEU_DONG)) == 0) {
		ResultNotification resultLenhDieuDong = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("40,42,71, 9970", FormatData.convertToLong(documentName), documentYear);
	%>
	<table class="table_noboder">
		<tbody>
		<%
		if (resultLenhDieuDong != null && (resultLenhDieuDong.getBusinessTypeCode() == 40 || resultLenhDieuDong.getBusinessTypeCode() == 42)) {
			if(resultLenhDieuDong.getLatestDate() != null && resultLenhDieuDong.getBusinessTypeCode() == 40 && resultLenhDieuDong.getRemarks().length() > 0) {
			%>
				<tr>
					<td align="center"><b><font color="red">DOANH NGHIỆP GỬI XÁC BÁO TÀU ĐẾN CẢNG : <%=Validator.isNotNull(resultLenhDieuDong.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultLenhDieuDong.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getRemarks()) ? (resultLenhDieuDong.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultLenhDieuDong.getRemarks()) : StringPool.BLANK %></font></b></td>
				</tr>
			<%} else if(resultLenhDieuDong.getLatestDate() != null && resultLenhDieuDong.getBusinessTypeCode() == 42 && resultLenhDieuDong.getRemarks().length() > 0){%>
				<tr>
					<td align="center"><b><font color="red">DOANH NGHIỆP GỬI XÁC BÁO TÀU QUÁ CẢNH : <%=Validator.isNotNull(resultLenhDieuDong.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultLenhDieuDong.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getRemarks()) ? (resultLenhDieuDong.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultLenhDieuDong.getRemarks()) : StringPool.BLANK %></font></b></td>
				</tr>
			<%} if(resultLenhDieuDong.getResponseTime() != null) {%>
				<tr>
					<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultLenhDieuDong.getOfficerName()) ? resultLenhDieuDong.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponseTime()) ? FormatData.parseDateToTringType3(resultLenhDieuDong.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponse()) ? resultLenhDieuDong.getResponse() : StringPool.BLANK%></font></b></td>
				</tr>
			<%}
		} else if (resultLenhDieuDong != null && resultLenhDieuDong.getBusinessTypeCode() == 71) {
			if (resultLenhDieuDong.getLatestDate() != null && resultLenhDieuDong.getRemarks().length() > 0) {
			%>
				<tr>
					<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU HỦY LỆNH ĐIỀU ĐỘNG : <%=Validator.isNotNull(resultLenhDieuDong.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(resultLenhDieuDong.getLatestDate())) : StringPool.BLANK%> : <%=Validator.isNotNull(resultLenhDieuDong.getRemarks()) ? (resultLenhDieuDong.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : resultLenhDieuDong.getRemarks()) : StringPool.BLANK %></font></b></td>
				</tr>
			<%} if(resultLenhDieuDong.getResponseTime() != null) {%>
				<tr>
					<td align="center"><b><font color="blue">TRẢ LỜI TỪ CẢNG VỤ : <%=Validator.isNotNull(resultLenhDieuDong.getOfficerName()) ? resultLenhDieuDong.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponseTime()) ? FormatData.parseDateToTringType3(resultLenhDieuDong.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponse()) ? resultLenhDieuDong.getResponse() : StringPool.BLANK%></font></b></td>
				</tr>
			<%}
		} else if (resultLenhDieuDong != null && resultLenhDieuDong.getBusinessTypeCode() == 9970) {
			
			if (resultLenhDieuDong.getLatestDate() != null && resultLenhDieuDong.getRemarks().length() > 0) {
			%>				
			<%} else if ((resultLenhDieuDong.getResponseTime() != null) && (resultLenhDieuDong.getIsReply() == 1)) {%>
				<tr>
					<td align="center"><b><font color="blue">LÃNH ĐẠO TRẢ LẠI HỒ SƠ : <%=Validator.isNotNull(resultLenhDieuDong.getOfficerName()) ? resultLenhDieuDong.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponseTime()) ? FormatData.parseDateToTringType3(resultLenhDieuDong.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(resultLenhDieuDong.getResponse()) ? resultLenhDieuDong.getResponse() : StringPool.BLANK%></font></b></td>
				</tr>
			<%}
		}
		%>
		</tbody>
	</table>
	<%}%>
	</div>
</div>