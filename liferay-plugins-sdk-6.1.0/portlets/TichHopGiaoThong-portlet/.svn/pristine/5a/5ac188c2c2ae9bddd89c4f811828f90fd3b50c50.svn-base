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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.danhmuc.model.DmRepresentative;
import vn.gt.dao.danhmuc.service.base.DmRepresentativeLocalServiceBaseImpl;

/**
 * The implementation of the dm representative local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.DmRepresentativeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmRepresentativeLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil
 */
public class DmRepresentativeLocalServiceImpl extends DmRepresentativeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil} to access the dm representative local service.
	 */
	
	public DmRepresentative getByRepCode(String repCode) {
		try {
			return dmRepresentativePersistence.findByRepCode(repCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmRepresentative> findByMaritimeCode(String maritimeCode) {
		try {
			//return dmRepresentativePersistence.findByMaritimeCode(maritimeCode);
			return dmRepresentativeFinder.findDmRepresentativeByMaritimeCode(maritimeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmRepresentative>();
	}
	
	public List<DmRepresentative> findDanhSachDmRepresentative(String maritimeCode, int start, int end) {
		try {
			return dmRepresentativeFinder.findDanhSachDmRepresentative(maritimeCode, start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmRepresentative>();
	}
	
	public List<DmRepresentative> findDmRepresentativeByMaritimeCode(String maritimeCode) {
		try {
			return dmRepresentativeFinder.findDmRepresentativeByMaritimeCode(maritimeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmRepresentative>();
	}
	
	public int countDanhSachDmRepresentative(String maritimeCode) {
		try {
			return dmRepresentativeFinder.countDanhSachDmRepresentative(maritimeCode);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
}