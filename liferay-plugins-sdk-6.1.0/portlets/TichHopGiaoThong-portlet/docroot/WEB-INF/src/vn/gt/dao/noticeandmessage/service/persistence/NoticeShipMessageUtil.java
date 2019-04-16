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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.noticeandmessage.model.NoticeShipMessage;

import java.util.List;

/**
 * The persistence utility for the notice ship message service. This utility wraps {@link NoticeShipMessagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see NoticeShipMessagePersistence
 * @see NoticeShipMessagePersistenceImpl
 * @generated
 */
public class NoticeShipMessageUtil {
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
	public static void clearCache(NoticeShipMessage noticeShipMessage) {
		getPersistence().clearCache(noticeShipMessage);
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
	public static List<NoticeShipMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NoticeShipMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NoticeShipMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static NoticeShipMessage update(
		NoticeShipMessage noticeShipMessage, boolean merge)
		throws SystemException {
		return getPersistence().update(noticeShipMessage, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static NoticeShipMessage update(
		NoticeShipMessage noticeShipMessage, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(noticeShipMessage, merge, serviceContext);
	}

	/**
	* Caches the notice ship message in the entity cache if it is enabled.
	*
	* @param noticeShipMessage the notice ship message
	*/
	public static void cacheResult(
		vn.gt.dao.noticeandmessage.model.NoticeShipMessage noticeShipMessage) {
		getPersistence().cacheResult(noticeShipMessage);
	}

	/**
	* Caches the notice ship messages in the entity cache if it is enabled.
	*
	* @param noticeShipMessages the notice ship messages
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.NoticeShipMessage> noticeShipMessages) {
		getPersistence().cacheResult(noticeShipMessages);
	}

	/**
	* Creates a new notice ship message with the primary key. Does not add the notice ship message to the database.
	*
	* @param id the primary key for the new notice ship message
	* @return the new notice ship message
	*/
	public static vn.gt.dao.noticeandmessage.model.NoticeShipMessage create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the notice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the notice ship message
	* @return the notice ship message that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException if a notice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.NoticeShipMessage remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.noticeandmessage.model.NoticeShipMessage updateImpl(
		vn.gt.dao.noticeandmessage.model.NoticeShipMessage noticeShipMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(noticeShipMessage, merge);
	}

	/**
	* Returns the notice ship message with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException} if it could not be found.
	*
	* @param id the primary key of the notice ship message
	* @return the notice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException if a notice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.NoticeShipMessage findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the notice ship message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the notice ship message
	* @return the notice ship message, or <code>null</code> if a notice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.NoticeShipMessage fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the notice ship messages.
	*
	* @return the notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.NoticeShipMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the notice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of notice ship messages
	* @param end the upper bound of the range of notice ship messages (not inclusive)
	* @return the range of notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.NoticeShipMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the notice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of notice ship messages
	* @param end the upper bound of the range of notice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.NoticeShipMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the notice ship messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of notice ship messages.
	*
	* @return the number of notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NoticeShipMessagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NoticeShipMessagePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					NoticeShipMessagePersistence.class.getName());

			ReferenceRegistry.registerReference(NoticeShipMessageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(NoticeShipMessagePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(NoticeShipMessageUtil.class,
			"_persistence");
	}

	private static NoticeShipMessagePersistence _persistence;
}