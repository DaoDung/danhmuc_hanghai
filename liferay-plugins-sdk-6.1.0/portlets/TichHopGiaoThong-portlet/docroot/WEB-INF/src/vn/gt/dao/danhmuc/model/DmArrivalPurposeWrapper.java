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
 * This class is a wrapper for {@link DmArrivalPurpose}.
 * </p>
 *
 * @author    win_64
 * @see       DmArrivalPurpose
 * @generated
 */
public class DmArrivalPurposeWrapper implements DmArrivalPurpose,
	ModelWrapper<DmArrivalPurpose> {
	public DmArrivalPurposeWrapper(DmArrivalPurpose dmArrivalPurpose) {
		_dmArrivalPurpose = dmArrivalPurpose;
	}

	public Class<?> getModelClass() {
		return DmArrivalPurpose.class;
	}

	public String getModelClassName() {
		return DmArrivalPurpose.class.getName();
	}

	/**
	* Returns the primary key of this dm arrival purpose.
	*
	* @return the primary key of this dm arrival purpose
	*/
	public int getPrimaryKey() {
		return _dmArrivalPurpose.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm arrival purpose.
	*
	* @param primaryKey the primary key of this dm arrival purpose
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmArrivalPurpose.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm arrival purpose.
	*
	* @return the ID of this dm arrival purpose
	*/
	public int getId() {
		return _dmArrivalPurpose.getId();
	}

	/**
	* Sets the ID of this dm arrival purpose.
	*
	* @param id the ID of this dm arrival purpose
	*/
	public void setId(int id) {
		_dmArrivalPurpose.setId(id);
	}

	/**
	* Returns the purpose code of this dm arrival purpose.
	*
	* @return the purpose code of this dm arrival purpose
	*/
	public java.lang.String getPurposeCode() {
		return _dmArrivalPurpose.getPurposeCode();
	}

	/**
	* Sets the purpose code of this dm arrival purpose.
	*
	* @param purposeCode the purpose code of this dm arrival purpose
	*/
	public void setPurposeCode(java.lang.String purposeCode) {
		_dmArrivalPurpose.setPurposeCode(purposeCode);
	}

	/**
	* Returns the purpose name of this dm arrival purpose.
	*
	* @return the purpose name of this dm arrival purpose
	*/
	public java.lang.String getPurposeName() {
		return _dmArrivalPurpose.getPurposeName();
	}

	/**
	* Sets the purpose name of this dm arrival purpose.
	*
	* @param purposeName the purpose name of this dm arrival purpose
	*/
	public void setPurposeName(java.lang.String purposeName) {
		_dmArrivalPurpose.setPurposeName(purposeName);
	}

	/**
	* Returns the purpose name v n of this dm arrival purpose.
	*
	* @return the purpose name v n of this dm arrival purpose
	*/
	public java.lang.String getPurposeNameVN() {
		return _dmArrivalPurpose.getPurposeNameVN();
	}

	/**
	* Sets the purpose name v n of this dm arrival purpose.
	*
	* @param purposeNameVN the purpose name v n of this dm arrival purpose
	*/
	public void setPurposeNameVN(java.lang.String purposeNameVN) {
		_dmArrivalPurpose.setPurposeNameVN(purposeNameVN);
	}

	/**
	* Returns the is delete of this dm arrival purpose.
	*
	* @return the is delete of this dm arrival purpose
	*/
	public int getIsDelete() {
		return _dmArrivalPurpose.getIsDelete();
	}

	/**
	* Sets the is delete of this dm arrival purpose.
	*
	* @param isDelete the is delete of this dm arrival purpose
	*/
	public void setIsDelete(int isDelete) {
		_dmArrivalPurpose.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm arrival purpose.
	*
	* @return the marked as delete of this dm arrival purpose
	*/
	public int getMarkedAsDelete() {
		return _dmArrivalPurpose.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm arrival purpose.
	*
	* @param markedAsDelete the marked as delete of this dm arrival purpose
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmArrivalPurpose.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm arrival purpose.
	*
	* @return the modified date of this dm arrival purpose
	*/
	public java.util.Date getModifiedDate() {
		return _dmArrivalPurpose.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm arrival purpose.
	*
	* @param modifiedDate the modified date of this dm arrival purpose
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmArrivalPurpose.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm arrival purpose.
	*
	* @return the requested date of this dm arrival purpose
	*/
	public java.util.Date getRequestedDate() {
		return _dmArrivalPurpose.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm arrival purpose.
	*
	* @param requestedDate the requested date of this dm arrival purpose
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmArrivalPurpose.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm arrival purpose.
	*
	* @return the sync version of this dm arrival purpose
	*/
	public java.lang.String getSyncVersion() {
		return _dmArrivalPurpose.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm arrival purpose.
	*
	* @param syncVersion the sync version of this dm arrival purpose
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmArrivalPurpose.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmArrivalPurpose.isNew();
	}

	public void setNew(boolean n) {
		_dmArrivalPurpose.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmArrivalPurpose.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmArrivalPurpose.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmArrivalPurpose.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmArrivalPurpose.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmArrivalPurpose.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmArrivalPurpose.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmArrivalPurpose.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmArrivalPurposeWrapper((DmArrivalPurpose)_dmArrivalPurpose.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmArrivalPurpose dmArrivalPurpose) {
		return _dmArrivalPurpose.compareTo(dmArrivalPurpose);
	}

	@Override
	public int hashCode() {
		return _dmArrivalPurpose.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmArrivalPurpose> toCacheModel() {
		return _dmArrivalPurpose.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmArrivalPurpose toEscapedModel() {
		return new DmArrivalPurposeWrapper(_dmArrivalPurpose.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmArrivalPurpose.toString();
	}

	public java.lang.String toXmlString() {
		return _dmArrivalPurpose.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmArrivalPurpose.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmArrivalPurpose getWrappedDmArrivalPurpose() {
		return _dmArrivalPurpose;
	}

	public DmArrivalPurpose getWrappedModel() {
		return _dmArrivalPurpose;
	}

	public void resetOriginalValues() {
		_dmArrivalPurpose.resetOriginalValues();
	}

	private DmArrivalPurpose _dmArrivalPurpose;
}