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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the temp debit note local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempDebitNoteLocalServiceUtil
 * @see vn.gt.dao.result.service.base.TempDebitNoteLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.impl.TempDebitNoteLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TempDebitNoteLocalService extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempDebitNoteLocalServiceUtil} to access the temp debit note local service. Add custom service methods to {@link vn.gt.dao.result.service.impl.TempDebitNoteLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the temp debit note to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDebitNote the temp debit note
	* @return the temp debit note that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote addTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new temp debit note with the primary key. Does not add the temp debit note to the database.
	*
	* @param id the primary key for the new temp debit note
	* @return the new temp debit note
	*/
	public vn.gt.dao.result.model.TempDebitNote createTempDebitNote(long id);

	/**
	* Deletes the temp debit note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp debit note
	* @throws PortalException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the temp debit note from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDebitNote the temp debit note
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.result.model.TempDebitNote fetchTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp debit note with the primary key.
	*
	* @param id the primary key of the temp debit note
	* @return the temp debit note
	* @throws PortalException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.result.model.TempDebitNote getTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> getTempDebitNotes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes.
	*
	* @return the number of temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTempDebitNotesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the temp debit note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDebitNote the temp debit note
	* @return the temp debit note that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote updateTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public vn.gt.dao.result.model.TempDebitNote doTempDebitNote(
		long documentName, int documentYear, java.lang.String corporationid,
		java.lang.String debitnotenumber, java.lang.String division,
		java.lang.String financialaccountant, java.util.Date fromdate,
		int markasdeleted, java.lang.String organization, int paymenttype,
		java.lang.String reportby, java.util.Date reportdate,
		java.util.Date todate, double totalpayment,
		java.lang.String transactionid, java.lang.String mariTimeCode,
		java.lang.String currency);

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedSearch(
		int mariTimeCode, int markasdeleted, java.lang.String documentName,
		java.lang.String debitnotenumber, java.lang.String[] documentTypeCode,
		int start, int end);

	public long countByMarkasdeletedSearch(int mariTimeCode, int markasdeleted,
		java.lang.String documentName, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCode);

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCode, int start, int end);

	public long countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCode);

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted, int start, int end);

	public long countByMarkasdeletedAll(int markasdeleted);

	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYear(
		long documentName, int documentYear);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.result.model.TempDebitNote getByNumberDebit(
		java.lang.String debitnotenumber);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.result.model.TempDebitNote getDebitNoteByTransactionId(
		java.lang.String transactionId);
}