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

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempGeneralDeclaration}.
 * </p>
 *
 * @author    win_64
 * @see       TempGeneralDeclaration
 * @generated
 */
public class TempGeneralDeclarationWrapper implements TempGeneralDeclaration,
	ModelWrapper<TempGeneralDeclaration> {
	public TempGeneralDeclarationWrapper(
		TempGeneralDeclaration tempGeneralDeclaration) {
		_tempGeneralDeclaration = tempGeneralDeclaration;
	}

	public Class<?> getModelClass() {
		return TempGeneralDeclaration.class;
	}

	public String getModelClassName() {
		return TempGeneralDeclaration.class.getName();
	}

	/**
	* Returns the primary key of this temp general declaration.
	*
	* @return the primary key of this temp general declaration
	*/
	public long getPrimaryKey() {
		return _tempGeneralDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp general declaration.
	*
	* @param primaryKey the primary key of this temp general declaration
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempGeneralDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp general declaration.
	*
	* @return the ID of this temp general declaration
	*/
	public long getId() {
		return _tempGeneralDeclaration.getId();
	}

	/**
	* Sets the ID of this temp general declaration.
	*
	* @param id the ID of this temp general declaration
	*/
	public void setId(long id) {
		_tempGeneralDeclaration.setId(id);
	}

	/**
	* Returns the request code of this temp general declaration.
	*
	* @return the request code of this temp general declaration
	*/
	public java.lang.String getRequestCode() {
		return _tempGeneralDeclaration.getRequestCode();
	}

	/**
	* Sets the request code of this temp general declaration.
	*
	* @param requestCode the request code of this temp general declaration
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempGeneralDeclaration.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp general declaration.
	*
	* @return the request state of this temp general declaration
	*/
	public int getRequestState() {
		return _tempGeneralDeclaration.getRequestState();
	}

	/**
	* Sets the request state of this temp general declaration.
	*
	* @param requestState the request state of this temp general declaration
	*/
	public void setRequestState(int requestState) {
		_tempGeneralDeclaration.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp general declaration.
	*
	* @return the document name of this temp general declaration
	*/
	public long getDocumentName() {
		return _tempGeneralDeclaration.getDocumentName();
	}

	/**
	* Sets the document name of this temp general declaration.
	*
	* @param documentName the document name of this temp general declaration
	*/
	public void setDocumentName(long documentName) {
		_tempGeneralDeclaration.setDocumentName(documentName);
	}

	/**
	* Returns the document reference of this temp general declaration.
	*
	* @return the document reference of this temp general declaration
	*/
	public long getDocumentReference() {
		return _tempGeneralDeclaration.getDocumentReference();
	}

	/**
	* Sets the document reference of this temp general declaration.
	*
	* @param documentReference the document reference of this temp general declaration
	*/
	public void setDocumentReference(long documentReference) {
		_tempGeneralDeclaration.setDocumentReference(documentReference);
	}

	/**
	* Returns the document year of this temp general declaration.
	*
	* @return the document year of this temp general declaration
	*/
	public int getDocumentYear() {
		return _tempGeneralDeclaration.getDocumentYear();
	}

	/**
	* Sets the document year of this temp general declaration.
	*
	* @param documentYear the document year of this temp general declaration
	*/
	public void setDocumentYear(int documentYear) {
		_tempGeneralDeclaration.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp general declaration.
	*
	* @return the user created of this temp general declaration
	*/
	public java.lang.String getUserCreated() {
		return _tempGeneralDeclaration.getUserCreated();
	}

	/**
	* Sets the user created of this temp general declaration.
	*
	* @param userCreated the user created of this temp general declaration
	*/
	public void setUserCreated(java.lang.String userCreated) {
		_tempGeneralDeclaration.setUserCreated(userCreated);
	}

	/**
	* Returns the is arrival of this temp general declaration.
	*
	* @return the is arrival of this temp general declaration
	*/
	public int getIsArrival() {
		return _tempGeneralDeclaration.getIsArrival();
	}

	/**
	* Sets the is arrival of this temp general declaration.
	*
	* @param isArrival the is arrival of this temp general declaration
	*/
	public void setIsArrival(int isArrival) {
		_tempGeneralDeclaration.setIsArrival(isArrival);
	}

	/**
	* Returns the name of ship of this temp general declaration.
	*
	* @return the name of ship of this temp general declaration
	*/
	public java.lang.String getNameOfShip() {
		return _tempGeneralDeclaration.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp general declaration.
	*
	* @param nameOfShip the name of ship of this temp general declaration
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempGeneralDeclaration.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the ship type code of this temp general declaration.
	*
	* @return the ship type code of this temp general declaration
	*/
	public java.lang.String getShipTypeCode() {
		return _tempGeneralDeclaration.getShipTypeCode();
	}

	/**
	* Sets the ship type code of this temp general declaration.
	*
	* @param shipTypeCode the ship type code of this temp general declaration
	*/
	public void setShipTypeCode(java.lang.String shipTypeCode) {
		_tempGeneralDeclaration.setShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the imo number of this temp general declaration.
	*
	* @return the imo number of this temp general declaration
	*/
	public java.lang.String getImoNumber() {
		return _tempGeneralDeclaration.getImoNumber();
	}

	/**
	* Sets the imo number of this temp general declaration.
	*
	* @param imoNumber the imo number of this temp general declaration
	*/
	public void setImoNumber(java.lang.String imoNumber) {
		_tempGeneralDeclaration.setImoNumber(imoNumber);
	}

	/**
	* Returns the call sign of this temp general declaration.
	*
	* @return the call sign of this temp general declaration
	*/
	public java.lang.String getCallSign() {
		return _tempGeneralDeclaration.getCallSign();
	}

	/**
	* Sets the call sign of this temp general declaration.
	*
	* @param callSign the call sign of this temp general declaration
	*/
	public void setCallSign(java.lang.String callSign) {
		_tempGeneralDeclaration.setCallSign(callSign);
	}

	/**
	* Returns the voyage number of this temp general declaration.
	*
	* @return the voyage number of this temp general declaration
	*/
	public java.lang.String getVoyageNumber() {
		return _tempGeneralDeclaration.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp general declaration.
	*
	* @param voyageNumber the voyage number of this temp general declaration
	*/
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempGeneralDeclaration.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the port of arrival code of this temp general declaration.
	*
	* @return the port of arrival code of this temp general declaration
	*/
	public java.lang.String getPortOfArrivalCode() {
		return _tempGeneralDeclaration.getPortOfArrivalCode();
	}

	/**
	* Sets the port of arrival code of this temp general declaration.
	*
	* @param portOfArrivalCode the port of arrival code of this temp general declaration
	*/
	public void setPortOfArrivalCode(java.lang.String portOfArrivalCode) {
		_tempGeneralDeclaration.setPortOfArrivalCode(portOfArrivalCode);
	}

	/**
	* Returns the date of arrival of this temp general declaration.
	*
	* @return the date of arrival of this temp general declaration
	*/
	public java.util.Date getDateOfArrival() {
		return _tempGeneralDeclaration.getDateOfArrival();
	}

	/**
	* Sets the date of arrival of this temp general declaration.
	*
	* @param dateOfArrival the date of arrival of this temp general declaration
	*/
	public void setDateOfArrival(java.util.Date dateOfArrival) {
		_tempGeneralDeclaration.setDateOfArrival(dateOfArrival);
	}

	/**
	* Returns the port harbour code of this temp general declaration.
	*
	* @return the port harbour code of this temp general declaration
	*/
	public java.lang.String getPortHarbourCode() {
		return _tempGeneralDeclaration.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this temp general declaration.
	*
	* @param portHarbourCode the port harbour code of this temp general declaration
	*/
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_tempGeneralDeclaration.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port region code of this temp general declaration.
	*
	* @return the port region code of this temp general declaration
	*/
	public java.lang.String getPortRegionCode() {
		return _tempGeneralDeclaration.getPortRegionCode();
	}

	/**
	* Sets the port region code of this temp general declaration.
	*
	* @param portRegionCode the port region code of this temp general declaration
	*/
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_tempGeneralDeclaration.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the port wharf code of this temp general declaration.
	*
	* @return the port wharf code of this temp general declaration
	*/
	public java.lang.String getPortWharfCode() {
		return _tempGeneralDeclaration.getPortWharfCode();
	}

	/**
	* Sets the port wharf code of this temp general declaration.
	*
	* @param portWharfCode the port wharf code of this temp general declaration
	*/
	public void setPortWharfCode(java.lang.String portWharfCode) {
		_tempGeneralDeclaration.setPortWharfCode(portWharfCode);
	}

	/**
	* Returns the flag state of ship of this temp general declaration.
	*
	* @return the flag state of ship of this temp general declaration
	*/
	public java.lang.String getFlagStateOfShip() {
		return _tempGeneralDeclaration.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp general declaration.
	*
	* @param flagStateOfShip the flag state of ship of this temp general declaration
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempGeneralDeclaration.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp general declaration.
	*
	* @return the name of master of this temp general declaration
	*/
	public java.lang.String getNameOfMaster() {
		return _tempGeneralDeclaration.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp general declaration.
	*
	* @param nameOfMaster the name of master of this temp general declaration
	*/
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempGeneralDeclaration.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the last port of call code of this temp general declaration.
	*
	* @return the last port of call code of this temp general declaration
	*/
	public java.lang.String getLastPortOfCallCode() {
		return _tempGeneralDeclaration.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp general declaration.
	*
	* @param lastPortOfCallCode the last port of call code of this temp general declaration
	*/
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempGeneralDeclaration.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the certificate of registry number of this temp general declaration.
	*
	* @return the certificate of registry number of this temp general declaration
	*/
	public java.lang.String getCertificateOfRegistryNumber() {
		return _tempGeneralDeclaration.getCertificateOfRegistryNumber();
	}

	/**
	* Sets the certificate of registry number of this temp general declaration.
	*
	* @param certificateOfRegistryNumber the certificate of registry number of this temp general declaration
	*/
	public void setCertificateOfRegistryNumber(
		java.lang.String certificateOfRegistryNumber) {
		_tempGeneralDeclaration.setCertificateOfRegistryNumber(certificateOfRegistryNumber);
	}

	/**
	* Returns the certificate of registry date of this temp general declaration.
	*
	* @return the certificate of registry date of this temp general declaration
	*/
	public java.util.Date getCertificateOfRegistryDate() {
		return _tempGeneralDeclaration.getCertificateOfRegistryDate();
	}

	/**
	* Sets the certificate of registry date of this temp general declaration.
	*
	* @param certificateOfRegistryDate the certificate of registry date of this temp general declaration
	*/
	public void setCertificateOfRegistryDate(
		java.util.Date certificateOfRegistryDate) {
		_tempGeneralDeclaration.setCertificateOfRegistryDate(certificateOfRegistryDate);
	}

	/**
	* Returns the certificate of registry port name of this temp general declaration.
	*
	* @return the certificate of registry port name of this temp general declaration
	*/
	public java.lang.String getCertificateOfRegistryPortName() {
		return _tempGeneralDeclaration.getCertificateOfRegistryPortName();
	}

	/**
	* Sets the certificate of registry port name of this temp general declaration.
	*
	* @param certificateOfRegistryPortName the certificate of registry port name of this temp general declaration
	*/
	public void setCertificateOfRegistryPortName(
		java.lang.String certificateOfRegistryPortName) {
		_tempGeneralDeclaration.setCertificateOfRegistryPortName(certificateOfRegistryPortName);
	}

	/**
	* Returns the tax code of shipowners agents of this temp general declaration.
	*
	* @return the tax code of shipowners agents of this temp general declaration
	*/
	public java.lang.String getTaxCodeOfShipownersAgents() {
		return _tempGeneralDeclaration.getTaxCodeOfShipownersAgents();
	}

	/**
	* Sets the tax code of shipowners agents of this temp general declaration.
	*
	* @param taxCodeOfShipownersAgents the tax code of shipowners agents of this temp general declaration
	*/
	public void setTaxCodeOfShipownersAgents(
		java.lang.String taxCodeOfShipownersAgents) {
		_tempGeneralDeclaration.setTaxCodeOfShipownersAgents(taxCodeOfShipownersAgents);
	}

	/**
	* Returns the name of shipowners agents of this temp general declaration.
	*
	* @return the name of shipowners agents of this temp general declaration
	*/
	public java.lang.String getNameOfShipownersAgents() {
		return _tempGeneralDeclaration.getNameOfShipownersAgents();
	}

	/**
	* Sets the name of shipowners agents of this temp general declaration.
	*
	* @param nameOfShipownersAgents the name of shipowners agents of this temp general declaration
	*/
	public void setNameOfShipownersAgents(
		java.lang.String nameOfShipownersAgents) {
		_tempGeneralDeclaration.setNameOfShipownersAgents(nameOfShipownersAgents);
	}

	/**
	* Returns the ship agency address of this temp general declaration.
	*
	* @return the ship agency address of this temp general declaration
	*/
	public java.lang.String getShipAgencyAddress() {
		return _tempGeneralDeclaration.getShipAgencyAddress();
	}

	/**
	* Sets the ship agency address of this temp general declaration.
	*
	* @param shipAgencyAddress the ship agency address of this temp general declaration
	*/
	public void setShipAgencyAddress(java.lang.String shipAgencyAddress) {
		_tempGeneralDeclaration.setShipAgencyAddress(shipAgencyAddress);
	}

	/**
	* Returns the ship agency phone of this temp general declaration.
	*
	* @return the ship agency phone of this temp general declaration
	*/
	public java.lang.String getShipAgencyPhone() {
		return _tempGeneralDeclaration.getShipAgencyPhone();
	}

	/**
	* Sets the ship agency phone of this temp general declaration.
	*
	* @param shipAgencyPhone the ship agency phone of this temp general declaration
	*/
	public void setShipAgencyPhone(java.lang.String shipAgencyPhone) {
		_tempGeneralDeclaration.setShipAgencyPhone(shipAgencyPhone);
	}

	/**
	* Returns the ship agency fax of this temp general declaration.
	*
	* @return the ship agency fax of this temp general declaration
	*/
	public java.lang.String getShipAgencyFax() {
		return _tempGeneralDeclaration.getShipAgencyFax();
	}

	/**
	* Sets the ship agency fax of this temp general declaration.
	*
	* @param shipAgencyFax the ship agency fax of this temp general declaration
	*/
	public void setShipAgencyFax(java.lang.String shipAgencyFax) {
		_tempGeneralDeclaration.setShipAgencyFax(shipAgencyFax);
	}

	/**
	* Returns the ship agency email of this temp general declaration.
	*
	* @return the ship agency email of this temp general declaration
	*/
	public java.lang.String getShipAgencyEmail() {
		return _tempGeneralDeclaration.getShipAgencyEmail();
	}

	/**
	* Sets the ship agency email of this temp general declaration.
	*
	* @param shipAgencyEmail the ship agency email of this temp general declaration
	*/
	public void setShipAgencyEmail(java.lang.String shipAgencyEmail) {
		_tempGeneralDeclaration.setShipAgencyEmail(shipAgencyEmail);
	}

	/**
	* Returns the gross tonnage of this temp general declaration.
	*
	* @return the gross tonnage of this temp general declaration
	*/
	public double getGrossTonnage() {
		return _tempGeneralDeclaration.getGrossTonnage();
	}

	/**
	* Sets the gross tonnage of this temp general declaration.
	*
	* @param grossTonnage the gross tonnage of this temp general declaration
	*/
	public void setGrossTonnage(double grossTonnage) {
		_tempGeneralDeclaration.setGrossTonnage(grossTonnage);
	}

	/**
	* Returns the net tonnage of this temp general declaration.
	*
	* @return the net tonnage of this temp general declaration
	*/
	public double getNetTonnage() {
		return _tempGeneralDeclaration.getNetTonnage();
	}

	/**
	* Sets the net tonnage of this temp general declaration.
	*
	* @param netTonnage the net tonnage of this temp general declaration
	*/
	public void setNetTonnage(double netTonnage) {
		_tempGeneralDeclaration.setNetTonnage(netTonnage);
	}

	/**
	* Returns the position of ship inport of this temp general declaration.
	*
	* @return the position of ship inport of this temp general declaration
	*/
	public java.lang.String getPositionOfShipInport() {
		return _tempGeneralDeclaration.getPositionOfShipInport();
	}

	/**
	* Sets the position of ship inport of this temp general declaration.
	*
	* @param positionOfShipInport the position of ship inport of this temp general declaration
	*/
	public void setPositionOfShipInport(java.lang.String positionOfShipInport) {
		_tempGeneralDeclaration.setPositionOfShipInport(positionOfShipInport);
	}

	/**
	* Returns the brief particulars of voyage of this temp general declaration.
	*
	* @return the brief particulars of voyage of this temp general declaration
	*/
	public java.lang.String getBriefParticularsOfVoyage() {
		return _tempGeneralDeclaration.getBriefParticularsOfVoyage();
	}

	/**
	* Sets the brief particulars of voyage of this temp general declaration.
	*
	* @param briefParticularsOfVoyage the brief particulars of voyage of this temp general declaration
	*/
	public void setBriefParticularsOfVoyage(
		java.lang.String briefParticularsOfVoyage) {
		_tempGeneralDeclaration.setBriefParticularsOfVoyage(briefParticularsOfVoyage);
	}

	/**
	* Returns the previous ports of call of this temp general declaration.
	*
	* @return the previous ports of call of this temp general declaration
	*/
	public java.lang.String getPreviousPortsOfCall() {
		return _tempGeneralDeclaration.getPreviousPortsOfCall();
	}

	/**
	* Sets the previous ports of call of this temp general declaration.
	*
	* @param previousPortsOfCall the previous ports of call of this temp general declaration
	*/
	public void setPreviousPortsOfCall(java.lang.String previousPortsOfCall) {
		_tempGeneralDeclaration.setPreviousPortsOfCall(previousPortsOfCall);
	}

	/**
	* Returns the subsequent ports of call of this temp general declaration.
	*
	* @return the subsequent ports of call of this temp general declaration
	*/
	public java.lang.String getSubsequentPortsOfCall() {
		return _tempGeneralDeclaration.getSubsequentPortsOfCall();
	}

	/**
	* Sets the subsequent ports of call of this temp general declaration.
	*
	* @param subsequentPortsOfCall the subsequent ports of call of this temp general declaration
	*/
	public void setSubsequentPortsOfCall(java.lang.String subsequentPortsOfCall) {
		_tempGeneralDeclaration.setSubsequentPortsOfCall(subsequentPortsOfCall);
	}

	/**
	* Returns the discharged ports of this temp general declaration.
	*
	* @return the discharged ports of this temp general declaration
	*/
	public java.lang.String getDischargedPorts() {
		return _tempGeneralDeclaration.getDischargedPorts();
	}

	/**
	* Sets the discharged ports of this temp general declaration.
	*
	* @param dischargedPorts the discharged ports of this temp general declaration
	*/
	public void setDischargedPorts(java.lang.String dischargedPorts) {
		_tempGeneralDeclaration.setDischargedPorts(dischargedPorts);
	}

	/**
	* Returns the remaining cargo of this temp general declaration.
	*
	* @return the remaining cargo of this temp general declaration
	*/
	public java.lang.String getRemainingCargo() {
		return _tempGeneralDeclaration.getRemainingCargo();
	}

	/**
	* Sets the remaining cargo of this temp general declaration.
	*
	* @param remainingCargo the remaining cargo of this temp general declaration
	*/
	public void setRemainingCargo(java.lang.String remainingCargo) {
		_tempGeneralDeclaration.setRemainingCargo(remainingCargo);
	}

	/**
	* Returns the brief description of the cargo of this temp general declaration.
	*
	* @return the brief description of the cargo of this temp general declaration
	*/
	public java.lang.String getBriefDescriptionOfTheCargo() {
		return _tempGeneralDeclaration.getBriefDescriptionOfTheCargo();
	}

	/**
	* Sets the brief description of the cargo of this temp general declaration.
	*
	* @param briefDescriptionOfTheCargo the brief description of the cargo of this temp general declaration
	*/
	public void setBriefDescriptionOfTheCargo(
		java.lang.String briefDescriptionOfTheCargo) {
		_tempGeneralDeclaration.setBriefDescriptionOfTheCargo(briefDescriptionOfTheCargo);
	}

	/**
	* Returns the number of crew of this temp general declaration.
	*
	* @return the number of crew of this temp general declaration
	*/
	public int getNumberOfCrew() {
		return _tempGeneralDeclaration.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp general declaration.
	*
	* @param numberOfCrew the number of crew of this temp general declaration
	*/
	public void setNumberOfCrew(int numberOfCrew) {
		_tempGeneralDeclaration.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp general declaration.
	*
	* @return the number of passengers of this temp general declaration
	*/
	public int getNumberOfPassengers() {
		return _tempGeneralDeclaration.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp general declaration.
	*
	* @param numberOfPassengers the number of passengers of this temp general declaration
	*/
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempGeneralDeclaration.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the ship requirements in terms of waste of this temp general declaration.
	*
	* @return the ship requirements in terms of waste of this temp general declaration
	*/
	public java.lang.String getShipRequirementsInTermsOfWaste() {
		return _tempGeneralDeclaration.getShipRequirementsInTermsOfWaste();
	}

	/**
	* Sets the ship requirements in terms of waste of this temp general declaration.
	*
	* @param shipRequirementsInTermsOfWaste the ship requirements in terms of waste of this temp general declaration
	*/
	public void setShipRequirementsInTermsOfWaste(
		java.lang.String shipRequirementsInTermsOfWaste) {
		_tempGeneralDeclaration.setShipRequirementsInTermsOfWaste(shipRequirementsInTermsOfWaste);
	}

	/**
	* Returns the remarks of this temp general declaration.
	*
	* @return the remarks of this temp general declaration
	*/
	public java.lang.String getRemarks() {
		return _tempGeneralDeclaration.getRemarks();
	}

	/**
	* Sets the remarks of this temp general declaration.
	*
	* @param remarks the remarks of this temp general declaration
	*/
	public void setRemarks(java.lang.String remarks) {
		_tempGeneralDeclaration.setRemarks(remarks);
	}

	/**
	* Returns the number cargo declaration of this temp general declaration.
	*
	* @return the number cargo declaration of this temp general declaration
	*/
	public java.lang.String getNumberCargoDeclaration() {
		return _tempGeneralDeclaration.getNumberCargoDeclaration();
	}

	/**
	* Sets the number cargo declaration of this temp general declaration.
	*
	* @param numberCargoDeclaration the number cargo declaration of this temp general declaration
	*/
	public void setNumberCargoDeclaration(
		java.lang.String numberCargoDeclaration) {
		_tempGeneralDeclaration.setNumberCargoDeclaration(numberCargoDeclaration);
	}

	/**
	* Returns the number ship store declaration of this temp general declaration.
	*
	* @return the number ship store declaration of this temp general declaration
	*/
	public java.lang.String getNumberShipStoreDeclaration() {
		return _tempGeneralDeclaration.getNumberShipStoreDeclaration();
	}

	/**
	* Sets the number ship store declaration of this temp general declaration.
	*
	* @param numberShipStoreDeclaration the number ship store declaration of this temp general declaration
	*/
	public void setNumberShipStoreDeclaration(
		java.lang.String numberShipStoreDeclaration) {
		_tempGeneralDeclaration.setNumberShipStoreDeclaration(numberShipStoreDeclaration);
	}

	/**
	* Returns the number crew list of this temp general declaration.
	*
	* @return the number crew list of this temp general declaration
	*/
	public java.lang.String getNumberCrewList() {
		return _tempGeneralDeclaration.getNumberCrewList();
	}

	/**
	* Sets the number crew list of this temp general declaration.
	*
	* @param numberCrewList the number crew list of this temp general declaration
	*/
	public void setNumberCrewList(java.lang.String numberCrewList) {
		_tempGeneralDeclaration.setNumberCrewList(numberCrewList);
	}

	/**
	* Returns the number passenger list of this temp general declaration.
	*
	* @return the number passenger list of this temp general declaration
	*/
	public java.lang.String getNumberPassengerList() {
		return _tempGeneralDeclaration.getNumberPassengerList();
	}

	/**
	* Sets the number passenger list of this temp general declaration.
	*
	* @param numberPassengerList the number passenger list of this temp general declaration
	*/
	public void setNumberPassengerList(java.lang.String numberPassengerList) {
		_tempGeneralDeclaration.setNumberPassengerList(numberPassengerList);
	}

	/**
	* Returns the number crew effects of this temp general declaration.
	*
	* @return the number crew effects of this temp general declaration
	*/
	public java.lang.String getNumberCrewEffects() {
		return _tempGeneralDeclaration.getNumberCrewEffects();
	}

	/**
	* Sets the number crew effects of this temp general declaration.
	*
	* @param numberCrewEffects the number crew effects of this temp general declaration
	*/
	public void setNumberCrewEffects(java.lang.String numberCrewEffects) {
		_tempGeneralDeclaration.setNumberCrewEffects(numberCrewEffects);
	}

	/**
	* Returns the number health maritime of this temp general declaration.
	*
	* @return the number health maritime of this temp general declaration
	*/
	public java.lang.String getNumberHealthMaritime() {
		return _tempGeneralDeclaration.getNumberHealthMaritime();
	}

	/**
	* Sets the number health maritime of this temp general declaration.
	*
	* @param numberHealthMaritime the number health maritime of this temp general declaration
	*/
	public void setNumberHealthMaritime(java.lang.String numberHealthMaritime) {
		_tempGeneralDeclaration.setNumberHealthMaritime(numberHealthMaritime);
	}

	/**
	* Returns the sign place of this temp general declaration.
	*
	* @return the sign place of this temp general declaration
	*/
	public java.lang.String getSignPlace() {
		return _tempGeneralDeclaration.getSignPlace();
	}

	/**
	* Sets the sign place of this temp general declaration.
	*
	* @param signPlace the sign place of this temp general declaration
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_tempGeneralDeclaration.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp general declaration.
	*
	* @return the sign date of this temp general declaration
	*/
	public java.util.Date getSignDate() {
		return _tempGeneralDeclaration.getSignDate();
	}

	/**
	* Sets the sign date of this temp general declaration.
	*
	* @param signDate the sign date of this temp general declaration
	*/
	public void setSignDate(java.util.Date signDate) {
		_tempGeneralDeclaration.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp general declaration.
	*
	* @return the master signed of this temp general declaration
	*/
	public int getMasterSigned() {
		return _tempGeneralDeclaration.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp general declaration.
	*
	* @param masterSigned the master signed of this temp general declaration
	*/
	public void setMasterSigned(int masterSigned) {
		_tempGeneralDeclaration.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp general declaration.
	*
	* @return the master signed image of this temp general declaration
	*/
	public int getMasterSignedImage() {
		return _tempGeneralDeclaration.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp general declaration.
	*
	* @param masterSignedImage the master signed image of this temp general declaration
	*/
	public void setMasterSignedImage(int masterSignedImage) {
		_tempGeneralDeclaration.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the cargo on board of this temp general declaration.
	*
	* @return the cargo on board of this temp general declaration
	*/
	public java.lang.String getCargoOnBoard() {
		return _tempGeneralDeclaration.getCargoOnBoard();
	}

	/**
	* Sets the cargo on board of this temp general declaration.
	*
	* @param CargoOnBoard the cargo on board of this temp general declaration
	*/
	public void setCargoOnBoard(java.lang.String CargoOnBoard) {
		_tempGeneralDeclaration.setCargoOnBoard(CargoOnBoard);
	}

	/**
	* Returns the cargo of this temp general declaration.
	*
	* @return the cargo of this temp general declaration
	*/
	public java.lang.String getCargo() {
		return _tempGeneralDeclaration.getCargo();
	}

	/**
	* Sets the cargo of this temp general declaration.
	*
	* @param Cargo the cargo of this temp general declaration
	*/
	public void setCargo(java.lang.String Cargo) {
		_tempGeneralDeclaration.setCargo(Cargo);
	}

	/**
	* Returns the volume cargo of this temp general declaration.
	*
	* @return the volume cargo of this temp general declaration
	*/
	public double getVolumeCargo() {
		return _tempGeneralDeclaration.getVolumeCargo();
	}

	/**
	* Sets the volume cargo of this temp general declaration.
	*
	* @param VolumeCargo the volume cargo of this temp general declaration
	*/
	public void setVolumeCargo(double VolumeCargo) {
		_tempGeneralDeclaration.setVolumeCargo(VolumeCargo);
	}

	/**
	* Returns the cargo unit of this temp general declaration.
	*
	* @return the cargo unit of this temp general declaration
	*/
	public java.lang.String getCargoUnit() {
		return _tempGeneralDeclaration.getCargoUnit();
	}

	/**
	* Sets the cargo unit of this temp general declaration.
	*
	* @param CargoUnit the cargo unit of this temp general declaration
	*/
	public void setCargoUnit(java.lang.String CargoUnit) {
		_tempGeneralDeclaration.setCargoUnit(CargoUnit);
	}

	/**
	* Returns the cargo description of this temp general declaration.
	*
	* @return the cargo description of this temp general declaration
	*/
	public java.lang.String getCargoDescription() {
		return _tempGeneralDeclaration.getCargoDescription();
	}

	/**
	* Sets the cargo description of this temp general declaration.
	*
	* @param CargoDescription the cargo description of this temp general declaration
	*/
	public void setCargoDescription(java.lang.String CargoDescription) {
		_tempGeneralDeclaration.setCargoDescription(CargoDescription);
	}

	/**
	* Returns the rated power of this temp general declaration.
	*
	* @return the rated power of this temp general declaration
	*/
	public java.lang.String getRatedPower() {
		return _tempGeneralDeclaration.getRatedPower();
	}

	/**
	* Sets the rated power of this temp general declaration.
	*
	* @param ratedPower the rated power of this temp general declaration
	*/
	public void setRatedPower(java.lang.String ratedPower) {
		_tempGeneralDeclaration.setRatedPower(ratedPower);
	}

	/**
	* Returns the seating capacity of this temp general declaration.
	*
	* @return the seating capacity of this temp general declaration
	*/
	public java.lang.String getSeatingCapacity() {
		return _tempGeneralDeclaration.getSeatingCapacity();
	}

	/**
	* Sets the seating capacity of this temp general declaration.
	*
	* @param seatingCapacity the seating capacity of this temp general declaration
	*/
	public void setSeatingCapacity(java.lang.String seatingCapacity) {
		_tempGeneralDeclaration.setSeatingCapacity(seatingCapacity);
	}

	/**
	* Returns the lying capacity of this temp general declaration.
	*
	* @return the lying capacity of this temp general declaration
	*/
	public java.lang.String getLyingCapacity() {
		return _tempGeneralDeclaration.getLyingCapacity();
	}

	/**
	* Sets the lying capacity of this temp general declaration.
	*
	* @param lyingCapacity the lying capacity of this temp general declaration
	*/
	public void setLyingCapacity(java.lang.String lyingCapacity) {
		_tempGeneralDeclaration.setLyingCapacity(lyingCapacity);
	}

	/**
	* Returns the maritime port code of this temp general declaration.
	*
	* @return the maritime port code of this temp general declaration
	*/
	public java.lang.String getMaritimePortCode() {
		return _tempGeneralDeclaration.getMaritimePortCode();
	}

	/**
	* Sets the maritime port code of this temp general declaration.
	*
	* @param maritimePortCode the maritime port code of this temp general declaration
	*/
	public void setMaritimePortCode(java.lang.String maritimePortCode) {
		_tempGeneralDeclaration.setMaritimePortCode(maritimePortCode);
	}

	/**
	* Returns the last province code of this temp general declaration.
	*
	* @return the last province code of this temp general declaration
	*/
	public java.lang.String getLastProvinceCode() {
		return _tempGeneralDeclaration.getLastProvinceCode();
	}

	/**
	* Sets the last province code of this temp general declaration.
	*
	* @param lastProvinceCode the last province code of this temp general declaration
	*/
	public void setLastProvinceCode(java.lang.String lastProvinceCode) {
		_tempGeneralDeclaration.setLastProvinceCode(lastProvinceCode);
	}

	/**
	* Returns the next province code of this temp general declaration.
	*
	* @return the next province code of this temp general declaration
	*/
	public java.lang.String getNextProvinceCode() {
		return _tempGeneralDeclaration.getNextProvinceCode();
	}

	/**
	* Sets the next province code of this temp general declaration.
	*
	* @param nextProvinceCode the next province code of this temp general declaration
	*/
	public void setNextProvinceCode(java.lang.String nextProvinceCode) {
		_tempGeneralDeclaration.setNextProvinceCode(nextProvinceCode);
	}

	/**
	* Returns the last maritime port code of this temp general declaration.
	*
	* @return the last maritime port code of this temp general declaration
	*/
	public java.lang.String getLastMaritimePortCode() {
		return _tempGeneralDeclaration.getLastMaritimePortCode();
	}

	/**
	* Sets the last maritime port code of this temp general declaration.
	*
	* @param lastMaritimePortCode the last maritime port code of this temp general declaration
	*/
	public void setLastMaritimePortCode(java.lang.String lastMaritimePortCode) {
		_tempGeneralDeclaration.setLastMaritimePortCode(lastMaritimePortCode);
	}

	/**
	* Returns the last port region code of this temp general declaration.
	*
	* @return the last port region code of this temp general declaration
	*/
	public java.lang.String getLastPortRegionCode() {
		return _tempGeneralDeclaration.getLastPortRegionCode();
	}

	/**
	* Sets the last port region code of this temp general declaration.
	*
	* @param lastPortRegionCode the last port region code of this temp general declaration
	*/
	public void setLastPortRegionCode(java.lang.String lastPortRegionCode) {
		_tempGeneralDeclaration.setLastPortRegionCode(lastPortRegionCode);
	}

	/**
	* Returns the last port harbour code of this temp general declaration.
	*
	* @return the last port harbour code of this temp general declaration
	*/
	public java.lang.String getLastPortHarbourCode() {
		return _tempGeneralDeclaration.getLastPortHarbourCode();
	}

	/**
	* Sets the last port harbour code of this temp general declaration.
	*
	* @param lastPortHarbourCode the last port harbour code of this temp general declaration
	*/
	public void setLastPortHarbourCode(java.lang.String lastPortHarbourCode) {
		_tempGeneralDeclaration.setLastPortHarbourCode(lastPortHarbourCode);
	}

	/**
	* Returns the last port wharf code of this temp general declaration.
	*
	* @return the last port wharf code of this temp general declaration
	*/
	public java.lang.String getLastPortWharfCode() {
		return _tempGeneralDeclaration.getLastPortWharfCode();
	}

	/**
	* Sets the last port wharf code of this temp general declaration.
	*
	* @param lastPortWharfCode the last port wharf code of this temp general declaration
	*/
	public void setLastPortWharfCode(java.lang.String lastPortWharfCode) {
		_tempGeneralDeclaration.setLastPortWharfCode(lastPortWharfCode);
	}

	/**
	* Returns the next maritime port code of this temp general declaration.
	*
	* @return the next maritime port code of this temp general declaration
	*/
	public java.lang.String getNextMaritimePortCode() {
		return _tempGeneralDeclaration.getNextMaritimePortCode();
	}

	/**
	* Sets the next maritime port code of this temp general declaration.
	*
	* @param nextMaritimePortCode the next maritime port code of this temp general declaration
	*/
	public void setNextMaritimePortCode(java.lang.String nextMaritimePortCode) {
		_tempGeneralDeclaration.setNextMaritimePortCode(nextMaritimePortCode);
	}

	/**
	* Returns the next port region code of this temp general declaration.
	*
	* @return the next port region code of this temp general declaration
	*/
	public java.lang.String getNextPortRegionCode() {
		return _tempGeneralDeclaration.getNextPortRegionCode();
	}

	/**
	* Sets the next port region code of this temp general declaration.
	*
	* @param nextPortRegionCode the next port region code of this temp general declaration
	*/
	public void setNextPortRegionCode(java.lang.String nextPortRegionCode) {
		_tempGeneralDeclaration.setNextPortRegionCode(nextPortRegionCode);
	}

	/**
	* Returns the next port harbour code of this temp general declaration.
	*
	* @return the next port harbour code of this temp general declaration
	*/
	public java.lang.String getNextPortHarbourCode() {
		return _tempGeneralDeclaration.getNextPortHarbourCode();
	}

	/**
	* Sets the next port harbour code of this temp general declaration.
	*
	* @param nextPortHarbourCode the next port harbour code of this temp general declaration
	*/
	public void setNextPortHarbourCode(java.lang.String nextPortHarbourCode) {
		_tempGeneralDeclaration.setNextPortHarbourCode(nextPortHarbourCode);
	}

	/**
	* Returns the next port wharf code of this temp general declaration.
	*
	* @return the next port wharf code of this temp general declaration
	*/
	public java.lang.String getNextPortWharfCode() {
		return _tempGeneralDeclaration.getNextPortWharfCode();
	}

	/**
	* Sets the next port wharf code of this temp general declaration.
	*
	* @param nextPortWharfCode the next port wharf code of this temp general declaration
	*/
	public void setNextPortWharfCode(java.lang.String nextPortWharfCode) {
		_tempGeneralDeclaration.setNextPortWharfCode(nextPortWharfCode);
	}

	/**
	* Returns the link of this temp general declaration.
	*
	* @return the link of this temp general declaration
	*/
	public java.lang.String getLink() {
		return _tempGeneralDeclaration.getLink();
	}

	/**
	* Sets the link of this temp general declaration.
	*
	* @param link the link of this temp general declaration
	*/
	public void setLink(java.lang.String link) {
		_tempGeneralDeclaration.setLink(link);
	}

	/**
	* Returns the qr code of this temp general declaration.
	*
	* @return the qr code of this temp general declaration
	*/
	public java.lang.String getQrCode() {
		return _tempGeneralDeclaration.getQrCode();
	}

	/**
	* Sets the qr code of this temp general declaration.
	*
	* @param qrCode the qr code of this temp general declaration
	*/
	public void setQrCode(java.lang.String qrCode) {
		_tempGeneralDeclaration.setQrCode(qrCode);
	}

	/**
	* Returns the port clearance no of this temp general declaration.
	*
	* @return the port clearance no of this temp general declaration
	*/
	public java.lang.String getPortClearanceNo() {
		return _tempGeneralDeclaration.getPortClearanceNo();
	}

	/**
	* Sets the port clearance no of this temp general declaration.
	*
	* @param portClearanceNo the port clearance no of this temp general declaration
	*/
	public void setPortClearanceNo(java.lang.String portClearanceNo) {
		_tempGeneralDeclaration.setPortClearanceNo(portClearanceNo);
	}

	/**
	* Returns the loa of this temp general declaration.
	*
	* @return the loa of this temp general declaration
	*/
	public double getLoa() {
		return _tempGeneralDeclaration.getLoa();
	}

	/**
	* Sets the loa of this temp general declaration.
	*
	* @param loa the loa of this temp general declaration
	*/
	public void setLoa(double loa) {
		_tempGeneralDeclaration.setLoa(loa);
	}

	/**
	* Returns the unit l o a of this temp general declaration.
	*
	* @return the unit l o a of this temp general declaration
	*/
	public java.lang.String getUnitLOA() {
		return _tempGeneralDeclaration.getUnitLOA();
	}

	/**
	* Sets the unit l o a of this temp general declaration.
	*
	* @param unitLOA the unit l o a of this temp general declaration
	*/
	public void setUnitLOA(java.lang.String unitLOA) {
		_tempGeneralDeclaration.setUnitLOA(unitLOA);
	}

	/**
	* Returns the breadth of this temp general declaration.
	*
	* @return the breadth of this temp general declaration
	*/
	public double getBreadth() {
		return _tempGeneralDeclaration.getBreadth();
	}

	/**
	* Sets the breadth of this temp general declaration.
	*
	* @param breadth the breadth of this temp general declaration
	*/
	public void setBreadth(double breadth) {
		_tempGeneralDeclaration.setBreadth(breadth);
	}

	/**
	* Returns the unit breadth of this temp general declaration.
	*
	* @return the unit breadth of this temp general declaration
	*/
	public java.lang.String getUnitBreadth() {
		return _tempGeneralDeclaration.getUnitBreadth();
	}

	/**
	* Sets the unit breadth of this temp general declaration.
	*
	* @param unitBreadth the unit breadth of this temp general declaration
	*/
	public void setUnitBreadth(java.lang.String unitBreadth) {
		_tempGeneralDeclaration.setUnitBreadth(unitBreadth);
	}

	/**
	* Returns the clearance height of this temp general declaration.
	*
	* @return the clearance height of this temp general declaration
	*/
	public double getClearanceHeight() {
		return _tempGeneralDeclaration.getClearanceHeight();
	}

	/**
	* Sets the clearance height of this temp general declaration.
	*
	* @param clearanceHeight the clearance height of this temp general declaration
	*/
	public void setClearanceHeight(double clearanceHeight) {
		_tempGeneralDeclaration.setClearanceHeight(clearanceHeight);
	}

	/**
	* Returns the unit clearance height of this temp general declaration.
	*
	* @return the unit clearance height of this temp general declaration
	*/
	public java.lang.String getUnitClearanceHeight() {
		return _tempGeneralDeclaration.getUnitClearanceHeight();
	}

	/**
	* Sets the unit clearance height of this temp general declaration.
	*
	* @param unitClearanceHeight the unit clearance height of this temp general declaration
	*/
	public void setUnitClearanceHeight(java.lang.String unitClearanceHeight) {
		_tempGeneralDeclaration.setUnitClearanceHeight(unitClearanceHeight);
	}

	/**
	* Returns the shown draftx f of this temp general declaration.
	*
	* @return the shown draftx f of this temp general declaration
	*/
	public double getShownDraftxF() {
		return _tempGeneralDeclaration.getShownDraftxF();
	}

	/**
	* Sets the shown draftx f of this temp general declaration.
	*
	* @param shownDraftxF the shown draftx f of this temp general declaration
	*/
	public void setShownDraftxF(double shownDraftxF) {
		_tempGeneralDeclaration.setShownDraftxF(shownDraftxF);
	}

	/**
	* Returns the unit shown draftx f of this temp general declaration.
	*
	* @return the unit shown draftx f of this temp general declaration
	*/
	public java.lang.String getUnitShownDraftxF() {
		return _tempGeneralDeclaration.getUnitShownDraftxF();
	}

	/**
	* Sets the unit shown draftx f of this temp general declaration.
	*
	* @param unitShownDraftxF the unit shown draftx f of this temp general declaration
	*/
	public void setUnitShownDraftxF(java.lang.String unitShownDraftxF) {
		_tempGeneralDeclaration.setUnitShownDraftxF(unitShownDraftxF);
	}

	/**
	* Returns the shown draftx a of this temp general declaration.
	*
	* @return the shown draftx a of this temp general declaration
	*/
	public double getShownDraftxA() {
		return _tempGeneralDeclaration.getShownDraftxA();
	}

	/**
	* Sets the shown draftx a of this temp general declaration.
	*
	* @param shownDraftxA the shown draftx a of this temp general declaration
	*/
	public void setShownDraftxA(double shownDraftxA) {
		_tempGeneralDeclaration.setShownDraftxA(shownDraftxA);
	}

	/**
	* Returns the unit shown draftx a of this temp general declaration.
	*
	* @return the unit shown draftx a of this temp general declaration
	*/
	public java.lang.String getUnitShownDraftxA() {
		return _tempGeneralDeclaration.getUnitShownDraftxA();
	}

	/**
	* Sets the unit shown draftx a of this temp general declaration.
	*
	* @param unitShownDraftxA the unit shown draftx a of this temp general declaration
	*/
	public void setUnitShownDraftxA(java.lang.String unitShownDraftxA) {
		_tempGeneralDeclaration.setUnitShownDraftxA(unitShownDraftxA);
	}

	/**
	* Returns the dwt of this temp general declaration.
	*
	* @return the dwt of this temp general declaration
	*/
	public double getDwt() {
		return _tempGeneralDeclaration.getDwt();
	}

	/**
	* Sets the dwt of this temp general declaration.
	*
	* @param dwt the dwt of this temp general declaration
	*/
	public void setDwt(double dwt) {
		_tempGeneralDeclaration.setDwt(dwt);
	}

	/**
	* Returns the unit d w t of this temp general declaration.
	*
	* @return the unit d w t of this temp general declaration
	*/
	public java.lang.String getUnitDWT() {
		return _tempGeneralDeclaration.getUnitDWT();
	}

	/**
	* Sets the unit d w t of this temp general declaration.
	*
	* @param unitDWT the unit d w t of this temp general declaration
	*/
	public void setUnitDWT(java.lang.String unitDWT) {
		_tempGeneralDeclaration.setUnitDWT(unitDWT);
	}

	/**
	* Returns the time of p o r t arrival of this temp general declaration.
	*
	* @return the time of p o r t arrival of this temp general declaration
	*/
	public java.util.Date getTimeOfPORTArrival() {
		return _tempGeneralDeclaration.getTimeOfPORTArrival();
	}

	/**
	* Sets the time of p o r t arrival of this temp general declaration.
	*
	* @param timeOfPORTArrival the time of p o r t arrival of this temp general declaration
	*/
	public void setTimeOfPORTArrival(java.util.Date timeOfPORTArrival) {
		_tempGeneralDeclaration.setTimeOfPORTArrival(timeOfPORTArrival);
	}

	/**
	* Returns the time of pilot on board of this temp general declaration.
	*
	* @return the time of pilot on board of this temp general declaration
	*/
	public java.util.Date getTimeOfPilotOnBoard() {
		return _tempGeneralDeclaration.getTimeOfPilotOnBoard();
	}

	/**
	* Sets the time of pilot on board of this temp general declaration.
	*
	* @param timeOfPilotOnBoard the time of pilot on board of this temp general declaration
	*/
	public void setTimeOfPilotOnBoard(java.util.Date timeOfPilotOnBoard) {
		_tempGeneralDeclaration.setTimeOfPilotOnBoard(timeOfPilotOnBoard);
	}

	/**
	* Returns the tug boat of this temp general declaration.
	*
	* @return the tug boat of this temp general declaration
	*/
	public java.lang.String getTugBoat() {
		return _tempGeneralDeclaration.getTugBoat();
	}

	/**
	* Sets the tug boat of this temp general declaration.
	*
	* @param tugBoat the tug boat of this temp general declaration
	*/
	public void setTugBoat(java.lang.String tugBoat) {
		_tempGeneralDeclaration.setTugBoat(tugBoat);
	}

	/**
	* Returns the do_ of this temp general declaration.
	*
	* @return the do_ of this temp general declaration
	*/
	public java.lang.String getDo_() {
		return _tempGeneralDeclaration.getDo_();
	}

	/**
	* Sets the do_ of this temp general declaration.
	*
	* @param do_ the do_ of this temp general declaration
	*/
	public void setDo_(java.lang.String do_) {
		_tempGeneralDeclaration.setDo_(do_);
	}

	/**
	* Returns the fo of this temp general declaration.
	*
	* @return the fo of this temp general declaration
	*/
	public java.lang.String getFo() {
		return _tempGeneralDeclaration.getFo();
	}

	/**
	* Sets the fo of this temp general declaration.
	*
	* @param fo the fo of this temp general declaration
	*/
	public void setFo(java.lang.String fo) {
		_tempGeneralDeclaration.setFo(fo);
	}

	/**
	* Returns the fw of this temp general declaration.
	*
	* @return the fw of this temp general declaration
	*/
	public java.lang.String getFw() {
		return _tempGeneralDeclaration.getFw();
	}

	/**
	* Sets the fw of this temp general declaration.
	*
	* @param fw the fw of this temp general declaration
	*/
	public void setFw(java.lang.String fw) {
		_tempGeneralDeclaration.setFw(fw);
	}

	/**
	* Returns the place of reception of this temp general declaration.
	*
	* @return the place of reception of this temp general declaration
	*/
	public java.lang.String getPlaceOfReception() {
		return _tempGeneralDeclaration.getPlaceOfReception();
	}

	/**
	* Sets the place of reception of this temp general declaration.
	*
	* @param placeOfReception the place of reception of this temp general declaration
	*/
	public void setPlaceOfReception(java.lang.String placeOfReception) {
		_tempGeneralDeclaration.setPlaceOfReception(placeOfReception);
	}

	/**
	* Returns the name of ship owners of this temp general declaration.
	*
	* @return the name of ship owners of this temp general declaration
	*/
	public java.lang.String getNameOfShipOwners() {
		return _tempGeneralDeclaration.getNameOfShipOwners();
	}

	/**
	* Sets the name of ship owners of this temp general declaration.
	*
	* @param nameOfShipOwners the name of ship owners of this temp general declaration
	*/
	public void setNameOfShipOwners(java.lang.String nameOfShipOwners) {
		_tempGeneralDeclaration.setNameOfShipOwners(nameOfShipOwners);
	}

	/**
	* Returns the address of ship owners of this temp general declaration.
	*
	* @return the address of ship owners of this temp general declaration
	*/
	public java.lang.String getAddressOfShipOwners() {
		return _tempGeneralDeclaration.getAddressOfShipOwners();
	}

	/**
	* Sets the address of ship owners of this temp general declaration.
	*
	* @param addressOfShipOwners the address of ship owners of this temp general declaration
	*/
	public void setAddressOfShipOwners(java.lang.String addressOfShipOwners) {
		_tempGeneralDeclaration.setAddressOfShipOwners(addressOfShipOwners);
	}

	public boolean isNew() {
		return _tempGeneralDeclaration.isNew();
	}

	public void setNew(boolean n) {
		_tempGeneralDeclaration.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempGeneralDeclaration.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempGeneralDeclaration.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempGeneralDeclaration.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempGeneralDeclaration.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempGeneralDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempGeneralDeclaration.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempGeneralDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempGeneralDeclarationWrapper((TempGeneralDeclaration)_tempGeneralDeclaration.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration tempGeneralDeclaration) {
		return _tempGeneralDeclaration.compareTo(tempGeneralDeclaration);
	}

	@Override
	public int hashCode() {
		return _tempGeneralDeclaration.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration> toCacheModel() {
		return _tempGeneralDeclaration.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration toEscapedModel() {
		return new TempGeneralDeclarationWrapper(_tempGeneralDeclaration.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempGeneralDeclaration.toString();
	}

	public java.lang.String toXmlString() {
		return _tempGeneralDeclaration.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempGeneralDeclaration.persist();
	}

	public double getWeight01() {
		return _tempGeneralDeclaration.getWeight01();
	}

	public java.lang.String getUnit01() {
		return _tempGeneralDeclaration.getUnit01();
	}

	public double getWeight02() {
		return _tempGeneralDeclaration.getWeight02();
	}

	public java.lang.String getUnit02() {
		return _tempGeneralDeclaration.getUnit02();
	}

	public double getWeight03() {
		return _tempGeneralDeclaration.getWeight03();
	}

	public java.lang.String getUnit03() {
		return _tempGeneralDeclaration.getUnit03();
	}

	public double getWeight04() {
		return _tempGeneralDeclaration.getWeight04();
	}

	public java.lang.String getUnit04() {
		return _tempGeneralDeclaration.getUnit04();
	}

	public double getWeight05() {
		return _tempGeneralDeclaration.getWeight05();
	}

	public java.lang.String getUnit05() {
		return _tempGeneralDeclaration.getUnit05();
	}

	public double getWeight06() {
		return _tempGeneralDeclaration.getWeight06();
	}

	public java.lang.String getUnit06() {
		return _tempGeneralDeclaration.getUnit06();
	}

	public void setWeight01(double weight01) {
		_tempGeneralDeclaration.setWeight01(weight01);
	}

	public void setUnit01(java.lang.String unit01) {
		_tempGeneralDeclaration.setUnit01(unit01);
	}

	public void setWeight02(double weight02) {
		_tempGeneralDeclaration.setWeight02(weight02);
	}

	public void setUnit02(java.lang.String unit02) {
		_tempGeneralDeclaration.setUnit02(unit02);
	}

	public void setWeight03(double weight03) {
		_tempGeneralDeclaration.setWeight03(weight03);
	}

	public void setUnit03(java.lang.String unit03) {
		_tempGeneralDeclaration.setUnit03(unit03);
	}

	public void setWeight04(double weight04) {
		_tempGeneralDeclaration.setWeight04(weight04);
	}

	public void setUnit04(java.lang.String unit04) {
		_tempGeneralDeclaration.setUnit04(unit04);
	}

	public void setWeight05(double weight05) {
		_tempGeneralDeclaration.setWeight05(weight05);
	}

	public void setUnit05(java.lang.String unit05) {
		_tempGeneralDeclaration.setUnit05(unit05);
	}

	public void setWeight06(double weight06) {
		_tempGeneralDeclaration.setWeight06(weight06);
	}

	public void setUnit06(java.lang.String unit06) {
		_tempGeneralDeclaration.setUnit06(unit06);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempGeneralDeclaration getWrappedTempGeneralDeclaration() {
		return _tempGeneralDeclaration;
	}

	public TempGeneralDeclaration getWrappedModel() {
		return _tempGeneralDeclaration;
	}

	public void resetOriginalValues() {
		_tempGeneralDeclaration.resetOriginalValues();
	}

	private TempGeneralDeclaration _tempGeneralDeclaration;
}