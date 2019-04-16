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

package vn.gt.dao.nhapcanh.service.persistence;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.nhapcanh.model.DocumentGeneral;

/**
 * The persistence interface for the document general service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DocumentGeneralPersistenceImpl
 * @see DocumentGeneralUtil
 * @generated
 */
public interface DocumentGeneralPersistence extends BasePersistence<DocumentGeneral> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentGeneralUtil} to access the document general persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the document general in the entity cache if it is enabled.
	*
	* @param documentGeneral the document general
	*/
	public void cacheResult(
		vn.gt.dao.nhapcanh.model.DocumentGeneral documentGeneral);

	/**
	* Caches the document generals in the entity cache if it is enabled.
	*
	* @param documentGenerals the document generals
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.nhapcanh.model.DocumentGeneral> documentGenerals);

	/**
	* Creates a new document general with the primary key. Does not add the document general to the database.
	*
	* @param id the primary key for the new document general
	* @return the new document general
	*/
	public vn.gt.dao.nhapcanh.model.DocumentGeneral create(long id);

	/**
	* Removes the document general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the document general
	* @return the document general that was removed
	* @throws vn.gt.dao.nhapcanh.NoSuchDocumentGeneralException if a document general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.DocumentGeneral remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchDocumentGeneralException;

	public vn.gt.dao.nhapcanh.model.DocumentGeneral updateImpl(
		vn.gt.dao.nhapcanh.model.DocumentGeneral documentGeneral, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document general with the primary key or throws a {@link vn.gt.dao.nhapcanh.NoSuchDocumentGeneralException} if it could not be found.
	*
	* @param id the primary key of the document general
	* @return the document general
	* @throws vn.gt.dao.nhapcanh.NoSuchDocumentGeneralException if a document general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.DocumentGeneral findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchDocumentGeneralException;

	/**
	* Returns the document general with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the document general
	* @return the document general, or <code>null</code> if a document general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.DocumentGeneral fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document generals.
	*
	* @return the document generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.DocumentGeneral> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the document generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of document generals
	* @param end the upper bound of the range of document generals (not inclusive)
	* @return the range of document generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.DocumentGeneral> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the document generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of document generals
	* @param end the upper bound of the range of document generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of document generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.DocumentGeneral> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the document generals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document generals.
	*
	* @return the number of document generals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DocumentGeneral remove(DocumentGeneral documentGeneral)
		throws SystemException;
}