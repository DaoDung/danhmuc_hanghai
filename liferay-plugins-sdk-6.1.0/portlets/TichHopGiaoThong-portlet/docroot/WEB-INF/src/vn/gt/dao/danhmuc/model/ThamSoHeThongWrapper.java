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
 * This class is a wrapper for {@link ThamSoHeThong}.
 * </p>
 *
 * @author    win_64
 * @see       ThamSoHeThong
 * @generated
 */
public class ThamSoHeThongWrapper implements ThamSoHeThong,
	ModelWrapper<ThamSoHeThong> {
	public ThamSoHeThongWrapper(ThamSoHeThong thamSoHeThong) {
		_thamSoHeThong = thamSoHeThong;
	}

	public Class<?> getModelClass() {
		return ThamSoHeThong.class;
	}

	public String getModelClassName() {
		return ThamSoHeThong.class.getName();
	}

	/**
	* Returns the primary key of this tham so he thong.
	*
	* @return the primary key of this tham so he thong
	*/
	public long getPrimaryKey() {
		return _thamSoHeThong.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tham so he thong.
	*
	* @param primaryKey the primary key of this tham so he thong
	*/
	public void setPrimaryKey(long primaryKey) {
		_thamSoHeThong.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tham so he thong.
	*
	* @return the ID of this tham so he thong
	*/
	public long getId() {
		return _thamSoHeThong.getId();
	}

	/**
	* Sets the ID of this tham so he thong.
	*
	* @param id the ID of this tham so he thong
	*/
	public void setId(long id) {
		_thamSoHeThong.setId(id);
	}

	/**
	* Returns the value data of this tham so he thong.
	*
	* @return the value data of this tham so he thong
	*/
	public java.lang.String getValueData() {
		return _thamSoHeThong.getValueData();
	}

	/**
	* Sets the value data of this tham so he thong.
	*
	* @param valueData the value data of this tham so he thong
	*/
	public void setValueData(java.lang.String valueData) {
		_thamSoHeThong.setValueData(valueData);
	}

	/**
	* Returns the key data of this tham so he thong.
	*
	* @return the key data of this tham so he thong
	*/
	public java.lang.String getKeyData() {
		return _thamSoHeThong.getKeyData();
	}

	/**
	* Sets the key data of this tham so he thong.
	*
	* @param keyData the key data of this tham so he thong
	*/
	public void setKeyData(java.lang.String keyData) {
		_thamSoHeThong.setKeyData(keyData);
	}

	/**
	* Returns the description of this tham so he thong.
	*
	* @return the description of this tham so he thong
	*/
	public java.lang.String getDescription() {
		return _thamSoHeThong.getDescription();
	}

	/**
	* Sets the description of this tham so he thong.
	*
	* @param description the description of this tham so he thong
	*/
	public void setDescription(java.lang.String description) {
		_thamSoHeThong.setDescription(description);
	}

	public boolean isNew() {
		return _thamSoHeThong.isNew();
	}

	public void setNew(boolean n) {
		_thamSoHeThong.setNew(n);
	}

	public boolean isCachedModel() {
		return _thamSoHeThong.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_thamSoHeThong.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _thamSoHeThong.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _thamSoHeThong.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thamSoHeThong.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thamSoHeThong.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thamSoHeThong.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ThamSoHeThongWrapper((ThamSoHeThong)_thamSoHeThong.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.ThamSoHeThong thamSoHeThong) {
		return _thamSoHeThong.compareTo(thamSoHeThong);
	}

	@Override
	public int hashCode() {
		return _thamSoHeThong.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.ThamSoHeThong> toCacheModel() {
		return _thamSoHeThong.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.ThamSoHeThong toEscapedModel() {
		return new ThamSoHeThongWrapper(_thamSoHeThong.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thamSoHeThong.toString();
	}

	public java.lang.String toXmlString() {
		return _thamSoHeThong.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thamSoHeThong.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public ThamSoHeThong getWrappedThamSoHeThong() {
		return _thamSoHeThong;
	}

	public ThamSoHeThong getWrappedModel() {
		return _thamSoHeThong;
	}

	public void resetOriginalValues() {
		_thamSoHeThong.resetOriginalValues();
	}

	private ThamSoHeThong _thamSoHeThong;
}