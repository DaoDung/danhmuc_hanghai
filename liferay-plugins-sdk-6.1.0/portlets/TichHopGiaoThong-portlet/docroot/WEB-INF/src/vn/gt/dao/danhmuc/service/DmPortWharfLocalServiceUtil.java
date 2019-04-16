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
 * The utility for the dm port wharf local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmPortWharfLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmPortWharfLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmPortWharfLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmPortWharfLocalServiceImpl
 * @generated
 */
public class DmPortWharfLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmPortWharfLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm port wharf to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortWharf the dm port wharf
	* @return the dm port wharf that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortWharf addDmPortWharf(
		vn.gt.dao.danhmuc.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmPortWharf(dmPortWharf);
	}

	/**
	* Creates a new dm port wharf with the primary key. Does not add the dm port wharf to the database.
	*
	* @param id the primary key for the new dm port wharf
	* @return the new dm port wharf
	*/
	public static vn.gt.dao.danhmuc.model.DmPortWharf createDmPortWharf(int id) {
		return getService().createDmPortWharf(id);
	}

	/**
	* Deletes the dm port wharf with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port wharf
	* @throws PortalException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmPortWharf(id);
	}

	/**
	* Deletes the dm port wharf from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortWharf the dm port wharf
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmPortWharf(
		vn.gt.dao.danhmuc.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmPortWharf(dmPortWharf);
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

	public static vn.gt.dao.danhmuc.model.DmPortWharf fetchDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmPortWharf(id);
	}

	/**
	* Returns the dm port wharf with the primary key.
	*
	* @param id the primary key of the dm port wharf
	* @return the dm port wharf
	* @throws PortalException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortWharf getDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPortWharf(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm port wharfs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @return the range of dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> getDmPortWharfs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPortWharfs(start, end);
	}

	/**
	* Returns the number of dm port wharfs.
	*
	* @return the number of dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmPortWharfsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPortWharfsCount();
	}

	/**
	* Updates the dm port wharf in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortWharf the dm port wharf
	* @return the dm port wharf that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortWharf updateDmPortWharf(
		vn.gt.dao.danhmuc.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmPortWharf(dmPortWharf);
	}

	/**
	* Updates the dm port wharf in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortWharf the dm port wharf
	* @param merge whether to merge the dm port wharf with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm port wharf that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortWharf updateDmPortWharf(
		vn.gt.dao.danhmuc.model.DmPortWharf dmPortWharf, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmPortWharf(dmPortWharf, merge);
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

	public static vn.gt.dao.danhmuc.model.DmPortWharf getByPortWharfCode(
		java.lang.String portWharfCode) {
		return getService().getByPortWharfCode(portWharfCode);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCode(
		java.lang.String portRegionCode) {
		return getService().findByPortRegionCode(portRegionCode);
	}

	/**
	* ascOrdesc:
	* asc = true
	* desc = false
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		boolean ascOrdesc) {
		return getService()
				   .findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(portRegionCode,
			portHarbourCode, ascOrdesc);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortHarbourCodeOrNull(
		java.lang.String portHarbourCode, boolean ascOrdesc) {
		return getService()
				   .findByPortHarbourCodeOrNull(portHarbourCode, ascOrdesc);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCodeOrderPortCode(
		java.lang.String portRegionCode, boolean ascOrdesc) {
		return getService()
				   .findByPortRegionCodeOrderPortCode(portRegionCode, ascOrdesc);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findDanhSachDmPortWharf(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN, boolean ascOrdesc, int start, int end) {
		return getService()
				   .findDanhSachDmPortWharf(portRegionCode, portHarbourCode,
			PortWharfNameVN, ascOrdesc, start, end);
	}

	public static int countDanhSachDmPortWharf(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN) {
		return getService()
				   .countDanhSachDmPortWharf(portRegionCode, portHarbourCode,
			PortWharfNameVN);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findDongBoDmPortWharf(
		java.lang.String MaritimeCode, java.lang.String portRegionCode,
		java.lang.String portHarbourCode, java.lang.String PortWharfNameVN,
		boolean ascOrdesc, int start, int end) {
		return getService()
				   .findDongBoDmPortWharf(MaritimeCode, portRegionCode,
			portHarbourCode, PortWharfNameVN, ascOrdesc, start, end);
	}

	public static int countDongBoDmPortWharf(java.lang.String MaritimeCode,
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN) {
		return getService()
				   .countDongBoDmPortWharf(MaritimeCode, portRegionCode,
			portHarbourCode, PortWharfNameVN);
	}

	public static vn.gt.dao.danhmuc.model.DmPortWharf getFirstPortWharf() {
		return getService().getFirstPortWharf();
	}

	public static vn.gt.dao.danhmuc.model.DmPortWharf getLastPortWharf() {
		return getService().getLastPortWharf();
	}

	public static void clearService() {
		_service = null;
	}

	public static DmPortWharfLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmPortWharfLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmPortWharfLocalService.class.getName(), portletClassLoader);

			_service = new DmPortWharfLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmPortWharfLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmPortWharfLocalService.class);
		}

		return _service;
	}

	public void setService(DmPortWharfLocalService service) {
		MethodCache.remove(DmPortWharfLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmPortWharfLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmPortWharfLocalService.class);
	}

	private static DmPortWharfLocalService _service;
}