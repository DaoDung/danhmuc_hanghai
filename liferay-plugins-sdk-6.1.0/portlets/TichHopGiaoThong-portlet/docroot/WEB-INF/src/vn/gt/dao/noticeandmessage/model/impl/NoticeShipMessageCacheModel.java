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

import vn.gt.dao.noticeandmessage.model.NoticeShipMessage;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing NoticeShipMessage in entity cache.
 *
 * @author win_64
 * @see NoticeShipMessage
 * @generated
 */
public class NoticeShipMessageCacheModel implements CacheModel<NoticeShipMessage>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(id);
		sb.append(", noticeShipCode=");
		sb.append(noticeShipCode);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", confirmTime=");
		sb.append(confirmTime);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", arrivalDate=");
		sb.append(arrivalDate);
		sb.append(", arrivalPortCode=");
		sb.append(arrivalPortCode);
		sb.append(", portGoingToCode=");
		sb.append(portGoingToCode);
		sb.append(", nameAndAddOfShipOwners=");
		sb.append(nameAndAddOfShipOwners);
		sb.append(", clearanceHeight=");
		sb.append(clearanceHeight);
		sb.append(", shownDraft=");
		sb.append(shownDraft);
		sb.append(", dwt=");
		sb.append(dwt);
		sb.append(", shipAgencyCode=");
		sb.append(shipAgencyCode);
		sb.append(", purposeCode=");
		sb.append(purposeCode);
		sb.append(", crewNumber=");
		sb.append(crewNumber);
		sb.append(", passengerNumber=");
		sb.append(passengerNumber);
		sb.append(", quantityAndTypeOfCargo=");
		sb.append(quantityAndTypeOfCargo);
		sb.append(", otherPersons=");
		sb.append(otherPersons);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	public NoticeShipMessage toEntityModel() {
		NoticeShipMessageImpl noticeShipMessageImpl = new NoticeShipMessageImpl();

		noticeShipMessageImpl.setId(id);

		if (noticeShipCode == null) {
			noticeShipMessageImpl.setNoticeShipCode(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setNoticeShipCode(noticeShipCode);
		}

		noticeShipMessageImpl.setDocumentName(documentName);

		if (userCreated == null) {
			noticeShipMessageImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setUserCreated(userCreated);
		}

		noticeShipMessageImpl.setConfirmTime(confirmTime);

		if (callSign == null) {
			noticeShipMessageImpl.setCallSign(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setCallSign(callSign);
		}

		if (arrivalDate == Long.MIN_VALUE) {
			noticeShipMessageImpl.setArrivalDate(null);
		}
		else {
			noticeShipMessageImpl.setArrivalDate(new Date(arrivalDate));
		}

		if (arrivalPortCode == null) {
			noticeShipMessageImpl.setArrivalPortCode(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setArrivalPortCode(arrivalPortCode);
		}

		if (portGoingToCode == null) {
			noticeShipMessageImpl.setPortGoingToCode(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setPortGoingToCode(portGoingToCode);
		}

		if (nameAndAddOfShipOwners == null) {
			noticeShipMessageImpl.setNameAndAddOfShipOwners(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setNameAndAddOfShipOwners(nameAndAddOfShipOwners);
		}

		noticeShipMessageImpl.setClearanceHeight(clearanceHeight);
		noticeShipMessageImpl.setShownDraft(shownDraft);
		noticeShipMessageImpl.setDwt(dwt);

		if (shipAgencyCode == null) {
			noticeShipMessageImpl.setShipAgencyCode(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setShipAgencyCode(shipAgencyCode);
		}

		noticeShipMessageImpl.setPurposeCode(purposeCode);
		noticeShipMessageImpl.setCrewNumber(crewNumber);
		noticeShipMessageImpl.setPassengerNumber(passengerNumber);

		if (quantityAndTypeOfCargo == null) {
			noticeShipMessageImpl.setQuantityAndTypeOfCargo(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setQuantityAndTypeOfCargo(quantityAndTypeOfCargo);
		}

		noticeShipMessageImpl.setOtherPersons(otherPersons);

		if (remarks == null) {
			noticeShipMessageImpl.setRemarks(StringPool.BLANK);
		}
		else {
			noticeShipMessageImpl.setRemarks(remarks);
		}

		noticeShipMessageImpl.resetOriginalValues();

		return noticeShipMessageImpl;
	}

	public long id;
	public String noticeShipCode;
	public long documentName;
	public String userCreated;
	public int confirmTime;
	public String callSign;
	public long arrivalDate;
	public String arrivalPortCode;
	public String portGoingToCode;
	public String nameAndAddOfShipOwners;
	public long clearanceHeight;
	public long shownDraft;
	public long dwt;
	public String shipAgencyCode;
	public int purposeCode;
	public long crewNumber;
	public long passengerNumber;
	public String quantityAndTypeOfCargo;
	public int otherPersons;
	public String remarks;
}