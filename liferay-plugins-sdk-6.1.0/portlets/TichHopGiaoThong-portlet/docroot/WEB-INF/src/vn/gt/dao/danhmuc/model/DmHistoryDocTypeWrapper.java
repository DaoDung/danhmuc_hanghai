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

package vn.gt.dao.danhmuc.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmHistoryDocType}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryDocType
 * @generated
 */
public class DmHistoryDocTypeWrapper implements DmHistoryDocType,
	ModelWrapper<DmHistoryDocType> {
	public DmHistoryDocTypeWrapper(DmHistoryDocType dmHistoryDocType) {
		_dmHistoryDocType = dmHistoryDocType;
	}

	public Class<?> getModelClass() {
		return DmHistoryDocType.class;
	}

	public String getModelClassName() {
		return DmHistoryDocType.class.getName();
	}

	/**
	* Returns the primary key of this dm history doc type.
	*
	* @return the primary key of this dm history doc type
	*/
	public int getPrimaryKey() {
		return _dmHistoryDocType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history doc type.
	*
	* @param primaryKey the primary key of this dm history doc type
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryDocType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history doc type.
	*
	* @return the ID of this dm history doc type
	*/
	public int getId() {
		return _dmHistoryDocType.getId();
	}

	/**
	* Sets the ID of this dm history doc type.
	*
	* @param id the ID of this dm history doc type
	*/
	public void setId(int id) {
		_dmHistoryDocType.setId(id);
	}

	/**
	* Returns the document type code of this dm history doc type.
	*
	* @return the document type code of this dm history doc type
	*/
	public java.lang.String getDocumentTypeCode() {
		return _dmHistoryDocType.getDocumentTypeCode();
	}

	/**
	* Sets the document type code of this dm history doc type.
	*
	* @param documentTypeCode the document type code of this dm history doc type
	*/
	public void setDocumentTypeCode(java.lang.String documentTypeCode) {
		_dmHistoryDocType.setDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the document type of this dm history doc type.
	*
	* @return the document type of this dm history doc type
	*/
	public java.lang.String getDocumentType() {
		return _dmHistoryDocType.getDocumentType();
	}

	/**
	* Sets the document type of this dm history doc type.
	*
	* @param documentType the document type of this dm history doc type
	*/
	public void setDocumentType(java.lang.String documentType) {
		_dmHistoryDocType.setDocumentType(documentType);
	}

	/**
	* Returns the document type name of this dm history doc type.
	*
	* @return the document type name of this dm history doc type
	*/
	public java.lang.String getDocumentTypeName() {
		return _dmHistoryDocType.getDocumentTypeName();
	}

	/**
	* Sets the document type name of this dm history doc type.
	*
	* @param documentTypeName the document type name of this dm history doc type
	*/
	public void setDocumentTypeName(java.lang.String documentTypeName) {
		_dmHistoryDocType.setDocumentTypeName(documentTypeName);
	}

	/**
	* Returns the is delete of this dm history doc type.
	*
	* @return the is delete of this dm history doc type
	*/
	public int getIsDelete() {
		return _dmHistoryDocType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history doc type.
	*
	* @param isDelete the is delete of this dm history doc type
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryDocType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history doc type.
	*
	* @return the marked as delete of this dm history doc type
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryDocType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history doc type.
	*
	* @param markedAsDelete the marked as delete of this dm history doc type
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryDocType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history doc type.
	*
	* @return the modified date of this dm history doc type
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryDocType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history doc type.
	*
	* @param modifiedDate the modified date of this dm history doc type
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryDocType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history doc type.
	*
	* @return the requested date of this dm history doc type
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryDocType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history doc type.
	*
	* @param requestedDate the requested date of this dm history doc type
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryDocType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history doc type.
	*
	* @return the sync version of this dm history doc type
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryDocType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history doc type.
	*
	* @param syncVersion the sync version of this dm history doc type
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryDocType.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryDocType.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryDocType.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryDocType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryDocType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryDocType.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryDocType.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryDocType.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryDocType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryDocType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryDocTypeWrapper((DmHistoryDocType)_dmHistoryDocType.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmHistoryDocType dmHistoryDocType) {
		return _dmHistoryDocType.compareTo(dmHistoryDocType);
	}

	@Override
	public int hashCode() {
		return _dmHistoryDocType.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryDocType> toCacheModel() {
		return _dmHistoryDocType.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryDocType toEscapedModel() {
		return new DmHistoryDocTypeWrapper(_dmHistoryDocType.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryDocType.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryDocType.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryDocType.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryDocType getWrappedDmHistoryDocType() {
		return _dmHistoryDocType;
	}

	public DmHistoryDocType getWrappedModel() {
		return _dmHistoryDocType;
	}

	public void resetOriginalValues() {
		_dmHistoryDocType.resetOriginalValues();
	}

	private DmHistoryDocType _dmHistoryDocType;
}