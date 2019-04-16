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

package vn.gt.dao.result.service.impl;

import java.util.List;

import vn.gt.dao.result.model.ResultMinistry;
import vn.gt.dao.result.service.base.ResultMinistryLocalServiceBaseImpl;

/**
 * The implementation of the result ministry local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.result.service.ResultMinistryLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.result.service.base.ResultMinistryLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.ResultMinistryLocalServiceUtil
 */
public class ResultMinistryLocalServiceImpl extends ResultMinistryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link vn.gt.dao.result.service.ResultMinistryLocalServiceUtil} to
	 * access the result ministry local service.
	 */
	
	/**
	 * Returns the result ministry where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; and businessTypeCode = &#63; or throws
	 * a {@link vn.gt.dao.result.NoSuchResultMinistryException} if it could not be found.
	 *
	 * @param documentName
	 *            the document name
	 * @param documentYear
	 *            the document year
	 * @param ministryCode
	 *            the ministry code
	 * @param businessTypeCode
	 *            the business type code
	 * @return the matching result ministry
	 * @throws vn.gt.dao.result.NoSuchResultMinistryException
	 *             if a matching result ministry could not be found
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public List<ResultMinistry> findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(int documentName, int documentYear,
			String ministryCode, int businessTypeCode) {
		try {
			return resultMinistryFinder.findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(documentName, documentYear, ministryCode,
					businessTypeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultMinistry> findDistinctMinistryCode(long documentName, int documentYear) {
		try {
			return resultMinistryFinder.findDistinctMinistryCode(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultMinistry> findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(long documentName, int documentYear,
			String ministryCode, String businessTypeCode) {
		try {
			return resultMinistryFinder.findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(documentName, documentYear, ministryCode,
					businessTypeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultMinistry> findDocNameAndDocYearAndMinistryCode(int documentName, int documentYear, String ministryCode) {
		try {
			return resultMinistryPersistence.findByDocNameAndDocYearAndMinistryCode(documentName, documentYear, ministryCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ResultMinistry findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodePhanHoi(long documentName, int documentYear,
			String ministryCode, String lstBusinessTypeCode) {
		try {
			List<ResultMinistry> resultMinistrys = resultMinistryFinder.findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(documentName,
					documentYear, ministryCode, lstBusinessTypeCode);
			if (resultMinistrys != null && resultMinistrys.size() > 0) {
				return resultMinistrys.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}