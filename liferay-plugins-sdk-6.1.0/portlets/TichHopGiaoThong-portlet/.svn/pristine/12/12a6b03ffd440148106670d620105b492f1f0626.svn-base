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
public class UserPortSoap implements Serializable {
	public static UserPortSoap toSoapModel(UserPort model) {
		UserPortSoap soapModel = new UserPortSoap();

		soapModel.setId(model.getId());
		soapModel.setPortCode(model.getPortCode());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static UserPortSoap[] toSoapModels(UserPort[] models) {
		UserPortSoap[] soapModels = new UserPortSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserPortSoap[][] toSoapModels(UserPort[][] models) {
		UserPortSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserPortSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserPortSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserPortSoap[] toSoapModels(List<UserPort> models) {
		List<UserPortSoap> soapModels = new ArrayList<UserPortSoap>(models.size());

		for (UserPort model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserPortSoap[soapModels.size()]);
	}

	public UserPortSoap() {
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

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _id;
	private String _portCode;
	private long _userId;
	private Date _createDate;
	private int _status;
}