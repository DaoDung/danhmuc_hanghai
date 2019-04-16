package vn.dao.gt.asw.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dao.gt.asw.model.AswmsgMessageQueue;
import vn.dao.gt.asw.model.impl.AswmsgMessageQueueImpl;
import vn.gt.utils.config.ConfigurationManager;

import com.liferay.portal.kernel.dao.orm.ORMException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class AswmsgMessageQueueFinderImpl  extends BasePersistenceImpl<AswmsgMessageQueue> implements AswmsgMessageQueueFinder {
	public List<AswmsgMessageQueue> getListMessage2Queue(int count){
		Session session = null;
		
		try {
			session = openSession();
			
			//thay doi viec lay message queue tu priority > 0 sang lay theo so lan gui 
			int soLanGuiToiDa = ConfigurationManager.getIntProp("solangui_message");
			
			String sql = "SELECT {aswmsg_messagequeue.*} FROM aswmsg_messagequeue where solangui < " + soLanGuiToiDa + " and priority > 0 and validated=-1 order by priority desc, solangui, createdtime, id asc" ;
			
			_log.info("=========findMotCuaPhieuXuLyChinhByHoSoThuTucId===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("aswmsg_messagequeue", AswmsgMessageQueueImpl.class);

			return (List<AswmsgMessageQueue>) QueryUtil.list(q, getDialect(), 0, count);
		} catch (Exception e) {
			if(e instanceof ORMException) {
				_log.debug(e);
			} else {
				_log.error(e);
			}
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<AswmsgMessageQueue>();
	}
	
	public List<AswmsgMessageQueue> getListMessageQueuePending(String validationCode){
		Session session = null;
		
		try {
			session = openSession();
			
			int soLanGuiToiDa = ConfigurationManager.getIntProp("solangui_message");
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT {aswmsg_messagequeue.*} FROM aswmsg_messagequeue WHERE ");
			
			if(Validator.isNotNull(validationCode)) {
				sb.append("validationcode = '");
				sb.append(validationCode);
				sb.append("' AND ");
			}
			
			sb.append("(solangui >= ");
			sb.append(soLanGuiToiDa);
			sb.append(" OR validated=0) ORDER BY priority desc, solangui, createdtime, id ASC");
			
			_log.info("=========getListMessageQueuePending===" + sb.toString());
			
			SQLQuery q = session.createSQLQuery(sb.toString());
			q.setCacheable(false);
			q.addEntity("aswmsg_messagequeue", AswmsgMessageQueueImpl.class);

			return (List<AswmsgMessageQueue>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			if(e instanceof ORMException) {
				_log.debug(e);
			} else {
				_log.error(e);
			}
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<AswmsgMessageQueue>();
	}
	
	private static final Log _log = LogFactoryUtil.getLog(AswmsgMessageQueueFinderImpl.class);
}
