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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.result.model.TempDebitNote;

import java.util.List;

/**
 * The persistence utility for the temp debit note service. This utility wraps {@link TempDebitNotePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempDebitNotePersistence
 * @see TempDebitNotePersistenceImpl
 * @generated
 */
public class TempDebitNoteUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TempDebitNote tempDebitNote) {
		getPersistence().clearCache(tempDebitNote);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TempDebitNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempDebitNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempDebitNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TempDebitNote remove(TempDebitNote tempDebitNote)
		throws SystemException {
		return getPersistence().remove(tempDebitNote);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TempDebitNote update(TempDebitNote tempDebitNote,
		boolean merge) throws SystemException {
		return getPersistence().update(tempDebitNote, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TempDebitNote update(TempDebitNote tempDebitNote,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tempDebitNote, merge, serviceContext);
	}

	/**
	* Caches the temp debit note in the entity cache if it is enabled.
	*
	* @param tempDebitNote the temp debit note
	*/
	public static void cacheResult(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote) {
		getPersistence().cacheResult(tempDebitNote);
	}

	/**
	* Caches the temp debit notes in the entity cache if it is enabled.
	*
	* @param tempDebitNotes the temp debit notes
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.result.model.TempDebitNote> tempDebitNotes) {
		getPersistence().cacheResult(tempDebitNotes);
	}

	/**
	* Creates a new temp debit note with the primary key. Does not add the temp debit note to the database.
	*
	* @param id the primary key for the new temp debit note
	* @return the new temp debit note
	*/
	public static vn.gt.dao.result.model.TempDebitNote create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the temp debit note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp debit note
	* @return the temp debit note that was removed
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.result.model.TempDebitNote updateImpl(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempDebitNote, merge);
	}

	/**
	* Returns the temp debit note with the primary key or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	*
	* @param id the primary key of the temp debit note
	* @return the temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the temp debit note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp debit note
	* @return the temp debit note, or <code>null</code> if a temp debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleted);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleted, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleted, start, end, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYearDone_First(
		long documentName, int documentYear, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone_First(documentName,
			documentYear, markasdeleted, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYearDone_Last(
		long documentName, int documentYear, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone_Last(documentName,
			documentYear, markasdeleted, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote[] findByDocumentNameAnddocumentYearDone_PrevAndNext(
		long id, long documentName, int documentYear, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone_PrevAndNext(id,
			documentName, documentYear, markasdeleted, orderByComparator);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleteds);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleteds, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleteds, start, end, orderByComparator);
	}

	/**
	* Returns all the temp debit notes where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName, documentYear);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName,
			documentYear, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
			documentName, documentYear, markasdeleted);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
			documentName, documentYear, markasdeleted, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
			documentName, documentYear, markasdeleted, start, end,
			orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYearMarkasdeleted_First(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearMarkasdeleted_First(mariTimeCode,
			documentName, documentYear, markasdeleted, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYearMarkasdeleted_Last(
		int mariTimeCode, long documentName, int documentYear,
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearMarkasdeleted_Last(mariTimeCode,
			documentName, documentYear, markasdeleted, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote[] findByDocumentNameAnddocumentYearMarkasdeleted_PrevAndNext(
		long id, int mariTimeCode, long documentName, int documentYear,
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearMarkasdeleted_PrevAndNext(id,
			mariTimeCode, documentName, documentYear, markasdeleted,
			orderByComparator);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCode);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCode, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCode, start, end, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findBydocumentNameSearch_First(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findBydocumentNameSearch_First(mariTimeCode, markasdeleted,
			documentName, documentTypeCode, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findBydocumentNameSearch_Last(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findBydocumentNameSearch_Last(mariTimeCode, markasdeleted,
			documentName, documentTypeCode, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote[] findBydocumentNameSearch_PrevAndNext(
		long id, int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findBydocumentNameSearch_PrevAndNext(id, mariTimeCode,
			markasdeleted, documentName, documentTypeCode, orderByComparator);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCodes);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String[] documentTypeCodes, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCodes, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydocumentNameSearch(
		int mariTimeCode, int markasdeleted, long documentName,
		java.lang.String[] documentTypeCodes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCodes, start, end, orderByComparator);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCode);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCode, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCode, start, end, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findBydebitnotenumberSearch_First(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findBydebitnotenumberSearch_First(mariTimeCode,
			markasdeleted, debitnotenumber, documentTypeCode, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findBydebitnotenumberSearch_Last(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findBydebitnotenumberSearch_Last(mariTimeCode,
			markasdeleted, debitnotenumber, documentTypeCode, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote[] findBydebitnotenumberSearch_PrevAndNext(
		long id, int mariTimeCode, int markasdeleted,
		java.lang.String debitnotenumber, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findBydebitnotenumberSearch_PrevAndNext(id, mariTimeCode,
			markasdeleted, debitnotenumber, documentTypeCode, orderByComparator);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCodes);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCodes, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCodes, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findBydebitnotenumberSearch(
		int mariTimeCode, int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCodes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCodes, start, end, orderByComparator);
	}

	/**
	* Returns all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCode);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCode, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCode, start, end, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByMarkasdeleted_First(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByMarkasdeleted_First(markasdeleted, mariTimeCode,
			documentTypeCode, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByMarkasdeleted_Last(
		int markasdeleted, int mariTimeCode, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByMarkasdeleted_Last(markasdeleted, mariTimeCode,
			documentTypeCode, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote[] findByMarkasdeleted_PrevAndNext(
		long id, int markasdeleted, int mariTimeCode,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByMarkasdeleted_PrevAndNext(id, markasdeleted,
			mariTimeCode, documentTypeCode, orderByComparator);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCodes);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCodes, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCodes, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCodes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCodes, start, end, orderByComparator);
	}

	/**
	* Returns all the temp debit notes where markasdeleted = &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @return the matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMarkasdeletedAll(markasdeleted);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMarkasdeletedAll(markasdeleted, start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMarkasdeletedAll(markasdeleted, start, end,
			orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByMarkasdeletedAll_First(
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByMarkasdeletedAll_First(markasdeleted,
			orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote findByMarkasdeletedAll_Last(
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByMarkasdeletedAll_Last(markasdeleted, orderByComparator);
	}

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
	public static vn.gt.dao.result.model.TempDebitNote[] findByMarkasdeletedAll_PrevAndNext(
		long id, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence()
				   .findByMarkasdeletedAll_PrevAndNext(id, markasdeleted,
			orderByComparator);
	}

	/**
	* Returns the temp debit note where debitnotenumber = &#63; or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	*
	* @param debitnotenumber the debitnotenumber
	* @return the matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote findByF_debitnotenumber(
		java.lang.String debitnotenumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence().findByF_debitnotenumber(debitnotenumber);
	}

	/**
	* Returns the temp debit note where debitnotenumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param debitnotenumber the debitnotenumber
	* @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote fetchByF_debitnotenumber(
		java.lang.String debitnotenumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_debitnotenumber(debitnotenumber);
	}

	/**
	* Returns the temp debit note where debitnotenumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param debitnotenumber the debitnotenumber
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote fetchByF_debitnotenumber(
		java.lang.String debitnotenumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_debitnotenumber(debitnotenumber, retrieveFromCache);
	}

	/**
	* Returns the temp debit note where transactionid = &#63; or throws a {@link vn.gt.dao.result.NoSuchTempDebitNoteException} if it could not be found.
	*
	* @param transactionid the transactionid
	* @return the matching temp debit note
	* @throws vn.gt.dao.result.NoSuchTempDebitNoteException if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote findByTransactionId(
		java.lang.String transactionid)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		return getPersistence().findByTransactionId(transactionid);
	}

	/**
	* Returns the temp debit note where transactionid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param transactionid the transactionid
	* @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote fetchByTransactionId(
		java.lang.String transactionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTransactionId(transactionid);
	}

	/**
	* Returns the temp debit note where transactionid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param transactionid the transactionid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching temp debit note, or <code>null</code> if a matching temp debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.TempDebitNote fetchByTransactionId(
		java.lang.String transactionid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTransactionId(transactionid, retrieveFromCache);
	}

	/**
	* Returns all the temp debit notes.
	*
	* @return the temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.gt.dao.result.model.TempDebitNote> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleted);
	}

	/**
	* Removes all the temp debit notes where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Removes all the temp debit notes where mariTimeCode = &#63; and documentName = &#63; and documentYear = &#63; and markasdeleted = &#63; from the database.
	*
	* @param mariTimeCode the mari time code
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
			documentName, documentYear, markasdeleted);
	}

	/**
	* Removes all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and documentName = &#63; and documentTypeCode = &#63; from the database.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param documentName the document name
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCode);
	}

	/**
	* Removes all the temp debit notes where mariTimeCode = &#63; and markasdeleted = &#63; and debitnotenumber = &#63; and documentTypeCode = &#63; from the database.
	*
	* @param mariTimeCode the mari time code
	* @param markasdeleted the markasdeleted
	* @param debitnotenumber the debitnotenumber
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCode);
	}

	/**
	* Removes all the temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63; from the database.
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMarkasdeleted(int markasdeleted,
		int mariTimeCode, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByMarkasdeleted(markasdeleted, mariTimeCode, documentTypeCode);
	}

	/**
	* Removes all the temp debit notes where markasdeleted = &#63; from the database.
	*
	* @param markasdeleted the markasdeleted
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMarkasdeletedAll(int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMarkasdeletedAll(markasdeleted);
	}

	/**
	* Removes the temp debit note where debitnotenumber = &#63; from the database.
	*
	* @param debitnotenumber the debitnotenumber
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_debitnotenumber(
		java.lang.String debitnotenumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		getPersistence().removeByF_debitnotenumber(debitnotenumber);
	}

	/**
	* Removes the temp debit note where transactionid = &#63; from the database.
	*
	* @param transactionid the transactionid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTransactionId(java.lang.String transactionid)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchTempDebitNoteException {
		getPersistence().removeByTransactionId(transactionid);
	}

	/**
	* Removes all the temp debit notes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleted the markasdeleted
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleted);
	}

	/**
	* Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63; and markasdeleted = any &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param markasdeleteds the markasdeleteds
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYearDone(
		long documentName, int documentYear, int[] markasdeleteds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYearDone(documentName,
			documentYear, markasdeleteds);
	}

	/**
	* Returns the number of temp debit notes where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYear(documentName,
			documentYear);
	}

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
	public static int countByDocumentNameAnddocumentYearMarkasdeleted(
		int mariTimeCode, long documentName, int documentYear, int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYearMarkasdeleted(mariTimeCode,
			documentName, documentYear, markasdeleted);
	}

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
	public static int countBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCode);
	}

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
	public static int countBydocumentNameSearch(int mariTimeCode,
		int markasdeleted, long documentName,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentNameSearch(mariTimeCode, markasdeleted,
			documentName, documentTypeCodes);
	}

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
	public static int countBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCode);
	}

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
	public static int countBydebitnotenumberSearch(int mariTimeCode,
		int markasdeleted, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydebitnotenumberSearch(mariTimeCode, markasdeleted,
			debitnotenumber, documentTypeCodes);
	}

	/**
	* Returns the number of temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCode the document type code
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCode);
	}

	/**
	* Returns the number of temp debit notes where markasdeleted = &#63; and mariTimeCode = &#63; and documentTypeCode = any &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @param mariTimeCode the mari time code
	* @param documentTypeCodes the document type codes
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCodes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByMarkasdeleted(markasdeleted, mariTimeCode,
			documentTypeCodes);
	}

	/**
	* Returns the number of temp debit notes where markasdeleted = &#63;.
	*
	* @param markasdeleted the markasdeleted
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMarkasdeletedAll(int markasdeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMarkasdeletedAll(markasdeleted);
	}

	/**
	* Returns the number of temp debit notes where debitnotenumber = &#63;.
	*
	* @param debitnotenumber the debitnotenumber
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_debitnotenumber(java.lang.String debitnotenumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_debitnotenumber(debitnotenumber);
	}

	/**
	* Returns the number of temp debit notes where transactionid = &#63;.
	*
	* @param transactionid the transactionid
	* @return the number of matching temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTransactionId(java.lang.String transactionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTransactionId(transactionid);
	}

	/**
	* Returns the number of temp debit notes.
	*
	* @return the number of temp debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempDebitNotePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempDebitNotePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.result.service.ClpSerializer.getServletContextName(),
					TempDebitNotePersistence.class.getName());

			ReferenceRegistry.registerReference(TempDebitNoteUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(TempDebitNotePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(TempDebitNoteUtil.class,
			"_persistence");
	}

	private static TempDebitNotePersistence _persistence;
}