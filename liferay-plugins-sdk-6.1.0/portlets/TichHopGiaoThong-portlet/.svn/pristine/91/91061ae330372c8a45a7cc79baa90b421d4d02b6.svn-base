package vn.gt.dao.noticeandmessage.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempShipSecurityPortItems;
import vn.gt.dao.noticeandmessage.model.impl.TempShipSecurityPortItemsImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class TempShipSecurityPortItemsFinderImpl extends BasePersistenceImpl<TempShipSecurityPortItems> implements TempShipSecurityPortItemsFinder {
	
	private Log log = LogFactoryUtil.getLog(TempShipSecurityMessageFinderImpl.class);
	
	public List<TempShipSecurityPortItems> findByRequestCodeOrderByDateArrivalASC(String requestCode) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM temp_ship_security_port_items WHERE RequestCode = ? Order by DateArrival asc");
			
			log.debug("=========findByRequestCodeOrderByDateArrivalAsc========" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TempShipSecurityPortItems", TempShipSecurityPortItemsImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			// execute the query and return a list from the db
			return (List<TempShipSecurityPortItems>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TempShipSecurityPortItems>();
	}
}
