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

package vn.gt.dao.noticeandmessage.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link Modify}.
 * </p>
 *
 * @author    win_64
 * @see       Modify
 * @generated
 */
public class ModifyWrapper implements Modify, ModelWrapper<Modify> {
	public ModifyWrapper(Modify modify) {
		_modify = modify;
	}

	public Class<?> getModelClass() {
		return Modify.class;
	}

	public String getModelClassName() {
		return Modify.class.getName();
	}

	/**
	* Returns the primary key of this modify.
	*
	* @return the primary key of this modify
	*/
	public long getPrimaryKey() {
		return _modify.getPrimaryKey();
	}

	/**
	* Sets the primary key of this modify.
	*
	* @param primaryKey the primary key of this modify
	*/
	public void setPrimaryKey(long primaryKey) {
		_modify.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this modify.
	*
	* @return the ID of this modify
	*/
	public long getId() {
		return _modify.getId();
	}

	/**
	* Sets the ID of this modify.
	*
	* @param id the ID of this modify
	*/
	public void setId(long id) {
		_modify.setId(id);
	}

	/**
	* Returns the modify code of this modify.
	*
	* @return the modify code of this modify
	*/
	public java.lang.String getModifyCode() {
		return _modify.getModifyCode();
	}

	/**
	* Sets the modify code of this modify.
	*
	* @param modifyCode the modify code of this modify
	*/
	public void setModifyCode(java.lang.String modifyCode) {
		_modify.setModifyCode(modifyCode);
	}

	/**
	* Returns the modify desc of this modify.
	*
	* @return the modify desc of this modify
	*/
	public java.lang.String getModifyDesc() {
		return _modify.getModifyDesc();
	}

	/**
	* Sets the modify desc of this modify.
	*
	* @param modifyDesc the modify desc of this modify
	*/
	public void setModifyDesc(java.lang.String modifyDesc) {
		_modify.setModifyDesc(modifyDesc);
	}

	/**
	* Returns the organization of this modify.
	*
	* @return the organization of this modify
	*/
	public java.lang.String getOrganization() {
		return _modify.getOrganization();
	}

	/**
	* Sets the organization of this modify.
	*
	* @param organization the organization of this modify
	*/
	public void setOrganization(java.lang.String organization) {
		_modify.setOrganization(organization);
	}

	/**
	* Returns the division of this modify.
	*
	* @return the division of this modify
	*/
	public java.lang.String getDivision() {
		return _modify.getDivision();
	}

	/**
	* Sets the division of this modify.
	*
	* @param division the division of this modify
	*/
	public void setDivision(java.lang.String division) {
		_modify.setDivision(division);
	}

	/**
	* Returns the name of this modify.
	*
	* @return the name of this modify
	*/
	public java.lang.String getName() {
		return _modify.getName();
	}

	/**
	* Sets the name of this modify.
	*
	* @param name the name of this modify
	*/
	public void setName(java.lang.String name) {
		_modify.setName(name);
	}

	/**
	* Returns the modify date of this modify.
	*
	* @return the modify date of this modify
	*/
	public java.util.Date getModifyDate() {
		return _modify.getModifyDate();
	}

	/**
	* Sets the modify date of this modify.
	*
	* @param modifyDate the modify date of this modify
	*/
	public void setModifyDate(java.util.Date modifyDate) {
		_modify.setModifyDate(modifyDate);
	}

	/**
	* Returns the document name of this modify.
	*
	* @return the document name of this modify
	*/
	public long getDocumentName() {
		return _modify.getDocumentName();
	}

	/**
	* Sets the document name of this modify.
	*
	* @param documentName the document name of this modify
	*/
	public void setDocumentName(long documentName) {
		_modify.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this modify.
	*
	* @return the document year of this modify
	*/
	public long getDocumentYear() {
		return _modify.getDocumentYear();
	}

	/**
	* Sets the document year of this modify.
	*
	* @param documentYear the document year of this modify
	*/
	public void setDocumentYear(long documentYear) {
		_modify.setDocumentYear(documentYear);
	}

	public boolean isNew() {
		return _modify.isNew();
	}

	public void setNew(boolean n) {
		_modify.setNew(n);
	}

	public boolean isCachedModel() {
		return _modify.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_modify.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _modify.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _modify.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_modify.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _modify.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_modify.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ModifyWrapper((Modify)_modify.clone());
	}

	public int compareTo(vn.gt.dao.noticeandmessage.model.Modify modify) {
		return _modify.compareTo(modify);
	}

	@Override
	public int hashCode() {
		return _modify.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.Modify> toCacheModel() {
		return _modify.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.Modify toEscapedModel() {
		return new ModifyWrapper(_modify.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _modify.toString();
	}

	public java.lang.String toXmlString() {
		return _modify.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_modify.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Modify getWrappedModify() {
		return _modify;
	}

	public Modify getWrappedModel() {
		return _modify;
	}

	public void resetOriginalValues() {
		_modify.resetOriginalValues();
	}

	private Modify _modify;
}