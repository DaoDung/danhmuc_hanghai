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

import vn.gt.dao.noticeandmessage.model.TempWasteList;

import java.io.Serializable;

/**
 * The cache model class for representing TempWasteList in entity cache.
 *
 * @author win_64
 * @see TempWasteList
 * @generated
 */
public class TempWasteListCacheModel implements CacheModel<TempWasteList>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", typeCode=");
		sb.append(typeCode);
		sb.append(", typeName=");
		sb.append(typeName);
		sb.append(", weight=");
		sb.append(weight);
		sb.append(", unit=");
		sb.append(unit);
		sb.append("}");

		return sb.toString();
	}

	public TempWasteList toEntityModel() {
		TempWasteListImpl tempWasteListImpl = new TempWasteListImpl();

		tempWasteListImpl.setId(id);

		if (requestCode == null) {
			tempWasteListImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempWasteListImpl.setRequestCode(requestCode);
		}

		tempWasteListImpl.setDocumentName(documentName);
		tempWasteListImpl.setDocumentYear(documentYear);

		if (typeCode == null) {
			tempWasteListImpl.setTypeCode(StringPool.BLANK);
		}
		else {
			tempWasteListImpl.setTypeCode(typeCode);
		}

		if (typeName == null) {
			tempWasteListImpl.setTypeName(StringPool.BLANK);
		}
		else {
			tempWasteListImpl.setTypeName(typeName);
		}

		tempWasteListImpl.setWeight(weight);

		if (unit == null) {
			tempWasteListImpl.setUnit(StringPool.BLANK);
		}
		else {
			tempWasteListImpl.setUnit(unit);
		}

		tempWasteListImpl.resetOriginalValues();

		return tempWasteListImpl;
	}

	public long id;
	public String requestCode;
	public long documentName;
	public int documentYear;
	public String typeCode;
	public String typeName;
	public double weight;
	public String unit;
}