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

import vn.gt.dao.danhmuc.model.DmHistoryRankRating;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryRankRating in entity cache.
 *
 * @author win_64
 * @see DmHistoryRankRating
 * @generated
 */
public class DmHistoryRankRatingCacheModel implements CacheModel<DmHistoryRankRating>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", rankCode=");
		sb.append(rankCode);
		sb.append(", rankName=");
		sb.append(rankName);
		sb.append(", rankNameVN=");
		sb.append(rankNameVN);
		sb.append(", rankOrder=");
		sb.append(rankOrder);
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

	public DmHistoryRankRating toEntityModel() {
		DmHistoryRankRatingImpl dmHistoryRankRatingImpl = new DmHistoryRankRatingImpl();

		dmHistoryRankRatingImpl.setId(id);

		if (rankCode == null) {
			dmHistoryRankRatingImpl.setRankCode(StringPool.BLANK);
		}
		else {
			dmHistoryRankRatingImpl.setRankCode(rankCode);
		}

		if (rankName == null) {
			dmHistoryRankRatingImpl.setRankName(StringPool.BLANK);
		}
		else {
			dmHistoryRankRatingImpl.setRankName(rankName);
		}

		if (rankNameVN == null) {
			dmHistoryRankRatingImpl.setRankNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryRankRatingImpl.setRankNameVN(rankNameVN);
		}

		dmHistoryRankRatingImpl.setRankOrder(rankOrder);
		dmHistoryRankRatingImpl.setIsDelete(isDelete);
		dmHistoryRankRatingImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryRankRatingImpl.setModifiedDate(null);
		}
		else {
			dmHistoryRankRatingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryRankRatingImpl.setRequestedDate(null);
		}
		else {
			dmHistoryRankRatingImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryRankRatingImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryRankRatingImpl.setSyncVersion(syncVersion);
		}

		dmHistoryRankRatingImpl.resetOriginalValues();

		return dmHistoryRankRatingImpl;
	}

	public int id;
	public String rankCode;
	public String rankName;
	public String rankNameVN;
	public int rankOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}