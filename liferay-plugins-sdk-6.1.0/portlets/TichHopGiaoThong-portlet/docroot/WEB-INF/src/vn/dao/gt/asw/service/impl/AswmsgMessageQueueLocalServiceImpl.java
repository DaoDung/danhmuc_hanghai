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

package vn.dao.gt.asw.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dao.gt.asw.model.AswmsgMessageQueue;
import vn.dao.gt.asw.service.base.AswmsgMessageQueueLocalServiceBaseImpl;

/**
 * The implementation of the aswmsg message queue local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dao.gt.asw.service.AswmsgMessageQueueLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win 64
 * @see vn.dao.gt.asw.service.base.AswmsgMessageQueueLocalServiceBaseImpl
 * @see vn.dao.gt.asw.service.AswmsgMessageQueueLocalServiceUtil
 */
public class AswmsgMessageQueueLocalServiceImpl extends AswmsgMessageQueueLocalServiceBaseImpl {
	public List<AswmsgMessageQueue> getListMessage2Queue(int count){
		return aswmsgMessageQueueFinder.getListMessage2Queue(count);
	}
	
	public List<AswmsgMessageQueue> getListMessageQueuePending(String validationCode){
		return aswmsgMessageQueueFinder.getListMessageQueuePending(validationCode);
	}
	
	public boolean updatePriorityAswmsgMessageQueue(int priority, long id) {
		try{
			AswmsgMessageQueue aswmsgMessageQueue = aswmsgMessageQueuePersistence.fetchByPrimaryKey(id);
			
			if(aswmsgMessageQueue != null) {
				aswmsgMessageQueue.setPriority(priority);
				
				aswmsgMessageQueuePersistence.update(aswmsgMessageQueue, false);
			}
			
			return true;
		}catch (SystemException e) {
		
		}
		
		return false;
	}
	
	public boolean updateListMessageQueuePending(String validationCode) {
		try{
			List<AswmsgMessageQueue> listMessageQueuePending = aswmsgMessageQueueFinder.getListMessageQueuePending(validationCode);
			
			for(AswmsgMessageQueue aswmsgMessageQueue : listMessageQueuePending) {
				aswmsgMessageQueue.setSoLanGui(0);
				aswmsgMessageQueue.setValidated(-1);
				
				aswmsgMessageQueuePersistence.update(aswmsgMessageQueue, false);
			
			}
			
			return true;
		}catch (SystemException e) {
		
		}
		
		return false;
	}
}