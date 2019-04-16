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
 * This class is a wrapper for {@link TempShipSecurityMessageLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempShipSecurityMessageLocalService
 * @generated
 */
public class TempShipSecurityMessageLocalServiceWrapper
	implements TempShipSecurityMessageLocalService,
		ServiceWrapper<TempShipSecurityMessageLocalService> {
	public TempShipSecurityMessageLocalServiceWrapper(
		TempShipSecurityMessageLocalService tempShipSecurityMessageLocalService) {
		_tempShipSecurityMessageLocalService = tempShipSecurityMessageLocalService;
	}

	/**
	* Adds the temp ship security message to the database. Also notifies the appropriate model listeners.
	*
	* @param tempShipSecurityMessage the temp ship security message
	* @return the temp ship security message that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage addTempShipSecurityMessage(
		vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage tempShipSecurityMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.addTempShipSecurityMessage(tempShipSecurityMessage);
	}

	/**
	* Creates a new temp ship security message with the primary key. Does not add the temp ship security message to the database.
	*
	* @param id the primary key for the new temp ship security message
	* @return the new temp ship security message
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage createTempShipSecurityMessage(
		long id) {
		return _tempShipSecurityMessageLocalService.createTempShipSecurityMessage(id);
	}

	/**
	* Deletes the temp ship security message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp ship security message
	* @throws PortalException if a temp ship security message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempShipSecurityMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempShipSecurityMessageLocalService.deleteTempShipSecurityMessage(id);
	}

	/**
	* Deletes the temp ship security message from the database. Also notifies the appropriate model listeners.
	*
	* @param tempShipSecurityMessage the temp ship security message
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempShipSecurityMessage(
		vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage tempShipSecurityMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempShipSecurityMessageLocalService.deleteTempShipSecurityMessage(tempShipSecurityMessage);
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
		return _tempShipSecurityMessageLocalService.dynamicQuery(dynamicQuery);
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
		return _tempShipSecurityMessageLocalService.dynamicQuery(dynamicQuery,
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
		return _tempShipSecurityMessageLocalService.dynamicQuery(dynamicQuery,
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
		return _tempShipSecurityMessageLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage fetchTempShipSecurityMessage(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.fetchTempShipSecurityMessage(id);
	}

	/**
	* Returns the temp ship security message with the primary key.
	*
	* @param id the primary key of the temp ship security message
	* @return the temp ship security message
	* @throws PortalException if a temp ship security message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage getTempShipSecurityMessage(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.getTempShipSecurityMessage(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp ship security messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp ship security messages
	* @param end the upper bound of the range of temp ship security messages (not inclusive)
	* @return the range of temp ship security messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage> getTempShipSecurityMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.getTempShipSecurityMessages(start,
			end);
	}

	/**
	* Returns the number of temp ship security messages.
	*
	* @return the number of temp ship security messages
	* @throws SystemException if a system exception occurred
	*/
	public int getTempShipSecurityMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.getTempShipSecurityMessagesCount();
	}

	/**
	* Updates the temp ship security message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempShipSecurityMessage the temp ship security message
	* @return the temp ship security message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage updateTempShipSecurityMessage(
		vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage tempShipSecurityMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.updateTempShipSecurityMessage(tempShipSecurityMessage);
	}

	/**
	* Updates the temp ship security message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempShipSecurityMessage the temp ship security message
	* @param merge whether to merge the temp ship security message with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp ship security message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage updateTempShipSecurityMessage(
		vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage tempShipSecurityMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.updateTempShipSecurityMessage(tempShipSecurityMessage,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempShipSecurityMessageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempShipSecurityMessageLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState) {
		return _tempShipSecurityMessageLocalService.findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.findByRequestCode(requestCode);
	}

	public vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage getByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.getByRequestCode(requestCode);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.findBydocumentNameAndDocumentYear(documentName,
			documentYear, start, end);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityMessageLocalService.findBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return _tempShipSecurityMessageLocalService.getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return _tempShipSecurityMessageLocalService.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempShipSecurityMessageLocalService getWrappedTempShipSecurityMessageLocalService() {
		return _tempShipSecurityMessageLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempShipSecurityMessageLocalService(
		TempShipSecurityMessageLocalService tempShipSecurityMessageLocalService) {
		_tempShipSecurityMessageLocalService = tempShipSecurityMessageLocalService;
	}

	public TempShipSecurityMessageLocalService getWrappedService() {
		return _tempShipSecurityMessageLocalService;
	}

	public void setWrappedService(
		TempShipSecurityMessageLocalService tempShipSecurityMessageLocalService) {
		_tempShipSecurityMessageLocalService = tempShipSecurityMessageLocalService;
	}

	private TempShipSecurityMessageLocalService _tempShipSecurityMessageLocalService;
}