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
 * This class is a wrapper for {@link DmMaritime}.
 * </p>
 *
 * @author    win_64
 * @see       DmMaritime
 * @generated
 */
public class DmMaritimeWrapper implements DmMaritime, ModelWrapper<DmMaritime> {
	public DmMaritimeWrapper(DmMaritime dmMaritime) {
		_dmMaritime = dmMaritime;
	}

	public Class<?> getModelClass() {
		return DmMaritime.class;
	}

	public String getModelClassName() {
		return DmMaritime.class.getName();
	}

	/**
	* Returns the primary key of this dm maritime.
	*
	* @return the primary key of this dm maritime
	*/
	public int getPrimaryKey() {
		return _dmMaritime.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm maritime.
	*
	* @param primaryKey the primary key of this dm maritime
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmMaritime.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm maritime.
	*
	* @return the ID of this dm maritime
	*/
	public int getId() {
		return _dmMaritime.getId();
	}

	/**
	* Sets the ID of this dm maritime.
	*
	* @param id the ID of this dm maritime
	*/
	public void setId(int id) {
		_dmMaritime.setId(id);
	}

	/**
	* Returns the maritime code of this dm maritime.
	*
	* @return the maritime code of this dm maritime
	*/
	public java.lang.String getMaritimeCode() {
		return _dmMaritime.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this dm maritime.
	*
	* @param maritimeCode the maritime code of this dm maritime
	*/
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_dmMaritime.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the maritime reference of this dm maritime.
	*
	* @return the maritime reference of this dm maritime
	*/
	public java.lang.String getMaritimeReference() {
		return _dmMaritime.getMaritimeReference();
	}

	/**
	* Sets the maritime reference of this dm maritime.
	*
	* @param maritimeReference the maritime reference of this dm maritime
	*/
	public void setMaritimeReference(java.lang.String maritimeReference) {
		_dmMaritime.setMaritimeReference(maritimeReference);
	}

	/**
	* Returns the maritime order of this dm maritime.
	*
	* @return the maritime order of this dm maritime
	*/
	public int getMaritimeOrder() {
		return _dmMaritime.getMaritimeOrder();
	}

	/**
	* Sets the maritime order of this dm maritime.
	*
	* @param maritimeOrder the maritime order of this dm maritime
	*/
	public void setMaritimeOrder(int maritimeOrder) {
		_dmMaritime.setMaritimeOrder(maritimeOrder);
	}

	/**
	* Returns the maritime name of this dm maritime.
	*
	* @return the maritime name of this dm maritime
	*/
	public java.lang.String getMaritimeName() {
		return _dmMaritime.getMaritimeName();
	}

	/**
	* Sets the maritime name of this dm maritime.
	*
	* @param maritimeName the maritime name of this dm maritime
	*/
	public void setMaritimeName(java.lang.String maritimeName) {
		_dmMaritime.setMaritimeName(maritimeName);
	}

	/**
	* Returns the maritime name v n of this dm maritime.
	*
	* @return the maritime name v n of this dm maritime
	*/
	public java.lang.String getMaritimeNameVN() {
		return _dmMaritime.getMaritimeNameVN();
	}

	/**
	* Sets the maritime name v n of this dm maritime.
	*
	* @param maritimeNameVN the maritime name v n of this dm maritime
	*/
	public void setMaritimeNameVN(java.lang.String maritimeNameVN) {
		_dmMaritime.setMaritimeNameVN(maritimeNameVN);
	}

	/**
	* Returns the address of this dm maritime.
	*
	* @return the address of this dm maritime
	*/
	public java.lang.String getAddress() {
		return _dmMaritime.getAddress();
	}

	/**
	* Sets the address of this dm maritime.
	*
	* @param address the address of this dm maritime
	*/
	public void setAddress(java.lang.String address) {
		_dmMaritime.setAddress(address);
	}

	/**
	* Returns the address v n of this dm maritime.
	*
	* @return the address v n of this dm maritime
	*/
	public java.lang.String getAddressVN() {
		return _dmMaritime.getAddressVN();
	}

	/**
	* Sets the address v n of this dm maritime.
	*
	* @param addressVN the address v n of this dm maritime
	*/
	public void setAddressVN(java.lang.String addressVN) {
		_dmMaritime.setAddressVN(addressVN);
	}

	/**
	* Returns the state code of this dm maritime.
	*
	* @return the state code of this dm maritime
	*/
	public java.lang.String getStateCode() {
		return _dmMaritime.getStateCode();
	}

	/**
	* Sets the state code of this dm maritime.
	*
	* @param stateCode the state code of this dm maritime
	*/
	public void setStateCode(java.lang.String stateCode) {
		_dmMaritime.setStateCode(stateCode);
	}

	/**
	* Returns the citycode of this dm maritime.
	*
	* @return the citycode of this dm maritime
	*/
	public java.lang.String getCitycode() {
		return _dmMaritime.getCitycode();
	}

	/**
	* Sets the citycode of this dm maritime.
	*
	* @param citycode the citycode of this dm maritime
	*/
	public void setCitycode(java.lang.String citycode) {
		_dmMaritime.setCitycode(citycode);
	}

	/**
	* Returns the is delete of this dm maritime.
	*
	* @return the is delete of this dm maritime
	*/
	public int getIsDelete() {
		return _dmMaritime.getIsDelete();
	}

	/**
	* Sets the is delete of this dm maritime.
	*
	* @param isDelete the is delete of this dm maritime
	*/
	public void setIsDelete(int isDelete) {
		_dmMaritime.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm maritime.
	*
	* @return the marked as delete of this dm maritime
	*/
	public int getMarkedAsDelete() {
		return _dmMaritime.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm maritime.
	*
	* @param markedAsDelete the marked as delete of this dm maritime
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmMaritime.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm maritime.
	*
	* @return the modified date of this dm maritime
	*/
	public java.util.Date getModifiedDate() {
		return _dmMaritime.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm maritime.
	*
	* @param modifiedDate the modified date of this dm maritime
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmMaritime.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm maritime.
	*
	* @return the requested date of this dm maritime
	*/
	public java.util.Date getRequestedDate() {
		return _dmMaritime.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm maritime.
	*
	* @param requestedDate the requested date of this dm maritime
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmMaritime.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm maritime.
	*
	* @return the sync version of this dm maritime
	*/
	public java.lang.String getSyncVersion() {
		return _dmMaritime.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm maritime.
	*
	* @param syncVersion the sync version of this dm maritime
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmMaritime.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmMaritime.isNew();
	}

	public void setNew(boolean n) {
		_dmMaritime.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmMaritime.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmMaritime.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmMaritime.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmMaritime.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmMaritime.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmMaritime.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmMaritime.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmMaritimeWrapper((DmMaritime)_dmMaritime.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmMaritime dmMaritime) {
		return _dmMaritime.compareTo(dmMaritime);
	}

	@Override
	public int hashCode() {
		return _dmMaritime.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmMaritime> toCacheModel() {
		return _dmMaritime.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmMaritime toEscapedModel() {
		return new DmMaritimeWrapper(_dmMaritime.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmMaritime.toString();
	}

	public java.lang.String toXmlString() {
		return _dmMaritime.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmMaritime.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmMaritime getWrappedDmMaritime() {
		return _dmMaritime;
	}

	public DmMaritime getWrappedModel() {
		return _dmMaritime;
	}

	public void resetOriginalValues() {
		_dmMaritime.resetOriginalValues();
	}

	private DmMaritime _dmMaritime;
}