package vn.gt.tichhop.message.giaothong2haiquan;

import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.utils.FormatData;
import vn.gt.ws.util.WebserviceUtil;
import vn.nsw.model.FeeNotice;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class FeeNotice2Xml {
	
	private static Log _log = LogFactoryUtil.getLog(FeeNotice2Xml.class);
	
	public FeeNotice insert2FeeNotice(long documentName, int  documentYear) throws Exception {
	
		FeeNotice item = null;

		try {
			item = new FeeNotice();
			
			TempDebitNote object = TempDebitNoteLocalServiceUtil
					.findByDocumentNameAnddocumentYear(documentName, documentYear);
			
			TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
			
			if (object != null) {
				item.setDocumentName(String.valueOf(documentName));
				item.setDocumentYear(String.valueOf(documentYear));
				item.setUserCreated(tempDocument.getUserCreated());
				
				if(Validator.isNotNull(object.getMariTimeCode())) {
					DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(String.valueOf(object.getMariTimeCode()));
					
					if(maritime != null) {
						item.setDeptCode(String.valueOf(object.getMariTimeCode()));
						item.setDeptName(maritime.getMaritimeNameVN());
					}
				}
				
				item.setProcessName(object.getReportby());
				item.setProcessDate(FormatData.parseDateToTring(object.getReportdate()));
				item.setComments(Validator.isNotNull(object.getComments()) ? object.getComments() : "---");
				item.setInvoiceNo(object.getDebitnotenumber());
				item.setTotalFee(String.valueOf(object.getTotalpayment()));
				item.setInvoiceUrl(buildURL(documentName, documentYear, object.getDebitnotenumber(), item.getDeptCode()));
				if(Validator.isNotNull(object.getCurrency())) {
					item.setCurrency(object.getCurrency());
				} else {
					item.setCurrency("VND");
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return item;
	}
	
	public static String buildURL(long documentName, int documentYear, String debitNoteNumbrer, String maritimeCode) {

		String url_redirect = WebserviceUtil.getPaymentURL() + "/pay#/payment/" + debitNoteNumbrer + "/" + documentName + "/" + documentYear + "/" + maritimeCode;
		
		/*try {
			Map<String, String> fields = new HashMap<String, String>();

			fields.put("documentname", String.valueOf(documentName));
			fields.put("documentyear", String.valueOf(documentYear));
			fields.put("debitnotenumber", debitNoteNumbrer);

			HashFunction hash = new HashFunction();
			
			String secure_hash = hash.hashAllFields(fields, ConfigurationManager.getStrProp("vn.gt.payment.secure.hash"));
			
			Iterator i = fields.keySet().iterator();
			
			String param = "";
			
			while (i.hasNext()) {
				String key = (String) i.next();
				String value = (String) fields.get(key);
				param += key + "=" + URLEncoder.encode(value, "UTF-8") + "&";
			}
			
			url_redirect += param + "secure_hash=" + secure_hash;
		}
		catch (Exception e) {
			_log.error(e);
		}*/
		
		return url_redirect;
	}
}
