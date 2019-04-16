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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    win_64
 * @generated
 */
public class DmSyncCategorySoap implements Serializable {
	public static DmSyncCategorySoap toSoapModel(DmSyncCategory model) {
		DmSyncCategorySoap soapModel = new DmSyncCategorySoap();

		soapModel.setId(model.getId());
		soapModel.setCategoryId(model.getCategoryId());
		soapModel.setCategoryDescription(model.getCategoryDescription());
		soapModel.setModifiedUser(model.getModifiedUser());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static DmSyncCategorySoap[] toSoapModels(DmSyncCategory[] models) {
		DmSyncCategorySoap[] soapModels = new DmSyncCategorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmSyncCategorySoap[][] toSoapModels(DmSyncCategory[][] models) {
		DmSyncCategorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmSyncCategorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmSyncCategorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmSyncCategorySoap[] toSoapModels(List<DmSyncCategory> models) {
		List<DmSyncCategorySoap> soapModels = new ArrayList<DmSyncCategorySoap>(models.size());

		for (DmSyncCategory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmSyncCategorySoap[soapModels.size()]);
	}

	public DmSyncCategorySoap() {
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

	public String getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(String categoryId) {
		_categoryId = categoryId;
	}

	public String getCategoryDescription() {
		return _categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		_categoryDescription = categoryDescription;
	}

	public String getModifiedUser() {
		return _modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _id;
	private String _categoryId;
	private String _categoryDescription;
	private String _modifiedUser;
	private Date _modifiedDate;
}