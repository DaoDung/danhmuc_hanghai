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
public class TempMaritimePaymentConfigSoap implements Serializable {
	public static TempMaritimePaymentConfigSoap toSoapModel(
		TempMaritimePaymentConfig model) {
		TempMaritimePaymentConfigSoap soapModel = new TempMaritimePaymentConfigSoap();

		soapModel.setId(model.getId());
		soapModel.setMaritimeCode(model.getMaritimeCode());
		soapModel.setMerchantCode(model.getMerchantCode());
		soapModel.setMerchantKey(model.getMerchantKey());
		soapModel.setMerchantName(model.getMerchantName());
		soapModel.setKeypayDomain(model.getKeypayDomain());
		soapModel.setKeypayVersion(model.getKeypayVersion());
		soapModel.setReturnURL(model.getReturnURL());

		return soapModel;
	}

	public static TempMaritimePaymentConfigSoap[] toSoapModels(
		TempMaritimePaymentConfig[] models) {
		TempMaritimePaymentConfigSoap[] soapModels = new TempMaritimePaymentConfigSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempMaritimePaymentConfigSoap[][] toSoapModels(
		TempMaritimePaymentConfig[][] models) {
		TempMaritimePaymentConfigSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempMaritimePaymentConfigSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempMaritimePaymentConfigSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempMaritimePaymentConfigSoap[] toSoapModels(
		List<TempMaritimePaymentConfig> models) {
		List<TempMaritimePaymentConfigSoap> soapModels = new ArrayList<TempMaritimePaymentConfigSoap>(models.size());

		for (TempMaritimePaymentConfig model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempMaritimePaymentConfigSoap[soapModels.size()]);
	}

	public TempMaritimePaymentConfigSoap() {
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

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	public String getMerchantCode() {
		return _merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		_merchantCode = merchantCode;
	}

	public String getMerchantKey() {
		return _merchantKey;
	}

	public void setMerchantKey(String merchantKey) {
		_merchantKey = merchantKey;
	}

	public String getMerchantName() {
		return _merchantName;
	}

	public void setMerchantName(String merchantName) {
		_merchantName = merchantName;
	}

	public String getKeypayDomain() {
		return _keypayDomain;
	}

	public void setKeypayDomain(String keypayDomain) {
		_keypayDomain = keypayDomain;
	}

	public String getKeypayVersion() {
		return _keypayVersion;
	}

	public void setKeypayVersion(String keypayVersion) {
		_keypayVersion = keypayVersion;
	}

	public String getReturnURL() {
		return _returnURL;
	}

	public void setReturnURL(String returnURL) {
		_returnURL = returnURL;
	}

	private long _id;
	private String _maritimeCode;
	private String _merchantCode;
	private String _merchantKey;
	private String _merchantName;
	private String _keypayDomain;
	private String _keypayVersion;
	private String _returnURL;
}