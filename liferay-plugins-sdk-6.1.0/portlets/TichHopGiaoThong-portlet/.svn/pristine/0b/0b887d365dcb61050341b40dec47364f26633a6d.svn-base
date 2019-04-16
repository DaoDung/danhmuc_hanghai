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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmuc.model.DmPort;

/**
 * The persistence interface for the dm port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmPortPersistenceImpl
 * @see DmPortUtil
 * @generated
 */
public interface DmPortPersistence extends BasePersistence<DmPort> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmPortUtil} to access the dm port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm port in the entity cache if it is enabled.
	*
	* @param dmPort the dm port
	*/
	public void cacheResult(vn.gt.dao.danhmuc.model.DmPort dmPort);

	/**
	* Caches the dm ports in the entity cache if it is enabled.
	*
	* @param dmPorts the dm ports
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmPort> dmPorts);

	/**
	* Creates a new dm port with the primary key. Does not add the dm port to the database.
	*
	* @param id the primary key for the new dm port
	* @return the new dm port
	*/
	public vn.gt.dao.danhmuc.model.DmPort create(int id);

	/**
	* Removes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port
	* @return the dm port that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPort remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

	public vn.gt.dao.danhmuc.model.DmPort updateImpl(
		vn.gt.dao.danhmuc.model.DmPort dmPort, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortException} if it could not be found.
	*
	* @param id the primary key of the dm port
	* @return the dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPort findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

	/**
	* Returns the dm port with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm port
	* @return the dm port, or <code>null</code> if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPort fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByPortCode(
		java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByPortCode(
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByPortCode(
		java.lang.String portCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.danhmuc.model.DmPort findByPortCode_First(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

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
	public vn.gt.dao.danhmuc.model.DmPort findByPortCode_Last(
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

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
	public vn.gt.dao.danhmuc.model.DmPort[] findByPortCode_PrevAndNext(int id,
		java.lang.String portCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

	/**
	* Returns all the dm ports where loCode = &#63;.
	*
	* @param loCode the lo code
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByLoCode(
		java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByLoCode(
		java.lang.String loCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByLoCode(
		java.lang.String loCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.danhmuc.model.DmPort findByLoCode_First(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

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
	public vn.gt.dao.danhmuc.model.DmPort findByLoCode_Last(
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

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
	public vn.gt.dao.danhmuc.model.DmPort[] findByLoCode_PrevAndNext(int id,
		java.lang.String loCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

	/**
	* Returns all the dm ports where stateCode = &#63; and citycode = &#63;.
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @return the matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByStateCodeAndCityCode(
		java.lang.String stateCode, java.lang.String citycode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByStateCodeAndCityCode(
		java.lang.String stateCode, java.lang.String citycode, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByStateCodeAndCityCode(
		java.lang.String stateCode, java.lang.String citycode, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.danhmuc.model.DmPort findByStateCodeAndCityCode_First(
		java.lang.String stateCode, java.lang.String citycode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

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
	public vn.gt.dao.danhmuc.model.DmPort findByStateCodeAndCityCode_Last(
		java.lang.String stateCode, java.lang.String citycode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

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
	public vn.gt.dao.danhmuc.model.DmPort[] findByStateCodeAndCityCode_PrevAndNext(
		int id, java.lang.String stateCode, java.lang.String citycode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

	/**
	* Returns the dm port where portCode = &#63; and loCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmPortException} if it could not be found.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @return the matching dm port
	* @throws vn.gt.dao.danhmuc.NoSuchDmPortException if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPort findByPortCodeLoCode(
		java.lang.String portCode, java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

	/**
	* Returns the dm port where portCode = &#63; and loCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @return the matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPort fetchByPortCodeLoCode(
		java.lang.String portCode, java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port where portCode = &#63; and loCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm port, or <code>null</code> if a matching dm port could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPort fetchByPortCodeLoCode(
		java.lang.String portCode, java.lang.String loCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm ports.
	*
	* @return the dm ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.danhmuc.model.DmPort> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm ports where portCode = &#63; from the database.
	*
	* @param portCode the port code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm ports where loCode = &#63; from the database.
	*
	* @param loCode the lo code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLoCode(java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm ports where stateCode = &#63; and citycode = &#63; from the database.
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStateCodeAndCityCode(java.lang.String stateCode,
		java.lang.String citycode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm port where portCode = &#63; and loCode = &#63; from the database.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortCodeLoCode(java.lang.String portCode,
		java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmPortException;

	/**
	* Removes all the dm ports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ports where portCode = &#63;.
	*
	* @param portCode the port code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortCode(java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ports where loCode = &#63;.
	*
	* @param loCode the lo code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public int countByLoCode(java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ports where stateCode = &#63; and citycode = &#63;.
	*
	* @param stateCode the state code
	* @param citycode the citycode
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public int countByStateCodeAndCityCode(java.lang.String stateCode,
		java.lang.String citycode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ports where portCode = &#63; and loCode = &#63;.
	*
	* @param portCode the port code
	* @param loCode the lo code
	* @return the number of matching dm ports
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortCodeLoCode(java.lang.String portCode,
		java.lang.String loCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ports.
	*
	* @return the number of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmPort remove(DmPort dmPort) throws SystemException;
}