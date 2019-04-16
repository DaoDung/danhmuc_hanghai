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
 * This class is a wrapper for {@link TempCrewList}.
 * </p>
 *
 * @author    win_64
 * @see       TempCrewList
 * @generated
 */
public class TempCrewListWrapper implements TempCrewList,
	ModelWrapper<TempCrewList> {
	public TempCrewListWrapper(TempCrewList tempCrewList) {
		_tempCrewList = tempCrewList;
	}

	public Class<?> getModelClass() {
		return TempCrewList.class;
	}

	public String getModelClassName() {
		return TempCrewList.class.getName();
	}

	/**
	* Returns the primary key of this temp crew list.
	*
	* @return the primary key of this temp crew list
	*/
	public long getPrimaryKey() {
		return _tempCrewList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp crew list.
	*
	* @param primaryKey the primary key of this temp crew list
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempCrewList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp crew list.
	*
	* @return the ID of this temp crew list
	*/
	public long getId() {
		return _tempCrewList.getId();
	}

	/**
	* Sets the ID of this temp crew list.
	*
	* @param id the ID of this temp crew list
	*/
	public void setId(long id) {
		_tempCrewList.setId(id);
	}

	/**
	* Returns the request code of this temp crew list.
	*
	* @return the request code of this temp crew list
	*/
	public java.lang.String getRequestCode() {
		return _tempCrewList.getRequestCode();
	}

	/**
	* Sets the request code of this temp crew list.
	*
	* @param requestCode the request code of this temp crew list
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempCrewList.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp crew list.
	*
	* @return the request state of this temp crew list
	*/
	public int getRequestState() {
		return _tempCrewList.getRequestState();
	}

	/**
	* Sets the request state of this temp crew list.
	*
	* @param requestState the request state of this temp crew list
	*/
	public void setRequestState(int requestState) {
		_tempCrewList.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp crew list.
	*
	* @return the document name of this temp crew list
	*/
	public long getDocumentName() {
		return _tempCrewList.getDocumentName();
	}

	/**
	* Sets the document name of this temp crew list.
	*
	* @param documentName the document name of this temp crew list
	*/
	public void setDocumentName(long documentName) {
		_tempCrewList.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp crew list.
	*
	* @return the document year of this temp crew list
	*/
	public int getDocumentYear() {
		return _tempCrewList.getDocumentYear();
	}

	/**
	* Sets the document year of this temp crew list.
	*
	* @param documentYear the document year of this temp crew list
	*/
	public void setDocumentYear(int documentYear) {
		_tempCrewList.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp crew list.
	*
	* @return the user created of this temp crew list
	*/
	public java.lang.String getUserCreated() {
		return _tempCrewList.getUserCreated();
	}

	/**
	* Sets the user created of this temp crew list.
	*
	* @param userCreated the user created of this temp crew list
	*/
	public void setUserCreated(java.lang.String userCreated) {
		_tempCrewList.setUserCreated(userCreated);
	}

	/**
	* Returns the is arrival of this temp crew list.
	*
	* @return the is arrival of this temp crew list
	*/
	public int getIsArrival() {
		return _tempCrewList.getIsArrival();
	}

	/**
	* Sets the is arrival of this temp crew list.
	*
	* @param isArrival the is arrival of this temp crew list
	*/
	public void setIsArrival(int isArrival) {
		_tempCrewList.setIsArrival(isArrival);
	}

	/**
	* Returns the name of ship of this temp crew list.
	*
	* @return the name of ship of this temp crew list
	*/
	public java.lang.String getNameOfShip() {
		return _tempCrewList.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp crew list.
	*
	* @param nameOfShip the name of ship of this temp crew list
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempCrewList.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the imo number of this temp crew list.
	*
	* @return the imo number of this temp crew list
	*/
	public java.lang.String getImoNumber() {
		return _tempCrewList.getImoNumber();
	}

	/**
	* Sets the imo number of this temp crew list.
	*
	* @param imoNumber the imo number of this temp crew list
	*/
	public void setImoNumber(java.lang.String imoNumber) {
		_tempCrewList.setImoNumber(imoNumber);
	}

	/**
	* Returns the call sign of this temp crew list.
	*
	* @return the call sign of this temp crew list
	*/
	public java.lang.String getCallSign() {
		return _tempCrewList.getCallSign();
	}

	/**
	* Sets the call sign of this temp crew list.
	*
	* @param callSign the call sign of this temp crew list
	*/
	public void setCallSign(java.lang.String callSign) {
		_tempCrewList.setCallSign(callSign);
	}

	/**
	* Returns the voyage number of this temp crew list.
	*
	* @return the voyage number of this temp crew list
	*/
	public java.lang.String getVoyageNumber() {
		return _tempCrewList.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp crew list.
	*
	* @param voyageNumber the voyage number of this temp crew list
	*/
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempCrewList.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the port of arrival code of this temp crew list.
	*
	* @return the port of arrival code of this temp crew list
	*/
	public java.lang.String getPortOfArrivalCode() {
		return _tempCrewList.getPortOfArrivalCode();
	}

	/**
	* Sets the port of arrival code of this temp crew list.
	*
	* @param portOfArrivalCode the port of arrival code of this temp crew list
	*/
	public void setPortOfArrivalCode(java.lang.String portOfArrivalCode) {
		_tempCrewList.setPortOfArrivalCode(portOfArrivalCode);
	}

	/**
	* Returns the date of arrival of this temp crew list.
	*
	* @return the date of arrival of this temp crew list
	*/
	public java.util.Date getDateOfArrival() {
		return _tempCrewList.getDateOfArrival();
	}

	/**
	* Sets the date of arrival of this temp crew list.
	*
	* @param dateOfArrival the date of arrival of this temp crew list
	*/
	public void setDateOfArrival(java.util.Date dateOfArrival) {
		_tempCrewList.setDateOfArrival(dateOfArrival);
	}

	/**
	* Returns the flag state of ship of this temp crew list.
	*
	* @return the flag state of ship of this temp crew list
	*/
	public java.lang.String getFlagStateOfShip() {
		return _tempCrewList.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp crew list.
	*
	* @param flagStateOfShip the flag state of ship of this temp crew list
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempCrewList.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the last port of call code of this temp crew list.
	*
	* @return the last port of call code of this temp crew list
	*/
	public java.lang.String getLastPortOfCallCode() {
		return _tempCrewList.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp crew list.
	*
	* @param lastPortOfCallCode the last port of call code of this temp crew list
	*/
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempCrewList.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the crew list of this temp crew list.
	*
	* @return the crew list of this temp crew list
	*/
	public int getCrewList() {
		return _tempCrewList.getCrewList();
	}

	/**
	* Sets the crew list of this temp crew list.
	*
	* @param crewList the crew list of this temp crew list
	*/
	public void setCrewList(int crewList) {
		_tempCrewList.setCrewList(crewList);
	}

	/**
	* Returns the sign place of this temp crew list.
	*
	* @return the sign place of this temp crew list
	*/
	public java.lang.String getSignPlace() {
		return _tempCrewList.getSignPlace();
	}

	/**
	* Sets the sign place of this temp crew list.
	*
	* @param signPlace the sign place of this temp crew list
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_tempCrewList.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp crew list.
	*
	* @return the sign date of this temp crew list
	*/
	public java.util.Date getSignDate() {
		return _tempCrewList.getSignDate();
	}

	/**
	* Sets the sign date of this temp crew list.
	*
	* @param signDate the sign date of this temp crew list
	*/
	public void setSignDate(java.util.Date signDate) {
		_tempCrewList.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp crew list.
	*
	* @return the master signed of this temp crew list
	*/
	public int getMasterSigned() {
		return _tempCrewList.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp crew list.
	*
	* @param masterSigned the master signed of this temp crew list
	*/
	public void setMasterSigned(int masterSigned) {
		_tempCrewList.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp crew list.
	*
	* @return the master signed image of this temp crew list
	*/
	public int getMasterSignedImage() {
		return _tempCrewList.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp crew list.
	*
	* @param masterSignedImage the master signed image of this temp crew list
	*/
	public void setMasterSignedImage(int masterSignedImage) {
		_tempCrewList.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp crew list.
	*
	* @return the attached file of this temp crew list
	*/
	public long getAttachedFile() {
		return _tempCrewList.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp crew list.
	*
	* @param attachedFile the attached file of this temp crew list
	*/
	public void setAttachedFile(long attachedFile) {
		_tempCrewList.setAttachedFile(attachedFile);
	}

	public boolean isNew() {
		return _tempCrewList.isNew();
	}

	public void setNew(boolean n) {
		_tempCrewList.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempCrewList.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempCrewList.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempCrewList.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCrewList.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCrewList.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCrewList.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCrewList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCrewListWrapper((TempCrewList)_tempCrewList.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempCrewList tempCrewList) {
		return _tempCrewList.compareTo(tempCrewList);
	}

	@Override
	public int hashCode() {
		return _tempCrewList.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempCrewList> toCacheModel() {
		return _tempCrewList.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempCrewList toEscapedModel() {
		return new TempCrewListWrapper(_tempCrewList.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCrewList.toString();
	}

	public java.lang.String toXmlString() {
		return _tempCrewList.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCrewList.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempCrewList getWrappedTempCrewList() {
		return _tempCrewList;
	}

	public TempCrewList getWrappedModel() {
		return _tempCrewList;
	}

	public void resetOriginalValues() {
		_tempCrewList.resetOriginalValues();
	}

	private TempCrewList _tempCrewList;
}