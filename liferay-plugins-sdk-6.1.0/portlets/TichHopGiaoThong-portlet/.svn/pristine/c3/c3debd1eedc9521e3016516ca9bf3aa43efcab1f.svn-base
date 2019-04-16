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

import vn.gt.dao.danhmuc.model.HistorySyncVersion;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing HistorySyncVersion in entity cache.
 *
 * @author win_64
 * @see HistorySyncVersion
 * @generated
 */
public class HistorySyncVersionCacheModel implements CacheModel<HistorySyncVersion>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", timeofPublish=");
		sb.append(timeofPublish);
		sb.append(", categoryID=");
		sb.append(categoryID);
		sb.append(", syncUnit=");
		sb.append(syncUnit);
		sb.append(", syncUser=");
		sb.append(syncUser);
		sb.append(", syncVersion=");
		sb.append(syncVersion);
		sb.append(", latestValueDate=");
		sb.append(latestValueDate);
		sb.append("}");

		return sb.toString();
	}

	public HistorySyncVersion toEntityModel() {
		HistorySyncVersionImpl historySyncVersionImpl = new HistorySyncVersionImpl();

		historySyncVersionImpl.setId(id);

		if (requestedDate == Long.MIN_VALUE) {
			historySyncVersionImpl.setRequestedDate(null);
		}
		else {
			historySyncVersionImpl.setRequestedDate(new Date(requestedDate));
		}

		if (timeofPublish == Long.MIN_VALUE) {
			historySyncVersionImpl.setTimeofPublish(null);
		}
		else {
			historySyncVersionImpl.setTimeofPublish(new Date(timeofPublish));
		}

		if (categoryID == null) {
			historySyncVersionImpl.setCategoryID(StringPool.BLANK);
		}
		else {
			historySyncVersionImpl.setCategoryID(categoryID);
		}

		if (syncUnit == null) {
			historySyncVersionImpl.setSyncUnit(StringPool.BLANK);
		}
		else {
			historySyncVersionImpl.setSyncUnit(syncUnit);
		}

		if (syncUser == null) {
			historySyncVersionImpl.setSyncUser(StringPool.BLANK);
		}
		else {
			historySyncVersionImpl.setSyncUser(syncUser);
		}

		if (syncVersion == null) {
			historySyncVersionImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			historySyncVersionImpl.setSyncVersion(syncVersion);
		}

		if (latestValueDate == Long.MIN_VALUE) {
			historySyncVersionImpl.setLatestValueDate(null);
		}
		else {
			historySyncVersionImpl.setLatestValueDate(new Date(latestValueDate));
		}

		historySyncVersionImpl.resetOriginalValues();

		return historySyncVersionImpl;
	}

	public long id;
	public long requestedDate;
	public long timeofPublish;
	public String categoryID;
	public String syncUnit;
	public String syncUser;
	public String syncVersion;
	public long latestValueDate;
}