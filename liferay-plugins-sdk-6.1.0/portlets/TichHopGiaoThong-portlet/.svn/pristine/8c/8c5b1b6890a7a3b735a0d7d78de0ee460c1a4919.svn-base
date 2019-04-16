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

package vn.gt.dao.nhapcanh.service.impl;

import vn.gt.dao.nhapcanh.service.base.DocumentGeneralLocalServiceBaseImpl;


/**
 * The implementation of the document general local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.nhapcanh.service.DocumentGeneralLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.nhapcanh.service.base.DocumentGeneralLocalServiceBaseImpl
 * @see vn.gt.dao.nhapcanh.service.DocumentGeneralLocalServiceUtil
 */
public class DocumentGeneralLocalServiceImpl
	extends DocumentGeneralLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.nhapcanh.service.DocumentGeneralLocalServiceUtil} to access the document general local service.
	 */

	public java.util.List<vn.gt.dao.nhapcanh.model.DocumentGeneral> findAll(
			int start, int end)
			{
		try{
		return documentGeneralPersistence.findAll(start, end);
		}catch (Exception e) {
			return null;
		}
	}
	
	/**
	* Returns the number of document generals.
	*
	* @return the number of document generals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll(){
		try{
			return documentGeneralPersistence.countAll();
			}catch (Exception e) {
				return 0;
			}
		
	}
}