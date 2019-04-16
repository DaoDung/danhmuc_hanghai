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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.noticeandmessage.model.InterfaceRequest;

import java.util.List;

/**
 * The persistence utility for the interface request service. This utility wraps {@link InterfaceRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see InterfaceRequestPersistence
 * @see InterfaceRequestPersistenceImpl
 * @generated
 */
public class InterfaceRequestUtil {
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
	public static void clearCache(InterfaceRequest interfaceRequest) {
		getPersistence().clearCache(interfaceRequest);
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
	public static List<InterfaceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InterfaceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InterfaceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static InterfaceRequest update(InterfaceRequest interfaceRequest,
		boolean merge) throws SystemException {
		return getPersistence().update(interfaceRequest, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static InterfaceRequest update(InterfaceRequest interfaceRequest,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(interfaceRequest, merge, serviceContext);
	}

	/**
	* Caches the interface request in the entity cache if it is enabled.
	*
	* @param interfaceRequest the interface request
	*/
	public static void cacheResult(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest) {
		getPersistence().cacheResult(interfaceRequest);
	}

	/**
	* Caches the interface requests in the entity cache if it is enabled.
	*
	* @param interfaceRequests the interface requests
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> interfaceRequests) {
		getPersistence().cacheResult(interfaceRequests);
	}

	/**
	* Creates a new interface request with the primary key. Does not add the interface request to the database.
	*
	* @param id the primary key for the new interface request
	* @return the new interface request
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the interface request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the interface request
	* @return the interface request that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest updateImpl(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(interfaceRequest, merge);
	}

	/**
	* Returns the interface request with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	*
	* @param id the primary key of the interface request
	* @return the interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the interface request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the interface request
	* @return the interface request, or <code>null</code> if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the interface request where requestCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns the interface request where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRequestCode(requestCode);
	}

	/**
	* Returns the interface request where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode(requestCode, retrieveFromCache);
	}

	/**
	* Returns all the interface requests where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrganizationCode(organizationCode);
	}

	/**
	* Returns a range of all the interface requests where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param organizationCode the organization code
	* @param start the lower bound of the range of interface requests
	* @param end the upper bound of the range of interface requests (not inclusive)
	* @return the range of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganizationCode(organizationCode, start, end);
	}

	/**
	* Returns an ordered range of all the interface requests where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param organizationCode the organization code
	* @param start the lower bound of the range of interface requests
	* @param end the upper bound of the range of interface requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganizationCode(organizationCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first interface request in the ordered set where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest findByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence()
				   .findByOrganizationCode_First(organizationCode,
			orderByComparator);
	}

	/**
	* Returns the last interface request in the ordered set where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest findByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence()
				   .findByOrganizationCode_Last(organizationCode,
			orderByComparator);
	}

	/**
	* Returns the interface requests before and after the current interface request in the ordered set where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current interface request
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest[] findByOrganizationCode_PrevAndNext(
		long id, java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence()
				   .findByOrganizationCode_PrevAndNext(id, organizationCode,
			orderByComparator);
	}

	/**
	* Returns all the interface requests where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByLocCode(
		java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocCode(locCode);
	}

	/**
	* Returns a range of all the interface requests where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param start the lower bound of the range of interface requests
	* @param end the upper bound of the range of interface requests (not inclusive)
	* @return the range of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByLocCode(
		java.lang.String locCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocCode(locCode, start, end);
	}

	/**
	* Returns an ordered range of all the interface requests where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param start the lower bound of the range of interface requests
	* @param end the upper bound of the range of interface requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByLocCode(
		java.lang.String locCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLocCode(locCode, start, end, orderByComparator);
	}

	/**
	* Returns the first interface request in the ordered set where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest findByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence().findByLocCode_First(locCode, orderByComparator);
	}

	/**
	* Returns the last interface request in the ordered set where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest findByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence().findByLocCode_Last(locCode, orderByComparator);
	}

	/**
	* Returns the interface requests before and after the current interface request in the ordered set where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current interface request
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence()
				   .findByLocCode_PrevAndNext(id, locCode, orderByComparator);
	}

	/**
	* Returns the interface request where documentNameRef = &#63; and businessType = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @return the matching interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest findByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		return getPersistence()
				   .findByF_BY_documentNameRef(documentNameRef, businessType);
	}

	/**
	* Returns the interface request where documentNameRef = &#63; and businessType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_BY_documentNameRef(documentNameRef, businessType);
	}

	/**
	* Returns the interface request where documentNameRef = &#63; and businessType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_BY_documentNameRef(documentNameRef, businessType,
			retrieveFromCache);
	}

	/**
	* Returns all the interface requests.
	*
	* @return the interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the interface requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of interface requests
	* @param end the upper bound of the range of interface requests (not inclusive)
	* @return the range of interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the interface requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of interface requests
	* @param end the upper bound of the range of interface requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the interface request where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Removes all the interface requests where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOrganizationCode(organizationCode);
	}

	/**
	* Removes all the interface requests where locCode = &#63; from the database.
	*
	* @param locCode the loc code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLocCode(locCode);
	}

	/**
	* Removes the interface request where documentNameRef = &#63; and businessType = &#63; from the database.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException {
		getPersistence()
			.removeByF_BY_documentNameRef(documentNameRef, businessType);
	}

	/**
	* Removes all the interface requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of interface requests where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns the number of interface requests where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOrganizationCode(organizationCode);
	}

	/**
	* Returns the number of interface requests where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the number of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLocCode(locCode);
	}

	/**
	* Returns the number of interface requests where documentNameRef = &#63; and businessType = &#63;.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @return the number of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_BY_documentNameRef(documentNameRef, businessType);
	}

	/**
	* Returns the number of interface requests.
	*
	* @return the number of interface requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InterfaceRequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InterfaceRequestPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					InterfaceRequestPersistence.class.getName());

			ReferenceRegistry.registerReference(InterfaceRequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(InterfaceRequestPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(InterfaceRequestUtil.class,
			"_persistence");
	}

	private static InterfaceRequestPersistence _persistence;
}