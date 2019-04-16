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

import vn.gt.dao.danhmucgt.model.DmGtVersion;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmGtVersion in entity cache.
 *
 * @author win_64
 * @see DmGtVersion
 * @generated
 */
public class DmGtVersionCacheModel implements CacheModel<DmGtVersion>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", versionName=");
		sb.append(versionName);
		sb.append(", versionDate=");
		sb.append(versionDate);
		sb.append(", versionDeployer=");
		sb.append(versionDeployer);
		sb.append(", contents=");
		sb.append(contents);
		sb.append(", description=");
		sb.append(description);
		sb.append(", dbFileName=");
		sb.append(dbFileName);
		sb.append(", dbFileSize=");
		sb.append(dbFileSize);
		sb.append(", dbDescription=");
		sb.append(dbDescription);
		sb.append(", appFileName=");
		sb.append(appFileName);
		sb.append(", appFileSize=");
		sb.append(appFileSize);
		sb.append(", appDescription=");
		sb.append(appDescription);
		sb.append(", specFileName=");
		sb.append(specFileName);
		sb.append(", specFileSize=");
		sb.append(specFileSize);
		sb.append(", specDescription=");
		sb.append(specDescription);
		sb.append(", organizationCode=");
		sb.append(organizationCode);
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

	public DmGtVersion toEntityModel() {
		DmGtVersionImpl dmGtVersionImpl = new DmGtVersionImpl();

		dmGtVersionImpl.setId(id);

		if (versionName == null) {
			dmGtVersionImpl.setVersionName(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setVersionName(versionName);
		}

		if (versionDate == Long.MIN_VALUE) {
			dmGtVersionImpl.setVersionDate(null);
		}
		else {
			dmGtVersionImpl.setVersionDate(new Date(versionDate));
		}

		if (versionDeployer == null) {
			dmGtVersionImpl.setVersionDeployer(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setVersionDeployer(versionDeployer);
		}

		if (contents == null) {
			dmGtVersionImpl.setContents(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setContents(contents);
		}

		if (description == null) {
			dmGtVersionImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setDescription(description);
		}

		if (dbFileName == null) {
			dmGtVersionImpl.setDbFileName(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setDbFileName(dbFileName);
		}

		if (dbFileSize == null) {
			dmGtVersionImpl.setDbFileSize(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setDbFileSize(dbFileSize);
		}

		if (dbDescription == null) {
			dmGtVersionImpl.setDbDescription(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setDbDescription(dbDescription);
		}

		if (appFileName == null) {
			dmGtVersionImpl.setAppFileName(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setAppFileName(appFileName);
		}

		if (appFileSize == null) {
			dmGtVersionImpl.setAppFileSize(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setAppFileSize(appFileSize);
		}

		if (appDescription == null) {
			dmGtVersionImpl.setAppDescription(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setAppDescription(appDescription);
		}

		if (specFileName == null) {
			dmGtVersionImpl.setSpecFileName(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setSpecFileName(specFileName);
		}

		if (specFileSize == null) {
			dmGtVersionImpl.setSpecFileSize(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setSpecFileSize(specFileSize);
		}

		if (specDescription == null) {
			dmGtVersionImpl.setSpecDescription(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setSpecDescription(specDescription);
		}

		if (organizationCode == null) {
			dmGtVersionImpl.setOrganizationCode(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setOrganizationCode(organizationCode);
		}

		dmGtVersionImpl.setIsDelete(isDelete);
		dmGtVersionImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtVersionImpl.setModifiedDate(null);
		}
		else {
			dmGtVersionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtVersionImpl.setRequestedDate(null);
		}
		else {
			dmGtVersionImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtVersionImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtVersionImpl.setSyncVersion(syncVersion);
		}

		dmGtVersionImpl.resetOriginalValues();

		return dmGtVersionImpl;
	}

	public int id;
	public String versionName;
	public long versionDate;
	public String versionDeployer;
	public String contents;
	public String description;
	public String dbFileName;
	public String dbFileSize;
	public String dbDescription;
	public String appFileName;
	public String appFileSize;
	public String appDescription;
	public String specFileName;
	public String specFileSize;
	public String specDescription;
	public String organizationCode;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}