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
 * This class is a wrapper for {@link DmHistoryGoodsType}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryGoodsType
 * @generated
 */
public class DmHistoryGoodsTypeWrapper implements DmHistoryGoodsType,
	ModelWrapper<DmHistoryGoodsType> {
	public DmHistoryGoodsTypeWrapper(DmHistoryGoodsType dmHistoryGoodsType) {
		_dmHistoryGoodsType = dmHistoryGoodsType;
	}

	public Class<?> getModelClass() {
		return DmHistoryGoodsType.class;
	}

	public String getModelClassName() {
		return DmHistoryGoodsType.class.getName();
	}

	/**
	* Returns the primary key of this dm history goods type.
	*
	* @return the primary key of this dm history goods type
	*/
	public int getPrimaryKey() {
		return _dmHistoryGoodsType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history goods type.
	*
	* @param primaryKey the primary key of this dm history goods type
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryGoodsType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history goods type.
	*
	* @return the ID of this dm history goods type
	*/
	public int getId() {
		return _dmHistoryGoodsType.getId();
	}

	/**
	* Sets the ID of this dm history goods type.
	*
	* @param id the ID of this dm history goods type
	*/
	public void setId(int id) {
		_dmHistoryGoodsType.setId(id);
	}

	/**
	* Returns the goods type code of this dm history goods type.
	*
	* @return the goods type code of this dm history goods type
	*/
	public java.lang.String getGoodsTypeCode() {
		return _dmHistoryGoodsType.getGoodsTypeCode();
	}

	/**
	* Sets the goods type code of this dm history goods type.
	*
	* @param goodsTypeCode the goods type code of this dm history goods type
	*/
	public void setGoodsTypeCode(java.lang.String goodsTypeCode) {
		_dmHistoryGoodsType.setGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns the goods type name of this dm history goods type.
	*
	* @return the goods type name of this dm history goods type
	*/
	public java.lang.String getGoodsTypeName() {
		return _dmHistoryGoodsType.getGoodsTypeName();
	}

	/**
	* Sets the goods type name of this dm history goods type.
	*
	* @param goodsTypeName the goods type name of this dm history goods type
	*/
	public void setGoodsTypeName(java.lang.String goodsTypeName) {
		_dmHistoryGoodsType.setGoodsTypeName(goodsTypeName);
	}

	/**
	* Returns the goods type name v n of this dm history goods type.
	*
	* @return the goods type name v n of this dm history goods type
	*/
	public java.lang.String getGoodsTypeNameVN() {
		return _dmHistoryGoodsType.getGoodsTypeNameVN();
	}

	/**
	* Sets the goods type name v n of this dm history goods type.
	*
	* @param goodsTypeNameVN the goods type name v n of this dm history goods type
	*/
	public void setGoodsTypeNameVN(java.lang.String goodsTypeNameVN) {
		_dmHistoryGoodsType.setGoodsTypeNameVN(goodsTypeNameVN);
	}

	/**
	* Returns the goods type order of this dm history goods type.
	*
	* @return the goods type order of this dm history goods type
	*/
	public int getGoodsTypeOrder() {
		return _dmHistoryGoodsType.getGoodsTypeOrder();
	}

	/**
	* Sets the goods type order of this dm history goods type.
	*
	* @param goodsTypeOrder the goods type order of this dm history goods type
	*/
	public void setGoodsTypeOrder(int goodsTypeOrder) {
		_dmHistoryGoodsType.setGoodsTypeOrder(goodsTypeOrder);
	}

	/**
	* Returns the is delete of this dm history goods type.
	*
	* @return the is delete of this dm history goods type
	*/
	public int getIsDelete() {
		return _dmHistoryGoodsType.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history goods type.
	*
	* @param isDelete the is delete of this dm history goods type
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryGoodsType.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history goods type.
	*
	* @return the marked as delete of this dm history goods type
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryGoodsType.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history goods type.
	*
	* @param markedAsDelete the marked as delete of this dm history goods type
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryGoodsType.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history goods type.
	*
	* @return the modified date of this dm history goods type
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryGoodsType.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history goods type.
	*
	* @param modifiedDate the modified date of this dm history goods type
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryGoodsType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history goods type.
	*
	* @return the requested date of this dm history goods type
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryGoodsType.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history goods type.
	*
	* @param requestedDate the requested date of this dm history goods type
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryGoodsType.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history goods type.
	*
	* @return the sync version of this dm history goods type
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryGoodsType.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history goods type.
	*
	* @param syncVersion the sync version of this dm history goods type
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryGoodsType.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryGoodsType.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryGoodsType.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryGoodsType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryGoodsType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryGoodsType.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryGoodsType.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryGoodsType.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryGoodsType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryGoodsType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryGoodsTypeWrapper((DmHistoryGoodsType)_dmHistoryGoodsType.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmHistoryGoodsType dmHistoryGoodsType) {
		return _dmHistoryGoodsType.compareTo(dmHistoryGoodsType);
	}

	@Override
	public int hashCode() {
		return _dmHistoryGoodsType.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryGoodsType> toCacheModel() {
		return _dmHistoryGoodsType.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryGoodsType toEscapedModel() {
		return new DmHistoryGoodsTypeWrapper(_dmHistoryGoodsType.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryGoodsType.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryGoodsType.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryGoodsType.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryGoodsType getWrappedDmHistoryGoodsType() {
		return _dmHistoryGoodsType;
	}

	public DmHistoryGoodsType getWrappedModel() {
		return _dmHistoryGoodsType;
	}

	public void resetOriginalValues() {
		_dmHistoryGoodsType.resetOriginalValues();
	}

	private DmHistoryGoodsType _dmHistoryGoodsType;
}