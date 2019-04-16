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

import vn.gt.dao.danhmucgt.model.DmGtStatus;

import java.util.List;

/**
 * The persistence utility for the dm gt status service. This utility wraps {@link DmGtStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtStatusPersistence
 * @see DmGtStatusPersistenceImpl
 * @generated
 */
public class DmGtStatusUtil {
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
	public static void clearCache(DmGtStatus dmGtStatus) {
		getPersistence().clearCache(dmGtStatus);
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
	public static List<DmGtStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmGtStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmGtStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DmGtStatus remove(DmGtStatus dmGtStatus)
		throws SystemException {
		return getPersistence().remove(dmGtStatus);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmGtStatus update(DmGtStatus dmGtStatus, boolean merge)
		throws SystemException {
		return getPersistence().update(dmGtStatus, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmGtStatus update(DmGtStatus dmGtStatus, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmGtStatus, merge, serviceContext);
	}

	/**
	* Caches the dm gt status in the entity cache if it is enabled.
	*
	* @param dmGtStatus the dm gt status
	*/
	public static void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus) {
		getPersistence().cacheResult(dmGtStatus);
	}

	/**
	* Caches the dm gt statuses in the entity cache if it is enabled.
	*
	* @param dmGtStatuses the dm gt statuses
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> dmGtStatuses) {
		getPersistence().cacheResult(dmGtStatuses);
	}

	/**
	* Creates a new dm gt status with the primary key. Does not add the dm gt status to the database.
	*
	* @param id the primary key for the new dm gt status
	* @return the new dm gt status
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm gt status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt status
	* @return the dm gt status that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmucgt.model.DmGtStatus updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmGtStatus, merge);
	}

	/**
	* Returns the dm gt status with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtStatusException} if it could not be found.
	*
	* @param id the primary key of the dm gt status
	* @return the dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm gt status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt status
	* @return the dm gt status, or <code>null</code> if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm gt statuses where type = &#63;.
	*
	* @param type the type
	* @return the matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByType(
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type);
	}

	/**
	* Returns a range of all the dm gt statuses where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @return the range of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByType(
		int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type, start, end);
	}

	/**
	* Returns an ordered range of all the dm gt statuses where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByType(
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type, start, end, orderByComparator);
	}

	/**
	* Returns the first dm gt status in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a matching dm gt status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus findByType_First(
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException {
		return getPersistence().findByType_First(type, orderByComparator);
	}

	/**
	* Returns the last dm gt status in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a matching dm gt status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus findByType_Last(
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException {
		return getPersistence().findByType_Last(type, orderByComparator);
	}

	/**
	* Returns the dm gt statuses before and after the current dm gt status in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm gt status
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus[] findByType_PrevAndNext(
		long id, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException {
		return getPersistence()
				   .findByType_PrevAndNext(id, type, orderByComparator);
	}

	/**
	* Returns all the dm gt statuses where statusCode = &#63; and type = &#63;.
	*
	* @param statusCode the status code
	* @param type the type
	* @return the matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByStatusCode(
		int statusCode, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatusCode(statusCode, type);
	}

	/**
	* Returns a range of all the dm gt statuses where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusCode the status code
	* @param type the type
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @return the range of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByStatusCode(
		int statusCode, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatusCode(statusCode, type, start, end);
	}

	/**
	* Returns an ordered range of all the dm gt statuses where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusCode the status code
	* @param type the type
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByStatusCode(
		int statusCode, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStatusCode(statusCode, type, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusCode the status code
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a matching dm gt status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus findByStatusCode_First(
		int statusCode, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException {
		return getPersistence()
				   .findByStatusCode_First(statusCode, type, orderByComparator);
	}

	/**
	* Returns the last dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusCode the status code
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a matching dm gt status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus findByStatusCode_Last(
		int statusCode, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException {
		return getPersistence()
				   .findByStatusCode_Last(statusCode, type, orderByComparator);
	}

	/**
	* Returns the dm gt statuses before and after the current dm gt status in the ordered set where statusCode = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm gt status
	* @param statusCode the status code
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt status
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtStatusException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtStatus[] findByStatusCode_PrevAndNext(
		long id, int statusCode, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtStatusException {
		return getPersistence()
				   .findByStatusCode_PrevAndNext(id, statusCode, type,
			orderByComparator);
	}

	/**
	* Returns all the dm gt statuses.
	*
	* @return the dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm gt statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @return the range of dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm gt statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm gt statuses where type = &#63; from the database.
	*
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByType(int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByType(type);
	}

	/**
	* Removes all the dm gt statuses where statusCode = &#63; and type = &#63; from the database.
	*
	* @param statusCode the status code
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStatusCode(int statusCode, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStatusCode(statusCode, type);
	}

	/**
	* Removes all the dm gt statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm gt statuses where type = &#63;.
	*
	* @param type the type
	* @return the number of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByType(int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByType(type);
	}

	/**
	* Returns the number of dm gt statuses where statusCode = &#63; and type = &#63;.
	*
	* @param statusCode the status code
	* @param type the type
	* @return the number of matching dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStatusCode(int statusCode, int type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStatusCode(statusCode, type);
	}

	/**
	* Returns the number of dm gt statuses.
	*
	* @return the number of dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmGtStatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmGtStatusPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmucgt.service.ClpSerializer.getServletContextName(),
					DmGtStatusPersistence.class.getName());

			ReferenceRegistry.registerReference(DmGtStatusUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmGtStatusPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmGtStatusUtil.class, "_persistence");
	}

	private static DmGtStatusPersistence _persistence;
}