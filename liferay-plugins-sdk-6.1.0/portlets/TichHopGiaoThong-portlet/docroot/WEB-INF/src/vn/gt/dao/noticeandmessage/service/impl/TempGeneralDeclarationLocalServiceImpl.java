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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration;
import vn.gt.dao.noticeandmessage.service.base.TempGeneralDeclarationLocalServiceBaseImpl;

/**
 * The implementation of the temp general declaration local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempGeneralDeclarationLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil
 */
public class TempGeneralDeclarationLocalServiceImpl extends TempGeneralDeclarationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil} to access the temp general declaration local service.
	 */
	
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYearRequestState(long documentName, int documentYear, int requestState) {
		try {
			return tempGeneralDeclarationPersistence.findByDocumentNameAndDocumentYearRequestState(documentName, documentYear, requestState);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<TempGeneralDeclaration> findByRequestCode(String requestCode) {
		try {
			return tempGeneralDeclarationPersistence.findByRequestCode(requestCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public int countByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempGeneralDeclarationPersistence.countByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempGeneralDeclarationFinder.findByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public TempGeneralDeclaration findTempGeneralDeclarationByRequestCode(String requestCode) {
		try {
			return tempGeneralDeclarationFinder.findTempGeneralDeclarationByRequestCode(requestCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public TempGeneralDeclaration getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempGeneralDeclarationFinder.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public TempGeneralDeclaration getByRequestCode(String requestCode) {
		try {
			return tempGeneralDeclarationFinder.getByRequestCode(requestCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<TempGeneralDeclaration> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) {
		return tempGeneralDeclarationFinder.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	}
	
	private static Log _log = LogFactoryUtil.getLog(TempGeneralDeclarationLocalServiceImpl.class);
}