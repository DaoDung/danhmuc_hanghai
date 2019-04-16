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

import vn.gt.dao.noticeandmessage.model.IssueShiftingOrder;
import vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderImpl;
import vn.gt.dao.noticeandmessage.service.base.IssueShiftingOrderLocalServiceBaseImpl;

/**
 * The implementation of the issue shifting order local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.IssueShiftingOrderLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil
 */
public class IssueShiftingOrderLocalServiceImpl extends IssueShiftingOrderLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil} to access the issue shifting order local service.
	 */
	public List<IssueShiftingOrder> findIssueShiftingOrderByDocumentYearAndDocumentYear(long documentName, int documentYear) {
		try {
			return issueShiftingOrderFinder.findIssueShiftingOrderByDocumentYearAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<IssueShiftingOrder> findIssueShiftingOrderByDocumentYearAndDocumentYear(long documentName, int documentYear, int requestState) {
		try {
			return issueShiftingOrderFinder.findIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName, documentYear,
					requestState);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<IssueShiftingOrder> findByRequestCode(String requestCode) {
		try {
			return issueShiftingOrderPersistence.findByRequestCode(requestCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public IssueShiftingOrder getByRequestCode(String requestCode) {
		try {
			List<IssueShiftingOrder> list = issueShiftingOrderPersistence.findByRequestCode(requestCode);
			if (list != null && list.size() > 0) {
				return list.get(0);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<IssueShiftingOrder> findIssueShiftingOrderInfo(String requestState, String maritimeCode, String portCode, String shipName,
			String callSign, String shipDateFrom, String shipDateTo, String certificateNumber, int start, int end) {
		try {
			return issueShiftingOrderFinder.findIssueShiftingOrderInfo(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, certificateNumber, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public int countIssueShiftingOrderInfo(String requestState, String maritimeCode, String portCode, String shipName, String callSign,
			String shipDateFrom, String shipDateTo, String certificateNumber) {
		try {
			return issueShiftingOrderFinder.countIssueShiftingOrderInfo(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, certificateNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<IssueShiftingOrder> findIssueShiftingOrderInfoByCertificateNumber(String requestState, String maritimeCode, String portCode, String shipName,
			String callSign, String shipDateFrom, String shipDateTo, String certificateNumber, int start, int end) {
		try {
			return issueShiftingOrderFinder.findIssueShiftingOrderInfoByCertificateNumber(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, certificateNumber, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public int countIssueShiftingOrderInfoByCertificateNumber(String requestState, String maritimeCode, String portCode, String shipName, String callSign,
			String shipDateFrom, String shipDateTo, String certificateNumber) {
		try {
			return issueShiftingOrderFinder.countIssueShiftingOrderInfoByCertificateNumber(requestState, maritimeCode, portCode, shipName, callSign, shipDateFrom,
					shipDateTo, certificateNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<IssueShiftingOrder> findByDocumentYearAndDocumentYearOrderByColumn(long documentName, int documentYear, String nameColumn,
			boolean ascOrdesc) {
		try {
			return issueShiftingOrderFinder.findByDocumentYearAndDocumentYearOrderByColumn(documentName, documentYear, nameColumn, ascOrdesc);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<IssueShiftingOrder>();
	}
	
	public IssueShiftingOrder getByDocumentNameAndDocumentYearAndVersionNo(long documentName, int documentYear, String versionNo) {
		try {
			List<IssueShiftingOrder> list = issueShiftingOrderPersistence.findByDocumentNameAndDocumentYearAndVersionNo(documentName, documentYear,
					versionNo.trim());
			if (list != null && list.size() > 0) {
				return list.get(0);
			}
		} catch (SystemException e) {
			_log.error(e);
		}
		return new IssueShiftingOrderImpl();
	}
	
	public IssueShiftingOrder getVersionNoMaxByDocumentYearAndDocumentYear(long documentName, int documentYear) {
		try {
			return issueShiftingOrderFinder.getVersionNoMaxByDocumentYearAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public int countByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return issueShiftingOrderFinder.countByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public String capGiayPhepSo(String maritimeReference) throws SystemException {
		return issueShiftingOrderFinder.capGiayPhepSo(maritimeReference);
	}
	
	private static Log _log = LogFactoryUtil.getLog(IssueShiftingOrderLocalServiceImpl.class);
}