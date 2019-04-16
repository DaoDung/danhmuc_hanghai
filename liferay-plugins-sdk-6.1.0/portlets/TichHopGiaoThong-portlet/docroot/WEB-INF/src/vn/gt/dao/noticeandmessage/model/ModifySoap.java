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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.ModifyServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.ModifyServiceSoap
 * @generated
 */
public class ModifySoap implements Serializable {
	public static ModifySoap toSoapModel(Modify model) {
		ModifySoap soapModel = new ModifySoap();

		soapModel.setId(model.getId());
		soapModel.setModifyCode(model.getModifyCode());
		soapModel.setModifyDesc(model.getModifyDesc());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setDivision(model.getDivision());
		soapModel.setName(model.getName());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());

		return soapModel;
	}

	public static ModifySoap[] toSoapModels(Modify[] models) {
		ModifySoap[] soapModels = new ModifySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ModifySoap[][] toSoapModels(Modify[][] models) {
		ModifySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ModifySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ModifySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ModifySoap[] toSoapModels(List<Modify> models) {
		List<ModifySoap> soapModels = new ArrayList<ModifySoap>(models.size());

		for (Modify model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ModifySoap[soapModels.size()]);
	}

	public ModifySoap() {
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

	public String getModifyCode() {
		return _modifyCode;
	}

	public void setModifyCode(String modifyCode) {
		_modifyCode = modifyCode;
	}

	public String getModifyDesc() {
		return _modifyDesc;
	}

	public void setModifyDesc(String modifyDesc) {
		_modifyDesc = modifyDesc;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public long getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(long documentYear) {
		_documentYear = documentYear;
	}

	private long _id;
	private String _modifyCode;
	private String _modifyDesc;
	private String _organization;
	private String _division;
	private String _name;
	private Date _modifyDate;
	private long _documentName;
	private long _documentYear;
}