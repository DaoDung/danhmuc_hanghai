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

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequest;
import vn.gt.dao.noticeandmessage.model.impl.HistoryInterfaceRequestImpl;

/**
 * The persistence utility for the history interface request service. This utility wraps {@link HistoryInterfaceRequestPersistenceImpl} and provides
 * direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction.
 * Never access this utility in a JSP, controller, model, or other front-end class.
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see HistoryInterfaceRequestPersistence
 * @see HistoryInterfaceRequestPersistenceImpl
 * @generated
 */
public class HistoryInterfaceRequestFinderImpl extends BasePersistenceImpl<HistoryInterfaceRequest> implements HistoryInterfaceRequestFinder {
	
	private Log _log = LogFactoryUtil.getLog(HistoryInterfaceRequestFinderImpl.class);
	
	public HistoryInterfaceRequest findHistoryInterfaceRequestByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM HISTORY_INTERFACE_REQUEST ");
			query.append(" WHERE RequestCode = ?");
			
			_log.debug("=========findHistoryInterfaceRequestByRequestCode========" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("HistoryInterfaceRequest", HistoryInterfaceRequestImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			
			// execute the query and return a list from the db
			return (HistoryInterfaceRequest) q.uniqueResult();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int updateHistoryInterfaceRequest(String sql) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			
			_log.debug("=========updateByRequestCode========" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			int executeUpdate = q.executeUpdate();
			// session.flush();
			return executeUpdate;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}