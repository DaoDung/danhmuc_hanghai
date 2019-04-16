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
public interface ResultMinistryFinder {
	public java.util.List<vn.gt.dao.result.model.ResultMinistry> findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
		int documentName, int documentYear, java.lang.String ministryCode,
		int businessTypeCode);

	public java.util.List<vn.gt.dao.result.model.ResultMinistry> findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		java.lang.String lstBusinessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.result.model.ResultMinistry> findDistinctMinistryCode(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;
}