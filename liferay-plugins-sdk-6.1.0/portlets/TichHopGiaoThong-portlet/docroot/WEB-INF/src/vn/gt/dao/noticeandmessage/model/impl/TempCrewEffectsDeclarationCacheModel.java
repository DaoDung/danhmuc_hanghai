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

import vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempCrewEffectsDeclaration in entity cache.
 *
 * @author win_64
 * @see TempCrewEffectsDeclaration
 * @generated
 */
public class TempCrewEffectsDeclarationCacheModel implements CacheModel<TempCrewEffectsDeclaration>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

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
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", callsign=");
		sb.append(callsign);
		sb.append(", voyageNumber=");
		sb.append(voyageNumber);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", listCrewEffects=");
		sb.append(listCrewEffects);
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
		sb.append("}");

		return sb.toString();
	}

	public TempCrewEffectsDeclaration toEntityModel() {
		TempCrewEffectsDeclarationImpl tempCrewEffectsDeclarationImpl = new TempCrewEffectsDeclarationImpl();

		tempCrewEffectsDeclarationImpl.setId(id);

		if (requestCode == null) {
			tempCrewEffectsDeclarationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setRequestCode(requestCode);
		}

		tempCrewEffectsDeclarationImpl.setRequestState(requestState);
		tempCrewEffectsDeclarationImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempCrewEffectsDeclarationImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setUserCreated(userCreated);
		}

		if (nameOfShip == null) {
			tempCrewEffectsDeclarationImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setNameOfShip(nameOfShip);
		}

		if (imoNumber == null) {
			tempCrewEffectsDeclarationImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setImoNumber(imoNumber);
		}

		if (callsign == null) {
			tempCrewEffectsDeclarationImpl.setCallsign(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setCallsign(callsign);
		}

		if (voyageNumber == null) {
			tempCrewEffectsDeclarationImpl.setVoyageNumber(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setVoyageNumber(voyageNumber);
		}

		if (flagStateOfShip == null) {
			tempCrewEffectsDeclarationImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (nameOfMaster == null) {
			tempCrewEffectsDeclarationImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setNameOfMaster(nameOfMaster);
		}

		tempCrewEffectsDeclarationImpl.setListCrewEffects(listCrewEffects);

		if (signPlace == null) {
			tempCrewEffectsDeclarationImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempCrewEffectsDeclarationImpl.setSignDate(null);
		}
		else {
			tempCrewEffectsDeclarationImpl.setSignDate(new Date(signDate));
		}

		tempCrewEffectsDeclarationImpl.setMasterSigned(masterSigned);
		tempCrewEffectsDeclarationImpl.setMasterSignedImage(masterSignedImage);
		tempCrewEffectsDeclarationImpl.setAttachedFile(attachedFile);
		tempCrewEffectsDeclarationImpl.setDocumentYear(documentYear);

		tempCrewEffectsDeclarationImpl.resetOriginalValues();

		return tempCrewEffectsDeclarationImpl;
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public String userCreated;
	public String nameOfShip;
	public String imoNumber;
	public String callsign;
	public String voyageNumber;
	public String flagStateOfShip;
	public String nameOfMaster;
	public int listCrewEffects;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
	public int documentYear;
}