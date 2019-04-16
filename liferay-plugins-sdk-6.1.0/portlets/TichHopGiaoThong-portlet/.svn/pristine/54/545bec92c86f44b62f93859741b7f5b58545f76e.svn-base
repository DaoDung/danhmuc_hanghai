package vn.gt.portlet.thutuc;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.store.DLStoreUtil;

import vgca.svrsigner.ServerSigner;
import vn.gt.dao.common.model.UserPort;
import vn.gt.dao.common.model.UserSign;
import vn.gt.dao.common.service.UserPortLocalServiceUtil;
import vn.gt.dao.common.service.UserSignLocalServiceUtil;
import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit;
import vn.gt.dao.noticeandmessage.model.IssuePortClearance;
import vn.gt.dao.noticeandmessage.model.IssueShiftingOrder;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil;
import vn.gt.portlet.kehoach.ExtractTextLocations;
import vn.gt.tichhop.message.MessageType;
import vn.gt.tichhop.report.FileUploadUtils;
import vn.gt.tichhop.report.ReportConstant;
import vn.gt.tichhop.report.ReportUtils;
import vn.gt.utils.ConvertUtil;
import vn.gt.utils.KeyParams;
import vn.gt.utils.PageType;
import vn.gt.utils.config.ConfigurationManager;

public class SignatureUtil {
	public static Log log = LogFactoryUtil.getLog(SignatureUtil.class);

