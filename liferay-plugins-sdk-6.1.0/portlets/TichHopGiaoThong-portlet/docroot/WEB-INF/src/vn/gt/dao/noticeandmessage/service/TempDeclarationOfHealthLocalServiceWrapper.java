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
 * This class is a wrapper for {@link TempDeclarationOfHealthLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempDeclarationOfHealthLocalService
 * @generated
 */
public class TempDeclarationOfHealthLocalServiceWrapper
	implements TempDeclarationOfHealthLocalService,
		ServiceWrapper<TempDeclarationOfHealthLocalService> {
	public TempDeclarationOfHealthLocalServiceWrapper(
		TempDeclarationOfHealthLocalService tempDeclarationOfHealthLocalService) {
		_tempDeclarationOfHealthLocalService = tempDeclarationOfHealthLocalService;
	}

	/**
	* Adds the temp declaration of health to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationOfHealth the temp declaration of health
	* @return the temp declaration of health that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth addTempDeclarationOfHealth(
		vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth tempDeclarationOfHealth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationOfHealthLocalService.addTempDeclarationOfHealth(tempDeclarationOfHealth);
	}

	/**
	* Creates a new temp declaration of health with the primary key. Does not add the temp declaration of health to the database.
	*
	* @param id the primary key for the new temp declaration of health
	* @return the new temp declaration of health
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth createTempDeclarationOfHealth(
		long id) {
		return _tempDeclarationOfHealthLocalService.createTempDeclarationOfHealth(id);
	}

	/**
	* Deletes the temp declaration of health with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp declaration of health
	* @throws PortalException if a temp declaration of health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDeclarationOfHealth(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempDeclarationOfHealthLocalService.deleteTempDeclarationOfHealth(id);
	}

	/**
	* Deletes the temp declaration of health from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationOfHealth the temp declaration of health
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDeclarationOfHealth(
		vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth tempDeclarationOfHealth)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDeclarationOfHealthLocalService.deleteTempDeclarationOfHealth(tempDeclarationOfHealth);
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
		return _tempDeclarationOfHealthLocalService.dynamicQuery(dynamicQuery);
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
		return _tempDeclarationOfHealthLocalService.dynamicQuery(dynamicQuery,
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
		return _tempDeclarationOfHealthLocalService.dynamicQuery(dynamicQuery,
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
		return _tempDeclarationOfHealthLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth fetchTempDeclarationOfHealth(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationOfHealthLocalService.fetchTempDeclarationOfHealth(id);
	}

	/**
	* Returns the temp declaration of health with the primary key.
	*
	* @param id the primary key of the temp declaration of health
	* @return the temp declaration of health
	* @throws PortalException if a temp declaration of health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth getTempDeclarationOfHealth(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationOfHealthLocalService.getTempDeclarationOfHealth(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationOfHealthLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp declaration of healths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp declaration of healths
	* @param end the upper bound of the range of temp declaration of healths (not inclusive)
	* @return the range of temp declaration of healths
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> getTempDeclarationOfHealths(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationOfHealthLocalService.getTempDeclarationOfHealths(start,
			end);
	}

	/**
	* Returns the number of temp declaration of healths.
	*
	* @return the number of temp declaration of healths
	* @throws SystemException if a system exception occurred
	*/
	public int getTempDeclarationOfHealthsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationOfHealthLocalService.getTempDeclarationOfHealthsCount();
	}

	/**
	* Updates the temp declaration of health in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationOfHealth the temp declaration of health
	* @return the temp declaration of health that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth updateTempDeclarationOfHealth(
		vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth tempDeclarationOfHealth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationOfHealthLocalService.updateTempDeclarationOfHealth(tempDeclarationOfHealth);
	}

	/**
	* Updates the temp declaration of health in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationOfHealth the temp declaration of health
	* @param merge whether to merge the temp declaration of health with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp declaration of health that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth updateTempDeclarationOfHealth(
		vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth tempDeclarationOfHealth,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationOfHealthLocalService.updateTempDeclarationOfHealth(tempDeclarationOfHealth,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempDeclarationOfHealthLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempDeclarationOfHealthLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState) {
		return _tempDeclarationOfHealthLocalService.findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> findByRequestCode(
		java.lang.String requestCode) {
		return _tempDeclarationOfHealthLocalService.findByRequestCode(requestCode);
	}

	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return _tempDeclarationOfHealthLocalService.countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return _tempDeclarationOfHealthLocalService.findBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return _tempDeclarationOfHealthLocalService.getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return _tempDeclarationOfHealthLocalService.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempDeclarationOfHealthLocalService getWrappedTempDeclarationOfHealthLocalService() {
		return _tempDeclarationOfHealthLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempDeclarationOfHealthLocalService(
		TempDeclarationOfHealthLocalService tempDeclarationOfHealthLocalService) {
		_tempDeclarationOfHealthLocalService = tempDeclarationOfHealthLocalService;
	}

	public TempDeclarationOfHealthLocalService getWrappedService() {
		return _tempDeclarationOfHealthLocalService;
	}

	public void setWrappedService(
		TempDeclarationOfHealthLocalService tempDeclarationOfHealthLocalService) {
		_tempDeclarationOfHealthLocalService = tempDeclarationOfHealthLocalService;
	}

	private TempDeclarationOfHealthLocalService _tempDeclarationOfHealthLocalService;
}