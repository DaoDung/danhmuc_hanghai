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

import vn.gt.dao.danhmuc.model.DmPortHarbour;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmPortHarbour in entity cache.
 *
 * @author win_64
 * @see DmPortHarbour
 * @generated
 */
public class DmPortHarbourCacheModel implements CacheModel<DmPortHarbour>,
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

	public DmPortHarbour toEntityModel() {
		DmPortHarbourImpl dmPortHarbourImpl = new DmPortHarbourImpl();

		dmPortHarbourImpl.setId(id);

		if (portHarbourCode == null) {
			dmPortHarbourImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortHarbourCode(portHarbourCode);
		}

		if (portHarbourName == null) {
			dmPortHarbourImpl.setPortHarbourName(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortHarbourName(portHarbourName);
		}

		if (portHarbourNameVN == null) {
			dmPortHarbourImpl.setPortHarbourNameVN(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortHarbourNameVN(portHarbourNameVN);
		}

		dmPortHarbourImpl.setPortHarbourType(portHarbourType);

		if (portRegion == null) {
			dmPortHarbourImpl.setPortRegion(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortRegion(portRegion);
		}

		if (portCode == null) {
			dmPortHarbourImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortCode(portCode);
		}

		if (portRegionCode == null) {
			dmPortHarbourImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setPortRegionCode(portRegionCode);
		}

		if (note == null) {
			dmPortHarbourImpl.setNote(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setNote(note);
		}

		dmPortHarbourImpl.setIsDelete(isDelete);
		dmPortHarbourImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmPortHarbourImpl.setModifiedDate(null);
		}
		else {
			dmPortHarbourImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmPortHarbourImpl.setRequestedDate(null);
		}
		else {
			dmPortHarbourImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmPortHarbourImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmPortHarbourImpl.setSyncVersion(syncVersion);
		}

		dmPortHarbourImpl.resetOriginalValues();

		return dmPortHarbourImpl;
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