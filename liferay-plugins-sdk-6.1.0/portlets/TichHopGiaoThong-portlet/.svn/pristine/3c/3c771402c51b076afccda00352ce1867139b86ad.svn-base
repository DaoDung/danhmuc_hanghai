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

package vn.gt.dao.danhmuc.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the dm rank rating local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmRankRatingLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmRankRatingLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmRankRatingLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmRankRatingLocalServiceImpl
 * @generated
 */
public class DmRankRatingLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmRankRatingLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm rank rating to the database. Also notifies the appropriate model listeners.
	*
	* @param dmRankRating the dm rank rating
	* @return the dm rank rating that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating addDmRankRating(
		vn.gt.dao.danhmuc.model.DmRankRating dmRankRating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmRankRating(dmRankRating);
	}

	/**
	* Creates a new dm rank rating with the primary key. Does not add the dm rank rating to the database.
	*
	* @param id the primary key for the new dm rank rating
	* @return the new dm rank rating
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating createDmRankRating(
		int id) {
		return getService().createDmRankRating(id);
	}

	/**
	* Deletes the dm rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm rank rating
	* @throws PortalException if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmRankRating(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmRankRating(id);
	}

	/**
	* Deletes the dm rank rating from the database. Also notifies the appropriate model listeners.
	*
	* @param dmRankRating the dm rank rating
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmRankRating(
		vn.gt.dao.danhmuc.model.DmRankRating dmRankRating)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmRankRating(dmRankRating);
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

	public static vn.gt.dao.danhmuc.model.DmRankRating fetchDmRankRating(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmRankRating(id);
	}

	/**
	* Returns the dm rank rating with the primary key.
	*
	* @param id the primary key of the dm rank rating
	* @return the dm rank rating
	* @throws PortalException if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating getDmRankRating(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmRankRating(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm rank ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @return the range of dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmRankRating> getDmRankRatings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmRankRatings(start, end);
	}

	/**
	* Returns the number of dm rank ratings.
	*
	* @return the number of dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmRankRatingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmRankRatingsCount();
	}

	/**
	* Updates the dm rank rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmRankRating the dm rank rating
	* @return the dm rank rating that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating updateDmRankRating(
		vn.gt.dao.danhmuc.model.DmRankRating dmRankRating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmRankRating(dmRankRating);
	}

	/**
	* Updates the dm rank rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmRankRating the dm rank rating
	* @param merge whether to merge the dm rank rating with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm rank rating that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating updateDmRankRating(
		vn.gt.dao.danhmuc.model.DmRankRating dmRankRating, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmRankRating(dmRankRating, merge);
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

	public static vn.gt.dao.danhmuc.model.DmRankRating getByRankCode(
		java.lang.String rankCode) {
		return getService().getByRankCode(rankCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmRankRatingLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmRankRatingLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmRankRatingLocalService.class.getName(), portletClassLoader);

			_service = new DmRankRatingLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmRankRatingLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmRankRatingLocalService.class);
		}

		return _service;
	}

	public void setService(DmRankRatingLocalService service) {
		MethodCache.remove(DmRankRatingLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmRankRatingLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmRankRatingLocalService.class);
	}

	private static DmRankRatingLocalService _service;
}