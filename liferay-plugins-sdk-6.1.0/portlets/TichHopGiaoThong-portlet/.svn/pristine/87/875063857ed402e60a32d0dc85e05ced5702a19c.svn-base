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

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.result.model.ResultHistoryMinistry;
import vn.gt.dao.result.service.base.ResultHistoryMinistryLocalServiceBaseImpl;


/**
 * The implementation of the result history ministry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.result.service.ResultHistoryMinistryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.result.service.base.ResultHistoryMinistryLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.ResultHistoryMinistryLocalServiceUtil
 */
public class ResultHistoryMinistryLocalServiceImpl
	extends ResultHistoryMinistryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.result.service.ResultHistoryMinistryLocalServiceUtil} to access the result history ministry local service.
	 */
	
	public vn.gt.dao.result.model.ResultHistoryMinistry findByRequestCode(
			java.lang.String requestCode){
		try{
			return resultHistoryMinistryPersistence.findByRequestCode(requestCode);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		int documentName, int documentYear){
		try{
			return resultHistoryMinistryPersistence.findByDocumentNameAnddocumentYear(documentName,documentYear);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, String ministryCode){
		try{
			return resultHistoryMinistryPersistence.findByDocumentNameAnddocumentYearAndMinistryCode(documentName, documentYear, ministryCode);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	* Returns all the result history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode){
		try{
			return resultHistoryMinistryPersistence.findByMinistryCode(ministryCode);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultHistoryMinistry> findDistinctMinistryCode(long documentName, int documentYear){
		try {
			return resultHistoryMinistryFinder.findDistinctMinistryCode(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	public List<ResultHistoryMinistry> findLeftJoinMinistryCode(long documentName, int documentYear) {
//		try {
//			return resultHistoryMinistryFinder.findLeftJoinMinistryCode(documentName, documentYear);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//		
//	}
	
	public ResultHistoryMinistry findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(
			long documentName, int documentYear, String ministryCode,String businessTypeCode){
		try {
			return resultHistoryMinistryFinder.findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(documentName,documentYear,ministryCode,businessTypeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
				return null;
		
	}
}