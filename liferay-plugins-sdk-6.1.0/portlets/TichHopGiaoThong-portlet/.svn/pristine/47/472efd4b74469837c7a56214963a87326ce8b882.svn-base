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

package vn.gt.dao.danhmucgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the dm g t ship position local service. This utility wraps {@link vn.gt.dao.danhmucgt.service.impl.DmGTShipPositionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmGTShipPositionLocalService
 * @see vn.gt.dao.danhmucgt.service.base.DmGTShipPositionLocalServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.impl.DmGTShipPositionLocalServiceImpl
 * @generated
 */
public class DmGTShipPositionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmucgt.service.impl.DmGTShipPositionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm g t ship position to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGTShipPosition the dm g t ship position
	* @return the dm g t ship position that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition addDmGTShipPosition(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmGTShipPosition(dmGTShipPosition);
	}

	/**
	* Creates a new dm g t ship position with the primary key. Does not add the dm g t ship position to the database.
	*
	* @param id the primary key for the new dm g t ship position
	* @return the new dm g t ship position
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition createDmGTShipPosition(
		long id) {
		return getService().createDmGTShipPosition(id);
	}

	/**
	* Deletes the dm g t ship position with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t ship position
	* @throws PortalException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmGTShipPosition(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmGTShipPosition(id);
	}

	/**
	* Deletes the dm g t ship position from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGTShipPosition the dm g t ship position
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmGTShipPosition(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmGTShipPosition(dmGTShipPosition);
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

	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition fetchDmGTShipPosition(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmGTShipPosition(id);
	}

	/**
	* Returns the dm g t ship position with the primary key.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position
	* @throws PortalException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition getDmGTShipPosition(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGTShipPosition(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm g t ship positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @return the range of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> getDmGTShipPositions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGTShipPositions(start, end);
	}

	/**
	* Returns the number of dm g t ship positions.
	*
	* @return the number of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmGTShipPositionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGTShipPositionsCount();
	}

	/**
	* Updates the dm g t ship position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGTShipPosition the dm g t ship position
	* @return the dm g t ship position that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition updateDmGTShipPosition(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmGTShipPosition(dmGTShipPosition);
	}

	/**
	* Updates the dm g t ship position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGTShipPosition the dm g t ship position
	* @param merge whether to merge the dm g t ship position with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm g t ship position that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition updateDmGTShipPosition(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmGTShipPosition(dmGTShipPosition, merge);
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

	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode) {
		return getService().findByPositionCode(positionCode);
	}

	public static int countByPositionCode(java.lang.String positionCode) {
		return getService().countByPositionCode(positionCode);
	}

	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition getByPositionCode(
		java.lang.String positionCode) {
		return getService().getByPositionCode(positionCode);
	}

	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByRoleAndThuTuc(
		java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByRoleAndThuTuc(positionCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmGTShipPositionLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmGTShipPositionLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmGTShipPositionLocalService.class.getName(),
					portletClassLoader);

			_service = new DmGTShipPositionLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmGTShipPositionLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmGTShipPositionLocalService.class);
		}

		return _service;
	}

	public void setService(DmGTShipPositionLocalService service) {
		MethodCache.remove(DmGTShipPositionLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmGTShipPositionLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmGTShipPositionLocalService.class);
	}

	private static DmGTShipPositionLocalService _service;
}