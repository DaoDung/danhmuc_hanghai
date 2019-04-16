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


import vn.gt.dao.noticeandmessage.model.TempCargoItems;
import vn.gt.dao.noticeandmessage.service.base.TempCargoItemsLocalServiceBaseImpl;

/**
 * The implementation of the temp cargo items local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.noticeandmessage.service.TempCargoItemsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempCargoItemsLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempCargoItemsLocalServiceUtil
 */
public class TempCargoItemsLocalServiceImpl extends TempCargoItemsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.noticeandmessage.service.TempCargoItemsLocalServiceUtil} to access the temp cargo items local service.
	 */
	public List<TempCargoItems> findByRequestCode(String requestCode) {
		try {
			return tempCargoItemsPersistence.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<TempCargoItems>();
	}
	
	public List<TempCargoItems> findBydocumentNameAnddocumentYearAndRequestCode(long documentName, int documentYear, String requestCode) {
		try {
			return tempCargoItemsPersistence.findBydocumentNameAnddocumentYearAndRequestCode(documentName, documentYear, requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<TempCargoItems>();
	}
	
	public List<TempCargoItems> findBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempCargoItemsPersistence.findBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<TempCargoItems>();
	}
}