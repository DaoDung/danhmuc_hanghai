package vn.gt.portlet.kehoach.nghiepvu.bankhai;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil;
import vn.gt.dao.result.model.ResultCompetion;
import vn.gt.dao.result.model.ResultDeclaration;
import vn.gt.dao.result.model.impl.ResultCompetionImpl;
import vn.gt.dao.result.service.ResultCompetionLocalServiceUtil;
import vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil;
import vn.gt.portlet.kehoach.tt1.TT1JSONProvider;
import vn.gt.portlet.kehoach.tt1.TT1TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt1.TT1XuLyNghiepVuUtils;
import vn.gt.portlet.kehoach.tt10.TT10TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt11.TT11TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt16.TT16TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt17.TT17TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt2.TT2TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt3.TT3TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt4.TT4TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt5.TT5TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt6.TT6TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt7.TT7TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt8.TT8TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt9.TT9TichHopMessageUtils;
import vn.gt.portlet.kehoach.utils.ChuyenDichTrangThaiUtils;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.tichhop.message.MessageType;
import vn.gt.tichhop.message.TrangThaiBanKhaiNhapCanh;
import vn.gt.utils.FormatData;

public class BanKhaiKetQuaPheDuyetHoSoUtils {

	private static Log _log = LogFactoryUtil.getLog(TT1JSONProvider.class);

	private static String checkDisplayIcon(long documentName, int documentYear, int businessTypeCode) {
		List<ResultDeclaration> lstResult = ResultDeclarationLocalServiceUtil
				.findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode, documentName, documentYear);
		int state = 0;
		if (lstResult != null && lstResult.size() > 0) {
			state = lstResult.get(0).getRequestState();
			// if (state == MessageType.TRANG_THAI_BANG_KHAI_TIEP_NHAN
			// || state == MessageType.TRANG_THAI_BANG_KHAI_DOI_CHIEU) {
			// return "icon_tich.png";
			// } else if (state == MessageType.TRANG_THAI_BANG_KHAI_TU_CHOI) {
			// return "close.png";
			// }
		}

