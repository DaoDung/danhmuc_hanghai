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
 * This class is a wrapper for {@link DmGoodsType}.
 * </p>
 *
 * @author    win_64
 * @see       DmGoodsType
 * @generated
 */
public class DmGoodsTypeWrapper implements DmGoodsType,
	ModelWrapper<DmGoodsType> {
	public DmGoodsTypeWrapper(DmGoodsType dmGoodsType) {
		_dmGoodsType = dmGoodsType;
	}

	public Class<?> getModelClass() {
		return DmGoodsType.class;
	}

	public String getModelClassName() {
		return DmGoodsType.class.getName();
	}

	/**
	* Returns the primary key of this dm goods type.
	*
	* @return the primary key of this dm goods type
	*/
	public int getPrimaryKey() {
		return _dmGoodsType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm goods type.
	*
	* @param primaryKey the primary key of this dm goods type
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmGoodsType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm goods type.
	*
	* @return the ID of this dm goods type
	*/
	public int getId() {
		return _dmGoodsType.getId();
	}

	/**
	* Sets the ID of this dm goods type.
	*
	* @param id the ID of this dm goods type
	*/
	public void setId(int id) {
		_dmGoodsType.setId(id);
	}

	/**
	* Returns the goods type code of this dm goods type.
	*
	* @return the goods type code of this dm goods type
	*/
	public java.lang.String getGoodsTypeCode() {
		return _dmGoodsType.getGoodsTypeCode();
	}

	/**
	* Sets the goods type code of this dm goods type.
	*
	* @param goodsTypeCode the goods type code of this dm goods type
	*/
	public void setGoodsTypeCode(java.lang.String goodsTypeCode) {
		_dmGoodsType.setGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns the goods type name of this dm goods type.
	*
	* @return the goods type name of this dm goods type
	*/
	public java.lang.String getGoodsTypeName() {
		return _dmGoodsType.getGoodsTypeName();
	}

	/**
	* Sets the goods type name of this dm goods type.
	*
	* @param goodsTypeName the goods type name of this dm goods type
	*/
	public void setGoodsTypeName(java.lang.String goodsTypeName) {
		_dmGoodsType.setGoodsTypeName(goodsTypeName);
	}

	/**
	* Returns the goods type name v n of this dm goods type.
	*
	* @return the goods type name v n of this dm goods type
	*/
	public java.lang.String getGoodsTypeNameVN() {
		return _dmGoodsType.getGoodsTypeNameVN();
	}

	/**
	* Sets the goods type name v n of this dm goods type.
	*
	* @param goodsTypeNameVN the goods type name v n of this dm goods type
	*/
	public void setGoodsTypeNameVN(java.lang.String goodsTypeNameVN) {
		_dmGoodsType.setGoodsTypeNameVN(goodsTypeNameVN);
	}

	/**
	* Returns the goods type order of this dm goods type.
	*
	* @return the goods type order of this dm goods type
	*/
	public int getGoodsTypeOrder() {
		return _dmGoodsType.getGoodsTypeOrder();
	}

	/**
	* Sets the goods type order of this dm goods type.
	*
	* @param goodsTypeOrder the goods type order of this dm goods type
	*/
	public void setGoodsTypeOrder(int goodsTypeOrder) {
		_dmGoodsType.setGoodsTypeOrder(goodsTypeOrder);
	}

	/**
	* Returns the is delete of this dm goods type.
	*
	* @return the is delete of this dm goods type
	*/
	public int getIsDelete() {
		return _dmGoodsType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm goods type.
	*
	* @param isDelete the is delete of this dm goods type
	*/
	public void setIsDelete(int isDelete) {
		_dmGoodsType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm goods type.
	*
	* @return the marked as delete of this dm goods type
	*/
	public int getMarkedAsDelete() {
		return _dmGoodsType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm goods type.
	*
	* @param markedAsDelete the marked as delete of this dm goods type
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGoodsType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm goods type.
	*
	* @return the modified date of this dm goods type
	*/
	public java.util.Date getModifiedDate() {
		return _dmGoodsType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm goods type.
	*
	* @param modifiedDate the modified date of this dm goods type
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGoodsType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm goods type.
	*
	* @return the requested date of this dm goods type
	*/
	public java.util.Date getRequestedDate() {
		return _dmGoodsType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm goods type.
	*
	* @param requestedDate the requested date of this dm goods type
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGoodsType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm goods type.
	*
	* @return the sync version of this dm goods type
	*/
	public java.lang.String getSyncVersion() {
		return _dmGoodsType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm goods type.
	*
	* @param syncVersion the sync version of this dm goods type
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGoodsType.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmGoodsType.isNew();
	}

	public void setNew(boolean n) {
		_dmGoodsType.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmGoodsType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmGoodsType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmGoodsType.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGoodsType.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGoodsType.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGoodsType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGoodsType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGoodsTypeWrapper((DmGoodsType)_dmGoodsType.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmGoodsType dmGoodsType) {
		return _dmGoodsType.compareTo(dmGoodsType);
	}

	@Override
	public int hashCode() {
		return _dmGoodsType.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmGoodsType> toCacheModel() {
		return _dmGoodsType.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmGoodsType toEscapedModel() {
		return new DmGoodsTypeWrapper(_dmGoodsType.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGoodsType.toString();
	}

	public java.lang.String toXmlString() {
		return _dmGoodsType.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGoodsType.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmGoodsType getWrappedDmGoodsType() {
		return _dmGoodsType;
	}

	public DmGoodsType getWrappedModel() {
		return _dmGoodsType;
	}

	public void resetOriginalValues() {
		_dmGoodsType.resetOriginalValues();
	}

	private DmGoodsType _dmGoodsType;
}