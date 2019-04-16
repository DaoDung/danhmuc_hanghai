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

import vn.gt.dao.danhmuc.model.DmPortRegion;
import vn.gt.dao.danhmuc.service.base.DmPortRegionLocalServiceBaseImpl;
import vn.gt.dao.danhmuc.service.persistence.DmPortRegionFinderImpl;

/**
 * The implementation of the dm port region local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.DmPortRegionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmPortRegionLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil
 */
public class DmPortRegionLocalServiceImpl
	extends DmPortRegionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil} to access the dm port region local service.
	 */
	
	public DmPortRegion getByPortRegionCode(String portRegionCode) {
		try {
			List<DmPortRegion> dmPortRegiones = dmPortRegionPersistence.findByPortRegionCode(portRegionCode);
			if (dmPortRegiones != null && dmPortRegiones.size() > 0) { return dmPortRegiones.get(0); }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmPortRegion> findPortRegionByPortRegionRef (String portRegionRef) {
		try {
			return dmPortRegionPersistence.findByPortRegionRef(portRegionRef);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmPortRegion> findPortRegionByPortCodeName (String portCode) {
		try {
			return dmPortRegionPersistence.findByPortCodeName(portCode);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmPortRegion> findDanhSachDmPortRegion(String maritimeCode, String portRegionName, String portCode, int start, int end) {
		try {
			return dmPortRegionFinder.findDanhSachDmPortRegion(maritimeCode, portRegionName, portCode, start, end);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countDanhSachDmPortRegion(String maritimeCode, String portRegionName, String portCode) {
		try {
			return dmPortRegionFinder.countDanhSachDmPortRegion(maritimeCode, portRegionName, portCode);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public DmPortRegion getFirstPortRegion() {
		try {
			return dmPortRegionFinder.getFirstPortRegion();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DmPortRegion getLastPortRegion() {
		try {
			return dmPortRegionFinder.getLastPortRegion();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}