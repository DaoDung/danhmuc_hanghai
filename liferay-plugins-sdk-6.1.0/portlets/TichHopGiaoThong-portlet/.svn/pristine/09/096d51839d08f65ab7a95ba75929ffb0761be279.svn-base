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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempCargoItemsServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempCargoItemsServiceSoap
 * @generated
 */
public class TempCargoItemsSoap implements Serializable {
	public static TempCargoItemsSoap toSoapModel(TempCargoItems model) {
		TempCargoItemsSoap soapModel = new TempCargoItemsSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setCargoCategory(model.getCargoCategory());
		soapModel.setCargoType(model.getCargoType());
		soapModel.setCargoCode(model.getCargoCode());
		soapModel.setDescription(model.getDescription());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setUnit(model.getUnit());
		soapModel.setSequence(model.getSequence());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static TempCargoItemsSoap[] toSoapModels(TempCargoItems[] models) {
		TempCargoItemsSoap[] soapModels = new TempCargoItemsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempCargoItemsSoap[][] toSoapModels(TempCargoItems[][] models) {
		TempCargoItemsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempCargoItemsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempCargoItemsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempCargoItemsSoap[] toSoapModels(List<TempCargoItems> models) {
		List<TempCargoItemsSoap> soapModels = new ArrayList<TempCargoItemsSoap>(models.size());

		for (TempCargoItems model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempCargoItemsSoap[soapModels.size()]);
	}

	public TempCargoItemsSoap() {
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

	public String getRequestCode() {
		return _requestCode;
	}

	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getCargoCategory() {
		return _cargoCategory;
	}

	public void setCargoCategory(String cargoCategory) {
		_cargoCategory = cargoCategory;
	}

	public String getCargoType() {
		return _cargoType;
	}

	public void setCargoType(String cargoType) {
		_cargoType = cargoType;
	}

	public String getCargoCode() {
		return _cargoCode;
	}

	public void setCargoCode(String cargoCode) {
		_cargoCode = cargoCode;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getQuantity() {
		return _quantity;
	}

	public void setQuantity(double quantity) {
		_quantity = quantity;
	}

	public String getUnit() {
		return _unit;
	}

	public void setUnit(String unit) {
		_unit = unit;
	}

	public int getSequence() {
		return _sequence;
	}

	public void setSequence(int sequence) {
		_sequence = sequence;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _id;
	private String _requestCode;
	private long _documentName;
	private int _documentYear;
	private String _cargoCategory;
	private String _cargoType;
	private String _cargoCode;
	private String _description;
	private double _quantity;
	private String _unit;
	private int _sequence;
	private Date _modifiedDate;
}