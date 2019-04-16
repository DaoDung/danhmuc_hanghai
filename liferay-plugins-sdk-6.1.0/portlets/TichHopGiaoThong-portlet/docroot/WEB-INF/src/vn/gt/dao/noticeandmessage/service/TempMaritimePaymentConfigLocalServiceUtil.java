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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the temp maritime payment config local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempMaritimePaymentConfigLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempMaritimePaymentConfigLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.TempMaritimePaymentConfigLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempMaritimePaymentConfigLocalServiceImpl
 * @generated
 */
public class TempMaritimePaymentConfigLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempMaritimePaymentConfigLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp maritime payment config to the database. Also notifies the appropriate model listeners.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	* @return the temp maritime payment config that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig addTempMaritimePaymentConfig(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addTempMaritimePaymentConfig(tempMaritimePaymentConfig);
	}

	/**
	* Creates a new temp maritime payment config with the primary key. Does not add the temp maritime payment config to the database.
	*
	* @param id the primary key for the new temp maritime payment config
	* @return the new temp maritime payment config
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig createTempMaritimePaymentConfig(
		long id) {
		return getService().createTempMaritimePaymentConfig(id);
	}

	/**
	* Deletes the temp maritime payment config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp maritime payment config
	* @throws PortalException if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempMaritimePaymentConfig(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempMaritimePaymentConfig(id);
	}

	/**
	* Deletes the temp maritime payment config from the database. Also notifies the appropriate model listeners.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempMaritimePaymentConfig(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempMaritimePaymentConfig(tempMaritimePaymentConfig);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig fetchTempMaritimePaymentConfig(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempMaritimePaymentConfig(id);
	}

	/**
	* Returns the temp maritime payment config with the primary key.
	*
	* @param id the primary key of the temp maritime payment config
	* @return the temp maritime payment config
	* @throws PortalException if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig getTempMaritimePaymentConfig(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempMaritimePaymentConfig(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> getTempMaritimePaymentConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempMaritimePaymentConfigs(start, end);
	}

	/**
	* Returns the number of temp maritime payment configs.
	*
	* @return the number of temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempMaritimePaymentConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempMaritimePaymentConfigsCount();
	}

	/**
	* Updates the temp maritime payment config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	* @return the temp maritime payment config that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig updateTempMaritimePaymentConfig(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTempMaritimePaymentConfig(tempMaritimePaymentConfig);
	}

	/**
	* Updates the temp maritime payment config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	* @param merge whether to merge the temp maritime payment config with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp maritime payment config that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig updateTempMaritimePaymentConfig(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTempMaritimePaymentConfig(tempMaritimePaymentConfig,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig getPaymentConfig(
		java.lang.String maritimeCode) {
		return getService().getPaymentConfig(maritimeCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempMaritimePaymentConfigLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempMaritimePaymentConfigLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempMaritimePaymentConfigLocalService.class.getName(),
					portletClassLoader);

			_service = new TempMaritimePaymentConfigLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempMaritimePaymentConfigLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TempMaritimePaymentConfigLocalService.class);
		}

		return _service;
	}

	public void setService(TempMaritimePaymentConfigLocalService service) {
		MethodCache.remove(TempMaritimePaymentConfigLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempMaritimePaymentConfigLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TempMaritimePaymentConfigLocalService.class);
	}

	private static TempMaritimePaymentConfigLocalService _service;
}