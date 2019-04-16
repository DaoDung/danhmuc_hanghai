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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.result.model.ResultCertificate;
import vn.gt.dao.result.service.base.ResultCertificateLocalServiceBaseImpl;

/**
 * The implementation of the result certificate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.result.service.ResultCertificateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.result.service.base.ResultCertificateLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.ResultCertificateLocalServiceUtil
 */
public class ResultCertificateLocalServiceImpl
	extends ResultCertificateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.result.service.ResultCertificateLocalServiceUtil} to access the result certificate local service.
	 */
	public List<ResultCertificate> findByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return resultCertificatePersistence.findByDocumentNameAnddocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<ResultCertificate>();
	}
	
	public List<ResultCertificate> findByDocumentNameAndDocumentYearAndMaritimeCode(long documentName, int documentYear, String maritimeCode) {
		try {
			return resultCertificatePersistence.findByDocumentNameAnddocumentYearAndMaritimeCode(documentName, documentYear, maritimeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<ResultCertificate>();
	}
	
	public List<ResultCertificate> findByDocumentNameAndDocumentYearAndCertificateCode(long documentName, int documentYear, String certificateCode) {
		try {
			return resultCertificatePersistence.findByDocumentNameAnddocumentYearAndCertificateCode(documentName, documentYear, certificateCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<ResultCertificate>();
	}
	
	public ResultCertificate fetchByF_BY4(long documentName, int documentYear, String certificateCode, String certificateNo) throws SystemException {
		return resultCertificatePersistence.fetchByF_BY4(documentName, documentYear, certificateCode, certificateNo);
	}
	
	public ResultCertificate findByCrewNameAndCertificateCode(long documentName, int documentYear, String certificateCode, String crewName) throws SystemException {
		return resultCertificatePersistence.fetchByCrewNameAndCertificateCode(documentName, documentYear, certificateCode, crewName);
	}
}