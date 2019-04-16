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

package vn.gt.dao.danhmuc.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.danhmuc.model.DmPortRegion;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmPortRegion in entity cache.
 *
 * @author win_64
 * @see DmPortRegion
 * @generated
 */
public class DmPortRegionCacheModel implements CacheModel<DmPortRegion>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", portRegionCode=");
		sb.append(portRegionCode);
		sb.append(", portRegionName=");
		sb.append(portRegionName);
		sb.append(", portRegionNameVN=");
		sb.append(portRegionNameVN);
		sb.append(", portRegionRef=");
		sb.append(portRegionRef);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", isDelete=");
		sb.append(isDelete);
		sb.append(", markedAsDelete=");
		sb.append(markedAsDelete);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", syncVersion=");
		sb.append(syncVersion);
		sb.append("}");

		return sb.toString();
	}

	public DmPortRegion toEntityModel() {
		DmPortRegionImpl dmPortRegionImpl = new DmPortRegionImpl();

		dmPortRegionImpl.setId(id);

		if (portRegionCode == null) {
			dmPortRegionImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			dmPortRegionImpl.setPortRegionCode(portRegionCode);
		}

		if (portRegionName == null) {
			dmPortRegionImpl.setPortRegionName(StringPool.BLANK);
		}
		else {
			dmPortRegionImpl.setPortRegionName(portRegionName);
		}

		if (portRegionNameVN == null) {
			dmPortRegionImpl.setPortRegionNameVN(StringPool.BLANK);
		}
		else {
			dmPortRegionImpl.setPortRegionNameVN(portRegionNameVN);
		}

		if (portRegionRef == null) {
			dmPortRegionImpl.setPortRegionRef(StringPool.BLANK);
		}
		else {
			dmPortRegionImpl.setPortRegionRef(portRegionRef);
		}

		if (portCode == null) {
			dmPortRegionImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmPortRegionImpl.setPortCode(portCode);
		}

		dmPortRegionImpl.setIsDelete(isDelete);
		dmPortRegionImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmPortRegionImpl.setModifiedDate(null);
		}
		else {
			dmPortRegionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmPortRegionImpl.setRequestedDate(null);
		}
		else {
			dmPortRegionImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmPortRegionImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmPortRegionImpl.setSyncVersion(syncVersion);
		}

		dmPortRegionImpl.resetOriginalValues();

		return dmPortRegionImpl;
	}

	public int id;
	public String portRegionCode;
	public String portRegionName;
	public String portRegionNameVN;
	public String portRegionRef;
	public String portCode;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}