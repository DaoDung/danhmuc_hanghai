package vn.gt.portlet.kehoach.nghiepvu.bankhai;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;

import vn.gt.dao.danhmucgt.service.DmGTFunctionTypeLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.InterfaceRequest;
import vn.gt.dao.noticeandmessage.model.InterfaceRequestField;
import vn.gt.dao.noticeandmessage.model.IssueShiftingOrder;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestFieldLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.result.model.ResultNotification;
import vn.gt.dao.result.model.impl.ResultNotificationImpl;
import vn.gt.dao.result.service.ResultNotificationLocalServiceUtil;
import vn.gt.portlet.kehoach.tt1.TT1JSONProvider;
import vn.gt.portlet.kehoach.tt1.TT1TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt1.TT1XuLyNghiepVuUtils;
import vn.gt.portlet.kehoach.tt10.TT10TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt16.TT16TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt3.TT3TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt4.TT4TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt6.TT6TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt8.TT8TichHopMessageUtils;
import vn.gt.portlet.kehoach.utils.ChuyenDichTrangThaiUtils;
import vn.gt.portlet.kehoach.utils.FileUploadUtil;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.tichhop.message.MessageType;
import vn.gt.tichhop.message.TrangThaiBanKhai;
import vn.gt.tichhop.message.TrangThaiBanKhaiNhapCanh;
import vn.gt.tichhop.report.FileUploadUtils;
import vn.gt.tichhop.report.ReportConstant;
import vn.gt.tichhop.report.ReportsBusinessUtils;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.gt.utils.KeyParams;
import vn.gt.utils.PageType;

public class BanKhaiLenhDieuDongUtils {

	private String realPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString();

	private String pathFileSub = realPath.substring(realPath.lastIndexOf(":"), realPath.lastIndexOf("/WEB-INF"))
			.replaceFirst(":", "") + "/export/";

	private static Log _log = LogFactoryUtil.getLog(TT1JSONProvider.class);

	private static String checkDisplayIcon(int state) {
		String result = "";
		if (state == TrangThaiBanKhaiNhapCanh.CHAP_NHAN_BAN_KHAI || state == TrangThaiBanKhaiNhapCanh.SUA_DOI_BO_XUNG) {
			result = "icon_tich.png";
		} else if (state == TrangThaiBanKhaiNhapCanh.KHAI_HUY) {
			result = "close.png";
		}
		return result;
	}

