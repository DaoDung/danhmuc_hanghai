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
public class TempPersonListSoap implements Serializable {
	public static TempPersonListSoap toSoapModel(TempPersonList model) {
		TempPersonListSoap soapModel = new TempPersonListSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setName(model.getName());
		soapModel.setAge(model.getAge());
		soapModel.setNationalCode(model.getNationalCode());
		soapModel.setNationalName(model.getNationalName());
		soapModel.setIlnessStatus(model.getIlnessStatus());
		soapModel.setReasonOfDead(model.getReasonOfDead());
		soapModel.setPersonType(model.getPersonType());

		return soapModel;
	}

	public static TempPersonListSoap[] toSoapModels(TempPersonList[] models) {
		TempPersonListSoap[] soapModels = new TempPersonListSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempPersonListSoap[][] toSoapModels(TempPersonList[][] models) {
		TempPersonListSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempPersonListSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempPersonListSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempPersonListSoap[] toSoapModels(List<TempPersonList> models) {
		List<TempPersonListSoap> soapModels = new ArrayList<TempPersonListSoap>(models.size());

		for (TempPersonList model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempPersonListSoap[soapModels.size()]);
	}

	public TempPersonListSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAge() {
		return _age;
	}

	public void setAge(String age) {
		_age = age;
	}

	public String getNationalCode() {
		return _nationalCode;
	}

	public void setNationalCode(String nationalCode) {
		_nationalCode = nationalCode;
	}

	public String getNationalName() {
		return _nationalName;
	}

	public void setNationalName(String nationalName) {
		_nationalName = nationalName;
	}

	public String getIlnessStatus() {
		return _ilnessStatus;
	}

	public void setIlnessStatus(String ilnessStatus) {
		_ilnessStatus = ilnessStatus;
	}

	public String getReasonOfDead() {
		return _reasonOfDead;
	}

	public void setReasonOfDead(String reasonOfDead) {
		_reasonOfDead = reasonOfDead;
	}

	public int getPersonType() {
		return _personType;
	}

	public void setPersonType(int personType) {
		_personType = personType;
	}

	private long _id;
	private String _requestCode;
	private long _documentName;
	private int _documentYear;
	private String _name;
	private String _age;
	private String _nationalCode;
	private String _nationalName;
	private String _ilnessStatus;
	private String _reasonOfDead;
	private int _personType;
}