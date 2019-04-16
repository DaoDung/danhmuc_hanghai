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

import vn.gt.dao.noticeandmessage.model.TempCargoItems;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempCargoItems in entity cache.
 *
 * @author win_64
 * @see TempCargoItems
 * @generated
 */
public class TempCargoItemsCacheModel implements CacheModel<TempCargoItems>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", cargoCategory=");
		sb.append(cargoCategory);
		sb.append(", cargoType=");
		sb.append(cargoType);
		sb.append(", cargoCode=");
		sb.append(cargoCode);
		sb.append(", description=");
		sb.append(description);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", unit=");
		sb.append(unit);
		sb.append(", sequence=");
		sb.append(sequence);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	public TempCargoItems toEntityModel() {
		TempCargoItemsImpl tempCargoItemsImpl = new TempCargoItemsImpl();

		tempCargoItemsImpl.setId(id);

		if (requestCode == null) {
			tempCargoItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempCargoItemsImpl.setRequestCode(requestCode);
		}

		tempCargoItemsImpl.setDocumentName(documentName);
		tempCargoItemsImpl.setDocumentYear(documentYear);

		if (cargoCategory == null) {
			tempCargoItemsImpl.setCargoCategory(StringPool.BLANK);
		}
		else {
			tempCargoItemsImpl.setCargoCategory(cargoCategory);
		}

		if (cargoType == null) {
			tempCargoItemsImpl.setCargoType(StringPool.BLANK);
		}
		else {
			tempCargoItemsImpl.setCargoType(cargoType);
		}

		if (cargoCode == null) {
			tempCargoItemsImpl.setCargoCode(StringPool.BLANK);
		}
		else {
			tempCargoItemsImpl.setCargoCode(cargoCode);
		}

		if (description == null) {
			tempCargoItemsImpl.setDescription(StringPool.BLANK);
		}
		else {
			tempCargoItemsImpl.setDescription(description);
		}

		tempCargoItemsImpl.setQuantity(quantity);

		if (unit == null) {
			tempCargoItemsImpl.setUnit(StringPool.BLANK);
		}
		else {
			tempCargoItemsImpl.setUnit(unit);
		}

		tempCargoItemsImpl.setSequence(sequence);

		if (modifiedDate == Long.MIN_VALUE) {
			tempCargoItemsImpl.setModifiedDate(null);
		}
		else {
			tempCargoItemsImpl.setModifiedDate(new Date(modifiedDate));
		}

		tempCargoItemsImpl.resetOriginalValues();

		return tempCargoItemsImpl;
	}

	public long id;
	public String requestCode;
	public long documentName;
	public int documentYear;
	public String cargoCategory;
	public String cargoType;
	public String cargoCode;
	public String description;
	public double quantity;
	public String unit;
	public int sequence;
	public long modifiedDate;
}