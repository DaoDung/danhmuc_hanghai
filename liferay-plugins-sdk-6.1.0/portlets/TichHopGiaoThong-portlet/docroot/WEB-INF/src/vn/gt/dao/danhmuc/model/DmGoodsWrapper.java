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
 * This class is a wrapper for {@link DmGoods}.
 * </p>
 *
 * @author    win_64
 * @see       DmGoods
 * @generated
 */
public class DmGoodsWrapper implements DmGoods, ModelWrapper<DmGoods> {
	public DmGoodsWrapper(DmGoods dmGoods) {
		_dmGoods = dmGoods;
	}

	public Class<?> getModelClass() {
		return DmGoods.class;
	}

	public String getModelClassName() {
		return DmGoods.class.getName();
	}

	/**
	* Returns the primary key of this dm goods.
	*
	* @return the primary key of this dm goods
	*/
	public int getPrimaryKey() {
		return _dmGoods.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm goods.
	*
	* @param primaryKey the primary key of this dm goods
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmGoods.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm goods.
	*
	* @return the ID of this dm goods
	*/
	public int getId() {
		return _dmGoods.getId();
	}

	/**
	* Sets the ID of this dm goods.
	*
	* @param id the ID of this dm goods
	*/
	public void setId(int id) {
		_dmGoods.setId(id);
	}

	/**
	* Returns the goods item code of this dm goods.
	*
	* @return the goods item code of this dm goods
	*/
	public java.lang.String getGoodsItemCode() {
		return _dmGoods.getGoodsItemCode();
	}

	/**
	* Sets the goods item code of this dm goods.
	*
	* @param goodsItemCode the goods item code of this dm goods
	*/
	public void setGoodsItemCode(java.lang.String goodsItemCode) {
		_dmGoods.setGoodsItemCode(goodsItemCode);
	}

	/**
	* Returns the goods item name of this dm goods.
	*
	* @return the goods item name of this dm goods
	*/
	public java.lang.String getGoodsItemName() {
		return _dmGoods.getGoodsItemName();
	}

	/**
	* Sets the goods item name of this dm goods.
	*
	* @param goodsItemName the goods item name of this dm goods
	*/
	public void setGoodsItemName(java.lang.String goodsItemName) {
		_dmGoods.setGoodsItemName(goodsItemName);
	}

	/**
	* Returns the goods item name v n of this dm goods.
	*
	* @return the goods item name v n of this dm goods
	*/
	public java.lang.String getGoodsItemNameVN() {
		return _dmGoods.getGoodsItemNameVN();
	}

	/**
	* Sets the goods item name v n of this dm goods.
	*
	* @param goodsItemNameVN the goods item name v n of this dm goods
	*/
	public void setGoodsItemNameVN(java.lang.String goodsItemNameVN) {
		_dmGoods.setGoodsItemNameVN(goodsItemNameVN);
	}

	/**
	* Returns the goods item order of this dm goods.
	*
	* @return the goods item order of this dm goods
	*/
	public int getGoodsItemOrder() {
		return _dmGoods.getGoodsItemOrder();
	}

	/**
	* Sets the goods item order of this dm goods.
	*
	* @param goodsItemOrder the goods item order of this dm goods
	*/
	public void setGoodsItemOrder(int goodsItemOrder) {
		_dmGoods.setGoodsItemOrder(goodsItemOrder);
	}

	/**
	* Returns the is delete of this dm goods.
	*
	* @return the is delete of this dm goods
	*/
	public int getIsDelete() {
		return _dmGoods.getIsDelete();
	}

	/**
	* Sets the is delete of this dm goods.
	*
	* @param isDelete the is delete of this dm goods
	*/
	public void setIsDelete(int isDelete) {
		_dmGoods.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm goods.
	*
	* @return the marked as delete of this dm goods
	*/
	public int getMarkedAsDelete() {
		return _dmGoods.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm goods.
	*
	* @param markedAsDelete the marked as delete of this dm goods
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGoods.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm goods.
	*
	* @return the modified date of this dm goods
	*/
	public java.util.Date getModifiedDate() {
		return _dmGoods.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm goods.
	*
	* @param modifiedDate the modified date of this dm goods
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGoods.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm goods.
	*
	* @return the requested date of this dm goods
	*/
	public java.util.Date getRequestedDate() {
		return _dmGoods.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm goods.
	*
	* @param requestedDate the requested date of this dm goods
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGoods.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm goods.
	*
	* @return the sync version of this dm goods
	*/
	public java.lang.String getSyncVersion() {
		return _dmGoods.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm goods.
	*
	* @param syncVersion the sync version of this dm goods
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGoods.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmGoods.isNew();
	}

	public void setNew(boolean n) {
		_dmGoods.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmGoods.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmGoods.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmGoods.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGoods.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGoods.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGoods.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGoods.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGoodsWrapper((DmGoods)_dmGoods.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmGoods dmGoods) {
		return _dmGoods.compareTo(dmGoods);
	}

	@Override
	public int hashCode() {
		return _dmGoods.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmGoods> toCacheModel() {
		return _dmGoods.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmGoods toEscapedModel() {
		return new DmGoodsWrapper(_dmGoods.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGoods.toString();
	}

	public java.lang.String toXmlString() {
		return _dmGoods.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGoods.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmGoods getWrappedDmGoods() {
		return _dmGoods;
	}

	public DmGoods getWrappedModel() {
		return _dmGoods;
	}

	public void resetOriginalValues() {
		_dmGoods.resetOriginalValues();
	}

	private DmGoods _dmGoods;
}