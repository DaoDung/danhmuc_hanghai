/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.gt.dao.result.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.model.impl.TempDebitNoteImpl;
import vn.gt.dao.result.service.base.TempDebitNoteLocalServiceBaseImpl;

/**
 * The implementation of the temp debit note local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.result.service.TempDebitNoteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.result.service.base.TempDebitNoteLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil
 */
public class TempDebitNoteLocalServiceImpl extends TempDebitNoteLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil} to access the
	 * temp debit note local service.
	 */

	public TempDebitNote doTempDebitNote(long documentName, int documentYear, String corporationid,
			String debitnotenumber, String division, String financialaccountant, Date fromdate, int markasdeleted,
			String organization, int paymenttype, String reportby, Date reportdate, Date todate, double totalpayment,
			String transactionid, String mariTimeCode, String currency) {
		TempDebitNote ett = null;

		try {
			List<TempDebitNote> list = tempDebitNotePersistence.findByDocumentNameAnddocumentYear(documentName,
					documentYear);

			if (Validator.isNotNull(list) && list.size() > 0) {
				ett = list.get(0);
			} else {
				ett = tempDebitNotePersistence.create(counterLocalService.increment(TempDebitNote.class.getName()));
			}

			ett.setCorporationid(corporationid);
			ett.setDebitnotenumber(debitnotenumber);
			ett.setDivision(division);
			ett.setDocumentName(documentName);
			ett.setDocumentYear(documentYear);
			ett.setFinancialaccountant(financialaccountant);
			ett.setFromdate(fromdate);
			ett.setMarkasdeleted(markasdeleted);
			ett.setOrganization(organization);
			ett.setPaymenttype(paymenttype);
			ett.setReportby(reportby);
			ett.setReportdate(reportdate);
			ett.setTodate(todate);
			ett.setTotalpayment(totalpayment);
			ett.setTransactionid(transactionid);
			ett.setMariTimeCode(Integer.valueOf(mariTimeCode));
			
			if(Validator.isNotNull(currency)) {
				ett.setCurrency(currency);
			} else {
				ett.setCurrency("VND"); 	// default currency
			}
			
			TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
			
			ett.setDocumentTypeCode(tempDocument.getDocumentTypeCode());
			
			tempDebitNotePersistence.update(ett, Boolean.TRUE);

		} catch (SystemException e) {
			_log.error(e);
		}

		return ett;
	}
	
	public List<TempDebitNote> findByMarkasdeletedSearch(int mariTimeCode,int markasdeleted, String documentName, String debitnotenumber, String[] documentTypeCode, int start, int end) {
		List<TempDebitNote> results = new ArrayList<TempDebitNote>();
				
		try {
			if (Validator.isNumber(documentName)) {
				results.addAll(tempDebitNotePersistence.findBydocumentNameSearch(mariTimeCode, markasdeleted, Long.valueOf(documentName), documentTypeCode));
			}
			results.addAll(tempDebitNotePersistence.findBydebitnotenumberSearch(mariTimeCode, markasdeleted, debitnotenumber, documentTypeCode));
			
			return results;
		} catch (SystemException e) {
			return new ArrayList<TempDebitNote>();
		}
	}
	
	public long countByMarkasdeletedSearch(int mariTimeCode,int markasdeleted, String documentName, String debitnotenumber, String[] documentTypeCode) {
		long total = 0;
		try {
			total = tempDebitNotePersistence.countBydocumentNameSearch(mariTimeCode, markasdeleted, Long.valueOf(documentName), documentTypeCode);
			
			total = total + tempDebitNotePersistence.countBydebitnotenumberSearch(mariTimeCode, markasdeleted, debitnotenumber, documentTypeCode);
			
			return total;
		} catch (SystemException e) {
			return 0;
		}
	}
	
	public List<TempDebitNote> findByMarkasdeleted(int markasdeleted, int mariTimeCode, String[] documentTypeCode, int start, int end) {
		try {
			return tempDebitNotePersistence.findByMarkasdeleted(markasdeleted, mariTimeCode, documentTypeCode, start, end);
		} catch (SystemException e) {
			return new ArrayList<TempDebitNote>();
		}
	}
	public long countByMarkasdeleted(int markasdeleted, int mariTimeCode, String[] documentTypeCode) {
		try {
			return tempDebitNotePersistence.countByMarkasdeleted(markasdeleted, mariTimeCode, documentTypeCode);
		} catch (SystemException e) {
			return 0;
		}
	}
	
	public List<TempDebitNote> findByMarkasdeletedAll(int markasdeleted, int start, int end) {
		try {
			return tempDebitNotePersistence.findByMarkasdeletedAll(markasdeleted, start, end);
		} catch (SystemException e) {
			return new ArrayList<TempDebitNote>();
		}
	}
	public long countByMarkasdeletedAll(int markasdeleted) {
		try {
			return tempDebitNotePersistence.countByMarkasdeletedAll(markasdeleted);
		} catch (SystemException e) {
			return 0;
		}
	}
	
	public TempDebitNote findByDocumentNameAnddocumentYear(long documentName, int documentYear) {
		List<TempDebitNote> list;
		try {
			list = tempDebitNotePersistence.findByDocumentNameAnddocumentYear(documentName, documentYear);
			if (Validator.isNotNull(list) && list.size() > 0) {
				return list.get(0);
			} else {
				return null;
			}
		} catch (SystemException e) {
			return null;
		}
	}
	
	public TempDebitNote getByNumberDebit(String debitnotenumber) {
		try {
			return tempDebitNotePersistence.fetchByF_debitnotenumber(debitnotenumber);
		} catch (SystemException e) {
			return new TempDebitNoteImpl();
		}
	}
	
	public TempDebitNote getDebitNoteByTransactionId(String transactionId) {
		TempDebitNote debitNote = null;
		
		if(Validator.isNotNull(transactionId)) {
			try {
				debitNote = tempDebitNotePersistence.fetchByTransactionId(transactionId);
				
				if(debitNote != null) {
					transactionId = debitNote.getTransactionid();
				}
			} catch (SystemException e) {
//				_log.error(e);
			}
		}
		
		return debitNote;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(TempDebitNoteLocalServiceImpl.class);
	
}