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

import vn.gt.dao.result.model.ResultCertificate;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing ResultCertificate in entity cache.
 *
 * @author win_64
 * @see ResultCertificate
 * @generated
 */
public class ResultCertificateCacheModel implements CacheModel<ResultCertificate>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
		sb.append(", certificateCode=");
		sb.append(certificateCode);
		sb.append(", certificateOrder=");
		sb.append(certificateOrder);
		sb.append(", certificateNo=");
		sb.append(certificateNo);
		sb.append(", certificateIssueDate=");
		sb.append(certificateIssueDate);
		sb.append(", certificateExpiredDate=");
		sb.append(certificateExpiredDate);
		sb.append(", examinationDate=");
		sb.append(examinationDate);
		sb.append(", description=");
		sb.append(description);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", approvalName=");
		sb.append(approvalName);
		sb.append(", isExamined=");
		sb.append(isExamined);
		sb.append(", mandatory=");
		sb.append(mandatory);
		sb.append("}");

		return sb.toString();
	}

	public ResultCertificate toEntityModel() {
		ResultCertificateImpl resultCertificateImpl = new ResultCertificateImpl();

		resultCertificateImpl.setId(id);
		resultCertificateImpl.setDocumentName(documentName);
		resultCertificateImpl.setDocumentYear(documentYear);

		if (maritimeCode == null) {
			resultCertificateImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setMaritimeCode(maritimeCode);
		}

		if (certificateCode == null) {
			resultCertificateImpl.setCertificateCode(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setCertificateCode(certificateCode);
		}

		resultCertificateImpl.setCertificateOrder(certificateOrder);

		if (certificateNo == null) {
			resultCertificateImpl.setCertificateNo(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setCertificateNo(certificateNo);
		}

		if (certificateIssueDate == Long.MIN_VALUE) {
			resultCertificateImpl.setCertificateIssueDate(null);
		}
		else {
			resultCertificateImpl.setCertificateIssueDate(new Date(
					certificateIssueDate));
		}

		if (certificateExpiredDate == Long.MIN_VALUE) {
			resultCertificateImpl.setCertificateExpiredDate(null);
		}
		else {
			resultCertificateImpl.setCertificateExpiredDate(new Date(
					certificateExpiredDate));
		}

		if (examinationDate == Long.MIN_VALUE) {
			resultCertificateImpl.setExaminationDate(null);
		}
		else {
			resultCertificateImpl.setExaminationDate(new Date(examinationDate));
		}

		if (description == null) {
			resultCertificateImpl.setDescription(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setDescription(description);
		}

		if (comment == null) {
			resultCertificateImpl.setComment(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setComment(comment);
		}

		if (approvalName == null) {
			resultCertificateImpl.setApprovalName(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setApprovalName(approvalName);
		}

		resultCertificateImpl.setIsExamined(isExamined);
		resultCertificateImpl.setMandatory(mandatory);

		resultCertificateImpl.resetOriginalValues();

		return resultCertificateImpl;
	}

	public long id;
	public long documentName;
	public int documentYear;
	public String maritimeCode;
	public String certificateCode;
	public int certificateOrder;
	public String certificateNo;
	public long certificateIssueDate;
	public long certificateExpiredDate;
	public long examinationDate;
	public String description;
	public String comment;
	public String approvalName;
	public int isExamined;
	public int mandatory;
}