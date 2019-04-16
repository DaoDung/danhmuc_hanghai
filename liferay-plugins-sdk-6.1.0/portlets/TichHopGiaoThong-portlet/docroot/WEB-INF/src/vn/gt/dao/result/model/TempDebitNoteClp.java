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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempDebitNoteClp extends BaseModelImpl<TempDebitNote>
	implements TempDebitNote {
	public TempDebitNoteClp() {
	}

	public Class<?> getModelClass() {
		return TempDebitNote.class;
	}

	public String getModelClassName() {
		return TempDebitNote.class.getName();
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

	public void persist() throws SystemException {
		TempDebitNoteLocalServiceUtil.updateTempDebitNote(this);
	}

	@Override
	public TempDebitNote toEscapedModel() {
		return (TempDebitNote)Proxy.newProxyInstance(TempDebitNote.class.getClassLoader(),
			new Class[] { TempDebitNote.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDebitNoteClp clone = new TempDebitNoteClp();

		clone.setId(getId());
		clone.setATTACHEDFILE(getATTACHEDFILE());
		clone.setCorporationid(getCorporationid());
		clone.setDebitnotenumber(getDebitnotenumber());
		clone.setDivision(getDivision());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setFinancialaccountant(getFinancialaccountant());
		clone.setFromdate(getFromdate());
		clone.setMarkasdeleted(getMarkasdeleted());
		clone.setOrganization(getOrganization());
		clone.setPaymenttype(getPaymenttype());
		clone.setReportby(getReportby());
		clone.setReportdate(getReportdate());
		clone.setTodate(getTodate());
		clone.setTotalpayment(getTotalpayment());
		clone.setTransactionid(getTransactionid());
		clone.setMariTimeCode(getMariTimeCode());
		clone.setComments(getComments());
		clone.setDocumentTypeCode(getDocumentTypeCode());
		clone.setKeypayGoodCode(getKeypayGoodCode());
		clone.setKeypayMerchantCode(getKeypayMerchantCode());
		clone.setPaymentGateStatusCode(getPaymentGateStatusCode());
		clone.setPaymentGateResponseData(getPaymentGateResponseData());
		clone.setPaymentGateCheckCode(getPaymentGateCheckCode());
		clone.setPaymentGateCheckResponseData(getPaymentGateCheckResponseData());
		clone.setKeypayURL(getKeypayURL());
		clone.setCurrency(getCurrency());

		return clone;
	}

	public int compareTo(TempDebitNote tempDebitNote) {
		int value = 0;

		value = DateUtil.compareTo(getReportdate(),
				tempDebitNote.getReportdate());

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

		TempDebitNoteClp tempDebitNote = null;

		try {
			tempDebitNote = (TempDebitNoteClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempDebitNote.getPrimaryKey();

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
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ATTACHEDFILE=");
		sb.append(getATTACHEDFILE());
		sb.append(", corporationid=");
		sb.append(getCorporationid());
		sb.append(", debitnotenumber=");
		sb.append(getDebitnotenumber());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", financialaccountant=");
		sb.append(getFinancialaccountant());
		sb.append(", fromdate=");
		sb.append(getFromdate());
		sb.append(", markasdeleted=");
		sb.append(getMarkasdeleted());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", paymenttype=");
		sb.append(getPaymenttype());
		sb.append(", reportby=");
		sb.append(getReportby());
		sb.append(", reportdate=");
		sb.append(getReportdate());
		sb.append(", todate=");
		sb.append(getTodate());
		sb.append(", totalpayment=");
		sb.append(getTotalpayment());
		sb.append(", transactionid=");
		sb.append(getTransactionid());
		sb.append(", mariTimeCode=");
		sb.append(getMariTimeCode());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append(", documentTypeCode=");
		sb.append(getDocumentTypeCode());
		sb.append(", keypayGoodCode=");
		sb.append(getKeypayGoodCode());
		sb.append(", keypayMerchantCode=");
		sb.append(getKeypayMerchantCode());
		sb.append(", paymentGateStatusCode=");
		sb.append(getPaymentGateStatusCode());
		sb.append(", paymentGateResponseData=");
		sb.append(getPaymentGateResponseData());
		sb.append(", paymentGateCheckCode=");
		sb.append(getPaymentGateCheckCode());
		sb.append(", paymentGateCheckResponseData=");
		sb.append(getPaymentGateCheckResponseData());
		sb.append(", keypayURL=");
		sb.append(getKeypayURL());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.result.model.TempDebitNote");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ATTACHEDFILE</column-name><column-value><![CDATA[");
		sb.append(getATTACHEDFILE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationid</column-name><column-value><![CDATA[");
		sb.append(getCorporationid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>debitnotenumber</column-name><column-value><![CDATA[");
		sb.append(getDebitnotenumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
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
			"<column><column-name>financialaccountant</column-name><column-value><![CDATA[");
		sb.append(getFinancialaccountant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromdate</column-name><column-value><![CDATA[");
		sb.append(getFromdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markasdeleted</column-name><column-value><![CDATA[");
		sb.append(getMarkasdeleted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymenttype</column-name><column-value><![CDATA[");
		sb.append(getPaymenttype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportby</column-name><column-value><![CDATA[");
		sb.append(getReportby());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportdate</column-name><column-value><![CDATA[");
		sb.append(getReportdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>todate</column-name><column-value><![CDATA[");
		sb.append(getTodate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalpayment</column-name><column-value><![CDATA[");
		sb.append(getTotalpayment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transactionid</column-name><column-value><![CDATA[");
		sb.append(getTransactionid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mariTimeCode</column-name><column-value><![CDATA[");
		sb.append(getMariTimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentTypeCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayGoodCode</column-name><column-value><![CDATA[");
		sb.append(getKeypayGoodCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayMerchantCode</column-name><column-value><![CDATA[");
		sb.append(getKeypayMerchantCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentGateStatusCode</column-name><column-value><![CDATA[");
		sb.append(getPaymentGateStatusCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentGateResponseData</column-name><column-value><![CDATA[");
		sb.append(getPaymentGateResponseData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentGateCheckCode</column-name><column-value><![CDATA[");
		sb.append(getPaymentGateCheckCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentGateCheckResponseData</column-name><column-value><![CDATA[");
		sb.append(getPaymentGateCheckResponseData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keypayURL</column-name><column-value><![CDATA[");
		sb.append(getKeypayURL());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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