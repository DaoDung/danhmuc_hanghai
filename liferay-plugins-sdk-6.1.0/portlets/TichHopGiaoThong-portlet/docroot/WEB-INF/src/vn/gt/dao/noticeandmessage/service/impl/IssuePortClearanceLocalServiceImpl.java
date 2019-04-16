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
import vn.gt.dao.noticeandmessage.NoSuchIssuePortClearanceException;
import vn.gt.dao.noticeandmessage.model.IssuePortClearance;
import vn.gt.dao.noticeandmessage.model.impl.IssuePortClearanceImpl;
import vn.gt.dao.noticeandmessage.service.base.IssuePortClearanceLocalServiceBaseImpl;
import vn.gt.dao.noticeandmessage.service.persistence.IssuePortClearanceFinder;

/**
 * The implementation of the issue port clearance local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.IssuePortClearanceLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil
 */
public class IssuePortClearanceLocalServiceImpl extends IssuePortClearanceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil} to access the issue port clearance local service.
	 */
	
	public List<IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYear(long documentName, int documentYear) {
		try {
			return issuePortClearanceFinder.findIssuePortClearanceByDocumentYearAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<IssuePortClearance>();
	}
	
	public List<IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(long documentName, int documentYear,
			int requestState) {
		try {
			return issuePortClearancePersistence.findByfindIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName, documentYear,
					requestState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<IssuePortClearance>();
	}
	
	public int countByDocumentYearAndDocumentYear(long documentName, int documentYear) throws SystemException {
		return issuePortClearanceFinder.countByDocumentYearAndDocumentYear(documentName, documentYear);
	}
	
	public List<IssuePortClearance> findIssuePortClearanceByRequestCode(String requestCode) {
		try {
			return issuePortClearancePersistence.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IssuePortClearance findLastestIssuePortClearanceByPortNameAndCallSign(String nameOfShip, String callSign) {
		try {
			return issuePortClearanceFinder.findLastestIssuePortClearanceByPortNameAndCallSign(nameOfShip, callSign);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IssuePortClearance findLatestCertificateOfIssuePortClearance(String nameOfShip, String callSign, String certificateNo) {
		try {
			return issuePortClearanceFinder.findLatestCertificateOfIssuePortClearance(nameOfShip, callSign, certificateNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IssuePortClearance findByRequestCode(String requestCode) {
		try {
			return issuePortClearanceFinder.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IssuePortClearance getByRequestCode(String requestCode) {
		try {
			return issuePortClearanceFinder.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<IssuePortClearance> findIssuePortClearanceInfo(String requestState, String maritimeCode, String portCode, String shipName,
			String callSign, String shipDateFrom, String shipDateTo, String certificateNumber, int start, int end) {
		try {
			return issuePortClearanceFinder.findIssuePortClearanceInfo(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, certificateNumber, start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countIssuePortClearanceInfo(String requestState, String maritimeCode, String portCode, String shipName, String callSign,
			String shipDateFrom, String shipDateTo, String certificateNumber) {
		try {
			return issuePortClearanceFinder.countIssuePortClearanceInfo(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, certificateNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	

	public List<IssuePortClearance> findIssuePortClearanceInfoByCertificateNumber(String requestState, String maritimeCode, String portCode, String shipName,
			String callSign, String shipDateFrom, String shipDateTo, String certificateNumber, int start, int end) {
		try {
			return issuePortClearanceFinder.findIssuePortClearanceInfoByCertificateNumber(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, certificateNumber, start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countIssuePortClearanceInfoByCertificateNumber(String requestState, String maritimeCode, String portCode, String shipName, String callSign,
			String shipDateFrom, String shipDateTo, String certificateNumber) {
		try {
			return issuePortClearanceFinder.countIssuePortClearanceInfoByCertificateNumber(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, certificateNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<IssuePortClearance> findByDocumentYearAndDocumentYearOrderByColumn(long documentName, int documentYear, String orderByColumn,
			boolean ascOrdesc) {
		try {
			return issuePortClearanceFinder.findByDocumentYearAndDocumentYearOrderByColumn(documentName, documentYear, orderByColumn, ascOrdesc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<IssuePortClearance>();
	}
	
	public int countByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return issuePortClearanceFinder.countByDocumentYearAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public String capGiayPhepSo(String maritimeReference) throws SystemException {
		return issuePortClearanceFinder.capGiayPhepSo(maritimeReference);
	}
	
	public IssuePortClearance findByF_LAST_numberPortClearance(long documentName, int documentYear, String numberPortClearance) {
		try {
			return issuePortClearancePersistence.findByF_LAST_numberPortClearance_First(numberPortClearance, null);
		} catch (Exception e) {
			return null;
		}
	}
}