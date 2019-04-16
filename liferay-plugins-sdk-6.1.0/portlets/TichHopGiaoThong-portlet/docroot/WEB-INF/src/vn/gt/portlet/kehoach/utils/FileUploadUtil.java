
package vn.gt.portlet.kehoach.utils;

import java.io.FileInputStream;
import java.io.InputStream;

import com.itextpdf.text.pdf.codec.Base64;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;

import vgca.svrsigner.ServerSigner;
import vn.gt.utils.document.DocumentUtils;

public class FileUploadUtil {

	public static FileEntry updateFile(
		long userId, long companyId, long groupId, long fileEntryId,
		InputStream inputStream, String fileName, String fileType,
		long fileSize, String destination, String desc,
		ServiceContext serviceContext)
		throws Exception {

		FileEntry fileEntry = null;
		if (inputStream != null && fileSize > 0 &&
			Validator.isNotNull(fileName)) {

			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);

			User user =
				UserLocalServiceUtil.getUser(serviceContext.getUserId());

			PermissionChecker checker =
				PermissionCheckerFactoryUtil.create(user, Boolean.TRUE);
			PermissionThreadLocal.setPermissionChecker(checker);
			
			long fileEntryIdNew = DocumentUtils.uploadTaiLieu(FileUtil.getBytes(inputStream), userId, ".pdf");
			
			fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryIdNew);
			
//			fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, repositoryId, folderId, sourceFileName, mimeType, title, description, changeLog, is, size, serviceContext);
//			
//			fileEntry = DLAppLocalServiceUtil.addFileEntry(
//				userId, fileEntryId, fileName, fileType,
//				System.currentTimeMillis() + StringPool.DASH + fileName, desc,
//				StringPool.BLANK, true, inputStream, fileSize, serviceContext);
		}
		return fileEntry;
	}
	
	public static long kySoFile(UploadPortletRequest uploadPortletRequest, long fileEntryId, String desc, ServiceContext serviceContext) throws SystemException {
		String sign = ParamUtil.getString(uploadPortletRequest, "sign");
		String signFieldName = ParamUtil.getString(uploadPortletRequest, "signFieldName");
		String filePath = ParamUtil.getString(uploadPortletRequest, "filePath");

		_log.info("===kySoFile===sign" + sign);
		_log.info("===kySoFile===fileEntryId" + fileEntryId);
		_log.info("===kySoFile===signFieldName" + signFieldName);
		_log.info("===kySoFile===desc" + desc);
		
		if (Validator.isNotNull(sign) && Validator.isNotNull(filePath)) {

			DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil
					.fetchDLFileEntry(fileEntryId);

			byte[] signature = Base64.decode(sign);

			try {
				ServerSigner signer = new ServerSigner(filePath, null);
				_log.info("======55555==filePath=thu tuc====" + filePath);
				signer.completeSign(signature, signFieldName);
				_log.info("======77777==signFieldName=thu tuc====" + signFieldName);

				String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
				String fileNameSigned = fileName.substring(0, fileName.indexOf(".pdf")) + ".signed.pdf";

				_log.info("======thu tuc==signFieldName  fileNameSigned=thu tuc====" + fileNameSigned);

				filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1) + fileNameSigned;
				_log.info("======thu tuc==signFieldName  filePath=thu tuc====" + filePath);

				InputStream inputStream = new FileInputStream(filePath);
				
				FileEntry fileEntry = updateFile(dlFileEntry.getUserId(), dlFileEntry.getCompanyId(), dlFileEntry.getGroupId(),
						fileEntryId, inputStream, fileNameSigned, dlFileEntry.getMimeType(), inputStream.available(),
						StringPool.BLANK, desc, serviceContext);

				fileEntryId = fileEntry.getFileEntryId();
				
			} catch (Exception e) {
				_log.error(e);
			}
		} else {
			throw new SystemException("===kySoFile===ERROR_SIGN_NULL===" + fileEntryId);
		}
		
		return fileEntryId;
	}
	
	private static Log _log = LogFactoryUtil.getLog(FileUploadUtil.class);
}
