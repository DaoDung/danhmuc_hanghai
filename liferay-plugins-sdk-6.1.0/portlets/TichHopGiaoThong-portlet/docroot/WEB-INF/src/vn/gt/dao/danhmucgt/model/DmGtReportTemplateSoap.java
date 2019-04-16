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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmGtReportTemplateServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmGtReportTemplateServiceSoap
 * @generated
 */
public class DmGtReportTemplateSoap implements Serializable {
	public static DmGtReportTemplateSoap toSoapModel(DmGtReportTemplate model) {
		DmGtReportTemplateSoap soapModel = new DmGtReportTemplateSoap();

		soapModel.setId(model.getId());
		soapModel.setReportCode(model.getReportCode());
		soapModel.setReportName(model.getReportName());
		soapModel.setReportType(model.getReportType());
		soapModel.setCategory(model.getCategory());
		soapModel.setDescription(model.getDescription());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmGtReportTemplateSoap[] toSoapModels(
		DmGtReportTemplate[] models) {
		DmGtReportTemplateSoap[] soapModels = new DmGtReportTemplateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGtReportTemplateSoap[][] toSoapModels(
		DmGtReportTemplate[][] models) {
		DmGtReportTemplateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGtReportTemplateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGtReportTemplateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGtReportTemplateSoap[] toSoapModels(
		List<DmGtReportTemplate> models) {
		List<DmGtReportTemplateSoap> soapModels = new ArrayList<DmGtReportTemplateSoap>(models.size());

		for (DmGtReportTemplate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGtReportTemplateSoap[soapModels.size()]);
	}

	public DmGtReportTemplateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public int getReportCode() {
		return _reportCode;
	}

	public void setReportCode(int reportCode) {
		_reportCode = reportCode;
	}

	public String getReportName() {
		return _reportName;
	}

	public void setReportName(String reportName) {
		_reportName = reportName;
	}

	public int getReportType() {
		return _reportType;
	}

	public void setReportType(int reportType) {
		_reportType = reportType;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public int getIsDelete() {
		return _isDelete;
	}

	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public String getSyncVersion() {
		return _syncVersion;
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	private long _id;
	private int _reportCode;
	private String _reportName;
	private int _reportType;
	private String _category;
	private String _description;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}