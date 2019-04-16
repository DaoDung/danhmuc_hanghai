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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.danhmuc.model.DmSyncCategory;

import java.util.List;

/**
 * The persistence utility for the dm sync category service. This utility wraps {@link DmSyncCategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmSyncCategoryPersistence
 * @see DmSyncCategoryPersistenceImpl
 * @generated
 */
public class DmSyncCategoryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DmSyncCategory dmSyncCategory) {
		getPersistence().clearCache(dmSyncCategory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DmSyncCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmSyncCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmSyncCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DmSyncCategory remove(DmSyncCategory dmSyncCategory)
		throws SystemException {
		return getPersistence().remove(dmSyncCategory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmSyncCategory update(DmSyncCategory dmSyncCategory,
		boolean merge) throws SystemException {
		return getPersistence().update(dmSyncCategory, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmSyncCategory update(DmSyncCategory dmSyncCategory,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmSyncCategory, merge, serviceContext);
	}

	/**
	* Caches the dm sync category in the entity cache if it is enabled.
	*
	* @param dmSyncCategory the dm sync category
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory) {
		getPersistence().cacheResult(dmSyncCategory);
	}

	/**
	* Caches the dm sync categories in the entity cache if it is enabled.
	*
	* @param dmSyncCategories the dm sync categories
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> dmSyncCategories) {
		getPersistence().cacheResult(dmSyncCategories);
	}

	/**
	* Creates a new dm sync category with the primary key. Does not add the dm sync category to the database.
	*
	* @param id the primary key for the new dm sync category
	* @return the new dm sync category
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm sync category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm sync category
	* @return the dm sync category that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException if a dm sync category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmSyncCategory updateImpl(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmSyncCategory, merge);
	}

	/**
	* Returns the dm sync category with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException} if it could not be found.
	*
	* @param id the primary key of the dm sync category
	* @return the dm sync category
	* @throws vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException if a dm sync category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSyncCategoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm sync category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm sync category
	* @return the dm sync category, or <code>null</code> if a dm sync category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm sync categories.
	*
	* @return the dm sync categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm sync categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm sync categories.
	*
	* @return the number of dm sync categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmSyncCategoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmSyncCategoryPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmSyncCategoryPersistence.class.getName());

			ReferenceRegistry.registerReference(DmSyncCategoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmSyncCategoryPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmSyncCategoryUtil.class,
			"_persistence");
	}

	private static DmSyncCategoryPersistence _persistence;
}