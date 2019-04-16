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
 * This class is a wrapper for {@link TempCrewEffectsDeclaration}.
 * </p>
 *
 * @author    win_64
 * @see       TempCrewEffectsDeclaration
 * @generated
 */
public class TempCrewEffectsDeclarationWrapper
	implements TempCrewEffectsDeclaration,
		ModelWrapper<TempCrewEffectsDeclaration> {
	public TempCrewEffectsDeclarationWrapper(
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration) {
		_tempCrewEffectsDeclaration = tempCrewEffectsDeclaration;
	}

	public Class<?> getModelClass() {
		return TempCrewEffectsDeclaration.class;
	}

	public String getModelClassName() {
		return TempCrewEffectsDeclaration.class.getName();
	}

	/**
	* Returns the primary key of this temp crew effects declaration.
	*
	* @return the primary key of this temp crew effects declaration
	*/
	public long getPrimaryKey() {
		return _tempCrewEffectsDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp crew effects declaration.
	*
	* @param primaryKey the primary key of this temp crew effects declaration
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempCrewEffectsDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp crew effects declaration.
	*
	* @return the ID of this temp crew effects declaration
	*/
	public long getId() {
		return _tempCrewEffectsDeclaration.getId();
	}

	/**
	* Sets the ID of this temp crew effects declaration.
	*
	* @param id the ID of this temp crew effects declaration
	*/
	public void setId(long id) {
		_tempCrewEffectsDeclaration.setId(id);
	}

	/**
	* Returns the request code of this temp crew effects declaration.
	*
	* @return the request code of this temp crew effects declaration
	*/
	public java.lang.String getRequestCode() {
		return _tempCrewEffectsDeclaration.getRequestCode();
	}

	/**
	* Sets the request code of this temp crew effects declaration.
	*
	* @param requestCode the request code of this temp crew effects declaration
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempCrewEffectsDeclaration.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp crew effects declaration.
	*
	* @return the request state of this temp crew effects declaration
	*/
	public int getRequestState() {
		return _tempCrewEffectsDeclaration.getRequestState();
	}

	/**
	* Sets the request state of this temp crew effects declaration.
	*
	* @param requestState the request state of this temp crew effects declaration
	*/
	public void setRequestState(int requestState) {
		_tempCrewEffectsDeclaration.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp crew effects declaration.
	*
	* @return the document name of this temp crew effects declaration
	*/
	public long getDocumentName() {
		return _tempCrewEffectsDeclaration.getDocumentName();
	}

	/**
	* Sets the document name of this temp crew effects declaration.
	*
	* @param documentName the document name of this temp crew effects declaration
	*/
	public void setDocumentName(long documentName) {
		_tempCrewEffectsDeclaration.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp crew effects declaration.
	*
	* @return the user created of this temp crew effects declaration
	*/
	public java.lang.String getUserCreated() {
		return _tempCrewEffectsDeclaration.getUserCreated();
	}

	/**
	* Sets the user created of this temp crew effects declaration.
	*
	* @param userCreated the user created of this temp crew effects declaration
	*/
	public void setUserCreated(java.lang.String userCreated) {
		_tempCrewEffectsDeclaration.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp crew effects declaration.
	*
	* @return the name of ship of this temp crew effects declaration
	*/
	public java.lang.String getNameOfShip() {
		return _tempCrewEffectsDeclaration.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp crew effects declaration.
	*
	* @param nameOfShip the name of ship of this temp crew effects declaration
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempCrewEffectsDeclaration.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the imo number of this temp crew effects declaration.
	*
	* @return the imo number of this temp crew effects declaration
	*/
	public java.lang.String getImoNumber() {
		return _tempCrewEffectsDeclaration.getImoNumber();
	}

	/**
	* Sets the imo number of this temp crew effects declaration.
	*
	* @param imoNumber the imo number of this temp crew effects declaration
	*/
	public void setImoNumber(java.lang.String imoNumber) {
		_tempCrewEffectsDeclaration.setImoNumber(imoNumber);
	}

	/**
	* Returns the callsign of this temp crew effects declaration.
	*
	* @return the callsign of this temp crew effects declaration
	*/
	public java.lang.String getCallsign() {
		return _tempCrewEffectsDeclaration.getCallsign();
	}

	/**
	* Sets the callsign of this temp crew effects declaration.
	*
	* @param callsign the callsign of this temp crew effects declaration
	*/
	public void setCallsign(java.lang.String callsign) {
		_tempCrewEffectsDeclaration.setCallsign(callsign);
	}

	/**
	* Returns the voyage number of this temp crew effects declaration.
	*
	* @return the voyage number of this temp crew effects declaration
	*/
	public java.lang.String getVoyageNumber() {
		return _tempCrewEffectsDeclaration.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp crew effects declaration.
	*
	* @param voyageNumber the voyage number of this temp crew effects declaration
	*/
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempCrewEffectsDeclaration.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the flag state of ship of this temp crew effects declaration.
	*
	* @return the flag state of ship of this temp crew effects declaration
	*/
	public java.lang.String getFlagStateOfShip() {
		return _tempCrewEffectsDeclaration.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp crew effects declaration.
	*
	* @param flagStateOfShip the flag state of ship of this temp crew effects declaration
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempCrewEffectsDeclaration.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp crew effects declaration.
	*
	* @return the name of master of this temp crew effects declaration
	*/
	public java.lang.String getNameOfMaster() {
		return _tempCrewEffectsDeclaration.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp crew effects declaration.
	*
	* @param nameOfMaster the name of master of this temp crew effects declaration
	*/
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempCrewEffectsDeclaration.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the list crew effects of this temp crew effects declaration.
	*
	* @return the list crew effects of this temp crew effects declaration
	*/
	public int getListCrewEffects() {
		return _tempCrewEffectsDeclaration.getListCrewEffects();
	}

	/**
	* Sets the list crew effects of this temp crew effects declaration.
	*
	* @param listCrewEffects the list crew effects of this temp crew effects declaration
	*/
	public void setListCrewEffects(int listCrewEffects) {
		_tempCrewEffectsDeclaration.setListCrewEffects(listCrewEffects);
	}

	/**
	* Returns the sign place of this temp crew effects declaration.
	*
	* @return the sign place of this temp crew effects declaration
	*/
	public java.lang.String getSignPlace() {
		return _tempCrewEffectsDeclaration.getSignPlace();
	}

	/**
	* Sets the sign place of this temp crew effects declaration.
	*
	* @param signPlace the sign place of this temp crew effects declaration
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_tempCrewEffectsDeclaration.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp crew effects declaration.
	*
	* @return the sign date of this temp crew effects declaration
	*/
	public java.util.Date getSignDate() {
		return _tempCrewEffectsDeclaration.getSignDate();
	}

	/**
	* Sets the sign date of this temp crew effects declaration.
	*
	* @param signDate the sign date of this temp crew effects declaration
	*/
	public void setSignDate(java.util.Date signDate) {
		_tempCrewEffectsDeclaration.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp crew effects declaration.
	*
	* @return the master signed of this temp crew effects declaration
	*/
	public int getMasterSigned() {
		return _tempCrewEffectsDeclaration.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp crew effects declaration.
	*
	* @param masterSigned the master signed of this temp crew effects declaration
	*/
	public void setMasterSigned(int masterSigned) {
		_tempCrewEffectsDeclaration.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp crew effects declaration.
	*
	* @return the master signed image of this temp crew effects declaration
	*/
	public int getMasterSignedImage() {
		return _tempCrewEffectsDeclaration.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp crew effects declaration.
	*
	* @param masterSignedImage the master signed image of this temp crew effects declaration
	*/
	public void setMasterSignedImage(int masterSignedImage) {
		_tempCrewEffectsDeclaration.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp crew effects declaration.
	*
	* @return the attached file of this temp crew effects declaration
	*/
	public long getAttachedFile() {
		return _tempCrewEffectsDeclaration.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp crew effects declaration.
	*
	* @param attachedFile the attached file of this temp crew effects declaration
	*/
	public void setAttachedFile(long attachedFile) {
		_tempCrewEffectsDeclaration.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp crew effects declaration.
	*
	* @return the document year of this temp crew effects declaration
	*/
	public int getDocumentYear() {
		return _tempCrewEffectsDeclaration.getDocumentYear();
	}

	/**
	* Sets the document year of this temp crew effects declaration.
	*
	* @param documentYear the document year of this temp crew effects declaration
	*/
	public void setDocumentYear(int documentYear) {
		_tempCrewEffectsDeclaration.setDocumentYear(documentYear);
	}

	public boolean isNew() {
		return _tempCrewEffectsDeclaration.isNew();
	}

	public void setNew(boolean n) {
		_tempCrewEffectsDeclaration.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempCrewEffectsDeclaration.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempCrewEffectsDeclaration.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempCrewEffectsDeclaration.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCrewEffectsDeclaration.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCrewEffectsDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCrewEffectsDeclaration.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCrewEffectsDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCrewEffectsDeclarationWrapper((TempCrewEffectsDeclaration)_tempCrewEffectsDeclaration.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration tempCrewEffectsDeclaration) {
		return _tempCrewEffectsDeclaration.compareTo(tempCrewEffectsDeclaration);
	}

	@Override
	public int hashCode() {
		return _tempCrewEffectsDeclaration.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration> toCacheModel() {
		return _tempCrewEffectsDeclaration.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration toEscapedModel() {
		return new TempCrewEffectsDeclarationWrapper(_tempCrewEffectsDeclaration.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCrewEffectsDeclaration.toString();
	}

	public java.lang.String toXmlString() {
		return _tempCrewEffectsDeclaration.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCrewEffectsDeclaration.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempCrewEffectsDeclaration getWrappedTempCrewEffectsDeclaration() {
		return _tempCrewEffectsDeclaration;
	}

	public TempCrewEffectsDeclaration getWrappedModel() {
		return _tempCrewEffectsDeclaration;
	}

	public void resetOriginalValues() {
		_tempCrewEffectsDeclaration.resetOriginalValues();
	}

	private TempCrewEffectsDeclaration _tempCrewEffectsDeclaration;
}