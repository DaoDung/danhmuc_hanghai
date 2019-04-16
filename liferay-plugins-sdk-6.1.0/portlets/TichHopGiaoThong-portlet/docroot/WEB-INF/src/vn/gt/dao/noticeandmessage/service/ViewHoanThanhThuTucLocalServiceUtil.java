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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the view hoan thanh thu tuc local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.ViewHoanThanhThuTucLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see ViewHoanThanhThuTucLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.ViewHoanThanhThuTucLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.ViewHoanThanhThuTucLocalServiceImpl
 * @generated
 */
public class ViewHoanThanhThuTucLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.ViewHoanThanhThuTucLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the view hoan thanh thu tuc to the database. Also notifies the appropriate model listeners.
	*
	* @param viewHoanThanhThuTuc the view hoan thanh thu tuc
	* @return the view hoan thanh thu tuc that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc addViewHoanThanhThuTuc(
		vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc viewHoanThanhThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addViewHoanThanhThuTuc(viewHoanThanhThuTuc);
	}

	/**
	* Creates a new view hoan thanh thu tuc with the primary key. Does not add the view hoan thanh thu tuc to the database.
	*
	* @param CVHH the primary key for the new view hoan thanh thu tuc
	* @return the new view hoan thanh thu tuc
	*/
	public static vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc createViewHoanThanhThuTuc(
		java.lang.String CVHH) {
		return getService().createViewHoanThanhThuTuc(CVHH);
	}

	/**
	* Deletes the view hoan thanh thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CVHH the primary key of the view hoan thanh thu tuc
	* @throws PortalException if a view hoan thanh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteViewHoanThanhThuTuc(java.lang.String CVHH)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteViewHoanThanhThuTuc(CVHH);
	}

	/**
	* Deletes the view hoan thanh thu tuc from the database. Also notifies the appropriate model listeners.
	*
	* @param viewHoanThanhThuTuc the view hoan thanh thu tuc
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteViewHoanThanhThuTuc(
		vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc viewHoanThanhThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteViewHoanThanhThuTuc(viewHoanThanhThuTuc);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc fetchViewHoanThanhThuTuc(
		java.lang.String CVHH)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchViewHoanThanhThuTuc(CVHH);
	}

	/**
	* Returns the view hoan thanh thu tuc with the primary key.
	*
	* @param CVHH the primary key of the view hoan thanh thu tuc
	* @return the view hoan thanh thu tuc
	* @throws PortalException if a view hoan thanh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc getViewHoanThanhThuTuc(
		java.lang.String CVHH)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getViewHoanThanhThuTuc(CVHH);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc> getViewHoanThanhThuTucs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getViewHoanThanhThuTucs(start, end);
	}

	/**
	* Returns the number of view hoan thanh thu tucs.
	*
	* @return the number of view hoan thanh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int getViewHoanThanhThuTucsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getViewHoanThanhThuTucsCount();
	}

	/**
	* Updates the view hoan thanh thu tuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viewHoanThanhThuTuc the view hoan thanh thu tuc
	* @return the view hoan thanh thu tuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc updateViewHoanThanhThuTuc(
		vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc viewHoanThanhThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateViewHoanThanhThuTuc(viewHoanThanhThuTuc);
	}

	/**
	* Updates the view hoan thanh thu tuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viewHoanThanhThuTuc the view hoan thanh thu tuc
	* @param merge whether to merge the view hoan thanh thu tuc with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the view hoan thanh thu tuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc updateViewHoanThanhThuTuc(
		vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc viewHoanThanhThuTuc,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateViewHoanThanhThuTuc(viewHoanThanhThuTuc, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc> findByKetQuaHoanThanhThuTuc(
		java.lang.String maritimeCode, java.lang.String reportDateFrom,
		java.lang.String reportDateTo) {
		return getService()
				   .findByKetQuaHoanThanhThuTuc(maritimeCode, reportDateFrom,
			reportDateTo);
	}

	public static void clearService() {
		_service = null;
	}

	public static ViewHoanThanhThuTucLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ViewHoanThanhThuTucLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					ViewHoanThanhThuTucLocalService.class.getName(),
					portletClassLoader);

			_service = new ViewHoanThanhThuTucLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(ViewHoanThanhThuTucLocalServiceUtil.class,
				"_service");
			MethodCache.remove(ViewHoanThanhThuTucLocalService.class);
		}

		return _service;
	}

	public void setService(ViewHoanThanhThuTucLocalService service) {
		MethodCache.remove(ViewHoanThanhThuTucLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(ViewHoanThanhThuTucLocalServiceUtil.class,
			"_service");
		MethodCache.remove(ViewHoanThanhThuTucLocalService.class);
	}

	private static ViewHoanThanhThuTucLocalService _service;
}