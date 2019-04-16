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
 * This class is a wrapper for {@link DmPortRegion}.
 * </p>
 *
 * @author    win_64
 * @see       DmPortRegion
 * @generated
 */
public class DmPortRegionWrapper implements DmPortRegion,
	ModelWrapper<DmPortRegion> {
	public DmPortRegionWrapper(DmPortRegion dmPortRegion) {
		_dmPortRegion = dmPortRegion;
	}

	public Class<?> getModelClass() {
		return DmPortRegion.class;
	}

	public String getModelClassName() {
		return DmPortRegion.class.getName();
	}

	/**
	* Returns the primary key of this dm port region.
	*
	* @return the primary key of this dm port region
	*/
	public int getPrimaryKey() {
		return _dmPortRegion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm port region.
	*
	* @param primaryKey the primary key of this dm port region
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmPortRegion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm port region.
	*
	* @return the ID of this dm port region
	*/
	public int getId() {
		return _dmPortRegion.getId();
	}

	/**
	* Sets the ID of this dm port region.
	*
	* @param id the ID of this dm port region
	*/
	public void setId(int id) {
		_dmPortRegion.setId(id);
	}

	/**
	* Returns the port region code of this dm port region.
	*
	* @return the port region code of this dm port region
	*/
	public java.lang.String getPortRegionCode() {
		return _dmPortRegion.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm port region.
	*
	* @param portRegionCode the port region code of this dm port region
	*/
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmPortRegion.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the port region name of this dm port region.
	*
	* @return the port region name of this dm port region
	*/
	public java.lang.String getPortRegionName() {
		return _dmPortRegion.getPortRegionName();
	}

	/**
	* Sets the port region name of this dm port region.
	*
	* @param portRegionName the port region name of this dm port region
	*/
	public void setPortRegionName(java.lang.String portRegionName) {
		_dmPortRegion.setPortRegionName(portRegionName);
	}

	/**
	* Returns the port region name v n of this dm port region.
	*
	* @return the port region name v n of this dm port region
	*/
	public java.lang.String getPortRegionNameVN() {
		return _dmPortRegion.getPortRegionNameVN();
	}

	/**
	* Sets the port region name v n of this dm port region.
	*
	* @param portRegionNameVN the port region name v n of this dm port region
	*/
	public void setPortRegionNameVN(java.lang.String portRegionNameVN) {
		_dmPortRegion.setPortRegionNameVN(portRegionNameVN);
	}

	/**
	* Returns the port region ref of this dm port region.
	*
	* @return the port region ref of this dm port region
	*/
	public java.lang.String getPortRegionRef() {
		return _dmPortRegion.getPortRegionRef();
	}

	/**
	* Sets the port region ref of this dm port region.
	*
	* @param portRegionRef the port region ref of this dm port region
	*/
	public void setPortRegionRef(java.lang.String portRegionRef) {
		_dmPortRegion.setPortRegionRef(portRegionRef);
	}

	/**
	* Returns the port code of this dm port region.
	*
	* @return the port code of this dm port region
	*/
	public java.lang.String getPortCode() {
		return _dmPortRegion.getPortCode();
	}

	/**
	* Sets the port code of this dm port region.
	*
	* @param portCode the port code of this dm port region
	*/
	public void setPortCode(java.lang.String portCode) {
		_dmPortRegion.setPortCode(portCode);
	}

	/**
	* Returns the is delete of this dm port region.
	*
	* @return the is delete of this dm port region
	*/
	public int getIsDelete() {
		return _dmPortRegion.getIsDelete();
	}

	/**
	* Sets the is delete of this dm port region.
	*
	* @param isDelete the is delete of this dm port region
	*/
	public void setIsDelete(int isDelete) {
		_dmPortRegion.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm port region.
	*
	* @return the marked as delete of this dm port region
	*/
	public int getMarkedAsDelete() {
		return _dmPortRegion.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm port region.
	*
	* @param markedAsDelete the marked as delete of this dm port region
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPortRegion.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm port region.
	*
	* @return the modified date of this dm port region
	*/
	public java.util.Date getModifiedDate() {
		return _dmPortRegion.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm port region.
	*
	* @param modifiedDate the modified date of this dm port region
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPortRegion.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm port region.
	*
	* @return the requested date of this dm port region
	*/
	public java.util.Date getRequestedDate() {
		return _dmPortRegion.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm port region.
	*
	* @param requestedDate the requested date of this dm port region
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPortRegion.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm port region.
	*
	* @return the sync version of this dm port region
	*/
	public java.lang.String getSyncVersion() {
		return _dmPortRegion.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm port region.
	*
	* @param syncVersion the sync version of this dm port region
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPortRegion.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmPortRegion.isNew();
	}

	public void setNew(boolean n) {
		_dmPortRegion.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmPortRegion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmPortRegion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmPortRegion.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPortRegion.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPortRegion.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPortRegion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPortRegion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPortRegionWrapper((DmPortRegion)_dmPortRegion.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion) {
		return _dmPortRegion.compareTo(dmPortRegion);
	}

	@Override
	public int hashCode() {
		return _dmPortRegion.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmPortRegion> toCacheModel() {
		return _dmPortRegion.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion toEscapedModel() {
		return new DmPortRegionWrapper(_dmPortRegion.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPortRegion.toString();
	}

	public java.lang.String toXmlString() {
		return _dmPortRegion.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPortRegion.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmPortRegion getWrappedDmPortRegion() {
		return _dmPortRegion;
	}

	public DmPortRegion getWrappedModel() {
		return _dmPortRegion;
	}

	public void resetOriginalValues() {
		_dmPortRegion.resetOriginalValues();
	}

	private DmPortRegion _dmPortRegion;
}