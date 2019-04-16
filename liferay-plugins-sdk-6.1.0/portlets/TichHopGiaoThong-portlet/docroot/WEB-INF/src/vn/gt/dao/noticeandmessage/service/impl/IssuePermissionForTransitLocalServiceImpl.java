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

import vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException;
import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit;
import vn.gt.dao.noticeandmessage.model.IssuePortClearance;
import vn.gt.dao.noticeandmessage.model.impl.IssuePermissionForTransitImpl;
import vn.gt.dao.noticeandmessage.service.base.IssuePermissionForTransitLocalServiceBaseImpl;

/**
 * The implementation of the issue permission for transit local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.IssuePermissionForTransitLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil
 */
public class IssuePermissionForTransitLocalServiceImpl extends IssuePermissionForTransitLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil} to access the issue permission for transit local service.
	 */
	public List<IssuePermissionForTransit> findIssuePermissionForTransitByDocumentYearAndDocumentYear(long documentName, int documentYear) {
		try {
			return issuePermissionForTransitPersistence.findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
		}
		
		return null;
	}
	
	public IssuePermissionForTransit findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(long documentName, int documentYear,
			int requestState) {
		try {
			return issuePermissionForTransitFinder.findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
					documentYear, requestState);
		} catch (Exception e) {
		}
		
		return null;
	}
	
	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByrequestCode(java.lang.String requestCode)
			throws com.liferay.portal.kernel.exception.SystemException {
		return issuePermissionForTransitPersistence.findByrequestCode(requestCode);
	}
	
	public IssuePermissionForTransit getByrequestCode(String requestCode) {
		try {
			List<IssuePermissionForTransit> list = issuePermissionForTransitPersistence.findByrequestCode(requestCode);
			if (list != null && list.size() > 0) {
				return list.get(0);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(long documentName,
			int documentYear) throws com.liferay.portal.kernel.exception.SystemException {
		return issuePermissionForTransitPersistence.findBydocumentNameAndDocumentYear(documentName, documentYear);
	}
	
	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(long documentName,
			int documentYear, int start, int end) throws com.liferay.portal.kernel.exception.SystemException {
		return issuePermissionForTransitPersistence.findBydocumentNameAndDocumentYear(documentName, documentYear, start, end);
	}
	
	public List<IssuePermissionForTransit> findIssuePermissionForTransitInfo(String requestState, String maritimeCode, String portCode,
			String shipName, String callSign, String shipDateFrom, String shipDateTo, String certificateNumber, int start, int end) {
		try {
			return issuePermissionForTransitFinder.findIssuePermissionForTransitInfo(requestState, maritimeCode, portCode, shipName, callSign,
					shipDateFrom, shipDateTo, certificateNumber, start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countIssuePermissionForTransitInfo(String requestState, String maritimeCode, String portCode, String shipName, String callSign,
			String shipDateFrom, String shipDateTo, String certificateNumber) {
		try {
			return issuePermissionForTransitFinder.countIssuePermissionForTransitInfo(requestState, maritimeCode, portCode, shipName, callSign,
					shipDateFrom, shipDateTo, certificateNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<IssuePermissionForTransit> findIssuePermissionForTransitInfoByCertificateNumber(String requestState, String maritimeCode, String portCode,
			String shipName, String callSign, String shipDateFrom, String shipDateTo, String certificateNumber, int start, int end) {
		try {
			return issuePermissionForTransitFinder.findIssuePermissionForTransitInfoByCertificateNumber(requestState, maritimeCode, portCode, shipName, callSign,
					shipDateFrom, shipDateTo, certificateNumber, start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countIssuePermissionForTransitInfoByCertificateNumber(String requestState, String maritimeCode, String portCode, String shipName, String callSign,
			String shipDateFrom, String shipDateTo, String certificateNumber) {
		try {
			return issuePermissionForTransitFinder.countIssuePermissionForTransitInfoByCertificateNumber(requestState, maritimeCode, portCode, shipName, callSign,
					shipDateFrom, shipDateTo, certificateNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int countByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return issuePermissionForTransitFinder.countByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<IssuePermissionForTransit> findByDocumentYearAndDocumentYearOrderByColumn(long documentName, int documentYear, String orderByColumn,
			boolean ascOrdesc) {
		try {
			return issuePermissionForTransitFinder.findByDocumentYearAndDocumentYearOrderByColumn(documentName, documentYear, orderByColumn,
					ascOrdesc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<IssuePermissionForTransit>();
	}
	
	public IssuePermissionForTransit getByDocumentNameAndDocumentYearAndVersionNo(long documentName, int documentYear, String versionNo) {
		try {
			return issuePermissionForTransitPersistence.findByDocumentNameAndDocumentYearAndVersionNo(documentName, documentYear, versionNo);
		} catch (NoSuchIssuePermissionForTransitException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String capGiayPhepSo(String maritimeReference) throws SystemException {
		return issuePermissionForTransitFinder.capGiayPhepSo(maritimeReference);
	}
	
	public IssuePermissionForTransit findByF_LAST_numberPortClearance(long documentName, int documentYear, String numberPortClearance) {
		try {
			return issuePermissionForTransitPersistence.findByF_LAST_numberPortClearance_First(documentName, documentYear, numberPortClearance, null);
		} catch (Exception e) {
			return null;
		}
	}
	
}