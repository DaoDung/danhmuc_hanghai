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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmuc.service.http.ThamSoHeThongServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmuc.service.http.ThamSoHeThongServiceSoap
 * @generated
 */
public class ThamSoHeThongSoap implements Serializable {
	public static ThamSoHeThongSoap toSoapModel(ThamSoHeThong model) {
		ThamSoHeThongSoap soapModel = new ThamSoHeThongSoap();

		soapModel.setId(model.getId());
		soapModel.setValueData(model.getValueData());
		soapModel.setKeyData(model.getKeyData());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static ThamSoHeThongSoap[] toSoapModels(ThamSoHeThong[] models) {
		ThamSoHeThongSoap[] soapModels = new ThamSoHeThongSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ThamSoHeThongSoap[][] toSoapModels(ThamSoHeThong[][] models) {
		ThamSoHeThongSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ThamSoHeThongSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ThamSoHeThongSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ThamSoHeThongSoap[] toSoapModels(List<ThamSoHeThong> models) {
		List<ThamSoHeThongSoap> soapModels = new ArrayList<ThamSoHeThongSoap>(models.size());

		for (ThamSoHeThong model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ThamSoHeThongSoap[soapModels.size()]);
	}

	public ThamSoHeThongSoap() {
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

	public String getValueData() {
		return _valueData;
	}

	public void setValueData(String valueData) {
		_valueData = valueData;
	}

	public String getKeyData() {
		return _keyData;
	}

	public void setKeyData(String keyData) {
		_keyData = keyData;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private String _valueData;
	private String _keyData;
	private String _description;
}