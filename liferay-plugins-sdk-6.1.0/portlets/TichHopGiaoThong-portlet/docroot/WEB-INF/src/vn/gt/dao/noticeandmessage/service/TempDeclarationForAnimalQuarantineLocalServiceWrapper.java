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
 * This class is a wrapper for {@link TempDeclarationForAnimalQuarantineLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempDeclarationForAnimalQuarantineLocalService
 * @generated
 */
public class TempDeclarationForAnimalQuarantineLocalServiceWrapper
	implements TempDeclarationForAnimalQuarantineLocalService,
		ServiceWrapper<TempDeclarationForAnimalQuarantineLocalService> {
	public TempDeclarationForAnimalQuarantineLocalServiceWrapper(
		TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService) {
		_tempDeclarationForAnimalQuarantineLocalService = tempDeclarationForAnimalQuarantineLocalService;
	}

	/**
	* Adds the temp declaration for animal quarantine to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine addTempDeclarationForAnimalQuarantine(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.addTempDeclarationForAnimalQuarantine(tempDeclarationForAnimalQuarantine);
	}

	/**
	* Creates a new temp declaration for animal quarantine with the primary key. Does not add the temp declaration for animal quarantine to the database.
	*
	* @param id the primary key for the new temp declaration for animal quarantine
	* @return the new temp declaration for animal quarantine
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine createTempDeclarationForAnimalQuarantine(
		long id) {
		return _tempDeclarationForAnimalQuarantineLocalService.createTempDeclarationForAnimalQuarantine(id);
	}

	/**
	* Deletes the temp declaration for animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp declaration for animal quarantine
	* @throws PortalException if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDeclarationForAnimalQuarantine(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempDeclarationForAnimalQuarantineLocalService.deleteTempDeclarationForAnimalQuarantine(id);
	}

	/**
	* Deletes the temp declaration for animal quarantine from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDeclarationForAnimalQuarantine(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDeclarationForAnimalQuarantineLocalService.deleteTempDeclarationForAnimalQuarantine(tempDeclarationForAnimalQuarantine);
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
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQuery(dynamicQuery);
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
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQuery(dynamicQuery,
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
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQuery(dynamicQuery,
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
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine fetchTempDeclarationForAnimalQuarantine(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.fetchTempDeclarationForAnimalQuarantine(id);
	}

	/**
	* Returns the temp declaration for animal quarantine with the primary key.
	*
	* @param id the primary key of the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine
	* @throws PortalException if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine getTempDeclarationForAnimalQuarantine(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.getTempDeclarationForAnimalQuarantine(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp declaration for animal quarantines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp declaration for animal quarantines
	* @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	* @return the range of temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine> getTempDeclarationForAnimalQuarantines(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.getTempDeclarationForAnimalQuarantines(start,
			end);
	}

	/**
	* Returns the number of temp declaration for animal quarantines.
	*
	* @return the number of temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public int getTempDeclarationForAnimalQuarantinesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.getTempDeclarationForAnimalQuarantinesCount();
	}

	/**
	* Updates the temp declaration for animal quarantine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine updateTempDeclarationForAnimalQuarantine(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.updateTempDeclarationForAnimalQuarantine(tempDeclarationForAnimalQuarantine);
	}

	/**
	* Updates the temp declaration for animal quarantine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	* @param merge whether to merge the temp declaration for animal quarantine with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp declaration for animal quarantine that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine updateTempDeclarationForAnimalQuarantine(
		vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.updateTempDeclarationForAnimalQuarantine(tempDeclarationForAnimalQuarantine,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempDeclarationForAnimalQuarantineLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempDeclarationForAnimalQuarantineLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* Returns all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return _tempDeclarationForAnimalQuarantineLocalService.findBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState) {
		return _tempDeclarationForAnimalQuarantineLocalService.findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the number of temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return _tempDeclarationForAnimalQuarantineLocalService.countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.findByRequestCode(requestCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempDeclarationForAnimalQuarantineLocalService getWrappedTempDeclarationForAnimalQuarantineLocalService() {
		return _tempDeclarationForAnimalQuarantineLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempDeclarationForAnimalQuarantineLocalService(
		TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService) {
		_tempDeclarationForAnimalQuarantineLocalService = tempDeclarationForAnimalQuarantineLocalService;
	}

	public TempDeclarationForAnimalQuarantineLocalService getWrappedService() {
		return _tempDeclarationForAnimalQuarantineLocalService;
	}

	public void setWrappedService(
		TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService) {
		_tempDeclarationForAnimalQuarantineLocalService = tempDeclarationForAnimalQuarantineLocalService;
	}

	private TempDeclarationForAnimalQuarantineLocalService _tempDeclarationForAnimalQuarantineLocalService;
}