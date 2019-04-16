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

import vn.gt.dao.danhmuc.model.RmdcShip;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing RmdcShip in entity cache.
 *
 * @author win_64
 * @see RmdcShip
 * @generated
 */
public class RmdcShipCacheModel implements CacheModel<RmdcShip>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{id=");
		sb.append(id);
		sb.append(", shipId=");
		sb.append(shipId);
		sb.append(", shipName=");
		sb.append(shipName);
		sb.append(", shipTypeId=");
		sb.append(shipTypeId);
		sb.append(", shipTypeCode=");
		sb.append(shipTypeCode);
		sb.append(", imo=");
		sb.append(imo);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", stateId=");
		sb.append(stateId);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", registryNumber=");
		sb.append(registryNumber);
		sb.append(", registryDate=");
		sb.append(registryDate);
		sb.append(", registryPortId=");
		sb.append(registryPortId);
		sb.append(", registryPortCode=");
		sb.append(registryPortCode);
		sb.append(", gt=");
		sb.append(gt);
		sb.append(", nrt=");
		sb.append(nrt);
		sb.append(", dwt=");
		sb.append(dwt);
		sb.append(", length=");
		sb.append(length);
		sb.append(", width=");
		sb.append(width);
		sb.append(", height=");
		sb.append(height);
		sb.append(", sailingSpeed=");
		sb.append(sailingSpeed);
		sb.append(", color=");
		sb.append(color);
		sb.append(", boneCode=");
		sb.append(boneCode);
		sb.append(", machineCode=");
		sb.append(machineCode);
		sb.append(", shipAgencyId=");
		sb.append(shipAgencyId);
		sb.append(", shipAgencyCode=");
		sb.append(shipAgencyCode);
		sb.append(", fishingBoatRegistration=");
		sb.append(fishingBoatRegistration);
		sb.append(", roleShip=");
		sb.append(roleShip);
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

	public RmdcShip toEntityModel() {
		RmdcShipImpl rmdcShipImpl = new RmdcShipImpl();

		rmdcShipImpl.setId(id);
		rmdcShipImpl.setShipId(shipId);

		if (shipName == null) {
			rmdcShipImpl.setShipName(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setShipName(shipName);
		}

		rmdcShipImpl.setShipTypeId(shipTypeId);

		if (shipTypeCode == null) {
			rmdcShipImpl.setShipTypeCode(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setShipTypeCode(shipTypeCode);
		}

		if (imo == null) {
			rmdcShipImpl.setImo(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setImo(imo);
		}

		if (callSign == null) {
			rmdcShipImpl.setCallSign(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setCallSign(callSign);
		}

		if (stateId == null) {
			rmdcShipImpl.setStateId(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setStateId(stateId);
		}

		if (stateCode == null) {
			rmdcShipImpl.setStateCode(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setStateCode(stateCode);
		}

		if (registryNumber == null) {
			rmdcShipImpl.setRegistryNumber(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setRegistryNumber(registryNumber);
		}

		if (registryDate == Long.MIN_VALUE) {
			rmdcShipImpl.setRegistryDate(null);
		}
		else {
			rmdcShipImpl.setRegistryDate(new Date(registryDate));
		}

		rmdcShipImpl.setRegistryPortId(registryPortId);

		if (registryPortCode == null) {
			rmdcShipImpl.setRegistryPortCode(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setRegistryPortCode(registryPortCode);
		}

		rmdcShipImpl.setGt(gt);
		rmdcShipImpl.setNrt(nrt);
		rmdcShipImpl.setDwt(dwt);
		rmdcShipImpl.setLength(length);
		rmdcShipImpl.setWidth(width);
		rmdcShipImpl.setHeight(height);
		rmdcShipImpl.setSailingSpeed(sailingSpeed);

		if (color == null) {
			rmdcShipImpl.setColor(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setColor(color);
		}

		if (boneCode == null) {
			rmdcShipImpl.setBoneCode(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setBoneCode(boneCode);
		}

		if (machineCode == null) {
			rmdcShipImpl.setMachineCode(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setMachineCode(machineCode);
		}

		rmdcShipImpl.setShipAgencyId(shipAgencyId);

		if (shipAgencyCode == null) {
			rmdcShipImpl.setShipAgencyCode(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setShipAgencyCode(shipAgencyCode);
		}

		if (fishingBoatRegistration == null) {
			rmdcShipImpl.setFishingBoatRegistration(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setFishingBoatRegistration(fishingBoatRegistration);
		}

		rmdcShipImpl.setRoleShip(roleShip);
		rmdcShipImpl.setIsDelete(isDelete);
		rmdcShipImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			rmdcShipImpl.setModifiedDate(null);
		}
		else {
			rmdcShipImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			rmdcShipImpl.setRequestedDate(null);
		}
		else {
			rmdcShipImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			rmdcShipImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			rmdcShipImpl.setSyncVersion(syncVersion);
		}

		rmdcShipImpl.resetOriginalValues();

		return rmdcShipImpl;
	}

	public long id;
	public int shipId;
	public String shipName;
	public int shipTypeId;
	public String shipTypeCode;
	public String imo;
	public String callSign;
	public String stateId;
	public String stateCode;
	public String registryNumber;
	public long registryDate;
	public int registryPortId;
	public String registryPortCode;
	public double gt;
	public double nrt;
	public double dwt;
	public double length;
	public double width;
	public double height;
	public double sailingSpeed;
	public String color;
	public String boneCode;
	public String machineCode;
	public int shipAgencyId;
	public String shipAgencyCode;
	public String fishingBoatRegistration;
	public int roleShip;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}