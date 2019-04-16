package vn.gt.utils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.com.elcom.www.VNMWSLocator;
import vn.com.elcom.www.VNMWSSoap;
import vn.gt.ws.util.WebserviceUtil;

public class CallWs2CangVu {
	public static VNMWSSoap getVNMWS(String wsAddressCode) {
		VNMWSSoap vnmwsSoap = null;
		
		try {
			String wsAddress = WebserviceUtil.getWebserviceELComURL(wsAddressCode);
			
			if(Validator.isNotNull(wsAddress)) {
				VNMWSLocator locator = new vn.com.elcom.www.VNMWSLocator();
				locator.setVNMWSSoapEndpointAddress(wsAddress);
				
				vnmwsSoap = locator.getVNMWSSoap();
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return vnmwsSoap;
	}
	
	private static Log _log = LogFactoryUtil.getLog(CallWs2CangVu.class);
}
