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

package vn.gt.dao.nhapcanh.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.nhapcanh.model.PassengerList;

import java.util.List;

/**
 * The persistence utility for the passenger list service. This utility wraps {@link PassengerListPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see PassengerListPersistence
 * @see PassengerListPersistenceImpl
 * @generated
 */
public class PassengerListUtil {
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
	public static void clearCache(PassengerList passengerList) {
		getPersistence().clearCache(passengerList);
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
	public static List<PassengerList> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PassengerList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PassengerList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static PassengerList update(PassengerList passengerList,
		boolean merge) throws SystemException {
		return getPersistence().update(passengerList, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static PassengerList update(PassengerList passengerList,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(passengerList, merge, serviceContext);
	}

	/**
	* Caches the passenger list in the entity cache if it is enabled.
	*
	* @param passengerList the passenger list
	*/
	public static void cacheResult(
		vn.gt.dao.nhapcanh.model.PassengerList passengerList) {
		getPersistence().cacheResult(passengerList);
	}

	/**
	* Caches the passenger lists in the entity cache if it is enabled.
	*
	* @param passengerLists the passenger lists
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> passengerLists) {
		getPersistence().cacheResult(passengerLists);
	}

	/**
	* Creates a new passenger list with the primary key. Does not add the passenger list to the database.
	*
	* @param id the primary key for the new passenger list
	* @return the new passenger list
	*/
	public static vn.gt.dao.nhapcanh.model.PassengerList create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the passenger list
	* @return the passenger list that was removed
	* @throws vn.gt.dao.nhapcanh.NoSuchPassengerListException if a passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.nhapcanh.model.PassengerList remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchPassengerListException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.nhapcanh.model.PassengerList updateImpl(
		vn.gt.dao.nhapcanh.model.PassengerList passengerList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(passengerList, merge);
	}

	/**
	* Returns the passenger list with the primary key or throws a {@link vn.gt.dao.nhapcanh.NoSuchPassengerListException} if it could not be found.
	*
	* @param id the primary key of the passenger list
	* @return the passenger list
	* @throws vn.gt.dao.nhapcanh.NoSuchPassengerListException if a passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.nhapcanh.model.PassengerList findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchPassengerListException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the passenger list with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the passenger list
	* @return the passenger list, or <code>null</code> if a passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.nhapcanh.model.PassengerList fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the passenger lists.
	*
	* @return the passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the passenger lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of passenger lists
	* @param end the upper bound of the range of passenger lists (not inclusive)
	* @return the range of passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the passenger lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of passenger lists
	* @param end the upper bound of the range of passenger lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the passenger lists from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of passenger lists.
	*
	* @return the number of passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PassengerListPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PassengerListPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.nhapcanh.service.ClpSerializer.getServletContextName(),
					PassengerListPersistence.class.getName());

			ReferenceRegistry.registerReference(PassengerListUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(PassengerListPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(PassengerListUtil.class,
			"_persistence");
	}

	private static PassengerListPersistence _persistence;
}