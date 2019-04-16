/**
 * 
 */
package vn.gt.utils.validation.inland;

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gt.dao.common.model.LogMessageValidation;
import vn.gt.dao.common.model.impl.LogMessageValidationImpl;

import vn.gt.utils.FormatData;
import vn.gt.utils.config.ConfigurationManager;
import vn.nsw.Header;
import vn.nsw.model.inland.Attachment;
import vn.nsw.model.inland.Attachment.AttachmentList;



/**
 * @author tubq
 *
 */
public class AttachmentValidation {
	Log _log = LogFactoryUtil.getLog(AttachmentValidation.class);
	
	public boolean validation(Attachment attachment, Header header, String requestDirection) throws Exception {
		_log.info("AttachmentValidation====validation=======" );
		LogMessageValidation logMessageValidation = new LogMessageValidationImpl();
		logMessageValidation.setRequestCode(header.getReference().getMessageId());
		logMessageValidation.setRequestDirection(requestDirection);
		logMessageValidation.setDocumentType(String.valueOf(header.getSubject().getDocumentType()));
		logMessageValidation.setDocumentName(header.getSubject().getReference());
		logMessageValidation.setDocumentYear(header.getSubject().getDocumentYear());
		boolean status = true;		
		int [] maLoi4={5,6};
		
		List<AttachmentList> lstAttachmentList = attachment.getAttachmentList();
		if(lstAttachmentList != null && lstAttachmentList.size() > 0){
			_log.info("lstAttachmentList size :" + lstAttachmentList.size());
			for (AttachmentList item : lstAttachmentList) {
				String attachmentType = item.getAttachmentType();
				String providedDate = item.getProvidedDate();
				String expirationDate = item.getExpirationDate();
				String dateOfPeriodicInspection = item.getDateOfPeriodicInspection();
				
				if(attachmentType != null && attachmentType.length() >0){
					status = ValidationUtils.checkValidation(attachmentType, logMessageValidation, "52", "AttachmentType", "17", maLoi4, 50, status);
				}
				
				
				if (Validator.isNotNull(providedDate) && (providedDate.length() > 0) ){
					_log.info("providedDate :" + providedDate);
					if(!FormatData.isThisDateValid(providedDate)){
						status = false;
						logMessageValidation.setTagProperty("ProvidedDate");
						logMessageValidation.setDataValidation("N64704: "
								+ ConfigurationManager.getStrProp(
										"vn.gt.logMessageValidation.N007", ""));
						ValidationUtils.addLogMessageValidation(logMessageValidation);		
					}
				}
				
				if (Validator.isNotNull(expirationDate) && (expirationDate.length() > 0) ){
					_log.info("expirationDate :" + expirationDate);
					if(!FormatData.isThisDateValid(expirationDate)){						
						status = false;
						logMessageValidation.setTagProperty("ExpirationDate");
						logMessageValidation.setDataValidation("N64705: "
								+ ConfigurationManager.getStrProp(
										"vn.gt.logMessageValidation.N007", ""));
						ValidationUtils.addLogMessageValidation(logMessageValidation);	
					}
				}
		
				if (Validator.isNotNull(dateOfPeriodicInspection) && (dateOfPeriodicInspection.length() > 0) ){		
					_log.info("dateOfPeriodicInspection :" + dateOfPeriodicInspection);
					if(!FormatData.isThisDateValid(dateOfPeriodicInspection)){
						status = false;
						logMessageValidation.setTagProperty("DateOfPeriodicInspection");
						logMessageValidation.setDataValidation("N64706: "
								+ ConfigurationManager.getStrProp(
										"vn.gt.logMessageValidation.N007", ""));
						ValidationUtils.addLogMessageValidation(logMessageValidation);	
					}
				}
			}
		}else{
			status = false;
		}
		_log.info("=======validation status  ======" + status );
		return status;
	}
}

