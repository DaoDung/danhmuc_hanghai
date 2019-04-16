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

import vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryArrivalPurpose in entity cache.
 *
 * @author win_64
 * @see DmHistoryArrivalPurpose
 * @generated
 */
public class DmHistoryArrivalPurposeCacheModel implements CacheModel<DmHistoryArrivalPurpose>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", purposeCode=");
		sb.append(purposeCode);
		sb.append(", purposeName=");
		sb.append(purposeName);
		sb.append(", purposeNameVN=");
		sb.append(purposeNameVN);
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

	public DmHistoryArrivalPurpose toEntityModel() {
		DmHistoryArrivalPurposeImpl dmHistoryArrivalPurposeImpl = new DmHistoryArrivalPurposeImpl();

		dmHistoryArrivalPurposeImpl.setId(id);

		if (purposeCode == null) {
			dmHistoryArrivalPurposeImpl.setPurposeCode(StringPool.BLANK);
		}
		else {
			dmHistoryArrivalPurposeImpl.setPurposeCode(purposeCode);
		}

		if (purposeName == null) {
			dmHistoryArrivalPurposeImpl.setPurposeName(StringPool.BLANK);
		}
		else {
			dmHistoryArrivalPurposeImpl.setPurposeName(purposeName);
		}

		if (purposeNameVN == null) {
			dmHistoryArrivalPurposeImpl.setPurposeNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryArrivalPurposeImpl.setPurposeNameVN(purposeNameVN);
		}

		dmHistoryArrivalPurposeImpl.setIsDelete(isDelete);
		dmHistoryArrivalPurposeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryArrivalPurposeImpl.setModifiedDate(null);
		}
		else {
			dmHistoryArrivalPurposeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryArrivalPurposeImpl.setRequestedDate(null);
		}
		else {
			dmHistoryArrivalPurposeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryArrivalPurposeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryArrivalPurposeImpl.setSyncVersion(syncVersion);
		}

		dmHistoryArrivalPurposeImpl.resetOriginalValues();

		return dmHistoryArrivalPurposeImpl;
	}

	public int id;
	public String purposeCode;
	public String purposeName;
	public String purposeNameVN;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}