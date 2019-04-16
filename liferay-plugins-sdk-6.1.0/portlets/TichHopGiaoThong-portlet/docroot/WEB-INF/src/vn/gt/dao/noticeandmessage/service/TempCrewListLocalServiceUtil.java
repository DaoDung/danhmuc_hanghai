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
 * The utility for the temp crew list local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempCrewListLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempCrewListLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.TempCrewListLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempCrewListLocalServiceImpl
 * @generated
 */
public class TempCrewListLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempCrewListLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp crew list to the database. Also notifies the appropriate model listeners.
	*
	* @param tempCrewList the temp crew list
	* @return the temp crew list that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewList addTempCrewList(
		vn.gt.dao.noticeandmessage.model.TempCrewList tempCrewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTempCrewList(tempCrewList);
	}

	/**
	* Creates a new temp crew list with the primary key. Does not add the temp crew list to the database.
	*
	* @param id the primary key for the new temp crew list
	* @return the new temp crew list
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewList createTempCrewList(
		long id) {
		return getService().createTempCrewList(id);
	}

	/**
	* Deletes the temp crew list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp crew list
	* @throws PortalException if a temp crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempCrewList(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempCrewList(id);
	}

	/**
	* Deletes the temp crew list from the database. Also notifies the appropriate model listeners.
	*
	* @param tempCrewList the temp crew list
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempCrewList(
		vn.gt.dao.noticeandmessage.model.TempCrewList tempCrewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempCrewList(tempCrewList);
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

	public static vn.gt.dao.noticeandmessage.model.TempCrewList fetchTempCrewList(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempCrewList(id);
	}

	/**
	* Returns the temp crew list with the primary key.
	*
	* @param id the primary key of the temp crew list
	* @return the temp crew list
	* @throws PortalException if a temp crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewList getTempCrewList(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempCrewList(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp crew lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp crew lists
	* @param end the upper bound of the range of temp crew lists (not inclusive)
	* @return the range of temp crew lists
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewList> getTempCrewLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempCrewLists(start, end);
	}

	/**
	* Returns the number of temp crew lists.
	*
	* @return the number of temp crew lists
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempCrewListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempCrewListsCount();
	}

	/**
	* Updates the temp crew list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempCrewList the temp crew list
	* @return the temp crew list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewList updateTempCrewList(
		vn.gt.dao.noticeandmessage.model.TempCrewList tempCrewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempCrewList(tempCrewList);
	}

	/**
	* Updates the temp crew list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempCrewList the temp crew list
	* @param merge whether to merge the temp crew list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp crew list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempCrewList updateTempCrewList(
		vn.gt.dao.noticeandmessage.model.TempCrewList tempCrewList,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempCrewList(tempCrewList, merge);
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

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewList> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewList> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBydocumentNameAnddocumentYear(documentName,
			documentYear, start, end);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewList> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.TempCrewList findTempCrewListByRequestCode(
		java.lang.String requestCode) {
		return getService().findTempCrewListByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.TempCrewList getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewList> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempCrewListLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempCrewListLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempCrewListLocalService.class.getName(), portletClassLoader);

			_service = new TempCrewListLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempCrewListLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TempCrewListLocalService.class);
		}

		return _service;
	}

	public void setService(TempCrewListLocalService service) {
		MethodCache.remove(TempCrewListLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempCrewListLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TempCrewListLocalService.class);
	}

	private static TempCrewListLocalService _service;
}