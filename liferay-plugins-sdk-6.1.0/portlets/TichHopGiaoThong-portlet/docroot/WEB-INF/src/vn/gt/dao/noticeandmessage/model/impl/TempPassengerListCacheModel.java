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

import vn.gt.dao.noticeandmessage.model.TempPassengerList;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempPassengerList in entity cache.
 *
 * @author win_64
 * @see TempPassengerList
 * @generated
 */
public class TempPassengerListCacheModel implements CacheModel<TempPassengerList>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", isArrival=");
		sb.append(isArrival);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", portOfArrivalCode=");
		sb.append(portOfArrivalCode);
		sb.append(", dateOfArrival=");
		sb.append(dateOfArrival);
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", voyageNumber=");
		sb.append(voyageNumber);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", listPassengers=");
		sb.append(listPassengers);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", masterSigned=");
		sb.append(masterSigned);
		sb.append(", masterSignedImage=");
		sb.append(masterSignedImage);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", NumberOfLeftPassengers=");
		sb.append(NumberOfLeftPassengers);
		sb.append(", NumberOfVNmeses=");
		sb.append(NumberOfVNmeses);
		sb.append(", NumberOfForeigners=");
		sb.append(NumberOfForeigners);
		sb.append(", TotalPassengers=");
		sb.append(TotalPassengers);
		sb.append("}");

		return sb.toString();
	}

	public TempPassengerList toEntityModel() {
		TempPassengerListImpl tempPassengerListImpl = new TempPassengerListImpl();

		tempPassengerListImpl.setId(id);

		if (requestCode == null) {
			tempPassengerListImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setRequestCode(requestCode);
		}

		tempPassengerListImpl.setRequestState(requestState);
		tempPassengerListImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempPassengerListImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setUserCreated(userCreated);
		}

		tempPassengerListImpl.setIsArrival(isArrival);

		if (nameOfShip == null) {
			tempPassengerListImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setNameOfShip(nameOfShip);
		}

		if (portOfArrivalCode == null) {
			tempPassengerListImpl.setPortOfArrivalCode(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setPortOfArrivalCode(portOfArrivalCode);
		}

		if (dateOfArrival == Long.MIN_VALUE) {
			tempPassengerListImpl.setDateOfArrival(null);
		}
		else {
			tempPassengerListImpl.setDateOfArrival(new Date(dateOfArrival));
		}

		if (imoNumber == null) {
			tempPassengerListImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setImoNumber(imoNumber);
		}

		if (callSign == null) {
			tempPassengerListImpl.setCallSign(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setCallSign(callSign);
		}

		if (voyageNumber == null) {
			tempPassengerListImpl.setVoyageNumber(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setVoyageNumber(voyageNumber);
		}

		if (flagStateOfShip == null) {
			tempPassengerListImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setFlagStateOfShip(flagStateOfShip);
		}

		tempPassengerListImpl.setListPassengers(listPassengers);

		if (signPlace == null) {
			tempPassengerListImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempPassengerListImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempPassengerListImpl.setSignDate(null);
		}
		else {
			tempPassengerListImpl.setSignDate(new Date(signDate));
		}

		tempPassengerListImpl.setMasterSigned(masterSigned);
		tempPassengerListImpl.setMasterSignedImage(masterSignedImage);
		tempPassengerListImpl.setAttachedFile(attachedFile);
		tempPassengerListImpl.setDocumentYear(documentYear);
		tempPassengerListImpl.setNumberOfLeftPassengers(NumberOfLeftPassengers);
		tempPassengerListImpl.setNumberOfVNmeses(NumberOfVNmeses);
		tempPassengerListImpl.setNumberOfForeigners(NumberOfForeigners);
		tempPassengerListImpl.setTotalPassengers(TotalPassengers);

		tempPassengerListImpl.resetOriginalValues();

		return tempPassengerListImpl;
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public String userCreated;
	public int isArrival;
	public String nameOfShip;
	public String portOfArrivalCode;
	public long dateOfArrival;
	public String imoNumber;
	public String callSign;
	public String voyageNumber;
	public String flagStateOfShip;
	public int listPassengers;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
	public int documentYear;
	public int NumberOfLeftPassengers;
	public int NumberOfVNmeses;
	public int NumberOfForeigners;
	public int TotalPassengers;
}