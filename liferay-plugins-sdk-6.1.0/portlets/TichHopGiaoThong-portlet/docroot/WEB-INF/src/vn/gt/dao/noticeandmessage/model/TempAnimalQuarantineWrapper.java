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
 * This class is a wrapper for {@link TempAnimalQuarantine}.
 * </p>
 *
 * @author    win_64
 * @see       TempAnimalQuarantine
 * @generated
 */
public class TempAnimalQuarantineWrapper implements TempAnimalQuarantine,
	ModelWrapper<TempAnimalQuarantine> {
	public TempAnimalQuarantineWrapper(
		TempAnimalQuarantine tempAnimalQuarantine) {
		_tempAnimalQuarantine = tempAnimalQuarantine;
	}

	public Class<?> getModelClass() {
		return TempAnimalQuarantine.class;
	}

	public String getModelClassName() {
		return TempAnimalQuarantine.class.getName();
	}

	/**
	* Returns the primary key of this temp animal quarantine.
	*
	* @return the primary key of this temp animal quarantine
	*/
	public long getPrimaryKey() {
		return _tempAnimalQuarantine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp animal quarantine.
	*
	* @param primaryKey the primary key of this temp animal quarantine
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempAnimalQuarantine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp animal quarantine.
	*
	* @return the ID of this temp animal quarantine
	*/
	public long getId() {
		return _tempAnimalQuarantine.getId();
	}

	/**
	* Sets the ID of this temp animal quarantine.
	*
	* @param id the ID of this temp animal quarantine
	*/
	public void setId(long id) {
		_tempAnimalQuarantine.setId(id);
	}

	/**
	* Returns the request code of this temp animal quarantine.
	*
	* @return the request code of this temp animal quarantine
	*/
	public java.lang.String getRequestCode() {
		return _tempAnimalQuarantine.getRequestCode();
	}

	/**
	* Sets the request code of this temp animal quarantine.
	*
	* @param requestCode the request code of this temp animal quarantine
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempAnimalQuarantine.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp animal quarantine.
	*
	* @return the request state of this temp animal quarantine
	*/
	public int getRequestState() {
		return _tempAnimalQuarantine.getRequestState();
	}

	/**
	* Sets the request state of this temp animal quarantine.
	*
	* @param requestState the request state of this temp animal quarantine
	*/
	public void setRequestState(int requestState) {
		_tempAnimalQuarantine.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp animal quarantine.
	*
	* @return the document name of this temp animal quarantine
	*/
	public long getDocumentName() {
		return _tempAnimalQuarantine.getDocumentName();
	}

	/**
	* Sets the document name of this temp animal quarantine.
	*
	* @param documentName the document name of this temp animal quarantine
	*/
	public void setDocumentName(long documentName) {
		_tempAnimalQuarantine.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp animal quarantine.
	*
	* @return the document year of this temp animal quarantine
	*/
	public int getDocumentYear() {
		return _tempAnimalQuarantine.getDocumentYear();
	}

	/**
	* Sets the document year of this temp animal quarantine.
	*
	* @param documentYear the document year of this temp animal quarantine
	*/
	public void setDocumentYear(int documentYear) {
		_tempAnimalQuarantine.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp animal quarantine.
	*
	* @return the user created of this temp animal quarantine
	*/
	public java.lang.String getUserCreated() {
		return _tempAnimalQuarantine.getUserCreated();
	}

	/**
	* Sets the user created of this temp animal quarantine.
	*
	* @param userCreated the user created of this temp animal quarantine
	*/
	public void setUserCreated(java.lang.String userCreated) {
		_tempAnimalQuarantine.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp animal quarantine.
	*
	* @return the name of ship of this temp animal quarantine
	*/
	public java.lang.String getNameOfShip() {
		return _tempAnimalQuarantine.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp animal quarantine.
	*
	* @param nameOfShip the name of ship of this temp animal quarantine
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempAnimalQuarantine.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp animal quarantine.
	*
	* @return the flag state of ship of this temp animal quarantine
	*/
	public java.lang.String getFlagStateOfShip() {
		return _tempAnimalQuarantine.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp animal quarantine.
	*
	* @param flagStateOfShip the flag state of ship of this temp animal quarantine
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempAnimalQuarantine.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the number of crew of this temp animal quarantine.
	*
	* @return the number of crew of this temp animal quarantine
	*/
	public int getNumberOfCrew() {
		return _tempAnimalQuarantine.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp animal quarantine.
	*
	* @param numberOfCrew the number of crew of this temp animal quarantine
	*/
	public void setNumberOfCrew(int numberOfCrew) {
		_tempAnimalQuarantine.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp animal quarantine.
	*
	* @return the number of passengers of this temp animal quarantine
	*/
	public int getNumberOfPassengers() {
		return _tempAnimalQuarantine.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp animal quarantine.
	*
	* @param numberOfPassengers the number of passengers of this temp animal quarantine
	*/
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempAnimalQuarantine.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the last port of call code of this temp animal quarantine.
	*
	* @return the last port of call code of this temp animal quarantine
	*/
	public java.lang.String getLastPortOfCallCode() {
		return _tempAnimalQuarantine.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp animal quarantine.
	*
	* @param lastPortOfCallCode the last port of call code of this temp animal quarantine
	*/
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempAnimalQuarantine.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the next port of call code of this temp animal quarantine.
	*
	* @return the next port of call code of this temp animal quarantine
	*/
	public java.lang.String getNextPortOfCallCode() {
		return _tempAnimalQuarantine.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this temp animal quarantine.
	*
	* @param nextPortOfCallCode the next port of call code of this temp animal quarantine
	*/
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_tempAnimalQuarantine.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the animal name first of this temp animal quarantine.
	*
	* @return the animal name first of this temp animal quarantine
	*/
	public java.lang.String getAnimalNameFirst() {
		return _tempAnimalQuarantine.getAnimalNameFirst();
	}

	/**
	* Sets the animal name first of this temp animal quarantine.
	*
	* @param animalNameFirst the animal name first of this temp animal quarantine
	*/
	public void setAnimalNameFirst(java.lang.String animalNameFirst) {
		_tempAnimalQuarantine.setAnimalNameFirst(animalNameFirst);
	}

	/**
	* Returns the animal name between of this temp animal quarantine.
	*
	* @return the animal name between of this temp animal quarantine
	*/
	public java.lang.String getAnimalNameBetween() {
		return _tempAnimalQuarantine.getAnimalNameBetween();
	}

	/**
	* Sets the animal name between of this temp animal quarantine.
	*
	* @param animalNameBetween the animal name between of this temp animal quarantine
	*/
	public void setAnimalNameBetween(java.lang.String animalNameBetween) {
		_tempAnimalQuarantine.setAnimalNameBetween(animalNameBetween);
	}

	/**
	* Returns the animal name this of this temp animal quarantine.
	*
	* @return the animal name this of this temp animal quarantine
	*/
	public java.lang.String getAnimalNameThis() {
		return _tempAnimalQuarantine.getAnimalNameThis();
	}

	/**
	* Sets the animal name this of this temp animal quarantine.
	*
	* @param animalNameThis the animal name this of this temp animal quarantine
	*/
	public void setAnimalNameThis(java.lang.String animalNameThis) {
		_tempAnimalQuarantine.setAnimalNameThis(animalNameThis);
	}

	/**
	* Returns the name of master of this temp animal quarantine.
	*
	* @return the name of master of this temp animal quarantine
	*/
	public java.lang.String getNameOfMaster() {
		return _tempAnimalQuarantine.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp animal quarantine.
	*
	* @param nameOfMaster the name of master of this temp animal quarantine
	*/
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempAnimalQuarantine.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the sign place of this temp animal quarantine.
	*
	* @return the sign place of this temp animal quarantine
	*/
	public java.lang.String getSignPlace() {
		return _tempAnimalQuarantine.getSignPlace();
	}

	/**
	* Sets the sign place of this temp animal quarantine.
	*
	* @param signPlace the sign place of this temp animal quarantine
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_tempAnimalQuarantine.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp animal quarantine.
	*
	* @return the sign date of this temp animal quarantine
	*/
	public java.util.Date getSignDate() {
		return _tempAnimalQuarantine.getSignDate();
	}

	/**
	* Sets the sign date of this temp animal quarantine.
	*
	* @param signDate the sign date of this temp animal quarantine
	*/
	public void setSignDate(java.util.Date signDate) {
		_tempAnimalQuarantine.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp animal quarantine.
	*
	* @return the master signed of this temp animal quarantine
	*/
	public int getMasterSigned() {
		return _tempAnimalQuarantine.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp animal quarantine.
	*
	* @param masterSigned the master signed of this temp animal quarantine
	*/
	public void setMasterSigned(int masterSigned) {
		_tempAnimalQuarantine.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp animal quarantine.
	*
	* @return the master signed image of this temp animal quarantine
	*/
	public int getMasterSignedImage() {
		return _tempAnimalQuarantine.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp animal quarantine.
	*
	* @param masterSignedImage the master signed image of this temp animal quarantine
	*/
	public void setMasterSignedImage(int masterSignedImage) {
		_tempAnimalQuarantine.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp animal quarantine.
	*
	* @return the attached file of this temp animal quarantine
	*/
	public long getAttachedFile() {
		return _tempAnimalQuarantine.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp animal quarantine.
	*
	* @param attachedFile the attached file of this temp animal quarantine
	*/
	public void setAttachedFile(long attachedFile) {
		_tempAnimalQuarantine.setAttachedFile(attachedFile);
	}

	public boolean isNew() {
		return _tempAnimalQuarantine.isNew();
	}

	public void setNew(boolean n) {
		_tempAnimalQuarantine.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempAnimalQuarantine.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempAnimalQuarantine.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempAnimalQuarantine.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempAnimalQuarantine.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempAnimalQuarantine.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempAnimalQuarantine.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempAnimalQuarantine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempAnimalQuarantineWrapper((TempAnimalQuarantine)_tempAnimalQuarantine.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine tempAnimalQuarantine) {
		return _tempAnimalQuarantine.compareTo(tempAnimalQuarantine);
	}

	@Override
	public int hashCode() {
		return _tempAnimalQuarantine.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine> toCacheModel() {
		return _tempAnimalQuarantine.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine toEscapedModel() {
		return new TempAnimalQuarantineWrapper(_tempAnimalQuarantine.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempAnimalQuarantine.toString();
	}

	public java.lang.String toXmlString() {
		return _tempAnimalQuarantine.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempAnimalQuarantine.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempAnimalQuarantine getWrappedTempAnimalQuarantine() {
		return _tempAnimalQuarantine;
	}

	public TempAnimalQuarantine getWrappedModel() {
		return _tempAnimalQuarantine;
	}

	public void resetOriginalValues() {
		_tempAnimalQuarantine.resetOriginalValues();
	}

	private TempAnimalQuarantine _tempAnimalQuarantine;
}