	public static JSONObject buildThanhPhan(ThemeDisplay themeDisplay, long documentName, int documentYear) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		List<IssueShiftingOrder> results = new ArrayList<IssueShiftingOrder>(
				IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
						documentYear, KeyParams.ID, KeyParams.ORDER_BY_DESC));

		result.put("code", "lenh_dieu_dong");
		result.put("name", LanguageUtil.get(themeDisplay.getLocale(), "lenh-dieu-dong"));
		boolean available = false;
		String requestCode = StringPool.BLANK;
		String icon = StringPool.BLANK;
		if (Validator.isNotNull(results) && results.size() > 0) {
			available = true;
			requestCode = results.get(0).getRequestCode();
			icon = checkDisplayIcon(results.get(0).getRequestState());
		}
		result.put("available", available);
		result.put("documentName", documentName);
		result.put("documentYear", documentYear);
		result.put("messageType", MessageType.LENH_DIEU_DONG);
		result.put("requestCode", requestCode);

		result.put("state", -1);
		if (icon.equals("icon_tich.png")) {
			result.put("state", 1);
		} else if (icon.equals("close.png")) {
			result.put("state", 0);
		}

		return result;
	}

	public static JSONArray getFileThanhPhanVersionList(ThemeDisplay themeDisplay, long documentName, int documentYear,
			int messageType) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject object;

		InterfaceRequestField interfaceRequest = null;
		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName,
				documentYear);
		List<IssueShiftingOrder> results = IssueShiftingOrderLocalServiceUtil
				.findByDocumentYearAndDocumentYearOrderByColumn(documentName, documentYear, KeyParams.ID,
						KeyParams.ORDER_BY_DESC);

		for (int i = 0; i < results.size(); i++) {
			interfaceRequest = InterfaceRequestFieldLocalServiceUtil.getByRequestCode(results.get(i).getRequestCode());

			if (interfaceRequest == null) {
				interfaceRequest = InterfaceRequestFieldLocalServiceUtil
						.getByRequestCode(tempDocument.getRequestCode());
				interfaceRequest.setRemarks("");
			}
			object = JSONFactoryUtil.createJSONObject();
			if (Validator.isNotNull(interfaceRequest)) {

				String phienBan = results.get(i).getVersionNo() + " - "
						+ DmGtStatusLocalServiceUtil.findNameByStatusCode(results.get(i).getRequestState(), 3);
				object.put("version", phienBan);
				object.put("status",
						DmGtStatusLocalServiceUtil.findNameByStatusCode(results.get(i).getRequestState(), messageType));
				object.put("sendDate", interfaceRequest.getRequestedDate());

				object.put("requestCode", results.get(i).getRequestCode());

				object.put("remarks", results.get(i).getRemarks());
				result.put(object);
			}

		}
		return result;
	}

	public int _lenhDieuDong(String requestCode, long documentName, int documentYear, int messageType, int desStatus,
			User user, UploadPortletRequest uploadPortletRequest, ActionRequest actionRequest) {

		int result = TT1XuLyNghiepVuUtils.XU_LY_THAT_BAI;

		try {

			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			long groupId = themeDisplay.getScopeGroupId();

			ServiceContext serviceContext = ServiceContextFactory.getInstance(TempDocument.class.getName(),
					actionRequest);

			List<IssueShiftingOrder> results = new ArrayList<IssueShiftingOrder>(
					IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
							documentYear, KeyParams.ID, KeyParams.ORDER_BY_DESC));

			if (results.size() > 0) {
				requestCode = results.get(0).getRequestCode();
			}

			TempDocument document = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName,
					documentYear);

			String yKienReject = ParamUtil.getString(uploadPortletRequest, "ykienReject");
			int actionType = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.ACTION_TYPE);

			BusinessUtils businessUtils = new BusinessUtils();

			if (actionType == PageType.ACTION_TYPE_TIEP_NHAN) {

				businessUtils.lenhDieuDongUpgrade(uploadPortletRequest, document.getDocumentName(),
						document.getDocumentYear(), user.getEmailAddress(), requestCode, document.getRequestState());

				InterfaceRequest interfaceShifOrder = InterfaceRequestLocalServiceUtil.findByRequestCode(requestCode);

				if (interfaceShifOrder != null) {
					String remarkCapLai = BusinessUtils.getRemarkCapLai(user.getEmailAddress(), yKienReject,
							new Date());

					interfaceShifOrder.setRemarks(remarkCapLai);
					InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceShifOrder);
				}

				if (document.getRequestState() == ChuyenDichTrangThaiUtils.KE_HOACH_CHO_SUA_LENH_DIEU_DONG) {
					ChuyenDichTrangThaiUtils.doHoSo(documentName, documentYear,
							ChuyenDichTrangThaiUtils.KE_HOACH_CHO_CAP_LENH_DIEU_DONG, Boolean.TRUE);
				}

			} else if (actionType == PageType.ACTION_TYPE_HUY) {

				document.setRequestState(TrangThaiBanKhaiNhapCanh.DA_HUY_LENH_DIEU_DONG);
				document.setDocumentStatusCode(TrangThaiBanKhaiNhapCanh.HUY_THU_TUC_TAU_THUYEN_NHAP_CANH);

				TempDocumentLocalServiceUtil.updateTempDocument(document);

				List<IssueShiftingOrder> lstShiftOrder = IssueShiftingOrderLocalServiceUtil
						.findByDocumentYearAndDocumentYearOrderByColumn(document.getDocumentName(),
								document.getDocumentYear(), KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);

				for (IssueShiftingOrder item : lstShiftOrder) {

					item.setIsCancel(1);
					item.setCancelDate(new Date());
					item.setCancelName(user.getEmailAddress());
					item.setCancelNote(yKienReject);

					item.setRemarks(yKienReject);
					
					item.setRequestState(TrangThaiBanKhaiNhapCanh.KHAI_HUY);
					IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(item);
				}

				insertOrUpdateResultNotification(documentName, documentYear, user.getEmailAddress(), yKienReject,
						messageType);

				// Tich hop send message 71-03
				if (document.getDocumentTypeCode().equalsIgnoreCase("NC")) {
					boolean resultMethod = TT1TichHopMessageUtils.message_71_03(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject, requestCode,
							0);
				} else if (document.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					boolean resultMethod = TT16TichHopMessageUtils.message_71_03(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject, requestCode,
							0);
				} else if (document.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					boolean resultMethod = TT6TichHopMessageUtils.message_71_03(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject, requestCode,
							0);
				} else if (document.getDocumentTypeCode()
						.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					boolean resultMethod = TT8TichHopMessageUtils.message_71_03(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject, requestCode,
							0);
				} else if (document.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					boolean resultMethod = TT10TichHopMessageUtils.message_71_03(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject, requestCode,
							0);
				} else if (document.getDocumentTypeCode()
						.equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					boolean resultMethod = TT4TichHopMessageUtils.message_71_03(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject, requestCode,
							0);
				} else if (document.getDocumentTypeCode()
						.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					boolean resultMethod = TT3TichHopMessageUtils.message_71_03(user.getEmailAddress(),
							uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject, requestCode,
							0);
				}

				//
				// TT1TichHopMessageUtils.sendMessageLenhDieuDong(actionType,
				// document, user.getEmailAddress(),
				// UUID.randomUUID().toString(), actionRequest,
				// lstShiftOrder.get(0).getVersionNo(), yKienReject,
				// uploadPortletRequest, requestCode);

			} else if (actionType == PageType.ACTION_TYPE_CAP_LAI_LENH_DIEU_DONG) {

				List<IssueShiftingOrder> listIssueShiftingOrder = IssueShiftingOrderLocalServiceUtil
						.findByRequestCode(requestCode);

				if (Validator.isNotNull(listIssueShiftingOrder) && listIssueShiftingOrder.size() > 0) {
					IssueShiftingOrder shiftOrder = listIssueShiftingOrder.get(0);
					shiftOrder.setReasonToShift(yKienReject);

					shiftOrder.setRemarks(yKienReject);
					
//					shiftOrder.setAttachedFile(0);
					shiftOrder = IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(shiftOrder);

					// Tich hop send message 70-01
					// if
					// (document.getDocumentTypeCode().equalsIgnoreCase("NC")) {
					// boolean resultMethod =
					// TT1TichHopMessageUtils.message_70_01(user.getEmailAddress(),
					// uploadPortletRequest, actionRequest, documentName,
					// documentYear, yKienReject,
					// requestCode, 0, shiftOrder.getVersionNo());
					// } else if (document.getDocumentTypeCode()
					// .equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI))
					// {
					// boolean resultMethod =
					// TT6TichHopMessageUtils.message_70_01(user.getEmailAddress(),
					// uploadPortletRequest, actionRequest, documentName,
					// documentYear, yKienReject,
					// requestCode, 0, shiftOrder.getVersionNo());
					// } else if (document.getDocumentTypeCode()
					// .equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG))
					// {
					// boolean resultMethod =
					// TT8TichHopMessageUtils.message_70_01(user.getEmailAddress(),
					// uploadPortletRequest, actionRequest, documentName,
					// documentYear, yKienReject,
					// requestCode, 0, shiftOrder.getVersionNo());
					// } else if (document.getDocumentTypeCode()
					// .equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO))
					// {
					// boolean resultMethod =
					// TT10TichHopMessageUtils.message_70_01(user.getEmailAddress(),
					// uploadPortletRequest, actionRequest, documentName,
					// documentYear, yKienReject,
					// requestCode, 0, shiftOrder.getVersionNo());
					// } else if (document.getDocumentTypeCode()
					// .equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI))
					// {
					// boolean resultMethod =
					// TT4TichHopMessageUtils.message_70_01(user.getEmailAddress(),
					// uploadPortletRequest, actionRequest, documentName,
					// documentYear, yKienReject,
					// requestCode, 0, shiftOrder.getVersionNo());
					// } else if (document.getDocumentTypeCode()
					// .equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH))
					// {
					// boolean resultMethod =
					// TT3TichHopMessageUtils.message_70_01(user.getEmailAddress(),
					// uploadPortletRequest, actionRequest, documentName,
					// documentYear, yKienReject,
					// requestCode, 0, shiftOrder.getVersionNo());
					// }

				}

				ChuyenDichTrangThaiUtils.doHoSo(documentName, documentYear,
						ChuyenDichTrangThaiUtils.KE_HOACH_CHO_SUA_LENH_DIEU_DONG, Boolean.TRUE);

			} else if (actionType == PageType.ACTION_TYPE_DUYET) {

				IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCode);

				// ----------duyenMotLan---------
				document.setRequestState(TrangThaiBanKhaiNhapCanh.DA_CAP_LENH_DIEU_DONG);
				document.setShipPosition(MessageType.SHIP_POSSITION_TRONG_CANG);
				document.setDocumentStatusCode(TrangThaiBanKhaiNhapCanh.THU_TUC_DA_TIEP_NHAN);

				if (shiftOrder != null) {
					document.setShipDateFrom(shiftOrder.getShiftingDate());
				}
				TempDocumentLocalServiceUtil.updateTempDocument(document);

				if (shiftOrder != null) {
					// TODO Nhap Canh truong hop duyet
					shiftOrder.setIsApproval(PageType.DUYET_PHE_CHUAN);
					shiftOrder.setApprovalDate(new Date());
					shiftOrder.setApprovalName(user.getEmailAddress());

					try {

						long fileEntryId = shiftOrder.getAttachedFile();
						// save file to shifting order
						long nanoTime = ReportsBusinessUtils.actionExport(requestCode, (int) documentName, documentYear,
								messageType, document.getDocumentTypeCode());

						String tenFileExport = nanoTime + "_" + ReportConstant.SHIFTING_ORDER_EXPORT;
						File file = new File(pathFileSub + tenFileExport);
						FileEntry fileEntry = FileUploadUtils.uploadFile(user.getUserId(), groupId, fileEntryId, file,
								pathFileSub + tenFileExport, null, null, serviceContext);
						shiftOrder.setAttachedFile(fileEntry.getFileEntryId());

					} catch (Exception e) {
						_log.error(e);
					}

					shiftOrder.setRequestState(TrangThaiBanKhaiNhapCanh.CHAP_NHAN_BAN_KHAI);

					IssueShiftingOrder update = IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(shiftOrder);

				}

				// XU LY Gui lenh dieu dong
				if (document.getRequestState() == TrangThaiBanKhaiNhapCanh.DA_CAP_LENH_DIEU_DONG
						&& shiftOrder != null) {

					// Tich hop send message 70-01
					if (document.getDocumentTypeCode().equalsIgnoreCase("NC")) {
						boolean resultMethod = TT1TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
						boolean resultMethod = TT16TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
						boolean resultMethod = TT6TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
						boolean resultMethod = TT8TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
						boolean resultMethod = TT10TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
						boolean resultMethod = TT4TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
						boolean resultMethod = TT3TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					}

					// TT1TichHopMessageUtils.sendMessageLenhDieuDong(actionType,
					// document, user.getEmailAddress(),
					// requestCode, actionRequest, shiftOrder.getVersionNo(),
					// "", uploadPortletRequest,
					// requestCode);
				} else {
					_log.info("==KHONG_gui_lenh_dieu_dong=");
				}
			} else if (actionType == PageType.ACTION_TYPE_CHO_LANH_DAO_DUYET) {

				IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCode);

				if ((shiftOrder != null) && (shiftOrder.getStampStatus() == 0)) {

					document.setRequestState(ChuyenDichTrangThaiUtils.KE_HOACH_CHO_CAP_LENH_DIEU_DONG);

					TempDocumentLocalServiceUtil.updateTempDocument(document);

					String representative = shiftOrder.getRepresentative();
					String portofAuthority = shiftOrder.getPortofAuthority();
					String signTitle = CheckBusinessUtil.getSignTitle(representative, portofAuthority);
					shiftOrder.setSignTitle(signTitle);
					
					// TODO Nhap Canh truong hop cho duyet
					shiftOrder.setStampStatus(PageType.ACTION_TYPE_CHO_LANH_DAO_DUYET);
					shiftOrder.setIsApproval(PageType.KHONG_PHE_CHUAN);
					IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(shiftOrder);
					
					try {

						long fileEntryId = shiftOrder.getAttachedFile();

						// save file to shifting order
						long nanoTime = ReportsBusinessUtils.actionExport(requestCode, (int) documentName, documentYear,
								messageType, document.getDocumentTypeCode());

						String tenFileExport = nanoTime + "_" + ReportConstant.SHIFTING_ORDER_EXPORT;
						File file = new File(pathFileSub + tenFileExport);
						FileEntry fileEntry = FileUploadUtils.uploadFile(user.getUserId(), groupId, fileEntryId, file,
								pathFileSub + tenFileExport, null, null, serviceContext);

						shiftOrder.setAttachedFile(fileEntry.getFileEntryId());

					} catch (Exception e) {
						_log.error(e);
					}
					IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(shiftOrder);
					_log.info("==Chuyen_lanh_dao_duyet_ky_lenh_dieu_dong=");
				}

			} else if (actionType == PageType.ACTION_TYPE_CHUYEN_TRA_HO_SO) {
				_log.info("=====Tra ve buoc truoc==ACTION_TYPE_CHUYEN_TRA_HO_SO");

				IssueShiftingOrder shiftOrderLanhDaoTraLai = IssueShiftingOrderLocalServiceUtil
						.getByRequestCode(requestCode);

				if (shiftOrderLanhDaoTraLai != null) {
					// TODO Nhap Canh truong hop cho duyet
					shiftOrderLanhDaoTraLai.setStampStatus(PageType.KHONG_PHE_CHUAN);
					shiftOrderLanhDaoTraLai.setIsApproval(PageType.KHONG_PHE_CHUAN);
					shiftOrderLanhDaoTraLai.setIsCancel(PageType.KHONG_PHE_CHUAN);
					shiftOrderLanhDaoTraLai.setCancelNote(yKienReject);
					shiftOrderLanhDaoTraLai.setRemarks(yKienReject);
					shiftOrderLanhDaoTraLai.setAttachedFile(0);
					shiftOrderLanhDaoTraLai.setCancelDate(new Date());
					IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(shiftOrderLanhDaoTraLai);
					_log.info("==Tra ve buoc truoc, sua noi dung lenh dieu dong==");

					BusinessUtils.updateLyDoResultNotification(user.getEmailAddress(), yKienReject,
							MessageType.Y_CAU_TRA_LAI_HO_SO_LENH_DIEU_DONG, document.getMaritimeCode(),
							document.getDocumentName(), document.getDocumentYear());

					// reject change status to KE_HOACH_CHO_SUA_LENH_DIEU_DONG
					TempDocument tempDocument = TempDocumentLocalServiceUtil
							.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

					tempDocument.setRequestState(ChuyenDichTrangThaiUtils.KE_HOACH_CHO_SUA_LENH_DIEU_DONG);
					TempDocumentLocalServiceUtil.updateTempDocument(tempDocument);
					
					InterfaceRequest interfaceShifOrder = InterfaceRequestLocalServiceUtil.findByRequestCode(requestCode);

					if (interfaceShifOrder != null) {
						String remarkCapLai = BusinessUtils.getRemarkCapLai(user.getEmailAddress(), yKienReject,
								new Date());

						interfaceShifOrder.setRemarks(remarkCapLai);
						InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceShifOrder);
					}

				}

			} else if (actionType == PageType.ACTION_TYPE_KYSO) {

				IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCode);

				long fileEntryId = FileUploadUtil.kySoFile(uploadPortletRequest, shiftOrder.getAttachedFile(), "KY_SO", serviceContext);

				document.setRequestState(TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG);
				TempDocumentLocalServiceUtil.updateTempDocument(document);

				if (shiftOrder != null) { // TODO Nhap Canh truong hop duyet
					shiftOrder.setApprovalDate(new Date());
					shiftOrder.setApprovalName(user.getEmailAddress());
					shiftOrder.setRequestState(TrangThaiBanKhaiNhapCanh.KHAI_MOI);
					shiftOrder.setStampStatus(1);
					String signLocation = ParamUtil.getString(uploadPortletRequest, "signLocation");
					
					shiftOrder.setSignPlace(signLocation);
					
					String representative = shiftOrder.getRepresentative();
					String portofAuthority = shiftOrder.getPortofAuthority();
					String signTitle = CheckBusinessUtil.getSignTitle(representative, portofAuthority);
					shiftOrder.setSignTitle(signTitle);
					shiftOrder.setSignName(ParamUtil.getString(uploadPortletRequest, "signName"));
					shiftOrder.setSignDate(
							ParamUtil.getDate(uploadPortletRequest, "signDate", FormatData.formatDateShort3));

					shiftOrder.setAttachedFile(fileEntryId);
					
//					String filePath = ParamUtil.getString(uploadPortletRequest, "filePath");
//					String signFieldName = ParamUtil.getString(uploadPortletRequest, "signFieldName");
//					String sign = ParamUtil.getString(uploadPortletRequest, "sign");
//					
//					_log.info("filePath: " + filePath);
//					_log.info("signFieldName: " + signFieldName);
//					_log.info("sign: " + sign);
					
//					if (Validator.isNotNull(filePath) && Validator.isNotNull(signFieldName) && Validator.isNotNull(sign)) {
//						
//						try {
//							
//							File file = new File(filePath.replaceAll(".pdf", ".signed.pdf"));
//							
//							long fileEntryId = 0;
//								
//							fileEntryId = shiftOrder.getAttachedFile();
//							
//							FileEntry fileEntry = FileUploadUtils.uploadFile(themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), fileEntryId, file,
//									filePath.replaceAll(".pdf", ".signed.pdf"), null, null, serviceContext);
//							
//							shiftOrder.setAttachedFile(fileEntry.getFileEntryId());
//							
//						} catch (Exception e) {
//							_log.error(e);
//						}
//					}

					IssueShiftingOrder update = IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(shiftOrder);

				}

			} else if (actionType == PageType.ACTION_TYPE_DONGDAU) {

				IssueShiftingOrder shiftOrder = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCode);

				long fileEntryId = FileUploadUtil.kySoFile(uploadPortletRequest, shiftOrder.getAttachedFile(), "DONG_DAU", serviceContext);
				
				if (shiftOrder != null) {

					shiftOrder.setIsApproval(PageType.DUYET_PHE_CHUAN);

					shiftOrder.setRequestState(TrangThaiBanKhaiNhapCanh.CHAP_NHAN_BAN_KHAI);
					shiftOrder.setStampStatus(2);
					String signLocation = ParamUtil.getString(uploadPortletRequest, "signLocation");
					
					shiftOrder.setSignPlace(signLocation);
					shiftOrder.setAttachedFile(fileEntryId);
					
//					String filePath = ParamUtil.getString(uploadPortletRequest, "filePath");
//					String signFieldName = ParamUtil.getString(uploadPortletRequest, "signFieldName");
//					String sign = ParamUtil.getString(uploadPortletRequest, "sign");
//					
//					_log.info("filePath: " + filePath);
//					_log.info("signFieldName: " + signFieldName);
//					_log.info("sign: " + sign);
					
//					if (Validator.isNotNull(filePath) && Validator.isNotNull(signFieldName) && Validator.isNotNull(sign)) {
//						
//						try {
//							
//							File file = new File(filePath.replaceAll(".pdf", ".signed.pdf"));
//							
//							long fileEntryId = 0;
//							
//							fileEntryId = shiftOrder.getAttachedFile();
//							
//							FileEntry fileEntry = FileUploadUtils.uploadFile(themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), fileEntryId, file,
//									filePath.replaceAll(".pdf", ".signed.pdf"), null, null, serviceContext);
//							
//							shiftOrder.setAttachedFile(fileEntry.getFileEntryId());
//							
//						} catch (Exception e) {
//							_log.error(e);
//						}
//					}

					IssueShiftingOrder update = IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(shiftOrder);
				}

				String versionduyet = shiftOrder.getVersionNo();
				if (versionduyet.length() > 0) {
//					if (FormatData.convertToInt(versionduyet) == 1) {
						document.setShipPosition(MessageType.SHIP_POSSITION_TRONG_CANG);
						document.setDocumentStatusCode(TrangThaiBanKhaiNhapCanh.THU_TUC_DA_TIEP_NHAN);
//					} else if (FormatData.convertToInt(versionduyet) > 1) {
//						// do not setDocumentStatusCode and setShipPosition
//					}
				} else {
					document.setShipPosition(MessageType.SHIP_POSSITION_TRONG_CANG);
					document.setDocumentStatusCode(TrangThaiBanKhaiNhapCanh.THU_TUC_DA_TIEP_NHAN);
				}

				document.setRequestState(TrangThaiBanKhaiNhapCanh.DA_CAP_LENH_DIEU_DONG);
				document.setShipDateFrom(shiftOrder.getShiftingDate());
				TempDocumentLocalServiceUtil.updateTempDocument(document);

				if (document.getRequestState() == TrangThaiBanKhaiNhapCanh.DA_CAP_LENH_DIEU_DONG
						&& Validator.isNotNull(shiftOrder.getRequestState())
						&& (shiftOrder.getRequestState() == TrangThaiBanKhaiNhapCanh.CHAP_NHAN_BAN_KHAI)) {

					// Tich hop send message 70-01
					if (document.getDocumentTypeCode().equalsIgnoreCase("NC")) {
						boolean resultMethod = TT1TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
						boolean resultMethod = TT16TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
						boolean resultMethod = TT6TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
						boolean resultMethod = TT8TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
						boolean resultMethod = TT10TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
						boolean resultMethod = TT4TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					} else if (document.getDocumentTypeCode()
							.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
						boolean resultMethod = TT3TichHopMessageUtils.message_70_01(user.getEmailAddress(),
								uploadPortletRequest, actionRequest, documentName, documentYear, yKienReject,
								requestCode, 0, shiftOrder.getVersionNo());
					}

				} else {
					_log.info("==KHONG_gui_lenh_dieu_dong=");
				}
			}
			result = TT1XuLyNghiepVuUtils.XU_LY_THANH_CONG;
		} catch (Exception e) {
			_log.error(e);
			result = TT1XuLyNghiepVuUtils.XU_LY_THAT_BAI;
		}

		return result;
	}

	public static void insertOrUpdateResultNotification(long documentName, int documentYear, String userName,
			String yKienReject, int messageType) {
		try {

			TempDocument document = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName,
					documentYear);

			// MessageType.HUY_LENH_DIEU_DONG
			ResultNotification reNotification = ResultNotificationLocalServiceUtil.findByBusinessTypeCode(messageType,
					document.getDocumentName(), document.getDocumentYear());
			
			System.out.println("BanKhaiLenhDieuDongUtils.insertOrUpdateResultNotification()" + reNotification);
			if (reNotification == null) {
				// Them moi.
				reNotification = new ResultNotificationImpl();
				reNotification.setBusinessTypeCode(messageType);
				reNotification.setDivision("System");
				reNotification.setDocumentName(document.getDocumentName());
				reNotification.setDocumentYear(document.getDocumentYear());
				reNotification.setLatestDate(FormatData.parseDateToTring(new Date()));
				reNotification.setRequestCode(UUID.randomUUID().toString());

				if (document != null) {
					reNotification.setMaritimeCode(document.getMaritimeCode());
				}

				// resultNotification.setRemarks(userName);
				// setRole Thutuc - Kehoach
				if (messageType == MessageType.BO_SUNG_THU_TUC) {
					reNotification.setRole(4);
				} else if (messageType == MessageType.HUY_LENH_DIEU_DONG
						|| messageType == MessageType.BO_SUNG_KE_HOACH) {
					reNotification.setRole(2);
				} else {
					reNotification.setRole(2);
				}

				reNotification.setResponse(yKienReject);
				reNotification.setRequestState(1);
				reNotification.setResponseTime(new Date());
				reNotification.setOfficerName(userName);
				reNotification.setLatestDate(FormatData.parseDateToTring(new Date()));
				reNotification.setIsReply(1);

				ResultNotificationLocalServiceUtil.addResultNotification(reNotification);
			} else {
				// setRole Thutuc - Kehoach
				if (messageType == MessageType.BO_SUNG_THU_TUC) {
					reNotification.setRole(4);
				} else if (messageType == MessageType.HUY_LENH_DIEU_DONG
						|| messageType == MessageType.BO_SUNG_KE_HOACH) {
					reNotification.setRole(2);
				} else {
					reNotification.setRole(2);
				}
				reNotification.setResponse(yKienReject);
				reNotification.setRequestState(1);
				if (document != null) {
					reNotification.setMaritimeCode(document.getMaritimeCode());
				}
				reNotification.setResponseTime(new Date());
				reNotification.setOfficerName(userName);
				reNotification.setLatestDate(FormatData.parseDateToTring(new Date()));
				reNotification.setIsReply(1);

				ResultNotificationLocalServiceUtil.updateResultNotification(reNotification);
			}
		} catch (Exception e) {
			_log.error(e);
		}
	}
}
