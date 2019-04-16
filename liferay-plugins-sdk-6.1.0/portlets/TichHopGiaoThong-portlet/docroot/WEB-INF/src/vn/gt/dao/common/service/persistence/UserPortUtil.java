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

package vn.gt.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.common.model.UserPort;

import java.util.List;

/**
 * The persistence utility for the user port service. This utility wraps {@link UserPortPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see UserPortPersistence
 * @see UserPortPersistenceImpl
 * @generated
 */
public class UserPortUtil {
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
	public static void clearCache(UserPort userPort) {
		getPersistence().clearCache(userPort);
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
	public static List<UserPort> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserPort> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserPort> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static UserPort remove(UserPort userPort) throws SystemException {
		return getPersistence().remove(userPort);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static UserPort update(UserPort userPort, boolean merge)
		throws SystemException {
		return getPersistence().update(userPort, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static UserPort update(UserPort userPort, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userPort, merge, serviceContext);
	}

	/**
	* Caches the user port in the entity cache if it is enabled.
	*
	* @param userPort the user port
	*/
	public static void cacheResult(vn.gt.dao.common.model.UserPort userPort) {
		getPersistence().cacheResult(userPort);
	}

	/**
	* Caches the user ports in the entity cache if it is enabled.
	*
	* @param userPorts the user ports
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.common.model.UserPort> userPorts) {
		getPersistence().cacheResult(userPorts);
	}

	/**
	* Creates a new user port with the primary key. Does not add the user port to the database.
	*
	* @param id the primary key for the new user port
	* @return the new user port
	*/
	public static vn.gt.dao.common.model.UserPort create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the user port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user port
	* @return the user port that was removed
	* @throws vn.gt.dao.common.NoSuchUserPortException if a user port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserPortException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.common.model.UserPort updateImpl(
		vn.gt.dao.common.model.UserPort userPort, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userPort, merge);
	}

	/**
	* Returns the user port with the primary key or throws a {@link vn.gt.dao.common.NoSuchUserPortException} if it could not be found.
	*
	* @param id the primary key of the user port
	* @return the user port
	* @throws vn.gt.dao.common.NoSuchUserPortException if a user port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserPortException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the user port with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the user port
	* @return the user port, or <code>null</code> if a user port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the user ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the matching user ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.UserPort> findByPortCode(
		java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCode(portCode);
	}

	/**
	* Returns a range of all the user ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of user ports
	* @param end the upper bound of the range of user ports (not inclusive)
	* @return the range of matching user ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.UserPort> findByPortCode(
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCode(portCode, start, end);
	}

	/**
	* Returns an ordered range of all the user ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of user ports
	* @param end the upper bound of the range of user ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.UserPort> findByPortCode(
		java.lang.String portCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortCode(portCode, start, end, orderByComparator);
	}

	/**
	* Returns the first user port in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user port
	* @throws vn.gt.dao.common.NoSuchUserPortException if a matching user port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort findByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserPortException {
		return getPersistence().findByPortCode_First(portCode, orderByComparator);
	}

	/**
	* Returns the last user port in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user port
	* @throws vn.gt.dao.common.NoSuchUserPortException if a matching user port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort findByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserPortException {
		return getPersistence().findByPortCode_Last(portCode, orderByComparator);
	}

	/**
	* Returns the user ports before and after the current user port in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current user port
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user port
	* @throws vn.gt.dao.common.NoSuchUserPortException if a user port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort[] findByPortCode_PrevAndNext(
		long id, java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserPortException {
		return getPersistence()
				   .findByPortCode_PrevAndNext(id, portCode, orderByComparator);
	}

	/**
	* Returns the user port where userId = &#63; or throws a {@link vn.gt.dao.common.NoSuchUserPortException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching user port
	* @throws vn.gt.dao.common.NoSuchUserPortException if a matching user port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort findByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserPortException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns the user port where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching user port, or <code>null</code> if a matching user port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort fetchByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId(userId);
	}

	/**
	* Returns the user port where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user port, or <code>null</code> if a matching user port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort fetchByUserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId(userId, retrieveFromCache);
	}

	/**
	* Returns all the user ports.
	*
	* @return the user ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.UserPort> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user ports
	* @param end the upper bound of the range of user ports (not inclusive)
	* @return the range of user ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.UserPort> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user ports
	* @param end the upper bound of the range of user ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.UserPort> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the user ports where portCode = &#63; from the database.
	*
	* @param portCode the port code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortCode(portCode);
	}

	/**
	* Removes the user port where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchUserPortException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Removes all the user ports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the number of matching user ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortCode(portCode);
	}

	/**
	* Returns the number of user ports where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the number of user ports.
	*
	* @return the number of user ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserPortPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserPortPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.common.service.ClpSerializer.getServletContextName(),
					UserPortPersistence.class.getName());

			ReferenceRegistry.registerReference(UserPortUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(UserPortPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(UserPortUtil.class, "_persistence");
	}

	private static UserPortPersistence _persistence;
}