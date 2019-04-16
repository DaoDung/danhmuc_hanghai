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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.IssueShiftingOrderServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.IssueShiftingOrderServiceSoap
 * @generated
 */
public class IssueShiftingOrderSoap implements Serializable {
	public static IssueShiftingOrderSoap toSoapModel(IssueShiftingOrder model) {
		IssueShiftingOrderSoap soapModel = new IssueShiftingOrderSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setNumberShiftingOrder(model.getNumberShiftingOrder());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setPortofAuthority(model.getPortofAuthority());
		soapModel.setNameOfShip(model.getNameOfShip());
		soapModel.setFlagStateOfShip(model.getFlagStateOfShip());
		soapModel.setAnchoringPortCode(model.getAnchoringPortCode());
		soapModel.setAnchoringPortWharfCode(model.getAnchoringPortWharfCode());
		soapModel.setPortHarbourCode(model.getPortHarbourCode());
		soapModel.setShiftingPortWharfCode(model.getShiftingPortWharfCode());
		soapModel.setShiftingDate(model.getShiftingDate());
		soapModel.setReasonToShift(model.getReasonToShift());
		soapModel.setIssueDate(model.getIssueDate());
		soapModel.setDirectorOfMaritime(model.getDirectorOfMaritime());
		soapModel.setCertificateNo(model.getCertificateNo());
		soapModel.setRequestState(model.getRequestState());
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
		soapModel.setShownDraftxF(model.getShownDraftxF());
		soapModel.setUnitShownDraftxF(model.getUnitShownDraftxF());
		soapModel.setShownDraftxA(model.getShownDraftxA());
		soapModel.setUnitShownDraftxA(model.getUnitShownDraftxA());
		soapModel.setLoa(model.getLoa());
		soapModel.setLoaUnit(model.getLoaUnit());
		soapModel.setDwt(model.getDwt());
		soapModel.setDwtUnit(model.getDwtUnit());
		soapModel.setTugBoat(model.getTugBoat());
		soapModel.setFrom(model.getFrom());
		soapModel.setTo(model.getTo());
		soapModel.setTaxCodeOfShipownersAgents(model.getTaxCodeOfShipownersAgents());
		soapModel.setNameOfShipownersAgents(model.getNameOfShipownersAgents());
		soapModel.setShipAgencyAddress(model.getShipAgencyAddress());
		soapModel.setShipAgencyPhone(model.getShipAgencyPhone());
		soapModel.setShipAgencyFax(model.getShipAgencyFax());
		soapModel.setShipAgencyEmail(model.getShipAgencyEmail());

		return soapModel;
	}

	public static IssueShiftingOrderSoap[] toSoapModels(
		IssueShiftingOrder[] models) {
		IssueShiftingOrderSoap[] soapModels = new IssueShiftingOrderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IssueShiftingOrderSoap[][] toSoapModels(
		IssueShiftingOrder[][] models) {
		IssueShiftingOrderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IssueShiftingOrderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IssueShiftingOrderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IssueShiftingOrderSoap[] toSoapModels(
		List<IssueShiftingOrder> models) {
		List<IssueShiftingOrderSoap> soapModels = new ArrayList<IssueShiftingOrderSoap>(models.size());

		for (IssueShiftingOrder model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IssueShiftingOrderSoap[soapModels.size()]);
	}

	public IssueShiftingOrderSoap() {
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