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

package vn.gt.dao.nhapcanh.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.nhapcanh.model.PassengerList;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing PassengerList in entity cache.
 *
 * @author win_64
 * @see PassengerList
 * @generated
 */
public class PassengerListCacheModel implements CacheModel<PassengerList>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", passengerCode=");
		sb.append(passengerCode);
		sb.append(", documentNo=");
		sb.append(documentNo);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", birthDay=");
		sb.append(birthDay);
		sb.append(", birthPlace=");
		sb.append(birthPlace);
		sb.append(", passportTypeCode=");
		sb.append(passportTypeCode);
		sb.append(", passPortNo=");
		sb.append(passPortNo);
		sb.append(", portCheckInCode=");
		sb.append(portCheckInCode);
		sb.append(", portCheckOutCode=");
		sb.append(portCheckOutCode);
		sb.append(", isTransit=");
		sb.append(isTransit);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append("}");

		return sb.toString();
	}

	public PassengerList toEntityModel() {
		PassengerListImpl passengerListImpl = new PassengerListImpl();

		passengerListImpl.setId(id);

		if (passengerCode == null) {
			passengerListImpl.setPassengerCode(StringPool.BLANK);
		}
		else {
			passengerListImpl.setPassengerCode(passengerCode);
		}

		if (documentNo == null) {
			passengerListImpl.setDocumentNo(StringPool.BLANK);
		}
		else {
			passengerListImpl.setDocumentNo(documentNo);
		}

		if (fullName == null) {
			passengerListImpl.setFullName(StringPool.BLANK);
		}
		else {
			passengerListImpl.setFullName(fullName);
		}

		if (stateCode == null) {
			passengerListImpl.setStateCode(StringPool.BLANK);
		}
		else {
			passengerListImpl.setStateCode(stateCode);
		}

		if (birthDay == Long.MIN_VALUE) {
			passengerListImpl.setBirthDay(null);
		}
		else {
			passengerListImpl.setBirthDay(new Date(birthDay));
		}

		if (birthPlace == null) {
			passengerListImpl.setBirthPlace(StringPool.BLANK);
		}
		else {
			passengerListImpl.setBirthPlace(birthPlace);
		}

		if (passportTypeCode == null) {
			passengerListImpl.setPassportTypeCode(StringPool.BLANK);
		}
		else {
			passengerListImpl.setPassportTypeCode(passportTypeCode);
		}

		if (passPortNo == null) {
			passengerListImpl.setPassPortNo(StringPool.BLANK);
		}
		else {
			passengerListImpl.setPassPortNo(passPortNo);
		}

		if (portCheckInCode == null) {
			passengerListImpl.setPortCheckInCode(StringPool.BLANK);
		}
		else {
			passengerListImpl.setPortCheckInCode(portCheckInCode);
		}

		if (portCheckOutCode == null) {
			passengerListImpl.setPortCheckOutCode(StringPool.BLANK);
		}
		else {
			passengerListImpl.setPortCheckOutCode(portCheckOutCode);
		}

		passengerListImpl.setIsTransit(isTransit);

		if (createDate == Long.MIN_VALUE) {
			passengerListImpl.setCreateDate(null);
		}
		else {
			passengerListImpl.setCreateDate(new Date(createDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			passengerListImpl.setModifyDate(null);
		}
		else {
			passengerListImpl.setModifyDate(new Date(modifyDate));
		}

		passengerListImpl.resetOriginalValues();

		return passengerListImpl;
	}

	public long id;
	public String passengerCode;
	public String documentNo;
	public String fullName;
	public String stateCode;
	public long birthDay;
	public String birthPlace;
	public String passportTypeCode;
	public String passPortNo;
	public String portCheckInCode;
	public String portCheckOutCode;
	public boolean isTransit;
	public long createDate;
	public long modifyDate;
}