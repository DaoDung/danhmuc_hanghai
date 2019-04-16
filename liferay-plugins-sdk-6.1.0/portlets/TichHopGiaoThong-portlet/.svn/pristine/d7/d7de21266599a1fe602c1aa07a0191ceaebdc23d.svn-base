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

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException;
import vn.gt.dao.danhmuc.service.base.DmHistoryPortRegionLocalServiceBaseImpl;

/**
 * The implementation of the dm history port region local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.DmHistoryPortRegionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmHistoryPortRegionLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmHistoryPortRegionLocalServiceUtil
 */
public class DmHistoryPortRegionLocalServiceImpl
	extends DmHistoryPortRegionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmHistoryPortRegionLocalServiceUtil} to access the dm history port region local service.
	 */
	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion findByPortRegionCodeAndSyncVersion(
			String portRegionCode, String syncVersion) {
		try {
			return dmHistoryPortRegionPersistence.findByPortRegionCodeAndSyncVersion(portRegionCode, syncVersion);
		} catch (NoSuchDmHistoryPortRegionException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
}