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
 * The utility for the temp general declaration local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempGeneralDeclarationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempGeneralDeclarationLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.TempGeneralDeclarationLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempGeneralDeclarationLocalServiceImpl
 * @generated
 */
public class TempGeneralDeclarationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempGeneralDeclarationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp general declaration to the database. Also notifies the appropriate model listeners.
	*
	* @param tempGeneralDeclaration the temp general declaration
	* @return the temp general declaration that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration addTempGeneralDeclaration(
		vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration tempGeneralDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTempGeneralDeclaration(tempGeneralDeclaration);
	}

	/**
	* Creates a new temp general declaration with the primary key. Does not add the temp general declaration to the database.
	*
	* @param id the primary key for the new temp general declaration
	* @return the new temp general declaration
	*/
	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration createTempGeneralDeclaration(
		long id) {
		return getService().createTempGeneralDeclaration(id);
	}

	/**
	* Deletes the temp general declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp general declaration
	* @throws PortalException if a temp general declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempGeneralDeclaration(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempGeneralDeclaration(id);
	}

	/**
	* Deletes the temp general declaration from the database. Also notifies the appropriate model listeners.
	*
	* @param tempGeneralDeclaration the temp general declaration
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempGeneralDeclaration(
		vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration tempGeneralDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempGeneralDeclaration(tempGeneralDeclaration);
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

	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration fetchTempGeneralDeclaration(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempGeneralDeclaration(id);
	}

	/**
	* Returns the temp general declaration with the primary key.
	*
	* @param id the primary key of the temp general declaration
	* @return the temp general declaration
	* @throws PortalException if a temp general declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration getTempGeneralDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempGeneralDeclaration(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp general declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp general declarations
	* @param end the upper bound of the range of temp general declarations (not inclusive)
	* @return the range of temp general declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration> getTempGeneralDeclarations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempGeneralDeclarations(start, end);
	}

	/**
	* Returns the number of temp general declarations.
	*
	* @return the number of temp general declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempGeneralDeclarationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempGeneralDeclarationsCount();
	}

	/**
	* Updates the temp general declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempGeneralDeclaration the temp general declaration
	* @return the temp general declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration updateTempGeneralDeclaration(
		vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration tempGeneralDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempGeneralDeclaration(tempGeneralDeclaration);
	}

	/**
	* Updates the temp general declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempGeneralDeclaration the temp general declaration
	* @param merge whether to merge the temp general declaration with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp general declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration updateTempGeneralDeclaration(
		vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration tempGeneralDeclaration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTempGeneralDeclaration(tempGeneralDeclaration, merge);
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

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration> findByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState) {
		return getService()
				   .findByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration> findByRequestCode(
		java.lang.String requestCode) {
		return getService().findByRequestCode(requestCode);
	}

	public static int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) {
		return getService()
				   .countByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findByDocumentNameAndDocumentYear(documentName, documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration findTempGeneralDeclarationByRequestCode(
		java.lang.String requestCode) {
		return getService().findTempGeneralDeclarationByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration getByRequestCode(
		java.lang.String requestCode) {
		return getService().getByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return getService()
				   .findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempGeneralDeclarationLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempGeneralDeclarationLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempGeneralDeclarationLocalService.class.getName(),
					portletClassLoader);

			_service = new TempGeneralDeclarationLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempGeneralDeclarationLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TempGeneralDeclarationLocalService.class);
		}

		return _service;
	}

	public void setService(TempGeneralDeclarationLocalService service) {
		MethodCache.remove(TempGeneralDeclarationLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempGeneralDeclarationLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TempGeneralDeclarationLocalService.class);
	}

	private static TempGeneralDeclarationLocalService _service;
}