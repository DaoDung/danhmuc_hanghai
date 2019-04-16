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

import vn.gt.dao.danhmuc.model.DmHistoryPortRegion;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryPortRegion in entity cache.
 *
 * @author win_64
 * @see DmHistoryPortRegion
 * @generated
 */
public class DmHistoryPortRegionCacheModel implements CacheModel<DmHistoryPortRegion>,
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

	public DmHistoryPortRegion toEntityModel() {
		DmHistoryPortRegionImpl dmHistoryPortRegionImpl = new DmHistoryPortRegionImpl();

		dmHistoryPortRegionImpl.setId(id);

		if (portRegionCode == null) {
			dmHistoryPortRegionImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortRegionImpl.setPortRegionCode(portRegionCode);
		}

		if (portRegionName == null) {
			dmHistoryPortRegionImpl.setPortRegionName(StringPool.BLANK);
		}
		else {
			dmHistoryPortRegionImpl.setPortRegionName(portRegionName);
		}

		if (portRegionNameVN == null) {
			dmHistoryPortRegionImpl.setPortRegionNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryPortRegionImpl.setPortRegionNameVN(portRegionNameVN);
		}

		if (portRegionRef == null) {
			dmHistoryPortRegionImpl.setPortRegionRef(StringPool.BLANK);
		}
		else {
			dmHistoryPortRegionImpl.setPortRegionRef(portRegionRef);
		}

		if (portCode == null) {
			dmHistoryPortRegionImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortRegionImpl.setPortCode(portCode);
		}

		dmHistoryPortRegionImpl.setIsDelete(isDelete);
		dmHistoryPortRegionImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryPortRegionImpl.setModifiedDate(null);
		}
		else {
			dmHistoryPortRegionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryPortRegionImpl.setRequestedDate(null);
		}
		else {
			dmHistoryPortRegionImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryPortRegionImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryPortRegionImpl.setSyncVersion(syncVersion);
		}

		dmHistoryPortRegionImpl.resetOriginalValues();

		return dmHistoryPortRegionImpl;
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