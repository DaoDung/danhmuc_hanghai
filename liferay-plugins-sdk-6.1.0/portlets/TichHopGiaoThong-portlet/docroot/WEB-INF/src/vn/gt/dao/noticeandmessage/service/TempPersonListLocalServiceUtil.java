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
 * The utility for the temp person list local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempPersonListLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempPersonListLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.TempPersonListLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempPersonListLocalServiceImpl
 * @generated
 */
public class TempPersonListLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempPersonListLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp person list to the database. Also notifies the appropriate model listeners.
	*
	* @param tempPersonList the temp person list
	* @return the temp person list that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempPersonList addTempPersonList(
		vn.gt.dao.noticeandmessage.model.TempPersonList tempPersonList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTempPersonList(tempPersonList);
	}

	/**
	* Creates a new temp person list with the primary key. Does not add the temp person list to the database.
	*
	* @param id the primary key for the new temp person list
	* @return the new temp person list
	*/
	public static vn.gt.dao.noticeandmessage.model.TempPersonList createTempPersonList(
		long id) {
		return getService().createTempPersonList(id);
	}

	/**
	* Deletes the temp person list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp person list
	* @throws PortalException if a temp person list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempPersonList(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempPersonList(id);
	}

	/**
	* Deletes the temp person list from the database. Also notifies the appropriate model listeners.
	*
	* @param tempPersonList the temp person list
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempPersonList(
		vn.gt.dao.noticeandmessage.model.TempPersonList tempPersonList)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempPersonList(tempPersonList);
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

	public static vn.gt.dao.noticeandmessage.model.TempPersonList fetchTempPersonList(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempPersonList(id);
	}

	/**
	* Returns the temp person list with the primary key.
	*
	* @param id the primary key of the temp person list
	* @return the temp person list
	* @throws PortalException if a temp person list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempPersonList getTempPersonList(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempPersonList(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp person lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp person lists
	* @param end the upper bound of the range of temp person lists (not inclusive)
	* @return the range of temp person lists
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempPersonList> getTempPersonLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempPersonLists(start, end);
	}

	/**
	* Returns the number of temp person lists.
	*
	* @return the number of temp person lists
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempPersonListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempPersonListsCount();
	}

	/**
	* Updates the temp person list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempPersonList the temp person list
	* @return the temp person list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempPersonList updateTempPersonList(
		vn.gt.dao.noticeandmessage.model.TempPersonList tempPersonList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempPersonList(tempPersonList);
	}

	/**
	* Updates the temp person list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempPersonList the temp person list
	* @param merge whether to merge the temp person list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp person list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempPersonList updateTempPersonList(
		vn.gt.dao.noticeandmessage.model.TempPersonList tempPersonList,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempPersonList(tempPersonList, merge);
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

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempPersonList> findBydocumentNameAnddocumentYearAndRequestCode(
		int documentName, int documentYear, java.lang.String requestCode) {
		return getService()
				   .findBydocumentNameAnddocumentYearAndRequestCode(documentName,
			documentYear, requestCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempPersonListLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempPersonListLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempPersonListLocalService.class.getName(),
					portletClassLoader);

			_service = new TempPersonListLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempPersonListLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TempPersonListLocalService.class);
		}

		return _service;
	}

	public void setService(TempPersonListLocalService service) {
		MethodCache.remove(TempPersonListLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempPersonListLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TempPersonListLocalService.class);
	}

	private static TempPersonListLocalService _service;
}