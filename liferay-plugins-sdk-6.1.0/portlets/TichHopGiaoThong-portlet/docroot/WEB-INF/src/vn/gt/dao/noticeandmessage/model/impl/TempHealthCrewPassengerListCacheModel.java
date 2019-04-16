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

import vn.gt.dao.noticeandmessage.model.TempHealthCrewPassengerList;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempHealthCrewPassengerList in entity cache.
 *
 * @author win_64
 * @see TempHealthCrewPassengerList
 * @generated
 */
public class TempHealthCrewPassengerListCacheModel implements CacheModel<TempHealthCrewPassengerList>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", healthCrewPassengerCode=");
		sb.append(healthCrewPassengerCode);
		sb.append(", passengerOrCrewCode=");
		sb.append(passengerOrCrewCode);
		sb.append(", passengerOrCrewName=");
		sb.append(passengerOrCrewName);
		sb.append(", classOrRating=");
		sb.append(classOrRating);
		sb.append(", stateVisitedCode=");
		sb.append(stateVisitedCode);
		sb.append(", portVisitedCode=");
		sb.append(portVisitedCode);
		sb.append(", fromDate=");
		sb.append(fromDate);
		sb.append(", toDate=");
		sb.append(toDate);
		sb.append("}");

		return sb.toString();
	}

	public TempHealthCrewPassengerList toEntityModel() {
		TempHealthCrewPassengerListImpl tempHealthCrewPassengerListImpl = new TempHealthCrewPassengerListImpl();

		tempHealthCrewPassengerListImpl.setId(id);

		if (requestCode == null) {
			tempHealthCrewPassengerListImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setRequestCode(requestCode);
		}

		if (healthCrewPassengerCode == null) {
			tempHealthCrewPassengerListImpl.setHealthCrewPassengerCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setHealthCrewPassengerCode(healthCrewPassengerCode);
		}

		if (passengerOrCrewCode == null) {
			tempHealthCrewPassengerListImpl.setPassengerOrCrewCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setPassengerOrCrewCode(passengerOrCrewCode);
		}

		if (passengerOrCrewName == null) {
			tempHealthCrewPassengerListImpl.setPassengerOrCrewName(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setPassengerOrCrewName(passengerOrCrewName);
		}

		tempHealthCrewPassengerListImpl.setClassOrRating(classOrRating);

		if (stateVisitedCode == null) {
			tempHealthCrewPassengerListImpl.setStateVisitedCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setStateVisitedCode(stateVisitedCode);
		}

		if (portVisitedCode == null) {
			tempHealthCrewPassengerListImpl.setPortVisitedCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setPortVisitedCode(portVisitedCode);
		}

		if (fromDate == Long.MIN_VALUE) {
			tempHealthCrewPassengerListImpl.setFromDate(null);
		}
		else {
			tempHealthCrewPassengerListImpl.setFromDate(new Date(fromDate));
		}

		if (toDate == Long.MIN_VALUE) {
			tempHealthCrewPassengerListImpl.setToDate(null);
		}
		else {
			tempHealthCrewPassengerListImpl.setToDate(new Date(toDate));
		}

		tempHealthCrewPassengerListImpl.resetOriginalValues();

		return tempHealthCrewPassengerListImpl;
	}

	public long id;
	public String requestCode;
	public String healthCrewPassengerCode;
	public String passengerOrCrewCode;
	public String passengerOrCrewName;
	public int classOrRating;
	public String stateVisitedCode;
	public String portVisitedCode;
	public long fromDate;
	public long toDate;
}