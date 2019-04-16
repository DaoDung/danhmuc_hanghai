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
 * This class is a wrapper for {@link DmPassportType}.
 * </p>
 *
 * @author    win_64
 * @see       DmPassportType
 * @generated
 */
public class DmPassportTypeWrapper implements DmPassportType,
	ModelWrapper<DmPassportType> {
	public DmPassportTypeWrapper(DmPassportType dmPassportType) {
		_dmPassportType = dmPassportType;
	}

	public Class<?> getModelClass() {
		return DmPassportType.class;
	}

	public String getModelClassName() {
		return DmPassportType.class.getName();
	}

	/**
	* Returns the primary key of this dm passport type.
	*
	* @return the primary key of this dm passport type
	*/
	public int getPrimaryKey() {
		return _dmPassportType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm passport type.
	*
	* @param primaryKey the primary key of this dm passport type
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmPassportType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm passport type.
	*
	* @return the ID of this dm passport type
	*/
	public int getId() {
		return _dmPassportType.getId();
	}

	/**
	* Sets the ID of this dm passport type.
	*
	* @param id the ID of this dm passport type
	*/
	public void setId(int id) {
		_dmPassportType.setId(id);
	}

	/**
	* Returns the passport type code of this dm passport type.
	*
	* @return the passport type code of this dm passport type
	*/
	public java.lang.String getPassportTypeCode() {
		return _dmPassportType.getPassportTypeCode();
	}

	/**
	* Sets the passport type code of this dm passport type.
	*
	* @param passportTypeCode the passport type code of this dm passport type
	*/
	public void setPassportTypeCode(java.lang.String passportTypeCode) {
		_dmPassportType.setPassportTypeCode(passportTypeCode);
	}

	/**
	* Returns the passport type of this dm passport type.
	*
	* @return the passport type of this dm passport type
	*/
	public java.lang.String getPassportType() {
		return _dmPassportType.getPassportType();
	}

	/**
	* Sets the passport type of this dm passport type.
	*
	* @param passportType the passport type of this dm passport type
	*/
	public void setPassportType(java.lang.String passportType) {
		_dmPassportType.setPassportType(passportType);
	}

	/**
	* Returns the passport type name of this dm passport type.
	*
	* @return the passport type name of this dm passport type
	*/
	public java.lang.String getPassportTypeName() {
		return _dmPassportType.getPassportTypeName();
	}

	/**
	* Sets the passport type name of this dm passport type.
	*
	* @param passportTypeName the passport type name of this dm passport type
	*/
	public void setPassportTypeName(java.lang.String passportTypeName) {
		_dmPassportType.setPassportTypeName(passportTypeName);
	}

	/**
	* Returns the passport type name v n of this dm passport type.
	*
	* @return the passport type name v n of this dm passport type
	*/
	public java.lang.String getPassportTypeNameVN() {
		return _dmPassportType.getPassportTypeNameVN();
	}

	/**
	* Sets the passport type name v n of this dm passport type.
	*
	* @param passportTypeNameVN the passport type name v n of this dm passport type
	*/
	public void setPassportTypeNameVN(java.lang.String passportTypeNameVN) {
		_dmPassportType.setPassportTypeNameVN(passportTypeNameVN);
	}

	/**
	* Returns the is delete of this dm passport type.
	*
	* @return the is delete of this dm passport type
	*/
	public int getIsDelete() {
		return _dmPassportType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm passport type.
	*
	* @param isDelete the is delete of this dm passport type
	*/
	public void setIsDelete(int isDelete) {
		_dmPassportType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm passport type.
	*
	* @return the marked as delete of this dm passport type
	*/
	public int getMarkedAsDelete() {
		return _dmPassportType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm passport type.
	*
	* @param markedAsDelete the marked as delete of this dm passport type
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPassportType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm passport type.
	*
	* @return the modified date of this dm passport type
	*/
	public java.util.Date getModifiedDate() {
		return _dmPassportType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm passport type.
	*
	* @param modifiedDate the modified date of this dm passport type
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPassportType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm passport type.
	*
	* @return the requested date of this dm passport type
	*/
	public java.util.Date getRequestedDate() {
		return _dmPassportType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm passport type.
	*
	* @param requestedDate the requested date of this dm passport type
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPassportType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm passport type.
	*
	* @return the sync version of this dm passport type
	*/
	public java.lang.String getSyncVersion() {
		return _dmPassportType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm passport type.
	*
	* @param syncVersion the sync version of this dm passport type
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPassportType.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmPassportType.isNew();
	}

	public void setNew(boolean n) {
		_dmPassportType.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmPassportType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmPassportType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmPassportType.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPassportType.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPassportType.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPassportType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPassportType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPassportTypeWrapper((DmPassportType)_dmPassportType.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmPassportType dmPassportType) {
		return _dmPassportType.compareTo(dmPassportType);
	}

	@Override
	public int hashCode() {
		return _dmPassportType.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmPassportType> toCacheModel() {
		return _dmPassportType.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmPassportType toEscapedModel() {
		return new DmPassportTypeWrapper(_dmPassportType.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPassportType.toString();
	}

	public java.lang.String toXmlString() {
		return _dmPassportType.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPassportType.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmPassportType getWrappedDmPassportType() {
		return _dmPassportType;
	}

	public DmPassportType getWrappedModel() {
		return _dmPassportType;
	}

	public void resetOriginalValues() {
		_dmPassportType.resetOriginalValues();
	}

	private DmPassportType _dmPassportType;
}