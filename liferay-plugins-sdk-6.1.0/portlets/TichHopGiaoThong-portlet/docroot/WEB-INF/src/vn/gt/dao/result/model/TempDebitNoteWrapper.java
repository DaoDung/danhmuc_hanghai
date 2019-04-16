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

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempDebitNote}.
 * </p>
 *
 * @author    win_64
 * @see       TempDebitNote
 * @generated
 */
public class TempDebitNoteWrapper implements TempDebitNote,
	ModelWrapper<TempDebitNote> {
	public TempDebitNoteWrapper(TempDebitNote tempDebitNote) {
		_tempDebitNote = tempDebitNote;
	}

	public Class<?> getModelClass() {
		return TempDebitNote.class;
	}

	public String getModelClassName() {
		return TempDebitNote.class.getName();
	}

	/**
	* Returns the primary key of this temp debit note.
	*
	* @return the primary key of this temp debit note
	*/
	public long getPrimaryKey() {
		return _tempDebitNote.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp debit note.
	*
	* @param primaryKey the primary key of this temp debit note
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempDebitNote.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp debit note.
	*
	* @return the ID of this temp debit note
	*/
	public long getId() {
		return _tempDebitNote.getId();
	}

	/**
	* Sets the ID of this temp debit note.
	*
	* @param id the ID of this temp debit note
	*/
	public void setId(long id) {
		_tempDebitNote.setId(id);
	}

	/**
	* Returns the a t t a c h e d f i l e of this temp debit note.
	*
	* @return the a t t a c h e d f i l e of this temp debit note
	*/
	public long getATTACHEDFILE() {
		return _tempDebitNote.getATTACHEDFILE();
	}

	/**
	* Sets the a t t a c h e d f i l e of this temp debit note.
	*
	* @param ATTACHEDFILE the a t t a c h e d f i l e of this temp debit note
	*/
	public void setATTACHEDFILE(long ATTACHEDFILE) {
		_tempDebitNote.setATTACHEDFILE(ATTACHEDFILE);
	}

	/**
	* Returns the corporationid of this temp debit note.
	*
	* @return the corporationid of this temp debit note
	*/
	public java.lang.String getCorporationid() {
		return _tempDebitNote.getCorporationid();
	}

	/**
	* Sets the corporationid of this temp debit note.
	*
	* @param corporationid the corporationid of this temp debit note
	*/
	public void setCorporationid(java.lang.String corporationid) {
		_tempDebitNote.setCorporationid(corporationid);
	}

	/**
	* Returns the debitnotenumber of this temp debit note.
	*
	* @return the debitnotenumber of this temp debit note
	*/
	public java.lang.String getDebitnotenumber() {
		return _tempDebitNote.getDebitnotenumber();
	}

	/**
	* Sets the debitnotenumber of this temp debit note.
	*
	* @param debitnotenumber the debitnotenumber of this temp debit note
	*/
	public void setDebitnotenumber(java.lang.String debitnotenumber) {
		_tempDebitNote.setDebitnotenumber(debitnotenumber);
	}

	/**
	* Returns the division of this temp debit note.
	*
	* @return the division of this temp debit note
	*/
	public java.lang.String getDivision() {
		return _tempDebitNote.getDivision();
	}

	/**
	* Sets the division of this temp debit note.
	*
	* @param division the division of this temp debit note
	*/
	public void setDivision(java.lang.String division) {
		_tempDebitNote.setDivision(division);
	}

	/**
	* Returns the document name of this temp debit note.
	*
	* @return the document name of this temp debit note
	*/
	public long getDocumentName() {
		return _tempDebitNote.getDocumentName();
	}

	/**
	* Sets the document name of this temp debit note.
	*
	* @param documentName the document name of this temp debit note
	*/
	public void setDocumentName(long documentName) {
		_tempDebitNote.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp debit note.
	*
	* @return the document year of this temp debit note
	*/
	public int getDocumentYear() {
		return _tempDebitNote.getDocumentYear();
	}

	/**
	* Sets the document year of this temp debit note.
	*
	* @param documentYear the document year of this temp debit note
	*/
	public void setDocumentYear(int documentYear) {
		_tempDebitNote.setDocumentYear(documentYear);
	}

	/**
	* Returns the financialaccountant of this temp debit note.
	*
	* @return the financialaccountant of this temp debit note
	*/
	public java.lang.String getFinancialaccountant() {
		return _tempDebitNote.getFinancialaccountant();
	}

	/**
	* Sets the financialaccountant of this temp debit note.
	*
	* @param financialaccountant the financialaccountant of this temp debit note
	*/
	public void setFinancialaccountant(java.lang.String financialaccountant) {
		_tempDebitNote.setFinancialaccountant(financialaccountant);
	}

	/**
	* Returns the fromdate of this temp debit note.
	*
	* @return the fromdate of this temp debit note
	*/
	public java.util.Date getFromdate() {
		return _tempDebitNote.getFromdate();
	}

	/**
	* Sets the fromdate of this temp debit note.
	*
	* @param fromdate the fromdate of this temp debit note
	*/
	public void setFromdate(java.util.Date fromdate) {
		_tempDebitNote.setFromdate(fromdate);
	}

	/**
	* Returns the markasdeleted of this temp debit note.
	*
	* @return the markasdeleted of this temp debit note
	*/
	public int getMarkasdeleted() {
		return _tempDebitNote.getMarkasdeleted();
	}

	/**
	* Sets the markasdeleted of this temp debit note.
	*
	* @param markasdeleted the markasdeleted of this temp debit note
	*/
	public void setMarkasdeleted(int markasdeleted) {
		_tempDebitNote.setMarkasdeleted(markasdeleted);
	}

	/**
	* Returns the organization of this temp debit note.
	*
	* @return the organization of this temp debit note
	*/
	public java.lang.String getOrganization() {
		return _tempDebitNote.getOrganization();
	}

	/**
	* Sets the organization of this temp debit note.
	*
	* @param organization the organization of this temp debit note
	*/
	public void setOrganization(java.lang.String organization) {
		_tempDebitNote.setOrganization(organization);
	}

	/**
	* Returns the paymenttype of this temp debit note.
	*
	* @return the paymenttype of this temp debit note
	*/
	public int getPaymenttype() {
		return _tempDebitNote.getPaymenttype();
	}

	/**
	* Sets the paymenttype of this temp debit note.
	*
	* @param paymenttype the paymenttype of this temp debit note
	*/
	public void setPaymenttype(int paymenttype) {
		_tempDebitNote.setPaymenttype(paymenttype);
	}

	/**
	* Returns the reportby of this temp debit note.
	*
	* @return the reportby of this temp debit note
	*/
	public java.lang.String getReportby() {
		return _tempDebitNote.getReportby();
	}

	/**
	* Sets the reportby of this temp debit note.
	*
	* @param reportby the reportby of this temp debit note
	*/
	public void setReportby(java.lang.String reportby) {
		_tempDebitNote.setReportby(reportby);
	}

	/**
	* Returns the reportdate of this temp debit note.
	*
	* @return the reportdate of this temp debit note
	*/
	public java.util.Date getReportdate() {
		return _tempDebitNote.getReportdate();
	}

	/**
	* Sets the reportdate of this temp debit note.
	*
	* @param reportdate the reportdate of this temp debit note
	*/
	public void setReportdate(java.util.Date reportdate) {
		_tempDebitNote.setReportdate(reportdate);
	}

	/**
	* Returns the todate of this temp debit note.
	*
	* @return the todate of this temp debit note
	*/
	public java.util.Date getTodate() {
		return _tempDebitNote.getTodate();
	}

	/**
	* Sets the todate of this temp debit note.
	*
	* @param todate the todate of this temp debit note
	*/
	public void setTodate(java.util.Date todate) {
		_tempDebitNote.setTodate(todate);
	}

	/**
	* Returns the totalpayment of this temp debit note.
	*
	* @return the totalpayment of this temp debit note
	*/
	public double getTotalpayment() {
		return _tempDebitNote.getTotalpayment();
	}

	/**
	* Sets the totalpayment of this temp debit note.
	*
	* @param totalpayment the totalpayment of this temp debit note
	*/
	public void setTotalpayment(double totalpayment) {
		_tempDebitNote.setTotalpayment(totalpayment);
	}

	/**
	* Returns the transactionid of this temp debit note.
	*
	* @return the transactionid of this temp debit note
	*/
	public java.lang.String getTransactionid() {
		return _tempDebitNote.getTransactionid();
	}

	/**
	* Sets the transactionid of this temp debit note.
	*
	* @param transactionid the transactionid of this temp debit note
	*/
	public void setTransactionid(java.lang.String transactionid) {
		_tempDebitNote.setTransactionid(transactionid);
	}

	/**
	* Returns the mari time code of this temp debit note.
	*
	* @return the mari time code of this temp debit note
	*/
	public int getMariTimeCode() {
		return _tempDebitNote.getMariTimeCode();
	}

	/**
	* Sets the mari time code of this temp debit note.
	*
	* @param mariTimeCode the mari time code of this temp debit note
	*/
	public void setMariTimeCode(int mariTimeCode) {
		_tempDebitNote.setMariTimeCode(mariTimeCode);
	}

	/**
	* Returns the comments of this temp debit note.
	*
	* @return the comments of this temp debit note
	*/
	public java.lang.String getComments() {
		return _tempDebitNote.getComments();
	}

	/**
	* Sets the comments of this temp debit note.
	*
	* @param comments the comments of this temp debit note
	*/
	public void setComments(java.lang.String comments) {
		_tempDebitNote.setComments(comments);
	}

	/**
	* Returns the document type code of this temp debit note.
	*
	* @return the document type code of this temp debit note
	*/
	public java.lang.String getDocumentTypeCode() {
		return _tempDebitNote.getDocumentTypeCode();
	}

	/**
	* Sets the document type code of this temp debit note.
	*
	* @param documentTypeCode the document type code of this temp debit note
	*/
	public void setDocumentTypeCode(java.lang.String documentTypeCode) {
		_tempDebitNote.setDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the keypay good code of this temp debit note.
	*
	* @return the keypay good code of this temp debit note
	*/
	public java.lang.String getKeypayGoodCode() {
		return _tempDebitNote.getKeypayGoodCode();
	}

	/**
	* Sets the keypay good code of this temp debit note.
	*
	* @param keypayGoodCode the keypay good code of this temp debit note
	*/
	public void setKeypayGoodCode(java.lang.String keypayGoodCode) {
		_tempDebitNote.setKeypayGoodCode(keypayGoodCode);
	}

	/**
	* Returns the keypay merchant code of this temp debit note.
	*
	* @return the keypay merchant code of this temp debit note
	*/
	public java.lang.String getKeypayMerchantCode() {
		return _tempDebitNote.getKeypayMerchantCode();
	}

	/**
	* Sets the keypay merchant code of this temp debit note.
	*
	* @param keypayMerchantCode the keypay merchant code of this temp debit note
	*/
	public void setKeypayMerchantCode(java.lang.String keypayMerchantCode) {
		_tempDebitNote.setKeypayMerchantCode(keypayMerchantCode);
	}

	/**
	* Returns the payment gate status code of this temp debit note.
	*
	* @return the payment gate status code of this temp debit note
	*/
	public java.lang.String getPaymentGateStatusCode() {
		return _tempDebitNote.getPaymentGateStatusCode();
	}

	/**
	* Sets the payment gate status code of this temp debit note.
	*
	* @param paymentGateStatusCode the payment gate status code of this temp debit note
	*/
	public void setPaymentGateStatusCode(java.lang.String paymentGateStatusCode) {
		_tempDebitNote.setPaymentGateStatusCode(paymentGateStatusCode);
	}

	/**
	* Returns the payment gate response data of this temp debit note.
	*
	* @return the payment gate response data of this temp debit note
	*/
	public java.lang.String getPaymentGateResponseData() {
		return _tempDebitNote.getPaymentGateResponseData();
	}

	/**
	* Sets the payment gate response data of this temp debit note.
	*
	* @param paymentGateResponseData the payment gate response data of this temp debit note
	*/
	public void setPaymentGateResponseData(
		java.lang.String paymentGateResponseData) {
		_tempDebitNote.setPaymentGateResponseData(paymentGateResponseData);
	}

	/**
	* Returns the payment gate check code of this temp debit note.
	*
	* @return the payment gate check code of this temp debit note
	*/
	public int getPaymentGateCheckCode() {
		return _tempDebitNote.getPaymentGateCheckCode();
	}

	/**
	* Sets the payment gate check code of this temp debit note.
	*
	* @param paymentGateCheckCode the payment gate check code of this temp debit note
	*/
	public void setPaymentGateCheckCode(int paymentGateCheckCode) {
		_tempDebitNote.setPaymentGateCheckCode(paymentGateCheckCode);
	}

	/**
	* Returns the payment gate check response data of this temp debit note.
	*
	* @return the payment gate check response data of this temp debit note
	*/
	public java.lang.String getPaymentGateCheckResponseData() {
		return _tempDebitNote.getPaymentGateCheckResponseData();
	}

	/**
	* Sets the payment gate check response data of this temp debit note.
	*
	* @param paymentGateCheckResponseData the payment gate check response data of this temp debit note
	*/
	public void setPaymentGateCheckResponseData(
		java.lang.String paymentGateCheckResponseData) {
		_tempDebitNote.setPaymentGateCheckResponseData(paymentGateCheckResponseData);
	}

	/**
	* Returns the keypay u r l of this temp debit note.
	*
	* @return the keypay u r l of this temp debit note
	*/
	public java.lang.String getKeypayURL() {
		return _tempDebitNote.getKeypayURL();
	}

	/**
	* Sets the keypay u r l of this temp debit note.
	*
	* @param keypayURL the keypay u r l of this temp debit note
	*/
	public void setKeypayURL(java.lang.String keypayURL) {
		_tempDebitNote.setKeypayURL(keypayURL);
	}

	/**
	* Returns the currency of this temp debit note.
	*
	* @return the currency of this temp debit note
	*/
	public java.lang.String getCurrency() {
		return _tempDebitNote.getCurrency();
	}

	/**
	* Sets the currency of this temp debit note.
	*
	* @param currency the currency of this temp debit note
	*/
	public void setCurrency(java.lang.String currency) {
		_tempDebitNote.setCurrency(currency);
	}

	public boolean isNew() {
		return _tempDebitNote.isNew();
	}

	public void setNew(boolean n) {
		_tempDebitNote.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempDebitNote.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempDebitNote.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempDebitNote.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDebitNote.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDebitNote.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDebitNote.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDebitNote.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDebitNoteWrapper((TempDebitNote)_tempDebitNote.clone());
	}

	public int compareTo(vn.gt.dao.result.model.TempDebitNote tempDebitNote) {
		return _tempDebitNote.compareTo(tempDebitNote);
	}

	@Override
	public int hashCode() {
		return _tempDebitNote.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.result.model.TempDebitNote> toCacheModel() {
		return _tempDebitNote.toCacheModel();
	}

	public vn.gt.dao.result.model.TempDebitNote toEscapedModel() {
		return new TempDebitNoteWrapper(_tempDebitNote.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDebitNote.toString();
	}

	public java.lang.String toXmlString() {
		return _tempDebitNote.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDebitNote.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempDebitNote getWrappedTempDebitNote() {
		return _tempDebitNote;
	}

	public TempDebitNote getWrappedModel() {
		return _tempDebitNote;
	}

	public void resetOriginalValues() {
		_tempDebitNote.resetOriginalValues();
	}

	private TempDebitNote _tempDebitNote;
}