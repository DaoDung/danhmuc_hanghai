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

import vn.gt.dao.noticeandmessage.model.IssuePortClearance;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing IssuePortClearance in entity cache.
 *
 * @author win_64
 * @see IssuePortClearance
 * @generated
 */
public class IssuePortClearanceCacheModel implements CacheModel<IssuePortClearance>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(105);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", numberPortClearance=");
		sb.append(numberPortClearance);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", portofAuthority=");
		sb.append(portofAuthority);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", numberOfCrews=");
		sb.append(numberOfCrews);
		sb.append(", numberOfPassengers=");
		sb.append(numberOfPassengers);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", cargo=");
		sb.append(cargo);
		sb.append(", volumeCargo=");
		sb.append(volumeCargo);
		sb.append(", cargoUnit=");
		sb.append(cargoUnit);
		sb.append(", cargoDescription=");
		sb.append(cargoDescription);
		sb.append(", transitCargo=");
		sb.append(transitCargo);
		sb.append(", volumeTransitCargo=");
		sb.append(volumeTransitCargo);
		sb.append(", transitCargoUnit=");
		sb.append(transitCargoUnit);
		sb.append(", timeOfDeparture=");
		sb.append(timeOfDeparture);
		sb.append(", nextProvinceCode=");
		sb.append(nextProvinceCode);
		sb.append(", nextPortOfCallCode=");
		sb.append(nextPortOfCallCode);
		sb.append(", maritimePortCode=");
		sb.append(maritimePortCode);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
		sb.append(", validUntil=");
		sb.append(validUntil);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", directorOfMaritime=");
		sb.append(directorOfMaritime);
		sb.append(", certificateNo=");
		sb.append(certificateNo);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", gt=");
		sb.append(gt);
		sb.append(", dwt=");
		sb.append(dwt);
		sb.append(", nextMaritimePortCode=");
		sb.append(nextMaritimePortCode);
		sb.append(", nextPortRegionCode=");
		sb.append(nextPortRegionCode);
		sb.append(", nextPortHarbourCode=");
		sb.append(nextPortHarbourCode);
		sb.append(", nextPortWharfCode=");
		sb.append(nextPortWharfCode);
		sb.append(", versionNo=");
		sb.append(versionNo);
		sb.append(", isApproval=");
		sb.append(isApproval);
		sb.append(", approvalDate=");
		sb.append(approvalDate);
		sb.append(", approvalName=");
		sb.append(approvalName);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", isCancel=");
		sb.append(isCancel);
		sb.append(", cancelDate=");
		sb.append(cancelDate);
		sb.append(", cancelName=");
		sb.append(cancelName);
		sb.append(", cancelNote=");
		sb.append(cancelNote);
		sb.append(", representative=");
		sb.append(representative);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", stampStatus=");
		sb.append(stampStatus);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append("}");

		return sb.toString();
	}

	public IssuePortClearance toEntityModel() {
		IssuePortClearanceImpl issuePortClearanceImpl = new IssuePortClearanceImpl();

		issuePortClearanceImpl.setId(id);

		if (requestCode == null) {
			issuePortClearanceImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setRequestCode(requestCode);
		}

		if (numberPortClearance == null) {
			issuePortClearanceImpl.setNumberPortClearance(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNumberPortClearance(numberPortClearance);
		}

		issuePortClearanceImpl.setDocumentName(documentName);
		issuePortClearanceImpl.setDocumentYear(documentYear);

		if (portofAuthority == null) {
			issuePortClearanceImpl.setPortofAuthority(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setPortofAuthority(portofAuthority);
		}

		if (nameOfShip == null) {
			issuePortClearanceImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			issuePortClearanceImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setFlagStateOfShip(flagStateOfShip);
		}

		issuePortClearanceImpl.setNumberOfCrews(numberOfCrews);
		issuePortClearanceImpl.setNumberOfPassengers(numberOfPassengers);

		if (callSign == null) {
			issuePortClearanceImpl.setCallSign(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCallSign(callSign);
		}

		if (nameOfMaster == null) {
			issuePortClearanceImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNameOfMaster(nameOfMaster);
		}

		if (cargo == null) {
			issuePortClearanceImpl.setCargo(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCargo(cargo);
		}

		issuePortClearanceImpl.setVolumeCargo(volumeCargo);

		if (cargoUnit == null) {
			issuePortClearanceImpl.setCargoUnit(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCargoUnit(cargoUnit);
		}

		if (cargoDescription == null) {
			issuePortClearanceImpl.setCargoDescription(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCargoDescription(cargoDescription);
		}

		if (transitCargo == null) {
			issuePortClearanceImpl.setTransitCargo(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setTransitCargo(transitCargo);
		}

		issuePortClearanceImpl.setVolumeTransitCargo(volumeTransitCargo);

		if (transitCargoUnit == null) {
			issuePortClearanceImpl.setTransitCargoUnit(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setTransitCargoUnit(transitCargoUnit);
		}

		if (timeOfDeparture == Long.MIN_VALUE) {
			issuePortClearanceImpl.setTimeOfDeparture(null);
		}
		else {
			issuePortClearanceImpl.setTimeOfDeparture(new Date(timeOfDeparture));
		}

		if (nextProvinceCode == null) {
			issuePortClearanceImpl.setNextProvinceCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNextProvinceCode(nextProvinceCode);
		}

		if (nextPortOfCallCode == null) {
			issuePortClearanceImpl.setNextPortOfCallCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNextPortOfCallCode(nextPortOfCallCode);
		}

		if (maritimePortCode == null) {
			issuePortClearanceImpl.setMaritimePortCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setMaritimePortCode(maritimePortCode);
		}

		if (portCode == null) {
			issuePortClearanceImpl.setPortCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setPortCode(portCode);
		}

		if (portHarbourCode == null) {
			issuePortClearanceImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setPortHarbourCode(portHarbourCode);
		}

		if (validUntil == Long.MIN_VALUE) {
			issuePortClearanceImpl.setValidUntil(null);
		}
		else {
			issuePortClearanceImpl.setValidUntil(new Date(validUntil));
		}

		if (issueDate == Long.MIN_VALUE) {
			issuePortClearanceImpl.setIssueDate(null);
		}
		else {
			issuePortClearanceImpl.setIssueDate(new Date(issueDate));
		}

		if (directorOfMaritime == null) {
			issuePortClearanceImpl.setDirectorOfMaritime(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setDirectorOfMaritime(directorOfMaritime);
		}

		if (certificateNo == null) {
			issuePortClearanceImpl.setCertificateNo(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCertificateNo(certificateNo);
		}

		issuePortClearanceImpl.setRequestState(requestState);
		issuePortClearanceImpl.setGt(gt);
		issuePortClearanceImpl.setDwt(dwt);

		if (nextMaritimePortCode == null) {
			issuePortClearanceImpl.setNextMaritimePortCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNextMaritimePortCode(nextMaritimePortCode);
		}

		if (nextPortRegionCode == null) {
			issuePortClearanceImpl.setNextPortRegionCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNextPortRegionCode(nextPortRegionCode);
		}

		if (nextPortHarbourCode == null) {
			issuePortClearanceImpl.setNextPortHarbourCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNextPortHarbourCode(nextPortHarbourCode);
		}

		if (nextPortWharfCode == null) {
			issuePortClearanceImpl.setNextPortWharfCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNextPortWharfCode(nextPortWharfCode);
		}

		if (versionNo == null) {
			issuePortClearanceImpl.setVersionNo(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setVersionNo(versionNo);
		}

		issuePortClearanceImpl.setIsApproval(isApproval);

		if (approvalDate == Long.MIN_VALUE) {
			issuePortClearanceImpl.setApprovalDate(null);
		}
		else {
			issuePortClearanceImpl.setApprovalDate(new Date(approvalDate));
		}

		if (approvalName == null) {
			issuePortClearanceImpl.setApprovalName(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setApprovalName(approvalName);
		}

		if (remarks == null) {
			issuePortClearanceImpl.setRemarks(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setRemarks(remarks);
		}

		issuePortClearanceImpl.setIsCancel(isCancel);

		if (cancelDate == Long.MIN_VALUE) {
			issuePortClearanceImpl.setCancelDate(null);
		}
		else {
			issuePortClearanceImpl.setCancelDate(new Date(cancelDate));
		}

		if (cancelName == null) {
			issuePortClearanceImpl.setCancelName(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCancelName(cancelName);
		}

		if (cancelNote == null) {
			issuePortClearanceImpl.setCancelNote(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCancelNote(cancelNote);
		}

		if (representative == null) {
			issuePortClearanceImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setRepresentative(representative);
		}

		if (signDate == Long.MIN_VALUE) {
			issuePortClearanceImpl.setSignDate(null);
		}
		else {
			issuePortClearanceImpl.setSignDate(new Date(signDate));
		}

		if (signName == null) {
			issuePortClearanceImpl.setSignName(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setSignName(signName);
		}

		if (signTitle == null) {
			issuePortClearanceImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			issuePortClearanceImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setSignPlace(signPlace);
		}

		issuePortClearanceImpl.setStampStatus(stampStatus);
		issuePortClearanceImpl.setAttachedFile(attachedFile);

		issuePortClearanceImpl.resetOriginalValues();

		return issuePortClearanceImpl;
	}

	public long id;
	public String requestCode;
	public String numberPortClearance;
	public long documentName;
	public int documentYear;
	public String portofAuthority;
	public String nameOfShip;
	public String flagStateOfShip;
	public int numberOfCrews;
	public int numberOfPassengers;
	public String callSign;
	public String nameOfMaster;
	public String cargo;
	public double volumeCargo;
	public String cargoUnit;
	public String cargoDescription;
	public String transitCargo;
	public double volumeTransitCargo;
	public String transitCargoUnit;
	public long timeOfDeparture;
	public String nextProvinceCode;
	public String nextPortOfCallCode;
	public String maritimePortCode;
	public String portCode;
	public String portHarbourCode;
	public long validUntil;
	public long issueDate;
	public String directorOfMaritime;
	public String certificateNo;
	public int requestState;
	public double gt;
	public double dwt;
	public String nextMaritimePortCode;
	public String nextPortRegionCode;
	public String nextPortHarbourCode;
	public String nextPortWharfCode;
	public String versionNo;
	public int isApproval;
	public long approvalDate;
	public String approvalName;
	public String remarks;
	public int isCancel;
	public long cancelDate;
	public String cancelName;
	public String cancelNote;
	public String representative;
	public long signDate;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long stampStatus;
	public long attachedFile;
}