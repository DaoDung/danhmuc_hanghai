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

import vn.gt.dao.noticeandmessage.model.TempCargoDeclaration;
import vn.gt.dao.noticeandmessage.model.impl.TempCargoDeclarationImpl;
import vn.gt.dao.noticeandmessage.service.base.TempCargoDeclarationLocalServiceBaseImpl;

/**
 * The implementation of the temp cargo declaration local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempCargoDeclarationLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalServiceUtil
 */
public class TempCargoDeclarationLocalServiceImpl extends TempCargoDeclarationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalServiceUtil} to access the temp cargo declaration local service.
	 */
	
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYearRequestState(long documentName, int documentYear, int requestState) {
		try {
			return tempCargoDeclarationPersistence.findBydocumentNameAnddocumentYearRequestState(documentName, documentYear, requestState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countBydocumentNameAnddocumentYear(long documentName, int documentYear) throws SystemException {
		return tempCargoDeclarationPersistence.countBydocumentNameAnddocumentYear(documentName, documentYear);
	}
	
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYear(long documentName, int documentYear, int start, int end)
			throws SystemException {
		return tempCargoDeclarationPersistence.findBydocumentNameAnddocumentYear(documentName, documentYear, start, end);
	}
	
	public List<TempCargoDeclaration> findByRequestCode(java.lang.String requestCode) throws SystemException {
		return tempCargoDeclarationPersistence.findByRequestCode(requestCode);
	}
	
	public TempCargoDeclaration findTempCargoDeclarationByRequestCode(String requestCode) {
		try {
			return tempCargoDeclarationFinder.findTempCargoDeclarationByRequestCode(requestCode);
		} catch (Exception es) {
			es.printStackTrace();
		}
		return null;
	}
	
	public List<TempCargoDeclaration> findBydocumentNameAnddocumentYear(long documentName, int documentYear) throws SystemException {
		return tempCargoDeclarationFinder.findBydocumentNameAnddocumentYear(documentName, documentYear);
	}
	
	public TempCargoDeclaration getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempCargoDeclarationFinder.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new TempCargoDeclarationImpl();
	}
	
	public List<TempCargoDeclaration> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) throws SystemException {
		return tempCargoDeclarationFinder.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	}
	
}