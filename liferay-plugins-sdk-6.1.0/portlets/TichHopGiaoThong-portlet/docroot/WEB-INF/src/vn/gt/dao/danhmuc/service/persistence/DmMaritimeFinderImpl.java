package vn.gt.dao.danhmuc.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.model.DmPortRegion;
import vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl;
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

public class DmMaritimeFinderImpl extends BasePersistenceImpl<DmMaritime> implements DmMaritimeFinder {
	private Log log = LogFactoryUtil.getLog(DmMaritimeFinderImpl.class);

	public List<DmMaritime> getAll() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_maritime ");
			query.append("ORDER BY CONVERT(CityCode USING utf8) COLLATE utf8_polish_ci");
			
			log.debug("===getAll===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmMaritime", DmMaritimeImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (List<DmMaritime>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public DmMaritime getFirstMaritime() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_maritime ");
			query.append("ORDER BY ID ASC LIMIT 1");
			
			log.debug("===getFirstMaritime===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmMaritime", DmMaritimeImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (DmMaritime) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public DmMaritime getLastMaritime() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_maritime ");
			query.append("ORDER BY ID DESC LIMIT 1");
			
			log.debug("===getLastMaritime===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmMaritime", DmMaritimeImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (DmMaritime) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS).get(0);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmMaritime> findDanhSachDmMaritime(String maritimeCode, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT * FROM dm_maritime WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				query.append(" AND maritimeCode = ? ");			
			}	
			
			query.append(" ORDER BY CONVERT(maritimeReference USING utf8) COLLATE utf8_polish_ci ");
			
			sql = sql + query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmMaritime", DmMaritimeImpl.class);
			
			log.info("=========find DANH SACH ===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				qPos.add(maritimeCode.trim());
			}
			
			return (List<DmMaritime>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countDanhSachDmMaritime(String maritimeCode, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT Count(id) as total  FROM dm_maritime WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				query.append(" AND maritimeCode = ? ");			
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

}
