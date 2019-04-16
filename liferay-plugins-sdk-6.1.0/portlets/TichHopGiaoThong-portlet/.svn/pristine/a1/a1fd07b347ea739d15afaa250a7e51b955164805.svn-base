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

package vn.gt.dao.common.service.impl;

import java.util.ArrayList;

import vn.gt.dao.common.model.LogMessageValidation;
import vn.gt.dao.common.service.base.LogMessageValidationLocalServiceBaseImpl;

/**
 * The implementation of the log message validation local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.common.service.LogMessageValidationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.common.service.base.LogMessageValidationLocalServiceBaseImpl
 * @see vn.gt.dao.common.service.LogMessageValidationLocalServiceUtil
 */
public class LogMessageValidationLocalServiceImpl
	extends LogMessageValidationLocalServiceBaseImpl {
	
	public java.util.List<LogMessageValidation> findByDocumentNameDocumentYear(long documentName, int documentYear){
		try{
			
			return logMessageValidationPersistence.findByDocumentNameDocumentYear(documentName, documentYear);
		}catch (Exception e) {
		}
		return new ArrayList<LogMessageValidation>();
	}
}