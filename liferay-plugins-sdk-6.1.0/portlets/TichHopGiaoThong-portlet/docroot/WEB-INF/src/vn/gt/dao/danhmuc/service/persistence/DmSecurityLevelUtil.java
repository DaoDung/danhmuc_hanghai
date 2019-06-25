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

import vn.gt.dao.danhmuc.model.DmSecurityLevel;

import java.util.List;

/**
 * The persistence utility for the dm security level service. This utility wraps {@link DmSecurityLevelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmSecurityLevelPersistence
 * @see DmSecurityLevelPersistenceImpl
 * @generated
 */
public class DmSecurityLevelUtil {
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
	public static void clearCache(DmSecurityLevel dmSecurityLevel) {
		getPersistence().clearCache(dmSecurityLevel);
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
	public static List<DmSecurityLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmSecurityLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmSecurityLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmSecurityLevel update(DmSecurityLevel dmSecurityLevel,
		boolean merge) throws SystemException {
		return getPersistence().update(dmSecurityLevel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmSecurityLevel update(DmSecurityLevel dmSecurityLevel,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmSecurityLevel, merge, serviceContext);
	}

	/**
	* Caches the dm security level in the entity cache if it is enabled.
	*
	* @param dmSecurityLevel the dm security level
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel) {
		getPersistence().cacheResult(dmSecurityLevel);
	}

	/**
	* Caches the dm security levels in the entity cache if it is enabled.
	*
	* @param dmSecurityLevels the dm security levels
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> dmSecurityLevels) {
		getPersistence().cacheResult(dmSecurityLevels);
	}

	/**
	* Creates a new dm security level with the primary key. Does not add the dm security level to the database.
	*
	* @param id the primary key for the new dm security level
	* @return the new dm security level
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm security level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm security level
	* @return the dm security level that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmSecurityLevel updateImpl(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmSecurityLevel, merge);
	}

	/**
	* Returns the dm security level with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException} if it could not be found.
	*
	* @param id the primary key of the dm security level
	* @return the dm security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm security level with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm security level
	* @return the dm security level, or <code>null</code> if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm security levels where securityLevelCode = &#63;.
	*
	* @param securityLevelCode the security level code
	* @return the matching dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySecurityLevelCode(securityLevelCode);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySecurityLevelCode(securityLevelCode, start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySecurityLevelCode(securityLevelCode, start, end,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel findBySecurityLevelCode_First(
		java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException {
		return getPersistence()
				   .findBySecurityLevelCode_First(securityLevelCode,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel findBySecurityLevelCode_Last(
		java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException {
		return getPersistence()
				   .findBySecurityLevelCode_Last(securityLevelCode,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel[] findBySecurityLevelCode_PrevAndNext(
		int id, java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException {
		return getPersistence()
				   .findBySecurityLevelCode_PrevAndNext(id, securityLevelCode,
			orderByComparator);
	}

	/**
	* Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException} if it could not be found.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the matching dm security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException if a matching dm security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel findBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException {
		return getPersistence()
				   .findBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion);
	}

	/**
	* Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the matching dm security level, or <code>null</code> if a matching dm security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion);
	}

	/**
	* Returns the dm security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm security level, or <code>null</code> if a matching dm security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Returns all the dm security levels.
	*
	* @return the dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm security levels where securityLevelCode = &#63; from the database.
	*
	* @param securityLevelCode the security level code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySecurityLevelCode(
		java.lang.String securityLevelCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySecurityLevelCode(securityLevelCode);
	}

	/**
	* Removes the dm security level where securityLevelCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmSecurityLevelException {
		getPersistence()
			.removeBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion);
	}

	/**
	* Removes all the dm security levels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm security levels where securityLevelCode = &#63;.
	*
	* @param securityLevelCode the security level code
	* @return the number of matching dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySecurityLevelCode(
		java.lang.String securityLevelCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySecurityLevelCode(securityLevelCode);
	}

	/**
	* Returns the number of dm security levels where securityLevelCode = &#63; and syncVersion = &#63;.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the number of matching dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion);
	}

	/**
	* Returns the number of dm security levels.
	*
	* @return the number of dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmSecurityLevelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmSecurityLevelPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmSecurityLevelPersistence.class.getName());

			ReferenceRegistry.registerReference(DmSecurityLevelUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmSecurityLevelPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmSecurityLevelUtil.class,
			"_persistence");
	}

	private static DmSecurityLevelPersistence _persistence;
}