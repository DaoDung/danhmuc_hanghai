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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmCertificateLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmCertificateLocalService
 * @generated
 */
public class DmCertificateLocalServiceWrapper
	implements DmCertificateLocalService,
		ServiceWrapper<DmCertificateLocalService> {
	public DmCertificateLocalServiceWrapper(
		DmCertificateLocalService dmCertificateLocalService) {
		_dmCertificateLocalService = dmCertificateLocalService;
	}

	/**
	* Adds the dm certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param dmCertificate the dm certificate
	* @return the dm certificate that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmCertificate addDmCertificate(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.addDmCertificate(dmCertificate);
	}

	/**
	* Creates a new dm certificate with the primary key. Does not add the dm certificate to the database.
	*
	* @param id the primary key for the new dm certificate
	* @return the new dm certificate
	*/
	public vn.gt.dao.danhmucgt.model.DmCertificate createDmCertificate(long id) {
		return _dmCertificateLocalService.createDmCertificate(id);
	}

	/**
	* Deletes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm certificate
	* @throws PortalException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmCertificate(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmCertificateLocalService.deleteDmCertificate(id);
	}

	/**
	* Deletes the dm certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param dmCertificate the dm certificate
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmCertificate(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmCertificateLocalService.deleteDmCertificate(dmCertificate);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmucgt.model.DmCertificate fetchDmCertificate(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.fetchDmCertificate(id);
	}

	/**
	* Returns the dm certificate with the primary key.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate
	* @throws PortalException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmCertificate getDmCertificate(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.getDmCertificate(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> getDmCertificates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.getDmCertificates(start, end);
	}

	/**
	* Returns the number of dm certificates.
	*
	* @return the number of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public int getDmCertificatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.getDmCertificatesCount();
	}

	/**
	* Updates the dm certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmCertificate the dm certificate
	* @return the dm certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmCertificate updateDmCertificate(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.updateDmCertificate(dmCertificate);
	}

	/**
	* Updates the dm certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmCertificate the dm certificate
	* @param merge whether to merge the dm certificate with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmCertificate updateDmCertificate(
		vn.gt.dao.danhmucgt.model.DmCertificate dmCertificate, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.updateDmCertificate(dmCertificate,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmCertificateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmCertificateLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode) {
		return _dmCertificateLocalService.findByCertificateCode(certificateCode);
	}

	public java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findByCertificateCodeAndcertificateName(
		java.lang.String certificateCode, java.lang.String certificateName) {
		return _dmCertificateLocalService.findByCertificateCodeAndcertificateName(certificateCode,
			certificateName);
	}

	public java.util.List<vn.gt.dao.danhmucgt.model.DmCertificate> findBylCode(
		java.lang.String lCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmCertificateLocalService.findBylCode(lCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmCertificateLocalService getWrappedDmCertificateLocalService() {
		return _dmCertificateLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmCertificateLocalService(
		DmCertificateLocalService dmCertificateLocalService) {
		_dmCertificateLocalService = dmCertificateLocalService;
	}

	public DmCertificateLocalService getWrappedService() {
		return _dmCertificateLocalService;
	}

	public void setWrappedService(
		DmCertificateLocalService dmCertificateLocalService) {
		_dmCertificateLocalService = dmCertificateLocalService;
	}

	private DmCertificateLocalService _dmCertificateLocalService;
}