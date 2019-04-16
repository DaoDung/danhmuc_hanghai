/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.gt.dao.noticeandmessage.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage;
import vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageImpl;
import vn.gt.dao.result.model.ResultDeclaration;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class TempNoTiceShipMessageFinderImpl extends BasePersistenceImpl<TempNoTiceShipMessage> implements TempNoTiceShipMessageFinder {
	
	private Log log = LogFactoryUtil.getLog(TempNoTiceShipMessageFinderImpl.class);
	
	public TempNoTiceShipMessage findTempNoTiceShipMessageByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE RequestCode = ?");
			
			log.debug("=========findTempNoTiceShipMessageByRequestCode========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			// execute the query and return a list from the db
			return (TempNoTiceShipMessage) q.uniqueResult();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public TempNoTiceShipMessage findTempNoTiceShipMessageXbByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		
		TempNoTiceShipMessage result = null;
		List<ResultDeclaration> allResultDeclaration = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE RequestCode = ?");
			query.append(" and noticeShipType = 2");
			
			log.debug("=========findTempNoTiceShipMessageXbByRequestCode========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			// execute the query and return a list from the db
			result = (TempNoTiceShipMessage) q.uniqueResult();
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	
	public List<TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(long documentName, int documentYear, String noticeShipType) {
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE DocumentName = ?");
			query.append(" and DocumentYear = ?");
			query.append(" and NoticeShipType = ? order by ConfirmTime desc");
			
			log.debug("=========findBydocumentNameAndDocumentYearAndNoticeShipType========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			qPos.add(noticeShipType);
			
			return (List<TempNoTiceShipMessage>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TempNoTiceShipMessage>();
	}
	
	public List<TempNoTiceShipMessage> findAllTempNoTiceShipMessageXbByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		
		List<TempNoTiceShipMessage> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE RequestCode = ?");
			query.append(" and noticeShipType = 2");
			
			log.debug("=========findTempNoTiceShipMessageXbByRequestCode========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			result = (List<TempNoTiceShipMessage>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	
	public List<TempNoTiceShipMessage> findAllTempNoTiceShipMessageTbByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		
		List<TempNoTiceShipMessage> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE RequestCode = ?");
			query.append(" and noticeShipType = 1");
			
			log.debug("=========findTempNoTiceShipMessageXbByRequestCode========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			result = (List<TempNoTiceShipMessage>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	
	public TempNoTiceShipMessage findTempNoTiceShipMessageTbByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		
		TempNoTiceShipMessage result = null;
		List<ResultDeclaration> allResultDeclaration = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE RequestCode = ?");
			query.append(" and noticeShipType = 1");
			
			log.debug("=========findTempNoTiceShipMessageXbByRequestCode========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			// execute the query and return a list from the db
			result = (TempNoTiceShipMessage) q.uniqueResult();
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	
	public List<TempNoTiceShipMessage> findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(long documentName, int documentYear,
			String noticeShipType, String orderByColumn, boolean ascOrdesc) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE DocumentName = ?");
			query.append(" and DocumentYear = ?");
			query.append(" and NoticeShipType = ?");
			query.append(" order by ConfirmTime ");
			
			if (ascOrdesc == true) {
				query.append(" asc");
			} else if (ascOrdesc == false) {
				query.append(" desc");
			}
			
			log.debug("=========findBy_DocumentName_And_DocumentYear_And_NoticeShipType_OrderByColumn========" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			qPos.add(noticeShipType);
			
			return (List<TempNoTiceShipMessage>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TempNoTiceShipMessage>();
	}
	
	/**
	 * noticeShipType = 1 ThongBao. noticeShipType = 2 XacBao
	 */
	
	public TempNoTiceShipMessage getXacBaoLastByDocumentNameAndDocumentYear(long documentName, long documentYear) throws SystemException {
		Session session = null;
		
		TempNoTiceShipMessage result = null;
		try {
			session = openSession();
			StringBuilder maxXacBao = new StringBuilder();
			maxXacBao.append("select max(ConfirmTime) from temp_notice_ship_message where ");
			maxXacBao.append("DocumentName = '" + documentName + "' ");
			maxXacBao.append("and DocumentYear = '" + documentYear + "' ");
			maxXacBao.append("and noticeShipType = 2");
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE DocumentName = ?");
			query.append(" and DocumentYear = ?");
			query.append(" and noticeShipType = 2");
			query.append(" and ConfirmTime = (" + maxXacBao.toString() + ")");
			
			log.debug("==getXacBaoLastByDocumentNameAndDocumentYear==" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			// execute the query and return a list from the db
			List<TempNoTiceShipMessage> lstResult = (List<TempNoTiceShipMessage>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lstResult != null && lstResult.size() > 0) {
				result = lstResult.get(0);
			}
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	
	/**
	 * noticeShipType = 1 ThongBao. noticeShipType = 2 XacBao
	 */
	public TempNoTiceShipMessage getThongBaoLastByDocumentNameAndDocumentYear(long documentName, long documentYear) throws SystemException {
		Session session = null;
		
		TempNoTiceShipMessage result = null;
		try {
			session = openSession();
			StringBuilder maxXacBao = new StringBuilder();
			maxXacBao.append("select max(ConfirmTime) from temp_notice_ship_message where ");
			maxXacBao.append("DocumentName = '" + documentName + "' ");
			maxXacBao.append("and DocumentYear = '" + documentYear + "' ");
			maxXacBao.append("and noticeShipType = 1");
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT {temp_notice_ship_message.*} FROM temp_notice_ship_message ");
			query.append(" WHERE DocumentName = ?");
			query.append(" and DocumentYear = ?");
			query.append(" and noticeShipType = 1");
			query.append(" and ConfirmTime = (" + maxXacBao.toString() + ")");
			
			log.debug("=========findThongBaoLastByDocumentNameAndDocumentYear========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("temp_notice_ship_message", TempNoTiceShipMessageImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			List<TempNoTiceShipMessage> lstResult = (List<TempNoTiceShipMessage>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lstResult != null && lstResult.size() > 0) {
				result = lstResult.get(0);
			}
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	
}