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

package vn.gt.dao.noticeandmessage.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempMaritimePaymentConfigLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempMaritimePaymentConfigLocalService
 * @generated
 */
public class TempMaritimePaymentConfigLocalServiceWrapper
	implements TempMaritimePaymentConfigLocalService,
		ServiceWrapper<TempMaritimePaymentConfigLocalService> {
	public TempMaritimePaymentConfigLocalServiceWrapper(
		TempMaritimePaymentConfigLocalService tempMaritimePaymentConfigLocalService) {
		_tempMaritimePaymentConfigLocalService = tempMaritimePaymentConfigLocalService;
	}

	/**
	* Adds the temp maritime payment config to the database. Also notifies the appropriate model listeners.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	* @return the temp maritime payment config that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig addTempMaritimePaymentConfig(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempMaritimePaymentConfigLocalService.addTempMaritimePaymentConfig(tempMaritimePaymentConfig);
	}

	/**
	* Creates a new temp maritime payment config with the primary key. Does not add the temp maritime payment config to the database.
	*
	* @param id the primary key for the new temp maritime payment config
	* @return the new temp maritime payment config
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig createTempMaritimePaymentConfig(
		long id) {
		return _tempMaritimePaymentConfigLocalService.createTempMaritimePaymentConfig(id);
	}

	/**
	* Deletes the temp maritime payment config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp maritime payment config
	* @throws PortalException if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempMaritimePaymentConfig(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempMaritimePaymentConfigLocalService.deleteTempMaritimePaymentConfig(id);
	}

	/**
	* Deletes the temp maritime payment config from the database. Also notifies the appropriate model listeners.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempMaritimePaymentConfig(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempMaritimePaymentConfigLocalService.deleteTempMaritimePaymentConfig(tempMaritimePaymentConfig);
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
		return _tempMaritimePaymentConfigLocalService.dynamicQuery(dynamicQuery);
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
		return _tempMaritimePaymentConfigLocalService.dynamicQuery(dynamicQuery,
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
		return _tempMaritimePaymentConfigLocalService.dynamicQuery(dynamicQuery,
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
		return _tempMaritimePaymentConfigLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig fetchTempMaritimePaymentConfig(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempMaritimePaymentConfigLocalService.fetchTempMaritimePaymentConfig(id);
	}

	/**
	* Returns the temp maritime payment config with the primary key.
	*
	* @param id the primary key of the temp maritime payment config
	* @return the temp maritime payment config
	* @throws PortalException if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig getTempMaritimePaymentConfig(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempMaritimePaymentConfigLocalService.getTempMaritimePaymentConfig(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempMaritimePaymentConfigLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp maritime payment configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp maritime payment configs
	* @param end the upper bound of the range of temp maritime payment configs (not inclusive)
	* @return the range of temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> getTempMaritimePaymentConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempMaritimePaymentConfigLocalService.getTempMaritimePaymentConfigs(start,
			end);
	}

	/**
	* Returns the number of temp maritime payment configs.
	*
	* @return the number of temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public int getTempMaritimePaymentConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempMaritimePaymentConfigLocalService.getTempMaritimePaymentConfigsCount();
	}

	/**
	* Updates the temp maritime payment config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	* @return the temp maritime payment config that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig updateTempMaritimePaymentConfig(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempMaritimePaymentConfigLocalService.updateTempMaritimePaymentConfig(tempMaritimePaymentConfig);
	}

	/**
	* Updates the temp maritime payment config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	* @param merge whether to merge the temp maritime payment config with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp maritime payment config that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig updateTempMaritimePaymentConfig(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempMaritimePaymentConfigLocalService.updateTempMaritimePaymentConfig(tempMaritimePaymentConfig,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempMaritimePaymentConfigLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempMaritimePaymentConfigLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig getPaymentConfig(
		java.lang.String maritimeCode) {
		return _tempMaritimePaymentConfigLocalService.getPaymentConfig(maritimeCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempMaritimePaymentConfigLocalService getWrappedTempMaritimePaymentConfigLocalService() {
		return _tempMaritimePaymentConfigLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempMaritimePaymentConfigLocalService(
		TempMaritimePaymentConfigLocalService tempMaritimePaymentConfigLocalService) {
		_tempMaritimePaymentConfigLocalService = tempMaritimePaymentConfigLocalService;
	}

	public TempMaritimePaymentConfigLocalService getWrappedService() {
		return _tempMaritimePaymentConfigLocalService;
	}

	public void setWrappedService(
		TempMaritimePaymentConfigLocalService tempMaritimePaymentConfigLocalService) {
		_tempMaritimePaymentConfigLocalService = tempMaritimePaymentConfigLocalService;
	}

	private TempMaritimePaymentConfigLocalService _tempMaritimePaymentConfigLocalService;
}