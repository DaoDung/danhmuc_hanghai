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
 * This class is a wrapper for {@link DmGtStatus}.
 * </p>
 *
 * @author    win_64
 * @see       DmGtStatus
 * @generated
 */
public class DmGtStatusWrapper implements DmGtStatus, ModelWrapper<DmGtStatus> {
	public DmGtStatusWrapper(DmGtStatus dmGtStatus) {
		_dmGtStatus = dmGtStatus;
	}

	public Class<?> getModelClass() {
		return DmGtStatus.class;
	}

	public String getModelClassName() {
		return DmGtStatus.class.getName();
	}

	/**
	* Returns the primary key of this dm gt status.
	*
	* @return the primary key of this dm gt status
	*/
	public long getPrimaryKey() {
		return _dmGtStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt status.
	*
	* @param primaryKey the primary key of this dm gt status
	*/
	public void setPrimaryKey(long primaryKey) {
		_dmGtStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt status.
	*
	* @return the ID of this dm gt status
	*/
	public long getId() {
		return _dmGtStatus.getId();
	}

	/**
	* Sets the ID of this dm gt status.
	*
	* @param id the ID of this dm gt status
	*/
	public void setId(long id) {
		_dmGtStatus.setId(id);
	}

	/**
	* Returns the status code of this dm gt status.
	*
	* @return the status code of this dm gt status
	*/
	public int getStatusCode() {
		return _dmGtStatus.getStatusCode();
	}

	/**
	* Sets the status code of this dm gt status.
	*
	* @param statusCode the status code of this dm gt status
	*/
	public void setStatusCode(int statusCode) {
		_dmGtStatus.setStatusCode(statusCode);
	}

	/**
	* Returns the status name of this dm gt status.
	*
	* @return the status name of this dm gt status
	*/
	public java.lang.String getStatusName() {
		return _dmGtStatus.getStatusName();
	}

	/**
	* Sets the status name of this dm gt status.
	*
	* @param statusName the status name of this dm gt status
	*/
	public void setStatusName(java.lang.String statusName) {
		_dmGtStatus.setStatusName(statusName);
	}

	/**
	* Returns the type of this dm gt status.
	*
	* @return the type of this dm gt status
	*/
	public int getType() {
		return _dmGtStatus.getType();
	}

	/**
	* Sets the type of this dm gt status.
	*
	* @param type the type of this dm gt status
	*/
	public void setType(int type) {
		_dmGtStatus.setType(type);
	}

	/**
	* Returns the description of this dm gt status.
	*
	* @return the description of this dm gt status
	*/
	public java.lang.String getDescription() {
		return _dmGtStatus.getDescription();
	}

	/**
	* Sets the description of this dm gt status.
	*
	* @param description the description of this dm gt status
	*/
	public void setDescription(java.lang.String description) {
		_dmGtStatus.setDescription(description);
	}

	/**
	* Returns the is delete of this dm gt status.
	*
	* @return the is delete of this dm gt status
	*/
	public int getIsDelete() {
		return _dmGtStatus.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt status.
	*
	* @param isDelete the is delete of this dm gt status
	*/
	public void setIsDelete(int isDelete) {
		_dmGtStatus.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt status.
	*
	* @return the marked as delete of this dm gt status
	*/
	public int getMarkedAsDelete() {
		return _dmGtStatus.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt status.
	*
	* @param markedAsDelete the marked as delete of this dm gt status
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtStatus.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt status.
	*
	* @return the modified date of this dm gt status
	*/
	public java.util.Date getModifiedDate() {
		return _dmGtStatus.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt status.
	*
	* @param modifiedDate the modified date of this dm gt status
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtStatus.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt status.
	*
	* @return the requested date of this dm gt status
	*/
	public java.util.Date getRequestedDate() {
		return _dmGtStatus.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt status.
	*
	* @param requestedDate the requested date of this dm gt status
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtStatus.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt status.
	*
	* @return the sync version of this dm gt status
	*/
	public java.lang.String getSyncVersion() {
		return _dmGtStatus.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt status.
	*
	* @param syncVersion the sync version of this dm gt status
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtStatus.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmGtStatus.isNew();
	}

	public void setNew(boolean n) {
		_dmGtStatus.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmGtStatus.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmGtStatus.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmGtStatus.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtStatus.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtStatus.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtStatusWrapper((DmGtStatus)_dmGtStatus.clone());
	}

	public int compareTo(vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus) {
		return _dmGtStatus.compareTo(dmGtStatus);
	}

	@Override
	public int hashCode() {
		return _dmGtStatus.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmucgt.model.DmGtStatus> toCacheModel() {
		return _dmGtStatus.toCacheModel();
	}

	public vn.gt.dao.danhmucgt.model.DmGtStatus toEscapedModel() {
		return new DmGtStatusWrapper(_dmGtStatus.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtStatus.toString();
	}

	public java.lang.String toXmlString() {
		return _dmGtStatus.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtStatus.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmGtStatus getWrappedDmGtStatus() {
		return _dmGtStatus;
	}

	public DmGtStatus getWrappedModel() {
		return _dmGtStatus;
	}

	public void resetOriginalValues() {
		_dmGtStatus.resetOriginalValues();
	}

	private DmGtStatus _dmGtStatus;
}