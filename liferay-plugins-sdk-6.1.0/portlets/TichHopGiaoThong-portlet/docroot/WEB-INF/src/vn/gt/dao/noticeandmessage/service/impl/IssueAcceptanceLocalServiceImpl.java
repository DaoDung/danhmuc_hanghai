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

import vn.gt.dao.noticeandmessage.model.IssueAcceptance;
import vn.gt.dao.noticeandmessage.model.IssueAcceptance;
import vn.gt.dao.noticeandmessage.service.base.IssueAcceptanceLocalServiceBaseImpl;

/**
 * The implementation of the issue acceptance local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.IssueAcceptanceLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil
 */
public class IssueAcceptanceLocalServiceImpl
	extends IssueAcceptanceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil} to access the issue acceptance local service.
	 */
	public IssueAcceptance fetchByRequestCode(String requestCode) throws SystemException {
		return issueAcceptancePersistence.fetchByRequestCode(requestCode);
	}
	
	
	public List<IssueAcceptance> findIssueAcceptanceByDocumentYearAndDocumentYear(long documentName, int documentYear) {
		try {
			return issueAcceptanceFinder.findIssueAcceptanceByDocumentYearAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<IssueAcceptance>();
	}
	
	public List<IssueAcceptance> findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(long documentName, int documentYear,
			int requestState) {
		try {
			return issueAcceptanceFinder.findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(documentName, documentYear,
					requestState);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList<IssueAcceptance>();
	}
	
	public int countByDocumentYearAndDocumentYear(long documentName, int documentYear) throws SystemException {
		return issueAcceptanceFinder.countByDocumentYearAndDocumentYear(documentName, documentYear);
	}
	
	public IssueAcceptance findIssueAcceptanceByRequestCode(String requestCode) {
		try {
			return issueAcceptanceFinder.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IssueAcceptance findLastestIssueAcceptanceByPortNameAndCallSign(String nameOfShip, String callSign) {
		try {
			return issueAcceptanceFinder.findLastestIssueAcceptanceByPortNameAndCallSign(nameOfShip, callSign);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IssueAcceptance findByRequestCode(String requestCode) {
		try {
			return issueAcceptanceFinder.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IssueAcceptance getByRequestCode(String requestCode) {
		try {
			return issueAcceptanceFinder.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<IssueAcceptance> findIssueAcceptanceInfo(String requestState, String maritimeCode, String portCode, String shipName,
			String callSign, String shipDateFrom, String shipDateTo, int start, int end) {
		try {
			return issueAcceptanceFinder.findIssueAcceptanceInfo(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, start, end);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countIssueAcceptanceInfo(String requestState, String maritimeCode, String portCode, String shipName, String callSign,
			String shipDateFrom, String shipDateTo) {
		try {
			return issueAcceptanceFinder.countIssueAcceptanceInfo(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<IssueAcceptance> findByDocumentYearAndDocumentYearOrderByColumn(long documentName, int documentYear, String orderByColumn,
			boolean ascOrdesc) {
		try {
			return issueAcceptanceFinder.findByDocumentYearAndDocumentYearOrderByColumn(documentName, documentYear, orderByColumn, ascOrdesc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<IssueAcceptance>();
	}
	
	public int countByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return issueAcceptanceFinder.countByDocumentYearAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public String capGiayPhepSo(String maritimeReference) throws SystemException {
		return issueAcceptanceFinder.capGiayPhepSo(maritimeReference);
	}
}