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

package vn.gt.dao.danhmuc.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmuc.model.DmHistoryMaritime;

/**
 * The persistence interface for the dm history maritime service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryMaritimePersistenceImpl
 * @see DmHistoryMaritimeUtil
 * @generated
 */
public interface DmHistoryMaritimePersistence extends BasePersistence<DmHistoryMaritime> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryMaritimeUtil} to access the dm history maritime persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history maritime in the entity cache if it is enabled.
	*
	* @param dmHistoryMaritime the dm history maritime
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime);

	/**
	* Caches the dm history maritimes in the entity cache if it is enabled.
	*
	* @param dmHistoryMaritimes the dm history maritimes
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> dmHistoryMaritimes);

	/**
	* Creates a new dm history maritime with the primary key. Does not add the dm history maritime to the database.
	*
	* @param id the primary key for the new dm history maritime
	* @return the new dm history maritime
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime create(int id);

	/**
	* Removes the dm history maritime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException;

	public vn.gt.dao.danhmuc.model.DmHistoryMaritime updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history maritime with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException} if it could not be found.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException;

	/**
	* Returns the dm history maritime with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime, or <code>null</code> if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history maritimes where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history maritimes where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @return the range of matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findByMaritimeCode(
		java.lang.String maritimeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history maritimes where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findByMaritimeCode(
		java.lang.String maritimeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history maritime in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime findByMaritimeCode_First(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException;

	/**
	* Returns the last dm history maritime in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime findByMaritimeCode_Last(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException;

	/**
	* Returns the dm history maritimes before and after the current dm history maritime in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history maritime
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime[] findByMaritimeCode_PrevAndNext(
		int id, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException;

	/**
	* Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException} if it could not be found.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @return the matching dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime findByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException;

	/**
	* Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @return the matching dm history maritime, or <code>null</code> if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime fetchByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history maritime, or <code>null</code> if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime fetchByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history maritimes.
	*
	* @return the dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @return the range of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history maritimes where maritimeCode = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException;

	/**
	* Removes all the dm history maritimes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history maritimes where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the number of matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history maritimes where maritimeCode = &#63; and syncVersion = &#63;.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @return the number of matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history maritimes.
	*
	* @return the number of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}