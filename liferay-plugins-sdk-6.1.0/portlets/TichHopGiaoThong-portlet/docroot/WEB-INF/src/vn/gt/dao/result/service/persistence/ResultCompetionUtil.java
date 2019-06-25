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

import vn.gt.dao.result.model.ResultCompetion;

import java.util.List;

/**
 * The persistence utility for the result competion service. This utility wraps {@link ResultCompetionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultCompetionPersistence
 * @see ResultCompetionPersistenceImpl
 * @generated
 */
public class ResultCompetionUtil {
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
	public static void clearCache(ResultCompetion resultCompetion) {
		getPersistence().clearCache(resultCompetion);
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
	public static List<ResultCompetion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ResultCompetion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ResultCompetion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ResultCompetion update(ResultCompetion resultCompetion,
		boolean merge) throws SystemException {
		return getPersistence().update(resultCompetion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ResultCompetion update(ResultCompetion resultCompetion,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(resultCompetion, merge, serviceContext);
	}

	/**
	* Caches the result competion in the entity cache if it is enabled.
	*
	* @param resultCompetion the result competion
	*/
	public static void cacheResult(
		vn.gt.dao.result.model.ResultCompetion resultCompetion) {
		getPersistence().cacheResult(resultCompetion);
	}

	/**
	* Caches the result competions in the entity cache if it is enabled.
	*
	* @param resultCompetions the result competions
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.result.model.ResultCompetion> resultCompetions) {
		getPersistence().cacheResult(resultCompetions);
	}

	/**
	* Creates a new result competion with the primary key. Does not add the result competion to the database.
	*
	* @param id the primary key for the new result competion
	* @return the new result competion
	*/
	public static vn.gt.dao.result.model.ResultCompetion create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the result competion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result competion
	* @return the result competion that was removed
	* @throws vn.gt.dao.result.NoSuchResultCompetionException if a result competion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCompetionException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.result.model.ResultCompetion updateImpl(
		vn.gt.dao.result.model.ResultCompetion resultCompetion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(resultCompetion, merge);
	}

	/**
	* Returns the result competion with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultCompetionException} if it could not be found.
	*
	* @param id the primary key of the result competion
	* @return the result competion
	* @throws vn.gt.dao.result.NoSuchResultCompetionException if a result competion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCompetionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the result competion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the result competion
	* @return the result competion, or <code>null</code> if a result competion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the result competion where requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultCompetionException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching result competion
	* @throws vn.gt.dao.result.NoSuchResultCompetionException if a matching result competion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCompetionException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns the result competion where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching result competion, or <code>null</code> if a matching result competion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRequestCode(requestCode);
	}

	/**
	* Returns the result competion where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result competion, or <code>null</code> if a matching result competion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode(requestCode, retrieveFromCache);
	}

	/**
	* Returns all the result competions where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result competions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultCompetion> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the result competions where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result competions
	* @param end the upper bound of the range of result competions (not inclusive)
	* @return the range of matching result competions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultCompetion> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the result competions where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result competions
	* @param end the upper bound of the range of result competions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result competions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultCompetion> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first result competion in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result competion
	* @throws vn.gt.dao.result.NoSuchResultCompetionException if a matching result competion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCompetionException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last result competion in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result competion
	* @throws vn.gt.dao.result.NoSuchResultCompetionException if a matching result competion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCompetionException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the result competions before and after the current result competion in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result competion
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result competion
	* @throws vn.gt.dao.result.NoSuchResultCompetionException if a result competion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultCompetion[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCompetionException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns all the result competions.
	*
	* @return the result competions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultCompetion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the result competions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result competions
	* @param end the upper bound of the range of result competions (not inclusive)
	* @return the range of result competions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultCompetion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the result competions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result competions
	* @param end the upper bound of the range of result competions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result competions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultCompetion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the result competion where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCompetionException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Removes all the result competions where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAndDocumentYear(documentName, documentYear);
	}

	/**
	* Removes all the result competions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of result competions where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching result competions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns the number of result competions where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result competions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of result competions.
	*
	* @return the number of result competions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ResultCompetionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ResultCompetionPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.result.service.ClpSerializer.getServletContextName(),
					ResultCompetionPersistence.class.getName());

			ReferenceRegistry.registerReference(ResultCompetionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ResultCompetionPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ResultCompetionUtil.class,
			"_persistence");
	}

	private static ResultCompetionPersistence _persistence;
}