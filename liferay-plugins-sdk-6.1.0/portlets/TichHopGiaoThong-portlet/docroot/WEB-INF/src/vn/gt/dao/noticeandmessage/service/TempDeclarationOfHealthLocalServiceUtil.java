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
 * The utility for the temp declaration of health local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempDeclarationOfHealthLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempDeclarationOfHealthLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.TempDeclarationOfHealthLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempDeclarationOfHealthLocalServiceImpl
 * @generated
 */
public class TempDeclarationOfHealthLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempDeclarationOfHealthLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp declaration of health to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationOfHealth the temp declaration of health
	* @return the temp declaration of health that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth addTempDeclarationOfHealth(
		vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth tempDeclarationOfHealth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTempDeclarationOfHealth(tempDeclarationOfHealth);
	}

	/**
	* Creates a new temp declaration of health with the primary key. Does not add the temp declaration of health to the database.
	*
	* @param id the primary key for the new temp declaration of health
	* @return the new temp declaration of health
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth createTempDeclarationOfHealth(
		long id) {
		return getService().createTempDeclarationOfHealth(id);
	}

	/**
	* Deletes the temp declaration of health with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp declaration of health
	* @throws PortalException if a temp declaration of health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempDeclarationOfHealth(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempDeclarationOfHealth(id);
	}

	/**
	* Deletes the temp declaration of health from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationOfHealth the temp declaration of health
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempDeclarationOfHealth(
		vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth tempDeclarationOfHealth)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempDeclarationOfHealth(tempDeclarationOfHealth);
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

	public static vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth fetchTempDeclarationOfHealth(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempDeclarationOfHealth(id);
	}

	/**
	* Returns the temp declaration of health with the primary key.
	*
	* @param id the primary key of the temp declaration of health
	* @return the temp declaration of health
	* @throws PortalException if a temp declaration of health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth getTempDeclarationOfHealth(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempDeclarationOfHealth(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp declaration of healths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp declaration of healths
	* @param end the upper bound of the range of temp declaration of healths (not inclusive)
	* @return the range of temp declaration of healths
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> getTempDeclarationOfHealths(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempDeclarationOfHealths(start, end);
	}

	/**
	* Returns the number of temp declaration of healths.
	*
	* @return the number of temp declaration of healths
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempDeclarationOfHealthsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempDeclarationOfHealthsCount();
	}

	/**
	* Updates the temp declaration of health in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationOfHealth the temp declaration of health
	* @return the temp declaration of health that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth updateTempDeclarationOfHealth(
		vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth tempDeclarationOfHealth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTempDeclarationOfHealth(tempDeclarationOfHealth);
	}

	/**
	* Updates the temp declaration of health in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationOfHealth the temp declaration of health
	* @param merge whether to merge the temp declaration of health with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp declaration of health that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth updateTempDeclarationOfHealth(
		vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth tempDeclarationOfHealth,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTempDeclarationOfHealth(tempDeclarationOfHealth, merge);
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

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState) {
		return getService()
				   .findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> findByRequestCode(
		java.lang.String requestCode) {
		return getService().findByRequestCode(requestCode);
	}

	public static int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return getService()
				   .countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return getService()
				   .findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempDeclarationOfHealthLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempDeclarationOfHealthLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempDeclarationOfHealthLocalService.class.getName(),
					portletClassLoader);

			_service = new TempDeclarationOfHealthLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempDeclarationOfHealthLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TempDeclarationOfHealthLocalService.class);
		}

		return _service;
	}

	public void setService(TempDeclarationOfHealthLocalService service) {
		MethodCache.remove(TempDeclarationOfHealthLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempDeclarationOfHealthLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TempDeclarationOfHealthLocalService.class);
	}

	private static TempDeclarationOfHealthLocalService _service;
}