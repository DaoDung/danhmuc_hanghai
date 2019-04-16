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
 * This class is a wrapper for {@link DmHistoryMaritime}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryMaritime
 * @generated
 */
public class DmHistoryMaritimeWrapper implements DmHistoryMaritime,
	ModelWrapper<DmHistoryMaritime> {
	public DmHistoryMaritimeWrapper(DmHistoryMaritime dmHistoryMaritime) {
		_dmHistoryMaritime = dmHistoryMaritime;
	}

	public Class<?> getModelClass() {
		return DmHistoryMaritime.class;
	}

	public String getModelClassName() {
		return DmHistoryMaritime.class.getName();
	}

	/**
	* Returns the primary key of this dm history maritime.
	*
	* @return the primary key of this dm history maritime
	*/
	public int getPrimaryKey() {
		return _dmHistoryMaritime.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history maritime.
	*
	* @param primaryKey the primary key of this dm history maritime
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryMaritime.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history maritime.
	*
	* @return the ID of this dm history maritime
	*/
	public int getId() {
		return _dmHistoryMaritime.getId();
	}

	/**
	* Sets the ID of this dm history maritime.
	*
	* @param id the ID of this dm history maritime
	*/
	public void setId(int id) {
		_dmHistoryMaritime.setId(id);
	}

	/**
	* Returns the maritime code of this dm history maritime.
	*
	* @return the maritime code of this dm history maritime
	*/
	public java.lang.String getMaritimeCode() {
		return _dmHistoryMaritime.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this dm history maritime.
	*
	* @param maritimeCode the maritime code of this dm history maritime
	*/
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_dmHistoryMaritime.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the maritime reference of this dm history maritime.
	*
	* @return the maritime reference of this dm history maritime
	*/
	public java.lang.String getMaritimeReference() {
		return _dmHistoryMaritime.getMaritimeReference();
	}

	/**
	* Sets the maritime reference of this dm history maritime.
	*
	* @param maritimeReference the maritime reference of this dm history maritime
	*/
	public void setMaritimeReference(java.lang.String maritimeReference) {
		_dmHistoryMaritime.setMaritimeReference(maritimeReference);
	}

	/**
	* Returns the maritime order of this dm history maritime.
	*
	* @return the maritime order of this dm history maritime
	*/
	public int getMaritimeOrder() {
		return _dmHistoryMaritime.getMaritimeOrder();
	}

	/**
	* Sets the maritime order of this dm history maritime.
	*
	* @param maritimeOrder the maritime order of this dm history maritime
	*/
	public void setMaritimeOrder(int maritimeOrder) {
		_dmHistoryMaritime.setMaritimeOrder(maritimeOrder);
	}

	/**
	* Returns the maritime name of this dm history maritime.
	*
	* @return the maritime name of this dm history maritime
	*/
	public java.lang.String getMaritimeName() {
		return _dmHistoryMaritime.getMaritimeName();
	}

	/**
	* Sets the maritime name of this dm history maritime.
	*
	* @param maritimeName the maritime name of this dm history maritime
	*/
	public void setMaritimeName(java.lang.String maritimeName) {
		_dmHistoryMaritime.setMaritimeName(maritimeName);
	}

	/**
	* Returns the maritime name v n of this dm history maritime.
	*
	* @return the maritime name v n of this dm history maritime
	*/
	public java.lang.String getMaritimeNameVN() {
		return _dmHistoryMaritime.getMaritimeNameVN();
	}

	/**
	* Sets the maritime name v n of this dm history maritime.
	*
	* @param maritimeNameVN the maritime name v n of this dm history maritime
	*/
	public void setMaritimeNameVN(java.lang.String maritimeNameVN) {
		_dmHistoryMaritime.setMaritimeNameVN(maritimeNameVN);
	}

	/**
	* Returns the address of this dm history maritime.
	*
	* @return the address of this dm history maritime
	*/
	public java.lang.String getAddress() {
		return _dmHistoryMaritime.getAddress();
	}

	/**
	* Sets the address of this dm history maritime.
	*
	* @param address the address of this dm history maritime
	*/
	public void setAddress(java.lang.String address) {
		_dmHistoryMaritime.setAddress(address);
	}

	/**
	* Returns the address v n of this dm history maritime.
	*
	* @return the address v n of this dm history maritime
	*/
	public java.lang.String getAddressVN() {
		return _dmHistoryMaritime.getAddressVN();
	}

	/**
	* Sets the address v n of this dm history maritime.
	*
	* @param addressVN the address v n of this dm history maritime
	*/
	public void setAddressVN(java.lang.String addressVN) {
		_dmHistoryMaritime.setAddressVN(addressVN);
	}

	/**
	* Returns the state code of this dm history maritime.
	*
	* @return the state code of this dm history maritime
	*/
	public java.lang.String getStateCode() {
		return _dmHistoryMaritime.getStateCode();
	}

	/**
	* Sets the state code of this dm history maritime.
	*
	* @param stateCode the state code of this dm history maritime
	*/
	public void setStateCode(java.lang.String stateCode) {
		_dmHistoryMaritime.setStateCode(stateCode);
	}

	/**
	* Returns the citycode of this dm history maritime.
	*
	* @return the citycode of this dm history maritime
	*/
	public java.lang.String getCitycode() {
		return _dmHistoryMaritime.getCitycode();
	}

	/**
	* Sets the citycode of this dm history maritime.
	*
	* @param citycode the citycode of this dm history maritime
	*/
	public void setCitycode(java.lang.String citycode) {
		_dmHistoryMaritime.setCitycode(citycode);
	}

	/**
	* Returns the is delete of this dm history maritime.
	*
	* @return the is delete of this dm history maritime
	*/
	public int getIsDelete() {
		return _dmHistoryMaritime.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history maritime.
	*
	* @param isDelete the is delete of this dm history maritime
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryMaritime.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history maritime.
	*
	* @return the marked as delete of this dm history maritime
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryMaritime.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history maritime.
	*
	* @param markedAsDelete the marked as delete of this dm history maritime
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryMaritime.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history maritime.
	*
	* @return the modified date of this dm history maritime
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryMaritime.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history maritime.
	*
	* @param modifiedDate the modified date of this dm history maritime
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryMaritime.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history maritime.
	*
	* @return the requested date of this dm history maritime
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryMaritime.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history maritime.
	*
	* @param requestedDate the requested date of this dm history maritime
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryMaritime.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history maritime.
	*
	* @return the sync version of this dm history maritime
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryMaritime.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history maritime.
	*
	* @param syncVersion the sync version of this dm history maritime
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryMaritime.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryMaritime.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryMaritime.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryMaritime.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryMaritime.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryMaritime.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryMaritime.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryMaritime.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryMaritime.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryMaritime.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryMaritimeWrapper((DmHistoryMaritime)_dmHistoryMaritime.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime) {
		return _dmHistoryMaritime.compareTo(dmHistoryMaritime);
	}

	@Override
	public int hashCode() {
		return _dmHistoryMaritime.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryMaritime> toCacheModel() {
		return _dmHistoryMaritime.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryMaritime toEscapedModel() {
		return new DmHistoryMaritimeWrapper(_dmHistoryMaritime.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryMaritime.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryMaritime.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryMaritime.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryMaritime getWrappedDmHistoryMaritime() {
		return _dmHistoryMaritime;
	}

	public DmHistoryMaritime getWrappedModel() {
		return _dmHistoryMaritime;
	}

	public void resetOriginalValues() {
		_dmHistoryMaritime.resetOriginalValues();
	}

	private DmHistoryMaritime _dmHistoryMaritime;
}