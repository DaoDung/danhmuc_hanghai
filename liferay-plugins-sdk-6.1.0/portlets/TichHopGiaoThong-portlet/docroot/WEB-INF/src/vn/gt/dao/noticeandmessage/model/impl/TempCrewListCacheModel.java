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

import vn.gt.dao.noticeandmessage.model.TempCrewList;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempCrewList in entity cache.
 *
 * @author win_64
 * @see TempCrewList
 * @generated
 */
public class TempCrewListCacheModel implements CacheModel<TempCrewList>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", isArrival=");
		sb.append(isArrival);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", voyageNumber=");
		sb.append(voyageNumber);
		sb.append(", portOfArrivalCode=");
		sb.append(portOfArrivalCode);
		sb.append(", dateOfArrival=");
		sb.append(dateOfArrival);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", lastPortOfCallCode=");
		sb.append(lastPortOfCallCode);
		sb.append(", crewList=");
		sb.append(crewList);
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
		sb.append("}");

		return sb.toString();
	}

	public TempCrewList toEntityModel() {
		TempCrewListImpl tempCrewListImpl = new TempCrewListImpl();

		tempCrewListImpl.setId(id);

		if (requestCode == null) {
			tempCrewListImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setRequestCode(requestCode);
		}

		tempCrewListImpl.setRequestState(requestState);
		tempCrewListImpl.setDocumentName(documentName);
		tempCrewListImpl.setDocumentYear(documentYear);

		if (userCreated == null) {
			tempCrewListImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setUserCreated(userCreated);
		}

		tempCrewListImpl.setIsArrival(isArrival);

		if (nameOfShip == null) {
			tempCrewListImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setNameOfShip(nameOfShip);
		}

		if (imoNumber == null) {
			tempCrewListImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setImoNumber(imoNumber);
		}

		if (callSign == null) {
			tempCrewListImpl.setCallSign(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setCallSign(callSign);
		}

		if (voyageNumber == null) {
			tempCrewListImpl.setVoyageNumber(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setVoyageNumber(voyageNumber);
		}

		if (portOfArrivalCode == null) {
			tempCrewListImpl.setPortOfArrivalCode(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setPortOfArrivalCode(portOfArrivalCode);
		}

		if (dateOfArrival == Long.MIN_VALUE) {
			tempCrewListImpl.setDateOfArrival(null);
		}
		else {
			tempCrewListImpl.setDateOfArrival(new Date(dateOfArrival));
		}

		if (flagStateOfShip == null) {
			tempCrewListImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (lastPortOfCallCode == null) {
			tempCrewListImpl.setLastPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setLastPortOfCallCode(lastPortOfCallCode);
		}

		tempCrewListImpl.setCrewList(crewList);

		if (signPlace == null) {
			tempCrewListImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempCrewListImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempCrewListImpl.setSignDate(null);
		}
		else {
			tempCrewListImpl.setSignDate(new Date(signDate));
		}

		tempCrewListImpl.setMasterSigned(masterSigned);
		tempCrewListImpl.setMasterSignedImage(masterSignedImage);
		tempCrewListImpl.setAttachedFile(attachedFile);

		tempCrewListImpl.resetOriginalValues();

		return tempCrewListImpl;
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public String userCreated;
	public int isArrival;
	public String nameOfShip;
	public String imoNumber;
	public String callSign;
	public String voyageNumber;
	public String portOfArrivalCode;
	public long dateOfArrival;
	public String flagStateOfShip;
	public String lastPortOfCallCode;
	public int crewList;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
}