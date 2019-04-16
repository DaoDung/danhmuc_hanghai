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
 * The utility for the temp no tice ship message local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.TempNoTiceShipMessageLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see TempNoTiceShipMessageLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.TempNoTiceShipMessageLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.TempNoTiceShipMessageLocalServiceImpl
 * @generated
 */
public class TempNoTiceShipMessageLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.TempNoTiceShipMessageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp no tice ship message to the database. Also notifies the appropriate model listeners.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	* @return the temp no tice ship message that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage addTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTempNoTiceShipMessage(tempNoTiceShipMessage);
	}

	/**
	* Creates a new temp no tice ship message with the primary key. Does not add the temp no tice ship message to the database.
	*
	* @param id the primary key for the new temp no tice ship message
	* @return the new temp no tice ship message
	*/
	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage createTempNoTiceShipMessage(
		long id) {
		return getService().createTempNoTiceShipMessage(id);
	}

	/**
	* Deletes the temp no tice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp no tice ship message
	* @throws PortalException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempNoTiceShipMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempNoTiceShipMessage(id);
	}

	/**
	* Deletes the temp no tice ship message from the database. Also notifies the appropriate model listeners.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTempNoTiceShipMessage(tempNoTiceShipMessage);
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

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage fetchTempNoTiceShipMessage(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempNoTiceShipMessage(id);
	}

	/**
	* Returns the temp no tice ship message with the primary key.
	*
	* @param id the primary key of the temp no tice ship message
	* @return the temp no tice ship message
	* @throws PortalException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getTempNoTiceShipMessage(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempNoTiceShipMessage(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp no tice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> getTempNoTiceShipMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempNoTiceShipMessages(start, end);
	}

	/**
	* Returns the number of temp no tice ship messages.
	*
	* @return the number of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempNoTiceShipMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempNoTiceShipMessagesCount();
	}

	/**
	* Updates the temp no tice ship message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	* @return the temp no tice ship message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage updateTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempNoTiceShipMessage(tempNoTiceShipMessage);
	}

	/**
	* Updates the temp no tice ship message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	* @param merge whether to merge the temp no tice ship message with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp no tice ship message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage updateTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTempNoTiceShipMessage(tempNoTiceShipMessage, merge);
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

	public static int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return getService()
				   .countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode) {
		return getService().findByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageByRequestCode(
		java.lang.String requestCode) {
		return getService().findTempNoTiceShipMessageByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageXbByRequestCode(
		java.lang.String requestCode) {
		return getService().findTempNoTiceShipMessageXbByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageTbByRequestCode(
		java.lang.String requestCode) {
		return getService().findTempNoTiceShipMessageTbByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(
		long documentName, int documentYear, java.lang.String noticeShipType,
		java.lang.String orderByColumn, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(documentName,
			documentYear, noticeShipType, orderByColumn, ascOrdesc);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getXacBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear) {
		return getService()
				   .getXacBaoLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getThongBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear) {
		return getService()
				   .getThongBaoLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempNoTiceShipMessageLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempNoTiceShipMessageLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					TempNoTiceShipMessageLocalService.class.getName(),
					portletClassLoader);

			_service = new TempNoTiceShipMessageLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(TempNoTiceShipMessageLocalServiceUtil.class,
				"_service");
			MethodCache.remove(TempNoTiceShipMessageLocalService.class);
		}

		return _service;
	}

	public void setService(TempNoTiceShipMessageLocalService service) {
		MethodCache.remove(TempNoTiceShipMessageLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(TempNoTiceShipMessageLocalServiceUtil.class,
			"_service");
		MethodCache.remove(TempNoTiceShipMessageLocalService.class);
	}

	private static TempNoTiceShipMessageLocalService _service;
}