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
 * The utility for the temp crew details local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempCrewDetailsLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempCrewDetailsLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.TempCrewDetailsLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempCrewDetailsLocalServiceImpl
 * @generated
 */
public class TempCrewDetailsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempCrewDetailsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp crew details to the database. Also notifies the appropriate model listeners.
	*
	* @param tempCrewDetails the temp crew details
	* @return the temp crew details that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewDetails addTempCrewDetails(
		vn.gt.dao.noticeandmessage.model.TempCrewDetails tempCrewDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTempCrewDetails(tempCrewDetails);
	}

	/**
	* Creates a new temp crew details with the primary key. Does not add the temp crew details to the database.
	*
	* @param id the primary key for the new temp crew details
	* @return the new temp crew details
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewDetails createTempCrewDetails(
		long id) {
		return getService().createTempCrewDetails(id);
	}

	/**
	* Deletes the temp crew details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp crew details
	* @throws PortalException if a temp crew details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempCrewDetails(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempCrewDetails(id);
	}

	/**
	* Deletes the temp crew details from the database. Also notifies the appropriate model listeners.
	*
	* @param tempCrewDetails the temp crew details
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempCrewDetails(
		vn.gt.dao.noticeandmessage.model.TempCrewDetails tempCrewDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempCrewDetails(tempCrewDetails);
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

	public static vn.gt.dao.noticeandmessage.model.TempCrewDetails fetchTempCrewDetails(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempCrewDetails(id);
	}

	/**
	* Returns the temp crew details with the primary key.
	*
	* @param id the primary key of the temp crew details
	* @return the temp crew details
	* @throws PortalException if a temp crew details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewDetails getTempCrewDetails(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempCrewDetails(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp crew detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp crew detailses
	* @param end the upper bound of the range of temp crew detailses (not inclusive)
	* @return the range of temp crew detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewDetails> getTempCrewDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempCrewDetailses(start, end);
	}

	/**
	* Returns the number of temp crew detailses.
	*
	* @return the number of temp crew detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempCrewDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempCrewDetailsesCount();
	}

	/**
	* Updates the temp crew details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempCrewDetails the temp crew details
	* @return the temp crew details that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewDetails updateTempCrewDetails(
		vn.gt.dao.noticeandmessage.model.TempCrewDetails tempCrewDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempCrewDetails(tempCrewDetails);
	}

	/**
	* Updates the temp crew details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempCrewDetails the temp crew details
	* @param merge whether to merge the temp crew details with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp crew details that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewDetails updateTempCrewDetails(
		vn.gt.dao.noticeandmessage.model.TempCrewDetails tempCrewDetails,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempCrewDetails(tempCrewDetails, merge);
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

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewDetails> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewDetails> findByGivenNameAndPassportNumber(
		java.lang.String givenName, java.lang.String passportNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByGivenNameAndPassportNumber(givenName, passportNumber);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewDetails> findByCrewCode(
		java.lang.String crewCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCrewCode(crewCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempCrewDetailsLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempCrewDetailsLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempCrewDetailsLocalService.class.getName(),
					portletClassLoader);

			_service = new TempCrewDetailsLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempCrewDetailsLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TempCrewDetailsLocalService.class);
		}

		return _service;
	}

	public void setService(TempCrewDetailsLocalService service) {
		MethodCache.remove(TempCrewDetailsLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempCrewDetailsLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TempCrewDetailsLocalService.class);
	}

	private static TempCrewDetailsLocalService _service;
}