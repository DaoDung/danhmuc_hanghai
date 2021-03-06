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

package vn.dao.gt.asw.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link MonitorMessageQueueLocalService}.
 * </p>
 *
 * @author    win 64
 * @see       MonitorMessageQueueLocalService
 * @generated
 */
public class MonitorMessageQueueLocalServiceWrapper
	implements MonitorMessageQueueLocalService,
		ServiceWrapper<MonitorMessageQueueLocalService> {
	public MonitorMessageQueueLocalServiceWrapper(
		MonitorMessageQueueLocalService monitorMessageQueueLocalService) {
		_monitorMessageQueueLocalService = monitorMessageQueueLocalService;
	}

	/**
	* Adds the monitor message queue to the database. Also notifies the appropriate model listeners.
	*
	* @param monitorMessageQueue the monitor message queue
	* @return the monitor message queue that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue addMonitorMessageQueue(
		vn.dao.gt.asw.model.MonitorMessageQueue monitorMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.addMonitorMessageQueue(monitorMessageQueue);
	}

	/**
	* Creates a new monitor message queue with the primary key. Does not add the monitor message queue to the database.
	*
	* @param id the primary key for the new monitor message queue
	* @return the new monitor message queue
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue createMonitorMessageQueue(
		long id) {
		return _monitorMessageQueueLocalService.createMonitorMessageQueue(id);
	}

	/**
	* Deletes the monitor message queue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the monitor message queue
	* @throws PortalException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteMonitorMessageQueue(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_monitorMessageQueueLocalService.deleteMonitorMessageQueue(id);
	}

	/**
	* Deletes the monitor message queue from the database. Also notifies the appropriate model listeners.
	*
	* @param monitorMessageQueue the monitor message queue
	* @throws SystemException if a system exception occurred
	*/
	public void deleteMonitorMessageQueue(
		vn.dao.gt.asw.model.MonitorMessageQueue monitorMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		_monitorMessageQueueLocalService.deleteMonitorMessageQueue(monitorMessageQueue);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.dao.gt.asw.model.MonitorMessageQueue fetchMonitorMessageQueue(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.fetchMonitorMessageQueue(id);
	}

	/**
	* Returns the monitor message queue with the primary key.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue
	* @throws PortalException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue getMonitorMessageQueue(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.getMonitorMessageQueue(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<vn.dao.gt.asw.model.MonitorMessageQueue> getMonitorMessageQueues(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.getMonitorMessageQueues(start,
			end);
	}

	/**
	* Returns the number of monitor message queues.
	*
	* @return the number of monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public int getMonitorMessageQueuesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.getMonitorMessageQueuesCount();
	}

	/**
	* Updates the monitor message queue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param monitorMessageQueue the monitor message queue
	* @return the monitor message queue that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue updateMonitorMessageQueue(
		vn.dao.gt.asw.model.MonitorMessageQueue monitorMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.updateMonitorMessageQueue(monitorMessageQueue);
	}

	/**
	* Updates the monitor message queue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param monitorMessageQueue the monitor message queue
	* @param merge whether to merge the monitor message queue with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the monitor message queue that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dao.gt.asw.model.MonitorMessageQueue updateMonitorMessageQueue(
		vn.dao.gt.asw.model.MonitorMessageQueue monitorMessageQueue,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _monitorMessageQueueLocalService.updateMonitorMessageQueue(monitorMessageQueue,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _monitorMessageQueueLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_monitorMessageQueueLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public MonitorMessageQueueLocalService getWrappedMonitorMessageQueueLocalService() {
		return _monitorMessageQueueLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedMonitorMessageQueueLocalService(
		MonitorMessageQueueLocalService monitorMessageQueueLocalService) {
		_monitorMessageQueueLocalService = monitorMessageQueueLocalService;
	}

	public MonitorMessageQueueLocalService getWrappedService() {
		return _monitorMessageQueueLocalService;
	}

	public void setWrappedService(
		MonitorMessageQueueLocalService monitorMessageQueueLocalService) {
		_monitorMessageQueueLocalService = monitorMessageQueueLocalService;
	}

	private MonitorMessageQueueLocalService _monitorMessageQueueLocalService;
}