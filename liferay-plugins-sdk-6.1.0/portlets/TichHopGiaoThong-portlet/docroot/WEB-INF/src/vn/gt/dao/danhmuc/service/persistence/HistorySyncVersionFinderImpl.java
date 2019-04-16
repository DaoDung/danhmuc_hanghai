package vn.gt.dao.danhmuc.service.persistence;

import java.util.Date;
import java.util.List;

import vn.gt.dao.danhmuc.model.HistorySyncVersion;
import vn.gt.dao.danhmuc.model.impl.HistorySyncVersionImpl;
import vn.gt.utils.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class HistorySyncVersionFinderImpl extends BasePersistenceImpl<HistorySyncVersion> implements HistorySyncVersionFinder {
	
	private Log log = LogFactoryUtil.getLog(HistorySyncVersionFinderImpl.class);
	
	public List<HistorySyncVersion> getsyncVersion(Date requestedDate, String categoryID) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM history_sync_version WHERE 1=1 ");
			
			if (Validator.isNotNull(requestedDate) && Validator.isNotNull(FormatData.parseDateToTring(requestedDate))) {
				query.append(" AND requesteddate <=  str_to_date('" + FormatData.parseDateToTring(requestedDate) + "', '%Y-%m-%d %H:%i:%s' )  and  latestvaluedate >= str_to_date('" + FormatData.parseDateToTring(requestedDate) + "', '%Y-%m-%d %H:%i:%s' ) ");
			}
			if (Validator.isNotNull(categoryID) && categoryID.trim().length() > 0) {
				query.append(" AND categoryid='" + categoryID + "' ");
			}
			query.append(" limit 1 ");
			log.debug("==========getsyncVersion========" + query.toString());
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("HistorySyncVersion", HistorySyncVersionImpl.class);
			// execute the query and return a list from the db
			return (List<HistorySyncVersion>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
