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

import vn.gt.dao.danhmuc.model.DmState;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmState in entity cache.
 *
 * @author win_64
 * @see DmState
 * @generated
 */
public class DmStateCacheModel implements CacheModel<DmState>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", stateName=");
		sb.append(stateName);
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

	public DmState toEntityModel() {
		DmStateImpl dmStateImpl = new DmStateImpl();

		dmStateImpl.setId(id);

		if (stateCode == null) {
			dmStateImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmStateImpl.setStateCode(stateCode);
		}

		if (stateName == null) {
			dmStateImpl.setStateName(StringPool.BLANK);
		}
		else {
			dmStateImpl.setStateName(stateName);
		}

		if (description == null) {
			dmStateImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmStateImpl.setDescription(description);
		}

		dmStateImpl.setIsDelete(isDelete);
		dmStateImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmStateImpl.setModifiedDate(null);
		}
		else {
			dmStateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmStateImpl.setRequestedDate(null);
		}
		else {
			dmStateImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmStateImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmStateImpl.setSyncVersion(syncVersion);
		}

		dmStateImpl.resetOriginalValues();

		return dmStateImpl;
	}

	public int id;
	public String stateCode;
	public String stateName;
	public String description;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}