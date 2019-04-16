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

import vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequest;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing HistoryInterfaceRequest in entity cache.
 *
 * @author win_64
 * @see HistoryInterfaceRequest
 * @generated
 */
public class HistoryInterfaceRequestCacheModel implements CacheModel<HistoryInterfaceRequest>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", organizationCode=");
		sb.append(organizationCode);
		sb.append(", locCode=");
		sb.append(locCode);
		sb.append(", requestDate=");
		sb.append(requestDate);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", requestDirection=");
		sb.append(requestDirection);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", requestResponseTime=");
		sb.append(requestResponseTime);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", businessType=");
		sb.append(businessType);
		sb.append(", functionType=");
		sb.append(functionType);
		sb.append(", requestContent=");
		sb.append(requestContent);
		sb.append(", senderName=");
		sb.append(senderName);
		sb.append(", requestVersion=");
		sb.append(requestVersion);
		sb.append(", senderIdentify=");
		sb.append(senderIdentify);
		sb.append(", receiverName=");
		sb.append(receiverName);
		sb.append(", sendingDate=");
		sb.append(sendingDate);
		sb.append(", receiverIdentify=");
		sb.append(receiverIdentify);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	public HistoryInterfaceRequest toEntityModel() {
		HistoryInterfaceRequestImpl historyInterfaceRequestImpl = new HistoryInterfaceRequestImpl();

		historyInterfaceRequestImpl.setId(id);

		if (requestCode == null) {
			historyInterfaceRequestImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setRequestCode(requestCode);
		}

		if (organizationCode == null) {
			historyInterfaceRequestImpl.setOrganizationCode(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setOrganizationCode(organizationCode);
		}

		if (locCode == null) {
			historyInterfaceRequestImpl.setLocCode(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setLocCode(locCode);
		}

		if (requestDate == Long.MIN_VALUE) {
			historyInterfaceRequestImpl.setRequestDate(null);
		}
		else {
			historyInterfaceRequestImpl.setRequestDate(new Date(requestDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			historyInterfaceRequestImpl.setRequestedDate(null);
		}
		else {
			historyInterfaceRequestImpl.setRequestedDate(new Date(requestedDate));
		}

		if (requestDirection == null) {
			historyInterfaceRequestImpl.setRequestDirection(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setRequestDirection(requestDirection);
		}

		historyInterfaceRequestImpl.setRequestState(requestState);

		if (requestResponseTime == Long.MIN_VALUE) {
			historyInterfaceRequestImpl.setRequestResponseTime(null);
		}
		else {
			historyInterfaceRequestImpl.setRequestResponseTime(new Date(
					requestResponseTime));
		}

		if (documentType == null) {
			historyInterfaceRequestImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setDocumentType(documentType);
		}

		if (businessType == null) {
			historyInterfaceRequestImpl.setBusinessType(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setBusinessType(businessType);
		}

		if (functionType == null) {
			historyInterfaceRequestImpl.setFunctionType(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setFunctionType(functionType);
		}

		if (requestContent == null) {
			historyInterfaceRequestImpl.setRequestContent(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setRequestContent(requestContent);
		}

		if (senderName == null) {
			historyInterfaceRequestImpl.setSenderName(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setSenderName(senderName);
		}

		if (requestVersion == null) {
			historyInterfaceRequestImpl.setRequestVersion(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setRequestVersion(requestVersion);
		}

		if (senderIdentify == null) {
			historyInterfaceRequestImpl.setSenderIdentify(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setSenderIdentify(senderIdentify);
		}

		if (receiverName == null) {
			historyInterfaceRequestImpl.setReceiverName(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setReceiverName(receiverName);
		}

		if (sendingDate == Long.MIN_VALUE) {
			historyInterfaceRequestImpl.setSendingDate(null);
		}
		else {
			historyInterfaceRequestImpl.setSendingDate(new Date(sendingDate));
		}

		if (receiverIdentify == null) {
			historyInterfaceRequestImpl.setReceiverIdentify(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setReceiverIdentify(receiverIdentify);
		}

		if (remarks == null) {
			historyInterfaceRequestImpl.setRemarks(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestImpl.setRemarks(remarks);
		}

		historyInterfaceRequestImpl.resetOriginalValues();

		return historyInterfaceRequestImpl;
	}

	public long id;
	public String requestCode;
	public String organizationCode;
	public String locCode;
	public long requestDate;
	public long requestedDate;
	public String requestDirection;
	public int requestState;
	public long requestResponseTime;
	public String documentType;
	public String businessType;
	public String functionType;
	public String requestContent;
	public String senderName;
	public String requestVersion;
	public String senderIdentify;
	public String receiverName;
	public long sendingDate;
	public String receiverIdentify;
	public String remarks;
}