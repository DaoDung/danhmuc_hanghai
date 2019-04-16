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

import vn.gt.dao.danhmuc.model.DmPassportType;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmPassportType in entity cache.
 *
 * @author win_64
 * @see DmPassportType
 * @generated
 */
public class DmPassportTypeCacheModel implements CacheModel<DmPassportType>,
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

	public DmPassportType toEntityModel() {
		DmPassportTypeImpl dmPassportTypeImpl = new DmPassportTypeImpl();

		dmPassportTypeImpl.setId(id);

		if (passportTypeCode == null) {
			dmPassportTypeImpl.setPassportTypeCode(StringPool.BLANK);
		}
		else {
			dmPassportTypeImpl.setPassportTypeCode(passportTypeCode);
		}

		if (passportType == null) {
			dmPassportTypeImpl.setPassportType(StringPool.BLANK);
		}
		else {
			dmPassportTypeImpl.setPassportType(passportType);
		}

		if (passportTypeName == null) {
			dmPassportTypeImpl.setPassportTypeName(StringPool.BLANK);
		}
		else {
			dmPassportTypeImpl.setPassportTypeName(passportTypeName);
		}

		if (passportTypeNameVN == null) {
			dmPassportTypeImpl.setPassportTypeNameVN(StringPool.BLANK);
		}
		else {
			dmPassportTypeImpl.setPassportTypeNameVN(passportTypeNameVN);
		}

		dmPassportTypeImpl.setIsDelete(isDelete);
		dmPassportTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmPassportTypeImpl.setModifiedDate(null);
		}
		else {
			dmPassportTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmPassportTypeImpl.setRequestedDate(null);
		}
		else {
			dmPassportTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmPassportTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmPassportTypeImpl.setSyncVersion(syncVersion);
		}

		dmPassportTypeImpl.resetOriginalValues();

		return dmPassportTypeImpl;
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