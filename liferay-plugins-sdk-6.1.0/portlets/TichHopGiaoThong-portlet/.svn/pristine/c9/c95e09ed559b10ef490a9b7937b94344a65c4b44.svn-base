package vn.gt.tichhop.message.haiquan2giaothong;

import java.util.Date;
import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.TempPassengerDetails;
import vn.gt.dao.noticeandmessage.model.TempPassengerList;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempPassengerDetailsImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempPassengerListImpl;
import vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPassengerListLocalServiceUtil;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.nsw.Header;
import vn.nsw.model.PassengerList;
import vn.nsw.model.PassengerList.ListPassengers.Passenger;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class PassengerList2Temp {
	
	Log _log = LogFactoryUtil.getLog(PassengerList2Temp.class);
	
	public boolean insert2Temp(PassengerList passengerList, Header header) throws SystemException {
	
		try {
			insert2TempDocument(passengerList, header);
			
			TempPassengerList tempPassengerList = new TempPassengerListImpl();
			
			tempPassengerList.setRequestCode(header.getReference().getMessageId());
			tempPassengerList.setDocumentName(FormatData.convertToLong(passengerList.getDocumentName()));
			tempPassengerList.setDocumentYear(FormatData.convertToInt(passengerList.getDocumentYear()));
			tempPassengerList.setUserCreated(passengerList.getUserCreated());
			tempPassengerList.setIsArrival(FormatData.convertToInt(passengerList.getIsArrival()));
			tempPassengerList.setNameOfShip(passengerList.getNameOfShip());
			tempPassengerList.setPortOfArrivalCode(passengerList.getPortOfArrivalCode());
			//tempPassengerList.setAnchorageCode(passengerList.getAnchorageCode());
			tempPassengerList.setDateOfArrival(FormatData.parseStringToDate(passengerList.getDateOfArrival()));
			tempPassengerList.setImoNumber(passengerList.getIMONumber());
			tempPassengerList.setCallSign(passengerList.getCallSign());
			tempPassengerList.setVoyageNumber(passengerList.getVoyageNumber());
			tempPassengerList.setFlagStateOfShip(passengerList.getFlagStateOfShip());
			
			tempPassengerList.setSignPlace(passengerList.getSignPlace());
			tempPassengerList.setSignDate(FormatData.parseStringToDate(passengerList.getSignDate()));
			tempPassengerList.setMasterSigned(FormatData.convertToInt(passengerList.getMasterSigned()));
			tempPassengerList.setRequestState(CheckBusinessUtil.checkTrangThaiBanKhai(header));
			
			TempPassengerListLocalServiceUtil.addTempPassengerList(tempPassengerList);
			List<Passenger> passengers = passengerList.getListPassengers().getPassenger();
			if (passengers != null && passengers.size() > 0) {
				for (Passenger item : passengers) {
					try {
						TempPassengerDetails passenger = new TempPassengerDetailsImpl();
						
						passenger.setRequestCode(tempPassengerList.getRequestCode());
						passenger.setPassengerCode(item.getPassengerCode());
						passenger.setFamilyName(item.getFamilyName());
						passenger.setGivenName(item.getGivenName());
						passenger.setNationality(item.getNationality());
						passenger.setBirthDay(FormatData.parseStringToDate(item.getBirthDay()));
						passenger.setBirthPlace(item.getBirthPlace());
						passenger.setTypeOfIdentity(item.getTypeOfIdentity());
						passenger.setSerialNumberOfIdentity(item.getSerialNumberOfIdentity());
						passenger.setPortOfEmbarkation(item.getPortOfEmbarkation());
						passenger.setPortOfDisembarkation(item.getPortOfDisembarkation());
						passenger.setIsTransit(FormatData.convertToInt(item.getIsTransit()));
						
						TempPassengerDetailsLocalServiceUtil.addTempPassengerDetails(passenger);
					} catch (Exception e) {
						_log.error(e);
					}
				}
			}
			return true;
		} catch (Exception e) {
			_log.error(e);
		}
		return false;
	}
	public void insert2TempDocument(PassengerList passengerList, Header header) throws SystemException {
		TempDocument tempDocument = new TempDocumentImpl();
		
		tempDocument.setDocumentTypeCode(String.valueOf(header.getSubject().getDocumentType()));
		tempDocument.setRequestCode(header.getReference().getMessageId());
		tempDocument.setDocumentName(FormatData.convertToLong(passengerList.getDocumentName()));
		tempDocument.setDocumentYear(FormatData.convertToInt(passengerList.getDocumentYear()));
		tempDocument.setUserCreated(passengerList.getUserCreated());
//		tempDocument.set(passengerList.getisArrival());
		tempDocument.setShipName(passengerList.getNameOfShip());
//		tempDocument.set(passengerList.getPortOfArrivalCode());
//		tempDocument.set(passengerList.getAnchorageCode());
//		tempDocument.set(passengerList.getDateOfArrival());
		tempDocument.setImo(passengerList.getIMONumber());
		tempDocument.setCallSign(passengerList.getCallSign());
//		tempDocument.set(passengerList.getVoyageNumber());
		tempDocument.setStateCode(passengerList.getFlagStateOfShip());

		
		tempDocument.setLastModifiedDate(new Date());
		
		BusinessUtils.insert2TempDocument(tempDocument, header, passengerList);
	}
}
