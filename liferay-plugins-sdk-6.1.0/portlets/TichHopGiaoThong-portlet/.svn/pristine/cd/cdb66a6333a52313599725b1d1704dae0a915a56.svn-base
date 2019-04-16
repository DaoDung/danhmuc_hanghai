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

package vn.gt.dao.result.service.impl;

import java.util.List;

import vn.gt.dao.result.model.ResultNotification;
import vn.gt.dao.result.service.base.ResultNotificationLocalServiceBaseImpl;


/**
 * The implementation of the result notification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.result.service.ResultNotificationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.result.service.base.ResultNotificationLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.ResultNotificationLocalServiceUtil
 */
public class ResultNotificationLocalServiceImpl
	extends ResultNotificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.result.service.ResultNotificationLocalServiceUtil} to access the result notification local service.
	 */
	
	/**
	* Returns all the result notifications where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultNotification> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear){
		try{
			
			return resultNotificationPersistence.findByDocumentNameAnddocumentYear(documentName, documentYear);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ResultNotification findByBusinessTypeCodeOrderbyLastestDate(String businessTypeCode, long documentName, int documentYear) {
		try {
			List<ResultNotification> results = resultNotificationFinder.findByBusinessTypeCodeOrderbyLastestDate(businessTypeCode,
					documentName, documentYear);
			if (results != null && results.size() > 0) {
				return results.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ResultNotification findByBusinessTypeCode(int businessTypeCode, long documentName, int documentYear){
		try {
			List<ResultNotification> resultNotifications = resultNotificationPersistence.findByBusinessTypeCode(businessTypeCode, documentName, documentYear);
			if(resultNotifications != null && resultNotifications.size()>0){
				return resultNotifications.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<ResultNotification> findByMaritimeCodeOrderbyLastestDate(String maritimeCode) {
		return resultNotificationFinder.findByMaritimeCodeOrderbyLastestDate(maritimeCode);
	}
			
}