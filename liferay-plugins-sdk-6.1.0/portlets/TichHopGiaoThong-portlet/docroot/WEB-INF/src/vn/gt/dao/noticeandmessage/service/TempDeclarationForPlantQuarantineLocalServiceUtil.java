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
 * The utility for the temp declaration for plant quarantine local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempDeclarationForPlantQuarantineLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempDeclarationForPlantQuarantineLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.TempDeclarationForPlantQuarantineLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempDeclarationForPlantQuarantineLocalServiceImpl
 * @generated
 */
public class TempDeclarationForPlantQuarantineLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempDeclarationForPlantQuarantineLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp declaration for plant quarantine to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForPlantQuarantine the temp declaration for plant quarantine
	* @return the temp declaration for plant quarantine that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine addTempDeclarationForPlantQuarantine(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine tempDeclarationForPlantQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addTempDeclarationForPlantQuarantine(tempDeclarationForPlantQuarantine);
	}

	/**
	* Creates a new temp declaration for plant quarantine with the primary key. Does not add the temp declaration for plant quarantine to the database.
	*
	* @param id the primary key for the new temp declaration for plant quarantine
	* @return the new temp declaration for plant quarantine
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine createTempDeclarationForPlantQuarantine(
		long id) {
		return getService().createTempDeclarationForPlantQuarantine(id);
	}

	/**
	* Deletes the temp declaration for plant quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp declaration for plant quarantine
	* @throws PortalException if a temp declaration for plant quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempDeclarationForPlantQuarantine(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempDeclarationForPlantQuarantine(id);
	}

	/**
	* Deletes the temp declaration for plant quarantine from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForPlantQuarantine the temp declaration for plant quarantine
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempDeclarationForPlantQuarantine(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine tempDeclarationForPlantQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteTempDeclarationForPlantQuarantine(tempDeclarationForPlantQuarantine);
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

	public static vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine fetchTempDeclarationForPlantQuarantine(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempDeclarationForPlantQuarantine(id);
	}

	/**
	* Returns the temp declaration for plant quarantine with the primary key.
	*
	* @param id the primary key of the temp declaration for plant quarantine
	* @return the temp declaration for plant quarantine
	* @throws PortalException if a temp declaration for plant quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine getTempDeclarationForPlantQuarantine(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempDeclarationForPlantQuarantine(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp declaration for plant quarantines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp declaration for plant quarantines
	* @param end the upper bound of the range of temp declaration for plant quarantines (not inclusive)
	* @return the range of temp declaration for plant quarantines
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine> getTempDeclarationForPlantQuarantines(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempDeclarationForPlantQuarantines(start, end);
	}

	/**
	* Returns the number of temp declaration for plant quarantines.
	*
	* @return the number of temp declaration for plant quarantines
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempDeclarationForPlantQuarantinesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempDeclarationForPlantQuarantinesCount();
	}

	/**
	* Updates the temp declaration for plant quarantine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForPlantQuarantine the temp declaration for plant quarantine
	* @return the temp declaration for plant quarantine that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine updateTempDeclarationForPlantQuarantine(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine tempDeclarationForPlantQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTempDeclarationForPlantQuarantine(tempDeclarationForPlantQuarantine);
	}

	/**
	* Updates the temp declaration for plant quarantine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForPlantQuarantine the temp declaration for plant quarantine
	* @param merge whether to merge the temp declaration for plant quarantine with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp declaration for plant quarantine that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine updateTempDeclarationForPlantQuarantine(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine tempDeclarationForPlantQuarantine,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTempDeclarationForPlantQuarantine(tempDeclarationForPlantQuarantine,
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

	/**
	* Returns the number of temp declaration for plant quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp declaration for plant quarantines
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return getService()
				   .countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns all the temp declaration for plant quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp declaration for plant quarantines
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState) {
		return getService()
				   .findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempDeclarationForPlantQuarantineLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempDeclarationForPlantQuarantineLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempDeclarationForPlantQuarantineLocalService.class.getName(),
					portletClassLoader);

			_service = new TempDeclarationForPlantQuarantineLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempDeclarationForPlantQuarantineLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TempDeclarationForPlantQuarantineLocalService.class);
		}

		return _service;
	}

	public void setService(
		TempDeclarationForPlantQuarantineLocalService service) {
		MethodCache.remove(TempDeclarationForPlantQuarantineLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempDeclarationForPlantQuarantineLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TempDeclarationForPlantQuarantineLocalService.class);
	}

	private static TempDeclarationForPlantQuarantineLocalService _service;
}