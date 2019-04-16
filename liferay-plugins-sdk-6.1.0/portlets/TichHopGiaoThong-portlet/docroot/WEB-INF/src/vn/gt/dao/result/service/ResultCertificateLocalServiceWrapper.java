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

package vn.gt.dao.result.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ResultCertificateLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       ResultCertificateLocalService
 * @generated
 */
public class ResultCertificateLocalServiceWrapper
	implements ResultCertificateLocalService,
		ServiceWrapper<ResultCertificateLocalService> {
	public ResultCertificateLocalServiceWrapper(
		ResultCertificateLocalService resultCertificateLocalService) {
		_resultCertificateLocalService = resultCertificateLocalService;
	}

	/**
	* Adds the result certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param resultCertificate the result certificate
	* @return the result certificate that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate addResultCertificate(
		vn.gt.dao.result.model.ResultCertificate resultCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.addResultCertificate(resultCertificate);
	}

	/**
	* Creates a new result certificate with the primary key. Does not add the result certificate to the database.
	*
	* @param id the primary key for the new result certificate
	* @return the new result certificate
	*/
	public vn.gt.dao.result.model.ResultCertificate createResultCertificate(
		long id) {
		return _resultCertificateLocalService.createResultCertificate(id);
	}

	/**
	* Deletes the result certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result certificate
	* @throws PortalException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResultCertificate(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resultCertificateLocalService.deleteResultCertificate(id);
	}

	/**
	* Deletes the result certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param resultCertificate the result certificate
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResultCertificate(
		vn.gt.dao.result.model.ResultCertificate resultCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultCertificateLocalService.deleteResultCertificate(resultCertificate);
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
		return _resultCertificateLocalService.dynamicQuery(dynamicQuery);
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
		return _resultCertificateLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
		return _resultCertificateLocalService.dynamicQuery(dynamicQuery, start,
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
		return _resultCertificateLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.result.model.ResultCertificate fetchResultCertificate(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.fetchResultCertificate(id);
	}

	/**
	* Returns the result certificate with the primary key.
	*
	* @param id the primary key of the result certificate
	* @return the result certificate
	* @throws PortalException if a result certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate getResultCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.getResultCertificate(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<vn.gt.dao.result.model.ResultCertificate> getResultCertificates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.getResultCertificates(start, end);
	}

	/**
	* Returns the number of result certificates.
	*
	* @return the number of result certificates
	* @throws SystemException if a system exception occurred
	*/
	public int getResultCertificatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.getResultCertificatesCount();
	}

	/**
	* Updates the result certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultCertificate the result certificate
	* @return the result certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate updateResultCertificate(
		vn.gt.dao.result.model.ResultCertificate resultCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.updateResultCertificate(resultCertificate);
	}

	/**
	* Updates the result certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultCertificate the result certificate
	* @param merge whether to merge the result certificate with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the result certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultCertificate updateResultCertificate(
		vn.gt.dao.result.model.ResultCertificate resultCertificate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.updateResultCertificate(resultCertificate,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _resultCertificateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_resultCertificateLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return _resultCertificateLocalService.findByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAndDocumentYearAndMaritimeCode(
		long documentName, int documentYear, java.lang.String maritimeCode) {
		return _resultCertificateLocalService.findByDocumentNameAndDocumentYearAndMaritimeCode(documentName,
			documentYear, maritimeCode);
	}

	public java.util.List<vn.gt.dao.result.model.ResultCertificate> findByDocumentNameAndDocumentYearAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode) {
		return _resultCertificateLocalService.findByDocumentNameAndDocumentYearAndCertificateCode(documentName,
			documentYear, certificateCode);
	}

	public vn.gt.dao.result.model.ResultCertificate fetchByF_BY4(
		long documentName, int documentYear, java.lang.String certificateCode,
		java.lang.String certificateNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.fetchByF_BY4(documentName,
			documentYear, certificateCode, certificateNo);
	}

	public vn.gt.dao.result.model.ResultCertificate findByCrewNameAndCertificateCode(
		long documentName, int documentYear, java.lang.String certificateCode,
		java.lang.String crewName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCertificateLocalService.findByCrewNameAndCertificateCode(documentName,
			documentYear, certificateCode, crewName);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ResultCertificateLocalService getWrappedResultCertificateLocalService() {
		return _resultCertificateLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedResultCertificateLocalService(
		ResultCertificateLocalService resultCertificateLocalService) {
		_resultCertificateLocalService = resultCertificateLocalService;
	}

	public ResultCertificateLocalService getWrappedService() {
		return _resultCertificateLocalService;
	}

	public void setWrappedService(
		ResultCertificateLocalService resultCertificateLocalService) {
		_resultCertificateLocalService = resultCertificateLocalService;
	}

	private ResultCertificateLocalService _resultCertificateLocalService;
}