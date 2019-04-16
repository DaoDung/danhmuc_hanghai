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

package vn.gt.dao.danhmuc.service.persistence;

import java.util.List;

import vn.gt.dao.danhmuc.model.DmHistoryMaritime;
import vn.gt.dao.danhmuc.model.impl.DmHistoryMaritimeImpl;
import vn.gt.dao.noticeandmessage.service.persistence.HistoryInterfaceRequestPersistenceImpl;

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
public class DmHistoryMaritimeFinderImpl extends BasePersistenceImpl<DmHistoryMaritime> implements DmHistoryMaritimeFinder {
	
	Log _log = LogFactoryUtil.getLog(DmHistoryMaritimeFinderImpl.class);

	public List<DmHistoryMaritime> findAllDmHistoryMaritimeOrderAsc() {
		Session session = null;
		
		List<DmHistoryMaritime> allDmHistoryMaritime = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM dm_history_maritime ");
			query.append(" order by MaritimeOrder asc ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("DmHistoryMaritime", DmHistoryMaritimeImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			// execute the query and return a list from the db
			
			allDmHistoryMaritime = (List<DmHistoryMaritime>)QueryUtil.list(q, getDialect(),
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			e.printStackTrace();
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return allDmHistoryMaritime;
	}
	
}