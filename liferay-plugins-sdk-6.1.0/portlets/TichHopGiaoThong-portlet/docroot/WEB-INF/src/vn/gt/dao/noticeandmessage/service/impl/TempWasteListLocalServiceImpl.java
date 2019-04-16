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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.gt.dao.noticeandmessage.model.TempWasteList;
import vn.gt.dao.noticeandmessage.service.base.TempWasteListLocalServiceBaseImpl;

/**
 * The implementation of the temp waste list local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.noticeandmessage.service.TempWasteListLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempWasteListLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempWasteListLocalServiceUtil
 */
public class TempWasteListLocalServiceImpl
	extends TempWasteListLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.noticeandmessage.service.TempWasteListLocalServiceUtil} to access the temp waste list local service.
	 */
	
	public List<TempWasteList> getWasteLists(String requestCode) {
		List<TempWasteList> wasteLists = new ArrayList<TempWasteList>();
		
		try {
			wasteLists = tempWasteListPersistence.findByRequestCode(requestCode);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return wasteLists;
	}
	
	public List<TempWasteList> getWasteLists(long documentName, int documentYear) {
		List<TempWasteList> wasteLists = new ArrayList<TempWasteList>();
		
		try {
			wasteLists = tempWasteListPersistence.findBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return wasteLists;
	}
	
	public TempWasteList getWasteList(String requestCode, String typeCode) {
		TempWasteList wasteList = null;
		
		try {
			wasteList = tempWasteListPersistence.fetchByRequestCode_TypeCode(requestCode, typeCode);
		} catch(SystemException e) {
			_log.error(e);
		}
		
		return wasteList;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(TempWasteListLocalServiceImpl.class);
}