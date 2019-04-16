package vn.gt.tichhop.report;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;

public class FileUploadUtils {

	public static FileEntry uploadFile(long userId, long groupId, long fileEntryId, File file, String sourceFileName,
			String fileType, String destination, ServiceContext serviceContext) throws Exception {

		FileEntry fileEntry = null;

		if (file != null && Validator.isNotNull(sourceFileName)) {

			if (Validator.isNull(fileType)) {
				fileType = MimeTypesUtil.getContentType(sourceFileName);
			}

			String title = getFileName(sourceFileName);

			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);

			Calendar calendar = Calendar.getInstance();

			calendar.setTime(new Date());

			if (destination == null) {
				destination = StringPool.BLANK;
			}

			destination += calendar.get(Calendar.YEAR) + StringPool.SLASH;
			destination += calendar.get(Calendar.MONTH) + StringPool.SLASH;
			destination += calendar.get(Calendar.DAY_OF_MONTH);
			System.out.println("FileUploadUtils.uploadFile()"+destination);
			DLFolder dlFolder = DLFolderUtil.getTargetFolder(userId, groupId, groupId, false, 0, destination,
					StringPool.BLANK, false, serviceContext);
			System.out.println("FileUploadUtils.uploadFile()"+dlFolder);
			User user = UserLocalServiceUtil.getUser(userId);
			System.out.println("FileUploadUtils.uploadFile()"+user);
			PermissionChecker checker = PermissionCheckerFactoryUtil.create(user, Boolean.TRUE);
			PermissionThreadLocal.setPermissionChecker(checker);
			System.out.println("FileUploadUtils.uploadFile()"+fileEntryId);
//			if (fileEntryId > 0) {
//				fileEntry = DLAppLocalServiceUtil.updateFileEntry(userId, fileEntryId, sourceFileName, fileType, title,
//						title, title, true, file, serviceContext);
//			} else {
//				fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, groupId, dlFolder.getFolderId(), title, fileType,
//						title, title, StringPool.BLANK, file, serviceContext);
//			}
			fileEntry = DLAppLocalServiceUtil.addFileEntry(userId, groupId, dlFolder.getFolderId(), title, fileType,
					title, title, StringPool.BLANK, file, serviceContext);

		}

		return fileEntry;
	}

	private static String getFileName(String sourceFileName) {
		String ext = FileUtil.getExtension(sourceFileName);
		
		return System.currentTimeMillis() + "." + ext;
	}
	
}
