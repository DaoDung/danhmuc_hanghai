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

import vn.gt.dao.result.model.ResultDeclaration;
import vn.gt.dao.result.service.base.ResultDeclarationLocalServiceBaseImpl;

/**
 * The implementation of the result declaration local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.result.service.ResultDeclarationLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.result.service.base.ResultDeclarationLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil
 */
public class ResultDeclarationLocalServiceImpl extends ResultDeclarationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil} to
	 * access the result declaration local service.
	 */
	
	public List<ResultDeclaration> findResultDeclarationByBusinessTypeCode(int businessTypeCode) {
		try {
			// resultDeclarationPersistence.c
			return resultDeclarationPersistence.findByBusinessTypeCode(businessTypeCode);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<ResultDeclaration>();
	}
	
	public List<ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(int businessTypeCode, long documentName, int documentYear) {
		try {
			return resultDeclarationFinder.findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode, documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<ResultDeclaration>();
	}
	
	public List<ResultDeclaration> DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(int businessTypeCode, long documentName, int documentYear, String requestCode) {
		try {
			return resultDeclarationPersistence.findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode, documentName, documentYear, requestCode);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return new ArrayList<ResultDeclaration>();
	}
	
	public ResultDeclaration findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(int businessTypeCode, long documentName, int documentYear, String requestCode) {
		try {
			return resultDeclarationPersistence.findByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode, documentName, documentYear, requestCode);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultDeclaration> FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(int businessTypeCode, long documentName, int documentYear, String requestCode) {
		try {
			return resultDeclarationPersistence.findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode, documentName, documentYear, requestCode);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return new ArrayList<ResultDeclaration>();
	}
	
	public List<ResultDeclaration> findByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return resultDeclarationPersistence.findByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultDeclaration> findByDocumentNameAndDocumentYearOrderByBusinessOrder(long documentName, int documentYear) {
		try {
			return resultDeclarationFinder.findResultDeclarationByDocumentNameAndDocumentYearOrderByBusiness(documentName, documentYear);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(long documentName, int documentYear) {
		try {
			return resultDeclarationFinder.findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(documentName, documentYear);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearXcReport(long documentName, int documentYear) {
		try {
			return resultDeclarationFinder.findResultDeclarationByDocumentNameAndDocumentYearXcReport(documentName, documentYear);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(long documentName, int documentYear) {
		try {
			return resultDeclarationFinder.findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(documentName, documentYear);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(long documentName, int documentYear) {
		try {
			return resultDeclarationFinder.findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(documentName, documentYear);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countByRequestCode(String requestCode) {
		try {
			return resultDeclarationPersistence.countByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public ResultDeclaration findByRequestCode(String requestCode) {
		try {
			return resultDeclarationPersistence.findByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countByDocumentNameAndBusinessTypeCodeAndDocumentYear(int businessTypeCode, long documentName, int documentYear) {
		try {
			return resultDeclarationPersistence.countByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode, documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int countByDocumentNameAndDocumentYear(long documentName, int documentYear) {
		try {
			return resultDeclarationPersistence.countByDocumentNameAndDocumentYear(documentName, documentYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int countByRequestCodeAndBusinessTypeCode(String requestCode, int businessTypeCode) {
		try {
			return resultDeclarationPersistence.countByRequestCodeAndBusinessTypeCode(requestCode, businessTypeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public List<ResultDeclaration> findByRequestCodeAndBusinessTypeCode(String requestCode, int businessTypeCode) {
		try {
			return resultDeclarationPersistence.findByRequestCodeAndBusinessTypeCode(requestCode, businessTypeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}