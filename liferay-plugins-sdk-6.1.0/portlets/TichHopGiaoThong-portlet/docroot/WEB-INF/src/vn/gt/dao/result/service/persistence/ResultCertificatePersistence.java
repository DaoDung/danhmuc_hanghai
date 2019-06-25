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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.result.model.ResultCertificate;

/**
 * The persistence interface for the result certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultCertificatePersistenceImpl
 * @see ResultCertificateUtil
 * @generated
 */
public interface ResultCertificatePersistence extends BasePersistence<ResultCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResultCertificateUtil} to access the result certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the result certificate in the entity cache if it is enabled.
	*
	* @param resultCertificate the result certificate
	*/
	public void cacheResult(
		vn.gt.dao.result.model.ResultCertificate resultCertificate);

	/**
	* Caches the result certificates in the entity cache if it is enabled.
	*
	* @param resultCertificates the result certificates
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.result.model.ResultCertificate> resultCertificates);

	/**
	* Creates a new result certificate with the primary key. Does not add the result certificate to the database.
	*
	* @param id the primary key for the new result certificate
	* @return the new result certificate
	*/
	public vn.gt.dao.result.model.ResultCertificate create(long id);

	/**
	* Removes the result certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate that was removed
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	public vn.gt.dao.result.model.ResultCertificate updateImpl(
		vn.gt.dao.result.model.ResultCertificate resultCertificate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result certificate with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultCertificateException} if it could not be found.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the result certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate, or <code>null</code> if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the result certificates where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result certificate
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @return the matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByDocumentNameAnddocumentYearAndMaritimeCode_First(
		long documentName, int documentYear, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByDocumentNameAnddocumentYearAndMaritimeCode_Last(
		long documentName, int documentYear, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result certificate
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate[] findByDocumentNameAnddocumentYearAndMaritimeCode_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @return the matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByDocumentNameAnddocumentYearAndCertificateCode_First(
		long documentName, int documentYear, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the last result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByDocumentNameAnddocumentYearAndCertificateCode_Last(
		long documentName, int documentYear, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the result certificates before and after the current result certificate in the ordered set where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result certificate
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate[] findByDocumentNameAnddocumentYearAndCertificateCode_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the result certificate where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and certificateNo = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultCertificateException} if it could not be found.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param certificateNo the certificate no
	* @return the matching result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByF_BY4(
		long documentName, int documentYear, java.lang.String certificateCode,
		java.lang.String certificateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the result certificate where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and certificateNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param certificateNo the certificate no
	* @return the matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate fetchByF_BY4(
		long documentName, int documentYear, java.lang.String certificateCode,
		java.lang.String certificateNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result certificate where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and certificateNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param certificateNo the certificate no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate fetchByF_BY4(
		long documentName, int documentYear, java.lang.String certificateCode,
		java.lang.String certificateNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result certificate where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and comment = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultCertificateException} if it could not be found.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param comment the comment
	* @return the matching result certificate
	* @throws vn.gt.dao.result.NoSuchResultCertificateException if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate findByCrewNameAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode,
		java.lang.String comment)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Returns the result certificate where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and comment = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param comment the comment
	* @return the matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate fetchByCrewNameAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode,
		java.lang.String comment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result certificate where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and comment = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param comment the comment
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result certificate, or <code>null</code> if a matching result certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate fetchByCrewNameAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode,
		java.lang.String comment, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the result certificates.
	*
	* @return the result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @return the range of result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result certificates
	* @param end the upper bound of the range of result certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the result certificates where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the result certificate where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and certificateNo = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param certificateNo the certificate no
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_BY4(long documentName, int documentYear,
		java.lang.String certificateCode, java.lang.String certificateNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Removes the result certificate where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and comment = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param comment the comment
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCrewNameAndCertificateCode(long documentName,
		int documentYear, java.lang.String certificateCode,
		java.lang.String comment)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultCertificateException;

	/**
	* Removes all the result certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result certificates where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result certificates where documentName = &#63; and documentYear = &#63; and maritimeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param maritimeCode the maritime code
	* @return the number of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @return the number of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAnddocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and certificateNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param certificateNo the certificate no
	* @return the number of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_BY4(long documentName, int documentYear,
		java.lang.String certificateCode, java.lang.String certificateNo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result certificates where documentName = &#63; and documentYear = &#63; and certificateCode = &#63; and comment = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param certificateCode the certificate code
	* @param comment the comment
	* @return the number of matching result certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countByCrewNameAndCertificateCode(long documentName,
		int documentYear, java.lang.String certificateCode,
		java.lang.String comment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result certificates.
	*
	* @return the number of result certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}