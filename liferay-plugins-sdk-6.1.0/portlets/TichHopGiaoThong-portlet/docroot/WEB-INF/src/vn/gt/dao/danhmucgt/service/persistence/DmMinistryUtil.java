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

import vn.gt.dao.danhmucgt.model.DmMinistry;

import java.util.List;

/**
 * The persistence utility for the dm ministry service. This utility wraps {@link DmMinistryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmMinistryPersistence
 * @see DmMinistryPersistenceImpl
 * @generated
 */
public class DmMinistryUtil {
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
	public static void clearCache(DmMinistry dmMinistry) {
		getPersistence().clearCache(dmMinistry);
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
	public static List<DmMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmMinistry update(DmMinistry dmMinistry, boolean merge)
		throws SystemException {
		return getPersistence().update(dmMinistry, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmMinistry update(DmMinistry dmMinistry, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmMinistry, merge, serviceContext);
	}

	/**
	* Caches the dm ministry in the entity cache if it is enabled.
	*
	* @param dmMinistry the dm ministry
	*/
	public static void cacheResult(
		vn.gt.dao.danhmucgt.model.DmMinistry dmMinistry) {
		getPersistence().cacheResult(dmMinistry);
	}

	/**
	* Caches the dm ministries in the entity cache if it is enabled.
	*
	* @param dmMinistries the dm ministries
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmMinistry> dmMinistries) {
		getPersistence().cacheResult(dmMinistries);
	}

	/**
	* Creates a new dm ministry with the primary key. Does not add the dm ministry to the database.
	*
	* @param id the primary key for the new dm ministry
	* @return the new dm ministry
	*/
	public static vn.gt.dao.danhmucgt.model.DmMinistry create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm ministry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm ministry
	* @return the dm ministry that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmMinistry remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmMinistryException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmucgt.model.DmMinistry updateImpl(
		vn.gt.dao.danhmucgt.model.DmMinistry dmMinistry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmMinistry, merge);
	}

	/**
	* Returns the dm ministry with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmMinistryException} if it could not be found.
	*
	* @param id the primary key of the dm ministry
	* @return the dm ministry
	* @throws vn.gt.dao.danhmucgt.NoSuchDmMinistryException if a dm ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmMinistry findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmMinistryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm ministry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm ministry
	* @return the dm ministry, or <code>null</code> if a dm ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmMinistry fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the dm ministry where ministryCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmMinistryException} if it could not be found.
	*
	* @param ministryCode the ministry code
	* @return the matching dm ministry
	* @throws vn.gt.dao.danhmucgt.NoSuchDmMinistryException if a matching dm ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmMinistry findByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmMinistryException {
		return getPersistence().findByMinistryCode(ministryCode);
	}

	/**
	* Returns the dm ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ministryCode the ministry code
	* @return the matching dm ministry, or <code>null</code> if a matching dm ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmMinistry fetchByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMinistryCode(ministryCode);
	}

	/**
	* Returns the dm ministry where ministryCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ministryCode the ministry code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm ministry, or <code>null</code> if a matching dm ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmMinistry fetchByMinistryCode(
		java.lang.String ministryCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMinistryCode(ministryCode, retrieveFromCache);
	}

	/**
	* Returns all the dm ministries.
	*
	* @return the dm ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmMinistry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm ministries
	* @param end the upper bound of the range of dm ministries (not inclusive)
	* @return the range of dm ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmMinistry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm ministries
	* @param end the upper bound of the range of dm ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmMinistry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the dm ministry where ministryCode = &#63; from the database.
	*
	* @param ministryCode the ministry code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmMinistryException {
		getPersistence().removeByMinistryCode(ministryCode);
	}

	/**
	* Removes all the dm ministries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the number of matching dm ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMinistryCode(ministryCode);
	}

	/**
	* Returns the number of dm ministries.
	*
	* @return the number of dm ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmMinistryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmMinistryPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmucgt.service.ClpSerializer.getServletContextName(),
					DmMinistryPersistence.class.getName());

			ReferenceRegistry.registerReference(DmMinistryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmMinistryPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmMinistryUtil.class, "_persistence");
	}

	private static DmMinistryPersistence _persistence;
}