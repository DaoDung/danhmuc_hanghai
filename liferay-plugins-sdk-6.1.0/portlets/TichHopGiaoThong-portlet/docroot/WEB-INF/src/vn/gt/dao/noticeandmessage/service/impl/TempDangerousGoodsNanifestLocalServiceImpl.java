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

import vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest;
import vn.gt.dao.noticeandmessage.service.base.TempDangerousGoodsNanifestLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the temp dangerous goods nanifest local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempDangerousGoodsNanifestLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalServiceUtil
 */
public class TempDangerousGoodsNanifestLocalServiceImpl extends TempDangerousGoodsNanifestLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalServiceUtil} to access the temp dangerous goods nanifest local service.
	 */
	
	public List<TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYearRequestState(long documentName, int documentYear, int requestState) {
		try {
			return tempDangerousGoodsNanifestPersistence.findBydocumentNameAnddocumentYearRequestState(documentName, documentYear, requestState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempDangerousGoodsNanifest> findByRequestCode(String requestCode) throws SystemException {
		return tempDangerousGoodsNanifestPersistence.findByRequestCode(requestCode);
	}
	
	public int countBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempDangerousGoodsNanifestFinder.countBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempDangerousGoodsNanifestFinder.findBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public TempDangerousGoodsNanifest getLastByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return tempDangerousGoodsNanifestFinder.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempDangerousGoodsNanifest> findByDocumentNameAndDocumentYearOrderByDescRequestDate(long documentName, int documentYear) {
		return tempDangerousGoodsNanifestFinder.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	}
}