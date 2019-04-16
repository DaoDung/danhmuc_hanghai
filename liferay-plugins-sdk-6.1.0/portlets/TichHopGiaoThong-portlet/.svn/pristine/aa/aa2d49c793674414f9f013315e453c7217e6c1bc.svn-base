package vn.gt.tichhop.message.giaothong2haiquan;

import vn.gt.dao.noticeandmessage.model.IssueAcceptanceForTransit;
import vn.gt.dao.noticeandmessage.service.IssueAcceptanceForTransitLocalServiceUtil;
import vn.gt.utils.FormatData;
import vn.nsw.model.AcceptanceForTransit;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class AcceptanceForTransit2Xml {
	
	Log _log = LogFactoryUtil.getLog(AcceptanceForTransit2Xml.class);
	
	public AcceptanceForTransit insert2AcceptanceForTransit(long documentName, int  documentYear) throws Exception {
	
		AcceptanceForTransit item = new AcceptanceForTransit();
		IssueAcceptanceForTransit object = IssueAcceptanceForTransitLocalServiceUtil.findIssueAcceptanceForTransitByDocumentYearAndDocumentYear(documentName, documentYear);
		
		if (object != null) {
			try {
				item.setNumberAcceptanceForTransit(object.getNumberAcceptanceForTransit());
				item.setDocumentName(String.valueOf(object.getDocumentName()));
				item.setDocumentYear(String.valueOf(object.getDocumentYear()));
				item.setNameOfShip(object.getNameOfShip());
				item.setFlagStateOfShip(object.getFlagStateOfShip());
				item.setCallSign(object.getCallSign());
				item.setNameOfMaster(object.getNameOfMaster());
				item.setLOA(String.valueOf(object.getLoa()));
				item.setUnitLOA(object.getUnitLOA());
				item.setBreadth(String.valueOf(object.getBreadth()));
				item.setUnitBreadth(object.getUnitBreadth());
				item.setGrossTonnage(String.valueOf(object.getGrossTonnage()));
				item.setGrossTonnageUnit(object.getGrossTonnageUnit());
				item.setNetTonnage(String.valueOf(object.getNetTonnage()));
				item.setNetTonnageUnit(object.getNetTonnageUnit());
				item.setDWT(String.valueOf(object.getDwt()));
				item.setUnitDWT(object.getUnitDWT());
				item.setShownDraftxF(String.valueOf(object.getShownDraftxF()));
				item.setUnitShownDraftxF(object.getUnitShownDraftxF());
				item.setShownDraftxA(String.valueOf(object.getShownDraftxA()));
				item.setUnitShownDraftxA(object.getUnitShownDraftxA());
				item.setClearanceHeight(String.valueOf(object.getClearanceHeight()));
				item.setUnitClearanceHeight(object.getUnitClearanceHeight());
				item.setPermittedTransitFrom(FormatData.parseDateToTring(object.getPermittedTransitFrom()));
				item.setPermittedTransitTo(FormatData.parseDateToTring(object.getPermittedTransitTo()));
				item.setTimeOfDeparture(FormatData.parseDateToTring(object.getTimeOfDeparture()));
			} catch (Exception e) {
				_log.error(e);
			}
		}
		return null;
	}
}
