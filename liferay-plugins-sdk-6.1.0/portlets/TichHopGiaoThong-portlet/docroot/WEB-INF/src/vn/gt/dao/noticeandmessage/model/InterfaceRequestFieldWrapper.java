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
 * This class is a wrapper for {@link InterfaceRequestField}.
 * </p>
 *
 * @author    win_64
 * @see       InterfaceRequestField
 * @generated
 */
public class InterfaceRequestFieldWrapper implements InterfaceRequestField,
	ModelWrapper<InterfaceRequestField> {
	public InterfaceRequestFieldWrapper(
		InterfaceRequestField interfaceRequestField) {
		_interfaceRequestField = interfaceRequestField;
	}

	public Class<?> getModelClass() {
		return InterfaceRequestField.class;
	}

	public String getModelClassName() {
		return InterfaceRequestField.class.getName();
	}

	/**
	* Returns the primary key of this interface request field.
	*
	* @return the primary key of this interface request field
	*/
	public long getPrimaryKey() {
		return _interfaceRequestField.getPrimaryKey();
	}

	/**
	* Sets the primary key of this interface request field.
	*
	* @param primaryKey the primary key of this interface request field
	*/
	public void setPrimaryKey(long primaryKey) {
		_interfaceRequestField.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this interface request field.
	*
	* @return the ID of this interface request field
	*/
	public long getId() {
		return _interfaceRequestField.getId();
	}

	/**
	* Sets the ID of this interface request field.
	*
	* @param id the ID of this interface request field
	*/
	public void setId(long id) {
		_interfaceRequestField.setId(id);
	}

	/**
	* Returns the request code of this interface request field.
	*
	* @return the request code of this interface request field
	*/
	public java.lang.String getRequestCode() {
		return _interfaceRequestField.getRequestCode();
	}

	/**
	* Sets the request code of this interface request field.
	*
	* @param requestCode the request code of this interface request field
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_interfaceRequestField.setRequestCode(requestCode);
	}

	/**
	* Returns the organization code of this interface request field.
	*
	* @return the organization code of this interface request field
	*/
	public java.lang.String getOrganizationCode() {
		return _interfaceRequestField.getOrganizationCode();
	}

	/**
	* Sets the organization code of this interface request field.
	*
	* @param organizationCode the organization code of this interface request field
	*/
	public void setOrganizationCode(java.lang.String organizationCode) {
		_interfaceRequestField.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the loc code of this interface request field.
	*
	* @return the loc code of this interface request field
	*/
	public java.lang.String getLocCode() {
		return _interfaceRequestField.getLocCode();
	}

	/**
	* Sets the loc code of this interface request field.
	*
	* @param locCode the loc code of this interface request field
	*/
	public void setLocCode(java.lang.String locCode) {
		_interfaceRequestField.setLocCode(locCode);
	}

	/**
	* Returns the request date of this interface request field.
	*
	* @return the request date of this interface request field
	*/
	public java.util.Date getRequestDate() {
		return _interfaceRequestField.getRequestDate();
	}

	/**
	* Sets the request date of this interface request field.
	*
	* @param requestDate the request date of this interface request field
	*/
	public void setRequestDate(java.util.Date requestDate) {
		_interfaceRequestField.setRequestDate(requestDate);
	}

	/**
	* Returns the requested date of this interface request field.
	*
	* @return the requested date of this interface request field
	*/
	public java.util.Date getRequestedDate() {
		return _interfaceRequestField.getRequestedDate();
	}

	/**
	* Sets the requested date of this interface request field.
	*
	* @param requestedDate the requested date of this interface request field
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_interfaceRequestField.setRequestedDate(requestedDate);
	}

	/**
	* Returns the request direction of this interface request field.
	*
	* @return the request direction of this interface request field
	*/
	public java.lang.String getRequestDirection() {
		return _interfaceRequestField.getRequestDirection();
	}

	/**
	* Sets the request direction of this interface request field.
	*
	* @param requestDirection the request direction of this interface request field
	*/
	public void setRequestDirection(java.lang.String requestDirection) {
		_interfaceRequestField.setRequestDirection(requestDirection);
	}

	/**
	* Returns the request state of this interface request field.
	*
	* @return the request state of this interface request field
	*/
	public int getRequestState() {
		return _interfaceRequestField.getRequestState();
	}

	/**
	* Sets the request state of this interface request field.
	*
	* @param requestState the request state of this interface request field
	*/
	public void setRequestState(int requestState) {
		_interfaceRequestField.setRequestState(requestState);
	}

	/**
	* Returns the request response time of this interface request field.
	*
	* @return the request response time of this interface request field
	*/
	public java.util.Date getRequestResponseTime() {
		return _interfaceRequestField.getRequestResponseTime();
	}

	/**
	* Sets the request response time of this interface request field.
	*
	* @param requestResponseTime the request response time of this interface request field
	*/
	public void setRequestResponseTime(java.util.Date requestResponseTime) {
		_interfaceRequestField.setRequestResponseTime(requestResponseTime);
	}

	/**
	* Returns the document type of this interface request field.
	*
	* @return the document type of this interface request field
	*/
	public java.lang.String getDocumentType() {
		return _interfaceRequestField.getDocumentType();
	}

	/**
	* Sets the document type of this interface request field.
	*
	* @param documentType the document type of this interface request field
	*/
	public void setDocumentType(java.lang.String documentType) {
		_interfaceRequestField.setDocumentType(documentType);
	}

	/**
	* Returns the document name ref of this interface request field.
	*
	* @return the document name ref of this interface request field
	*/
	public java.lang.String getDocumentNameRef() {
		return _interfaceRequestField.getDocumentNameRef();
	}

	/**
	* Sets the document name ref of this interface request field.
	*
	* @param documentNameRef the document name ref of this interface request field
	*/
	public void setDocumentNameRef(java.lang.String documentNameRef) {
		_interfaceRequestField.setDocumentNameRef(documentNameRef);
	}

	/**
	* Returns the business type of this interface request field.
	*
	* @return the business type of this interface request field
	*/
	public java.lang.String getBusinessType() {
		return _interfaceRequestField.getBusinessType();
	}

	/**
	* Sets the business type of this interface request field.
	*
	* @param businessType the business type of this interface request field
	*/
	public void setBusinessType(java.lang.String businessType) {
		_interfaceRequestField.setBusinessType(businessType);
	}

	/**
	* Returns the function type of this interface request field.
	*
	* @return the function type of this interface request field
	*/
	public java.lang.String getFunctionType() {
		return _interfaceRequestField.getFunctionType();
	}

	/**
	* Sets the function type of this interface request field.
	*
	* @param functionType the function type of this interface request field
	*/
	public void setFunctionType(java.lang.String functionType) {
		_interfaceRequestField.setFunctionType(functionType);
	}

	/**
	* Returns the sender name of this interface request field.
	*
	* @return the sender name of this interface request field
	*/
	public java.lang.String getSenderName() {
		return _interfaceRequestField.getSenderName();
	}

	/**
	* Sets the sender name of this interface request field.
	*
	* @param senderName the sender name of this interface request field
	*/
	public void setSenderName(java.lang.String senderName) {
		_interfaceRequestField.setSenderName(senderName);
	}

	/**
	* Returns the request version of this interface request field.
	*
	* @return the request version of this interface request field
	*/
	public java.lang.String getRequestVersion() {
		return _interfaceRequestField.getRequestVersion();
	}

	/**
	* Sets the request version of this interface request field.
	*
	* @param requestVersion the request version of this interface request field
	*/
	public void setRequestVersion(java.lang.String requestVersion) {
		_interfaceRequestField.setRequestVersion(requestVersion);
	}

	/**
	* Returns the sender identify of this interface request field.
	*
	* @return the sender identify of this interface request field
	*/
	public java.lang.String getSenderIdentify() {
		return _interfaceRequestField.getSenderIdentify();
	}

	/**
	* Sets the sender identify of this interface request field.
	*
	* @param senderIdentify the sender identify of this interface request field
	*/
	public void setSenderIdentify(java.lang.String senderIdentify) {
		_interfaceRequestField.setSenderIdentify(senderIdentify);
	}

	/**
	* Returns the receiver name of this interface request field.
	*
	* @return the receiver name of this interface request field
	*/
	public java.lang.String getReceiverName() {
		return _interfaceRequestField.getReceiverName();
	}

	/**
	* Sets the receiver name of this interface request field.
	*
	* @param receiverName the receiver name of this interface request field
	*/
	public void setReceiverName(java.lang.String receiverName) {
		_interfaceRequestField.setReceiverName(receiverName);
	}

	/**
	* Returns the sending date of this interface request field.
	*
	* @return the sending date of this interface request field
	*/
	public java.util.Date getSendingDate() {
		return _interfaceRequestField.getSendingDate();
	}

	/**
	* Sets the sending date of this interface request field.
	*
	* @param sendingDate the sending date of this interface request field
	*/
	public void setSendingDate(java.util.Date sendingDate) {
		_interfaceRequestField.setSendingDate(sendingDate);
	}

	/**
	* Returns the receiver identify of this interface request field.
	*
	* @return the receiver identify of this interface request field
	*/
	public java.lang.String getReceiverIdentify() {
		return _interfaceRequestField.getReceiverIdentify();
	}

	/**
	* Sets the receiver identify of this interface request field.
	*
	* @param receiverIdentify the receiver identify of this interface request field
	*/
	public void setReceiverIdentify(java.lang.String receiverIdentify) {
		_interfaceRequestField.setReceiverIdentify(receiverIdentify);
	}

	/**
	* Returns the remarks of this interface request field.
	*
	* @return the remarks of this interface request field
	*/
	public java.lang.String getRemarks() {
		return _interfaceRequestField.getRemarks();
	}

	/**
	* Sets the remarks of this interface request field.
	*
	* @param remarks the remarks of this interface request field
	*/
	public void setRemarks(java.lang.String remarks) {
		_interfaceRequestField.setRemarks(remarks);
	}

	public boolean isNew() {
		return _interfaceRequestField.isNew();
	}

	public void setNew(boolean n) {
		_interfaceRequestField.setNew(n);
	}

	public boolean isCachedModel() {
		return _interfaceRequestField.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_interfaceRequestField.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _interfaceRequestField.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _interfaceRequestField.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_interfaceRequestField.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _interfaceRequestField.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_interfaceRequestField.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InterfaceRequestFieldWrapper((InterfaceRequestField)_interfaceRequestField.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.InterfaceRequestField interfaceRequestField) {
		return _interfaceRequestField.compareTo(interfaceRequestField);
	}

	@Override
	public int hashCode() {
		return _interfaceRequestField.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.InterfaceRequestField> toCacheModel() {
		return _interfaceRequestField.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.InterfaceRequestField toEscapedModel() {
		return new InterfaceRequestFieldWrapper(_interfaceRequestField.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _interfaceRequestField.toString();
	}

	public java.lang.String toXmlString() {
		return _interfaceRequestField.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_interfaceRequestField.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public InterfaceRequestField getWrappedInterfaceRequestField() {
		return _interfaceRequestField;
	}

	public InterfaceRequestField getWrappedModel() {
		return _interfaceRequestField;
	}

	public void resetOriginalValues() {
		_interfaceRequestField.resetOriginalValues();
	}

	private InterfaceRequestField _interfaceRequestField;
}