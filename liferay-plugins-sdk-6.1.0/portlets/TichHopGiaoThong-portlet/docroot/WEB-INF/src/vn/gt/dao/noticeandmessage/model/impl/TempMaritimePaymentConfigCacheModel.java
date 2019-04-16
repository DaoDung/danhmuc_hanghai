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

package vn.gt.dao.noticeandmessage.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig;

import java.io.Serializable;

/**
 * The cache model class for representing TempMaritimePaymentConfig in entity cache.
 *
 * @author win_64
 * @see TempMaritimePaymentConfig
 * @generated
 */
public class TempMaritimePaymentConfigCacheModel implements CacheModel<TempMaritimePaymentConfig>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
		sb.append(", merchantCode=");
		sb.append(merchantCode);
		sb.append(", merchantKey=");
		sb.append(merchantKey);
		sb.append(", merchantName=");
		sb.append(merchantName);
		sb.append(", keypayDomain=");
		sb.append(keypayDomain);
		sb.append(", keypayVersion=");
		sb.append(keypayVersion);
		sb.append(", returnURL=");
		sb.append(returnURL);
		sb.append("}");

		return sb.toString();
	}

	public TempMaritimePaymentConfig toEntityModel() {
		TempMaritimePaymentConfigImpl tempMaritimePaymentConfigImpl = new TempMaritimePaymentConfigImpl();

		tempMaritimePaymentConfigImpl.setId(id);

		if (maritimeCode == null) {
			tempMaritimePaymentConfigImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			tempMaritimePaymentConfigImpl.setMaritimeCode(maritimeCode);
		}

		if (merchantCode == null) {
			tempMaritimePaymentConfigImpl.setMerchantCode(StringPool.BLANK);
		}
		else {
			tempMaritimePaymentConfigImpl.setMerchantCode(merchantCode);
		}

		if (merchantKey == null) {
			tempMaritimePaymentConfigImpl.setMerchantKey(StringPool.BLANK);
		}
		else {
			tempMaritimePaymentConfigImpl.setMerchantKey(merchantKey);
		}

		if (merchantName == null) {
			tempMaritimePaymentConfigImpl.setMerchantName(StringPool.BLANK);
		}
		else {
			tempMaritimePaymentConfigImpl.setMerchantName(merchantName);
		}

		if (keypayDomain == null) {
			tempMaritimePaymentConfigImpl.setKeypayDomain(StringPool.BLANK);
		}
		else {
			tempMaritimePaymentConfigImpl.setKeypayDomain(keypayDomain);
		}

		if (keypayVersion == null) {
			tempMaritimePaymentConfigImpl.setKeypayVersion(StringPool.BLANK);
		}
		else {
			tempMaritimePaymentConfigImpl.setKeypayVersion(keypayVersion);
		}

		if (returnURL == null) {
			tempMaritimePaymentConfigImpl.setReturnURL(StringPool.BLANK);
		}
		else {
			tempMaritimePaymentConfigImpl.setReturnURL(returnURL);
		}

		tempMaritimePaymentConfigImpl.resetOriginalValues();

		return tempMaritimePaymentConfigImpl;
	}

	public long id;
	public String maritimeCode;
	public String merchantCode;
	public String merchantKey;
	public String merchantName;
	public String keypayDomain;
	public String keypayVersion;
	public String returnURL;
}