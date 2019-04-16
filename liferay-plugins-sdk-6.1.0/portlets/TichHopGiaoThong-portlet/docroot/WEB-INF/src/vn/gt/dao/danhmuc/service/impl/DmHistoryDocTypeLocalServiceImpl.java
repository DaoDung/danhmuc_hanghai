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

package vn.gt.dao.danhmuc.service.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException;
import vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException;
import vn.gt.dao.danhmuc.service.base.DmHistoryDocTypeLocalServiceBaseImpl;

/**
 * The implementation of the dm history doc type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmHistoryDocTypeLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalServiceUtil
 */
public class DmHistoryDocTypeLocalServiceImpl
	extends DmHistoryDocTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalServiceUtil} to access the dm history doc type local service.
	 */
	public vn.gt.dao.danhmuc.model.DmHistoryDocType findByDocumentType(String documentType) {
		try {
			return dmHistoryDocTypePersistence.findByDocumentType(documentType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public vn.gt.dao.danhmuc.model.DmHistoryDocType findByDocumentTypeAndSyncVersion(
			String documentType, String syncVersion) {
		try {
			return dmHistoryDocTypePersistence.findByDocumentTypeAndSyncVersion(documentType, syncVersion);
		} catch (NoSuchDmHistoryDocTypeException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
}