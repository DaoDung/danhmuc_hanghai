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
 * This class is a wrapper for {@link TempPlantQuarantine}.
 * </p>
 *
 * @author    win_64
 * @see       TempPlantQuarantine
 * @generated
 */
public class TempPlantQuarantineWrapper implements TempPlantQuarantine,
	ModelWrapper<TempPlantQuarantine> {
	public TempPlantQuarantineWrapper(TempPlantQuarantine tempPlantQuarantine) {
		_tempPlantQuarantine = tempPlantQuarantine;
	}

	public Class<?> getModelClass() {
		return TempPlantQuarantine.class;
	}

	public String getModelClassName() {
		return TempPlantQuarantine.class.getName();
	}

	/**
	* Returns the primary key of this temp plant quarantine.
	*
	* @return the primary key of this temp plant quarantine
	*/
	public long getPrimaryKey() {
		return _tempPlantQuarantine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp plant quarantine.
	*
	* @param primaryKey the primary key of this temp plant quarantine
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempPlantQuarantine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp plant quarantine.
	*
	* @return the ID of this temp plant quarantine
	*/
	public long getId() {
		return _tempPlantQuarantine.getId();
	}

	/**
	* Sets the ID of this temp plant quarantine.
	*
	* @param id the ID of this temp plant quarantine
	*/
	public void setId(long id) {
		_tempPlantQuarantine.setId(id);
	}

	/**
	* Returns the request code of this temp plant quarantine.
	*
	* @return the request code of this temp plant quarantine
	*/
	public java.lang.String getRequestCode() {
		return _tempPlantQuarantine.getRequestCode();
	}

	/**
	* Sets the request code of this temp plant quarantine.
	*
	* @param requestCode the request code of this temp plant quarantine
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempPlantQuarantine.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp plant quarantine.
	*
	* @return the request state of this temp plant quarantine
	*/
	public int getRequestState() {
		return _tempPlantQuarantine.getRequestState();
	}

	/**
	* Sets the request state of this temp plant quarantine.
	*
	* @param requestState the request state of this temp plant quarantine
	*/
	public void setRequestState(int requestState) {
		_tempPlantQuarantine.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp plant quarantine.
	*
	* @return the document name of this temp plant quarantine
	*/
	public long getDocumentName() {
		return _tempPlantQuarantine.getDocumentName();
	}

	/**
	* Sets the document name of this temp plant quarantine.
	*
	* @param documentName the document name of this temp plant quarantine
	*/
	public void setDocumentName(long documentName) {
		_tempPlantQuarantine.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp plant quarantine.
	*
	* @return the user created of this temp plant quarantine
	*/
	public java.lang.String getUserCreated() {
		return _tempPlantQuarantine.getUserCreated();
	}

	/**
	* Sets the user created of this temp plant quarantine.
	*
	* @param userCreated the user created of this temp plant quarantine
	*/
	public void setUserCreated(java.lang.String userCreated) {
		_tempPlantQuarantine.setUserCreated(userCreated);
	}

	/**
	* Returns the document year of this temp plant quarantine.
	*
	* @return the document year of this temp plant quarantine
	*/
	public int getDocumentYear() {
		return _tempPlantQuarantine.getDocumentYear();
	}

	/**
	* Sets the document year of this temp plant quarantine.
	*
	* @param documentYear the document year of this temp plant quarantine
	*/
	public void setDocumentYear(int documentYear) {
		_tempPlantQuarantine.setDocumentYear(documentYear);
	}

	/**
	* Returns the name of ship of this temp plant quarantine.
	*
	* @return the name of ship of this temp plant quarantine
	*/
	public java.lang.String getNameOfShip() {
		return _tempPlantQuarantine.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp plant quarantine.
	*
	* @param nameOfShip the name of ship of this temp plant quarantine
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempPlantQuarantine.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp plant quarantine.
	*
	* @return the flag state of ship of this temp plant quarantine
	*/
	public java.lang.String getFlagStateOfShip() {
		return _tempPlantQuarantine.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp plant quarantine.
	*
	* @param flagStateOfShip the flag state of ship of this temp plant quarantine
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempPlantQuarantine.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp plant quarantine.
	*
	* @return the name of master of this temp plant quarantine
	*/
	public java.lang.String getNameOfMaster() {
		return _tempPlantQuarantine.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp plant quarantine.
	*
	* @param nameOfMaster the name of master of this temp plant quarantine
	*/
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempPlantQuarantine.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the doctor name of this temp plant quarantine.
	*
	* @return the doctor name of this temp plant quarantine
	*/
	public java.lang.String getDoctorName() {
		return _tempPlantQuarantine.getDoctorName();
	}

	/**
	* Sets the doctor name of this temp plant quarantine.
	*
	* @param doctorName the doctor name of this temp plant quarantine
	*/
	public void setDoctorName(java.lang.String doctorName) {
		_tempPlantQuarantine.setDoctorName(doctorName);
	}

	/**
	* Returns the number of crew of this temp plant quarantine.
	*
	* @return the number of crew of this temp plant quarantine
	*/
	public int getNumberOfCrew() {
		return _tempPlantQuarantine.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp plant quarantine.
	*
	* @param numberOfCrew the number of crew of this temp plant quarantine
	*/
	public void setNumberOfCrew(int numberOfCrew) {
		_tempPlantQuarantine.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp plant quarantine.
	*
	* @return the number of passengers of this temp plant quarantine
	*/
	public int getNumberOfPassengers() {
		return _tempPlantQuarantine.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp plant quarantine.
	*
	* @param numberOfPassengers the number of passengers of this temp plant quarantine
	*/
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempPlantQuarantine.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the last port of call code of this temp plant quarantine.
	*
	* @return the last port of call code of this temp plant quarantine
	*/
	public java.lang.String getLastPortOfCallCode() {
		return _tempPlantQuarantine.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp plant quarantine.
	*
	* @param lastPortOfCallCode the last port of call code of this temp plant quarantine
	*/
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempPlantQuarantine.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the next port of call code of this temp plant quarantine.
	*
	* @return the next port of call code of this temp plant quarantine
	*/
	public java.lang.String getNextPortOfCallCode() {
		return _tempPlantQuarantine.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this temp plant quarantine.
	*
	* @param nextPortOfCallCode the next port of call code of this temp plant quarantine
	*/
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_tempPlantQuarantine.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the first port of loading code of this temp plant quarantine.
	*
	* @return the first port of loading code of this temp plant quarantine
	*/
	public java.lang.String getFirstPortOfLoadingCode() {
		return _tempPlantQuarantine.getFirstPortOfLoadingCode();
	}

	/**
	* Sets the first port of loading code of this temp plant quarantine.
	*
	* @param firstPortOfLoadingCode the first port of loading code of this temp plant quarantine
	*/
	public void setFirstPortOfLoadingCode(
		java.lang.String firstPortOfLoadingCode) {
		_tempPlantQuarantine.setFirstPortOfLoadingCode(firstPortOfLoadingCode);
	}

	/**
	* Returns the date ofdeparture of this temp plant quarantine.
	*
	* @return the date ofdeparture of this temp plant quarantine
	*/
	public java.util.Date getDateOfdeparture() {
		return _tempPlantQuarantine.getDateOfdeparture();
	}

	/**
	* Sets the date ofdeparture of this temp plant quarantine.
	*
	* @param dateOfdeparture the date ofdeparture of this temp plant quarantine
	*/
	public void setDateOfdeparture(java.util.Date dateOfdeparture) {
		_tempPlantQuarantine.setDateOfdeparture(dateOfdeparture);
	}

	/**
	* Returns the plant name first of this temp plant quarantine.
	*
	* @return the plant name first of this temp plant quarantine
	*/
	public java.lang.String getPlantNameFirst() {
		return _tempPlantQuarantine.getPlantNameFirst();
	}

	/**
	* Sets the plant name first of this temp plant quarantine.
	*
	* @param plantNameFirst the plant name first of this temp plant quarantine
	*/
	public void setPlantNameFirst(java.lang.String plantNameFirst) {
		_tempPlantQuarantine.setPlantNameFirst(plantNameFirst);
	}

	/**
	* Returns the plant name between of this temp plant quarantine.
	*
	* @return the plant name between of this temp plant quarantine
	*/
	public java.lang.String getPlantNameBetween() {
		return _tempPlantQuarantine.getPlantNameBetween();
	}

	/**
	* Sets the plant name between of this temp plant quarantine.
	*
	* @param plantNameBetween the plant name between of this temp plant quarantine
	*/
	public void setPlantNameBetween(java.lang.String plantNameBetween) {
		_tempPlantQuarantine.setPlantNameBetween(plantNameBetween);
	}

	/**
	* Returns the plant name this of this temp plant quarantine.
	*
	* @return the plant name this of this temp plant quarantine
	*/
	public java.lang.String getPlantNameThis() {
		return _tempPlantQuarantine.getPlantNameThis();
	}

	/**
	* Sets the plant name this of this temp plant quarantine.
	*
	* @param plantNameThis the plant name this of this temp plant quarantine
	*/
	public void setPlantNameThis(java.lang.String plantNameThis) {
		_tempPlantQuarantine.setPlantNameThis(plantNameThis);
	}

	/**
	* Returns the sign place of this temp plant quarantine.
	*
	* @return the sign place of this temp plant quarantine
	*/
	public java.lang.String getSignPlace() {
		return _tempPlantQuarantine.getSignPlace();
	}

	/**
	* Sets the sign place of this temp plant quarantine.
	*
	* @param signPlace the sign place of this temp plant quarantine
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_tempPlantQuarantine.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp plant quarantine.
	*
	* @return the sign date of this temp plant quarantine
	*/
	public java.util.Date getSignDate() {
		return _tempPlantQuarantine.getSignDate();
	}

	/**
	* Sets the sign date of this temp plant quarantine.
	*
	* @param signDate the sign date of this temp plant quarantine
	*/
	public void setSignDate(java.util.Date signDate) {
		_tempPlantQuarantine.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp plant quarantine.
	*
	* @return the master signed of this temp plant quarantine
	*/
	public int getMasterSigned() {
		return _tempPlantQuarantine.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp plant quarantine.
	*
	* @param masterSigned the master signed of this temp plant quarantine
	*/
	public void setMasterSigned(int masterSigned) {
		_tempPlantQuarantine.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp plant quarantine.
	*
	* @return the master signed image of this temp plant quarantine
	*/
	public int getMasterSignedImage() {
		return _tempPlantQuarantine.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp plant quarantine.
	*
	* @param masterSignedImage the master signed image of this temp plant quarantine
	*/
	public void setMasterSignedImage(int masterSignedImage) {
		_tempPlantQuarantine.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp plant quarantine.
	*
	* @return the attached file of this temp plant quarantine
	*/
	public long getAttachedFile() {
		return _tempPlantQuarantine.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp plant quarantine.
	*
	* @param attachedFile the attached file of this temp plant quarantine
	*/
	public void setAttachedFile(long attachedFile) {
		_tempPlantQuarantine.setAttachedFile(attachedFile);
	}

	public boolean isNew() {
		return _tempPlantQuarantine.isNew();
	}

	public void setNew(boolean n) {
		_tempPlantQuarantine.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempPlantQuarantine.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempPlantQuarantine.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempPlantQuarantine.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempPlantQuarantine.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempPlantQuarantine.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempPlantQuarantine.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempPlantQuarantine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempPlantQuarantineWrapper((TempPlantQuarantine)_tempPlantQuarantine.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempPlantQuarantine tempPlantQuarantine) {
		return _tempPlantQuarantine.compareTo(tempPlantQuarantine);
	}

	@Override
	public int hashCode() {
		return _tempPlantQuarantine.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempPlantQuarantine> toCacheModel() {
		return _tempPlantQuarantine.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempPlantQuarantine toEscapedModel() {
		return new TempPlantQuarantineWrapper(_tempPlantQuarantine.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempPlantQuarantine.toString();
	}

	public java.lang.String toXmlString() {
		return _tempPlantQuarantine.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempPlantQuarantine.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempPlantQuarantine getWrappedTempPlantQuarantine() {
		return _tempPlantQuarantine;
	}

	public TempPlantQuarantine getWrappedModel() {
		return _tempPlantQuarantine;
	}

	public void resetOriginalValues() {
		_tempPlantQuarantine.resetOriginalValues();
	}

	private TempPlantQuarantine _tempPlantQuarantine;
}