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

import vn.gt.dao.danhmucgt.model.DmHistoryMinistry;

/**
 * The persistence interface for the dm history ministry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryMinistryPersistenceImpl
 * @see DmHistoryMinistryUtil
 * @generated
 */
public interface DmHistoryMinistryPersistence extends BasePersistence<DmHistoryMinistry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryMinistryUtil} to access the dm history ministry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history ministry in the entity cache if it is enabled.
	*
	* @param dmHistoryMinistry the dm history ministry
	*/
	public void cacheResult(
		vn.gt.dao.danhmucgt.model.DmHistoryMinistry dmHistoryMinistry);

	/**
	* Caches the dm history ministries in the entity cache if it is enabled.
	*
	* @param dmHistoryMinistries the dm history ministries
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmHistoryMinistry> dmHistoryMinistries);

	/**
	* Creates a new dm history ministry with the primary key. Does not add the dm history ministry to the database.
	*
	* @param id the primary key for the new dm history ministry
	* @return the new dm history ministry
	*/
	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry create(long id);

	/**
	* Removes the dm history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history ministry
	* @return the dm history ministry that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException;

	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry updateImpl(
		vn.gt.dao.danhmucgt.model.DmHistoryMinistry dmHistoryMinistry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ministry with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException} if it could not be found.
	*
	* @param id the primary key of the dm history ministry
	* @return the dm history ministry
	* @throws vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException if a dm history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException;

	/**
	* Returns the dm history ministry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history ministry
	* @return the dm history ministry, or <code>null</code> if a dm history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ministry where ministryCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException} if it could not be found.
	*
	* @param ministryCode the ministry code
	* @return the matching dm history ministry
	* @throws vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException if a matching dm history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry findByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException;

	/**
	* Returns the dm history ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ministryCode the ministry code
	* @return the matching dm history ministry, or <code>null</code> if a matching dm history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry fetchByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ministryCode the ministry code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history ministry, or <code>null</code> if a matching dm history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmHistoryMinistry fetchByMinistryCode(
		java.lang.String ministryCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history ministries.
	*
	* @return the dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmHistoryMinistry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history ministries
	* @param end the upper bound of the range of dm history ministries (not inclusive)
	* @return the range of dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmHistoryMinistry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history ministries
	* @param end the upper bound of the range of dm history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmHistoryMinistry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history ministry where ministryCode = &#63; from the database.
	*
	* @param ministryCode the ministry code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmHistoryMinistryException;

	/**
	* Removes all the dm history ministries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the number of matching dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public int countByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history ministries.
	*
	* @return the number of dm history ministries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}