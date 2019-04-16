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

import vn.gt.dao.noticeandmessage.model.TempShipStoresItems;

import java.io.Serializable;

/**
 * The cache model class for representing TempShipStoresItems in entity cache.
 *
 * @author win_64
 * @see TempShipStoresItems
 * @generated
 */
public class TempShipStoresItemsCacheModel implements CacheModel<TempShipStoresItems>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", shipsstoreItemCode=");
		sb.append(shipsstoreItemCode);
		sb.append(", nameOfArticle=");
		sb.append(nameOfArticle);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", quantityUnit=");
		sb.append(quantityUnit);
		sb.append(", locationOnBoat=");
		sb.append(locationOnBoat);
		sb.append(", useInBoat=");
		sb.append(useInBoat);
		sb.append("}");

		return sb.toString();
	}

	public TempShipStoresItems toEntityModel() {
		TempShipStoresItemsImpl tempShipStoresItemsImpl = new TempShipStoresItemsImpl();

		tempShipStoresItemsImpl.setId(id);

		if (requestCode == null) {
			tempShipStoresItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setRequestCode(requestCode);
		}

		if (shipsstoreItemCode == null) {
			tempShipStoresItemsImpl.setShipsstoreItemCode(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setShipsstoreItemCode(shipsstoreItemCode);
		}

		if (nameOfArticle == null) {
			tempShipStoresItemsImpl.setNameOfArticle(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setNameOfArticle(nameOfArticle);
		}

		if (quantity == null) {
			tempShipStoresItemsImpl.setQuantity(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setQuantity(quantity);
		}

		if (quantityUnit == null) {
			tempShipStoresItemsImpl.setQuantityUnit(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setQuantityUnit(quantityUnit);
		}

		if (locationOnBoat == null) {
			tempShipStoresItemsImpl.setLocationOnBoat(StringPool.BLANK);
		}
		else {
			tempShipStoresItemsImpl.setLocationOnBoat(locationOnBoat);
		}

		tempShipStoresItemsImpl.setUseInBoat(useInBoat);

		tempShipStoresItemsImpl.resetOriginalValues();

		return tempShipStoresItemsImpl;
	}

	public long id;
	public String requestCode;
	public String shipsstoreItemCode;
	public String nameOfArticle;
	public String quantity;
	public String quantityUnit;
	public String locationOnBoat;
	public int useInBoat;
}