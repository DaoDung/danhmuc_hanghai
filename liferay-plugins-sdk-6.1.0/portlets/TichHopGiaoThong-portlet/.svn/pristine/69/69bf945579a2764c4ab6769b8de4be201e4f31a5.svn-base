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

package vn.gt.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.common.model.UserSign;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing UserSign in entity cache.
 *
 * @author win_64
 * @see UserSign
 * @generated
 */
public class UserSignCacheModel implements CacheModel<UserSign>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", title=");
		sb.append(title);
		sb.append(", representative=");
		sb.append(representative);
		sb.append(", fileChuKyId=");
		sb.append(fileChuKyId);
		sb.append(", fileConDauId=");
		sb.append(fileConDauId);
		sb.append(", fileChungThuSoId=");
		sb.append(fileChungThuSoId);
		sb.append(", modifyUser=");
		sb.append(modifyUser);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append("}");

		return sb.toString();
	}

	public UserSign toEntityModel() {
		UserSignImpl userSignImpl = new UserSignImpl();

		userSignImpl.setId(id);
		userSignImpl.setUserId(userId);

		if (portCode == null) {
			userSignImpl.setPortCode(StringPool.BLANK);
		}
		else {
			userSignImpl.setPortCode(portCode);
		}

		if (title == null) {
			userSignImpl.setTitle(StringPool.BLANK);
		}
		else {
			userSignImpl.setTitle(title);
		}

		if (representative == null) {
			userSignImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			userSignImpl.setRepresentative(representative);
		}

		userSignImpl.setFileChuKyId(fileChuKyId);
		userSignImpl.setFileConDauId(fileConDauId);
		userSignImpl.setFileChungThuSoId(fileChungThuSoId);

		if (modifyUser == null) {
			userSignImpl.setModifyUser(StringPool.BLANK);
		}
		else {
			userSignImpl.setModifyUser(modifyUser);
		}

		if (modifyDate == Long.MIN_VALUE) {
			userSignImpl.setModifyDate(null);
		}
		else {
			userSignImpl.setModifyDate(new Date(modifyDate));
		}

		userSignImpl.resetOriginalValues();

		return userSignImpl;
	}

	public long id;
	public long userId;
	public String portCode;
	public String title;
	public String representative;
	public long fileChuKyId;
	public long fileConDauId;
	public long fileChungThuSoId;
	public String modifyUser;
	public long modifyDate;
}