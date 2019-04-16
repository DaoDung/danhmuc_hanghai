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

package vn.gt.dao.noticeandmessage.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.noticeandmessage.model.TempPassengerDetails;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempPassengerDetails in entity cache.
 *
 * @author win_64
 * @see TempPassengerDetails
 * @generated
 */
public class TempPassengerDetailsCacheModel implements CacheModel<TempPassengerDetails>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", passengerCode=");
		sb.append(passengerCode);
		sb.append(", familyName=");
		sb.append(familyName);
		sb.append(", givenName=");
		sb.append(givenName);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", birthDay=");
		sb.append(birthDay);
		sb.append(", birthPlace=");
		sb.append(birthPlace);
		sb.append(", typeOfIdentity=");
		sb.append(typeOfIdentity);
		sb.append(", passportExpiredDate=");
		sb.append(passportExpiredDate);
		sb.append(", serialNumberOfIdentity=");
		sb.append(serialNumberOfIdentity);
		sb.append(", portOfEmbarkation=");
		sb.append(portOfEmbarkation);
		sb.append(", portOfDisembarkation=");
		sb.append(portOfDisembarkation);
		sb.append(", isTransit=");
		sb.append(isTransit);
		sb.append("}");

		return sb.toString();
	}

	public TempPassengerDetails toEntityModel() {
		TempPassengerDetailsImpl tempPassengerDetailsImpl = new TempPassengerDetailsImpl();

		tempPassengerDetailsImpl.setId(id);

		if (requestCode == null) {
			tempPassengerDetailsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setRequestCode(requestCode);
		}

		if (passengerCode == null) {
			tempPassengerDetailsImpl.setPassengerCode(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setPassengerCode(passengerCode);
		}

		if (familyName == null) {
			tempPassengerDetailsImpl.setFamilyName(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setFamilyName(familyName);
		}

		if (givenName == null) {
			tempPassengerDetailsImpl.setGivenName(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setGivenName(givenName);
		}

		if (nationality == null) {
			tempPassengerDetailsImpl.setNationality(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setNationality(nationality);
		}

		if (birthDay == Long.MIN_VALUE) {
			tempPassengerDetailsImpl.setBirthDay(null);
		}
		else {
			tempPassengerDetailsImpl.setBirthDay(new Date(birthDay));
		}

		if (birthPlace == null) {
			tempPassengerDetailsImpl.setBirthPlace(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setBirthPlace(birthPlace);
		}

		if (typeOfIdentity == null) {
			tempPassengerDetailsImpl.setTypeOfIdentity(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setTypeOfIdentity(typeOfIdentity);
		}

		if (passportExpiredDate == Long.MIN_VALUE) {
			tempPassengerDetailsImpl.setPassportExpiredDate(null);
		}
		else {
			tempPassengerDetailsImpl.setPassportExpiredDate(new Date(
					passportExpiredDate));
		}

		if (serialNumberOfIdentity == null) {
			tempPassengerDetailsImpl.setSerialNumberOfIdentity(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setSerialNumberOfIdentity(serialNumberOfIdentity);
		}

		if (portOfEmbarkation == null) {
			tempPassengerDetailsImpl.setPortOfEmbarkation(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setPortOfEmbarkation(portOfEmbarkation);
		}

		if (portOfDisembarkation == null) {
			tempPassengerDetailsImpl.setPortOfDisembarkation(StringPool.BLANK);
		}
		else {
			tempPassengerDetailsImpl.setPortOfDisembarkation(portOfDisembarkation);
		}

		tempPassengerDetailsImpl.setIsTransit(isTransit);

		tempPassengerDetailsImpl.resetOriginalValues();

		return tempPassengerDetailsImpl;
	}

	public long id;
	public String requestCode;
	public String passengerCode;
	public String familyName;
	public String givenName;
	public String nationality;
	public long birthDay;
	public String birthPlace;
	public String typeOfIdentity;
	public long passportExpiredDate;
	public String serialNumberOfIdentity;
	public String portOfEmbarkation;
	public String portOfDisembarkation;
	public int isTransit;
}