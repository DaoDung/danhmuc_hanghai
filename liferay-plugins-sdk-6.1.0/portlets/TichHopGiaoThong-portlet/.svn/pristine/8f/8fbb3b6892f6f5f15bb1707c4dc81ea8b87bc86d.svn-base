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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.noticeandmessage.service.TempMaritimePaymentConfigLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class TempMaritimePaymentConfigClp extends BaseModelImpl<TempMaritimePaymentConfig>
	implements TempMaritimePaymentConfig {
	public TempMaritimePaymentConfigClp() {
	}

	public Class<?> getModelClass() {
		return TempMaritimePaymentConfig.class;
	}

	public String getModelClassName() {
		return TempMaritimePaymentConfig.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempMaritimePaymentConfigLocalServiceUtil.addTempMaritimePaymentConfig(this);
		}
		else {
			TempMaritimePaymentConfigLocalServiceUtil.updateTempMaritimePaymentConfig(this);
		}
	}

	@Override
	public TempMaritimePaymentConfig toEscapedModel() {
		return (TempMaritimePaymentConfig)Proxy.newProxyInstance(TempMaritimePaymentConfig.class.getClassLoader(),
			new Class[] { TempMaritimePaymentConfig.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempMaritimePaymentConfigClp clone = new TempMaritimePaymentConfigClp();

		clone.setId(getId());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setMerchantCode(getMerchantCode());
		clone.setMerchantKey(getMerchantKey());
		clone.setMerchantName(getMerchantName());
		clone.setKeypayDomain(getKeypayDomain());
		clone.setKeypayVersion(getKeypayVersion());
		clone.setReturnURL(getReturnURL());

		return clone;
	}

	public int compareTo(TempMaritimePaymentConfig tempMaritimePaymentConfig) {
		int value = 0;

		if (getId() < tempMaritimePaymentConfig.getId()) {
			value = -1;
		}
		else if (getId() > tempMaritimePaymentConfig.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TempMaritimePaymentConfigClp tempMaritimePaymentConfig = null;

		try {
			tempMaritimePaymentConfig = (TempMaritimePaymentConfigClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempMaritimePaymentConfig.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", merchantCode=");
		sb.append(getMerchantCode());
		sb.append(", merchantKey=");
		sb.append(getMerchantKey());
		sb.append(", merchantName=");
		sb.append(getMerchantName());
		sb.append(", keypayDomain=");
		sb.append(getKeypayDomain());
		sb.append(", keypayVersion=");
		sb.append(getKeypayVersion());
		sb.append(", returnURL=");
		sb.append(getReturnURL());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>merchantCode</column-name><column-value><![CDATA[");
		sb.append(getMerchantCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>merchantKey</column-name><column-value><![CDATA[");
		sb.append(getMerchantKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>merchantName</column-name><column-value><![CDATA[");
		sb.append(getMerchantName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayDomain</column-name><column-value><![CDATA[");
		sb.append(getKeypayDomain());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayVersion</column-name><column-value><![CDATA[");
		sb.append(getKeypayVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>returnURL</column-name><column-value><![CDATA[");
		sb.append(getReturnURL());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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