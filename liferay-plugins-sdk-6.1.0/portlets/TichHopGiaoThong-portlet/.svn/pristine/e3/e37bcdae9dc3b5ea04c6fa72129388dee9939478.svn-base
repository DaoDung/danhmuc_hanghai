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

import vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth;

import java.util.List;

/**
 * The persistence utility for the temp attachment declaration health service. This utility wraps {@link TempAttachmentDeclarationHealthPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempAttachmentDeclarationHealthPersistence
 * @see TempAttachmentDeclarationHealthPersistenceImpl
 * @generated
 */
public class TempAttachmentDeclarationHealthUtil {
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
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		getPersistence().clearCache(tempAttachmentDeclarationHealth);
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
	public static List<TempAttachmentDeclarationHealth> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempAttachmentDeclarationHealth> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempAttachmentDeclarationHealth> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TempAttachmentDeclarationHealth update(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth,
		boolean merge) throws SystemException {
		return getPersistence().update(tempAttachmentDeclarationHealth, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TempAttachmentDeclarationHealth update(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(tempAttachmentDeclarationHealth, merge,
			serviceContext);
	}

	/**
	* Caches the temp attachment declaration health in the entity cache if it is enabled.
	*
	* @param tempAttachmentDeclarationHealth the temp attachment declaration health
	*/
	public static void cacheResult(
		vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		getPersistence().cacheResult(tempAttachmentDeclarationHealth);
	}

	/**
	* Caches the temp attachment declaration healths in the entity cache if it is enabled.
	*
	* @param tempAttachmentDeclarationHealths the temp attachment declaration healths
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> tempAttachmentDeclarationHealths) {
		getPersistence().cacheResult(tempAttachmentDeclarationHealths);
	}

	/**
	* Creates a new temp attachment declaration health with the primary key. Does not add the temp attachment declaration health to the database.
	*
	* @param id the primary key for the new temp attachment declaration health
	* @return the new temp attachment declaration health
	*/
	public static vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the temp attachment declaration health with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp attachment declaration health
	* @return the temp attachment declaration health that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth updateImpl(
		vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .updateImpl(tempAttachmentDeclarationHealth, merge);
	}

	/**
	* Returns the temp attachment declaration health with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException} if it could not be found.
	*
	* @param id the primary key of the temp attachment declaration health
	* @return the temp attachment declaration health
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the temp attachment declaration health with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp attachment declaration health
	* @return the temp attachment declaration health, or <code>null</code> if a temp attachment declaration health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the temp attachment declaration healths where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns a range of all the temp attachment declaration healths where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp attachment declaration healths
	* @param end the upper bound of the range of temp attachment declaration healths (not inclusive)
	* @return the range of matching temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the temp attachment declaration healths where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp attachment declaration healths
	* @param end the upper bound of the range of temp attachment declaration healths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first temp attachment declaration health in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp attachment declaration health
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException if a matching temp attachment declaration health could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException {
		return getPersistence()
				   .findByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last temp attachment declaration health in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp attachment declaration health
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException if a matching temp attachment declaration health could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException {
		return getPersistence()
				   .findByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the temp attachment declaration healths before and after the current temp attachment declaration health in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp attachment declaration health
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp attachment declaration health
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException {
		return getPersistence()
				   .findByRequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Returns all the temp attachment declaration healths.
	*
	* @return the temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp attachment declaration healths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp attachment declaration healths
	* @param end the upper bound of the range of temp attachment declaration healths (not inclusive)
	* @return the range of temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp attachment declaration healths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp attachment declaration healths
	* @param end the upper bound of the range of temp attachment declaration healths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp attachment declaration healths where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Removes all the temp attachment declaration healths from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp attachment declaration healths where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns the number of temp attachment declaration healths.
	*
	* @return the number of temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempAttachmentDeclarationHealthPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempAttachmentDeclarationHealthPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempAttachmentDeclarationHealthPersistence.class.getName());

			ReferenceRegistry.registerReference(TempAttachmentDeclarationHealthUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(
		TempAttachmentDeclarationHealthPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(TempAttachmentDeclarationHealthUtil.class,
			"_persistence");
	}

	private static TempAttachmentDeclarationHealthPersistence _persistence;
}