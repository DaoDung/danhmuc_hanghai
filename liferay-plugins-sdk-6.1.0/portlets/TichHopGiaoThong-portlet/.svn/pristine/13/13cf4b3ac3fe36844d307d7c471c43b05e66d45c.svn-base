package vn.gt.tichhop.sendmessage;

import java.util.List;

import vn.dao.gt.asw.model.AswmsgMessageQueue;
import vn.dao.gt.asw.service.AswmsgMessageQueueLocalServiceUtil;
import vn.gt.utils.config.ConfigurationManager;
import vn.gt.ws.util.WebserviceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ProcessReadDB implements Runnable {
	
	private static Log _log = LogFactoryUtil.getLog(ProcessReadDB.class);
	private Thread t;
	private int timeSleep = 900;
	private String threadName;
	
	public ProcessReadDB(String name, int timeSleep) {
		this.threadName = name;
		this.timeSleep = timeSleep;
	}
	
	public void run() {
		int count = ConfigurationManager.getIntProp("vn.gt.count.sendmessage", 20);
		
		int check = WebserviceUtil.checkGateway();//ConfigurationManager.getIntProp("vn.gt.coguihaykhong", 1);
		
		if (check > 0) {
			//cho nay la day het cac message vao DB queue
			while (true) {
				int size = ThreatSentMessage.sendMessageQueue.size();
				
				if (size == 0) {
					try {
						List<AswmsgMessageQueue> aswmsgMessageQueues = AswmsgMessageQueueLocalServiceUtil.getListMessage2Queue(count);
						
						if (aswmsgMessageQueues != null && aswmsgMessageQueues.size() > 0) {
							//check in queue
							StringBuilder sb = new StringBuilder();
							
							for(AswmsgMessageQueue messageQueueTmp : aswmsgMessageQueues) {
								//danh dau trang thai dang duoc xu ly
								messageQueueTmp.setValidated(0);
								AswmsgMessageQueueLocalServiceUtil.updateAswmsgMessageQueue(messageQueueTmp);
								
								ThreatSentMessage.sendMessageQueue.add(messageQueueTmp);
								
								sb.append(messageQueueTmp.getId() + ";");
							}
							
							_log.info("===messageQueue===ProcessReadDB===" + sb.toString());
						}
						
						Thread.sleep(timeSleep);
					} catch (Exception e) {
						_log.error(e);
					}
				}
			}
		}
	}
	
	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
			_log.info("===Starting-------------- " + t.getName());
		}
	}
	
}
