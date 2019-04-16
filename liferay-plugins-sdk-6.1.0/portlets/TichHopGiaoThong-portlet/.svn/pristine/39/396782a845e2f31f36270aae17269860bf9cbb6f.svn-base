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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.IssuePermissionForTransitServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.IssuePermissionForTransitServiceSoap
 * @generated
 */
public class IssuePermissionForTransitSoap implements Serializable {
	public static IssuePermissionForTransitSoap toSoapModel(
		IssuePermissionForTransit model) {
		IssuePermissionForTransitSoap soapModel = new IssuePermissionForTransitSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setNumberPermissionForTransit(model.getNumberPermissionForTransit());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setPortofAuthority(model.getPortofAuthority());
		soapModel.setNameOfShip(model.getNameOfShip());
		soapModel.setFlagStateOfShip(model.getFlagStateOfShip());
		soapModel.setGt(model.getGt());
		soapModel.setNumberOfCrews(model.getNumberOfCrews());
		soapModel.setNumberOfPassengers(model.getNumberOfPassengers());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setNameOfMaster(model.getNameOfMaster());
		soapModel.setTransitCargo(model.getTransitCargo());
		soapModel.setVolumeCargo(model.getVolumeCargo());
		soapModel.setCargoUnit(model.getCargoUnit());
		soapModel.setCargoDescription(model.getCargoDescription());
		soapModel.setPermittedTransitFrom(model.getPermittedTransitFrom());
		soapModel.setPermittedTransitTo(model.getPermittedTransitTo());
		soapModel.setTimeOfDeparture(model.getTimeOfDeparture());
		soapModel.setValidUntil(model.getValidUntil());
		soapModel.setDateOfSign(model.getDateOfSign());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setDirectorOfMaritime(model.getDirectorOfMaritime());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCertificateNo(model.getCertificateNo());
		soapModel.setVersionNo(model.getVersionNo());
		soapModel.setIsApproval(model.getIsApproval());
		soapModel.setApprovalDate(model.getApprovalDate());
		soapModel.setApprovalName(model.getApprovalName());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setIsCancel(model.getIsCancel());
		soapModel.setCancelDate(model.getCancelDate());
		soapModel.setCancelName(model.getCancelName());
		soapModel.setCancelNote(model.getCancelNote());
		soapModel.setRepresentative(model.getRepresentative());
		soapModel.setDigitalAttachedFile(model.getDigitalAttachedFile());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setStampStatus(model.getStampStatus());
		soapModel.setAttachedFile(model.getAttachedFile());

		return soapModel;
	}

	public static IssuePermissionForTransitSoap[] toSoapModels(
		IssuePermissionForTransit[] models) {
		IssuePermissionForTransitSoap[] soapModels = new IssuePermissionForTransitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IssuePermissionForTransitSoap[][] toSoapModels(
		IssuePermissionForTransit[][] models) {
		IssuePermissionForTransitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IssuePermissionForTransitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IssuePermissionForTransitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IssuePermissionForTransitSoap[] toSoapModels(
		List<IssuePermissionForTransit> models) {
		List<IssuePermissionForTransitSoap> soapModels = new ArrayList<IssuePermissionForTransitSoap>(models.size());

		for (IssuePermissionForTransit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IssuePermissionForTransitSoap[soapModels.size()]);
	}

	public IssuePermissionForTransitSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
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

	public String getNumberPermissionForTransit() {
		return _numberPermissionForTransit;
	}

	public void setNumberPermissionForTransit(String numberPermissionForTransit) {
		_numberPermissionForTransit = numberPermissionForTransit;
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

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
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

	public double getGt() {
		return _gt;
	}

	public void setGt(double gt) {
		_gt = gt;
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

	public String getTransitCargo() {
		return _transitCargo;
	}

	public void setTransitCargo(String transitCargo) {
		_transitCargo = transitCargo;
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

	public String getPermittedTransitFrom() {
		return _permittedTransitFrom;
	}

	public void setPermittedTransitFrom(String permittedTransitFrom) {
		_permittedTransitFrom = permittedTransitFrom;
	}

	public String getPermittedTransitTo() {
		return _permittedTransitTo;
	}

	public void setPermittedTransitTo(String permittedTransitTo) {
		_permittedTransitTo = permittedTransitTo;
	}

	public Date getTimeOfDeparture() {
		return _timeOfDeparture;
	}

	public void setTimeOfDeparture(Date timeOfDeparture) {
		_timeOfDeparture = timeOfDeparture;
	}

	public Date getValidUntil() {
		return _validUntil;
	}

	public void setValidUntil(Date validUntil) {
		_validUntil = validUntil;
	}

	public Date getDateOfSign() {
		return _dateOfSign;
	}

	public void setDateOfSign(Date dateOfSign) {
		_dateOfSign = dateOfSign;
	}

	public String getUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	public String getDirectorOfMaritime() {
		return _directorOfMaritime;
	}

	public void setDirectorOfMaritime(String directorOfMaritime) {
		_directorOfMaritime = directorOfMaritime;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getCertificateNo() {
		return _certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		_certificateNo = certificateNo;
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

	private long _id;
	private String _requestCode;
	private String _numberPermissionForTransit;
	private long _documentName;
	private int _documentYear;
	private int _requestState;
	private String _portofAuthority;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private double _gt;
	private int _numberOfCrews;
	private int _numberOfPassengers;
	private String _callSign;
	private String _nameOfMaster;
	private String _transitCargo;
	private double _volumeCargo;
	private String _cargoUnit;
	private String _cargoDescription;
	private String _permittedTransitFrom;
	private String _permittedTransitTo;
	private Date _timeOfDeparture;
	private Date _validUntil;
	private Date _dateOfSign;
	private String _userCreated;
	private String _directorOfMaritime;
	private Date _createdDate;
	private String _certificateNo;
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
	private long _stampStatus;
	private long _attachedFile;
}