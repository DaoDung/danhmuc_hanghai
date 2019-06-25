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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.danhmucgt.model.DmGtVersion;

import java.util.List;

/**
 * The persistence utility for the dm gt version service. This utility wraps {@link DmGtVersionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtVersionPersistence
 * @see DmGtVersionPersistenceImpl
 * @generated
 */
public class DmGtVersionUtil {
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
	public static void clearCache(DmGtVersion dmGtVersion) {
		getPersistence().clearCache(dmGtVersion);
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
	public static List<DmGtVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmGtVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmGtVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmGtVersion update(DmGtVersion dmGtVersion, boolean merge)
		throws SystemException {
		return getPersistence().update(dmGtVersion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmGtVersion update(DmGtVersion dmGtVersion, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmGtVersion, merge, serviceContext);
	}

	/**
	* Caches the dm gt version in the entity cache if it is enabled.
	*
	* @param dmGtVersion the dm gt version
	*/
	public static void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGtVersion dmGtVersion) {
		getPersistence().cacheResult(dmGtVersion);
	}

	/**
	* Caches the dm gt versions in the entity cache if it is enabled.
	*
	* @param dmGtVersions the dm gt versions
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGtVersion> dmGtVersions) {
		getPersistence().cacheResult(dmGtVersions);
	}

	/**
	* Creates a new dm gt version with the primary key. Does not add the dm gt version to the database.
	*
	* @param id the primary key for the new dm gt version
	* @return the new dm gt version
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtVersion create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm gt version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt version
	* @return the dm gt version that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtVersionException if a dm gt version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtVersion remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtVersionException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmucgt.model.DmGtVersion updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtVersion dmGtVersion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmGtVersion, merge);
	}

	/**
	* Returns the dm gt version with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtVersionException} if it could not be found.
	*
	* @param id the primary key of the dm gt version
	* @return the dm gt version
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtVersionException if a dm gt version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtVersion findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtVersionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm gt version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt version
	* @return the dm gt version, or <code>null</code> if a dm gt version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtVersion fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm gt versions.
	*
	* @return the dm gt versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtVersion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtVersion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtVersion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm gt versions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm gt versions.
	*
	* @return the number of dm gt versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmGtVersionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmGtVersionPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmucgt.service.ClpSerializer.getServletContextName(),
					DmGtVersionPersistence.class.getName());

			ReferenceRegistry.registerReference(DmGtVersionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmGtVersionPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmGtVersionUtil.class,
			"_persistence");
	}

	private static DmGtVersionPersistence _persistence;
}