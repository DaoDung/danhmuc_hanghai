package vn.gt.tichhop.message.haiquan2giaothong;

import java.util.Date;
import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage;
import vn.gt.dao.noticeandmessage.model.TempPersonList;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageImpl;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPersonListLocalServiceUtil;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.gt.utils.PageType;
import vn.nsw.Header;
import vn.nsw.model.ConfirmationOfArrival;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;

public class ConfirmationOfArrival2Temp {
	
	private Log log = LogFactoryUtil.getLog(ConfirmationOfArrival2Temp.class);
	
	public boolean insert2Temp(ConfirmationOfArrival confirmationOfArrival, Header header) throws Exception {
		try {
			
			insert2TempDocument(confirmationOfArrival, header);
			
			TempNoTiceShipMessage object = new TempNoTiceShipMessageImpl();
			
			object.setRequestCode(header.getReference().getMessageId());
			object.setDocumentName(FormatData.convertToLong(confirmationOfArrival.getDocumentName()));
			object.setDocumentYear(FormatData.convertToInt(confirmationOfArrival.getDocumentYear()));
			object.setUserCreated(confirmationOfArrival.getUserCreated());
			object.setShipName(confirmationOfArrival.getNameOfShip());
			object.setShipTypeCode(confirmationOfArrival.getShipTypeCode());
			object.setImo(confirmationOfArrival.getIMONumber());
			object.setCallSign(confirmationOfArrival.getCallSign());
			object.setStateCode(confirmationOfArrival.getFlagStateOfShip());
			object.setIsArrival(1); // fix bang 1, dung hoi
			object.setArrivalDate(FormatData.parseStringToDate(confirmationOfArrival.getTimeOfArrival()));
			object.setArrivalPortCode(confirmationOfArrival.getPortOfArrivalCode());
			object.setPortHarbourCode(confirmationOfArrival.getPortHarbourCode());
			object.setPortRegionCode(confirmationOfArrival.getPortRegionCode());
			object.setPortWharfCode(confirmationOfArrival.getPortWharfCode());
			object.setArrivalDate(FormatData.parseStringToDate(confirmationOfArrival.getTimeOfArrival()));
			object.setSignPlace(confirmationOfArrival.getSignPlace());
			object.setSignDate(FormatData.parseStringToDate(confirmationOfArrival.getSignDate()));
			object.setMasterSigned(FormatData.convertToInt(confirmationOfArrival.getMasterSigned()));
			object.setNoticeShipType(String.valueOf(PageType.TYPE_XAC_BAO_TAU_DEN_CANG));
			object.setConfirmTime(FormatData.convertToInt(header.getReference().getVersion()) + 1);
			
			object.setRequestState(CheckBusinessUtil.checkTrangThaiBanKhai(header));

			List<ConfirmationOfArrival.PersonList> personList = confirmationOfArrival.getPersonList();
			
			if (personList != null && personList.size() > 0) {
				for (ConfirmationOfArrival.PersonList person : personList) {
					long id = CounterLocalServiceUtil.increment(TempPersonList.class.getName());
					TempPersonList tempPerson = TempPersonListLocalServiceUtil.createTempPersonList(id);
					tempPerson.setRequestCode(header.getReference().getMessageId());
					tempPerson.setDocumentName(FormatData.convertToLong(confirmationOfArrival.getDocumentName()));
					tempPerson.setDocumentYear(FormatData.convertToInt(confirmationOfArrival.getDocumentYear()));
					tempPerson.setName(person.getName());
					tempPerson.setAge(person.getAge());
					tempPerson.setNationalCode(person.getNationalCode());
					tempPerson.setNationalName(person.getNationalName());
					tempPerson.setIlnessStatus(person.getIlnessStatus());
					tempPerson.setReasonOfDead(person.getReasonOfDead());
					tempPerson.setPersonType(GetterUtil.getInteger(person.getPersonType()));

					TempPersonListLocalServiceUtil.updateTempPersonList(tempPerson);
				}
			}
						
			
			TempNoTiceShipMessageLocalServiceUtil.addTempNoTiceShipMessage(object);
			return true;
		} catch (Exception e) {
			log.error(e);
		}
		
		return false;
	}
	
	public void insert2TempDocument(ConfirmationOfArrival confirmationOfArrival, Header header) throws Exception {
		
		TempDocument tempDocument = new TempDocumentImpl();
		
		tempDocument.setRequestCode(header.getReference().getMessageId());
		tempDocument.setDocumentName(FormatData.convertToLong(confirmationOfArrival.getDocumentName()));
		tempDocument.setDocumentYear(FormatData.convertToInt(confirmationOfArrival.getDocumentYear()));
		tempDocument.setDocumentTypeCode(String.valueOf(header.getSubject().getDocumentType()));
		tempDocument.setUserCreated(confirmationOfArrival.getUserCreated());
		// tempDocument.setShipAgencyCode(confirmationOfArrival.get());
		tempDocument.setShipName(confirmationOfArrival.getNameOfShip());
		tempDocument.setShipTypeCode(confirmationOfArrival.getShipTypeCode());
		tempDocument.setStateCode(confirmationOfArrival.getFlagStateOfShip());
		//tempDocument.setShipCaptain(confirmationOfArrival.getNameOfMaster());
		tempDocument.setImo(confirmationOfArrival.getIMONumber());
		//tempDocument.setGrt(FormatData.convertToLong(confirmationOfArrival.getGT()));
		// tempDocument.setNT(confirmationOfArrival.get());
		//tempDocument.setDwt(FormatData.convertToLong(confirmationOfArrival.getDWT()));
		//tempDocument.setUnitGRT(confirmationOfArrival.getGTUNIT());
		// tempDocument.setUnitNT(confirmationOfArrival.get());
		//tempDocument.setUnitDWT(confirmationOfArrival.getDWTUNIT());
		tempDocument.setCallSign(confirmationOfArrival.getCallSign());
		// tempDocument.setPreDocumentName(confirmationOfArrival.get());
		// tempDocument.setCreatedDate(confirmationOfArrival.get());
		// tempDocument.setLastModifiedDate(confirmationOfArrival.get());
		tempDocument.setLastModifiedDate(new Date());
		
		BusinessUtils.insert2TempDocument(tempDocument, header, confirmationOfArrival);
	}
}
