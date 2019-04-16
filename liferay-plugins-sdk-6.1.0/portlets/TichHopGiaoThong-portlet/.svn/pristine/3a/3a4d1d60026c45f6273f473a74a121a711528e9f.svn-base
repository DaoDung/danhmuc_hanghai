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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    win_64
 * @generated
 */
public class TempWasteListSoap implements Serializable {
	public static TempWasteListSoap toSoapModel(TempWasteList model) {
		TempWasteListSoap soapModel = new TempWasteListSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setTypeCode(model.getTypeCode());
		soapModel.setTypeName(model.getTypeName());
		soapModel.setWeight(model.getWeight());
		soapModel.setUnit(model.getUnit());

		return soapModel;
	}

	public static TempWasteListSoap[] toSoapModels(TempWasteList[] models) {
		TempWasteListSoap[] soapModels = new TempWasteListSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempWasteListSoap[][] toSoapModels(TempWasteList[][] models) {
		TempWasteListSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempWasteListSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempWasteListSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempWasteListSoap[] toSoapModels(List<TempWasteList> models) {
		List<TempWasteListSoap> soapModels = new ArrayList<TempWasteListSoap>(models.size());

		for (TempWasteList model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempWasteListSoap[soapModels.size()]);
	}

	public TempWasteListSoap() {
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

	public String getTypeCode() {
		return _typeCode;
	}

	public void setTypeCode(String typeCode) {
		_typeCode = typeCode;
	}

	public String getTypeName() {
		return _typeName;
	}

	public void setTypeName(String typeName) {
		_typeName = typeName;
	}

	public double getWeight() {
		return _weight;
	}

	public void setWeight(double weight) {
		_weight = weight;
	}

	public String getUnit() {
		return _unit;
	}

	public void setUnit(String unit) {
		_unit = unit;
	}

	private long _id;
	private String _requestCode;
	private long _documentName;
	private int _documentYear;
	private String _typeCode;
	private String _typeName;
	private double _weight;
	private String _unit;
}