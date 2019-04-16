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

import vn.gt.dao.danhmuc.model.DmHistoryRepresentative;

/**
 * The persistence interface for the dm history representative service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryRepresentativePersistenceImpl
 * @see DmHistoryRepresentativeUtil
 * @generated
 */
public interface DmHistoryRepresentativePersistence extends BasePersistence<DmHistoryRepresentative> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryRepresentativeUtil} to access the dm history representative persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history representative in the entity cache if it is enabled.
	*
	* @param dmHistoryRepresentative the dm history representative
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative);

	/**
	* Caches the dm history representatives in the entity cache if it is enabled.
	*
	* @param dmHistoryRepresentatives the dm history representatives
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> dmHistoryRepresentatives);

	/**
	* Creates a new dm history representative with the primary key. Does not add the dm history representative to the database.
	*
	* @param id the primary key for the new dm history representative
	* @return the new dm history representative
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative create(int id);

	/**
	* Removes the dm history representative with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history representative
	* @return the dm history representative that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException;

	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history representative with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	*
	* @param id the primary key of the dm history representative
	* @return the dm history representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException;

	/**
	* Returns the dm history representative with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history representative
	* @return the dm history representative, or <code>null</code> if a dm history representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history representative where repCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	*
	* @param repCode the rep code
	* @return the matching dm history representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative findByRepCode(
		java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException;

	/**
	* Returns the dm history representative where repCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param repCode the rep code
	* @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByRepCode(
		java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history representative where repCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param repCode the rep code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByRepCode(
		java.lang.String repCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @return the matching dm history representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative findByRepCodeAndSyncVersion(
		java.lang.String repCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException;

	/**
	* Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByRepCodeAndSyncVersion(
		java.lang.String repCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByRepCodeAndSyncVersion(
		java.lang.String repCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history representatives.
	*
	* @return the dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history representatives
	* @param end the upper bound of the range of dm history representatives (not inclusive)
	* @return the range of dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history representatives
	* @param end the upper bound of the range of dm history representatives (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history representative where repCode = &#63; from the database.
	*
	* @param repCode the rep code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRepCode(java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException;

	/**
	* Removes the dm history representative where repCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRepCodeAndSyncVersion(java.lang.String repCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException;

	/**
	* Removes all the dm history representatives from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history representatives where repCode = &#63;.
	*
	* @param repCode the rep code
	* @return the number of matching dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public int countByRepCode(java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history representatives where repCode = &#63; and syncVersion = &#63;.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @return the number of matching dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public int countByRepCodeAndSyncVersion(java.lang.String repCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history representatives.
	*
	* @return the number of dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmHistoryRepresentative remove(
		DmHistoryRepresentative dmHistoryRepresentative)
		throws SystemException;
}