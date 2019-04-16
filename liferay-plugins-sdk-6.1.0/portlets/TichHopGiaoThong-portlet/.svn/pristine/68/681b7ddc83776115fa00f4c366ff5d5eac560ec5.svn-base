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

import vn.gt.dao.danhmuc.model.DmTestN01Request;

import java.util.List;

/**
 * The persistence utility for the dm test n01 request service. This utility wraps {@link DmTestN01RequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmTestN01RequestPersistence
 * @see DmTestN01RequestPersistenceImpl
 * @generated
 */
public class DmTestN01RequestUtil {
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
	public static void clearCache(DmTestN01Request dmTestN01Request) {
		getPersistence().clearCache(dmTestN01Request);
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
	public static List<DmTestN01Request> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmTestN01Request> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmTestN01Request> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DmTestN01Request remove(DmTestN01Request dmTestN01Request)
		throws SystemException {
		return getPersistence().remove(dmTestN01Request);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmTestN01Request update(DmTestN01Request dmTestN01Request,
		boolean merge) throws SystemException {
		return getPersistence().update(dmTestN01Request, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmTestN01Request update(DmTestN01Request dmTestN01Request,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmTestN01Request, merge, serviceContext);
	}

	/**
	* Caches the dm test n01 request in the entity cache if it is enabled.
	*
	* @param dmTestN01Request the dm test n01 request
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmTestN01Request dmTestN01Request) {
		getPersistence().cacheResult(dmTestN01Request);
	}

	/**
	* Caches the dm test n01 requests in the entity cache if it is enabled.
	*
	* @param dmTestN01Requests the dm test n01 requests
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmTestN01Request> dmTestN01Requests) {
		getPersistence().cacheResult(dmTestN01Requests);
	}

	/**
	* Creates a new dm test n01 request with the primary key. Does not add the dm test n01 request to the database.
	*
	* @param requestID the primary key for the new dm test n01 request
	* @return the new dm test n01 request
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request create(int requestID) {
		return getPersistence().create(requestID);
	}

	/**
	* Removes the dm test n01 request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request remove(int requestID)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException {
		return getPersistence().remove(requestID);
	}

	public static vn.gt.dao.danhmuc.model.DmTestN01Request updateImpl(
		vn.gt.dao.danhmuc.model.DmTestN01Request dmTestN01Request, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmTestN01Request, merge);
	}

	/**
	* Returns the dm test n01 request with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException} if it could not be found.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request
	* @throws vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request findByPrimaryKey(
		int requestID)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmTestN01RequestException {
		return getPersistence().findByPrimaryKey(requestID);
	}

	/**
	* Returns the dm test n01 request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request, or <code>null</code> if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request fetchByPrimaryKey(
		int requestID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(requestID);
	}

	/**
	* Returns all the dm test n01 requests.
	*
	* @return the dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmTestN01Request> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm test n01 requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm test n01 requests
	* @param end the upper bound of the range of dm test n01 requests (not inclusive)
	* @return the range of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmTestN01Request> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm test n01 requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm test n01 requests
	* @param end the upper bound of the range of dm test n01 requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmTestN01Request> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm test n01 requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm test n01 requests.
	*
	* @return the number of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmTestN01RequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmTestN01RequestPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmTestN01RequestPersistence.class.getName());

			ReferenceRegistry.registerReference(DmTestN01RequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmTestN01RequestPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmTestN01RequestUtil.class,
			"_persistence");
	}

	private static DmTestN01RequestPersistence _persistence;
}