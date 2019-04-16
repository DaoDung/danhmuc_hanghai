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
public interface DmPortWharfFinder {
	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findDanhSachDmPortWharf(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN, boolean ascOrdesc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDanhSachDmPortWharf(java.lang.String portRegionCode,
		java.lang.String portHarbourCode, java.lang.String PortWharfNameVN)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findDongBoDmPortWharf(
		java.lang.String MaritimeCode, java.lang.String portRegionCode,
		java.lang.String portHarbourCode, java.lang.String PortWharfNameVN,
		boolean ascOrdesc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDongBoDmPortWharf(java.lang.String MaritimeCode,
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortHarbourCodeOrNull(
		java.lang.String portHarbourCode, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCodeOrderPortCode(
		java.lang.String portRegionCode, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.danhmuc.model.DmPortWharf getFirstPortWharf()
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.danhmuc.model.DmPortWharf getLastPortWharf()
		throws com.liferay.portal.kernel.exception.SystemException;
}