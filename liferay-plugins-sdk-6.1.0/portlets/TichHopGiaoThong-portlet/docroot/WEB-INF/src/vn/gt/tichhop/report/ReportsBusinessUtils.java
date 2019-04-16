package vn.gt.tichhop.report;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import vn.gt.dao.danhmuc.model.ThamSoHeThong;
import vn.gt.dao.danhmuc.model.impl.ThamSoHeThongImpl;
import vn.gt.dao.danhmuc.service.ThamSoHeThongLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit;
import vn.gt.dao.noticeandmessage.model.IssuePortClearance;
import vn.gt.dao.noticeandmessage.model.IssueShiftingOrder;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.IssueAcceptance;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil;
import vn.gt.tichhop.message.MessageType;
import vn.gt.tichhop.report.CargoDeclaration.ExportCargoDeclaration;
import vn.gt.tichhop.report.CrewEffectsDeclaration.Export2CrewEffectsDeclaration;
import vn.gt.tichhop.report.CrewList.Export2CrewList;
import vn.gt.tichhop.report.DangerousGoodsManifest.Export2DangerousGoodsManifest;
import vn.gt.tichhop.report.DeclarationForAnimalQuarantine.Export2DeclarationForAnimalQuarantine;
import vn.gt.tichhop.report.DeclarationForPlantQuarantine.Export2DeclarationForPlantQuarantine;
import vn.gt.tichhop.report.DeclarationOfHealth.Export2DeclarationOfHealth;
import vn.gt.tichhop.report.GeneralDeclaration.Export2GeneralDeclaration;
import vn.gt.tichhop.report.NoticeOfArrival.Export2NoticeOfArrival;
import vn.gt.tichhop.report.PassengerList.Export2PassengerList;
import vn.gt.tichhop.report.PermissionForTransit.Export2PermissionForTransit;
import vn.gt.tichhop.report.PortClearance.Export2IssuePortClearance;
import vn.gt.tichhop.report.PttndPortClearance.Export2PttndPortClearance;
import vn.gt.tichhop.report.PttndAcceptance.Export2PttndAcceptance;
import vn.gt.tichhop.report.PttndCrewList.Export2PttndCrewList;
import vn.gt.tichhop.report.PttndGeneralDeclaration.Export2PttndGeneralDeclaration;
import vn.gt.tichhop.report.PttndPassengerList.Export2PttndPassengerList;
import vn.gt.tichhop.report.ShiftingOrder.Export2ShiftingOrder;
import vn.gt.tichhop.report.ShipSecurityNotification.ExportShipSecurityNotification;
import vn.gt.tichhop.report.ShipStoresDeclaration.Export2ShipStoresDeclaration;
import vn.gt.utils.PageType;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;

public class ReportsBusinessUtils {

	private static Log _log = LogFactoryUtil.getLog(ReportsBusinessUtils.class);

	private String realPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString();
	private String pathFileTemp = realPath.substring(realPath.lastIndexOf(":"), realPath.lastIndexOf("/WEB-INF"))
			.replaceFirst(":", "") + "/report/";
	private String pathFileSub = realPath.substring(realPath.lastIndexOf(":"), realPath.lastIndexOf("/WEB-INF"))
			.replaceFirst(":", "") + "/export/";

	private String pathFileTemp_upgrade_1 = realPath
			.substring(realPath.lastIndexOf(":"), realPath.lastIndexOf("/WEB-INF")).replaceFirst(":", "")
			+ "/report_upgrade_1/";

