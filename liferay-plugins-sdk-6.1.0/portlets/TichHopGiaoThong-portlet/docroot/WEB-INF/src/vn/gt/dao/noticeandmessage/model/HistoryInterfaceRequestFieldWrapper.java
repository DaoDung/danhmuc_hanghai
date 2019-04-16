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
 * This class is a wrapper for {@link HistoryInterfaceRequestField}.
 * </p>
 *
 * @author    win_64
 * @see       HistoryInterfaceRequestField
 * @generated
 */
public class HistoryInterfaceRequestFieldWrapper
	implements HistoryInterfaceRequestField,
		ModelWrapper<HistoryInterfaceRequestField> {
	public HistoryInterfaceRequestFieldWrapper(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		_historyInterfaceRequestField = historyInterfaceRequestField;
	}

	public Class<?> getModelClass() {
		return HistoryInterfaceRequestField.class;
	}

	public String getModelClassName() {
		return HistoryInterfaceRequestField.class.getName();
	}

	/**
	* Returns the primary key of this history interface request field.
	*
	* @return the primary key of this history interface request field
	*/
	public long getPrimaryKey() {
		return _historyInterfaceRequestField.getPrimaryKey();
	}

	/**
	* Sets the primary key of this history interface request field.
	*
	* @param primaryKey the primary key of this history interface request field
	*/
	public void setPrimaryKey(long primaryKey) {
		_historyInterfaceRequestField.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this history interface request field.
	*
	* @return the ID of this history interface request field
	*/
	public long getId() {
		return _historyInterfaceRequestField.getId();
	}

	/**
	* Sets the ID of this history interface request field.
	*
	* @param id the ID of this history interface request field
	*/
	public void setId(long id) {
		_historyInterfaceRequestField.setId(id);
	}

	/**
	* Returns the request code of this history interface request field.
	*
	* @return the request code of this history interface request field
	*/
	public java.lang.String getRequestCode() {
		return _historyInterfaceRequestField.getRequestCode();
	}

	/**
	* Sets the request code of this history interface request field.
	*
	* @param requestCode the request code of this history interface request field
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_historyInterfaceRequestField.setRequestCode(requestCode);
	}

	/**
	* Returns the organization code of this history interface request field.
	*
	* @return the organization code of this history interface request field
	*/
	public java.lang.String getOrganizationCode() {
		return _historyInterfaceRequestField.getOrganizationCode();
	}

	/**
	* Sets the organization code of this history interface request field.
	*
	* @param organizationCode the organization code of this history interface request field
	*/
	public void setOrganizationCode(java.lang.String organizationCode) {
		_historyInterfaceRequestField.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the loc code of this history interface request field.
	*
	* @return the loc code of this history interface request field
	*/
	public java.lang.String getLocCode() {
		return _historyInterfaceRequestField.getLocCode();
	}

	/**
	* Sets the loc code of this history interface request field.
	*
	* @param locCode the loc code of this history interface request field
	*/
	public void setLocCode(java.lang.String locCode) {
		_historyInterfaceRequestField.setLocCode(locCode);
	}

	/**
	* Returns the request date of this history interface request field.
	*
	* @return the request date of this history interface request field
	*/
	public java.util.Date getRequestDate() {
		return _historyInterfaceRequestField.getRequestDate();
	}

	/**
	* Sets the request date of this history interface request field.
	*
	* @param requestDate the request date of this history interface request field
	*/
	public void setRequestDate(java.util.Date requestDate) {
		_historyInterfaceRequestField.setRequestDate(requestDate);
	}

	/**
	* Returns the requested date of this history interface request field.
	*
	* @return the requested date of this history interface request field
	*/
	public java.util.Date getRequestedDate() {
		return _historyInterfaceRequestField.getRequestedDate();
	}

	/**
	* Sets the requested date of this history interface request field.
	*
	* @param requestedDate the requested date of this history interface request field
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_historyInterfaceRequestField.setRequestedDate(requestedDate);
	}

	/**
	* Returns the request direction of this history interface request field.
	*
	* @return the request direction of this history interface request field
	*/
	public java.lang.String getRequestDirection() {
		return _historyInterfaceRequestField.getRequestDirection();
	}

	/**
	* Sets the request direction of this history interface request field.
	*
	* @param requestDirection the request direction of this history interface request field
	*/
	public void setRequestDirection(java.lang.String requestDirection) {
		_historyInterfaceRequestField.setRequestDirection(requestDirection);
	}

	/**
	* Returns the request state of this history interface request field.
	*
	* @return the request state of this history interface request field
	*/
	public int getRequestState() {
		return _historyInterfaceRequestField.getRequestState();
	}

	/**
	* Sets the request state of this history interface request field.
	*
	* @param requestState the request state of this history interface request field
	*/
	public void setRequestState(int requestState) {
		_historyInterfaceRequestField.setRequestState(requestState);
	}

	/**
	* Returns the request response time of this history interface request field.
	*
	* @return the request response time of this history interface request field
	*/
	public java.util.Date getRequestResponseTime() {
		return _historyInterfaceRequestField.getRequestResponseTime();
	}

	/**
	* Sets the request response time of this history interface request field.
	*
	* @param requestResponseTime the request response time of this history interface request field
	*/
	public void setRequestResponseTime(java.util.Date requestResponseTime) {
		_historyInterfaceRequestField.setRequestResponseTime(requestResponseTime);
	}

	/**
	* Returns the document type of this history interface request field.
	*
	* @return the document type of this history interface request field
	*/
	public java.lang.String getDocumentType() {
		return _historyInterfaceRequestField.getDocumentType();
	}

	/**
	* Sets the document type of this history interface request field.
	*
	* @param documentType the document type of this history interface request field
	*/
	public void setDocumentType(java.lang.String documentType) {
		_historyInterfaceRequestField.setDocumentType(documentType);
	}

	/**
	* Returns the business type of this history interface request field.
	*
	* @return the business type of this history interface request field
	*/
	public java.lang.String getBusinessType() {
		return _historyInterfaceRequestField.getBusinessType();
	}

	/**
	* Sets the business type of this history interface request field.
	*
	* @param businessType the business type of this history interface request field
	*/
	public void setBusinessType(java.lang.String businessType) {
		_historyInterfaceRequestField.setBusinessType(businessType);
	}

	/**
	* Returns the function type of this history interface request field.
	*
	* @return the function type of this history interface request field
	*/
	public java.lang.String getFunctionType() {
		return _historyInterfaceRequestField.getFunctionType();
	}

	/**
	* Sets the function type of this history interface request field.
	*
	* @param functionType the function type of this history interface request field
	*/
	public void setFunctionType(java.lang.String functionType) {
		_historyInterfaceRequestField.setFunctionType(functionType);
	}

	/**
	* Returns the sender name of this history interface request field.
	*
	* @return the sender name of this history interface request field
	*/
	public java.lang.String getSenderName() {
		return _historyInterfaceRequestField.getSenderName();
	}

	/**
	* Sets the sender name of this history interface request field.
	*
	* @param senderName the sender name of this history interface request field
	*/
	public void setSenderName(java.lang.String senderName) {
		_historyInterfaceRequestField.setSenderName(senderName);
	}

	/**
	* Returns the request version of this history interface request field.
	*
	* @return the request version of this history interface request field
	*/
	public java.lang.String getRequestVersion() {
		return _historyInterfaceRequestField.getRequestVersion();
	}

	/**
	* Sets the request version of this history interface request field.
	*
	* @param requestVersion the request version of this history interface request field
	*/
	public void setRequestVersion(java.lang.String requestVersion) {
		_historyInterfaceRequestField.setRequestVersion(requestVersion);
	}

	/**
	* Returns the sender identify of this history interface request field.
	*
	* @return the sender identify of this history interface request field
	*/
	public java.lang.String getSenderIdentify() {
		return _historyInterfaceRequestField.getSenderIdentify();
	}

	/**
	* Sets the sender identify of this history interface request field.
	*
	* @param senderIdentify the sender identify of this history interface request field
	*/
	public void setSenderIdentify(java.lang.String senderIdentify) {
		_historyInterfaceRequestField.setSenderIdentify(senderIdentify);
	}

	/**
	* Returns the receiver name of this history interface request field.
	*
	* @return the receiver name of this history interface request field
	*/
	public java.lang.String getReceiverName() {
		return _historyInterfaceRequestField.getReceiverName();
	}

	/**
	* Sets the receiver name of this history interface request field.
	*
	* @param receiverName the receiver name of this history interface request field
	*/
	public void setReceiverName(java.lang.String receiverName) {
		_historyInterfaceRequestField.setReceiverName(receiverName);
	}

	/**
	* Returns the sending date of this history interface request field.
	*
	* @return the sending date of this history interface request field
	*/
	public java.util.Date getSendingDate() {
		return _historyInterfaceRequestField.getSendingDate();
	}

	/**
	* Sets the sending date of this history interface request field.
	*
	* @param sendingDate the sending date of this history interface request field
	*/
	public void setSendingDate(java.util.Date sendingDate) {
		_historyInterfaceRequestField.setSendingDate(sendingDate);
	}

	/**
	* Returns the receiver identify of this history interface request field.
	*
	* @return the receiver identify of this history interface request field
	*/
	public java.lang.String getReceiverIdentify() {
		return _historyInterfaceRequestField.getReceiverIdentify();
	}

	/**
	* Sets the receiver identify of this history interface request field.
	*
	* @param receiverIdentify the receiver identify of this history interface request field
	*/
	public void setReceiverIdentify(java.lang.String receiverIdentify) {
		_historyInterfaceRequestField.setReceiverIdentify(receiverIdentify);
	}

	/**
	* Returns the remarks of this history interface request field.
	*
	* @return the remarks of this history interface request field
	*/
	public java.lang.String getRemarks() {
		return _historyInterfaceRequestField.getRemarks();
	}

	/**
	* Sets the remarks of this history interface request field.
	*
	* @param remarks the remarks of this history interface request field
	*/
	public void setRemarks(java.lang.String remarks) {
		_historyInterfaceRequestField.setRemarks(remarks);
	}

	public boolean isNew() {
		return _historyInterfaceRequestField.isNew();
	}

	public void setNew(boolean n) {
		_historyInterfaceRequestField.setNew(n);
	}

	public boolean isCachedModel() {
		return _historyInterfaceRequestField.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_historyInterfaceRequestField.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _historyInterfaceRequestField.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _historyInterfaceRequestField.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_historyInterfaceRequestField.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _historyInterfaceRequestField.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_historyInterfaceRequestField.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HistoryInterfaceRequestFieldWrapper((HistoryInterfaceRequestField)_historyInterfaceRequestField.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField historyInterfaceRequestField) {
		return _historyInterfaceRequestField.compareTo(historyInterfaceRequestField);
	}

	@Override
	public int hashCode() {
		return _historyInterfaceRequestField.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> toCacheModel() {
		return _historyInterfaceRequestField.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField toEscapedModel() {
		return new HistoryInterfaceRequestFieldWrapper(_historyInterfaceRequestField.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _historyInterfaceRequestField.toString();
	}

	public java.lang.String toXmlString() {
		return _historyInterfaceRequestField.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_historyInterfaceRequestField.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public HistoryInterfaceRequestField getWrappedHistoryInterfaceRequestField() {
		return _historyInterfaceRequestField;
	}

	public HistoryInterfaceRequestField getWrappedModel() {
		return _historyInterfaceRequestField;
	}

	public void resetOriginalValues() {
		_historyInterfaceRequestField.resetOriginalValues();
	}

	private HistoryInterfaceRequestField _historyInterfaceRequestField;
}