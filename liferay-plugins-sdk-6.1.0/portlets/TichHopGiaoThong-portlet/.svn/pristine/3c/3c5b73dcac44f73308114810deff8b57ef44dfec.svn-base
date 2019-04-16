package vn.gt.elcom;

import javax.servlet.http.HttpServletRequest;

import org.apache.axis.MessageContext;
import org.apache.axis.transport.http.HTTPConstants;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.gt.tichhop.threat.ObjectExcute;
import vn.gt.tichhop.threat.ProcessExecuteMessageTichHopCangUtils;

public class SendMessage2ElcomImpl implements ISendMessage2Elcom {
	public SendMessage2ElcomImpl() {

	}

	@Override
	public String sendAndGetMessage(String requestMessage) {
		_log.info("===Message==from==CangVu==="+requestMessage);
		
		String ipClientCallWS = ((HttpServletRequest)MessageContext.getCurrentContext().getProperty(HTTPConstants.MC_HTTP_SERVLETREQUEST)).getRemoteAddr();
		if (ipClientCallWS != null) {
			ipClientCallWS = ipClientCallWS.trim().toLowerCase();
			
			_log.info("===CVHH_IPClient===" + ipClientCallWS);
		}
		
		ProcessExecuteMessageTichHopCangUtils processExecuteMessageTichHopCangUtils = new ProcessExecuteMessageTichHopCangUtils();
		String xml =processExecuteMessageTichHopCangUtils.nhanThongTinCangVu(new ObjectExcute(null, null, requestMessage));
	
		_log.info("===Message===tra===lai===CangVu==="+xml);
		return xml;

	}
	
	private static Log _log = LogFactoryUtil.getLog(SendMessage2ElcomImpl.class);

}
