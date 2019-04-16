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

import vn.gt.dao.result.model.TempDebitNote;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempDebitNote in entity cache.
 *
 * @author win_64
 * @see TempDebitNote
 * @generated
 */
public class TempDebitNoteCacheModel implements CacheModel<TempDebitNote>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ATTACHEDFILE=");
		sb.append(ATTACHEDFILE);
		sb.append(", corporationid=");
		sb.append(corporationid);
		sb.append(", debitnotenumber=");
		sb.append(debitnotenumber);
		sb.append(", division=");
		sb.append(division);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", financialaccountant=");
		sb.append(financialaccountant);
		sb.append(", fromdate=");
		sb.append(fromdate);
		sb.append(", markasdeleted=");
		sb.append(markasdeleted);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", paymenttype=");
		sb.append(paymenttype);
		sb.append(", reportby=");
		sb.append(reportby);
		sb.append(", reportdate=");
		sb.append(reportdate);
		sb.append(", todate=");
		sb.append(todate);
		sb.append(", totalpayment=");
		sb.append(totalpayment);
		sb.append(", transactionid=");
		sb.append(transactionid);
		sb.append(", mariTimeCode=");
		sb.append(mariTimeCode);
		sb.append(", comments=");
		sb.append(comments);
		sb.append(", documentTypeCode=");
		sb.append(documentTypeCode);
		sb.append(", keypayGoodCode=");
		sb.append(keypayGoodCode);
		sb.append(", keypayMerchantCode=");
		sb.append(keypayMerchantCode);
		sb.append(", paymentGateStatusCode=");
		sb.append(paymentGateStatusCode);
		sb.append(", paymentGateResponseData=");
		sb.append(paymentGateResponseData);
		sb.append(", paymentGateCheckCode=");
		sb.append(paymentGateCheckCode);
		sb.append(", paymentGateCheckResponseData=");
		sb.append(paymentGateCheckResponseData);
		sb.append(", keypayURL=");
		sb.append(keypayURL);
		sb.append(", currency=");
		sb.append(currency);
		sb.append("}");

		return sb.toString();
	}

	public TempDebitNote toEntityModel() {
		TempDebitNoteImpl tempDebitNoteImpl = new TempDebitNoteImpl();

		tempDebitNoteImpl.setId(id);
		tempDebitNoteImpl.setATTACHEDFILE(ATTACHEDFILE);

		if (corporationid == null) {
			tempDebitNoteImpl.setCorporationid(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setCorporationid(corporationid);
		}

		if (debitnotenumber == null) {
			tempDebitNoteImpl.setDebitnotenumber(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setDebitnotenumber(debitnotenumber);
		}

		if (division == null) {
			tempDebitNoteImpl.setDivision(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setDivision(division);
		}

		tempDebitNoteImpl.setDocumentName(documentName);
		tempDebitNoteImpl.setDocumentYear(documentYear);

		if (financialaccountant == null) {
			tempDebitNoteImpl.setFinancialaccountant(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setFinancialaccountant(financialaccountant);
		}

		if (fromdate == Long.MIN_VALUE) {
			tempDebitNoteImpl.setFromdate(null);
		}
		else {
			tempDebitNoteImpl.setFromdate(new Date(fromdate));
		}

		tempDebitNoteImpl.setMarkasdeleted(markasdeleted);

		if (organization == null) {
			tempDebitNoteImpl.setOrganization(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setOrganization(organization);
		}

		tempDebitNoteImpl.setPaymenttype(paymenttype);

		if (reportby == null) {
			tempDebitNoteImpl.setReportby(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setReportby(reportby);
		}

		if (reportdate == Long.MIN_VALUE) {
			tempDebitNoteImpl.setReportdate(null);
		}
		else {
			tempDebitNoteImpl.setReportdate(new Date(reportdate));
		}

		if (todate == Long.MIN_VALUE) {
			tempDebitNoteImpl.setTodate(null);
		}
		else {
			tempDebitNoteImpl.setTodate(new Date(todate));
		}

		tempDebitNoteImpl.setTotalpayment(totalpayment);

		if (transactionid == null) {
			tempDebitNoteImpl.setTransactionid(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setTransactionid(transactionid);
		}

		tempDebitNoteImpl.setMariTimeCode(mariTimeCode);

		if (comments == null) {
			tempDebitNoteImpl.setComments(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setComments(comments);
		}

		if (documentTypeCode == null) {
			tempDebitNoteImpl.setDocumentTypeCode(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setDocumentTypeCode(documentTypeCode);
		}

		if (keypayGoodCode == null) {
			tempDebitNoteImpl.setKeypayGoodCode(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setKeypayGoodCode(keypayGoodCode);
		}

		if (keypayMerchantCode == null) {
			tempDebitNoteImpl.setKeypayMerchantCode(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setKeypayMerchantCode(keypayMerchantCode);
		}

		if (paymentGateStatusCode == null) {
			tempDebitNoteImpl.setPaymentGateStatusCode(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setPaymentGateStatusCode(paymentGateStatusCode);
		}

		if (paymentGateResponseData == null) {
			tempDebitNoteImpl.setPaymentGateResponseData(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setPaymentGateResponseData(paymentGateResponseData);
		}

		tempDebitNoteImpl.setPaymentGateCheckCode(paymentGateCheckCode);

		if (paymentGateCheckResponseData == null) {
			tempDebitNoteImpl.setPaymentGateCheckResponseData(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setPaymentGateCheckResponseData(paymentGateCheckResponseData);
		}

		if (keypayURL == null) {
			tempDebitNoteImpl.setKeypayURL(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setKeypayURL(keypayURL);
		}

		if (currency == null) {
			tempDebitNoteImpl.setCurrency(StringPool.BLANK);
		}
		else {
			tempDebitNoteImpl.setCurrency(currency);
		}

		tempDebitNoteImpl.resetOriginalValues();

		return tempDebitNoteImpl;
	}

	public long id;
	public long ATTACHEDFILE;
	public String corporationid;
	public String debitnotenumber;
	public String division;
	public long documentName;
	public int documentYear;
	public String financialaccountant;
	public long fromdate;
	public int markasdeleted;
	public String organization;
	public int paymenttype;
	public String reportby;
	public long reportdate;
	public long todate;
	public double totalpayment;
	public String transactionid;
	public int mariTimeCode;
	public String comments;
	public String documentTypeCode;
	public String keypayGoodCode;
	public String keypayMerchantCode;
	public String paymentGateStatusCode;
	public String paymentGateResponseData;
	public int paymentGateCheckCode;
	public String paymentGateCheckResponseData;
	public String keypayURL;
	public String currency;
}