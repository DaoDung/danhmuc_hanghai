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

import vn.gt.dao.danhmucgt.model.DmGtStatus;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmGtStatus in entity cache.
 *
 * @author win_64
 * @see DmGtStatus
 * @generated
 */
public class DmGtStatusCacheModel implements CacheModel<DmGtStatus>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", statusCode=");
		sb.append(statusCode);
		sb.append(", statusName=");
		sb.append(statusName);
		sb.append(", type=");
		sb.append(type);
		sb.append(", description=");
		sb.append(description);
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

	public DmGtStatus toEntityModel() {
		DmGtStatusImpl dmGtStatusImpl = new DmGtStatusImpl();

		dmGtStatusImpl.setId(id);
		dmGtStatusImpl.setStatusCode(statusCode);

		if (statusName == null) {
			dmGtStatusImpl.setStatusName(StringPool.BLANK);
		}
		else {
			dmGtStatusImpl.setStatusName(statusName);
		}

		dmGtStatusImpl.setType(type);

		if (description == null) {
			dmGtStatusImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmGtStatusImpl.setDescription(description);
		}

		dmGtStatusImpl.setIsDelete(isDelete);
		dmGtStatusImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtStatusImpl.setModifiedDate(null);
		}
		else {
			dmGtStatusImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtStatusImpl.setRequestedDate(null);
		}
		else {
			dmGtStatusImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtStatusImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtStatusImpl.setSyncVersion(syncVersion);
		}

		dmGtStatusImpl.resetOriginalValues();

		return dmGtStatusImpl;
	}

	public long id;
	public int statusCode;
	public String statusName;
	public int type;
	public String description;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}