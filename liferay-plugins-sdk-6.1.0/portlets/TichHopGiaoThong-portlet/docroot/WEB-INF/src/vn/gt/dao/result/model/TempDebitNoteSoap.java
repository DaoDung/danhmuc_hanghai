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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.result.service.http.TempDebitNoteServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.result.service.http.TempDebitNoteServiceSoap
 * @generated
 */
public class TempDebitNoteSoap implements Serializable {
	public static TempDebitNoteSoap toSoapModel(TempDebitNote model) {
		TempDebitNoteSoap soapModel = new TempDebitNoteSoap();

		soapModel.setId(model.getId());
		soapModel.setATTACHEDFILE(model.getATTACHEDFILE());
		soapModel.setCorporationid(model.getCorporationid());
		soapModel.setDebitnotenumber(model.getDebitnotenumber());
		soapModel.setDivision(model.getDivision());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setFinancialaccountant(model.getFinancialaccountant());
		soapModel.setFromdate(model.getFromdate());
		soapModel.setMarkasdeleted(model.getMarkasdeleted());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setPaymenttype(model.getPaymenttype());
		soapModel.setReportby(model.getReportby());
		soapModel.setReportdate(model.getReportdate());
		soapModel.setTodate(model.getTodate());
		soapModel.setTotalpayment(model.getTotalpayment());
		soapModel.setTransactionid(model.getTransactionid());
		soapModel.setMariTimeCode(model.getMariTimeCode());
		soapModel.setComments(model.getComments());
		soapModel.setDocumentTypeCode(model.getDocumentTypeCode());
		soapModel.setKeypayGoodCode(model.getKeypayGoodCode());
		soapModel.setKeypayMerchantCode(model.getKeypayMerchantCode());
		soapModel.setPaymentGateStatusCode(model.getPaymentGateStatusCode());
		soapModel.setPaymentGateResponseData(model.getPaymentGateResponseData());
		soapModel.setPaymentGateCheckCode(model.getPaymentGateCheckCode());
		soapModel.setPaymentGateCheckResponseData(model.getPaymentGateCheckResponseData());
		soapModel.setKeypayURL(model.getKeypayURL());
		soapModel.setCurrency(model.getCurrency());

		return soapModel;
	}

	public static TempDebitNoteSoap[] toSoapModels(TempDebitNote[] models) {
		TempDebitNoteSoap[] soapModels = new TempDebitNoteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempDebitNoteSoap[][] toSoapModels(TempDebitNote[][] models) {
		TempDebitNoteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempDebitNoteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempDebitNoteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempDebitNoteSoap[] toSoapModels(List<TempDebitNote> models) {
		List<TempDebitNoteSoap> soapModels = new ArrayList<TempDebitNoteSoap>(models.size());

		for (TempDebitNote model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempDebitNoteSoap[soapModels.size()]);
	}

	public TempDebitNoteSoap() {
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

	public long getATTACHEDFILE() {
		return _ATTACHEDFILE;
	}

	public void setATTACHEDFILE(long ATTACHEDFILE) {
		_ATTACHEDFILE = ATTACHEDFILE;
	}

	public String getCorporationid() {
		return _corporationid;
	}

	public void setCorporationid(String corporationid) {
		_corporationid = corporationid;
	}

	public String getDebitnotenumber() {
		return _debitnotenumber;
	}

	public void setDebitnotenumber(String debitnotenumber) {
		_debitnotenumber = debitnotenumber;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
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

	public String getFinancialaccountant() {
		return _financialaccountant;
	}

	public void setFinancialaccountant(String financialaccountant) {
		_financialaccountant = financialaccountant;
	}

	public Date getFromdate() {
		return _fromdate;
	}

	public void setFromdate(Date fromdate) {
		_fromdate = fromdate;
	}

	public int getMarkasdeleted() {
		return _markasdeleted;
	}

	public void setMarkasdeleted(int markasdeleted) {
		_markasdeleted = markasdeleted;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public int getPaymenttype() {
		return _paymenttype;
	}

	public void setPaymenttype(int paymenttype) {
		_paymenttype = paymenttype;
	}

	public String getReportby() {
		return _reportby;
	}

	public void setReportby(String reportby) {
		_reportby = reportby;
	}

	public Date getReportdate() {
		return _reportdate;
	}

	public void setReportdate(Date reportdate) {
		_reportdate = reportdate;
	}

	public Date getTodate() {
		return _todate;
	}

	public void setTodate(Date todate) {
		_todate = todate;
	}

	public double getTotalpayment() {
		return _totalpayment;
	}

	public void setTotalpayment(double totalpayment) {
		_totalpayment = totalpayment;
	}

	public String getTransactionid() {
		return _transactionid;
	}

	public void setTransactionid(String transactionid) {
		_transactionid = transactionid;
	}

	public int getMariTimeCode() {
		return _mariTimeCode;
	}

	public void setMariTimeCode(int mariTimeCode) {
		_mariTimeCode = mariTimeCode;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	public String getDocumentTypeCode() {
		return _documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		_documentTypeCode = documentTypeCode;
	}

	public String getKeypayGoodCode() {
		return _keypayGoodCode;
	}

	public void setKeypayGoodCode(String keypayGoodCode) {
		_keypayGoodCode = keypayGoodCode;
	}

	public String getKeypayMerchantCode() {
		return _keypayMerchantCode;
	}

	public void setKeypayMerchantCode(String keypayMerchantCode) {
		_keypayMerchantCode = keypayMerchantCode;
	}

	public String getPaymentGateStatusCode() {
		return _paymentGateStatusCode;
	}

	public void setPaymentGateStatusCode(String paymentGateStatusCode) {
		_paymentGateStatusCode = paymentGateStatusCode;
	}

	public String getPaymentGateResponseData() {
		return _paymentGateResponseData;
	}

	public void setPaymentGateResponseData(String paymentGateResponseData) {
		_paymentGateResponseData = paymentGateResponseData;
	}

	public int getPaymentGateCheckCode() {
		return _paymentGateCheckCode;
	}

	public void setPaymentGateCheckCode(int paymentGateCheckCode) {
		_paymentGateCheckCode = paymentGateCheckCode;
	}

	public String getPaymentGateCheckResponseData() {
		return _paymentGateCheckResponseData;
	}

	public void setPaymentGateCheckResponseData(
		String paymentGateCheckResponseData) {
		_paymentGateCheckResponseData = paymentGateCheckResponseData;
	}

	public String getKeypayURL() {
		return _keypayURL;
	}

	public void setKeypayURL(String keypayURL) {
		_keypayURL = keypayURL;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	private long _id;
	private long _ATTACHEDFILE;
	private String _corporationid;
	private String _debitnotenumber;
	private String _division;
	private long _documentName;
	private int _documentYear;
	private String _financialaccountant;
	private Date _fromdate;
	private int _markasdeleted;
	private String _organization;
	private int _paymenttype;
	private String _reportby;
	private Date _reportdate;
	private Date _todate;
	private double _totalpayment;
	private String _transactionid;
	private int _mariTimeCode;
	private String _comments;
	private String _documentTypeCode;
	private String _keypayGoodCode;
	private String _keypayMerchantCode;
	private String _paymentGateStatusCode;
	private String _paymentGateResponseData;
	private int _paymentGateCheckCode;
	private String _paymentGateCheckResponseData;
	private String _keypayURL;
	private String _currency;
}