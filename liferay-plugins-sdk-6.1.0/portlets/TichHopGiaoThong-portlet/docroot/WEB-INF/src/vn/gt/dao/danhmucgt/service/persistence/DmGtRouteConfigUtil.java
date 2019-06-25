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

import vn.gt.dao.danhmucgt.model.DmGtRouteConfig;

import java.util.List;

/**
 * The persistence utility for the dm gt route config service. This utility wraps {@link DmGtRouteConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtRouteConfigPersistence
 * @see DmGtRouteConfigPersistenceImpl
 * @generated
 */
public class DmGtRouteConfigUtil {
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
	public static void clearCache(DmGtRouteConfig dmGtRouteConfig) {
		getPersistence().clearCache(dmGtRouteConfig);
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
	public static List<DmGtRouteConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmGtRouteConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmGtRouteConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmGtRouteConfig update(DmGtRouteConfig dmGtRouteConfig,
		boolean merge) throws SystemException {
		return getPersistence().update(dmGtRouteConfig, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmGtRouteConfig update(DmGtRouteConfig dmGtRouteConfig,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmGtRouteConfig, merge, serviceContext);
	}

	/**
	* Caches the dm gt route config in the entity cache if it is enabled.
	*
	* @param dmGtRouteConfig the dm gt route config
	*/
	public static void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGtRouteConfig dmGtRouteConfig) {
		getPersistence().cacheResult(dmGtRouteConfig);
	}

	/**
	* Caches the dm gt route configs in the entity cache if it is enabled.
	*
	* @param dmGtRouteConfigs the dm gt route configs
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> dmGtRouteConfigs) {
		getPersistence().cacheResult(dmGtRouteConfigs);
	}

	/**
	* Creates a new dm gt route config with the primary key. Does not add the dm gt route config to the database.
	*
	* @param id the primary key for the new dm gt route config
	* @return the new dm gt route config
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm gt route config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtRouteConfig dmGtRouteConfig, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmGtRouteConfig, merge);
	}

	/**
	* Returns the dm gt route config with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException} if it could not be found.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm gt route config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config, or <code>null</code> if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the dm gt route config where routeCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException} if it could not be found.
	*
	* @param routeCode the route code
	* @return the matching dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByRouteCode(
		java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence().findByRouteCode(routeCode);
	}

	/**
	* Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param routeCode the route code
	* @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig fetchByRouteCode(
		java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRouteCode(routeCode);
	}

	/**
	* Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param routeCode the route code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig fetchByRouteCode(
		java.lang.String routeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRouteCode(routeCode, retrieveFromCache);
	}

	/**
	* Returns all the dm gt route configs where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @return the matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByIsDelete(
		int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIsDelete(isDelete);
	}

	/**
	* Returns a range of all the dm gt route configs where isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isDelete the is delete
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @return the range of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByIsDelete(
		int isDelete, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIsDelete(isDelete, start, end);
	}

	/**
	* Returns an ordered range of all the dm gt route configs where isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isDelete the is delete
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByIsDelete(
		int isDelete, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByIsDelete(isDelete, start, end, orderByComparator);
	}

	/**
	* Returns the first dm gt route config in the ordered set where isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByIsDelete_First(
		int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence().findByIsDelete_First(isDelete, orderByComparator);
	}

	/**
	* Returns the last dm gt route config in the ordered set where isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByIsDelete_Last(
		int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence().findByIsDelete_Last(isDelete, orderByComparator);
	}

	/**
	* Returns the dm gt route configs before and after the current dm gt route config in the ordered set where isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm gt route config
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig[] findByIsDelete_PrevAndNext(
		long id, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence()
				   .findByIsDelete_PrevAndNext(id, isDelete, orderByComparator);
	}

	/**
	* Returns all the dm gt route configs where locCode = &#63; and isDelete = &#63;.
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @return the matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByLocCode(
		java.lang.String locCode, int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocCode(locCode, isDelete);
	}

	/**
	* Returns a range of all the dm gt route configs where locCode = &#63; and isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @return the range of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByLocCode(
		java.lang.String locCode, int isDelete, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocCode(locCode, isDelete, start, end);
	}

	/**
	* Returns an ordered range of all the dm gt route configs where locCode = &#63; and isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByLocCode(
		java.lang.String locCode, int isDelete, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLocCode(locCode, isDelete, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm gt route config in the ordered set where locCode = &#63; and isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByLocCode_First(
		java.lang.String locCode, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence()
				   .findByLocCode_First(locCode, isDelete, orderByComparator);
	}

	/**
	* Returns the last dm gt route config in the ordered set where locCode = &#63; and isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByLocCode_Last(
		java.lang.String locCode, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence()
				   .findByLocCode_Last(locCode, isDelete, orderByComparator);
	}

	/**
	* Returns the dm gt route configs before and after the current dm gt route config in the ordered set where locCode = &#63; and isDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm gt route config
	* @param locCode the loc code
	* @param isDelete the is delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtRouteConfig[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		return getPersistence()
				   .findByLocCode_PrevAndNext(id, locCode, isDelete,
			orderByComparator);
	}

	/**
	* Returns all the dm gt route configs.
	*
	* @return the dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm gt route configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @return the range of dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm gt route configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt route configs
	* @param end the upper bound of the range of dm gt route configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the dm gt route config where routeCode = &#63; from the database.
	*
	* @param routeCode the route code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRouteCode(java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException {
		getPersistence().removeByRouteCode(routeCode);
	}

	/**
	* Removes all the dm gt route configs where isDelete = &#63; from the database.
	*
	* @param isDelete the is delete
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByIsDelete(int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByIsDelete(isDelete);
	}

	/**
	* Removes all the dm gt route configs where locCode = &#63; and isDelete = &#63; from the database.
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLocCode(java.lang.String locCode, int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLocCode(locCode, isDelete);
	}

	/**
	* Removes all the dm gt route configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm gt route configs where routeCode = &#63;.
	*
	* @param routeCode the route code
	* @return the number of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRouteCode(java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRouteCode(routeCode);
	}

	/**
	* Returns the number of dm gt route configs where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @return the number of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIsDelete(int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIsDelete(isDelete);
	}

	/**
	* Returns the number of dm gt route configs where locCode = &#63; and isDelete = &#63;.
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @return the number of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLocCode(java.lang.String locCode, int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLocCode(locCode, isDelete);
	}

	/**
	* Returns the number of dm gt route configs.
	*
	* @return the number of dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmGtRouteConfigPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmGtRouteConfigPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmucgt.service.ClpSerializer.getServletContextName(),
					DmGtRouteConfigPersistence.class.getName());

			ReferenceRegistry.registerReference(DmGtRouteConfigUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmGtRouteConfigPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmGtRouteConfigUtil.class,
			"_persistence");
	}

	private static DmGtRouteConfigPersistence _persistence;
}