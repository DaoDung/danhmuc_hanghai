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

import vn.gt.dao.danhmucgt.model.DmGtRouteConfig;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmGtRouteConfig in entity cache.
 *
 * @author win_64
 * @see DmGtRouteConfig
 * @generated
 */
public class DmGtRouteConfigCacheModel implements CacheModel<DmGtRouteConfig>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", routeCode=");
		sb.append(routeCode);
		sb.append(", organizationCode=");
		sb.append(organizationCode);
		sb.append(", locCode=");
		sb.append(locCode);
		sb.append(", ipName=");
		sb.append(ipName);
		sb.append(", portName=");
		sb.append(portName);
		sb.append(", linkAddress=");
		sb.append(linkAddress);
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

	public DmGtRouteConfig toEntityModel() {
		DmGtRouteConfigImpl dmGtRouteConfigImpl = new DmGtRouteConfigImpl();

		dmGtRouteConfigImpl.setId(id);

		if (routeCode == null) {
			dmGtRouteConfigImpl.setRouteCode(StringPool.BLANK);
		}
		else {
			dmGtRouteConfigImpl.setRouteCode(routeCode);
		}

		if (organizationCode == null) {
			dmGtRouteConfigImpl.setOrganizationCode(StringPool.BLANK);
		}
		else {
			dmGtRouteConfigImpl.setOrganizationCode(organizationCode);
		}

		if (locCode == null) {
			dmGtRouteConfigImpl.setLocCode(StringPool.BLANK);
		}
		else {
			dmGtRouteConfigImpl.setLocCode(locCode);
		}

		if (ipName == null) {
			dmGtRouteConfigImpl.setIpName(StringPool.BLANK);
		}
		else {
			dmGtRouteConfigImpl.setIpName(ipName);
		}

		if (portName == null) {
			dmGtRouteConfigImpl.setPortName(StringPool.BLANK);
		}
		else {
			dmGtRouteConfigImpl.setPortName(portName);
		}

		if (linkAddress == null) {
			dmGtRouteConfigImpl.setLinkAddress(StringPool.BLANK);
		}
		else {
			dmGtRouteConfigImpl.setLinkAddress(linkAddress);
		}

		dmGtRouteConfigImpl.setIsDelete(isDelete);
		dmGtRouteConfigImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtRouteConfigImpl.setModifiedDate(null);
		}
		else {
			dmGtRouteConfigImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtRouteConfigImpl.setRequestedDate(null);
		}
		else {
			dmGtRouteConfigImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtRouteConfigImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtRouteConfigImpl.setSyncVersion(syncVersion);
		}

		dmGtRouteConfigImpl.resetOriginalValues();

		return dmGtRouteConfigImpl;
	}

	public long id;
	public String routeCode;
	public String organizationCode;
	public String locCode;
	public String ipName;
	public String portName;
	public String linkAddress;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}