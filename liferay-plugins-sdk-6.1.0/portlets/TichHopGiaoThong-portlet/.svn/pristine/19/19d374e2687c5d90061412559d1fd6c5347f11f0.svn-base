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

import vn.gt.dao.danhmuc.model.DmHistorySecurityLevel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistorySecurityLevel in entity cache.
 *
 * @author win_64
 * @see DmHistorySecurityLevel
 * @generated
 */
public class DmHistorySecurityLevelCacheModel implements CacheModel<DmHistorySecurityLevel>,
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

	public DmHistorySecurityLevel toEntityModel() {
		DmHistorySecurityLevelImpl dmHistorySecurityLevelImpl = new DmHistorySecurityLevelImpl();

		dmHistorySecurityLevelImpl.setId(id);

		if (securityLevelCode == null) {
			dmHistorySecurityLevelImpl.setSecurityLevelCode(StringPool.BLANK);
		}
		else {
			dmHistorySecurityLevelImpl.setSecurityLevelCode(securityLevelCode);
		}

		if (securityLevel == null) {
			dmHistorySecurityLevelImpl.setSecurityLevel(StringPool.BLANK);
		}
		else {
			dmHistorySecurityLevelImpl.setSecurityLevel(securityLevel);
		}

		if (securityLevelName == null) {
			dmHistorySecurityLevelImpl.setSecurityLevelName(StringPool.BLANK);
		}
		else {
			dmHistorySecurityLevelImpl.setSecurityLevelName(securityLevelName);
		}

		dmHistorySecurityLevelImpl.setIsDelete(isDelete);
		dmHistorySecurityLevelImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistorySecurityLevelImpl.setModifiedDate(null);
		}
		else {
			dmHistorySecurityLevelImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistorySecurityLevelImpl.setRequestedDate(null);
		}
		else {
			dmHistorySecurityLevelImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistorySecurityLevelImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistorySecurityLevelImpl.setSyncVersion(syncVersion);
		}

		dmHistorySecurityLevelImpl.resetOriginalValues();

		return dmHistorySecurityLevelImpl;
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