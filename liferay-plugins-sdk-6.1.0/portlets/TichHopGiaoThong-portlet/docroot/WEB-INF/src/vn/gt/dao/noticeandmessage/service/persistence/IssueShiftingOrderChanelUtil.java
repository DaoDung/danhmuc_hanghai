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

import vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel;

import java.util.List;

/**
 * The persistence utility for the issue shifting order chanel service. This utility wraps {@link IssueShiftingOrderChanelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueShiftingOrderChanelPersistence
 * @see IssueShiftingOrderChanelPersistenceImpl
 * @generated
 */
public class IssueShiftingOrderChanelUtil {
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
		IssueShiftingOrderChanel issueShiftingOrderChanel) {
		getPersistence().clearCache(issueShiftingOrderChanel);
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
	public static List<IssueShiftingOrderChanel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IssueShiftingOrderChanel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IssueShiftingOrderChanel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static IssueShiftingOrderChanel update(
		IssueShiftingOrderChanel issueShiftingOrderChanel, boolean merge)
		throws SystemException {
		return getPersistence().update(issueShiftingOrderChanel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static IssueShiftingOrderChanel update(
		IssueShiftingOrderChanel issueShiftingOrderChanel, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(issueShiftingOrderChanel, merge, serviceContext);
	}

	/**
	* Caches the issue shifting order chanel in the entity cache if it is enabled.
	*
	* @param issueShiftingOrderChanel the issue shifting order chanel
	*/
	public static void cacheResult(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel issueShiftingOrderChanel) {
		getPersistence().cacheResult(issueShiftingOrderChanel);
	}

	/**
	* Caches the issue shifting order chanels in the entity cache if it is enabled.
	*
	* @param issueShiftingOrderChanels the issue shifting order chanels
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> issueShiftingOrderChanels) {
		getPersistence().cacheResult(issueShiftingOrderChanels);
	}

	/**
	* Creates a new issue shifting order chanel with the primary key. Does not add the issue shifting order chanel to the database.
	*
	* @param issueShiftingOrderChanelPK the primary key for the new issue shifting order chanel
	* @return the new issue shifting order chanel
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel create(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK) {
		return getPersistence().create(issueShiftingOrderChanelPK);
	}

	/**
	* Removes the issue shifting order chanel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrderChanelPK the primary key of the issue shifting order chanel
	* @return the issue shifting order chanel that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a issue shifting order chanel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel remove(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException {
		return getPersistence().remove(issueShiftingOrderChanelPK);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel updateImpl(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel issueShiftingOrderChanel,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(issueShiftingOrderChanel, merge);
	}

	/**
	* Returns the issue shifting order chanel with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException} if it could not be found.
	*
	* @param issueShiftingOrderChanelPK the primary key of the issue shifting order chanel
	* @return the issue shifting order chanel
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a issue shifting order chanel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel findByPrimaryKey(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException {
		return getPersistence().findByPrimaryKey(issueShiftingOrderChanelPK);
	}

	/**
	* Returns the issue shifting order chanel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param issueShiftingOrderChanelPK the primary key of the issue shifting order chanel
	* @return the issue shifting order chanel, or <code>null</code> if a issue shifting order chanel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel fetchByPrimaryKey(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(issueShiftingOrderChanelPK);
	}

	/**
	* Returns all the issue shifting order chanels where shiftingOrderId = &#63;.
	*
	* @param shiftingOrderId the shifting order ID
	* @return the matching issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> findByShiftingOrderId(
		long shiftingOrderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByShiftingOrderId(shiftingOrderId);
	}

	/**
	* Returns a range of all the issue shifting order chanels where shiftingOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shiftingOrderId the shifting order ID
	* @param start the lower bound of the range of issue shifting order chanels
	* @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	* @return the range of matching issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> findByShiftingOrderId(
		long shiftingOrderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByShiftingOrderId(shiftingOrderId, start, end);
	}

	/**
	* Returns an ordered range of all the issue shifting order chanels where shiftingOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shiftingOrderId the shifting order ID
	* @param start the lower bound of the range of issue shifting order chanels
	* @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> findByShiftingOrderId(
		long shiftingOrderId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByShiftingOrderId(shiftingOrderId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first issue shifting order chanel in the ordered set where shiftingOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shiftingOrderId the shifting order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue shifting order chanel
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a matching issue shifting order chanel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel findByShiftingOrderId_First(
		long shiftingOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException {
		return getPersistence()
				   .findByShiftingOrderId_First(shiftingOrderId,
			orderByComparator);
	}

	/**
	* Returns the last issue shifting order chanel in the ordered set where shiftingOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shiftingOrderId the shifting order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue shifting order chanel
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a matching issue shifting order chanel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel findByShiftingOrderId_Last(
		long shiftingOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException {
		return getPersistence()
				   .findByShiftingOrderId_Last(shiftingOrderId,
			orderByComparator);
	}

	/**
	* Returns the issue shifting order chanels before and after the current issue shifting order chanel in the ordered set where shiftingOrderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param issueShiftingOrderChanelPK the primary key of the current issue shifting order chanel
	* @param shiftingOrderId the shifting order ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue shifting order chanel
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException if a issue shifting order chanel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel[] findByShiftingOrderId_PrevAndNext(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK,
		long shiftingOrderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssueShiftingOrderChanelException {
		return getPersistence()
				   .findByShiftingOrderId_PrevAndNext(issueShiftingOrderChanelPK,
			shiftingOrderId, orderByComparator);
	}

	/**
	* Returns all the issue shifting order chanels.
	*
	* @return the issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the issue shifting order chanels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue shifting order chanels
	* @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	* @return the range of issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the issue shifting order chanels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue shifting order chanels
	* @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the issue shifting order chanels where shiftingOrderId = &#63; from the database.
	*
	* @param shiftingOrderId the shifting order ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByShiftingOrderId(long shiftingOrderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByShiftingOrderId(shiftingOrderId);
	}

	/**
	* Removes all the issue shifting order chanels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of issue shifting order chanels where shiftingOrderId = &#63;.
	*
	* @param shiftingOrderId the shifting order ID
	* @return the number of matching issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByShiftingOrderId(long shiftingOrderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByShiftingOrderId(shiftingOrderId);
	}

	/**
	* Returns the number of issue shifting order chanels.
	*
	* @return the number of issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static IssueShiftingOrderChanelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (IssueShiftingOrderChanelPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					IssueShiftingOrderChanelPersistence.class.getName());

			ReferenceRegistry.registerReference(IssueShiftingOrderChanelUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(IssueShiftingOrderChanelPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(IssueShiftingOrderChanelUtil.class,
			"_persistence");
	}

	private static IssueShiftingOrderChanelPersistence _persistence;
}