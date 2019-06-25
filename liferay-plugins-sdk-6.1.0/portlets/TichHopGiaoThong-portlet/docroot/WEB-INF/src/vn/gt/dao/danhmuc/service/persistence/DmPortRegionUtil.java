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

import vn.gt.dao.danhmuc.model.DmPortRegion;

import java.util.List;

/**
 * The persistence utility for the dm port region service. This utility wraps {@link DmPortRegionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmPortRegionPersistence
 * @see DmPortRegionPersistenceImpl
 * @generated
 */
public class DmPortRegionUtil {
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
	public static void clearCache(DmPortRegion dmPortRegion) {
		getPersistence().clearCache(dmPortRegion);
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
	public static List<DmPortRegion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmPortRegion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmPortRegion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmPortRegion update(DmPortRegion dmPortRegion, boolean merge)
		throws SystemException {
		return getPersistence().update(dmPortRegion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmPortRegion update(DmPortRegion dmPortRegion, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmPortRegion, merge, serviceContext);
	}

	/**
	* Caches the dm port region in the entity cache if it is enabled.
	*
	* @param dmPortRegion the dm port region
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion) {
		getPersistence().cacheResult(dmPortRegion);
	}

	/**
	* Caches the dm port regions in the entity cache if it is enabled.
	*
	* @param dmPortRegions the dm port regions
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> dmPortRegions) {
		getPersistence().cacheResult(dmPortRegions);
	}

	/**
	* Creates a new dm port region with the primary key. Does not add the dm port region to the database.
	*
	* @param id the primary key for the new dm port region
	* @return the new dm port region
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm port region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port region
	* @return the dm port region that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmPortRegion updateImpl(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmPortRegion, merge);
	}

	/**
	* Returns the dm port region with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortRegionException} if it could not be found.
	*
	* @param id the primary key of the dm port region
	* @return the dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm port region with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port region
	* @return the dm port region, or <code>null</code> if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm port regions where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode);
	}

	/**
	* Returns a range of all the dm port regions where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionCode(portRegionCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm port regions where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortRegionCode(portRegionCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm port region in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortRegionCode_First(portRegionCode, orderByComparator);
	}

	/**
	* Returns the last dm port region in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortRegionCode_Last(portRegionCode, orderByComparator);
	}

	/**
	* Returns the dm port regions before and after the current dm port region in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port region
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortRegionCode_PrevAndNext(id, portRegionCode,
			orderByComparator);
	}

	/**
	* Returns all the dm port regions where portRegionRef = &#63;.
	*
	* @param portRegionRef the port region ref
	* @return the matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortRegionRef(
		java.lang.String portRegionRef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionRef(portRegionRef);
	}

	/**
	* Returns a range of all the dm port regions where portRegionRef = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionRef the port region ref
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortRegionRef(
		java.lang.String portRegionRef, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortRegionRef(portRegionRef, start, end);
	}

	/**
	* Returns an ordered range of all the dm port regions where portRegionRef = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionRef the port region ref
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortRegionRef(
		java.lang.String portRegionRef, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortRegionRef(portRegionRef, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm port region in the ordered set where portRegionRef = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionRef the port region ref
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion findByPortRegionRef_First(
		java.lang.String portRegionRef,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortRegionRef_First(portRegionRef, orderByComparator);
	}

	/**
	* Returns the last dm port region in the ordered set where portRegionRef = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionRef the port region ref
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion findByPortRegionRef_Last(
		java.lang.String portRegionRef,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortRegionRef_Last(portRegionRef, orderByComparator);
	}

	/**
	* Returns the dm port regions before and after the current dm port region in the ordered set where portRegionRef = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port region
	* @param portRegionRef the port region ref
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion[] findByPortRegionRef_PrevAndNext(
		int id, java.lang.String portRegionRef,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortRegionRef_PrevAndNext(id, portRegionRef,
			orderByComparator);
	}

	/**
	* Returns all the dm port regions where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortCodeName(
		java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCodeName(portCode);
	}

	/**
	* Returns a range of all the dm port regions where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortCodeName(
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCodeName(portCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm port regions where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findByPortCodeName(
		java.lang.String portCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortCodeName(portCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm port region in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion findByPortCodeName_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortCodeName_First(portCode, orderByComparator);
	}

	/**
	* Returns the last dm port region in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a matching dm port region could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion findByPortCodeName_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortCodeName_Last(portCode, orderByComparator);
	}

	/**
	* Returns the dm port regions before and after the current dm port region in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port region
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port region
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortRegionException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortRegion[] findByPortCodeName_PrevAndNext(
		int id, java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortRegionException {
		return getPersistence()
				   .findByPortCodeName_PrevAndNext(id, portCode,
			orderByComparator);
	}

	/**
	* Returns all the dm port regions.
	*
	* @return the dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm port regions where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortRegionCode(portRegionCode);
	}

	/**
	* Removes all the dm port regions where portRegionRef = &#63; from the database.
	*
	* @param portRegionRef the port region ref
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortRegionRef(java.lang.String portRegionRef)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortRegionRef(portRegionRef);
	}

	/**
	* Removes all the dm port regions where portCode = &#63; from the database.
	*
	* @param portCode the port code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortCodeName(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortCodeName(portCode);
	}

	/**
	* Removes all the dm port regions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm port regions where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortRegionCode(portRegionCode);
	}

	/**
	* Returns the number of dm port regions where portRegionRef = &#63;.
	*
	* @param portRegionRef the port region ref
	* @return the number of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortRegionRef(java.lang.String portRegionRef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortRegionRef(portRegionRef);
	}

	/**
	* Returns the number of dm port regions where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the number of matching dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortCodeName(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortCodeName(portCode);
	}

	/**
	* Returns the number of dm port regions.
	*
	* @return the number of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmPortRegionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmPortRegionPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmPortRegionPersistence.class.getName());

			ReferenceRegistry.registerReference(DmPortRegionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmPortRegionPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmPortRegionUtil.class,
			"_persistence");
	}

	private static DmPortRegionPersistence _persistence;
}