		return "";
	}

	public static JSONObject buildThanhPhan(ThemeDisplay themeDisplay, long documentName, int documentYear) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		TempNoTiceShipMessage results = TempNoTiceShipMessageLocalServiceUtil
				.getXacBaoLastByDocumentNameAndDocumentYear(documentName, documentYear);

		result.put("code", "NC_23");
		result.put("name", LanguageUtil.get(themeDisplay.getLocale(), "ket-qua-phe-duyet-ho-so"));
		boolean available = false;
		String requestCode = StringPool.BLANK;
		if (Validator.isNotNull(results)) {
			available = true;
			requestCode = results.getRequestCode();
		}
		result.put("available", available);
		result.put("documentName", documentName);
		result.put("documentYear", documentYear);
		result.put("messageType", MessageType.XAC_NHAN_HOAN_THANH_THU_TUC);
		result.put("requestCode", requestCode);

		String icon = checkDisplayIcon(documentName, documentYear, MessageType.XAC_NHAN_HOAN_THANH_THU_TUC);

		result.put("state", -1);
		if (icon.equals("icon_tich.png")) {
			result.put("state", 1);
		} else if (icon.equals("close.png")) {
			result.put("state", 0);
		}

		return result;
	}

	public int _xacNhanHoanThanhThuTuc(String requestCode, long documentName, int documentYear, int messageType,
			int desStatus, User user, UploadPortletRequest uploadPortletRequest, ActionRequest actionRequest) {

		int result = TT1XuLyNghiepVuUtils.XU_LY_THAT_BAI;

		try {

			String yKienReject = ParamUtil.getString(uploadPortletRequest, "ykienReject");

			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			if (desStatus == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				xacNhanHoanThanhThuTucUpgrade(uploadPortletRequest, tempDocument.getDocumentName(),
						tempDocument.getDocumentYear());
				// Tich hop send message 99-23
				if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("NC")) {
					boolean resultMethod = TT1TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("XC")) {
					boolean resultMethod = TT2TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					boolean resultMethod = TT16TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
					boolean resultMethod = TT17TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					boolean resultMethod = TT6TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					boolean resultMethod = TT8TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
					boolean resultMethod = TT7TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
					boolean resultMethod = TT9TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					boolean resultMethod = TT10TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
					boolean resultMethod = TT11TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					boolean resultMethod = TT4TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
					boolean resultMethod = TT5TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					boolean resultMethod = TT3TichHopMessageUtils.message_99_23(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				}
			} else if (desStatus == ChuyenDichTrangThaiUtils.THU_TUC_DE_NGHI_CAP_GIAY_PHEP) {
				xacNhanHoanThanhThuTucUpgrade(uploadPortletRequest, tempDocument.getDocumentName(),
						tempDocument.getDocumentYear());
				// TODO send message
				
			} else if (desStatus == ChuyenDichTrangThaiUtils.THU_TUC_HUY_THU_TUC) {
				xacNhanHoanThanhThuTucTruongHopHuyUpgrade(uploadPortletRequest, tempDocument.getDocumentName(),
						tempDocument.getDocumentYear());
				// Tich hop send message 99-24
				if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("NC")) {
					boolean resultMethod = TT1TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("XC")) {
					boolean resultMethod = TT2TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					boolean resultMethod = TT16TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
					boolean resultMethod = TT17TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					boolean resultMethod = TT6TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					boolean resultMethod = TT8TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
					boolean resultMethod = TT7TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
					boolean resultMethod = TT9TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					boolean resultMethod = TT10TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
					boolean resultMethod = TT11TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					boolean resultMethod = TT4TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
					boolean resultMethod = TT5TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					boolean resultMethod = TT3TichHopMessageUtils.message_99_24(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject);
				}
			}

			if (tempDocument != null) {
				tempDocument.setDocumentStatusCode(desStatus);
				TempDocumentLocalServiceUtil.updateTempDocument(tempDocument);
				result = desStatus;
			}
			
		} catch (Exception e) {
			_log.error(e);
			result = TT1XuLyNghiepVuUtils.XU_LY_THAT_BAI;
		}

		return result;
	}

	private static void xacNhanHoanThanhThuTucUpgrade(UploadPortletRequest resourceRequest, long documentName,
			int documentYear) {
		try {
			String certificateNo = ParamUtil.getString(resourceRequest, "soChungNhan");
			Date approvalTime = ParamUtil.getDate(resourceRequest, "ngayPheDuyet", FormatData.formatDateShortZone);

			TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
			
			String maritimeReference = StringPool.BLANK;
			String portOfArrivalCode = StringPool.BLANK;
			
			if (Validator.isNotNull(tempDocument.getMaritimeCode())) {
				DmMaritime dmMaritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(tempDocument.getMaritimeCode());
				portOfArrivalCode = Validator.isNotNull(dmMaritime) ? dmMaritime.getMaritimeCode() : StringPool.BLANK;
				maritimeReference = Validator.isNotNull(dmMaritime) ? dmMaritime.getMaritimeReference() : StringPool.BLANK;
			}
			
			ResultCompetion reCompetion = ResultCompetionLocalServiceUtil
					.findByDocumentNameAndDocumentYear(documentName, documentYear);
			if (reCompetion == null) {
				reCompetion = new ResultCompetionImpl();
				reCompetion.setMaritimeCode(tempDocument.getMaritimeCode());
				reCompetion.setNameOfShip(tempDocument.getShipName());
				reCompetion.setNameOfMaster(tempDocument.getShipCaptain());
				reCompetion.setPortOfArrivalCode(portOfArrivalCode);
				reCompetion.setCertificateNo(certificateNo.trim() + "/" + maritimeReference.trim());
//				reCompetion.setFlagStateOfShip(flagStateOfShip);
//				reCompetion.setGrossTonnage(grossTonnage);
				reCompetion.setApprovalName(PortalUtil.getUser(resourceRequest).getEmailAddress());

				reCompetion.setRequestState(TrangThaiBanKhaiNhapCanh.PHE_DUYET_HOAN_THANH_THU_TUC);
				reCompetion.setResponseStatusCVHH(MessageType.DA_PHE_DUYET);

				reCompetion.setApprovalTime(approvalTime);
				reCompetion.setResponseTimeCVHH(approvalTime);
				reCompetion.setResponseCVHH(BusinessUtils
						.getRemarkPheDuyetTB(PortalUtil.getUser(resourceRequest).getEmailAddress(), approvalTime));
//				reCompetion.setCertificateNo(certificateNo);
				reCompetion.setDocumentName(documentName);
				reCompetion.setDocumentYear(documentYear);
				reCompetion.setRequestCode(UUID.randomUUID().toString());

				ResultCompetionLocalServiceUtil.addResultCompetion(reCompetion);
			} else {
				reCompetion.setMaritimeCode(tempDocument.getMaritimeCode());
				reCompetion.setNameOfShip(tempDocument.getShipName());
				reCompetion.setNameOfMaster(tempDocument.getShipCaptain());
				reCompetion.setPortOfArrivalCode(portOfArrivalCode);
				reCompetion.setCertificateNo(certificateNo.trim() + "/" + maritimeReference.trim());
//				reCompetion.setFlagStateOfShip(flagStateOfShip);
//				reCompetion.setGrossTonnage(grossTonnage);
				reCompetion.setApprovalName(PortalUtil.getUser(resourceRequest).getEmailAddress());

				reCompetion.setRequestState(TrangThaiBanKhaiNhapCanh.PHE_DUYET_HOAN_THANH_THU_TUC);
				reCompetion.setResponseStatusCVHH(MessageType.DA_PHE_DUYET);
				reCompetion.setApprovalTime(approvalTime);
				reCompetion.setResponseTimeCVHH(approvalTime);
				reCompetion.setResponseCVHH(BusinessUtils
						.getRemarkPheDuyetTB(PortalUtil.getUser(resourceRequest).getEmailAddress(), approvalTime));

//				reCompetion.setCertificateNo(certificateNo);
				ResultCompetionLocalServiceUtil.updateResultCompetion(reCompetion);
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}

	private static void xacNhanHoanThanhThuTucTruongHopHuyUpgrade(UploadPortletRequest resourceRequest,
			long documentName, int documentYear) {
		ResultCompetion reCompetion = null;
		reCompetion = ResultCompetionLocalServiceUtil.findByDocumentNameAndDocumentYear(documentName, documentYear);
		String maritimeCode = ParamUtil.getString(resourceRequest, "maritimeCode");
		String nameOfShip = ParamUtil.getString(resourceRequest, "nameOfShip");
		String nameOfMaster = ParamUtil.getString(resourceRequest, "nameOfMaster");
		String portOfArrivalCode = ParamUtil.getString(resourceRequest, "portOfArrivalCode");
		String certificateNo = ParamUtil.getString(resourceRequest, "certificateNo");
		String maritimeReference = ParamUtil.getString(resourceRequest, "maritimeReference");
		String flagStateOfShip = ParamUtil.getString(resourceRequest, "flagStateOfShip");
		double grossTonnage = ParamUtil.getDouble(resourceRequest, "grossTonnage");
		Date approvalTime = ParamUtil.getDate(resourceRequest, "approvalTime", FormatData.formatDateShort3);
		String approvalName = ParamUtil.getString(resourceRequest, "approvalName");

		try {
			if (reCompetion == null) {
				reCompetion = new ResultCompetionImpl();
				reCompetion.setMaritimeCode(maritimeCode);
				reCompetion.setNameOfShip(nameOfShip);
				reCompetion.setNameOfMaster(nameOfMaster);
				reCompetion.setPortOfArrivalCode(portOfArrivalCode);
				reCompetion.setCertificateNo(certificateNo.trim() + "/" + maritimeReference.trim());
				reCompetion.setFlagStateOfShip(flagStateOfShip);
				reCompetion.setGrossTonnage(grossTonnage);
				reCompetion.setApprovalTime(approvalTime);
				reCompetion.setApprovalName(approvalName);

				reCompetion.setRequestState(TrangThaiBanKhaiNhapCanh.HUY_THU_TUC_TAU_THUYEN_NHAP_CANH);
				reCompetion.setResponseStatusCVHH(MessageType.TU_CHOI);
				reCompetion.setResponseTimeCVHH(approvalTime);
				reCompetion.setResponseCVHH(BusinessUtils.getRemarkTuChoiTB(
						PortalUtil.getUser(resourceRequest).getEmailAddress(), "Huy ho so", approvalTime));

				reCompetion.setDocumentName(documentName);
				reCompetion.setDocumentYear(documentYear);
				reCompetion.setRequestCode(UUID.randomUUID().toString());

				ResultCompetionLocalServiceUtil.addResultCompetion(reCompetion);
			} else {
				reCompetion.setMaritimeCode(maritimeCode);
				reCompetion.setNameOfShip(nameOfShip);
				reCompetion.setNameOfMaster(nameOfMaster);
				reCompetion.setPortOfArrivalCode(portOfArrivalCode);
				reCompetion.setCertificateNo(certificateNo.trim() + "/" + maritimeReference.trim());
				reCompetion.setFlagStateOfShip(flagStateOfShip);
				reCompetion.setGrossTonnage(grossTonnage);
				reCompetion.setApprovalTime(approvalTime);
				reCompetion.setApprovalName(approvalName);

				reCompetion.setRequestState(TrangThaiBanKhaiNhapCanh.HUY_THU_TUC_TAU_THUYEN_NHAP_CANH);
				reCompetion.setResponseStatusCVHH(MessageType.TU_CHOI);
				reCompetion.setResponseTimeCVHH(approvalTime);
				reCompetion.setResponseCVHH(BusinessUtils.getRemarkTuChoiTB(
						PortalUtil.getUser(resourceRequest).getEmailAddress(), "Huy ho so", approvalTime));

				ResultCompetionLocalServiceUtil.updateResultCompetion(reCompetion);
			}
		} catch (Exception e) {
			_log.error(e);
		}

	}

}
