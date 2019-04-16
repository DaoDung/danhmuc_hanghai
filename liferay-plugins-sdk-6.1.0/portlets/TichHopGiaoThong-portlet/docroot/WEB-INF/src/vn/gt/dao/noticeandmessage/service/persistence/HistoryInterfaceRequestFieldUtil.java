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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField;

import java.util.List;

/**
 * The persistence utility for the history interface request field service. This utility wraps {@link HistoryInterfaceRequestFieldPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see HistoryInterfaceRequestFieldPersistence
 * @see HistoryInterfaceRequestFieldPersistenceImpl
 * @generated
 */
public class HistoryInterfaceRequestFieldUtil {
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
	public static void clearCache(
		HistoryInterfaceRequestField historyInterfaceRequestField) {
		getPersistence().clearCache(historyInterfaceRequestField);
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
	public static List<HistoryInterfaceRequestField> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HistoryInterfaceRequestField> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HistoryInterfaceRequestField> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static HistoryInterfaceRequestField update(
		HistoryInterfaceRequestField historyInterfaceRequestField, boolean merge)
		throws SystemException {
		return getPersistence().update(historyInterfaceRequestField, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static HistoryInterfaceRequestField update(
		HistoryInterfaceRequestField historyInterfaceRequestField,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(historyInterfaceRequestField, merge, serviceContext);
	}

	/**
	* Caches the history interface request field in the entity cache if it is enabled.
	*
	* @param historyInterfaceRequestField the history interface request field
	*/
	public static void cacheResult(
		vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField historyInterfaceRequestField) {
		getPersistence().cacheResult(historyInterfaceRequestField);
	}

	/**
	* Caches the history interface request fields in the entity cache if it is enabled.
	*
	* @param historyInterfaceRequestFields the history interface request fields
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> historyInterfaceRequestFields) {
		getPersistence().cacheResult(historyInterfaceRequestFields);
	}

	/**
	* Creates a new history interface request field with the primary key. Does not add the history interface request field to the database.
	*
	* @param id the primary key for the new history interface request field
	* @return the new history interface request field
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the history interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history interface request field
	* @return the history interface request field that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField updateImpl(
		vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField historyInterfaceRequestField,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(historyInterfaceRequestField, merge);
	}

	/**
	* Returns the history interface request field with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException} if it could not be found.
	*
	* @param id the primary key of the history interface request field
	* @return the history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the history interface request field with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the history interface request field
	* @return the history interface request field, or <code>null</code> if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the history interface request field where requestCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns the history interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRequestCode(requestCode);
	}

	/**
	* Returns the history interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode(requestCode, retrieveFromCache);
	}

	/**
	* Returns all the history interface request fields where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrganizationCode(organizationCode);
	}

	/**
	* Returns a range of all the history interface request fields where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param organizationCode the organization code
	* @param start the lower bound of the range of history interface request fields
	* @param end the upper bound of the range of history interface request fields (not inclusive)
	* @return the range of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganizationCode(organizationCode, start, end);
	}

	/**
	* Returns an ordered range of all the history interface request fields where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param organizationCode the organization code
	* @param start the lower bound of the range of history interface request fields
	* @param end the upper bound of the range of history interface request fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByOrganizationCode(organizationCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first history interface request field in the ordered set where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence()
				   .findByOrganizationCode_First(organizationCode,
			orderByComparator);
	}

	/**
	* Returns the last history interface request field in the ordered set where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence()
				   .findByOrganizationCode_Last(organizationCode,
			orderByComparator);
	}

	/**
	* Returns the history interface request fields before and after the current history interface request field in the ordered set where organizationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current history interface request field
	* @param organizationCode the organization code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField[] findByOrganizationCode_PrevAndNext(
		long id, java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence()
				   .findByOrganizationCode_PrevAndNext(id, organizationCode,
			orderByComparator);
	}

	/**
	* Returns all the history interface request fields where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByLocCode(
		java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocCode(locCode);
	}

	/**
	* Returns a range of all the history interface request fields where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param start the lower bound of the range of history interface request fields
	* @param end the upper bound of the range of history interface request fields (not inclusive)
	* @return the range of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByLocCode(
		java.lang.String locCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocCode(locCode, start, end);
	}

	/**
	* Returns an ordered range of all the history interface request fields where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param start the lower bound of the range of history interface request fields
	* @param end the upper bound of the range of history interface request fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByLocCode(
		java.lang.String locCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLocCode(locCode, start, end, orderByComparator);
	}

	/**
	* Returns the first history interface request field in the ordered set where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence().findByLocCode_First(locCode, orderByComparator);
	}

	/**
	* Returns the last history interface request field in the ordered set where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence().findByLocCode_Last(locCode, orderByComparator);
	}

	/**
	* Returns the history interface request fields before and after the current history interface request field in the ordered set where locCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current history interface request field
	* @param locCode the loc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		return getPersistence()
				   .findByLocCode_PrevAndNext(id, locCode, orderByComparator);
	}

	/**
	* Returns all the history interface request fields.
	*
	* @return the history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the history interface request fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of history interface request fields
	* @param end the upper bound of the range of history interface request fields (not inclusive)
	* @return the range of history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the history interface request fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of history interface request fields
	* @param end the upper bound of the range of history interface request fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the history interface request field where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Removes all the history interface request fields where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOrganizationCode(organizationCode);
	}

	/**
	* Removes all the history interface request fields where locCode = &#63; from the database.
	*
	* @param locCode the loc code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLocCode(locCode);
	}

	/**
	* Removes all the history interface request fields from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of history interface request fields where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns the number of history interface request fields where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOrganizationCode(organizationCode);
	}

	/**
	* Returns the number of history interface request fields where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the number of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLocCode(locCode);
	}

	/**
	* Returns the number of history interface request fields.
	*
	* @return the number of history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HistoryInterfaceRequestFieldPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HistoryInterfaceRequestFieldPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					HistoryInterfaceRequestFieldPersistence.class.getName());

			ReferenceRegistry.registerReference(HistoryInterfaceRequestFieldUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(
		HistoryInterfaceRequestFieldPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(HistoryInterfaceRequestFieldUtil.class,
			"_persistence");
	}

	private static HistoryInterfaceRequestFieldPersistence _persistence;
}