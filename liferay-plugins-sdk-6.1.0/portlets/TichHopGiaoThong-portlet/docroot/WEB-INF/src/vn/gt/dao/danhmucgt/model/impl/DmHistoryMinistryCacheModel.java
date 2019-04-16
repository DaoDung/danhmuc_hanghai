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

import vn.gt.dao.danhmucgt.model.DmHistoryMinistry;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryMinistry in entity cache.
 *
 * @author win_64
 * @see DmHistoryMinistry
 * @generated
 */
public class DmHistoryMinistryCacheModel implements CacheModel<DmHistoryMinistry>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ministryCode=");
		sb.append(ministryCode);
		sb.append(", ministryName=");
		sb.append(ministryName);
		sb.append(", ministryNameVN=");
		sb.append(ministryNameVN);
		sb.append(", ministryOrder=");
		sb.append(ministryOrder);
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

	public DmHistoryMinistry toEntityModel() {
		DmHistoryMinistryImpl dmHistoryMinistryImpl = new DmHistoryMinistryImpl();

		dmHistoryMinistryImpl.setId(id);

		if (ministryCode == null) {
			dmHistoryMinistryImpl.setMinistryCode(StringPool.BLANK);
		}
		else {
			dmHistoryMinistryImpl.setMinistryCode(ministryCode);
		}

		if (ministryName == null) {
			dmHistoryMinistryImpl.setMinistryName(StringPool.BLANK);
		}
		else {
			dmHistoryMinistryImpl.setMinistryName(ministryName);
		}

		if (ministryNameVN == null) {
			dmHistoryMinistryImpl.setMinistryNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryMinistryImpl.setMinistryNameVN(ministryNameVN);
		}

		dmHistoryMinistryImpl.setMinistryOrder(ministryOrder);
		dmHistoryMinistryImpl.setIsDelete(isDelete);
		dmHistoryMinistryImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryMinistryImpl.setModifiedDate(null);
		}
		else {
			dmHistoryMinistryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryMinistryImpl.setRequestedDate(null);
		}
		else {
			dmHistoryMinistryImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryMinistryImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryMinistryImpl.setSyncVersion(syncVersion);
		}

		dmHistoryMinistryImpl.resetOriginalValues();

		return dmHistoryMinistryImpl;
	}

	public long id;
	public String ministryCode;
	public String ministryName;
	public String ministryNameVN;
	public int ministryOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}