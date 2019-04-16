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

package vn.gt.dao.noticeandmessage.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link IssuePortClearanceLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       IssuePortClearanceLocalService
 * @generated
 */
public class IssuePortClearanceLocalServiceWrapper
	implements IssuePortClearanceLocalService,
		ServiceWrapper<IssuePortClearanceLocalService> {
	public IssuePortClearanceLocalServiceWrapper(
		IssuePortClearanceLocalService issuePortClearanceLocalService) {
		_issuePortClearanceLocalService = issuePortClearanceLocalService;
	}

	/**
	* Adds the issue port clearance to the database. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @return the issue port clearance that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.IssuePortClearance addIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.addIssuePortClearance(issuePortClearance);
	}

	/**
	* Creates a new issue port clearance with the primary key. Does not add the issue port clearance to the database.
	*
	* @param id the primary key for the new issue port clearance
	* @return the new issue port clearance
	*/
	public vn.gt.dao.noticeandmessage.model.IssuePortClearance createIssuePortClearance(
		long id) {
		return _issuePortClearanceLocalService.createIssuePortClearance(id);
	}

	/**
	* Deletes the issue port clearance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue port clearance
	* @throws PortalException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteIssuePortClearance(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_issuePortClearanceLocalService.deleteIssuePortClearance(id);
	}

	/**
	* Deletes the issue port clearance from the database. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @throws SystemException if a system exception occurred
	*/
	public void deleteIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		_issuePortClearanceLocalService.deleteIssuePortClearance(issuePortClearance);
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
		return _issuePortClearanceLocalService.dynamicQuery(dynamicQuery);
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
		return _issuePortClearanceLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
		return _issuePortClearanceLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _issuePortClearanceLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance fetchIssuePortClearance(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.fetchIssuePortClearance(id);
	}

	/**
	* Returns the issue port clearance with the primary key.
	*
	* @param id the primary key of the issue port clearance
	* @return the issue port clearance
	* @throws PortalException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.IssuePortClearance getIssuePortClearance(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.getIssuePortClearance(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue port clearances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @return the range of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> getIssuePortClearances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.getIssuePortClearances(start, end);
	}

	/**
	* Returns the number of issue port clearances.
	*
	* @return the number of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public int getIssuePortClearancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.getIssuePortClearancesCount();
	}

	/**
	* Updates the issue port clearance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @return the issue port clearance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.IssuePortClearance updateIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.updateIssuePortClearance(issuePortClearance);
	}

	/**
	* Updates the issue port clearance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @param merge whether to merge the issue port clearance with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the issue port clearance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.IssuePortClearance updateIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.updateIssuePortClearance(issuePortClearance,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _issuePortClearanceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_issuePortClearanceLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		return _issuePortClearanceLocalService.findIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState) {
		return _issuePortClearanceLocalService.findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	public int countByDocumentYearAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.countByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByRequestCode(
		java.lang.String requestCode) {
		return _issuePortClearanceLocalService.findIssuePortClearanceByRequestCode(requestCode);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findLastestIssuePortClearanceByPortNameAndCallSign(
		java.lang.String nameOfShip, java.lang.String callSign) {
		return _issuePortClearanceLocalService.findLastestIssuePortClearanceByPortNameAndCallSign(nameOfShip,
			callSign);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findLatestCertificateOfIssuePortClearance(
		java.lang.String nameOfShip, java.lang.String callSign,
		java.lang.String certificateNo) {
		return _issuePortClearanceLocalService.findLatestCertificateOfIssuePortClearance(nameOfShip,
			callSign, certificateNo);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findByRequestCode(
		java.lang.String requestCode) {
		return _issuePortClearanceLocalService.findByRequestCode(requestCode);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance getByRequestCode(
		java.lang.String requestCode) {
		return _issuePortClearanceLocalService.getByRequestCode(requestCode);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		return _issuePortClearanceLocalService.findIssuePortClearanceInfo(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber, start, end);
	}

	public int countIssuePortClearanceInfo(java.lang.String requestState,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipDateFrom, java.lang.String shipDateTo,
		java.lang.String certificateNumber) {
		return _issuePortClearanceLocalService.countIssuePortClearanceInfo(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		return _issuePortClearanceLocalService.findIssuePortClearanceInfoByCertificateNumber(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber, start, end);
	}

	public int countIssuePortClearanceInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber) {
		return _issuePortClearanceLocalService.countIssuePortClearanceInfoByCertificateNumber(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear, java.lang.String orderByColumn,
		boolean ascOrdesc) {
		return _issuePortClearanceLocalService.findByDocumentYearAndDocumentYearOrderByColumn(documentName,
			documentYear, orderByColumn, ascOrdesc);
	}

	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) {
		return _issuePortClearanceLocalService.countByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public java.lang.String capGiayPhepSo(java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issuePortClearanceLocalService.capGiayPhepSo(maritimeReference);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findByF_LAST_numberPortClearance(
		long documentName, int documentYear,
		java.lang.String numberPortClearance) {
		return _issuePortClearanceLocalService.findByF_LAST_numberPortClearance(documentName,
			documentYear, numberPortClearance);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public IssuePortClearanceLocalService getWrappedIssuePortClearanceLocalService() {
		return _issuePortClearanceLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedIssuePortClearanceLocalService(
		IssuePortClearanceLocalService issuePortClearanceLocalService) {
		_issuePortClearanceLocalService = issuePortClearanceLocalService;
	}

	public IssuePortClearanceLocalService getWrappedService() {
		return _issuePortClearanceLocalService;
	}

	public void setWrappedService(
		IssuePortClearanceLocalService issuePortClearanceLocalService) {
		_issuePortClearanceLocalService = issuePortClearanceLocalService;
	}

	private IssuePortClearanceLocalService _issuePortClearanceLocalService;
}