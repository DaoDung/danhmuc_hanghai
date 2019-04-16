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

import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempNoTiceShipMessageClp extends BaseModelImpl<TempNoTiceShipMessage>
	implements TempNoTiceShipMessage {
	public TempNoTiceShipMessageClp() {
	}

	public Class<?> getModelClass() {
		return TempNoTiceShipMessage.class;
	}

	public String getModelClassName() {
		return TempNoTiceShipMessage.class.getName();
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

	public double getWeight01() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getUnit01() {
		throw new UnsupportedOperationException();
	}

	public double getWeight02() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getUnit02() {
		throw new UnsupportedOperationException();
	}

	public double getWeight03() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getUnit03() {
		throw new UnsupportedOperationException();
	}

	public double getWeight04() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getUnit04() {
		throw new UnsupportedOperationException();
	}

	public double getWeight05() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getUnit05() {
		throw new UnsupportedOperationException();
	}

	public double getWeight06() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getUnit06() {
		throw new UnsupportedOperationException();
	}

	public void setWeight01(double weight01) {
		throw new UnsupportedOperationException();
	}

	public void setUnit01(java.lang.String unit01) {
		throw new UnsupportedOperationException();
	}

	public void setWeight02(double weight02) {
		throw new UnsupportedOperationException();
	}

	public void setUnit02(java.lang.String unit02) {
		throw new UnsupportedOperationException();
	}

	public void setWeight03(double weight03) {
		throw new UnsupportedOperationException();
	}

	public void setUnit03(java.lang.String unit03) {
		throw new UnsupportedOperationException();
	}

	public void setWeight04(double weight04) {
		throw new UnsupportedOperationException();
	}

	public void setUnit04(java.lang.String unit04) {
		throw new UnsupportedOperationException();
	}

	public void setWeight05(double weight05) {
		throw new UnsupportedOperationException();
	}

	public void setUnit05(java.lang.String unit05) {
		throw new UnsupportedOperationException();
	}

	public void setWeight06(double weight06) {
		throw new UnsupportedOperationException();
	}

	public void setUnit06(java.lang.String unit06) {
		throw new UnsupportedOperationException();
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempNoTiceShipMessageLocalServiceUtil.addTempNoTiceShipMessage(this);
		}
		else {
			TempNoTiceShipMessageLocalServiceUtil.updateTempNoTiceShipMessage(this);
		}
	}

	@Override
	public TempNoTiceShipMessage toEscapedModel() {
		return (TempNoTiceShipMessage)Proxy.newProxyInstance(TempNoTiceShipMessage.class.getClassLoader(),
			new Class[] { TempNoTiceShipMessage.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempNoTiceShipMessageClp clone = new TempNoTiceShipMessageClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setNoticeShipType(getNoticeShipType());
		clone.setNoticeShipCode(getNoticeShipCode());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setConfirmTime(getConfirmTime());
		clone.setShipName(getShipName());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setStateCode(getStateCode());
		clone.setShipCaptain(getShipCaptain());
		clone.setImo(getImo());
		clone.setGrt(getGrt());
		clone.setDwt(getDwt());
		clone.setUnitGRT(getUnitGRT());
		clone.setUnitDWT(getUnitDWT());
		clone.setCallSign(getCallSign());
		clone.setArrivalDate(getArrivalDate());
		clone.setArrivalPortCode(getArrivalPortCode());
		clone.setPortHarbourCode(getPortHarbourCode());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortWharfCode(getPortWharfCode());
		clone.setPortGoingToStateName(getPortGoingToStateName());
		clone.setPortGoingToCode(getPortGoingToCode());
		clone.setNameOfShipOwners(getNameOfShipOwners());
		clone.setAddressOfShipOwners(getAddressOfShipOwners());
		clone.setShipOwnerstateCode(getShipOwnerstateCode());
		clone.setShipOwnerPhone(getShipOwnerPhone());
		clone.setShipOwnerFax(getShipOwnerFax());
		clone.setShipOwnerEmail(getShipOwnerEmail());
		clone.setLoa(getLoa());
		clone.setBreadth(getBreadth());
		clone.setClearanceHeight(getClearanceHeight());
		clone.setShownDraftxF(getShownDraftxF());
		clone.setShownDraftxA(getShownDraftxA());
		clone.setUnitLOA(getUnitLOA());
		clone.setUnitBreadth(getUnitBreadth());
		clone.setUnitClearanceHeight(getUnitClearanceHeight());
		clone.setUnitShownDraftxF(getUnitShownDraftxF());
		clone.setUnitShownDraftxA(getUnitShownDraftxA());
		clone.setCertificateOfRegistryNumber(getCertificateOfRegistryNumber());
		clone.setCertificateOfRegistryDate(getCertificateOfRegistryDate());
		clone.setCertificateOfRegistryPortName(getCertificateOfRegistryPortName());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setShipAgencyAddress(getShipAgencyAddress());
		clone.setShipAgencyPhone(getShipAgencyPhone());
		clone.setShipAgencyFax(getShipAgencyFax());
		clone.setShipAgencyEmail(getShipAgencyEmail());
		clone.setPurposeCode(getPurposeCode());
		clone.setPurposeSpecified(getPurposeSpecified());
		clone.setCrewNumber(getCrewNumber());
		clone.setUnitCrew(getUnitCrew());
		clone.setPassengerNumber(getPassengerNumber());
		clone.setUnitPassenger(getUnitPassenger());
		clone.setQuantityAndTypeOfCargo(getQuantityAndTypeOfCargo());
		clone.setUnitQuantityofCargo(getUnitQuantityofCargo());
		clone.setTypeOfCargo(getTypeOfCargo());
		clone.setOtherPersons(getOtherPersons());
		clone.setRemarks(getRemarks());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setDocumentYear(getDocumentYear());
		clone.setNameOfShipAgent(getNameOfShipAgent());
		clone.setDocumentReference(getDocumentReference());
		clone.setIsArrival(getIsArrival());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setNetTonnage(getNetTonnage());
		clone.setNetTonnageUnit(getNetTonnageUnit());
		clone.setPositionOfShipInPort(getPositionOfShipInPort());
		clone.setBriefParticularsOfVoyage(getBriefParticularsOfVoyage());
		clone.setPreviousPortsOfCall(getPreviousPortsOfCall());
		clone.setSubsequentPortsOfCall(getSubsequentPortsOfCall());
		clone.setDischargedPorts(getDischargedPorts());
		clone.setRemainingCargo(getRemainingCargo());
		clone.setShipRequirementsInTermsOfWaste(getShipRequirementsInTermsOfWaste());
		clone.setNumberCargoDeclaration(getNumberCargoDeclaration());
		clone.setNumberShipStoreDeclaration(getNumberShipStoreDeclaration());
		clone.setNumberCrewList(getNumberCrewList());
		clone.setNumberPassengerList(getNumberPassengerList());
		clone.setNumberCrewEffectsDeclaration(getNumberCrewEffectsDeclaration());
		clone.setNumberHealthMaritimeDeclaration(getNumberHealthMaritimeDeclaration());
		clone.setPortClearanceNo(getPortClearanceNo());
		clone.setTimeOfPORTArrival(getTimeOfPORTArrival());
		clone.setTimeOfPilotOnBoard(getTimeOfPilotOnBoard());
		clone.setTugBoat(getTugBoat());
		clone.setDo_(getDo_());
		clone.setFo(getFo());
		clone.setFw(getFw());
		clone.setPlaceOfReception(getPlaceOfReception());

		return clone;
	}

	public int compareTo(TempNoTiceShipMessage tempNoTiceShipMessage) {
		int value = 0;

		if (getId() < tempNoTiceShipMessage.getId()) {
			value = -1;
		}
		else if (getId() > tempNoTiceShipMessage.getId()) {
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

		TempNoTiceShipMessageClp tempNoTiceShipMessage = null;

		try {
			tempNoTiceShipMessage = (TempNoTiceShipMessageClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempNoTiceShipMessage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(185);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", noticeShipType=");
		sb.append(getNoticeShipType());
		sb.append(", noticeShipCode=");
		sb.append(getNoticeShipCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", confirmTime=");
		sb.append(getConfirmTime());
		sb.append(", shipName=");
		sb.append(getShipName());
		sb.append(", shipTypeCode=");
		sb.append(getShipTypeCode());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", shipCaptain=");
		sb.append(getShipCaptain());
		sb.append(", imo=");
		sb.append(getImo());
		sb.append(", grt=");
		sb.append(getGrt());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", unitGRT=");
		sb.append(getUnitGRT());
		sb.append(", unitDWT=");
		sb.append(getUnitDWT());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", arrivalDate=");
		sb.append(getArrivalDate());
		sb.append(", arrivalPortCode=");
		sb.append(getArrivalPortCode());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portWharfCode=");
		sb.append(getPortWharfCode());
		sb.append(", portGoingToStateName=");
		sb.append(getPortGoingToStateName());
		sb.append(", portGoingToCode=");
		sb.append(getPortGoingToCode());
		sb.append(", nameOfShipOwners=");
		sb.append(getNameOfShipOwners());
		sb.append(", addressOfShipOwners=");
		sb.append(getAddressOfShipOwners());
		sb.append(", shipOwnerstateCode=");
		sb.append(getShipOwnerstateCode());
		sb.append(", shipOwnerPhone=");
		sb.append(getShipOwnerPhone());
		sb.append(", shipOwnerFax=");
		sb.append(getShipOwnerFax());
		sb.append(", shipOwnerEmail=");
		sb.append(getShipOwnerEmail());
		sb.append(", loa=");
		sb.append(getLoa());
		sb.append(", breadth=");
		sb.append(getBreadth());
		sb.append(", clearanceHeight=");
		sb.append(getClearanceHeight());
		sb.append(", shownDraftxF=");
		sb.append(getShownDraftxF());
		sb.append(", shownDraftxA=");
		sb.append(getShownDraftxA());
		sb.append(", unitLOA=");
		sb.append(getUnitLOA());
		sb.append(", unitBreadth=");
		sb.append(getUnitBreadth());
		sb.append(", unitClearanceHeight=");
		sb.append(getUnitClearanceHeight());
		sb.append(", unitShownDraftxF=");
		sb.append(getUnitShownDraftxF());
		sb.append(", unitShownDraftxA=");
		sb.append(getUnitShownDraftxA());
		sb.append(", certificateOfRegistryNumber=");
		sb.append(getCertificateOfRegistryNumber());
		sb.append(", certificateOfRegistryDate=");
		sb.append(getCertificateOfRegistryDate());
		sb.append(", certificateOfRegistryPortName=");
		sb.append(getCertificateOfRegistryPortName());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", shipAgencyAddress=");
		sb.append(getShipAgencyAddress());
		sb.append(", shipAgencyPhone=");
		sb.append(getShipAgencyPhone());
		sb.append(", shipAgencyFax=");
		sb.append(getShipAgencyFax());
		sb.append(", shipAgencyEmail=");
		sb.append(getShipAgencyEmail());
		sb.append(", purposeCode=");
		sb.append(getPurposeCode());
		sb.append(", purposeSpecified=");
		sb.append(getPurposeSpecified());
		sb.append(", crewNumber=");
		sb.append(getCrewNumber());
		sb.append(", unitCrew=");
		sb.append(getUnitCrew());
		sb.append(", passengerNumber=");
		sb.append(getPassengerNumber());
		sb.append(", unitPassenger=");
		sb.append(getUnitPassenger());
		sb.append(", quantityAndTypeOfCargo=");
		sb.append(getQuantityAndTypeOfCargo());
		sb.append(", unitQuantityofCargo=");
		sb.append(getUnitQuantityofCargo());
		sb.append(", typeOfCargo=");
		sb.append(getTypeOfCargo());
		sb.append(", otherPersons=");
		sb.append(getOtherPersons());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", nameOfShipAgent=");
		sb.append(getNameOfShipAgent());
		sb.append(", documentReference=");
		sb.append(getDocumentReference());
		sb.append(", isArrival=");
		sb.append(getIsArrival());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", netTonnage=");
		sb.append(getNetTonnage());
		sb.append(", netTonnageUnit=");
		sb.append(getNetTonnageUnit());
		sb.append(", positionOfShipInPort=");
		sb.append(getPositionOfShipInPort());
		sb.append(", briefParticularsOfVoyage=");
		sb.append(getBriefParticularsOfVoyage());
		sb.append(", previousPortsOfCall=");
		sb.append(getPreviousPortsOfCall());
		sb.append(", subsequentPortsOfCall=");
		sb.append(getSubsequentPortsOfCall());
		sb.append(", dischargedPorts=");
		sb.append(getDischargedPorts());
		sb.append(", remainingCargo=");
		sb.append(getRemainingCargo());
		sb.append(", shipRequirementsInTermsOfWaste=");
		sb.append(getShipRequirementsInTermsOfWaste());
		sb.append(", numberCargoDeclaration=");
		sb.append(getNumberCargoDeclaration());
		sb.append(", numberShipStoreDeclaration=");
		sb.append(getNumberShipStoreDeclaration());
		sb.append(", numberCrewList=");
		sb.append(getNumberCrewList());
		sb.append(", numberPassengerList=");
		sb.append(getNumberPassengerList());
		sb.append(", numberCrewEffectsDeclaration=");
		sb.append(getNumberCrewEffectsDeclaration());
		sb.append(", numberHealthMaritimeDeclaration=");
		sb.append(getNumberHealthMaritimeDeclaration());
		sb.append(", portClearanceNo=");
		sb.append(getPortClearanceNo());
		sb.append(", timeOfPORTArrival=");
		sb.append(getTimeOfPORTArrival());
		sb.append(", timeOfPilotOnBoard=");
		sb.append(getTimeOfPilotOnBoard());
		sb.append(", tugBoat=");
		sb.append(getTugBoat());
		sb.append(", do_=");
		sb.append(getDo_());
		sb.append(", fo=");
		sb.append(getFo());
		sb.append(", fw=");
		sb.append(getFw());
		sb.append(", placeOfReception=");
		sb.append(getPlaceOfReception());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(280);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage");
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
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noticeShipType</column-name><column-value><![CDATA[");
		sb.append(getNoticeShipType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noticeShipCode</column-name><column-value><![CDATA[");
		sb.append(getNoticeShipCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmTime</column-name><column-value><![CDATA[");
		sb.append(getConfirmTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipName</column-name><column-value><![CDATA[");
		sb.append(getShipName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeCode</column-name><column-value><![CDATA[");
		sb.append(getShipTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipCaptain</column-name><column-value><![CDATA[");
		sb.append(getShipCaptain());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imo</column-name><column-value><![CDATA[");
		sb.append(getImo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grt</column-name><column-value><![CDATA[");
		sb.append(getGrt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitGRT</column-name><column-value><![CDATA[");
		sb.append(getUnitGRT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDWT</column-name><column-value><![CDATA[");
		sb.append(getUnitDWT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalDate</column-name><column-value><![CDATA[");
		sb.append(getArrivalDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalPortCode</column-name><column-value><![CDATA[");
		sb.append(getArrivalPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfCode</column-name><column-value><![CDATA[");
		sb.append(getPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portGoingToStateName</column-name><column-value><![CDATA[");
		sb.append(getPortGoingToStateName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portGoingToCode</column-name><column-value><![CDATA[");
		sb.append(getPortGoingToCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipOwners</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipOwners());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressOfShipOwners</column-name><column-value><![CDATA[");
		sb.append(getAddressOfShipOwners());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerstateCode</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerstateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerPhone</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerFax</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerEmail</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loa</column-name><column-value><![CDATA[");
		sb.append(getLoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>breadth</column-name><column-value><![CDATA[");
		sb.append(getBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitLOA</column-name><column-value><![CDATA[");
		sb.append(getUnitLOA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitBreadth</column-name><column-value><![CDATA[");
		sb.append(getUnitBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitClearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getUnitClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOfRegistryNumber</column-name><column-value><![CDATA[");
		sb.append(getCertificateOfRegistryNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOfRegistryDate</column-name><column-value><![CDATA[");
		sb.append(getCertificateOfRegistryDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOfRegistryPortName</column-name><column-value><![CDATA[");
		sb.append(getCertificateOfRegistryPortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
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
		sb.append(
			"<column><column-name>purposeCode</column-name><column-value><![CDATA[");
		sb.append(getPurposeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeSpecified</column-name><column-value><![CDATA[");
		sb.append(getPurposeSpecified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewNumber</column-name><column-value><![CDATA[");
		sb.append(getCrewNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitCrew</column-name><column-value><![CDATA[");
		sb.append(getUnitCrew());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerNumber</column-name><column-value><![CDATA[");
		sb.append(getPassengerNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPassenger</column-name><column-value><![CDATA[");
		sb.append(getUnitPassenger());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantityAndTypeOfCargo</column-name><column-value><![CDATA[");
		sb.append(getQuantityAndTypeOfCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitQuantityofCargo</column-name><column-value><![CDATA[");
		sb.append(getUnitQuantityofCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeOfCargo</column-name><column-value><![CDATA[");
		sb.append(getTypeOfCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherPersons</column-name><column-value><![CDATA[");
		sb.append(getOtherPersons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSigned</column-name><column-value><![CDATA[");
		sb.append(getMasterSigned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSignedImage</column-name><column-value><![CDATA[");
		sb.append(getMasterSignedImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipAgent</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentReference</column-name><column-value><![CDATA[");
		sb.append(getDocumentReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isArrival</column-name><column-value><![CDATA[");
		sb.append(getIsArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voyageNumber</column-name><column-value><![CDATA[");
		sb.append(getVoyageNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnage</column-name><column-value><![CDATA[");
		sb.append(getNetTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getNetTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>positionOfShipInPort</column-name><column-value><![CDATA[");
		sb.append(getPositionOfShipInPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>briefParticularsOfVoyage</column-name><column-value><![CDATA[");
		sb.append(getBriefParticularsOfVoyage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>previousPortsOfCall</column-name><column-value><![CDATA[");
		sb.append(getPreviousPortsOfCall());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subsequentPortsOfCall</column-name><column-value><![CDATA[");
		sb.append(getSubsequentPortsOfCall());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dischargedPorts</column-name><column-value><![CDATA[");
		sb.append(getDischargedPorts());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remainingCargo</column-name><column-value><![CDATA[");
		sb.append(getRemainingCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipRequirementsInTermsOfWaste</column-name><column-value><![CDATA[");
		sb.append(getShipRequirementsInTermsOfWaste());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberCargoDeclaration</column-name><column-value><![CDATA[");
		sb.append(getNumberCargoDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberShipStoreDeclaration</column-name><column-value><![CDATA[");
		sb.append(getNumberShipStoreDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberCrewList</column-name><column-value><![CDATA[");
		sb.append(getNumberCrewList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberPassengerList</column-name><column-value><![CDATA[");
		sb.append(getNumberPassengerList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberCrewEffectsDeclaration</column-name><column-value><![CDATA[");
		sb.append(getNumberCrewEffectsDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberHealthMaritimeDeclaration</column-name><column-value><![CDATA[");
		sb.append(getNumberHealthMaritimeDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portClearanceNo</column-name><column-value><![CDATA[");
		sb.append(getPortClearanceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeOfPORTArrival</column-name><column-value><![CDATA[");
		sb.append(getTimeOfPORTArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeOfPilotOnBoard</column-name><column-value><![CDATA[");
		sb.append(getTimeOfPilotOnBoard());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tugBoat</column-name><column-value><![CDATA[");
		sb.append(getTugBoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>do_</column-name><column-value><![CDATA[");
		sb.append(getDo_());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fo</column-name><column-value><![CDATA[");
		sb.append(getFo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fw</column-name><column-value><![CDATA[");
		sb.append(getFw());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>placeOfReception</column-name><column-value><![CDATA[");
		sb.append(getPlaceOfReception());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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