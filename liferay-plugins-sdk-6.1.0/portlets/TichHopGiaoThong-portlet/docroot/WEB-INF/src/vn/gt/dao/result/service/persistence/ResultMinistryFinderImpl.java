package vn.gt.dao.result.service.persistence;

import java.util.List;

import vn.gt.dao.result.model.ResultMinistry;
import vn.gt.dao.result.model.impl.ResultMinistryImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ResultMinistryFinderImpl extends BasePersistenceImpl<ResultMinistry> implements ResultMinistryFinder {
	
	private Log log = LogFactoryUtil.getLog(ResultMinistryFinderImpl.class);
	
	public List<ResultMinistry> findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(int documentName, int documentYear,
			java.lang.String ministryCode, int businessTypeCode) {
		
		log.debug("=========THU TUC SEARCH --shipName========" + documentName);
		
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT * FROM RESULT_MINISTRY WHERE 1=1 ";
			
			if (Validator.isNotNull(ministryCode) && ministryCode.trim().length() > 0) {
				query.append(" AND MinistryCode = ?");
			}
			
			if (documentName > 0) {
				query.append(" AND  DocumentName=" + documentName);
			}
			
			if (documentYear > 0) {
				query.append(" AND  DocumentYear=" + documentYear);
			}
			
			// Ten tau
			if (businessTypeCode > 0) {
				query.append(" AND BusinessTypeCode = " + businessTypeCode);
			}
			
			query.append(" ORDER BY id DESC");
			
			sql = sql + query.toString();
			
			log.debug("=========THU TUC SEARCH --findTempDocumentByThuTuc========" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("ResultMinistry", ResultMinistryImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(ministryCode) && ministryCode.trim().length() > 0) {
				qPos.add(ministryCode);
			}
			
			return (List<ResultMinistry>) QueryUtil.list(q, getDialect(), 0, 100);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<ResultMinistry> findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(long documentName, int documentYear,
			String ministryCode, String lstBusinessTypeCode) throws SystemException {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM result_ministry ");
			
			if (Validator.isNotNull(documentName) && documentName > 0) {
				query.append(" WHERE DocumentName = ? ");
			}
			if (Validator.isNotNull(documentYear) && documentYear > 0) {
				query.append(" and DocumentYear = ? ");
			}
			if (Validator.isNotNull(ministryCode) && ministryCode.trim().length() > 0) {
				query.append(" and ministryCode = '" + ministryCode + "'");
			}
			if (Validator.isNotNull(lstBusinessTypeCode) && lstBusinessTypeCode.trim().length() > 0) {
				query.append(" and businessTypeCode in (" + lstBusinessTypeCode + ")");
			}
			query.append(" order by id desc");
			
			log.debug("===findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultMinistry", ResultMinistryImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			return (List<ResultMinistry>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<ResultMinistry> findDistinctMinistryCode(long documentName, int documentYear) throws SystemException {
		Session session = null;
		
		List<ResultMinistry> allResultMinistry = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT DISTINCT MinistryCode FROM result_ministry");
			if (Validator.isNotNull(documentName) && documentName > 0) {
				query.append(" WHERE DocumentName = ? ");
			}
			if (Validator.isNotNull(documentYear) && documentYear > 0) {
				query.append(" and DocumentYear = ? ");
			}
			query.append(" order by id asc");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			// execute the query and return a list from the db
			
			allResultMinistry = (List<ResultMinistry>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allResultMinistry;
	}
	
}
