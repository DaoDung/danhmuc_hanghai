package vn.gt.tichhop.message.congbgt2giaothong;

import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempPassengerDetails;
import vn.gt.dao.noticeandmessage.model.TempPassengerList;
import vn.gt.dao.noticeandmessage.model.impl.TempPassengerDetailsImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempPassengerListImpl;
import vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempPassengerListLocalServiceUtil;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.nsw.Header;
import vn.nsw.model.inland.PTTNDPassengerList;
import vn.nsw.model.inland.PTTNDPassengerList.ListPassengers.Passenger;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class PTTNDPassengerList2Temp {
	private static Log _log = LogFactoryUtil.getLog(PTTNDPassengerList2Temp.class);
	
	public static boolean insert2DB(PTTNDPassengerList object, Header header) throws SystemException {
		_log.info("insert2DBinsert2DBinsert2DBinsert2DB");
		try {
			TempPassengerList tempPassengerList = new TempPassengerListImpl();
			
			tempPassengerList.setRequestCode(((header).getReference().getMessageId()));
			tempPassengerList.setDocumentName(FormatData.convertToLong(object.getDocumentName()));
			tempPassengerList.setDocumentYear(FormatData.convertToInt(object.getDocumentYear()));
			tempPassengerList.setUserCreated(object.getUserCreated());
			tempPassengerList.setIsArrival(FormatData.convertToInt(object.getIsArrival()));
			tempPassengerList.setNameOfShip(object.getNameOfShip());
			
			tempPassengerList.setSignPlace(object.getSignPlace());
			tempPassengerList.setSignDate(FormatData.parseStringToDate(object.getSignDate()));
			tempPassengerList.setMasterSigned(FormatData.convertToInt(object.getMasterSigned()));
			tempPassengerList.setRequestState(CheckBusinessUtil.checkTrangThaiBanKhai(header));
			//sonvh add column
			tempPassengerList.setNumberOfLeftPassengers(Integer.valueOf(object.getNumberOfLeftPassengers()));
			tempPassengerList.setNumberOfVNmeses(Integer.valueOf(object.getNumberOfVNmeses()));
			tempPassengerList.setNumberOfForeigners(Integer.valueOf(object.getNumberOfForeigners()));
			tempPassengerList.setTotalPassengers(Integer.valueOf(object.getTotalPassengers()));
			tempPassengerList.setCallSign(object.getCallSign());
			tempPassengerList.setDateOfArrival(FormatData.parseStringToDate(object.getDateOfArrival()));
			tempPassengerList.setVoyageNumber(object.getVoyageNumber());
			tempPassengerList.setFlagStateOfShip("VN");
			
			tempPassengerList = TempPassengerListLocalServiceUtil.addTempPassengerList(tempPassengerList);
			_log.info("tempPassengerListtempPassengerListtempPassengerList"+tempPassengerList);
			List<Passenger> passengers = object.getListPassengers().getPassenger();
			
			if (passengers != null && passengers.size() > 0) {
				for (Passenger item : passengers) {
					try {
						TempPassengerDetails passenger = new TempPassengerDetailsImpl();
						
						passenger.setRequestCode(tempPassengerList.getRequestCode());
						passenger.setPassengerCode(item.getPassengerCode());
						passenger.setFamilyName(item.getFamilyName());
						passenger.setGivenName(item.getGivenName());
						passenger.setBirthDay(FormatData.parseStringToDate(item.getBirthDay()));
						passenger.setBirthPlace(item.getBirthPlace());
						passenger.setTypeOfIdentity(item.getTypeOfIdentity());
						passenger.setNationality(item.getNationality());
						passenger.setSerialNumberOfIdentity(item.getSerialNumberOfIdentity());
						
						
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
}
