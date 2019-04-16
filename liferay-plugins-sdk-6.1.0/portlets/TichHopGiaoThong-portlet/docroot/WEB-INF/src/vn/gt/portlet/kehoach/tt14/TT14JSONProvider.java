package vn.gt.portlet.kehoach.tt14;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;

import vn.gt.dao.common.model.UserPort;
import vn.gt.dao.common.service.UserPortLocalServiceUtil;
import vn.gt.dao.danhmuc.model.DmRepresentative;
import vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.IssuePortClearance;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration;
import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil;
import vn.gt.dao.result.model.ResultCompetion;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.model.impl.ResultCompetionImpl;
import vn.gt.dao.result.service.ResultCompetionLocalServiceUtil;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.portlet.kehoach.nghiepvu.bankhai.BanKhaiCacGiayToPhaiXuatTrinhUtils;
import vn.gt.portlet.kehoach.nghiepvu.bankhai.BanKhaiChungUtils;
import vn.gt.portlet.kehoach.nghiepvu.bankhai.BanKhaiDanhSachHanhKhachUtils;
import vn.gt.portlet.kehoach.nghiepvu.bankhai.BanKhaiDanhSachThuyenVienUtils;
import vn.gt.portlet.kehoach.nghiepvu.bankhai.BanKhaiGiayPhepNhapCanhVietCamBoGTVTUtils;
import vn.gt.portlet.kehoach.nghiepvu.bankhai.BanKhaiGiayPhepRoiCangBoGTVTUtils;
import vn.gt.portlet.kehoach.nghiepvu.bankhai.BanKhaiGiayPhepRoiCangCuoiCungUtils;
import vn.gt.portlet.kehoach.nghiepvu.bankhai.BanKhaiKetQuaPheDuyetHoSoUtils;
import vn.gt.portlet.kehoach.utils.ChuyenDichTrangThaiUtils;
import vn.gt.tichhop.message.MessageType;
import vn.gt.tichhop.message.TrangThaiBanKhaiNhapCanh;
import vn.gt.tichhop.report.ReportConstant;
import vn.gt.tichhop.report.ReportsBusinessUtils;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.gt.utils.KeyParams;
import vn.gt.utils.PageType;
import vn.gt.utils.document.DocumentUtils;

public class TT14JSONProvider {

	private static Log _log = LogFactoryUtil.getLog(TT14JSONProvider.class);

	public static JSONArray getRoleFilterStatus(Locale locale, User user) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONArray childs = JSONFactoryUtil.createJSONArray();
		JSONObject object = JSONFactoryUtil.createJSONObject();
		JSONObject objectChilds = JSONFactoryUtil.createJSONObject();