	public static void main(String[] args) {
		log.info("------genComputerHashByNoiDungHoSo-----");

		try {

			String realExportPath = "/Users/binhth/Documents/dev/hanghai/sdk-hanghai/dist/";

			// String filePath = realExportPath +
			// "22813488806713630_PortClearance.temp.pdf";
			String filePath = realExportPath + "22813488806713630_PortClearance.pdf";

			String imageBase64 = StringPool.BLANK;
			String cer = realExportPath;
			String cerPath = cer + "VTU" + ".cer";
			String signImagePath = "";
			String imgsrc = realExportPath;
			// signImagePath = imgsrc + "VTU_condau" + ".png";
			// signImagePath = imgsrc + "VTU_kyso" + ".png";
			signImagePath = imgsrc + "giao_thong22339958045648813" + ".png";

			log.info("------------cerPath: " + cerPath);
			log.info("------------signImagePath: " + signImagePath);

			BufferedImage bufferedImage = null;

			imageBase64 = SignatureUtil.getSignatureImageBase64ByPath(signImagePath);
			bufferedImage = SignatureUtil.getImageByPath(signImagePath);
			bufferedImage = null;
			log.info("--------urlFile: " + filePath);

			// tinh toa do chu ky
			ExtractTextLocations textLocation = new ExtractTextLocations(filePath);

			int pageSize = textLocation.getPageSize();
			System.out.println("SignatureUtil.main()" + pageSize);
			// doc file cer tren server
			Certificate cert = null;

			cert = SignatureUtil.getCertificateByPath(cerPath);

			ServerSigner signer = SignatureUtil.getServerSigner(filePath, cert, imageBase64);

			log.info("---------thu tuc----signer: " + signer + "----filePath:" + filePath);

			// tinh kich thuoc cua anh

			int signatureImageWidth = 200;

			int signatureImageHeight = 200;
			float llx = textLocation.getAnchorX();

			float urx = llx + signatureImageWidth / 3;

			float lly = textLocation.getPageURY() - textLocation.getAnchorY() - signatureImageHeight / 3;

			float ury = lly + signatureImageHeight / 3;

			signer.setSignatureAppearance(PdfSignatureAppearance.RenderingMode.GRAPHIC_AND_DESCRIPTION);

			byte[] inHash = null;

			int type = 2;

			float destLLx = llx + 20;
			float destLLy = lly - 125;
			float destURx = urx + 154;
			float destURy = ury - 80;
			if (type == 2) {
				destLLx = llx + 20;
				destLLy = lly + 15;
				destURx = urx + 154;
				destURy = ury + 0;
			}

			// float destLLx = 630;
			// float destLLy = 15;
			// float destURx = 800;
			// float destURy = 75;
			// float destLLx = 590;
			// float destLLy = 80;
			// float destURx = 800;
			// float destURy = 140;
			// llx + 20, lly - 20, urx + 94, ury + 5
			// inHash = signer.computeHash(new Rectangle(destLLx, destLLy,
			// destURx, destURy), pageSize);
			inHash = signer.computeHash(new Rectangle(destLLx, destLLy, destURx, destURy), pageSize);
			String fieldName = StringPool.BLANK;

			fieldName = signer.getSignatureName();

			log.info("---------llx: " + llx);
			log.info("---------lly: " + lly);
			log.info("---------urx: " + urx);
			log.info("---------ury: " + ury);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void genComputerHashByNoiDungHoSo(ResourceRequest resourceRequest, ResourceResponse resourceResponse,
			String filePath, long documentName, int documentYear, int messageType, long groupId, int type)
			throws IOException {

		log.info("------genComputerHashByNoiDungHoSo-----");

		long userId = PortalUtil.getUserId(resourceRequest);
		byte[] inHash = null;
		// String filePath2 = "";
		String fieldName = StringPool.BLANK;
		String tenDangNhap = "";

		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONArray hashComputers = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray signFieldNames = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray filePaths = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray messages = JSONFactoryUtil.getJSONFactory().createJSONArray();
		// JSONArray _url_vehicle =
		// JSONFactoryUtil.getJSONFactory().createJSONArray();
		// JSONArray _id_vehicle =
		// JSONFactoryUtil.getJSONFactory().createJSONArray();

		// lay primarykey chu ky chon theo usersign
		long userSignId = ParamUtil.getLong(resourceRequest, "userSignId");
		UserSign userSign = null;

		try {
			// if(userSignId > 0) {
			// // lay thong tin chu ky theo user chon
			// userSign = UserSignLocalServiceUtil.getUserSign(userSignId);
			// }
			// SONVH 20170619 lay thong tin ky so theo user dang nhap
			userSign = UserSignLocalServiceUtil.getByUserId(userId);
			// String realExportPathTmp = request.getContextPath();
			User user = UserLocalServiceUtil.fetchUser(PortalUtil.getUserId(resourceRequest));
			if (user != null) {
				tenDangNhap = user.getScreenName();
			}
			log.info("---tenDangNhap--" + tenDangNhap);

			String realPath = ReportUtils.getTemplateReportFilePath(resourceRequest);
			String realExportPath = realPath + "chuky/";

			String imageBase64 = StringPool.BLANK;
			// String cer =
			// "/opt/liferay/jboss-7.0.2/standalone/deployments/TichHopGiaoThong-portlet.war/chuky/";
			String cer = realExportPath;
			String cerPath = cer + tenDangNhap + ".cer";
			String signImagePath = "";
			// String imgsrc =
			// "/opt/liferay/jboss-7.0.2/standalone/deployments/TichHopGiaoThong-portlet.war/chuky/";
			String imgsrc = realExportPath;
			signImagePath = imgsrc + tenDangNhap + ".png";

			BufferedImage bufferedImage = null;

			if (userSign != null && ((type == 1 && userSign.getFileChuKyId() > 0)
					|| (type == 2 && userSign.getFileConDauId() > 0))) {
				long userFileKy = 0;
				if (type == 1) {
					userFileKy = userSign.getFileChuKyId();
				} else if (type == 2) {
					userFileKy = userSign.getFileConDauId();
				}

				DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(userFileKy);
				InputStream inputStream = DLStoreUtil.getFileAsStream(fileEntry.getCompanyId(), fileEntry.getFolderId(),
						fileEntry.getName());

				imageBase64 = SignatureUtil.getSignatureImageBase64ByInputStream(inputStream);

				inputStream = DLStoreUtil.getFileAsStream(fileEntry.getCompanyId(), fileEntry.getFolderId(),
						fileEntry.getName());

				bufferedImage = SignatureUtil.getImageByInputStream(inputStream);
			} else {
				imageBase64 = SignatureUtil.getSignatureImageBase64ByPath(signImagePath);
				bufferedImage = SignatureUtil.getImageByPath(signImagePath);
			}

			log.info("------------typetypetypetypetypetypetype bufferedImage: " + bufferedImage);

			// String urlFile = StringPool.BLANK;
			// urlFile = PortalUtil.getPortalURL(request);
			// urlFile = urlFile +
			// DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(noidungHoSo.getTaiLieuDinhKem());

			log.info("--------urlFile: " + filePath);

			// tinh toa do chu ky
			ExtractTextLocations textLocation = new ExtractTextLocations(filePath);

			int pageSize = textLocation.getPageSize();

			log.info("--------thu tuc--" + textLocation.getAnchorX() + "-" + textLocation.getAnchorY());

			log.info("--------thu tuc---" + textLocation.getPageLLX() + "-" + textLocation.getPageURX() + "-"
					+ textLocation.getPageLLY() + "-" + textLocation.getPageURY());

			// doc file cer tren server
			Certificate cert = null;

			if (userSign != null && userSign.getFileChungThuSoId() > 0) {
				DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(userSign.getFileChungThuSoId());
				InputStream inputStream = DLStoreUtil.getFileAsStream(fileEntry.getCompanyId(), fileEntry.getFolderId(),
						fileEntry.getName());

				cert = SignatureUtil.getCertificateByInputStream(inputStream);
			} else {
				cert = SignatureUtil.getCertificateByPath(cerPath);
			}
			ServerSigner signer = SignatureUtil.getServerSigner(filePath, cert, imageBase64);

			log.info("------------typetypetypetypetypetypetype: " + type);
			log.info("------------typetypetypetypetypetypetype (userSign != null && userSign.getFileChuKyId() > 0): "
					+ (userSign != null && userSign.getFileChuKyId() > 0));
			log.info("------------typetypetypetypetypetypetype (userSign != null && userSign.getFileConDauId() > 0): "
					+ (userSign != null && userSign.getFileConDauId() > 0));
			
			log.info("---------thu tuc----signer: " + signer + "----filePath:" + filePath);

			// tinh kich thuoc cua anh

			// int signatureImageWidth = (bufferedImage != null &&
			// bufferedImage.getWidth() > 0) ? bufferedImage.getWidth() : 80;
			//
			// int signatureImageHeight = (bufferedImage != null &&
			// bufferedImage.getHeight() > 0) ? bufferedImage.getHeight() : 80;

			int signatureImageWidth = 200;

			int signatureImageHeight = 200;

			float llx = textLocation.getAnchorX();

			float urx = llx + signatureImageWidth / 3;

			float lly = textLocation.getPageURY() - textLocation.getAnchorY() - signatureImageHeight / 3;

			float ury = lly + signatureImageHeight / 3;

			signer.setSignatureAppearance(PdfSignatureAppearance.RenderingMode.GRAPHIC_AND_DESCRIPTION);

			float destLLx = llx + 20;
			float destLLy = lly - 125;
			float destURx = urx + 154;
			float destURy = ury - 80;
			if (type == 2) {
				destLLx = llx + 20;
				destLLy = lly + 15;
				destURx = urx + 154;
				destURy = ury + 0;
			}

			inHash = signer.computeHash(new Rectangle(destLLx, destLLy, destURx, destURy), pageSize);

			fieldName = signer.getSignatureName();
			signFieldNames.put(fieldName);
			hashComputers.put(Base64.encode(inHash));
			filePaths.put(filePath);
			log.info("*****thu tuc********inHash: " + inHash + "-----thu tuc------fieldName: " + fieldName
					+ "---thu tuc-------filePath: " + filePath);
			if (userSign != null && ((type == 1 && userSign.getFileChuKyId() > 0)
					|| (type == 2 && userSign.getFileConDauId() > 0))) {
				messages.put("success");
				
//				if (messageType == 60) {
//					List<IssuePortClearance> results = IssuePortClearanceLocalServiceUtil
//							.findByDocumentYearAndDocumentYearOrderByColumn(documentName, documentYear, KeyParams.ID,
//									KeyParams.ORDER_BY_DESC);
//					
//					if (Validator.isNotNull(results) && results.size() > 0) {
//						IssuePortClearance shiftOrder = results.get(0);
//						try {
//
//							ServiceContext serviceContext = ServiceContextFactory.getInstance(TempDocument.class.getName(),
//									resourceRequest);
//							
//							String newPath = filePath.replaceAll(".pdf", ".signed.pdf");
//							
//							File file = new File(newPath);
//							
//							long fileEntryId = 0;
//								
//							fileEntryId = shiftOrder.getAttachedFile();
//							
//							FileEntry fileEntry = FileUploadUtils.uploadFile(userId, groupId, fileEntryId, file,
//									newPath, null, null, serviceContext);
//							
//							shiftOrder.setAttachedFile(fileEntry.getFileEntryId());
//							
//							IssuePortClearanceLocalServiceUtil.updateIssuePortClearance(shiftOrder);
//							
//						} catch (Exception e) {
//							_log.error(e);
//						}
//					}
//				} else if (messageType == 90) {
//					List<IssuePermissionForTransit> results = IssuePermissionForTransitLocalServiceUtil
//							.findByDocumentYearAndDocumentYearOrderByColumn(documentName, documentYear, KeyParams.ID,
//									KeyParams.ORDER_BY_DESC);
//					
//					if (Validator.isNotNull(results) && results.size() > 0) {
//						IssuePermissionForTransit shiftOrder = results.get(0);
//						try {
//
//							ServiceContext serviceContext = ServiceContextFactory.getInstance(TempDocument.class.getName(),
//									resourceRequest);
//							
//							String newPath = filePath.replaceAll(".pdf", ".signed.pdf");
//							
//							File file = new File(newPath);
//							
//							long fileEntryId = 0;
//								
//							fileEntryId = shiftOrder.getAttachedFile();
//							
//							FileEntry fileEntry = FileUploadUtils.uploadFile(userId, groupId, fileEntryId, file,
//									newPath, null, null, serviceContext);
//							
//							shiftOrder.setAttachedFile(fileEntry.getFileEntryId());
//							
//							IssuePermissionForTransitLocalServiceUtil.updateIssuePermissionForTransit(shiftOrder);
//							
//						} catch (Exception e) {
//							_log.error(e);
//						}
//					}
//				}
			} else {
				messages.put(
						"K\u00FD s\u1ED1, \u0111\u00F3ng d\u1EA5u kh\u00F4ng th\u00E0nh c\u00F4ng, th\u1EF1c hi\u1EC7n l\u1EA1i");
			}
		} catch (Exception e) {
			messages.put("Error signature filePath: " + filePath);
			hashComputers.put(StringPool.BLANK);
			signFieldNames.put(StringPool.BLANK);
			filePaths.put(filePath);
			log.error(e);
		}

		log.info("-----------hashComputers: " + hashComputers);

		jsonFeed.put("hashComputers", hashComputers);
		jsonFeed.put("signFieldNames", signFieldNames);
		jsonFeed.put("filePaths", filePaths);
		jsonFeed.put("msg", messages);
		log.info("-----------messages: " + messages);
		log.info("-----------filePaths: " + filePaths);

		PrintWriter out = resourceResponse.getWriter();
		out.print(jsonFeed.toString());
	}

	public static String makeReportFille(ResourceRequest resourceRequest, long documentName, String tieuDe,
			int actionType) throws SystemException, Exception, PortalException {
		log.info("----vao`-makeReportFille-----");
		String fileName = "";
		long userId = PortalUtil.getUserId(resourceRequest);
		String nanoTimePDF = ParamUtil.getString(resourceRequest, "nanoTimePDF");
		String messageType = ParamUtil.getString(resourceRequest, PageType.MESSAGE_TYPE);
		log.info("--999999999--`-nanoTimePDF----9999999-" + nanoTimePDF);
		String realPath = ReportUtils.getTemplateReportFilePath(resourceRequest);
		String urlFile = realPath + "export/" + nanoTimePDF;
		if (MessageType.GIAY_PHEP_QUA_CANH == ConvertUtil.convertToLong(messageType)) {
			urlFile = urlFile + "_" + ReportConstant.PERMISSION_FOR_TRANSIT_EXPORT;
			log.info("--thu tuc--urlFile----thu tuc giay phep qua canh-" + urlFile);

		} else if (MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH == ConvertUtil.convertToLong(messageType)) {
			urlFile = urlFile + "_" + ReportConstant.ISSUE_PORT_CLEARANCE_EXPORT;
			log.info("--thu tuc--urlFile----thu tuc giay phep roi cang-" + urlFile);

		} else if (MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN == ConvertUtil.convertToLong(messageType)) {
			urlFile = urlFile + "_" + ReportConstant.PTTND_PORTCLEARANCE_EXPORT;
			log.info("--thu tuc--urlFile----thu tuc giay phep roi cang PTTND-" + urlFile);

		} else if (MessageType.PTTND_GIAY_PHEP_VAO_CANG == ConvertUtil.convertToLong(messageType)) {
			urlFile = urlFile + "_" + ReportConstant.PTTND_ACCEPTANCE_EXPORT;
			log.info("--thu tuc--urlFile----thu tuc giay phep vao cang PTTND-" + urlFile);

		} else if (MessageType.LENH_DIEU_DONG == ConvertUtil.convertToLong(messageType)) {
			urlFile = urlFile + "_" + ReportConstant.SHIFTING_ORDER_EXPORT;

			log.info("--thu tuc--urlFile----thu tuc ky lenh dieu dong-" + urlFile);
		}
		return urlFile;

	}

	public static void genComputerHashByNoiDungHoSoDongDau(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse, String filePath, long documentName)
			throws IOException, PortalException, SystemException {
		log.info("------vao 0 genComputerHashByNoiDungHoSo-----");
		long userId = PortalUtil.getUserId(resourceRequest);
		byte[] inHash = null;
		String filePath2 = "";
		String fieldName = StringPool.BLANK;
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		String tenDangNhap = "";
		String cangvu = "";

		JSONArray hashComputers = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray signFieldNames = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray filePaths = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray messages = JSONFactoryUtil.getJSONFactory().createJSONArray();

		User userLogin = PortalUtil.getUser(resourceRequest);
		UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());

		if (Validator.isNull(portDefault)) {
			// not do something
		} else {
			DmMaritime byMaritimeCode = DmMaritimeLocalServiceUtil.getByMaritimeCode(portDefault.getPortCode());
			cangvu = byMaritimeCode.getMaritimeReference();
		}

		// long userSignId = ParamUtil.getLong(resourceRequest, "userSignId");
		UserSign userSign = null;

		try {
			// if(userSignId > 0) {
			// lay thong tin dong dau theo user dang nhap
			userSign = UserSignLocalServiceUtil.getByUserId(userId);
			// }

			// String realExportPathTmp = request.getContextPath();
			User user = UserLocalServiceUtil.fetchUser(userId);
			if (user != null) {
				tenDangNhap = user.getScreenName();

			}
			log.info("***************************tenDangNhap: " + tenDangNhap);

			log.info("***********55555555555555555555****************cangvu: " + cangvu);

			String realPath = ReportUtils.getTemplateReportFilePath(resourceRequest);
			String realExportPath = realPath + "chuky/";

			String imageBase64 = StringPool.BLANK;
			String cer = realExportPath;
			String cerPath = cer + cangvu + ".cer";
			String signImagePath = "";
			String imgsrc = realExportPath;
			signImagePath = imgsrc + cangvu + "_condau.png";

			log.info("***************************cerPath: " + cerPath);
			log.info("***************************signImagePath: " + signImagePath);

			BufferedImage bufferedImage = null;

			if (userSign != null && userSign.getFileConDauId() > 0) {
				DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(userSign.getFileConDauId());
				InputStream inputStream = DLStoreUtil.getFileAsStream(fileEntry.getCompanyId(), fileEntry.getFolderId(),
						fileEntry.getName());

				imageBase64 = SignatureUtil.getSignatureImageBase64ByInputStream(inputStream);
				bufferedImage = SignatureUtil.getImageByInputStream(inputStream);
			} else {
				imageBase64 = SignatureUtil.getSignatureImageBase64ByPath(signImagePath);
				bufferedImage = SignatureUtil.getImageByPath(signImagePath);
			}

			// String urlFile = StringPool.BLANK;
			//
			// urlFile = PortalUtil.getPortalURL(request);
			//
			// urlFile = urlFile +
			// DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(noidungHoSo.getTaiLieuDinhKem());

			log.info("***************************urlFile: " + filePath);

			// tinh toa do chu ky
			ExtractTextLocations textLocation = new ExtractTextLocations(filePath);

			log.info("*********************************" + textLocation.getAnchorX() + "-" + textLocation.getAnchorY()
					+ "********************************");

			log.info("*********************************" + textLocation.getPageLLX() + "-" + textLocation.getPageURX()
					+ "-" + textLocation.getPageLLY() + "-" + textLocation.getPageURY()
					+ "*******************************");

			// doc file cer tren server
			Certificate cert = null;

			if (userSign != null && userSign.getFileChungThuSoId() > 0) {
				DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(userSign.getFileChungThuSoId());
				InputStream inputStream = DLStoreUtil.getFileAsStream(fileEntry.getCompanyId(), fileEntry.getFolderId(),
						fileEntry.getName());

				cert = SignatureUtil.getCertificateByInputStream(inputStream);
			} else {
				cert = SignatureUtil.getCertificateByPath(cerPath);
			}

			ServerSigner signer = SignatureUtil.getServerSigner(filePath, cert, imageBase64);

			log.info("***************************signer: " + signer + "*******filePath:" + filePath);

			// tinh kich thuoc cua anh

			int signatureImageWidth = (bufferedImage != null && bufferedImage.getWidth() > 0) ? bufferedImage.getWidth()
					: 80;

			int signatureImageHeight = (bufferedImage != null && bufferedImage.getHeight() > 0)
					? bufferedImage.getHeight() : 80;
			float llx = textLocation.getAnchorX();

			float urx = llx + signatureImageWidth / 3;

			float lly = textLocation.getPageURY() - textLocation.getAnchorY() - signatureImageHeight / 3;

			float ury = lly + signatureImageHeight / 3;

			// Sonvh comment truong hop khong hien thi anh dau.
			// signer.setSignatureAppearance(PdfSignatureAppearance.RenderingMode.GRAPHIC_AND_DESCRIPTION);
			// inHash = signer.computeHash(new Rectangle(llx, lly, urx, ury),
			// 1);
			inHash = signer.computeHash(new Rectangle(llx + 20, lly - 20, urx + 94, ury + 5), 1);

			fieldName = signer.getSignatureName();
			signFieldNames.put(fieldName);
			hashComputers.put(Base64.encode(inHash));
			filePaths.put(filePath);
			log.info("**************inHash: " + inHash + "-----------fieldName: " + fieldName + "----------filePath: "
					+ filePath);
			messages.put("success");
		} catch (Exception e) {
			messages.put("Error signature filePath: " + filePath);
			hashComputers.put(StringPool.BLANK);
			signFieldNames.put(StringPool.BLANK);
			filePaths.put(filePath);
			log.error(e);
		}

		jsonFeed.put("hashComputers", hashComputers);
		jsonFeed.put("signFieldNames", signFieldNames);
		jsonFeed.put("filePaths", filePaths);
		jsonFeed.put("msg", messages);

		PrintWriter out = resourceResponse.getWriter();
		out.print(jsonFeed.toString());
	}

	public static Certificate getCertificateByPath(String path)
			throws CertificateException, FileNotFoundException, URISyntaxException {
		return getCertificateByInputStream(new FileInputStream(new File(path)));
	}

	public static Certificate getCertificateByURL(String url)
			throws CertificateException, FileNotFoundException, URISyntaxException {
		return getCertificateByInputStream(new FileInputStream(new File(new URI(url))));
	}

	public static Certificate getCertificateByInputStream(InputStream inputStream)
			throws CertificateException, FileNotFoundException, URISyntaxException {
		CertificateFactory cf = CertificateFactory.getInstance("X.509");

		Certificate cert = cf.generateCertificate(inputStream);

		return cert;
	}

	public static ServerSigner getServerSigner(String fullPath, Certificate cert, String imageBase64) {
		ServerSigner signer = new ServerSigner(fullPath, cert);
		signer.setSignatureGraphic(imageBase64);
		// Sonvh 20170718 comment truong hop khong hien thi anh dau.
		// signer.setSignatureAppearance(PdfSignatureAppearance.RenderingMode.GRAPHIC_AND_DESCRIPTION);
		return signer;
	}

	public static String getSignatureImageBase64(String url) {

		String base64 = StringPool.BLANK;

		try {
			InputStream is = new URL(url).openStream();

			base64 = getSignatureImageBase64ByInputStream(is);
		} catch (Exception e) {
			_log.error(e);
		}

		return base64;
	}

	public static String getSignatureImageBase64ByPath(String fullPath) {

		String base64 = StringPool.BLANK;

		try {
			InputStream is = new FileInputStream(new File(fullPath));

			base64 = getSignatureImageBase64ByInputStream(is);
		} catch (Exception e) {
			_log.error(e);
		}

		return base64;
	}

	public static String getSignatureImageBase64ByInputStream(InputStream is) {

		String base64 = StringPool.BLANK;

		ByteArrayOutputStream os = null;

		try {
			os = new ByteArrayOutputStream();

			byte[] buffer = new byte[1024];

			byte[] imageBuff = null;

			int length;

			while ((length = is.read(buffer)) != -1)
				os.write(buffer, 0, length); // copy streams

			imageBuff = os.toByteArray();

			base64 = Base64.encode(imageBuff);

		} catch (Exception e) {
			_log.error(e);
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				_log.error(e);
			}
		}

		return base64;
	}

