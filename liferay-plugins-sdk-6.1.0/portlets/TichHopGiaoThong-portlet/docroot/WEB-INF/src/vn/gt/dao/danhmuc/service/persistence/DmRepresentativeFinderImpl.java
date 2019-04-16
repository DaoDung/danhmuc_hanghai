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
import vn.gt.dao.danhmuc.model.DmRepresentative;
import vn.gt.dao.danhmuc.model.impl.DmRepresentativeImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DmRepresentativeFinderImpl extends BasePersistenceImpl<DmRepresentative> implements DmRepresentativeFinder {
	private Log log = LogFactoryUtil.getLog(DmRepresentativeFinderImpl.class);

	public List<DmRepresentative> getAll() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM dm_representative ");
			query.append("ORDER BY cast(MaritimeCode as unsigned) ASC , RepLevel, CONVERT(RepCode USING utf8) COLLATE utf8_polish_ci");
			
			log.debug("===getAll===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmRepresentative", DmRepresentativeImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			// qPos.add(type);
			
			return (List<DmRepresentative>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmRepresentative> findDmRepresentativeByMaritimeCode(String maritimeCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT * FROM dm_representative WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				query.append(" AND maritimeCode = ? ");			
			}	
						
			query.append(" ORDER BY cast(MaritimeCode as unsigned) ASC , RepLevel, CONVERT(RepCode USING utf8) COLLATE utf8_polish_ci");
			
			sql = sql + query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmRepresentative", DmRepresentativeImpl.class);
			
			log.info("=========find DANH SACH ===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				qPos.add(maritimeCode.trim());
			}
			
			return (List<DmRepresentative>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmRepresentative> findDanhSachDmRepresentative(String maritimeCode, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT * FROM dm_representative WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				query.append(" AND maritimeCode = ? ");			
			}	
						
			query.append(" ORDER BY cast(MaritimeCode as unsigned) ASC , RepLevel, CONVERT(RepCode USING utf8) COLLATE utf8_polish_ci");
			
			sql = sql + query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DmRepresentative", DmRepresentativeImpl.class);
			
			log.info("=========find DANH SACH ===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0 && (!maritimeCode.equalsIgnoreCase("---"))) {
				qPos.add(maritimeCode.trim());
			}
			
			return (List<DmRepresentative>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	
	public int countDanhSachDmRepresentative(String maritimeCode) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT Count(id) as total FROM dm_representative WHERE 1=1 ";
			
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0  && (!maritimeCode.equalsIgnoreCase("---"))) {
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
