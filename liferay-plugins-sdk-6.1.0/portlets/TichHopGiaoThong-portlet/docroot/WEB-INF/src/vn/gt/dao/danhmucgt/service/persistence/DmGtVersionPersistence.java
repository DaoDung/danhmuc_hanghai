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

import vn.gt.dao.danhmucgt.model.DmGtVersion;

/**
 * The persistence interface for the dm gt version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtVersionPersistenceImpl
 * @see DmGtVersionUtil
 * @generated
 */
public interface DmGtVersionPersistence extends BasePersistence<DmGtVersion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGtVersionUtil} to access the dm gt version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm gt version in the entity cache if it is enabled.
	*
	* @param dmGtVersion the dm gt version
	*/
	public void cacheResult(vn.gt.dao.danhmucgt.model.DmGtVersion dmGtVersion);

	/**
	* Caches the dm gt versions in the entity cache if it is enabled.
	*
	* @param dmGtVersions the dm gt versions
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGtVersion> dmGtVersions);

	/**
	* Creates a new dm gt version with the primary key. Does not add the dm gt version to the database.
	*
	* @param id the primary key for the new dm gt version
	* @return the new dm gt version
	*/
	public vn.gt.dao.danhmucgt.model.DmGtVersion create(int id);

	/**
	* Removes the dm gt version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt version
	* @return the dm gt version that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtVersionException if a dm gt version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtVersion remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtVersionException;

	public vn.gt.dao.danhmucgt.model.DmGtVersion updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtVersion dmGtVersion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt version with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtVersionException} if it could not be found.
	*
	* @param id the primary key of the dm gt version
	* @return the dm gt version
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtVersionException if a dm gt version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtVersion findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtVersionException;

	/**
	* Returns the dm gt version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt version
	* @return the dm gt version, or <code>null</code> if a dm gt version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtVersion fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt versions.
	*
	* @return the dm gt versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtVersion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt versions
	* @param end the upper bound of the range of dm gt versions (not inclusive)
	* @return the range of dm gt versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtVersion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt versions
	* @param end the upper bound of the range of dm gt versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtVersion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt versions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt versions.
	*
	* @return the number of dm gt versions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}