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

import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage;
import vn.gt.dao.noticeandmessage.service.base.TempNoTiceShipMessageLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the temp no tice ship message local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.TempNoTiceShipMessageLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil
 */
public class TempNoTiceShipMessageLocalServiceImpl extends TempNoTiceShipMessageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil} to access the temp no tice ship message local service.
	 */
	
	public int countBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempNoTiceShipMessagePersistence.countBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<TempNoTiceShipMessage> findByRequestCode(String requestCode) {
		try {
			return tempNoTiceShipMessagePersistence.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(long documentName, int documentYear) {
		try {
			return tempNoTiceShipMessagePersistence.findBydocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public TempNoTiceShipMessage findTempNoTiceShipMessageByRequestCode(String requestCode) {
		try {
			return tempNoTiceShipMessageFinder.findTempNoTiceShipMessageByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public TempNoTiceShipMessage findTempNoTiceShipMessageXbByRequestCode(String requestCode) {
		try {
			return tempNoTiceShipMessageFinder.findTempNoTiceShipMessageXbByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public TempNoTiceShipMessage findTempNoTiceShipMessageTbByRequestCode(String requestCode) {
		try {
			return tempNoTiceShipMessageFinder.findTempNoTiceShipMessageTbByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(long documentName, int documentYear, String noticeShipType)
			throws SystemException {
		return tempNoTiceShipMessageFinder.findBydocumentNameAndDocumentYearAndNoticeShipType(documentName, documentYear, noticeShipType);
	}
	
	public List<TempNoTiceShipMessage> findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(long documentName, int documentYear,
			String noticeShipType, String orderByColumn, boolean ascOrdesc) throws SystemException {
		return tempNoTiceShipMessageFinder.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(documentName, documentYear,
				noticeShipType, orderByColumn, ascOrdesc);
	}
	
	public TempNoTiceShipMessage getXacBaoLastByDocumentNameAndDocumentYear(long documentName, long documentYear) {
		try {
			return tempNoTiceShipMessageFinder.getXacBaoLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public TempNoTiceShipMessage getThongBaoLastByDocumentNameAndDocumentYear(long documentName, long documentYear) {
		try {
			return tempNoTiceShipMessageFinder.getThongBaoLastByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}