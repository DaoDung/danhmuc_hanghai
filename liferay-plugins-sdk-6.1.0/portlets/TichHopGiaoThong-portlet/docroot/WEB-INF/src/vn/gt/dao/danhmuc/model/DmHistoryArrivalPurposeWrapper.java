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
 * This class is a wrapper for {@link DmHistoryArrivalPurpose}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryArrivalPurpose
 * @generated
 */
public class DmHistoryArrivalPurposeWrapper implements DmHistoryArrivalPurpose,
	ModelWrapper<DmHistoryArrivalPurpose> {
	public DmHistoryArrivalPurposeWrapper(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		_dmHistoryArrivalPurpose = dmHistoryArrivalPurpose;
	}

	public Class<?> getModelClass() {
		return DmHistoryArrivalPurpose.class;
	}

	public String getModelClassName() {
		return DmHistoryArrivalPurpose.class.getName();
	}

	/**
	* Returns the primary key of this dm history arrival purpose.
	*
	* @return the primary key of this dm history arrival purpose
	*/
	public int getPrimaryKey() {
		return _dmHistoryArrivalPurpose.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history arrival purpose.
	*
	* @param primaryKey the primary key of this dm history arrival purpose
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryArrivalPurpose.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history arrival purpose.
	*
	* @return the ID of this dm history arrival purpose
	*/
	public int getId() {
		return _dmHistoryArrivalPurpose.getId();
	}

	/**
	* Sets the ID of this dm history arrival purpose.
	*
	* @param id the ID of this dm history arrival purpose
	*/
	public void setId(int id) {
		_dmHistoryArrivalPurpose.setId(id);
	}

	/**
	* Returns the purpose code of this dm history arrival purpose.
	*
	* @return the purpose code of this dm history arrival purpose
	*/
	public java.lang.String getPurposeCode() {
		return _dmHistoryArrivalPurpose.getPurposeCode();
	}

	/**
	* Sets the purpose code of this dm history arrival purpose.
	*
	* @param purposeCode the purpose code of this dm history arrival purpose
	*/
	public void setPurposeCode(java.lang.String purposeCode) {
		_dmHistoryArrivalPurpose.setPurposeCode(purposeCode);
	}

	/**
	* Returns the purpose name of this dm history arrival purpose.
	*
	* @return the purpose name of this dm history arrival purpose
	*/
	public java.lang.String getPurposeName() {
		return _dmHistoryArrivalPurpose.getPurposeName();
	}

	/**
	* Sets the purpose name of this dm history arrival purpose.
	*
	* @param purposeName the purpose name of this dm history arrival purpose
	*/
	public void setPurposeName(java.lang.String purposeName) {
		_dmHistoryArrivalPurpose.setPurposeName(purposeName);
	}

	/**
	* Returns the purpose name v n of this dm history arrival purpose.
	*
	* @return the purpose name v n of this dm history arrival purpose
	*/
	public java.lang.String getPurposeNameVN() {
		return _dmHistoryArrivalPurpose.getPurposeNameVN();
	}

	/**
	* Sets the purpose name v n of this dm history arrival purpose.
	*
	* @param purposeNameVN the purpose name v n of this dm history arrival purpose
	*/
	public void setPurposeNameVN(java.lang.String purposeNameVN) {
		_dmHistoryArrivalPurpose.setPurposeNameVN(purposeNameVN);
	}

	/**
	* Returns the is delete of this dm history arrival purpose.
	*
	* @return the is delete of this dm history arrival purpose
	*/
	public int getIsDelete() {
		return _dmHistoryArrivalPurpose.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history arrival purpose.
	*
	* @param isDelete the is delete of this dm history arrival purpose
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryArrivalPurpose.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history arrival purpose.
	*
	* @return the marked as delete of this dm history arrival purpose
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryArrivalPurpose.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history arrival purpose.
	*
	* @param markedAsDelete the marked as delete of this dm history arrival purpose
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryArrivalPurpose.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history arrival purpose.
	*
	* @return the modified date of this dm history arrival purpose
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryArrivalPurpose.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history arrival purpose.
	*
	* @param modifiedDate the modified date of this dm history arrival purpose
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryArrivalPurpose.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history arrival purpose.
	*
	* @return the requested date of this dm history arrival purpose
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryArrivalPurpose.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history arrival purpose.
	*
	* @param requestedDate the requested date of this dm history arrival purpose
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryArrivalPurpose.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history arrival purpose.
	*
	* @return the sync version of this dm history arrival purpose
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryArrivalPurpose.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history arrival purpose.
	*
	* @param syncVersion the sync version of this dm history arrival purpose
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryArrivalPurpose.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryArrivalPurpose.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryArrivalPurpose.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryArrivalPurpose.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryArrivalPurpose.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryArrivalPurpose.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryArrivalPurpose.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryArrivalPurpose.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryArrivalPurpose.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryArrivalPurpose.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryArrivalPurposeWrapper((DmHistoryArrivalPurpose)_dmHistoryArrivalPurpose.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		return _dmHistoryArrivalPurpose.compareTo(dmHistoryArrivalPurpose);
	}

	@Override
	public int hashCode() {
		return _dmHistoryArrivalPurpose.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> toCacheModel() {
		return _dmHistoryArrivalPurpose.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose toEscapedModel() {
		return new DmHistoryArrivalPurposeWrapper(_dmHistoryArrivalPurpose.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryArrivalPurpose.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryArrivalPurpose.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryArrivalPurpose.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryArrivalPurpose getWrappedDmHistoryArrivalPurpose() {
		return _dmHistoryArrivalPurpose;
	}

	public DmHistoryArrivalPurpose getWrappedModel() {
		return _dmHistoryArrivalPurpose;
	}

	public void resetOriginalValues() {
		_dmHistoryArrivalPurpose.resetOriginalValues();
	}

	private DmHistoryArrivalPurpose _dmHistoryArrivalPurpose;
}