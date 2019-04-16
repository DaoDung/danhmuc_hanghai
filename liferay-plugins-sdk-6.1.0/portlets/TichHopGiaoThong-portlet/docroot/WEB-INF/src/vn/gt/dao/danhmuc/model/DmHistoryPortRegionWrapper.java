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
 * This class is a wrapper for {@link DmHistoryPortRegion}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryPortRegion
 * @generated
 */
public class DmHistoryPortRegionWrapper implements DmHistoryPortRegion,
	ModelWrapper<DmHistoryPortRegion> {
	public DmHistoryPortRegionWrapper(DmHistoryPortRegion dmHistoryPortRegion) {
		_dmHistoryPortRegion = dmHistoryPortRegion;
	}

	public Class<?> getModelClass() {
		return DmHistoryPortRegion.class;
	}

	public String getModelClassName() {
		return DmHistoryPortRegion.class.getName();
	}

	/**
	* Returns the primary key of this dm history port region.
	*
	* @return the primary key of this dm history port region
	*/
	public int getPrimaryKey() {
		return _dmHistoryPortRegion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history port region.
	*
	* @param primaryKey the primary key of this dm history port region
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPortRegion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history port region.
	*
	* @return the ID of this dm history port region
	*/
	public int getId() {
		return _dmHistoryPortRegion.getId();
	}

	/**
	* Sets the ID of this dm history port region.
	*
	* @param id the ID of this dm history port region
	*/
	public void setId(int id) {
		_dmHistoryPortRegion.setId(id);
	}

	/**
	* Returns the port region code of this dm history port region.
	*
	* @return the port region code of this dm history port region
	*/
	public java.lang.String getPortRegionCode() {
		return _dmHistoryPortRegion.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm history port region.
	*
	* @param portRegionCode the port region code of this dm history port region
	*/
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmHistoryPortRegion.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the port region name of this dm history port region.
	*
	* @return the port region name of this dm history port region
	*/
	public java.lang.String getPortRegionName() {
		return _dmHistoryPortRegion.getPortRegionName();
	}

	/**
	* Sets the port region name of this dm history port region.
	*
	* @param portRegionName the port region name of this dm history port region
	*/
	public void setPortRegionName(java.lang.String portRegionName) {
		_dmHistoryPortRegion.setPortRegionName(portRegionName);
	}

	/**
	* Returns the port region name v n of this dm history port region.
	*
	* @return the port region name v n of this dm history port region
	*/
	public java.lang.String getPortRegionNameVN() {
		return _dmHistoryPortRegion.getPortRegionNameVN();
	}

	/**
	* Sets the port region name v n of this dm history port region.
	*
	* @param portRegionNameVN the port region name v n of this dm history port region
	*/
	public void setPortRegionNameVN(java.lang.String portRegionNameVN) {
		_dmHistoryPortRegion.setPortRegionNameVN(portRegionNameVN);
	}

	/**
	* Returns the port region ref of this dm history port region.
	*
	* @return the port region ref of this dm history port region
	*/
	public java.lang.String getPortRegionRef() {
		return _dmHistoryPortRegion.getPortRegionRef();
	}

	/**
	* Sets the port region ref of this dm history port region.
	*
	* @param portRegionRef the port region ref of this dm history port region
	*/
	public void setPortRegionRef(java.lang.String portRegionRef) {
		_dmHistoryPortRegion.setPortRegionRef(portRegionRef);
	}

	/**
	* Returns the port code of this dm history port region.
	*
	* @return the port code of this dm history port region
	*/
	public java.lang.String getPortCode() {
		return _dmHistoryPortRegion.getPortCode();
	}

	/**
	* Sets the port code of this dm history port region.
	*
	* @param portCode the port code of this dm history port region
	*/
	public void setPortCode(java.lang.String portCode) {
		_dmHistoryPortRegion.setPortCode(portCode);
	}

	/**
	* Returns the is delete of this dm history port region.
	*
	* @return the is delete of this dm history port region
	*/
	public int getIsDelete() {
		return _dmHistoryPortRegion.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history port region.
	*
	* @param isDelete the is delete of this dm history port region
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryPortRegion.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history port region.
	*
	* @return the marked as delete of this dm history port region
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryPortRegion.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history port region.
	*
	* @param markedAsDelete the marked as delete of this dm history port region
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPortRegion.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history port region.
	*
	* @return the modified date of this dm history port region
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryPortRegion.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history port region.
	*
	* @param modifiedDate the modified date of this dm history port region
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPortRegion.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history port region.
	*
	* @return the requested date of this dm history port region
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryPortRegion.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history port region.
	*
	* @param requestedDate the requested date of this dm history port region
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPortRegion.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history port region.
	*
	* @return the sync version of this dm history port region
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryPortRegion.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history port region.
	*
	* @param syncVersion the sync version of this dm history port region
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPortRegion.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryPortRegion.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryPortRegion.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryPortRegion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPortRegion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryPortRegion.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPortRegion.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPortRegion.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPortRegion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPortRegion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPortRegionWrapper((DmHistoryPortRegion)_dmHistoryPortRegion.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmHistoryPortRegion dmHistoryPortRegion) {
		return _dmHistoryPortRegion.compareTo(dmHistoryPortRegion);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPortRegion.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> toCacheModel() {
		return _dmHistoryPortRegion.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion toEscapedModel() {
		return new DmHistoryPortRegionWrapper(_dmHistoryPortRegion.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPortRegion.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryPortRegion.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPortRegion.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryPortRegion getWrappedDmHistoryPortRegion() {
		return _dmHistoryPortRegion;
	}

	public DmHistoryPortRegion getWrappedModel() {
		return _dmHistoryPortRegion;
	}

	public void resetOriginalValues() {
		_dmHistoryPortRegion.resetOriginalValues();
	}

	private DmHistoryPortRegion _dmHistoryPortRegion;
}