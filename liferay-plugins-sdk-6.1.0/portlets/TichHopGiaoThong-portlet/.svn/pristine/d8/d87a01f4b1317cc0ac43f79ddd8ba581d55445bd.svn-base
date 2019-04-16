package vn.gt.utils.document;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import vn.gt.utils.config.ConfigurationManager;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;

public class DocumentUtils {

	static Log log = LogFactoryUtil.getLog(DocumentUtils.class);

	public static long uploadTaiLieu(byte[] b, long userIdUpload, String formatFile) {
		String tenUpload = "giao_thong" + System.nanoTime();
		IDocumentStorage iDocumentStorage = new DocumentStorageImpl();
		ResultUpload upload = iDocumentStorage.upload(userIdUpload, b, tenUpload + parseString(formatFile));
		if (upload != null && upload.getCode().compareTo(DocumentStorageImpl.UPLOAD_OK) == 0) {
			return upload.getFileId();
		}
		return 0;
	}
	
	public static boolean existDLFileAbsPath(FileEntry fileEntry) {
	    
	    boolean exist = false;
	    
	    if(fileEntry != null) {
	      String dlFileAbsPath = PropsUtil.get("dl.store.file.system.root.dir") + "/"
	        + fileEntry.getCompanyId() + "/" + fileEntry.getFolderId()
	        + "/" + ((DLFileEntry) fileEntry.getModel()).getName() + "/"
	        + fileEntry.getVersion();
	      log.info("--------fileEntry+++++++++" + fileEntry);
	      File file = new File(dlFileAbsPath);
	      
	      exist = file.exists();
	    }
	    
	    return exist;
	}
	
	public static boolean existDLFileAbsPath(long fileEntryId) 
		      throws SystemException {
		    
		    boolean exist = false;
		    
		    if(fileEntryId > 0) {
		      try {
		        FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryId);
		        
		        exist = existDLFileAbsPath(fileEntry);
		      } catch(PortalException e) {
		        log.error(e);
		      }
		    }
		    
