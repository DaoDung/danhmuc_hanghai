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
 * This class is a wrapper for {@link DmHistoryPackage}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryPackage
 * @generated
 */
public class DmHistoryPackageWrapper implements DmHistoryPackage,
	ModelWrapper<DmHistoryPackage> {
	public DmHistoryPackageWrapper(DmHistoryPackage dmHistoryPackage) {
		_dmHistoryPackage = dmHistoryPackage;
	}

	public Class<?> getModelClass() {
		return DmHistoryPackage.class;
	}

	public String getModelClassName() {
		return DmHistoryPackage.class.getName();
	}

	/**
	* Returns the primary key of this dm history package.
	*
	* @return the primary key of this dm history package
	*/
	public int getPrimaryKey() {
		return _dmHistoryPackage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history package.
	*
	* @param primaryKey the primary key of this dm history package
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPackage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history package.
	*
	* @return the ID of this dm history package
	*/
	public int getId() {
		return _dmHistoryPackage.getId();
	}

	/**
	* Sets the ID of this dm history package.
	*
	* @param id the ID of this dm history package
	*/
	public void setId(int id) {
		_dmHistoryPackage.setId(id);
	}

	/**
	* Returns the package code of this dm history package.
	*
	* @return the package code of this dm history package
	*/
	public java.lang.String getPackageCode() {
		return _dmHistoryPackage.getPackageCode();
	}

	/**
	* Sets the package code of this dm history package.
	*
	* @param packageCode the package code of this dm history package
	*/
	public void setPackageCode(java.lang.String packageCode) {
		_dmHistoryPackage.setPackageCode(packageCode);
	}

	/**
	* Returns the package name of this dm history package.
	*
	* @return the package name of this dm history package
	*/
	public java.lang.String getPackageName() {
		return _dmHistoryPackage.getPackageName();
	}

	/**
	* Sets the package name of this dm history package.
	*
	* @param packageName the package name of this dm history package
	*/
	public void setPackageName(java.lang.String packageName) {
		_dmHistoryPackage.setPackageName(packageName);
	}

	/**
	* Returns the package name v n of this dm history package.
	*
	* @return the package name v n of this dm history package
	*/
	public java.lang.String getPackageNameVN() {
		return _dmHistoryPackage.getPackageNameVN();
	}

	/**
	* Sets the package name v n of this dm history package.
	*
	* @param packageNameVN the package name v n of this dm history package
	*/
	public void setPackageNameVN(java.lang.String packageNameVN) {
		_dmHistoryPackage.setPackageNameVN(packageNameVN);
	}

	/**
	* Returns the package order of this dm history package.
	*
	* @return the package order of this dm history package
	*/
	public int getPackageOrder() {
		return _dmHistoryPackage.getPackageOrder();
	}

	/**
	* Sets the package order of this dm history package.
	*
	* @param packageOrder the package order of this dm history package
	*/
	public void setPackageOrder(int packageOrder) {
		_dmHistoryPackage.setPackageOrder(packageOrder);
	}

	/**
	* Returns the is delete of this dm history package.
	*
	* @return the is delete of this dm history package
	*/
	public int getIsDelete() {
		return _dmHistoryPackage.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history package.
	*
	* @param isDelete the is delete of this dm history package
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryPackage.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history package.
	*
	* @return the marked as delete of this dm history package
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryPackage.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history package.
	*
	* @param markedAsDelete the marked as delete of this dm history package
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPackage.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history package.
	*
	* @return the modified date of this dm history package
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryPackage.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history package.
	*
	* @param modifiedDate the modified date of this dm history package
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPackage.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history package.
	*
	* @return the requested date of this dm history package
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryPackage.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history package.
	*
	* @param requestedDate the requested date of this dm history package
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPackage.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history package.
	*
	* @return the sync version of this dm history package
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryPackage.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history package.
	*
	* @param syncVersion the sync version of this dm history package
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPackage.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryPackage.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryPackage.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryPackage.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPackage.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryPackage.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPackage.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPackage.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPackage.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPackage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPackageWrapper((DmHistoryPackage)_dmHistoryPackage.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmHistoryPackage dmHistoryPackage) {
		return _dmHistoryPackage.compareTo(dmHistoryPackage);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPackage.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryPackage> toCacheModel() {
		return _dmHistoryPackage.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryPackage toEscapedModel() {
		return new DmHistoryPackageWrapper(_dmHistoryPackage.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPackage.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryPackage.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPackage.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryPackage getWrappedDmHistoryPackage() {
		return _dmHistoryPackage;
	}

	public DmHistoryPackage getWrappedModel() {
		return _dmHistoryPackage;
	}

	public void resetOriginalValues() {
		_dmHistoryPackage.resetOriginalValues();
	}

	private DmHistoryPackage _dmHistoryPackage;
}