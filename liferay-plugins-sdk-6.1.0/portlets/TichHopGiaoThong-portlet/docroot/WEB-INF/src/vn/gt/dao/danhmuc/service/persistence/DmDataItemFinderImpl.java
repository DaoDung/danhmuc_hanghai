package vn.gt.dao.danhmuc.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.gt.dao.danhmuc.model.DmDataItem;
import vn.gt.dao.danhmuc.model.impl.DmDataItemImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DmDataItemFinderImpl extends BasePersistenceImpl<DmDataItem> implements DmDataItemFinder {
	private Log log = LogFactoryUtil.getLog(DmDataItemImpl.class);

	public List<DmDataItem> getAllByDataGroupID(long datagroupid, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_DataItem WHERE datagroupid = ? ");
			query.append("ORDER BY CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			String sql = query.toString();
			if(start>=0){
				int count=end-start;
				sql=sql+ " limit "+start+","+count;
			}
			log.debug("===getAll===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(datagroupid);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmDataItem> getAllByNode1Node2AndDataGroupID(long datagroupid, String node1, String node2, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_DataItem WHERE datagroupid = ? ");
			if (Validator.isNotNull(node1) && node1.trim().length() > 0  && (!node1.equalsIgnoreCase("---"))) {
				query.append(" AND node_1 = ? ");
			}
			if (Validator.isNotNull(node2) && node2.trim().length() > 0  && (!node2.equalsIgnoreCase("---"))) {
				query.append(" AND node_2 = ? ");
			}
			query.append("ORDER BY CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			String sql = query.toString();
			if(start>=0){
				int count=end-start;
				sql=sql+ " limit "+start+","+count;
			}
			log.debug("===getAllByNode1Node2AndDataGroupID===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(datagroupid);
			if (Validator.isNotNull(node1) && node1.trim().length() > 0  && (!node1.equalsIgnoreCase("---"))) {
				qPos.add(node1);
			}
			if (Validator.isNotNull(node2) && node2.trim().length() > 0  && (!node2.equalsIgnoreCase("---"))) {
				qPos.add(node2);
			}
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countByNode1Node2AndDataGroupID(long datagroupid, String node1, String node2, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT Count(id) as total  FROM dm_DataItem WHERE datagroupid = ? ");
			if (Validator.isNotNull(node1) && node1.trim().length() > 0  && (!node1.equalsIgnoreCase("---"))) {
				query.append(" AND node_1 = ? ");
			}
			if (Validator.isNotNull(node2) && node2.trim().length() > 0  && (!node2.equalsIgnoreCase("---"))) {
				query.append(" AND node_2 = ? ");
			}
			
			String sql = query.toString();
			if(start>=0){
				int count=end-start;
				sql=sql+ " limit "+start+","+count;
			}
			log.debug("===countByNode1Node2AndDataGroupID===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
						
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(datagroupid);
			if (Validator.isNotNull(node1) && node1.trim().length() > 0  && (!node1.equalsIgnoreCase("---"))) {
				qPos.add(node1);
			}
			if (Validator.isNotNull(node2) && node2.trim().length() > 0  && (!node2.equalsIgnoreCase("---"))) {
				qPos.add(node2);
			}
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}


	}
	
	public DmDataItem getByNode2AndDataGroupID(long datagroupid, String node2) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_DataItem WHERE datagroupid = ? and Node_2 = ? ");
			query.append("ORDER BY CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			String sql = query.toString();
			
			log.debug("===getByNode2AndDataGroupID===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmDataItem", DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(datagroupid);
			qPos.add(node2);
			
			return (DmDataItem) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

}
