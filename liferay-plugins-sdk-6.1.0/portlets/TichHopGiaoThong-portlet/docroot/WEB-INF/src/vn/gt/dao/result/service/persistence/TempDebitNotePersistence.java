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

package vn.gt.dao.result.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.result.model.TempDebitNote;

/**
 * The persistence interface for the temp debit note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempDebitNotePersistenceImpl
 * @see TempDebitNoteUtil
 * @generated
 */
public interface TempDebitNotePersistence extends BasePersistence<TempDebitNote> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempDebitNoteUtil} to access the temp debit note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the temp debit note in the entity cache if it is enabled.
	*
	* @param tempDebitNote the temp debit note
	*/
	public void cacheResult(vn.gt.dao.result.model.TempDebitNote tempDebitNote);

	/**
	* Caches the temp debit notes in the entity cache if it is enabled.
	*
	* @param tempDebitNotes the temp debit notes
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.result.model.TempDebitNote> tempDebitNotes);

	/**
	* Creates a new temp debit note with the primary key. Does not add the temp debit note to the database.
	*
	* @param id the primary key for the new temp debit note
	* @return the new temp debit note
	*/
	public vn.gt.dao.result.model.TempDebitNote create(long id);

	/**
	* Removes the temp debit note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp debit note
	* @return the temp debit note that was removed
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	public vn.gt.dao.result.model.TempDebitNote updateImpl(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp debit note with the primary key or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	*
	* @param id the primary key of the temp debit note
	* @return the temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp debit note
	* @return the temp debit note, or <code>null</code> if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp debit note in the ordered set where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYearDone_First(
		long documentName, int documentYear, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the last temp debit note in the ordered set where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYearDone_Last(
		long documentName, int documentYear, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit notes before and after the current temp debit note in the ordered set where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp debit note
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote[] findByDocumentNameAnddocumentYearDone_PrevAndNext(
		long id, long documentName, int documentYear, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleteds the markasdeleteds
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleteds the markasdeleteds
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleteds the markasdeleteds
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp debit notes where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp debit note in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the last temp debit note in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit notes before and after the current temp debit note in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp debit note
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp debit note in the ordered set where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYearMarkasdeleted_First(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the last temp debit note in the ordered set where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYearMarkasdeleted_Last(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit notes before and after the current temp debit note in the ordered set where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp debit note
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote[] findByDocumentNameAnddocumentYearMarkasdeleted_PrevAndNext(
		long id, int mariTimeCode, long documentName, int documentYear,
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findBydocumentNameSearch_First(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the last temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findBydocumentNameSearch_Last(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit notes before and after the current temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp debit note
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote[] findBydocumentNameSearch_PrevAndNext(
		long id, int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCodes the document type codes
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCodes the document type codes
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String[] documentTypeCodes, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCodes the document type codes
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String[] documentTypeCodes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findBydebitnotenumberSearch_First(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the last temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findBydebitnotenumberSearch_Last(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit notes before and after the current temp debit note in the ordered set where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp debit note
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote[] findBydebitnotenumberSearch_PrevAndNext(
		long id, int mariTimeCode, int markasdeleted,
		java.lang.String debitnotenumber, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCodes the document type codes
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCodes the document type codes
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCodes, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCodes the document type codes
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCodes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp debit note in the ordered set where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByMarkasdeleted_First(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the last temp debit note in the ordered set where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByMarkasdeleted_Last(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit notes before and after the current temp debit note in the ordered set where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp debit note
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote[] findByMarkasdeleted_PrevAndNext(
		long id, int markasdeleted, int mariTimeCode,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCodes the document type codes
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCodes the document type codes
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCodes, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCodes the document type codes
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCodes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp debit notes where markasdeleted = &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp debit notes where markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @return the range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes where markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp debit note in the ordered set where markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByMarkasdeletedAll_First(
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the last temp debit note in the ordered set where markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByMarkasdeletedAll_Last(
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit notes before and after the current temp debit note in the ordered set where markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp debit note
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote[] findByMarkasdeletedAll_PrevAndNext(
		long id, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit note where debitnotenumber = &#63; or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	*
	* @param debitnotenumber the debitnotenumber
	* @return the matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByF_debitnotenumber(
		java.lang.String debitnotenumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit note where debitnotenumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param debitnotenumber the debitnotenumber
	* @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote fetchByF_debitnotenumber(
		java.lang.String debitnotenumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp debit note where debitnotenumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param debitnotenumber the debitnotenumber
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote fetchByF_debitnotenumber(
		java.lang.String debitnotenumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp debit note where transactionid = &#63; or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	*
	* @param transactionid the transactionid
	* @return the matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote findByTransactionId(
		java.lang.String transactionid)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Returns the temp debit note where transactionid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param transactionid the transactionid
	* @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote fetchByTransactionId(
		java.lang.String transactionid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp debit note where transactionid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param transactionid the transactionid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.TempDebitNote fetchByTransactionId(
		java.lang.String transactionid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp debit notes.
	*
	* @return the temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp debit notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp debit notes
	* @param end the upper bound of the range of temp debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAnddocumentYearDone(long documentName,
		int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp debit notes where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63; from the database.
	*
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63; from the database.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentNameSearch(int mariTimeCode, int markasdeleted,
		long documentName, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63; from the database.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63; from the database.
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMarkasdeleted(int markasdeleted, int mariTimeCode,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp debit notes where markasdeleted = &#63; from the database.
	*
	* @param markasdeleted the markasdeleted
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMarkasdeletedAll(int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the temp debit note where debitnotenumber = &#63; from the database.
	*
	* @param debitnotenumber the debitnotenumber
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_debitnotenumber(java.lang.String debitnotenumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Removes the temp debit note where transactionid = &#63; from the database.
	*
	* @param transactionid the transactionid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTransactionId(java.lang.String transactionid)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException;

	/**
	* Removes all the temp debit notes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYearDone(long documentName,
		int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleteds the markasdeleteds
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYearDone(long documentName,
		int documentYear, int[] markasdeleteds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63;.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentNameSearch(int mariTimeCode, int markasdeleted,
		long documentName, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = any &#63;.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCodes the document type codes
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentNameSearch(int mariTimeCode, int markasdeleted,
		long documentName, java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63;.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = any &#63;.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCodes the document type codes
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCodes the document type codes
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where markasdeleted = &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMarkasdeletedAll(int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where debitnotenumber = &#63;.
	*
	* @param debitnotenumber the debitnotenumber
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_debitnotenumber(java.lang.String debitnotenumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes where transactionid = &#63;.
	*
	* @param transactionid the transactionid
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByTransactionId(java.lang.String transactionid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp debit notes.
	*
	* @return the number of temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}