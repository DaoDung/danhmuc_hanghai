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

package vn.gt.dao.danhmucgt.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmGTFunctionType}.
 * </p>
 *
 * @author    win_64
 * @see       DmGTFunctionType
 * @generated
 */
public class DmGTFunctionTypeWrapper implements DmGTFunctionType,
	ModelWrapper<DmGTFunctionType> {
	public DmGTFunctionTypeWrapper(DmGTFunctionType dmGTFunctionType) {
		_dmGTFunctionType = dmGTFunctionType;
	}

	public Class<?> getModelClass() {
		return DmGTFunctionType.class;
	}

	public String getModelClassName() {
		return DmGTFunctionType.class.getName();
	}

	/**
	* Returns the primary key of this dm g t function type.
	*
	* @return the primary key of this dm g t function type
	*/
	public long getPrimaryKey() {
		return _dmGTFunctionType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm g t function type.
	*
	* @param primaryKey the primary key of this dm g t function type
	*/
	public void setPrimaryKey(long primaryKey) {
		_dmGTFunctionType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm g t function type.
	*
	* @return the ID of this dm g t function type
	*/
	public long getId() {
		return _dmGTFunctionType.getId();
	}

	/**
	* Sets the ID of this dm g t function type.
	*
	* @param id the ID of this dm g t function type
	*/
	public void setId(long id) {
		_dmGTFunctionType.setId(id);
	}

	/**
	* Returns the function type code of this dm g t function type.
	*
	* @return the function type code of this dm g t function type
	*/
	public java.lang.String getFunctionTypeCode() {
		return _dmGTFunctionType.getFunctionTypeCode();
	}

	/**
	* Sets the function type code of this dm g t function type.
	*
	* @param functionTypeCode the function type code of this dm g t function type
	*/
	public void setFunctionTypeCode(java.lang.String functionTypeCode) {
		_dmGTFunctionType.setFunctionTypeCode(functionTypeCode);
	}

	/**
	* Returns the function type name of this dm g t function type.
	*
	* @return the function type name of this dm g t function type
	*/
	public java.lang.String getFunctionTypeName() {
		return _dmGTFunctionType.getFunctionTypeName();
	}

	/**
	* Sets the function type name of this dm g t function type.
	*
	* @param functionTypeName the function type name of this dm g t function type
	*/
	public void setFunctionTypeName(java.lang.String functionTypeName) {
		_dmGTFunctionType.setFunctionTypeName(functionTypeName);
	}

	/**
	* Returns the function type name v n of this dm g t function type.
	*
	* @return the function type name v n of this dm g t function type
	*/
	public java.lang.String getFunctionTypeNameVN() {
		return _dmGTFunctionType.getFunctionTypeNameVN();
	}

	/**
	* Sets the function type name v n of this dm g t function type.
	*
	* @param functionTypeNameVN the function type name v n of this dm g t function type
	*/
	public void setFunctionTypeNameVN(java.lang.String functionTypeNameVN) {
		_dmGTFunctionType.setFunctionTypeNameVN(functionTypeNameVN);
	}

	/**
	* Returns the function type order of this dm g t function type.
	*
	* @return the function type order of this dm g t function type
	*/
	public int getFunctionTypeOrder() {
		return _dmGTFunctionType.getFunctionTypeOrder();
	}

	/**
	* Sets the function type order of this dm g t function type.
	*
	* @param functionTypeOrder the function type order of this dm g t function type
	*/
	public void setFunctionTypeOrder(int functionTypeOrder) {
		_dmGTFunctionType.setFunctionTypeOrder(functionTypeOrder);
	}

	/**
	* Returns the is delete of this dm g t function type.
	*
	* @return the is delete of this dm g t function type
	*/
	public int getIsDelete() {
		return _dmGTFunctionType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm g t function type.
	*
	* @param isDelete the is delete of this dm g t function type
	*/
	public void setIsDelete(int isDelete) {
		_dmGTFunctionType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm g t function type.
	*
	* @return the marked as delete of this dm g t function type
	*/
	public int getMarkedAsDelete() {
		return _dmGTFunctionType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm g t function type.
	*
	* @param markedAsDelete the marked as delete of this dm g t function type
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGTFunctionType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm g t function type.
	*
	* @return the modified date of this dm g t function type
	*/
	public java.util.Date getModifiedDate() {
		return _dmGTFunctionType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm g t function type.
	*
	* @param modifiedDate the modified date of this dm g t function type
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGTFunctionType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm g t function type.
	*
	* @return the requested date of this dm g t function type
	*/
	public java.util.Date getRequestedDate() {
		return _dmGTFunctionType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm g t function type.
	*
	* @param requestedDate the requested date of this dm g t function type
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGTFunctionType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm g t function type.
	*
	* @return the sync version of this dm g t function type
	*/
	public java.lang.String getSyncVersion() {
		return _dmGTFunctionType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm g t function type.
	*
	* @param syncVersion the sync version of this dm g t function type
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGTFunctionType.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmGTFunctionType.isNew();
	}

	public void setNew(boolean n) {
		_dmGTFunctionType.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmGTFunctionType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmGTFunctionType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmGTFunctionType.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGTFunctionType.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGTFunctionType.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGTFunctionType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGTFunctionType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGTFunctionTypeWrapper((DmGTFunctionType)_dmGTFunctionType.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmucgt.model.DmGTFunctionType dmGTFunctionType) {
		return _dmGTFunctionType.compareTo(dmGTFunctionType);
	}

	@Override
	public int hashCode() {
		return _dmGTFunctionType.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmucgt.model.DmGTFunctionType> toCacheModel() {
		return _dmGTFunctionType.toCacheModel();
	}

	public vn.gt.dao.danhmucgt.model.DmGTFunctionType toEscapedModel() {
		return new DmGTFunctionTypeWrapper(_dmGTFunctionType.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGTFunctionType.toString();
	}

	public java.lang.String toXmlString() {
		return _dmGTFunctionType.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGTFunctionType.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmGTFunctionType getWrappedDmGTFunctionType() {
		return _dmGTFunctionType;
	}

	public DmGTFunctionType getWrappedModel() {
		return _dmGTFunctionType;
	}

	public void resetOriginalValues() {
		_dmGTFunctionType.resetOriginalValues();
	}

	private DmGTFunctionType _dmGTFunctionType;
}