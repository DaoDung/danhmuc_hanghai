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

package vn.gt.dao.nhapcanh.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ResponseBo}.
 * </p>
 *
 * @author    win_64
 * @see       ResponseBo
 * @generated
 */
public class ResponseBoWrapper implements ResponseBo, ModelWrapper<ResponseBo> {
	public ResponseBoWrapper(ResponseBo responseBo) {
		_responseBo = responseBo;
	}

	public Class<?> getModelClass() {
		return ResponseBo.class;
	}

	public String getModelClassName() {
		return ResponseBo.class.getName();
	}

	/**
	* Returns the primary key of this response bo.
	*
	* @return the primary key of this response bo
	*/
	public long getPrimaryKey() {
		return _responseBo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this response bo.
	*
	* @param primaryKey the primary key of this response bo
	*/
	public void setPrimaryKey(long primaryKey) {
		_responseBo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this response bo.
	*
	* @return the ID of this response bo
	*/
	public long getId() {
		return _responseBo.getId();
	}

	/**
	* Sets the ID of this response bo.
	*
	* @param id the ID of this response bo
	*/
	public void setId(long id) {
		_responseBo.setId(id);
	}

	/**
	* Returns the is success of this response bo.
	*
	* @return the is success of this response bo
	*/
	public int getIsSuccess() {
		return _responseBo.getIsSuccess();
	}

	/**
	* Sets the is success of this response bo.
	*
	* @param isSuccess the is success of this response bo
	*/
	public void setIsSuccess(int isSuccess) {
		_responseBo.setIsSuccess(isSuccess);
	}

	/**
	* Returns the error message of this response bo.
	*
	* @return the error message of this response bo
	*/
	public java.lang.String getErrorMessage() {
		return _responseBo.getErrorMessage();
	}

	/**
	* Sets the error message of this response bo.
	*
	* @param errorMessage the error message of this response bo
	*/
	public void setErrorMessage(java.lang.String errorMessage) {
		_responseBo.setErrorMessage(errorMessage);
	}

	public boolean isNew() {
		return _responseBo.isNew();
	}

	public void setNew(boolean n) {
		_responseBo.setNew(n);
	}

	public boolean isCachedModel() {
		return _responseBo.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_responseBo.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _responseBo.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _responseBo.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_responseBo.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _responseBo.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_responseBo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResponseBoWrapper((ResponseBo)_responseBo.clone());
	}

	public int compareTo(vn.gt.dao.nhapcanh.model.ResponseBo responseBo) {
		return _responseBo.compareTo(responseBo);
	}

	@Override
	public int hashCode() {
		return _responseBo.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.nhapcanh.model.ResponseBo> toCacheModel() {
		return _responseBo.toCacheModel();
	}

	public vn.gt.dao.nhapcanh.model.ResponseBo toEscapedModel() {
		return new ResponseBoWrapper(_responseBo.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _responseBo.toString();
	}

	public java.lang.String toXmlString() {
		return _responseBo.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_responseBo.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public ResponseBo getWrappedResponseBo() {
		return _responseBo;
	}

	public ResponseBo getWrappedModel() {
		return _responseBo;
	}

	public void resetOriginalValues() {
		_responseBo.resetOriginalValues();
	}

	private ResponseBo _responseBo;
}