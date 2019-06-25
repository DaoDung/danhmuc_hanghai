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

package vn.gt.dao.result.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.result.model.ResultNotification;

import java.util.List;

/**
 * The persistence utility for the result notification service. This utility wraps {@link ResultNotificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultNotificationPersistence
 * @see ResultNotificationPersistenceImpl
 * @generated
 */
public class ResultNotificationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(ResultNotification resultNotification) {
		getPersistence().clearCache(resultNotification);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ResultNotification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ResultNotification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ResultNotification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ResultNotification update(
		ResultNotification resultNotification, boolean merge)
		throws SystemException {
		return getPersistence().update(resultNotification, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ResultNotification update(
		ResultNotification resultNotification, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(resultNotification, merge, serviceContext);
	}

	/**
	* Caches the result notification in the entity cache if it is enabled.
	*
	* @param resultNotification the result notification
	*/
	public static void cacheResult(
		vn.gt.dao.result.model.ResultNotification resultNotification) {
		getPersistence().cacheResult(resultNotification);
	}

	/**
	* Caches the result notifications in the entity cache if it is enabled.
	*
	* @param resultNotifications the result notifications
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.result.model.ResultNotification> resultNotifications) {
		getPersistence().cacheResult(resultNotifications);
	}

	/**
	* Creates a new result notification with the primary key. Does not add the result notification to the database.
	*
	* @param id the primary key for the new result notification
	* @return the new result notification
	*/
	public static vn.gt.dao.result.model.ResultNotification create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the result notification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result notification
	* @return the result notification that was removed
	* @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultNotificationException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.result.model.ResultNotification updateImpl(
		vn.gt.dao.result.model.ResultNotification resultNotification,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(resultNotification, merge);
	}

	/**
	* Returns the result notification with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultNotificationException} if it could not be found.
	*
	* @param id the primary key of the result notification
	* @return the result notification
	* @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultNotificationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the result notification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the result notification
	* @return the result notification, or <code>null</code> if a result notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByBusinessTypeCode(
		int businessTypeCode, long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBusinessTypeCode(businessTypeCode, documentName,
			documentYear);
	}

	/**
	* Returns a range of all the result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result notifications
	* @param end the upper bound of the range of result notifications (not inclusive)
	* @return the range of matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByBusinessTypeCode(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBusinessTypeCode(businessTypeCode, documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result notifications
	* @param end the upper bound of the range of result notifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByBusinessTypeCode(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBusinessTypeCode(businessTypeCode, documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first result notification in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result notification
	* @throws vn.gt.dao.result.NoSuchResultNotificationException if a matching result notification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification findByBusinessTypeCode_First(
		int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultNotificationException {
		return getPersistence()
				   .findByBusinessTypeCode_First(businessTypeCode,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns the last result notification in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result notification
	* @throws vn.gt.dao.result.NoSuchResultNotificationException if a matching result notification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification findByBusinessTypeCode_Last(
		int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultNotificationException {
		return getPersistence()
				   .findByBusinessTypeCode_Last(businessTypeCode, documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the result notifications before and after the current result notification in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result notification
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result notification
	* @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification[] findByBusinessTypeCode_PrevAndNext(
		long id, int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultNotificationException {
		return getPersistence()
				   .findByBusinessTypeCode_PrevAndNext(id, businessTypeCode,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns all the result notifications where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the result notifications where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result notifications
	* @param end the upper bound of the range of result notifications (not inclusive)
	* @return the range of matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the result notifications where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result notifications
	* @param end the upper bound of the range of result notifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first result notification in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result notification
	* @throws vn.gt.dao.result.NoSuchResultNotificationException if a matching result notification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultNotificationException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last result notification in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result notification
	* @throws vn.gt.dao.result.NoSuchResultNotificationException if a matching result notification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultNotificationException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the result notifications before and after the current result notification in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result notification
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result notification
	* @throws vn.gt.dao.result.NoSuchResultNotificationException if a result notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultNotificationException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns all the result notifications.
	*
	* @return the result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the result notifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result notifications
	* @param end the upper bound of the range of result notifications (not inclusive)
	* @return the range of result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the result notifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result notifications
	* @param end the upper bound of the range of result notifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByBusinessTypeCode(int businessTypeCode,
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByBusinessTypeCode(businessTypeCode, documentName,
			documentYear);
	}

	/**
	* Removes all the result notifications where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Removes all the result notifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of result notifications where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBusinessTypeCode(int businessTypeCode,
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByBusinessTypeCode(businessTypeCode, documentName,
			documentYear);
	}

	/**
	* Returns the number of result notifications where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of result notifications.
	*
	* @return the number of result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ResultNotificationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ResultNotificationPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.result.service.ClpSerializer.getServletContextName(),
					ResultNotificationPersistence.class.getName());

			ReferenceRegistry.registerReference(ResultNotificationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ResultNotificationPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ResultNotificationUtil.class,
			"_persistence");
	}

	private static ResultNotificationPersistence _persistence;
}