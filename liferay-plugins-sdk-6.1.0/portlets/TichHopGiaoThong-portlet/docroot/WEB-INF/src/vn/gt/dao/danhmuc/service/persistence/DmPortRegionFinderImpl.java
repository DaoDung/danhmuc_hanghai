package vn.gt.dao.danhmuc.service.persistence;

import java.util.List;
import java.util.Date;
import java.util.Iterator;
import vn.gt.utils.validation.*;
import vn.gt.utils.FormatData;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.dao.orm.Type;

import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl;
import vn.gt.dao.danhmuc.model.DmPortRegion;
import vn.gt.dao.danhmuc.model.impl.DmPortRegionImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DmPortRegionFinderImpl extends BasePersistenceImpl<DmPortRegion> implements DmPortRegionFinder {
	private Log log = LogFactoryUtil.getLog(DmPortRegionFinderImpl.class);

	public List<DmPortRegion> getAll() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_region ");
			query.append("ORDER BY CONVERT(PortCode USING utf8) COLLATE utf8_polish_ci");
			
			log.debug("===getAll===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmPortRegion", DmPortRegionImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (List<DmPortRegion>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmPortRegion> findDanhSachDmPortRegion(String maritimeCode, String portRegionName, String portCode, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT * FROM dm_port_region WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				query.append(" AND portRegionRef = ? ");			
			}	
			if (Validator.isNotNull(portRegionName) && portRegionName.trim().length() > 0) {
				query.append(" AND UPPER(portRegionNameVN) like '%" + portRegionName.trim().toUpperCase() + "%' ");
			}
			
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND UPPER(portCode) like '%" + portCode.trim().toUpperCase() + "%' ");
			}
			
			
			query.append(" ORDER BY CONVERT(PortCode USING utf8) COLLATE utf8_polish_ci ");
			
			sql = sql + query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmPortRegion", DmPortRegionImpl.class);
			
			log.info("=========find DANH SACH ===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				qPos.add(maritimeCode.trim());
			}
			
			return (List<DmPortRegion>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	
	public int countDanhSachDmPortRegion(String maritimeCode, String portRegionName, String portCode) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT Count(id) as total FROM dm_port_region WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0  && (!maritimeCode.equalsIgnoreCase("---"))) {
				query.append(" AND portRegionRef = ? ");
			}	
			if (Validator.isNotNull(portRegionName) && portRegionName.trim().length() > 0) {
				query.append(" AND UPPER(portRegionNameVN) like '%" + portRegionName.trim().toUpperCase() + "%' ");
			}
			
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND UPPER(portCode) like '%" + portCode.trim().toUpperCase() + "%' ");
			}
			
			
			
			
			sql = sql + query.toString();

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0  && (!maritimeCode.equalsIgnoreCase("---"))) {
				qPos.add(maritimeCode.trim());
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
	
	public DmPortRegion getFirstPortRegion() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_region ");
			query.append("ORDER BY ID ASC LIMIT 1");
			
			log.debug("===getFirstPortRegion===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmPortRegion", DmPortRegionImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (DmPortRegion) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public DmPortRegion getLastPortRegion() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_region ");
			query.append("ORDER BY ID DESC LIMIT 1");
			
			log.debug("===getLastPortRegion===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmPortRegion", DmPortRegionImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (DmPortRegion) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

}
