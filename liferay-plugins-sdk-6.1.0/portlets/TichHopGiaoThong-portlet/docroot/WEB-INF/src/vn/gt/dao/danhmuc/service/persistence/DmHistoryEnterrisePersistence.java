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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmuc.model.DmHistoryEnterrise;

/**
 * The persistence interface for the dm history enterrise service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryEnterrisePersistenceImpl
 * @see DmHistoryEnterriseUtil
 * @generated
 */
public interface DmHistoryEnterrisePersistence extends BasePersistence<DmHistoryEnterrise> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryEnterriseUtil} to access the dm history enterrise persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history enterrise in the entity cache if it is enabled.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryEnterrise dmHistoryEnterrise);

	/**
	* Caches the dm history enterrises in the entity cache if it is enabled.
	*
	* @param dmHistoryEnterrises the dm history enterrises
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> dmHistoryEnterrises);

	/**
	* Creates a new dm history enterrise with the primary key. Does not add the dm history enterrise to the database.
	*
	* @param id the primary key for the new dm history enterrise
	* @return the new dm history enterrise
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise create(int id);

	/**
	* Removes the dm history enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryEnterrise dmHistoryEnterrise,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history enterrise with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException} if it could not be found.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the dm history enterrise with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise, or <code>null</code> if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history enterrises where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history enterrises where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param syncVersion the sync version
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history enterrises where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param syncVersion the sync version
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise findBySyncVersion_First(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the last dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise findBySyncVersion_Last(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history enterrise
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise[] findBySyncVersion_PrevAndNext(
		int id, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns all the dm history enterrises where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history enterrises where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history enterrises where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise findByEnterpriseCode_First(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise findByEnterpriseCode_Last(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history enterrise
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise[] findByEnterpriseCode_PrevAndNext(
		int id, java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns all the dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise findByEnterpriseTaxCode_First(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise findByEnterpriseTaxCode_Last(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history enterrise
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise[] findByEnterpriseTaxCode_PrevAndNext(
		int id, java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryEnterriseException;

	/**
	* Returns all the dm history enterrises.
	*
	* @return the dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history enterrises where syncVersion = &#63; from the database.
	*
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history enterrises where enterpriseCode = &#63; from the database.
	*
	* @param enterpriseCode the enterprise code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEnterpriseCode(java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history enterrises where enterpriseTaxCode = &#63; from the database.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEnterpriseTaxCode(java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history enterrises from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history enterrises where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int countBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history enterrises where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int countByEnterpriseCode(java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int countByEnterpriseTaxCode(java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history enterrises.
	*
	* @return the number of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}