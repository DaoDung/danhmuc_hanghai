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
 * This class is a wrapper for {@link TempShipStoresDeclarationLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempShipStoresDeclarationLocalService
 * @generated
 */
public class TempShipStoresDeclarationLocalServiceWrapper
	implements TempShipStoresDeclarationLocalService,
		ServiceWrapper<TempShipStoresDeclarationLocalService> {
	public TempShipStoresDeclarationLocalServiceWrapper(
		TempShipStoresDeclarationLocalService tempShipStoresDeclarationLocalService) {
		_tempShipStoresDeclarationLocalService = tempShipStoresDeclarationLocalService;
	}

	/**
	* Adds the temp ship stores declaration to the database. Also notifies the appropriate model listeners.
	*
	* @param tempShipStoresDeclaration the temp ship stores declaration
	* @return the temp ship stores declaration that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration addTempShipStoresDeclaration(
		vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration tempShipStoresDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipStoresDeclarationLocalService.addTempShipStoresDeclaration(tempShipStoresDeclaration);
	}

	/**
	* Creates a new temp ship stores declaration with the primary key. Does not add the temp ship stores declaration to the database.
	*
	* @param id the primary key for the new temp ship stores declaration
	* @return the new temp ship stores declaration
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration createTempShipStoresDeclaration(
		long id) {
		return _tempShipStoresDeclarationLocalService.createTempShipStoresDeclaration(id);
	}

	/**
	* Deletes the temp ship stores declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp ship stores declaration
	* @throws PortalException if a temp ship stores declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempShipStoresDeclaration(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempShipStoresDeclarationLocalService.deleteTempShipStoresDeclaration(id);
	}

	/**
	* Deletes the temp ship stores declaration from the database. Also notifies the appropriate model listeners.
	*
	* @param tempShipStoresDeclaration the temp ship stores declaration
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempShipStoresDeclaration(
		vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration tempShipStoresDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempShipStoresDeclarationLocalService.deleteTempShipStoresDeclaration(tempShipStoresDeclaration);
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
		return _tempShipStoresDeclarationLocalService.dynamicQuery(dynamicQuery);
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
		return _tempShipStoresDeclarationLocalService.dynamicQuery(dynamicQuery,
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
		return _tempShipStoresDeclarationLocalService.dynamicQuery(dynamicQuery,
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
		return _tempShipStoresDeclarationLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration fetchTempShipStoresDeclaration(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipStoresDeclarationLocalService.fetchTempShipStoresDeclaration(id);
	}

	/**
	* Returns the temp ship stores declaration with the primary key.
	*
	* @param id the primary key of the temp ship stores declaration
	* @return the temp ship stores declaration
	* @throws PortalException if a temp ship stores declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration getTempShipStoresDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempShipStoresDeclarationLocalService.getTempShipStoresDeclaration(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempShipStoresDeclarationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp ship stores declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp ship stores declarations
	* @param end the upper bound of the range of temp ship stores declarations (not inclusive)
	* @return the range of temp ship stores declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration> getTempShipStoresDeclarations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipStoresDeclarationLocalService.getTempShipStoresDeclarations(start,
			end);
	}

	/**
	* Returns the number of temp ship stores declarations.
	*
	* @return the number of temp ship stores declarations
	* @throws SystemException if a system exception occurred
	*/
	public int getTempShipStoresDeclarationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipStoresDeclarationLocalService.getTempShipStoresDeclarationsCount();
	}

	/**
	* Updates the temp ship stores declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempShipStoresDeclaration the temp ship stores declaration
	* @return the temp ship stores declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration updateTempShipStoresDeclaration(
		vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration tempShipStoresDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipStoresDeclarationLocalService.updateTempShipStoresDeclaration(tempShipStoresDeclaration);
	}

	/**
	* Updates the temp ship stores declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempShipStoresDeclaration the temp ship stores declaration
	* @param merge whether to merge the temp ship stores declaration with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp ship stores declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration updateTempShipStoresDeclaration(
		vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration tempShipStoresDeclaration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipStoresDeclarationLocalService.updateTempShipStoresDeclaration(tempShipStoresDeclaration,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempShipStoresDeclarationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempShipStoresDeclarationLocalService.setBeanIdentifier(beanIdentifier);
	}

	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return _tempShipStoresDeclarationLocalService.countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return _tempShipStoresDeclarationLocalService.findBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState) {
		return _tempShipStoresDeclarationLocalService.findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration> findByRequestCode(
		java.lang.String requestCode) {
		return _tempShipStoresDeclarationLocalService.findByRequestCode(requestCode);
	}

	public vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration findTempShipStoresDeclarationByRequestCode(
		java.lang.String requestCode) {
		return _tempShipStoresDeclarationLocalService.findTempShipStoresDeclarationByRequestCode(requestCode);
	}

	public vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return _tempShipStoresDeclarationLocalService.getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return _tempShipStoresDeclarationLocalService.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempShipStoresDeclarationLocalService getWrappedTempShipStoresDeclarationLocalService() {
		return _tempShipStoresDeclarationLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempShipStoresDeclarationLocalService(
		TempShipStoresDeclarationLocalService tempShipStoresDeclarationLocalService) {
		_tempShipStoresDeclarationLocalService = tempShipStoresDeclarationLocalService;
	}

	public TempShipStoresDeclarationLocalService getWrappedService() {
		return _tempShipStoresDeclarationLocalService;
	}

	public void setWrappedService(
		TempShipStoresDeclarationLocalService tempShipStoresDeclarationLocalService) {
		_tempShipStoresDeclarationLocalService = tempShipStoresDeclarationLocalService;
	}

	private TempShipStoresDeclarationLocalService _tempShipStoresDeclarationLocalService;
}