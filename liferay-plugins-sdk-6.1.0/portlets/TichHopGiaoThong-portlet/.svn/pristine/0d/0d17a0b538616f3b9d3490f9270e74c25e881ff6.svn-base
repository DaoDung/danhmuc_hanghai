package vn.gt.utils.config;

import javax.servlet.http.HttpServletRequest;

import vn.gt.utils.FormatData;

import com.liferay.portal.util.PortalUtil;

public class PageUtils {
	public static Long getNguoiSuDungId(HttpServletRequest request){
		String url= PortalUtil.getCurrentURL(request);
		if(url !=null){
			String p[] = url.split("/");
			if(p != null && p.length>=3){
				try{
					return FormatData.convertToLong(p[2].replaceAll(ConfigurationManager.getStrProp("vn.dtt.ipms.page", ""),""));
				}catch (Exception e) {
				}
			}
		}
		
		return 0L;
	}
}
