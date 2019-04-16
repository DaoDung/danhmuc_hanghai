package vn.gt.tichhop.message.giaothong2haiquan;

import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.utils.FormatData;
import vn.gt.utils.config.ConfigurationManager;
import vn.nsw.model.FeeApproved;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

public class FeeApproved2Xml {
	
	private static Log _log = LogFactoryUtil.getLog(FeeApproved2Xml.class);
	
	public FeeApproved insert2FeeApproved(long documentName, int  documentYear) throws Exception {
	
		FeeApproved item = null;

		try {
			item = new FeeApproved();
			
			TempDebitNote object = TempDebitNoteLocalServiceUtil
					.findByDocumentNameAnddocumentYear(documentName, documentYear);
			
			TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
			
			if (object != null) {
				item.setDocumentName(String.valueOf(documentName));
				item.setDocumentYear(String.valueOf(documentYear));
				item.setUserCreated(tempDocument.getUserCreated());
				
				if(object.getPaymenttype() == 2) {
					item.setPaymentType(ConfigurationManager.getStrProp("vn.gt.payment.method.M2"));
				} else if(object.getPaymenttype() == 1) {
					item.setPaymentType(ConfigurationManager.getStrProp("vn.gt.payment.method.M1"));
				} else if(object.getPaymenttype() == 0) {
					item.setPaymentType(ConfigurationManager.getStrProp("vn.gt.payment.method.M0"));
				}
				
				//TODO:
				//item.setPaymentName(tempDocument.get);
				//item.setPaymentDate(FormatData.parseDateToTring(value));
				
				String paymentPlace = "";
				
				if(Validator.isNotNull(object.getMariTimeCode())) {
					DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(String.valueOf(object.getMariTimeCode()));
					
					if(maritime != null) {
						paymentPlace = maritime.getMaritimeNameVN();
					}
				}
				
				item.setPaymentPlace(paymentPlace);
				
				item.setComments(object.getComments());
				item.setInvoiceNo(object.getDebitnotenumber());
				item.setTotalFee(String.valueOf(object.getTotalpayment()));
				
				if(Validator.isNotNull(object.getCurrency())) {
					item.setCurrency(object.getCurrency());
				} else {
					item.setCurrency("VND");
				}
				
				item.setPaymentName(tempDocument.getUserCreated());
				item.setPaymentDate(FormatData.parseDateToTring(object.getReportdate()));
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return item;
	}
}
