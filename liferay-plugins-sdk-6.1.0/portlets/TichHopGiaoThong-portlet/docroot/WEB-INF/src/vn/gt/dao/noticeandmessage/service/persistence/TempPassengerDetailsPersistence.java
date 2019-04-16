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

import vn.gt.dao.noticeandmessage.model.TempPassengerDetails;

/**
 * The persistence interface for the temp passenger details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempPassengerDetailsPersistenceImpl
 * @see TempPassengerDetailsUtil
 * @generated
 */
public interface TempPassengerDetailsPersistence extends BasePersistence<TempPassengerDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempPassengerDetailsUtil} to access the temp passenger details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the temp passenger details in the entity cache if it is enabled.
	*
	* @param tempPassengerDetails the temp passenger details
	*/
	public void cacheResult(
		vn.gt.dao.noticeandmessage.model.TempPassengerDetails tempPassengerDetails);

	/**
	* Caches the temp passenger detailses in the entity cache if it is enabled.
	*
	* @param tempPassengerDetailses the temp passenger detailses
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> tempPassengerDetailses);

	/**
	* Creates a new temp passenger details with the primary key. Does not add the temp passenger details to the database.
	*
	* @param id the primary key for the new temp passenger details
	* @return the new temp passenger details
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails create(long id);

	/**
	* Removes the temp passenger details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp passenger details
	* @return the temp passenger details that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;

	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails updateImpl(
		vn.gt.dao.noticeandmessage.model.TempPassengerDetails tempPassengerDetails,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp passenger details with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException} if it could not be found.
	*
	* @param id the primary key of the temp passenger details
	* @return the temp passenger details
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;

	/**
	* Returns the temp passenger details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp passenger details
	* @return the temp passenger details, or <code>null</code> if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp passenger detailses where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp passenger detailses where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @return the range of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp passenger detailses where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp passenger details in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp passenger details
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;

	/**
	* Returns the last temp passenger details in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp passenger details
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;

	/**
	* Returns the temp passenger detailses before and after the current temp passenger details in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp passenger details
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp passenger details
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;

	/**
	* Returns all the temp passenger detailses where passengerCode = &#63;.
	*
	* @param passengerCode the passenger code
	* @return the matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findByPassengerCode(
		java.lang.String passengerCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp passenger detailses where passengerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param passengerCode the passenger code
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @return the range of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findByPassengerCode(
		java.lang.String passengerCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp passenger detailses where passengerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param passengerCode the passenger code
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findByPassengerCode(
		java.lang.String passengerCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first temp passenger details in the ordered set where passengerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param passengerCode the passenger code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp passenger details
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails findByPassengerCode_First(
		java.lang.String passengerCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;

	/**
	* Returns the last temp passenger details in the ordered set where passengerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param passengerCode the passenger code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp passenger details
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails findByPassengerCode_Last(
		java.lang.String passengerCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;

	/**
	* Returns the temp passenger detailses before and after the current temp passenger details in the ordered set where passengerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp passenger details
	* @param passengerCode the passenger code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp passenger details
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempPassengerDetails[] findByPassengerCode_PrevAndNext(
		long id, java.lang.String passengerCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempPassengerDetailsException;

	/**
	* Returns all the temp passenger detailses.
	*
	* @return the temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the temp passenger detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @return the range of temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the temp passenger detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempPassengerDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp passenger detailses where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp passenger detailses where passengerCode = &#63; from the database.
	*
	* @param passengerCode the passenger code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPassengerCode(java.lang.String passengerCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp passenger detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp passenger detailses where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp passenger detailses where passengerCode = &#63;.
	*
	* @param passengerCode the passenger code
	* @return the number of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByPassengerCode(java.lang.String passengerCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp passenger detailses.
	*
	* @return the number of temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}