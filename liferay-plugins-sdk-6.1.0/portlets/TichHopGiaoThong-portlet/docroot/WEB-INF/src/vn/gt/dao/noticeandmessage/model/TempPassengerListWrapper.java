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
 * This class is a wrapper for {@link TempPassengerList}.
 * </p>
 *
 * @author    win_64
 * @see       TempPassengerList
 * @generated
 */
public class TempPassengerListWrapper implements TempPassengerList,
	ModelWrapper<TempPassengerList> {
	public TempPassengerListWrapper(TempPassengerList tempPassengerList) {
		_tempPassengerList = tempPassengerList;
	}

	public Class<?> getModelClass() {
		return TempPassengerList.class;
	}

	public String getModelClassName() {
		return TempPassengerList.class.getName();
	}

	/**
	* Returns the primary key of this temp passenger list.
	*
	* @return the primary key of this temp passenger list
	*/
	public long getPrimaryKey() {
		return _tempPassengerList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp passenger list.
	*
	* @param primaryKey the primary key of this temp passenger list
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempPassengerList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp passenger list.
	*
	* @return the ID of this temp passenger list
	*/
	public long getId() {
		return _tempPassengerList.getId();
	}

	/**
	* Sets the ID of this temp passenger list.
	*
	* @param id the ID of this temp passenger list
	*/
	public void setId(long id) {
		_tempPassengerList.setId(id);
	}

	/**
	* Returns the request code of this temp passenger list.
	*
	* @return the request code of this temp passenger list
	*/
	public java.lang.String getRequestCode() {
		return _tempPassengerList.getRequestCode();
	}

	/**
	* Sets the request code of this temp passenger list.
	*
	* @param requestCode the request code of this temp passenger list
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempPassengerList.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp passenger list.
	*
	* @return the request state of this temp passenger list
	*/
	public int getRequestState() {
		return _tempPassengerList.getRequestState();
	}

	/**
	* Sets the request state of this temp passenger list.
	*
	* @param requestState the request state of this temp passenger list
	*/
	public void setRequestState(int requestState) {
		_tempPassengerList.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp passenger list.
	*
	* @return the document name of this temp passenger list
	*/
	public long getDocumentName() {
		return _tempPassengerList.getDocumentName();
	}

	/**
	* Sets the document name of this temp passenger list.
	*
	* @param documentName the document name of this temp passenger list
	*/
	public void setDocumentName(long documentName) {
		_tempPassengerList.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp passenger list.
	*
	* @return the user created of this temp passenger list
	*/
	public java.lang.String getUserCreated() {
		return _tempPassengerList.getUserCreated();
	}

	/**
	* Sets the user created of this temp passenger list.
	*
	* @param userCreated the user created of this temp passenger list
	*/
	public void setUserCreated(java.lang.String userCreated) {
		_tempPassengerList.setUserCreated(userCreated);
	}

	/**
	* Returns the is arrival of this temp passenger list.
	*
	* @return the is arrival of this temp passenger list
	*/
	public int getIsArrival() {
		return _tempPassengerList.getIsArrival();
	}

	/**
	* Sets the is arrival of this temp passenger list.
	*
	* @param isArrival the is arrival of this temp passenger list
	*/
	public void setIsArrival(int isArrival) {
		_tempPassengerList.setIsArrival(isArrival);
	}

	/**
	* Returns the name of ship of this temp passenger list.
	*
	* @return the name of ship of this temp passenger list
	*/
	public java.lang.String getNameOfShip() {
		return _tempPassengerList.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp passenger list.
	*
	* @param nameOfShip the name of ship of this temp passenger list
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempPassengerList.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the port of arrival code of this temp passenger list.
	*
	* @return the port of arrival code of this temp passenger list
	*/
	public java.lang.String getPortOfArrivalCode() {
		return _tempPassengerList.getPortOfArrivalCode();
	}

	/**
	* Sets the port of arrival code of this temp passenger list.
	*
	* @param portOfArrivalCode the port of arrival code of this temp passenger list
	*/
	public void setPortOfArrivalCode(java.lang.String portOfArrivalCode) {
		_tempPassengerList.setPortOfArrivalCode(portOfArrivalCode);
	}

	/**
	* Returns the date of arrival of this temp passenger list.
	*
	* @return the date of arrival of this temp passenger list
	*/
	public java.util.Date getDateOfArrival() {
		return _tempPassengerList.getDateOfArrival();
	}

	/**
	* Sets the date of arrival of this temp passenger list.
	*
	* @param dateOfArrival the date of arrival of this temp passenger list
	*/
	public void setDateOfArrival(java.util.Date dateOfArrival) {
		_tempPassengerList.setDateOfArrival(dateOfArrival);
	}

	/**
	* Returns the imo number of this temp passenger list.
	*
	* @return the imo number of this temp passenger list
	*/
	public java.lang.String getImoNumber() {
		return _tempPassengerList.getImoNumber();
	}

	/**
	* Sets the imo number of this temp passenger list.
	*
	* @param imoNumber the imo number of this temp passenger list
	*/
	public void setImoNumber(java.lang.String imoNumber) {
		_tempPassengerList.setImoNumber(imoNumber);
	}

	/**
	* Returns the call sign of this temp passenger list.
	*
	* @return the call sign of this temp passenger list
	*/
	public java.lang.String getCallSign() {
		return _tempPassengerList.getCallSign();
	}

	/**
	* Sets the call sign of this temp passenger list.
	*
	* @param callSign the call sign of this temp passenger list
	*/
	public void setCallSign(java.lang.String callSign) {
		_tempPassengerList.setCallSign(callSign);
	}

	/**
	* Returns the voyage number of this temp passenger list.
	*
	* @return the voyage number of this temp passenger list
	*/
	public java.lang.String getVoyageNumber() {
		return _tempPassengerList.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp passenger list.
	*
	* @param voyageNumber the voyage number of this temp passenger list
	*/
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempPassengerList.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the flag state of ship of this temp passenger list.
	*
	* @return the flag state of ship of this temp passenger list
	*/
	public java.lang.String getFlagStateOfShip() {
		return _tempPassengerList.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp passenger list.
	*
	* @param flagStateOfShip the flag state of ship of this temp passenger list
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempPassengerList.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the list passengers of this temp passenger list.
	*
	* @return the list passengers of this temp passenger list
	*/
	public int getListPassengers() {
		return _tempPassengerList.getListPassengers();
	}

	/**
	* Sets the list passengers of this temp passenger list.
	*
	* @param listPassengers the list passengers of this temp passenger list
	*/
	public void setListPassengers(int listPassengers) {
		_tempPassengerList.setListPassengers(listPassengers);
	}

	/**
	* Returns the sign place of this temp passenger list.
	*
	* @return the sign place of this temp passenger list
	*/
	public java.lang.String getSignPlace() {
		return _tempPassengerList.getSignPlace();
	}

	/**
	* Sets the sign place of this temp passenger list.
	*
	* @param signPlace the sign place of this temp passenger list
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_tempPassengerList.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp passenger list.
	*
	* @return the sign date of this temp passenger list
	*/
	public java.util.Date getSignDate() {
		return _tempPassengerList.getSignDate();
	}

	/**
	* Sets the sign date of this temp passenger list.
	*
	* @param signDate the sign date of this temp passenger list
	*/
	public void setSignDate(java.util.Date signDate) {
		_tempPassengerList.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp passenger list.
	*
	* @return the master signed of this temp passenger list
	*/
	public int getMasterSigned() {
		return _tempPassengerList.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp passenger list.
	*
	* @param masterSigned the master signed of this temp passenger list
	*/
	public void setMasterSigned(int masterSigned) {
		_tempPassengerList.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp passenger list.
	*
	* @return the master signed image of this temp passenger list
	*/
	public int getMasterSignedImage() {
		return _tempPassengerList.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp passenger list.
	*
	* @param masterSignedImage the master signed image of this temp passenger list
	*/
	public void setMasterSignedImage(int masterSignedImage) {
		_tempPassengerList.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp passenger list.
	*
	* @return the attached file of this temp passenger list
	*/
	public long getAttachedFile() {
		return _tempPassengerList.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp passenger list.
	*
	* @param attachedFile the attached file of this temp passenger list
	*/
	public void setAttachedFile(long attachedFile) {
		_tempPassengerList.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp passenger list.
	*
	* @return the document year of this temp passenger list
	*/
	public int getDocumentYear() {
		return _tempPassengerList.getDocumentYear();
	}

	/**
	* Sets the document year of this temp passenger list.
	*
	* @param documentYear the document year of this temp passenger list
	*/
	public void setDocumentYear(int documentYear) {
		_tempPassengerList.setDocumentYear(documentYear);
	}

	/**
	* Returns the number of left passengers of this temp passenger list.
	*
	* @return the number of left passengers of this temp passenger list
	*/
	public int getNumberOfLeftPassengers() {
		return _tempPassengerList.getNumberOfLeftPassengers();
	}

	/**
	* Sets the number of left passengers of this temp passenger list.
	*
	* @param NumberOfLeftPassengers the number of left passengers of this temp passenger list
	*/
	public void setNumberOfLeftPassengers(int NumberOfLeftPassengers) {
		_tempPassengerList.setNumberOfLeftPassengers(NumberOfLeftPassengers);
	}

	/**
	* Returns the number of v nmeses of this temp passenger list.
	*
	* @return the number of v nmeses of this temp passenger list
	*/
	public int getNumberOfVNmeses() {
		return _tempPassengerList.getNumberOfVNmeses();
	}

	/**
	* Sets the number of v nmeses of this temp passenger list.
	*
	* @param NumberOfVNmeses the number of v nmeses of this temp passenger list
	*/
	public void setNumberOfVNmeses(int NumberOfVNmeses) {
		_tempPassengerList.setNumberOfVNmeses(NumberOfVNmeses);
	}

	/**
	* Returns the number of foreigners of this temp passenger list.
	*
	* @return the number of foreigners of this temp passenger list
	*/
	public int getNumberOfForeigners() {
		return _tempPassengerList.getNumberOfForeigners();
	}

	/**
	* Sets the number of foreigners of this temp passenger list.
	*
	* @param NumberOfForeigners the number of foreigners of this temp passenger list
	*/
	public void setNumberOfForeigners(int NumberOfForeigners) {
		_tempPassengerList.setNumberOfForeigners(NumberOfForeigners);
	}

	/**
	* Returns the total passengers of this temp passenger list.
	*
	* @return the total passengers of this temp passenger list
	*/
	public int getTotalPassengers() {
		return _tempPassengerList.getTotalPassengers();
	}

	/**
	* Sets the total passengers of this temp passenger list.
	*
	* @param TotalPassengers the total passengers of this temp passenger list
	*/
	public void setTotalPassengers(int TotalPassengers) {
		_tempPassengerList.setTotalPassengers(TotalPassengers);
	}

	public boolean isNew() {
		return _tempPassengerList.isNew();
	}

	public void setNew(boolean n) {
		_tempPassengerList.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempPassengerList.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempPassengerList.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempPassengerList.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempPassengerList.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempPassengerList.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempPassengerList.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempPassengerList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempPassengerListWrapper((TempPassengerList)_tempPassengerList.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempPassengerList tempPassengerList) {
		return _tempPassengerList.compareTo(tempPassengerList);
	}

	@Override
	public int hashCode() {
		return _tempPassengerList.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempPassengerList> toCacheModel() {
		return _tempPassengerList.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempPassengerList toEscapedModel() {
		return new TempPassengerListWrapper(_tempPassengerList.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempPassengerList.toString();
	}

	public java.lang.String toXmlString() {
		return _tempPassengerList.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempPassengerList.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempPassengerList getWrappedTempPassengerList() {
		return _tempPassengerList;
	}

	public TempPassengerList getWrappedModel() {
		return _tempPassengerList;
	}

	public void resetOriginalValues() {
		_tempPassengerList.resetOriginalValues();
	}

	private TempPassengerList _tempPassengerList;
}