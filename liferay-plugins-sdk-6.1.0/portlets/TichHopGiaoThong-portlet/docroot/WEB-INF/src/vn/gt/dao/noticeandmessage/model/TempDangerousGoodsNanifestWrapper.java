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
 * This class is a wrapper for {@link TempDangerousGoodsNanifest}.
 * </p>
 *
 * @author    win_64
 * @see       TempDangerousGoodsNanifest
 * @generated
 */
public class TempDangerousGoodsNanifestWrapper
	implements TempDangerousGoodsNanifest,
		ModelWrapper<TempDangerousGoodsNanifest> {
	public TempDangerousGoodsNanifestWrapper(
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		_tempDangerousGoodsNanifest = tempDangerousGoodsNanifest;
	}

	public Class<?> getModelClass() {
		return TempDangerousGoodsNanifest.class;
	}

	public String getModelClassName() {
		return TempDangerousGoodsNanifest.class.getName();
	}

	/**
	* Returns the primary key of this temp dangerous goods nanifest.
	*
	* @return the primary key of this temp dangerous goods nanifest
	*/
	public long getPrimaryKey() {
		return _tempDangerousGoodsNanifest.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp dangerous goods nanifest.
	*
	* @param primaryKey the primary key of this temp dangerous goods nanifest
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempDangerousGoodsNanifest.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp dangerous goods nanifest.
	*
	* @return the ID of this temp dangerous goods nanifest
	*/
	public long getId() {
		return _tempDangerousGoodsNanifest.getId();
	}

	/**
	* Sets the ID of this temp dangerous goods nanifest.
	*
	* @param id the ID of this temp dangerous goods nanifest
	*/
	public void setId(long id) {
		_tempDangerousGoodsNanifest.setId(id);
	}

	/**
	* Returns the request code of this temp dangerous goods nanifest.
	*
	* @return the request code of this temp dangerous goods nanifest
	*/
	public java.lang.String getRequestCode() {
		return _tempDangerousGoodsNanifest.getRequestCode();
	}

	/**
	* Sets the request code of this temp dangerous goods nanifest.
	*
	* @param requestCode the request code of this temp dangerous goods nanifest
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempDangerousGoodsNanifest.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp dangerous goods nanifest.
	*
	* @return the request state of this temp dangerous goods nanifest
	*/
	public int getRequestState() {
		return _tempDangerousGoodsNanifest.getRequestState();
	}

	/**
	* Sets the request state of this temp dangerous goods nanifest.
	*
	* @param requestState the request state of this temp dangerous goods nanifest
	*/
	public void setRequestState(int requestState) {
		_tempDangerousGoodsNanifest.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp dangerous goods nanifest.
	*
	* @return the document name of this temp dangerous goods nanifest
	*/
	public long getDocumentName() {
		return _tempDangerousGoodsNanifest.getDocumentName();
	}

	/**
	* Sets the document name of this temp dangerous goods nanifest.
	*
	* @param documentName the document name of this temp dangerous goods nanifest
	*/
	public void setDocumentName(long documentName) {
		_tempDangerousGoodsNanifest.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp dangerous goods nanifest.
	*
	* @return the user created of this temp dangerous goods nanifest
	*/
	public java.lang.String getUserCreated() {
		return _tempDangerousGoodsNanifest.getUserCreated();
	}

	/**
	* Sets the user created of this temp dangerous goods nanifest.
	*
	* @param userCreated the user created of this temp dangerous goods nanifest
	*/
	public void setUserCreated(java.lang.String userCreated) {
		_tempDangerousGoodsNanifest.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp dangerous goods nanifest.
	*
	* @return the name of ship of this temp dangerous goods nanifest
	*/
	public java.lang.String getNameOfShip() {
		return _tempDangerousGoodsNanifest.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp dangerous goods nanifest.
	*
	* @param nameOfShip the name of ship of this temp dangerous goods nanifest
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempDangerousGoodsNanifest.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp dangerous goods nanifest.
	*
	* @return the flag state of ship of this temp dangerous goods nanifest
	*/
	public java.lang.String getFlagStateOfShip() {
		return _tempDangerousGoodsNanifest.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp dangerous goods nanifest.
	*
	* @param flagStateOfShip the flag state of ship of this temp dangerous goods nanifest
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempDangerousGoodsNanifest.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the master name of this temp dangerous goods nanifest.
	*
	* @return the master name of this temp dangerous goods nanifest
	*/
	public java.lang.String getMasterName() {
		return _tempDangerousGoodsNanifest.getMasterName();
	}

	/**
	* Sets the master name of this temp dangerous goods nanifest.
	*
	* @param masterName the master name of this temp dangerous goods nanifest
	*/
	public void setMasterName(java.lang.String masterName) {
		_tempDangerousGoodsNanifest.setMasterName(masterName);
	}

	/**
	* Returns the imo number of this temp dangerous goods nanifest.
	*
	* @return the imo number of this temp dangerous goods nanifest
	*/
	public java.lang.String getImoNumber() {
		return _tempDangerousGoodsNanifest.getImoNumber();
	}

	/**
	* Sets the imo number of this temp dangerous goods nanifest.
	*
	* @param imoNumber the imo number of this temp dangerous goods nanifest
	*/
	public void setImoNumber(java.lang.String imoNumber) {
		_tempDangerousGoodsNanifest.setImoNumber(imoNumber);
	}

	/**
	* Returns the callsign of this temp dangerous goods nanifest.
	*
	* @return the callsign of this temp dangerous goods nanifest
	*/
	public java.lang.String getCallsign() {
		return _tempDangerousGoodsNanifest.getCallsign();
	}

	/**
	* Sets the callsign of this temp dangerous goods nanifest.
	*
	* @param callsign the callsign of this temp dangerous goods nanifest
	*/
	public void setCallsign(java.lang.String callsign) {
		_tempDangerousGoodsNanifest.setCallsign(callsign);
	}

	/**
	* Returns the voyage number of this temp dangerous goods nanifest.
	*
	* @return the voyage number of this temp dangerous goods nanifest
	*/
	public java.lang.String getVoyageNumber() {
		return _tempDangerousGoodsNanifest.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp dangerous goods nanifest.
	*
	* @param voyageNumber the voyage number of this temp dangerous goods nanifest
	*/
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempDangerousGoodsNanifest.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the port of loading code of this temp dangerous goods nanifest.
	*
	* @return the port of loading code of this temp dangerous goods nanifest
	*/
	public java.lang.String getPortOfLoadingCode() {
		return _tempDangerousGoodsNanifest.getPortOfLoadingCode();
	}

	/**
	* Sets the port of loading code of this temp dangerous goods nanifest.
	*
	* @param portOfLoadingCode the port of loading code of this temp dangerous goods nanifest
	*/
	public void setPortOfLoadingCode(java.lang.String portOfLoadingCode) {
		_tempDangerousGoodsNanifest.setPortOfLoadingCode(portOfLoadingCode);
	}

	/**
	* Returns the port of discharge code of this temp dangerous goods nanifest.
	*
	* @return the port of discharge code of this temp dangerous goods nanifest
	*/
	public java.lang.String getPortOfDischargeCode() {
		return _tempDangerousGoodsNanifest.getPortOfDischargeCode();
	}

	/**
	* Sets the port of discharge code of this temp dangerous goods nanifest.
	*
	* @param portOfDischargeCode the port of discharge code of this temp dangerous goods nanifest
	*/
	public void setPortOfDischargeCode(java.lang.String portOfDischargeCode) {
		_tempDangerousGoodsNanifest.setPortOfDischargeCode(portOfDischargeCode);
	}

	/**
	* Returns the shipping agent of this temp dangerous goods nanifest.
	*
	* @return the shipping agent of this temp dangerous goods nanifest
	*/
	public java.lang.String getShippingAgent() {
		return _tempDangerousGoodsNanifest.getShippingAgent();
	}

	/**
	* Sets the shipping agent of this temp dangerous goods nanifest.
	*
	* @param shippingAgent the shipping agent of this temp dangerous goods nanifest
	*/
	public void setShippingAgent(java.lang.String shippingAgent) {
		_tempDangerousGoodsNanifest.setShippingAgent(shippingAgent);
	}

	/**
	* Returns the additional remark of this temp dangerous goods nanifest.
	*
	* @return the additional remark of this temp dangerous goods nanifest
	*/
	public java.lang.String getAdditionalRemark() {
		return _tempDangerousGoodsNanifest.getAdditionalRemark();
	}

	/**
	* Sets the additional remark of this temp dangerous goods nanifest.
	*
	* @param additionalRemark the additional remark of this temp dangerous goods nanifest
	*/
	public void setAdditionalRemark(java.lang.String additionalRemark) {
		_tempDangerousGoodsNanifest.setAdditionalRemark(additionalRemark);
	}

	/**
	* Returns the list dangerous goods of this temp dangerous goods nanifest.
	*
	* @return the list dangerous goods of this temp dangerous goods nanifest
	*/
	public int getListDangerousGoods() {
		return _tempDangerousGoodsNanifest.getListDangerousGoods();
	}

	/**
	* Sets the list dangerous goods of this temp dangerous goods nanifest.
	*
	* @param listDangerousGoods the list dangerous goods of this temp dangerous goods nanifest
	*/
	public void setListDangerousGoods(int listDangerousGoods) {
		_tempDangerousGoodsNanifest.setListDangerousGoods(listDangerousGoods);
	}

	/**
	* Returns the sign place of this temp dangerous goods nanifest.
	*
	* @return the sign place of this temp dangerous goods nanifest
	*/
	public java.lang.String getSignPlace() {
		return _tempDangerousGoodsNanifest.getSignPlace();
	}

	/**
	* Sets the sign place of this temp dangerous goods nanifest.
	*
	* @param signPlace the sign place of this temp dangerous goods nanifest
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_tempDangerousGoodsNanifest.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp dangerous goods nanifest.
	*
	* @return the sign date of this temp dangerous goods nanifest
	*/
	public java.util.Date getSignDate() {
		return _tempDangerousGoodsNanifest.getSignDate();
	}

	/**
	* Sets the sign date of this temp dangerous goods nanifest.
	*
	* @param signDate the sign date of this temp dangerous goods nanifest
	*/
	public void setSignDate(java.util.Date signDate) {
		_tempDangerousGoodsNanifest.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp dangerous goods nanifest.
	*
	* @return the master signed of this temp dangerous goods nanifest
	*/
	public int getMasterSigned() {
		return _tempDangerousGoodsNanifest.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp dangerous goods nanifest.
	*
	* @param masterSigned the master signed of this temp dangerous goods nanifest
	*/
	public void setMasterSigned(int masterSigned) {
		_tempDangerousGoodsNanifest.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp dangerous goods nanifest.
	*
	* @return the master signed image of this temp dangerous goods nanifest
	*/
	public int getMasterSignedImage() {
		return _tempDangerousGoodsNanifest.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp dangerous goods nanifest.
	*
	* @param masterSignedImage the master signed image of this temp dangerous goods nanifest
	*/
	public void setMasterSignedImage(int masterSignedImage) {
		_tempDangerousGoodsNanifest.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp dangerous goods nanifest.
	*
	* @return the attached file of this temp dangerous goods nanifest
	*/
	public long getAttachedFile() {
		return _tempDangerousGoodsNanifest.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp dangerous goods nanifest.
	*
	* @param attachedFile the attached file of this temp dangerous goods nanifest
	*/
	public void setAttachedFile(long attachedFile) {
		_tempDangerousGoodsNanifest.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp dangerous goods nanifest.
	*
	* @return the document year of this temp dangerous goods nanifest
	*/
	public int getDocumentYear() {
		return _tempDangerousGoodsNanifest.getDocumentYear();
	}

	/**
	* Sets the document year of this temp dangerous goods nanifest.
	*
	* @param documentYear the document year of this temp dangerous goods nanifest
	*/
	public void setDocumentYear(int documentYear) {
		_tempDangerousGoodsNanifest.setDocumentYear(documentYear);
	}

	public boolean isNew() {
		return _tempDangerousGoodsNanifest.isNew();
	}

	public void setNew(boolean n) {
		_tempDangerousGoodsNanifest.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempDangerousGoodsNanifest.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempDangerousGoodsNanifest.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempDangerousGoodsNanifest.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDangerousGoodsNanifest.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDangerousGoodsNanifest.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDangerousGoodsNanifest.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDangerousGoodsNanifest.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDangerousGoodsNanifestWrapper((TempDangerousGoodsNanifest)_tempDangerousGoodsNanifest.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		return _tempDangerousGoodsNanifest.compareTo(tempDangerousGoodsNanifest);
	}

	@Override
	public int hashCode() {
		return _tempDangerousGoodsNanifest.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest> toCacheModel() {
		return _tempDangerousGoodsNanifest.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest toEscapedModel() {
		return new TempDangerousGoodsNanifestWrapper(_tempDangerousGoodsNanifest.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDangerousGoodsNanifest.toString();
	}

	public java.lang.String toXmlString() {
		return _tempDangerousGoodsNanifest.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDangerousGoodsNanifest.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempDangerousGoodsNanifest getWrappedTempDangerousGoodsNanifest() {
		return _tempDangerousGoodsNanifest;
	}

	public TempDangerousGoodsNanifest getWrappedModel() {
		return _tempDangerousGoodsNanifest;
	}

	public void resetOriginalValues() {
		_tempDangerousGoodsNanifest.resetOriginalValues();
	}

	private TempDangerousGoodsNanifest _tempDangerousGoodsNanifest;
}