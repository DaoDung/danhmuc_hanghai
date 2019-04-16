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

package vn.gt.dao.danhmucgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.danhmucgt.model.DmGTShipPosition;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmGTShipPosition in entity cache.
 *
 * @author win_64
 * @see DmGTShipPosition
 * @generated
 */
public class DmGTShipPositionCacheModel implements CacheModel<DmGTShipPosition>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", positionCode=");
		sb.append(positionCode);
		sb.append(", positionName=");
		sb.append(positionName);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", positionOrder=");
		sb.append(positionOrder);
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

	public DmGTShipPosition toEntityModel() {
		DmGTShipPositionImpl dmGTShipPositionImpl = new DmGTShipPositionImpl();

		dmGTShipPositionImpl.setId(id);

		if (positionCode == null) {
			dmGTShipPositionImpl.setPositionCode(StringPool.BLANK);
		}
		else {
			dmGTShipPositionImpl.setPositionCode(positionCode);
		}

		if (positionName == null) {
			dmGTShipPositionImpl.setPositionName(StringPool.BLANK);
		}
		else {
			dmGTShipPositionImpl.setPositionName(positionName);
		}

		if (remarks == null) {
			dmGTShipPositionImpl.setRemarks(StringPool.BLANK);
		}
		else {
			dmGTShipPositionImpl.setRemarks(remarks);
		}

		dmGTShipPositionImpl.setPositionOrder(positionOrder);
		dmGTShipPositionImpl.setIsDelete(isDelete);
		dmGTShipPositionImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGTShipPositionImpl.setModifiedDate(null);
		}
		else {
			dmGTShipPositionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGTShipPositionImpl.setRequestedDate(null);
		}
		else {
			dmGTShipPositionImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGTShipPositionImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGTShipPositionImpl.setSyncVersion(syncVersion);
		}

		dmGTShipPositionImpl.resetOriginalValues();

		return dmGTShipPositionImpl;
	}

	public long id;
	public String positionCode;
	public String positionName;
	public String remarks;
	public int positionOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}