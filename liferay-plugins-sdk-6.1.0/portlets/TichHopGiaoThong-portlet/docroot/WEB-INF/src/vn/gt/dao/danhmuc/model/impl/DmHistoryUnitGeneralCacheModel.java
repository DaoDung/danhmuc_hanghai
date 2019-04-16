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

import vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryUnitGeneral in entity cache.
 *
 * @author win_64
 * @see DmHistoryUnitGeneral
 * @generated
 */
public class DmHistoryUnitGeneralCacheModel implements CacheModel<DmHistoryUnitGeneral>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", unitCode=");
		sb.append(unitCode);
		sb.append(", unitName=");
		sb.append(unitName);
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

	public DmHistoryUnitGeneral toEntityModel() {
		DmHistoryUnitGeneralImpl dmHistoryUnitGeneralImpl = new DmHistoryUnitGeneralImpl();

		dmHistoryUnitGeneralImpl.setId(id);

		if (unitCode == null) {
			dmHistoryUnitGeneralImpl.setUnitCode(StringPool.BLANK);
		}
		else {
			dmHistoryUnitGeneralImpl.setUnitCode(unitCode);
		}

		if (unitName == null) {
			dmHistoryUnitGeneralImpl.setUnitName(StringPool.BLANK);
		}
		else {
			dmHistoryUnitGeneralImpl.setUnitName(unitName);
		}

		dmHistoryUnitGeneralImpl.setIsDelete(isDelete);
		dmHistoryUnitGeneralImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryUnitGeneralImpl.setModifiedDate(null);
		}
		else {
			dmHistoryUnitGeneralImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryUnitGeneralImpl.setRequestedDate(null);
		}
		else {
			dmHistoryUnitGeneralImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryUnitGeneralImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryUnitGeneralImpl.setSyncVersion(syncVersion);
		}

		dmHistoryUnitGeneralImpl.resetOriginalValues();

		return dmHistoryUnitGeneralImpl;
	}

	public int id;
	public String unitCode;
	public String unitName;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}