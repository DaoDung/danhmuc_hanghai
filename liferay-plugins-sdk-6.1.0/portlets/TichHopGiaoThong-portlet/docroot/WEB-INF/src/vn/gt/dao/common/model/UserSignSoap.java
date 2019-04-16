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

package vn.gt.dao.common.model;

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
public class UserSignSoap implements Serializable {
	public static UserSignSoap toSoapModel(UserSign model) {
		UserSignSoap soapModel = new UserSignSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setPortCode(model.getPortCode());
		soapModel.setTitle(model.getTitle());
		soapModel.setRepresentative(model.getRepresentative());
		soapModel.setFileChuKyId(model.getFileChuKyId());
		soapModel.setFileConDauId(model.getFileConDauId());
		soapModel.setFileChungThuSoId(model.getFileChungThuSoId());
		soapModel.setModifyUser(model.getModifyUser());
		soapModel.setModifyDate(model.getModifyDate());

		return soapModel;
	}

	public static UserSignSoap[] toSoapModels(UserSign[] models) {
		UserSignSoap[] soapModels = new UserSignSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserSignSoap[][] toSoapModels(UserSign[][] models) {
		UserSignSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserSignSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserSignSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserSignSoap[] toSoapModels(List<UserSign> models) {
		List<UserSignSoap> soapModels = new ArrayList<UserSignSoap>(models.size());

		for (UserSign model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserSignSoap[soapModels.size()]);
	}

	public UserSignSoap() {
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getRepresentative() {
		return _representative;
	}

	public void setRepresentative(String representative) {
		_representative = representative;
	}

	public long getFileChuKyId() {
		return _fileChuKyId;
	}

	public void setFileChuKyId(long fileChuKyId) {
		_fileChuKyId = fileChuKyId;
	}

	public long getFileConDauId() {
		return _fileConDauId;
	}

	public void setFileConDauId(long fileConDauId) {
		_fileConDauId = fileConDauId;
	}

	public long getFileChungThuSoId() {
		return _fileChungThuSoId;
	}

	public void setFileChungThuSoId(long fileChungThuSoId) {
		_fileChungThuSoId = fileChungThuSoId;
	}

	public String getModifyUser() {
		return _modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		_modifyUser = modifyUser;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	private long _id;
	private long _userId;
	private String _portCode;
	private String _title;
	private String _representative;
	private long _fileChuKyId;
	private long _fileConDauId;
	private long _fileChungThuSoId;
	private String _modifyUser;
	private Date _modifyDate;
}