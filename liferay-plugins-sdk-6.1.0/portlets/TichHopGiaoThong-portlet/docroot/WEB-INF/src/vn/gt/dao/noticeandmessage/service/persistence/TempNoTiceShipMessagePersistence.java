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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage;

/**
 * The persistence interface for the temp no tice ship message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempNoTiceShipMessagePersistenceImpl
 * @see TempNoTiceShipMessageUtil
 * @generated
 */
public interface TempNoTiceShipMessagePersistence extends BasePersistence<TempNoTiceShipMessage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempNoTiceShipMessageUtil} to access the temp no tice ship message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the temp no tice ship message in the entity cache if it is enabled.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	*/
	public void cacheResult(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage);

	/**
	* Caches the temp no tice ship messages in the entity cache if it is enabled.
	*
	* @param tempNoTiceShipMessages the temp no tice ship messages
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> tempNoTiceShipMessages);

	/**
	* Creates a new temp no tice ship message with the primary key. Does not add the temp no tice ship message to the database.
	*
	* @param id the primary key for the new temp no tice ship message
	* @return the new temp no tice ship message
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage create(
		long id);

	/**
	* Removes the temp no tice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp no tice ship message
	* @return the temp no tice ship message that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage updateImpl(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp no tice ship message with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException} if it could not be found.
	*
	* @param id the primary key of the temp no tice ship message
	* @return the temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns the temp no tice ship message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp no tice ship message
	* @return the temp no tice ship message, or <code>null</code> if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp no tice ship message
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @return the matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findBydocumentNameAndDocumentYearAndNoticeShipType_First(
		long documentName, int documentYear, java.lang.String noticeShipType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findBydocumentNameAndDocumentYearAndNoticeShipType_Last(
		long documentName, int documentYear, java.lang.String noticeShipType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp no tice ship message
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage[] findBydocumentNameAndDocumentYearAndNoticeShipType_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String noticeShipType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns all the temp no tice ship messages where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp no tice ship messages where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp no tice ship messages where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp no tice ship message in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns the last temp no tice ship message in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp no tice ship message
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp no tice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempNoTiceShipMessageException;

	/**
	* Returns all the temp no tice ship messages.
	*
	* @return the temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp no tice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp no tice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp no tice ship messages where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp no tice ship messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param noticeShipType the notice ship type
	* @return the number of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp no tice ship messages where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp no tice ship messages.
	*
	* @return the number of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}