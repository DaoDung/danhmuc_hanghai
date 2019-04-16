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

import vn.gt.dao.danhmucgt.model.DmGTBusinessType;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmGTBusinessType in entity cache.
 *
 * @author win_64
 * @see DmGTBusinessType
 * @generated
 */
public class DmGTBusinessTypeCacheModel implements CacheModel<DmGTBusinessType>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", businessTypeCode=");
		sb.append(businessTypeCode);
		sb.append(", businessTypeName=");
		sb.append(businessTypeName);
		sb.append(", businessTypeNameVN=");
		sb.append(businessTypeNameVN);
		sb.append(", businessTypeOrder=");
		sb.append(businessTypeOrder);
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
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	public DmGTBusinessType toEntityModel() {
		DmGTBusinessTypeImpl dmGTBusinessTypeImpl = new DmGTBusinessTypeImpl();

		dmGTBusinessTypeImpl.setId(id);
		dmGTBusinessTypeImpl.setBusinessTypeCode(businessTypeCode);

		if (businessTypeName == null) {
			dmGTBusinessTypeImpl.setBusinessTypeName(StringPool.BLANK);
		}
		else {
			dmGTBusinessTypeImpl.setBusinessTypeName(businessTypeName);
		}

		if (businessTypeNameVN == null) {
			dmGTBusinessTypeImpl.setBusinessTypeNameVN(StringPool.BLANK);
		}
		else {
			dmGTBusinessTypeImpl.setBusinessTypeNameVN(businessTypeNameVN);
		}

		dmGTBusinessTypeImpl.setBusinessTypeOrder(businessTypeOrder);
		dmGTBusinessTypeImpl.setIsDelete(isDelete);
		dmGTBusinessTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGTBusinessTypeImpl.setModifiedDate(null);
		}
		else {
			dmGTBusinessTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGTBusinessTypeImpl.setRequestedDate(null);
		}
		else {
			dmGTBusinessTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGTBusinessTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGTBusinessTypeImpl.setSyncVersion(syncVersion);
		}

		if (remarks == null) {
			dmGTBusinessTypeImpl.setRemarks(StringPool.BLANK);
		}
		else {
			dmGTBusinessTypeImpl.setRemarks(remarks);
		}

		dmGTBusinessTypeImpl.resetOriginalValues();

		return dmGTBusinessTypeImpl;
	}

	public long id;
	public int businessTypeCode;
	public String businessTypeName;
	public String businessTypeNameVN;
	public int businessTypeOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
	public String remarks;
}