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

package vn.gt.dao.nhapcanh.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DocumentGeneralService}.
 * </p>
 *
 * @author    win_64
 * @see       DocumentGeneralService
 * @generated
 */
public class DocumentGeneralServiceWrapper implements DocumentGeneralService,
	ServiceWrapper<DocumentGeneralService> {
	public DocumentGeneralServiceWrapper(
		DocumentGeneralService documentGeneralService) {
		_documentGeneralService = documentGeneralService;
	}

	public java.util.List<vn.gt.dao.nhapcanh.model.DocumentGeneral> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralService.findAll(start, end);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DocumentGeneralService getWrappedDocumentGeneralService() {
		return _documentGeneralService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDocumentGeneralService(
		DocumentGeneralService documentGeneralService) {
		_documentGeneralService = documentGeneralService;
	}

	public DocumentGeneralService getWrappedService() {
		return _documentGeneralService;
	}

	public void setWrappedService(DocumentGeneralService documentGeneralService) {
		_documentGeneralService = documentGeneralService;
	}

	private DocumentGeneralService _documentGeneralService;
}