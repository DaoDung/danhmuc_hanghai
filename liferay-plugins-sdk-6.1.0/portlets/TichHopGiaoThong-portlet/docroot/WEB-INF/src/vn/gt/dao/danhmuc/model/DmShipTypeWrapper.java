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
 * This class is a wrapper for {@link DmShipType}.
 * </p>
 *
 * @author    win_64
 * @see       DmShipType
 * @generated
 */
public class DmShipTypeWrapper implements DmShipType, ModelWrapper<DmShipType> {
	public DmShipTypeWrapper(DmShipType dmShipType) {
		_dmShipType = dmShipType;
	}

	public Class<?> getModelClass() {
		return DmShipType.class;
	}

	public String getModelClassName() {
		return DmShipType.class.getName();
	}

	/**
	* Returns the primary key of this dm ship type.
	*
	* @return the primary key of this dm ship type
	*/
	public int getPrimaryKey() {
		return _dmShipType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm ship type.
	*
	* @param primaryKey the primary key of this dm ship type
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmShipType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm ship type.
	*
	* @return the ID of this dm ship type
	*/
	public int getId() {
		return _dmShipType.getId();
	}

	/**
	* Sets the ID of this dm ship type.
	*
	* @param id the ID of this dm ship type
	*/
	public void setId(int id) {
		_dmShipType.setId(id);
	}

	/**
	* Returns the ship type code of this dm ship type.
	*
	* @return the ship type code of this dm ship type
	*/
	public java.lang.String getShipTypeCode() {
		return _dmShipType.getShipTypeCode();
	}

	/**
	* Sets the ship type code of this dm ship type.
	*
	* @param shipTypeCode the ship type code of this dm ship type
	*/
	public void setShipTypeCode(java.lang.String shipTypeCode) {
		_dmShipType.setShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the ship type name of this dm ship type.
	*
	* @return the ship type name of this dm ship type
	*/
	public java.lang.String getShipTypeName() {
		return _dmShipType.getShipTypeName();
	}

	/**
	* Sets the ship type name of this dm ship type.
	*
	* @param shipTypeName the ship type name of this dm ship type
	*/
	public void setShipTypeName(java.lang.String shipTypeName) {
		_dmShipType.setShipTypeName(shipTypeName);
	}

	/**
	* Returns the ship type name v n of this dm ship type.
	*
	* @return the ship type name v n of this dm ship type
	*/
	public java.lang.String getShipTypeNameVN() {
		return _dmShipType.getShipTypeNameVN();
	}

	/**
	* Sets the ship type name v n of this dm ship type.
	*
	* @param shipTypeNameVN the ship type name v n of this dm ship type
	*/
	public void setShipTypeNameVN(java.lang.String shipTypeNameVN) {
		_dmShipType.setShipTypeNameVN(shipTypeNameVN);
	}

	/**
	* Returns the ship type order of this dm ship type.
	*
	* @return the ship type order of this dm ship type
	*/
	public int getShipTypeOrder() {
		return _dmShipType.getShipTypeOrder();
	}

	/**
	* Sets the ship type order of this dm ship type.
	*
	* @param shipTypeOrder the ship type order of this dm ship type
	*/
	public void setShipTypeOrder(int shipTypeOrder) {
		_dmShipType.setShipTypeOrder(shipTypeOrder);
	}

	/**
	* Returns the is delete of this dm ship type.
	*
	* @return the is delete of this dm ship type
	*/
	public int getIsDelete() {
		return _dmShipType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm ship type.
	*
	* @param isDelete the is delete of this dm ship type
	*/
	public void setIsDelete(int isDelete) {
		_dmShipType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm ship type.
	*
	* @return the marked as delete of this dm ship type
	*/
	public int getMarkedAsDelete() {
		return _dmShipType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm ship type.
	*
	* @param markedAsDelete the marked as delete of this dm ship type
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmShipType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm ship type.
	*
	* @return the modified date of this dm ship type
	*/
	public java.util.Date getModifiedDate() {
		return _dmShipType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm ship type.
	*
	* @param modifiedDate the modified date of this dm ship type
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmShipType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm ship type.
	*
	* @return the requested date of this dm ship type
	*/
	public java.util.Date getRequestedDate() {
		return _dmShipType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm ship type.
	*
	* @param requestedDate the requested date of this dm ship type
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmShipType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm ship type.
	*
	* @return the sync version of this dm ship type
	*/
	public java.lang.String getSyncVersion() {
		return _dmShipType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm ship type.
	*
	* @param syncVersion the sync version of this dm ship type
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmShipType.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmShipType.isNew();
	}

	public void setNew(boolean n) {
		_dmShipType.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmShipType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmShipType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmShipType.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmShipType.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmShipType.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmShipType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmShipType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmShipTypeWrapper((DmShipType)_dmShipType.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmShipType dmShipType) {
		return _dmShipType.compareTo(dmShipType);
	}

	@Override
	public int hashCode() {
		return _dmShipType.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmShipType> toCacheModel() {
		return _dmShipType.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmShipType toEscapedModel() {
		return new DmShipTypeWrapper(_dmShipType.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmShipType.toString();
	}

	public java.lang.String toXmlString() {
		return _dmShipType.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmShipType.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmShipType getWrappedDmShipType() {
		return _dmShipType;
	}

	public DmShipType getWrappedModel() {
		return _dmShipType;
	}

	public void resetOriginalValues() {
		_dmShipType.resetOriginalValues();
	}

	private DmShipType _dmShipType;
}