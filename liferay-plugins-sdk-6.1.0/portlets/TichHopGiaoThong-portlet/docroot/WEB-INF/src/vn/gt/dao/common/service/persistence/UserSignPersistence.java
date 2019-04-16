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

package vn.gt.dao.common.service.persistence;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.common.model.UserSign;

/**
 * The persistence interface for the user sign service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see UserSignPersistenceImpl
 * @see UserSignUtil
 * @generated
 */
public interface UserSignPersistence extends BasePersistence<UserSign> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserSignUtil} to access the user sign persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the user sign in the entity cache if it is enabled.
	*
	* @param userSign the user sign
	*/
	public void cacheResult(vn.gt.dao.common.model.UserSign userSign);

	/**
	* Caches the user signs in the entity cache if it is enabled.
	*
	* @param userSigns the user signs
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.common.model.UserSign> userSigns);

	/**
	* Creates a new user sign with the primary key. Does not add the user sign to the database.
	*
	* @param id the primary key for the new user sign
	* @return the new user sign
	*/
	public vn.gt.dao.common.model.UserSign create(long id);

	/**
	* Removes the user sign with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user sign
	* @return the user sign that was removed
	* @throws vn.gt.dao.common.NoSuchUserSignException if a user sign with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserSignException;

	public vn.gt.dao.common.model.UserSign updateImpl(
		vn.gt.dao.common.model.UserSign userSign, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user sign with the primary key or throws a {@link vn.gt.dao.common.NoSuchUserSignException} if it could not be found.
	*
	* @param id the primary key of the user sign
	* @return the user sign
	* @throws vn.gt.dao.common.NoSuchUserSignException if a user sign with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserSignException;

	/**
	* Returns the user sign with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user sign
	* @return the user sign, or <code>null</code> if a user sign with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user signs where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the matching user signs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.common.model.UserSign> findByPortCode(
		java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user signs where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of user signs
	* @param end the upper bound of the range of user signs (not inclusive)
	* @return the range of matching user signs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.common.model.UserSign> findByPortCode(
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user signs where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of user signs
	* @param end the upper bound of the range of user signs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user signs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.common.model.UserSign> findByPortCode(
		java.lang.String portCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user sign in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user sign
	* @throws vn.gt.dao.common.NoSuchUserSignException if a matching user sign could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign findByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserSignException;

	/**
	* Returns the last user sign in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user sign
	* @throws vn.gt.dao.common.NoSuchUserSignException if a matching user sign could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign findByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserSignException;

	/**
	* Returns the user signs before and after the current user sign in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current user sign
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user sign
	* @throws vn.gt.dao.common.NoSuchUserSignException if a user sign with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign[] findByPortCode_PrevAndNext(
		long id, java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserSignException;

	/**
	* Returns the user sign where userId = &#63; or throws a {@link vn.gt.dao.common.NoSuchUserSignException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching user sign
	* @throws vn.gt.dao.common.NoSuchUserSignException if a matching user sign could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign findByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserSignException;

	/**
	* Returns the user sign where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching user sign, or <code>null</code> if a matching user sign could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign fetchByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user sign where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user sign, or <code>null</code> if a matching user sign could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign fetchByUserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user signs.
	*
	* @return the user signs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.common.model.UserSign> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the user signs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user signs
	* @param end the upper bound of the range of user signs (not inclusive)
	* @return the range of user signs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.common.model.UserSign> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the user signs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user signs
	* @param end the upper bound of the range of user signs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user signs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.common.model.UserSign> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user signs where portCode = &#63; from the database.
	*
	* @param portCode the port code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the user sign where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserSignException;

	/**
	* Removes all the user signs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user signs where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the number of matching user signs
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user signs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user signs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user signs.
	*
	* @return the number of user signs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public UserSign remove(UserSign userSign) throws SystemException;
}