	public static BufferedImage getImage(String url) throws IOException, URISyntaxException {
		return getImageByInputStream(new URL(url).openStream());
	}

	public static BufferedImage getImageByPath(String fullPath) throws IOException, URISyntaxException {
		return getImageByInputStream(new FileInputStream(new File(fullPath)));
	}

	public static BufferedImage getImageByInputStream(InputStream is) throws IOException, URISyntaxException {
		BufferedImage bimg = null;

		try {
			bimg = ImageIO.read(is);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
		}

		return bimg;
	}

	public static String saveAsPdf(String dest, long fileId) throws IOException {
		log.info("--999994444349999--`-saveAsPdf----9934343499999-");
		// BufferedImage image = null;
		InputStream is = null;
		OutputStream os = null;
		String imagePath = StringPool.BLANK;
		try {

			// URL url = new URL(strURL);
			// image = ImageIO.read(url);
			// is = new URL(strURL).openStream();
			FileEntry fileEntry = getFileEntry(fileId);
			if (fileEntry == null)
				return null;
			// is = getInputStreamByFileEntryId(fileId);
			is = fileEntry.getContentStream();
			// image = ImageIO.read(is);
			imagePath = dest + "/" + fileEntry.getTitle();
			// ImageIO.write(image, ext, new File(fileName));

			os = new FileOutputStream(imagePath);

			byte[] b = new byte[1024];
			int length;

			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}

		} catch (Exception e) {

			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
		return imagePath;
	}

