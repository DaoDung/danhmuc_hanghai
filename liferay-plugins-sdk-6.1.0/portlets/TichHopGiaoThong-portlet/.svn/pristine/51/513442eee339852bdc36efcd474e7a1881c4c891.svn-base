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

package vn.gt.dao.noticeandmessage.service.impl;

import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage;
import vn.gt.dao.noticeandmessage.service.base.TempShipSecurityMessageLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the temp ship security message local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempShipSecurityMessageLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalServiceUtil
 */
public class TempShipSecurityMessageLocalServiceImpl extends TempShipSecurityMessageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalServiceUtil} to access the temp ship security message local service.
	 */
	public List<TempShipSecurityMessage> findBydocumentNameAnddocumentYearRequestState(long documentName, int documentYear, int requestState) {
		try {
			return tempShipSecurityMessagePersistence.findBydocumentNameAnddocumentYearRequestState(documentName, documentYear, requestState);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int countBydocumentNameAnddocumentYear(long documentName, int documentYear) throws SystemException {
		return tempShipSecurityMessagePersistence.countBydocumentNameAnddocumentYear(documentName, documentYear);
	}
	
	public List<TempShipSecurityMessage> findByRequestCode(java.lang.String requestCode) throws SystemException {
		return tempShipSecurityMessagePersistence.findByRequestCode(requestCode);
	}
	
	public TempShipSecurityMessage getByRequestCode(String requestCode) throws SystemException {
		return tempShipSecurityMessageFinder.getByRequestCode(requestCode);
	}
	
	public List<TempShipSecurityMessage> findBydocumentNameAndDocumentYear(long documentName, int documentYear, int start, int end)
			throws SystemException {
		return tempShipSecurityMessagePersistence.findBydocumentNameAnddocumentYear(documentName, documentYear, start, end);
	}
	
	public List<TempShipSecurityMessage> findBydocumentNameAnddocumentYear(long documentName, int documentYear) throws SystemException {
		return tempShipSecurityMessageFinder.findBydocumentNameAnddocumentYear(documentName, documentYear);
	}
	
	public TempShipSecurityMessage getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempShipSecurityMessageFinder.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempShipSecurityMessage> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) {
		return tempShipSecurityMessageFinder.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	}
}