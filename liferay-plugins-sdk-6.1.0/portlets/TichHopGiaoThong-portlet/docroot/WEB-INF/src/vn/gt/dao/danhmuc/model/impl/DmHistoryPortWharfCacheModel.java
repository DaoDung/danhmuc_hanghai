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

import vn.gt.dao.danhmuc.model.DmHistoryPortWharf;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryPortWharf in entity cache.
 *
 * @author win_64
 * @see DmHistoryPortWharf
 * @generated
 */
public class DmHistoryPortWharfCacheModel implements CacheModel<DmHistoryPortWharf>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", portWharfCode=");
		sb.append(portWharfCode);
		sb.append(", portWharfName=");
		sb.append(portWharfName);
		sb.append(", portWharfNameVN=");
		sb.append(portWharfNameVN);
		sb.append(", portWharfType=");
		sb.append(portWharfType);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
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

	public DmHistoryPortWharf toEntityModel() {
		DmHistoryPortWharfImpl dmHistoryPortWharfImpl = new DmHistoryPortWharfImpl();

		dmHistoryPortWharfImpl.setId(id);

		if (portWharfCode == null) {
			dmHistoryPortWharfImpl.setPortWharfCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortWharfImpl.setPortWharfCode(portWharfCode);
		}

		if (portWharfName == null) {
			dmHistoryPortWharfImpl.setPortWharfName(StringPool.BLANK);
		}
		else {
			dmHistoryPortWharfImpl.setPortWharfName(portWharfName);
		}

		if (portWharfNameVN == null) {
			dmHistoryPortWharfImpl.setPortWharfNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryPortWharfImpl.setPortWharfNameVN(portWharfNameVN);
		}

		dmHistoryPortWharfImpl.setPortWharfType(portWharfType);

		if (portHarbourCode == null) {
			dmHistoryPortWharfImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortWharfImpl.setPortHarbourCode(portHarbourCode);
		}

		if (portCode == null) {
			dmHistoryPortWharfImpl.setPortCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortWharfImpl.setPortCode(portCode);
		}

		if (portRegionCode == null) {
			dmHistoryPortWharfImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			dmHistoryPortWharfImpl.setPortRegionCode(portRegionCode);
		}

		if (note == null) {
			dmHistoryPortWharfImpl.setNote(StringPool.BLANK);
		}
		else {
			dmHistoryPortWharfImpl.setNote(note);
		}

		dmHistoryPortWharfImpl.setIsDelete(isDelete);
		dmHistoryPortWharfImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryPortWharfImpl.setModifiedDate(null);
		}
		else {
			dmHistoryPortWharfImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryPortWharfImpl.setRequestedDate(null);
		}
		else {
			dmHistoryPortWharfImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryPortWharfImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryPortWharfImpl.setSyncVersion(syncVersion);
		}

		dmHistoryPortWharfImpl.resetOriginalValues();

		return dmHistoryPortWharfImpl;
	}

	public int id;
	public String portWharfCode;
	public String portWharfName;
	public String portWharfNameVN;
	public int portWharfType;
	public String portHarbourCode;
	public String portCode;
	public String portRegionCode;
	public String note;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}