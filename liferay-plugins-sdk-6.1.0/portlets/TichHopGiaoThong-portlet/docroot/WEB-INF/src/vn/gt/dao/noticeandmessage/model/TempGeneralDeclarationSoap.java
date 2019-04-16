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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempGeneralDeclarationServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempGeneralDeclarationServiceSoap
 * @generated
 */
public class TempGeneralDeclarationSoap implements Serializable {
	public static TempGeneralDeclarationSoap toSoapModel(
		TempGeneralDeclaration model) {
		TempGeneralDeclarationSoap soapModel = new TempGeneralDeclarationSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentReference(model.getDocumentReference());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setIsArrival(model.getIsArrival());
		soapModel.setNameOfShip(model.getNameOfShip());
		soapModel.setShipTypeCode(model.getShipTypeCode());
		soapModel.setImoNumber(model.getImoNumber());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setVoyageNumber(model.getVoyageNumber());
		soapModel.setPortOfArrivalCode(model.getPortOfArrivalCode());
		soapModel.setDateOfArrival(model.getDateOfArrival());
		soapModel.setPortHarbourCode(model.getPortHarbourCode());
		soapModel.setPortRegionCode(model.getPortRegionCode());
		soapModel.setPortWharfCode(model.getPortWharfCode());
		soapModel.setFlagStateOfShip(model.getFlagStateOfShip());
		soapModel.setNameOfMaster(model.getNameOfMaster());
		soapModel.setLastPortOfCallCode(model.getLastPortOfCallCode());
		soapModel.setCertificateOfRegistryNumber(model.getCertificateOfRegistryNumber());
		soapModel.setCertificateOfRegistryDate(model.getCertificateOfRegistryDate());
		soapModel.setCertificateOfRegistryPortName(model.getCertificateOfRegistryPortName());
		soapModel.setTaxCodeOfShipownersAgents(model.getTaxCodeOfShipownersAgents());
		soapModel.setNameOfShipownersAgents(model.getNameOfShipownersAgents());
		soapModel.setShipAgencyAddress(model.getShipAgencyAddress());
		soapModel.setShipAgencyPhone(model.getShipAgencyPhone());
		soapModel.setShipAgencyFax(model.getShipAgencyFax());
		soapModel.setShipAgencyEmail(model.getShipAgencyEmail());
		soapModel.setGrossTonnage(model.getGrossTonnage());
		soapModel.setNetTonnage(model.getNetTonnage());
		soapModel.setPositionOfShipInport(model.getPositionOfShipInport());
		soapModel.setBriefParticularsOfVoyage(model.getBriefParticularsOfVoyage());
		soapModel.setPreviousPortsOfCall(model.getPreviousPortsOfCall());
		soapModel.setSubsequentPortsOfCall(model.getSubsequentPortsOfCall());
		soapModel.setDischargedPorts(model.getDischargedPorts());
		soapModel.setRemainingCargo(model.getRemainingCargo());
		soapModel.setBriefDescriptionOfTheCargo(model.getBriefDescriptionOfTheCargo());
		soapModel.setNumberOfCrew(model.getNumberOfCrew());
		soapModel.setNumberOfPassengers(model.getNumberOfPassengers());
		soapModel.setShipRequirementsInTermsOfWaste(model.getShipRequirementsInTermsOfWaste());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setNumberCargoDeclaration(model.getNumberCargoDeclaration());
		soapModel.setNumberShipStoreDeclaration(model.getNumberShipStoreDeclaration());
		soapModel.setNumberCrewList(model.getNumberCrewList());
		soapModel.setNumberPassengerList(model.getNumberPassengerList());
		soapModel.setNumberCrewEffects(model.getNumberCrewEffects());
		soapModel.setNumberHealthMaritime(model.getNumberHealthMaritime());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setMasterSigned(model.getMasterSigned());
		soapModel.setMasterSignedImage(model.getMasterSignedImage());
		soapModel.setCargoOnBoard(model.getCargoOnBoard());
		soapModel.setCargo(model.getCargo());
		soapModel.setVolumeCargo(model.getVolumeCargo());
		soapModel.setCargoUnit(model.getCargoUnit());
		soapModel.setCargoDescription(model.getCargoDescription());
		soapModel.setRatedPower(model.getRatedPower());
		soapModel.setSeatingCapacity(model.getSeatingCapacity());
		soapModel.setLyingCapacity(model.getLyingCapacity());
		soapModel.setMaritimePortCode(model.getMaritimePortCode());
		soapModel.setLastProvinceCode(model.getLastProvinceCode());
		soapModel.setNextProvinceCode(model.getNextProvinceCode());
		soapModel.setLastMaritimePortCode(model.getLastMaritimePortCode());
		soapModel.setLastPortRegionCode(model.getLastPortRegionCode());
		soapModel.setLastPortHarbourCode(model.getLastPortHarbourCode());
		soapModel.setLastPortWharfCode(model.getLastPortWharfCode());
		soapModel.setNextMaritimePortCode(model.getNextMaritimePortCode());
		soapModel.setNextPortRegionCode(model.getNextPortRegionCode());
		soapModel.setNextPortHarbourCode(model.getNextPortHarbourCode());
		soapModel.setNextPortWharfCode(model.getNextPortWharfCode());
		soapModel.setLink(model.getLink());
		soapModel.setQrCode(model.getQrCode());
		soapModel.setPortClearanceNo(model.getPortClearanceNo());
		soapModel.setLoa(model.getLoa());
		soapModel.setUnitLOA(model.getUnitLOA());
		soapModel.setBreadth(model.getBreadth());
		soapModel.setUnitBreadth(model.getUnitBreadth());
		soapModel.setClearanceHeight(model.getClearanceHeight());
		soapModel.setUnitClearanceHeight(model.getUnitClearanceHeight());
		soapModel.setShownDraftxF(model.getShownDraftxF());
		soapModel.setUnitShownDraftxF(model.getUnitShownDraftxF());
		soapModel.setShownDraftxA(model.getShownDraftxA());
		soapModel.setUnitShownDraftxA(model.getUnitShownDraftxA());
		soapModel.setDwt(model.getDwt());
		soapModel.setUnitDWT(model.getUnitDWT());
		soapModel.setTimeOfPORTArrival(model.getTimeOfPORTArrival());
		soapModel.setTimeOfPilotOnBoard(model.getTimeOfPilotOnBoard());
		soapModel.setTugBoat(model.getTugBoat());
		soapModel.setDo_(model.getDo_());
		soapModel.setFo(model.getFo());
		soapModel.setFw(model.getFw());
		soapModel.setPlaceOfReception(model.getPlaceOfReception());
		soapModel.setNameOfShipOwners(model.getNameOfShipOwners());
		soapModel.setAddressOfShipOwners(model.getAddressOfShipOwners());

		return soapModel;
	}

