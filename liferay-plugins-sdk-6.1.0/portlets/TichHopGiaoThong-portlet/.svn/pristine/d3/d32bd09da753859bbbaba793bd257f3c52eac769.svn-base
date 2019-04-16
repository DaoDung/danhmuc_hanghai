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
import vn.gt.dao.danhmuc.model.DmPortHarbour;
import vn.gt.dao.danhmuc.model.impl.DmPortHarbourImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DmPortHarbourFinderImpl extends BasePersistenceImpl<DmPortRegion> implements DmPortHarbourFinder {
	private Log log = LogFactoryUtil.getLog(DmPortHarbourFinderImpl.class);

	public List<DmPortHarbour> getAll() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_harbour ");
			query.append("ORDER BY CONVERT(PortHarbourName USING utf8) COLLATE utf8_polish_ci");
			
			log.debug("===getAll===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmPortHarbour", DmPortHarbourImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (List<DmPortHarbour>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmPortHarbour> findDanhSachDmPortHarbour(String maritimeCode, String portRegion, String portHarbourName, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT {dm_port_harbour.*} FROM dm_port_harbour WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				query.append(" AND PortRegionCode = ? ");
			}	
			if (Validator.isNotNull(portRegion) && portRegion.trim().length() > 0) {
				query.append(" AND PortRegion = ? ");
			}
			
			if (Validator.isNotNull(portHarbourName) && portHarbourName.trim().length() > 0) {				
				query.append(" AND UPPER(PortHarbourName) like '%" + portHarbourName.trim().toUpperCase() + "%' ");
			}
			
			
			query.append(" ORDER BY CONVERT(PortHarbourName USING utf8) COLLATE utf8_polish_ci ");
			
			sql = sql + query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("dm_port_harbour", DmPortHarbourImpl.class);
			
			log.debug("=========find DANH SACH ===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				qPos.add(maritimeCode.trim());
			}
			if (Validator.isNotNull(portRegion) && portRegion.trim().length() > 0) {
				qPos.add(portRegion.trim());
			}
			
			
			return (List<DmPortHarbour>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	
	public int countDanhSachDmPortHarbour(String maritimeCode, String portRegion, String portHarbourName) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT Count(id) as total FROM dm_port_harbour WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				query.append(" AND PortRegionCode = ? ");
			}	
			if (Validator.isNotNull(portRegion) && portRegion.trim().length() > 0) {
				query.append(" AND PortRegion = ? ");
			}
			
			if (Validator.isNotNull(portHarbourName) && portHarbourName.trim().length() > 0) {
				query.append(" AND UPPER(PortHarbourName) like '%" + portHarbourName.trim().toUpperCase() + "%' ");
			}
			
			
			sql = sql + query.toString();

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			

			log.debug("=========find DANH SACH ===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				qPos.add(maritimeCode.trim());
			}
			if (Validator.isNotNull(portRegion) && portRegion.trim().length() > 0) {
				qPos.add(portRegion.trim());
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
	
	public DmPortHarbour getFirstPortHarbour() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_harbour ");
			query.append("ORDER BY ID ASC LIMIT 1");
			
			log.debug("===getFirstPortHarbour===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmPortHarbour", DmPortHarbourImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (DmPortHarbour) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public DmPortHarbour getLastPortHarbour() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_port_harbour ");
			query.append("ORDER BY ID DESC LIMIT 1");
			
			log.debug("===getLastPortHarbour===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmPortHarbour", DmPortHarbourImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (DmPortHarbour) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

}
