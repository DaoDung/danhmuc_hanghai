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

package vn.gt.dao.danhmuc.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.gt.dao.danhmuc.service.ClpSerializer;
import vn.gt.dao.danhmuc.service.DmArrivalPurposeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmDataItemLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmDocTypeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmEnterriseLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmGoodsLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmGoodsTypeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryArrivalPurposeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryEnterriseLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryGoodsLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryGoodsTypeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryMaritimeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryPackageLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryPassportTypeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryPortHarbourLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryPortLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryPortRegionLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryPortWharfLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryRankRatingLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryRepresentativeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistorySecurityLevelLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryShipAgencyLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryShipTypeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryStateLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmHistoryUnitGeneralLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmPackageLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmPassportTypeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmPortWharfLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmRankRatingLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmSecurityLevelLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmShipAgencyLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmShipTypeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmStateLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmSyncCategoryLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmTestN01RequestLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmUnitGeneralLocalServiceUtil;
import vn.gt.dao.danhmuc.service.HistoryRmdcShipLocalServiceUtil;
import vn.gt.dao.danhmuc.service.HistoryRmdcShipServiceUtil;
import vn.gt.dao.danhmuc.service.HistorySyncVersionLocalServiceUtil;
import vn.gt.dao.danhmuc.service.RmdcShipLocalServiceUtil;
import vn.gt.dao.danhmuc.service.RmdcShipServiceUtil;
import vn.gt.dao.danhmuc.service.ThamSoHeThongLocalServiceUtil;
import vn.gt.dao.danhmuc.service.ThamSoHeThongServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			DmArrivalPurposeLocalServiceUtil.clearService();

			DmDataItemLocalServiceUtil.clearService();

			DmDocTypeLocalServiceUtil.clearService();

			DmEnterriseLocalServiceUtil.clearService();

			DmGoodsLocalServiceUtil.clearService();

			DmGoodsTypeLocalServiceUtil.clearService();

			DmHistoryArrivalPurposeLocalServiceUtil.clearService();

			DmHistoryDocTypeLocalServiceUtil.clearService();

			DmHistoryEnterriseLocalServiceUtil.clearService();

			DmHistoryGoodsLocalServiceUtil.clearService();

			DmHistoryGoodsTypeLocalServiceUtil.clearService();

			DmHistoryMaritimeLocalServiceUtil.clearService();

			DmHistoryPackageLocalServiceUtil.clearService();

			DmHistoryPassportTypeLocalServiceUtil.clearService();

			DmHistoryPortLocalServiceUtil.clearService();

			DmHistoryPortHarbourLocalServiceUtil.clearService();

			DmHistoryPortRegionLocalServiceUtil.clearService();

			DmHistoryPortWharfLocalServiceUtil.clearService();

			DmHistoryRankRatingLocalServiceUtil.clearService();

			DmHistoryRepresentativeLocalServiceUtil.clearService();

			DmHistorySecurityLevelLocalServiceUtil.clearService();

			DmHistoryShipAgencyLocalServiceUtil.clearService();

			DmHistoryShipTypeLocalServiceUtil.clearService();

			DmHistoryStateLocalServiceUtil.clearService();

			DmHistoryUnitGeneralLocalServiceUtil.clearService();

			DmMaritimeLocalServiceUtil.clearService();

			DmPackageLocalServiceUtil.clearService();

			DmPassportTypeLocalServiceUtil.clearService();

			DmPortLocalServiceUtil.clearService();

			DmPortHarbourLocalServiceUtil.clearService();

			DmPortRegionLocalServiceUtil.clearService();

			DmPortWharfLocalServiceUtil.clearService();

			DmRankRatingLocalServiceUtil.clearService();

			DmRepresentativeLocalServiceUtil.clearService();

			DmSecurityLevelLocalServiceUtil.clearService();

			DmShipAgencyLocalServiceUtil.clearService();

			DmShipTypeLocalServiceUtil.clearService();

			DmStateLocalServiceUtil.clearService();

			DmSyncCategoryLocalServiceUtil.clearService();

			DmTestN01RequestLocalServiceUtil.clearService();

			DmUnitGeneralLocalServiceUtil.clearService();

			HistoryRmdcShipLocalServiceUtil.clearService();

			HistoryRmdcShipServiceUtil.clearService();
			HistorySyncVersionLocalServiceUtil.clearService();

			RmdcShipLocalServiceUtil.clearService();

			RmdcShipServiceUtil.clearService();
			ThamSoHeThongLocalServiceUtil.clearService();

			ThamSoHeThongServiceUtil.clearService();
		}
	}
}