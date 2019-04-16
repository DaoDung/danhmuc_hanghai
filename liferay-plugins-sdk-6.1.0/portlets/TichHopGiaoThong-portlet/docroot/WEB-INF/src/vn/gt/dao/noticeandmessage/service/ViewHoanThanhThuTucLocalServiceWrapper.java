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
 * This class is a wrapper for {@link ViewHoanThanhThuTucLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       ViewHoanThanhThuTucLocalService
 * @generated
 */
public class ViewHoanThanhThuTucLocalServiceWrapper
	implements ViewHoanThanhThuTucLocalService,
		ServiceWrapper<ViewHoanThanhThuTucLocalService> {
	public ViewHoanThanhThuTucLocalServiceWrapper(
		ViewHoanThanhThuTucLocalService viewHoanThanhThuTucLocalService) {
		_viewHoanThanhThuTucLocalService = viewHoanThanhThuTucLocalService;
	}

	/**
	* Adds the view hoan thanh thu tuc to the database. Also notifies the appropriate model listeners.
	*
	* @param viewHoanThanhThuTuc the view hoan thanh thu tuc
	* @return the view hoan thanh thu tuc that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc addViewHoanThanhThuTuc(
		vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc viewHoanThanhThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewHoanThanhThuTucLocalService.addViewHoanThanhThuTuc(viewHoanThanhThuTuc);
	}

	/**
	* Creates a new view hoan thanh thu tuc with the primary key. Does not add the view hoan thanh thu tuc to the database.
	*
	* @param CVHH the primary key for the new view hoan thanh thu tuc
	* @return the new view hoan thanh thu tuc
	*/
	public vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc createViewHoanThanhThuTuc(
		java.lang.String CVHH) {
		return _viewHoanThanhThuTucLocalService.createViewHoanThanhThuTuc(CVHH);
	}

	/**
	* Deletes the view hoan thanh thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CVHH the primary key of the view hoan thanh thu tuc
	* @throws PortalException if a view hoan thanh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteViewHoanThanhThuTuc(java.lang.String CVHH)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_viewHoanThanhThuTucLocalService.deleteViewHoanThanhThuTuc(CVHH);
	}

	/**
	* Deletes the view hoan thanh thu tuc from the database. Also notifies the appropriate model listeners.
	*
	* @param viewHoanThanhThuTuc the view hoan thanh thu tuc
	* @throws SystemException if a system exception occurred
	*/
	public void deleteViewHoanThanhThuTuc(
		vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc viewHoanThanhThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		_viewHoanThanhThuTucLocalService.deleteViewHoanThanhThuTuc(viewHoanThanhThuTuc);
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
		return _viewHoanThanhThuTucLocalService.dynamicQuery(dynamicQuery);
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
		return _viewHoanThanhThuTucLocalService.dynamicQuery(dynamicQuery,
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
		return _viewHoanThanhThuTucLocalService.dynamicQuery(dynamicQuery,
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
		return _viewHoanThanhThuTucLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc fetchViewHoanThanhThuTuc(
		java.lang.String CVHH)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewHoanThanhThuTucLocalService.fetchViewHoanThanhThuTuc(CVHH);
	}

	/**
	* Returns the view hoan thanh thu tuc with the primary key.
	*
	* @param CVHH the primary key of the view hoan thanh thu tuc
	* @return the view hoan thanh thu tuc
	* @throws PortalException if a view hoan thanh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc getViewHoanThanhThuTuc(
		java.lang.String CVHH)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewHoanThanhThuTucLocalService.getViewHoanThanhThuTuc(CVHH);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewHoanThanhThuTucLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the view hoan thanh thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of view hoan thanh thu tucs
	* @param end the upper bound of the range of view hoan thanh thu tucs (not inclusive)
	* @return the range of view hoan thanh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc> getViewHoanThanhThuTucs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewHoanThanhThuTucLocalService.getViewHoanThanhThuTucs(start,
			end);
	}

	/**
	* Returns the number of view hoan thanh thu tucs.
	*
	* @return the number of view hoan thanh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public int getViewHoanThanhThuTucsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewHoanThanhThuTucLocalService.getViewHoanThanhThuTucsCount();
	}

	/**
	* Updates the view hoan thanh thu tuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viewHoanThanhThuTuc the view hoan thanh thu tuc
	* @return the view hoan thanh thu tuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc updateViewHoanThanhThuTuc(
		vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc viewHoanThanhThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewHoanThanhThuTucLocalService.updateViewHoanThanhThuTuc(viewHoanThanhThuTuc);
	}

	/**
	* Updates the view hoan thanh thu tuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viewHoanThanhThuTuc the view hoan thanh thu tuc
	* @param merge whether to merge the view hoan thanh thu tuc with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the view hoan thanh thu tuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc updateViewHoanThanhThuTuc(
		vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc viewHoanThanhThuTuc,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewHoanThanhThuTucLocalService.updateViewHoanThanhThuTuc(viewHoanThanhThuTuc,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _viewHoanThanhThuTucLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_viewHoanThanhThuTucLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc> findByKetQuaHoanThanhThuTuc(
		java.lang.String maritimeCode, java.lang.String reportDateFrom,
		java.lang.String reportDateTo) {
		return _viewHoanThanhThuTucLocalService.findByKetQuaHoanThanhThuTuc(maritimeCode,
			reportDateFrom, reportDateTo);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ViewHoanThanhThuTucLocalService getWrappedViewHoanThanhThuTucLocalService() {
		return _viewHoanThanhThuTucLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedViewHoanThanhThuTucLocalService(
		ViewHoanThanhThuTucLocalService viewHoanThanhThuTucLocalService) {
		_viewHoanThanhThuTucLocalService = viewHoanThanhThuTucLocalService;
	}

	public ViewHoanThanhThuTucLocalService getWrappedService() {
		return _viewHoanThanhThuTucLocalService;
	}

	public void setWrappedService(
		ViewHoanThanhThuTucLocalService viewHoanThanhThuTucLocalService) {
		_viewHoanThanhThuTucLocalService = viewHoanThanhThuTucLocalService;
	}

	private ViewHoanThanhThuTucLocalService _viewHoanThanhThuTucLocalService;
}