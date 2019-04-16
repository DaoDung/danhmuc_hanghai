
package vn.gt.payment.util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.payment.keypay.model.KeyPay;
import vn.gt.ws.util.WebserviceUtil;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author trungdk
 */
public class PaymentMgtUtil {

	public static final int PAYMENT_STATUS_KEYPAY_OK = 1;
	public static final int PAYMENT_STATUS_KEYPAY_PENDING = 0;

	public static void runKeyPayGateData(HttpServletRequest request, HttpServletResponse response, KeyPay keyPay) 
			throws IOException {
		
		String keypayRedirectUrl = WebserviceUtil.getKeypayRedirectUrl();
		String result = "error";
		
		try {
			TempDebitNote debitNote = null;

			boolean isVerify = KeyPay.checkSecureHash(keyPay);

			if (keyPay.getMerchant_trans_id().trim().length() > 0) {

				try {
					debitNote = TempDebitNoteLocalServiceUtil.getDebitNoteByTransactionId(keyPay.getMerchant_trans_id().trim());
				} catch (Exception e) {

				}
			}
			
			if (Validator.isNull(debitNote)) {
				keypayRedirectUrl += "/0";
				keypayRedirectUrl += "/0";
				keypayRedirectUrl += "/0";
				keypayRedirectUrl += "/0";
			}
			
			if (isVerify && Validator.isNotNull(debitNote)) {
				
				keypayRedirectUrl += "/" + debitNote.getDebitnotenumber();
				keypayRedirectUrl += "/" + debitNote.getDocumentName();
				keypayRedirectUrl += "/" + debitNote.getDocumentYear();
				keypayRedirectUrl += "/" + debitNote.getMariTimeCode();

				if (Validator.isNotNull(debitNote)
						&& (debitNote.getMarkasdeleted() != PaymentMgtUtil.PAYMENT_STATUS_KEYPAY_OK)) {

					debitNote.setMarkasdeleted(PaymentMgtUtil.PAYMENT_STATUS_KEYPAY_OK);
					debitNote.setPaymenttype(2);
				} else {
					debitNote.setPaymentGateStatusCode(keyPay.getService_code());
				}

				JSONObject jsonData = JSONFactoryUtil.createJSONObject();

				jsonData.put("command", keyPay.getCommand());
				jsonData.put("merchant_trans_id", keyPay.getMerchant_trans_id());
				jsonData.put("merchant_code", keyPay.getMerchant_code());
				jsonData.put("response_code", keyPay.getResponse_code());
				jsonData.put("trans_id", keyPay.getTrans_id());
				jsonData.put("good_code", keyPay.getGood_code());
				jsonData.put("net_cost", keyPay.getNet_cost());
				jsonData.put("ship_fee", keyPay.getShip_fee());
				jsonData.put("tax", keyPay.getTax());
				jsonData.put("service_code", keyPay.getService_code());
				jsonData.put("currency_code", keyPay.getCurrency_code());
				jsonData.put("bank_code", keyPay.getBank_code());
				jsonData.put("secure_hash", keyPay.getSecure_hash());
				jsonData.put("desc_1", keyPay.getDesc_1());
				jsonData.put("desc_2", keyPay.getDesc_2());
				jsonData.put("desc_3", keyPay.getDesc_3());
				jsonData.put("desc_4", keyPay.getDesc_4());
				jsonData.put("desc_5", keyPay.getDesc_5());

				debitNote.setKeypayGoodCode(keyPay.getGood_code());
				debitNote.setPaymentGateStatusCode(keyPay.getService_code());
				debitNote.setPaymentGateResponseData(jsonData.toString());

				TempDebitNoteLocalServiceUtil.updateTempDebitNote(debitNote);
				
				result = "success";
			}

		} catch (Exception e) {
			_log.error(e);
		}

		keypayRedirectUrl += "/" + result;
		
		response.sendRedirect(keypayRedirectUrl);
	}

	public static Log _log = LogFactoryUtil.getLog(PaymentMgtUtil.class);
}
