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
 * This class is a wrapper for {@link DmHistoryState}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryState
 * @generated
 */
public class DmHistoryStateWrapper implements DmHistoryState,
	ModelWrapper<DmHistoryState> {
	public DmHistoryStateWrapper(DmHistoryState dmHistoryState) {
		_dmHistoryState = dmHistoryState;
	}

	public Class<?> getModelClass() {
		return DmHistoryState.class;
	}

	public String getModelClassName() {
		return DmHistoryState.class.getName();
	}

	/**
	* Returns the primary key of this dm history state.
	*
	* @return the primary key of this dm history state
	*/
	public int getPrimaryKey() {
		return _dmHistoryState.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history state.
	*
	* @param primaryKey the primary key of this dm history state
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryState.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history state.
	*
	* @return the ID of this dm history state
	*/
	public int getId() {
		return _dmHistoryState.getId();
	}

	/**
	* Sets the ID of this dm history state.
	*
	* @param id the ID of this dm history state
	*/
	public void setId(int id) {
		_dmHistoryState.setId(id);
	}

	/**
	* Returns the state code of this dm history state.
	*
	* @return the state code of this dm history state
	*/
	public java.lang.String getStateCode() {
		return _dmHistoryState.getStateCode();
	}

	/**
	* Sets the state code of this dm history state.
	*
	* @param stateCode the state code of this dm history state
	*/
	public void setStateCode(java.lang.String stateCode) {
		_dmHistoryState.setStateCode(stateCode);
	}

	/**
	* Returns the state name of this dm history state.
	*
	* @return the state name of this dm history state
	*/
	public java.lang.String getStateName() {
		return _dmHistoryState.getStateName();
	}

	/**
	* Sets the state name of this dm history state.
	*
	* @param stateName the state name of this dm history state
	*/
	public void setStateName(java.lang.String stateName) {
		_dmHistoryState.setStateName(stateName);
	}

	/**
	* Returns the description of this dm history state.
	*
	* @return the description of this dm history state
	*/
	public java.lang.String getDescription() {
		return _dmHistoryState.getDescription();
	}

	/**
	* Sets the description of this dm history state.
	*
	* @param description the description of this dm history state
	*/
	public void setDescription(java.lang.String description) {
		_dmHistoryState.setDescription(description);
	}

	/**
	* Returns the is delete of this dm history state.
	*
	* @return the is delete of this dm history state
	*/
	public int getIsDelete() {
		return _dmHistoryState.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history state.
	*
	* @param isDelete the is delete of this dm history state
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryState.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history state.
	*
	* @return the marked as delete of this dm history state
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryState.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history state.
	*
	* @param markedAsDelete the marked as delete of this dm history state
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryState.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history state.
	*
	* @return the modified date of this dm history state
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryState.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history state.
	*
	* @param modifiedDate the modified date of this dm history state
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryState.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history state.
	*
	* @return the requested date of this dm history state
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryState.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history state.
	*
	* @param requestedDate the requested date of this dm history state
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryState.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history state.
	*
	* @return the sync version of this dm history state
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryState.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history state.
	*
	* @param syncVersion the sync version of this dm history state
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryState.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryState.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryState.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryState.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryState.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryState.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryState.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryState.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryState.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryState.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryStateWrapper((DmHistoryState)_dmHistoryState.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmHistoryState dmHistoryState) {
		return _dmHistoryState.compareTo(dmHistoryState);
	}

	@Override
	public int hashCode() {
		return _dmHistoryState.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryState> toCacheModel() {
		return _dmHistoryState.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryState toEscapedModel() {
		return new DmHistoryStateWrapper(_dmHistoryState.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryState.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryState.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryState.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryState getWrappedDmHistoryState() {
		return _dmHistoryState;
	}

	public DmHistoryState getWrappedModel() {
		return _dmHistoryState;
	}

	public void resetOriginalValues() {
		_dmHistoryState.resetOriginalValues();
	}

	private DmHistoryState _dmHistoryState;
}