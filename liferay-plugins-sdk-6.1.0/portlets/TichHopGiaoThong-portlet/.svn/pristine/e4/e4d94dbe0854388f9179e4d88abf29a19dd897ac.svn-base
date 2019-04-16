package vn.gt.dao.danhmuc.service.persistence;

import java.util.List;

import vn.gt.dao.danhmuc.model.DmState;
import vn.gt.dao.danhmuc.model.impl.DmStateImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DmStateFinderImpl extends BasePersistenceImpl<DmState> implements DmStateFinder {
	
	private static Log _log = LogFactoryUtil.getLog(DmStateFinderImpl.class);

	public List<DmState> getAllOrderByName() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_state ");
			query.append("ORDER BY CONVERT(StateName USING utf8) COLLATE utf8_polish_ci");
			
			_log.debug("===getAllOrderByName===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmState",DmStateImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<DmState>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
