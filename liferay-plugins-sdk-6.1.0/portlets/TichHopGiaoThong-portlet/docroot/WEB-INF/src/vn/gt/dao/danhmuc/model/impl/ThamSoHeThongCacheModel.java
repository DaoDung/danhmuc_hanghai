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

import vn.gt.dao.danhmuc.model.ThamSoHeThong;

import java.io.Serializable;

/**
 * The cache model class for representing ThamSoHeThong in entity cache.
 *
 * @author win_64
 * @see ThamSoHeThong
 * @generated
 */
public class ThamSoHeThongCacheModel implements CacheModel<ThamSoHeThong>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", valueData=");
		sb.append(valueData);
		sb.append(", keyData=");
		sb.append(keyData);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public ThamSoHeThong toEntityModel() {
		ThamSoHeThongImpl thamSoHeThongImpl = new ThamSoHeThongImpl();

		thamSoHeThongImpl.setId(id);

		if (valueData == null) {
			thamSoHeThongImpl.setValueData(StringPool.BLANK);
		}
		else {
			thamSoHeThongImpl.setValueData(valueData);
		}

		if (keyData == null) {
			thamSoHeThongImpl.setKeyData(StringPool.BLANK);
		}
		else {
			thamSoHeThongImpl.setKeyData(keyData);
		}

		if (description == null) {
			thamSoHeThongImpl.setDescription(StringPool.BLANK);
		}
		else {
			thamSoHeThongImpl.setDescription(description);
		}

		thamSoHeThongImpl.resetOriginalValues();

		return thamSoHeThongImpl;
	}

	public long id;
	public String valueData;
	public String keyData;
	public String description;
}