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

package vn.gt.dao.nhapcanh.service.persistence;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.nhapcanh.model.PassengerList;

/**
 * The persistence interface for the passenger list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see PassengerListPersistenceImpl
 * @see PassengerListUtil
 * @generated
 */
public interface PassengerListPersistence extends BasePersistence<PassengerList> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PassengerListUtil} to access the passenger list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the passenger list in the entity cache if it is enabled.
	*
	* @param passengerList the passenger list
	*/
	public void cacheResult(
		vn.gt.dao.nhapcanh.model.PassengerList passengerList);

	/**
	* Caches the passenger lists in the entity cache if it is enabled.
	*
	* @param passengerLists the passenger lists
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> passengerLists);

	/**
	* Creates a new passenger list with the primary key. Does not add the passenger list to the database.
	*
	* @param id the primary key for the new passenger list
	* @return the new passenger list
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList create(long id);

	/**
	* Removes the passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the passenger list
	* @return the passenger list that was removed
	* @throws vn.gt.dao.nhapcanh.NoSuchPassengerListException if a passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchPassengerListException;

	public vn.gt.dao.nhapcanh.model.PassengerList updateImpl(
		vn.gt.dao.nhapcanh.model.PassengerList passengerList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the passenger list with the primary key or throws a {@link vn.gt.dao.nhapcanh.NoSuchPassengerListException} if it could not be found.
	*
	* @param id the primary key of the passenger list
	* @return the passenger list
	* @throws vn.gt.dao.nhapcanh.NoSuchPassengerListException if a passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchPassengerListException;

	/**
	* Returns the passenger list with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the passenger list
	* @return the passenger list, or <code>null</code> if a passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the passenger lists.
	*
	* @return the passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the passenger lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of passenger lists
	* @param end the upper bound of the range of passenger lists (not inclusive)
	* @return the range of passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the passenger lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of passenger lists
	* @param end the upper bound of the range of passenger lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the passenger lists from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of passenger lists.
	*
	* @return the number of passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public PassengerList remove(PassengerList passengerList)
		throws SystemException;
}