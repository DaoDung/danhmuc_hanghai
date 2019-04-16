package vn.gt.tichhop.schedule;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

import vn.dao.gt.asw.service.AswmsgMessageQueueLocalServiceUtil;
import vn.gt.tichhop.message.MessageType;

public class SchedulerMessageQueue implements MessageListener {
    @Override
    public void receive(Message message) throws MessageListenerException {
    	AswmsgMessageQueueLocalServiceUtil.updateListMessageQueuePending(
    			MessageType.REQUEST_DIRECTION_OUT_CVHH);
    }
}
