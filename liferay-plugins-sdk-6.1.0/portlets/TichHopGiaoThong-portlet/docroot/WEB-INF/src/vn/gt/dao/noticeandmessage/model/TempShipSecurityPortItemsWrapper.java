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

package vn.gt.dao.noticeandmessage.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempShipSecurityPortItems}.
 * </p>
 *
 * @author    win_64
 * @see       TempShipSecurityPortItems
 * @generated
 */
public class TempShipSecurityPortItemsWrapper
	implements TempShipSecurityPortItems,
		ModelWrapper<TempShipSecurityPortItems> {
	public TempShipSecurityPortItemsWrapper(
		TempShipSecurityPortItems tempShipSecurityPortItems) {
		_tempShipSecurityPortItems = tempShipSecurityPortItems;
	}

	public Class<?> getModelClass() {
		return TempShipSecurityPortItems.class;
	}

	public String getModelClassName() {
		return TempShipSecurityPortItems.class.getName();
	}

	/**
	* Returns the primary key of this temp ship security port items.
	*
	* @return the primary key of this temp ship security port items
	*/
	public long getPrimaryKey() {
		return _tempShipSecurityPortItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp ship security port items.
	*
	* @param primaryKey the primary key of this temp ship security port items
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempShipSecurityPortItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp ship security port items.
	*
	* @return the ID of this temp ship security port items
	*/
	public long getId() {
		return _tempShipSecurityPortItems.getId();
	}

	/**
	* Sets the ID of this temp ship security port items.
	*
	* @param id the ID of this temp ship security port items
	*/
	public void setId(long id) {
		_tempShipSecurityPortItems.setId(id);
	}

	/**
	* Returns the request code of this temp ship security port items.
	*
	* @return the request code of this temp ship security port items
	*/
	public java.lang.String getRequestCode() {
		return _tempShipSecurityPortItems.getRequestCode();
	}

	/**
	* Sets the request code of this temp ship security port items.
	*
	* @param requestCode the request code of this temp ship security port items
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempShipSecurityPortItems.setRequestCode(requestCode);
	}

	/**
	* Returns the ship security port item code of this temp ship security port items.
	*
	* @return the ship security port item code of this temp ship security port items
	*/
	public java.lang.String getShipSecurityPortItemCode() {
		return _tempShipSecurityPortItems.getShipSecurityPortItemCode();
	}

	/**
	* Sets the ship security port item code of this temp ship security port items.
	*
	* @param shipSecurityPortItemCode the ship security port item code of this temp ship security port items
	*/
	public void setShipSecurityPortItemCode(
		java.lang.String shipSecurityPortItemCode) {
		_tempShipSecurityPortItems.setShipSecurityPortItemCode(shipSecurityPortItemCode);
	}

	/**
	* Returns the port code of this temp ship security port items.
	*
	* @return the port code of this temp ship security port items
	*/
	public java.lang.String getPortCode() {
		return _tempShipSecurityPortItems.getPortCode();
	}

	/**
	* Sets the port code of this temp ship security port items.
	*
	* @param portCode the port code of this temp ship security port items
	*/
	public void setPortCode(java.lang.String portCode) {
		_tempShipSecurityPortItems.setPortCode(portCode);
	}

	/**
	* Returns the date arrival of this temp ship security port items.
	*
	* @return the date arrival of this temp ship security port items
	*/
	public java.util.Date getDateArrival() {
		return _tempShipSecurityPortItems.getDateArrival();
	}

	/**
	* Sets the date arrival of this temp ship security port items.
	*
	* @param dateArrival the date arrival of this temp ship security port items
	*/
	public void setDateArrival(java.util.Date dateArrival) {
		_tempShipSecurityPortItems.setDateArrival(dateArrival);
	}

	/**
	* Returns the date departure of this temp ship security port items.
	*
	* @return the date departure of this temp ship security port items
	*/
	public java.util.Date getDateDeparture() {
		return _tempShipSecurityPortItems.getDateDeparture();
	}

	/**
	* Sets the date departure of this temp ship security port items.
	*
	* @param dateDeparture the date departure of this temp ship security port items
	*/
	public void setDateDeparture(java.util.Date dateDeparture) {
		_tempShipSecurityPortItems.setDateDeparture(dateDeparture);
	}

	/**
	* Returns the security level code of this temp ship security port items.
	*
	* @return the security level code of this temp ship security port items
	*/
	public java.lang.String getSecurityLevelCode() {
		return _tempShipSecurityPortItems.getSecurityLevelCode();
	}

	/**
	* Sets the security level code of this temp ship security port items.
	*
	* @param securityLevelCode the security level code of this temp ship security port items
	*/
	public void setSecurityLevelCode(java.lang.String securityLevelCode) {
		_tempShipSecurityPortItems.setSecurityLevelCode(securityLevelCode);
	}

	public boolean isNew() {
		return _tempShipSecurityPortItems.isNew();
	}

	public void setNew(boolean n) {
		_tempShipSecurityPortItems.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempShipSecurityPortItems.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempShipSecurityPortItems.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempShipSecurityPortItems.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempShipSecurityPortItems.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempShipSecurityPortItems.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempShipSecurityPortItems.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempShipSecurityPortItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempShipSecurityPortItemsWrapper((TempShipSecurityPortItems)_tempShipSecurityPortItems.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempShipSecurityPortItems tempShipSecurityPortItems) {
		return _tempShipSecurityPortItems.compareTo(tempShipSecurityPortItems);
	}

	@Override
	public int hashCode() {
		return _tempShipSecurityPortItems.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempShipSecurityPortItems> toCacheModel() {
		return _tempShipSecurityPortItems.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempShipSecurityPortItems toEscapedModel() {
		return new TempShipSecurityPortItemsWrapper(_tempShipSecurityPortItems.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempShipSecurityPortItems.toString();
	}

	public java.lang.String toXmlString() {
		return _tempShipSecurityPortItems.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempShipSecurityPortItems.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempShipSecurityPortItems getWrappedTempShipSecurityPortItems() {
		return _tempShipSecurityPortItems;
	}

	public TempShipSecurityPortItems getWrappedModel() {
		return _tempShipSecurityPortItems;
	}

	public void resetOriginalValues() {
		_tempShipSecurityPortItems.resetOriginalValues();
	}

	private TempShipSecurityPortItems _tempShipSecurityPortItems;
}