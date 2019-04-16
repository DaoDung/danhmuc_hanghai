package vn.gt.dao.danhmucgt.service.persistence;

import java.util.List;

import vn.gt.dao.danhmucgt.model.DmGtStatus;
import vn.gt.dao.danhmucgt.model.impl.DmGtStatusImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DmGtStatusFinderImpl extends BasePersistenceImpl<DmGtStatus> implements DmGtStatusFinder {

	private Log log = LogFactoryUtil.getLog(DmGtStatusFinderImpl.class);
	
	public List<DmGtStatus> findByType(int type) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_gt_status WHERE ");
			query.append("Types = ? ");
			query.append("ORDER BY CONVERT(StatusName USING utf8) COLLATE utf8_polish_ci");
			
			log.debug("===findByType===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmGtStatus",DmGtStatusImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(type);
			
			return (List<DmGtStatus>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
}
