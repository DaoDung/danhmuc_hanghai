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
 * This class is a wrapper for {@link DmPackage}.
 * </p>
 *
 * @author    win_64
 * @see       DmPackage
 * @generated
 */
public class DmPackageWrapper implements DmPackage, ModelWrapper<DmPackage> {
	public DmPackageWrapper(DmPackage dmPackage) {
		_dmPackage = dmPackage;
	}

	public Class<?> getModelClass() {
		return DmPackage.class;
	}

	public String getModelClassName() {
		return DmPackage.class.getName();
	}

	/**
	* Returns the primary key of this dm package.
	*
	* @return the primary key of this dm package
	*/
	public int getPrimaryKey() {
		return _dmPackage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm package.
	*
	* @param primaryKey the primary key of this dm package
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmPackage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm package.
	*
	* @return the ID of this dm package
	*/
	public int getId() {
		return _dmPackage.getId();
	}

	/**
	* Sets the ID of this dm package.
	*
	* @param id the ID of this dm package
	*/
	public void setId(int id) {
		_dmPackage.setId(id);
	}

	/**
	* Returns the package code of this dm package.
	*
	* @return the package code of this dm package
	*/
	public java.lang.String getPackageCode() {
		return _dmPackage.getPackageCode();
	}

	/**
	* Sets the package code of this dm package.
	*
	* @param packageCode the package code of this dm package
	*/
	public void setPackageCode(java.lang.String packageCode) {
		_dmPackage.setPackageCode(packageCode);
	}

	/**
	* Returns the package name of this dm package.
	*
	* @return the package name of this dm package
	*/
	public java.lang.String getPackageName() {
		return _dmPackage.getPackageName();
	}

	/**
	* Sets the package name of this dm package.
	*
	* @param packageName the package name of this dm package
	*/
	public void setPackageName(java.lang.String packageName) {
		_dmPackage.setPackageName(packageName);
	}

	/**
	* Returns the package name v n of this dm package.
	*
	* @return the package name v n of this dm package
	*/
	public java.lang.String getPackageNameVN() {
		return _dmPackage.getPackageNameVN();
	}

	/**
	* Sets the package name v n of this dm package.
	*
	* @param packageNameVN the package name v n of this dm package
	*/
	public void setPackageNameVN(java.lang.String packageNameVN) {
		_dmPackage.setPackageNameVN(packageNameVN);
	}

	/**
	* Returns the package order of this dm package.
	*
	* @return the package order of this dm package
	*/
	public int getPackageOrder() {
		return _dmPackage.getPackageOrder();
	}

	/**
	* Sets the package order of this dm package.
	*
	* @param packageOrder the package order of this dm package
	*/
	public void setPackageOrder(int packageOrder) {
		_dmPackage.setPackageOrder(packageOrder);
	}

	/**
	* Returns the is delete of this dm package.
	*
	* @return the is delete of this dm package
	*/
	public int getIsDelete() {
		return _dmPackage.getIsDelete();
	}

	/**
	* Sets the is delete of this dm package.
	*
	* @param isDelete the is delete of this dm package
	*/
	public void setIsDelete(int isDelete) {
		_dmPackage.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm package.
	*
	* @return the marked as delete of this dm package
	*/
	public int getMarkedAsDelete() {
		return _dmPackage.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm package.
	*
	* @param markedAsDelete the marked as delete of this dm package
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPackage.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm package.
	*
	* @return the modified date of this dm package
	*/
	public java.util.Date getModifiedDate() {
		return _dmPackage.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm package.
	*
	* @param modifiedDate the modified date of this dm package
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPackage.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm package.
	*
	* @return the requested date of this dm package
	*/
	public java.util.Date getRequestedDate() {
		return _dmPackage.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm package.
	*
	* @param requestedDate the requested date of this dm package
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPackage.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm package.
	*
	* @return the sync version of this dm package
	*/
	public java.lang.String getSyncVersion() {
		return _dmPackage.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm package.
	*
	* @param syncVersion the sync version of this dm package
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPackage.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmPackage.isNew();
	}

	public void setNew(boolean n) {
		_dmPackage.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmPackage.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmPackage.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmPackage.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPackage.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPackage.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPackage.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPackage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPackageWrapper((DmPackage)_dmPackage.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmPackage dmPackage) {
		return _dmPackage.compareTo(dmPackage);
	}

	@Override
	public int hashCode() {
		return _dmPackage.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmPackage> toCacheModel() {
		return _dmPackage.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmPackage toEscapedModel() {
		return new DmPackageWrapper(_dmPackage.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPackage.toString();
	}

	public java.lang.String toXmlString() {
		return _dmPackage.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPackage.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmPackage getWrappedDmPackage() {
		return _dmPackage;
	}

	public DmPackage getWrappedModel() {
		return _dmPackage;
	}

	public void resetOriginalValues() {
		_dmPackage.resetOriginalValues();
	}

	private DmPackage _dmPackage;
}