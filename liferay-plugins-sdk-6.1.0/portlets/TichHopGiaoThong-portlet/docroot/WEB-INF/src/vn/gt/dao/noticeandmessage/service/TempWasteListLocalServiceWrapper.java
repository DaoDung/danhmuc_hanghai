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
 * This class is a wrapper for {@link TempWasteListLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempWasteListLocalService
 * @generated
 */
public class TempWasteListLocalServiceWrapper
	implements TempWasteListLocalService,
		ServiceWrapper<TempWasteListLocalService> {
	public TempWasteListLocalServiceWrapper(
		TempWasteListLocalService tempWasteListLocalService) {
		_tempWasteListLocalService = tempWasteListLocalService;
	}

	/**
	* Adds the temp waste list to the database. Also notifies the appropriate model listeners.
	*
	* @param tempWasteList the temp waste list
	* @return the temp waste list that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempWasteList addTempWasteList(
		vn.gt.dao.noticeandmessage.model.TempWasteList tempWasteList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempWasteListLocalService.addTempWasteList(tempWasteList);
	}

	/**
	* Creates a new temp waste list with the primary key. Does not add the temp waste list to the database.
	*
	* @param id the primary key for the new temp waste list
	* @return the new temp waste list
	*/
	public vn.gt.dao.noticeandmessage.model.TempWasteList createTempWasteList(
		long id) {
		return _tempWasteListLocalService.createTempWasteList(id);
	}

	/**
	* Deletes the temp waste list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp waste list
	* @throws PortalException if a temp waste list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempWasteList(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempWasteListLocalService.deleteTempWasteList(id);
	}

	/**
	* Deletes the temp waste list from the database. Also notifies the appropriate model listeners.
	*
	* @param tempWasteList the temp waste list
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempWasteList(
		vn.gt.dao.noticeandmessage.model.TempWasteList tempWasteList)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempWasteListLocalService.deleteTempWasteList(tempWasteList);
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
		return _tempWasteListLocalService.dynamicQuery(dynamicQuery);
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
		return _tempWasteListLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _tempWasteListLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tempWasteListLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.TempWasteList fetchTempWasteList(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempWasteListLocalService.fetchTempWasteList(id);
	}

	/**
	* Returns the temp waste list with the primary key.
	*
	* @param id the primary key of the temp waste list
	* @return the temp waste list
	* @throws PortalException if a temp waste list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempWasteList getTempWasteList(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempWasteListLocalService.getTempWasteList(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempWasteListLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp waste lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp waste lists
	* @param end the upper bound of the range of temp waste lists (not inclusive)
	* @return the range of temp waste lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempWasteList> getTempWasteLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempWasteListLocalService.getTempWasteLists(start, end);
	}

	/**
	* Returns the number of temp waste lists.
	*
	* @return the number of temp waste lists
	* @throws SystemException if a system exception occurred
	*/
	public int getTempWasteListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempWasteListLocalService.getTempWasteListsCount();
	}

	/**
	* Updates the temp waste list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempWasteList the temp waste list
	* @return the temp waste list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempWasteList updateTempWasteList(
		vn.gt.dao.noticeandmessage.model.TempWasteList tempWasteList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempWasteListLocalService.updateTempWasteList(tempWasteList);
	}

	/**
	* Updates the temp waste list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempWasteList the temp waste list
	* @param merge whether to merge the temp waste list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp waste list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempWasteList updateTempWasteList(
		vn.gt.dao.noticeandmessage.model.TempWasteList tempWasteList,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempWasteListLocalService.updateTempWasteList(tempWasteList,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempWasteListLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempWasteListLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempWasteList> getWasteLists(
		java.lang.String requestCode) {
		return _tempWasteListLocalService.getWasteLists(requestCode);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempWasteList> getWasteLists(
		long documentName, int documentYear) {
		return _tempWasteListLocalService.getWasteLists(documentName,
			documentYear);
	}

	public vn.gt.dao.noticeandmessage.model.TempWasteList getWasteList(
		java.lang.String requestCode, java.lang.String typeCode) {
		return _tempWasteListLocalService.getWasteList(requestCode, typeCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempWasteListLocalService getWrappedTempWasteListLocalService() {
		return _tempWasteListLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempWasteListLocalService(
		TempWasteListLocalService tempWasteListLocalService) {
		_tempWasteListLocalService = tempWasteListLocalService;
	}

	public TempWasteListLocalService getWrappedService() {
		return _tempWasteListLocalService;
	}

	public void setWrappedService(
		TempWasteListLocalService tempWasteListLocalService) {
		_tempWasteListLocalService = tempWasteListLocalService;
	}

	private TempWasteListLocalService _tempWasteListLocalService;
}