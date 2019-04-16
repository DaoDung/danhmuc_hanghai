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

import vn.gt.dao.noticeandmessage.model.TempPassengerList;
import vn.gt.dao.noticeandmessage.model.impl.TempPassengerListImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class TempPassengerListFinderImpl extends BasePersistenceImpl<TempPassengerList> implements TempPassengerListFinder {
	
	private Log log = LogFactoryUtil.getLog(TempPassengerListFinderImpl.class);
	
	public TempPassengerList findTempPassengerListByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM TEMP_PASSENGER_LIST WHERE RequestCode = ?");
			
			String sql = query.toString();
			log.debug("=========findTempPassengerListByRequestCode========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempPassengerList", TempPassengerListImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			// execute the query and return a list from the db
			return (TempPassengerList) q.uniqueResult();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<TempPassengerList> findBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM TEMP_PASSENGER_LIST WHERE DocumentName = ? and DocumentYear = ? ");
			
			String sql = query.toString();
			log.debug("=========findBydocumentNameAnddocumentYear========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempPassengerList", TempPassengerListImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			// execute the query and return a list from the db
			return (List<TempPassengerList>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TempPassengerList>();
	}
	
	public TempPassengerList getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		Session session = null;
		try {
			session = openSession();
			
			//StringBuilder interfaceRequest = new StringBuilder();
/*			interfaceRequest.append("SELECT inter.RequestCode FROM interface_request inter INNER JOIN (");
			interfaceRequest.append("SELECT MAX(RequestedDate) AS MaxDateTime FROM interface_request WHERE RequestCode in (");
			interfaceRequest.append("SELECT RequestCode FROM temp_passenger_list ");
			interfaceRequest.append("WHERE DocumentName = '" + documentName + "' AND DocumentYear = '" + documentYear + "'");
			interfaceRequest.append(")");
			interfaceRequest.append(") interMax ON inter.RequestedDate = interMax.MaxDateTime");*/
			
			
			/*interfaceRequest.append("SELECT RequestCode FROM interface_request ");
			interfaceRequest.append("where RequestCode in (select RequestCode from temp_passenger_list where DocumentName = '" + documentName + "' and DocumentYear = '" + documentYear + "') ");
			interfaceRequest.append("and RequestedDate = ( ");
			interfaceRequest.append("select max(RequestedDate) from interface_request where RequestCode in (select RequestCode from temp_passenger_list where DocumentName = '" + documentName + "' and DocumentYear = '" + documentYear + "')");
			interfaceRequest.append(")");
			*/
			StringBuilder query = new StringBuilder();
			//query.append("SELECT * FROM temp_passenger_list WHERE RequestCode = (" + interfaceRequest.toString() + ")");
			query.append("SELECT * FROM temp_passenger_list WHERE DocumentName = ? and DocumentYear = ? order by ID desc");
			
			log.debug("=========getLastByDocumentNameAndDocumentYear========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TempPassengerList", TempPassengerListImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			// execute the query and return a list from the db
			List<TempPassengerList> lstTem = (List<TempPassengerList>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
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
	
	public List<TempPassengerList> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM temp_passenger_list WHERE DocumentName = ? and DocumentYear = ? order by ID desc");
			
			String sql = query.toString();
			log.debug("===findByDocumentNameAndDocumentYearOrderByDescRequestDate==" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempPassengerList", TempPassengerListImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);
			
			// execute the query and return a list from the db
			return (List<TempPassengerList>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return new ArrayList<TempPassengerList>();
	}
}