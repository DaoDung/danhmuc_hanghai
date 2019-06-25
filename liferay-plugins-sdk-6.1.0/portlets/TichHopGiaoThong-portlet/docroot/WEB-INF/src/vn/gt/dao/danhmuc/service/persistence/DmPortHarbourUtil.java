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

package vn.gt.dao.danhmuc.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.danhmuc.model.DmPortHarbour;

import java.util.List;

/**
 * The persistence utility for the dm port harbour service. This utility wraps {@link DmPortHarbourPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmPortHarbourPersistence
 * @see DmPortHarbourPersistenceImpl
 * @generated
 */
public class DmPortHarbourUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DmPortHarbour dmPortHarbour) {
		getPersistence().clearCache(dmPortHarbour);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DmPortHarbour> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmPortHarbour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmPortHarbour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmPortHarbour update(DmPortHarbour dmPortHarbour,
		boolean merge) throws SystemException {
		return getPersistence().update(dmPortHarbour, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmPortHarbour update(DmPortHarbour dmPortHarbour,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmPortHarbour, merge, serviceContext);
	}

	/**
	* Caches the dm port harbour in the entity cache if it is enabled.
	*
	* @param dmPortHarbour the dm port harbour
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour) {
		getPersistence().cacheResult(dmPortHarbour);
	}

	/**
	* Caches the dm port harbours in the entity cache if it is enabled.
	*
	* @param dmPortHarbours the dm port harbours
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> dmPortHarbours) {
		getPersistence().cacheResult(dmPortHarbours);
	}

	/**
	* Creates a new dm port harbour with the primary key. Does not add the dm port harbour to the database.
	*
	* @param id the primary key for the new dm port harbour
	* @return the new dm port harbour
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port harbour
	* @return the dm port harbour that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmPortHarbour updateImpl(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmPortHarbour, merge);
	}

	/**
	* Returns the dm port harbour with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortHarbourException} if it could not be found.
	*
	* @param id the primary key of the dm port harbour
	* @return the dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm port harbour with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port harbour
	* @return the dm port harbour, or <code>null</code> if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm port harbours where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @return the matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns a range of all the dm port harbours where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortHarbourCode(portHarbourCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm port harbours where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortHarbourCode(portHarbourCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour findByPortHarbourCode_First(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortHarbourCode_First(portHarbourCode,
			orderByComparator);
	}

	/**
	* Returns the last dm port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour findByPortHarbourCode_Last(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortHarbourCode_Last(portHarbourCode,
			orderByComparator);
	}

	/**
	* Returns the dm port harbours before and after the current dm port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port harbour
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour[] findByPortHarbourCode_PrevAndNext(
		int id, java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortHarbourCode_PrevAndNext(id, portHarbourCode,
			orderByComparator);
	}

	/**
	* Returns all the dm port harbours where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode);
	}

	/**
	* Returns a range of all the dm port harbours where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm port harbours where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortRegionCode(portRegionCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm port harbour in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortRegionCode_First(portRegionCode, orderByComparator);
	}

	/**
	* Returns the last dm port harbour in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortRegionCode_Last(portRegionCode, orderByComparator);
	}

	/**
	* Returns the dm port harbours before and after the current dm port harbour in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port harbour
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortRegionCode_PrevAndNext(id, portRegionCode,
			orderByComparator);
	}

	/**
	* Returns all the dm port harbours where portRegion = &#63;.
	*
	* @param portRegion the port region
	* @return the matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegion(
		java.lang.String portRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegion(portRegion);
	}

	/**
	* Returns a range of all the dm port harbours where portRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegion the port region
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegion(
		java.lang.String portRegion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegion(portRegion, start, end);
	}

	/**
	* Returns an ordered range of all the dm port harbours where portRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegion the port region
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegion(
		java.lang.String portRegion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortRegion(portRegion, start, end, orderByComparator);
	}

	/**
	* Returns the first dm port harbour in the ordered set where portRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegion the port region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour findByPortRegion_First(
		java.lang.String portRegion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortRegion_First(portRegion, orderByComparator);
	}

	/**
	* Returns the last dm port harbour in the ordered set where portRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegion the port region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a matching dm port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour findByPortRegion_Last(
		java.lang.String portRegion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortRegion_Last(portRegion, orderByComparator);
	}

	/**
	* Returns the dm port harbours before and after the current dm port harbour in the ordered set where portRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port harbour
	* @param portRegion the port region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortHarbourException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour[] findByPortRegion_PrevAndNext(
		int id, java.lang.String portRegion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortHarbourException {
		return getPersistence()
				   .findByPortRegion_PrevAndNext(id, portRegion,
			orderByComparator);
	}

	/**
	* Returns all the dm port harbours.
	*
	* @return the dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm port harbours where portHarbourCode = &#63; from the database.
	*
	* @param portHarbourCode the port harbour code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortHarbourCode(java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortHarbourCode(portHarbourCode);
	}

	/**
	* Removes all the dm port harbours where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortRegionCode(portRegionCode);
	}

	/**
	* Removes all the dm port harbours where portRegion = &#63; from the database.
	*
	* @param portRegion the port region
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortRegion(java.lang.String portRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortRegion(portRegion);
	}

	/**
	* Removes all the dm port harbours from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm port harbours where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @return the number of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortHarbourCode(java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the number of dm port harbours where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortRegionCode(portRegionCode);
	}

	/**
	* Returns the number of dm port harbours where portRegion = &#63;.
	*
	* @param portRegion the port region
	* @return the number of matching dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortRegion(java.lang.String portRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortRegion(portRegion);
	}

	/**
	* Returns the number of dm port harbours.
	*
	* @return the number of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmPortHarbourPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmPortHarbourPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmPortHarbourPersistence.class.getName());

			ReferenceRegistry.registerReference(DmPortHarbourUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmPortHarbourPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmPortHarbourUtil.class,
			"_persistence");
	}

	private static DmPortHarbourPersistence _persistence;
}