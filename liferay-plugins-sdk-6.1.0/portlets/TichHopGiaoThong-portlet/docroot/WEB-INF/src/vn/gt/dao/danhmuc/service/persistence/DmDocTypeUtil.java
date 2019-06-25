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

import vn.gt.dao.danhmuc.model.DmDocType;

import java.util.List;

/**
 * The persistence utility for the dm doc type service. This utility wraps {@link DmDocTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDocTypePersistence
 * @see DmDocTypePersistenceImpl
 * @generated
 */
public class DmDocTypeUtil {
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
	public static void clearCache(DmDocType dmDocType) {
		getPersistence().clearCache(dmDocType);
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
	public static List<DmDocType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmDocType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmDocType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmDocType update(DmDocType dmDocType, boolean merge)
		throws SystemException {
		return getPersistence().update(dmDocType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmDocType update(DmDocType dmDocType, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmDocType, merge, serviceContext);
	}

	/**
	* Caches the dm doc type in the entity cache if it is enabled.
	*
	* @param dmDocType the dm doc type
	*/
	public static void cacheResult(vn.gt.dao.danhmuc.model.DmDocType dmDocType) {
		getPersistence().cacheResult(dmDocType);
	}

	/**
	* Caches the dm doc types in the entity cache if it is enabled.
	*
	* @param dmDocTypes the dm doc types
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmDocType> dmDocTypes) {
		getPersistence().cacheResult(dmDocTypes);
	}

	/**
	* Creates a new dm doc type with the primary key. Does not add the dm doc type to the database.
	*
	* @param id the primary key for the new dm doc type
	* @return the new dm doc type
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm doc type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm doc type
	* @return the dm doc type that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmDocType updateImpl(
		vn.gt.dao.danhmuc.model.DmDocType dmDocType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmDocType, merge);
	}

	/**
	* Returns the dm doc type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDocTypeException} if it could not be found.
	*
	* @param id the primary key of the dm doc type
	* @return the dm doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm doc type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm doc type
	* @return the dm doc type, or <code>null</code> if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm doc types where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @return the matching dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findByDocumentTypeCode(
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns a range of all the dm doc types where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @return the range of matching dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findByDocumentTypeCode(
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentTypeCode(documentTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm doc types where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findByDocumentTypeCode(
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentTypeCode(documentTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm doc type in the ordered set where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a matching dm doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType findByDocumentTypeCode_First(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException {
		return getPersistence()
				   .findByDocumentTypeCode_First(documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last dm doc type in the ordered set where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a matching dm doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType findByDocumentTypeCode_Last(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException {
		return getPersistence()
				   .findByDocumentTypeCode_Last(documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns the dm doc types before and after the current dm doc type in the ordered set where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm doc type
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType[] findByDocumentTypeCode_PrevAndNext(
		int id, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException {
		return getPersistence()
				   .findByDocumentTypeCode_PrevAndNext(id, documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns all the dm doc types.
	*
	* @return the dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @return the range of dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm doc types where documentTypeCode = &#63; from the database.
	*
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentTypeCode(
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDocumentTypeCode(documentTypeCode);
	}

	/**
	* Removes all the dm doc types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm doc types where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @return the number of matching dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentTypeCode(java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the number of dm doc types.
	*
	* @return the number of dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmDocTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmDocTypePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmDocTypePersistence.class.getName());

			ReferenceRegistry.registerReference(DmDocTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmDocTypePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmDocTypeUtil.class, "_persistence");
	}

	private static DmDocTypePersistence _persistence;
}