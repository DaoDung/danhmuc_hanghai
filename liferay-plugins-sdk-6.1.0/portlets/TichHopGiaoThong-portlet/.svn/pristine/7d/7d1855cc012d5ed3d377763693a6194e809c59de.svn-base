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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmuc.model.DmSecurityLevel;

/**
 * The persistence interface for the dm security level service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmSecurityLevelPersistenceImpl
 * @see DmSecurityLevelUtil
 * @generated
 */
public interface DmSecurityLevelPersistence extends BasePersistence<DmSecurityLevel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmSecurityLevelUtil} to access the dm security level persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm security level in the entity cache if it is enabled.
	*
	* @param dmSecurityLevel the dm security level
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel);

	/**
	* Caches the dm security levels in the entity cache if it is enabled.
	*
	* @param dmSecurityLevels the dm security levels
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> dmSecurityLevels);

	/**
	* Creates a new dm security level with the primary key. Does not add the dm security level to the database.
	*
	* @param id the primary key for the new dm security level
	* @return the new dm security level
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel create(int id);

	/**
	* Removes the dm security level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm security level
	* @return the dm security level that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException;

	public vn.gt.dao.danhmuc.model.DmSecurityLevel updateImpl(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm security level with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException} if it could not be found.
	*
	* @param id the primary key of the dm security level
	* @return the dm security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException;

	/**
	* Returns the dm security level with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm security level
	* @return the dm security level, or <code>null</code> if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm security levels where securityLevelCode = &#63;.
	*
	* @param securityLevelCode the security level code
	* @return the matching dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm security levels where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityLevelCode the security level code
	* @param start the lower bound of the range of dm security levels
	* @param end the upper bound of the range of dm security levels (not inclusive)
	* @return the range of matching dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm security levels where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityLevelCode the security level code
	* @param start the lower bound of the range of dm security levels
	* @param end the upper bound of the range of dm security levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm security level in the ordered set where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityLevelCode the security level code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a matching dm security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel findBySecurityLevelCode_First(
		java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException;

	/**
	* Returns the last dm security level in the ordered set where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityLevelCode the security level code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a matching dm security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel findBySecurityLevelCode_Last(
		java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException;

	/**
	* Returns the dm security levels before and after the current dm security level in the ordered set where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm security level
	* @param securityLevelCode the security level code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel[] findBySecurityLevelCode_PrevAndNext(
		int id, java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException;

	/**
	* Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException} if it could not be found.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the matching dm security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a matching dm security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel findBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException;

	/**
	* Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the matching dm security level, or <code>null</code> if a matching dm security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm security level, or <code>null</code> if a matching dm security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm security levels.
	*
	* @return the dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm security levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm security levels
	* @param end the upper bound of the range of dm security levels (not inclusive)
	* @return the range of dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm security levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm security levels
	* @param end the upper bound of the range of dm security levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm security levels where securityLevelCode = &#63; from the database.
	*
	* @param securityLevelCode the security level code
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySecurityLevelCode(java.lang.String securityLevelCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm security level where securityLevelCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException;

	/**
	* Removes all the dm security levels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm security levels where securityLevelCode = &#63;.
	*
	* @param securityLevelCode the security level code
	* @return the number of matching dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public int countBySecurityLevelCode(java.lang.String securityLevelCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm security levels where securityLevelCode = &#63; and syncVersion = &#63;.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the number of matching dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public int countBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm security levels.
	*
	* @return the number of dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmSecurityLevel remove(DmSecurityLevel dmSecurityLevel)
		throws SystemException;
}