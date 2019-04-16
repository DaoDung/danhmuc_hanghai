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

import vn.gt.dao.danhmuc.NoSuchDmHistoryShipAgencyException;
import vn.gt.dao.danhmuc.model.DmHistoryShipAgency;
import vn.gt.dao.danhmuc.service.base.DmHistoryShipAgencyLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the dm history ship agency local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.DmHistoryShipAgencyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmHistoryShipAgencyLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmHistoryShipAgencyLocalServiceUtil
 */
public class DmHistoryShipAgencyLocalServiceImpl
	extends DmHistoryShipAgencyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmHistoryShipAgencyLocalServiceUtil} to access the dm history ship agency local service.
	 */
	public DmHistoryShipAgency getByShipAgencyCode(String shipAgencyCode) {
		try {
			List<DmHistoryShipAgency> dmHistoryShipAgencyes = dmHistoryShipAgencyPersistence.findByShipAgencyCode(shipAgencyCode);
			if (dmHistoryShipAgencyes != null && dmHistoryShipAgencyes.size() > 0) { return dmHistoryShipAgencyes.get(0); }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DmHistoryShipAgency findByPurposeCodeAndSyncVersion(String shipAgencyCode, String syncVersion) {
		try {
			return dmHistoryShipAgencyPersistence.findByShipAgencyCodeAndSyncVersion(shipAgencyCode, syncVersion);
		} catch (NoSuchDmHistoryShipAgencyException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}