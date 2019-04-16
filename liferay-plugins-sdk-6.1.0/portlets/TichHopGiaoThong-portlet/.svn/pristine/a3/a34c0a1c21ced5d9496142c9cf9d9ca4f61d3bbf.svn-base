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

import vn.gt.dao.danhmuc.model.DmArrivalPurpose;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmArrivalPurpose in entity cache.
 *
 * @author win_64
 * @see DmArrivalPurpose
 * @generated
 */
public class DmArrivalPurposeCacheModel implements CacheModel<DmArrivalPurpose>,
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

	public DmArrivalPurpose toEntityModel() {
		DmArrivalPurposeImpl dmArrivalPurposeImpl = new DmArrivalPurposeImpl();

		dmArrivalPurposeImpl.setId(id);

		if (purposeCode == null) {
			dmArrivalPurposeImpl.setPurposeCode(StringPool.BLANK);
		}
		else {
			dmArrivalPurposeImpl.setPurposeCode(purposeCode);
		}

		if (purposeName == null) {
			dmArrivalPurposeImpl.setPurposeName(StringPool.BLANK);
		}
		else {
			dmArrivalPurposeImpl.setPurposeName(purposeName);
		}

		if (purposeNameVN == null) {
			dmArrivalPurposeImpl.setPurposeNameVN(StringPool.BLANK);
		}
		else {
			dmArrivalPurposeImpl.setPurposeNameVN(purposeNameVN);
		}

		dmArrivalPurposeImpl.setIsDelete(isDelete);
		dmArrivalPurposeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmArrivalPurposeImpl.setModifiedDate(null);
		}
		else {
			dmArrivalPurposeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmArrivalPurposeImpl.setRequestedDate(null);
		}
		else {
			dmArrivalPurposeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmArrivalPurposeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmArrivalPurposeImpl.setSyncVersion(syncVersion);
		}

		dmArrivalPurposeImpl.resetOriginalValues();

		return dmArrivalPurposeImpl;
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