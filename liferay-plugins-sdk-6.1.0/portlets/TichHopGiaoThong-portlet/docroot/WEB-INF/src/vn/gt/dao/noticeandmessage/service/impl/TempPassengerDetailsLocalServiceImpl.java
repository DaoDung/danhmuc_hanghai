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

package vn.gt.dao.noticeandmessage.service.impl;

import vn.gt.dao.noticeandmessage.service.base.TempPassengerDetailsLocalServiceBaseImpl;

/**
 * The implementation of the temp passenger details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempPassengerDetailsLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalServiceUtil
 */
public class TempPassengerDetailsLocalServiceImpl
	extends TempPassengerDetailsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalServiceUtil} to access the temp passenger details local service.
	 */
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findByRequestCode(
			java.lang.String requestCode)
			throws com.liferay.portal.kernel.exception.SystemException{
		return tempPassengerDetailsPersistence.findByRequestCode(requestCode);
	}
	
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findByPassengerCode(
			java.lang.String passengerCode)
			throws com.liferay.portal.kernel.exception.SystemException{
		return tempPassengerDetailsPersistence.findByRequestCode(passengerCode);
	}
}