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

package vn.gt.dao.noticeandmessage.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.noticeandmessage.model.TempShipSecurityPortItems;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempShipSecurityPortItems in entity cache.
 *
 * @author win_64
 * @see TempShipSecurityPortItems
 * @generated
 */
public class TempShipSecurityPortItemsCacheModel implements CacheModel<TempShipSecurityPortItems>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", shipSecurityPortItemCode=");
		sb.append(shipSecurityPortItemCode);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", dateArrival=");
		sb.append(dateArrival);
		sb.append(", dateDeparture=");
		sb.append(dateDeparture);
		sb.append(", securityLevelCode=");
		sb.append(securityLevelCode);
		sb.append("}");

		return sb.toString();
	}

	public TempShipSecurityPortItems toEntityModel() {
		TempShipSecurityPortItemsImpl tempShipSecurityPortItemsImpl = new TempShipSecurityPortItemsImpl();

		tempShipSecurityPortItemsImpl.setId(id);

		if (requestCode == null) {
			tempShipSecurityPortItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityPortItemsImpl.setRequestCode(requestCode);
		}

		if (shipSecurityPortItemCode == null) {
			tempShipSecurityPortItemsImpl.setShipSecurityPortItemCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityPortItemsImpl.setShipSecurityPortItemCode(shipSecurityPortItemCode);
		}

		if (portCode == null) {
			tempShipSecurityPortItemsImpl.setPortCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityPortItemsImpl.setPortCode(portCode);
		}

		if (dateArrival == Long.MIN_VALUE) {
			tempShipSecurityPortItemsImpl.setDateArrival(null);
		}
		else {
			tempShipSecurityPortItemsImpl.setDateArrival(new Date(dateArrival));
		}

		if (dateDeparture == Long.MIN_VALUE) {
			tempShipSecurityPortItemsImpl.setDateDeparture(null);
		}
		else {
			tempShipSecurityPortItemsImpl.setDateDeparture(new Date(
					dateDeparture));
		}

		if (securityLevelCode == null) {
			tempShipSecurityPortItemsImpl.setSecurityLevelCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityPortItemsImpl.setSecurityLevelCode(securityLevelCode);
		}

		tempShipSecurityPortItemsImpl.resetOriginalValues();

		return tempShipSecurityPortItemsImpl;
	}

	public long id;
	public String requestCode;
	public String shipSecurityPortItemCode;
	public String portCode;
	public long dateArrival;
	public long dateDeparture;
	public String securityLevelCode;
}