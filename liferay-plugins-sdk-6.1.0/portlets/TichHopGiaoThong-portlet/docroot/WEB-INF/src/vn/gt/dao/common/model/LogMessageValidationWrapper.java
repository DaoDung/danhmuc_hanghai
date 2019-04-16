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

package vn.gt.dao.common.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link LogMessageValidation}.
 * </p>
 *
 * @author    win_64
 * @see       LogMessageValidation
 * @generated
 */
public class LogMessageValidationWrapper implements LogMessageValidation,
	ModelWrapper<LogMessageValidation> {
	public LogMessageValidationWrapper(
		LogMessageValidation logMessageValidation) {
		_logMessageValidation = logMessageValidation;
	}

	public Class<?> getModelClass() {
		return LogMessageValidation.class;
	}

	public String getModelClassName() {
		return LogMessageValidation.class.getName();
	}

	/**
	* Returns the primary key of this log message validation.
	*
	* @return the primary key of this log message validation
	*/
	public long getPrimaryKey() {
		return _logMessageValidation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this log message validation.
	*
	* @param primaryKey the primary key of this log message validation
	*/
	public void setPrimaryKey(long primaryKey) {
		_logMessageValidation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this log message validation.
	*
	* @return the ID of this log message validation
	*/
	public long getId() {
		return _logMessageValidation.getId();
	}

	/**
	* Sets the ID of this log message validation.
	*
	* @param id the ID of this log message validation
	*/
	public void setId(long id) {
		_logMessageValidation.setId(id);
	}

	/**
	* Returns the request code of this log message validation.
	*
	* @return the request code of this log message validation
	*/
	public java.lang.String getRequestCode() {
		return _logMessageValidation.getRequestCode();
	}

	/**
	* Sets the request code of this log message validation.
	*
	* @param requestCode the request code of this log message validation
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_logMessageValidation.setRequestCode(requestCode);
	}

	/**
	* Returns the request direction of this log message validation.
	*
	* @return the request direction of this log message validation
	*/
	public java.lang.String getRequestDirection() {
		return _logMessageValidation.getRequestDirection();
	}

	/**
	* Sets the request direction of this log message validation.
	*
	* @param requestDirection the request direction of this log message validation
	*/
	public void setRequestDirection(java.lang.String requestDirection) {
		_logMessageValidation.setRequestDirection(requestDirection);
	}

	/**
	* Returns the request date of this log message validation.
	*
	* @return the request date of this log message validation
	*/
	public java.util.Date getRequestDate() {
		return _logMessageValidation.getRequestDate();
	}

	/**
	* Sets the request date of this log message validation.
	*
	* @param requestDate the request date of this log message validation
	*/
	public void setRequestDate(java.util.Date requestDate) {
		_logMessageValidation.setRequestDate(requestDate);
	}

	/**
	* Returns the document name of this log message validation.
	*
	* @return the document name of this log message validation
	*/
	public long getDocumentName() {
		return _logMessageValidation.getDocumentName();
	}

	/**
	* Sets the document name of this log message validation.
	*
	* @param documentName the document name of this log message validation
	*/
	public void setDocumentName(long documentName) {
		_logMessageValidation.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this log message validation.
	*
	* @return the document year of this log message validation
	*/
	public int getDocumentYear() {
		return _logMessageValidation.getDocumentYear();
	}

	/**
	* Sets the document year of this log message validation.
	*
	* @param documentYear the document year of this log message validation
	*/
	public void setDocumentYear(int documentYear) {
		_logMessageValidation.setDocumentYear(documentYear);
	}

	/**
	* Returns the document type of this log message validation.
	*
	* @return the document type of this log message validation
	*/
	public java.lang.String getDocumentType() {
		return _logMessageValidation.getDocumentType();
	}

	/**
	* Sets the document type of this log message validation.
	*
	* @param documentType the document type of this log message validation
	*/
	public void setDocumentType(java.lang.String documentType) {
		_logMessageValidation.setDocumentType(documentType);
	}

	/**
	* Returns the tag property of this log message validation.
	*
	* @return the tag property of this log message validation
	*/
	public java.lang.String getTagProperty() {
		return _logMessageValidation.getTagProperty();
	}

	/**
	* Sets the tag property of this log message validation.
	*
	* @param tagProperty the tag property of this log message validation
	*/
	public void setTagProperty(java.lang.String tagProperty) {
		_logMessageValidation.setTagProperty(tagProperty);
	}

	/**
	* Returns the data validation of this log message validation.
	*
	* @return the data validation of this log message validation
	*/
	public java.lang.String getDataValidation() {
		return _logMessageValidation.getDataValidation();
	}

	/**
	* Sets the data validation of this log message validation.
	*
	* @param dataValidation the data validation of this log message validation
	*/
	public void setDataValidation(java.lang.String dataValidation) {
		_logMessageValidation.setDataValidation(dataValidation);
	}

	public boolean isNew() {
		return _logMessageValidation.isNew();
	}

	public void setNew(boolean n) {
		_logMessageValidation.setNew(n);
	}

	public boolean isCachedModel() {
		return _logMessageValidation.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_logMessageValidation.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _logMessageValidation.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _logMessageValidation.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_logMessageValidation.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _logMessageValidation.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_logMessageValidation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LogMessageValidationWrapper((LogMessageValidation)_logMessageValidation.clone());
	}

	public int compareTo(
		vn.gt.dao.common.model.LogMessageValidation logMessageValidation) {
		return _logMessageValidation.compareTo(logMessageValidation);
	}

	@Override
	public int hashCode() {
		return _logMessageValidation.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.common.model.LogMessageValidation> toCacheModel() {
		return _logMessageValidation.toCacheModel();
	}

	public vn.gt.dao.common.model.LogMessageValidation toEscapedModel() {
		return new LogMessageValidationWrapper(_logMessageValidation.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _logMessageValidation.toString();
	}

	public java.lang.String toXmlString() {
		return _logMessageValidation.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_logMessageValidation.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public LogMessageValidation getWrappedLogMessageValidation() {
		return _logMessageValidation;
	}

	public LogMessageValidation getWrappedModel() {
		return _logMessageValidation;
	}

	public void resetOriginalValues() {
		_logMessageValidation.resetOriginalValues();
	}

	private LogMessageValidation _logMessageValidation;
}