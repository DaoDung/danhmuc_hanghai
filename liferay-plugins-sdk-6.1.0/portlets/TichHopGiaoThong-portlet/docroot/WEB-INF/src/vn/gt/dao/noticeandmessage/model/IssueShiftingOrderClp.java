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

package vn.gt.dao.noticeandmessage.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class IssueShiftingOrderClp extends BaseModelImpl<IssueShiftingOrder>
	implements IssueShiftingOrder {
	public IssueShiftingOrderClp() {
	}

	public Class<?> getModelClass() {
		return IssueShiftingOrder.class;
	}

	public String getModelClassName() {
		return IssueShiftingOrder.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getRequestCode() {
		return _requestCode;
	}

	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	public String getNumberShiftingOrder() {
		return _numberShiftingOrder;
	}

	public void setNumberShiftingOrder(String numberShiftingOrder) {
		_numberShiftingOrder = numberShiftingOrder;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getPortofAuthority() {
		return _portofAuthority;
	}

	public void setPortofAuthority(String portofAuthority) {
		_portofAuthority = portofAuthority;
	}

	public String getNameOfShip() {
		return _nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	public String getAnchoringPortCode() {
		return _anchoringPortCode;
	}

	public void setAnchoringPortCode(String anchoringPortCode) {
		_anchoringPortCode = anchoringPortCode;
	}

	public String getAnchoringPortWharfCode() {
		return _anchoringPortWharfCode;
	}

	public void setAnchoringPortWharfCode(String anchoringPortWharfCode) {
		_anchoringPortWharfCode = anchoringPortWharfCode;
	}

	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;
	}

	public String getShiftingPortWharfCode() {
		return _shiftingPortWharfCode;
	}

	public void setShiftingPortWharfCode(String shiftingPortWharfCode) {
		_shiftingPortWharfCode = shiftingPortWharfCode;
	}

	public Date getShiftingDate() {
		return _shiftingDate;
	}

	public void setShiftingDate(Date shiftingDate) {
		_shiftingDate = shiftingDate;
	}

	public String getReasonToShift() {
		return _reasonToShift;
	}

	public void setReasonToShift(String reasonToShift) {
		_reasonToShift = reasonToShift;
	}

	public Date getIssueDate() {
		return _issueDate;
	}

	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	public String getDirectorOfMaritime() {
		return _directorOfMaritime;
	}

	public void setDirectorOfMaritime(String directorOfMaritime) {
		_directorOfMaritime = directorOfMaritime;
	}

	public String getCertificateNo() {
		return _certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		_certificateNo = certificateNo;
	}

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
	}

	public String getVersionNo() {
		return _versionNo;
	}

	public void setVersionNo(String versionNo) {
		_versionNo = versionNo;
	}

	public int getIsApproval() {
		return _isApproval;
	}

	public void setIsApproval(int isApproval) {
		_isApproval = isApproval;
	}

	public Date getApprovalDate() {
		return _approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		_approvalDate = approvalDate;
	}

	public String getApprovalName() {
		return _approvalName;
	}

	public void setApprovalName(String approvalName) {
		_approvalName = approvalName;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public int getIsCancel() {
		return _isCancel;
	}

	public void setIsCancel(int isCancel) {
		_isCancel = isCancel;
	}

	public Date getCancelDate() {
		return _cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		_cancelDate = cancelDate;
	}

	public String getCancelName() {
		return _cancelName;
	}

	public void setCancelName(String cancelName) {
		_cancelName = cancelName;
	}

	public String getCancelNote() {
		return _cancelNote;
	}

	public void setCancelNote(String cancelNote) {
		_cancelNote = cancelNote;
	}

	public String getRepresentative() {
		return _representative;
	}

	public void setRepresentative(String representative) {
		_representative = representative;
	}

	public long getDigitalAttachedFile() {
		return _digitalAttachedFile;
	}

	public void setDigitalAttachedFile(long digitalAttachedFile) {
		_digitalAttachedFile = digitalAttachedFile;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public String getSignName() {
		return _signName;
	}

	public void setSignName(String signName) {
		_signName = signName;
	}

	public String getSignTitle() {
		return _signTitle;
	}

	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public int getStampStatus() {
		return _stampStatus;
	}

	public void setStampStatus(int stampStatus) {
		_stampStatus = stampStatus;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public double getShownDraftxF() {
		return _shownDraftxF;
	}

	public void setShownDraftxF(double shownDraftxF) {
		_shownDraftxF = shownDraftxF;
	}

	public String getUnitShownDraftxF() {
		return _unitShownDraftxF;
	}

	public void setUnitShownDraftxF(String unitShownDraftxF) {
		_unitShownDraftxF = unitShownDraftxF;
	}

	public double getShownDraftxA() {
		return _shownDraftxA;
	}

	public void setShownDraftxA(double shownDraftxA) {
		_shownDraftxA = shownDraftxA;
	}

	public String getUnitShownDraftxA() {
		return _unitShownDraftxA;
	}

	public void setUnitShownDraftxA(String unitShownDraftxA) {
		_unitShownDraftxA = unitShownDraftxA;
	}

	public double getLoa() {
		return _loa;
	}

	public void setLoa(double loa) {
		_loa = loa;
	}

	public String getLoaUnit() {
		return _loaUnit;
	}

	public void setLoaUnit(String loaUnit) {
		_loaUnit = loaUnit;
	}

	public double getDwt() {
		return _dwt;
	}

	public void setDwt(double dwt) {
		_dwt = dwt;
	}

	public String getDwtUnit() {
		return _dwtUnit;
	}

	public void setDwtUnit(String dwtUnit) {
		_dwtUnit = dwtUnit;
	}

	public String getTugBoat() {
		return _tugBoat;
	}

	public void setTugBoat(String tugBoat) {
		_tugBoat = tugBoat;
	}

	public String getFrom() {
		return _from;
	}

	public void setFrom(String from) {
		_from = from;
	}

	public String getTo() {
		return _to;
	}

	public void setTo(String to) {
		_to = to;
	}

	public String getTaxCodeOfShipownersAgents() {
		return _taxCodeOfShipownersAgents;
	}

	public void setTaxCodeOfShipownersAgents(String taxCodeOfShipownersAgents) {
		_taxCodeOfShipownersAgents = taxCodeOfShipownersAgents;
	}

	public String getNameOfShipownersAgents() {
		return _nameOfShipownersAgents;
	}

	public void setNameOfShipownersAgents(String nameOfShipownersAgents) {
		_nameOfShipownersAgents = nameOfShipownersAgents;
	}

	public String getShipAgencyAddress() {
		return _shipAgencyAddress;
	}

	public void setShipAgencyAddress(String shipAgencyAddress) {
		_shipAgencyAddress = shipAgencyAddress;
	}

	public String getShipAgencyPhone() {
		return _shipAgencyPhone;
	}

	public void setShipAgencyPhone(String shipAgencyPhone) {
		_shipAgencyPhone = shipAgencyPhone;
	}

	public String getShipAgencyFax() {
		return _shipAgencyFax;
	}

	public void setShipAgencyFax(String shipAgencyFax) {
		_shipAgencyFax = shipAgencyFax;
	}

	public String getShipAgencyEmail() {
		return _shipAgencyEmail;
	}

	public void setShipAgencyEmail(String shipAgencyEmail) {
		_shipAgencyEmail = shipAgencyEmail;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			IssueShiftingOrderLocalServiceUtil.addIssueShiftingOrder(this);
		}
		else {
			IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(this);
		}
	}

	@Override
	public IssueShiftingOrder toEscapedModel() {
		return (IssueShiftingOrder)Proxy.newProxyInstance(IssueShiftingOrder.class.getClassLoader(),
			new Class[] { IssueShiftingOrder.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssueShiftingOrderClp clone = new IssueShiftingOrderClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setNumberShiftingOrder(getNumberShiftingOrder());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setPortofAuthority(getPortofAuthority());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setAnchoringPortCode(getAnchoringPortCode());
		clone.setAnchoringPortWharfCode(getAnchoringPortWharfCode());
		clone.setPortHarbourCode(getPortHarbourCode());
		clone.setShiftingPortWharfCode(getShiftingPortWharfCode());
		clone.setShiftingDate(getShiftingDate());
		clone.setReasonToShift(getReasonToShift());
		clone.setIssueDate(getIssueDate());
		clone.setDirectorOfMaritime(getDirectorOfMaritime());
		clone.setCertificateNo(getCertificateNo());
		clone.setRequestState(getRequestState());
		clone.setVersionNo(getVersionNo());
		clone.setIsApproval(getIsApproval());
		clone.setApprovalDate(getApprovalDate());
		clone.setApprovalName(getApprovalName());
		clone.setRemarks(getRemarks());
		clone.setIsCancel(getIsCancel());
		clone.setCancelDate(getCancelDate());
		clone.setCancelName(getCancelName());
		clone.setCancelNote(getCancelNote());
		clone.setRepresentative(getRepresentative());
		clone.setDigitalAttachedFile(getDigitalAttachedFile());
		clone.setSignDate(getSignDate());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setStampStatus(getStampStatus());
		clone.setAttachedFile(getAttachedFile());
		clone.setShownDraftxF(getShownDraftxF());
		clone.setUnitShownDraftxF(getUnitShownDraftxF());
		clone.setShownDraftxA(getShownDraftxA());
		clone.setUnitShownDraftxA(getUnitShownDraftxA());
		clone.setLoa(getLoa());
		clone.setLoaUnit(getLoaUnit());
		clone.setDwt(getDwt());
		clone.setDwtUnit(getDwtUnit());
		clone.setTugBoat(getTugBoat());
		clone.setFrom(getFrom());
		clone.setTo(getTo());
		clone.setTaxCodeOfShipownersAgents(getTaxCodeOfShipownersAgents());
		clone.setNameOfShipownersAgents(getNameOfShipownersAgents());
		clone.setShipAgencyAddress(getShipAgencyAddress());
		clone.setShipAgencyPhone(getShipAgencyPhone());
		clone.setShipAgencyFax(getShipAgencyFax());
		clone.setShipAgencyEmail(getShipAgencyEmail());

		return clone;
	}

	public int compareTo(IssueShiftingOrder issueShiftingOrder) {
		int value = 0;

		if (getId() < issueShiftingOrder.getId()) {
			value = -1;
		}
		else if (getId() > issueShiftingOrder.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		IssueShiftingOrderClp issueShiftingOrder = null;

		try {
			issueShiftingOrder = (IssueShiftingOrderClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = issueShiftingOrder.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(105);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", numberShiftingOrder=");
		sb.append(getNumberShiftingOrder());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", portofAuthority=");
		sb.append(getPortofAuthority());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", anchoringPortCode=");
		sb.append(getAnchoringPortCode());
		sb.append(", anchoringPortWharfCode=");
		sb.append(getAnchoringPortWharfCode());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", shiftingPortWharfCode=");
		sb.append(getShiftingPortWharfCode());
		sb.append(", shiftingDate=");
		sb.append(getShiftingDate());
		sb.append(", reasonToShift=");
		sb.append(getReasonToShift());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append(", directorOfMaritime=");
		sb.append(getDirectorOfMaritime());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", versionNo=");
		sb.append(getVersionNo());
		sb.append(", isApproval=");
		sb.append(getIsApproval());
		sb.append(", approvalDate=");
		sb.append(getApprovalDate());
		sb.append(", approvalName=");
		sb.append(getApprovalName());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", isCancel=");
		sb.append(getIsCancel());
		sb.append(", cancelDate=");
		sb.append(getCancelDate());
		sb.append(", cancelName=");
		sb.append(getCancelName());
		sb.append(", cancelNote=");
		sb.append(getCancelNote());
		sb.append(", representative=");
		sb.append(getRepresentative());
		sb.append(", digitalAttachedFile=");
		sb.append(getDigitalAttachedFile());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", stampStatus=");
		sb.append(getStampStatus());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", shownDraftxF=");
		sb.append(getShownDraftxF());
		sb.append(", unitShownDraftxF=");
		sb.append(getUnitShownDraftxF());
		sb.append(", shownDraftxA=");
		sb.append(getShownDraftxA());
		sb.append(", unitShownDraftxA=");
		sb.append(getUnitShownDraftxA());
		sb.append(", loa=");
		sb.append(getLoa());
		sb.append(", loaUnit=");
		sb.append(getLoaUnit());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", dwtUnit=");
		sb.append(getDwtUnit());
		sb.append(", tugBoat=");
		sb.append(getTugBoat());
		sb.append(", from=");
		sb.append(getFrom());
		sb.append(", to=");
		sb.append(getTo());
		sb.append(", taxCodeOfShipownersAgents=");
		sb.append(getTaxCodeOfShipownersAgents());
		sb.append(", nameOfShipownersAgents=");
		sb.append(getNameOfShipownersAgents());
		sb.append(", shipAgencyAddress=");
		sb.append(getShipAgencyAddress());
		sb.append(", shipAgencyPhone=");
		sb.append(getShipAgencyPhone());
		sb.append(", shipAgencyFax=");
		sb.append(getShipAgencyFax());
		sb.append(", shipAgencyEmail=");
		sb.append(getShipAgencyEmail());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(160);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.IssueShiftingOrder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberShiftingOrder</column-name><column-value><![CDATA[");
		sb.append(getNumberShiftingOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portofAuthority</column-name><column-value><![CDATA[");
		sb.append(getPortofAuthority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anchoringPortCode</column-name><column-value><![CDATA[");
		sb.append(getAnchoringPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anchoringPortWharfCode</column-name><column-value><![CDATA[");
		sb.append(getAnchoringPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shiftingPortWharfCode</column-name><column-value><![CDATA[");
		sb.append(getShiftingPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shiftingDate</column-name><column-value><![CDATA[");
		sb.append(getShiftingDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reasonToShift</column-name><column-value><![CDATA[");
		sb.append(getReasonToShift());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueDate</column-name><column-value><![CDATA[");
		sb.append(getIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>directorOfMaritime</column-name><column-value><![CDATA[");
		sb.append(getDirectorOfMaritime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNo</column-name><column-value><![CDATA[");
		sb.append(getCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionNo</column-name><column-value><![CDATA[");
		sb.append(getVersionNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isApproval</column-name><column-value><![CDATA[");
		sb.append(getIsApproval());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalDate</column-name><column-value><![CDATA[");
		sb.append(getApprovalDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalName</column-name><column-value><![CDATA[");
		sb.append(getApprovalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isCancel</column-name><column-value><![CDATA[");
		sb.append(getIsCancel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelDate</column-name><column-value><![CDATA[");
		sb.append(getCancelDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelName</column-name><column-value><![CDATA[");
		sb.append(getCancelName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelNote</column-name><column-value><![CDATA[");
		sb.append(getCancelNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representative</column-name><column-value><![CDATA[");
		sb.append(getRepresentative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>digitalAttachedFile</column-name><column-value><![CDATA[");
		sb.append(getDigitalAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signName</column-name><column-value><![CDATA[");
		sb.append(getSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signTitle</column-name><column-value><![CDATA[");
		sb.append(getSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stampStatus</column-name><column-value><![CDATA[");
		sb.append(getStampStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loa</column-name><column-value><![CDATA[");
		sb.append(getLoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaUnit</column-name><column-value><![CDATA[");
		sb.append(getLoaUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwtUnit</column-name><column-value><![CDATA[");
		sb.append(getDwtUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tugBoat</column-name><column-value><![CDATA[");
		sb.append(getTugBoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>from</column-name><column-value><![CDATA[");
		sb.append(getFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>to</column-name><column-value><![CDATA[");
		sb.append(getTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxCodeOfShipownersAgents</column-name><column-value><![CDATA[");
		sb.append(getTaxCodeOfShipownersAgents());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipownersAgents</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipownersAgents());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyAddress</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyPhone</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyFax</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyEmail</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _numberShiftingOrder;
	private long _documentName;
	private int _documentYear;
	private String _portofAuthority;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _anchoringPortCode;
	private String _anchoringPortWharfCode;
	private String _portHarbourCode;
	private String _shiftingPortWharfCode;
	private Date _shiftingDate;
	private String _reasonToShift;
	private Date _issueDate;
	private String _directorOfMaritime;
	private String _certificateNo;
	private int _requestState;
	private String _versionNo;
	private int _isApproval;
	private Date _approvalDate;
	private String _approvalName;
	private String _remarks;
	private int _isCancel;
	private Date _cancelDate;
	private String _cancelName;
	private String _cancelNote;
	private String _representative;
	private long _digitalAttachedFile;
	private Date _signDate;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private int _stampStatus;
	private long _attachedFile;
	private double _shownDraftxF;
	private String _unitShownDraftxF;
	private double _shownDraftxA;
	private String _unitShownDraftxA;
	private double _loa;
	private String _loaUnit;
	private double _dwt;
	private String _dwtUnit;
	private String _tugBoat;
	private String _from;
	private String _to;
	private String _taxCodeOfShipownersAgents;
	private String _nameOfShipownersAgents;
	private String _shipAgencyAddress;
	private String _shipAgencyPhone;
	private String _shipAgencyFax;
	private String _shipAgencyEmail;
}