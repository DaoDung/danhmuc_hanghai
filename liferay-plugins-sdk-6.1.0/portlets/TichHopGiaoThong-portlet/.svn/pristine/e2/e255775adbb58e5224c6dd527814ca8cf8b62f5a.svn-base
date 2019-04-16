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

import vn.gt.dao.danhmuc.model.DmEnterrise;

import java.util.List;

/**
 * The persistence utility for the dm enterrise service. This utility wraps {@link DmEnterrisePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmEnterrisePersistence
 * @see DmEnterrisePersistenceImpl
 * @generated
 */
public class DmEnterriseUtil {
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
	public static void clearCache(DmEnterrise dmEnterrise) {
		getPersistence().clearCache(dmEnterrise);
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
	public static List<DmEnterrise> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmEnterrise> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmEnterrise> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DmEnterrise remove(DmEnterrise dmEnterrise)
		throws SystemException {
		return getPersistence().remove(dmEnterrise);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmEnterrise update(DmEnterrise dmEnterrise, boolean merge)
		throws SystemException {
		return getPersistence().update(dmEnterrise, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmEnterrise update(DmEnterrise dmEnterrise, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmEnterrise, merge, serviceContext);
	}

	/**
	* Caches the dm enterrise in the entity cache if it is enabled.
	*
	* @param dmEnterrise the dm enterrise
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmEnterrise dmEnterrise) {
		getPersistence().cacheResult(dmEnterrise);
	}

	/**
	* Caches the dm enterrises in the entity cache if it is enabled.
	*
	* @param dmEnterrises the dm enterrises
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> dmEnterrises) {
		getPersistence().cacheResult(dmEnterrises);
	}

	/**
	* Creates a new dm enterrise with the primary key. Does not add the dm enterrise to the database.
	*
	* @param id the primary key for the new dm enterrise
	* @return the new dm enterrise
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm enterrise
	* @return the dm enterrise that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a dm enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmEnterriseException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmEnterrise updateImpl(
		vn.gt.dao.danhmuc.model.DmEnterrise dmEnterrise, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmEnterrise, merge);
	}

	/**
	* Returns the dm enterrise with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmEnterriseException} if it could not be found.
	*
	* @param id the primary key of the dm enterrise
	* @return the dm enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a dm enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmEnterriseException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm enterrise with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm enterrise
	* @return the dm enterrise, or <code>null</code> if a dm enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm enterrises where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @return the matching dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEnterpriseCode(enterpriseCode);
	}

	/**
	* Returns a range of all the dm enterrises where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param start the lower bound of the range of dm enterrises
	* @param end the upper bound of the range of dm enterrises (not inclusive)
	* @return the range of matching dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEnterpriseCode(enterpriseCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm enterrises where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param start the lower bound of the range of dm enterrises
	* @param end the upper bound of the range of dm enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEnterpriseCode(enterpriseCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a matching dm enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise findByEnterpriseCode_First(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmEnterriseException {
		return getPersistence()
				   .findByEnterpriseCode_First(enterpriseCode, orderByComparator);
	}

	/**
	* Returns the last dm enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a matching dm enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise findByEnterpriseCode_Last(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmEnterriseException {
		return getPersistence()
				   .findByEnterpriseCode_Last(enterpriseCode, orderByComparator);
	}

	/**
	* Returns the dm enterrises before and after the current dm enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm enterrise
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a dm enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise[] findByEnterpriseCode_PrevAndNext(
		int id, java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmEnterriseException {
		return getPersistence()
				   .findByEnterpriseCode_PrevAndNext(id, enterpriseCode,
			orderByComparator);
	}

	/**
	* Returns all the dm enterrises where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @return the matching dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEnterpriseTaxCode(enterpriseTaxCode);
	}

	/**
	* Returns a range of all the dm enterrises where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param start the lower bound of the range of dm enterrises
	* @param end the upper bound of the range of dm enterrises (not inclusive)
	* @return the range of matching dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEnterpriseTaxCode(enterpriseTaxCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm enterrises where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param start the lower bound of the range of dm enterrises
	* @param end the upper bound of the range of dm enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEnterpriseTaxCode(enterpriseTaxCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a matching dm enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise findByEnterpriseTaxCode_First(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmEnterriseException {
		return getPersistence()
				   .findByEnterpriseTaxCode_First(enterpriseTaxCode,
			orderByComparator);
	}

	/**
	* Returns the last dm enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a matching dm enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise findByEnterpriseTaxCode_Last(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmEnterriseException {
		return getPersistence()
				   .findByEnterpriseTaxCode_Last(enterpriseTaxCode,
			orderByComparator);
	}

	/**
	* Returns the dm enterrises before and after the current dm enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm enterrise
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm enterrise
	* @throws vn.gt.dao.danhmuc.NoSuchDmEnterriseException if a dm enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise[] findByEnterpriseTaxCode_PrevAndNext(
		int id, java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmEnterriseException {
		return getPersistence()
				   .findByEnterpriseTaxCode_PrevAndNext(id, enterpriseTaxCode,
			orderByComparator);
	}

	/**
	* Returns all the dm enterrises.
	*
	* @return the dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm enterrises
	* @param end the upper bound of the range of dm enterrises (not inclusive)
	* @return the range of dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm enterrises
	* @param end the upper bound of the range of dm enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm enterrises where enterpriseCode = &#63; from the database.
	*
	* @param enterpriseCode the enterprise code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEnterpriseCode(java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEnterpriseCode(enterpriseCode);
	}

	/**
	* Removes all the dm enterrises where enterpriseTaxCode = &#63; from the database.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEnterpriseTaxCode(enterpriseTaxCode);
	}

	/**
	* Removes all the dm enterrises from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm enterrises where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @return the number of matching dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEnterpriseCode(java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEnterpriseCode(enterpriseCode);
	}

	/**
	* Returns the number of dm enterrises where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @return the number of matching dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEnterpriseTaxCode(enterpriseTaxCode);
	}

	/**
	* Returns the number of dm enterrises.
	*
	* @return the number of dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmEnterrisePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmEnterrisePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmEnterrisePersistence.class.getName());

			ReferenceRegistry.registerReference(DmEnterriseUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmEnterrisePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmEnterriseUtil.class,
			"_persistence");
	}

	private static DmEnterrisePersistence _persistence;
}