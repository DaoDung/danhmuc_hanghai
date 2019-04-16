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

package vn.gt.dao.noticeandmessage.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.gt.dao.noticeandmessage.service.ClpSerializer;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestFieldLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestFieldServiceUtil;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestServiceUtil;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestFieldLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestFieldServiceUtil;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceForTransitLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceForTransitServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderChanelLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderServiceUtil;
import vn.gt.dao.noticeandmessage.service.ModifyLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.ModifyServiceUtil;
import vn.gt.dao.noticeandmessage.service.NoticeShipMessageLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.NoticeShipMessageServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempAttachmentDeclarationHealthLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempAttachmentDeclarationHealthServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCargoDeclarationServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCargoItemsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCargoItemsServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewDetailsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewDetailsServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsItemsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsItemsServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewListLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewListServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsItemsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsItemsServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForAnimalQuarantineLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForAnimalQuarantineServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForPlantQuarantineLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForPlantQuarantineServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDeclarationOfHealthLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDeclarationOfHealthServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempGoodsItemsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempGoodsItemsServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempHealthCrewPassengerListLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempHealthCrewPassengerListServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempHealthQuestionLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempHealthQuestionServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempMaritimePaymentConfigLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPassengerDetailsServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPassengerListLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPassengerListServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPersonListLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPlantQuarantineLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPlantQuarantineServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipSecurityPortItemsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipSecurityPortItemsServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipStoresItemsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipStoresItemsServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempUnitGeneralLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempUnitGeneralServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempWasteListLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.ViewHoanThanhThuTucLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.ViewHoanThanhThuTucServiceUtil;

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
			HistoryInterfaceRequestLocalServiceUtil.clearService();

			HistoryInterfaceRequestServiceUtil.clearService();
			HistoryInterfaceRequestFieldLocalServiceUtil.clearService();

			HistoryInterfaceRequestFieldServiceUtil.clearService();
			InterfaceRequestLocalServiceUtil.clearService();

			InterfaceRequestServiceUtil.clearService();
			InterfaceRequestFieldLocalServiceUtil.clearService();

			InterfaceRequestFieldServiceUtil.clearService();
			IssueAcceptanceLocalServiceUtil.clearService();

			IssueAcceptanceServiceUtil.clearService();
			IssueAcceptanceForTransitLocalServiceUtil.clearService();

			IssueAcceptanceForTransitServiceUtil.clearService();
			IssuePermissionForTransitLocalServiceUtil.clearService();

			IssuePermissionForTransitServiceUtil.clearService();
			IssuePortClearanceLocalServiceUtil.clearService();

			IssuePortClearanceServiceUtil.clearService();
			IssueShiftingOrderLocalServiceUtil.clearService();

			IssueShiftingOrderServiceUtil.clearService();
			IssueShiftingOrderChanelLocalServiceUtil.clearService();

			ModifyLocalServiceUtil.clearService();

			ModifyServiceUtil.clearService();
			NoticeShipMessageLocalServiceUtil.clearService();

			NoticeShipMessageServiceUtil.clearService();
			TempAnimalQuarantineLocalServiceUtil.clearService();

			TempAnimalQuarantineServiceUtil.clearService();
			TempAttachmentDeclarationHealthLocalServiceUtil.clearService();

			TempAttachmentDeclarationHealthServiceUtil.clearService();
			TempCargoDeclarationLocalServiceUtil.clearService();

			TempCargoDeclarationServiceUtil.clearService();
			TempCargoItemsLocalServiceUtil.clearService();

			TempCargoItemsServiceUtil.clearService();
			TempCrewDetailsLocalServiceUtil.clearService();

			TempCrewDetailsServiceUtil.clearService();
			TempCrewEffectsDeclarationLocalServiceUtil.clearService();

			TempCrewEffectsDeclarationServiceUtil.clearService();
			TempCrewEffectsItemsLocalServiceUtil.clearService();

			TempCrewEffectsItemsServiceUtil.clearService();
			TempCrewListLocalServiceUtil.clearService();

			TempCrewListServiceUtil.clearService();
			TempDangerousGoodsItemsLocalServiceUtil.clearService();

			TempDangerousGoodsItemsServiceUtil.clearService();
			TempDangerousGoodsNanifestLocalServiceUtil.clearService();

			TempDangerousGoodsNanifestServiceUtil.clearService();
			TempDeclarationForAnimalQuarantineLocalServiceUtil.clearService();

			TempDeclarationForAnimalQuarantineServiceUtil.clearService();
			TempDeclarationForPlantQuarantineLocalServiceUtil.clearService();

			TempDeclarationForPlantQuarantineServiceUtil.clearService();
			TempDeclarationOfHealthLocalServiceUtil.clearService();

			TempDeclarationOfHealthServiceUtil.clearService();
			TempDocumentLocalServiceUtil.clearService();

			TempDocumentServiceUtil.clearService();
			TempGeneralDeclarationLocalServiceUtil.clearService();

			TempGeneralDeclarationServiceUtil.clearService();
			TempGoodsItemsLocalServiceUtil.clearService();

			TempGoodsItemsServiceUtil.clearService();
			TempHealthCrewPassengerListLocalServiceUtil.clearService();

			TempHealthCrewPassengerListServiceUtil.clearService();
			TempHealthQuestionLocalServiceUtil.clearService();

			TempHealthQuestionServiceUtil.clearService();
			TempMaritimePaymentConfigLocalServiceUtil.clearService();

			TempNoTiceShipMessageLocalServiceUtil.clearService();

			TempNoTiceShipMessageServiceUtil.clearService();
			TempPassengerDetailsLocalServiceUtil.clearService();

			TempPassengerDetailsServiceUtil.clearService();
			TempPassengerListLocalServiceUtil.clearService();

			TempPassengerListServiceUtil.clearService();
			TempPersonListLocalServiceUtil.clearService();

			TempPlantQuarantineLocalServiceUtil.clearService();

			TempPlantQuarantineServiceUtil.clearService();
			TempShipSecurityMessageLocalServiceUtil.clearService();

			TempShipSecurityMessageServiceUtil.clearService();
			TempShipSecurityPortItemsLocalServiceUtil.clearService();

			TempShipSecurityPortItemsServiceUtil.clearService();
			TempShipStoresDeclarationLocalServiceUtil.clearService();

			TempShipStoresDeclarationServiceUtil.clearService();
			TempShipStoresItemsLocalServiceUtil.clearService();

			TempShipStoresItemsServiceUtil.clearService();
			TempUnitGeneralLocalServiceUtil.clearService();

			TempUnitGeneralServiceUtil.clearService();
			TempWasteListLocalServiceUtil.clearService();

			ViewHoanThanhThuTucLocalServiceUtil.clearService();

			ViewHoanThanhThuTucServiceUtil.clearService();
		}
	}
}