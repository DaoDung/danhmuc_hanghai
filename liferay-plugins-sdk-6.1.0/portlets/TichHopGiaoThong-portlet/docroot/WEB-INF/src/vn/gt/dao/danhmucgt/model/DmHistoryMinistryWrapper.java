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
 * This class is a wrapper for {@link DmHistoryMinistry}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryMinistry
 * @generated
 */
public class DmHistoryMinistryWrapper implements DmHistoryMinistry,
	ModelWrapper<DmHistoryMinistry> {
	public DmHistoryMinistryWrapper(DmHistoryMinistry dmHistoryMinistry) {
		_dmHistoryMinistry = dmHistoryMinistry;
	}

	public Class<?> getModelClass() {
		return DmHistoryMinistry.class;
	}

	public String getModelClassName() {
		return DmHistoryMinistry.class.getName();
	}

	/**
	* Returns the primary key of this dm history ministry.
	*
	* @return the primary key of this dm history ministry
	*/
	public long getPrimaryKey() {
		return _dmHistoryMinistry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history ministry.
	*
	* @param primaryKey the primary key of this dm history ministry
	*/
	public void setPrimaryKey(long primaryKey) {
		_dmHistoryMinistry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history ministry.
	*
	* @return the ID of this dm history ministry
	*/
	public long getId() {
		return _dmHistoryMinistry.getId();
	}

	/**
	* Sets the ID of this dm history ministry.
	*
	* @param id the ID of this dm history ministry
	*/
	public void setId(long id) {
		_dmHistoryMinistry.setId(id);
	}

	/**
	* Returns the ministry code of this dm history ministry.
	*
	* @return the ministry code of this dm history ministry
	*/
	public java.lang.String getMinistryCode() {
		return _dmHistoryMinistry.getMinistryCode();
	}

	/**
	* Sets the ministry code of this dm history ministry.
	*
	* @param ministryCode the ministry code of this dm history ministry
	*/
	public void setMinistryCode(java.lang.String ministryCode) {
		_dmHistoryMinistry.setMinistryCode(ministryCode);
	}

	/**
	* Returns the ministry name of this dm history ministry.
	*
	* @return the ministry name of this dm history ministry
	*/
	public java.lang.String getMinistryName() {
		return _dmHistoryMinistry.getMinistryName();
	}

	/**
	* Sets the ministry name of this dm history ministry.
	*
	* @param ministryName the ministry name of this dm history ministry
	*/
	public void setMinistryName(java.lang.String ministryName) {
		_dmHistoryMinistry.setMinistryName(ministryName);
	}

	/**
	* Returns the ministry name v n of this dm history ministry.
	*
	* @return the ministry name v n of this dm history ministry
	*/
	public java.lang.String getMinistryNameVN() {
		return _dmHistoryMinistry.getMinistryNameVN();
	}

	/**
	* Sets the ministry name v n of this dm history ministry.
	*
	* @param ministryNameVN the ministry name v n of this dm history ministry
	*/
	public void setMinistryNameVN(java.lang.String ministryNameVN) {
		_dmHistoryMinistry.setMinistryNameVN(ministryNameVN);
	}

	/**
	* Returns the ministry order of this dm history ministry.
	*
	* @return the ministry order of this dm history ministry
	*/
	public int getMinistryOrder() {
		return _dmHistoryMinistry.getMinistryOrder();
	}

	/**
	* Sets the ministry order of this dm history ministry.
	*
	* @param ministryOrder the ministry order of this dm history ministry
	*/
	public void setMinistryOrder(int ministryOrder) {
		_dmHistoryMinistry.setMinistryOrder(ministryOrder);
	}

	/**
	* Returns the is delete of this dm history ministry.
	*
	* @return the is delete of this dm history ministry
	*/
	public int getIsDelete() {
		return _dmHistoryMinistry.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history ministry.
	*
	* @param isDelete the is delete of this dm history ministry
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryMinistry.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history ministry.
	*
	* @return the marked as delete of this dm history ministry
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryMinistry.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history ministry.
	*
	* @param markedAsDelete the marked as delete of this dm history ministry
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryMinistry.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history ministry.
	*
	* @return the modified date of this dm history ministry
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryMinistry.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history ministry.
	*
	* @param modifiedDate the modified date of this dm history ministry
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryMinistry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history ministry.
	*
	* @return the requested date of this dm history ministry
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryMinistry.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history ministry.
	*
	* @param requestedDate the requested date of this dm history ministry
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryMinistry.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history ministry.
	*
	* @return the sync version of this dm history ministry
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryMinistry.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history ministry.
	*
	* @param syncVersion the sync version of this dm history ministry
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryMinistry.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryMinistry.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryMinistry.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryMinistry.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryMinistry.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryMinistry.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryMinistry.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryMinistry.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryMinistry.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryMinistry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryMinistryWrapper((DmHistoryMinistry)_dmHistoryMinistry.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmucgt.model.DmHistoryMinistry dmHistoryMinistry) {
		return _dmHistoryMinistry.compareTo(dmHistoryMinistry);
	}

	@Override
	public int hashCode() {
		return _dmHistoryMinistry.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmucgt.model.DmHistoryMinistry> toCacheModel() {
		return _dmHistoryMinistry.toCacheModel();
	}

	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry toEscapedModel() {
		return new DmHistoryMinistryWrapper(_dmHistoryMinistry.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryMinistry.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryMinistry.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryMinistry.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryMinistry getWrappedDmHistoryMinistry() {
		return _dmHistoryMinistry;
	}

	public DmHistoryMinistry getWrappedModel() {
		return _dmHistoryMinistry;
	}

	public void resetOriginalValues() {
		_dmHistoryMinistry.resetOriginalValues();
	}

	private DmHistoryMinistry _dmHistoryMinistry;
}