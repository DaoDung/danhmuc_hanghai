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

package vn.gt.dao.danhmucgt.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.danhmucgt.model.DmCertificate;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmCertificate in entity cache.
 *
 * @author win_64
 * @see DmCertificate
 * @generated
 */
public class DmCertificateCacheModel implements CacheModel<DmCertificate>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", certificateCode=");
		sb.append(certificateCode);
		sb.append(", certificateName=");
		sb.append(certificateName);
		sb.append(", certificateNameVN=");
		sb.append(certificateNameVN);
		sb.append(", certificateOrder=");
		sb.append(certificateOrder);
		sb.append(", isDelete=");
		sb.append(isDelete);
		sb.append(", markedAsDelete=");
		sb.append(markedAsDelete);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", syncVersion=");
		sb.append(syncVersion);
		sb.append("}");

		return sb.toString();
	}

	public DmCertificate toEntityModel() {
		DmCertificateImpl dmCertificateImpl = new DmCertificateImpl();

		dmCertificateImpl.setId(id);

		if (certificateCode == null) {
			dmCertificateImpl.setCertificateCode(StringPool.BLANK);
		}
		else {
			dmCertificateImpl.setCertificateCode(certificateCode);
		}

		if (certificateName == null) {
			dmCertificateImpl.setCertificateName(StringPool.BLANK);
		}
		else {
			dmCertificateImpl.setCertificateName(certificateName);
		}

		if (certificateNameVN == null) {
			dmCertificateImpl.setCertificateNameVN(StringPool.BLANK);
		}
		else {
			dmCertificateImpl.setCertificateNameVN(certificateNameVN);
		}

		dmCertificateImpl.setCertificateOrder(certificateOrder);
		dmCertificateImpl.setIsDelete(isDelete);
		dmCertificateImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmCertificateImpl.setModifiedDate(null);
		}
		else {
			dmCertificateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmCertificateImpl.setRequestedDate(null);
		}
		else {
			dmCertificateImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmCertificateImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmCertificateImpl.setSyncVersion(syncVersion);
		}

		dmCertificateImpl.resetOriginalValues();

		return dmCertificateImpl;
	}

	public long id;
	public String certificateCode;
	public String certificateName;
	public String certificateNameVN;
	public int certificateOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}