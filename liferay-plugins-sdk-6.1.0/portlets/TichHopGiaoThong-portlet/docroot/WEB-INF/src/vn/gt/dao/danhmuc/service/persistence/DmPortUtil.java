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

import vn.gt.dao.danhmuc.model.DmPort;

import java.util.List;

/**
 * The persistence utility for the dm port service. This utility wraps {@link DmPortPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmPortPersistence
 * @see DmPortPersistenceImpl
 * @generated
 */
public class DmPortUtil {
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
	public static void clearCache(DmPort dmPort) {
		getPersistence().clearCache(dmPort);
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
	public static List<DmPort> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmPort> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmPort> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmPort update(DmPort dmPort, boolean merge)
		throws SystemException {
		return getPersistence().update(dmPort, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmPort update(DmPort dmPort, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmPort, merge, serviceContext);
	}

	/**
	* Caches the dm port in the entity cache if it is enabled.
	*
	* @param dmPort the dm port
	*/
	public static void cacheResult(vn.gt.dao.danhmuc.model.DmPort dmPort) {
		getPersistence().cacheResult(dmPort);
	}

	/**
	* Caches the dm ports in the entity cache if it is enabled.
	*
	* @param dmPorts the dm ports
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmPort> dmPorts) {
		getPersistence().cacheResult(dmPorts);
	}

	/**
	* Creates a new dm port with the primary key. Does not add the dm port to the database.
	*
	* @param id the primary key for the new dm port
	* @return the new dm port
	*/
	public static vn.gt.dao.danhmuc.model.DmPort create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port
	* @return the dm port that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmPort updateImpl(
		vn.gt.dao.danhmuc.model.DmPort dmPort, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmPort, merge);
	}

	/**
	* Returns the dm port with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortException} if it could not be found.
	*
	* @param id the primary key of the dm port
	* @return the dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm port with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port
	* @return the dm port, or <code>null</code> if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByPortCode(
		java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCode(portCode);
	}

	/**
	* Returns a range of all the dm ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByPortCode(
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortCode(portCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm ports where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByPortCode(
		java.lang.String portCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortCode(portCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm port in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort findByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence().findByPortCode_First(portCode, orderByComparator);
	}

	/**
	* Returns the last dm port in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort findByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence().findByPortCode_Last(portCode, orderByComparator);
	}

	/**
	* Returns the dm ports before and after the current dm port in the ordered set where portCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port
	* @param portCode the port code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort[] findByPortCode_PrevAndNext(
		int id, java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence()
				   .findByPortCode_PrevAndNext(id, portCode, orderByComparator);
	}

	/**
	* Returns all the dm ports where loCode = &#63;.
	*
	* @param loCode the lo code
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByLoCode(
		java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoCode(loCode);
	}

	/**
	* Returns a range of all the dm ports where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param loCode the lo code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByLoCode(
		java.lang.String loCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLoCode(loCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm ports where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param loCode the lo code
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByLoCode(
		java.lang.String loCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLoCode(loCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm port in the ordered set where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort findByLoCode_First(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence().findByLoCode_First(loCode, orderByComparator);
	}

	/**
	* Returns the last dm port in the ordered set where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort findByLoCode_Last(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence().findByLoCode_Last(loCode, orderByComparator);
	}

	/**
	* Returns the dm ports before and after the current dm port in the ordered set where loCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port
	* @param loCode the lo code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort[] findByLoCode_PrevAndNext(
		int id, java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence()
				   .findByLoCode_PrevAndNext(id, loCode, orderByComparator);
	}

	/**
	* Returns all the dm ports where stateCode = &#63; and citycode = &#63;.
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByStateCodeAndCityCode(
		java.lang.String stateCode, java.lang.String citycode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStateCodeAndCityCode(stateCode, citycode);
	}

	/**
	* Returns a range of all the dm ports where stateCode = &#63; and citycode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByStateCodeAndCityCode(
		java.lang.String stateCode, java.lang.String citycode, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStateCodeAndCityCode(stateCode, citycode, start, end);
	}

	/**
	* Returns an ordered range of all the dm ports where stateCode = &#63; and citycode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByStateCodeAndCityCode(
		java.lang.String stateCode, java.lang.String citycode, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStateCodeAndCityCode(stateCode, citycode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm port in the ordered set where stateCode = &#63; and citycode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort findByStateCodeAndCityCode_First(
		java.lang.String stateCode, java.lang.String citycode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence()
				   .findByStateCodeAndCityCode_First(stateCode, citycode,
			orderByComparator);
	}

	/**
	* Returns the last dm port in the ordered set where stateCode = &#63; and citycode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort findByStateCodeAndCityCode_Last(
		java.lang.String stateCode, java.lang.String citycode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence()
				   .findByStateCodeAndCityCode_Last(stateCode, citycode,
			orderByComparator);
	}

	/**
	* Returns the dm ports before and after the current dm port in the ordered set where stateCode = &#63; and citycode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm port
	* @param stateCode the state code
	* @param citycode the citycode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort[] findByStateCodeAndCityCode_PrevAndNext(
		int id, java.lang.String stateCode, java.lang.String citycode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence()
				   .findByStateCodeAndCityCode_PrevAndNext(id, stateCode,
			citycode, orderByComparator);
	}

	/**
	* Returns the dm port where portCode = &#63; and loCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortException} if it could not be found.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @return the matching dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort findByPortCodeLoCode(
		java.lang.String portCode, java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		return getPersistence().findByPortCodeLoCode(portCode, loCode);
	}

	/**
	* Returns the dm port where portCode = &#63; and loCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @return the matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort fetchByPortCodeLoCode(
		java.lang.String portCode, java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPortCodeLoCode(portCode, loCode);
	}

	/**
	* Returns the dm port where portCode = &#63; and loCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort fetchByPortCodeLoCode(
		java.lang.String portCode, java.lang.String loCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPortCodeLoCode(portCode, loCode, retrieveFromCache);
	}

	/**
	* Returns all the dm ports.
	*
	* @return the dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm ports where portCode = &#63; from the database.
	*
	* @param portCode the port code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortCode(portCode);
	}

	/**
	* Removes all the dm ports where loCode = &#63; from the database.
	*
	* @param loCode the lo code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLoCode(java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLoCode(loCode);
	}

	/**
	* Removes all the dm ports where stateCode = &#63; and citycode = &#63; from the database.
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStateCodeAndCityCode(
		java.lang.String stateCode, java.lang.String citycode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStateCodeAndCityCode(stateCode, citycode);
	}

	/**
	* Removes the dm port where portCode = &#63; and loCode = &#63; from the database.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortCodeLoCode(java.lang.String portCode,
		java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException {
		getPersistence().removeByPortCodeLoCode(portCode, loCode);
	}

	/**
	* Removes all the dm ports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortCode(portCode);
	}

	/**
	* Returns the number of dm ports where loCode = &#63;.
	*
	* @param loCode the lo code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLoCode(java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLoCode(loCode);
	}

	/**
	* Returns the number of dm ports where stateCode = &#63; and citycode = &#63;.
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStateCodeAndCityCode(java.lang.String stateCode,
		java.lang.String citycode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStateCodeAndCityCode(stateCode, citycode);
	}

	/**
	* Returns the number of dm ports where portCode = &#63; and loCode = &#63;.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortCodeLoCode(java.lang.String portCode,
		java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortCodeLoCode(portCode, loCode);
	}

	/**
	* Returns the number of dm ports.
	*
	* @return the number of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmPortPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmPortPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmPortPersistence.class.getName());

			ReferenceRegistry.registerReference(DmPortUtil.class, "_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmPortPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmPortUtil.class, "_persistence");
	}

	private static DmPortPersistence _persistence;
}