		// get user orgs
		try {
			List<Organization> orgs = user.getOrganizations();
			for (Organization organization : orgs) {
				if (organization.getName().equalsIgnoreCase(LanguageUtil.get(locale, "ke-hoach"))) {
					// start json build ke hoach
					object.put("action", "folder");
					object.put("action_active", "folder_open");
					object.put("id", -1);
					object.put("id_active", "ke_hoach");
					object.put("type", -1);
					// object.put("title", LanguageUtil.get(locale,
					// "ke_hoach"));
					object.put("title", LanguageUtil.get(locale, "ke-hoach"));
					object.put("active", false);
					object.put("index", 0);

					objectChilds = JSONFactoryUtil.createJSONObject();

					objectChilds.put("id", 4);
					objectChilds.put("code", 11);
					objectChilds.put("title", LanguageUtil.get(locale, "cho-tiep-nhan-tt"));
					objectChilds.put("type", -1);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();

					objectChilds.put("id", 30);
					objectChilds.put("code", 27);
					objectChilds.put("title", LanguageUtil.get(locale, "yeu-cau-sua-doi-bo-sung-tt"));
					objectChilds.put("type", -1);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();

					objectChilds.put("id", 21);
					objectChilds.put("code", 12);
					objectChilds.put("title", LanguageUtil.get(locale, "da-tiep-nhan-tt"));
					objectChilds.put("type", -1);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 2);
					objectChilds.put("code", 13);
					objectChilds.put("title", LanguageUtil.get(locale, "tu-choi-tiep-tt"));
					objectChilds.put("type", -1);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					result.put(object);
					// end build ke hoach
				} else if (organization.getName().equalsIgnoreCase(LanguageUtil.get(locale, "thu-tuc"))) {
					// start json build thu tuc
					childs = JSONFactoryUtil.createJSONArray();
					object = JSONFactoryUtil.createJSONObject();
					object.put("action", "folder");
					object.put("action_active", "folder_open");
					object.put("id", -2);
					object.put("id_active", "thu_tuc");
					object.put("type", -2);
					object.put("title", LanguageUtil.get(locale, "thu-tuc"));
					object.put("active", false);
					object.put("index", 1);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 11);
					objectChilds.put("code", 18);
					objectChilds.put("title", LanguageUtil.get(locale, "da-tiep-nhan-tt"));
					objectChilds.put("type", -2);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 6);
					objectChilds.put("code", 13);
					objectChilds.put("title", LanguageUtil.get(locale, "yeu-cau-sua-doi-bo-sung-tt"));
					objectChilds.put("type", -2);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 5);
					objectChilds.put("code", 12);
					objectChilds.put("title", LanguageUtil.get(locale, "cho-phe-duyet-hoan-thanh-thu-tuc-tt"));
					objectChilds.put("type", -2);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 29);
					objectChilds.put("code", 20);
					objectChilds.put("title", LanguageUtil.get(locale, "de-nghi-cap-giay-phep-tt"));
					objectChilds.put("type", -2);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 42);
					objectChilds.put("code", 120);
					objectChilds.put("title", LanguageUtil.get(locale, "de-nghi-sua-giay-phep-tt"));
					objectChilds.put("type", -2);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 43);
					objectChilds.put("code", 25);
					objectChilds.put("title", LanguageUtil.get(locale, "tam-dung-lam-thu-tuc-dien-tu"));
					objectChilds.put("type", -2);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 12);
					objectChilds.put("code", 19);
					objectChilds.put("title", LanguageUtil.get(locale, "phe-duyet-hoan-thanh-thu-tuc-tt"));
					objectChilds.put("type", -2);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					objectChilds = JSONFactoryUtil.createJSONObject();
					objectChilds.put("id", 13);
					objectChilds.put("code", 10);
					objectChilds.put("title", LanguageUtil.get(locale, "huy-thu-tuc-tt"));
					objectChilds.put("type", -2);
					objectChilds.put("counter", "_ _");
					childs.put(objectChilds);
					object.put("items", childs);

					result.put(object);
					// end build thu tuc
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}

	public static JSONArray getThanhPhanHoSo(ThemeDisplay themeDisplay, String documentType, long documentName,
			int documentYear, HttpServletRequest request) {
		JSONArray result = JSONFactoryUtil.createJSONArray();

//		result.put(BanKhaiThongBaoUtils.buildThanhPhan(themeDisplay, documentName, documentYear, MessageType.THONG_BAO_TAU_ROI_CANG));
		result.put(BanKhaiChungUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
		result.put(BanKhaiDanhSachThuyenVienUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
		result.put(BanKhaiDanhSachHanhKhachUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
//		result.put(BanKhaiDanhSachHangHoaNguyHiemUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
//		result.put(BanKhaiDuTruCuaTauUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
//		result.put(BanKhaiHanhLyThuyenVienUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
//		result.put(BanKhaiBaoYTeHangHaiUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
//		result.put(BanKhaiKiemDichThucVatUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
//		result.put(BanKhaiKiemDichDongVatUtils.buildThanhPhan(themeDisplay, documentName, documentYear));

		// thu-tuc
		try {
			int roleUserFilterselectedType = ParamUtil.getInteger(request, "roleUserFilterselectedType", -1);

			boolean isThuTuc = false;
			List<Organization> orgs = themeDisplay.getUser().getOrganizations();
			for (Organization organization : orgs) {
				if (organization.getName().equalsIgnoreCase(LanguageUtil.get(themeDisplay.getLocale(), "thu-tuc"))) {
					isThuTuc = true;
					break;
				} else if (organization.getName()
						.equalsIgnoreCase(LanguageUtil.get(themeDisplay.getLocale(), "lanh-dao"))) {
					isThuTuc = true;
					break;
				} else if (organization.getName()
						.equalsIgnoreCase(LanguageUtil.get(themeDisplay.getLocale(), "van-thu"))) {
					isThuTuc = true;
					break;
				} else if (organization.getName().equalsIgnoreCase(LanguageUtil.get(themeDisplay.getLocale(), "ke-toan"))) {
					isThuTuc = true;
					break;
				}
			}

			if (isThuTuc && roleUserFilterselectedType != -1) {
				result.put(BanKhaiCacGiayToPhaiXuatTrinhUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
				result.put(BanKhaiKetQuaPheDuyetHoSoUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
				result.put(BanKhaiGiayPhepNhapCanhVietCamBoGTVTUtils.buildThanhPhan(themeDisplay, documentName, documentYear));
			}

		} catch (Exception e) {
			_log.error(e);
		}

//		JSONObject lastLost = BanKhaiGiayPhepRoiCangCuoiCungUtils.buildThanhPhan(themeDisplay, documentName, documentYear);
//		if (Validator.isNotNull(lastLost)) {
//			result.put(lastLost);
//		}
		
		return result;
	}

	public static JSONArray getFileThanhPhanVersionList(ThemeDisplay themeDisplay, int messageType, long documentName,
			int documentYear, HttpServletRequest request) {
		JSONArray result = JSONFactoryUtil.createJSONArray();

		if (messageType == MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN) {

			result = BanKhaiDanhSachThuyenVienUtils.getFileThanhPhanVersionList(themeDisplay, documentName,
					documentYear, messageType);

		} else if (messageType == MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH) {

			result = BanKhaiDanhSachHanhKhachUtils.getFileThanhPhanVersionList(themeDisplay, documentName, documentYear,
					messageType);

		} else if (messageType == MessageType.BAN_KHAI_CHUNG) {

			result = BanKhaiChungUtils.getFileThanhPhanVersionList(themeDisplay, documentName, documentYear,
					messageType);

		} else if (messageType == MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH) {

			result = BanKhaiGiayPhepRoiCangBoGTVTUtils.getFileThanhPhanVersionList(themeDisplay, documentName, documentYear,
					messageType);

		} else if (messageType == MessageType.GIAY_PHEP_ROI_CANG_CUOI_CUNG) {

			result = BanKhaiGiayPhepRoiCangCuoiCungUtils.getFileThanhPhanVersionList(themeDisplay, documentName, documentYear,
					messageType);

		}
		return result;
	}

	public static JSONObject exportPDFDetailThanhPhan(Locale locale, int documentName, int documentYear,
			int messageType, String requestCode, HttpServletRequest request) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		String tenFileExport = StringPool.BLANK;
		try {
			boolean flagGiayPhepRoiCangCC = false;
			long nanoTime = ReportsBusinessUtils.actionExport(requestCode, documentName, documentYear, messageType,
					ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH);

			IssuePortClearance issuePortClearance = null;
			if (messageType == MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH) {
				issuePortClearance = IssuePortClearanceLocalServiceUtil.getByRequestCode(requestCode);
			}
			
			if (messageType == MessageType.BAN_KHAI_CHUNG) {
				tenFileExport = nanoTime + "_" + ReportConstant.GENERAL_DECLARATION_EXPORT;
			} else if (messageType == MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN) {
				tenFileExport = nanoTime + "_" + ReportConstant.CREW_LIST_EXPORT;
			} else if (messageType == MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH) {
				tenFileExport = nanoTime + "_" + ReportConstant.PASSENGER_LIST_EXPORT;
			} else if (messageType == MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH) {
				
				if ( Validator.isNotNull(issuePortClearance) && issuePortClearance.getAttachedFile() > 0 && DocumentUtils.existDLFileAbsPath(issuePortClearance.getAttachedFile())) {
					tenFileExport = vn.gt.portlet.document.FileUtils.getFullFileURL(issuePortClearance.getAttachedFile());
				} else {
					tenFileExport = nanoTime + "_" + ReportConstant.ISSUE_PORT_CLEARANCE_EXPORT;
				}
			} else if (messageType == MessageType.GIAY_PHEP_ROI_CANG_CUOI_CUNG) {
				
				String portCleaneNo = StringPool.BLANK;
				
				// Bản khai chung -- > thông báo
				
				TempGeneralDeclaration tempGeneralDeclaration = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
				
				if (Validator.isNotNull(tempGeneralDeclaration)) {
					portCleaneNo = tempGeneralDeclaration.getPortClearanceNo();
				} else {
					
					TempNoTiceShipMessage tempNoTiceShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(documentName, documentYear);
					
					if (Validator.isNotNull(tempNoTiceShipMessage)) {
						portCleaneNo = tempNoTiceShipMessage.getPortClearanceNo();
					}
				}
				IssuePortClearance issuePortClearanceLast = IssuePortClearanceLocalServiceUtil.findLatestCertificateOfIssuePortClearance(null, null, portCleaneNo);
				
				if (Validator.isNotNull(issuePortClearanceLast)) {
					if (issuePortClearanceLast.getAttachedFile() > 0 && DocumentUtils.existDLFileAbsPath(issuePortClearanceLast.getAttachedFile())) {
						tenFileExport = vn.gt.portlet.document.FileUtils.getFullFileURL(issuePortClearanceLast.getAttachedFile());
						flagGiayPhepRoiCangCC = true;
					} else {
						long documentNameTemp = issuePortClearanceLast.getDocumentName();
						long documentYearTemp = issuePortClearanceLast.getDocumentYear();
						TempDocument temp = TempDocumentLocalServiceUtil.getByDocumentNameAndDocumentYear(documentNameTemp,
								Integer.valueOf(documentYearTemp + ""));
						nanoTime = ReportsBusinessUtils.actionExport(issuePortClearanceLast.getRequestCode(), Integer.valueOf(documentNameTemp + ""), Integer.valueOf(documentYearTemp + ""), MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH,
								temp.getDocumentTypeCode());
						_log.info("-------documentNameTemp+++++++++++" + documentNameTemp);
						_log.info("-------documentYearTemp+++++++++++" + documentYearTemp);
						_log.info("-------nanoTime+++++++++++" + nanoTime);
						_log.info("-------getRequestCode+++++++++++" + issuePortClearanceLast.getRequestCode());
						tenFileExport = nanoTime + "_" + ReportConstant.ISSUE_PORT_CLEARANCE_EXPORT;
						flagGiayPhepRoiCangCC = false;
					}
				}
				
			}

			String UrlFile = request.getContextPath() + "/export/" + tenFileExport;
			String UrlFileDowLoad = UrlFile.replace(".pdfs", ".pdf");
			if ((Validator.isNotNull(issuePortClearance) && DocumentUtils.existDLFileAbsPath(issuePortClearance.getAttachedFile()) && issuePortClearance.getAttachedFile() > 0 && messageType == MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) {
				result.put("url", tenFileExport);
				result.put("download", tenFileExport);
			} else if (flagGiayPhepRoiCangCC && Validator.isNotNull(tenFileExport) && messageType == MessageType.GIAY_PHEP_ROI_CANG_CUOI_CUNG) {
				result.put("url", tenFileExport);
				result.put("download", tenFileExport);
			} else {
				result.put("url", UrlFile);
				result.put("download", UrlFileDowLoad);
			}

		} catch (Exception e) {
			result.put("url", StringPool.BLANK);
			result.put("download", StringPool.BLANK);
		}
		return result;
	}

	public static JSONObject checkThanhPhanActionButton(ThemeDisplay themeDisplay, long documentName, int documentYear,
			int messageType, int roleType, String requestCode, HttpServletRequest actionRequest) {
		int resultShow = -1;
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", -1);
		try {

			TempDocument temp = TempDocumentLocalServiceUtil.getByDocumentNameAndDocumentYear(documentName,
					documentYear);
			// role ke hoach vaitro = 1
			String vaiTro = StringPool.BLANK;
			UserPort userPort = UserPortLocalServiceUtil.findByUserId(themeDisplay.getUserId());
			List<DmRepresentative> listRepres = DmRepresentativeLocalServiceUtil.findByMaritimeCode(userPort.getPortCode());
			
			JSONArray userSign = JSONFactoryUtil.createJSONArray();
			
			JSONObject userObj = JSONFactoryUtil.createJSONObject();
			
			userObj.put("representative", KeyParams.GIAM_DOC);
			
			userSign.put(userObj);
			
			for (DmRepresentative dmRepresentative : listRepres) {
				
				if (dmRepresentative.getRepLevel() == 1 || dmRepresentative.getRepLevel() == 2) {
					userObj = JSONFactoryUtil.createJSONObject();
					
					userObj.put("representative", dmRepresentative.getRepName());
					
					userSign.put(userObj);
				}
				
			}

			if (roleType == -1) {
				vaiTro = PageType.KE_HOACH;
			} else if (roleType == -2) {
				vaiTro = PageType.THU_TUC;
				if (messageType == 60) {

					List<IssuePortClearance> lstIssuePortClearance = IssuePortClearanceLocalServiceUtil
							.findByDocumentYearAndDocumentYearOrderByColumn(documentName, documentYear, KeyParams.ID,
									KeyParams.ORDER_BY_DESC);

					if (lstIssuePortClearance.size() > 0) {
						// for (IssuePortClearance item : lstIssuePortClearance)
						// {
						if (lstIssuePortClearance.get(0).getRequestState() == TrangThaiBanKhaiNhapCanh.KHAI_SUA && temp
								.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_DE_NGHI_SUA_GIAY_PHEP) {
							resultShow = 2;
							// break;
						}
						// }
						result.put("data", resultShow);
						result.put("userSigns", userSign);
						return result;
					} else {
						result.put("data", 2);
						result.put("userSigns", userSign);
						return result;
					}

				}
			} else if (roleType == -3) {
				vaiTro = PageType.KE_HOACH;
			} else if (roleType == -4) {
				vaiTro = PageType.KE_HOACH;
			}

			resultShow = CheckBusinessUtil.checkRoleDisplayButton(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH,
					messageType, vaiTro, temp, requestCode, actionRequest);

			result.put("data", resultShow);
			result.put("userSigns", userSign);

		} catch (Exception e) {
			_log.info(e);
		}
		return result;
	}

	public static JSONObject getMessageType23EXT(ThemeDisplay themeDisplay, long documentName, int documentYear,
			int messageType, int roleType, String requestCode, HttpServletRequest request) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("data", -1);
		try {
			String soChungNhan = StringPool.BLANK;
			String ngayPheDuyet = StringPool.BLANK;
			double lePhi = 0;

			ResultCompetion resultCompetion = ResultCompetionLocalServiceUtil
					.findByDocumentNameAndDocumentYear(documentName, documentYear);
			if (resultCompetion == null) {
				resultCompetion = new ResultCompetionImpl();
			}
			if (resultCompetion.getCertificateNo() != null && resultCompetion.getCertificateNo().length() > 0) {
				String[] resultsGet = resultCompetion.getCertificateNo().trim().split("/");
				if (resultsGet != null && resultsGet.length > 0) {
					soChungNhan = resultsGet[0];
				}
			}

			if (resultCompetion.getResponseTimeCVHH() != null) {
				ngayPheDuyet = FormatData.parseDateToTring(resultCompetion.getResponseTimeCVHH());
			}

			TempDebitNote tempDebitNote = TempDebitNoteLocalServiceUtil.findByDocumentNameAnddocumentYear(documentName,
					documentYear);

			if (Validator.isNotNull(tempDebitNote)) {
				lePhi = tempDebitNote.getTotalpayment();
			}
			result.put("soChungNhan", soChungNhan);
			result.put("ngayPheDuyet", ngayPheDuyet);
			result.put("lePhi", lePhi);

		} catch (Exception e) {
			_log.info(e);
		}
		return result;
	}

}
