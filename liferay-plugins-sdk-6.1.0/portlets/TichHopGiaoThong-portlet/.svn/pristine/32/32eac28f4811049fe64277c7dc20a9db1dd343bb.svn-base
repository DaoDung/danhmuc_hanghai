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

import vn.gt.dao.danhmuc.model.DmHistoryGoods;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryGoods in entity cache.
 *
 * @author win_64
 * @see DmHistoryGoods
 * @generated
 */
public class DmHistoryGoodsCacheModel implements CacheModel<DmHistoryGoods>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", goodsItemCode=");
		sb.append(goodsItemCode);
		sb.append(", goodsItemName=");
		sb.append(goodsItemName);
		sb.append(", goodsItemNameVN=");
		sb.append(goodsItemNameVN);
		sb.append(", goodsItemOrder=");
		sb.append(goodsItemOrder);
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

	public DmHistoryGoods toEntityModel() {
		DmHistoryGoodsImpl dmHistoryGoodsImpl = new DmHistoryGoodsImpl();

		dmHistoryGoodsImpl.setId(id);

		if (goodsItemCode == null) {
			dmHistoryGoodsImpl.setGoodsItemCode(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsImpl.setGoodsItemCode(goodsItemCode);
		}

		if (goodsItemName == null) {
			dmHistoryGoodsImpl.setGoodsItemName(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsImpl.setGoodsItemName(goodsItemName);
		}

		if (goodsItemNameVN == null) {
			dmHistoryGoodsImpl.setGoodsItemNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsImpl.setGoodsItemNameVN(goodsItemNameVN);
		}

		dmHistoryGoodsImpl.setGoodsItemOrder(goodsItemOrder);
		dmHistoryGoodsImpl.setIsDelete(isDelete);
		dmHistoryGoodsImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryGoodsImpl.setModifiedDate(null);
		}
		else {
			dmHistoryGoodsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryGoodsImpl.setRequestedDate(null);
		}
		else {
			dmHistoryGoodsImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryGoodsImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsImpl.setSyncVersion(syncVersion);
		}

		dmHistoryGoodsImpl.resetOriginalValues();

		return dmHistoryGoodsImpl;
	}

	public int id;
	public String goodsItemCode;
	public String goodsItemName;
	public String goodsItemNameVN;
	public int goodsItemOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}