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

import vn.gt.dao.danhmuc.model.DmMaritime;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmMaritime in entity cache.
 *
 * @author win_64
 * @see DmMaritime
 * @generated
 */
public class DmMaritimeCacheModel implements CacheModel<DmMaritime>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
		sb.append(", maritimeReference=");
		sb.append(maritimeReference);
		sb.append(", maritimeOrder=");
		sb.append(maritimeOrder);
		sb.append(", maritimeName=");
		sb.append(maritimeName);
		sb.append(", maritimeNameVN=");
		sb.append(maritimeNameVN);
		sb.append(", address=");
		sb.append(address);
		sb.append(", addressVN=");
		sb.append(addressVN);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", citycode=");
		sb.append(citycode);
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

	public DmMaritime toEntityModel() {
		DmMaritimeImpl dmMaritimeImpl = new DmMaritimeImpl();

		dmMaritimeImpl.setId(id);

		if (maritimeCode == null) {
			dmMaritimeImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setMaritimeCode(maritimeCode);
		}

		if (maritimeReference == null) {
			dmMaritimeImpl.setMaritimeReference(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setMaritimeReference(maritimeReference);
		}

		dmMaritimeImpl.setMaritimeOrder(maritimeOrder);

		if (maritimeName == null) {
			dmMaritimeImpl.setMaritimeName(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setMaritimeName(maritimeName);
		}

		if (maritimeNameVN == null) {
			dmMaritimeImpl.setMaritimeNameVN(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setMaritimeNameVN(maritimeNameVN);
		}

		if (address == null) {
			dmMaritimeImpl.setAddress(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setAddress(address);
		}

		if (addressVN == null) {
			dmMaritimeImpl.setAddressVN(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setAddressVN(addressVN);
		}

		if (stateCode == null) {
			dmMaritimeImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setStateCode(stateCode);
		}

		if (citycode == null) {
			dmMaritimeImpl.setCitycode(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setCitycode(citycode);
		}

		dmMaritimeImpl.setIsDelete(isDelete);
		dmMaritimeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmMaritimeImpl.setModifiedDate(null);
		}
		else {
			dmMaritimeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmMaritimeImpl.setRequestedDate(null);
		}
		else {
			dmMaritimeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmMaritimeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmMaritimeImpl.setSyncVersion(syncVersion);
		}

		dmMaritimeImpl.resetOriginalValues();

		return dmMaritimeImpl;
	}

	public int id;
	public String maritimeCode;
	public String maritimeReference;
	public int maritimeOrder;
	public String maritimeName;
	public String maritimeNameVN;
	public String address;
	public String addressVN;
	public String stateCode;
	public String citycode;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}