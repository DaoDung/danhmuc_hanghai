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
 * This class is a wrapper for {@link DmState}.
 * </p>
 *
 * @author    win_64
 * @see       DmState
 * @generated
 */
public class DmStateWrapper implements DmState, ModelWrapper<DmState> {
	public DmStateWrapper(DmState dmState) {
		_dmState = dmState;
	}

	public Class<?> getModelClass() {
		return DmState.class;
	}

	public String getModelClassName() {
		return DmState.class.getName();
	}

	/**
	* Returns the primary key of this dm state.
	*
	* @return the primary key of this dm state
	*/
	public int getPrimaryKey() {
		return _dmState.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm state.
	*
	* @param primaryKey the primary key of this dm state
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmState.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm state.
	*
	* @return the ID of this dm state
	*/
	public int getId() {
		return _dmState.getId();
	}

	/**
	* Sets the ID of this dm state.
	*
	* @param id the ID of this dm state
	*/
	public void setId(int id) {
		_dmState.setId(id);
	}

	/**
	* Returns the state code of this dm state.
	*
	* @return the state code of this dm state
	*/
	public java.lang.String getStateCode() {
		return _dmState.getStateCode();
	}

	/**
	* Sets the state code of this dm state.
	*
	* @param stateCode the state code of this dm state
	*/
	public void setStateCode(java.lang.String stateCode) {
		_dmState.setStateCode(stateCode);
	}

	/**
	* Returns the state name of this dm state.
	*
	* @return the state name of this dm state
	*/
	public java.lang.String getStateName() {
		return _dmState.getStateName();
	}

	/**
	* Sets the state name of this dm state.
	*
	* @param stateName the state name of this dm state
	*/
	public void setStateName(java.lang.String stateName) {
		_dmState.setStateName(stateName);
	}

	/**
	* Returns the description of this dm state.
	*
	* @return the description of this dm state
	*/
	public java.lang.String getDescription() {
		return _dmState.getDescription();
	}

	/**
	* Sets the description of this dm state.
	*
	* @param description the description of this dm state
	*/
	public void setDescription(java.lang.String description) {
		_dmState.setDescription(description);
	}

	/**
	* Returns the is delete of this dm state.
	*
	* @return the is delete of this dm state
	*/
	public int getIsDelete() {
		return _dmState.getIsDelete();
	}

	/**
	* Sets the is delete of this dm state.
	*
	* @param isDelete the is delete of this dm state
	*/
	public void setIsDelete(int isDelete) {
		_dmState.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm state.
	*
	* @return the marked as delete of this dm state
	*/
	public int getMarkedAsDelete() {
		return _dmState.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm state.
	*
	* @param markedAsDelete the marked as delete of this dm state
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmState.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm state.
	*
	* @return the modified date of this dm state
	*/
	public java.util.Date getModifiedDate() {
		return _dmState.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm state.
	*
	* @param modifiedDate the modified date of this dm state
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmState.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm state.
	*
	* @return the requested date of this dm state
	*/
	public java.util.Date getRequestedDate() {
		return _dmState.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm state.
	*
	* @param requestedDate the requested date of this dm state
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmState.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm state.
	*
	* @return the sync version of this dm state
	*/
	public java.lang.String getSyncVersion() {
		return _dmState.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm state.
	*
	* @param syncVersion the sync version of this dm state
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmState.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmState.isNew();
	}

	public void setNew(boolean n) {
		_dmState.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmState.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmState.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmState.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmState.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmState.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmState.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmState.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmStateWrapper((DmState)_dmState.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmState dmState) {
		return _dmState.compareTo(dmState);
	}

	@Override
	public int hashCode() {
		return _dmState.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmState> toCacheModel() {
		return _dmState.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmState toEscapedModel() {
		return new DmStateWrapper(_dmState.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmState.toString();
	}

	public java.lang.String toXmlString() {
		return _dmState.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmState.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmState getWrappedDmState() {
		return _dmState;
	}

	public DmState getWrappedModel() {
		return _dmState;
	}

	public void resetOriginalValues() {
		_dmState.resetOriginalValues();
	}

	private DmState _dmState;
}