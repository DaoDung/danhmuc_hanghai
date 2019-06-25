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

import vn.gt.dao.danhmuc.model.DmHistorySecurityLevel;

import java.util.List;

/**
 * The persistence utility for the dm history security level service. This utility wraps {@link DmHistorySecurityLevelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistorySecurityLevelPersistence
 * @see DmHistorySecurityLevelPersistenceImpl
 * @generated
 */
public class DmHistorySecurityLevelUtil {
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
	public static void clearCache(DmHistorySecurityLevel dmHistorySecurityLevel) {
		getPersistence().clearCache(dmHistorySecurityLevel);
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
	public static List<DmHistorySecurityLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistorySecurityLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistorySecurityLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmHistorySecurityLevel update(
		DmHistorySecurityLevel dmHistorySecurityLevel, boolean merge)
		throws SystemException {
		return getPersistence().update(dmHistorySecurityLevel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmHistorySecurityLevel update(
		DmHistorySecurityLevel dmHistorySecurityLevel, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(dmHistorySecurityLevel, merge, serviceContext);
	}

	/**
	* Caches the dm history security level in the entity cache if it is enabled.
	*
	* @param dmHistorySecurityLevel the dm history security level
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistorySecurityLevel dmHistorySecurityLevel) {
		getPersistence().cacheResult(dmHistorySecurityLevel);
	}

	/**
	* Caches the dm history security levels in the entity cache if it is enabled.
	*
	* @param dmHistorySecurityLevels the dm history security levels
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistorySecurityLevel> dmHistorySecurityLevels) {
		getPersistence().cacheResult(dmHistorySecurityLevels);
	}

	/**
	* Creates a new dm history security level with the primary key. Does not add the dm history security level to the database.
	*
	* @param id the primary key for the new dm history security level
	* @return the new dm history security level
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history security level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history security level
	* @return the dm history security level that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException if a dm history security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel updateImpl(
		vn.gt.dao.danhmuc.model.DmHistorySecurityLevel dmHistorySecurityLevel,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistorySecurityLevel, merge);
	}

	/**
	* Returns the dm history security level with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException} if it could not be found.
	*
	* @param id the primary key of the dm history security level
	* @return the dm history security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException if a dm history security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history security level with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history security level
	* @return the dm history security level, or <code>null</code> if a dm history security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history security levels where securityLevelCode = &#63;.
	*
	* @param securityLevelCode the security level code
	* @return the matching dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistorySecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySecurityLevelCode(securityLevelCode);
	}

	/**
	* Returns a range of all the dm history security levels where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityLevelCode the security level code
	* @param start the lower bound of the range of dm history security levels
	* @param end the upper bound of the range of dm history security levels (not inclusive)
	* @return the range of matching dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistorySecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySecurityLevelCode(securityLevelCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history security levels where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityLevelCode the security level code
	* @param start the lower bound of the range of dm history security levels
	* @param end the upper bound of the range of dm history security levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistorySecurityLevel> findBySecurityLevelCode(
		java.lang.String securityLevelCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySecurityLevelCode(securityLevelCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history security level in the ordered set where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityLevelCode the security level code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException if a matching dm history security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel findBySecurityLevelCode_First(
		java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException {
		return getPersistence()
				   .findBySecurityLevelCode_First(securityLevelCode,
			orderByComparator);
	}

	/**
	* Returns the last dm history security level in the ordered set where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param securityLevelCode the security level code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException if a matching dm history security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel findBySecurityLevelCode_Last(
		java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException {
		return getPersistence()
				   .findBySecurityLevelCode_Last(securityLevelCode,
			orderByComparator);
	}

	/**
	* Returns the dm history security levels before and after the current dm history security level in the ordered set where securityLevelCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history security level
	* @param securityLevelCode the security level code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException if a dm history security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel[] findBySecurityLevelCode_PrevAndNext(
		int id, java.lang.String securityLevelCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException {
		return getPersistence()
				   .findBySecurityLevelCode_PrevAndNext(id, securityLevelCode,
			orderByComparator);
	}

	/**
	* Returns the dm history security level where securityLevelCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException} if it could not be found.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the matching dm history security level
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException if a matching dm history security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel findBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException {
		return getPersistence()
				   .findBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion);
	}

	/**
	* Returns the dm history security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the matching dm history security level, or <code>null</code> if a matching dm history security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion);
	}

	/**
	* Returns the dm history security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history security level, or <code>null</code> if a matching dm history security level could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistorySecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Returns all the dm history security levels.
	*
	* @return the dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistorySecurityLevel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history security levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history security levels
	* @param end the upper bound of the range of dm history security levels (not inclusive)
	* @return the range of dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistorySecurityLevel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history security levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history security levels
	* @param end the upper bound of the range of dm history security levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistorySecurityLevel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history security levels where securityLevelCode = &#63; from the database.
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
	* Removes the dm history security level where securityLevelCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistorySecurityLevelException {
		getPersistence()
			.removeBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion);
	}

	/**
	* Removes all the dm history security levels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history security levels where securityLevelCode = &#63;.
	*
	* @param securityLevelCode the security level code
	* @return the number of matching dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySecurityLevelCode(
		java.lang.String securityLevelCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySecurityLevelCode(securityLevelCode);
	}

	/**
	* Returns the number of dm history security levels where securityLevelCode = &#63; and syncVersion = &#63;.
	*
	* @param securityLevelCode the security level code
	* @param syncVersion the sync version
	* @return the number of matching dm history security levels
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
	* Returns the number of dm history security levels.
	*
	* @return the number of dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistorySecurityLevelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistorySecurityLevelPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmHistorySecurityLevelPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistorySecurityLevelUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmHistorySecurityLevelPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmHistorySecurityLevelUtil.class,
			"_persistence");
	}

	private static DmHistorySecurityLevelPersistence _persistence;
}