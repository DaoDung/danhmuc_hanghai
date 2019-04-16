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

package vn.gt.dao.result.service.persistence;

/**
 * @author win_64
 */
public interface ResultDeclarationFinder {
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearOrderByBusiness(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearXcReport(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;
}