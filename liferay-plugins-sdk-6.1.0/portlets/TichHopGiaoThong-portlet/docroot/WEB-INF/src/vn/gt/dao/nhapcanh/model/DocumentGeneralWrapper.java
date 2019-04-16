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

package vn.gt.dao.nhapcanh.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DocumentGeneral}.
 * </p>
 *
 * @author    win_64
 * @see       DocumentGeneral
 * @generated
 */
public class DocumentGeneralWrapper implements DocumentGeneral,
	ModelWrapper<DocumentGeneral> {
	public DocumentGeneralWrapper(DocumentGeneral documentGeneral) {
		_documentGeneral = documentGeneral;
	}

	public Class<?> getModelClass() {
		return DocumentGeneral.class;
	}

	public String getModelClassName() {
		return DocumentGeneral.class.getName();
	}

	/**
	* Returns the primary key of this document general.
	*
	* @return the primary key of this document general
	*/
	public long getPrimaryKey() {
		return _documentGeneral.getPrimaryKey();
	}

	/**
	* Sets the primary key of this document general.
	*
	* @param primaryKey the primary key of this document general
	*/
	public void setPrimaryKey(long primaryKey) {
		_documentGeneral.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this document general.
	*
	* @return the ID of this document general
	*/
	public long getId() {
		return _documentGeneral.getId();
	}

	/**
	* Sets the ID of this document general.
	*
	* @param id the ID of this document general
	*/
	public void setId(long id) {
		_documentGeneral.setId(id);
	}

	/**
	* Returns the document no of this document general.
	*
	* @return the document no of this document general
	*/
	public java.lang.String getDocumentNo() {
		return _documentGeneral.getDocumentNo();
	}

	/**
	* Sets the document no of this document general.
	*
	* @param documentNo the document no of this document general
	*/
	public void setDocumentNo(java.lang.String documentNo) {
		_documentGeneral.setDocumentNo(documentNo);
	}

	/**
	* Returns the document function of this document general.
	*
	* @return the document function of this document general
	*/
	public java.lang.String getDocumentFunction() {
		return _documentGeneral.getDocumentFunction();
	}

	/**
	* Sets the document function of this document general.
	*
	* @param documentFunction the document function of this document general
	*/
	public void setDocumentFunction(java.lang.String documentFunction) {
		_documentGeneral.setDocumentFunction(documentFunction);
	}

	/**
	* Returns the is arrival of this document general.
	*
	* @return the is arrival of this document general
	*/
	public int getIsArrival() {
		return _documentGeneral.getIsArrival();
	}

	/**
	* Sets the is arrival of this document general.
	*
	* @param isArrival the is arrival of this document general
	*/
	public void setIsArrival(int isArrival) {
		_documentGeneral.setIsArrival(isArrival);
	}

	/**
	* Returns the is departure of this document general.
	*
	* @return the is departure of this document general
	*/
	public int getIsDeparture() {
		return _documentGeneral.getIsDeparture();
	}

	/**
	* Sets the is departure of this document general.
	*
	* @param isDeparture the is departure of this document general
	*/
	public void setIsDeparture(int isDeparture) {
		_documentGeneral.setIsDeparture(isDeparture);
	}

	/**
	* Returns the ship code of this document general.
	*
	* @return the ship code of this document general
	*/
	public java.lang.String getShipCode() {
		return _documentGeneral.getShipCode();
	}

	/**
	* Sets the ship code of this document general.
	*
	* @param shipCode the ship code of this document general
	*/
	public void setShipCode(java.lang.String shipCode) {
		_documentGeneral.setShipCode(shipCode);
	}

	/**
	* Returns the arrival or departure port code of this document general.
	*
	* @return the arrival or departure port code of this document general
	*/
	public java.lang.String getArrivalOrDeparturePortCode() {
		return _documentGeneral.getArrivalOrDeparturePortCode();
	}

	/**
	* Sets the arrival or departure port code of this document general.
	*
	* @param arrivalOrDeparturePortCode the arrival or departure port code of this document general
	*/
	public void setArrivalOrDeparturePortCode(
		java.lang.String arrivalOrDeparturePortCode) {
		_documentGeneral.setArrivalOrDeparturePortCode(arrivalOrDeparturePortCode);
	}

	/**
	* Returns the time arrival or departure of this document general.
	*
	* @return the time arrival or departure of this document general
	*/
	public java.util.Date getTimeArrivalOrDeparture() {
		return _documentGeneral.getTimeArrivalOrDeparture();
	}

	/**
	* Sets the time arrival or departure of this document general.
	*
	* @param timeArrivalOrDeparture the time arrival or departure of this document general
	*/
	public void setTimeArrivalOrDeparture(java.util.Date timeArrivalOrDeparture) {
		_documentGeneral.setTimeArrivalOrDeparture(timeArrivalOrDeparture);
	}

	/**
	* Returns the imo number of this document general.
	*
	* @return the imo number of this document general
	*/
	public java.lang.String getImoNumber() {
		return _documentGeneral.getImoNumber();
	}

	/**
	* Sets the imo number of this document general.
	*
	* @param imoNumber the imo number of this document general
	*/
	public void setImoNumber(java.lang.String imoNumber) {
		_documentGeneral.setImoNumber(imoNumber);
	}

	/**
	* Returns the call sign of this document general.
	*
	* @return the call sign of this document general
	*/
	public java.lang.String getCallSign() {
		return _documentGeneral.getCallSign();
	}

	/**
	* Sets the call sign of this document general.
	*
	* @param callSign the call sign of this document general
	*/
	public void setCallSign(java.lang.String callSign) {
		_documentGeneral.setCallSign(callSign);
	}

	/**
	* Returns the voyage number of this document general.
	*
	* @return the voyage number of this document general
	*/
	public int getVoyageNumber() {
		return _documentGeneral.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this document general.
	*
	* @param voyageNumber the voyage number of this document general
	*/
	public void setVoyageNumber(int voyageNumber) {
		_documentGeneral.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the ship nation code of this document general.
	*
	* @return the ship nation code of this document general
	*/
	public java.lang.String getShipNationCode() {
		return _documentGeneral.getShipNationCode();
	}

	/**
	* Sets the ship nation code of this document general.
	*
	* @param shipNationCode the ship nation code of this document general
	*/
	public void setShipNationCode(java.lang.String shipNationCode) {
		_documentGeneral.setShipNationCode(shipNationCode);
	}

	/**
	* Returns the name of master of this document general.
	*
	* @return the name of master of this document general
	*/
	public java.lang.String getNameOfMaster() {
		return _documentGeneral.getNameOfMaster();
	}

	/**
	* Sets the name of master of this document general.
	*
	* @param nameOfMaster the name of master of this document general
	*/
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_documentGeneral.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the last port of this document general.
	*
	* @return the last port of this document general
	*/
	public java.lang.String getLastPort() {
		return _documentGeneral.getLastPort();
	}

	/**
	* Sets the last port of this document general.
	*
	* @param lastPort the last port of this document general
	*/
	public void setLastPort(java.lang.String lastPort) {
		_documentGeneral.setLastPort(lastPort);
	}

	/**
	* Returns the contact detail ship agent of this document general.
	*
	* @return the contact detail ship agent of this document general
	*/
	public java.lang.String getContactDetailShipAgent() {
		return _documentGeneral.getContactDetailShipAgent();
	}

	/**
	* Sets the contact detail ship agent of this document general.
	*
	* @param contactDetailShipAgent the contact detail ship agent of this document general
	*/
	public void setContactDetailShipAgent(
		java.lang.String contactDetailShipAgent) {
		_documentGeneral.setContactDetailShipAgent(contactDetailShipAgent);
	}

	/**
	* Returns the gross tonnage of this document general.
	*
	* @return the gross tonnage of this document general
	*/
	public double getGrossTonnage() {
		return _documentGeneral.getGrossTonnage();
	}

	/**
	* Sets the gross tonnage of this document general.
	*
	* @param grossTonnage the gross tonnage of this document general
	*/
	public void setGrossTonnage(double grossTonnage) {
		_documentGeneral.setGrossTonnage(grossTonnage);
	}

	/**
	* Returns the net tonnage of this document general.
	*
	* @return the net tonnage of this document general
	*/
	public double getNetTonnage() {
		return _documentGeneral.getNetTonnage();
	}

	/**
	* Sets the net tonnage of this document general.
	*
	* @param netTonnage the net tonnage of this document general
	*/
	public void setNetTonnage(double netTonnage) {
		_documentGeneral.setNetTonnage(netTonnage);
	}

	/**
	* Returns the position ship in port of this document general.
	*
	* @return the position ship in port of this document general
	*/
	public int getPositionShipInPort() {
		return _documentGeneral.getPositionShipInPort();
	}

	/**
	* Sets the position ship in port of this document general.
	*
	* @param positionShipInPort the position ship in port of this document general
	*/
	public void setPositionShipInPort(int positionShipInPort) {
		_documentGeneral.setPositionShipInPort(positionShipInPort);
	}

	/**
	* Returns the brief particulars voyage of this document general.
	*
	* @return the brief particulars voyage of this document general
	*/
	public java.lang.String getBriefParticularsVoyage() {
		return _documentGeneral.getBriefParticularsVoyage();
	}

	/**
	* Sets the brief particulars voyage of this document general.
	*
	* @param briefParticularsVoyage the brief particulars voyage of this document general
	*/
	public void setBriefParticularsVoyage(
		java.lang.String briefParticularsVoyage) {
		_documentGeneral.setBriefParticularsVoyage(briefParticularsVoyage);
	}

	/**
	* Returns the brief description cargo of this document general.
	*
	* @return the brief description cargo of this document general
	*/
	public java.lang.String getBriefDescriptionCargo() {
		return _documentGeneral.getBriefDescriptionCargo();
	}

	/**
	* Sets the brief description cargo of this document general.
	*
	* @param briefDescriptionCargo the brief description cargo of this document general
	*/
	public void setBriefDescriptionCargo(java.lang.String briefDescriptionCargo) {
		_documentGeneral.setBriefDescriptionCargo(briefDescriptionCargo);
	}

	/**
	* Returns the crew number of this document general.
	*
	* @return the crew number of this document general
	*/
	public int getCrewNumber() {
		return _documentGeneral.getCrewNumber();
	}

	/**
	* Sets the crew number of this document general.
	*
	* @param crewNumber the crew number of this document general
	*/
	public void setCrewNumber(int crewNumber) {
		_documentGeneral.setCrewNumber(crewNumber);
	}

	/**
	* Returns the passenger number of this document general.
	*
	* @return the passenger number of this document general
	*/
	public int getPassengerNumber() {
		return _documentGeneral.getPassengerNumber();
	}

	/**
	* Sets the passenger number of this document general.
	*
	* @param passengerNumber the passenger number of this document general
	*/
	public void setPassengerNumber(int passengerNumber) {
		_documentGeneral.setPassengerNumber(passengerNumber);
	}

	/**
	* Returns the remarks of this document general.
	*
	* @return the remarks of this document general
	*/
	public java.lang.String getRemarks() {
		return _documentGeneral.getRemarks();
	}

	/**
	* Sets the remarks of this document general.
	*
	* @param remarks the remarks of this document general
	*/
	public void setRemarks(java.lang.String remarks) {
		_documentGeneral.setRemarks(remarks);
	}

	/**
	* Returns the cargo declaration of this document general.
	*
	* @return the cargo declaration of this document general
	*/
	public java.lang.String getCargoDeclaration() {
		return _documentGeneral.getCargoDeclaration();
	}

	/**
	* Sets the cargo declaration of this document general.
	*
	* @param cargoDeclaration the cargo declaration of this document general
	*/
	public void setCargoDeclaration(java.lang.String cargoDeclaration) {
		_documentGeneral.setCargoDeclaration(cargoDeclaration);
	}

	/**
	* Returns the ship stores declaration of this document general.
	*
	* @return the ship stores declaration of this document general
	*/
	public java.lang.String getShipStoresDeclaration() {
		return _documentGeneral.getShipStoresDeclaration();
	}

	/**
	* Sets the ship stores declaration of this document general.
	*
	* @param shipStoresDeclaration the ship stores declaration of this document general
	*/
	public void setShipStoresDeclaration(java.lang.String shipStoresDeclaration) {
		_documentGeneral.setShipStoresDeclaration(shipStoresDeclaration);
	}

	/**
	* Returns the crew list of this document general.
	*
	* @return the crew list of this document general
	*/
	public java.lang.String getCrewList() {
		return _documentGeneral.getCrewList();
	}

	/**
	* Sets the crew list of this document general.
	*
	* @param crewList the crew list of this document general
	*/
	public void setCrewList(java.lang.String crewList) {
		_documentGeneral.setCrewList(crewList);
	}

	/**
	* Returns the passenger list of this document general.
	*
	* @return the passenger list of this document general
	*/
	public java.lang.String getPassengerList() {
		return _documentGeneral.getPassengerList();
	}

	/**
	* Sets the passenger list of this document general.
	*
	* @param passengerList the passenger list of this document general
	*/
	public void setPassengerList(java.lang.String passengerList) {
		_documentGeneral.setPassengerList(passengerList);
	}

	/**
	* Returns the ship requirements of this document general.
	*
	* @return the ship requirements of this document general
	*/
	public java.lang.String getShipRequirements() {
		return _documentGeneral.getShipRequirements();
	}

	/**
	* Sets the ship requirements of this document general.
	*
	* @param shipRequirements the ship requirements of this document general
	*/
	public void setShipRequirements(java.lang.String shipRequirements) {
		_documentGeneral.setShipRequirements(shipRequirements);
	}

	/**
	* Returns the is crew effect declaration of this document general.
	*
	* @return the is crew effect declaration of this document general
	*/
	public int getIsCrewEffectDeclaration() {
		return _documentGeneral.getIsCrewEffectDeclaration();
	}

	/**
	* Sets the is crew effect declaration of this document general.
	*
	* @param isCrewEffectDeclaration the is crew effect declaration of this document general
	*/
	public void setIsCrewEffectDeclaration(int isCrewEffectDeclaration) {
		_documentGeneral.setIsCrewEffectDeclaration(isCrewEffectDeclaration);
	}

	/**
	* Returns the is maritime declaration health of this document general.
	*
	* @return the is maritime declaration health of this document general
	*/
	public int getIsMaritimeDeclarationHealth() {
		return _documentGeneral.getIsMaritimeDeclarationHealth();
	}

	/**
	* Sets the is maritime declaration health of this document general.
	*
	* @param isMaritimeDeclarationHealth the is maritime declaration health of this document general
	*/
	public void setIsMaritimeDeclarationHealth(int isMaritimeDeclarationHealth) {
		_documentGeneral.setIsMaritimeDeclarationHealth(isMaritimeDeclarationHealth);
	}

	/**
	* Returns the create date of this document general.
	*
	* @return the create date of this document general
	*/
	public java.util.Date getCreateDate() {
		return _documentGeneral.getCreateDate();
	}

	/**
	* Sets the create date of this document general.
	*
	* @param createDate the create date of this document general
	*/
	public void setCreateDate(java.util.Date createDate) {
		_documentGeneral.setCreateDate(createDate);
	}

	/**
	* Returns the modify date of this document general.
	*
	* @return the modify date of this document general
	*/
	public java.util.Date getModifyDate() {
		return _documentGeneral.getModifyDate();
	}

	/**
	* Sets the modify date of this document general.
	*
	* @param modifyDate the modify date of this document general
	*/
	public void setModifyDate(java.util.Date modifyDate) {
		_documentGeneral.setModifyDate(modifyDate);
	}

	public boolean isNew() {
		return _documentGeneral.isNew();
	}

	public void setNew(boolean n) {
		_documentGeneral.setNew(n);
	}

	public boolean isCachedModel() {
		return _documentGeneral.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_documentGeneral.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _documentGeneral.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _documentGeneral.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_documentGeneral.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _documentGeneral.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_documentGeneral.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocumentGeneralWrapper((DocumentGeneral)_documentGeneral.clone());
	}

	public int compareTo(
		vn.gt.dao.nhapcanh.model.DocumentGeneral documentGeneral) {
		return _documentGeneral.compareTo(documentGeneral);
	}

	@Override
	public int hashCode() {
		return _documentGeneral.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.nhapcanh.model.DocumentGeneral> toCacheModel() {
		return _documentGeneral.toCacheModel();
	}

	public vn.gt.dao.nhapcanh.model.DocumentGeneral toEscapedModel() {
		return new DocumentGeneralWrapper(_documentGeneral.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _documentGeneral.toString();
	}

	public java.lang.String toXmlString() {
		return _documentGeneral.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_documentGeneral.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DocumentGeneral getWrappedDocumentGeneral() {
		return _documentGeneral;
	}

	public DocumentGeneral getWrappedModel() {
		return _documentGeneral;
	}

	public void resetOriginalValues() {
		_documentGeneral.resetOriginalValues();
	}

	private DocumentGeneral _documentGeneral;
}