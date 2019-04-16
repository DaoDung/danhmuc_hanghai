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

import vn.gt.dao.noticeandmessage.model.TempCrewEffectsItems;
import vn.gt.dao.noticeandmessage.model.TempCrewList;
import vn.gt.dao.noticeandmessage.model.impl.TempCrewEffectsItemsImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempCrewListImpl;

/**
 * The persistence implementation for the temp crew effects items service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempCrewEffectsItemsPersistence
 * @see TempCrewEffectsItemsUtil
 * @generated
 */
public class TempCrewEffectsItemsFinderImpl extends BasePersistenceImpl<TempCrewEffectsItems> implements TempCrewEffectsItemsFinder {
	Log _log = LogFactoryUtil.getLog(TempCrewEffectsItemsFinderImpl.class);

	public TempCrewEffectsItems findTempCrewEffectsItemsByRequestCode(String requestCode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM TEMP_CREW_EFFECTS_ITEMS WHERE RequestCode = ?");
			
			String sql = query.toString();
			_log.debug("=========findTempCrewEffectsItemsByRequestCode========" + sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("TempCrewEffectsItems", TempCrewEffectsItemsImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(requestCode);
			 
						// execute the query and return a list from the db
			return (TempCrewEffectsItems) q.uniqueResult();
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}