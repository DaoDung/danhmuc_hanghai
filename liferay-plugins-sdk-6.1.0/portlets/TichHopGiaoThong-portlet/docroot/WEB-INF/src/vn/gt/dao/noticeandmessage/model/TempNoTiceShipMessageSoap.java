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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempNoTiceShipMessageServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempNoTiceShipMessageServiceSoap
 * @generated
 */
public class TempNoTiceShipMessageSoap implements Serializable {
	public static TempNoTiceShipMessageSoap toSoapModel(
		TempNoTiceShipMessage model) {
		TempNoTiceShipMessageSoap soapModel = new TempNoTiceShipMessageSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setNoticeShipType(model.getNoticeShipType());
		soapModel.setNoticeShipCode(model.getNoticeShipCode());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setConfirmTime(model.getConfirmTime());
		soapModel.setShipName(model.getShipName());
		soapModel.setShipTypeCode(model.getShipTypeCode());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setShipCaptain(model.getShipCaptain());
		soapModel.setImo(model.getImo());
		soapModel.setGrt(model.getGrt());
		soapModel.setDwt(model.getDwt());
		soapModel.setUnitGRT(model.getUnitGRT());
		soapModel.setUnitDWT(model.getUnitDWT());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setArrivalDate(model.getArrivalDate());
		soapModel.setArrivalPortCode(model.getArrivalPortCode());
		soapModel.setPortHarbourCode(model.getPortHarbourCode());
		soapModel.setPortRegionCode(model.getPortRegionCode());
		soapModel.setPortWharfCode(model.getPortWharfCode());
		soapModel.setPortGoingToStateName(model.getPortGoingToStateName());
		soapModel.setPortGoingToCode(model.getPortGoingToCode());
		soapModel.setNameOfShipOwners(model.getNameOfShipOwners());
		soapModel.setAddressOfShipOwners(model.getAddressOfShipOwners());
		soapModel.setShipOwnerstateCode(model.getShipOwnerstateCode());
		soapModel.setShipOwnerPhone(model.getShipOwnerPhone());
		soapModel.setShipOwnerFax(model.getShipOwnerFax());
		soapModel.setShipOwnerEmail(model.getShipOwnerEmail());
		soapModel.setLoa(model.getLoa());
		soapModel.setBreadth(model.getBreadth());
		soapModel.setClearanceHeight(model.getClearanceHeight());
		soapModel.setShownDraftxF(model.getShownDraftxF());
		soapModel.setShownDraftxA(model.getShownDraftxA());
		soapModel.setUnitLOA(model.getUnitLOA());
		soapModel.setUnitBreadth(model.getUnitBreadth());
		soapModel.setUnitClearanceHeight(model.getUnitClearanceHeight());
		soapModel.setUnitShownDraftxF(model.getUnitShownDraftxF());
		soapModel.setUnitShownDraftxA(model.getUnitShownDraftxA());
		soapModel.setCertificateOfRegistryNumber(model.getCertificateOfRegistryNumber());
		soapModel.setCertificateOfRegistryDate(model.getCertificateOfRegistryDate());
		soapModel.setCertificateOfRegistryPortName(model.getCertificateOfRegistryPortName());
		soapModel.setShipAgencyCode(model.getShipAgencyCode());
		soapModel.setShipAgencyAddress(model.getShipAgencyAddress());
		soapModel.setShipAgencyPhone(model.getShipAgencyPhone());
		soapModel.setShipAgencyFax(model.getShipAgencyFax());
		soapModel.setShipAgencyEmail(model.getShipAgencyEmail());
		soapModel.setPurposeCode(model.getPurposeCode());
		soapModel.setPurposeSpecified(model.getPurposeSpecified());
		soapModel.setCrewNumber(model.getCrewNumber());
		soapModel.setUnitCrew(model.getUnitCrew());
		soapModel.setPassengerNumber(model.getPassengerNumber());
		soapModel.setUnitPassenger(model.getUnitPassenger());
		soapModel.setQuantityAndTypeOfCargo(model.getQuantityAndTypeOfCargo());
		soapModel.setUnitQuantityofCargo(model.getUnitQuantityofCargo());
		soapModel.setTypeOfCargo(model.getTypeOfCargo());
		soapModel.setOtherPersons(model.getOtherPersons());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setMasterSigned(model.getMasterSigned());
		soapModel.setMasterSignedImage(model.getMasterSignedImage());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setNameOfShipAgent(model.getNameOfShipAgent());
		soapModel.setDocumentReference(model.getDocumentReference());
		soapModel.setIsArrival(model.getIsArrival());
		soapModel.setVoyageNumber(model.getVoyageNumber());
		soapModel.setNetTonnage(model.getNetTonnage());
		soapModel.setNetTonnageUnit(model.getNetTonnageUnit());
		soapModel.setPositionOfShipInPort(model.getPositionOfShipInPort());
		soapModel.setBriefParticularsOfVoyage(model.getBriefParticularsOfVoyage());
		soapModel.setPreviousPortsOfCall(model.getPreviousPortsOfCall());
		soapModel.setSubsequentPortsOfCall(model.getSubsequentPortsOfCall());
		soapModel.setDischargedPorts(model.getDischargedPorts());
		soapModel.setRemainingCargo(model.getRemainingCargo());
		soapModel.setShipRequirementsInTermsOfWaste(model.getShipRequirementsInTermsOfWaste());
		soapModel.setNumberCargoDeclaration(model.getNumberCargoDeclaration());
		soapModel.setNumberShipStoreDeclaration(model.getNumberShipStoreDeclaration());
		soapModel.setNumberCrewList(model.getNumberCrewList());
		soapModel.setNumberPassengerList(model.getNumberPassengerList());
		soapModel.setNumberCrewEffectsDeclaration(model.getNumberCrewEffectsDeclaration());
		soapModel.setNumberHealthMaritimeDeclaration(model.getNumberHealthMaritimeDeclaration());
		soapModel.setPortClearanceNo(model.getPortClearanceNo());
		soapModel.setTimeOfPORTArrival(model.getTimeOfPORTArrival());
		soapModel.setTimeOfPilotOnBoard(model.getTimeOfPilotOnBoard());
		soapModel.setTugBoat(model.getTugBoat());
		soapModel.setDo_(model.getDo_());
		soapModel.setFo(model.getFo());
		soapModel.setFw(model.getFw());
		soapModel.setPlaceOfReception(model.getPlaceOfReception());

		return soapModel;
	}

