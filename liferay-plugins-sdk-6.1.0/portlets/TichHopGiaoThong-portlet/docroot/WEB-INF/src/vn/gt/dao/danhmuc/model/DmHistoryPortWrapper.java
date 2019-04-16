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
 * This class is a wrapper for {@link DmHistoryPort}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryPort
 * @generated
 */
public class DmHistoryPortWrapper implements DmHistoryPort,
	ModelWrapper<DmHistoryPort> {
	public DmHistoryPortWrapper(DmHistoryPort dmHistoryPort) {
		_dmHistoryPort = dmHistoryPort;
	}

	public Class<?> getModelClass() {
		return DmHistoryPort.class;
	}

	public String getModelClassName() {
		return DmHistoryPort.class.getName();
	}

	/**
	* Returns the primary key of this dm history port.
	*
	* @return the primary key of this dm history port
	*/
	public int getPrimaryKey() {
		return _dmHistoryPort.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history port.
	*
	* @param primaryKey the primary key of this dm history port
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPort.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history port.
	*
	* @return the ID of this dm history port
	*/
	public int getId() {
		return _dmHistoryPort.getId();
	}

	/**
	* Sets the ID of this dm history port.
	*
	* @param id the ID of this dm history port
	*/
	public void setId(int id) {
		_dmHistoryPort.setId(id);
	}

	/**
	* Returns the port code of this dm history port.
	*
	* @return the port code of this dm history port
	*/
	public java.lang.String getPortCode() {
		return _dmHistoryPort.getPortCode();
	}

	/**
	* Sets the port code of this dm history port.
	*
	* @param portCode the port code of this dm history port
	*/
	public void setPortCode(java.lang.String portCode) {
		_dmHistoryPort.setPortCode(portCode);
	}

	/**
	* Returns the lo code of this dm history port.
	*
	* @return the lo code of this dm history port
	*/
	public java.lang.String getLoCode() {
		return _dmHistoryPort.getLoCode();
	}

	/**
	* Sets the lo code of this dm history port.
	*
	* @param loCode the lo code of this dm history port
	*/
	public void setLoCode(java.lang.String loCode) {
		_dmHistoryPort.setLoCode(loCode);
	}

	/**
	* Returns the port name of this dm history port.
	*
	* @return the port name of this dm history port
	*/
	public java.lang.String getPortName() {
		return _dmHistoryPort.getPortName();
	}

	/**
	* Sets the port name of this dm history port.
	*
	* @param portName the port name of this dm history port
	*/
	public void setPortName(java.lang.String portName) {
		_dmHistoryPort.setPortName(portName);
	}

	/**
	* Returns the full name of this dm history port.
	*
	* @return the full name of this dm history port
	*/
	public java.lang.String getFullName() {
		return _dmHistoryPort.getFullName();
	}

	/**
	* Sets the full name of this dm history port.
	*
	* @param fullName the full name of this dm history port
	*/
	public void setFullName(java.lang.String fullName) {
		_dmHistoryPort.setFullName(fullName);
	}

	/**
	* Returns the full name v n of this dm history port.
	*
	* @return the full name v n of this dm history port
	*/
	public java.lang.String getFullNameVN() {
		return _dmHistoryPort.getFullNameVN();
	}

	/**
	* Sets the full name v n of this dm history port.
	*
	* @param fullNameVN the full name v n of this dm history port
	*/
	public void setFullNameVN(java.lang.String fullNameVN) {
		_dmHistoryPort.setFullNameVN(fullNameVN);
	}

	/**
	* Returns the port type of this dm history port.
	*
	* @return the port type of this dm history port
	*/
	public java.lang.String getPortType() {
		return _dmHistoryPort.getPortType();
	}

	/**
	* Sets the port type of this dm history port.
	*
	* @param portType the port type of this dm history port
	*/
	public void setPortType(java.lang.String portType) {
		_dmHistoryPort.setPortType(portType);
	}

	/**
	* Returns the port order of this dm history port.
	*
	* @return the port order of this dm history port
	*/
	public int getPortOrder() {
		return _dmHistoryPort.getPortOrder();
	}

	/**
	* Sets the port order of this dm history port.
	*
	* @param portOrder the port order of this dm history port
	*/
	public void setPortOrder(int portOrder) {
		_dmHistoryPort.setPortOrder(portOrder);
	}

	/**
	* Returns the address of this dm history port.
	*
	* @return the address of this dm history port
	*/
	public java.lang.String getAddress() {
		return _dmHistoryPort.getAddress();
	}

	/**
	* Sets the address of this dm history port.
	*
	* @param address the address of this dm history port
	*/
	public void setAddress(java.lang.String address) {
		_dmHistoryPort.setAddress(address);
	}

	/**
	* Returns the address v n of this dm history port.
	*
	* @return the address v n of this dm history port
	*/
	public java.lang.String getAddressVN() {
		return _dmHistoryPort.getAddressVN();
	}

	/**
	* Sets the address v n of this dm history port.
	*
	* @param addressVN the address v n of this dm history port
	*/
	public void setAddressVN(java.lang.String addressVN) {
		_dmHistoryPort.setAddressVN(addressVN);
	}

	/**
	* Returns the state code of this dm history port.
	*
	* @return the state code of this dm history port
	*/
	public java.lang.String getStateCode() {
		return _dmHistoryPort.getStateCode();
	}

	/**
	* Sets the state code of this dm history port.
	*
	* @param stateCode the state code of this dm history port
	*/
	public void setStateCode(java.lang.String stateCode) {
		_dmHistoryPort.setStateCode(stateCode);
	}

	/**
	* Returns the citycode of this dm history port.
	*
	* @return the citycode of this dm history port
	*/
	public java.lang.String getCitycode() {
		return _dmHistoryPort.getCitycode();
	}

	/**
	* Sets the citycode of this dm history port.
	*
	* @param citycode the citycode of this dm history port
	*/
	public void setCitycode(java.lang.String citycode) {
		_dmHistoryPort.setCitycode(citycode);
	}

	/**
	* Returns the is delete of this dm history port.
	*
	* @return the is delete of this dm history port
	*/
	public int getIsDelete() {
		return _dmHistoryPort.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history port.
	*
	* @param isDelete the is delete of this dm history port
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryPort.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history port.
	*
	* @return the marked as delete of this dm history port
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryPort.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history port.
	*
	* @param markedAsDelete the marked as delete of this dm history port
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPort.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history port.
	*
	* @return the modified date of this dm history port
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryPort.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history port.
	*
	* @param modifiedDate the modified date of this dm history port
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPort.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history port.
	*
	* @return the requested date of this dm history port
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryPort.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history port.
	*
	* @param requestedDate the requested date of this dm history port
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPort.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history port.
	*
	* @return the sync version of this dm history port
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryPort.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history port.
	*
	* @param syncVersion the sync version of this dm history port
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPort.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryPort.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryPort.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryPort.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPort.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryPort.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPort.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPort.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPort.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPort.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPortWrapper((DmHistoryPort)_dmHistoryPort.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmHistoryPort dmHistoryPort) {
		return _dmHistoryPort.compareTo(dmHistoryPort);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPort.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryPort> toCacheModel() {
		return _dmHistoryPort.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryPort toEscapedModel() {
		return new DmHistoryPortWrapper(_dmHistoryPort.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPort.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryPort.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPort.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryPort getWrappedDmHistoryPort() {
		return _dmHistoryPort;
	}

	public DmHistoryPort getWrappedModel() {
		return _dmHistoryPort;
	}

	public void resetOriginalValues() {
		_dmHistoryPort.resetOriginalValues();
	}

	private DmHistoryPort _dmHistoryPort;
}