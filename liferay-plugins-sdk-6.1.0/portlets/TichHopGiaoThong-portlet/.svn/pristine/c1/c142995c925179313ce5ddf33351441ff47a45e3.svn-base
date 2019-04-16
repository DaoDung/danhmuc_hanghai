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

package vn.gt.dao.result.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.gt.dao.result.model.ResultNotification;
import vn.gt.dao.result.model.impl.ResultNotificationImpl;
import vn.gt.utils.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * The persistence utility for the history interface request service. This
 * utility wraps {@link HistoryInterfaceRequestPersistenceImpl} and provides
 * direct access to the database for CRUD operations. This utility should only
 * be used by the service layer, as it must operate within a transaction. Never
 * access this utility in a JSP, controller, model, or other front-end class.
 * 
 * <p>
 * Caching information and settings can be found in
 * <code>portal.properties</code>
 * </p>
 * 
 * @author win_64
 * @see HistoryInterfaceRequestPersistence
 * @see HistoryInterfaceRequestPersistenceImpl
 * @generated
 */
public class ResultNotificationFinderImpl extends BasePersistenceImpl<ResultNotification> implements ResultNotificationFinder {

	private Log log = LogFactoryUtil.getLog(ResultNotificationFinderImpl.class);

	public List<ResultNotification> findByBusinessTypeCodeOrderbyLastestDate(String businessTypeCode, long documentName, int documentYear) {
		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM result_notification ");
			query.append(" WHERE DocumentName = ? ");
			query.append(" AND DocumentYear = ? ");
			query.append(" AND BusinessTypeCode IN (" + businessTypeCode + ")");
			query.append(" order by LatestDate desc ");

			System.out.println("ResultNotificationFinderImpl.findByBusinessTypeCodeOrderbyLastestDate()" + query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultNotification", ResultNotificationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(documentName);
			qPos.add(documentYear);

			// execute the query and return a list from the db

			return (List<ResultNotification>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<ResultNotification>();
	}

	public List<ResultNotification> findByMaritimeCodeOrderbyLastestDate(String maritimeCode) {
		Session session = null;

		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM result_notification WHERE 1 = 1 ");
			if (maritimeCode != null && maritimeCode.length() > 0) {
				query.append(" and  MaritimeCode = '" + maritimeCode + "'");
			}
			query.append(" and LatestDate >= '" + FormatData.parseDateToTring(FormatData.subTractDate(new Date(), 7)) + "'");
			query.append(" order by LatestDate desc LIMIT 10 ");
			
			log.debug(query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ResultNotification", ResultNotificationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);

			// execute the query and return a list from the db

			return (List<ResultNotification>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<ResultNotification>();
	}
}