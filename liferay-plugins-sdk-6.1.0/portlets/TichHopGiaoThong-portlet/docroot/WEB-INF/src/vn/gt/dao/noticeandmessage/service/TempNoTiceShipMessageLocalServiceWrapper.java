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
 * This class is a wrapper for {@link TempNoTiceShipMessageLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempNoTiceShipMessageLocalService
 * @generated
 */
public class TempNoTiceShipMessageLocalServiceWrapper
	implements TempNoTiceShipMessageLocalService,
		ServiceWrapper<TempNoTiceShipMessageLocalService> {
	public TempNoTiceShipMessageLocalServiceWrapper(
		TempNoTiceShipMessageLocalService tempNoTiceShipMessageLocalService) {
		_tempNoTiceShipMessageLocalService = tempNoTiceShipMessageLocalService;
	}

	/**
	* Adds the temp no tice ship message to the database. Also notifies the appropriate model listeners.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	* @return the temp no tice ship message that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage addTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.addTempNoTiceShipMessage(tempNoTiceShipMessage);
	}

	/**
	* Creates a new temp no tice ship message with the primary key. Does not add the temp no tice ship message to the database.
	*
	* @param id the primary key for the new temp no tice ship message
	* @return the new temp no tice ship message
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage createTempNoTiceShipMessage(
		long id) {
		return _tempNoTiceShipMessageLocalService.createTempNoTiceShipMessage(id);
	}

	/**
	* Deletes the temp no tice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp no tice ship message
	* @throws PortalException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempNoTiceShipMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempNoTiceShipMessageLocalService.deleteTempNoTiceShipMessage(id);
	}

	/**
	* Deletes the temp no tice ship message from the database. Also notifies the appropriate model listeners.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempNoTiceShipMessageLocalService.deleteTempNoTiceShipMessage(tempNoTiceShipMessage);
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
		return _tempNoTiceShipMessageLocalService.dynamicQuery(dynamicQuery);
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
		return _tempNoTiceShipMessageLocalService.dynamicQuery(dynamicQuery,
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
		return _tempNoTiceShipMessageLocalService.dynamicQuery(dynamicQuery,
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
		return _tempNoTiceShipMessageLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage fetchTempNoTiceShipMessage(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.fetchTempNoTiceShipMessage(id);
	}

	/**
	* Returns the temp no tice ship message with the primary key.
	*
	* @param id the primary key of the temp no tice ship message
	* @return the temp no tice ship message
	* @throws PortalException if a temp no tice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getTempNoTiceShipMessage(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.getTempNoTiceShipMessage(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp no tice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp no tice ship messages
	* @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	* @return the range of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> getTempNoTiceShipMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.getTempNoTiceShipMessages(start,
			end);
	}

	/**
	* Returns the number of temp no tice ship messages.
	*
	* @return the number of temp no tice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public int getTempNoTiceShipMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.getTempNoTiceShipMessagesCount();
	}

	/**
	* Updates the temp no tice ship message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	* @return the temp no tice ship message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage updateTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.updateTempNoTiceShipMessage(tempNoTiceShipMessage);
	}

	/**
	* Updates the temp no tice ship message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempNoTiceShipMessage the temp no tice ship message
	* @param merge whether to merge the temp no tice ship message with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp no tice ship message that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage updateTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.updateTempNoTiceShipMessage(tempNoTiceShipMessage,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempNoTiceShipMessageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempNoTiceShipMessageLocalService.setBeanIdentifier(beanIdentifier);
	}

	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return _tempNoTiceShipMessageLocalService.countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode) {
		return _tempNoTiceShipMessageLocalService.findByRequestCode(requestCode);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return _tempNoTiceShipMessageLocalService.findBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageByRequestCode(
		java.lang.String requestCode) {
		return _tempNoTiceShipMessageLocalService.findTempNoTiceShipMessageByRequestCode(requestCode);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageXbByRequestCode(
		java.lang.String requestCode) {
		return _tempNoTiceShipMessageLocalService.findTempNoTiceShipMessageXbByRequestCode(requestCode);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageTbByRequestCode(
		java.lang.String requestCode) {
		return _tempNoTiceShipMessageLocalService.findTempNoTiceShipMessageTbByRequestCode(requestCode);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(
		long documentName, int documentYear, java.lang.String noticeShipType,
		java.lang.String orderByColumn, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempNoTiceShipMessageLocalService.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(documentName,
			documentYear, noticeShipType, orderByColumn, ascOrdesc);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getXacBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear) {
		return _tempNoTiceShipMessageLocalService.getXacBaoLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getThongBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear) {
		return _tempNoTiceShipMessageLocalService.getThongBaoLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempNoTiceShipMessageLocalService getWrappedTempNoTiceShipMessageLocalService() {
		return _tempNoTiceShipMessageLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempNoTiceShipMessageLocalService(
		TempNoTiceShipMessageLocalService tempNoTiceShipMessageLocalService) {
		_tempNoTiceShipMessageLocalService = tempNoTiceShipMessageLocalService;
	}

	public TempNoTiceShipMessageLocalService getWrappedService() {
		return _tempNoTiceShipMessageLocalService;
	}

	public void setWrappedService(
		TempNoTiceShipMessageLocalService tempNoTiceShipMessageLocalService) {
		_tempNoTiceShipMessageLocalService = tempNoTiceShipMessageLocalService;
	}

	private TempNoTiceShipMessageLocalService _tempNoTiceShipMessageLocalService;
}