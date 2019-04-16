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

import vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempDeclarationOfHealth in entity cache.
 *
 * @author win_64
 * @see TempDeclarationOfHealth
 * @generated
 */
public class TempDeclarationOfHealthCacheModel implements CacheModel<TempDeclarationOfHealth>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

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
		sb.append(", submittedPortCode=");
		sb.append(submittedPortCode);
		sb.append(", dateSubmitted=");
		sb.append(dateSubmitted);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", registration=");
		sb.append(registration);
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", arrivingFrom=");
		sb.append(arrivingFrom);
		sb.append(", sailingTo=");
		sb.append(sailingTo);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", masterName=");
		sb.append(masterName);
		sb.append(", grossTonnage=");
		sb.append(grossTonnage);
		sb.append(", grossTonnageUnit=");
		sb.append(grossTonnageUnit);
		sb.append(", tonnage=");
		sb.append(tonnage);
		sb.append(", tonnageUnit=");
		sb.append(tonnageUnit);
		sb.append(", certificatecarried=");
		sb.append(certificatecarried);
		sb.append(", issuedAt=");
		sb.append(issuedAt);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", reInspectionrequired=");
		sb.append(reInspectionrequired);
		sb.append(", isShipVisitedWHO=");
		sb.append(isShipVisitedWHO);
		sb.append(", visitedWHOPortCode=");
		sb.append(visitedWHOPortCode);
		sb.append(", dateOfVisitedWHO=");
		sb.append(dateOfVisitedWHO);
		sb.append(", listPortName=");
		sb.append(listPortName);
		sb.append(", doctorName=");
		sb.append(doctorName);
		sb.append(", doctorSigndate=");
		sb.append(doctorSigndate);
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

	public TempDeclarationOfHealth toEntityModel() {
		TempDeclarationOfHealthImpl tempDeclarationOfHealthImpl = new TempDeclarationOfHealthImpl();

		tempDeclarationOfHealthImpl.setId(id);

		if (requestCode == null) {
			tempDeclarationOfHealthImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setRequestCode(requestCode);
		}

		tempDeclarationOfHealthImpl.setRequestState(requestState);
		tempDeclarationOfHealthImpl.setDocumentName(documentName);
		tempDeclarationOfHealthImpl.setDocumentYear(documentYear);

		if (userCreated == null) {
			tempDeclarationOfHealthImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setUserCreated(userCreated);
		}

		if (submittedPortCode == null) {
			tempDeclarationOfHealthImpl.setSubmittedPortCode(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setSubmittedPortCode(submittedPortCode);
		}

		if (dateSubmitted == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setDateSubmitted(null);
		}
		else {
			tempDeclarationOfHealthImpl.setDateSubmitted(new Date(dateSubmitted));
		}

		if (nameOfShip == null) {
			tempDeclarationOfHealthImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setNameOfShip(nameOfShip);
		}

		if (registration == null) {
			tempDeclarationOfHealthImpl.setRegistration(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setRegistration(registration);
		}

		if (imoNumber == null) {
			tempDeclarationOfHealthImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setImoNumber(imoNumber);
		}

		if (arrivingFrom == null) {
			tempDeclarationOfHealthImpl.setArrivingFrom(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setArrivingFrom(arrivingFrom);
		}

		if (sailingTo == null) {
			tempDeclarationOfHealthImpl.setSailingTo(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setSailingTo(sailingTo);
		}

		if (nationality == null) {
			tempDeclarationOfHealthImpl.setNationality(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setNationality(nationality);
		}

		if (masterName == null) {
			tempDeclarationOfHealthImpl.setMasterName(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setMasterName(masterName);
		}

		tempDeclarationOfHealthImpl.setGrossTonnage(grossTonnage);

		if (grossTonnageUnit == null) {
			tempDeclarationOfHealthImpl.setGrossTonnageUnit(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setGrossTonnageUnit(grossTonnageUnit);
		}

		tempDeclarationOfHealthImpl.setTonnage(tonnage);

		if (tonnageUnit == null) {
			tempDeclarationOfHealthImpl.setTonnageUnit(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setTonnageUnit(tonnageUnit);
		}

		tempDeclarationOfHealthImpl.setCertificatecarried(certificatecarried);

		if (issuedAt == null) {
			tempDeclarationOfHealthImpl.setIssuedAt(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setIssuedAt(issuedAt);
		}

		if (issueDate == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setIssueDate(null);
		}
		else {
			tempDeclarationOfHealthImpl.setIssueDate(new Date(issueDate));
		}

		tempDeclarationOfHealthImpl.setReInspectionrequired(reInspectionrequired);
		tempDeclarationOfHealthImpl.setIsShipVisitedWHO(isShipVisitedWHO);

		if (visitedWHOPortCode == null) {
			tempDeclarationOfHealthImpl.setVisitedWHOPortCode(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setVisitedWHOPortCode(visitedWHOPortCode);
		}

		if (dateOfVisitedWHO == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setDateOfVisitedWHO(null);
		}
		else {
			tempDeclarationOfHealthImpl.setDateOfVisitedWHO(new Date(
					dateOfVisitedWHO));
		}

		if (listPortName == null) {
			tempDeclarationOfHealthImpl.setListPortName(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setListPortName(listPortName);
		}

		if (doctorName == null) {
			tempDeclarationOfHealthImpl.setDoctorName(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setDoctorName(doctorName);
		}

		if (doctorSigndate == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setDoctorSigndate(null);
		}
		else {
			tempDeclarationOfHealthImpl.setDoctorSigndate(new Date(
					doctorSigndate));
		}

		if (signPlace == null) {
			tempDeclarationOfHealthImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setSignDate(null);
		}
		else {
			tempDeclarationOfHealthImpl.setSignDate(new Date(signDate));
		}

		tempDeclarationOfHealthImpl.setMasterSigned(masterSigned);
		tempDeclarationOfHealthImpl.setMasterSignedImage(masterSignedImage);
		tempDeclarationOfHealthImpl.setAttachedFile(attachedFile);

		tempDeclarationOfHealthImpl.resetOriginalValues();

		return tempDeclarationOfHealthImpl;
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public String userCreated;
	public String submittedPortCode;
	public long dateSubmitted;
	public String nameOfShip;
	public String registration;
	public String imoNumber;
	public String arrivingFrom;
	public String sailingTo;
	public String nationality;
	public String masterName;
	public double grossTonnage;
	public String grossTonnageUnit;
	public double tonnage;
	public String tonnageUnit;
	public int certificatecarried;
	public String issuedAt;
	public long issueDate;
	public int reInspectionrequired;
	public int isShipVisitedWHO;
	public String visitedWHOPortCode;
	public long dateOfVisitedWHO;
	public String listPortName;
	public String doctorName;
	public long doctorSigndate;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
}