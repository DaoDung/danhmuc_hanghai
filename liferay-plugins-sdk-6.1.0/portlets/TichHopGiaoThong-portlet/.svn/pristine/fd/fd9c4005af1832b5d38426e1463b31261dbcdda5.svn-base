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

import vn.gt.dao.danhmuc.model.DmShipType;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmShipType in entity cache.
 *
 * @author win_64
 * @see DmShipType
 * @generated
 */
public class DmShipTypeCacheModel implements CacheModel<DmShipType>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", shipTypeCode=");
		sb.append(shipTypeCode);
		sb.append(", shipTypeName=");
		sb.append(shipTypeName);
		sb.append(", shipTypeNameVN=");
		sb.append(shipTypeNameVN);
		sb.append(", shipTypeOrder=");
		sb.append(shipTypeOrder);
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

	public DmShipType toEntityModel() {
		DmShipTypeImpl dmShipTypeImpl = new DmShipTypeImpl();

		dmShipTypeImpl.setId(id);

		if (shipTypeCode == null) {
			dmShipTypeImpl.setShipTypeCode(StringPool.BLANK);
		}
		else {
			dmShipTypeImpl.setShipTypeCode(shipTypeCode);
		}

		if (shipTypeName == null) {
			dmShipTypeImpl.setShipTypeName(StringPool.BLANK);
		}
		else {
			dmShipTypeImpl.setShipTypeName(shipTypeName);
		}

		if (shipTypeNameVN == null) {
			dmShipTypeImpl.setShipTypeNameVN(StringPool.BLANK);
		}
		else {
			dmShipTypeImpl.setShipTypeNameVN(shipTypeNameVN);
		}

		dmShipTypeImpl.setShipTypeOrder(shipTypeOrder);
		dmShipTypeImpl.setIsDelete(isDelete);
		dmShipTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmShipTypeImpl.setModifiedDate(null);
		}
		else {
			dmShipTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmShipTypeImpl.setRequestedDate(null);
		}
		else {
			dmShipTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmShipTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmShipTypeImpl.setSyncVersion(syncVersion);
		}

		dmShipTypeImpl.resetOriginalValues();

		return dmShipTypeImpl;
	}

	public int id;
	public String shipTypeCode;
	public String shipTypeName;
	public String shipTypeNameVN;
	public int shipTypeOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}