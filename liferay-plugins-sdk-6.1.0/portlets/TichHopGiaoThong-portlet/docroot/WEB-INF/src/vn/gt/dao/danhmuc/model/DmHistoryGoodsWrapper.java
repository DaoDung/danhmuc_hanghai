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
 * This class is a wrapper for {@link DmHistoryGoods}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryGoods
 * @generated
 */
public class DmHistoryGoodsWrapper implements DmHistoryGoods,
	ModelWrapper<DmHistoryGoods> {
	public DmHistoryGoodsWrapper(DmHistoryGoods dmHistoryGoods) {
		_dmHistoryGoods = dmHistoryGoods;
	}

	public Class<?> getModelClass() {
		return DmHistoryGoods.class;
	}

	public String getModelClassName() {
		return DmHistoryGoods.class.getName();
	}

	/**
	* Returns the primary key of this dm history goods.
	*
	* @return the primary key of this dm history goods
	*/
	public int getPrimaryKey() {
		return _dmHistoryGoods.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history goods.
	*
	* @param primaryKey the primary key of this dm history goods
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryGoods.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history goods.
	*
	* @return the ID of this dm history goods
	*/
	public int getId() {
		return _dmHistoryGoods.getId();
	}

	/**
	* Sets the ID of this dm history goods.
	*
	* @param id the ID of this dm history goods
	*/
	public void setId(int id) {
		_dmHistoryGoods.setId(id);
	}

	/**
	* Returns the goods item code of this dm history goods.
	*
	* @return the goods item code of this dm history goods
	*/
	public java.lang.String getGoodsItemCode() {
		return _dmHistoryGoods.getGoodsItemCode();
	}

	/**
	* Sets the goods item code of this dm history goods.
	*
	* @param goodsItemCode the goods item code of this dm history goods
	*/
	public void setGoodsItemCode(java.lang.String goodsItemCode) {
		_dmHistoryGoods.setGoodsItemCode(goodsItemCode);
	}

	/**
	* Returns the goods item name of this dm history goods.
	*
	* @return the goods item name of this dm history goods
	*/
	public java.lang.String getGoodsItemName() {
		return _dmHistoryGoods.getGoodsItemName();
	}

	/**
	* Sets the goods item name of this dm history goods.
	*
	* @param goodsItemName the goods item name of this dm history goods
	*/
	public void setGoodsItemName(java.lang.String goodsItemName) {
		_dmHistoryGoods.setGoodsItemName(goodsItemName);
	}

	/**
	* Returns the goods item name v n of this dm history goods.
	*
	* @return the goods item name v n of this dm history goods
	*/
	public java.lang.String getGoodsItemNameVN() {
		return _dmHistoryGoods.getGoodsItemNameVN();
	}

	/**
	* Sets the goods item name v n of this dm history goods.
	*
	* @param goodsItemNameVN the goods item name v n of this dm history goods
	*/
	public void setGoodsItemNameVN(java.lang.String goodsItemNameVN) {
		_dmHistoryGoods.setGoodsItemNameVN(goodsItemNameVN);
	}

	/**
	* Returns the goods item order of this dm history goods.
	*
	* @return the goods item order of this dm history goods
	*/
	public int getGoodsItemOrder() {
		return _dmHistoryGoods.getGoodsItemOrder();
	}

	/**
	* Sets the goods item order of this dm history goods.
	*
	* @param goodsItemOrder the goods item order of this dm history goods
	*/
	public void setGoodsItemOrder(int goodsItemOrder) {
		_dmHistoryGoods.setGoodsItemOrder(goodsItemOrder);
	}

	/**
	* Returns the is delete of this dm history goods.
	*
	* @return the is delete of this dm history goods
	*/
	public int getIsDelete() {
		return _dmHistoryGoods.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history goods.
	*
	* @param isDelete the is delete of this dm history goods
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryGoods.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history goods.
	*
	* @return the marked as delete of this dm history goods
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryGoods.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history goods.
	*
	* @param markedAsDelete the marked as delete of this dm history goods
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryGoods.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history goods.
	*
	* @return the modified date of this dm history goods
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryGoods.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history goods.
	*
	* @param modifiedDate the modified date of this dm history goods
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryGoods.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history goods.
	*
	* @return the requested date of this dm history goods
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryGoods.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history goods.
	*
	* @param requestedDate the requested date of this dm history goods
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryGoods.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history goods.
	*
	* @return the sync version of this dm history goods
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryGoods.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history goods.
	*
	* @param syncVersion the sync version of this dm history goods
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryGoods.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryGoods.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryGoods.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryGoods.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryGoods.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryGoods.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryGoods.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryGoods.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryGoods.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryGoods.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryGoodsWrapper((DmHistoryGoods)_dmHistoryGoods.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmHistoryGoods dmHistoryGoods) {
		return _dmHistoryGoods.compareTo(dmHistoryGoods);
	}

	@Override
	public int hashCode() {
		return _dmHistoryGoods.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryGoods> toCacheModel() {
		return _dmHistoryGoods.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryGoods toEscapedModel() {
		return new DmHistoryGoodsWrapper(_dmHistoryGoods.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryGoods.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryGoods.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryGoods.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryGoods getWrappedDmHistoryGoods() {
		return _dmHistoryGoods;
	}

	public DmHistoryGoods getWrappedModel() {
		return _dmHistoryGoods;
	}

	public void resetOriginalValues() {
		_dmHistoryGoods.resetOriginalValues();
	}

	private DmHistoryGoods _dmHistoryGoods;
}