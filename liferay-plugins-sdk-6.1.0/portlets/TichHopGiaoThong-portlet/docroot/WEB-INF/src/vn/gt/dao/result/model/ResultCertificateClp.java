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

package vn.gt.dao.result.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.result.service.ResultCertificateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class ResultCertificateClp extends BaseModelImpl<ResultCertificate>
	implements ResultCertificate {
	public ResultCertificateClp() {
	}

	public Class<?> getModelClass() {
		return ResultCertificate.class;
	}

	public String getModelClassName() {
		return ResultCertificate.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	public String getCertificateCode() {
		return _certificateCode;
	}

	public void setCertificateCode(String certificateCode) {
		_certificateCode = certificateCode;
	}

	public int getCertificateOrder() {
		return _certificateOrder;
	}

	public void setCertificateOrder(int certificateOrder) {
		_certificateOrder = certificateOrder;
	}

	public String getCertificateNo() {
		return _certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		_certificateNo = certificateNo;
	}

	public Date getCertificateIssueDate() {
		return _certificateIssueDate;
	}

	public void setCertificateIssueDate(Date certificateIssueDate) {
		_certificateIssueDate = certificateIssueDate;
	}

	public Date getCertificateExpiredDate() {
		return _certificateExpiredDate;
	}

	public void setCertificateExpiredDate(Date certificateExpiredDate) {
		_certificateExpiredDate = certificateExpiredDate;
	}

	public Date getExaminationDate() {
		return _examinationDate;
	}

	public void setExaminationDate(Date examinationDate) {
		_examinationDate = examinationDate;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getComment() {
		return _comment;
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	public String getApprovalName() {
		return _approvalName;
	}

	public void setApprovalName(String approvalName) {
		_approvalName = approvalName;
	}

	public int getIsExamined() {
		return _isExamined;
	}

	public void setIsExamined(int isExamined) {
		_isExamined = isExamined;
	}

	public int getMandatory() {
		return _mandatory;
	}

	public void setMandatory(int mandatory) {
		_mandatory = mandatory;
	}

	public void persist() throws SystemException {
		ResultCertificateLocalServiceUtil.updateResultCertificate(this);
	}

	@Override
	public ResultCertificate toEscapedModel() {
		return (ResultCertificate)Proxy.newProxyInstance(ResultCertificate.class.getClassLoader(),
			new Class[] { ResultCertificate.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultCertificateClp clone = new ResultCertificateClp();

		clone.setId(getId());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setCertificateCode(getCertificateCode());
		clone.setCertificateOrder(getCertificateOrder());
		clone.setCertificateNo(getCertificateNo());
		clone.setCertificateIssueDate(getCertificateIssueDate());
		clone.setCertificateExpiredDate(getCertificateExpiredDate());
		clone.setExaminationDate(getExaminationDate());
		clone.setDescription(getDescription());
		clone.setComment(getComment());
		clone.setApprovalName(getApprovalName());
		clone.setIsExamined(getIsExamined());
		clone.setMandatory(getMandatory());

		return clone;
	}

	public int compareTo(ResultCertificate resultCertificate) {
		int value = 0;

		if (getId() < resultCertificate.getId()) {
			value = -1;
		}
		else if (getId() > resultCertificate.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ResultCertificateClp resultCertificate = null;

		try {
			resultCertificate = (ResultCertificateClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = resultCertificate.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", certificateCode=");
		sb.append(getCertificateCode());
		sb.append(", certificateOrder=");
		sb.append(getCertificateOrder());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
		sb.append(", certificateIssueDate=");
		sb.append(getCertificateIssueDate());
		sb.append(", certificateExpiredDate=");
		sb.append(getCertificateExpiredDate());
		sb.append(", examinationDate=");
		sb.append(getExaminationDate());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append(", approvalName=");
		sb.append(getApprovalName());
		sb.append(", isExamined=");
		sb.append(getIsExamined());
		sb.append(", mandatory=");
		sb.append(getMandatory());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.result.model.ResultCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateCode</column-name><column-value><![CDATA[");
		sb.append(getCertificateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOrder</column-name><column-value><![CDATA[");
		sb.append(getCertificateOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNo</column-name><column-value><![CDATA[");
		sb.append(getCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateIssueDate</column-name><column-value><![CDATA[");
		sb.append(getCertificateIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateExpiredDate</column-name><column-value><![CDATA[");
		sb.append(getCertificateExpiredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>examinationDate</column-name><column-value><![CDATA[");
		sb.append(getExaminationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalName</column-name><column-value><![CDATA[");
		sb.append(getApprovalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isExamined</column-name><column-value><![CDATA[");
		sb.append(getIsExamined());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mandatory</column-name><column-value><![CDATA[");
		sb.append(getMandatory());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _documentName;
	private int _documentYear;
	private String _maritimeCode;
	private String _certificateCode;
	private int _certificateOrder;
	private String _certificateNo;
	private Date _certificateIssueDate;
	private Date _certificateExpiredDate;
	private Date _examinationDate;
	private String _description;
	private String _comment;
	private String _approvalName;
	private int _isExamined;
	private int _mandatory;
}