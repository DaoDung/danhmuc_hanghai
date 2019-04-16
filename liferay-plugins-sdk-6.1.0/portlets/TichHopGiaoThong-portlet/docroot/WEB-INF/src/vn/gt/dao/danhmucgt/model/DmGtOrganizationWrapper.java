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

package vn.gt.dao.danhmucgt.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmGtOrganization}.
 * </p>
 *
 * @author    win_64
 * @see       DmGtOrganization
 * @generated
 */
public class DmGtOrganizationWrapper implements DmGtOrganization,
	ModelWrapper<DmGtOrganization> {
	public DmGtOrganizationWrapper(DmGtOrganization dmGtOrganization) {
		_dmGtOrganization = dmGtOrganization;
	}

	public Class<?> getModelClass() {
		return DmGtOrganization.class;
	}

	public String getModelClassName() {
		return DmGtOrganization.class.getName();
	}

	/**
	* Returns the primary key of this dm gt organization.
	*
	* @return the primary key of this dm gt organization
	*/
	public long getPrimaryKey() {
		return _dmGtOrganization.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt organization.
	*
	* @param primaryKey the primary key of this dm gt organization
	*/
	public void setPrimaryKey(long primaryKey) {
		_dmGtOrganization.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt organization.
	*
	* @return the ID of this dm gt organization
	*/
	public long getId() {
		return _dmGtOrganization.getId();
	}

	/**
	* Sets the ID of this dm gt organization.
	*
	* @param id the ID of this dm gt organization
	*/
	public void setId(long id) {
		_dmGtOrganization.setId(id);
	}

	/**
	* Returns the organization code of this dm gt organization.
	*
	* @return the organization code of this dm gt organization
	*/
	public java.lang.String getOrganizationCode() {
		return _dmGtOrganization.getOrganizationCode();
	}

	/**
	* Sets the organization code of this dm gt organization.
	*
	* @param organizationCode the organization code of this dm gt organization
	*/
	public void setOrganizationCode(java.lang.String organizationCode) {
		_dmGtOrganization.setOrganizationCode(organizationCode);
	}

	/**
	* Returns the organization name of this dm gt organization.
	*
	* @return the organization name of this dm gt organization
	*/
	public java.lang.String getOrganizationName() {
		return _dmGtOrganization.getOrganizationName();
	}

	/**
	* Sets the organization name of this dm gt organization.
	*
	* @param organizationName the organization name of this dm gt organization
	*/
	public void setOrganizationName(java.lang.String organizationName) {
		_dmGtOrganization.setOrganizationName(organizationName);
	}

	/**
	* Returns the organization name v n of this dm gt organization.
	*
	* @return the organization name v n of this dm gt organization
	*/
	public java.lang.String getOrganizationNameVN() {
		return _dmGtOrganization.getOrganizationNameVN();
	}

	/**
	* Sets the organization name v n of this dm gt organization.
	*
	* @param organizationNameVN the organization name v n of this dm gt organization
	*/
	public void setOrganizationNameVN(java.lang.String organizationNameVN) {
		_dmGtOrganization.setOrganizationNameVN(organizationNameVN);
	}

	/**
	* Returns the organizationorder of this dm gt organization.
	*
	* @return the organizationorder of this dm gt organization
	*/
	public int getOrganizationorder() {
		return _dmGtOrganization.getOrganizationorder();
	}

	/**
	* Sets the organizationorder of this dm gt organization.
	*
	* @param organizationorder the organizationorder of this dm gt organization
	*/
	public void setOrganizationorder(int organizationorder) {
		_dmGtOrganization.setOrganizationorder(organizationorder);
	}

	/**
	* Returns the is delete of this dm gt organization.
	*
	* @return the is delete of this dm gt organization
	*/
	public int getIsDelete() {
		return _dmGtOrganization.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt organization.
	*
	* @param isDelete the is delete of this dm gt organization
	*/
	public void setIsDelete(int isDelete) {
		_dmGtOrganization.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt organization.
	*
	* @return the marked as delete of this dm gt organization
	*/
	public int getMarkedAsDelete() {
		return _dmGtOrganization.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt organization.
	*
	* @param markedAsDelete the marked as delete of this dm gt organization
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtOrganization.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt organization.
	*
	* @return the modified date of this dm gt organization
	*/
	public java.util.Date getModifiedDate() {
		return _dmGtOrganization.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt organization.
	*
	* @param modifiedDate the modified date of this dm gt organization
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtOrganization.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt organization.
	*
	* @return the requested date of this dm gt organization
	*/
	public java.util.Date getRequestedDate() {
		return _dmGtOrganization.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt organization.
	*
	* @param requestedDate the requested date of this dm gt organization
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtOrganization.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt organization.
	*
	* @return the sync version of this dm gt organization
	*/
	public java.lang.String getSyncVersion() {
		return _dmGtOrganization.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt organization.
	*
	* @param syncVersion the sync version of this dm gt organization
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtOrganization.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmGtOrganization.isNew();
	}

	public void setNew(boolean n) {
		_dmGtOrganization.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmGtOrganization.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmGtOrganization.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmGtOrganization.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtOrganization.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtOrganization.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtOrganization.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtOrganization.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtOrganizationWrapper((DmGtOrganization)_dmGtOrganization.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmucgt.model.DmGtOrganization dmGtOrganization) {
		return _dmGtOrganization.compareTo(dmGtOrganization);
	}

	@Override
	public int hashCode() {
		return _dmGtOrganization.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmucgt.model.DmGtOrganization> toCacheModel() {
		return _dmGtOrganization.toCacheModel();
	}

	public vn.gt.dao.danhmucgt.model.DmGtOrganization toEscapedModel() {
		return new DmGtOrganizationWrapper(_dmGtOrganization.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtOrganization.toString();
	}

	public java.lang.String toXmlString() {
		return _dmGtOrganization.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtOrganization.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmGtOrganization getWrappedDmGtOrganization() {
		return _dmGtOrganization;
	}

	public DmGtOrganization getWrappedModel() {
		return _dmGtOrganization;
	}

	public void resetOriginalValues() {
		_dmGtOrganization.resetOriginalValues();
	}

	private DmGtOrganization _dmGtOrganization;
}