	public static TempGeneralDeclarationSoap[] toSoapModels(
		TempGeneralDeclaration[] models) {
		TempGeneralDeclarationSoap[] soapModels = new TempGeneralDeclarationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempGeneralDeclarationSoap[][] toSoapModels(
		TempGeneralDeclaration[][] models) {
		TempGeneralDeclarationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempGeneralDeclarationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempGeneralDeclarationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempGeneralDeclarationSoap[] toSoapModels(
		List<TempGeneralDeclaration> models) {
		List<TempGeneralDeclarationSoap> soapModels = new ArrayList<TempGeneralDeclarationSoap>(models.size());

		for (TempGeneralDeclaration model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempGeneralDeclarationSoap[soapModels.size()]);
	}

	public TempGeneralDeclarationSoap() {
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

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public long getDocumentReference() {
		return _documentReference;
	}

	public void setDocumentReference(long documentReference) {
		_documentReference = documentReference;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	public int getIsArrival() {
		return _isArrival;
	}

	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;
	}

	public String getNameOfShip() {
		return _nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	public String getShipTypeCode() {
		return _shipTypeCode;
	}

	public void setShipTypeCode(String shipTypeCode) {
		_shipTypeCode = shipTypeCode;
	}

	public String getImoNumber() {
		return _imoNumber;
	}

	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public String getVoyageNumber() {
		return _voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;
	}

	public String getPortOfArrivalCode() {
		return _portOfArrivalCode;
	}

	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;
	}

	public Date getDateOfArrival() {
		return _dateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		_dateOfArrival = dateOfArrival;
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

	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	public String getLastPortOfCallCode() {
		return _lastPortOfCallCode;
	}

	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;
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

	public double getGrossTonnage() {
		return _grossTonnage;
	}

	public void setGrossTonnage(double grossTonnage) {
		_grossTonnage = grossTonnage;
	}

	public double getNetTonnage() {
		return _netTonnage;
	}

	public void setNetTonnage(double netTonnage) {
		_netTonnage = netTonnage;
	}

	public String getPositionOfShipInport() {
		return _positionOfShipInport;
	}

	public void setPositionOfShipInport(String positionOfShipInport) {
		_positionOfShipInport = positionOfShipInport;
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

	public String getBriefDescriptionOfTheCargo() {
		return _briefDescriptionOfTheCargo;
	}

	public void setBriefDescriptionOfTheCargo(String briefDescriptionOfTheCargo) {
		_briefDescriptionOfTheCargo = briefDescriptionOfTheCargo;
	}

	public int getNumberOfCrew() {
		return _numberOfCrew;
	}

	public void setNumberOfCrew(int numberOfCrew) {
		_numberOfCrew = numberOfCrew;
	}

	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;
	}

	public String getShipRequirementsInTermsOfWaste() {
		return _shipRequirementsInTermsOfWaste;
	}

	public void setShipRequirementsInTermsOfWaste(
		String shipRequirementsInTermsOfWaste) {
		_shipRequirementsInTermsOfWaste = shipRequirementsInTermsOfWaste;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getNumberCargoDeclaration() {
		return _numberCargoDeclaration;
	}

	public void setNumberCargoDeclaration(String numberCargoDeclaration) {
		_numberCargoDeclaration = numberCargoDeclaration;
	}

	public String getNumberShipStoreDeclaration() {
		return _numberShipStoreDeclaration;
	}

	public void setNumberShipStoreDeclaration(String numberShipStoreDeclaration) {
		_numberShipStoreDeclaration = numberShipStoreDeclaration;
	}

	public String getNumberCrewList() {
		return _numberCrewList;
	}

	public void setNumberCrewList(String numberCrewList) {
		_numberCrewList = numberCrewList;
	}

	public String getNumberPassengerList() {
		return _numberPassengerList;
	}

	public void setNumberPassengerList(String numberPassengerList) {
		_numberPassengerList = numberPassengerList;
	}

	public String getNumberCrewEffects() {
		return _numberCrewEffects;
	}

	public void setNumberCrewEffects(String numberCrewEffects) {
		_numberCrewEffects = numberCrewEffects;
	}

	public String getNumberHealthMaritime() {
		return _numberHealthMaritime;
	}

	public void setNumberHealthMaritime(String numberHealthMaritime) {
		_numberHealthMaritime = numberHealthMaritime;
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

	public String getCargoOnBoard() {
		return _CargoOnBoard;
	}

	public void setCargoOnBoard(String CargoOnBoard) {
		_CargoOnBoard = CargoOnBoard;
	}

	public String getCargo() {
		return _Cargo;
	}

	public void setCargo(String Cargo) {
		_Cargo = Cargo;
	}

	public double getVolumeCargo() {
		return _VolumeCargo;
	}

	public void setVolumeCargo(double VolumeCargo) {
		_VolumeCargo = VolumeCargo;
	}

	public String getCargoUnit() {
		return _CargoUnit;
	}

	public void setCargoUnit(String CargoUnit) {
		_CargoUnit = CargoUnit;
	}

	public String getCargoDescription() {
		return _CargoDescription;
	}

	public void setCargoDescription(String CargoDescription) {
		_CargoDescription = CargoDescription;
	}

	public String getRatedPower() {
		return _ratedPower;
	}

	public void setRatedPower(String ratedPower) {
		_ratedPower = ratedPower;
	}

	public String getSeatingCapacity() {
		return _seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		_seatingCapacity = seatingCapacity;
	}

	public String getLyingCapacity() {
		return _lyingCapacity;
	}

	public void setLyingCapacity(String lyingCapacity) {
		_lyingCapacity = lyingCapacity;
	}

	public String getMaritimePortCode() {
		return _maritimePortCode;
	}

	public void setMaritimePortCode(String maritimePortCode) {
		_maritimePortCode = maritimePortCode;
	}

	public String getLastProvinceCode() {
		return _lastProvinceCode;
	}

	public void setLastProvinceCode(String lastProvinceCode) {
		_lastProvinceCode = lastProvinceCode;
	}

	public String getNextProvinceCode() {
		return _nextProvinceCode;
	}

	public void setNextProvinceCode(String nextProvinceCode) {
		_nextProvinceCode = nextProvinceCode;
	}

	public String getLastMaritimePortCode() {
		return _lastMaritimePortCode;
	}

	public void setLastMaritimePortCode(String lastMaritimePortCode) {
		_lastMaritimePortCode = lastMaritimePortCode;
	}

	public String getLastPortRegionCode() {
		return _lastPortRegionCode;
	}

	public void setLastPortRegionCode(String lastPortRegionCode) {
		_lastPortRegionCode = lastPortRegionCode;
	}

	public String getLastPortHarbourCode() {
		return _lastPortHarbourCode;
	}

	public void setLastPortHarbourCode(String lastPortHarbourCode) {
		_lastPortHarbourCode = lastPortHarbourCode;
	}

	public String getLastPortWharfCode() {
		return _lastPortWharfCode;
	}

	public void setLastPortWharfCode(String lastPortWharfCode) {
		_lastPortWharfCode = lastPortWharfCode;
	}

	public String getNextMaritimePortCode() {
		return _nextMaritimePortCode;
	}

	public void setNextMaritimePortCode(String nextMaritimePortCode) {
		_nextMaritimePortCode = nextMaritimePortCode;
	}

	public String getNextPortRegionCode() {
		return _nextPortRegionCode;
	}

	public void setNextPortRegionCode(String nextPortRegionCode) {
		_nextPortRegionCode = nextPortRegionCode;
	}

	public String getNextPortHarbourCode() {
		return _nextPortHarbourCode;
	}

	public void setNextPortHarbourCode(String nextPortHarbourCode) {
		_nextPortHarbourCode = nextPortHarbourCode;
	}

	public String getNextPortWharfCode() {
		return _nextPortWharfCode;
	}

	public void setNextPortWharfCode(String nextPortWharfCode) {
		_nextPortWharfCode = nextPortWharfCode;
	}

	public String getLink() {
		return _link;
	}

	public void setLink(String link) {
		_link = link;
	}

	public String getQrCode() {
		return _qrCode;
	}

	public void setQrCode(String qrCode) {
		_qrCode = qrCode;
	}

	public String getPortClearanceNo() {
		return _portClearanceNo;
	}

	public void setPortClearanceNo(String portClearanceNo) {
		_portClearanceNo = portClearanceNo;
	}

	public double getLoa() {
		return _loa;
	}

	public void setLoa(double loa) {
		_loa = loa;
	}

	public String getUnitLOA() {
		return _unitLOA;
	}

	public void setUnitLOA(String unitLOA) {
		_unitLOA = unitLOA;
	}

	public double getBreadth() {
		return _breadth;
	}

	public void setBreadth(double breadth) {
		_breadth = breadth;
	}

	public String getUnitBreadth() {
		return _unitBreadth;
	}

	public void setUnitBreadth(String unitBreadth) {
		_unitBreadth = unitBreadth;
	}

	public double getClearanceHeight() {
		return _clearanceHeight;
	}

	public void setClearanceHeight(double clearanceHeight) {
		_clearanceHeight = clearanceHeight;
	}

	public String getUnitClearanceHeight() {
		return _unitClearanceHeight;
	}

	public void setUnitClearanceHeight(String unitClearanceHeight) {
		_unitClearanceHeight = unitClearanceHeight;
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

	public double getDwt() {
		return _dwt;
	}

	public void setDwt(double dwt) {
		_dwt = dwt;
	}

	public String getUnitDWT() {
		return _unitDWT;
	}

	public void setUnitDWT(String unitDWT) {
		_unitDWT = unitDWT;
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

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private long _documentReference;
	private int _documentYear;
	private String _userCreated;
	private int _isArrival;
	private String _nameOfShip;
	private String _shipTypeCode;
	private String _imoNumber;
	private String _callSign;
	private String _voyageNumber;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _portHarbourCode;
	private String _portRegionCode;
	private String _portWharfCode;
	private String _flagStateOfShip;
	private String _nameOfMaster;
	private String _lastPortOfCallCode;
	private String _certificateOfRegistryNumber;
	private Date _certificateOfRegistryDate;
	private String _certificateOfRegistryPortName;
	private String _taxCodeOfShipownersAgents;
	private String _nameOfShipownersAgents;
	private String _shipAgencyAddress;
	private String _shipAgencyPhone;
	private String _shipAgencyFax;
	private String _shipAgencyEmail;
	private double _grossTonnage;
	private double _netTonnage;
	private String _positionOfShipInport;
	private String _briefParticularsOfVoyage;
	private String _previousPortsOfCall;
	private String _subsequentPortsOfCall;
	private String _dischargedPorts;
	private String _remainingCargo;
	private String _briefDescriptionOfTheCargo;
	private int _numberOfCrew;
	private int _numberOfPassengers;
	private String _shipRequirementsInTermsOfWaste;
	private String _remarks;
	private String _numberCargoDeclaration;
	private String _numberShipStoreDeclaration;
	private String _numberCrewList;
	private String _numberPassengerList;
	private String _numberCrewEffects;
	private String _numberHealthMaritime;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private String _CargoOnBoard;
	private String _Cargo;
	private double _VolumeCargo;
	private String _CargoUnit;
	private String _CargoDescription;
	private String _ratedPower;
	private String _seatingCapacity;
	private String _lyingCapacity;
	private String _maritimePortCode;
	private String _lastProvinceCode;
	private String _nextProvinceCode;
	private String _lastMaritimePortCode;
	private String _lastPortRegionCode;
	private String _lastPortHarbourCode;
	private String _lastPortWharfCode;
	private String _nextMaritimePortCode;
	private String _nextPortRegionCode;
	private String _nextPortHarbourCode;
	private String _nextPortWharfCode;
	private String _link;
	private String _qrCode;
	private String _portClearanceNo;
	private double _loa;
	private String _unitLOA;
	private double _breadth;
	private String _unitBreadth;
	private double _clearanceHeight;
	private String _unitClearanceHeight;
	private double _shownDraftxF;
	private String _unitShownDraftxF;
	private double _shownDraftxA;
	private String _unitShownDraftxA;
	private double _dwt;
	private String _unitDWT;
	private Date _timeOfPORTArrival;
	private Date _timeOfPilotOnBoard;
	private String _tugBoat;
	private String _do_;
	private String _fo;
	private String _fw;
	private String _placeOfReception;
	private String _nameOfShipOwners;
	private String _addressOfShipOwners;
}