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

package vn.gt.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.common.model.LogMessageValidation;

import java.util.List;

/**
 * The persistence utility for the log message validation service. This utility wraps {@link LogMessageValidationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see LogMessageValidationPersistence
 * @see LogMessageValidationPersistenceImpl
 * @generated
 */
public class LogMessageValidationUtil {
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
	public static void clearCache(LogMessageValidation logMessageValidation) {
		getPersistence().clearCache(logMessageValidation);
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
	public static List<LogMessageValidation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LogMessageValidation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LogMessageValidation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static LogMessageValidation remove(
		LogMessageValidation logMessageValidation) throws SystemException {
		return getPersistence().remove(logMessageValidation);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static LogMessageValidation update(
		LogMessageValidation logMessageValidation, boolean merge)
		throws SystemException {
		return getPersistence().update(logMessageValidation, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static LogMessageValidation update(
		LogMessageValidation logMessageValidation, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(logMessageValidation, merge, serviceContext);
	}

	/**
	* Caches the log message validation in the entity cache if it is enabled.
	*
	* @param logMessageValidation the log message validation
	*/
	public static void cacheResult(
		vn.gt.dao.common.model.LogMessageValidation logMessageValidation) {
		getPersistence().cacheResult(logMessageValidation);
	}

	/**
	* Caches the log message validations in the entity cache if it is enabled.
	*
	* @param logMessageValidations the log message validations
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.common.model.LogMessageValidation> logMessageValidations) {
		getPersistence().cacheResult(logMessageValidations);
	}

	/**
	* Creates a new log message validation with the primary key. Does not add the log message validation to the database.
	*
	* @param id the primary key for the new log message validation
	* @return the new log message validation
	*/
	public static vn.gt.dao.common.model.LogMessageValidation create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the log message validation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the log message validation
	* @return the log message validation that was removed
	* @throws vn.gt.dao.common.NoSuchLogMessageValidationException if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.LogMessageValidation remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchLogMessageValidationException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.common.model.LogMessageValidation updateImpl(
		vn.gt.dao.common.model.LogMessageValidation logMessageValidation,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(logMessageValidation, merge);
	}

	/**
	* Returns the log message validation with the primary key or throws a {@link vn.gt.dao.common.NoSuchLogMessageValidationException} if it could not be found.
	*
	* @param id the primary key of the log message validation
	* @return the log message validation
	* @throws vn.gt.dao.common.NoSuchLogMessageValidationException if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.LogMessageValidation findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchLogMessageValidationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the log message validation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the log message validation
	* @return the log message validation, or <code>null</code> if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.LogMessageValidation fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the log message validations where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching log message validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.LogMessageValidation> findByDocumentNameDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameDocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the log message validations where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @return the range of matching log message validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.LogMessageValidation> findByDocumentNameDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameDocumentYear(documentName, documentYear,
			start, end);
	}

	/**
	* Returns an ordered range of all the log message validations where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching log message validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.LogMessageValidation> findByDocumentNameDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameDocumentYear(documentName, documentYear,
			start, end, orderByComparator);
	}

	/**
	* Returns the first log message validation in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log message validation
	* @throws vn.gt.dao.common.NoSuchLogMessageValidationException if a matching log message validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.LogMessageValidation findByDocumentNameDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchLogMessageValidationException {
		return getPersistence()
				   .findByDocumentNameDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last log message validation in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log message validation
	* @throws vn.gt.dao.common.NoSuchLogMessageValidationException if a matching log message validation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.LogMessageValidation findByDocumentNameDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchLogMessageValidationException {
		return getPersistence()
				   .findByDocumentNameDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the log message validations before and after the current log message validation in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current log message validation
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next log message validation
	* @throws vn.gt.dao.common.NoSuchLogMessageValidationException if a log message validation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.LogMessageValidation[] findByDocumentNameDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.common.NoSuchLogMessageValidationException {
		return getPersistence()
				   .findByDocumentNameDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns all the log message validations.
	*
	* @return the log message validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.LogMessageValidation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the log message validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @return the range of log message validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.LogMessageValidation> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the log message validations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of log message validations
	* @param end the upper bound of the range of log message validations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of log message validations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.common.model.LogMessageValidation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the log message validations where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameDocumentYear(documentName, documentYear);
	}

	/**
	* Removes all the log message validations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of log message validations where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching log message validations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameDocumentYear(documentName, documentYear);
	}

	/**
	* Returns the number of log message validations.
	*
	* @return the number of log message validations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LogMessageValidationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LogMessageValidationPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.common.service.ClpSerializer.getServletContextName(),
					LogMessageValidationPersistence.class.getName());

			ReferenceRegistry.registerReference(LogMessageValidationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(LogMessageValidationPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(LogMessageValidationUtil.class,
			"_persistence");
	}

	private static LogMessageValidationPersistence _persistence;
}