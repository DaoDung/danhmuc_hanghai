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

import vn.gt.dao.danhmuc.model.DmHistoryPortHarbour;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryPortHarbour in entity cache.
 *
 * @author win_64
 * @see DmHistoryPortHarbour
 * @generated
 */
public class DmHistoryPortHarbourCacheModel implements CacheModel<DmHistoryPortHarbour>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
		sb.append(", portHarbourName=");
		sb.append(portHarbourName);
		sb.append(", portHarbourNameVN=");
		sb.append(portHarbourNameVN);
		sb.append(", portHarbourType=");
		sb.append(portHarbourType);
		sb.append(", portRegion=");
		sb.append(portRegion);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", portRegionCode=");
		sb.append(portRegionCode);
		sb.append(", note=");
		sb.append(note);
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

	public DmHistoryPortHarbour toEntityModel() {
		DmHistoryPortHarbourImpl dmHistoryPortHarbourImpl = new DmHistoryPortHarbourImpl();

		dmHistoryPortHarbourImpl.setId(id);

		if (portHarbourCode == null) {
			dmHistoryPortHarbourImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortHarbourImpl.setPortHarbourCode(portHarbourCode);
		}

		if (portHarbourName == null) {
			dmHistoryPortHarbourImpl.setPortHarbourName(StringPool.BLANK);
		}
		else {
			dmHistoryPortHarbourImpl.setPortHarbourName(portHarbourName);
		}

		if (portHarbourNameVN == null) {
			dmHistoryPortHarbourImpl.setPortHarbourNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryPortHarbourImpl.setPortHarbourNameVN(portHarbourNameVN);
		}

		dmHistoryPortHarbourImpl.setPortHarbourType(portHarbourType);

		if (portRegion == null) {
			dmHistoryPortHarbourImpl.setPortRegion(StringPool.BLANK);
		}
		else {
			dmHistoryPortHarbourImpl.setPortRegion(portRegion);
		}

		if (portCode == null) {
			dmHistoryPortHarbourImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortHarbourImpl.setPortCode(portCode);
		}

		if (portRegionCode == null) {
			dmHistoryPortHarbourImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortHarbourImpl.setPortRegionCode(portRegionCode);
		}

		if (note == null) {
			dmHistoryPortHarbourImpl.setNote(StringPool.BLANK);
		}
		else {
			dmHistoryPortHarbourImpl.setNote(note);
		}

		dmHistoryPortHarbourImpl.setIsDelete(isDelete);
		dmHistoryPortHarbourImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryPortHarbourImpl.setModifiedDate(null);
		}
		else {
			dmHistoryPortHarbourImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryPortHarbourImpl.setRequestedDate(null);
		}
		else {
			dmHistoryPortHarbourImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryPortHarbourImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryPortHarbourImpl.setSyncVersion(syncVersion);
		}

		dmHistoryPortHarbourImpl.resetOriginalValues();

		return dmHistoryPortHarbourImpl;
	}

	public int id;
	public String portHarbourCode;
	public String portHarbourName;
	public String portHarbourNameVN;
	public int portHarbourType;
	public String portRegion;
	public String portCode;
	public String portRegionCode;
	public String note;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}