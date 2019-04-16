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

package vn.gt.dao.danhmuc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.gt.dao.danhmuc.model.DmDataItem;
import vn.gt.dao.danhmuc.service.base.DmDataItemLocalServiceBaseImpl;

/**
 * The implementation of the dm data item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.DmDataItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmDataItemLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmDataItemLocalServiceUtil
 */
public class DmDataItemLocalServiceImpl extends DmDataItemLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmDataItemLocalServiceUtil} to access the dm data item local service.
	 */
	
	public DmDataItem findByDataGroupIdAndCode0(long DataGroupId, String Code0) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndCode0(DataGroupId, Code0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmDataItem> findByDataGroupId(long DataGroupId) {
		try {
			return dmDataItemPersistence.findByDataGroupId(DataGroupId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByDataGroupIdAndLevel(long DataGroupId, int Level) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndLevel(DataGroupId, Level);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByDataGroupIdAndLevelandShortName(long DataGroupId, int Level, String ShortName) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndLevelandShortName(DataGroupId, Level, ShortName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByDataGroupIdAndNode1(long DataGroupId, String Node1) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndNode1(DataGroupId, Node1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByDataGroupIdAndShortName(long DataGroupId, String ShortName) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndShortName(DataGroupId, ShortName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> getAllByDataGroupID(long datagroupid, int start, int end)  {
		try {
			return dmDataItemFinder.getAllByDataGroupID(datagroupid, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<DmDataItem>();
	}
	
	public DmDataItem getByNode2AndDataGroupID(long datagroupid, String node2)  {
		try {
			return dmDataItemFinder.getByNode2AndDataGroupID(datagroupid, node2);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<DmDataItem> getAllByNode1Node2AndDataGroupID(long datagroupid, String node1, String node2, int start, int end)  {
		try {
			return dmDataItemFinder.getAllByNode1Node2AndDataGroupID(datagroupid, node1, node2, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<DmDataItem>();
	}
	
	public int countByNode1Node2AndDataGroupID(long datagroupid, String node1, String node2, int start, int end)  {
		try {
			return dmDataItemFinder.countByNode1Node2AndDataGroupID(datagroupid, node1, node2, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(DmDataItemLocalServiceImpl.class);
}