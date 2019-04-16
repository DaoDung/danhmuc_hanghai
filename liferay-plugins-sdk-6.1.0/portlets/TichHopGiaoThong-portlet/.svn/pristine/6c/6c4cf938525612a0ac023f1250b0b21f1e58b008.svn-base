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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.noticeandmessage.model.InterfaceRequest;

/**
 * The persistence interface for the interface request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see InterfaceRequestPersistenceImpl
 * @see InterfaceRequestUtil
 * @generated
 */
public interface InterfaceRequestPersistence extends BasePersistence<InterfaceRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InterfaceRequestUtil} to access the interface request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the interface request in the entity cache if it is enabled.
	*
	* @param interfaceRequest the interface request
	*/
	public void cacheResult(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest);

	/**
	* Caches the interface requests in the entity cache if it is enabled.
	*
	* @param interfaceRequests the interface requests
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> interfaceRequests);

	/**
	* Creates a new interface request with the primary key. Does not add the interface request to the database.
	*
	* @param id the primary key for the new interface request
	* @return the new interface request
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest create(long id);

	/**
	* Removes the interface request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the interface request
	* @return the interface request that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest updateImpl(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the interface request with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	*
	* @param id the primary key of the interface request
	* @return the interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

	/**
	* Returns the interface request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the interface request
	* @return the interface request, or <code>null</code> if a interface request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the interface request where requestCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

	/**
	* Returns the interface request where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the interface request where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the interface requests where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

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
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

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
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest[] findByOrganizationCode_PrevAndNext(
		long id, java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

	/**
	* Returns all the interface requests where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByLocCode(
		java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByLocCode(
		java.lang.String locCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findByLocCode(
		java.lang.String locCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

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
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

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
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

	/**
	* Returns the interface request where documentNameRef = &#63; and businessType = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException} if it could not be found.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @return the matching interface request
	* @throws vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

	/**
	* Returns the interface request where documentNameRef = &#63; and businessType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the interface request where documentNameRef = &#63; and businessType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching interface request, or <code>null</code> if a matching interface request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the interface requests.
	*
	* @return the interface requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the interface request where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

	/**
	* Removes all the interface requests where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the interface requests where locCode = &#63; from the database.
	*
	* @param locCode the loc code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the interface request where documentNameRef = &#63; and businessType = &#63; from the database.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_BY_documentNameRef(java.lang.String documentNameRef,
		java.lang.String businessType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchInterfaceRequestException;

	/**
	* Removes all the interface requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of interface requests where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of interface requests where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of interface requests where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the number of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of interface requests where documentNameRef = &#63; and businessType = &#63;.
	*
	* @param documentNameRef the document name ref
	* @param businessType the business type
	* @return the number of matching interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_BY_documentNameRef(java.lang.String documentNameRef,
		java.lang.String businessType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of interface requests.
	*
	* @return the number of interface requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}