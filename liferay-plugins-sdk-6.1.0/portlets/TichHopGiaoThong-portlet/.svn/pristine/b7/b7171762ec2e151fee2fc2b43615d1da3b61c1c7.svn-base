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

import vn.gt.dao.noticeandmessage.model.TempCrewList;
import vn.gt.dao.noticeandmessage.service.base.TempCrewListLocalServiceBaseImpl;

/**
 * The implementation of the temp crew list local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempCrewListLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempCrewListLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempCrewListLocalServiceUtil
 */
public class TempCrewListLocalServiceImpl extends TempCrewListLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempCrewListLocalServiceUtil} to access the temp crew list local service.
	 */
	public List<TempCrewList> findBydocumentNameAnddocumentYear(long documentName, int documentYear) throws SystemException {
		return tempCrewListFinder.findBydocumentNameAnddocumentYear(documentName, documentYear);
	}
	
	public List<TempCrewList> findBydocumentNameAnddocumentYear(long documentName, int documentYear, int start, int end) throws SystemException {
		return tempCrewListPersistence.findBydocumentNameAnddocumentYear(documentName, documentYear, start, end);
	}
	
	public List<vn.gt.dao.noticeandmessage.model.TempCrewList> findByRequestCode(java.lang.String requestCode) throws SystemException {
		return tempCrewListPersistence.findByRequestCode(requestCode);
	}
	
	public TempCrewList findTempCrewListByRequestCode(String requestCode) {
		try {
			return tempCrewListFinder.findTempCrewListByRequestCode(requestCode);
		} catch (Exception es) {
			es.printStackTrace();
		}
		return null;
	}
	
	public TempCrewList getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) throws SystemException {
		try {
			return tempCrewListFinder.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempCrewList> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) throws SystemException {
		return tempCrewListFinder.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	}
}