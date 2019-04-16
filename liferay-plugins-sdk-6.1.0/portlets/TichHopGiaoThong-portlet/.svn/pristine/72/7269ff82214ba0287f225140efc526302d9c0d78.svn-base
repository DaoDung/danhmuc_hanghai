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

package vn.gt.dao.danhmuc.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.danhmuc.model.DmHistoryRepresentative;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryRepresentative in entity cache.
 *
 * @author win_64
 * @see DmHistoryRepresentative
 * @generated
 */
public class DmHistoryRepresentativeCacheModel implements CacheModel<DmHistoryRepresentative>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", repCode=");
		sb.append(repCode);
		sb.append(", repName=");
		sb.append(repName);
		sb.append(", repNameVN=");
		sb.append(repNameVN);
		sb.append(", repLevel=");
		sb.append(repLevel);
		sb.append(", repOrder=");
		sb.append(repOrder);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
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

	public DmHistoryRepresentative toEntityModel() {
		DmHistoryRepresentativeImpl dmHistoryRepresentativeImpl = new DmHistoryRepresentativeImpl();

		dmHistoryRepresentativeImpl.setId(id);

		if (repCode == null) {
			dmHistoryRepresentativeImpl.setRepCode(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setRepCode(repCode);
		}

		if (repName == null) {
			dmHistoryRepresentativeImpl.setRepName(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setRepName(repName);
		}

		if (repNameVN == null) {
			dmHistoryRepresentativeImpl.setRepNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setRepNameVN(repNameVN);
		}

		dmHistoryRepresentativeImpl.setRepLevel(repLevel);
		dmHistoryRepresentativeImpl.setRepOrder(repOrder);

		if (maritimeCode == null) {
			dmHistoryRepresentativeImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setMaritimeCode(maritimeCode);
		}

		dmHistoryRepresentativeImpl.setIsDelete(isDelete);
		dmHistoryRepresentativeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryRepresentativeImpl.setModifiedDate(null);
		}
		else {
			dmHistoryRepresentativeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryRepresentativeImpl.setRequestedDate(null);
		}
		else {
			dmHistoryRepresentativeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryRepresentativeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setSyncVersion(syncVersion);
		}

		dmHistoryRepresentativeImpl.resetOriginalValues();

		return dmHistoryRepresentativeImpl;
	}

	public int id;
	public String repCode;
	public String repName;
	public String repNameVN;
	public int repLevel;
	public int repOrder;
	public String maritimeCode;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}