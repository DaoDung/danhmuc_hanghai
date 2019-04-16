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

import vn.gt.dao.danhmuc.model.DmDataItem;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmDataItem in entity cache.
 *
 * @author win_64
 * @see DmDataItem
 * @generated
 */
public class DmDataItemCacheModel implements CacheModel<DmDataItem>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", DataGroupId=");
		sb.append(DataGroupId);
		sb.append(", Code0=");
		sb.append(Code0);
		sb.append(", Node1=");
		sb.append(Node1);
		sb.append(", Node2=");
		sb.append(Node2);
		sb.append(", Node3=");
		sb.append(Node3);
		sb.append(", Node4=");
		sb.append(Node4);
		sb.append(", Level=");
		sb.append(Level);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", ShortName=");
		sb.append(ShortName);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", ValidatedFrom=");
		sb.append(ValidatedFrom);
		sb.append(", ValidatedTo=");
		sb.append(ValidatedTo);
		sb.append(", Order=");
		sb.append(Order);
		sb.append(", Status=");
		sb.append(Status);
		sb.append("}");

		return sb.toString();
	}

	public DmDataItem toEntityModel() {
		DmDataItemImpl dmDataItemImpl = new DmDataItemImpl();

		dmDataItemImpl.setId(Id);
		dmDataItemImpl.setDataGroupId(DataGroupId);

		if (Code0 == null) {
			dmDataItemImpl.setCode0(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode0(Code0);
		}

		if (Node1 == null) {
			dmDataItemImpl.setNode1(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setNode1(Node1);
		}

		if (Node2 == null) {
			dmDataItemImpl.setNode2(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setNode2(Node2);
		}

		if (Node3 == null) {
			dmDataItemImpl.setNode3(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setNode3(Node3);
		}

		if (Node4 == null) {
			dmDataItemImpl.setNode4(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setNode4(Node4);
		}

		dmDataItemImpl.setLevel(Level);

		if (Name == null) {
			dmDataItemImpl.setName(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setName(Name);
		}

		if (ShortName == null) {
			dmDataItemImpl.setShortName(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setShortName(ShortName);
		}

		if (Description == null) {
			dmDataItemImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setDescription(Description);
		}

		if (ValidatedFrom == Long.MIN_VALUE) {
			dmDataItemImpl.setValidatedFrom(null);
		}
		else {
			dmDataItemImpl.setValidatedFrom(new Date(ValidatedFrom));
		}

		if (ValidatedTo == Long.MIN_VALUE) {
			dmDataItemImpl.setValidatedTo(null);
		}
		else {
			dmDataItemImpl.setValidatedTo(new Date(ValidatedTo));
		}

		dmDataItemImpl.setOrder(Order);
		dmDataItemImpl.setStatus(Status);

		dmDataItemImpl.resetOriginalValues();

		return dmDataItemImpl;
	}

	public long Id;
	public long DataGroupId;
	public String Code0;
	public String Node1;
	public String Node2;
	public String Node3;
	public String Node4;
	public int Level;
	public String Name;
	public String ShortName;
	public String Description;
	public long ValidatedFrom;
	public long ValidatedTo;
	public int Order;
	public int Status;
}