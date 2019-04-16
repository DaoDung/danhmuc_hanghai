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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmucgt.model.DmGtRouteConfig;

/**
 * The persistence interface for the dm gt route config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtRouteConfigPersistenceImpl
 * @see DmGtRouteConfigUtil
 * @generated
 */
public interface DmGtRouteConfigPersistence extends BasePersistence<DmGtRouteConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGtRouteConfigUtil} to access the dm gt route config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm gt route config in the entity cache if it is enabled.
	*
	* @param dmGtRouteConfig the dm gt route config
	*/
	public void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGtRouteConfig dmGtRouteConfig);

	/**
	* Caches the dm gt route configs in the entity cache if it is enabled.
	*
	* @param dmGtRouteConfigs the dm gt route configs
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> dmGtRouteConfigs);

	/**
	* Creates a new dm gt route config with the primary key. Does not add the dm gt route config to the database.
	*
	* @param id the primary key for the new dm gt route config
	* @return the new dm gt route config
	*/
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig create(long id);

	/**
	* Removes the dm gt route config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtRouteConfig dmGtRouteConfig, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt route config with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException} if it could not be found.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

	/**
	* Returns the dm gt route config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt route config
	* @return the dm gt route config, or <code>null</code> if a dm gt route config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt route config where routeCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException} if it could not be found.
	*
	* @param routeCode the route code
	* @return the matching dm gt route config
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByRouteCode(
		java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

	/**
	* Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param routeCode the route code
	* @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig fetchByRouteCode(
		java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt route config where routeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param routeCode the route code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm gt route config, or <code>null</code> if a matching dm gt route config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig fetchByRouteCode(
		java.lang.String routeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt route configs where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @return the matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByIsDelete(
		int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByIsDelete(
		int isDelete, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByIsDelete(
		int isDelete, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByIsDelete_First(
		int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

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
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByIsDelete_Last(
		int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

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
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig[] findByIsDelete_PrevAndNext(
		long id, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

	/**
	* Returns all the dm gt route configs where locCode = &#63; and isDelete = &#63;.
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @return the matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByLocCode(
		java.lang.String locCode, int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByLocCode(
		java.lang.String locCode, int isDelete, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findByLocCode(
		java.lang.String locCode, int isDelete, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByLocCode_First(
		java.lang.String locCode, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

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
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig findByLocCode_Last(
		java.lang.String locCode, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

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
	public vn.gt.dao.danhmucgt.model.DmGtRouteConfig[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode, int isDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

	/**
	* Returns all the dm gt route configs.
	*
	* @return the dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtRouteConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm gt route config where routeCode = &#63; from the database.
	*
	* @param routeCode the route code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRouteCode(java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtRouteConfigException;

	/**
	* Removes all the dm gt route configs where isDelete = &#63; from the database.
	*
	* @param isDelete the is delete
	* @throws SystemException if a system exception occurred
	*/
	public void removeByIsDelete(int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt route configs where locCode = &#63; and isDelete = &#63; from the database.
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLocCode(java.lang.String locCode, int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm gt route configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt route configs where routeCode = &#63;.
	*
	* @param routeCode the route code
	* @return the number of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByRouteCode(java.lang.String routeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt route configs where isDelete = &#63;.
	*
	* @param isDelete the is delete
	* @return the number of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByIsDelete(int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt route configs where locCode = &#63; and isDelete = &#63;.
	*
	* @param locCode the loc code
	* @param isDelete the is delete
	* @return the number of matching dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByLocCode(java.lang.String locCode, int isDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt route configs.
	*
	* @return the number of dm gt route configs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmGtRouteConfig remove(DmGtRouteConfig dmGtRouteConfig)
		throws SystemException;
}