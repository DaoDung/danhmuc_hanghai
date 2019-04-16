//package vn.gt.portlet.kehoach;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.UUID;
//
//import javax.portlet.ActionRequest;
//import javax.portlet.ActionResponse;
//import javax.portlet.PortletConfig;
//import javax.portlet.PortletException;
//import javax.portlet.ResourceRequest;
//import javax.portlet.ResourceResponse;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.commons.io.FileUtils;
//
//import vgca.svrsigner.ServerSigner;
//import vn.gt.tichhop.report.ReportConstant;
//import vn.gt.dao.danhmuc.model.DmPortRegion;
//import vn.gt.dao.danhmuc.model.DmPortWharf;
//import vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil;
//import vn.gt.dao.danhmuc.service.DmPortWharfLocalServiceUtil;
//import vn.gt.dao.danhmucgt.model.DmGtStatus;
//import vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil;
//import vn.gt.dao.noticeandmessage.model.IssueShiftingOrder;
//import vn.gt.dao.noticeandmessage.model.TempDocument;
//import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil;
//import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
//import vn.gt.dao.result.model.ResultNotification;
//import vn.gt.dao.result.model.impl.ResultNotificationImpl;
//import vn.gt.dao.result.service.ResultNotificationLocalServiceUtil;
//import vn.gt.menu.MenuConstraint;
//import vn.gt.portlet.TransportationMVCAction;
//import vn.gt.portlet.kehoach.utils.CommonUtils;
//import vn.gt.tichhop.message.MessageType;
//import vn.gt.tichhop.message.TrangThaiBanKhaiNhapCanh;
//import vn.gt.tichhop.message.haiquan2giaothong.NhapCanhHaiQuan2GiaoThongBusiness;
//import vn.gt.tichhop.message.haiquan2giaothong.QuaCanhHaiQuan2GiaoThongBusiness;
//import vn.gt.tichhop.message.haiquan2giaothong.XuatCanhHaiQuan2GiaoThongBusiness;
//import vn.gt.tichhop.report.ReportUtils;
//import vn.gt.utils.FormatData;
//import vn.gt.utils.KeyParams;
//import vn.gt.utils.PageType;
//import vn.gt.utils.document.DocumentStorageImpl;
//import vn.gt.utils.document.ResultUpload;
//
//import com.liferay.portal.kernel.json.JSONArray;
//import com.liferay.portal.kernel.json.JSONFactoryUtil;
//import com.liferay.portal.kernel.json.JSONObject;
//import com.liferay.portal.kernel.log.Log;
//import com.liferay.portal.kernel.log.LogFactoryUtil;
//import com.liferay.portal.kernel.servlet.SessionMessages;
//import com.liferay.portal.kernel.util.Base64;
//import com.liferay.portal.kernel.util.JavaConstants;
//import com.liferay.portal.kernel.util.ParamUtil;
//import com.liferay.portal.kernel.util.StringPool;
//import com.liferay.portal.kernel.util.Validator;
//import com.liferay.portal.kernel.util.WebKeys;
//import com.liferay.portal.theme.ThemeDisplay;
//import com.liferay.portal.util.PortalUtil;
//
///**
// * Portlet implementation class KeHoachAction
// */
//public class KeHoachAction_BAK extends TransportationMVCAction {
//	
//	private Log _log = LogFactoryUtil.getLog(KeHoachAction_BAK.class);
//	
//	public void timKiemKeHoach(ActionRequest resourceRequest, ActionResponse httpReq) {
//
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		
//		String maBanKhai = ParamUtil.getString(resourceRequest, KeyParams.MA_BAN_KHAI).trim();
//		String maritimeCode = ParamUtil.getString(resourceRequest, KeyParams.MARITIME_CODE).trim();
//		String shipName = ParamUtil.getString(resourceRequest, KeyParams.SHIP_NAME).trim();
//		String positionCode = ParamUtil.getString(resourceRequest, KeyParams.POSITION_CODE).trim();
//		String portRegionCode = ParamUtil.getString(resourceRequest, KeyParams.PORT_REGION_CODE).trim();
//		String stateCode = ParamUtil.getString(resourceRequest, KeyParams.STATE_CODE).trim();
//		
//		String shipDateFromStart = ParamUtil.getString(resourceRequest, KeyParams.SHIP_DATE_FROM_START).trim();
//		String shipDateFromEnd = ParamUtil.getString(resourceRequest, KeyParams.SHIP_DATE_FROM_END).trim();
//		
//		String shipDateToStart = ParamUtil.getString(resourceRequest, KeyParams.SHIP_DATE_TO_START).trim();
//		String shipDateToEnd = ParamUtil.getString(resourceRequest, KeyParams.SHIP_DATE_TO_END).trim();
//		
//		String requestState = ParamUtil.getString(resourceRequest, KeyParams.REQUEST_STATUS).trim();
//		String callSign = ParamUtil.getString(resourceRequest, KeyParams.CALL_SIGN).trim();
//		String imo = ParamUtil.getString(resourceRequest, KeyParams.IMO).trim();
//		
//		String ngayLamThuTucFrom = ParamUtil.getString(resourceRequest, "ngayLamThuTucFrom").trim();
//		String ngayLamThuTucTo = ParamUtil.getString(resourceRequest, "ngayLamThuTucTo").trim();
//		
//		httpReq.setRenderParameter("ngayLamThuTucFrom", ngayLamThuTucFrom);
//		httpReq.setRenderParameter("ngayLamThuTucTo", ngayLamThuTucTo);
//		
//		httpReq.setRenderParameter(KeyParams.MA_BAN_KHAI, maBanKhai);
//		httpReq.setRenderParameter(KeyParams.MARITIME_CODE, maritimeCode);
//		httpReq.setRenderParameter(KeyParams.SHIP_NAME, shipName);
//		httpReq.setRenderParameter(KeyParams.POSITION_CODE, positionCode);
//		httpReq.setRenderParameter(KeyParams.PORT_REGION_CODE, portRegionCode);
//		httpReq.setRenderParameter(KeyParams.STATE_CODE, stateCode);
//		
//		httpReq.setRenderParameter(KeyParams.SHIP_DATE_FROM_START, shipDateFromStart);
//		httpReq.setRenderParameter(KeyParams.SHIP_DATE_FROM_END, shipDateFromEnd);
//		
//		httpReq.setRenderParameter(KeyParams.SHIP_DATE_TO_START, shipDateToStart);
//		httpReq.setRenderParameter(KeyParams.SHIP_DATE_TO_END, shipDateToEnd);
//		
//		httpReq.setRenderParameter(KeyParams.REQUEST_STATUS, requestState);
//		
//		httpReq.setRenderParameter(KeyParams.CALL_SIGN, callSign);
//		httpReq.setRenderParameter(KeyParams.IMO, imo);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		
//		String menuSelect = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelect);
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//	
//	public void chuyenGiaoDienLenhDieuDong(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		_log.info("=======chuyenGiaoDienLenhDieuDong==========");
//		
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String suaLenhDieuDong = ParamUtil.getString(resourceRequest, PageType.LAN_SUA_LENH_DIEU_DONG);
//		String capLaiLenhDIeuDong = ParamUtil.getString(resourceRequest, PageType.LAN_CAP_LENH_DIEU_DONG);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		
//		String lydoCapLai = ParamUtil.getString(resourceRequest, "LY_DO_TU_CHOI");
//		
////		String roleType = "";
////		if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
////			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
////		}
//		
//		_log.info("=====SUA=LenhDieuDong===documentName==" + documentName + "==documentYear==" + documentYear + "==messageType==" + messageType
//				+ "==pageType==" + pageType + "==actionType==" + actionType + "==REQUEST_CODE==" + requestCode);
//		
//		// BinhNT Add 2014-12-26
//		updateOrInsertResultNotification(documentName, documentYear, resourceRequest, httpReq);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		
//		httpReq.setRenderParameter(PageType.SUA_LENH_DIEU_DONG, "sualenhdieudong");
//		httpReq.setRenderParameter(PageType.LAN_SUA_LENH_DIEU_DONG, suaLenhDieuDong);
//		httpReq.setRenderParameter(PageType.LAN_CAP_LENH_DIEU_DONG, capLaiLenhDIeuDong);
//		httpReq.setRenderParameter("lyDoCapLaiShifOrder", lydoCapLai);
//		
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//		
//	}
//	
//	public void keHoachNhapCanh(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		
//		_log.info("====nguyen Thai binh=============ke_Hoach_Nhap_Canh=====");
//		
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		
////		String roleType = "";
//		
//		String lanCapLenhDieuDong = ParamUtil.getString(resourceRequest, PageType.LAN_CAP_LENH_DIEU_DONG);
//		
////		if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
////			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
////		}
//		
//		NhapCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new NhapCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyNhapCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				resourceRequest, httpReq);
//		
//		if (lanCapLenhDieuDong.compareTo(KeyParams.N_LAN) == 0 || lanCapLenhDieuDong.compareTo(KeyParams.MOT_LAN) == 0) {
//			IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
//					documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC).get(0);
//			requestCode = shiftOrder.getRequestCode();
//		}
//		
//		_log.info("====nguyen Thai binh===keHoachNhapCanh=====documentName==" + documentName + "==documentYear==" + documentYear + "==messageType=="
//				+ messageType + "==pageType==" + pageType + "==actionType==" + actionType + "==requestCode==" + requestCode);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//	
//	//----------------------------Inland Vao Cang----------------------------
//	public void keHoachVaoCang(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		
//		//TODO minhnd:them moi
////		String redirect = ParamUtil.getString(resourceRequest, WebKeys.REDIRECT);
//		
//		_log.info("===ke_Hoach__vao_cang=====");
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		
//		
//		//boolean flagKeHoachLenhDieuDongInland = false;
//		
////		if(actionType == PageType.ACTION_TYPE_TIEP_NHAN) {
////			System.out.println("=====~~~~Tiep Nhan=== eee");
////			httpReq.setRenderParameter("flagKeHoachLenhDieuDongInland", String.valueOf(flagKeHoachLenhDieuDongInland));
////		} if(actionType == PageType.ACTION_TYPE_SUA_DOI) {
////			System.out.println("=====~~~~SUA DOI=== eee");
////			
////		}
//		
//		_log.info("===keHoachVaoCang -- getUserName----" + getUserName(resourceRequest, httpReq));
//		
////		String roleType = "";
//		
//		String lanCapLenhDieuDong = ParamUtil.getString(resourceRequest, PageType.LAN_CAP_LENH_DIEU_DONG);
//		
////		if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
////			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
////		}
//		
//		NhapCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new NhapCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyNhapCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				resourceRequest, httpReq);
//		
//		if (lanCapLenhDieuDong.compareTo(KeyParams.N_LAN) == 0 || lanCapLenhDieuDong.compareTo(KeyParams.MOT_LAN) == 0) {
//			IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
//					documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC).get(0);
//			requestCode = shiftOrder.getRequestCode();
//		}
//		
//		_log.info("=======keHoachVaoCang=====documentName==" + documentName + "==documentYear==" + documentYear + "==messageType=="
//				+ messageType + "==pageType==" + pageType + "==actionType==" + actionType + "==requestCode==" + requestCode);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//		
//		//TODO minhnd:them moi
////		httpReq.sendRedirect(redirect);
//	}
//	
//	public void keHoachRoiCang(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception { // Inland Vao Cang
//		
//		_log.info("==== Tubq =============ke_hoach__roi_cang=====");
//		
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		
//		//String roleType = "";
//		
//		String lanCapLenhDieuDong = ParamUtil.getString(resourceRequest, PageType.LAN_CAP_LENH_DIEU_DONG);
//		
//		/*if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
//			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
//		}*/		
//		
//		XuatCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new XuatCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyXuatCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq), requestCode, resourceRequest, httpReq);
//		
//		if (lanCapLenhDieuDong.compareTo(KeyParams.N_LAN) == 0 || lanCapLenhDieuDong.compareTo(KeyParams.MOT_LAN) == 0) {
//			IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
//					documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC).get(0);
//			requestCode = shiftOrder.getRequestCode();
//		}
//		
//		_log.info("====Tubq===keHoachVaoCang=====documentName==" + documentName + "==documentYear==" + documentYear + "==messageType=="
//				+ messageType + "==pageType==" + pageType + "==actionType==" + actionType + "==requestCode==" + requestCode);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//	
//	/* chinh 29/12/2015 */
//	
//	public void keHoachNhapCanhKyso(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//
//		_log.info("====chinh=============ke_Hoach_Nhap_Canh ky so=====");
//
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		long fileId = ParamUtil.getLong(resourceRequest, "fileId"); 
//		String successPage = ParamUtil.getString(resourceRequest, "successPage");
//		String lCode = ParamUtil.getString(resourceRequest, "lCode");
//		// String lanCapLenhDieuDong = ParamUtil.getString(resourceRequest,
//		// PageType.LAN_CAP_LENH_DIEU_DONG);
////		String roleType = "";
////		if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
////			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
////		}
//
//		NhapCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new NhapCanhHaiQuan2GiaoThongBusiness();
//		_log.info("actionType*********************"+actionType);
//		if(Validator.isNotNull(successPage) || successPage.length() > 0){
//			messageType = MessageType.LENH_DIEU_DONG;
//		}
//		_log.info("messageType*********************"+messageType);
//		giaoThongBusiness.xuLyNhapCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				resourceRequest, httpReq);
//
//		_log.info("====chinh===keHoachNhapCanh=====documentName==" + documentName + "==documentYear==" + documentYear + "==messageType=="
//				+ messageType + "==pageType==" + pageType + "==actionType==" + actionType + "==requestCode==" + requestCode);
//		//update issue_shiftin_oder kyso
//		//stampstatus = 1
//		//digifile, attachecfile
//		//signname, signTitle, SignPlace.
////		String signName = ParamUtil.getString(resourceRequest, "signName");
////		String signDate = ParamUtil.getString(resourceRequest, "signDate");
////		String signPlace = ParamUtil.getString(resourceRequest, "signPlace");
//		
////		
//		if(Validator.isNotNull(successPage) || successPage.length() > 0){
//			IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCode);
//			TempDocument ettDocument = TempDocumentLocalServiceUtil.fetchByF_B_N_Y_TYPE(documentName, documentYear, lCode);
//			if(Validator.isNotNull(shiftOrder) && !shiftOrder.getVersionNo().equals("1")){
//				//revert infor dong' dau'.
//				ettDocument.setShipDateFrom(shiftOrder.getShiftingDate());
//				ettDocument.setRequestState(TrangThaiBanKhaiNhapCanh.DA_CAP_LENH_DIEU_DONG);
//				ettDocument.setShipPosition(MessageType.SHIP_POSSITION_TRONG_CANG);
//				ettDocument.setDocumentStatusCode(TrangThaiBanKhaiNhapCanh.THU_TUC_DA_TIEP_NHAN);
//				TempDocumentLocalServiceUtil.updateTempDocument(ettDocument);
//			}
//			
//			successPage +="&"+httpReq.getNamespace()+PageType.DOCUMENT_NAME+"="+documentName;
//			successPage +="&"+httpReq.getNamespace()+PageType.DOCUMENT_YEAR+"="+documentYear;
//			successPage +="&"+httpReq.getNamespace()+PageType.MESSAGE_TYPE+"="+messageType;
//			successPage +="&"+httpReq.getNamespace()+PageType.PAGE_TYPE+"="+pageType;
//			successPage +="&"+httpReq.getNamespace()+PageType.REQUEST_CODE+"="+shiftOrder.getRequestCode();
//			successPage +="&"+httpReq.getNamespace()+MenuConstraint.SESSION_MENU_SELECTED+"="+menuSelected;
//			successPage +="&"+httpReq.getNamespace()+PageType.TIEU_DE_BAN_KHAI+"="+tieuDe;
//			httpReq.sendRedirect(successPage);
//		}else{
//			httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//			httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//			httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//			httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//			httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//			httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//			if (menuSelected != null && menuSelected.trim().length() > 0) {
//				httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//			}
//
//			PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//			SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//		}
//		
//	}
//
//	
//	
//	
//	public void keHoachQuaCanhKyso (ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//
//		_log.info("====chinh=============ke_Hoach_qua canh ky so=====");
//
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//
//		
//
//		// String lanCapLenhDieuDong = ParamUtil.getString(resourceRequest,
//		// PageType.LAN_CAP_LENH_DIEU_DONG);
////		String roleType = "";
////		if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
////			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
////		}
//
//		NhapCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new NhapCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyNhapCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				resourceRequest, httpReq);
//
//		_log.info("====chinh===keHoachNhapCanh=====documentName==" + documentName + "==documentYear==" + documentYear + "==messageType=="
//				+ messageType + "==pageType==" + pageType + "==actionType==" + actionType + "==requestCode==" + requestCode);
//
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//	
//	
//	
//	public void keHoachNhapCanhDongDau(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//
//		_log.info("====chinh=============ke_Hoach_Nhap_Canh=dong dau====");
//		
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		String lCode = ParamUtil.getString(resourceRequest, "lCode");
//		long fileId = ParamUtil.getLong(resourceRequest, "fileId");
//		String successPage = ParamUtil.getString(resourceRequest, "successPage");
//		
//		String lanCapLenhDieuDong = ParamUtil.getString(resourceRequest, PageType.LAN_CAP_LENH_DIEU_DONG);
////		String roleType = "";
////		if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
////			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
////		}
//		if(Validator.isNotNull(successPage) || successPage.length() > 0){
//			messageType = MessageType.LENH_DIEU_DONG;
//		}
//		NhapCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new NhapCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyNhapCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				resourceRequest, httpReq);
//
//		if (lanCapLenhDieuDong.compareTo(KeyParams.N_LAN) == 0 || lanCapLenhDieuDong.compareTo(KeyParams.MOT_LAN) == 0) {
//			IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
//					documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC).get(0);
//			requestCode = shiftOrder.getRequestCode();
//		}
//
//		_log.info("==== chinh===keHoachNhapCanh=====documentName==" + documentName + "==documentYear==" + documentYear + "==messageType=="
//				+ messageType + "==pageType==" + pageType + "==actionType==" + actionType + "==requestCode==" + requestCode);
//		
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//		if(Validator.isNotNull(successPage) || successPage.length() > 0){
//			IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCode);
//			successPage +="&"+httpReq.getNamespace()+PageType.DOCUMENT_NAME+"="+documentName;
//			successPage +="&"+httpReq.getNamespace()+PageType.DOCUMENT_YEAR+"="+documentYear;
//			successPage +="&"+httpReq.getNamespace()+PageType.MESSAGE_TYPE+"="+messageType;
//			successPage +="&"+httpReq.getNamespace()+PageType.PAGE_TYPE+"="+pageType;
//			successPage +="&"+httpReq.getNamespace()+PageType.REQUEST_CODE+"="+shiftOrder.getRequestCode();
//			successPage +="&"+httpReq.getNamespace()+MenuConstraint.SESSION_MENU_SELECTED+"="+menuSelected;
//			successPage +="&"+httpReq.getNamespace()+PageType.TIEU_DE_BAN_KHAI+"="+tieuDe;
//			httpReq.sendRedirect(successPage);
//		}else{
//			httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//			httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//			httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//			httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//			httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//			httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//			if (menuSelected != null && menuSelected.trim().length() > 0) {
//				httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//			}
//	
//		}
//	}
//	
//	
//	public void keHoachQuaCanhDongDau(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//
//		_log.info("====chinh=============ke_Hoach_Nhap_Canh=dong dau====");
//
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//
//		String lanCapLenhDieuDong = ParamUtil.getString(resourceRequest, PageType.LAN_CAP_LENH_DIEU_DONG);
//
//		NhapCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new NhapCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyNhapCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				resourceRequest, httpReq);
//
//		if (lanCapLenhDieuDong.compareTo(KeyParams.N_LAN) == 0 || lanCapLenhDieuDong.compareTo(KeyParams.MOT_LAN) == 0) {
//			IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
//					documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC).get(0);
//			requestCode = shiftOrder.getRequestCode();
//		}
//
//		_log.info("==== chinh===keHoach qua canh =====documentName==" + documentName + "==documentYear==" + documentYear + "==messageType=="
//				+ messageType + "==pageType==" + pageType + "==actionType==" + actionType + "==requestCode==" + requestCode);
//
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//	
//	
//	
//	public void keHoachXuatCanh(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		
////		String roleType = "";
////		if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
////			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
////		}
//		
//		XuatCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new XuatCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyXuatCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				requestCode, resourceRequest, httpReq);
//		
//		_log.info("====call keHoachXuatCanh=====documentName==" + documentName);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//	
//	public void keHoachQuaCanh(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//				
//		String lanCapLenhDieuDong = ParamUtil.getString(resourceRequest, PageType.LAN_CAP_LENH_DIEU_DONG);
//		
////		String roleType = "";
////		if (resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE) != null) {
////			roleType = resourceRequest.getPortletSession().getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE).toString();
////		}
//		
//		QuaCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new QuaCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyQuaCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				resourceRequest, httpReq);
//		
//		if (lanCapLenhDieuDong.compareTo(KeyParams.N_LAN) == 0 || lanCapLenhDieuDong.compareTo(KeyParams.MOT_LAN) == 0) {
//			IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
//					documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC).get(0);
//			requestCode = shiftOrder.getRequestCode();
//		}
//		
//		_log.info("====nguyen Thai binh===keHoachQuaCanh=====documentName==" + documentName + "==documentYear==" + documentYear + "==messageType=="
//				+ messageType + "==pageType==" + pageType + "==actionType==" + actionType + "==requestCode==" + requestCode);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.REQUEST_CODE, requestCode);
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//	
//	
//	// Vao cang, Roi cang PTTND
//	public void keHoachPTTNDVaoCang(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		
//		
//		XuatCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new XuatCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyXuatCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				requestCode, resourceRequest, httpReq);
//		
//		_log.info("====call keHoachVaoCangPTTND=====documentName==" + documentName);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//
//	// Vao cang, Roi cang PTTND
//	public void keHoachPTTNDRoiCang(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		
//		long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//		int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);
//		int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
//		String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//		int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//		String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//		String requestCode = ParamUtil.getString(resourceRequest, PageType.REQUEST_CODE);
//		String menuSelected = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		
//	
//		XuatCanhHaiQuan2GiaoThongBusiness giaoThongBusiness = new XuatCanhHaiQuan2GiaoThongBusiness();
//		giaoThongBusiness.xuLyXuatCanhRoleKeHoach(documentName, messageType, documentYear, actionType, getUserName(resourceRequest, httpReq),
//				requestCode, resourceRequest, httpReq);
//		
//		_log.info("====call keHoachRoiCangPTTND=====documentName==" + documentName);
//		
//		httpReq.setRenderParameter(PageType.DOCUMENT_NAME, String.valueOf(documentName));
//		httpReq.setRenderParameter(PageType.MESSAGE_TYPE, String.valueOf(messageType));
//		httpReq.setRenderParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
//		httpReq.setRenderParameter(PageType.PAGE_TYPE, pageType);
//		httpReq.setRenderParameter(PageType.TIEU_DE_BAN_KHAI, tieuDe);
//		if (menuSelected != null && menuSelected.trim().length() > 0) {
//			httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelected);
//		}
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//
//	public void findPortRegionByPortRegionRef(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		
//		String portRegionRef = ParamUtil.getString(resourceRequest, "portRegionRef");
//		
//		// Process Jason feed
//		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
//		JSONArray _name = JSONFactoryUtil.getJSONFactory().createJSONArray();
//		JSONArray _id = JSONFactoryUtil.getJSONFactory().createJSONArray();
//		
//		//
//		List<DmPortRegion> dsPortRegion = DmPortRegionLocalServiceUtil.findPortRegionByPortRegionRef(portRegionRef);
//		if (dsPortRegion == null) {
//			dsPortRegion = new ArrayList<DmPortRegion>();
//		}
//		
//		for (DmPortRegion item : dsPortRegion) {
//			_id.put(item.getPortRegionCode());
//			_name.put(item.getPortRegionName());
//		}
//		
//		jsonFeed.put("id", _id);
//		jsonFeed.put("name", _name);
//		
//		HttpServletResponse resourceResponse = PortalUtil.getHttpServletResponse(httpReq);
//		
//		// resourceRequest.setAttribute("portRegionRef", portRegionRef);
//		
//		resourceResponse.setContentType("application/json");
//		resourceResponse.setCharacterEncoding("UTF-8");
//		resourceResponse.getWriter().write(jsonFeed.toString());
//		resourceResponse.getWriter().close();
//	}
//	
//	public void findPortWhartByPortRegionAndHarbour(ActionRequest resourceRequest, ActionResponse httpReq) throws IOException {
//		
//		String portRegionCode = ParamUtil.getString(resourceRequest, "portRegionCode");
//		
//		if (portRegionCode.length() == 1) {
//			portRegionCode = "00" + portRegionCode;
//		} else if (portRegionCode.length() == 2) {
//			portRegionCode = "0" + portRegionCode;
//		}
//		
//		String portHarbourCode = ParamUtil.getString(resourceRequest, "portHarbourCode");
//		// TODO - dinhminh, Cancel ben cang -> cau cang, chon combo box
// 		_log.info("====portRegionCode=====" + portRegionCode);
//		_log.info("====portHarbourCode====" + portHarbourCode);
//		
//		// Process Jason feed
//		
//		JSONArray array = JSONFactoryUtil.getJSONFactory().createJSONArray();
//		JSONObject obj = null;
//		
//		//
//		//List<DmPortWharf> dsPortWharfs = DmPortWharfLocalServiceUtil.findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(portRegionCode, portHarbourCode, KeyParams.ORDER_BY_ASC);
//		List<DmPortWharf> dsPortWharfs = DmPortWharfLocalServiceUtil.findByPortHarbourCodeOrNull(portHarbourCode, KeyParams.ORDER_BY_ASC);
//		if (dsPortWharfs == null) {
//			dsPortWharfs = new ArrayList<DmPortWharf>();
//		}
//		
//		for (DmPortWharf item : dsPortWharfs) {
//			obj = JSONFactoryUtil.createJSONObject();
//			obj.put("id", item.getPortWharfCode());
//			obj.put("name", item.getPortWharfNameVN() + " - " + item.getPortCode());
//			array.put(obj);
//		}
//		
//		_log.info("==dsPortWharfs==size==" + dsPortWharfs.size());
//		
//		HttpServletResponse resourceResponse = PortalUtil.getHttpServletResponse(httpReq);
//		_log.info("=====array===" + array.toString());
//		// resourceRequest.setAttribute("portRegionRef", portRegionRef);
//		
//		resourceResponse.setContentType("application/json");
//		resourceResponse.setCharacterEncoding("UTF-8");
//		resourceResponse.getWriter().write(array.toString());
//		resourceResponse.getWriter().close();
//	}
//	
//	public void menuKeHoach(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
//		
//		String menuSelect = ParamUtil.getString(resourceRequest, MenuConstraint.SESSION_MENU_SELECTED);
//		httpReq.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, menuSelect);
//		
//		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//	}
//	
//	public static String getUrlFlag(String flagMenu) {
//		if (flagMenu.equalsIgnoreCase(MessageType.LOAT_THU_TUC_NHAP_CANH)) {
//			return "/group/ke-hoach/danh-sach-tau-thuyen-nhap-canh";
//		} else if (flagMenu.equalsIgnoreCase(MessageType.LOAT_THU_TUC_QUA_CANH)) {
//			return "/group/ke-hoach/danh-sach-tau-thuyen-qua-canh";
//		} else if (flagMenu.equalsIgnoreCase(MessageType.LOAT_THU_TUC_XUAT_CANH)) {
//			return "/group/ke-hoach/danh-sach-tau-thuyen-xuat-canh";
//		} else if (flagMenu.equalsIgnoreCase(MessageType.LOAT_THU_TUC_VAO_CANG)) {
//			return "/group/ke-hoach/danh-sach-tau-thuyen-vao-cang";
//		} else if (flagMenu.equalsIgnoreCase(MessageType.LOAT_THU_TUC_ROI_CANG)) {
//			return "/group/ke-hoach/danh-sach-tau-thuyen-roi-cang";
//		} else if (flagMenu.equalsIgnoreCase(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
//			return "/group/ke-hoach/pttnd-vao-cang";
//		} else if (flagMenu.equalsIgnoreCase(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)) {
//			return "/group/ke-hoach/pttnd-roi-cang";
//		} else if (flagMenu.equalsIgnoreCase(MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN)) {
//			return "/group/ke-hoach/lich-su-tau-thuyen-di-chuyen";
//		} 
//		return "";
//	}
//	
//	private void updateOrInsertResultNotification(long documentName, int documentYear, ActionRequest resourceRequest, ActionResponse httpReq) {
//		try {
//			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
//			String userName = themeDisplay.getUser().getEmailAddress();
//			int messageType = MessageType.XAC_BAO_TAU_DEN_CANG;
//			String lyDoTuChoi = ParamUtil.getString(resourceRequest, PageType.LY_DO_TU_CHOI);
//			TempDocument temp = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
//			if (temp != null) {
//				if (temp.getDocumentTypeCode().compareToIgnoreCase(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0) {
//					messageType = MessageType.XAC_BAO_TAU_DEN_CANG;
//				} else if (temp.getDocumentTypeCode().compareToIgnoreCase(MessageType.LOAT_THU_TUC_QUA_CANH) == 0) {
//					messageType = MessageType.XAC_BAO_TAU_QUA_CANH;
//				}
//			}
//			
//			ResultNotification resultNotification = ResultNotificationLocalServiceUtil.findByBusinessTypeCode(messageType, temp.getDocumentName(),
//					temp.getDocumentYear());
//			if (resultNotification == null) {
//				// Them moi.
//				resultNotification = new ResultNotificationImpl();
//				resultNotification.setBusinessTypeCode(messageType);
//				resultNotification.setDivision("System");
//				resultNotification.setDocumentName(temp.getDocumentName());
//				resultNotification.setDocumentYear(temp.getDocumentYear());
//				resultNotification.setLatestDate(FormatData.parseDateToTring(new Date()));
//				resultNotification.setRequestCode(UUID.randomUUID().toString());
//				if (temp != null) {
//					resultNotification.setMaritimeCode(temp.getMaritimeCode());
//				}
//				resultNotification.setRemarks(userName);
//				
//				resultNotification.setRole(2);
//				resultNotification.setResponse(lyDoTuChoi);
//				resultNotification.setRequestState(1);
//				resultNotification.setResponseTime(new Date());
//				resultNotification.setOfficerName(userName);
//				resultNotification.setLatestDate(FormatData.parseDateToTring(new Date()));
//				resultNotification.setIsReply(1);
//				
//				ResultNotificationLocalServiceUtil.addResultNotification(resultNotification);
//			} else {
//				resultNotification.setRole(2);
//				resultNotification.setResponse(lyDoTuChoi);
//				resultNotification.setRequestState(1);
//				if (temp != null) {
//					resultNotification.setMaritimeCode(temp.getMaritimeCode());
//				}
//				resultNotification.setResponseTime(new Date());
//				resultNotification.setOfficerName(userName);
//				resultNotification.setLatestDate(FormatData.parseDateToTring(new Date()));
//				resultNotification.setIsReply(1);
//				
//				ResultNotificationLocalServiceUtil.updateResultNotification(resultNotification);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			_log.error(e);
//		}
//	}
//	
//	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
//		try {
//
//			_log.info("-----------vao ------------serveResource");
//			String type = ParamUtil.getString(resourceRequest, "type");
//			_log.info(" -----------type : " + type);
//			if (type != null && type.trim().equals("getComputerHash")) {
//				getComputerHash(resourceRequest, resourceResponse);
//				_log.info(" -----------	getComputerHash : " + type);
//			} else if (type != null && type.trim().equals("getComputerHashDongDau")) {
//
//				getComputerHashDongDau(resourceRequest, resourceResponse);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			_log.error(e);
//		}
//	}
//
//	public void getComputerHash(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
//		_log.info("-----------vao ------------getComputerHash----------");
//		try {
//			long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//			
////			int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
////			int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
////			String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
//			
//			int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
//			String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//			_log.info("-----------vao ------------getComputerHash documentName :----------" + documentName);
//			String filePath = "";
//			
//			// -- lay repath :
//			filePath = SignatureUtil.makeReportFille(resourceRequest, documentName, tieuDe, actionType);
//			_log.info("-----------vao ------------SignatureUtil.makeReportFille :----------" + filePath);
//			SignatureUtil.genComputerHashByNoiDungHoSo(resourceRequest, resourceResponse, filePath, documentName);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			_log.error(e);
//		}
//	}
//
//	public void signature(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
//		String sign = ParamUtil.getString(actionRequest, "sign");
//		String signFieldName = ParamUtil.getString(actionRequest, "signFieldName");
//		String filePath = ParamUtil.getString(actionRequest, "filePath");
//
//		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
//		_log.info("=====9999999===filePath==99999999===" + filePath);
//
//		_log.info("=====99999999===signFieldName===9999999999==" + signFieldName);
//
//		_log.info("======9999999==sign=9999999999====" + sign);
//		if (Validator.isNotNull(sign) && Validator.isNotNull(filePath)) {
//			byte[] signature = Base64.decode(sign);
//
//			try {
//				ServerSigner signer = new ServerSigner(filePath, null);
//				_log.info("======55555==filePath=5555555====" + filePath);
//				signer.completeSign(signature, signFieldName);
//				_log.info("======77777==signFieldName=77777777777====" + signFieldName);
//
//				String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
//				String fileNameSigned = fileName.substring(0, fileName.indexOf(".pdf")) + ".signed.pdf";
//
//				_log.info("======77777==signFieldName  fileNameSigned=77777777777====" + fileNameSigned);
//
//				filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1) + fileNameSigned;
//				_log.info("======77777==signFieldName  filePath=77777777777====" + filePath);
//
//				DocumentStorageImpl document = new DocumentStorageImpl();
//				long userId = PortalUtil.getUser(actionRequest).getUserId();
//
//				File file = new File(filePath);
//				byte[] readFileToByteArray = FileUtils.readFileToByteArray(file);
//				ResultUpload upload = document.upload(userId, readFileToByteArray, "lenh_dieu_dong_" + System.nanoTime()
//						+ "_Shifting_Order.signed.pdf");
//				_log.info("9999userId000000=======" + userId);
//				_log.info("9999file000000=======" + file);
//				_log.info("--------FILE LUU TRU-------------");
//				_log.info(upload.getUrl());
//				_log.info(upload.getFileId());
//
//				jsonFeed.put("msg", "success");
//				jsonFeed.put("filePath", filePath);
//				jsonFeed.put("fileId", upload.getFileId());
//
//			} catch (Exception e) {
//				_log.info("EXCEPTION::::::::::::" + e);
//				jsonFeed.put("msg", "error");
//			}
//		} else {
//			jsonFeed.put("msg", "error");
//			_log.info("Cannot sign the file: " + filePath);
//		}
//		
//		PortletUtil.writeJSON(actionResponse, jsonFeed);
//	}
//
//	// chinh dong dau
//	
//	public void getComputerHashDongDau(ResourceRequest resourceRequest, ResourceResponse response) throws IOException {
//		try {
//			_log.info("------vao day---getComputerHashDongDau: ");
//			
//			long documentName = ParamUtil.getLong(resourceRequest, PageType.DOCUMENT_NAME);
//			
////			int messageType = ParamUtil.getInteger(resourceRequest, PageType.MESSAGE_TYPE);// type
////			int documentYear = ParamUtil.getInteger(resourceRequest, PageType.DOCUMENT_YEAR);
////			String pageType = ParamUtil.getString(resourceRequest, PageType.PAGE_TYPE);
////			int actionType = ParamUtil.getInteger(resourceRequest, PageType.ACTION_TYPE);
////			String tieuDe = ParamUtil.getString(resourceRequest, PageType.TIEU_DE_BAN_KHAI);
//			
//			String noiDungHoSo = ParamUtil.getString(resourceRequest, "RequestCode");
//			_log.info("---------noiDungHoSo: " + noiDungHoSo);
//			long noiDungHoSoId = ConvertUtil.convertToLong(noiDungHoSo);
//			String realPath = ReportUtils.getTemplateReportFilePath(resourceRequest);
//			String realExportPath = realPath + "export/";
//			String urlFile = null;
//			if (noiDungHoSoId > 1) {
//				urlFile = SignatureUtil.saveAsPdf(realExportPath, noiDungHoSoId);
//			}
//
//			_log.info("---------filePath: " + urlFile);
//			SignatureUtil.genComputerHashByNoiDungHoSoDongDau(resourceRequest, response, urlFile, documentName);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			_log.error(e);
//		}
//	}
//
//	public void signatureDongDau(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
//		String sign = ParamUtil.getString(actionRequest, "sign");
//		String signFieldName = ParamUtil.getString(actionRequest, "signFieldName");
//		String filePath = ParamUtil.getString(actionRequest, "filePath");
//		
//		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
//		_log.info("=====9999999===filePath==99999999===" + filePath);
//
//		_log.info("=====99999999===signFieldName===9999999999==" + signFieldName);
//
//		_log.info("======9999999==sign=9999999999====" + sign);
//		if (Validator.isNotNull(sign) && Validator.isNotNull(filePath)) {
//			byte[] signature = Base64.decode(sign);
//
//			try {
//				ServerSigner signer = new ServerSigner(filePath, null);
//
//				signer.completeSign(signature, signFieldName);
//
//				String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
//				String fileNameSigned = fileName.substring(0, fileName.indexOf(".pdf")) + ".signed.pdf";
//
//				filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1) + fileNameSigned;
//
//				DocumentStorageImpl document = new DocumentStorageImpl();
//				long userId = PortalUtil.getUser(actionRequest).getUserId();
//
//				File file = new File(filePath);
//				byte[] readFileToByteArray = FileUtils.readFileToByteArray(file);
//				ResultUpload upload = document.upload(userId, readFileToByteArray, "vinamarine_shifting_order" + System.nanoTime() + ".signed.pdf");
//				_log.info("9999userId000000=======" + userId);
//				_log.info("9999file000000=======" + file);
//				_log.info("--------FILE LUU TRU-----dong dau--------");
//				_log.info(upload.getUrl());
//				_log.info(upload.getFileId());
//
//				jsonFeed.put("msg", "success");
//				jsonFeed.put("filePath", filePath);
//				jsonFeed.put("fileId", upload.getFileId());
//
//			} catch (Exception e) {
//				_log.info("EXCEPTION::::::::::::" + e);
//				jsonFeed.put("msg", "error");
//			}
//		} else {			
//			jsonFeed.put("msg", "error");
//			_log.info("Cannot sign the file: " + filePath);
//		}
//		
//		PortletUtil.writeJSON(actionResponse, jsonFeed);
//	}
//	
//	public void deleteNewsAndViewDetailsHS(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException{	
//		try {
//			_log.info("============= start deleteNewsAndViewDetailsHS()");
//			String strNotificationId = ParamUtil.getString(actionRequest, "notificationId");
//			String tmpDocName = ParamUtil.getString(actionRequest, String.valueOf(PageType.DOCUMENT_NAME));
//			String tmpDocYear = ParamUtil.getString(actionRequest, String.valueOf(PageType.DOCUMENT_YEAR));
//			String msgType = ParamUtil.getString(actionRequest, PageType.MESSAGE_TYPE);
//			String pageType = ParamUtil.getString(actionRequest, PageType.PAGE_TYPE);
//			String selectedMenu = ParamUtil.getString(actionRequest, MenuConstraint.SESSION_MENU_SELECTED);
//			
//			//Delete tin tuc
//			if(!StringPool.BLANK.equals(strNotificationId)){
//				long notificationId = Long.parseLong(strNotificationId);
//				if(Validator.isNotNull(notificationId)){					
//					_log.info("==================== Xóa bản ghi này... ");
//					//ResultNotificationLocalServiceUtil.deleteResultNotification(notificationId);
//				}
//			}
//
//			
//			//redirect to view details
//			actionResponse.setRenderParameter(String.valueOf(PageType.DOCUMENT_NAME), tmpDocName);
//			actionResponse.setRenderParameter(String.valueOf(PageType.DOCUMENT_YEAR), tmpDocYear);
//			actionResponse.setRenderParameter(PageType.MESSAGE_TYPE, msgType);
//			actionResponse.setRenderParameter(PageType.PAGE_TYPE, pageType);
//			actionResponse.setRenderParameter(MenuConstraint.SESSION_MENU_SELECTED, selectedMenu);
//			actionResponse.setRenderParameter("jspPage", "/html/kehoach/view.jsp");
//			
//
//			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
//			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			_log.error(e);
//		}		
//	}
//}
