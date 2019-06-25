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

import vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral;

import java.util.List;

/**
 * The persistence utility for the dm history unit general service. This utility wraps {@link DmHistoryUnitGeneralPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryUnitGeneralPersistence
 * @see DmHistoryUnitGeneralPersistenceImpl
 * @generated
 */
public class DmHistoryUnitGeneralUtil {
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
	public static void clearCache(DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		getPersistence().clearCache(dmHistoryUnitGeneral);
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
	public static List<DmHistoryUnitGeneral> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryUnitGeneral> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryUnitGeneral> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmHistoryUnitGeneral update(
		DmHistoryUnitGeneral dmHistoryUnitGeneral, boolean merge)
		throws SystemException {
		return getPersistence().update(dmHistoryUnitGeneral, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmHistoryUnitGeneral update(
		DmHistoryUnitGeneral dmHistoryUnitGeneral, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(dmHistoryUnitGeneral, merge, serviceContext);
	}

	/**
	* Caches the dm history unit general in the entity cache if it is enabled.
	*
	* @param dmHistoryUnitGeneral the dm history unit general
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		getPersistence().cacheResult(dmHistoryUnitGeneral);
	}

	/**
	* Caches the dm history unit generals in the entity cache if it is enabled.
	*
	* @param dmHistoryUnitGenerals the dm history unit generals
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> dmHistoryUnitGenerals) {
		getPersistence().cacheResult(dmHistoryUnitGenerals);
	}

	/**
	* Creates a new dm history unit general with the primary key. Does not add the dm history unit general to the database.
	*
	* @param id the primary key for the new dm history unit general
	* @return the new dm history unit general
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history unit general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history unit general
	* @return the dm history unit general that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral dmHistoryUnitGeneral,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryUnitGeneral, merge);
	}

	/**
	* Returns the dm history unit general with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException} if it could not be found.
	*
	* @param id the primary key of the dm history unit general
	* @return the dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history unit general with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history unit general
	* @return the dm history unit general, or <code>null</code> if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history unit generals where unitCode = &#63;.
	*
	* @param unitCode the unit code
	* @return the matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findByUnitCode(
		java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUnitCode(unitCode);
	}

	/**
	* Returns a range of all the dm history unit generals where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @return the range of matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findByUnitCode(
		java.lang.String unitCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUnitCode(unitCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history unit generals where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findByUnitCode(
		java.lang.String unitCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUnitCode(unitCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm history unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral findByUnitCode_First(
		java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException {
		return getPersistence().findByUnitCode_First(unitCode, orderByComparator);
	}

	/**
	* Returns the last dm history unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral findByUnitCode_Last(
		java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException {
		return getPersistence().findByUnitCode_Last(unitCode, orderByComparator);
	}

	/**
	* Returns the dm history unit generals before and after the current dm history unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history unit general
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral[] findByUnitCode_PrevAndNext(
		int id, java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException {
		return getPersistence()
				   .findByUnitCode_PrevAndNext(id, unitCode, orderByComparator);
	}

	/**
	* Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException} if it could not be found.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the matching dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral findByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException {
		return getPersistence()
				   .findByUnitCodeAndSyncVersion(unitCode, syncVersion);
	}

	/**
	* Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the matching dm history unit general, or <code>null</code> if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral fetchByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUnitCodeAndSyncVersion(unitCode, syncVersion);
	}

	/**
	* Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history unit general, or <code>null</code> if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral fetchByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUnitCodeAndSyncVersion(unitCode, syncVersion,
			retrieveFromCache);
	}

	/**
	* Returns all the dm history unit generals.
	*
	* @return the dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @return the range of dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history unit generals where unitCode = &#63; from the database.
	*
	* @param unitCode the unit code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUnitCode(java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUnitCode(unitCode);
	}

	/**
	* Removes the dm history unit general where unitCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException {
		getPersistence().removeByUnitCodeAndSyncVersion(unitCode, syncVersion);
	}

	/**
	* Removes all the dm history unit generals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history unit generals where unitCode = &#63;.
	*
	* @param unitCode the unit code
	* @return the number of matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUnitCode(java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUnitCode(unitCode);
	}

	/**
	* Returns the number of dm history unit generals where unitCode = &#63; and syncVersion = &#63;.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the number of matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUnitCodeAndSyncVersion(java.lang.String unitCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByUnitCodeAndSyncVersion(unitCode, syncVersion);
	}

	/**
	* Returns the number of dm history unit generals.
	*
	* @return the number of dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryUnitGeneralPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryUnitGeneralPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmHistoryUnitGeneralPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryUnitGeneralUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmHistoryUnitGeneralPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmHistoryUnitGeneralUtil.class,
			"_persistence");
	}

	private static DmHistoryUnitGeneralPersistence _persistence;
}