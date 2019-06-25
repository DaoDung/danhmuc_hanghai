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

import vn.gt.dao.danhmuc.model.DmHistoryPortRegion;

import java.util.List;

/**
 * The persistence utility for the dm history port region service. This utility wraps {@link DmHistoryPortRegionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPortRegionPersistence
 * @see DmHistoryPortRegionPersistenceImpl
 * @generated
 */
public class DmHistoryPortRegionUtil {
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
	public static void clearCache(DmHistoryPortRegion dmHistoryPortRegion) {
		getPersistence().clearCache(dmHistoryPortRegion);
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
	public static List<DmHistoryPortRegion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryPortRegion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryPortRegion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmHistoryPortRegion update(
		DmHistoryPortRegion dmHistoryPortRegion, boolean merge)
		throws SystemException {
		return getPersistence().update(dmHistoryPortRegion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmHistoryPortRegion update(
		DmHistoryPortRegion dmHistoryPortRegion, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(dmHistoryPortRegion, merge, serviceContext);
	}

	/**
	* Caches the dm history port region in the entity cache if it is enabled.
	*
	* @param dmHistoryPortRegion the dm history port region
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryPortRegion dmHistoryPortRegion) {
		getPersistence().cacheResult(dmHistoryPortRegion);
	}

	/**
	* Caches the dm history port regions in the entity cache if it is enabled.
	*
	* @param dmHistoryPortRegions the dm history port regions
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> dmHistoryPortRegions) {
		getPersistence().cacheResult(dmHistoryPortRegions);
	}

	/**
	* Creates a new dm history port region with the primary key. Does not add the dm history port region to the database.
	*
	* @param id the primary key for the new dm history port region
	* @return the new dm history port region
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history port region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history port region
	* @return the dm history port region that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPortRegion dmHistoryPortRegion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryPortRegion, merge);
	}

	/**
	* Returns the dm history port region with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException} if it could not be found.
	*
	* @param id the primary key of the dm history port region
	* @return the dm history port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history port region with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history port region
	* @return the dm history port region, or <code>null</code> if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history port regions where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode);
	}

	/**
	* Returns a range of all the dm history port regions where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @return the range of matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history port regions where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortRegionCode(portRegionCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history port region in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException {
		return getPersistence()
				   .findByPortRegionCode_First(portRegionCode, orderByComparator);
	}

	/**
	* Returns the last dm history port region in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException {
		return getPersistence()
				   .findByPortRegionCode_Last(portRegionCode, orderByComparator);
	}

	/**
	* Returns the dm history port regions before and after the current dm history port region in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history port region
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException {
		return getPersistence()
				   .findByPortRegionCode_PrevAndNext(id, portRegionCode,
			orderByComparator);
	}

	/**
	* Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException} if it could not be found.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @return the matching dm history port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion findByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException {
		return getPersistence()
				   .findByPortRegionCodeAndSyncVersion(portRegionCode,
			syncVersion);
	}

	/**
	* Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @return the matching dm history port region, or <code>null</code> if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion fetchByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortRegionCodeAndSyncVersion(portRegionCode,
			syncVersion);
	}

	/**
	* Returns the dm history port region where portRegionCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history port region, or <code>null</code> if a matching dm history port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryPortRegion fetchByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortRegionCodeAndSyncVersion(portRegionCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Returns all the dm history port regions.
	*
	* @return the dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @return the range of dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history port regions where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortRegionCode(portRegionCode);
	}

	/**
	* Removes the dm history port region where portRegionCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortRegionException {
		getPersistence()
			.removeByPortRegionCodeAndSyncVersion(portRegionCode, syncVersion);
	}

	/**
	* Removes all the dm history port regions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history port regions where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortRegionCode(portRegionCode);
	}

	/**
	* Returns the number of dm history port regions where portRegionCode = &#63; and syncVersion = &#63;.
	*
	* @param portRegionCode the port region code
	* @param syncVersion the sync version
	* @return the number of matching dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPortRegionCodeAndSyncVersion(portRegionCode,
			syncVersion);
	}

	/**
	* Returns the number of dm history port regions.
	*
	* @return the number of dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryPortRegionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryPortRegionPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmHistoryPortRegionPersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryPortRegionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmHistoryPortRegionPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmHistoryPortRegionUtil.class,
			"_persistence");
	}

	private static DmHistoryPortRegionPersistence _persistence;
}