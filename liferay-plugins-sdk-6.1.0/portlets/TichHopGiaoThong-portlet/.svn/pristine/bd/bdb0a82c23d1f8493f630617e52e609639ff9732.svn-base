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

import vn.gt.dao.danhmuc.model.DmHistoryMaritime;

import java.util.List;

/**
 * The persistence utility for the dm history maritime service. This utility wraps {@link DmHistoryMaritimePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryMaritimePersistence
 * @see DmHistoryMaritimePersistenceImpl
 * @generated
 */
public class DmHistoryMaritimeUtil {
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
	public static void clearCache(DmHistoryMaritime dmHistoryMaritime) {
		getPersistence().clearCache(dmHistoryMaritime);
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
	public static List<DmHistoryMaritime> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryMaritime> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryMaritime> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryMaritime remove(DmHistoryMaritime dmHistoryMaritime)
		throws SystemException {
		return getPersistence().remove(dmHistoryMaritime);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmHistoryMaritime update(
		DmHistoryMaritime dmHistoryMaritime, boolean merge)
		throws SystemException {
		return getPersistence().update(dmHistoryMaritime, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmHistoryMaritime update(
		DmHistoryMaritime dmHistoryMaritime, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmHistoryMaritime, merge, serviceContext);
	}

	/**
	* Caches the dm history maritime in the entity cache if it is enabled.
	*
	* @param dmHistoryMaritime the dm history maritime
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime) {
		getPersistence().cacheResult(dmHistoryMaritime);
	}

	/**
	* Caches the dm history maritimes in the entity cache if it is enabled.
	*
	* @param dmHistoryMaritimes the dm history maritimes
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> dmHistoryMaritimes) {
		getPersistence().cacheResult(dmHistoryMaritimes);
	}

	/**
	* Creates a new dm history maritime with the primary key. Does not add the dm history maritime to the database.
	*
	* @param id the primary key for the new dm history maritime
	* @return the new dm history maritime
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history maritime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryMaritime, merge);
	}

	/**
	* Returns the dm history maritime with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException} if it could not be found.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history maritime with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime, or <code>null</code> if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history maritimes where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaritimeCode(maritimeCode);
	}

	/**
	* Returns a range of all the dm history maritimes where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @return the range of matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findByMaritimeCode(
		java.lang.String maritimeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaritimeCode(maritimeCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history maritimes where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findByMaritimeCode(
		java.lang.String maritimeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMaritimeCode(maritimeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history maritime in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime findByMaritimeCode_First(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException {
		return getPersistence()
				   .findByMaritimeCode_First(maritimeCode, orderByComparator);
	}

	/**
	* Returns the last dm history maritime in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime findByMaritimeCode_Last(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException {
		return getPersistence()
				   .findByMaritimeCode_Last(maritimeCode, orderByComparator);
	}

	/**
	* Returns the dm history maritimes before and after the current dm history maritime in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history maritime
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime[] findByMaritimeCode_PrevAndNext(
		int id, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException {
		return getPersistence()
				   .findByMaritimeCode_PrevAndNext(id, maritimeCode,
			orderByComparator);
	}

	/**
	* Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException} if it could not be found.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @return the matching dm history maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime findByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException {
		return getPersistence()
				   .findByMaritimeCodeAndSyncVersion(maritimeCode, syncVersion);
	}

	/**
	* Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @return the matching dm history maritime, or <code>null</code> if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime fetchByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaritimeCodeAndSyncVersion(maritimeCode, syncVersion);
	}

	/**
	* Returns the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history maritime, or <code>null</code> if a matching dm history maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryMaritime fetchByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaritimeCodeAndSyncVersion(maritimeCode,
			syncVersion, retrieveFromCache);
	}

	/**
	* Returns all the dm history maritimes.
	*
	* @return the dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @return the range of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history maritimes where maritimeCode = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMaritimeCode(maritimeCode);
	}

	/**
	* Removes the dm history maritime where maritimeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryMaritimeException {
		getPersistence()
			.removeByMaritimeCodeAndSyncVersion(maritimeCode, syncVersion);
	}

	/**
	* Removes all the dm history maritimes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history maritimes where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the number of matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaritimeCode(maritimeCode);
	}

	/**
	* Returns the number of dm history maritimes where maritimeCode = &#63; and syncVersion = &#63;.
	*
	* @param maritimeCode the maritime code
	* @param syncVersion the sync version
	* @return the number of matching dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByMaritimeCodeAndSyncVersion(maritimeCode, syncVersion);
	}

	/**
	* Returns the number of dm history maritimes.
	*
	* @return the number of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryMaritimePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryMaritimePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmHistoryMaritimePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryMaritimeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmHistoryMaritimePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmHistoryMaritimeUtil.class,
			"_persistence");
	}

	private static DmHistoryMaritimePersistence _persistence;
}