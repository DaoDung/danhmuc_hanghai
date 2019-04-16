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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmCertificateServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmCertificateServiceSoap
 * @generated
 */
public class DmCertificateSoap implements Serializable {
	public static DmCertificateSoap toSoapModel(DmCertificate model) {
		DmCertificateSoap soapModel = new DmCertificateSoap();

		soapModel.setId(model.getId());
		soapModel.setCertificateCode(model.getCertificateCode());
		soapModel.setCertificateName(model.getCertificateName());
		soapModel.setCertificateNameVN(model.getCertificateNameVN());
		soapModel.setCertificateOrder(model.getCertificateOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmCertificateSoap[] toSoapModels(DmCertificate[] models) {
		DmCertificateSoap[] soapModels = new DmCertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmCertificateSoap[][] toSoapModels(DmCertificate[][] models) {
		DmCertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmCertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmCertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmCertificateSoap[] toSoapModels(List<DmCertificate> models) {
		List<DmCertificateSoap> soapModels = new ArrayList<DmCertificateSoap>(models.size());

		for (DmCertificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmCertificateSoap[soapModels.size()]);
	}

	public DmCertificateSoap() {
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

	public String getCertificateCode() {
		return _certificateCode;
	}

	public void setCertificateCode(String certificateCode) {
		_certificateCode = certificateCode;
	}

	public String getCertificateName() {
		return _certificateName;
	}

	public void setCertificateName(String certificateName) {
		_certificateName = certificateName;
	}

	public String getCertificateNameVN() {
		return _certificateNameVN;
	}

	public void setCertificateNameVN(String certificateNameVN) {
		_certificateNameVN = certificateNameVN;
	}

	public int getCertificateOrder() {
		return _certificateOrder;
	}

	public void setCertificateOrder(int certificateOrder) {
		_certificateOrder = certificateOrder;
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
	private String _certificateCode;
	private String _certificateName;
	private String _certificateNameVN;
	private int _certificateOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}