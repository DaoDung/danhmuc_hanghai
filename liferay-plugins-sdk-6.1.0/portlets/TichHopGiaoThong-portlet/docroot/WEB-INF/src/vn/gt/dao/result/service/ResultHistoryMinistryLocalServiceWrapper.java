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
 * This class is a wrapper for {@link ResultHistoryMinistryLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       ResultHistoryMinistryLocalService
 * @generated
 */
public class ResultHistoryMinistryLocalServiceWrapper
	implements ResultHistoryMinistryLocalService,
		ServiceWrapper<ResultHistoryMinistryLocalService> {
	public ResultHistoryMinistryLocalServiceWrapper(
		ResultHistoryMinistryLocalService resultHistoryMinistryLocalService) {
		_resultHistoryMinistryLocalService = resultHistoryMinistryLocalService;
	}

	/**
	* Adds the result history ministry to the database. Also notifies the appropriate model listeners.
	*
	* @param resultHistoryMinistry the result history ministry
	* @return the result history ministry that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultHistoryMinistry addResultHistoryMinistry(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultHistoryMinistryLocalService.addResultHistoryMinistry(resultHistoryMinistry);
	}

	/**
	* Creates a new result history ministry with the primary key. Does not add the result history ministry to the database.
	*
	* @param id the primary key for the new result history ministry
	* @return the new result history ministry
	*/
	public vn.gt.dao.result.model.ResultHistoryMinistry createResultHistoryMinistry(
		long id) {
		return _resultHistoryMinistryLocalService.createResultHistoryMinistry(id);
	}

	/**
	* Deletes the result history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result history ministry
	* @throws PortalException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResultHistoryMinistry(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resultHistoryMinistryLocalService.deleteResultHistoryMinistry(id);
	}

	/**
	* Deletes the result history ministry from the database. Also notifies the appropriate model listeners.
	*
	* @param resultHistoryMinistry the result history ministry
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResultHistoryMinistry(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultHistoryMinistryLocalService.deleteResultHistoryMinistry(resultHistoryMinistry);
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
		return _resultHistoryMinistryLocalService.dynamicQuery(dynamicQuery);
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
		return _resultHistoryMinistryLocalService.dynamicQuery(dynamicQuery,
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
		return _resultHistoryMinistryLocalService.dynamicQuery(dynamicQuery,
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
		return _resultHistoryMinistryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.result.model.ResultHistoryMinistry fetchResultHistoryMinistry(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _resultHistoryMinistryLocalService.fetchResultHistoryMinistry(id);
	}

	/**
	* Returns the result history ministry with the primary key.
	*
	* @param id the primary key of the result history ministry
	* @return the result history ministry
	* @throws PortalException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultHistoryMinistry getResultHistoryMinistry(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultHistoryMinistryLocalService.getResultHistoryMinistry(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultHistoryMinistryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the result history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> getResultHistoryMinistries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultHistoryMinistryLocalService.getResultHistoryMinistries(start,
			end);
	}

	/**
	* Returns the number of result history ministries.
	*
	* @return the number of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public int getResultHistoryMinistriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultHistoryMinistryLocalService.getResultHistoryMinistriesCount();
	}

	/**
	* Updates the result history ministry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultHistoryMinistry the result history ministry
	* @return the result history ministry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultHistoryMinistry updateResultHistoryMinistry(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultHistoryMinistryLocalService.updateResultHistoryMinistry(resultHistoryMinistry);
	}

	/**
	* Updates the result history ministry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultHistoryMinistry the result history ministry
	* @param merge whether to merge the result history ministry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the result history ministry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultHistoryMinistry updateResultHistoryMinistry(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultHistoryMinistryLocalService.updateResultHistoryMinistry(resultHistoryMinistry,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _resultHistoryMinistryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_resultHistoryMinistryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.result.model.ResultHistoryMinistry findByRequestCode(
		java.lang.String requestCode) {
		return _resultHistoryMinistryLocalService.findByRequestCode(requestCode);
	}

	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		int documentName, int documentYear) {
		return _resultHistoryMinistryLocalService.findByDocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode) {
		return _resultHistoryMinistryLocalService.findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode);
	}

	/**
	* Returns all the result history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode) {
		return _resultHistoryMinistryLocalService.findByMinistryCode(ministryCode);
	}

	public java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findDistinctMinistryCode(
		long documentName, int documentYear) {
		return _resultHistoryMinistryLocalService.findDistinctMinistryCode(documentName,
			documentYear);
	}

	public vn.gt.dao.result.model.ResultHistoryMinistry findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		java.lang.String businessTypeCode) {
		return _resultHistoryMinistryLocalService.findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(documentName,
			documentYear, ministryCode, businessTypeCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ResultHistoryMinistryLocalService getWrappedResultHistoryMinistryLocalService() {
		return _resultHistoryMinistryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedResultHistoryMinistryLocalService(
		ResultHistoryMinistryLocalService resultHistoryMinistryLocalService) {
		_resultHistoryMinistryLocalService = resultHistoryMinistryLocalService;
	}

	public ResultHistoryMinistryLocalService getWrappedService() {
		return _resultHistoryMinistryLocalService;
	}

	public void setWrappedService(
		ResultHistoryMinistryLocalService resultHistoryMinistryLocalService) {
		_resultHistoryMinistryLocalService = resultHistoryMinistryLocalService;
	}

	private ResultHistoryMinistryLocalService _resultHistoryMinistryLocalService;
}