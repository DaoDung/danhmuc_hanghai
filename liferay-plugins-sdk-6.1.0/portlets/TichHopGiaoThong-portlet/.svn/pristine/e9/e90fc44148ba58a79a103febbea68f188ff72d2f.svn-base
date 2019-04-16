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

import vn.gt.dao.danhmuc.model.DmSecurityLevel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmSecurityLevel in entity cache.
 *
 * @author win_64
 * @see DmSecurityLevel
 * @generated
 */
public class DmSecurityLevelCacheModel implements CacheModel<DmSecurityLevel>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", securityLevelCode=");
		sb.append(securityLevelCode);
		sb.append(", securityLevel=");
		sb.append(securityLevel);
		sb.append(", securityLevelName=");
		sb.append(securityLevelName);
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

	public DmSecurityLevel toEntityModel() {
		DmSecurityLevelImpl dmSecurityLevelImpl = new DmSecurityLevelImpl();

		dmSecurityLevelImpl.setId(id);

		if (securityLevelCode == null) {
			dmSecurityLevelImpl.setSecurityLevelCode(StringPool.BLANK);
		}
		else {
			dmSecurityLevelImpl.setSecurityLevelCode(securityLevelCode);
		}

		if (securityLevel == null) {
			dmSecurityLevelImpl.setSecurityLevel(StringPool.BLANK);
		}
		else {
			dmSecurityLevelImpl.setSecurityLevel(securityLevel);
		}

		if (securityLevelName == null) {
			dmSecurityLevelImpl.setSecurityLevelName(StringPool.BLANK);
		}
		else {
			dmSecurityLevelImpl.setSecurityLevelName(securityLevelName);
		}

		dmSecurityLevelImpl.setIsDelete(isDelete);
		dmSecurityLevelImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmSecurityLevelImpl.setModifiedDate(null);
		}
		else {
			dmSecurityLevelImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmSecurityLevelImpl.setRequestedDate(null);
		}
		else {
			dmSecurityLevelImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmSecurityLevelImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmSecurityLevelImpl.setSyncVersion(syncVersion);
		}

		dmSecurityLevelImpl.resetOriginalValues();

		return dmSecurityLevelImpl;
	}

	public int id;
	public String securityLevelCode;
	public String securityLevel;
	public String securityLevelName;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}