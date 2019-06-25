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

package vn.gt.dao.danhmucgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.danhmucgt.model.DmCertificate;

import java.util.List;

/**
 * The persistence utility for the dm certificate service. This utility wraps {@link DmCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmCertificatePersistence
 * @see DmCertificatePersistenceImpl
 * @generated
 */
public class DmCertificateUtil {
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
	public static void clearCache(DmCertificate dmCertificate) {
		getPersistence().clearCache(dmCertificate);
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
	public static List<DmCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmCertificate update(DmCertificate dmCertificate,
		boolean merge) throws SystemException {
		return getPersistence().update(dmCertificate, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmCertificate update(DmCertificate dmCertificate,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmCertificate, merge, serviceContext);
	}

	/**
	* Caches the dm certificate in the entity cache if it is enabled.
	*
	* @param dmCertificate the dm certificate
	*/
	public static void cacheResult(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate) {
		getPersistence().cacheResult(dmCertificate);
	}

	/**
	* Caches the dm certificates in the entity cache if it is enabled.
	*
	* @param dmCertificates the dm certificates
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> dmCertificates) {
		getPersistence().cacheResult(dmCertificates);
	}

	/**
	* Creates a new dm certificate with the primary key. Does not add the dm certificate to the database.
	*
	* @param id the primary key for the new dm certificate
	* @return the new dm certificate
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmucgt.model.DmCertificate updateImpl(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmCertificate, merge);
	}

	/**
	* Returns the dm certificate with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmCertificateException} if it could not be found.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate, or <code>null</code> if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm certificates where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @return the matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCertificateCode(certificateCode);
	}

	/**
	* Returns a range of all the dm certificates where certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @return the range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCode(certificateCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm certificates where certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCode(certificateCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByCertificateCode_First(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCode_First(certificateCode,
			orderByComparator);
	}

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByCertificateCode_Last(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCode_Last(certificateCode,
			orderByComparator);
	}

	/**
	* Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm certificate
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate[] findByCertificateCode_PrevAndNext(
		long id, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCode_PrevAndNext(id, certificateCode,
			orderByComparator);
	}

	/**
	* Returns all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @return the matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName(certificateCode,
			certificateName);
	}

	/**
	* Returns a range of all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @return the range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName(certificateCode,
			certificateName, start, end);
	}

	/**
	* Returns an ordered range of all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName(certificateCode,
			certificateName, start, end, orderByComparator);
	}

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByCertificateCodeAndCertificateName_First(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName_First(certificateCode,
			certificateName, orderByComparator);
	}

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByCertificateCodeAndCertificateName_Last(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName_Last(certificateCode,
			certificateName, orderByComparator);
	}

	/**
	* Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm certificate
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate[] findByCertificateCodeAndCertificateName_PrevAndNext(
		long id, java.lang.String certificateCode,
		java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName_PrevAndNext(id,
			certificateCode, certificateName, orderByComparator);
	}

	/**
	* Returns all the dm certificates where certificateCode &gt; &#63;.
	*
	* @param certificateCode the certificate code
	* @return the matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByF_LCODE_GT(
		java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_LCODE_GT(certificateCode);
	}

	/**
	* Returns a range of all the dm certificates where certificateCode &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @return the range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByF_LCODE_GT(
		java.lang.String certificateCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_LCODE_GT(certificateCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm certificates where certificateCode &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByF_LCODE_GT(
		java.lang.String certificateCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_LCODE_GT(certificateCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm certificate in the ordered set where certificateCode &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByF_LCODE_GT_First(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByF_LCODE_GT_First(certificateCode, orderByComparator);
	}

	/**
	* Returns the last dm certificate in the ordered set where certificateCode &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByF_LCODE_GT_Last(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByF_LCODE_GT_Last(certificateCode, orderByComparator);
	}

	/**
	* Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm certificate
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate[] findByF_LCODE_GT_PrevAndNext(
		long id, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByF_LCODE_GT_PrevAndNext(id, certificateCode,
			orderByComparator);
	}

	/**
	* Returns all the dm certificates where certificateCode &lt; &#63;.
	*
	* @param certificateCode the certificate code
	* @return the matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByF_LCODE_LT(
		java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_LCODE_LT(certificateCode);
	}

	/**
	* Returns a range of all the dm certificates where certificateCode &lt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @return the range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByF_LCODE_LT(
		java.lang.String certificateCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_LCODE_LT(certificateCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm certificates where certificateCode &lt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByF_LCODE_LT(
		java.lang.String certificateCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_LCODE_LT(certificateCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm certificate in the ordered set where certificateCode &lt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByF_LCODE_LT_First(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByF_LCODE_LT_First(certificateCode, orderByComparator);
	}

	/**
	* Returns the last dm certificate in the ordered set where certificateCode &lt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate findByF_LCODE_LT_Last(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByF_LCODE_LT_Last(certificateCode, orderByComparator);
	}

	/**
	* Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode &lt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm certificate
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm certificate
	* @throws vn.gt.dao.danhmucgt.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate[] findByF_LCODE_LT_PrevAndNext(
		long id, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmCertificateException {
		return getPersistence()
				   .findByF_LCODE_LT_PrevAndNext(id, certificateCode,
			orderByComparator);
	}

	/**
	* Returns all the dm certificates.
	*
	* @return the dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @return the range of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm certificates where certificateCode = &#63; from the database.
	*
	* @param certificateCode the certificate code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateCode(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCertificateCode(certificateCode);
	}

	/**
	* Removes all the dm certificates where certificateCode = &#63; and certificateName = &#63; from the database.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByCertificateCodeAndCertificateName(certificateCode,
			certificateName);
	}

	/**
	* Removes all the dm certificates where certificateCode &gt; &#63; from the database.
	*
	* @param certificateCode the certificate code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_LCODE_GT(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_LCODE_GT(certificateCode);
	}

	/**
	* Removes all the dm certificates where certificateCode &lt; &#63; from the database.
	*
	* @param certificateCode the certificate code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_LCODE_LT(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_LCODE_LT(certificateCode);
	}

	/**
	* Removes all the dm certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm certificates where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @return the number of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateCode(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCertificateCode(certificateCode);
	}

	/**
	* Returns the number of dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @return the number of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCertificateCodeAndCertificateName(certificateCode,
			certificateName);
	}

	/**
	* Returns the number of dm certificates where certificateCode &gt; &#63;.
	*
	* @param certificateCode the certificate code
	* @return the number of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_LCODE_GT(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_LCODE_GT(certificateCode);
	}

	/**
	* Returns the number of dm certificates where certificateCode &lt; &#63;.
	*
	* @param certificateCode the certificate code
	* @return the number of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_LCODE_LT(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_LCODE_LT(certificateCode);
	}

	/**
	* Returns the number of dm certificates.
	*
	* @return the number of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmCertificatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmCertificatePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmucgt.service.ClpSerializer.getServletContextName(),
					DmCertificatePersistence.class.getName());

			ReferenceRegistry.registerReference(DmCertificateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmCertificatePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmCertificateUtil.class,
			"_persistence");
	}

	private static DmCertificatePersistence _persistence;
}