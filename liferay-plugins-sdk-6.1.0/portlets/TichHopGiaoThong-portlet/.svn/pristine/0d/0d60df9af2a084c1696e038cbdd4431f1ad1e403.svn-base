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

import vn.gt.dao.danhmuc.model.DmPort;
import vn.gt.dao.danhmuc.service.base.DmPortLocalServiceBaseImpl;

/**
 * The implementation of the dm port local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.danhmuc.service.DmPortLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 * 
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmPortLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil
 */
public class DmPortLocalServiceImpl extends DmPortLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil} to access the
	 * dm port local service.
	 */
	
	public List<DmPort> findAll() {
		try {
			return dmPortPersistence.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DmPort getByPortCode(String portCode) {
		try {
			List<DmPort> findByPortCode = dmPortPersistence.findByPortCode(portCode);
			
			if(findByPortCode != null && findByPortCode.size() > 0) {
				return findByPortCode.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmPort> findByLoCode(String loCode) {
		try {
			return dmPortPersistence.findByLoCode(loCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countByPortCode(String portCode) {
		try {
			return dmPortPersistence.countByPortCode(portCode);
		} catch (Exception e) {
		}
		return 0;
	}
	
	public List<DmPort> findAll(int start, int end) {
		try {
			return dmPortPersistence.findAll(start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmPort> findByStateCodeAndCityCode(String stateCode, String citycode) {
		try {
			return dmPortPersistence.findByStateCodeAndCityCode(stateCode, citycode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DmPort fetchByPortCodeLoCode(String portCode, String loCode) {
		try {
			return dmPortPersistence.fetchByPortCodeLoCode(portCode, loCode);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}