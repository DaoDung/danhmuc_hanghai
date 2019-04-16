/**
 * 
 */
package vn.gt.dao.noticeandmessage.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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
import com.liferay.portlet.asset.service.AssetCategoryPropertyLocalServiceUtil;

import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.model.impl.TempDebitNoteImpl;
import vn.gt.portlet.baocaotichhop.thongke.dvcong.FlowChartDataByDate;
import vn.gt.portlet.kehoach.utils.ChuyenDichTrangThaiUtils;
import vn.gt.tichhop.message.MessageType;
import vn.gt.utils.FormatData;

/**
 * @author win_64
 */
public class TempDocumentFinderImpl extends BasePersistenceImpl<TempDocument> implements TempDocumentFinder {

	private Log log = LogFactoryUtil.getLog(TempDocumentFinderImpl.class);

	public String getCallSignByDocumentNameAndDocumentYear(long documentName, int documentYear) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT CallSign as callSign FROM temp_document ");
			query.append(" WHERE DocumentName = ? and DocumentYear = ? ");

			log.debug("=========getCallSignByDocNameAndDocYear========" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("callSign", Type.STRING);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

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

	public TempDocument getByDocumentNameAndDocumentYear(long documentName, int documentYear) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM temp_document WHERE DocumentName = ? AND DocumentYear = ?");

			String sql = query.toString();
			log.debug("=========getByDocumentNameDocumentYear========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db
			List<TempDocument> lstDocument = (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS,
					QueryUtil.ALL_POS);
			if (Validator.isNotNull(lstDocument) && lstDocument.size() > 0) {
				return lstDocument.get(0);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return null;
	}

	public long countTempDocumentJoinIssuePermissionTransitForStatisticsReport(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String issRequestState,
			String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document temp ");
			query.append(" inner join issue_permission_for_transit iss ");
			query.append(" on iss.DocumentName = temp.DocumentName ");
			query.append(" and   iss.DocumentYear  = temp.DocumentYear ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and iss.ApprovalDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and iss.ApprovalDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and temp.requestState in (" + requestState + ") ");
			}
			if (issRequestState != null) {
				query.append(" and iss.requestState in (" + issRequestState + ") ");
			}
			if (documentStatusCode != null) {
				query.append(" and temp.documentStatusCode in (" + documentStatusCode + ")");
			}

			query.append(" and iss.VersionNo = (SELECT MAX(iss2.VersionNo) "
					+ " FROM issue_permission_for_transit iss2 " + " WHERE iss.DocumentName = iss2.DocumentName) "); // lttai
																														// 13/7/2015
																														// :
																														// lay
																														// version
																														// moi
																														// nhat
																														// cua
																														// giay
																														// phep

			log.debug("---query countTempDocumentJoinIssuePermissionTransitForStatisticsReport----");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long countTempDocumentJoinIssueAcceptanceForStatisticsReport(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String issRequestState,
			String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document temp ");
			query.append(" inner join issue_acceptance iss ");
			query.append(" on iss.DocumentName = temp.DocumentName ");
			query.append(" and   iss.DocumentYear  = temp.DocumentYear ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and iss.ApprovalDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and iss.ApprovalDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and temp.requestState in (" + requestState + ") ");
			}
			if (issRequestState != null) {
				query.append(" and iss.requestState in (" + issRequestState + ") ");
			}
			if (documentStatusCode != null) {
				query.append(" and temp.documentStatusCode in (" + documentStatusCode + ")");
			}

			query.append(" and iss.VersionNo = (SELECT MAX(iss2.VersionNo) " + " FROM issue_acceptance iss2 "
					+ " WHERE iss.DocumentName = iss2.DocumentName) "); // lttai
																		// 13/7/2015
																		// : lay
																		// version
																		// moi
																		// nhat
																		// cua
																		// giay
																		// phep

			log.debug("----query countTempDocumentJoinIssueAcceptanceForStatisticsReport----");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long countTempDocumentJoinIssuePortClearanceForStatisticsReport(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String issRequestState,
			String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document temp ");
			query.append(" inner join issue_port_clearance iss ");
			query.append(" on iss.DocumentName = temp.DocumentName ");
			query.append(" and   iss.DocumentYear  = temp.DocumentYear ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and iss.ApprovalDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and iss.ApprovalDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and temp.requestState in (" + requestState + ") ");
			}
			if (issRequestState != null) {
				query.append(" and iss.requestState in (" + issRequestState + ") ");
			}
			if (documentStatusCode != null) {
				query.append(" and temp.documentStatusCode in (" + documentStatusCode + ")");
			}

			query.append(" and iss.VersionNo = (SELECT MAX(iss2.VersionNo) " + " FROM issue_port_clearance iss2 "
					+ " WHERE iss.DocumentName = iss2.DocumentName) "); // lttai
																		// 13/7/2015
																		// : lay
																		// version
																		// moi
																		// nhat
																		// cua
																		// giay
																		// phep

			log.debug("----query countTempDocumentJoinIssuePortClearanceForStatisticsReport----");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long countTempDocumentJoinIssueShiftingOrderForStatisticsReport(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String issRequestState,
			String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document temp ");
			query.append(" inner join issue_shifting_order  iss ");
			query.append(" on iss.DocumentName = temp.DocumentName ");
			query.append(" and   iss.DocumentYear  = temp.DocumentYear ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and iss.ApprovalDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and iss.ApprovalDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and temp.requestState in (" + requestState + ") ");
			}
			if (issRequestState != null) {
				query.append(" and iss.requestState in (" + issRequestState + ") ");
			}
			if (documentStatusCode != null) {
				query.append(" and temp.documentStatusCode in (" + documentStatusCode + ") ");
			}

			query.append(" and iss.VersionNo = (SELECT MAX(iss2.VersionNo) " + " FROM issue_shifting_order iss2 "
					+ " WHERE iss.DocumentName = iss2.DocumentName) "); // lttai
																		// 13/7/2015
																		// : lay
																		// version
																		// moi
																		// nhat
																		// cua
																		// giay
																		// phep

			// query.append(" GROUP BY temp.DocumentName "); // lttai
			log.debug(
					"-----------------query countTempDocumentJoinIssueShiftingOrderForStatisticsReport------------------- ");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long countTempDocumentForStatisticsReport(String maritimeCode, String dateFrom, String dateTo,
			String documentTypeCode, String requestState, String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT count(*) as total FROM temp_document ");
			query.append(" WHERE 1 = 1 ");
			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and CreatedDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and CreatedDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and requestState in (" + requestState + ")");
			}
			if (documentStatusCode != null) {
				query.append(" and documentStatusCode in (" + documentStatusCode + ")");
			}

			log.debug("-----------------query countTempDocumentForStatisticsReport------------------- ");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long countTempDocumentCompletionForStatisticsReport(String maritimeCode, String dateFrom, String dateTo,
			String documentTypeCode, String requestState, String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT count(*) as total FROM temp_document temp ");
			query.append(" inner join result_completion cmpl ");
			query.append(" on cmpl.DocumentName = temp.DocumentName ");
			query.append(" and   cmpl.DocumentYear  = temp.DocumentYear ");
			query.append(" and   cmpl.RequestState in (19, 12) and length(cmpl.ResponseTimeCVHH) > 0 ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and cmpl.ResponseTimeCVHH >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and cmpl.ResponseTimeCVHH <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}

			query.append(" WHERE 1 = 1 ");

			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			log.debug("-----------------query countTempDocumentCompletionForStatisticsReport------------------- "
					+ query);
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public List<FlowChartDataByDate> countTempDocumentForStatisticsByDate(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String documentStatusCode)
			throws SystemException {
		Session session = null;

		Date date = null;
		List<FlowChartDataByDate> result = null;
		FlowChartDataByDate flowChartDataByDate = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT count(*) as documentNumber, Date(CreatedDate) as chartDate FROM temp_document ");
			query.append(" WHERE 1 = 1 ");
			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and CreatedDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");

			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and CreatedDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");

			}
			if (maritimeCode != null) {
				query.append(" and MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and requestState in (" + requestState + ")");
			}
			if (documentStatusCode != null) {
				query.append(" and documentStatusCode in (" + documentStatusCode + ")");
			}
			query.append(" group by Date(CreatedDate)");
			query.append(" order by Date(CreatedDate) asc");

			// _log.debug("-----------------query
			// countTempDocumentForStatisticsReport------------------- ");
			// _log.debug(query.toString());
			// System.out.println("---------------------------------------------------------------");
			// System.out.println(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("documentNumber", Type.LONG);
			q.addScalar("chartDate", Type.STRING);
			q.setCacheable(false);

			List listDateAndCount = QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (Iterator iter = listDateAndCount.iterator(); iter.hasNext();) {
				Object object[] = (Object[]) iter.next();
				flowChartDataByDate = new FlowChartDataByDate();
				flowChartDataByDate.setDocumentNumber(((Long) object[0]).longValue());
				flowChartDataByDate.setChartDate(((String) object[1]).substring(8, 10));
				if (result == null) {
					result = new ArrayList<FlowChartDataByDate>();
				}
				result.add(flowChartDataByDate);
				// System.out.println("Ngay: "+
				// flowChartDataByDate.getChartDate() +
				// " so tau: "+flowChartDataByDate.getDocumentNumber());
			}
			return result;

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countTempDocumentByDocumentStatusCode(String documentStatusCode, String documentTypeCode)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();

			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0
					&& Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				StringBuilder query = new StringBuilder();
				query.append("SELECT count(*) as total FROM temp_document ");
				query.append(" WHERE DocumentStatusCode in (" + documentStatusCode
						+ ") and DocumentTypeCode = ? AND DocumentTypeCode NOT LIKE 'HH_%' ");

				String sql = query.toString();
				log.debug("=========countTempDocumentByDocumentStatusCode========" + sql);
				log.debug("=========countTempDocumentByDocumentStatusCode========" + sql + "=====documentTypeCode=="
						+ documentTypeCode);
				SQLQuery q = session.createSQLQuery(sql);
				q.addScalar("total", Type.LONG);
				QueryPos qPos = QueryPos.getInstance(q);
				qPos.add(documentTypeCode);
				Iterator<Long> itr = q.list().iterator();

				if (itr.hasNext()) {
					Long count = itr.next();
					if (count != null) {
						return count.intValue();
					}
				}
			}

			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findTempDocumentArivalByMaritimeCodeAndDateFromAndDateTo(String maritimeCode,
			String dateFrom, String dateTo, String documentTypeCode, String requestState, String documentStatusCode)
			throws SystemException {
		Session session = null;

		Date date = null;
		List<TempDocument> allTempDocument = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM temp_document ");
			query.append(" WHERE 1 = 1 ");

			if (maritimeCode != null) {
				query.append(" and MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and requestState !=" + requestState);
			}
			if (documentStatusCode != null) {
				query.append(" and documentStatusCode != " + documentStatusCode);
			}

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {

				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and ShipDateFrom >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}

			// Thoi gian roi
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {

				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and ShipDateFrom <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}

			// execute the query and return a list from the db
			String sql = query.toString();
			sql = sql + " limit 0,1000 ";

			System.out.println(
					"TempDocumentFinderImpl.findTempDocumentArivalByMaritimeCodeAndDateFromAndDateTo(sql): " + sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			allTempDocument = (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS,
					QueryUtil.ALL_POS);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allTempDocument;
	}

	public List<TempDocument> findTempDocumentLeaveByMaritimeCodeAndDateFromAndDateTo(String maritimeCode,
			String dateFrom, String dateTo, String documentTypeCode, String requestState, String documentStatusCode)
			throws SystemException {
		Session session = null;

		Date date = null;
		List<TempDocument> allTempDocument = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM temp_document ");
			query.append(" WHERE 1 = 1 ");

			if (maritimeCode != null) {
				query.append(" and MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and requestState !=" + requestState);
			}
			if (documentStatusCode != null) {
				query.append(" and documentStatusCode != " + documentStatusCode);
			}

			query.append(" and ShipDateTo is not null");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {

				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and ShipDateTo >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}

			// Thoi gian roi
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {

				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and ShipDateTo <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			String sql = query.toString();
			sql = sql + " limit 0,1000 ";
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);
			// execute the query and return a list from the db

			allTempDocument = (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS,
					QueryUtil.ALL_POS);

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return allTempDocument;
	}

	public List<TempDocument> findTemDocumentByDocumentNameAndDocumentYear(long documentName, int documentYear)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM temp_document WHERE DocumentName = ? AND DocumentYear = ?");

			String sql = query.toString();
			sql = sql + " limit 0,1000 ";
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db
			return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public TempDocument findTemDocumentByDocumentNameDocumentYear(long documentName, int documentYear)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("SELECT * FROM temp_document WHERE DocumentName = ? AND DocumentYear = ?");

			String sql = query.toString();
			log.debug("=========findTemDocumentByDocumentNameDocumentYear========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db
			return (TempDocument) q.uniqueResult();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findTempDocumentByKeHoach(String requestState, String documentTypeCode,
			String maritimeCode, String shipName, String positionCode, String portRegionCode, String mabankhai,
			String stateCode, String shipDateFromStart, String shipDateFromEnd, String shipDateToStart,
			String shipDateToEnd, String callSign, String imo, String ngayLamThuTucFrom, String ngayLamThuTucTo,
			int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "SELECT * FROM temp_document WHERE ";

			if (Validator.isNotNull(requestState) && requestState.trim().length() > 0) {
				// if (requestState.trim().equalsIgnoreCase("114")) {
				//// requestState = "14"; // tuong duong trang thai Cho cap lenh
				// dieu dong
				// query.append(" RequestState in (" + requestState + ") ");
				// if (
				// documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
				// || documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
				// || documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
				// )
				// {
				// query.append(" AND DocumentName in (Select distinct
				// DocumentName from issue_shifting_order where StampStatus = 0
				// and IsCancel = 0 and LENGTH(CancelNote) > 0) ");
				// }
				// } else {
				// query.append(" RequestState in (" + requestState + ") ");
				// }
				query.append(" RequestState in (" + requestState + ") ");
			}

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			// cang vu hang hai
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// ten tau
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				shipName = shipName.trim();
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// vi tri tau di chuyen
			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				query.append(" AND ShipPosition = ?");
			}

			// khu vuc cang
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND PortRegionCode = ?");
			}

			// Ma ban khai documentName
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				query.append(" AND DocumentName = ?");
			}

			// Quoc tich
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {

				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian den TO
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {

				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR ShipDateFrom IS NULL)");
			}

			// Thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {

				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR ShipDateTo IS NULL)");
			}

			// Thoi gian roi TO
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {

				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR CreatedDate IS NULL)");
			}

