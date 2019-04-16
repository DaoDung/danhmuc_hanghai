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

package vn.gt.dao.nhapcanh.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.nhapcanh.service.http.ResponseBoServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.nhapcanh.service.http.ResponseBoServiceSoap
 * @generated
 */
public class ResponseBoSoap implements Serializable {
	public static ResponseBoSoap toSoapModel(ResponseBo model) {
		ResponseBoSoap soapModel = new ResponseBoSoap();

		soapModel.setId(model.getId());
		soapModel.setIsSuccess(model.getIsSuccess());
		soapModel.setErrorMessage(model.getErrorMessage());

		return soapModel;
	}

	public static ResponseBoSoap[] toSoapModels(ResponseBo[] models) {
		ResponseBoSoap[] soapModels = new ResponseBoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResponseBoSoap[][] toSoapModels(ResponseBo[][] models) {
		ResponseBoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResponseBoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResponseBoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResponseBoSoap[] toSoapModels(List<ResponseBo> models) {
		List<ResponseBoSoap> soapModels = new ArrayList<ResponseBoSoap>(models.size());

		for (ResponseBo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResponseBoSoap[soapModels.size()]);
	}

	public ResponseBoSoap() {
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

	public int getIsSuccess() {
		return _isSuccess;
	}

	public void setIsSuccess(int isSuccess) {
		_isSuccess = isSuccess;
	}

	public String getErrorMessage() {
		return _errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		_errorMessage = errorMessage;
	}

	private long _id;
	private int _isSuccess;
	private String _errorMessage;
}