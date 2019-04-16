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

import vn.gt.dao.danhmucgt.model.DmGtReportTemplate;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmGtReportTemplate in entity cache.
 *
 * @author win_64
 * @see DmGtReportTemplate
 * @generated
 */
public class DmGtReportTemplateCacheModel implements CacheModel<DmGtReportTemplate>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", reportCode=");
		sb.append(reportCode);
		sb.append(", reportName=");
		sb.append(reportName);
		sb.append(", reportType=");
		sb.append(reportType);
		sb.append(", category=");
		sb.append(category);
		sb.append(", description=");
		sb.append(description);
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

	public DmGtReportTemplate toEntityModel() {
		DmGtReportTemplateImpl dmGtReportTemplateImpl = new DmGtReportTemplateImpl();

		dmGtReportTemplateImpl.setId(id);
		dmGtReportTemplateImpl.setReportCode(reportCode);

		if (reportName == null) {
			dmGtReportTemplateImpl.setReportName(StringPool.BLANK);
		}
		else {
			dmGtReportTemplateImpl.setReportName(reportName);
		}

		dmGtReportTemplateImpl.setReportType(reportType);

		if (category == null) {
			dmGtReportTemplateImpl.setCategory(StringPool.BLANK);
		}
		else {
			dmGtReportTemplateImpl.setCategory(category);
		}

		if (description == null) {
			dmGtReportTemplateImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmGtReportTemplateImpl.setDescription(description);
		}

		dmGtReportTemplateImpl.setIsDelete(isDelete);
		dmGtReportTemplateImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtReportTemplateImpl.setModifiedDate(null);
		}
		else {
			dmGtReportTemplateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtReportTemplateImpl.setRequestedDate(null);
		}
		else {
			dmGtReportTemplateImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtReportTemplateImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtReportTemplateImpl.setSyncVersion(syncVersion);
		}

		dmGtReportTemplateImpl.resetOriginalValues();

		return dmGtReportTemplateImpl;
	}

	public long id;
	public int reportCode;
	public String reportName;
	public int reportType;
	public String category;
	public String description;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}