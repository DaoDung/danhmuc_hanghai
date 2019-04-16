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

import vn.gt.dao.danhmuc.model.DmHistoryPort;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryPort in entity cache.
 *
 * @author win_64
 * @see DmHistoryPort
 * @generated
 */
public class DmHistoryPortCacheModel implements CacheModel<DmHistoryPort>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", loCode=");
		sb.append(loCode);
		sb.append(", portName=");
		sb.append(portName);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", fullNameVN=");
		sb.append(fullNameVN);
		sb.append(", portType=");
		sb.append(portType);
		sb.append(", portOrder=");
		sb.append(portOrder);
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

	public DmHistoryPort toEntityModel() {
		DmHistoryPortImpl dmHistoryPortImpl = new DmHistoryPortImpl();

		dmHistoryPortImpl.setId(id);

		if (portCode == null) {
			dmHistoryPortImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setPortCode(portCode);
		}

		if (loCode == null) {
			dmHistoryPortImpl.setLoCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setLoCode(loCode);
		}

		if (portName == null) {
			dmHistoryPortImpl.setPortName(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setPortName(portName);
		}

		if (fullName == null) {
			dmHistoryPortImpl.setFullName(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setFullName(fullName);
		}

		if (fullNameVN == null) {
			dmHistoryPortImpl.setFullNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setFullNameVN(fullNameVN);
		}

		if (portType == null) {
			dmHistoryPortImpl.setPortType(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setPortType(portType);
		}

		dmHistoryPortImpl.setPortOrder(portOrder);

		if (address == null) {
			dmHistoryPortImpl.setAddress(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setAddress(address);
		}

		if (addressVN == null) {
			dmHistoryPortImpl.setAddressVN(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setAddressVN(addressVN);
		}

		if (stateCode == null) {
			dmHistoryPortImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setStateCode(stateCode);
		}

		if (citycode == null) {
			dmHistoryPortImpl.setCitycode(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setCitycode(citycode);
		}

		dmHistoryPortImpl.setIsDelete(isDelete);
		dmHistoryPortImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryPortImpl.setModifiedDate(null);
		}
		else {
			dmHistoryPortImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryPortImpl.setRequestedDate(null);
		}
		else {
			dmHistoryPortImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryPortImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryPortImpl.setSyncVersion(syncVersion);
		}

		dmHistoryPortImpl.resetOriginalValues();

		return dmHistoryPortImpl;
	}

	public int id;
	public String portCode;
	public String loCode;
	public String portName;
	public String fullName;
	public String fullNameVN;
	public String portType;
	public int portOrder;
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