	// private String
	// pathFileTemp="/home/binhth/MEGAsync/SERVER/liferay-portal-6.1.0-ce-ga1/tomcat-7.0.23/webapps/TichHopGiaoThong-portlet/report/";
	// private String
	// pathFileSub="/home/binhth/MEGAsync/SERVER/liferay-portal-6.1.0-ce-ga1/tomcat-7.0.23/webapps/TichHopGiaoThong-portlet/export/";
	public static Long actionExport(String requestCode, int documentName, int documentYear, int messageTypeReport,
			String loaiThuTuc) throws Exception {

		_log.info("--BEGIN EXPORT ACTION ------requestCode==" + requestCode + "=======messageTypeReport="
				+ messageTypeReport + "------documentName==" + documentName + "=======documentYear=" + documentYear
				+ "================loaiThuTuc" + loaiThuTuc);

		long nanoTimePDF = 0;

		if (messageTypeReport == MessageType.BAN_KHAI_AN_NINH_TAU_BIEN) {
			ExportShipSecurityNotification action = new ExportShipSecurityNotification();
			nanoTimePDF = action.export_ShipSecurityNotification(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.THONG_BAO_TAU_DEN_CANG
				|| messageTypeReport == MessageType.THONG_BAO_TAU_ROI_CANG
				|| messageTypeReport == MessageType.THONG_BAO_TAU_QUA_CANH) {

			Export2NoticeOfArrival action = new Export2NoticeOfArrival();
			nanoTimePDF = action.export_NoticeOfArrival(requestCode, documentName, documentYear,
					PageType.TYPE_THONG_BAO_TAU_DEN_CANG, messageTypeReport, loaiThuTuc);

		} else if (messageTypeReport == MessageType.XAC_BAO_TAU_DEN_CANG
				|| messageTypeReport == MessageType.XAC_BAO_TAU_ROI_CANG
				|| messageTypeReport == MessageType.XAC_BAO_TAU_QUA_CANH) {

			Export2NoticeOfArrival action = new Export2NoticeOfArrival();
			nanoTimePDF = action.export_NoticeOfArrival(requestCode, documentName, documentYear,
					PageType.TYPE_XAC_BAO_TAU_DEN_CANG, messageTypeReport, loaiThuTuc);

		} else if (messageTypeReport == MessageType.BAN_KHAI_HANG_HOA) {
			ExportCargoDeclaration action = new ExportCargoDeclaration();
			nanoTimePDF = action.export_CargoDeclaration(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN) {
			if (loaiThuTuc.equalsIgnoreCase(MessageType.TAU_VAO_PTTND + "")
					|| loaiThuTuc.equalsIgnoreCase(MessageType.TAU_RA_PTTND + "")) {
				Export2PttndCrewList action = new Export2PttndCrewList();
				nanoTimePDF = action.Export2PttndCrewList(requestCode, documentName, documentYear, loaiThuTuc);
			} else {
				Export2CrewList action = new Export2CrewList();
				nanoTimePDF = action.export2CrewList(requestCode, documentName, documentYear, loaiThuTuc);
			}

		} else if (messageTypeReport == MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH) {
			if (loaiThuTuc.equalsIgnoreCase(MessageType.TAU_VAO_PTTND + "")
					|| loaiThuTuc.equalsIgnoreCase(MessageType.TAU_RA_PTTND + "")) {
				Export2PttndPassengerList action = new Export2PttndPassengerList();
				nanoTimePDF = action.Export2PttndPassengerList(requestCode, documentName, documentYear, loaiThuTuc);
			} else {
				Export2PassengerList action = new Export2PassengerList();
				nanoTimePDF = action.export2PassengerList(requestCode, documentName, documentYear, loaiThuTuc);
			}

		} else if (messageTypeReport == MessageType.BAN_KHAI_KIEM_DICH_THUC_VAT) {
			Export2DeclarationForPlantQuarantine action = new Export2DeclarationForPlantQuarantine();
			nanoTimePDF = action.export2DeclarationForPlantQuarantine(requestCode, documentName, documentYear,
					loaiThuTuc);

		} else if (messageTypeReport == MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN) {
			Export2CrewEffectsDeclaration action = new Export2CrewEffectsDeclaration();
			nanoTimePDF = action.export2CrewEffectsDeclaration(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.BAN_KHAI_DANH_SACH_HANG_HOA_NGUY_HIEM) {
			Export2DangerousGoodsManifest action = new Export2DangerousGoodsManifest();
			nanoTimePDF = action.export2DangerousGoodsManifest(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.BAN_KHAI_KIEM_DICH_DONG_VAT) {
			Export2DeclarationForAnimalQuarantine action = new Export2DeclarationForAnimalQuarantine();
			nanoTimePDF = action.export2DeclarationForAnimalQuarantine(requestCode, documentName, documentYear,
					loaiThuTuc);

		} else if (messageTypeReport == MessageType.BAN_KHAI_CHUNG) {
			if (loaiThuTuc.equalsIgnoreCase(MessageType.TAU_VAO_PTTND + "")
					|| loaiThuTuc.equalsIgnoreCase(MessageType.TAU_RA_PTTND + "")) {
				Export2PttndGeneralDeclaration action = new Export2PttndGeneralDeclaration();
				nanoTimePDF = action.Export2PttndGeneralDeclaration(requestCode, documentName, documentYear,
						loaiThuTuc);
			} else {
				Export2GeneralDeclaration action = new Export2GeneralDeclaration();
				nanoTimePDF = action.export2GeneralDeclaration(requestCode, documentName, documentYear, loaiThuTuc);
			}

		} else if (messageTypeReport == MessageType.LENH_DIEU_DONG) {
			Export2ShiftingOrder action = new Export2ShiftingOrder();
			nanoTimePDF = action.export2ShiftingOrder(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.BAN_KHAI_DU_TRU_CUA_TAU) {
			Export2ShipStoresDeclaration action = new Export2ShipStoresDeclaration();
			nanoTimePDF = action.exportShipStoresDeclaration(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI) {
			Export2DeclarationOfHealth action = new Export2DeclarationOfHealth();
			nanoTimePDF = action.export2DeclarationOfHealth(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.GIAY_PHEP_QUA_CANH) {
			Export2PermissionForTransit action = new Export2PermissionForTransit();
			nanoTimePDF = action.export2PermissionForTransit(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH) {
			// if (documentType!=null &&documentType.equals("XC")) {
			Export2IssuePortClearance action = new Export2IssuePortClearance();
			nanoTimePDF = action.export2PortClearance(requestCode, documentName, documentYear, loaiThuTuc);

		} else if (messageTypeReport == MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN) {
			_log.info("PTTND   GIAY_PHEP_ROI_CANG_CHO_TAU_DEN");
			Export2PttndPortClearance action = new Export2PttndPortClearance();
			nanoTimePDF = action.export2PortClearance(requestCode, documentName, documentYear, loaiThuTuc);
		} else if (messageTypeReport == MessageType.PTTND_GIAY_PHEP_VAO_CANG) {
			_log.info("PTTND_GIAY_PHEP_VAO_CANG");
			Export2PttndAcceptance action = new Export2PttndAcceptance();
			nanoTimePDF = action.export2IssueAcceptance(requestCode, documentName, documentYear, loaiThuTuc);
		}

		return nanoTimePDF;
	}

	public static Long checkDigitalAttachedFile(User userLogin, String requestCode, int messageTypeReport,
			String loaiThuTuc) throws Exception {

		_log.info("--BEGIN checkDigitalAttachedFile---requestCode==" + requestCode + "==MessageTypeReport="
				+ messageTypeReport);

		long digitalAttachedFile = 0;

		if (messageTypeReport == MessageType.LENH_DIEU_DONG) {
			_log.info("--BEGIN checkDigitalAttachedFile---requestCode==");
			IssueShiftingOrder digitalAttached = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCode);
			if (Validator.isNotNull(digitalAttached)) {
				if (Validator.isNotNull(digitalAttached.getAttachedFile())) {
					_log.info("--BEGIN LENH_DIEU_DONG- getAttachedFile--requestCode=="
							+ digitalAttached.getAttachedFile());
					return digitalAttached.getAttachedFile();

				}
			}
		} else if (messageTypeReport == MessageType.GIAY_PHEP_QUA_CANH) {
			IssuePermissionForTransit forTransit = IssuePermissionForTransitLocalServiceUtil
					.getByrequestCode(requestCode);
			if (Validator.isNotNull(forTransit)) {
				if (Validator.isNotNull(forTransit.getAttachedFile())) {
					return forTransit.getAttachedFile();
				}
			}

		} else if (messageTypeReport == MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH) {
			IssuePortClearance portClearance = IssuePortClearanceLocalServiceUtil.getByRequestCode(requestCode);
			if (Validator.isNotNull(portClearance)) {
				if (Validator.isNotNull(portClearance.getAttachedFile())) {
					return portClearance.getAttachedFile();
				}
			}
		} else if (messageTypeReport == MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN) {
			IssuePortClearance portClearance = IssuePortClearanceLocalServiceUtil.getByRequestCode(requestCode);
			if (Validator.isNotNull(portClearance)) {
				if (Validator.isNotNull(portClearance.getAttachedFile())) {
					return portClearance.getAttachedFile();
				}
			}
		} else if (messageTypeReport == MessageType.PTTND_GIAY_PHEP_VAO_CANG) {
			IssueAcceptance issueAcceptance = IssueAcceptanceLocalServiceUtil.getByRequestCode(requestCode);
			if (Validator.isNotNull(issueAcceptance)) {
				if (Validator.isNotNull(issueAcceptance.getAttachedFile())) {
					return issueAcceptance.getAttachedFile();
				}
			}
		}

		return digitalAttachedFile;
	}

	/*
	 * Function Export to Server
	 * 
	 */
	public long exportFunction(String tenFile_Template, String tenFile_Export, JRDataSource dataSource, Map parameters)
			throws IOException, PortletException {
		long nanoTime = System.nanoTime();
		try {
			_log.info("----- END EXPORT SERVER ---" + pathFileSub);
			_log.info("----- END EXPORT SERVER ---" + pathFileTemp + "..." + tenFile_Template);
			InputStream inputStream = new FileInputStream(pathFileTemp + tenFile_Template);
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

			parameters.put("SUBREPORT_DIR", pathFileTemp);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

			JasperExportManager.exportReportToPdfFile(jasperPrint, pathFileSub + nanoTime + "_" + tenFile_Export);

			return nanoTime;
		} catch (Exception e) {
			_log.error("---LOI EXPORT ---" + e);
			return 0;
		}
	}

	public long exportFunctionUpgrade(String tenFile_Template, String tenFile_Export, JRDataSource dataSource,
			Map parameters) throws IOException, PortletException {
		long nanoTime = System.nanoTime();
		try {
			_log.info("----- END EXPORT SERVER ---" + pathFileSub);
			_log.info("----- END EXPORT SERVER ---" + pathFileTemp_upgrade_1 + "..." + tenFile_Template);
			InputStream inputStream = new FileInputStream(pathFileTemp_upgrade_1 + tenFile_Template);
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

			parameters.put("SUBREPORT_DIR", pathFileTemp_upgrade_1);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

			JasperExportManager.exportReportToPdfFile(jasperPrint, pathFileSub + nanoTime + "_" + tenFile_Export);

			return nanoTime;
		} catch (Exception e) {
			_log.error("---LOI EXPORT ---" + e);
			return 0;
		}
	}

	public String getTemplateReportFilePath(ActionRequest actionRequest, String fileName) {
		return actionRequest.getPortletSession().getPortletContext().getRealPath("/").replace("/", File.separator)
				.replace(File.separator + ".", "") + "report" + File.separator + fileName;
	}

	public String getSubTemplatePath(ActionRequest actionRequest) {
		return actionRequest.getPortletSession().getPortletContext().getRealPath("/").replace("/", File.separator)
				.replace(File.separator + ".", "") + "report" + File.separator;
	}

	public static String taoSo(String keyData, int maxChar) {

		String taoSo = "";
		try {

			long count = taoGiaTriThamSo(keyData);
			taoSo = count + "";
			// int VR_SIZE_SO_DANG_KY_KIEM_TRA =
			// DKConfigurationManager.getIntProp("VR_SIZE_SO_DANG_KY_KIEM_TRA",
			// 6);
			int size = maxChar - taoSo.length();
			if (size > 0) {
				for (int i = 0; i < size; i++) {
					taoSo = "0" + taoSo;
				}
			} else if (size < 0) {

				ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyData(keyData);
				taoSo = "1";
				thamSoHeThong.setValueData(taoSo);
				ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
				for (int i = 1; i < maxChar; i++) {
					taoSo = "0" + taoSo;
				}
				taoSo = "0" + taoSo;

			}

		} catch (Exception e) {
			_log.error(e);
		}
		return taoSo;
	}

	public static String taoSo(String keyData, String description, int maxChar) {

		String taoSo = "";
		try {

			long count = taoGiaTriThamSo(keyData, description);
			taoSo = count + "";

			int size = maxChar - taoSo.length();
			if (size > 0) {
				for (int i = 0; i < size; i++) {
					taoSo = "0" + taoSo;
				}
			} else if (size < 0) {

				ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyDataAndDescription(keyData,
						description);
				taoSo = "1";
				thamSoHeThong.setValueData(taoSo);
				ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
				for (int i = 1; i < maxChar; i++) {
					taoSo = "0" + taoSo;
				}
				taoSo = "0" + taoSo;

			}

			taoSo = description + taoSo;

		} catch (Exception e) {
			_log.error(e);
		}
		return taoSo;
	}

	public static long taoGiaTriThamSo(String keyData) throws SystemException {
		ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyData(keyData);
		long count = 1;
		if (thamSoHeThong == null) {
			thamSoHeThong = new ThamSoHeThongImpl();
			thamSoHeThong.setDescription("");
			thamSoHeThong.setKeyData(keyData);
			thamSoHeThong.setValueData(count + "");

			ThamSoHeThongLocalServiceUtil.addThamSoHeThong(thamSoHeThong);

		} else {
			count = Long.valueOf(thamSoHeThong.getValueData()) + 1;
			thamSoHeThong.setValueData(count + "");
			ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
		}
		return count;
	}

	public static long taoGiaTriThamSo(String keyData, String description) throws SystemException {
		ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyDataAndDescription(keyData, description);
		long count = 1;
		if (thamSoHeThong == null) {
			thamSoHeThong = new ThamSoHeThongImpl();
			thamSoHeThong.setDescription(description);
			thamSoHeThong.setKeyData(keyData);
			thamSoHeThong.setValueData(count + "");

			ThamSoHeThongLocalServiceUtil.addThamSoHeThong(thamSoHeThong);

		} else {
			count = Long.valueOf(thamSoHeThong.getValueData()) + 1;
			thamSoHeThong.setValueData(count + "");
			ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
		}
		return count;
	}
}
