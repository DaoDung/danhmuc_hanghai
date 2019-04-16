package vn.gt.utils.document;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class ChuKiSoGiaoThongUtil {
	
	private static Log log = LogFactoryUtil.getLog(ChuKiSoGiaoThongUtil.class);
	
	public static long saveFileChuKiSo(ActionRequest request) throws PortalException, SystemException {
		
		String urlFile = ParamUtil.getString(request, ChuKiSoConstant.FILE_NAME_TEMP_DA_KI);
		log.info("==saveFileChuKiSo==urlFile--" + urlFile);
		
		long userLoginId = PortalUtil.getUser(request).getUserId();
		
		if (urlFile.trim().length() > 0) {
			
			String urlFileKySoTemp = ChuKiSoConstant.PATH_KISO_TEMP_SERVER + urlFile;
			log.info("==saveFileChuKiSo==urlFileKySoTemp--" + urlFileKySoTemp);
			
			try {
				return FileKySoUtils.uploadUrlFile(urlFileKySoTemp, userLoginId, request);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
		
	}
}