	public static TempNoTiceShipMessageSoap[] toSoapModels(
		TempNoTiceShipMessage[] models) {
		TempNoTiceShipMessageSoap[] soapModels = new TempNoTiceShipMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempNoTiceShipMessageSoap[][] toSoapModels(
		TempNoTiceShipMessage[][] models) {
		TempNoTiceShipMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempNoTiceShipMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempNoTiceShipMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempNoTiceShipMessageSoap[] toSoapModels(
		List<TempNoTiceShipMessage> models) {
		List<TempNoTiceShipMessageSoap> soapModels = new ArrayList<TempNoTiceShipMessageSoap>(models.size());

		for (TempNoTiceShipMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempNoTiceShipMessageSoap[soapModels.size()]);
	}

	public TempNoTiceShipMessageSoap() {
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

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
	}

	public String getNoticeShipType() {
		return _noticeShipType;
	}

	public void setNoticeShipType(String noticeShipType) {
		_noticeShipType = noticeShipType;
	}

	public String getNoticeShipCode() {
		return _noticeShipCode;
	}

	public void setNoticeShipCode(String noticeShipCode) {
		_noticeShipCode = noticeShipCode;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public String getUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	public int getConfirmTime() {
		return _confirmTime;
	}

	public void setConfirmTime(int confirmTime) {
		_confirmTime = confirmTime;
	}

	public String getShipName() {
		return _shipName;
	}

	public void setShipName(String shipName) {
		_shipName = shipName;
	}

	public String getShipTypeCode() {
		return _shipTypeCode;
	}

	public void setShipTypeCode(String shipTypeCode) {
		_shipTypeCode = shipTypeCode;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getShipCaptain() {
		return _shipCaptain;
	}

	public void setShipCaptain(String shipCaptain) {
		_shipCaptain = shipCaptain;
	}

	public String getImo() {
		return _imo;
	}

	public void setImo(String imo) {
		_imo = imo;
	}

	public double getGrt() {
		return _grt;
	}

	public void setGrt(double grt) {
		_grt = grt;
	}

	public double getDwt() {
		return _dwt;
	}

	public void setDwt(double dwt) {
		_dwt = dwt;
	}

	public String getUnitGRT() {
		return _unitGRT;
	}

	public void setUnitGRT(String unitGRT) {
		_unitGRT = unitGRT;
	}

	public String getUnitDWT() {
		return _unitDWT;
	}

	public void setUnitDWT(String unitDWT) {
		_unitDWT = unitDWT;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public Date getArrivalDate() {
		return _arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		_arrivalDate = arrivalDate;
	}

	public String getArrivalPortCode() {
		return _arrivalPortCode;
	}

	public void setArrivalPortCode(String arrivalPortCode) {
		_arrivalPortCode = arrivalPortCode;
	}

	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;
	}

	public String getPortRegionCode() {
		return _portRegionCode;
	}

	public void setPortRegionCode(String portRegionCode) {
		_portRegionCode = portRegionCode;
	}

	public String getPortWharfCode() {
		return _portWharfCode;
	}

	public void setPortWharfCode(String portWharfCode) {
		_portWharfCode = portWharfCode;
	}

	public String getPortGoingToStateName() {
		return _portGoingToStateName;
	}

	public void setPortGoingToStateName(String portGoingToStateName) {
		_portGoingToStateName = portGoingToStateName;
	}

	public String getPortGoingToCode() {
		return _portGoingToCode;
	}

	public void setPortGoingToCode(String portGoingToCode) {
		_portGoingToCode = portGoingToCode;
	}

	public String getNameOfShipOwners() {
		return _nameOfShipOwners;
	}

	public void setNameOfShipOwners(String nameOfShipOwners) {
		_nameOfShipOwners = nameOfShipOwners;
	}

	public String getAddressOfShipOwners() {
		return _addressOfShipOwners;
	}

	public void setAddressOfShipOwners(String addressOfShipOwners) {
		_addressOfShipOwners = addressOfShipOwners;
	}

	public String getShipOwnerstateCode() {
		return _shipOwnerstateCode;
	}

	public void setShipOwnerstateCode(String shipOwnerstateCode) {
		_shipOwnerstateCode = shipOwnerstateCode;
	}

	public String getShipOwnerPhone() {
		return _shipOwnerPhone;
	}

	public void setShipOwnerPhone(String shipOwnerPhone) {
		_shipOwnerPhone = shipOwnerPhone;
	}

	public String getShipOwnerFax() {
		return _shipOwnerFax;
	}

	public void setShipOwnerFax(String shipOwnerFax) {
		_shipOwnerFax = shipOwnerFax;
	}

	public String getShipOwnerEmail() {
		return _shipOwnerEmail;
	}

	public void setShipOwnerEmail(String shipOwnerEmail) {
		_shipOwnerEmail = shipOwnerEmail;
	}

	public double getLoa() {
		return _loa;
	}

	public void setLoa(double loa) {
		_loa = loa;
	}

	public double getBreadth() {
		return _breadth;
	}

	public void setBreadth(double breadth) {
		_breadth = breadth;
	}

	public double getClearanceHeight() {
		return _clearanceHeight;
	}

	public void setClearanceHeight(double clearanceHeight) {
		_clearanceHeight = clearanceHeight;
	}

	public double getShownDraftxF() {
		return _shownDraftxF;
	}

	public void setShownDraftxF(double shownDraftxF) {
		_shownDraftxF = shownDraftxF;
	}

	public double getShownDraftxA() {
		return _shownDraftxA;
	}

	public void setShownDraftxA(double shownDraftxA) {
		_shownDraftxA = shownDraftxA;
	}

	public String getUnitLOA() {
		return _unitLOA;
	}

	public void setUnitLOA(String unitLOA) {
		_unitLOA = unitLOA;
	}

	public String getUnitBreadth() {
		return _unitBreadth;
	}

	public void setUnitBreadth(String unitBreadth) {
		_unitBreadth = unitBreadth;
	}

	public String getUnitClearanceHeight() {
		return _unitClearanceHeight;
	}

	public void setUnitClearanceHeight(String unitClearanceHeight) {
		_unitClearanceHeight = unitClearanceHeight;
	}

	public String getUnitShownDraftxF() {
		return _unitShownDraftxF;
	}

	public void setUnitShownDraftxF(String unitShownDraftxF) {
		_unitShownDraftxF = unitShownDraftxF;
	}

	public String getUnitShownDraftxA() {
		return _unitShownDraftxA;
	}

	public void setUnitShownDraftxA(String unitShownDraftxA) {
		_unitShownDraftxA = unitShownDraftxA;
	}

	public String getCertificateOfRegistryNumber() {
		return _certificateOfRegistryNumber;
	}

	public void setCertificateOfRegistryNumber(
		String certificateOfRegistryNumber) {
		_certificateOfRegistryNumber = certificateOfRegistryNumber;
	}

	public Date getCertificateOfRegistryDate() {
		return _certificateOfRegistryDate;
	}

	public void setCertificateOfRegistryDate(Date certificateOfRegistryDate) {
		_certificateOfRegistryDate = certificateOfRegistryDate;
	}

	public String getCertificateOfRegistryPortName() {
		return _certificateOfRegistryPortName;
	}

	public void setCertificateOfRegistryPortName(
		String certificateOfRegistryPortName) {
		_certificateOfRegistryPortName = certificateOfRegistryPortName;
	}

	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;
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

	public String getPurposeCode() {
		return _purposeCode;
	}

	public void setPurposeCode(String purposeCode) {
		_purposeCode = purposeCode;
	}

	public String getPurposeSpecified() {
		return _purposeSpecified;
	}

	public void setPurposeSpecified(String purposeSpecified) {
		_purposeSpecified = purposeSpecified;
	}

	public long getCrewNumber() {
		return _crewNumber;
	}

	public void setCrewNumber(long crewNumber) {
		_crewNumber = crewNumber;
	}

	public String getUnitCrew() {
		return _unitCrew;
	}

	public void setUnitCrew(String unitCrew) {
		_unitCrew = unitCrew;
	}

	public long getPassengerNumber() {
		return _passengerNumber;
	}

	public void setPassengerNumber(long passengerNumber) {
		_passengerNumber = passengerNumber;
	}

	public String getUnitPassenger() {
		return _unitPassenger;
	}

	public void setUnitPassenger(String unitPassenger) {
		_unitPassenger = unitPassenger;
	}

	public String getQuantityAndTypeOfCargo() {
		return _quantityAndTypeOfCargo;
	}

	public void setQuantityAndTypeOfCargo(String quantityAndTypeOfCargo) {
		_quantityAndTypeOfCargo = quantityAndTypeOfCargo;
	}

	public String getUnitQuantityofCargo() {
		return _unitQuantityofCargo;
	}

	public void setUnitQuantityofCargo(String unitQuantityofCargo) {
		_unitQuantityofCargo = unitQuantityofCargo;
	}

	public String getTypeOfCargo() {
		return _typeOfCargo;
	}

	public void setTypeOfCargo(String typeOfCargo) {
		_typeOfCargo = typeOfCargo;
	}

	public int getOtherPersons() {
		return _otherPersons;
	}

	public void setOtherPersons(int otherPersons) {
		_otherPersons = otherPersons;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public int getMasterSigned() {
		return _masterSigned;
	}

	public void setMasterSigned(int masterSigned) {
		_masterSigned = masterSigned;
	}

	public int getMasterSignedImage() {
		return _masterSignedImage;
	}

	public void setMasterSignedImage(int masterSignedImage) {
		_masterSignedImage = masterSignedImage;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getNameOfShipAgent() {
		return _nameOfShipAgent;
	}

	public void setNameOfShipAgent(String nameOfShipAgent) {
		_nameOfShipAgent = nameOfShipAgent;
	}

	public long getDocumentReference() {
		return _documentReference;
	}

	public void setDocumentReference(long documentReference) {
		_documentReference = documentReference;
	}

	public int getIsArrival() {
		return _isArrival;
	}

	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;
	}

	public String getVoyageNumber() {
		return _voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;
	}

	public double getNetTonnage() {
		return _netTonnage;
	}

	public void setNetTonnage(double netTonnage) {
		_netTonnage = netTonnage;
	}

	public String getNetTonnageUnit() {
		return _netTonnageUnit;
	}

	public void setNetTonnageUnit(String netTonnageUnit) {
		_netTonnageUnit = netTonnageUnit;
	}

	public String getPositionOfShipInPort() {
		return _positionOfShipInPort;
	}

	public void setPositionOfShipInPort(String positionOfShipInPort) {
		_positionOfShipInPort = positionOfShipInPort;
	}

	public String getBriefParticularsOfVoyage() {
		return _briefParticularsOfVoyage;
	}

	public void setBriefParticularsOfVoyage(String briefParticularsOfVoyage) {
		_briefParticularsOfVoyage = briefParticularsOfVoyage;
	}

	public String getPreviousPortsOfCall() {
		return _previousPortsOfCall;
	}

	public void setPreviousPortsOfCall(String previousPortsOfCall) {
		_previousPortsOfCall = previousPortsOfCall;
	}

	public String getSubsequentPortsOfCall() {
		return _subsequentPortsOfCall;
	}

	public void setSubsequentPortsOfCall(String subsequentPortsOfCall) {
		_subsequentPortsOfCall = subsequentPortsOfCall;
	}

	public String getDischargedPorts() {
		return _dischargedPorts;
	}

	public void setDischargedPorts(String dischargedPorts) {
		_dischargedPorts = dischargedPorts;
	}

	public String getRemainingCargo() {
		return _remainingCargo;
	}

	public void setRemainingCargo(String remainingCargo) {
		_remainingCargo = remainingCargo;
	}

	public String getShipRequirementsInTermsOfWaste() {
		return _shipRequirementsInTermsOfWaste;
	}

	public void setShipRequirementsInTermsOfWaste(
		String shipRequirementsInTermsOfWaste) {
		_shipRequirementsInTermsOfWaste = shipRequirementsInTermsOfWaste;
	}

	public int getNumberCargoDeclaration() {
		return _numberCargoDeclaration;
	}

	public void setNumberCargoDeclaration(int numberCargoDeclaration) {
		_numberCargoDeclaration = numberCargoDeclaration;
	}

	public int getNumberShipStoreDeclaration() {
		return _numberShipStoreDeclaration;
	}

	public void setNumberShipStoreDeclaration(int numberShipStoreDeclaration) {
		_numberShipStoreDeclaration = numberShipStoreDeclaration;
	}

	public int getNumberCrewList() {
		return _numberCrewList;
	}

	public void setNumberCrewList(int numberCrewList) {
		_numberCrewList = numberCrewList;
	}

	public int getNumberPassengerList() {
		return _numberPassengerList;
	}

	public void setNumberPassengerList(int numberPassengerList) {
		_numberPassengerList = numberPassengerList;
	}

	public int getNumberCrewEffectsDeclaration() {
		return _numberCrewEffectsDeclaration;
	}

	public void setNumberCrewEffectsDeclaration(
		int numberCrewEffectsDeclaration) {
		_numberCrewEffectsDeclaration = numberCrewEffectsDeclaration;
	}

	public int getNumberHealthMaritimeDeclaration() {
		return _numberHealthMaritimeDeclaration;
	}

	public void setNumberHealthMaritimeDeclaration(
		int numberHealthMaritimeDeclaration) {
		_numberHealthMaritimeDeclaration = numberHealthMaritimeDeclaration;
	}

	public String getPortClearanceNo() {
		return _portClearanceNo;
	}

	public void setPortClearanceNo(String portClearanceNo) {
		_portClearanceNo = portClearanceNo;
	}

	public Date getTimeOfPORTArrival() {
		return _timeOfPORTArrival;
	}

	public void setTimeOfPORTArrival(Date timeOfPORTArrival) {
		_timeOfPORTArrival = timeOfPORTArrival;
	}

	public Date getTimeOfPilotOnBoard() {
		return _timeOfPilotOnBoard;
	}

	public void setTimeOfPilotOnBoard(Date timeOfPilotOnBoard) {
		_timeOfPilotOnBoard = timeOfPilotOnBoard;
	}

	public String getTugBoat() {
		return _tugBoat;
	}

	public void setTugBoat(String tugBoat) {
		_tugBoat = tugBoat;
	}

	public String getDo_() {
		return _do_;
	}

	public void setDo_(String do_) {
		_do_ = do_;
	}

	public String getFo() {
		return _fo;
	}

	public void setFo(String fo) {
		_fo = fo;
	}

	public String getFw() {
		return _fw;
	}

	public void setFw(String fw) {
		_fw = fw;
	}

	public String getPlaceOfReception() {
		return _placeOfReception;
	}

	public void setPlaceOfReception(String placeOfReception) {
		_placeOfReception = placeOfReception;
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private String _noticeShipType;
	private String _noticeShipCode;
	private long _documentName;
	private String _userCreated;
	private int _confirmTime;
	private String _shipName;
	private String _shipTypeCode;
	private String _stateCode;
	private String _shipCaptain;
	private String _imo;
	private double _grt;
	private double _dwt;
	private String _unitGRT;
	private String _unitDWT;
	private String _callSign;
	private Date _arrivalDate;
	private String _arrivalPortCode;
	private String _portHarbourCode;
	private String _portRegionCode;
	private String _portWharfCode;
	private String _portGoingToStateName;
	private String _portGoingToCode;
	private String _nameOfShipOwners;
	private String _addressOfShipOwners;
	private String _shipOwnerstateCode;
	private String _shipOwnerPhone;
	private String _shipOwnerFax;
	private String _shipOwnerEmail;
	private double _loa;
	private double _breadth;
	private double _clearanceHeight;
	private double _shownDraftxF;
	private double _shownDraftxA;
	private String _unitLOA;
	private String _unitBreadth;
	private String _unitClearanceHeight;
	private String _unitShownDraftxF;
	private String _unitShownDraftxA;
	private String _certificateOfRegistryNumber;
	private Date _certificateOfRegistryDate;
	private String _certificateOfRegistryPortName;
	private String _shipAgencyCode;
	private String _shipAgencyAddress;
	private String _shipAgencyPhone;
	private String _shipAgencyFax;
	private String _shipAgencyEmail;
	private String _purposeCode;
	private String _purposeSpecified;
	private long _crewNumber;
	private String _unitCrew;
	private long _passengerNumber;
	private String _unitPassenger;
	private String _quantityAndTypeOfCargo;
	private String _unitQuantityofCargo;
	private String _typeOfCargo;
	private int _otherPersons;
	private String _remarks;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private int _documentYear;
	private String _nameOfShipAgent;
	private long _documentReference;
	private int _isArrival;
	private String _voyageNumber;
	private double _netTonnage;
	private String _netTonnageUnit;
	private String _positionOfShipInPort;
	private String _briefParticularsOfVoyage;
	private String _previousPortsOfCall;
	private String _subsequentPortsOfCall;
	private String _dischargedPorts;
	private String _remainingCargo;
	private String _shipRequirementsInTermsOfWaste;
	private int _numberCargoDeclaration;
	private int _numberShipStoreDeclaration;
	private int _numberCrewList;
	private int _numberPassengerList;
	private int _numberCrewEffectsDeclaration;
	private int _numberHealthMaritimeDeclaration;
	private String _portClearanceNo;
	private Date _timeOfPORTArrival;
	private Date _timeOfPilotOnBoard;
	private String _tugBoat;
	private String _do_;
	private String _fo;
	private String _fw;
	private String _placeOfReception;
}