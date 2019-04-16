package vn.gt.payment.util;

import java.net.URLEncoder;

import vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig;
import vn.gt.dao.noticeandmessage.service.TempMaritimePaymentConfigLocalServiceUtil;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.payment.keypay.model.KeyPay;
import vn.gt.utils.config.ConfigurationManager;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.PwdGenerator;

public class PaymentUrlGenerator {
	public static String generateKeyPayURL(TempDebitNote debitNote) {
		
		String url_redirect = StringPool.BLANK;
		
		if(Validator.isNotNull(debitNote)) {
		
			url_redirect = debitNote.getKeypayURL();
			
			if(Validator.isNull(url_redirect)) {
			
				TempMaritimePaymentConfig paymentConfig = TempMaritimePaymentConfigLocalServiceUtil.getPaymentConfig(
					String.valueOf(debitNote.getMariTimeCode()));
			
				if(paymentConfig != null) {
					long merchant_trans_id = _genetatorTransactionId();
			
					String good_code = generatorGoodCode(10);
					String net_cost = String.valueOf((new Double(debitNote.getTotalpayment())).longValue()); //amount
					String ship_fee = "0";
					String tax = "0";
					String bank_code = StringPool.BLANK;
					String service_code = ConfigurationManager.getStrProp("vn.gt.keypay.service.code");
					String version = "1.0";
					String command = ConfigurationManager.getStrProp("vn.gt.keypay.command");
					String currency_code = ConfigurationManager.getStrProp("vn.gt.keypay.currency.code");
			
					String desc_1 = StringPool.BLANK;
					String desc_2 = StringPool.BLANK;
					String desc_3 = StringPool.BLANK;
					String desc_4 = StringPool.BLANK;
					String desc_5 = StringPool.BLANK;
			
					String xml_description = StringPool.BLANK;
					String current_locale = ConfigurationManager.getStrProp("vn.gt.keypay.current.locale");
					String country_code = ConfigurationManager.getStrProp("vn.gt.keypay.country.code");
					String internal_bank = ConfigurationManager.getStrProp("vn.gt.keypay.internal.bank");
			
					String merchant_code = paymentConfig.getMerchantCode();			// merchant code
					String merchant_secure_key = paymentConfig.getMerchantKey();	// merchant secure key
			
					String return_url = paymentConfig.getReturnURL();
					
					try {
						KeyPay keypay = new KeyPay(String.valueOf(merchant_trans_id),
								merchant_code, good_code, net_cost, ship_fee, tax,
								bank_code, service_code, version, command, currency_code,
								desc_1, desc_2, desc_3, desc_4, desc_5, xml_description,
								current_locale, country_code, return_url, internal_bank,
								merchant_secure_key);
				
						StringBuffer param = new StringBuffer();
						param.append("merchant_code=")
								.append(URLEncoder.encode(keypay.getMerchant_code(),
										"UTF-8")).append(StringPool.AMPERSAND);
						param.append("bank_code=")
								.append(URLEncoder.encode(keypay.getBank_code(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						param.append("internal_bank=")
								.append(URLEncoder.encode(keypay.getInternal_bank(),
										"UTF-8")).append(StringPool.AMPERSAND);
						param.append("merchant_trans_id=")
								.append(URLEncoder.encode(keypay.getMerchant_trans_id(),
										"UTF-8")).append(StringPool.AMPERSAND);
						param.append("good_code=")
								.append(URLEncoder.encode(keypay.getGood_code(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						param.append("net_cost=")
								.append(URLEncoder.encode(keypay.getNet_cost(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						param.append("ship_fee=")
								.append(URLEncoder.encode(keypay.getShip_fee(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						param.append("tax=")
								.append(URLEncoder.encode(keypay.getTax(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						
						param.append("version=")
								.append(URLEncoder.encode(keypay.getVersion(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						param.append("command=")
								.append(URLEncoder.encode(keypay.getCommand(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						param.append("current_locale=")
								.append(URLEncoder.encode(keypay.getCurrent_locale(),
										"UTF-8")).append(StringPool.AMPERSAND);
						param.append("currency_code=")
								.append(URLEncoder.encode(keypay.getCurrency_code(),
										"UTF-8")).append(StringPool.AMPERSAND);
						param.append("service_code=")
								.append(URLEncoder.encode(keypay.getService_code(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						param.append("country_code=")
								.append(URLEncoder.encode(keypay.getCountry_code(), "UTF-8"))
								.append(StringPool.AMPERSAND);
						param.append("xml_description=")
								.append(URLEncoder.encode(keypay.getXml_description(),
										"UTF-8")).append(StringPool.AMPERSAND);
						param.append("secure_hash=").append(keypay.getSecure_hash()).append(StringPool.AMPERSAND);
						param.append("return_url=").append(URLEncoder.encode(keypay.getReturn_url(), "UTF-8"));
				
						url_redirect = paymentConfig.getKeypayDomain() + StringPool.QUESTION + param.toString();
						
						debitNote.setTransactionid(String.valueOf(merchant_trans_id));
						debitNote.setKeypayURL(url_redirect);
						
						TempDebitNoteLocalServiceUtil.updateTempDebitNote(debitNote);
					
					} catch (Exception e) {
						_log.error(e);
					}
				}
			}
		}
		
		return url_redirect;
	}
	
	private static long _genetatorTransactionId() {

		long transactionId = 0;
		try {
			transactionId = CounterLocalServiceUtil.increment("payment.keypay.genetatorTransactionId");
		} catch (SystemException e) {
			_log.error(e);
		}
		return transactionId;
	}
	
	private static String generatorGoodCode(int length) {

		String tempGoodCode = PwdGenerator.getPassword(PwdGenerator.KEY1, length);

		String goodCode = StringPool.BLANK;

		goodCode = tempGoodCode;

		return goodCode;
	}
	
	private static Log _log = LogFactoryUtil.getLog(PaymentUrlGenerator.class);
}
