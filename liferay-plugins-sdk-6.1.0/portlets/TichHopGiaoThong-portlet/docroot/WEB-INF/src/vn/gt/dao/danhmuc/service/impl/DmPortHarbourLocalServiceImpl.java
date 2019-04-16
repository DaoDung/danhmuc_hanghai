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

import vn.gt.dao.danhmuc.model.DmPortHarbour;
import vn.gt.dao.danhmuc.model.DmPortRegion;
import vn.gt.dao.danhmuc.service.base.DmPortHarbourLocalServiceBaseImpl;

/**
 * The implementation of the dm port harbour local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.DmPortHarbourLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmPortHarbourLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil
 */
public class DmPortHarbourLocalServiceImpl extends DmPortHarbourLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil} to access the dm port harbour local service.
	 */
	public DmPortHarbour getByPortHarbourCode(String portHarbourCode) {
		try {
			List<DmPortHarbour> dmPortHarbours = dmPortHarbourPersistence.findByPortHarbourCode(portHarbourCode);
			if (dmPortHarbours != null && dmPortHarbours.size() > 0) { return dmPortHarbours.get(0); }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmPortHarbour> findByPortRegionCode(String portRegionCode) {
		try {
			return dmPortHarbourPersistence.findByPortRegionCode(portRegionCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmPortHarbour>();
	}
	
	public List<DmPortHarbour> findByPortRegion(String portRegion) {
		try {
			return dmPortHarbourPersistence.findByPortRegion(portRegion);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmPortHarbour>();
	}
	
	
	public List<DmPortHarbour> findDanhSachDmPortHarbour(String maritimeCode, String portRegion, String portHarbourName, int start, int end) {
		try {
			return dmPortHarbourFinder.findDanhSachDmPortHarbour(maritimeCode, portRegion, portHarbourName, start, end);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countDanhSachDmPortHarbour(String maritimeCode, String portRegion, String portHarbourName) {
		try {
			return dmPortHarbourFinder.countDanhSachDmPortHarbour(maritimeCode, portRegion, portHarbourName);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public DmPortHarbour getFirstPortHarbour() {
		try {
			return dmPortHarbourFinder.getFirstPortHarbour();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DmPortHarbour getLastPortHarbour() {
		try {
			return dmPortHarbourFinder.getLastPortHarbour();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}