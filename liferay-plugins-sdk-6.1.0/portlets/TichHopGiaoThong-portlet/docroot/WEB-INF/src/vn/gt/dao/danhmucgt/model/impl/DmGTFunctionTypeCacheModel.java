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

import vn.gt.dao.danhmucgt.model.DmGTFunctionType;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmGTFunctionType in entity cache.
 *
 * @author win_64
 * @see DmGTFunctionType
 * @generated
 */
public class DmGTFunctionTypeCacheModel implements CacheModel<DmGTFunctionType>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", functionTypeCode=");
		sb.append(functionTypeCode);
		sb.append(", functionTypeName=");
		sb.append(functionTypeName);
		sb.append(", functionTypeNameVN=");
		sb.append(functionTypeNameVN);
		sb.append(", functionTypeOrder=");
		sb.append(functionTypeOrder);
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

	public DmGTFunctionType toEntityModel() {
		DmGTFunctionTypeImpl dmGTFunctionTypeImpl = new DmGTFunctionTypeImpl();

		dmGTFunctionTypeImpl.setId(id);

		if (functionTypeCode == null) {
			dmGTFunctionTypeImpl.setFunctionTypeCode(StringPool.BLANK);
		}
		else {
			dmGTFunctionTypeImpl.setFunctionTypeCode(functionTypeCode);
		}

		if (functionTypeName == null) {
			dmGTFunctionTypeImpl.setFunctionTypeName(StringPool.BLANK);
		}
		else {
			dmGTFunctionTypeImpl.setFunctionTypeName(functionTypeName);
		}

		if (functionTypeNameVN == null) {
			dmGTFunctionTypeImpl.setFunctionTypeNameVN(StringPool.BLANK);
		}
		else {
			dmGTFunctionTypeImpl.setFunctionTypeNameVN(functionTypeNameVN);
		}

		dmGTFunctionTypeImpl.setFunctionTypeOrder(functionTypeOrder);
		dmGTFunctionTypeImpl.setIsDelete(isDelete);
		dmGTFunctionTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGTFunctionTypeImpl.setModifiedDate(null);
		}
		else {
			dmGTFunctionTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGTFunctionTypeImpl.setRequestedDate(null);
		}
		else {
			dmGTFunctionTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGTFunctionTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGTFunctionTypeImpl.setSyncVersion(syncVersion);
		}

		dmGTFunctionTypeImpl.resetOriginalValues();

		return dmGTFunctionTypeImpl;
	}

	public long id;
	public String functionTypeCode;
	public String functionTypeName;
	public String functionTypeNameVN;
	public int functionTypeOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}