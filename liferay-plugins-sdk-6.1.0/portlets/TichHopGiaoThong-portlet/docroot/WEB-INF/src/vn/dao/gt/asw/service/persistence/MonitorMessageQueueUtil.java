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

package vn.dao.gt.asw.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dao.gt.asw.model.MonitorMessageQueue;

import java.util.List;

/**
 * The persistence utility for the monitor message queue service. This utility wraps {@link MonitorMessageQueuePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win 64
 * @see MonitorMessageQueuePersistence
 * @see MonitorMessageQueuePersistenceImpl
 * @generated
 */
public class MonitorMessageQueueUtil {
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
	public static void clearCache(MonitorMessageQueue monitorMessageQueue) {
		getPersistence().clearCache(monitorMessageQueue);
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
	public static List<MonitorMessageQueue> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MonitorMessageQueue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MonitorMessageQueue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static MonitorMessageQueue update(
		MonitorMessageQueue monitorMessageQueue, boolean merge)
		throws SystemException {
		return getPersistence().update(monitorMessageQueue, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static MonitorMessageQueue update(
		MonitorMessageQueue monitorMessageQueue, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(monitorMessageQueue, merge, serviceContext);
	}

	/**
	* Caches the monitor message queue in the entity cache if it is enabled.
	*
	* @param monitorMessageQueue the monitor message queue
	*/
	public static void cacheResult(
		vn.dao.gt.asw.model.MonitorMessageQueue monitorMessageQueue) {
		getPersistence().cacheResult(monitorMessageQueue);
	}

	/**
	* Caches the monitor message queues in the entity cache if it is enabled.
	*
	* @param monitorMessageQueues the monitor message queues
	*/
	public static void cacheResult(
		java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> monitorMessageQueues) {
		getPersistence().cacheResult(monitorMessageQueues);
	}

	/**
	* Creates a new monitor message queue with the primary key. Does not add the monitor message queue to the database.
	*
	* @param id the primary key for the new monitor message queue
	* @return the new monitor message queue
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the monitor message queue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue that was removed
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence().remove(id);
	}

	public static vn.dao.gt.asw.model.MonitorMessageQueue updateImpl(
		vn.dao.gt.asw.model.MonitorMessageQueue monitorMessageQueue,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(monitorMessageQueue, merge);
	}

	/**
	* Returns the monitor message queue with the primary key or throws a {@link vn.dao.gt.asw.NoSuchMonitorMessageQueueException} if it could not be found.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the monitor message queue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue, or <code>null</code> if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the monitor message queues where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageId(messageId);
	}

	/**
	* Returns a range of all the monitor message queues where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @return the range of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByMessageId(
		java.lang.String messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageId(messageId, start, end);
	}

	/**
	* Returns an ordered range of all the monitor message queues where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByMessageId(
		java.lang.String messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMessageId(messageId, start, end, orderByComparator);
	}

	/**
	* Returns the first monitor message queue in the ordered set where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByMessageId_First(messageId, orderByComparator);
	}

	/**
	* Returns the last monitor message queue in the ordered set where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByMessageId_Last(messageId, orderByComparator);
	}

	/**
	* Returns the monitor message queues before and after the current monitor message queue in the ordered set where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current monitor message queue
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue[] findByMessageId_PrevAndNext(
		long id, java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByMessageId_PrevAndNext(id, messageId, orderByComparator);
	}

	/**
	* Returns all the monitor message queues where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the monitor message queues where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @return the range of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the monitor message queues where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first monitor message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last monitor message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the monitor message queues before and after the current monitor message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current monitor message queue
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Returns all the monitor message queues where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLayPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns a range of all the monitor message queues where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @return the range of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId(phieuXuLyPhuId, start, end);
	}

	/**
	* Returns an ordered range of all the monitor message queues where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId(phieuXuLyPhuId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first monitor message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId_First(phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Returns the last monitor message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId_Last(phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Returns the monitor message queues before and after the current monitor message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current monitor message queue
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue[] findByLayPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId_PrevAndNext(id, phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Returns all the monitor message queues where documentType = &#63;.
	*
	* @param documentType the document type
	* @return the matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayMessageId(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLayMessageId(documentType);
	}

	/**
	* Returns a range of all the monitor message queues where documentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentType the document type
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @return the range of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayMessageId(
		java.lang.String documentType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLayMessageId(documentType, start, end);
	}

	/**
	* Returns an ordered range of all the monitor message queues where documentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentType the document type
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayMessageId(
		java.lang.String documentType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLayMessageId(documentType, start, end,
			orderByComparator);
	}

	/**
	* Returns the first monitor message queue in the ordered set where documentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentType the document type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByLayMessageId_First(
		java.lang.String documentType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByLayMessageId_First(documentType, orderByComparator);
	}

	/**
	* Returns the last monitor message queue in the ordered set where documentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentType the document type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a matching monitor message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue findByLayMessageId_Last(
		java.lang.String documentType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByLayMessageId_Last(documentType, orderByComparator);
	}

	/**
	* Returns the monitor message queues before and after the current monitor message queue in the ordered set where documentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current monitor message queue
	* @param documentType the document type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dao.gt.asw.model.MonitorMessageQueue[] findByLayMessageId_PrevAndNext(
		long id, java.lang.String documentType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException {
		return getPersistence()
				   .findByLayMessageId_PrevAndNext(id, documentType,
			orderByComparator);
	}

	/**
	* Returns all the monitor message queues.
	*
	* @return the monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the monitor message queues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @return the range of monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the monitor message queues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the monitor message queues where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMessageId(messageId);
	}

	/**
	* Removes all the monitor message queues where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Removes all the monitor message queues where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLayPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Removes all the monitor message queues where documentType = &#63; from the database.
	*
	* @param documentType the document type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLayMessageId(java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLayMessageId(documentType);
	}

	/**
	* Removes all the monitor message queues from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of monitor message queues where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMessageId(messageId);
	}

	/**
	* Returns the number of monitor message queues where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of monitor message queues where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLayPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the number of monitor message queues where documentType = &#63;.
	*
	* @param documentType the document type
	* @return the number of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLayMessageId(java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLayMessageId(documentType);
	}

	/**
	* Returns the number of monitor message queues.
	*
	* @return the number of monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MonitorMessageQueuePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MonitorMessageQueuePersistence)PortletBeanLocatorUtil.locate(vn.dao.gt.asw.service.ClpSerializer.getServletContextName(),
					MonitorMessageQueuePersistence.class.getName());

			ReferenceRegistry.registerReference(MonitorMessageQueueUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(MonitorMessageQueuePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(MonitorMessageQueueUtil.class,
			"_persistence");
	}

	private static MonitorMessageQueuePersistence _persistence;
}