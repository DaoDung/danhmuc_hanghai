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

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine;
import vn.gt.dao.noticeandmessage.model.TempPlantQuarantine;
import vn.gt.dao.noticeandmessage.service.base.TempPlantQuarantineLocalServiceBaseImpl;

/**
 * The implementation of the temp plant quarantine local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempPlantQuarantineLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 * 
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempPlantQuarantineLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempPlantQuarantineLocalServiceUtil
 */
public class TempPlantQuarantineLocalServiceImpl extends TempPlantQuarantineLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempPlantQuarantineLocalServiceUtil} to access the temp plant quarantine local service.
	 */
	
	public int countBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempPlantQuarantineFinder.countBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempPlantQuarantineFinder.findBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYearRequestState(long documentName, int documentYear, int requestState) {
		try {
			return tempPlantQuarantinePersistence.findBydocumentNameAnddocumentYearRequestState(documentName, documentYear, requestState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempPlantQuarantine> findByRequestCode(java.lang.String requestCode) throws SystemException {
		return tempPlantQuarantinePersistence.findByRequestCode(requestCode);
	}
	
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYear(long documentName, int documentYear, int start, int end)
			throws SystemException {
		return tempPlantQuarantinePersistence.findBydocumentNameAnddocumentYear(documentName, documentYear, start, end);
	}
	
	public TempPlantQuarantine getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempPlantQuarantineFinder.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempPlantQuarantine> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) {
		return tempPlantQuarantineFinder.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	}
	
}