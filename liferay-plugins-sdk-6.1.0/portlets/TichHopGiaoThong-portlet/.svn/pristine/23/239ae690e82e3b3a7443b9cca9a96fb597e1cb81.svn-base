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

package vn.gt.dao.danhmucgt.service.impl;

import java.util.List;

import vn.gt.dao.danhmuc.model.DmHistoryMaritime;
import vn.gt.dao.danhmucgt.model.DmGTShipPosition;
import vn.gt.dao.danhmucgt.service.base.DmGTShipPositionLocalServiceBaseImpl;

/**
 * The implementation of the dm g t ship position local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmucgt.service.DmGTShipPositionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmucgt.service.base.DmGTShipPositionLocalServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.DmGTShipPositionLocalServiceUtil
 */
public class DmGTShipPositionLocalServiceImpl
	extends DmGTShipPositionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmucgt.service.DmGTShipPositionLocalServiceUtil} to access the dm g t ship position local service.
	 */
	
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByPositionCode(
			java.lang.String positionCode){
		try{
			return dmGTShipPositionPersistence.findByPositionCode(positionCode);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public int countByPositionCode(java.lang.String positionCode){
		try{
			
			return dmGTShipPositionPersistence.countByPositionCode(positionCode);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public DmGTShipPosition getByPositionCode(String positionCode) {
		try {
			List<DmGTShipPosition> dmGTShipPositions = dmGTShipPositionPersistence.findByPositionCode(positionCode);
			if (dmGTShipPositions != null && dmGTShipPositions.size() > 0) { return dmGTShipPositions.get(0); }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByRoleAndThuTuc(
			java.lang.String positionCode)
			throws com.liferay.portal.kernel.exception.SystemException{
		return dmGTShipPositionFinder.findByRoleAndThuTuc(positionCode);
	}
}