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

package vn.gt.dao.noticeandmessage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel;
import vn.gt.dao.noticeandmessage.service.base.IssueShiftingOrderChanelLocalServiceBaseImpl;
import vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK;

/**
 * The implementation of the issue shifting order chanel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.noticeandmessage.service.IssueShiftingOrderChanelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.IssueShiftingOrderChanelLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.IssueShiftingOrderChanelLocalServiceUtil
 */
public class IssueShiftingOrderChanelLocalServiceImpl
	extends IssueShiftingOrderChanelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.noticeandmessage.service.IssueShiftingOrderChanelLocalServiceUtil} to access the issue shifting order chanel local service.
	 */
	
	public List<IssueShiftingOrderChanel> findByShiftingOrderId(long shiftingOrderId) {
		try {
			return issueShiftingOrderChanelPersistence.findByShiftingOrderId(shiftingOrderId);
		} catch (SystemException e) {
			return new ArrayList<IssueShiftingOrderChanel>();
		}
	}
	
	public List<IssueShiftingOrderChanel> getShiftingOrderChanel(long shiftingOrderId) throws SystemException {
		return issueShiftingOrderChanelPersistence.findByShiftingOrderId(shiftingOrderId);
	}
	
	public IssueShiftingOrderChanel getShiftingOrderChanel(long shiftingOrderId, String chanelCode) throws SystemException, PortalException {
		IssueShiftingOrderChanelPK issueShiftingOrderChanelPK = new IssueShiftingOrderChanelPK(shiftingOrderId, chanelCode);
		
		return issueShiftingOrderChanelPersistence.findByPrimaryKey(issueShiftingOrderChanelPK);
	}
	
	public IssueShiftingOrderChanel addShiftingOrderChanel(long shiftingOrderId, String chanelCode, String chanelName, int order) throws SystemException, PortalException {
		IssueShiftingOrderChanelPK issueShiftingOrderChanelPK = new IssueShiftingOrderChanelPK(shiftingOrderId, chanelCode);
		
		IssueShiftingOrderChanel issueShiftingOrderChanel = issueShiftingOrderChanelPersistence.fetchByPrimaryKey(issueShiftingOrderChanelPK);
		
		if(issueShiftingOrderChanel == null) {
			issueShiftingOrderChanel = issueShiftingOrderChanelPersistence.create(issueShiftingOrderChanelPK);
			issueShiftingOrderChanel.setChanelName(chanelName);
			issueShiftingOrderChanel.setOrder(order);
		} else {
			issueShiftingOrderChanel.setChanelName(chanelName);
			issueShiftingOrderChanel.setOrder(order);
		}
		
		return issueShiftingOrderChanelPersistence.update(issueShiftingOrderChanel, false);
	}
}