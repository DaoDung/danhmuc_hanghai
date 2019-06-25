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

import vn.gt.dao.danhmuc.model.DmHistoryPassportType;

/**
 * The persistence interface for the dm history passport type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPassportTypePersistenceImpl
 * @see DmHistoryPassportTypeUtil
 * @generated
 */
public interface DmHistoryPassportTypePersistence extends BasePersistence<DmHistoryPassportType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryPassportTypeUtil} to access the dm history passport type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history passport type in the entity cache if it is enabled.
	*
	* @param dmHistoryPassportType the dm history passport type
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryPassportType dmHistoryPassportType);

	/**
	* Caches the dm history passport types in the entity cache if it is enabled.
	*
	* @param dmHistoryPassportTypes the dm history passport types
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> dmHistoryPassportTypes);

	/**
	* Creates a new dm history passport type with the primary key. Does not add the dm history passport type to the database.
	*
	* @param id the primary key for the new dm history passport type
	* @return the new dm history passport type
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType create(int id);

	/**
	* Removes the dm history passport type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history passport type
	* @return the dm history passport type that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a dm history passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException;

	public vn.gt.dao.danhmuc.model.DmHistoryPassportType updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPassportType dmHistoryPassportType,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history passport type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history passport type
	* @return the dm history passport type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a dm history passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException;

	/**
	* Returns the dm history passport type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history passport type
	* @return the dm history passport type, or <code>null</code> if a dm history passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history passport types where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @return the matching dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history passport types where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param passportTypeCode the passport type code
	* @param start the lower bound of the range of dm history passport types
	* @param end the upper bound of the range of dm history passport types (not inclusive)
	* @return the range of matching dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history passport types where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param passportTypeCode the passport type code
	* @param start the lower bound of the range of dm history passport types
	* @param end the upper bound of the range of dm history passport types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history passport type in the ordered set where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history passport type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a matching dm history passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType findByPassportTypeCode_First(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException;

	/**
	* Returns the last dm history passport type in the ordered set where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history passport type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a matching dm history passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType findByPassportTypeCode_Last(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException;

	/**
	* Returns the dm history passport types before and after the current dm history passport type in the ordered set where passportTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history passport type
	* @param passportTypeCode the passport type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history passport type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a dm history passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType[] findByPassportTypeCode_PrevAndNext(
		int id, java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException;

	/**
	* Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException} if it could not be found.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @return the matching dm history passport type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a matching dm history passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType findByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException;

	/**
	* Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @return the matching dm history passport type, or <code>null</code> if a matching dm history passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType fetchByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history passport type, or <code>null</code> if a matching dm history passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPassportType fetchByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history passport types.
	*
	* @return the dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history passport types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history passport types
	* @param end the upper bound of the range of dm history passport types (not inclusive)
	* @return the range of dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history passport types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history passport types
	* @param end the upper bound of the range of dm history passport types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history passport types where passportTypeCode = &#63; from the database.
	*
	* @param passportTypeCode the passport type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPassportTypeCode(java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException;

	/**
	* Removes all the dm history passport types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history passport types where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @return the number of matching dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public int countByPassportTypeCode(java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history passport types where passportTypeCode = &#63; and syncVersion = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @return the number of matching dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public int countByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history passport types.
	*
	* @return the number of dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}