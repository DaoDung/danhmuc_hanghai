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

import vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class IssueAcceptanceClp extends BaseModelImpl<IssueAcceptance>
	implements IssueAcceptance {
	public IssueAcceptanceClp() {
	}

	public Class<?> getModelClass() {
		return IssueAcceptance.class;
	}

	public String getModelClassName() {
		return IssueAcceptance.class.getName();
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

	public String getNumberPortClearance() {
		return _numberPortClearance;
	}

	public void setNumberPortClearance(String numberPortClearance) {
		_numberPortClearance = numberPortClearance;
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

	public int getNumberOfCrews() {
		return _numberOfCrews;
	}

	public void setNumberOfCrews(int numberOfCrews) {
		_numberOfCrews = numberOfCrews;
	}

	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	public String getCargo() {
		return _cargo;
	}

	public void setCargo(String cargo) {
		_cargo = cargo;
	}

	public double getVolumeCargo() {
		return _volumeCargo;
	}

	public void setVolumeCargo(double volumeCargo) {
		_volumeCargo = volumeCargo;
	}

	public String getCargoUnit() {
		return _cargoUnit;
	}

	public void setCargoUnit(String cargoUnit) {
		_cargoUnit = cargoUnit;
	}

	public String getCargoDescription() {
		return _cargoDescription;
	}

	public void setCargoDescription(String cargoDescription) {
		_cargoDescription = cargoDescription;
	}

	public String getTransitCargo() {
		return _transitCargo;
	}

	public void setTransitCargo(String transitCargo) {
		_transitCargo = transitCargo;
	}

	public double getVolumeTransitCargo() {
		return _volumeTransitCargo;
	}

	public void setVolumeTransitCargo(double volumeTransitCargo) {
		_volumeTransitCargo = volumeTransitCargo;
	}

	public String getTransitCargoUnit() {
		return _transitCargoUnit;
	}

	public void setTransitCargoUnit(String transitCargoUnit) {
		_transitCargoUnit = transitCargoUnit;
	}

	public Date getTimeOfDeparture() {
		return _timeOfDeparture;
	}

	public void setTimeOfDeparture(Date timeOfDeparture) {
		_timeOfDeparture = timeOfDeparture;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public String getPortWharfCode() {
		return _portWharfCode;
	}

	public void setPortWharfCode(String portWharfCode) {
		_portWharfCode = portWharfCode;
	}

	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;
	}

	public String getNextPortOfCallCode() {
		return _nextPortOfCallCode;
	}

	public void setNextPortOfCallCode(String nextPortOfCallCode) {
		_nextPortOfCallCode = nextPortOfCallCode;
	}

	public Date getValidUntil() {
		return _validUntil;
	}

	public void setValidUntil(Date validUntil) {
		_validUntil = validUntil;
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

	public double getGt() {
		return _gt;
	}

	public void setGt(double gt) {
		_gt = gt;
	}

	public double getDwt() {
		return _dwt;
	}

	public void setDwt(double dwt) {
		_dwt = dwt;
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

	public long getStampStatus() {
		return _stampStatus;
	}

	public void setStampStatus(long stampStatus) {
		_stampStatus = stampStatus;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			IssueAcceptanceLocalServiceUtil.addIssueAcceptance(this);
		}
		else {
			IssueAcceptanceLocalServiceUtil.updateIssueAcceptance(this);
		}
	}

	@Override
	public IssueAcceptance toEscapedModel() {
		return (IssueAcceptance)Proxy.newProxyInstance(IssueAcceptance.class.getClassLoader(),
			new Class[] { IssueAcceptance.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssueAcceptanceClp clone = new IssueAcceptanceClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setNumberPortClearance(getNumberPortClearance());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setPortofAuthority(getPortofAuthority());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setNumberOfCrews(getNumberOfCrews());
		clone.setNumberOfPassengers(getNumberOfPassengers());
		clone.setCallSign(getCallSign());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setCargo(getCargo());
		clone.setVolumeCargo(getVolumeCargo());
		clone.setCargoUnit(getCargoUnit());
		clone.setCargoDescription(getCargoDescription());
		clone.setTransitCargo(getTransitCargo());
		clone.setVolumeTransitCargo(getVolumeTransitCargo());
		clone.setTransitCargoUnit(getTransitCargoUnit());
		clone.setTimeOfDeparture(getTimeOfDeparture());
		clone.setPortCode(getPortCode());
		clone.setPortWharfCode(getPortWharfCode());
		clone.setPortHarbourCode(getPortHarbourCode());
		clone.setNextPortOfCallCode(getNextPortOfCallCode());
		clone.setValidUntil(getValidUntil());
		clone.setIssueDate(getIssueDate());
		clone.setDirectorOfMaritime(getDirectorOfMaritime());
		clone.setCertificateNo(getCertificateNo());
		clone.setRequestState(getRequestState());
		clone.setGt(getGt());
		clone.setDwt(getDwt());
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
		clone.setSignDate(getSignDate());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setStampStatus(getStampStatus());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	public int compareTo(IssueAcceptance issueAcceptance) {
		int value = 0;

		if (getId() < issueAcceptance.getId()) {
			value = -1;
		}
		else if (getId() > issueAcceptance.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		IssueAcceptanceClp issueAcceptance = null;

		try {
			issueAcceptance = (IssueAcceptanceClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = issueAcceptance.getPrimaryKey();

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
		StringBundler sb = new StringBundler(95);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", numberPortClearance=");
		sb.append(getNumberPortClearance());
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
		sb.append(", numberOfCrews=");
		sb.append(getNumberOfCrews());
		sb.append(", numberOfPassengers=");
		sb.append(getNumberOfPassengers());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", cargo=");
		sb.append(getCargo());
		sb.append(", volumeCargo=");
		sb.append(getVolumeCargo());
		sb.append(", cargoUnit=");
		sb.append(getCargoUnit());
		sb.append(", cargoDescription=");
		sb.append(getCargoDescription());
		sb.append(", transitCargo=");
		sb.append(getTransitCargo());
		sb.append(", volumeTransitCargo=");
		sb.append(getVolumeTransitCargo());
		sb.append(", transitCargoUnit=");
		sb.append(getTransitCargoUnit());
		sb.append(", timeOfDeparture=");
		sb.append(getTimeOfDeparture());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", portWharfCode=");
		sb.append(getPortWharfCode());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", nextPortOfCallCode=");
		sb.append(getNextPortOfCallCode());
		sb.append(", validUntil=");
		sb.append(getValidUntil());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append(", directorOfMaritime=");
		sb.append(getDirectorOfMaritime());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", gt=");
		sb.append(getGt());
		sb.append(", dwt=");
		sb.append(getDwt());
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
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(145);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.IssueAcceptance");
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
			"<column><column-name>numberPortClearance</column-name><column-value><![CDATA[");
		sb.append(getNumberPortClearance());
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
			"<column><column-name>numberOfCrews</column-name><column-value><![CDATA[");
		sb.append(getNumberOfCrews());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPassengers</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPassengers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargo</column-name><column-value><![CDATA[");
		sb.append(getCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volumeCargo</column-name><column-value><![CDATA[");
		sb.append(getVolumeCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargoUnit</column-name><column-value><![CDATA[");
		sb.append(getCargoUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargoDescription</column-name><column-value><![CDATA[");
		sb.append(getCargoDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transitCargo</column-name><column-value><![CDATA[");
		sb.append(getTransitCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volumeTransitCargo</column-name><column-value><![CDATA[");
		sb.append(getVolumeTransitCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transitCargoUnit</column-name><column-value><![CDATA[");
		sb.append(getTransitCargoUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeOfDeparture</column-name><column-value><![CDATA[");
		sb.append(getTimeOfDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfCode</column-name><column-value><![CDATA[");
		sb.append(getPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getNextPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validUntil</column-name><column-value><![CDATA[");
		sb.append(getValidUntil());
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
			"<column><column-name>gt</column-name><column-value><![CDATA[");
		sb.append(getGt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _numberPortClearance;
	private long _documentName;
	private int _documentYear;
	private String _portofAuthority;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private int _numberOfCrews;
	private int _numberOfPassengers;
	private String _callSign;
	private String _nameOfMaster;
	private String _cargo;
	private double _volumeCargo;
	private String _cargoUnit;
	private String _cargoDescription;
	private String _transitCargo;
	private double _volumeTransitCargo;
	private String _transitCargoUnit;
	private Date _timeOfDeparture;
	private String _portCode;
	private String _portWharfCode;
	private String _portHarbourCode;
	private String _nextPortOfCallCode;
	private Date _validUntil;
	private Date _issueDate;
	private String _directorOfMaritime;
	private String _certificateNo;
	private int _requestState;
	private double _gt;
	private double _dwt;
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
	private Date _signDate;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private long _stampStatus;
	private long _attachedFile;
}