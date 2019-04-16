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

import vn.gt.dao.danhmuc.model.DmHistoryPackage;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryPackage in entity cache.
 *
 * @author win_64
 * @see DmHistoryPackage
 * @generated
 */
public class DmHistoryPackageCacheModel implements CacheModel<DmHistoryPackage>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", packageCode=");
		sb.append(packageCode);
		sb.append(", packageName=");
		sb.append(packageName);
		sb.append(", packageNameVN=");
		sb.append(packageNameVN);
		sb.append(", packageOrder=");
		sb.append(packageOrder);
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

	public DmHistoryPackage toEntityModel() {
		DmHistoryPackageImpl dmHistoryPackageImpl = new DmHistoryPackageImpl();

		dmHistoryPackageImpl.setId(id);

		if (packageCode == null) {
			dmHistoryPackageImpl.setPackageCode(StringPool.BLANK);
		}
		else {
			dmHistoryPackageImpl.setPackageCode(packageCode);
		}

		if (packageName == null) {
			dmHistoryPackageImpl.setPackageName(StringPool.BLANK);
		}
		else {
			dmHistoryPackageImpl.setPackageName(packageName);
		}

		if (packageNameVN == null) {
			dmHistoryPackageImpl.setPackageNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryPackageImpl.setPackageNameVN(packageNameVN);
		}

		dmHistoryPackageImpl.setPackageOrder(packageOrder);
		dmHistoryPackageImpl.setIsDelete(isDelete);
		dmHistoryPackageImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryPackageImpl.setModifiedDate(null);
		}
		else {
			dmHistoryPackageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryPackageImpl.setRequestedDate(null);
		}
		else {
			dmHistoryPackageImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryPackageImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryPackageImpl.setSyncVersion(syncVersion);
		}

		dmHistoryPackageImpl.resetOriginalValues();

		return dmHistoryPackageImpl;
	}

	public int id;
	public String packageCode;
	public String packageName;
	public String packageNameVN;
	public int packageOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}