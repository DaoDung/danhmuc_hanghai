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

import vn.gt.dao.danhmuc.model.DmHistoryPassportType;

import java.util.List;

/**
 * The persistence utility for the dm history passport type service. This utility wraps {@link DmHistoryPassportTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPassportTypePersistence
 * @see DmHistoryPassportTypePersistenceImpl
 * @generated
 */
public class DmHistoryPassportTypeUtil {
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
	public static void clearCache(DmHistoryPassportType dmHistoryPassportType) {
		getPersistence().clearCache(dmHistoryPassportType);
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
	public static List<DmHistoryPassportType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryPassportType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryPassportType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmHistoryPassportType update(
		DmHistoryPassportType dmHistoryPassportType, boolean merge)
		throws SystemException {
		return getPersistence().update(dmHistoryPassportType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmHistoryPassportType update(
		DmHistoryPassportType dmHistoryPassportType, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(dmHistoryPassportType, merge, serviceContext);
	}

	/**
	* Caches the dm history passport type in the entity cache if it is enabled.
	*
	* @param dmHistoryPassportType the dm history passport type
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryPassportType dmHistoryPassportType) {
		getPersistence().cacheResult(dmHistoryPassportType);
	}

	/**
	* Caches the dm history passport types in the entity cache if it is enabled.
	*
	* @param dmHistoryPassportTypes the dm history passport types
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> dmHistoryPassportTypes) {
		getPersistence().cacheResult(dmHistoryPassportTypes);
	}

	/**
	* Creates a new dm history passport type with the primary key. Does not add the dm history passport type to the database.
	*
	* @param id the primary key for the new dm history passport type
	* @return the new dm history passport type
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history passport type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history passport type
	* @return the dm history passport type that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a dm history passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPassportType dmHistoryPassportType,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryPassportType, merge);
	}

	/**
	* Returns the dm history passport type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history passport type
	* @return the dm history passport type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a dm history passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history passport type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history passport type
	* @return the dm history passport type, or <code>null</code> if a dm history passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history passport types where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @return the matching dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPassportTypeCode(passportTypeCode);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPassportTypeCode(passportTypeCode, start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findByPassportTypeCode(
		java.lang.String passportTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPassportTypeCode(passportTypeCode, start, end,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType findByPassportTypeCode_First(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException {
		return getPersistence()
				   .findByPassportTypeCode_First(passportTypeCode,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType findByPassportTypeCode_Last(
		java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException {
		return getPersistence()
				   .findByPassportTypeCode_Last(passportTypeCode,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType[] findByPassportTypeCode_PrevAndNext(
		int id, java.lang.String passportTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException {
		return getPersistence()
				   .findByPassportTypeCode_PrevAndNext(id, passportTypeCode,
			orderByComparator);
	}

	/**
	* Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException} if it could not be found.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @return the matching dm history passport type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException if a matching dm history passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType findByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException {
		return getPersistence()
				   .findByPassportTypeCodeAndSyncVersion(passportTypeCode,
			syncVersion);
	}

	/**
	* Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @return the matching dm history passport type, or <code>null</code> if a matching dm history passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType fetchByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPassportTypeCodeAndSyncVersion(passportTypeCode,
			syncVersion);
	}

	/**
	* Returns the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history passport type, or <code>null</code> if a matching dm history passport type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPassportType fetchByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPassportTypeCodeAndSyncVersion(passportTypeCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Returns all the dm history passport types.
	*
	* @return the dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPassportType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history passport types where passportTypeCode = &#63; from the database.
	*
	* @param passportTypeCode the passport type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPassportTypeCode(
		java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPassportTypeCode(passportTypeCode);
	}

	/**
	* Removes the dm history passport type where passportTypeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPassportTypeException {
		getPersistence()
			.removeByPassportTypeCodeAndSyncVersion(passportTypeCode,
			syncVersion);
	}

	/**
	* Removes all the dm history passport types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history passport types where passportTypeCode = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @return the number of matching dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPassportTypeCode(java.lang.String passportTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPassportTypeCode(passportTypeCode);
	}

	/**
	* Returns the number of dm history passport types where passportTypeCode = &#63; and syncVersion = &#63;.
	*
	* @param passportTypeCode the passport type code
	* @param syncVersion the sync version
	* @return the number of matching dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPassportTypeCodeAndSyncVersion(
		java.lang.String passportTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPassportTypeCodeAndSyncVersion(passportTypeCode,
			syncVersion);
	}

	/**
	* Returns the number of dm history passport types.
	*
	* @return the number of dm history passport types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryPassportTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryPassportTypePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmHistoryPassportTypePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryPassportTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmHistoryPassportTypePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmHistoryPassportTypeUtil.class,
			"_persistence");
	}

	private static DmHistoryPassportTypePersistence _persistence;
}