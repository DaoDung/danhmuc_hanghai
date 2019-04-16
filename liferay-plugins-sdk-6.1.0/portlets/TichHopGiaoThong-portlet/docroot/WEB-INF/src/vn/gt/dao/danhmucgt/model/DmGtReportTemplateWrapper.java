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
 * This class is a wrapper for {@link DmGtReportTemplate}.
 * </p>
 *
 * @author    win_64
 * @see       DmGtReportTemplate
 * @generated
 */
public class DmGtReportTemplateWrapper implements DmGtReportTemplate,
	ModelWrapper<DmGtReportTemplate> {
	public DmGtReportTemplateWrapper(DmGtReportTemplate dmGtReportTemplate) {
		_dmGtReportTemplate = dmGtReportTemplate;
	}

	public Class<?> getModelClass() {
		return DmGtReportTemplate.class;
	}

	public String getModelClassName() {
		return DmGtReportTemplate.class.getName();
	}

	/**
	* Returns the primary key of this dm gt report template.
	*
	* @return the primary key of this dm gt report template
	*/
	public long getPrimaryKey() {
		return _dmGtReportTemplate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm gt report template.
	*
	* @param primaryKey the primary key of this dm gt report template
	*/
	public void setPrimaryKey(long primaryKey) {
		_dmGtReportTemplate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm gt report template.
	*
	* @return the ID of this dm gt report template
	*/
	public long getId() {
		return _dmGtReportTemplate.getId();
	}

	/**
	* Sets the ID of this dm gt report template.
	*
	* @param id the ID of this dm gt report template
	*/
	public void setId(long id) {
		_dmGtReportTemplate.setId(id);
	}

	/**
	* Returns the report code of this dm gt report template.
	*
	* @return the report code of this dm gt report template
	*/
	public int getReportCode() {
		return _dmGtReportTemplate.getReportCode();
	}

	/**
	* Sets the report code of this dm gt report template.
	*
	* @param reportCode the report code of this dm gt report template
	*/
	public void setReportCode(int reportCode) {
		_dmGtReportTemplate.setReportCode(reportCode);
	}

	/**
	* Returns the report name of this dm gt report template.
	*
	* @return the report name of this dm gt report template
	*/
	public java.lang.String getReportName() {
		return _dmGtReportTemplate.getReportName();
	}

	/**
	* Sets the report name of this dm gt report template.
	*
	* @param reportName the report name of this dm gt report template
	*/
	public void setReportName(java.lang.String reportName) {
		_dmGtReportTemplate.setReportName(reportName);
	}

	/**
	* Returns the report type of this dm gt report template.
	*
	* @return the report type of this dm gt report template
	*/
	public int getReportType() {
		return _dmGtReportTemplate.getReportType();
	}

	/**
	* Sets the report type of this dm gt report template.
	*
	* @param reportType the report type of this dm gt report template
	*/
	public void setReportType(int reportType) {
		_dmGtReportTemplate.setReportType(reportType);
	}

	/**
	* Returns the category of this dm gt report template.
	*
	* @return the category of this dm gt report template
	*/
	public java.lang.String getCategory() {
		return _dmGtReportTemplate.getCategory();
	}

	/**
	* Sets the category of this dm gt report template.
	*
	* @param category the category of this dm gt report template
	*/
	public void setCategory(java.lang.String category) {
		_dmGtReportTemplate.setCategory(category);
	}

	/**
	* Returns the description of this dm gt report template.
	*
	* @return the description of this dm gt report template
	*/
	public java.lang.String getDescription() {
		return _dmGtReportTemplate.getDescription();
	}

	/**
	* Sets the description of this dm gt report template.
	*
	* @param description the description of this dm gt report template
	*/
	public void setDescription(java.lang.String description) {
		_dmGtReportTemplate.setDescription(description);
	}

	/**
	* Returns the is delete of this dm gt report template.
	*
	* @return the is delete of this dm gt report template
	*/
	public int getIsDelete() {
		return _dmGtReportTemplate.getIsDelete();
	}

	/**
	* Sets the is delete of this dm gt report template.
	*
	* @param isDelete the is delete of this dm gt report template
	*/
	public void setIsDelete(int isDelete) {
		_dmGtReportTemplate.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm gt report template.
	*
	* @return the marked as delete of this dm gt report template
	*/
	public int getMarkedAsDelete() {
		return _dmGtReportTemplate.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm gt report template.
	*
	* @param markedAsDelete the marked as delete of this dm gt report template
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmGtReportTemplate.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm gt report template.
	*
	* @return the modified date of this dm gt report template
	*/
	public java.util.Date getModifiedDate() {
		return _dmGtReportTemplate.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm gt report template.
	*
	* @param modifiedDate the modified date of this dm gt report template
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmGtReportTemplate.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm gt report template.
	*
	* @return the requested date of this dm gt report template
	*/
	public java.util.Date getRequestedDate() {
		return _dmGtReportTemplate.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm gt report template.
	*
	* @param requestedDate the requested date of this dm gt report template
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmGtReportTemplate.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm gt report template.
	*
	* @return the sync version of this dm gt report template
	*/
	public java.lang.String getSyncVersion() {
		return _dmGtReportTemplate.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm gt report template.
	*
	* @param syncVersion the sync version of this dm gt report template
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmGtReportTemplate.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmGtReportTemplate.isNew();
	}

	public void setNew(boolean n) {
		_dmGtReportTemplate.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmGtReportTemplate.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmGtReportTemplate.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmGtReportTemplate.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmGtReportTemplate.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmGtReportTemplate.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmGtReportTemplate.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmGtReportTemplate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmGtReportTemplateWrapper((DmGtReportTemplate)_dmGtReportTemplate.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmucgt.model.DmGtReportTemplate dmGtReportTemplate) {
		return _dmGtReportTemplate.compareTo(dmGtReportTemplate);
	}

	@Override
	public int hashCode() {
		return _dmGtReportTemplate.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmucgt.model.DmGtReportTemplate> toCacheModel() {
		return _dmGtReportTemplate.toCacheModel();
	}

	public vn.gt.dao.danhmucgt.model.DmGtReportTemplate toEscapedModel() {
		return new DmGtReportTemplateWrapper(_dmGtReportTemplate.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmGtReportTemplate.toString();
	}

	public java.lang.String toXmlString() {
		return _dmGtReportTemplate.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtReportTemplate.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmGtReportTemplate getWrappedDmGtReportTemplate() {
		return _dmGtReportTemplate;
	}

	public DmGtReportTemplate getWrappedModel() {
		return _dmGtReportTemplate;
	}

	public void resetOriginalValues() {
		_dmGtReportTemplate.resetOriginalValues();
	}

	private DmGtReportTemplate _dmGtReportTemplate;
}