	public static String saveAsPdfUpgrade(String dest, long fileId) throws IOException {
		log.info("--999994444349999--`-saveAsPdf----9934343499999-");
		// BufferedImage image = null;
		InputStream is = null;
		OutputStream os = null;
		String imagePath = StringPool.BLANK;
		try {

			// URL url = new URL(strURL);
			// image = ImageIO.read(url);
			// is = new URL(strURL).openStream();
			FileEntry fileEntry = getFileEntry(fileId);
			if (fileEntry == null)
				return null;
			// is = getInputStreamByFileEntryId(fileId);
			is = fileEntry.getContentStream();
			// image = ImageIO.read(is);
			imagePath = dest + fileEntry.getTitle();
			// ImageIO.write(image, ext, new File(fileName));

			os = new FileOutputStream(imagePath);

			byte[] b = new byte[1024];
			int length;

			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}

		} catch (Exception e) {

			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
		return imagePath;
	}

	public static String saveAsImage(String strURL, String dest, String email, String ext, long fileId)
			throws IOException {
		log.info("--999994444349999--`-saveAsImage----9934343499999-");
		// BufferedImage image = null;
		InputStream is = null;
		OutputStream os = null;
		String imagePath = StringPool.BLANK;
		try {

			// URL url = new URL(strURL);
			// image = ImageIO.read(url);
			// is = new URL(strURL).openStream();
			is = getInputStreamByFileEntryId(fileId);
			// image = ImageIO.read(is);
			imagePath = dest + email + "." + ext;
			// ImageIO.write(image, ext, new File(fileName));

			os = new FileOutputStream(imagePath);

			byte[] b = new byte[1024];
			int length;

			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}

		} catch (IOException e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
		return imagePath;
	}

