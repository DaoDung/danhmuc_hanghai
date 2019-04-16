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

import vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField;

/**
 * The persistence interface for the history interface request field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see HistoryInterfaceRequestFieldPersistenceImpl
 * @see HistoryInterfaceRequestFieldUtil
 * @generated
 */
public interface HistoryInterfaceRequestFieldPersistence extends BasePersistence<HistoryInterfaceRequestField> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HistoryInterfaceRequestFieldUtil} to access the history interface request field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the history interface request field in the entity cache if it is enabled.
	*
	* @param historyInterfaceRequestField the history interface request field
	*/
	public void cacheResult(
		vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField historyInterfaceRequestField);

	/**
	* Caches the history interface request fields in the entity cache if it is enabled.
	*
	* @param historyInterfaceRequestFields the history interface request fields
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> historyInterfaceRequestFields);

	/**
	* Creates a new history interface request field with the primary key. Does not add the history interface request field to the database.
	*
	* @param id the primary key for the new history interface request field
	* @return the new history interface request field
	*/
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField create(
		long id);

	/**
	* Removes the history interface request field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history interface request field
	* @return the history interface request field that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField updateImpl(
		vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField historyInterfaceRequestField,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history interface request field with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException} if it could not be found.
	*
	* @param id the primary key of the history interface request field
	* @return the history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

	/**
	* Returns the history interface request field with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the history interface request field
	* @return the history interface request field, or <code>null</code> if a history interface request field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history interface request field where requestCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching history interface request field
	* @throws vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

	/**
	* Returns the history interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history interface request field where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching history interface request field, or <code>null</code> if a matching history interface request field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the history interface request fields where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByOrganizationCode(
		java.lang.String organizationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByOrganizationCode_First(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

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
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByOrganizationCode_Last(
		java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

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
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField[] findByOrganizationCode_PrevAndNext(
		long id, java.lang.String organizationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

	/**
	* Returns all the history interface request fields where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByLocCode(
		java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByLocCode(
		java.lang.String locCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findByLocCode(
		java.lang.String locCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByLocCode_First(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

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
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField findByLocCode_Last(
		java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

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
	public vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField[] findByLocCode_PrevAndNext(
		long id, java.lang.String locCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

	/**
	* Returns all the history interface request fields.
	*
	* @return the history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestField> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the history interface request field where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchHistoryInterfaceRequestFieldException;

	/**
	* Removes all the history interface request fields where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the history interface request fields where locCode = &#63; from the database.
	*
	* @param locCode the loc code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the history interface request fields from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history interface request fields where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history interface request fields where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history interface request fields where locCode = &#63;.
	*
	* @param locCode the loc code
	* @return the number of matching history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByLocCode(java.lang.String locCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history interface request fields.
	*
	* @return the number of history interface request fields
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}