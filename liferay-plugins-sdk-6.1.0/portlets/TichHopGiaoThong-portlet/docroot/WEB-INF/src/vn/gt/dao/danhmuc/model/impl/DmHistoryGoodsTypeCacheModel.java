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

import vn.gt.dao.danhmuc.model.DmHistoryGoodsType;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryGoodsType in entity cache.
 *
 * @author win_64
 * @see DmHistoryGoodsType
 * @generated
 */
public class DmHistoryGoodsTypeCacheModel implements CacheModel<DmHistoryGoodsType>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", goodsTypeCode=");
		sb.append(goodsTypeCode);
		sb.append(", goodsTypeName=");
		sb.append(goodsTypeName);
		sb.append(", goodsTypeNameVN=");
		sb.append(goodsTypeNameVN);
		sb.append(", goodsTypeOrder=");
		sb.append(goodsTypeOrder);
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

	public DmHistoryGoodsType toEntityModel() {
		DmHistoryGoodsTypeImpl dmHistoryGoodsTypeImpl = new DmHistoryGoodsTypeImpl();

		dmHistoryGoodsTypeImpl.setId(id);

		if (goodsTypeCode == null) {
			dmHistoryGoodsTypeImpl.setGoodsTypeCode(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsTypeImpl.setGoodsTypeCode(goodsTypeCode);
		}

		if (goodsTypeName == null) {
			dmHistoryGoodsTypeImpl.setGoodsTypeName(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsTypeImpl.setGoodsTypeName(goodsTypeName);
		}

		if (goodsTypeNameVN == null) {
			dmHistoryGoodsTypeImpl.setGoodsTypeNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsTypeImpl.setGoodsTypeNameVN(goodsTypeNameVN);
		}

		dmHistoryGoodsTypeImpl.setGoodsTypeOrder(goodsTypeOrder);
		dmHistoryGoodsTypeImpl.setIsDelete(isDelete);
		dmHistoryGoodsTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryGoodsTypeImpl.setModifiedDate(null);
		}
		else {
			dmHistoryGoodsTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryGoodsTypeImpl.setRequestedDate(null);
		}
		else {
			dmHistoryGoodsTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryGoodsTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryGoodsTypeImpl.setSyncVersion(syncVersion);
		}

		dmHistoryGoodsTypeImpl.resetOriginalValues();

		return dmHistoryGoodsTypeImpl;
	}

	public int id;
	public String goodsTypeCode;
	public String goodsTypeName;
	public String goodsTypeNameVN;
	public int goodsTypeOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}