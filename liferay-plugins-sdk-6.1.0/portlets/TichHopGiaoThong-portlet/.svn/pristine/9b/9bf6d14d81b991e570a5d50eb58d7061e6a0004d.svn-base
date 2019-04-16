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

package vn.gt.dao.danhmucgt.service.impl;

import vn.gt.dao.danhmucgt.service.base.DmMinistryLocalServiceBaseImpl;


/**
 * The implementation of the dm ministry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmucgt.service.DmMinistryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmucgt.service.base.DmMinistryLocalServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.DmMinistryLocalServiceUtil
 */
public class DmMinistryLocalServiceImpl extends DmMinistryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmucgt.service.DmMinistryLocalServiceUtil} to access the dm ministry local service.
	 */
	
	public vn.gt.dao.danhmucgt.model.DmMinistry findByMinistryCode(
			java.lang.String ministryCode){
		try{
			
			return dmMinistryPersistence.findByMinistryCode(ministryCode);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	* Returns the number of dm ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the number of matching dm ministries
	* @throws SystemException if a system exception occurred
	*/
	public int countByMinistryCode(java.lang.String ministryCode){
		try{
			return dmMinistryPersistence.countByMinistryCode(ministryCode);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}