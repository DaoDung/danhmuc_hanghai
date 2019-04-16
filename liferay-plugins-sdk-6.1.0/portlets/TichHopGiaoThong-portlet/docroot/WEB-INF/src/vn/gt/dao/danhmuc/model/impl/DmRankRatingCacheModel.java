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

import vn.gt.dao.danhmuc.model.DmRankRating;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmRankRating in entity cache.
 *
 * @author win_64
 * @see DmRankRating
 * @generated
 */
public class DmRankRatingCacheModel implements CacheModel<DmRankRating>,
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

	public DmRankRating toEntityModel() {
		DmRankRatingImpl dmRankRatingImpl = new DmRankRatingImpl();

		dmRankRatingImpl.setId(id);

		if (rankCode == null) {
			dmRankRatingImpl.setRankCode(StringPool.BLANK);
		}
		else {
			dmRankRatingImpl.setRankCode(rankCode);
		}

		if (rankName == null) {
			dmRankRatingImpl.setRankName(StringPool.BLANK);
		}
		else {
			dmRankRatingImpl.setRankName(rankName);
		}

		if (rankNameVN == null) {
			dmRankRatingImpl.setRankNameVN(StringPool.BLANK);
		}
		else {
			dmRankRatingImpl.setRankNameVN(rankNameVN);
		}

		dmRankRatingImpl.setRankOrder(rankOrder);
		dmRankRatingImpl.setIsDelete(isDelete);
		dmRankRatingImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmRankRatingImpl.setModifiedDate(null);
		}
		else {
			dmRankRatingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmRankRatingImpl.setRequestedDate(null);
		}
		else {
			dmRankRatingImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmRankRatingImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmRankRatingImpl.setSyncVersion(syncVersion);
		}

		dmRankRatingImpl.resetOriginalValues();

		return dmRankRatingImpl;
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