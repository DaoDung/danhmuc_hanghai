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

import vn.gt.dao.danhmucgt.model.DmGtReportCategory;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmGtReportCategory in entity cache.
 *
 * @author win_64
 * @see DmGtReportCategory
 * @generated
 */
public class DmGtReportCategoryCacheModel implements CacheModel<DmGtReportCategory>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", category=");
		sb.append(category);
		sb.append(", categoryName=");
		sb.append(categoryName);
		sb.append(", categoryOrder=");
		sb.append(categoryOrder);
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

	public DmGtReportCategory toEntityModel() {
		DmGtReportCategoryImpl dmGtReportCategoryImpl = new DmGtReportCategoryImpl();

		dmGtReportCategoryImpl.setId(id);

		if (category == null) {
			dmGtReportCategoryImpl.setCategory(StringPool.BLANK);
		}
		else {
			dmGtReportCategoryImpl.setCategory(category);
		}

		if (categoryName == null) {
			dmGtReportCategoryImpl.setCategoryName(StringPool.BLANK);
		}
		else {
			dmGtReportCategoryImpl.setCategoryName(categoryName);
		}

		dmGtReportCategoryImpl.setCategoryOrder(categoryOrder);
		dmGtReportCategoryImpl.setIsDelete(isDelete);
		dmGtReportCategoryImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtReportCategoryImpl.setModifiedDate(null);
		}
		else {
			dmGtReportCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtReportCategoryImpl.setRequestedDate(null);
		}
		else {
			dmGtReportCategoryImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtReportCategoryImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtReportCategoryImpl.setSyncVersion(syncVersion);
		}

		dmGtReportCategoryImpl.resetOriginalValues();

		return dmGtReportCategoryImpl;
	}

	public long id;
	public String category;
	public String categoryName;
	public int categoryOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}