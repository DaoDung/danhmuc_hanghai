package vn.gt.tichhop.message.haiquan2giaothong;

import java.util.Date;

import vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantine;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.impl.TempDeclarationForPlantQuarantineImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl;
import vn.gt.dao.noticeandmessage.service.TempDeclarationForPlantQuarantineLocalServiceUtil;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.nsw.Header;
import vn.nsw.model.DeclarationForPlantQuarantine;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DeclarationForPlantQuarantine2Temp {
	
	Log _log = LogFactoryUtil.getLog(DeclarationForPlantQuarantine2Temp.class);
	
	public boolean insert2Temp(DeclarationForPlantQuarantine plantQuarantine, Header header) throws SystemException {
	
		try {
			
			insert2TempDocument(plantQuarantine, header);
			
			TempDeclarationForPlantQuarantine tempPlantQuarantine = new TempDeclarationForPlantQuarantineImpl();
			tempPlantQuarantine.setRequestCode(header.getReference().getMessageId());
			
			tempPlantQuarantine.setDocumentName(FormatData.convertToLong(plantQuarantine.getDocumentName()));
			tempPlantQuarantine.setDocumentYear(FormatData.convertToInt(plantQuarantine.getDocumentYear()));
			tempPlantQuarantine.setUserCreated(plantQuarantine.getUserCreated());
			tempPlantQuarantine.setNameOfShip(plantQuarantine.getNameOfShip());
			tempPlantQuarantine.setFlagStateOfShip(plantQuarantine.getFlagStateOfShip());
			tempPlantQuarantine.setNameOfMaster(plantQuarantine.getNameOfMaster());
			tempPlantQuarantine.setDoctorName(plantQuarantine.getDoctorName());
			tempPlantQuarantine.setNumberOfCrew(FormatData.convertToInt(plantQuarantine.getNumberOfCrew()));
			tempPlantQuarantine.setNumberOfPassengers(FormatData.convertToInt(plantQuarantine.getNumberOfPassengers()));
			tempPlantQuarantine.setLastPortOfCallCode(plantQuarantine.getLastPortOfCallCode());
			tempPlantQuarantine.setNextPortOfCallCode(plantQuarantine.getNextPortOfCallCode());
			tempPlantQuarantine.setFirstPortOfLoadingCode(plantQuarantine.getFirstPortOfLoadingCode());
			tempPlantQuarantine.setDateOfdeparture(FormatData.parseStringToDate(plantQuarantine.getDateOfDeparture()));
			tempPlantQuarantine.setPlantNameFirst(plantQuarantine.getPlantNameFirst());
			tempPlantQuarantine.setPlantNameBetween(plantQuarantine.getPlantNameBetween());
			tempPlantQuarantine.setPlantNameThis(plantQuarantine.getPlantNameThis());
			tempPlantQuarantine.setSignPlace(plantQuarantine.getSignPlace());
			tempPlantQuarantine.setSignDate(FormatData.parseStringToDate(plantQuarantine.getSignDate()));
			tempPlantQuarantine.setMasterSigned(FormatData.convertToInt(plantQuarantine.getMasterSigned()));
			tempPlantQuarantine.setRequestState(CheckBusinessUtil.checkTrangThaiBanKhai(header));
			
			TempDeclarationForPlantQuarantineLocalServiceUtil.addTempDeclarationForPlantQuarantine(tempPlantQuarantine);
			return true;
			
		} catch (Exception e) {
			_log.error(e);
			e.printStackTrace();
		}
		return false;
	}
		public void insert2TempDocument(DeclarationForPlantQuarantine plantQuarantine, Header header) throws SystemException {
			TempDocument tempDocument = new TempDocumentImpl();
			tempDocument.setDocumentTypeCode(String.valueOf(header.getSubject().getDocumentType()));

			tempDocument.setRequestCode(header.getReference().getMessageId());
			tempDocument.setDocumentName(FormatData.convertToLong(plantQuarantine.getDocumentName()));
			tempDocument.setDocumentYear(FormatData.convertToInt(plantQuarantine.getDocumentYear()));
			tempDocument.setUserCreated(plantQuarantine.getUserCreated());
			tempDocument.setShipName(plantQuarantine.getNameOfShip());
			tempDocument.setStateCode(plantQuarantine.getFlagStateOfShip());
			tempDocument.setShipCaptain(plantQuarantine.getNameOfMaster());
			
			tempDocument.setLastModifiedDate(new Date());
			
			BusinessUtils.insert2TempDocument(tempDocument, header, plantQuarantine);
	}
}
