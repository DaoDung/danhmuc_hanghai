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

package vn.gt.dao.result.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.result.model.ResultDeclaration;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing ResultDeclaration in entity cache.
 *
 * @author win_64
 * @see ResultDeclaration
 * @generated
 */
public class ResultDeclarationCacheModel implements CacheModel<ResultDeclaration>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", businessOrder=");
		sb.append(businessOrder);
		sb.append(", businessTypeCode=");
		sb.append(businessTypeCode);
		sb.append(", latestSend=");
		sb.append(latestSend);
		sb.append(", declarationTime=");
		sb.append(declarationTime);
		sb.append(", arrivalDepartureTime=");
		sb.append(arrivalDepartureTime);
		sb.append(", remainingTime=");
		sb.append(remainingTime);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	public ResultDeclaration toEntityModel() {
		ResultDeclarationImpl resultDeclarationImpl = new ResultDeclarationImpl();

		resultDeclarationImpl.setId(id);

		if (requestCode == null) {
			resultDeclarationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			resultDeclarationImpl.setRequestCode(requestCode);
		}

		resultDeclarationImpl.setRequestState(requestState);
		resultDeclarationImpl.setDocumentName(documentName);
		resultDeclarationImpl.setDocumentYear(documentYear);
		resultDeclarationImpl.setBusinessOrder(businessOrder);
		resultDeclarationImpl.setBusinessTypeCode(businessTypeCode);
		resultDeclarationImpl.setLatestSend(latestSend);

		if (declarationTime == Long.MIN_VALUE) {
			resultDeclarationImpl.setDeclarationTime(null);
		}
		else {
			resultDeclarationImpl.setDeclarationTime(new Date(declarationTime));
		}

		if (arrivalDepartureTime == Long.MIN_VALUE) {
			resultDeclarationImpl.setArrivalDepartureTime(null);
		}
		else {
			resultDeclarationImpl.setArrivalDepartureTime(new Date(
					arrivalDepartureTime));
		}

		if (remainingTime == null) {
			resultDeclarationImpl.setRemainingTime(StringPool.BLANK);
		}
		else {
			resultDeclarationImpl.setRemainingTime(remainingTime);
		}

		if (remarks == null) {
			resultDeclarationImpl.setRemarks(StringPool.BLANK);
		}
		else {
			resultDeclarationImpl.setRemarks(remarks);
		}

		resultDeclarationImpl.resetOriginalValues();

		return resultDeclarationImpl;
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public int businessOrder;
	public int businessTypeCode;
	public int latestSend;
	public long declarationTime;
	public long arrivalDepartureTime;
	public String remainingTime;
	public String remarks;
}