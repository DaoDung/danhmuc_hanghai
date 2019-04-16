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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmGtReportCategoryServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmGtReportCategoryServiceSoap
 * @generated
 */
public class DmGtReportCategorySoap implements Serializable {
	public static DmGtReportCategorySoap toSoapModel(DmGtReportCategory model) {
		DmGtReportCategorySoap soapModel = new DmGtReportCategorySoap();

		soapModel.setId(model.getId());
		soapModel.setCategory(model.getCategory());
		soapModel.setCategoryName(model.getCategoryName());
		soapModel.setCategoryOrder(model.getCategoryOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmGtReportCategorySoap[] toSoapModels(
		DmGtReportCategory[] models) {
		DmGtReportCategorySoap[] soapModels = new DmGtReportCategorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGtReportCategorySoap[][] toSoapModels(
		DmGtReportCategory[][] models) {
		DmGtReportCategorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGtReportCategorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGtReportCategorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGtReportCategorySoap[] toSoapModels(
		List<DmGtReportCategory> models) {
		List<DmGtReportCategorySoap> soapModels = new ArrayList<DmGtReportCategorySoap>(models.size());

		for (DmGtReportCategory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGtReportCategorySoap[soapModels.size()]);
	}

	public DmGtReportCategorySoap() {
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

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public String getCategoryName() {
		return _categoryName;
	}

	public void setCategoryName(String categoryName) {
		_categoryName = categoryName;
	}

	public int getCategoryOrder() {
		return _categoryOrder;
	}

	public void setCategoryOrder(int categoryOrder) {
		_categoryOrder = categoryOrder;
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
	private String _category;
	private String _categoryName;
	private int _categoryOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}