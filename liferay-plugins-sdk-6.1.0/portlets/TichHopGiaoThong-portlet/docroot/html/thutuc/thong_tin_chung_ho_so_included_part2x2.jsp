<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.util.Map"%>
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
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8"%>

<%
	String documentName = renderRequest.getParameter(PageType.DOCUMENT_NAME);
	String messageType = renderRequest.getParameter(PageType.MESSAGE_TYPE);
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
	String requestCodethuTuc = (String)request.getAttribute("requestCodethuTuc");	
	int resultT = FormatData.convertToInt((String)request.getAttribute("resultT"));
	String loaiThuTuc = (String)request.getAttribute("loaiThuTuc");
	String loaiThongTinChung = (String)request.getAttribute("loaiThongTinChung");
	String newValue = (String)request.getAttribute("newValue");
	String lCode = (String)request.getAttribute("lCode");
	String reTurnHomeURL = (String)request.getAttribute("reTurnHomeURL");
	String pageType = (String)request.getAttribute("pageType");
	String tieuDeBanKhai = (String)request.getAttribute("resultT");
	boolean rolevanthu = GetterUtil.getBoolean(request.getAttribute("rolevanthu"));
	boolean rolequantri = GetterUtil.getBoolean(request.getAttribute("rolequantri"));
	boolean rolelanhdao = GetterUtil.getBoolean(request.getAttribute("rolelanhdao"));
	
	TempDocument temp = null;
	List<TempDocument> liTempDocuments1 = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (liTempDocuments1 != null && liTempDocuments1.size() > 0) {
		temp = liTempDocuments1.get(0);
	}
	
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
		
		actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanhKysoLanhDao"); // SonVH sua thuTucNhapCanhKyso
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
		actionUrlChoLanhDaoDuyet.setParameter(PageType.MESSAGE_TYPE, messageType);
		actionUrlChuyenTraHoSo.setParameter(PageType.MESSAGE_TYPE, messageType);
		actionUrlYeuCauBoSungHoSo.setParameter(PageType.MESSAGE_TYPE, messageType);		
		actionUrlNotifySuaDoiBoXung.setParameter(PageType.MESSAGE_TYPE, messageType);		
		actionUrlChuyenGiaoDien.setParameter(PageType.MESSAGE_TYPE, messageType);
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
	//actionUrlYeuCauXuatTrinh.setParameter(PageType.BTN_ACTION_TYPE, String.valueOf(PageType.YEUCAU_ACTION_TYPE));
	actionUrlYeuCauXuatTrinh.setParameter("BTN_ACTION_TYPE", String.valueOf(1));
	actionUrlYeuCauXuatTrinh.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
	actionUrlYeuCauXuatTrinh.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	
	actionUrlChapNhanGiayTo.setParameter(PageType.DOCUMENT_NAME, documentName);
	actionUrlChapNhanGiayTo.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
	actionUrlChapNhanGiayTo.setParameter(PageType.PAGE_TYPE, pageType);
	actionUrlChapNhanGiayTo.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
	actionUrlChapNhanGiayTo.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));
	//actionUrlChapNhanGiayTo.setParameter(PageType.BTN_ACTION_TYPE, String.valueOf(PageType.CHAPNHAN_ACTION_TYPE));
	actionUrlChapNhanGiayTo.setParameter("BTN_ACTION_TYPE", String.valueOf(2));
	actionUrlChapNhanGiayTo.setParameter(PageType.REQUEST_CODE, requestCodethuTuc);
	actionUrlChapNhanGiayTo.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	
	actionUrlTuChoiGiayTo.setParameter(PageType.DOCUMENT_NAME, documentName);
	actionUrlTuChoiGiayTo.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
	actionUrlTuChoiGiayTo.setParameter(PageType.PAGE_TYPE, pageType);
	actionUrlTuChoiGiayTo.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
	actionUrlTuChoiGiayTo.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));
	//actionUrlTuChoiGiayTo.setParameter(PageType.BTN_ACTION_TYPE, String.valueOf(PageType.TUCHOI_ACTION_TYPE));
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
		actionUrlKyso.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_KYSO)); // actionUrlKyso cho Lenh dieu dong (tuong tu ke hoach)
	}
	actionUrlKyso.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodethuTuc, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
	actionUrlKyso.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
	
	actionUrlDongDau.setParameter(PageType.DOCUMENT_NAME, documentName);
	actionUrlDongDau.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
	actionUrlDongDau.setParameter(PageType.PAGE_TYPE, pageType);
	actionUrlDongDau.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
	actionUrlDongDau.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_DONGDAUDUYET));
	if (messageType.compareTo(String.valueOf(MessageType.LENH_DIEU_DONG)) == 0){		
		actionUrlDongDau.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_DONGDAU)); // actionUrlDongDau cho Lenh dieu dong (tuong tu ke hoach)
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
%>

	<%
	LogFactoryUtil.getLog(ThuTucAction.class).info("===resultT===CheckBusinessUtil======" + resultT);
	 if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI) {
			//giay phep roi cang
			List<IssuePortClearance> liIssuePortClearances = new ArrayList <IssuePortClearance>() ; 
			liIssuePortClearances = IssuePortClearanceLocalServiceUtil.findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
					FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);       
			//giay phep qua canh
			IssuePermissionForTransit issueIssuePermissionForTransits = IssuePermissionForTransitLocalServiceUtil.findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
					FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);		
			//giay phep vao cang				
			List<IssueAcceptance> liIssueAcceptances =  new ArrayList <IssueAcceptance>() ;
			liIssueAcceptances = IssueAcceptanceLocalServiceUtil.findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(
					FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);
			
						if ((liIssuePortClearances != null && liIssuePortClearances.size() > 0)
								|| (liIssueAcceptances != null && liIssueAcceptances.size() > 0)
								|| issueIssuePermissionForTransits != null) {							
							//hien thi giao dien gom nut duyet va sua
							if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0
							|| messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0) {								
								actionUrlChuyenGiaoDien.setParameter(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE, KeyParams.CAP_NHAP_PORTCLEAN_LAN_MOT);								
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====717====thong_tin_chung_ho_so.jsp==Duyệt, Sửa giấy phép rời cảng-lan dau");								
								%>
								<div id="duyetkylenhdieudong1">
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép rời cảng</button>
								<%				
								 if (rolequantri && rolelanhdao && (!rolevanthu) ) {
								%>
								<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
								<%    } else { %>               
								<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>					
               					<%    }  %>								
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép rời cảng</button>
								</div>
								<%
							} else if (messageType.compareTo(String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)) == 0 ) {								
								actionUrlChuyenGiaoDien.setParameter(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_ISSUE_ACCEPTANCE, KeyParams.CAP_NHAP_ACCEPTANCE_LAN_MOT);								
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====717====thong_tin_chung_ho_so.jsp==Duyệt, Sửa giấy phép vào cảng-lan dau");								
								%>
								<div id="duyetkylenhdieudong1">
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép vào cảng</button>
									<%
									if (rolequantri && rolelanhdao && (!rolevanthu) ) {
									%>
									<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
									<%    } else { %>	   
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>            					
	               					<%    }  %>									
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép vào cảng</button>
								</div>
								<%
							}else if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_QUA_CANH)) == 0) {										
								actionUrlChuyenGiaoDien.setParameter(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PERMISSION_FOR_TRANSIT, KeyParams.CAP_NHAP_PERFORTRANSIT_LAN_MOT);										
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====731====thong_tin_chung_ho_so.jsp==Duyệt, Sửa giấy phép quá cảnh-lan dau");								
								%>
								<div id="duyetkylenhdieudong1">
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép quá cảnh</button>
									<%				
									if (rolequantri && rolelanhdao && (!rolevanthu) ) {
									%>
									<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
									<%    } else { %>	           
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>    					
	               					<%    }  %>									
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép quá cảnh</button>
								</div>
								<%
							}
						} else {
							if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0
									|| messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0) {								
								actionUrlTiepNHan.setParameter(PageType.LAN_CAP_PORT_CLEARANCE, KeyParams.MOT_LAN);								
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====734====thong_tin_chung_ho_so.jsp==Cấp giấy phép rời cảng-lần đầu tiên");
								%>
								<button class="bt" type="button"  onclick="if(validatorGiayPhepRoiCang()) summitForm('<%=actionUrlTiepNHan.toString()%>')"><i class="tiepnhan"></i>Cấp giấy phép rời cảng</button>
								<%
							} else if (messageType.compareTo(String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)) == 0) {								
								actionUrlTiepNHan.setParameter(PageType.LAN_CAP_ISSUE_ACCEPTANCE, KeyParams.MOT_LAN);								
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====734====thong_tin_chung_ho_so.jsp==Cấp giấy phép vào cảng-lần đầu tiên");
								%>
								<button class="bt" type="button"  onclick="if(validatorGiayPhepVaoCang()) summitForm('<%=actionUrlTiepNHan.toString()%>')"><i class="tiepnhan"></i>Cấp giấy phép vào cảng</button>
								<%
							} else if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_QUA_CANH)) == 0) {										
								actionUrlTiepNHan.setParameter(PageType.LAN_CAP_PERMISSION_FOR_TRANSIT, KeyParams.MOT_LAN);
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====741====thong_tin_chung_ho_so.jsp==Cấp giấy phép quá cảnh-lần đầu tiên");
								%>
								<button class="bt" type="button"  onclick="if(validatorGiayPhepQuaCanh()) summitForm('<%=actionUrlTiepNHan.toString()%>')"><i class="tiepnhan"></i>Cấp giấy phép quá cảnh</button>
								<%
							}
						}
					} else if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_LAI) {
							//hien thi giao dien gom nut duyet va sua
							if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0
							|| messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0) {								
								actionUrlChuyenGiaoDien.setParameter(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE, KeyParams.CAP_NHAP_PORTCLEAN_LAN_MOT);								
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====752====thong_tin_chung_ho_so.jsp==Duyệt, Sửa giấy phép rời cảng-1 lan");								
								%>
								<div id="duyetkylenhdieudong1">
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép rời cảng</button>
									<%
									if (rolequantri && rolelanhdao && (!rolevanthu) ) {
									%>
									<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
									<%    } else { %>	
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>               					
	               					<%    }  %>									
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép rời cảng</button>
								</div>
								<%
							} else if (messageType.compareTo(String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)) == 0) {								
								actionUrlChuyenGiaoDien.setParameter(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_ISSUE_ACCEPTANCE, KeyParams.CAP_NHAP_ACCEPTANCE_LAN_MOT);								
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====752====thong_tin_chung_ho_so.jsp==Duyệt, Sửa giấy phép vao cảng-1 lan");								
								%>
								<div id="duyetkylenhdieudong1">
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép vào cảng</button>
									<%				
									if (rolequantri && rolelanhdao && (!rolevanthu) ) {
									%>
									<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
									<%    } else { %>	
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>               					
	               					<%    }  %>									
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép vào cảng</button>
								</div>
								<%
							} else if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_QUA_CANH)) == 0) {
								
								actionUrlChuyenGiaoDien.setParameter(PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PERMISSION_FOR_TRANSIT, KeyParams.CAP_NHAP_PERFORTRANSIT_LAN_MOT);
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====779====thong_tin_chung_ho_so.jsp==Duyệt giấy phép quá cảnh-1 lan");
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====780====thong_tin_chung_ho_so.jsp==Sửa giấy phép quá cảnh-1 lan");
								%>
								<div id="duyetkylenhdieudong1">
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép quá cảnh</button>
									<%
									if (rolequantri && rolelanhdao && (!rolevanthu) ) {
									%>
									<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
									<%    } else { %>      
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>         					
	               					<%    }  %>									
									<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép quá cảnh</button>
								</div>
								<%
							}
					} else if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_LAI_LAN_THU_N) {
							//hien thi nut duyet va sua, sau khi PortClean.getRequestState() != 4, dang la ban khai moi nhat
							if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0
									|| messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)) == 0) {								
								actionUrlChuyenGiaoDien.setParameter(
									PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PORT_CLEARANCE_LAN_THU_N, KeyParams.CAP_NHAP_PORTCLEAN_LAN_N);
								actionUrlChuyenGiaoDien.setParameter(PageType.LAN_SUA_PORT_CLEARANCE, KeyParams.N_LAN);								
								LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====848====thong_tin_chung_ho_so.jsp==Duyệt, Sửa giấy phép rời cảng-n");								
							%>
							<div id="duyetkylenhdieudong1">
							<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép rời cảng</button>
									<%				
									if (rolequantri && rolelanhdao && (!rolevanthu) ) {
									%>
									<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
									<%    } else { %>
	               					<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>
	               					<%    }  %>
							
							<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép rời cảng</button>
							</div>
				<%
					} else if (messageType.compareTo(String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)) == 0) {									
						actionUrlChuyenGiaoDien.setParameter(
							PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_ISSUE_ACCEPTANCE_LAN_THU_N, KeyParams.CAP_NHAP_ACCEPTANCE_LAN_N);
						actionUrlChuyenGiaoDien.setParameter(PageType.LAN_SUA_ISSUE_ACCEPTANCE, KeyParams.N_LAN);									
						LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====848====thong_tin_chung_ho_so.jsp==Duyệt, Sửa giấy phép vào cảng-n");									
					%>
					<div id="duyetkylenhdieudong1">
					<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép vào cảng</button>
					<%
					if (rolequantri && rolelanhdao && (!rolevanthu) ) {
					%>
					<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
					<%    } else { %>
            		<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>			
            					<%    }  %>
					
					<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép vào cảng</button>
					</div>
					<%    } else if (messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_QUA_CANH)) == 0) {											
					actionUrlChuyenGiaoDien.setParameter(
						PageType.CHUYEN_GIAO_DIEN_CAP_NHAP_PERMISSION_FOR_TRANSIT_LAN_THU_N, KeyParams.CAP_NHAP_PERFORTRANSIT_LAN_N);
					actionUrlChuyenGiaoDien.setParameter(PageType.LAN_SUA_PERMISSION_FOR_TRANSIT, KeyParams.N_LAN);								
					LogFactoryUtil.getLog(ThuTucAction.class).info("==THUC TUC====863====thong_tin_chung_ho_so.jsp==Duyệt, Sửa giấy phép quá cảnh-n lan");								
					%>
					<div id="duyetkylenhdieudong1">
					<button class="bt" type="button"  onclick="summitForm('<%=actionUrlDuyet.toString()%>')"><i class="tiepnhan"></i>Duyệt giấy phép quá cảnh</button>
					<%				
					if (rolequantri && rolelanhdao && (!rolevanthu) ) {
					%>
					<button class="bt" type="button" id="showdatakyso1" > <i class="tiepnhan"></i>Ký số BCY</button>
					<%    } else { %>
	        		<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>
	        		<%    }  %>
					
					<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString()%>')"><i class="tiepnhan"></i>Sửa giấy phép quá cảnh</button>
					</div>
					<%	}	
                } 
			%>     