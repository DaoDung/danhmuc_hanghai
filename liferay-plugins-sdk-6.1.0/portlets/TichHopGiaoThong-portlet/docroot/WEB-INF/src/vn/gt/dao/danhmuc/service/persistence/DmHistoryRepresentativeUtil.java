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

import vn.gt.dao.danhmuc.model.DmHistoryRepresentative;

import java.util.List;

/**
 * The persistence utility for the dm history representative service. This utility wraps {@link DmHistoryRepresentativePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryRepresentativePersistence
 * @see DmHistoryRepresentativePersistenceImpl
 * @generated
 */
public class DmHistoryRepresentativeUtil {
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
	public static void clearCache(
		DmHistoryRepresentative dmHistoryRepresentative) {
		getPersistence().clearCache(dmHistoryRepresentative);
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
	public static List<DmHistoryRepresentative> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryRepresentative> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryRepresentative> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmHistoryRepresentative update(
		DmHistoryRepresentative dmHistoryRepresentative, boolean merge)
		throws SystemException {
		return getPersistence().update(dmHistoryRepresentative, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmHistoryRepresentative update(
		DmHistoryRepresentative dmHistoryRepresentative, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(dmHistoryRepresentative, merge, serviceContext);
	}

	/**
	* Caches the dm history representative in the entity cache if it is enabled.
	*
	* @param dmHistoryRepresentative the dm history representative
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative) {
		getPersistence().cacheResult(dmHistoryRepresentative);
	}

	/**
	* Caches the dm history representatives in the entity cache if it is enabled.
	*
	* @param dmHistoryRepresentatives the dm history representatives
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> dmHistoryRepresentatives) {
		getPersistence().cacheResult(dmHistoryRepresentatives);
	}

	/**
	* Creates a new dm history representative with the primary key. Does not add the dm history representative to the database.
	*
	* @param id the primary key for the new dm history representative
	* @return the new dm history representative
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history representative with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history representative
	* @return the dm history representative that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryRepresentative, merge);
	}

	/**
	* Returns the dm history representative with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	*
	* @param id the primary key of the dm history representative
	* @return the dm history representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a dm history representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history representative with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history representative
	* @return the dm history representative, or <code>null</code> if a dm history representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the dm history representative where repCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	*
	* @param repCode the rep code
	* @return the matching dm history representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative findByRepCode(
		java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException {
		return getPersistence().findByRepCode(repCode);
	}

	/**
	* Returns the dm history representative where repCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param repCode the rep code
	* @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByRepCode(
		java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRepCode(repCode);
	}

	/**
	* Returns the dm history representative where repCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param repCode the rep code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByRepCode(
		java.lang.String repCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRepCode(repCode, retrieveFromCache);
	}

	/**
	* Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException} if it could not be found.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @return the matching dm history representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative findByRepCodeAndSyncVersion(
		java.lang.String repCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException {
		return getPersistence().findByRepCodeAndSyncVersion(repCode, syncVersion);
	}

	/**
	* Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByRepCodeAndSyncVersion(
		java.lang.String repCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRepCodeAndSyncVersion(repCode, syncVersion);
	}

	/**
	* Returns the dm history representative where repCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history representative, or <code>null</code> if a matching dm history representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchByRepCodeAndSyncVersion(
		java.lang.String repCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRepCodeAndSyncVersion(repCode, syncVersion,
			retrieveFromCache);
	}

	/**
	* Returns all the dm history representatives.
	*
	* @return the dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history representatives
	* @param end the upper bound of the range of dm history representatives (not inclusive)
	* @return the range of dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history representatives
	* @param end the upper bound of the range of dm history representatives (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the dm history representative where repCode = &#63; from the database.
	*
	* @param repCode the rep code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRepCode(java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException {
		getPersistence().removeByRepCode(repCode);
	}

	/**
	* Removes the dm history representative where repCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRepCodeAndSyncVersion(java.lang.String repCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryRepresentativeException {
		getPersistence().removeByRepCodeAndSyncVersion(repCode, syncVersion);
	}

	/**
	* Removes all the dm history representatives from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history representatives where repCode = &#63;.
	*
	* @param repCode the rep code
	* @return the number of matching dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRepCode(java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRepCode(repCode);
	}

	/**
	* Returns the number of dm history representatives where repCode = &#63; and syncVersion = &#63;.
	*
	* @param repCode the rep code
	* @param syncVersion the sync version
	* @return the number of matching dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRepCodeAndSyncVersion(java.lang.String repCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRepCodeAndSyncVersion(repCode, syncVersion);
	}

	/**
	* Returns the number of dm history representatives.
	*
	* @return the number of dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryRepresentativePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryRepresentativePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmHistoryRepresentativePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryRepresentativeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmHistoryRepresentativePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmHistoryRepresentativeUtil.class,
			"_persistence");
	}

	private static DmHistoryRepresentativePersistence _persistence;
}