		    return exist;
	}

	//
	// private static TaiLieuDinhKem createTaiLieuDinhKem(ResultUpload upload,
	// long userId, String fileName, long thongTinKeHoachId,long thongTinDuAnId,
	// ActionRequest resourceRequest, String tenUpload) {
	// TaiLieuDinhKem taiLieuDinhKem = null;
	// try {
	// taiLieuDinhKem = new TaiLieuDinhKemImpl();
	// taiLieuDinhKem.setFileId(upload.getFileId());
	// taiLieuDinhKem.setNguoiUpload(PortalUtil.getUser(resourceRequest).getEmailAddress());
	// taiLieuDinhKem.setNgayUpload(new Date());
	// taiLieuDinhKem.setTenTaiLieu(fileName);
	// taiLieuDinhKem.setThongTinDuAnId(thongTinDuAnId);
	// taiLieuDinhKem.setThongTinKeHoachId(thongTinKeHoachId);
	// taiLieuDinhKem.setTenUpload(tenUpload);
	//
	// taiLieuDinhKem.setUserId(userId);
	// taiLieuDinhKem.setXoa(0);// (0: Khong xoa, 1: Xoa)
	//
	// return TaiLieuDinhKemLocalServiceUtil.addTaiLieuDinhKem(taiLieuDinhKem);
	// } catch (Exception e) {
	// log.error(e.getMessage());
	// }
	// return taiLieuDinhKem;
	// }

	public static byte[] getByteFromInputStream(InputStream inputStream) {
		if (inputStream != null) {
			try {
				BufferedInputStream byteArrayInputStream = new BufferedInputStream(inputStream);
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				int data = byteArrayInputStream.read();
				while (data != -1) {
					byteArrayOutputStream.write(data);
					data = byteArrayInputStream.read();
				}
				return byteArrayOutputStream.toByteArray();
			} catch (Exception e) {
				log.error(e);
			}
		}

		return null;
	}

	public static String getLinkDownloadFromNoiLuuTruTaiLieuId(long noiLuuTruTaiLieuId) {

		// id cua user test@liferaylcom
		/*long userId = ConfigurationManager.getLongProp("id_admin", 10196);
		User user = null;
		try {
			user = UserLocalServiceUtil.getUserById(userId);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}

		try {
			PermissionThreadLocal.setPermissionChecker(PermissionCheckerFactoryUtil.create(user, true));
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		IDocumentStorage iDocumentStorage = new DocumentStorageImpl();
		return iDocumentStorage.getURLById(noiLuuTruTaiLieuId);
	}

	public static String getPathPhysicalLocationByFileEntryId(long noiLuuTruTaiLieuId) throws SystemException {
		// id cua user test@liferaylcom
		long userId = ConfigurationManager.getLongProp("id_admin", 10196);
		User user = null;
		try {
			user = UserLocalServiceUtil.getUserById(userId);
		} catch (PortalException e) {
			log.error(e);
		} catch (SystemException e) {
			log.error(e);
		}

		try {
			PermissionThreadLocal.setPermissionChecker(PermissionCheckerFactoryUtil.create(user, true));
		} catch (Exception e) {
			log.error(e);
		}
		
		
		DLFileEntry fetchDLFileEntry = null;
		try {
			fetchDLFileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(noiLuuTruTaiLieuId);
		} catch (Exception e) {
		}
		
		/** /companyId/folderId/numericFileEntryName/versionNumber */
		String pathPysical = "/opt/liferay/data/document_library/";
		if (fetchDLFileEntry != null) {
			pathPysical = "/opt/liferay/data/document_library/" + fetchDLFileEntry.getCompanyId() + "/" + fetchDLFileEntry.getFolderId();
		}
		
		return pathPysical;
	}

	public static String getFileNameURLFile(String fileURL) throws IOException {
		URL url = new URL(fileURL);
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		int responseCode = httpConn.getResponseCode();
		String fileName = "";
		// always check HTTP response code first
		if (responseCode == HttpURLConnection.HTTP_OK) {
			String disposition = httpConn.getHeaderField("Content-Disposition");

			if (disposition != null) {
				// extracts file name from header field
				int index = disposition.indexOf("filename=");
				if (index > 0) {
					fileName = disposition.substring(index + 10, disposition.length() - 1);
				}
			} else {
				// extracts file name from URL
				fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1, fileURL.length());
			}
		} else {
			log.info("No file to download. Server replied HTTP code: " + responseCode);
		}
		httpConn.disconnect();
		return fileName;
	}

	public static String parseString(String formatFile) {
		try {
			if (formatFile != null && formatFile.trim().length() > 0) {
				String extendFile = formatFile.substring(formatFile.trim().lastIndexOf("."), formatFile.trim().length());
				if (extendFile.compareToIgnoreCase(".") == 0) {
					extendFile = ".pdf";
				}
				return extendFile;
			}
		} catch (Exception e) {
			log.error(e);
		}
		log.info(formatFile + "=old===========formatFile========" + formatFile);

		return formatFile;
	}
	
	public static long uploadFileEntryFromURL(String fileURL) {
		long fileEntryId = 0;
		
		try {
			byte[] bytes = getFileFromURL(fileURL);
		
			fileEntryId = uploadTaiLieu(bytes, 0, ".pdf");
		} catch(Exception e) {
			log.error(e);
		}
		
		return fileEntryId;
	}
	
	public static byte[] getFileFromURL(String fileURL) throws IOException {
		
		HttpURLConnection connection = null;
		byte[] bytes = null;
		if(Validator.isNotNull(fileURL)) {
			
			try {
				URL url = new URL(fileURL);
				
				connection = (HttpURLConnection) url.openConnection();
				connection.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
				connection.addRequestProperty("User-Agent", "Mozilla");
				connection.addRequestProperty("Referer", "google.com");
				
				connection.setInstanceFollowRedirects(false);
				connection.setConnectTimeout(5000);	// 5s
				connection.setReadTimeout(5000);	// 5s
				
				int status = connection.getResponseCode();
				
				boolean redirect = false;

				// normally, 3xx is redirect
				if (status != HttpURLConnection.HTTP_OK) {
					if (status == HttpURLConnection.HTTP_MOVED_TEMP
						|| status == HttpURLConnection.HTTP_MOVED_PERM
							|| status == HttpURLConnection.HTTP_SEE_OTHER)
					redirect = true;
				}
				
				if (redirect) {

					// get redirect url from "location" header field
					String newUrl = connection.getHeaderField("Location");

					// get the cookie if need, for login
					String cookies = connection.getHeaderField("Set-Cookie");

					// open the new connnection again
					connection = (HttpURLConnection) new URL(newUrl).openConnection();
					
					connection.setRequestProperty("Cookie", cookies);
					connection.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
					connection.addRequestProperty("User-Agent", "Mozilla");
					connection.addRequestProperty("Referer", "google.com");
					
					connection.setConnectTimeout(5000);	// 5s
					connection.setReadTimeout(5000);	// 5s
											
					status = connection.getResponseCode();
				}
			
				if(status == HttpURLConnection.HTTP_OK) {
					InputStream is = connection.getInputStream();
					//File file = FileUtil.createTempFile(is);
					//long size = connection.getContentLengthLong();
					//_log.info("===fileURL===" + fileURL + "===" + file.getAbsolutePath());
					//_log.info("===fileURL===" + fileURL + "===" + size);
					
					bytes = FileUtil.getBytes(is);
					
					//FileUtil.createTempFile(bytes);
				}
			} catch(IOException ioe) {
				throw new IOException(ioe.getMessage());
			}finally{
				connection.disconnect();
			}
		}
		
		return bytes;
	}

}
