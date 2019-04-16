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

import vn.gt.dao.danhmuc.model.DmHistoryPassportType;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryPassportType in entity cache.
 *
 * @author win_64
 * @see DmHistoryPassportType
 * @generated
 */
public class DmHistoryPassportTypeCacheModel implements CacheModel<DmHistoryPassportType>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", passportTypeCode=");
		sb.append(passportTypeCode);
		sb.append(", passportType=");
		sb.append(passportType);
		sb.append(", passportTypeName=");
		sb.append(passportTypeName);
		sb.append(", passportTypeNameVN=");
		sb.append(passportTypeNameVN);
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

	public DmHistoryPassportType toEntityModel() {
		DmHistoryPassportTypeImpl dmHistoryPassportTypeImpl = new DmHistoryPassportTypeImpl();

		dmHistoryPassportTypeImpl.setId(id);

		if (passportTypeCode == null) {
			dmHistoryPassportTypeImpl.setPassportTypeCode(StringPool.BLANK);
		}
		else {
			dmHistoryPassportTypeImpl.setPassportTypeCode(passportTypeCode);
		}

		if (passportType == null) {
			dmHistoryPassportTypeImpl.setPassportType(StringPool.BLANK);
		}
		else {
			dmHistoryPassportTypeImpl.setPassportType(passportType);
		}

		if (passportTypeName == null) {
			dmHistoryPassportTypeImpl.setPassportTypeName(StringPool.BLANK);
		}
		else {
			dmHistoryPassportTypeImpl.setPassportTypeName(passportTypeName);
		}

		if (passportTypeNameVN == null) {
			dmHistoryPassportTypeImpl.setPassportTypeNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryPassportTypeImpl.setPassportTypeNameVN(passportTypeNameVN);
		}

		dmHistoryPassportTypeImpl.setIsDelete(isDelete);
		dmHistoryPassportTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryPassportTypeImpl.setModifiedDate(null);
		}
		else {
			dmHistoryPassportTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryPassportTypeImpl.setRequestedDate(null);
		}
		else {
			dmHistoryPassportTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryPassportTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryPassportTypeImpl.setSyncVersion(syncVersion);
		}

		dmHistoryPassportTypeImpl.resetOriginalValues();

		return dmHistoryPassportTypeImpl;
	}

	public int id;
	public String passportTypeCode;
	public String passportType;
	public String passportTypeName;
	public String passportTypeNameVN;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}