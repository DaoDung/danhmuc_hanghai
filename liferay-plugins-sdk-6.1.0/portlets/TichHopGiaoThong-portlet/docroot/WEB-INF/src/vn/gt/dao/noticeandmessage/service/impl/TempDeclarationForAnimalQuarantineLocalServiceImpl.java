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

import vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine;
import vn.gt.dao.noticeandmessage.service.base.TempDeclarationForAnimalQuarantineLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;


/**
 * The implementation of the temp declaration for animal quarantine local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.noticeandmessage.service.TempDeclarationForAnimalQuarantineLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempDeclarationForAnimalQuarantineLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempDeclarationForAnimalQuarantineLocalServiceUtil
 */
public class TempDeclarationForAnimalQuarantineLocalServiceImpl
	extends TempDeclarationForAnimalQuarantineLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.noticeandmessage.service.TempDeclarationForAnimalQuarantineLocalServiceUtil} to access the temp declaration for animal quarantine local service.
	 */
	
	
	/**
	* Returns all the temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear){
		try{
			return tempDeclarationForAnimalQuarantinePersistence.findBydocumentNameAnddocumentYear(documentName,documentYear);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(
			long documentName, int documentYear, int requestState){
			try{
				return tempDeclarationForAnimalQuarantinePersistence.findBydocumentNameAnddocumentYearRequestState(documentName, documentYear, requestState);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

	/**
	* Returns the number of temp declaration for animal quarantines where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear){
		try{
			return tempDeclarationForAnimalQuarantinePersistence.countBydocumentNameAnddocumentYear(documentName, documentYear);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<TempDeclarationForAnimalQuarantine> findByRequestCode(String requestCode) throws SystemException {
		try {
			return tempDeclarationForAnimalQuarantinePersistence.findByRequestCode(requestCode);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
}