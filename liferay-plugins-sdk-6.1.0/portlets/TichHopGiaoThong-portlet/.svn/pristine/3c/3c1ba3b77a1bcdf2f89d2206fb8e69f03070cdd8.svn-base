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

import vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration;
import vn.gt.dao.noticeandmessage.service.base.TempCrewEffectsDeclarationLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the temp crew effects declaration local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempCrewEffectsDeclarationLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalServiceUtil
 */
public class TempCrewEffectsDeclarationLocalServiceImpl extends TempCrewEffectsDeclarationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalServiceUtil} to access the temp crew effects declaration local service.
	 */
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYear(long documentName, int documentYear) throws SystemException {
		return tempCrewEffectsDeclarationFinder.findBydocumentNameAnddocumentYear(documentName, documentYear);
	}
	
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYear(long documentName, int documentYear, int start, int end)
			throws SystemException {
		return tempCrewEffectsDeclarationPersistence.findBydocumentNameAnddocumentYear(documentName, documentYear, start, end);
	}
	
	public List<TempCrewEffectsDeclaration> findByRequestCode(java.lang.String requestCode) throws SystemException {
		return tempCrewEffectsDeclarationPersistence.findByRequestCode(requestCode);
	}
	
	public int countBydocumentNameAnddocumentYear(long documentName, int documentYear) throws SystemException {
		return tempCrewEffectsDeclarationFinder.countBydocumentNameAnddocumentYear(documentName, documentYear);
	}
	
	public TempCrewEffectsDeclaration findTempCrewEffectsDeclarationByRequestCode(String requestCode) {
		try {
			return tempCrewEffectsDeclarationFinder.findTempCrewEffectsDeclarationByRequestCode(requestCode);
		} catch (Exception es) {
			es.printStackTrace();
		}
		return null;
	}
	
	public List<TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYearRequestState(long documentName, int documentYear, int requestState) {
		try {
			return tempCrewEffectsDeclarationPersistence.findBydocumentNameAnddocumentYearRequestState(documentName, documentYear, requestState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public TempCrewEffectsDeclaration getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempCrewEffectsDeclarationFinder.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempCrewEffectsDeclaration> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) {
		return tempCrewEffectsDeclarationFinder.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	}
}