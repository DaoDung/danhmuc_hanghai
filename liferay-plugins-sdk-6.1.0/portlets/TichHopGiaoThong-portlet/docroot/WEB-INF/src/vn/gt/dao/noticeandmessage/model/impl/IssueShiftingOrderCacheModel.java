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

import vn.gt.dao.noticeandmessage.model.IssueShiftingOrder;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing IssueShiftingOrder in entity cache.
 *
 * @author win_64
 * @see IssueShiftingOrder
 * @generated
 */
public class IssueShiftingOrderCacheModel implements CacheModel<IssueShiftingOrder>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(105);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", numberShiftingOrder=");
		sb.append(numberShiftingOrder);
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
		sb.append(", anchoringPortCode=");
		sb.append(anchoringPortCode);
		sb.append(", anchoringPortWharfCode=");
		sb.append(anchoringPortWharfCode);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
		sb.append(", shiftingPortWharfCode=");
		sb.append(shiftingPortWharfCode);
		sb.append(", shiftingDate=");
		sb.append(shiftingDate);
		sb.append(", reasonToShift=");
		sb.append(reasonToShift);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", directorOfMaritime=");
		sb.append(directorOfMaritime);
		sb.append(", certificateNo=");
		sb.append(certificateNo);
		sb.append(", requestState=");
		sb.append(requestState);
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
		sb.append(", digitalAttachedFile=");
		sb.append(digitalAttachedFile);
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
		sb.append(", shownDraftxF=");
		sb.append(shownDraftxF);
		sb.append(", unitShownDraftxF=");
		sb.append(unitShownDraftxF);
		sb.append(", shownDraftxA=");
		sb.append(shownDraftxA);
		sb.append(", unitShownDraftxA=");
		sb.append(unitShownDraftxA);
		sb.append(", loa=");
		sb.append(loa);
		sb.append(", loaUnit=");
		sb.append(loaUnit);
		sb.append(", dwt=");
		sb.append(dwt);
		sb.append(", dwtUnit=");
		sb.append(dwtUnit);
		sb.append(", tugBoat=");
		sb.append(tugBoat);
		sb.append(", from=");
		sb.append(from);
		sb.append(", to=");
		sb.append(to);
		sb.append(", taxCodeOfShipownersAgents=");
		sb.append(taxCodeOfShipownersAgents);
		sb.append(", nameOfShipownersAgents=");
		sb.append(nameOfShipownersAgents);
		sb.append(", shipAgencyAddress=");
		sb.append(shipAgencyAddress);
		sb.append(", shipAgencyPhone=");
		sb.append(shipAgencyPhone);
		sb.append(", shipAgencyFax=");
		sb.append(shipAgencyFax);
		sb.append(", shipAgencyEmail=");
		sb.append(shipAgencyEmail);
		sb.append("}");

		return sb.toString();
	}

	public IssueShiftingOrder toEntityModel() {
		IssueShiftingOrderImpl issueShiftingOrderImpl = new IssueShiftingOrderImpl();

		issueShiftingOrderImpl.setId(id);

		if (requestCode == null) {
			issueShiftingOrderImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setRequestCode(requestCode);
		}

		if (numberShiftingOrder == null) {
			issueShiftingOrderImpl.setNumberShiftingOrder(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setNumberShiftingOrder(numberShiftingOrder);
		}

		issueShiftingOrderImpl.setDocumentName(documentName);
		issueShiftingOrderImpl.setDocumentYear(documentYear);

		if (portofAuthority == null) {
			issueShiftingOrderImpl.setPortofAuthority(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setPortofAuthority(portofAuthority);
		}

		if (nameOfShip == null) {
			issueShiftingOrderImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			issueShiftingOrderImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (anchoringPortCode == null) {
			issueShiftingOrderImpl.setAnchoringPortCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setAnchoringPortCode(anchoringPortCode);
		}

		if (anchoringPortWharfCode == null) {
			issueShiftingOrderImpl.setAnchoringPortWharfCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setAnchoringPortWharfCode(anchoringPortWharfCode);
		}

		if (portHarbourCode == null) {
			issueShiftingOrderImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setPortHarbourCode(portHarbourCode);
		}

		if (shiftingPortWharfCode == null) {
			issueShiftingOrderImpl.setShiftingPortWharfCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setShiftingPortWharfCode(shiftingPortWharfCode);
		}

		if (shiftingDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setShiftingDate(null);
		}
		else {
			issueShiftingOrderImpl.setShiftingDate(new Date(shiftingDate));
		}

		if (reasonToShift == null) {
			issueShiftingOrderImpl.setReasonToShift(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setReasonToShift(reasonToShift);
		}

		if (issueDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setIssueDate(null);
		}
		else {
			issueShiftingOrderImpl.setIssueDate(new Date(issueDate));
		}

		if (directorOfMaritime == null) {
			issueShiftingOrderImpl.setDirectorOfMaritime(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setDirectorOfMaritime(directorOfMaritime);
		}

		if (certificateNo == null) {
			issueShiftingOrderImpl.setCertificateNo(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setCertificateNo(certificateNo);
		}

		issueShiftingOrderImpl.setRequestState(requestState);

		if (versionNo == null) {
			issueShiftingOrderImpl.setVersionNo(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setVersionNo(versionNo);
		}

		issueShiftingOrderImpl.setIsApproval(isApproval);

		if (approvalDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setApprovalDate(null);
		}
		else {
			issueShiftingOrderImpl.setApprovalDate(new Date(approvalDate));
		}

		if (approvalName == null) {
			issueShiftingOrderImpl.setApprovalName(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setApprovalName(approvalName);
		}

		if (remarks == null) {
			issueShiftingOrderImpl.setRemarks(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setRemarks(remarks);
		}

		issueShiftingOrderImpl.setIsCancel(isCancel);

		if (cancelDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setCancelDate(null);
		}
		else {
			issueShiftingOrderImpl.setCancelDate(new Date(cancelDate));
		}

		if (cancelName == null) {
			issueShiftingOrderImpl.setCancelName(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setCancelName(cancelName);
		}

		if (cancelNote == null) {
			issueShiftingOrderImpl.setCancelNote(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setCancelNote(cancelNote);
		}

		if (representative == null) {
			issueShiftingOrderImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setRepresentative(representative);
		}

		issueShiftingOrderImpl.setDigitalAttachedFile(digitalAttachedFile);

		if (signDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setSignDate(null);
		}
		else {
			issueShiftingOrderImpl.setSignDate(new Date(signDate));
		}

		if (signName == null) {
			issueShiftingOrderImpl.setSignName(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setSignName(signName);
		}

		if (signTitle == null) {
			issueShiftingOrderImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			issueShiftingOrderImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setSignPlace(signPlace);
		}

		issueShiftingOrderImpl.setStampStatus(stampStatus);
		issueShiftingOrderImpl.setAttachedFile(attachedFile);
		issueShiftingOrderImpl.setShownDraftxF(shownDraftxF);

		if (unitShownDraftxF == null) {
			issueShiftingOrderImpl.setUnitShownDraftxF(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setUnitShownDraftxF(unitShownDraftxF);
		}

		issueShiftingOrderImpl.setShownDraftxA(shownDraftxA);

		if (unitShownDraftxA == null) {
			issueShiftingOrderImpl.setUnitShownDraftxA(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setUnitShownDraftxA(unitShownDraftxA);
		}

		issueShiftingOrderImpl.setLoa(loa);

		if (loaUnit == null) {
			issueShiftingOrderImpl.setLoaUnit(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setLoaUnit(loaUnit);
		}

		issueShiftingOrderImpl.setDwt(dwt);

		if (dwtUnit == null) {
			issueShiftingOrderImpl.setDwtUnit(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setDwtUnit(dwtUnit);
		}

		if (tugBoat == null) {
			issueShiftingOrderImpl.setTugBoat(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setTugBoat(tugBoat);
		}

		if (from == null) {
			issueShiftingOrderImpl.setFrom(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setFrom(from);
		}

		if (to == null) {
			issueShiftingOrderImpl.setTo(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setTo(to);
		}

		if (taxCodeOfShipownersAgents == null) {
			issueShiftingOrderImpl.setTaxCodeOfShipownersAgents(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setTaxCodeOfShipownersAgents(taxCodeOfShipownersAgents);
		}

		if (nameOfShipownersAgents == null) {
			issueShiftingOrderImpl.setNameOfShipownersAgents(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setNameOfShipownersAgents(nameOfShipownersAgents);
		}

		if (shipAgencyAddress == null) {
			issueShiftingOrderImpl.setShipAgencyAddress(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setShipAgencyAddress(shipAgencyAddress);
		}

		if (shipAgencyPhone == null) {
			issueShiftingOrderImpl.setShipAgencyPhone(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setShipAgencyPhone(shipAgencyPhone);
		}

		if (shipAgencyFax == null) {
			issueShiftingOrderImpl.setShipAgencyFax(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setShipAgencyFax(shipAgencyFax);
		}

		if (shipAgencyEmail == null) {
			issueShiftingOrderImpl.setShipAgencyEmail(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setShipAgencyEmail(shipAgencyEmail);
		}

		issueShiftingOrderImpl.resetOriginalValues();

		return issueShiftingOrderImpl;
	}

	public long id;
	public String requestCode;
	public String numberShiftingOrder;
	public long documentName;
	public int documentYear;
	public String portofAuthority;
	public String nameOfShip;
	public String flagStateOfShip;
	public String anchoringPortCode;
	public String anchoringPortWharfCode;
	public String portHarbourCode;
	public String shiftingPortWharfCode;
	public long shiftingDate;
	public String reasonToShift;
	public long issueDate;
	public String directorOfMaritime;
	public String certificateNo;
	public int requestState;
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
	public long digitalAttachedFile;
	public long signDate;
	public String signName;
	public String signTitle;
	public String signPlace;
	public int stampStatus;
	public long attachedFile;
	public double shownDraftxF;
	public String unitShownDraftxF;
	public double shownDraftxA;
	public String unitShownDraftxA;
	public double loa;
	public String loaUnit;
	public double dwt;
	public String dwtUnit;
	public String tugBoat;
	public String from;
	public String to;
	public String taxCodeOfShipownersAgents;
	public String nameOfShipownersAgents;
	public String shipAgencyAddress;
	public String shipAgencyPhone;
	public String shipAgencyFax;
	public String shipAgencyEmail;
}