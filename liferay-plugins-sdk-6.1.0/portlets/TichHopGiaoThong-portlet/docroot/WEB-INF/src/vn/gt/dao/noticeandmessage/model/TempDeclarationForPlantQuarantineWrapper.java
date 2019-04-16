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
 * This class is a wrapper for {@link TempDeclarationForPlantQuarantine}.
 * </p>
 *
 * @author    win_64
 * @see       TempDeclarationForPlantQuarantine
 * @generated
 */
public class TempDeclarationForPlantQuarantineWrapper
	implements TempDeclarationForPlantQuarantine,
		ModelWrapper<TempDeclarationForPlantQuarantine> {
	public TempDeclarationForPlantQuarantineWrapper(
		TempDeclarationForPlantQuarantine tempDeclarationForPlantQuarantine) {
		_tempDeclarationForPlantQuarantine = tempDeclarationForPlantQuarantine;
	}

	public Class<?> getModelClass() {
		return TempDeclarationForPlantQuarantine.class;
	}

	public String getModelClassName() {
		return TempDeclarationForPlantQuarantine.class.getName();
	}

	/**
	* Returns the primary key of this temp declaration for plant quarantine.
	*
	* @return the primary key of this temp declaration for plant quarantine
	*/
	public long getPrimaryKey() {
		return _tempDeclarationForPlantQuarantine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp declaration for plant quarantine.
	*
	* @param primaryKey the primary key of this temp declaration for plant quarantine
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempDeclarationForPlantQuarantine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp declaration for plant quarantine.
	*
	* @return the ID of this temp declaration for plant quarantine
	*/
	public long getId() {
		return _tempDeclarationForPlantQuarantine.getId();
	}

	/**
	* Sets the ID of this temp declaration for plant quarantine.
	*
	* @param id the ID of this temp declaration for plant quarantine
	*/
	public void setId(long id) {
		_tempDeclarationForPlantQuarantine.setId(id);
	}

	/**
	* Returns the request code of this temp declaration for plant quarantine.
	*
	* @return the request code of this temp declaration for plant quarantine
	*/
	public java.lang.String getRequestCode() {
		return _tempDeclarationForPlantQuarantine.getRequestCode();
	}

	/**
	* Sets the request code of this temp declaration for plant quarantine.
	*
	* @param requestCode the request code of this temp declaration for plant quarantine
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempDeclarationForPlantQuarantine.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp declaration for plant quarantine.
	*
	* @return the request state of this temp declaration for plant quarantine
	*/
	public int getRequestState() {
		return _tempDeclarationForPlantQuarantine.getRequestState();
	}

	/**
	* Sets the request state of this temp declaration for plant quarantine.
	*
	* @param requestState the request state of this temp declaration for plant quarantine
	*/
	public void setRequestState(int requestState) {
		_tempDeclarationForPlantQuarantine.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp declaration for plant quarantine.
	*
	* @return the document name of this temp declaration for plant quarantine
	*/
	public long getDocumentName() {
		return _tempDeclarationForPlantQuarantine.getDocumentName();
	}

	/**
	* Sets the document name of this temp declaration for plant quarantine.
	*
	* @param documentName the document name of this temp declaration for plant quarantine
	*/
	public void setDocumentName(long documentName) {
		_tempDeclarationForPlantQuarantine.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp declaration for plant quarantine.
	*
	* @return the user created of this temp declaration for plant quarantine
	*/
	public java.lang.String getUserCreated() {
		return _tempDeclarationForPlantQuarantine.getUserCreated();
	}

	/**
	* Sets the user created of this temp declaration for plant quarantine.
	*
	* @param userCreated the user created of this temp declaration for plant quarantine
	*/
	public void setUserCreated(java.lang.String userCreated) {
		_tempDeclarationForPlantQuarantine.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp declaration for plant quarantine.
	*
	* @return the name of ship of this temp declaration for plant quarantine
	*/
	public java.lang.String getNameOfShip() {
		return _tempDeclarationForPlantQuarantine.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp declaration for plant quarantine.
	*
	* @param nameOfShip the name of ship of this temp declaration for plant quarantine
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempDeclarationForPlantQuarantine.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp declaration for plant quarantine.
	*
	* @return the flag state of ship of this temp declaration for plant quarantine
	*/
	public java.lang.String getFlagStateOfShip() {
		return _tempDeclarationForPlantQuarantine.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp declaration for plant quarantine.
	*
	* @param flagStateOfShip the flag state of ship of this temp declaration for plant quarantine
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempDeclarationForPlantQuarantine.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp declaration for plant quarantine.
	*
	* @return the name of master of this temp declaration for plant quarantine
	*/
	public java.lang.String getNameOfMaster() {
		return _tempDeclarationForPlantQuarantine.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp declaration for plant quarantine.
	*
	* @param nameOfMaster the name of master of this temp declaration for plant quarantine
	*/
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempDeclarationForPlantQuarantine.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the doctor name of this temp declaration for plant quarantine.
	*
	* @return the doctor name of this temp declaration for plant quarantine
	*/
	public java.lang.String getDoctorName() {
		return _tempDeclarationForPlantQuarantine.getDoctorName();
	}

	/**
	* Sets the doctor name of this temp declaration for plant quarantine.
	*
	* @param doctorName the doctor name of this temp declaration for plant quarantine
	*/
	public void setDoctorName(java.lang.String doctorName) {
		_tempDeclarationForPlantQuarantine.setDoctorName(doctorName);
	}

	/**
	* Returns the number of crew of this temp declaration for plant quarantine.
	*
	* @return the number of crew of this temp declaration for plant quarantine
	*/
	public int getNumberOfCrew() {
		return _tempDeclarationForPlantQuarantine.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp declaration for plant quarantine.
	*
	* @param numberOfCrew the number of crew of this temp declaration for plant quarantine
	*/
	public void setNumberOfCrew(int numberOfCrew) {
		_tempDeclarationForPlantQuarantine.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp declaration for plant quarantine.
	*
	* @return the number of passengers of this temp declaration for plant quarantine
	*/
	public int getNumberOfPassengers() {
		return _tempDeclarationForPlantQuarantine.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp declaration for plant quarantine.
	*
	* @param numberOfPassengers the number of passengers of this temp declaration for plant quarantine
	*/
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempDeclarationForPlantQuarantine.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the last port of call code of this temp declaration for plant quarantine.
	*
	* @return the last port of call code of this temp declaration for plant quarantine
	*/
	public java.lang.String getLastPortOfCallCode() {
		return _tempDeclarationForPlantQuarantine.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp declaration for plant quarantine.
	*
	* @param lastPortOfCallCode the last port of call code of this temp declaration for plant quarantine
	*/
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempDeclarationForPlantQuarantine.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the next port of call code of this temp declaration for plant quarantine.
	*
	* @return the next port of call code of this temp declaration for plant quarantine
	*/
	public java.lang.String getNextPortOfCallCode() {
		return _tempDeclarationForPlantQuarantine.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this temp declaration for plant quarantine.
	*
	* @param nextPortOfCallCode the next port of call code of this temp declaration for plant quarantine
	*/
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_tempDeclarationForPlantQuarantine.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the first port of loading code of this temp declaration for plant quarantine.
	*
	* @return the first port of loading code of this temp declaration for plant quarantine
	*/
	public java.lang.String getFirstPortOfLoadingCode() {
		return _tempDeclarationForPlantQuarantine.getFirstPortOfLoadingCode();
	}

	/**
	* Sets the first port of loading code of this temp declaration for plant quarantine.
	*
	* @param firstPortOfLoadingCode the first port of loading code of this temp declaration for plant quarantine
	*/
	public void setFirstPortOfLoadingCode(
		java.lang.String firstPortOfLoadingCode) {
		_tempDeclarationForPlantQuarantine.setFirstPortOfLoadingCode(firstPortOfLoadingCode);
	}

	/**
	* Returns the date ofdeparture of this temp declaration for plant quarantine.
	*
	* @return the date ofdeparture of this temp declaration for plant quarantine
	*/
	public java.util.Date getDateOfdeparture() {
		return _tempDeclarationForPlantQuarantine.getDateOfdeparture();
	}

	/**
	* Sets the date ofdeparture of this temp declaration for plant quarantine.
	*
	* @param dateOfdeparture the date ofdeparture of this temp declaration for plant quarantine
	*/
	public void setDateOfdeparture(java.util.Date dateOfdeparture) {
		_tempDeclarationForPlantQuarantine.setDateOfdeparture(dateOfdeparture);
	}

	/**
	* Returns the plant name first of this temp declaration for plant quarantine.
	*
	* @return the plant name first of this temp declaration for plant quarantine
	*/
	public java.lang.String getPlantNameFirst() {
		return _tempDeclarationForPlantQuarantine.getPlantNameFirst();
	}

	/**
	* Sets the plant name first of this temp declaration for plant quarantine.
	*
	* @param plantNameFirst the plant name first of this temp declaration for plant quarantine
	*/
	public void setPlantNameFirst(java.lang.String plantNameFirst) {
		_tempDeclarationForPlantQuarantine.setPlantNameFirst(plantNameFirst);
	}

	/**
	* Returns the plant name between of this temp declaration for plant quarantine.
	*
	* @return the plant name between of this temp declaration for plant quarantine
	*/
	public java.lang.String getPlantNameBetween() {
		return _tempDeclarationForPlantQuarantine.getPlantNameBetween();
	}

	/**
	* Sets the plant name between of this temp declaration for plant quarantine.
	*
	* @param plantNameBetween the plant name between of this temp declaration for plant quarantine
	*/
	public void setPlantNameBetween(java.lang.String plantNameBetween) {
		_tempDeclarationForPlantQuarantine.setPlantNameBetween(plantNameBetween);
	}

	/**
	* Returns the plant name this of this temp declaration for plant quarantine.
	*
	* @return the plant name this of this temp declaration for plant quarantine
	*/
	public java.lang.String getPlantNameThis() {
		return _tempDeclarationForPlantQuarantine.getPlantNameThis();
	}

	/**
	* Sets the plant name this of this temp declaration for plant quarantine.
	*
	* @param plantNameThis the plant name this of this temp declaration for plant quarantine
	*/
	public void setPlantNameThis(java.lang.String plantNameThis) {
		_tempDeclarationForPlantQuarantine.setPlantNameThis(plantNameThis);
	}

	/**
	* Returns the sign place of this temp declaration for plant quarantine.
	*
	* @return the sign place of this temp declaration for plant quarantine
	*/
	public java.lang.String getSignPlace() {
		return _tempDeclarationForPlantQuarantine.getSignPlace();
	}

	/**
	* Sets the sign place of this temp declaration for plant quarantine.
	*
	* @param signPlace the sign place of this temp declaration for plant quarantine
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_tempDeclarationForPlantQuarantine.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp declaration for plant quarantine.
	*
	* @return the sign date of this temp declaration for plant quarantine
	*/
	public java.util.Date getSignDate() {
		return _tempDeclarationForPlantQuarantine.getSignDate();
	}

	/**
	* Sets the sign date of this temp declaration for plant quarantine.
	*
	* @param signDate the sign date of this temp declaration for plant quarantine
	*/
	public void setSignDate(java.util.Date signDate) {
		_tempDeclarationForPlantQuarantine.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp declaration for plant quarantine.
	*
	* @return the master signed of this temp declaration for plant quarantine
	*/
	public int getMasterSigned() {
		return _tempDeclarationForPlantQuarantine.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp declaration for plant quarantine.
	*
	* @param masterSigned the master signed of this temp declaration for plant quarantine
	*/
	public void setMasterSigned(int masterSigned) {
		_tempDeclarationForPlantQuarantine.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp declaration for plant quarantine.
	*
	* @return the master signed image of this temp declaration for plant quarantine
	*/
	public int getMasterSignedImage() {
		return _tempDeclarationForPlantQuarantine.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp declaration for plant quarantine.
	*
	* @param masterSignedImage the master signed image of this temp declaration for plant quarantine
	*/
	public void setMasterSignedImage(int masterSignedImage) {
		_tempDeclarationForPlantQuarantine.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp declaration for plant quarantine.
	*
	* @return the attached file of this temp declaration for plant quarantine
	*/
	public long getAttachedFile() {
		return _tempDeclarationForPlantQuarantine.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp declaration for plant quarantine.
	*
	* @param attachedFile the attached file of this temp declaration for plant quarantine
	*/
	public void setAttachedFile(long attachedFile) {
		_tempDeclarationForPlantQuarantine.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp declaration for plant quarantine.
	*
	* @return the document year of this temp declaration for plant quarantine
	*/
	public int getDocumentYear() {
		return _tempDeclarationForPlantQuarantine.getDocumentYear();
	}

	/**
	* Sets the document year of this temp declaration for plant quarantine.
	*
	* @param documentYear the document year of this temp declaration for plant quarantine
	*/
	public void setDocumentYear(int documentYear) {
		_tempDeclarationForPlantQuarantine.setDocumentYear(documentYear);
	}

	public boolean isNew() {
		return _tempDeclarationForPlantQuarantine.isNew();
	}

	public void setNew(boolean n) {
		_tempDeclarationForPlantQuarantine.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempDeclarationForPlantQuarantine.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempDeclarationForPlantQuarantine.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempDeclarationForPlantQuarantine.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDeclarationForPlantQuarantine.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDeclarationForPlantQuarantine.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDeclarationForPlantQuarantine.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDeclarationForPlantQuarantine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDeclarationForPlantQuarantineWrapper((TempDeclarationForPlantQuarantine)_tempDeclarationForPlantQuarantine.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine tempDeclarationForPlantQuarantine) {
		return _tempDeclarationForPlantQuarantine.compareTo(tempDeclarationForPlantQuarantine);
	}

	@Override
	public int hashCode() {
		return _tempDeclarationForPlantQuarantine.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine> toCacheModel() {
		return _tempDeclarationForPlantQuarantine.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine toEscapedModel() {
		return new TempDeclarationForPlantQuarantineWrapper(_tempDeclarationForPlantQuarantine.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDeclarationForPlantQuarantine.toString();
	}

	public java.lang.String toXmlString() {
		return _tempDeclarationForPlantQuarantine.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDeclarationForPlantQuarantine.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempDeclarationForPlantQuarantine getWrappedTempDeclarationForPlantQuarantine() {
		return _tempDeclarationForPlantQuarantine;
	}

	public TempDeclarationForPlantQuarantine getWrappedModel() {
		return _tempDeclarationForPlantQuarantine;
	}

	public void resetOriginalValues() {
		_tempDeclarationForPlantQuarantine.resetOriginalValues();
	}

	private TempDeclarationForPlantQuarantine _tempDeclarationForPlantQuarantine;
}