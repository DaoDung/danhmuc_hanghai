package vn.gt.dao.danhmuc.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.gt.dao.danhmuc.model.DmPortWharf;
import vn.gt.dao.danhmuc.model.impl.DmPortWharfImpl;
import vn.gt.dao.danhmuc.model.DmPortRegion;
import vn.gt.dao.danhmuc.model.impl.DmPortRegionImpl;

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

public class DmPortWharfFinderImpl extends BasePersistenceImpl<DmPortWharf> implements DmPortWharfFinder {
	
	private static Log _log = LogFactoryUtil.getLog(DmPortWharfFinderImpl.class);

	public List<DmPortWharf> findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(String portRegionCode, String portHarbourCode, boolean ascOrdesc) throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_wharf WHERE 1= 1   ");
			
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0 ) {
				query.append(" and PortRegionCode = '" + portRegionCode + "'");
			}
			
			if (Validator.isNotNull(portHarbourCode) && portHarbourCode.trim().length() > 0 ) {
				query.append(" and (PortHarbourCode is null or PortHarbourCode = '"+portHarbourCode+"')");
			}
			
			if (ascOrdesc == true) {
				query.append(" order by PortCode asc");
			} else {
				query.append(" order by PortCode desc");
			}
			
			String sql = query.toString();
			
			_log.debug("========findByPortHarbourCodeOrNullOrderPortCode======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmPortWharf", DmPortWharfImpl.class);
			
			// execute the query and return a list from the db
			return (List<DmPortWharf>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	
	public List<DmPortWharf> findDanhSachDmPortWharf(String portRegionCode, String portHarbourCode, String PortWharfNameVN, boolean ascOrdesc, int start, int end) throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_wharf WHERE 1= 1   ");
			
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0 ) {
				query.append(" and PortRegionCode = '" + portRegionCode + "'");
			}
			
			if (Validator.isNotNull(portHarbourCode) && portHarbourCode.trim().length() > 0 ) {
				query.append(" and (PortHarbourCode is null or PortHarbourCode = '"+portHarbourCode+"')");
			}
			
			if (Validator.isNotNull(PortWharfNameVN) && PortWharfNameVN.trim().length() > 0 ) {
				query.append(" and (PortWharfNameVN is null or PortWharfNameVN like '%" + PortWharfNameVN+ "%')");
			}
			
			if (ascOrdesc == true) {
				query.append(" order by PortCode asc");
			} else {
				query.append(" order by PortCode desc");
			}
			
			String sql = query.toString();
			
			_log.debug("========findDanhSachDmPortWharf======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmPortWharf", DmPortWharfImpl.class);
			
			// execute the query and return a list from the db
			return (List<DmPortWharf>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
public int countDanhSachDmPortWharf(String portRegionCode, String portHarbourCode, String PortWharfNameVN) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT Count(id) as total  FROM dm_port_wharf WHERE 1= 1   ");
			
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0 ) {
				query.append(" and PortRegionCode = '" + portRegionCode + "'");
			}
			
			if (Validator.isNotNull(portHarbourCode) && portHarbourCode.trim().length() > 0 ) {
				query.append(" and (PortHarbourCode is null or PortHarbourCode = '"+portHarbourCode+"')");
			}
			
			if (Validator.isNotNull(PortWharfNameVN) && PortWharfNameVN.trim().length() > 0 ) {
				query.append(" and (PortWharfNameVN is null or PortWharfNameVN like '%" + PortWharfNameVN+ "%')");
			}
			String sql = query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			

			_log.debug("========findDanhSachDmPortWharf======" + query.toString());
			QueryPos qPos = QueryPos.getInstance(q);
			
			
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

	public List<DmPortWharf> findDongBoDmPortWharf(String MaritimeCode, String portRegionCode, String portHarbourCode, String PortWharfNameVN, boolean ascOrdesc, int start, int end) throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_wharf WHERE 1= 1   ");
			
			if (Validator.isNotNull(MaritimeCode) && MaritimeCode.trim().length() > 0  && (!MaritimeCode.equalsIgnoreCase("---"))) {
				query.append(" and PortRegionCode in (Select distinct PortRegionCode from dm_port_region where PortRegionRef =  '" + MaritimeCode + "')");
			}
			
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0 ) {
				query.append(" and PortRegionCode = '" + portRegionCode + "'");
			}
			
			if (Validator.isNotNull(portHarbourCode) && portHarbourCode.trim().length() > 0 ) {
				query.append(" and (PortHarbourCode is null or PortHarbourCode = '"+portHarbourCode+"')");
			}
			
			if (Validator.isNotNull(PortWharfNameVN) && PortWharfNameVN.trim().length() > 0 ) {
				query.append(" and (PortWharfNameVN is null or UPPER(PortWharfNameVN) like '%" + PortWharfNameVN.trim().toUpperCase()+ "%')");				
			}
			
			if (ascOrdesc == true) {
				query.append(" order by id asc ");
			} else {
				query.append(" order by id desc");
			}
			
			String sql = query.toString();
			
			_log.info("========findDanhSachDmPortWharf======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmPortWharf", DmPortWharfImpl.class);
			
			// execute the query and return a list from the db
			return (List<DmPortWharf>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countDongBoDmPortWharf(String MaritimeCode, String portRegionCode, String portHarbourCode, String PortWharfNameVN) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT Count(id) as total FROM dm_port_wharf WHERE 1= 1   ");			

			if (Validator.isNotNull(MaritimeCode) && MaritimeCode.trim().length() > 0 && (!MaritimeCode.equalsIgnoreCase("---"))) {
				query.append(" and PortRegionCode in (Select distinct PortRegionCode from dm_port_region where PortRegionRef =  '" + MaritimeCode + "')");
			}
			
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0 ) {
				query.append(" and PortRegionCode = '" + portRegionCode + "'");
			}
			
			if (Validator.isNotNull(portHarbourCode) && portHarbourCode.trim().length() > 0 ) {
				query.append(" and (PortHarbourCode is null or PortHarbourCode = '"+portHarbourCode+"')");
			}
			
			if (Validator.isNotNull(PortWharfNameVN) && PortWharfNameVN.trim().length() > 0 ) {
				query.append(" and (PortWharfNameVN is null or UPPER(PortWharfNameVN) like '%" + PortWharfNameVN.trim().toUpperCase()+ "%')");
			}
			String sql = query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
	
			_log.debug("========findDanhSachDmPortWharf======" + query.toString());
			QueryPos qPos = QueryPos.getInstance(q);
			
			
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
	public List<DmPortWharf> findByPortHarbourCodeOrNull(String portHarbourCode, boolean ascOrdesc) throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_wharf WHERE 1 = 1 ");
			
			if (Validator.isNotNull(portHarbourCode) && portHarbourCode.trim().length() > 0) {
				query.append(" and (PortHarbourCode is null or PortHarbourCode = '" + portHarbourCode + "')");
			}
			
			if (ascOrdesc == true) {
				query.append(" order by PortCode asc");
			} else {
				query.append(" order by PortCode desc");
			}
			
			String sql = query.toString();
			
			_log.debug("========findByPortHarbourCodeOrNullOrderPortCode======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmPortWharf", DmPortWharfImpl.class);
			
			// execute the query and return a list from the db
			return (List<DmPortWharf>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmPortWharf> findByPortRegionCodeOrderPortCode(String portRegionCode, boolean ascOrdesc) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_wharf WHERE 1 = 1 ");
			
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0 ) {
				query.append("and PortRegionCode = '" + portRegionCode + "'");
			}
			
			if (ascOrdesc == true) {
				query.append(" order by PortCode asc");
			} else {
				query.append(" order by PortCode desc");
			}
			
			String sql = query.toString();
			
			_log.debug("========findByPortRegionCodeOrderPortCode======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmPortWharf", DmPortWharfImpl.class);
			
			// execute the query and return a list from the db
			return (List<DmPortWharf>) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public DmPortWharf getFirstPortWharf() throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_wharf WHERE 1= 1   ");
			query.append("ORDER BY ID ASC LIMIT 1");
					
			String sql = query.toString();
			
			_log.debug("========getFirstPortWharf======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmPortWharf", DmPortWharfImpl.class);
			
			// execute the query and return a list from the db
			return (DmPortWharf) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public DmPortWharf getLastPortWharf() throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_wharf WHERE 1= 1   ");
			query.append("ORDER BY ID DESC LIMIT 1");
					
			String sql = query.toString();
			
			_log.debug("========getLastPortWharf======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmPortWharf", DmPortWharfImpl.class);
			
			// execute the query and return a list from the db
			return (DmPortWharf) QueryUtil.list(q, getDialect(),  QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
