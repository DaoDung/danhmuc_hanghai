package vn.gt.tichhop.message.haiquan2giaothong;

import java.util.Date;

import vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.impl.TempAnimalQuarantineImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl;
import vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalServiceUtil;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.nsw.Header;
import vn.nsw.model.DeclarationForAnimalQuarantine;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DeclarationForAnimalQuarantine2Temp {
	
	Log _log = LogFactoryUtil.getLog(DeclarationForAnimalQuarantine2Temp.class);
	
	public boolean insert2Temp(DeclarationForAnimalQuarantine animalQuarantine, Header header) throws Exception{
		
		try{
			
			insert2TempDocument(animalQuarantine, header);
			
			TempAnimalQuarantine object=new TempAnimalQuarantineImpl();
			
			// chua build service bang temp
			
			object.setDocumentName(FormatData.convertToLong(animalQuarantine.getDocumentName()));
			object.setDocumentYear(FormatData.convertToInt(animalQuarantine.getDocumentYear()));
//			object.set(animalQuarantine.getDocumentYear());
			object.setUserCreated(animalQuarantine.getUserCreated());
			object.setNameOfShip(animalQuarantine.getNameOfShip());
			object.setFlagStateOfShip(animalQuarantine.getFlagStateOfShip());
			object.setNumberOfCrew(FormatData.convertToInt(animalQuarantine.getNumberOfCrew()));
			object.setNumberOfPassengers(FormatData.convertToInt(animalQuarantine.getNumberOfPassengers()));
			object.setLastPortOfCallCode(animalQuarantine.getLastPortOfCallCode());
			object.setNextPortOfCallCode(animalQuarantine.getNextPortOfCallCode());
			object.setAnimalNameFirst(animalQuarantine.getAnimalNameFirst());
			object.setAnimalNameBetween(animalQuarantine.getAnimalNameBetween());
			object.setAnimalNameThis(animalQuarantine.getAnimalNameThis());
			object.setNameOfMaster(animalQuarantine.getNameOfMaster());
			object.setSignPlace(animalQuarantine.getSignPlace());
			object.setSignDate(FormatData.parseStringToDate(animalQuarantine.getSignDate()));
			object.setMasterSigned(FormatData.convertToInt(animalQuarantine.getMasterSigned()));
			object.setRequestState(CheckBusinessUtil.checkTrangThaiBanKhai(header));

//			object.setId(CounterLocalServiceUtil.increment(TEMP_ANIMAL_QUARANTINE));
			object.setRequestCode(header.getReference().getMessageId());
			
			TempAnimalQuarantineLocalServiceUtil.addTempAnimalQuarantine(object);
			
			return true;
		}catch (Exception e) {
			_log.error(e);
			e.printStackTrace();
		}
		return false;
	}
	
	public void insert2TempDocument(DeclarationForAnimalQuarantine object, Header header) throws Exception{
		
		TempDocument tempDocument = new TempDocumentImpl();
		tempDocument.setDocumentTypeCode(String.valueOf(header.getSubject().getDocumentType()));

		tempDocument.setRequestCode(header.getReference().getMessageId());
		tempDocument.setDocumentName(FormatData.convertToLong(object.getDocumentName()));
		tempDocument.setDocumentYear(FormatData.convertToInt(object.getDocumentYear()));
		tempDocument.setUserCreated(object.getUserCreated());
		tempDocument.setShipName(object.getNameOfShip());
		tempDocument.setStateCode(object.getFlagStateOfShip());
		tempDocument.setShipCaptain(object.getNameOfMaster());
		
		tempDocument.setLastModifiedDate(new Date());
		
		BusinessUtils.insert2TempDocument(tempDocument, header, object);
	}
	
	
}
