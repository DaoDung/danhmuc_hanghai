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

import vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempDeclarationForAnimalQuarantine in entity cache.
 *
 * @author win_64
 * @see TempDeclarationForAnimalQuarantine
 * @generated
 */
public class TempDeclarationForAnimalQuarantineCacheModel implements CacheModel<TempDeclarationForAnimalQuarantine>,
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
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", numberOfCrew=");
		sb.append(numberOfCrew);
		sb.append(", numberOfPassengers=");
		sb.append(numberOfPassengers);
		sb.append(", lastPortOfCallCode=");
		sb.append(lastPortOfCallCode);
		sb.append(", nextPortOfCallCode=");
		sb.append(nextPortOfCallCode);
		sb.append(", animalNameFirst=");
		sb.append(animalNameFirst);
		sb.append(", animalNameBetween=");
		sb.append(animalNameBetween);
		sb.append(", animalNameThis=");
		sb.append(animalNameThis);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
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

	public TempDeclarationForAnimalQuarantine toEntityModel() {
		TempDeclarationForAnimalQuarantineImpl tempDeclarationForAnimalQuarantineImpl =
			new TempDeclarationForAnimalQuarantineImpl();

		tempDeclarationForAnimalQuarantineImpl.setId(id);

		if (requestCode == null) {
			tempDeclarationForAnimalQuarantineImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setRequestCode(requestCode);
		}

		tempDeclarationForAnimalQuarantineImpl.setRequestState(requestState);
		tempDeclarationForAnimalQuarantineImpl.setDocumentName(documentName);
		tempDeclarationForAnimalQuarantineImpl.setDocumentYear(documentYear);

		if (userCreated == null) {
			tempDeclarationForAnimalQuarantineImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setUserCreated(userCreated);
		}

		if (nameOfShip == null) {
			tempDeclarationForAnimalQuarantineImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			tempDeclarationForAnimalQuarantineImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setFlagStateOfShip(flagStateOfShip);
		}

		tempDeclarationForAnimalQuarantineImpl.setNumberOfCrew(numberOfCrew);
		tempDeclarationForAnimalQuarantineImpl.setNumberOfPassengers(numberOfPassengers);

		if (lastPortOfCallCode == null) {
			tempDeclarationForAnimalQuarantineImpl.setLastPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setLastPortOfCallCode(lastPortOfCallCode);
		}

		if (nextPortOfCallCode == null) {
			tempDeclarationForAnimalQuarantineImpl.setNextPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setNextPortOfCallCode(nextPortOfCallCode);
		}

		if (animalNameFirst == null) {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameFirst(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameFirst(animalNameFirst);
		}

		if (animalNameBetween == null) {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameBetween(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameBetween(animalNameBetween);
		}

		if (animalNameThis == null) {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameThis(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameThis(animalNameThis);
		}

		if (nameOfMaster == null) {
			tempDeclarationForAnimalQuarantineImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setNameOfMaster(nameOfMaster);
		}

		if (signPlace == null) {
			tempDeclarationForAnimalQuarantineImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempDeclarationForAnimalQuarantineImpl.setSignDate(null);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setSignDate(new Date(
					signDate));
		}

		tempDeclarationForAnimalQuarantineImpl.setMasterSigned(masterSigned);
		tempDeclarationForAnimalQuarantineImpl.setMasterSignedImage(masterSignedImage);
		tempDeclarationForAnimalQuarantineImpl.setAttachedFile(attachedFile);

		tempDeclarationForAnimalQuarantineImpl.resetOriginalValues();

		return tempDeclarationForAnimalQuarantineImpl;
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public String userCreated;
	public String nameOfShip;
	public String flagStateOfShip;
	public int numberOfCrew;
	public int numberOfPassengers;
	public String lastPortOfCallCode;
	public String nextPortOfCallCode;
	public String animalNameFirst;
	public String animalNameBetween;
	public String animalNameThis;
	public String nameOfMaster;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
}