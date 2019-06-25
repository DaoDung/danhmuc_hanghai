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

import vn.gt.dao.danhmuc.model.DmPackage;

import java.util.List;

/**
 * The persistence utility for the dm package service. This utility wraps {@link DmPackagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmPackagePersistence
 * @see DmPackagePersistenceImpl
 * @generated
 */
public class DmPackageUtil {
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
	public static void clearCache(DmPackage dmPackage) {
		getPersistence().clearCache(dmPackage);
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
	public static List<DmPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmPackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmPackage update(DmPackage dmPackage, boolean merge)
		throws SystemException {
		return getPersistence().update(dmPackage, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmPackage update(DmPackage dmPackage, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmPackage, merge, serviceContext);
	}

	/**
	* Caches the dm package in the entity cache if it is enabled.
	*
	* @param dmPackage the dm package
	*/
	public static void cacheResult(vn.gt.dao.danhmuc.model.DmPackage dmPackage) {
		getPersistence().cacheResult(dmPackage);
	}

	/**
	* Caches the dm packages in the entity cache if it is enabled.
	*
	* @param dmPackages the dm packages
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmPackage> dmPackages) {
		getPersistence().cacheResult(dmPackages);
	}

	/**
	* Creates a new dm package with the primary key. Does not add the dm package to the database.
	*
	* @param id the primary key for the new dm package
	* @return the new dm package
	*/
	public static vn.gt.dao.danhmuc.model.DmPackage create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm package
	* @return the dm package that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmPackageException if a dm package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPackage remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPackageException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmPackage updateImpl(
		vn.gt.dao.danhmuc.model.DmPackage dmPackage, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmPackage, merge);
	}

	/**
	* Returns the dm package with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPackageException} if it could not be found.
	*
	* @param id the primary key of the dm package
	* @return the dm package
	* @throws vn.gt.dao.danhmuc.NoSuchDmPackageException if a dm package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPackage findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPackageException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm package with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm package
	* @return the dm package, or <code>null</code> if a dm package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPackage fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm packages where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @return the matching dm packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPackage> findByPackageCode(
		java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPackageCode(packageCode);
	}

	/**
	* Returns a range of all the dm packages where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param packageCode the package code
	* @param start the lower bound of the range of dm packages
	* @param end the upper bound of the range of dm packages (not inclusive)
	* @return the range of matching dm packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPackage> findByPackageCode(
		java.lang.String packageCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPackageCode(packageCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm packages where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param packageCode the package code
	* @param start the lower bound of the range of dm packages
	* @param end the upper bound of the range of dm packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPackage> findByPackageCode(
		java.lang.String packageCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPackageCode(packageCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm package in the ordered set where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm package
	* @throws vn.gt.dao.danhmuc.NoSuchDmPackageException if a matching dm package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPackage findByPackageCode_First(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPackageException {
		return getPersistence()
				   .findByPackageCode_First(packageCode, orderByComparator);
	}

	/**
	* Returns the last dm package in the ordered set where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm package
	* @throws vn.gt.dao.danhmuc.NoSuchDmPackageException if a matching dm package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPackage findByPackageCode_Last(
		java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPackageException {
		return getPersistence()
				   .findByPackageCode_Last(packageCode, orderByComparator);
	}

	/**
	* Returns the dm packages before and after the current dm package in the ordered set where packageCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm package
	* @param packageCode the package code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm package
	* @throws vn.gt.dao.danhmuc.NoSuchDmPackageException if a dm package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPackage[] findByPackageCode_PrevAndNext(
		int id, java.lang.String packageCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPackageException {
		return getPersistence()
				   .findByPackageCode_PrevAndNext(id, packageCode,
			orderByComparator);
	}

	/**
	* Returns all the dm packages.
	*
	* @return the dm packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPackage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm packages
	* @param end the upper bound of the range of dm packages (not inclusive)
	* @return the range of dm packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPackage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm packages
	* @param end the upper bound of the range of dm packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPackage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm packages where packageCode = &#63; from the database.
	*
	* @param packageCode the package code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPackageCode(java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPackageCode(packageCode);
	}

	/**
	* Removes all the dm packages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm packages where packageCode = &#63;.
	*
	* @param packageCode the package code
	* @return the number of matching dm packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPackageCode(java.lang.String packageCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPackageCode(packageCode);
	}

	/**
	* Returns the number of dm packages.
	*
	* @return the number of dm packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmPackagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmPackagePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmPackagePersistence.class.getName());

			ReferenceRegistry.registerReference(DmPackageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmPackagePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmPackageUtil.class, "_persistence");
	}

	private static DmPackagePersistence _persistence;
}