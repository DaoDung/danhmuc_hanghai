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

import vn.gt.dao.danhmuc.model.DmSyncCategory;

/**
 * The persistence interface for the dm sync category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmSyncCategoryPersistenceImpl
 * @see DmSyncCategoryUtil
 * @generated
 */
public interface DmSyncCategoryPersistence extends BasePersistence<DmSyncCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmSyncCategoryUtil} to access the dm sync category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm sync category in the entity cache if it is enabled.
	*
	* @param dmSyncCategory the dm sync category
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory);

	/**
	* Caches the dm sync categories in the entity cache if it is enabled.
	*
	* @param dmSyncCategories the dm sync categories
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> dmSyncCategories);

	/**
	* Creates a new dm sync category with the primary key. Does not add the dm sync category to the database.
	*
	* @param id the primary key for the new dm sync category
	* @return the new dm sync category
	*/
	public vn.gt.dao.danhmuc.model.DmSyncCategory create(long id);

	/**
	* Removes the dm sync category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm sync category
	* @return the dm sync category that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException if a dm sync category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSyncCategory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException;

	public vn.gt.dao.danhmuc.model.DmSyncCategory updateImpl(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm sync category with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException} if it could not be found.
	*
	* @param id the primary key of the dm sync category
	* @return the dm sync category
	* @throws vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException if a dm sync category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSyncCategory findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException;

	/**
	* Returns the dm sync category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm sync category
	* @return the dm sync category, or <code>null</code> if a dm sync category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmSyncCategory fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm sync categories.
	*
	* @return the dm sync categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm sync categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm sync categories
	* @param end the upper bound of the range of dm sync categories (not inclusive)
	* @return the range of dm sync categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm sync categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm sync categories
	* @param end the upper bound of the range of dm sync categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm sync categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm sync categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm sync categories.
	*
	* @return the number of dm sync categories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmSyncCategory remove(DmSyncCategory dmSyncCategory)
		throws SystemException;
}