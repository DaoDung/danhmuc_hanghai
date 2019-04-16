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

import vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine;
import vn.gt.dao.noticeandmessage.service.base.TempAnimalQuarantineLocalServiceBaseImpl;

/**
 * The implementation of the temp animal quarantine local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempAnimalQuarantineLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalServiceUtil
 */
public class TempAnimalQuarantineLocalServiceImpl extends TempAnimalQuarantineLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalServiceUtil} to access the temp animal quarantine local service.
	 */
	
	public List<TempAnimalQuarantine> findBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempAnimalQuarantineFinder.findBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempAnimalQuarantine> findBydocumentNameAnddocumentYearRequestState(long documentName, int documentYear, int requestState) {
		try {
			return tempAnimalQuarantinePersistence.findBydocumentNameAnddocumentYearRequestState(documentName, documentYear, requestState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempAnimalQuarantineFinder.countBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public List<TempAnimalQuarantine> findByRequestCode(String requestCode) {
		
		try {
			return tempAnimalQuarantinePersistence.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public TempAnimalQuarantine getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempAnimalQuarantineFinder.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempAnimalQuarantine> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) {
		return tempAnimalQuarantineFinder.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	}
	
}