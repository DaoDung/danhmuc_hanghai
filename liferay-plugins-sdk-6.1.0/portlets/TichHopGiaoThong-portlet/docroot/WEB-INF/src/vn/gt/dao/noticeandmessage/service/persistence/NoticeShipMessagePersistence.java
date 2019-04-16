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

import vn.gt.dao.noticeandmessage.model.NoticeShipMessage;

/**
 * The persistence interface for the notice ship message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see NoticeShipMessagePersistenceImpl
 * @see NoticeShipMessageUtil
 * @generated
 */
public interface NoticeShipMessagePersistence extends BasePersistence<NoticeShipMessage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NoticeShipMessageUtil} to access the notice ship message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the notice ship message in the entity cache if it is enabled.
	*
	* @param noticeShipMessage the notice ship message
	*/
	public void cacheResult(
		vn.gt.dao.noticeandmessage.model.NoticeShipMessage noticeShipMessage);

	/**
	* Caches the notice ship messages in the entity cache if it is enabled.
	*
	* @param noticeShipMessages the notice ship messages
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.NoticeShipMessage> noticeShipMessages);

	/**
	* Creates a new notice ship message with the primary key. Does not add the notice ship message to the database.
	*
	* @param id the primary key for the new notice ship message
	* @return the new notice ship message
	*/
	public vn.gt.dao.noticeandmessage.model.NoticeShipMessage create(long id);

	/**
	* Removes the notice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the notice ship message
	* @return the notice ship message that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException if a notice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.NoticeShipMessage remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException;

	public vn.gt.dao.noticeandmessage.model.NoticeShipMessage updateImpl(
		vn.gt.dao.noticeandmessage.model.NoticeShipMessage noticeShipMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the notice ship message with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException} if it could not be found.
	*
	* @param id the primary key of the notice ship message
	* @return the notice ship message
	* @throws vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException if a notice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.NoticeShipMessage findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchNoticeShipMessageException;

	/**
	* Returns the notice ship message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the notice ship message
	* @return the notice ship message, or <code>null</code> if a notice ship message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.NoticeShipMessage fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the notice ship messages.
	*
	* @return the notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.NoticeShipMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the notice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of notice ship messages
	* @param end the upper bound of the range of notice ship messages (not inclusive)
	* @return the range of notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.NoticeShipMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the notice ship messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of notice ship messages
	* @param end the upper bound of the range of notice ship messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.NoticeShipMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the notice ship messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of notice ship messages.
	*
	* @return the number of notice ship messages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}