package vn.gt.tichhop.message.haiquan2giaothong;

import java.util.Date;
import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration;
import vn.gt.dao.noticeandmessage.model.TempCrewEffectsItems;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.impl.TempCrewEffectsDeclarationImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempCrewEffectsItemsImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCrewEffectsItemsLocalServiceUtil;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.nsw.Header;
import vn.nsw.model.CrewEffectsDeclaration;
import vn.nsw.model.CrewEffectsDeclaration.ListCrewEffects.CrewEffectItem;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class CrewEffectsDeclaration2Temp {
	
	Log _log = LogFactoryUtil.getLog(CrewEffectsDeclaration2Temp.class);
	
	public boolean insert2Temp(CrewEffectsDeclaration crewEffectsDeclaration, Header header) throws Exception {
	
		try {
			
			insert2TempDocument(crewEffectsDeclaration, header);
			//long id = CounterLocalServiceUtil.increment(TEMP_CREW_EFFECTS_DECLARATION);
			TempCrewEffectsDeclaration object = new TempCrewEffectsDeclarationImpl();
			//object.setId(id);
			object.setRequestCode(header.getReference().getMessageId());
			object.setDocumentName(FormatData.convertToLong(crewEffectsDeclaration.getDocumentName()));
			object.setDocumentYear(FormatData.convertToInt(crewEffectsDeclaration.getDocumentYear()));
			object.setUserCreated(crewEffectsDeclaration.getUserCreated());
			object.setNameOfShip(crewEffectsDeclaration.getNameOfShip());
			object.setImoNumber(crewEffectsDeclaration.getIMONumber());
			object.setCallsign(crewEffectsDeclaration.getCallsign());
			object.setVoyageNumber(crewEffectsDeclaration.getVoyageNumber());
			object.setFlagStateOfShip(crewEffectsDeclaration.getFlagStateOfShip());
			object.setNameOfMaster(crewEffectsDeclaration.getNameOfMaster());
			object.setSignPlace(crewEffectsDeclaration.getSignPlace());
			object.setSignDate(FormatData.parseStringToDate(crewEffectsDeclaration.getSignDate()));
			object.setMasterSigned(FormatData.convertToInt(crewEffectsDeclaration.getMasterSigned()));
			object.setRequestState(CheckBusinessUtil.checkTrangThaiBanKhai(header));
			
			TempCrewEffectsDeclarationLocalServiceUtil.addTempCrewEffectsDeclaration(object);
			List<CrewEffectItem> crewEffectItem = crewEffectsDeclaration.getListCrewEffects().getCrewEffectItem();
			if (crewEffectItem != null && crewEffectItem.size() > 0) {
				for (CrewEffectItem item : crewEffectItem) {
					TempCrewEffectsItems details = new TempCrewEffectsItemsImpl();
					
					details.setRequestCode(object.getRequestCode());
					details.setCrewEffectItemcode(item.getCrewEffectItemCode());
					details.setFamilyName(item.getFamilyName());
					details.setGivenName(item.getGivenName());
					details.setRankOrratingCode(item.getRankOrRatingCode());
					details.setEffectsIneligibleForRelief(item.getEffectsIneligibleForRelief());
					
					//details.setId(CounterLocalServiceUtil.increment(TEMP_CREW_EFFECTS_ITEMS));
					
					try {
						TempCrewEffectsItemsLocalServiceUtil.addTempCrewEffectsItems(details);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			return true;
		} catch (Exception e) {
			_log.error(e);
			e.printStackTrace();
		}
		return false;
	}
	
	public void insert2TempDocument(CrewEffectsDeclaration crewEffectsDeclaration, Header header) throws Exception {
	
		TempDocument tempDocument = new TempDocumentImpl();

		tempDocument.setDocumentTypeCode(String.valueOf(header.getSubject().getDocumentType()));

		tempDocument.setRequestCode(header.getReference().getMessageId());
		tempDocument.setDocumentName(FormatData.convertToLong(crewEffectsDeclaration.getDocumentName()));
		tempDocument.setDocumentYear(FormatData.convertToInt(crewEffectsDeclaration.getDocumentYear()));
		tempDocument.setUserCreated(crewEffectsDeclaration.getUserCreated());
		tempDocument.setShipName(crewEffectsDeclaration.getNameOfShip());
		tempDocument.setImo(crewEffectsDeclaration.getIMONumber());
		tempDocument.setCallSign(crewEffectsDeclaration.getCallsign());
		//tempDocument.set(crewEffectsDeclaration.getVoyageNumber());
		tempDocument.setStateCode(crewEffectsDeclaration.getFlagStateOfShip());
		tempDocument.setShipCaptain(crewEffectsDeclaration.getNameOfMaster());
		//tempDocument.set(crewEffectsDeclaration.getSignPlace());
		//tempDocument.set(crewEffectsDeclaration.getSignDate());
		//tempDocument.set(crewEffectsDeclaration.getMasterSigned());
		tempDocument.setLastModifiedDate(new Date());
		
		BusinessUtils.insert2TempDocument(tempDocument, header, crewEffectsDeclaration);
	}
}
