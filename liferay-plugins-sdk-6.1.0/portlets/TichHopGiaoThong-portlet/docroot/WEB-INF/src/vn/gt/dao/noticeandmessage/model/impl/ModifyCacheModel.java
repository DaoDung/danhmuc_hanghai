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

import vn.gt.dao.noticeandmessage.model.Modify;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Modify in entity cache.
 *
 * @author win_64
 * @see Modify
 * @generated
 */
public class ModifyCacheModel implements CacheModel<Modify>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", modifyCode=");
		sb.append(modifyCode);
		sb.append(", modifyDesc=");
		sb.append(modifyDesc);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", division=");
		sb.append(division);
		sb.append(", name=");
		sb.append(name);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append("}");

		return sb.toString();
	}

	public Modify toEntityModel() {
		ModifyImpl modifyImpl = new ModifyImpl();

		modifyImpl.setId(id);

		if (modifyCode == null) {
			modifyImpl.setModifyCode(StringPool.BLANK);
		}
		else {
			modifyImpl.setModifyCode(modifyCode);
		}

		if (modifyDesc == null) {
			modifyImpl.setModifyDesc(StringPool.BLANK);
		}
		else {
			modifyImpl.setModifyDesc(modifyDesc);
		}

		if (organization == null) {
			modifyImpl.setOrganization(StringPool.BLANK);
		}
		else {
			modifyImpl.setOrganization(organization);
		}

		if (division == null) {
			modifyImpl.setDivision(StringPool.BLANK);
		}
		else {
			modifyImpl.setDivision(division);
		}

		if (name == null) {
			modifyImpl.setName(StringPool.BLANK);
		}
		else {
			modifyImpl.setName(name);
		}

		if (modifyDate == Long.MIN_VALUE) {
			modifyImpl.setModifyDate(null);
		}
		else {
			modifyImpl.setModifyDate(new Date(modifyDate));
		}

		modifyImpl.setDocumentName(documentName);
		modifyImpl.setDocumentYear(documentYear);

		modifyImpl.resetOriginalValues();

		return modifyImpl;
	}

	public long id;
	public String modifyCode;
	public String modifyDesc;
	public String organization;
	public String division;
	public String name;
	public long modifyDate;
	public long documentName;
	public long documentYear;
}