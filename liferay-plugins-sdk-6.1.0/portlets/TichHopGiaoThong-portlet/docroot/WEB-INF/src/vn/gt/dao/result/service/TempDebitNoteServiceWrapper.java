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

package vn.gt.dao.result.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempDebitNoteService}.
 * </p>
 *
 * @author    win_64
 * @see       TempDebitNoteService
 * @generated
 */
public class TempDebitNoteServiceWrapper implements TempDebitNoteService,
	ServiceWrapper<TempDebitNoteService> {
	public TempDebitNoteServiceWrapper(
		TempDebitNoteService tempDebitNoteService) {
		_tempDebitNoteService = tempDebitNoteService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempDebitNoteService getWrappedTempDebitNoteService() {
		return _tempDebitNoteService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempDebitNoteService(
		TempDebitNoteService tempDebitNoteService) {
		_tempDebitNoteService = tempDebitNoteService;
	}

	public TempDebitNoteService getWrappedService() {
		return _tempDebitNoteService;
	}

	public void setWrappedService(TempDebitNoteService tempDebitNoteService) {
		_tempDebitNoteService = tempDebitNoteService;
	}

	private TempDebitNoteService _tempDebitNoteService;
}