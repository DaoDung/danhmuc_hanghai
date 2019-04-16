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
 * This class is a wrapper for {@link TempDangerousGoodsItemsLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       TempDangerousGoodsItemsLocalService
 * @generated
 */
public class TempDangerousGoodsItemsLocalServiceWrapper
	implements TempDangerousGoodsItemsLocalService,
		ServiceWrapper<TempDangerousGoodsItemsLocalService> {
	public TempDangerousGoodsItemsLocalServiceWrapper(
		TempDangerousGoodsItemsLocalService tempDangerousGoodsItemsLocalService) {
		_tempDangerousGoodsItemsLocalService = tempDangerousGoodsItemsLocalService;
	}

	/**
	* Adds the temp dangerous goods items to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsItems the temp dangerous goods items
	* @return the temp dangerous goods items that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems addTempDangerousGoodsItems(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems tempDangerousGoodsItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.addTempDangerousGoodsItems(tempDangerousGoodsItems);
	}

	/**
	* Creates a new temp dangerous goods items with the primary key. Does not add the temp dangerous goods items to the database.
	*
	* @param id the primary key for the new temp dangerous goods items
	* @return the new temp dangerous goods items
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems createTempDangerousGoodsItems(
		long id) {
		return _tempDangerousGoodsItemsLocalService.createTempDangerousGoodsItems(id);
	}

	/**
	* Deletes the temp dangerous goods items with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp dangerous goods items
	* @throws PortalException if a temp dangerous goods items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDangerousGoodsItems(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tempDangerousGoodsItemsLocalService.deleteTempDangerousGoodsItems(id);
	}

	/**
	* Deletes the temp dangerous goods items from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsItems the temp dangerous goods items
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTempDangerousGoodsItems(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems tempDangerousGoodsItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDangerousGoodsItemsLocalService.deleteTempDangerousGoodsItems(tempDangerousGoodsItems);
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
		return _tempDangerousGoodsItemsLocalService.dynamicQuery(dynamicQuery);
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
		return _tempDangerousGoodsItemsLocalService.dynamicQuery(dynamicQuery,
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
		return _tempDangerousGoodsItemsLocalService.dynamicQuery(dynamicQuery,
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
		return _tempDangerousGoodsItemsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems fetchTempDangerousGoodsItems(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.fetchTempDangerousGoodsItems(id);
	}

	/**
	* Returns the temp dangerous goods items with the primary key.
	*
	* @param id the primary key of the temp dangerous goods items
	* @return the temp dangerous goods items
	* @throws PortalException if a temp dangerous goods items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems getTempDangerousGoodsItems(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.getTempDangerousGoodsItems(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp dangerous goods itemses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp dangerous goods itemses
	* @param end the upper bound of the range of temp dangerous goods itemses (not inclusive)
	* @return the range of temp dangerous goods itemses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems> getTempDangerousGoodsItemses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.getTempDangerousGoodsItemses(start,
			end);
	}

	/**
	* Returns the number of temp dangerous goods itemses.
	*
	* @return the number of temp dangerous goods itemses
	* @throws SystemException if a system exception occurred
	*/
	public int getTempDangerousGoodsItemsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.getTempDangerousGoodsItemsesCount();
	}

	/**
	* Updates the temp dangerous goods items in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsItems the temp dangerous goods items
	* @return the temp dangerous goods items that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems updateTempDangerousGoodsItems(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems tempDangerousGoodsItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.updateTempDangerousGoodsItems(tempDangerousGoodsItems);
	}

	/**
	* Updates the temp dangerous goods items in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDangerousGoodsItems the temp dangerous goods items
	* @param merge whether to merge the temp dangerous goods items with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the temp dangerous goods items that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems updateTempDangerousGoodsItems(
		vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems tempDangerousGoodsItems,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.updateTempDangerousGoodsItems(tempDangerousGoodsItems,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tempDangerousGoodsItemsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempDangerousGoodsItemsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDangerousGoodsItemsLocalService.findByRequestCode(requestCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempDangerousGoodsItemsLocalService getWrappedTempDangerousGoodsItemsLocalService() {
		return _tempDangerousGoodsItemsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempDangerousGoodsItemsLocalService(
		TempDangerousGoodsItemsLocalService tempDangerousGoodsItemsLocalService) {
		_tempDangerousGoodsItemsLocalService = tempDangerousGoodsItemsLocalService;
	}

	public TempDangerousGoodsItemsLocalService getWrappedService() {
		return _tempDangerousGoodsItemsLocalService;
	}

	public void setWrappedService(
		TempDangerousGoodsItemsLocalService tempDangerousGoodsItemsLocalService) {
		_tempDangerousGoodsItemsLocalService = tempDangerousGoodsItemsLocalService;
	}

	private TempDangerousGoodsItemsLocalService _tempDangerousGoodsItemsLocalService;
}