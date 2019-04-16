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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dao.gt.asw.model.MonitorMessageQueue;

/**
 * The persistence interface for the monitor message queue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win 64
 * @see MonitorMessageQueuePersistenceImpl
 * @see MonitorMessageQueueUtil
 * @generated
 */
public interface MonitorMessageQueuePersistence extends BasePersistence<MonitorMessageQueue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MonitorMessageQueueUtil} to access the monitor message queue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the monitor message queue in the entity cache if it is enabled.
	*
	* @param monitorMessageQueue the monitor message queue
	*/
	public void cacheResult(
		vn.dao.gt.asw.model.MonitorMessageQueue monitorMessageQueue);

	/**
	* Caches the monitor message queues in the entity cache if it is enabled.
	*
	* @param monitorMessageQueues the monitor message queues
	*/
	public void cacheResult(
		java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> monitorMessageQueues);

	/**
	* Creates a new monitor message queue with the primary key. Does not add the monitor message queue to the database.
	*
	* @param id the primary key for the new monitor message queue
	* @return the new monitor message queue
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue create(long id);

	/**
	* Removes the monitor message queue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue that was removed
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

	public vn.dao.gt.asw.model.MonitorMessageQueue updateImpl(
		vn.dao.gt.asw.model.MonitorMessageQueue monitorMessageQueue,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the monitor message queue with the primary key or throws a {@link vn.dao.gt.asw.NoSuchMonitorMessageQueueException} if it could not be found.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue
	* @throws vn.dao.gt.asw.NoSuchMonitorMessageQueueException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

	/**
	* Returns the monitor message queue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue, or <code>null</code> if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the monitor message queues where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByMessageId(
		java.lang.String messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByMessageId(
		java.lang.String messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue findByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue findByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue[] findByMessageId_PrevAndNext(
		long id, java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

	/**
	* Returns all the monitor message queues where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

	/**
	* Returns all the monitor message queues where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue findByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue findByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue[] findByLayPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

	/**
	* Returns all the monitor message queues where documentType = &#63;.
	*
	* @param documentType the document type
	* @return the matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayMessageId(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayMessageId(
		java.lang.String documentType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findByLayMessageId(
		java.lang.String documentType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue findByLayMessageId_First(
		java.lang.String documentType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue findByLayMessageId_Last(
		java.lang.String documentType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

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
	public vn.dao.gt.asw.model.MonitorMessageQueue[] findByLayMessageId_PrevAndNext(
		long id, java.lang.String documentType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dao.gt.asw.NoSuchMonitorMessageQueueException;

	/**
	* Returns all the monitor message queues.
	*
	* @return the monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the monitor message queues where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the monitor message queues where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the monitor message queues where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the monitor message queues where documentType = &#63; from the database.
	*
	* @param documentType the document type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLayMessageId(java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the monitor message queues from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of monitor message queues where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of monitor message queues where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of monitor message queues where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of monitor message queues where documentType = &#63;.
	*
	* @param documentType the document type
	* @return the number of matching monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByLayMessageId(java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of monitor message queues.
	*
	* @return the number of monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}