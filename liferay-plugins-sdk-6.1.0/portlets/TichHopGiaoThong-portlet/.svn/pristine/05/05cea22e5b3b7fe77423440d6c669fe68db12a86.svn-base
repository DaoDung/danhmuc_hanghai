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

package vn.gt.dao.danhmuc.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.danhmuc.NoSuchDmHistoryStateException;
import vn.gt.dao.danhmuc.model.DmHistoryState;
import vn.gt.dao.danhmuc.service.base.DmHistoryStateLocalServiceBaseImpl;

/**
 * The implementation of the dm history state local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.DmHistoryStateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmHistoryStateLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmHistoryStateLocalServiceUtil
 */
public class DmHistoryStateLocalServiceImpl
	extends DmHistoryStateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmHistoryStateLocalServiceUtil} to access the dm history state local service.
	 */
	public DmHistoryState getByStateCode(String stateCode) {
		try {
			List<DmHistoryState> dmHistoryStates = dmHistoryStatePersistence.findByStateCode(stateCode);
			if (dmHistoryStates != null && dmHistoryStates.size() > 0) { return dmHistoryStates.get(0); }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public DmHistoryState findByStateCodeAndSyncVersion(String stateCode, String syncVersion) {
		try {
			return dmHistoryStatePersistence.findByStateCodeAndSyncVersion(stateCode, syncVersion);
		} catch (NoSuchDmHistoryStateException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
}