/**
 * 
 */
package vn.gt.dao.noticeandmessage.service.persistence;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.gt.dao.noticeandmessage.model.InterfaceRequest;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author win_64
 */
public class InterfaceRequestFinderImpl extends BasePersistenceImpl<InterfaceRequest> implements InterfaceRequestFinder {
	
	private Log log = LogFactoryUtil.getLog(InterfaceRequestFinderImpl.class);
	
	public InterfaceRequest findInterfaceRequestByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM INTERFACE_REQUEST ");
			query.append(" WHERE RequestCode = ?");
			
			log.debug("=========findInterfaceRequestByRequestCode========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("InterfaceRequest", InterfaceRequestImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			// execute the query and return a list from the db
			List<InterfaceRequest> lst = (List<InterfaceRequest>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lst != null && lst.size() > 0) {
				return lst.get(0);
			}
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public Date getRequestedDateByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT RequestedDate as requestedDate FROM INTERFACE_REQUEST ");
			query.append(" WHERE RequestCode = ?");
			
			log.debug("=========getRequestedDateByRequestCode========" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("requestedDate", Type.DATE);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			Iterator<Date> itr = q.list().iterator();
			if (itr.hasNext()) {
				Date count = itr.next();
				if (count != null) {
					return count;
				}
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public String getFunctionTypeByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT FunctionType as functionType FROM INTERFACE_REQUEST ");
			query.append(" WHERE RequestCode = ?");
			
			log.debug("=========getFunctionTypeByRequestCode========" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("functionType", Type.STRING);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			Iterator<String> itr = q.list().iterator();
			if (itr.hasNext()) {
				String count = itr.next();
				if (count != null) {
					return count;
				}
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public String getRemarksByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT Remarks as remarks FROM INTERFACE_REQUEST ");
			query.append(" WHERE RequestCode = ?");
			
			log.info("=========getRemarksByRequestCode========" + query.toString() + "requestCode  " + requestCode);
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("remarks", Type.STRING);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			Iterator<String> itr = q.list().iterator();
			if (itr.hasNext()) {
				String count = itr.next();
				if (count != null) {
					return count;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public int updateInterfaceRequest(String sql) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			
			log.debug("=========updateByRequestCode========" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			int executeUpdate = q.executeUpdate();
			//session.flush();
			return executeUpdate;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
