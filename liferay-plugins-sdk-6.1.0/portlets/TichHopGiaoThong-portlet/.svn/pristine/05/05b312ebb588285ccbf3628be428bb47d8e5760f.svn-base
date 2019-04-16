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

package vn.gt.dao.common.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.common.model.UserPort;
import vn.gt.dao.common.service.base.UserPortLocalServiceBaseImpl;

/**
 * The implementation of the user port local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.common.service.UserPortLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.common.service.base.UserPortLocalServiceBaseImpl
 * @see vn.gt.dao.common.service.UserPortLocalServiceUtil
 */
public class UserPortLocalServiceImpl extends UserPortLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link vn.gt.dao.common.service.UserPortLocalServiceUtil} to access
	 * the user port local service.
	 */
	
	public List<UserPort> findByPortCode(String portCode, int start, int end) {
		try {
			return userPortPersistence.findByPortCode(portCode, start, end);
		} catch (Exception e) {
			
		}
		
		return null;
	}
	
	public UserPort findByUserId(long userId) {
		try {
			return userPortPersistence.fetchByUserId(userId);
		} catch (SystemException e) {
			
		}
		
		return null;
	}
	
	public int countByPortCode(String portHarbourCode) {
		try {
			return userPortPersistence.countByPortCode(portHarbourCode);
		} catch (Exception e) {
		}
		
		return 0;
	}
	
	public List<UserPort> findAll(int start, int end) {
		try {
			return userPortPersistence.findAll(start, end);
		} catch (Exception e) {
			
		}
		
		return null;
	}
}