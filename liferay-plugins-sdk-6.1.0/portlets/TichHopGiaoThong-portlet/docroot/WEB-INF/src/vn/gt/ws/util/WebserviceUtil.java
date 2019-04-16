package vn.gt.ws.util;


import vn.gt.utils.config.ConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

public class WebserviceUtil {
	public static String getWebserviceELComURL(String wsAddressCode) {
		String key = "ws.elcom.url";
		
		if(Validator.isNotNull(wsAddressCode)) {
			key += "." + wsAddressCode.toLowerCase();
		}
		
		String url = PropsUtil.get(key);
		
		if(Validator.isNull(url)) {
			url = ConfigurationManager.getStrProp(key);
		}
		
		_log.info("===ws.elcom.url===" + key + "===" + url);
		
		return url;
	}
	
	public static String getWebserviceHQURL() {
		String key ="ws.hq.url";
		String url = PropsUtil.get(key);
		
		if(Validator.isNull(url)) {
			url = ConfigurationManager.getStrProp(key);
		}
		
		return url;
	}
	
	public static String getWebserviceHQv2URL() {
		String key ="ws.hq.v2.url";
		String url = PropsUtil.get(key);
		
		if(Validator.isNull(url)) {
			url = ConfigurationManager.getStrProp(key);
		}
		
		return url;
	}
	
	public static String getWebserviceCongBGTVTURL() {
		String key ="ws.congbogtvt.url";
		String url = PropsUtil.get(key);
		
		if(Validator.isNull(url)) {
			url = ConfigurationManager.getStrProp(key);
		}
		
		return url;
	}

	public static int checkGateway() {
		String key = "vn.gt.gateway";
		
		String gateway = PropsUtil.get("vn.gt.gateway");
		
		if(Validator.isNull(gateway)) {
			gateway = ConfigurationManager.getStrProp(key);
		}
		
		return GetterUtil.getInteger(gateway);
	}
	
	public static String getPaymentURL() {
		String key = "vn.gt.payment.url";
		
		String paymentURL = PropsUtil.get("vn.gt.payment.url");
		
		if(Validator.isNull(paymentURL)) {
			paymentURL = ConfigurationManager.getStrProp(key);
		}
		
		return paymentURL;
	}
	
	public static String getKeypayRedirectUrl() {
		String key = "vn.gt.keypay.redirect.url";
		
		String paymentURL = PropsUtil.get("vn.gt.keypay.redirect.url");
		
		if(Validator.isNull(paymentURL)) {
			paymentURL = ConfigurationManager.getStrProp(key);
		}
		
		return paymentURL;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(WebserviceUtil.class);
}