	public static FileEntry getFileEntry(long fileEnTryId) {
		FileEntry fileEntry = null;

		log.info("--999994444349999--`-fileEntry----9934343499999-" + fileEntry);
		try {
			long userId = ConfigurationManager.getLongProp("id_admin", 10196);
			// long userId = 10198;
			// LogFactoryMOC.getLog(DocumentUtils.class).debug("===Starting
			// check permission============userId======="
			// + userId);
			User user = UserLocalServiceUtil.getUserById(userId);

			PermissionThreadLocal.setPermissionChecker(PermissionCheckerFactoryUtil.create(user, true));
			fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEnTryId);

			// inputStream = fileEntry.getContentStream();
		} catch (Exception e) {
			e.printStackTrace();
			// LogFactoryMOC.getLog(DocumentUtils.class).error(e);
		}

		// LogFactoryMOC.getLog(DocumentUtils.class).debug("=====
		// getInputStreamByFileEntryId return inputStream :::"
		// + inputStream);
		return fileEntry;
	}

	public static InputStream getInputStreamByFileEntryId(long fileEnTryId) {
		InputStream inputStream = null;
		log.info("--999994444349999--`vao day -getInputStreamByFileEntryId----9934343499999-");
		try {
			long userId = ConfigurationManager.getLongProp("id_admin", 10196);
			User user = UserLocalServiceUtil.getUserById(userId);

			PermissionThreadLocal.setPermissionChecker(PermissionCheckerFactoryUtil.create(user, true));
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEnTryId);

			inputStream = fileEntry.getContentStream();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return inputStream;
	}

	private static Log _log = LogFactoryUtil.getLog(SignatureUtil.class);
}
