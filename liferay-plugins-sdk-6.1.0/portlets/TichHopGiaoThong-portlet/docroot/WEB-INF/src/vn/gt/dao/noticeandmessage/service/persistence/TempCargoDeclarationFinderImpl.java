/**
 * 
 */
package vn.gt.dao.noticeandmessage.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempCargoDeclaration;
import vn.gt.dao.noticeandmessage.model.impl.TempCargoDeclarationImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author win_64
 */
public class TempCargoDeclarationFinderImpl extends BasePersistenceImpl<TempCargoDeclaration> implements TempCargoDeclarationFinder {
	
	private Log log = LogFactoryUtil.getLog(TempCargoDeclarationFinderImpl.class);
	
	public TempCargoDeclaration findTempCargoDeclarationByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM TEMP_CARGO_DECLARATION WHERE RequestCode = ?");
			
			String sql = query.toString();
			log.debug("=========findTempCargoDeclarationByRequestCode========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempCargoDeclaration", TempCargoDeclarationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			// execute the query and return a list from the db
			return (TempCargoDeclaration) q.uniqueResult();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM TEMP_CARGO_DECLARATION WHERE DocumentName = ? and DocumentYear = ? ");
			
			String sql = query.toString();
			log.debug("=========findBydocumentNameAnddocumentYear========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempCargoDeclaration", TempCargoDeclarationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			// execute the query and return a list from the db
			return (List<TempCargoDeclaration>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TempCargoDeclaration>();
	}
	
	public TempCargoDeclaration getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		Session session = null;
		try {
			session = openSession();
			
			//StringBuilder interfaceRequest = new StringBuilder();
/*			interfaceRequest.append("SELECT inter.RequestCode FROM interface_request inter INNER JOIN (");
			interfaceRequest.append("SELECT MAX(RequestedDate) AS MaxDateTime FROM interface_request WHERE RequestCode in (");
			interfaceRequest.append("SELECT RequestCode FROM temp_cargo_declaration ");
			interfaceRequest.append("WHERE DocumentName = '" + documentName + "' AND DocumentYear = '" + documentYear + "'");
			interfaceRequest.append(")");
			interfaceRequest.append(") interMax ON inter.RequestedDate = interMax.MaxDateTime");*/
			
			
			//interfaceRequest.append("SELECT RequestCode FROM interface_request ");
			//interfaceRequest.append("where RequestCode in (select RequestCode from temp_cargo_declaration where DocumentName = '" + documentName + "' and DocumentYear = '" + documentYear + "') ");
			//interfaceRequest.append("and RequestedDate = ( ");
			//interfaceRequest.append("select max(RequestedDate) from interface_request where RequestCode in (select RequestCode from temp_cargo_declaration where DocumentName = '" + documentName + "' and DocumentYear = '" + documentYear + "')");
			//interfaceRequest.append(")");
			
			StringBuilder query = new StringBuilder();
			//query.append("SELECT * FROM temp_cargo_declaration WHERE RequestCode = (" + interfaceRequest.toString() + ")");
			query.append("SELECT * FROM temp_cargo_declaration WHERE DocumentName = ? and DocumentYear = ? order by ID desc");
			
			log.debug("=========getLastByDocumentNameAndDocumentYear========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TempCargoDeclaration", TempCargoDeclarationImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			// execute the query and return a list from the db
			List<TempCargoDeclaration> lstTem = (List<TempCargoDeclaration>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			if (lstTem != null && lstTem.size() > 0) {
				return lstTem.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	
	public List<TempCargoDeclaration> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM temp_cargo_declaration WHERE DocumentName = ? and DocumentYear = ? order by ID desc");
			
			String sql = query.toString();
			log.debug("==findByDocumentNameAndDocumentYearOrderByDescRequestDate==" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempCargoDeclaration", TempCargoDeclarationImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			// execute the query and return a list from the db
			return (List<TempCargoDeclaration>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TempCargoDeclaration>();
	}
}
