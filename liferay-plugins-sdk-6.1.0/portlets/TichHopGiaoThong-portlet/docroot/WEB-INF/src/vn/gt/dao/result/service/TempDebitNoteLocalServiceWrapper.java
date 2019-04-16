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

package vn.gt.dao.result.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempDebitNoteLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempDebitNoteLocalService
 * @generated
 */
public class TempDebitNoteLocalServiceWrapper
	implements TempDebitNoteLocalService,
		ServiceWrapper<TempDebitNoteLocalService> {
	public TempDebitNoteLocalServiceWrapper(
		TempDebitNoteLocalService tempDebitNoteLocalService) {
		_tempDebitNoteLocalService = tempDebitNoteLocalService;
	}

	/**
	* Adds the temp debit note to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDebitNote the temp debit note
	* @return the temp debit note that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote addTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.addTempDebitNote(tempDebitNote);
	}

	/**
	* Creates a new temp debit note with the primary key. Does not add the temp debit note to the database.
	*
	* @param id the primary key for the new temp debit note
	* @return the new temp debit note
	*/
	public vn.gt.dao.result.model.TempDebitNote createTempDebitNote(long id) {
		return _tempDebitNoteLocalService.createTempDebitNote(id);
	}

	/**
	* Deletes the temp debit note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp debit note
	* @throws PortalException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempDebitNoteLocalService.deleteTempDebitNote(id);
	}

	/**
	* Deletes the temp debit note from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDebitNote the temp debit note
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDebitNoteLocalService.deleteTempDebitNote(tempDebitNote);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.result.model.TempDebitNote fetchTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.fetchTempDebitNote(id);
	}

	/**
	* Returns the temp debit note with the primary key.
	*
	* @param id the primary key of the temp debit note
	* @return the temp debit note
	* @throws PortalException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote getTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.getTempDebitNote(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp debit notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> getTempDebitNotes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.getTempDebitNotes(start, end);
	}

	/**
	* Returns the number of temp debit notes.
	*
	* @return the number of temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int getTempDebitNotesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.getTempDebitNotesCount();
	}

	/**
	* Updates the temp debit note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDebitNote the temp debit note
	* @return the temp debit note that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote updateTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.updateTempDebitNote(tempDebitNote);
	}

	/**
	* Updates the temp debit note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDebitNote the temp debit note
	* @param merge whether to merge the temp debit note with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp debit note that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote updateTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDebitNoteLocalService.updateTempDebitNote(tempDebitNote,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempDebitNoteLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempDebitNoteLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.result.model.TempDebitNote doTempDebitNote(
		long documentName, int documentYear, java.lang.String corporationid,
		java.lang.String debitnotenumber, java.lang.String division,
		java.lang.String financialaccountant, java.util.Date fromdate,
		int markasdeleted, java.lang.String organization, int paymenttype,
		java.lang.String reportby, java.util.Date reportdate,
		java.util.Date todate, double totalpayment,
		java.lang.String transactionid, java.lang.String mariTimeCode,
		java.lang.String currency) {
		return _tempDebitNoteLocalService.doTempDebitNote(documentName,
			documentYear, corporationid, debitnotenumber, division,
			financialaccountant, fromdate, markasdeleted, organization,
			paymenttype, reportby, reportdate, todate, totalpayment,
			transactionid, mariTimeCode, currency);
	}

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedSearch(
		int mariTimeCode, int markasdeleted, java.lang.String documentName,
		java.lang.String debitnotenumber, java.lang.String[] documentTypeCode,
		int start, int end) {
		return _tempDebitNoteLocalService.findByMarkasdeletedSearch(mariTimeCode,
			markasdeleted, documentName, debitnotenumber, documentTypeCode,
			start, end);
	}

	public long countByMarkasdeletedSearch(int mariTimeCode, int markasdeleted,
		java.lang.String documentName, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCode) {
		return _tempDebitNoteLocalService.countByMarkasdeletedSearch(mariTimeCode,
			markasdeleted, documentName, debitnotenumber, documentTypeCode);
	}

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCode, int start, int end) {
		return _tempDebitNoteLocalService.findByMarkasdeleted(markasdeleted,
			mariTimeCode, documentTypeCode, start, end);
	}

	public long countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCode) {
		return _tempDebitNoteLocalService.countByMarkasdeleted(markasdeleted,
			mariTimeCode, documentTypeCode);
	}

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted, int start, int end) {
		return _tempDebitNoteLocalService.findByMarkasdeletedAll(markasdeleted,
			start, end);
	}

	public long countByMarkasdeletedAll(int markasdeleted) {
		return _tempDebitNoteLocalService.countByMarkasdeletedAll(markasdeleted);
	}

	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return _tempDebitNoteLocalService.findByDocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public vn.gt.dao.result.model.TempDebitNote getByNumberDebit(
		java.lang.String debitnotenumber) {
		return _tempDebitNoteLocalService.getByNumberDebit(debitnotenumber);
	}

	public vn.gt.dao.result.model.TempDebitNote getDebitNoteByTransactionId(
		java.lang.String transactionId) {
		return _tempDebitNoteLocalService.getDebitNoteByTransactionId(transactionId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempDebitNoteLocalService getWrappedTempDebitNoteLocalService() {
		return _tempDebitNoteLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempDebitNoteLocalService(
		TempDebitNoteLocalService tempDebitNoteLocalService) {
		_tempDebitNoteLocalService = tempDebitNoteLocalService;
	}

	public TempDebitNoteLocalService getWrappedService() {
		return _tempDebitNoteLocalService;
	}

	public void setWrappedService(
		TempDebitNoteLocalService tempDebitNoteLocalService) {
		_tempDebitNoteLocalService = tempDebitNoteLocalService;
	}

	private TempDebitNoteLocalService _tempDebitNoteLocalService;
}