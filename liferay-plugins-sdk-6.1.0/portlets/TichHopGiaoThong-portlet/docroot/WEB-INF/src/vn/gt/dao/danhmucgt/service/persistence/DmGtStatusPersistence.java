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

package vn.gt.dao.danhmucgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmucgt.model.DmGtStatus;

/**
 * The persistence interface for the dm gt status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtStatusPersistenceImpl
 * @see DmGtStatusUtil
 * @generated
 */
public interface DmGtStatusPersistence extends BasePersistence<DmGtStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGtStatusUtil} to access the dm gt status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm gt status in the entity cache if it is enabled.
	*
	* @param dmGtStatus the dm gt status
	*/
	public void cacheResult(vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus);

	/**
	* Caches the dm gt statuses in the entity cache if it is enabled.
	*
	* @param dmGtStatuses the dm gt statuses
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> dmGtStatuses);

	/**
	* Creates a new dm gt status with the primary key. Does not add the dm gt status to the database.
	*
	* @param id the primary key for the new dm gt status
	* @return the new dm gt status
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus create(long id);

	/**
	* Removes the dm gt status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt status
	* @return the dm gt status that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException;

	public vn.gt.dao.danhmucgt.model.DmGtStatus updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt status with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtStatusException} if it could not be found.
	*
	* @param id the primary key of the dm gt status
	* @return the dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException;

	/**
	* Returns the dm gt status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt status
	* @return the dm gt status, or <code>null</code> if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt statuses where type = &#63;.
	*
	* @param type the type
	* @return the matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByType(
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt statuses where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @return the range of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByType(
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt statuses where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByType(
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm gt status in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a matching dm gt status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus findByType_First(int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException;

	/**
	* Returns the last dm gt status in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a matching dm gt status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus findByType_Last(int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException;

	/**
	* Returns the dm gt statuses before and after the current dm gt status in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm gt status
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus[] findByType_PrevAndNext(
		long id, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException;

	/**
	* Returns all the dm gt statuses where statusCode = &#63; and type = &#63;.
	*
	* @param statusCode the status code
	* @param type the type
	* @return the matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByStatusCode(
		int statusCode, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt statuses where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusCode the status code
	* @param type the type
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @return the range of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByStatusCode(
		int statusCode, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt statuses where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusCode the status code
	* @param type the type
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByStatusCode(
		int statusCode, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusCode the status code
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a matching dm gt status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus findByStatusCode_First(
		int statusCode, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException;

	/**
	* Returns the last dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusCode the status code
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a matching dm gt status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus findByStatusCode_Last(
		int statusCode, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException;

	/**
	* Returns the dm gt statuses before and after the current dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm gt status
	* @param statusCode the status code
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus[] findByStatusCode_PrevAndNext(
		long id, int statusCode, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException;

	/**
	* Returns all the dm gt statuses.
	*
	* @return the dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @return the range of dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt statuses where type = &#63; from the database.
	*
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByType(int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt statuses where statusCode = &#63; and type = &#63; from the database.
	*
	* @param statusCode the status code
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStatusCode(int statusCode, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt statuses where type = &#63;.
	*
	* @param type the type
	* @return the number of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByType(int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt statuses where statusCode = &#63; and type = &#63;.
	*
	* @param statusCode the status code
	* @param type the type
	* @return the number of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByStatusCode(int statusCode, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt statuses.
	*
	* @return the number of dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}