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

import vn.gt.dao.noticeandmessage.model.TempPersonList;

import java.io.Serializable;

/**
 * The cache model class for representing TempPersonList in entity cache.
 *
 * @author win_64
 * @see TempPersonList
 * @generated
 */
public class TempPersonListCacheModel implements CacheModel<TempPersonList>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", name=");
		sb.append(name);
		sb.append(", age=");
		sb.append(age);
		sb.append(", nationalCode=");
		sb.append(nationalCode);
		sb.append(", nationalName=");
		sb.append(nationalName);
		sb.append(", ilnessStatus=");
		sb.append(ilnessStatus);
		sb.append(", reasonOfDead=");
		sb.append(reasonOfDead);
		sb.append(", personType=");
		sb.append(personType);
		sb.append("}");

		return sb.toString();
	}

	public TempPersonList toEntityModel() {
		TempPersonListImpl tempPersonListImpl = new TempPersonListImpl();

		tempPersonListImpl.setId(id);

		if (requestCode == null) {
			tempPersonListImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempPersonListImpl.setRequestCode(requestCode);
		}

		tempPersonListImpl.setDocumentName(documentName);
		tempPersonListImpl.setDocumentYear(documentYear);

		if (name == null) {
			tempPersonListImpl.setName(StringPool.BLANK);
		}
		else {
			tempPersonListImpl.setName(name);
		}

		if (age == null) {
			tempPersonListImpl.setAge(StringPool.BLANK);
		}
		else {
			tempPersonListImpl.setAge(age);
		}

		if (nationalCode == null) {
			tempPersonListImpl.setNationalCode(StringPool.BLANK);
		}
		else {
			tempPersonListImpl.setNationalCode(nationalCode);
		}

		if (nationalName == null) {
			tempPersonListImpl.setNationalName(StringPool.BLANK);
		}
		else {
			tempPersonListImpl.setNationalName(nationalName);
		}

		if (ilnessStatus == null) {
			tempPersonListImpl.setIlnessStatus(StringPool.BLANK);
		}
		else {
			tempPersonListImpl.setIlnessStatus(ilnessStatus);
		}

		if (reasonOfDead == null) {
			tempPersonListImpl.setReasonOfDead(StringPool.BLANK);
		}
		else {
			tempPersonListImpl.setReasonOfDead(reasonOfDead);
		}

		tempPersonListImpl.setPersonType(personType);

		tempPersonListImpl.resetOriginalValues();

		return tempPersonListImpl;
	}

	public long id;
	public String requestCode;
	public long documentName;
	public int documentYear;
	public String name;
	public String age;
	public String nationalCode;
	public String nationalName;
	public String ilnessStatus;
	public String reasonOfDead;
	public int personType;
}