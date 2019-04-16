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
 * This class is a wrapper for {@link DmUnitGeneral}.
 * </p>
 *
 * @author    win_64
 * @see       DmUnitGeneral
 * @generated
 */
public class DmUnitGeneralWrapper implements DmUnitGeneral,
	ModelWrapper<DmUnitGeneral> {
	public DmUnitGeneralWrapper(DmUnitGeneral dmUnitGeneral) {
		_dmUnitGeneral = dmUnitGeneral;
	}

	public Class<?> getModelClass() {
		return DmUnitGeneral.class;
	}

	public String getModelClassName() {
		return DmUnitGeneral.class.getName();
	}

	/**
	* Returns the primary key of this dm unit general.
	*
	* @return the primary key of this dm unit general
	*/
	public int getPrimaryKey() {
		return _dmUnitGeneral.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm unit general.
	*
	* @param primaryKey the primary key of this dm unit general
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmUnitGeneral.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm unit general.
	*
	* @return the ID of this dm unit general
	*/
	public int getId() {
		return _dmUnitGeneral.getId();
	}

	/**
	* Sets the ID of this dm unit general.
	*
	* @param id the ID of this dm unit general
	*/
	public void setId(int id) {
		_dmUnitGeneral.setId(id);
	}

	/**
	* Returns the unit code of this dm unit general.
	*
	* @return the unit code of this dm unit general
	*/
	public java.lang.String getUnitCode() {
		return _dmUnitGeneral.getUnitCode();
	}

	/**
	* Sets the unit code of this dm unit general.
	*
	* @param unitCode the unit code of this dm unit general
	*/
	public void setUnitCode(java.lang.String unitCode) {
		_dmUnitGeneral.setUnitCode(unitCode);
	}

	/**
	* Returns the unit name of this dm unit general.
	*
	* @return the unit name of this dm unit general
	*/
	public java.lang.String getUnitName() {
		return _dmUnitGeneral.getUnitName();
	}

	/**
	* Sets the unit name of this dm unit general.
	*
	* @param unitName the unit name of this dm unit general
	*/
	public void setUnitName(java.lang.String unitName) {
		_dmUnitGeneral.setUnitName(unitName);
	}

	/**
	* Returns the is delete of this dm unit general.
	*
	* @return the is delete of this dm unit general
	*/
	public int getIsDelete() {
		return _dmUnitGeneral.getIsDelete();
	}

	/**
	* Sets the is delete of this dm unit general.
	*
	* @param isDelete the is delete of this dm unit general
	*/
	public void setIsDelete(int isDelete) {
		_dmUnitGeneral.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm unit general.
	*
	* @return the marked as delete of this dm unit general
	*/
	public int getMarkedAsDelete() {
		return _dmUnitGeneral.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm unit general.
	*
	* @param markedAsDelete the marked as delete of this dm unit general
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmUnitGeneral.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm unit general.
	*
	* @return the modified date of this dm unit general
	*/
	public java.util.Date getModifiedDate() {
		return _dmUnitGeneral.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm unit general.
	*
	* @param modifiedDate the modified date of this dm unit general
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmUnitGeneral.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm unit general.
	*
	* @return the requested date of this dm unit general
	*/
	public java.util.Date getRequestedDate() {
		return _dmUnitGeneral.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm unit general.
	*
	* @param requestedDate the requested date of this dm unit general
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmUnitGeneral.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm unit general.
	*
	* @return the sync version of this dm unit general
	*/
	public java.lang.String getSyncVersion() {
		return _dmUnitGeneral.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm unit general.
	*
	* @param syncVersion the sync version of this dm unit general
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmUnitGeneral.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmUnitGeneral.isNew();
	}

	public void setNew(boolean n) {
		_dmUnitGeneral.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmUnitGeneral.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmUnitGeneral.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmUnitGeneral.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmUnitGeneral.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmUnitGeneral.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmUnitGeneral.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmUnitGeneral.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmUnitGeneralWrapper((DmUnitGeneral)_dmUnitGeneral.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmUnitGeneral dmUnitGeneral) {
		return _dmUnitGeneral.compareTo(dmUnitGeneral);
	}

	@Override
	public int hashCode() {
		return _dmUnitGeneral.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmUnitGeneral> toCacheModel() {
		return _dmUnitGeneral.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmUnitGeneral toEscapedModel() {
		return new DmUnitGeneralWrapper(_dmUnitGeneral.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmUnitGeneral.toString();
	}

	public java.lang.String toXmlString() {
		return _dmUnitGeneral.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmUnitGeneral.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmUnitGeneral getWrappedDmUnitGeneral() {
		return _dmUnitGeneral;
	}

	public DmUnitGeneral getWrappedModel() {
		return _dmUnitGeneral;
	}

	public void resetOriginalValues() {
		_dmUnitGeneral.resetOriginalValues();
	}

	private DmUnitGeneral _dmUnitGeneral;
}