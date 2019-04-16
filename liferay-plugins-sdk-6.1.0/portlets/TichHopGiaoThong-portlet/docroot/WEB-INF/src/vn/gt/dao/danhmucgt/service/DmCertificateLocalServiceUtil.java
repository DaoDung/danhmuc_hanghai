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

package vn.gt.dao.danhmucgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the dm certificate local service. This utility wraps {@link vn.gt.dao.danhmucgt.service.impl.DmCertificateLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmCertificateLocalService
 * @see vn.gt.dao.danhmucgt.service.base.DmCertificateLocalServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.impl.DmCertificateLocalServiceImpl
 * @generated
 */
public class DmCertificateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmucgt.service.impl.DmCertificateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param dmCertificate the dm certificate
	* @return the dm certificate that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate addDmCertificate(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmCertificate(dmCertificate);
	}

	/**
	* Creates a new dm certificate with the primary key. Does not add the dm certificate to the database.
	*
	* @param id the primary key for the new dm certificate
	* @return the new dm certificate
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate createDmCertificate(
		long id) {
		return getService().createDmCertificate(id);
	}

	/**
	* Deletes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm certificate
	* @throws PortalException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmCertificate(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmCertificate(id);
	}

	/**
	* Deletes the dm certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param dmCertificate the dm certificate
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmCertificate(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmCertificate(dmCertificate);
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

	public static vn.gt.dao.danhmucgt.model.DmCertificate fetchDmCertificate(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmCertificate(id);
	}

	/**
	* Returns the dm certificate with the primary key.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate
	* @throws PortalException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate getDmCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmCertificate(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> getDmCertificates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmCertificates(start, end);
	}

	/**
	* Returns the number of dm certificates.
	*
	* @return the number of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmCertificatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmCertificatesCount();
	}

	/**
	* Updates the dm certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmCertificate the dm certificate
	* @return the dm certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate updateDmCertificate(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmCertificate(dmCertificate);
	}

	/**
	* Updates the dm certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmCertificate the dm certificate
	* @param merge whether to merge the dm certificate with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmCertificate updateDmCertificate(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmCertificate(dmCertificate, merge);
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

	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode) {
		return getService().findByCertificateCode(certificateCode);
	}

	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCodeAndcertificateName(
		java.lang.String certificateCode, java.lang.String certificateName) {
		return getService()
				   .findByCertificateCodeAndcertificateName(certificateCode,
			certificateName);
	}

	public static java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findBylCode(
		java.lang.String lCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBylCode(lCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmCertificateLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmCertificateLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmCertificateLocalService.class.getName(),
					portletClassLoader);

			_service = new DmCertificateLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmCertificateLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmCertificateLocalService.class);
		}

		return _service;
	}

	public void setService(DmCertificateLocalService service) {
		MethodCache.remove(DmCertificateLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmCertificateLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmCertificateLocalService.class);
	}

	private static DmCertificateLocalService _service;
}