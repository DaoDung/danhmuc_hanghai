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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth;

/**
 * The persistence interface for the temp attachment declaration health service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempAttachmentDeclarationHealthPersistenceImpl
 * @see TempAttachmentDeclarationHealthUtil
 * @generated
 */
public interface TempAttachmentDeclarationHealthPersistence
	extends BasePersistence<TempAttachmentDeclarationHealth> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempAttachmentDeclarationHealthUtil} to access the temp attachment declaration health persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the temp attachment declaration health in the entity cache if it is enabled.
	*
	* @param tempAttachmentDeclarationHealth the temp attachment declaration health
	*/
	public void cacheResult(
		vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth);

	/**
	* Caches the temp attachment declaration healths in the entity cache if it is enabled.
	*
	* @param tempAttachmentDeclarationHealths the temp attachment declaration healths
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> tempAttachmentDeclarationHealths);

	/**
	* Creates a new temp attachment declaration health with the primary key. Does not add the temp attachment declaration health to the database.
	*
	* @param id the primary key for the new temp attachment declaration health
	* @return the new temp attachment declaration health
	*/
	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth create(
		long id);

	/**
	* Removes the temp attachment declaration health with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp attachment declaration health
	* @return the temp attachment declaration health that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException;

	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth updateImpl(
		vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp attachment declaration health with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException} if it could not be found.
	*
	* @param id the primary key of the temp attachment declaration health
	* @return the temp attachment declaration health
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException if a temp attachment declaration health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException;

	/**
	* Returns the temp attachment declaration health with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp attachment declaration health
	* @return the temp attachment declaration health, or <code>null</code> if a temp attachment declaration health with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp attachment declaration healths where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException;

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
	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException;

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
	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempAttachmentDeclarationHealthException;

	/**
	* Returns all the temp attachment declaration healths.
	*
	* @return the temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp attachment declaration healths where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the temp attachment declaration healths from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp attachment declaration healths where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp attachment declaration healths.
	*
	* @return the number of temp attachment declaration healths
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}