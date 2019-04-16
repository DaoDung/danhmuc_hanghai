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

package vn.gt.dao.danhmuc.service.persistence;

/**
 * @author win_64
 */
public interface DmPortHarbourFinder {
	public java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> getAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findDanhSachDmPortHarbour(
		java.lang.String maritimeCode, java.lang.String portRegion,
		java.lang.String portHarbourName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDanhSachDmPortHarbour(java.lang.String maritimeCode,
		java.lang.String portRegion, java.lang.String portHarbourName)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.danhmuc.model.DmPortHarbour getFirstPortHarbour()
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.danhmuc.model.DmPortHarbour getLastPortHarbour()
		throws com.liferay.portal.kernel.exception.SystemException;
}