			// Ho hieu
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}

			/**
			 * I. KÃ¡ÂºÂ¾ HOÃ¡ÂºÂ CH 1. CHÃ¡Â»Å“ TIÃ¡ÂºÂ¾P NHÃ¡ÂºÂ¬N - 11 2.
			 * YÃƒÅ U CÃ¡ÂºÂ¦U SÃ¡Â»Â¬A Ã„ï¿½Ã¡Â»Å½I BÃ¡Â»â€� SUNG - 27 3.
			 * CHÃ¡Â»Å“ CÃ¡ÂºÂ¤P LÃ¡Â»â€ NH Ã„ï¿½IÃ¡Â»â‚¬U Ã„ï¿½Ã¡Â»ËœNG - 14 4.
			 * TÃ¡Â»Âª CHÃ¡Â»ï¿½I TIÃ¡ÂºÂ¾P NHÃ¡ÂºÂ¬N - 13 5. HÃ¡Â»Â¦Y
			 * LÃ¡Â»â€ NH Ã„ï¿½IÃ¡Â»â‚¬U Ã„ï¿½Ã¡Â»ËœNG - 16 6. Ã„ï¿½ÃƒÆ’
			 * CÃ¡ÂºÂ¤P LÃ¡Â»â€ NH Ã„ï¿½IÃ¡Â»â‚¬U Ã„ï¿½Ã¡Â»ËœNG - 15 7.
			 * Ã„ï¿½ÃƒÆ’ CÃ¡ÂºÂ¤P LÃ¡Â»â€ NH Ã„ï¿½IÃ¡Â»â‚¬U Ã„ï¿½Ã¡Â»ËœNG - 12
			 */

			query.append(" ORDER BY ");
			// query.append("DocumentName DESC, ");
			query.append("case when RequestState = '11' then 1 ");
			query.append("when RequestState = '27' then 2 ");
			query.append("when RequestState = '14' then 3 ");
			query.append("when RequestState = '13' then 4 ");
			query.append("when RequestState = '16' then 5 ");
			query.append("when RequestState = '15' then 6 ");
			query.append("when RequestState = '12' then 7 ");
			query.append("end ASC ");

			// TODO KE HOACH sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {

				query.append(", ShipDateFrom DESC, CreatedDate DESC, id DESC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(", ShipDateTo DESC, CreatedDate DESC, id DESC");
			} else {
				query.append(", ShipDateFrom DESC, ShipDateTo DESC, CreatedDate DESC, id DESC");
			}

			sql = sql + query.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			log.debug("===findTempDocumentByKeHoach==" + sql.toString());
			// log.info("===findTempDocumentByKeHoach==" );
			QueryPos qPos = QueryPos.getInstance(q);
			log.debug("===documentTypeCode===" + documentTypeCode + "===");
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				qPos.add(documentTypeCode);

			}

			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
				log.debug("===maritimeCode==" + maritimeCode);
			}

			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				qPos.add(positionCode.trim());
				log.debug("===positionCode==" + positionCode);
			}
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
				log.debug("===portRegionCode==" + portRegionCode);
			}
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				qPos.add(mabankhai.trim());
				log.debug("===mabankhai==" + mabankhai);
			}
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim().toUpperCase());
				log.debug("===stateCode==" + stateCode);
			}

			log.debug("===shipDateFromStart==" + shipDateFromStart);
			log.debug("===shipDateFromEnd==" + shipDateFromEnd);
			log.debug("===shipDateToStart==" + shipDateToStart);
			log.debug("===shipDateToEnd==" + shipDateToEnd);

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findTempDocumentByKeHoach(String requestState, String documentTypeCode,
			String maritimeCode, String shipName, String positionCode, String portRegionCode, String mabankhai,
			String stateCode, String shipDateFromStart, String shipDateFromEnd, String shipDateToStart,
			String shipDateToEnd, String callSign, String imo, String ngayLamThuTucFrom, String ngayLamThuTucTo,
			String nameOfShipownersAgents, String portRegionCodeNext, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "SELECT * FROM temp_document WHERE ";

			if (Validator.isNotNull(requestState) && requestState.trim().length() > 0) {
				query.append(" RequestState in (" + requestState + ") ");
			}

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			// cang vu hang hai
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// ten tau
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				shipName = shipName.trim();
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// vi tri tau di chuyen
			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				query.append(" AND ShipPosition = ?");
			}

			// khu vuc cang
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND PortRegionCode = ?");
			}

			// Ma ban khai documentName
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				query.append(" AND DocumentName = ?");
			}

			// Quoc tich
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {

				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian den TO
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {

				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR ShipDateFrom IS NULL)");
			}

			// Thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {

				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR ShipDateTo IS NULL)");
			}

			// Thoi gian roi TO
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {

				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR CreatedDate IS NULL)");
			}

			// Ho hieu
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}

			if (Validator.isNotNull(nameOfShipownersAgents) && nameOfShipownersAgents.trim().length() > 0) {
				query.append(" AND NameOfShipownersAgents like '%" + nameOfShipownersAgents.trim() + "%' ");
			}

			query.append(" ORDER BY ");
			// query.append("DocumentName DESC, ");
			query.append("case when RequestState = '11' then 1 ");
			query.append("when RequestState = '27' then 2 ");
			query.append("when RequestState = '14' then 3 ");
			query.append("when RequestState = '13' then 4 ");
			query.append("when RequestState = '16' then 5 ");
			query.append("when RequestState = '15' then 6 ");
			query.append("when RequestState = '12' then 7 ");
			query.append("end ASC ");

			// TODO KE HOACH sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {

				query.append(", ShipDateFrom DESC, CreatedDate DESC, id DESC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(", ShipDateTo DESC, CreatedDate DESC, id DESC");
			} else {
				query.append(", ShipDateFrom DESC, ShipDateTo DESC, CreatedDate DESC, id DESC");
			}

			sql = sql + query.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			log.debug("===findTempDocumentByKeHoach==" + sql.toString());
			// log.info("===findTempDocumentByKeHoach==" );
			QueryPos qPos = QueryPos.getInstance(q);
			log.debug("===documentTypeCode===" + documentTypeCode + "===");
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				qPos.add(documentTypeCode);

			}

			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
				log.debug("===maritimeCode==" + maritimeCode);
			}

			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				qPos.add(positionCode.trim());
				log.debug("===positionCode==" + positionCode);
			}
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
				log.debug("===portRegionCode==" + portRegionCode);
			}
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				qPos.add(mabankhai.trim());
				log.debug("===mabankhai==" + mabankhai);
			}
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim().toUpperCase());
				log.debug("===stateCode==" + stateCode);
			}

			log.debug("===shipDateFromStart==" + shipDateFromStart);
			log.debug("===shipDateFromEnd==" + shipDateFromEnd);
			log.debug("===shipDateToStart==" + shipDateToStart);
			log.debug("===shipDateToEnd==" + shipDateToEnd);

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findTempDocumentByDocumentStatusCode(String documentStatusCode, String documentTypeCode,
			int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0
					&& Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				StringBuilder query = new StringBuilder();

				query.append("SELECT * FROM temp_document ");
				query.append(" WHERE DocumentStatusCode in (" + documentStatusCode
						+ ") and DocumentTypeCode = ? AND DocumentTypeCode NOT LIKE 'HH_%' ");

				String sql = query.toString();
				if (start >= 0) {
					int count = end - start;
					sql = sql + " limit " + start + "," + count;
				}
				log.debug("=========findTempDocumentByDocumentStatusCode========" + sql);
				log.debug("=========findTempDocumentByDocumentStatusCode========" + sql);
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity("TempDocument", TempDocumentImpl.class);
				QueryPos qPos = QueryPos.getInstance(q);
				qPos.add(documentTypeCode);

				// execute the query and return a list from the db
				if (start >= 0) {
					return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				} else {
					return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
				}
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TempDocument>();
	}

	public List<TempDocument> findTempDocumentByRequestState(String requestState, String documentTypeCode, int start,
			int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			if (Validator.isNotNull(requestState) && requestState.trim().length() > 0
					&& Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				StringBuilder query = new StringBuilder();

				query.append("SELECT * FROM temp_document ");
				query.append(" WHERE RequestState in (" + requestState
						+ ") and DocumentTypeCode = ? AND DocumentTypeCode NOT LIKE 'HH_%' ");

				String sql = query.toString();
				if (start >= 0) {
					int count = end - start;
					sql = sql + " limit " + start + "," + count;
				}
				log.debug("=========findTempDocumentByRequestState========" + sql);

				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity("TempDocument", TempDocumentImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);
				qPos.add(documentTypeCode);

				// execute the query and return a list from the db
				if (start >= 0) {
					return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				} else {
					return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
				}
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TempDocument>();
	}

	public int countTempDocumentByRequestState(String requestState, String documentTypeCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();

			if (Validator.isNotNull(requestState) && requestState.trim().length() > 0
					&& Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				StringBuilder query = new StringBuilder();
				query.append("SELECT count(*) as total FROM temp_document ");
				query.append(" WHERE RequestState in (" + requestState
						+ ") and DocumentTypeCode = ? AND DocumentTypeCode NOT LIKE 'HH_%' ");

				String sql = query.toString();
				log.debug("=========countTempDocumentByRequestState========" + sql);
				SQLQuery q = session.createSQLQuery(sql);
				q.addScalar("total", Type.LONG);
				QueryPos qPos = QueryPos.getInstance(q);
				qPos.add(documentTypeCode);

				Iterator<Long> itr = q.list().iterator();

				if (itr.hasNext()) {
					Long count = itr.next();
					if (count != null) {
						return count.intValue();
					}
				}
			}

			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countTempDocumentByKeHoach(String requestState, String documentTypeCode, String maritimeCode,
			String shipName, String positionCode, String portRegionCode, String mabankhai, String stateCode,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String callSign, String imo, String ngayLamThuTucFrom, String ngayLamThuTucTo) throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			String sql = "SELECT count(*) as total FROM temp_document WHERE ";

			if (Validator.isNotNull(requestState) && requestState.trim().length() > 0) {
				// if (requestState.trim().equalsIgnoreCase("114")) {
				//// requestState = "14"; // tuong duong trang thai Cho cap lenh
				// dieu dong
				// query.append(" RequestState in (" + requestState + ") ");
				// if (
				// documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
				// || documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
				// || documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
				// )
				// {
				// query.append(" AND DocumentName in (Select distinct
				// DocumentName from issue_shifting_order where StampStatus = 0
				// and IsCancel = 0 and LENGTH(CancelNote) > 0) ");
				// }
				// } else {
				// query.append(" RequestState in (" + requestState + ") ");
				// }
				query.append(" RequestState in (" + requestState + ") ");
			}

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			// cang vu hang hai
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// ten tau
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				shipName = shipName.trim();
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// vi tri tau di chuyen
			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				query.append(" AND ShipPosition = ?");
			}

			// khu vuc cang
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND PortRegionCode = ?");
			}

			// Ma ban khai documentName
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				query.append(" AND DocumentName = ?");
			}

			// Quoc tich
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {

				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);

				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian den TO
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR ShipDateFrom IS NULL)");
			}

			// Thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR ShipDateTo IS NULL)");
			}

			// Thoi gian roi TO
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR CreatedDate IS NULL)");
			}

			// Ho hieu
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}
			sql = sql + query.toString();

			log.debug("==countTempDocumentByKeHoach==" + sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				log.debug("==documentTypeCode==" + documentTypeCode);
				qPos.add(documentTypeCode.trim());
			}

			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}

			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				qPos.add(positionCode.trim());
			}
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
			}
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				qPos.add(mabankhai.trim());
			}
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim().toUpperCase());
			}
			System.out.println("TempDocumentFinderImpl.countTempDocumentByKeHoach(mabankhai)" + mabankhai);
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

	public int countTempDocumentByKeHoach(String requestState, String documentTypeCode, String maritimeCode,
			String shipName, String positionCode, String portRegionCode, String mabankhai, String stateCode,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String callSign, String imo, String ngayLamThuTucFrom, String ngayLamThuTucTo,
			String nameOfShipownersAgents, String portRegionCodeNext) throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			String sql = "SELECT count(*) as total FROM temp_document WHERE ";

			if (Validator.isNotNull(requestState) && requestState.trim().length() > 0) {
				query.append(" RequestState in (" + requestState + ") ");
			}

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			// cang vu hang hai
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// ten tau
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				shipName = shipName.trim();
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// vi tri tau di chuyen
			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				query.append(" AND ShipPosition = ?");
			}

			// khu vuc cang
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND PortRegionCode = ?");
			}

			// Ma ban khai documentName
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				query.append(" AND DocumentName = ?");
			}

			// Quoc tich
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {

				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);

				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian den TO
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR ShipDateFrom IS NULL)");
			}

			// Thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR ShipDateTo IS NULL)");
			}

			// Thoi gian roi TO
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR CreatedDate IS NULL)");
			}

			// Ho hieu
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}
			if (Validator.isNotNull(nameOfShipownersAgents) && nameOfShipownersAgents.trim().length() > 0) {
				query.append(" AND NameOfShipownersAgents like '%" + nameOfShipownersAgents.trim() + "%' ");
			}
			// if (Validator.isNotNull(portRegionCodeNext) &&
			// portRegionCodeNext.trim().length() > 0) {
			// query.append(" AND NameOfShipownersAgents like '%" +
			// portRegionCodeNext.trim() + "%' ");
			// }

			sql = sql + query.toString();

			log.debug("==countTempDocumentByKeHoach==" + sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				log.debug("==documentTypeCode==" + documentTypeCode);
				qPos.add(documentTypeCode.trim());
			}

			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}

			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				qPos.add(positionCode.trim());
			}
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
			}
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				qPos.add(mabankhai.trim());
			}
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim().toUpperCase());
			}
			System.out.println("TempDocumentFinderImpl.countTempDocumentByKeHoach(mabankhai)" + mabankhai);
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

	public List<TempDocument> findTempDocumentByThuTuc(String documentTypeCode, String documentName,
			String documentYear, String maLoaiHoSo, String shipName, String shipTypeCode, String stateCode,
			String shipCaptain, String callSign, String userCreated, int start, int end) throws SystemException {

		log.debug("=========THU TUC SEARCH --shipName========" + shipName);

		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "SELECT * FROM temp_document WHERE 1=1 ";

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			if (Validator.isNotNull(documentName) && documentName.trim().length() > 0
					&& FormatData.convertToInt(documentName) > 0) {
				query.append(" AND  DocumentName=" + documentName.trim());
			}

			if (Validator.isNotNull(documentYear) && documentYear.trim().length() > 0
					&& FormatData.convertToInt(documentYear) > 0) {
				query.append(" AND  DocumentYear=" + documentYear.trim());
			}

			// Ten tau
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// Loai TAU
			if (Validator.isNotNull(shipTypeCode) && shipTypeCode.trim().length() > 0) {
				query.append(" AND ShipTypeCode = ?");
			}

			// Quoc Tich
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// Ten thuyen truong
			if (Validator.isNotNull(shipCaptain) && shipCaptain.trim().length() > 0) {
				query.append(" AND ShipCaptain like '%" + shipCaptain.trim() + "%' ");
			}

			// Ho hieu
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}

			// Ma SO Thue
			if (Validator.isNotNull(userCreated) && userCreated.trim().length() > 0) {
				query.append(" AND UserCreated like '%" + userCreated.trim() + "%' ");
			}

			query.append(" ORDER ShipDateFrom DESC, DocumentStatusCode ASC ,id DESC");

			sql = sql + query.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			log.debug("=========THU TUC SEARCH --findTempDocumentByThuTuc========");

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				qPos.add(documentTypeCode);
			}

			// if (Validator.isNotNull(shipName) && shipName.trim().length() >
			// 0) {
			// qPos.add(" '%"+shipName.trim()+"%' ");
			// }
			if (Validator.isNotNull(shipTypeCode) && shipTypeCode.trim().length() > 0) {
				qPos.add(shipTypeCode.trim());
			}
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim());
			}
			// if (Validator.isNotNull(shipCaptain) &&
			// shipCaptain.trim().length() > 0) {
			// qPos.add(" %"+shipCaptain.trim()+"% ");
			// }
			// if (Validator.isNotNull(callSign) && callSign.trim().length() >
			// 0) {
			// qPos.add(" %"+callSign.trim()+"% ");
			// }
			// if (Validator.isNotNull(userCreated) &&
			// userCreated.trim().length() > 0) {
			// qPos.add(" %"+userCreated.trim()+"% ");
			// }

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countTempDocumentByThuTuc(String documentTypeCode, String documentName, String documentYear,
			String maLoaiHoSo, String shipName, String shipTypeCode, String stateCode, String shipCaptain,
			String callSign, String userCreated) throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			String sql = "SELECT count(*) as total FROM temp_document WHERE 1=1";

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			if (Validator.isNotNull(documentName) && documentName.trim().length() > 0
					&& FormatData.convertToInt(documentName) > 0) {
				query.append(" AND  DocumentName=" + documentName.trim());
			}

			if (Validator.isNotNull(documentYear) && documentYear.trim().length() > 0
					&& FormatData.convertToInt(documentYear) > 0) {
				query.append(" AND  DocumentYear=" + documentYear.trim());
			}

			// Ten tau
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// Loai TAU
			if (Validator.isNotNull(shipTypeCode) && shipTypeCode.trim().length() > 0) {
				query.append(" AND ShipTypeCode = ?");
			}

			// Quoc Tich
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// Ten thuyen truong
			if (Validator.isNotNull(shipCaptain) && shipCaptain.trim().length() > 0) {
				query.append(" AND ShipCaptain like '%" + shipCaptain.trim() + "%' ");
			}

			// Ho hieu
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}

			// Ma SO Thue
			if (Validator.isNotNull(userCreated) && userCreated.trim().length() > 0) {
				query.append(" AND UserCreated like '%" + userCreated.trim() + "%' ");
			}

			sql = sql + query.toString();
			log.debug("=========THU TUC SEARCH --count TempDocument ========" + sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				qPos.add(documentTypeCode);
			}

			// if (Validator.isNotNull(shipName) && shipName.trim().length() >
			// 0) {
			// qPos.add(" '%"+shipName.trim()+"%' ");
			// }
			if (Validator.isNotNull(shipTypeCode) && shipTypeCode.trim().length() > 0) {
				qPos.add(shipTypeCode.trim());
			}
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim());
			}
			// if (Validator.isNotNull(shipCaptain) &&
			// shipCaptain.trim().length() > 0) {
			// qPos.add(" %"+shipCaptain.trim()+"% ");
			// }
			// if (Validator.isNotNull(callSign) && callSign.trim().length() >
			// 0) {
			// qPos.add(" %"+callSign.trim()+"% ");
			// }
			// if (Validator.isNotNull(userCreated) &&
			// userCreated.trim().length() > 0) {
			// qPos.add(" %"+userCreated.trim()+"% ");
			// }

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

	public List<TempDocument> findDanhSachHoSoRoleThuTuc(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, int start, int end, boolean isDTND, boolean isDTNDCam) throws SystemException {

		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "SELECT * FROM temp_document WHERE 1=1 ";

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND PortCode = ?");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND LastPortCode = ?");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (DocumentName = '" + maBanKhai + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				// if (documentStatusCode.equalsIgnoreCase("120")) {
				//// documentStatusCode = "20"; // tuong duong de nghi cap giay
				// phep
				//
				// query.append(" AND documentStatusCode IN (" +
				// documentStatusCode.trim() + ")");
				//
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_QUA_CANH))
				// {
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_permission_for_transit where
				// StampStatus = 0 and IsCancel = 0 and LENGTH(CancelNote) > 0)
				// ) ");
				//
				// }
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
				// ||
				// documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_ROI_CANG)
				// ||
				// documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)){
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_port_clearance where StampStatus = 0
				// and IsCancel = 0 and LENGTH(CancelNote) > 0) ) ");
				// }
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))
				// {
				//
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_acceptance where StampStatus = 0 and
				// IsCancel = 0 and LENGTH(CancelNote) > 0) ) ");
				// }
				// } else {
				// query.append(" AND documentStatusCode IN (" +
				// documentStatusCode.trim() + ")");
				// }
				query.append(" AND documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// DAI LY DEN
			if (Validator.isNotNull(arrivalShipAgency) && arrivalShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameArrivalShipAgency) && nameArrivalShipAgency.trim().length() > 0) {

				// StringBuilder daiLyDen = new StringBuilder();
				// daiLyDen.append("SELECT ShipAgencyCode FROM dm_ship_agency
				// ");
				// daiLyDen.append("where ShipAgencyNameVN like '%" +
				// arrivalShipAgency.trim() + "%' ");

				query.append(" AND ArrivalShipAgency = ?");
				// query.append(" AND ArrivalShipAgency in ( " +
				// daiLyDen.toString() + " )");
			}

			// DAI LY DI
			if (Validator.isNotNull(departureShipAgency) && departureShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameDepartureShipAgency) && nameDepartureShipAgency.trim().length() > 0) {

				// StringBuilder daiLyDi = new StringBuilder();
				// daiLyDi.append("SELECT ShipAgencyCode FROM dm_ship_agency ");
				// daiLyDi.append("where ShipAgencyNameVN like '%" +
				// departureShipAgency.trim() + "%' ");

				query.append(" AND DepartureShipAgency = ?");
				// query.append(" AND DepartureShipAgency in ( " +
				// daiLyDi.toString() + " )");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND PortRegionCode = ?");
			}

			/**
			 * II- THÃ¡Â»Â¦ TÃ¡Â»Â¤C 1. Ã„ï¿½ÃƒÆ’ TIÃ¡ÂºÂ¾P NHÃ¡ÂºÂ¬N - 18 2.
			 * CHÃ¡Â»Å“ PHÃƒÅ  DUYÃ¡Â»â€ T HOÃƒâ‚¬N THÃƒâ‚¬NH THÃ¡Â»Â¦ TÃ¡Â»Â¤C
			 * - 12 3. Ã„ï¿½Ã¡Â»â‚¬ NGHÃ¡Â»Å  CÃ¡ÂºÂ¤P GIÃ¡ÂºÂ¤Y PHÃƒâ€°P - 20
			 * 4. YÃƒÅ U CÃ¡ÂºÂ¦Y SÃ¡Â»Â¬A Ã„ï¿½Ã¡Â»â€�I BÃ¡Â»â€� SUNG - 13 5.
			 * PHÃƒÅ  DUYÃ¡Â»â€ T VÃƒâ‚¬ HOÃƒâ‚¬N THÃƒâ‚¬NH THÃ¡Â»Â¦ TÃ¡Â»Â¤C -
			 * 19 6. HÃ¡Â»Â¦Y THÃ¡Â»Â¦ TÃ¡Â»Â¤C - 10
			 */

			if (!isDTND && !isDTNDCam) {
				query.append(
						" AND DocumentTypeCode in ( 'NC', 'XC', 'QC', '4', '5', '8', '9', '10', '11', '12', '13' ) ");
			} else if (isDTND && isDTNDCam) {
				query.append(" AND DocumentTypeCode in ( '14', '15', '16', '17' ) ");
			} else {

				if (Validator.isNotNull(documentTypeCode)
						&& (documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6) || documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7))
						|| isDTND) {
					query.append(" AND DocumentTypeCode in ( '16', '17' ) ");
				}
				if (Validator.isNotNull(documentTypeCode)
						&& (documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH) || documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH))
						|| isDTNDCam) {
					query.append(" AND DocumentTypeCode in ( '14', '15' ) ");
				} 

			}

			query.append(" ORDER BY ");
			// query.append(" DocumentName DESC, ");
			query.append("case when DocumentStatusCode = '18' then 1 ");
			query.append("when DocumentStatusCode = '12' then 2 ");
			query.append("when DocumentStatusCode = '20' then 3 ");
			query.append("when DocumentStatusCode = '13' then 4 ");
			query.append("when DocumentStatusCode = '19' then 5 ");
			query.append("when DocumentStatusCode = '10' then 6 ");
			query.append("end asc ");

			// TODO THU TUC sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {
				query.append(", ShipDateFrom DESC, CreatedDate DESC, id DESC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(", ShipDateTo DESC, CreatedDate DESC, id DESC");

			} else {
				query.append(", ShipDateFrom DESC, ShipDateTo DESC, CreatedDate DESC, id DESC");
			}

			sql = sql + query.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			log.debug("=========findDanhSachHoSoRoleThuTuc By THU TUC ===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);

			// Pb NC,XC,QC,VC,RC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {

				qPos.add(documentTypeCode.trim());
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				qPos.add(portCode.trim());
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				qPos.add(lastPortCode.trim());
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim());
			}

			// DAI LY DEN
			if (Validator.isNotNull(arrivalShipAgency) && arrivalShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameArrivalShipAgency) && nameArrivalShipAgency.trim().length() > 0) {
				qPos.add(arrivalShipAgency.trim());
			}

			// DAI LY DI
			if (Validator.isNotNull(departureShipAgency) && departureShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameDepartureShipAgency) && nameDepartureShipAgency.trim().length() > 0) {
				qPos.add(departureShipAgency.trim());
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
			}

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findDanhSachHoSoRoleThuTuc(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, String nameOfShipownersAgents, String maritimeCodeNext, int start,
			int end, boolean isDTND, boolean isDTNDCam) throws SystemException {

		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "SELECT * FROM temp_document WHERE 1=1 ";

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND PortCode = ?");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND LastPortCode = ?");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (DocumentName = '" + maBanKhai + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// DAI LY DEN
			if (Validator.isNotNull(arrivalShipAgency) && arrivalShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameArrivalShipAgency) && nameArrivalShipAgency.trim().length() > 0) {

				query.append(" AND ArrivalShipAgency = ?");
			}

			// DAI LY DI
			if (Validator.isNotNull(departureShipAgency) && departureShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameDepartureShipAgency) && nameDepartureShipAgency.trim().length() > 0) {

				query.append(" AND DepartureShipAgency = ?");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND PortRegionCode = ?");
			}

			if (!isDTND && !isDTNDCam) {
				query.append(
						" AND DocumentTypeCode in ( 'NC', 'XC', 'QC', '4', '5', '8', '9', '10', '11', '12', '13' ) ");
			} else if (isDTND && isDTNDCam) {
				query.append(" AND DocumentTypeCode in ( '14', '15', '16', '17' ) ");
			} else {

				if (Validator.isNotNull(documentTypeCode)
						&& (documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6) || documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7))
						|| isDTND) {
					query.append(" AND DocumentTypeCode in ( '16', '17' ) ");
				}
				if (Validator.isNotNull(documentTypeCode)
						&& (documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH) || documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH))
						|| isDTNDCam) {
					query.append(" AND DocumentTypeCode in ( '14', '15' ) ");
				} 

			}

			if (Validator.isNotNull(nameOfShipownersAgents) && nameOfShipownersAgents.trim().length() > 0) {
				query.append(" AND NameOfShipownersAgents like '%" + nameOfShipownersAgents.trim() + "%' ");
			}

			if (Validator.isNotNull(maritimeCodeNext) && maritimeCodeNext.trim().length() > 0) {
				query.append(" AND LastPortCode like '%" + maritimeCodeNext.trim() + "%' ");
			}

			query.append(" ORDER BY ");
			// query.append(" DocumentName DESC, ");
			query.append("case when DocumentStatusCode = '18' then 1 ");
			query.append("when DocumentStatusCode = '12' then 2 ");
			query.append("when DocumentStatusCode = '20' then 3 ");
			query.append("when DocumentStatusCode = '13' then 4 ");
			query.append("when DocumentStatusCode = '19' then 5 ");
			query.append("when DocumentStatusCode = '10' then 6 ");
			query.append("when DocumentStatusCode = '25' then 7 ");
			query.append("end asc ");

			// TODO THU TUC sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {
				query.append(", ShipDateFrom DESC, CreatedDate DESC, id DESC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(", ShipDateTo DESC, CreatedDate DESC, id DESC");

			} else {
				query.append(", ShipDateFrom DESC, ShipDateTo DESC, CreatedDate DESC, id DESC");
			}

			sql = sql + query.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			log.debug("=========findDanhSachHoSoRoleThuTuc By THU TUC ===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);

			// Pb NC,XC,QC,VC,RC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {

				qPos.add(documentTypeCode.trim());
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				qPos.add(portCode.trim());
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				qPos.add(lastPortCode.trim());
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim());
			}

			// DAI LY DEN
			if (Validator.isNotNull(arrivalShipAgency) && arrivalShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameArrivalShipAgency) && nameArrivalShipAgency.trim().length() > 0) {
				qPos.add(arrivalShipAgency.trim());
			}

			// DAI LY DI
			if (Validator.isNotNull(departureShipAgency) && departureShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameDepartureShipAgency) && nameDepartureShipAgency.trim().length() > 0) {
				qPos.add(departureShipAgency.trim());
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
			}

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findDanhSachHoSoRoleThuTucLikeShipAgency(String documentTypeCode, String maritimeCode,
			String portCode, String lastPortCode, String shipName, String stateCode, String callSign, String imo,
			String shipPosition, String shipDateFromStart, String shipDateFromEnd, String shipDateToStart,
			String shipDateToEnd, String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append(
					"SELECT temp.ID, temp.RequestCode, temp.RequestState, temp.DocumentName, temp.DocumentYear, temp.DocumentStatusCode, temp.DocumentTypeCode, ");
			query.append(
					"temp.UserCreated, temp.ShipAgencyCode, temp.ShipName, temp.ShipTypeCode, temp.StateCode, temp.ShipCaptain, temp.IMO, temp.GRT, temp.NT, temp.DWT, ");
			query.append(
					"temp.UnitGRT, temp.UnitNT , temp.UnitDWT, temp.CallSign, temp.PreDocumentName, temp.CreatedDate, temp.LastModifiedDate, temp.FlowFlag, ");
			query.append(
					"temp.DocumentStatusCode, temp.LocationCode, temp.MaritimeCode, temp.PortRegionCode, temp.PortCode, temp.LastPortCode, temp.ShipPosition, ");
			query.append(
					"temp.ShipOwnerCode, temp.ArrivalShipAgency, temp.DepartureShipAgency, temp.ShipDateFrom, temp.ShipDateTo ");
			query.append("FROM temp_document temp ");

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				// DAI LY DEN
				if (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
					if (arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0) {
						query.append("inner join dm_ship_agency dmArri ");
						query.append("on temp.ArrivalShipAgency = dmArri.ShipAgencyCode ");
						query.append("where dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");
					}

					// DAI LY DI
				} else if (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)) {
					if (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0) {
						query.append("inner join dm_ship_agency dmDep ");
						query.append("on temp.DepartureShipAgency = dmDep.ShipAgencyCode ");
						query.append("where dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");
					}

				} else if (documentTypeCode.equals(MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN)) {
					if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
							&& (departureShipAgency.trim().length() == 0
									&& nameDepartureShipAgency.trim().length() > 0)) {

						query.append("inner join dm_ship_agency dmDep ");
						query.append("on temp.DepartureShipAgency = dmDep.ShipAgencyCode ");
						query.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
								+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");
						query.append(" WHERE 1=1  ");
					}

					if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
							&& (departureShipAgency.trim().length() == 0
									&& nameDepartureShipAgency.trim().length() > 0)) {
						query.append("inner join dm_ship_agency dmDep ");
						query.append("on temp.DepartureShipAgency = dmDep.ShipAgencyCode ");
						query.append("where dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");
					}

					if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
							&& (departureShipAgency.trim().length() == 0
									&& nameDepartureShipAgency.trim().length() == 0)) {
						query.append("inner join dm_ship_agency dmArri ");
						query.append("on temp.ArrivalShipAgency = dmArri.ShipAgencyCode ");
						query.append("where dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");
					}
				}
			}

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp.DocumentTypeCode = ?");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp.MaritimeCode = ?");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp.PortCode = ?");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp.LastPortCode = ?");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp.StateCode = ?");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp.DocumentName = '" + maBanKhai + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp.PortRegionCode = ?");
			}

			/**
			 * II- THÃ¡Â»Â¦ TÃ¡Â»Â¤C 1. Ã„ï¿½ÃƒÆ’ TIÃ¡ÂºÂ¾P NHÃ¡ÂºÂ¬N - 18 2.
			 * CHÃ¡Â»Å“ PHÃƒÅ  DUYÃ¡Â»â€ T HOÃƒâ‚¬N THÃƒâ‚¬NH THÃ¡Â»Â¦ TÃ¡Â»Â¤C
			 * - 12 3. Ã„ï¿½Ã¡Â»â‚¬ NGHÃ¡Â»Å  CÃ¡ÂºÂ¤P GIÃ¡ÂºÂ¤Y PHÃƒâ€°P - 20
			 * 4. YÃƒÅ U CÃ¡ÂºÂ¦Y SÃ¡Â»Â¬A Ã„ï¿½Ã¡Â»â€�I BÃ¡Â»â€� SUNG - 13 5.
			 * PHÃƒÅ  DUYÃ¡Â»â€ T VÃƒâ‚¬ HOÃƒâ‚¬N THÃƒâ‚¬NH THÃ¡Â»Â¦ TÃ¡Â»Â¤C -
			 * 19 6. HÃ¡Â»Â¦Y THÃ¡Â»Â¦ TÃ¡Â»Â¤C - 10
			 */

			query.append(" ORDER BY ");
			query.append("case when temp.DocumentStatusCode = '18' then 1 ");
			query.append("when temp.DocumentStatusCode = '12' then 2 ");
			query.append("when temp.DocumentStatusCode = '20' then 3 ");
			query.append("when temp.DocumentStatusCode = '13' then 4 ");
			query.append("when temp.DocumentStatusCode = '19' then 5 ");
			query.append("when temp.DocumentStatusCode = '10' then 6 ");
			query.append("end asc ");

			// TODO THU TUC sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {
				query.append(", temp.ShipDateFrom DESC, temp.CreatedDate DESC, id DESC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(", temp.ShipDateTo DESC, temp.CreatedDate DESC, id DESC");

			} else {
				query.append(", temp.ShipDateFrom DESC, temp.ShipDateTo DESC, temp.CreatedDate DESC, id DESC");
			}

			if (start >= 0) {
				int count = end - start;
				query.append(" limit " + start + "," + count);
			}

			// log.info("---" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			log.debug("====findDanhSachHoSoRoleThuTucLikeShipAgency By THU TUC ===");
			QueryPos qPos = QueryPos.getInstance(q);

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG))) {
				qPos.add(documentTypeCode.trim());
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				qPos.add(portCode.trim());
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				qPos.add(lastPortCode.trim());
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim());
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
			}

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countDanhSachHoSoRoleThuTuc(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, boolean isDTND, boolean isDTNDCam) throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			String sql = "SELECT count(*) as total FROM temp_document WHERE 1=1";

			// Pb NC,XC,QC, VC, RC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND PortCode = ?");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND LastPortCode = ?");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (DocumentName = '" + maBanKhai + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				// if (documentStatusCode.equalsIgnoreCase("120")) {
				// documentStatusCode = "20"; // tuong duong de nghi cap giay
				// phep
				//
				// query.append(" AND documentStatusCode IN (" +
				// documentStatusCode.trim() + ")");
				//
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_QUA_CANH))
				// {
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_permission_for_transit where
				// StampStatus = 0 and IsCancel = 0 and LENGTH(CancelNote) > 0)
				// ) ");
				//
				// }
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
				// ||
				// documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_ROI_CANG)
				// ||
				// documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)){
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_port_clearance where StampStatus = 0
				// and IsCancel = 0 and LENGTH(CancelNote) > 0) ) ");
				// }
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))
				// {
				//
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_acceptance where StampStatus = 0 and
				// IsCancel = 0 and LENGTH(CancelNote) > 0) ) ");
				// }
				// } else {
				// query.append(" AND documentStatusCode IN (" +
				// documentStatusCode.trim() + ")");
				// }
				query.append(" AND documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// DAI LY DEN
			if (Validator.isNotNull(arrivalShipAgency) && arrivalShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameArrivalShipAgency) && nameArrivalShipAgency.trim().length() > 0) {

				// StringBuilder daiLyDen = new StringBuilder();
				// daiLyDen.append("SELECT ShipAgencyCode FROM dm_ship_agency
				// ");
				// daiLyDen.append("where ShipAgencyNameVN like '%" +
				// arrivalShipAgency.trim() + "%' ");

				query.append(" AND ArrivalShipAgency = ?");
				// query.append(" AND ArrivalShipAgency in ( " +
				// daiLyDen.toString() + " )");
			}

			// DAI LY DI
			if (Validator.isNotNull(departureShipAgency) && departureShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameDepartureShipAgency) && nameDepartureShipAgency.trim().length() > 0) {

				// StringBuilder daiLyDi = new StringBuilder();
				// daiLyDi.append("SELECT ShipAgencyCode FROM dm_ship_agency ");
				// daiLyDi.append("where ShipAgencyNameVN like '%" +
				// departureShipAgency.trim() + "%' ");

				query.append(" AND DepartureShipAgency = ?");
				// query.append(" AND DepartureShipAgency in (" +
				// daiLyDi.toString() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND PortRegionCode = ?");
			}

			if (!isDTND && !isDTNDCam) {
				query.append(
						" AND DocumentTypeCode in ( 'NC', 'XC', 'QC', '4', '5', '8', '9', '10', '11', '12', '13' ) ");
			} else if (isDTND && isDTNDCam) {
				query.append(" AND DocumentTypeCode in ( '14', '15', '16', '17' ) ");
			} else {

				if (Validator.isNotNull(documentTypeCode)
						&& (documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6) || documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7))
						|| isDTND) {
					query.append(" AND DocumentTypeCode in ( '16', '17' ) ");
				}
				if (Validator.isNotNull(documentTypeCode)
						&& (documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH) || documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH))
						|| isDTNDCam) {
					query.append(" AND DocumentTypeCode in ( '14', '15' ) ");
				} 

			}

			sql = sql + query.toString();
			log.debug("=========THU TUC SEARCH --count TempDocument ========" + sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			// Pb NC,XC,QC, VC, RC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				qPos.add(documentTypeCode.trim());
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				qPos.add(portCode.trim());
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				qPos.add(lastPortCode.trim());
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim());
			}

			// DAI LY DEN
			if (Validator.isNotNull(arrivalShipAgency) && arrivalShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameArrivalShipAgency) && nameArrivalShipAgency.trim().length() > 0) {
				qPos.add(arrivalShipAgency.trim());
			}

			// DAI LY DI
			if (Validator.isNotNull(departureShipAgency) && departureShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameDepartureShipAgency) && nameDepartureShipAgency.trim().length() > 0) {
				qPos.add(departureShipAgency.trim());
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
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

	public int countDanhSachHoSoRoleThuTuc(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, String nameOfShipownersAgents, String maritimeCodeNext, boolean isDTND, boolean isDTNDCam)
			throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			String sql = "SELECT count(*) as total FROM temp_document WHERE 1=1";

			// Pb NC,XC,QC, VC, RC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				query.append(" AND DocumentTypeCode = ? ");
			}

			query.append(" AND DocumentTypeCode NOT LIKE 'HH_%' ");

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND PortCode = ?");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND LastPortCode = ?");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND StateCode = ?");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (DocumentName = '" + maBanKhai + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				// if (documentStatusCode.equalsIgnoreCase("120")) {
				// documentStatusCode = "20"; // tuong duong de nghi cap giay
				// phep
				//
				// query.append(" AND documentStatusCode IN (" +
				// documentStatusCode.trim() + ")");
				//
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_QUA_CANH))
				// {
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_permission_for_transit where
				// StampStatus = 0 and IsCancel = 0 and LENGTH(CancelNote) > 0)
				// ) ");
				//
				// }
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
				// ||
				// documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_ROI_CANG)
				// ||
				// documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)){
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_port_clearance where StampStatus = 0
				// and IsCancel = 0 and LENGTH(CancelNote) > 0) ) ");
				// }
				// if
				// (documentTypeCode.trim().equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))
				// {
				//
				// query.append(" AND (DocumentName IN (Select distinct
				// DocumentName from issue_acceptance where StampStatus = 0 and
				// IsCancel = 0 and LENGTH(CancelNote) > 0) ) ");
				// }
				// } else {
				// query.append(" AND documentStatusCode IN (" +
				// documentStatusCode.trim() + ")");
				// }
				query.append(" AND documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// DAI LY DEN
			if (Validator.isNotNull(arrivalShipAgency) && arrivalShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameArrivalShipAgency) && nameArrivalShipAgency.trim().length() > 0) {

				// StringBuilder daiLyDen = new StringBuilder();
				// daiLyDen.append("SELECT ShipAgencyCode FROM dm_ship_agency
				// ");
				// daiLyDen.append("where ShipAgencyNameVN like '%" +
				// arrivalShipAgency.trim() + "%' ");

				query.append(" AND ArrivalShipAgency = ?");
				// query.append(" AND ArrivalShipAgency in ( " +
				// daiLyDen.toString() + " )");
			}

			// DAI LY DI
			if (Validator.isNotNull(departureShipAgency) && departureShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameDepartureShipAgency) && nameDepartureShipAgency.trim().length() > 0) {

				// StringBuilder daiLyDi = new StringBuilder();
				// daiLyDi.append("SELECT ShipAgencyCode FROM dm_ship_agency ");
				// daiLyDi.append("where ShipAgencyNameVN like '%" +
				// departureShipAgency.trim() + "%' ");

				query.append(" AND DepartureShipAgency = ?");
				// query.append(" AND DepartureShipAgency in (" +
				// daiLyDi.toString() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND PortRegionCode = ?");
			}

			if (!isDTND && !isDTNDCam) {
				query.append(
						" AND DocumentTypeCode in ( 'NC', 'XC', 'QC', '4', '5', '8', '9', '10', '11', '12', '13' ) ");
			} else if (isDTND && isDTNDCam) {
				query.append(" AND DocumentTypeCode in ( '14', '15', '16', '17' ) ");
			} else {

				if (Validator.isNotNull(documentTypeCode)
						&& (documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6) || documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7))
						|| isDTND) {
					query.append(" AND DocumentTypeCode in ( '16', '17' ) ");
				}
				if (Validator.isNotNull(documentTypeCode)
						&& (documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH) || documentTypeCode.trim().equals(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH))
						|| isDTNDCam) {
					query.append(" AND DocumentTypeCode in ( '14', '15' ) ");
				} 

			}

			if (Validator.isNotNull(nameOfShipownersAgents) && nameOfShipownersAgents.trim().length() > 0) {
				query.append(" AND NameOfShipownersAgents like '%" + nameOfShipownersAgents.trim() + "%' ");
			}
			if (Validator.isNotNull(maritimeCodeNext) && maritimeCodeNext.trim().length() > 0) {
				query.append(" AND LastPortCode like '%" + maritimeCodeNext.trim() + "%' ");
			}
			sql = sql + query.toString();
			log.debug("=========THU TUC SEARCH --count TempDocument ========" + sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			// Pb NC,XC,QC, VC, RC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				qPos.add(documentTypeCode.trim());
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				qPos.add(portCode.trim());
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				qPos.add(lastPortCode.trim());
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim());
			}

			// DAI LY DEN
			if (Validator.isNotNull(arrivalShipAgency) && arrivalShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameArrivalShipAgency) && nameArrivalShipAgency.trim().length() > 0) {
				qPos.add(arrivalShipAgency.trim());
			}

			// DAI LY DI
			if (Validator.isNotNull(departureShipAgency) && departureShipAgency.trim().length() > 0
					&& Validator.isNotNull(nameDepartureShipAgency) && nameDepartureShipAgency.trim().length() > 0) {
				qPos.add(departureShipAgency.trim());
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
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

	public int countDanhSachHoSoRoleThuTucLikeShipAgency(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai) throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();

			query.append("SELECT count(*) as total FROM temp_document temp ");

			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0) {
				// DAI LY DEN
				if (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)) {
					if (arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0) {
						query.append("inner join dm_ship_agency dmArri ");
						query.append("on temp.ArrivalShipAgency = dmArri.ShipAgencyCode ");
						query.append("where dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");
					}

					// DAI LY DI
				} else if (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
						|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND)) {
					if (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0) {
						query.append("inner join dm_ship_agency dmDep ");
						query.append("on temp.DepartureShipAgency = dmDep.ShipAgencyCode ");
						query.append("where dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");
					}

				} else if (documentTypeCode.equals(MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN)) {
					if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
							&& (departureShipAgency.trim().length() == 0
									&& nameDepartureShipAgency.trim().length() > 0)) {

						query.append("inner join dm_ship_agency dmDep ");
						query.append("on temp.DepartureShipAgency = dmDep.ShipAgencyCode ");
						query.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
								+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");
						query.append(" WHERE 1=1  ");
					}

					if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
							&& (departureShipAgency.trim().length() == 0
									&& nameDepartureShipAgency.trim().length() > 0)) {
						query.append("inner join dm_ship_agency dmDep ");
						query.append("on temp.DepartureShipAgency = dmDep.ShipAgencyCode ");
						query.append("where dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");
					}

					if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
							&& (departureShipAgency.trim().length() == 0
									&& nameDepartureShipAgency.trim().length() == 0)) {
						query.append("inner join dm_ship_agency dmArri ");
						query.append("on temp.ArrivalShipAgency = dmArri.ShipAgencyCode ");
						query.append("where dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");
					}
				}
			}

			// Pb NC,XC,QC, VC, RC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp.DocumentTypeCode = ?");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp.MaritimeCode = ?");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp.PortCode = ?");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp.LastPortCode = ?");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp.StateCode = ?");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp.DocumentName = '" + maBanKhai + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp.PortRegionCode = ?");
			}

			log.debug("=========THU TUC SEARCH --count TempDocument ========" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				qPos.add(documentTypeCode.trim());
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				qPos.add(portCode.trim());
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				qPos.add(lastPortCode.trim());
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				qPos.add(stateCode.trim());
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				qPos.add(portRegionCode.trim());
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

	public List<TempDocument> findTempDocumentInfo(String documentStatusCode, String maritimeCode, String portCode,
			String shipName, String callSign, String shipDateFrom, String shipDateTo, int start, int end)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "SELECT * FROM temp_document WHERE 1=1 ";

			// documentStatusCode
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND DocumentStatusCode IN (" + documentStatusCode + ")");
			}

			// cang vu hang hai
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}
			log.debug("===query.append===maritimeCode===" + maritimeCode);
			// cang bien
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0
					&& !portCode.trim().equalsIgnoreCase("LUA_CHON1")) {
				query.append(" AND portCode = ?");
			}
			log.debug("===query.append===portCode===" + portCode);
			// ten tau
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}
			// Ho hieu
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}
			// Tu ngay
			if (Validator.isNotNull(shipDateFrom) && shipDateFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(shipDateFrom.trim());
				shipDateFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFrom
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// Den ngay
			if (Validator.isNotNull(shipDateTo) && shipDateTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(shipDateTo.trim());
				shipDateTo = FormatData.parseDateToTring(dateTo);
				query.append(
						" AND (ShipDateTo <= concat(date('" + shipDateTo + "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}
			// query.append(" ORDER BY id DESC");

			sql = sql + query.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);
			log.debug("=========TAU SEARCH --findTempDocumentInfo========" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode);
				log.debug("===qPos.add===maritimeCode===" + maritimeCode);
			}
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0
					&& !portCode.trim().equalsIgnoreCase("LUA_CHON1")) {
				qPos.add(portCode);
				log.debug("===qPos.add===portCode===" + portCode);
			}
			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countTempDocumentInfo(String documentStatusCode, String maritimeCode, String portCode, String shipName,
			String callSign, String shipDateFrom, String shipDateTo) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "SELECT count(*) as total FROM temp_document WHERE 1=1";
			// documentStatusCode
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND DocumentStatusCode IN (" + documentStatusCode + ")");
			}
			// cang vu hang hai
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND MaritimeCode = ?");
			}

			// cang bien
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0
					&& !portCode.trim().equalsIgnoreCase("LUA_CHON1")) {
				query.append(" AND portCode = ?");
			}
			// ten tau
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND ShipName like '%" + shipName.trim() + "%' ");
			}
			// Ho hieu
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND CallSign like '%" + callSign.trim() + "%' ");
			}

			// Tu ngay
			if (Validator.isNotNull(shipDateFrom) && shipDateFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(shipDateFrom.trim());
				shipDateFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ShipDateFrom >= concat(date('" + shipDateFrom
						+ "'), ' 00:00:00')  OR ShipDateFrom IS NULL)");
			}

			// Den ngay
			if (Validator.isNotNull(shipDateTo) && shipDateTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(shipDateTo.trim());
				shipDateTo = FormatData.parseDateToTring(dateTo);
				query.append(
						" AND (ShipDateTo <= concat(date('" + shipDateTo + "'), ' 23:59:59')  OR ShipDateTo IS NULL)");
			}

			sql = sql + query.toString();
			log.debug("=========TAU SEARCH --countTempDocumentInfo========" + sql);

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				qPos.add(maritimeCode.trim());
			}
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0
					&& !portCode.trim().equalsIgnoreCase("LUA_CHON1")) {
				qPos.add(portCode.trim());
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

	public List<TempDocument> findKeHoachYCBS() throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			// 'YÃƒÂªu cÃ¡ÂºÂ§u sÃ¡Â»Â­a Ã„â€˜Ã¡Â»â€¢i bÃ¡Â»â€¢ sung' = 27

			query.append("SELECT * FROM temp_document WHERE RequestState = '27' ");
			query.append("and ( ");
			query.append("(ShipDateFrom < CURDATE() and ShipDateTo is null) ");
			query.append("or ");
			query.append("(ShipDateFrom is not null and ShipDateTo < CURDATE()) ");
			query.append(")");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			log.debug("=========findKeHoachYCBS========" + query.toString());

			QueryPos qPos = QueryPos.getInstance(q);
			return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findDanhSachHoSoVanThuChoDongDau(String documentTypeCode, String maritimeCode,
			String portCode, String lastPortCode, String shipName, String stateCode, String callSign, String imo,
			String shipPosition, String shipDateFromStart, String shipDateFromEnd, String shipDateToStart,
			String shipDateToEnd, String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, int start, int end) throws SystemException {

		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			StringBuilder queryShipAgency = new StringBuilder();

			String sql = "";
			String sql1 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_shifting_order ON issue_shifting_order.DocumentName = temp_document.DocumentName "
					+ " AND issue_shifting_order.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.RequestState in (14, 15) and issue_shifting_order.StampStatus = 1 ";
			String sql2 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_acceptance ON issue_acceptance.DocumentName = temp_document.DocumentName "
					+ " AND issue_acceptance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_acceptance.StampStatus = 1 ";
			String sql3 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_port_clearance ON issue_port_clearance.DocumentName = temp_document.DocumentName "
					+ " AND issue_port_clearance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_port_clearance.StampStatus = 1 ";
			String sql4 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_permission_for_transit ON issue_permission_for_transit.DocumentName = temp_document.DocumentName "
					+ " AND issue_permission_for_transit.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_permission_for_transit.StampStatus = 1 ";

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {

				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
						+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() == 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmArri ");
				queryShipAgency.append("on temp_document.ArrivalShipAgency = dmArri.ShipAgencyCode ");
				queryShipAgency.append("AND dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");

			}

			query.append(" WHERE 1=1 ");

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp_document.DocumentTypeCode = '" + documentTypeCode.trim() + "' ");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = '" + maritimeCode.trim() + "' ");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp_document.PortCode = '" + portCode.trim() + "' ");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = '" + lastPortCode.trim() + "' ");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = '" + stateCode.trim() + "' ");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp_document.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp_document.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp_document.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp_document.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp_document.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp_document.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp_document.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp_document.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp_document.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp_document.DocumentName = '" + maBanKhai.trim() + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp_document.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = '" + portRegionCode.trim() + "' ");
			}

			StringBuilder queryOrder = new StringBuilder();
			queryOrder.append(" ORDER BY ");
			queryOrder.append("case when DocumentStatusCode = '0' then 0 ");
			queryOrder.append("when DocumentStatusCode = '18' then 1 ");
			queryOrder.append("when DocumentStatusCode = '12' then 2 ");
			queryOrder.append("when DocumentStatusCode = '20' then 3 ");
			queryOrder.append("when DocumentStatusCode = '13' then 4 ");
			queryOrder.append("when DocumentStatusCode = '19' then 5 ");
			queryOrder.append("when DocumentStatusCode = '10' then 6 ");
			queryOrder.append("end asc ");

			// TODO THU TUC sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {
				queryOrder.append(", ShipDateFrom ASC, CreatedDate ASC, id ASC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				queryOrder.append(", ShipDateTo ASC, CreatedDate ASC, id ASC");

			} else {
				queryOrder.append(", ShipDateFrom ASC, ShipDateTo ASC, CreatedDate ASC, id ASC");
			}

			sql = sql + "( " + sql1 + queryShipAgency.toString() + query.toString() + " ) UNION ( " + sql2
					+ queryShipAgency.toString() + query.toString() + " ) UNION ( " + sql3 + queryShipAgency.toString()
					+ query.toString() + " ) UNION ( " + sql4 + queryShipAgency.toString() + query.toString() + " )"
					+ queryOrder.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			log.debug("=========findDanhSachHoSoVanThuChoDongDau ===");
			log.debug("=========findDanhSachHoSoVanThuChoDongDau ===" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findDanhSachHoSoVanThuChoDongDau(String documentTypeCode, String maritimeCode,
			String portCode, String lastPortCode, String shipName, String stateCode, String callSign, String imo,
			String shipPosition, String shipDateFromStart, String shipDateFromEnd, String shipDateToStart,
			String shipDateToEnd, String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, String nameOfShipownersAgents, String maritimeCodeNext, int start,
			int end) throws SystemException {

		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			StringBuilder queryShipAgency = new StringBuilder();

			String sql = "";
			String sql1 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_shifting_order ON issue_shifting_order.DocumentName = temp_document.DocumentName "
					+ " AND issue_shifting_order.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.RequestState in (14, 15) and issue_shifting_order.StampStatus = 1 ";
			String sql2 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_acceptance ON issue_acceptance.DocumentName = temp_document.DocumentName "
					+ " AND issue_acceptance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_acceptance.StampStatus = 1 ";
			String sql3 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_port_clearance ON issue_port_clearance.DocumentName = temp_document.DocumentName "
					+ " AND issue_port_clearance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_port_clearance.StampStatus = 1 ";
			String sql4 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_permission_for_transit ON issue_permission_for_transit.DocumentName = temp_document.DocumentName "
					+ " AND issue_permission_for_transit.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_permission_for_transit.StampStatus = 1 ";

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {

				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
						+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() == 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmArri ");
				queryShipAgency.append("on temp_document.ArrivalShipAgency = dmArri.ShipAgencyCode ");
				queryShipAgency.append("AND dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");

			}

			query.append(" WHERE 1=1 ");

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp_document.DocumentTypeCode = '" + documentTypeCode.trim() + "' ");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = '" + maritimeCode.trim() + "' ");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp_document.PortCode = '" + portCode.trim() + "' ");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = '" + lastPortCode.trim() + "' ");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = '" + stateCode.trim() + "' ");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp_document.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp_document.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp_document.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp_document.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp_document.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp_document.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp_document.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp_document.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp_document.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp_document.DocumentName = '" + maBanKhai.trim() + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp_document.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = '" + portRegionCode.trim() + "' ");
			}

			if (Validator.isNotNull(nameOfShipownersAgents) && nameOfShipownersAgents.trim().length() > 0) {
				query.append(
						" AND temp_document.NameOfShipownersAgents like '%" + nameOfShipownersAgents.trim() + "%' ");
			}
			if (Validator.isNotNull(maritimeCodeNext) && maritimeCodeNext.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode like '%" + maritimeCodeNext.trim() + "%' ");
			}
			StringBuilder queryOrder = new StringBuilder();
			queryOrder.append(" ORDER BY ");
			queryOrder.append("case when DocumentStatusCode = '0' then 0 ");
			queryOrder.append("when DocumentStatusCode = '18' then 1 ");
			queryOrder.append("when DocumentStatusCode = '12' then 2 ");
			queryOrder.append("when DocumentStatusCode = '20' then 3 ");
			queryOrder.append("when DocumentStatusCode = '13' then 4 ");
			queryOrder.append("when DocumentStatusCode = '19' then 5 ");
			queryOrder.append("when DocumentStatusCode = '10' then 6 ");
			queryOrder.append("end asc ");

			// TODO THU TUC sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {
				queryOrder.append(", ShipDateFrom ASC, CreatedDate ASC, id ASC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				queryOrder.append(", ShipDateTo ASC, CreatedDate ASC, id ASC");

			} else {
				queryOrder.append(", ShipDateFrom ASC, ShipDateTo ASC, CreatedDate ASC, id ASC");
			}

			sql = sql + "( " + sql1 + queryShipAgency.toString() + query.toString() + " ) UNION ( " + sql2
					+ queryShipAgency.toString() + query.toString() + " ) UNION ( " + sql3 + queryShipAgency.toString()
					+ query.toString() + " ) UNION ( " + sql4 + queryShipAgency.toString() + query.toString() + " )"
					+ queryOrder.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			log.debug("=========findDanhSachHoSoVanThuChoDongDau ===");
			log.info("=========findDanhSachHoSoVanThuChoDongDau ===" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countDanhSachHoSoVanThuChoDongDau(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai) throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			StringBuilder queryShipAgency = new StringBuilder();

			String sql = "SELECT count(*) as total FROM ";

			String sql1 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_shifting_order ON issue_shifting_order.DocumentName = temp_document.DocumentName "
					+ " AND issue_shifting_order.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.RequestState in (14, 15) and issue_shifting_order.StampStatus = 1 ";
			String sql2 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_acceptance ON issue_acceptance.DocumentName = temp_document.DocumentName "
					+ " AND issue_acceptance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_acceptance.StampStatus = 1 ";
			String sql3 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_port_clearance ON issue_port_clearance.DocumentName = temp_document.DocumentName "
					+ " AND issue_port_clearance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_port_clearance.StampStatus = 1 ";
			String sql4 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_permission_for_transit ON issue_permission_for_transit.DocumentName = temp_document.DocumentName "
					+ " AND issue_permission_for_transit.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_permission_for_transit.StampStatus = 1 ";

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {

				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
						+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() == 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmArri ");
				queryShipAgency.append("on temp_document.ArrivalShipAgency = dmArri.ShipAgencyCode ");
				queryShipAgency.append("AND dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");

			}

			query.append(" WHERE 1=1 ");

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp_document.DocumentTypeCode = '" + documentTypeCode.trim() + "' ");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = '" + maritimeCode.trim() + "' ");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp_document.PortCode = '" + portCode.trim() + "' ");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = '" + lastPortCode.trim() + "' ");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = '" + stateCode.trim() + "' ");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp_document.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp_document.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp_document.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp_document.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp_document.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp_document.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp_document.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp_document.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp_document.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp_document.DocumentName = '" + maBanKhai.trim() + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp_document.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = '" + portRegionCode.trim() + "' ");
			}

			sql = sql + "( " + "( " + sql1 + queryShipAgency.toString() + query.toString() + " ) UNION ( " + sql2
					+ queryShipAgency.toString() + query.toString() + " ) UNION ( " + sql3 + queryShipAgency.toString()
					+ query.toString() + " ) UNION ( " + sql4 + queryShipAgency.toString() + query.toString() + " )"
					+ " ) temp_document ";

			log.debug("=========THU TUC SEARCH --count TempDocument ========");

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

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

	public int countDanhSachHoSoVanThuChoDongDau(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, String nameOfShipownersAgents, String maritimeCodeNext)
			throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			StringBuilder queryShipAgency = new StringBuilder();

			String sql = "SELECT count(*) as total FROM ";

			String sql1 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_shifting_order ON issue_shifting_order.DocumentName = temp_document.DocumentName "
					+ " AND issue_shifting_order.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.RequestState in (14, 15) and issue_shifting_order.StampStatus = 1 ";
			String sql2 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_acceptance ON issue_acceptance.DocumentName = temp_document.DocumentName "
					+ " AND issue_acceptance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_acceptance.StampStatus = 1 ";
			String sql3 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_port_clearance ON issue_port_clearance.DocumentName = temp_document.DocumentName "
					+ " AND issue_port_clearance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_port_clearance.StampStatus = 1 ";
			String sql4 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_permission_for_transit ON issue_permission_for_transit.DocumentName = temp_document.DocumentName "
					+ " AND issue_permission_for_transit.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_permission_for_transit.StampStatus = 1 ";

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {

				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
						+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() == 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmArri ");
				queryShipAgency.append("on temp_document.ArrivalShipAgency = dmArri.ShipAgencyCode ");
				queryShipAgency.append("AND dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");

			}

			query.append(" WHERE 1=1 ");

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp_document.DocumentTypeCode = '" + documentTypeCode.trim() + "' ");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = '" + maritimeCode.trim() + "' ");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp_document.PortCode = '" + portCode.trim() + "' ");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = '" + lastPortCode.trim() + "' ");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = '" + stateCode.trim() + "' ");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp_document.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp_document.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp_document.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp_document.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp_document.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp_document.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp_document.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp_document.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp_document.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp_document.DocumentName = '" + maBanKhai.trim() + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp_document.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = '" + portRegionCode.trim() + "' ");
			}

			if (Validator.isNotNull(nameOfShipownersAgents) && nameOfShipownersAgents.trim().length() > 0) {
				query.append(
						" AND temp_document.NameOfShipownersAgents like '%" + nameOfShipownersAgents.trim() + "%' ");
			}
			if (Validator.isNotNull(maritimeCodeNext) && maritimeCodeNext.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode like '%" + maritimeCodeNext.trim() + "%' ");
			}
			sql = sql + "( " + "( " + sql1 + queryShipAgency.toString() + query.toString() + " ) UNION ( " + sql2
					+ queryShipAgency.toString() + query.toString() + " ) UNION ( " + sql3 + queryShipAgency.toString()
					+ query.toString() + " ) UNION ( " + sql4 + queryShipAgency.toString() + query.toString() + " )"
					+ " ) temp_document ";

			log.debug("=========THU TUC SEARCH --count TempDocument ========");

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

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

	public List<TempDocument> findDanhSachHoSoLanhDaoChoKySo(String documentTypeCode, String maritimeCode,
			String portCode, String lastPortCode, String shipName, String stateCode, String callSign, String imo,
			String shipPosition, String shipDateFromStart, String shipDateFromEnd, String shipDateToStart,
			String shipDateToEnd, String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, String representative, int start, int end)
			throws SystemException {

		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			StringBuilder queryShipAgency = new StringBuilder();

			String sql = "";
			String sql1 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_shifting_order ON issue_shifting_order.DocumentName = temp_document.DocumentName "
					+ " AND issue_shifting_order.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.RequestState in (14, 15) and issue_shifting_order.StampStatus = 11 and issue_shifting_order.IsApproval = 0 "
					+ " AND issue_shifting_order.Representative = '" + representative.trim() + "' ";
			String sql1GroupBy = " GROUP BY issue_shifting_order.DocumentName, issue_shifting_order.DocumentYear, issue_shifting_order.NumberShiftingOrder, issue_shifting_order.VersionNo ";
			String sql2 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_acceptance ON issue_acceptance.DocumentName = temp_document.DocumentName "
					+ " AND issue_acceptance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_acceptance.StampStatus = 11 and issue_acceptance.IsApproval = 0 "
					+ " AND issue_acceptance.Representative = '" + representative.trim() + "' ";
			String sql2GroupBy = " GROUP BY issue_acceptance.DocumentName, issue_acceptance.DocumentYear, issue_acceptance.NumberPortClearance, issue_acceptance.VersionNo ";
			String sql3 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_port_clearance ON issue_port_clearance.DocumentName = temp_document.DocumentName "
					+ " AND issue_port_clearance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_port_clearance.StampStatus = 11 and issue_port_clearance.IsApproval = 0 "
					+ " AND issue_port_clearance.Representative = '" + representative.trim() + "' ";
			String sql3GroupBy = " GROUP BY  issue_port_clearance.DocumentName, issue_port_clearance.DocumentYear, issue_port_clearance.NumberPortClearance, issue_port_clearance.VersionNo ";
			String sql4 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_permission_for_transit  ON issue_permission_for_transit.DocumentName = temp_document.DocumentName "
					+ " AND issue_permission_for_transit.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_permission_for_transit.StampStatus = 11 and issue_permission_for_transit.IsApproval = 0 "
					+ " AND issue_permission_for_transit.Representative = '" + representative.trim() + "' ";
			String sql4GroupBy = " GROUP BY  issue_permission_for_transit.DocumentName, issue_permission_for_transit.DocumentYear, issue_permission_for_transit.NumberPermissionForTransit, issue_permission_for_transit.VersionNo ";

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {

				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
						+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() == 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmArri ");
				queryShipAgency.append("on temp_document.ArrivalShipAgency = dmArri.ShipAgencyCode ");
				queryShipAgency.append("AND dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");

			}

			query.append(" WHERE 1=1 ");

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp_document.DocumentTypeCode = '" + documentTypeCode.trim() + "' ");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = '" + maritimeCode.trim() + "' ");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp_document.PortCode = '" + portCode.trim() + "' ");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = '" + lastPortCode.trim() + "' ");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = '" + stateCode.trim() + "' ");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp_document.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp_document.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp_document.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp_document.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp_document.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp_document.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp_document.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp_document.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp_document.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp_document.DocumentName = '" + maBanKhai.trim() + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp_document.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = '" + portRegionCode.trim() + "' ");
			}

			StringBuilder queryOrder = new StringBuilder();
			queryOrder.append(" ORDER BY ");
			queryOrder.append("case when DocumentStatusCode = '0' then 0 ");
			queryOrder.append("when DocumentStatusCode = '18' then 1 ");
			queryOrder.append("when DocumentStatusCode = '12' then 2 ");
			queryOrder.append("when DocumentStatusCode = '20' then 3 ");
			queryOrder.append("when DocumentStatusCode = '13' then 4 ");
			queryOrder.append("when DocumentStatusCode = '19' then 5 ");
			queryOrder.append("when DocumentStatusCode = '10' then 6 ");
			queryOrder.append("end asc ");

			// TODO THU TUC sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {
				queryOrder.append(", ShipDateFrom ASC, CreatedDate ASC, id ASC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				queryOrder.append(", ShipDateTo ASC, CreatedDate ASC, id ASC");

			} else {
				queryOrder.append(", ShipDateFrom ASC, ShipDateTo ASC, CreatedDate ASC, id ASC");
			}

			sql = sql + "( " + sql1 + queryShipAgency.toString() + query.toString() + sql1GroupBy + " ) UNION ( " + sql2
					+ queryShipAgency.toString() + query.toString() + sql2GroupBy + " ) UNION ( " + sql3
					+ queryShipAgency.toString() + query.toString() + sql3GroupBy + " ) UNION ( " + sql4
					+ queryShipAgency.toString() + query.toString() + sql4GroupBy + " )" + queryOrder.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			log.debug("=========findDanhSachHoSoLanhDaoChoKySo ===");
			log.debug("=========findDanhSachHoSoLanhDaoChoKySo ===" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<TempDocument> findDanhSachHoSoLanhDaoChoKySo(String documentTypeCode, String maritimeCode,
			String portCode, String lastPortCode, String shipName, String stateCode, String callSign, String imo,
			String shipPosition, String shipDateFromStart, String shipDateFromEnd, String shipDateToStart,
			String shipDateToEnd, String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, String representative, String nameOfShipownersAgents,
			String maritimeCodeNext, int start, int end) throws SystemException {

		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			StringBuilder queryShipAgency = new StringBuilder();

			String sql = "";
			String sql1 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_shifting_order ON issue_shifting_order.DocumentName = temp_document.DocumentName "
					+ " AND issue_shifting_order.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.RequestState in (14, 15) and issue_shifting_order.StampStatus = 11 and issue_shifting_order.IsApproval = 0 "
					+ " AND issue_shifting_order.Representative = '" + representative.trim() + "' ";
			String sql1GroupBy = " GROUP BY issue_shifting_order.DocumentName, issue_shifting_order.DocumentYear, issue_shifting_order.NumberShiftingOrder, issue_shifting_order.VersionNo ";
			String sql2 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_acceptance ON issue_acceptance.DocumentName = temp_document.DocumentName "
					+ " AND issue_acceptance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_acceptance.StampStatus = 11 and issue_acceptance.IsApproval = 0 "
					+ " AND issue_acceptance.Representative = '" + representative.trim() + "' ";
			String sql2GroupBy = " GROUP BY issue_acceptance.DocumentName, issue_acceptance.DocumentYear, issue_acceptance.NumberPortClearance, issue_acceptance.VersionNo ";
			String sql3 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_port_clearance ON issue_port_clearance.DocumentName = temp_document.DocumentName "
					+ " AND issue_port_clearance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_port_clearance.StampStatus = 11 and issue_port_clearance.IsApproval = 0 "
					+ " AND issue_port_clearance.Representative = '" + representative.trim() + "' ";
			String sql3GroupBy = " GROUP BY  issue_port_clearance.DocumentName, issue_port_clearance.DocumentYear, issue_port_clearance.NumberPortClearance, issue_port_clearance.VersionNo ";
			String sql4 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_permission_for_transit  ON issue_permission_for_transit.DocumentName = temp_document.DocumentName "
					+ " AND issue_permission_for_transit.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_permission_for_transit.StampStatus = 11 and issue_permission_for_transit.IsApproval = 0 "
					+ " AND issue_permission_for_transit.Representative = '" + representative.trim() + "' ";
			String sql4GroupBy = " GROUP BY  issue_permission_for_transit.DocumentName, issue_permission_for_transit.DocumentYear, issue_permission_for_transit.NumberPermissionForTransit, issue_permission_for_transit.VersionNo ";

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {

				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
						+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() == 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmArri ");
				queryShipAgency.append("on temp_document.ArrivalShipAgency = dmArri.ShipAgencyCode ");
				queryShipAgency.append("AND dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");

			}

			query.append(" WHERE 1=1 ");

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp_document.DocumentTypeCode = '" + documentTypeCode.trim() + "' ");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = '" + maritimeCode.trim() + "' ");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp_document.PortCode = '" + portCode.trim() + "' ");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = '" + lastPortCode.trim() + "' ");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = '" + stateCode.trim() + "' ");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp_document.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}
			if (Validator.isNotNull(nameOfShipownersAgents) && nameOfShipownersAgents.trim().length() > 0) {
				query.append(
						" AND temp_document.NameOfShipownersAgents like '%" + nameOfShipownersAgents.trim() + "%' ");
			}
			if (Validator.isNotNull(maritimeCodeNext) && maritimeCodeNext.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode like '%" + maritimeCodeNext.trim() + "%' ");
			}
			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp_document.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp_document.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp_document.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp_document.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp_document.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp_document.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp_document.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp_document.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp_document.DocumentName = '" + maBanKhai.trim() + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp_document.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = '" + portRegionCode.trim() + "' ");
			}

			StringBuilder queryOrder = new StringBuilder();
			queryOrder.append(" ORDER BY ");
			queryOrder.append("case when DocumentStatusCode = '0' then 0 ");
			queryOrder.append("when DocumentStatusCode = '18' then 1 ");
			queryOrder.append("when DocumentStatusCode = '12' then 2 ");
			queryOrder.append("when DocumentStatusCode = '20' then 3 ");
			queryOrder.append("when DocumentStatusCode = '13' then 4 ");
			queryOrder.append("when DocumentStatusCode = '19' then 5 ");
			queryOrder.append("when DocumentStatusCode = '10' then 6 ");
			queryOrder.append("end asc ");

			// TODO THU TUC sap xep thu tu ho so
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND))) {
				queryOrder.append(", ShipDateFrom ASC, CreatedDate ASC, id ASC");

			} else if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				queryOrder.append(", ShipDateTo ASC, CreatedDate ASC, id ASC");

			} else {
				queryOrder.append(", ShipDateFrom ASC, ShipDateTo ASC, CreatedDate ASC, id ASC");
			}

			sql = sql + "( " + sql1 + queryShipAgency.toString() + query.toString() + sql1GroupBy + " ) UNION ( " + sql2
					+ queryShipAgency.toString() + query.toString() + sql2GroupBy + " ) UNION ( " + sql3
					+ queryShipAgency.toString() + query.toString() + sql3GroupBy + " ) UNION ( " + sql4
					+ queryShipAgency.toString() + query.toString() + sql4GroupBy + " )" + queryOrder.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			log.debug("=========findDanhSachHoSoLanhDaoChoKySo ===");
			log.info("=========findDanhSachHoSoLanhDaoChoKySo ===" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDocument", TempDocumentImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (start >= 0) {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDocument>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public int countDanhSachHoSoLanhDaoChoKySo(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, String representative) throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			StringBuilder queryShipAgency = new StringBuilder();

			String sql = "SELECT count(*) as total FROM ";

			String sql1 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_shifting_order ON issue_shifting_order.DocumentName = temp_document.DocumentName "
					+ " AND issue_shifting_order.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.RequestState in (14, 15) and issue_shifting_order.StampStatus = 11 and issue_shifting_order.IsApproval = 0 "
					+ " AND issue_shifting_order.Representative = '" + representative.trim() + "' ";
			String sql1GroupBy = " GROUP BY issue_shifting_order.DocumentName, issue_shifting_order.DocumentYear, issue_shifting_order.NumberShiftingOrder, issue_shifting_order.VersionNo ";
			String sql2 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_acceptance ON issue_acceptance.DocumentName = temp_document.DocumentName "
					+ " AND issue_acceptance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_acceptance.StampStatus = 11 and issue_acceptance.IsApproval = 0 "
					+ " AND issue_acceptance.Representative = '" + representative.trim() + "' ";
			String sql2GroupBy = " GROUP BY issue_acceptance.DocumentName, issue_acceptance.DocumentYear, issue_acceptance.NumberPortClearance, issue_acceptance.VersionNo ";
			String sql3 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_port_clearance ON issue_port_clearance.DocumentName = temp_document.DocumentName "
					+ " AND issue_port_clearance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_port_clearance.StampStatus = 11 and issue_port_clearance.IsApproval = 0 "
					+ " AND issue_port_clearance.Representative = '" + representative.trim() + "' ";
			String sql3GroupBy = " GROUP BY  issue_port_clearance.DocumentName, issue_port_clearance.DocumentYear, issue_port_clearance.NumberPortClearance, issue_port_clearance.VersionNo ";
			String sql4 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_permission_for_transit  ON issue_permission_for_transit.DocumentName = temp_document.DocumentName "
					+ " AND issue_permission_for_transit.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_permission_for_transit.StampStatus = 11 and issue_permission_for_transit.IsApproval = 0 "
					+ " AND issue_permission_for_transit.Representative = '" + representative.trim() + "' ";
			String sql4GroupBy = " GROUP BY  issue_permission_for_transit.DocumentName, issue_permission_for_transit.DocumentYear, issue_permission_for_transit.NumberPermissionForTransit, issue_permission_for_transit.VersionNo ";

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {

				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
						+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() == 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmArri ");
				queryShipAgency.append("on temp_document.ArrivalShipAgency = dmArri.ShipAgencyCode ");
				queryShipAgency.append("AND dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");

			}

			query.append(" WHERE 1=1 ");

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp_document.DocumentTypeCode = '" + documentTypeCode.trim() + "' ");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = '" + maritimeCode.trim() + "' ");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp_document.PortCode = '" + portCode.trim() + "' ");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = '" + lastPortCode.trim() + "' ");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = '" + stateCode.trim() + "' ");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp_document.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp_document.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp_document.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp_document.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp_document.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp_document.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp_document.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp_document.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp_document.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp_document.DocumentName = '" + maBanKhai.trim() + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp_document.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = '" + portRegionCode.trim() + "' ");
			}

			sql = sql + "( " + "( " + sql1 + queryShipAgency.toString() + query.toString() + sql1GroupBy + " ) UNION ( "
					+ sql2 + queryShipAgency.toString() + query.toString() + sql2GroupBy + " ) UNION ( " + sql3
					+ queryShipAgency.toString() + query.toString() + sql3GroupBy + " ) UNION ( " + sql4
					+ queryShipAgency.toString() + query.toString() + sql4GroupBy + " )" + " ) temp_document ";

			log.debug("=========THU TUC SEARCH --countDanhSachHoSoLanhDaoChoKySo ========");

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

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

	public int countDanhSachHoSoLanhDaoChoKySo(String documentTypeCode, String maritimeCode, String portCode,
			String lastPortCode, String shipName, String stateCode, String callSign, String imo, String shipPosition,
			String shipDateFromStart, String shipDateFromEnd, String shipDateToStart, String shipDateToEnd,
			String documentStatusCode, String arrivalShipAgency, String nameArrivalShipAgency,
			String departureShipAgency, String nameDepartureShipAgency, String portRegionCode, String ngayLamThuTucFrom,
			String ngayLamThuTucTo, String maBanKhai, String representative, String nameOfShipownersAgents,
			String maritimeCodeNext) throws SystemException {

		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			StringBuilder queryShipAgency = new StringBuilder();

			String sql = "SELECT count(*) as total FROM ";

			String sql1 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_shifting_order ON issue_shifting_order.DocumentName = temp_document.DocumentName "
					+ " AND issue_shifting_order.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.RequestState in (14, 15) and issue_shifting_order.StampStatus = 11 and issue_shifting_order.IsApproval = 0 "
					+ " AND issue_shifting_order.Representative = '" + representative.trim() + "' ";
			String sql1GroupBy = " GROUP BY issue_shifting_order.DocumentName, issue_shifting_order.DocumentYear, issue_shifting_order.NumberShiftingOrder, issue_shifting_order.VersionNo ";
			String sql2 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_acceptance ON issue_acceptance.DocumentName = temp_document.DocumentName "
					+ " AND issue_acceptance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_acceptance.StampStatus = 11 and issue_acceptance.IsApproval = 0 "
					+ " AND issue_acceptance.Representative = '" + representative.trim() + "' ";
			String sql2GroupBy = " GROUP BY issue_acceptance.DocumentName, issue_acceptance.DocumentYear, issue_acceptance.NumberPortClearance, issue_acceptance.VersionNo ";
			String sql3 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_port_clearance ON issue_port_clearance.DocumentName = temp_document.DocumentName "
					+ " AND issue_port_clearance.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_port_clearance.StampStatus = 11 and issue_port_clearance.IsApproval = 0 "
					+ " AND issue_port_clearance.Representative = '" + representative.trim() + "' ";
			String sql3GroupBy = " GROUP BY  issue_port_clearance.DocumentName, issue_port_clearance.DocumentYear, issue_port_clearance.NumberPortClearance, issue_port_clearance.VersionNo ";
			String sql4 = "Select temp_document.* from temp_document "
					+ " INNER JOIN issue_permission_for_transit  ON issue_permission_for_transit.DocumentName = temp_document.DocumentName "
					+ " AND issue_permission_for_transit.DocumentYear = temp_document.DocumentYear "
					+ " AND temp_document.DocumentStatusCode in (19, 20) and issue_permission_for_transit.StampStatus = 11 and issue_permission_for_transit.IsApproval = 0 "
					+ " AND issue_permission_for_transit.Representative = '" + representative.trim() + "' ";
			String sql4GroupBy = " GROUP BY  issue_permission_for_transit.DocumentName, issue_permission_for_transit.DocumentYear, issue_permission_for_transit.NumberPermissionForTransit, issue_permission_for_transit.VersionNo ";

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {

				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND (dmDep.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' "
						+ " OR dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() == 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() > 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmDep ");
				queryShipAgency.append("on temp_document.DepartureShipAgency = dmDep.ShipAgencyCode ");
				queryShipAgency.append("AND dmDep.ShipAgencyNameVN like '%" + nameDepartureShipAgency.trim() + "%' ");

			}

			if ((arrivalShipAgency.trim().length() == 0 && nameArrivalShipAgency.trim().length() > 0)
					&& (departureShipAgency.trim().length() == 0 && nameDepartureShipAgency.trim().length() == 0)) {
				queryShipAgency.append("inner join dm_ship_agency dmArri ");
				queryShipAgency.append("on temp_document.ArrivalShipAgency = dmArri.ShipAgencyCode ");
				queryShipAgency.append("AND dmArri.ShipAgencyNameVN like '%" + nameArrivalShipAgency.trim() + "%' ");

			}

			query.append(" WHERE 1=1 ");

			// Pb NC,XC,QC
			if (Validator.isNotNull(documentTypeCode) && documentTypeCode.trim().length() > 0
					&& (documentTypeCode.equals(MessageType.LOAT_THU_TUC_NHAP_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_QUA_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_XUAT_CANH)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND)
							|| documentTypeCode.equals(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND))) {
				query.append(" AND temp_document.DocumentTypeCode = '" + documentTypeCode.trim() + "' ");
			}

			// CANG VU
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = '" + maritimeCode.trim() + "' ");
			}

			// CANG DEN
			if (Validator.isNotNull(portCode) && portCode.trim().length() > 0) {
				query.append(" AND temp_document.PortCode = '" + portCode.trim() + "' ");
			}

			// CANG ROI CUOI CUNG
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = '" + lastPortCode.trim() + "' ");
			}

			// TEN TAU
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			// QUOC TICH
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = '" + stateCode.trim() + "' ");
			}

			// HO HIEU
			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}
			// TAU DEN ROI
			if (Validator.isNotNull(shipPosition) && shipPosition.trim().length() > 0
					&& FormatData.convertToInt(shipPosition) > 0) {
				query.append(" AND temp_document.ShipPosition =" + FormatData.convertToInt(shipPosition));
			}

			// thoi gian den FROM
			if (Validator.isNotNull(shipDateFromStart) && shipDateFromStart.trim().length() > 0) {
				Date dateFromStart = FormatData.parseDateShort3StringToDate(shipDateFromStart.trim());
				shipDateFromStart = FormatData.parseDateToTring(dateFromStart);
				query.append(" AND (temp_document.ShipDateFrom >= concat(date('" + shipDateFromStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian den To
			if (Validator.isNotNull(shipDateFromEnd) && shipDateFromEnd.trim().length() > 0) {
				Date dateFromEnd = FormatData.parseDateShort3StringToDate(shipDateFromEnd.trim());
				shipDateFromEnd = FormatData.parseDateToTring(dateFromEnd);
				query.append(" AND (temp_document.ShipDateFrom <= concat(date('" + shipDateFromEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateFrom IS NULL)");
			}

			// thoi gian roi FROM
			if (Validator.isNotNull(shipDateToStart) && shipDateToStart.trim().length() > 0) {
				Date dateToStart = FormatData.parseDateShort3StringToDate(shipDateToStart.trim());
				shipDateToStart = FormatData.parseDateToTring(dateToStart);
				query.append(" AND (temp_document.ShipDateTo >= concat(date('" + shipDateToStart
						+ "'), ' 00:00:00')  OR temp_document.ShipDateTo IS NULL)");
			}

			// thoi gian roi To
			if (Validator.isNotNull(shipDateToEnd) && shipDateToEnd.trim().length() > 0) {
				Date dateToEnd = FormatData.parseDateShort3StringToDate(shipDateToEnd.trim());
				shipDateToEnd = FormatData.parseDateToTring(dateToEnd);
				query.append(" AND (temp_document.ShipDateTo <= concat(date('" + shipDateToEnd
						+ "'), ' 23:59:59')  OR temp_document.ShipDateTo IS NULL)");
			}

			// ngay gio lam thu tuc
			// ngayLamThuTucFrom
			// ngayLamThuTucTo
			if (Validator.isNotNull(ngayLamThuTucFrom) && ngayLamThuTucFrom.trim().length() > 0) {
				Date dateLamThuTucFrom = FormatData.parseDateShort3StringToDate(ngayLamThuTucFrom.trim());
				ngayLamThuTucFrom = FormatData.parseDateToTring(dateLamThuTucFrom);
				query.append(" AND (temp_document.CreatedDate >= concat(date('" + ngayLamThuTucFrom
						+ "'), ' 00:00:00')  OR temp_document.CreatedDate IS NULL)");
			}

			if (Validator.isNotNull(ngayLamThuTucTo) && ngayLamThuTucTo.trim().length() > 0) {
				Date dateLamThuTucTo = FormatData.parseDateShort3StringToDate(ngayLamThuTucTo.trim());
				ngayLamThuTucTo = FormatData.parseDateToTring(dateLamThuTucTo);
				query.append(" AND (temp_document.CreatedDate <= concat(date('" + ngayLamThuTucTo
						+ "'), ' 23:59:59')  OR temp_document.CreatedDate IS NULL)");
			}

			// ma~ ban khai
			if (Validator.isNotNull(maBanKhai) && maBanKhai.trim().length() > 0) {
				query.append(" AND (temp_document.DocumentName = '" + maBanKhai.trim() + "')");
			}

			// TRANG THAI
			if (Validator.isNotNull(documentStatusCode) && documentStatusCode.trim().length() > 0) {
				query.append(" AND temp_document.documentStatusCode IN (" + documentStatusCode.trim() + ")");
			}

			// KHU VUC CANG
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = '" + portRegionCode.trim() + "' ");
			}

			if (Validator.isNotNull(nameOfShipownersAgents) && nameOfShipownersAgents.trim().length() > 0) {
				query.append(
						" AND temp_document.NameOfShipownersAgents like '%" + nameOfShipownersAgents.trim() + "%' ");
			}
			if (Validator.isNotNull(maritimeCodeNext) && maritimeCodeNext.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode like '%" + maritimeCodeNext.trim() + "%' ");
			}
			sql = sql + "( " + "( " + sql1 + queryShipAgency.toString() + query.toString() + sql1GroupBy + " ) UNION ( "
					+ sql2 + queryShipAgency.toString() + query.toString() + sql2GroupBy + " ) UNION ( " + sql3
					+ queryShipAgency.toString() + query.toString() + sql3GroupBy + " ) UNION ( " + sql4
					+ queryShipAgency.toString() + query.toString() + sql4GroupBy + " )" + " ) temp_document ";

			log.debug("=========THU TUC SEARCH --countDanhSachHoSoLanhDaoChoKySo ========");

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

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

	public long countTempDocumentSignedIssuePortClearanceForStatisticsReport(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String issRequestState,
			String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document temp ");
			query.append(" inner join issue_port_clearance iss ");
			query.append(" on iss.DocumentName = temp.DocumentName ");
			query.append(" and   iss.DocumentYear  = temp.DocumentYear ");
			query.append(" and   iss.StampStatus = 2 and iss.AttachedFile > 0 ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and iss.SignDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and iss.SignDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and temp.requestState in (" + requestState + ") ");
			}
			if (issRequestState != null) {
				query.append(" and iss.requestState in (" + issRequestState + ") ");
			}
			if (documentStatusCode != null) {
				query.append(" and temp.documentStatusCode in (" + documentStatusCode + ")");
			}

			query.append(" and iss.VersionNo = (SELECT MAX(iss2.VersionNo) " + " FROM issue_port_clearance iss2 "
					+ " WHERE iss.DocumentName = iss2.DocumentName) ");

			log.debug("----query countTempDocumentSignedIssuePortClearanceForStatisticsReport----");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long countTempDocumentSignedIssuePermissionTransitForStatisticsReport(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String issRequestState,
			String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document temp ");
			query.append(" inner join issue_permission_for_transit iss ");
			query.append(" on iss.DocumentName = temp.DocumentName ");
			query.append(" and   iss.DocumentYear  = temp.DocumentYear ");
			query.append(" and   iss.StampStatus = 2 and iss.AttachedFile > 0 ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and iss.SignDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and iss.SignDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and temp.requestState in (" + requestState + ") ");
			}
			if (issRequestState != null) {
				query.append(" and iss.requestState in (" + issRequestState + ") ");
			}
			if (documentStatusCode != null) {
				query.append(" and temp.documentStatusCode in (" + documentStatusCode + ")");
			}

			query.append(" and iss.VersionNo = (SELECT MAX(iss2.VersionNo) "
					+ " FROM issue_permission_for_transit iss2 " + " WHERE iss.DocumentName = iss2.DocumentName) "); // lttai
																														// 13/7/2015
																														// :
																														// lay
																														// version
																														// moi
																														// nhat
																														// cua
																														// giay
																														// phep

			log.debug("---query countTempDocumentSignedIssuePermissionTransitForStatisticsReport----");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long countTempDocumentSignedIssueAcceptanceForStatisticsReport(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String issRequestState,
			String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document temp ");
			query.append(" inner join issue_acceptance iss ");
			query.append(" on iss.DocumentName = temp.DocumentName ");
			query.append(" and   iss.DocumentYear  = temp.DocumentYear ");
			query.append(" and   iss.StampStatus = 2 and iss.AttachedFile > 0 ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and iss.SignDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and iss.SignDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and temp.requestState in (" + requestState + ") ");
			}
			if (issRequestState != null) {
				query.append(" and iss.requestState in (" + issRequestState + ") ");
			}
			if (documentStatusCode != null) {
				query.append(" and temp.documentStatusCode in (" + documentStatusCode + ")");
			}

			query.append(" and iss.VersionNo = (SELECT MAX(iss2.VersionNo) " + " FROM issue_acceptance iss2 "
					+ " WHERE iss.DocumentName = iss2.DocumentName) "); // lttai
																		// 13/7/2015
																		// : lay
																		// version
																		// moi
																		// nhat
																		// cua
																		// giay
																		// phep

			log.debug("----query countTempDocumentSignedIssueAcceptanceForStatisticsReport----");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long countTempDocumentSignedIssueShiftingOrderForStatisticsReport(String maritimeCode, String dateFrom,
			String dateTo, String documentTypeCode, String requestState, String issRequestState,
			String documentStatusCode) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document temp ");
			query.append(" inner join issue_shifting_order  iss ");
			query.append(" on iss.DocumentName = temp.DocumentName ");
			query.append(" and   iss.DocumentYear  = temp.DocumentYear ");
			query.append(" and   iss.StampStatus = 2 and iss.AttachedFile > 0 ");

			if (Validator.isNotNull(dateFrom) && dateFrom.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateFrom.trim());
				dateFrom = FormatData.parseDateToTring(date);
				query.append(" and iss.SignDate >= concat(date('" + dateFrom + "'), ' 00:00:00') ");
			}
			if (Validator.isNotNull(dateTo) && dateTo.trim().length() > 0) {
				date = FormatData.parseDateShort3StringToDate(dateTo.trim());
				dateTo = FormatData.parseDateToTring(date);
				query.append(" and iss.SignDate <= concat(date('" + dateTo + "'), ' 23:59:59') ");
			}
			if (maritimeCode != null) {
				query.append(" and temp.MaritimeCode = " + maritimeCode);
			}

			if (documentTypeCode != null) {
				query.append(" and temp.DocumentTypeCode in (" + documentTypeCode + ")");
			}

			if (requestState != null) {
				query.append(" and temp.requestState in (" + requestState + ") ");
			}
			if (issRequestState != null) {
				query.append(" and iss.requestState in (" + issRequestState + ") ");
			}
			if (documentStatusCode != null) {
				query.append(" and temp.documentStatusCode in (" + documentStatusCode + ") ");
			}

			query.append(" and iss.VersionNo = (SELECT MAX(iss2.VersionNo) " + " FROM issue_shifting_order iss2 "
					+ " WHERE iss.DocumentName = iss2.DocumentName) "); // lttai
																		// 13/7/2015
																		// : lay
																		// version
																		// moi
																		// nhat
																		// cua
																		// giay
																		// phep

			// query.append(" GROUP BY temp.DocumentName "); // lttai
			log.debug(
					"-----------------query countTempDocumentSignedIssueShiftingOrderForStatisticsReport------------------- ");
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public long counterHoSoAll(String documentTypeCode, String maritimeCode, String shipName, String documentName,
			String callSign) throws SystemException {
		Session session = null;

		Date date = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*) as total from temp_document ");

			query.append(" WHERE DocumentTypeCode = '" + documentTypeCode + "' ");

			if (Validator.isNotNull(maritimeCode)) {
				query.append(" AND MaritimeCode = " + maritimeCode + " ");
			}
			if (Validator.isNotNull(shipName)) {
				query.append(" AND ShipName = " + shipName + " ");
			}
			if (Validator.isNotNull(documentName)) {
				query.append(" AND DocumentName = " + documentName + " ");
			}
			if (Validator.isNotNull(callSign)) {
				query.append(" AND CallSign = " + callSign + " ");
			}
			log.debug(query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public List<TempDebitNote> findTempDebitNote(String maritimeCode, String positionCode, String portRegionCode,
			String mabankhai, String stateCode, String imo, String markasdelted, String lastPortCode, int start,
			int end, String shipName, String callSign) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "select temp_debitnote.* from temp_debitnote left join temp_document on temp_debitnote.DocumentName = temp_document.DocumentName where 1 = 1 ";

			// cang vu hang hai
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = " + maritimeCode.trim());
			}

			// vi tri tau di chuyen
			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				query.append(" AND temp_document.ShipPosition = " + positionCode.trim());
			}

			// khu vuc cang
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = " + portRegionCode.trim());
			}

			// Ma ban khai documentName
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				query.append(" AND temp_document.DocumentName = " + mabankhai.trim());
			}

			// Quoc tich
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = " + stateCode.trim());
			}
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = " + lastPortCode.trim());
			}

			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND temp_document.imo like '%" + imo.trim() + "%' ");
			}

			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}

			if (Validator.isNotNull(markasdelted) && markasdelted.trim().length() > 0) {
				query.append(" AND temp_debitnote.markasdeleted in (" + markasdelted.trim() + ") ");
			}

			sql = sql + query.toString();
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempDebitNote", TempDebitNoteImpl.class);

			log.debug("===findTempDebitNote==" + sql.toString());
			// log.info("===findTempDocumentByKeHoach==" );
			QueryPos qPos = QueryPos.getInstance(q);

			if (start >= 0) {
				return (List<TempDebitNote>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return (List<TempDebitNote>) QueryUtil.list(q, getDialect(), start, end);
			}

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public long countTempDebitNote(String maritimeCode, String positionCode, String portRegionCode, String mabankhai,
			String stateCode, String imo, String markasdelted, String lastPortCode, String shipName, String callSign)
			throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			String sql = "select count(*) as total from temp_debitnote left join temp_document on temp_debitnote.DocumentName = temp_document.DocumentName where 1 = 1 ";

			// cang vu hang hai
			if (Validator.isNotNull(maritimeCode) && maritimeCode.trim().length() > 0
					&& !maritimeCode.trim().equalsIgnoreCase("LUA_CHON")) {
				query.append(" AND temp_document.MaritimeCode = " + maritimeCode.trim());
			}

			// vi tri tau di chuyen
			if (Validator.isNotNull(positionCode) && positionCode.trim().length() > 0) {
				query.append(" AND temp_document.ShipPosition = " + positionCode.trim());
			}

			// khu vuc cang
			if (Validator.isNotNull(portRegionCode) && portRegionCode.trim().length() > 0) {
				query.append(" AND temp_document.PortRegionCode = " + portRegionCode.trim());
			}

			// Ma ban khai documentName
			if (Validator.isNotNull(mabankhai) && mabankhai.trim().length() > 0) {
				query.append(" AND temp_document.DocumentName = " + mabankhai.trim());
			}

			// Quoc tich
			if (Validator.isNotNull(stateCode) && stateCode.trim().length() > 0) {
				query.append(" AND temp_document.StateCode = " + stateCode.trim());
			}
			if (Validator.isNotNull(lastPortCode) && lastPortCode.trim().length() > 0) {
				query.append(" AND temp_document.LastPortCode = " + lastPortCode.trim());
			}
			if (Validator.isNotNull(imo) && imo.trim().length() > 0) {
				query.append(" AND imo like '%" + imo.trim() + "%' ");
			}
			if (Validator.isNotNull(shipName) && shipName.trim().length() > 0) {
				query.append(" AND temp_document.ShipName like '%" + shipName.trim() + "%' ");
			}

			if (Validator.isNotNull(callSign) && callSign.trim().length() > 0) {
				query.append(" AND temp_document.CallSign like '%" + callSign.trim() + "%' ");
			}
			if (Validator.isNotNull(markasdelted) && markasdelted.trim().length() > 0) {
				query.append(" AND temp_debitnote.markasdeleted in (" + markasdelted.trim() + ") ");
			}
			sql = sql + query.toString();

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.longValue();
				}
			}
			return 0;

		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public boolean isValid_ShipAgencyCode_IMO_MaritimeCode(long documentName,
			int documentYear, String imo, String maritimeCode,
			String ShipAgencyCode) throws SystemException {
		Session session = null;
		Session session1 = null;

		Date date = null;
		try {
			session = openSession();
			session1 = openSession();
			StringBuilder query = new StringBuilder();
			StringBuilder query1 = new StringBuilder();

			query1.append("select count(*) as total from temp_document temp ");
			query1.append(" where temp.DocumentName = " + documentName + " ");
			query1.append(" and temp.DocumentYear = " + documentYear + " ");

			SQLQuery sql = session1.createSQLQuery(query1.toString());
			sql.addScalar("total", Type.LONG);
			sql.setCacheable(false);
			closeSession(session1);

			Iterator<Long> itr = sql.list().iterator();
			// B1. Kiem tra xem ho so co ton tai; Neu ton tai thi kiem tra tiep
			// B2; Neu Count=0 thi tra ve OK
			if (itr.hasNext()) {
				Long count = itr.next();
				if ((count != null) && count.longValue() > 0) {
					// return count.longValue();
					// B2. Kiem tra xem neu ho so ton tai va Cang vu da tiep
					// nhan. Neu ton tai bo key duoi day thi tra ve OK.
					// -- Neu Count=0 tra ve ERR, phai canh bao, khong cap nhat
					// va tu choi tiep nhan message. Quy tac nhu sau
					// -- 1. Khong ton tai cung luc 1 ho so lien quan den 2 dai
					// ly khac nhau;
					// -- 2. Hoac lien quan den 2 tau khac nhau;
					// -- 3. Hoac lien quan den 2 cang vu cung thu ly.

					// B3. Kiem tra xem neu ho so ton tai nhung Cang vu chua
					// tiep nhan. Neu ton tai thi tra ve OK.
					// -- Neu Count=0 tra ve ERR, phai canh bao, khong cap nhat
					// va tu choi tiep nhan message. Quy tac nhu sau
					// -- 1. Khong ton tai cung luc 1 ho so lien quan den 2 dai
					// ly khac nhau;
					// -- 2. Hoac lien quan den 2 cang vu cung thu ly.
					// -- Nhung, van cho sua ten tau, quoc tich, ho hieu, IMO
					query.append("select count(*) as total from temp_document temp ");
					query.append(" where  ");
					query.append(" temp.DocumentName = " + documentName + " ");
					query.append(" and temp.DocumentYear = " + documentYear
							+ " ");
					query.append(" and (temp.ShipAgencyCode = "
							+ ShipAgencyCode
							+ " OR LENGTH(temp.ShipAgencyCode) = 0 ) ");
					query.append(" and (MaritimeCode = " + maritimeCode
							+ " OR LENGTH(MaritimeCode) = 0 ) ");
					query.append(" and   ");
					query.append(" ((temp.RequestState in (14,114, 15,16,12,13) and (temp.IMO = '" + imo.trim() + "'" + " OR LENGTH(temp.IMO) = 0 ) "+" ) ");
					query.append(" OR  ");
					query.append(" RequestState in (11,27) ) ");
					log.info("-----------------query isValid_ShipAgencyCode_IMO_MaritimeCode------------------- ");
					log.info(query.toString());

					SQLQuery q = session.createSQLQuery(query.toString());
					q.addScalar("total", Type.LONG);
					q.setCacheable(false);

					Iterator<Long> itrNEXT = q.list().iterator();

					if (itrNEXT.hasNext()) {
						Long countNEXT = itrNEXT.next();
						if (countNEXT != null && countNEXT.longValue() > 0) {
							return true;
						} else {
							return false;
						}
					}
					return false;

					// return 0; // invalid
					// return 1; // valid
				} else {
					// Nguoc lai, return 0; // valid
					return true;
				}
			}
			// Nguoc lai, return 0; // valid
			return true;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session1);
			closeSession(session);
		}

	}
}
