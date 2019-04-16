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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.result.service.http.ResultCertificateServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.result.service.http.ResultCertificateServiceSoap
 * @generated
 */
public class ResultCertificateSoap implements Serializable {
	public static ResultCertificateSoap toSoapModel(ResultCertificate model) {
		ResultCertificateSoap soapModel = new ResultCertificateSoap();

		soapModel.setId(model.getId());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setMaritimeCode(model.getMaritimeCode());
		soapModel.setCertificateCode(model.getCertificateCode());
		soapModel.setCertificateOrder(model.getCertificateOrder());
		soapModel.setCertificateNo(model.getCertificateNo());
		soapModel.setCertificateIssueDate(model.getCertificateIssueDate());
		soapModel.setCertificateExpiredDate(model.getCertificateExpiredDate());
		soapModel.setExaminationDate(model.getExaminationDate());
		soapModel.setDescription(model.getDescription());
		soapModel.setComment(model.getComment());
		soapModel.setApprovalName(model.getApprovalName());
		soapModel.setIsExamined(model.getIsExamined());
		soapModel.setMandatory(model.getMandatory());

		return soapModel;
	}

	public static ResultCertificateSoap[] toSoapModels(
		ResultCertificate[] models) {
		ResultCertificateSoap[] soapModels = new ResultCertificateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResultCertificateSoap[][] toSoapModels(
		ResultCertificate[][] models) {
		ResultCertificateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResultCertificateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResultCertificateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResultCertificateSoap[] toSoapModels(
		List<ResultCertificate> models) {
		List<ResultCertificateSoap> soapModels = new ArrayList<ResultCertificateSoap>(models.size());

		for (ResultCertificate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResultCertificateSoap[soapModels.size()]);
	}

	public ResultCertificateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
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