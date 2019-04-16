package vn.gt.tichhop.message.haiquan2giaothong;

import java.util.Date;
import java.util.List;

import vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth;
import vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.TempHealthCrewPassengerList;
import vn.gt.dao.noticeandmessage.model.TempHealthQuestion;
import vn.gt.dao.noticeandmessage.model.impl.TempAttachmentDeclarationHealthImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempDeclarationOfHealthImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempHealthCrewPassengerListImpl;
import vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionImpl;
import vn.gt.dao.noticeandmessage.service.TempAttachmentDeclarationHealthLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDeclarationOfHealthLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempHealthCrewPassengerListLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempHealthQuestionLocalServiceUtil;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.nsw.Header;
import vn.nsw.model.HealthQuanrantineDeclare;
import vn.nsw.model.HealthQuanrantineDeclare.AttachmentDeclarationHealth.Attachment;
import vn.nsw.model.HealthQuanrantineDeclare.DeclarationOfHealth;
import vn.nsw.model.HealthQuanrantineDeclare.HealthCrewPassengerList.HealthCrewPassenger;
import vn.nsw.model.HealthQuanrantineDeclare.HealthQuestion;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class HealthQuanrantineDeclare2Temp {
	
	private static final Log _log = LogFactoryUtil.getLog(HealthQuanrantineDeclare2Temp.class);
	
	public boolean insert2Temp(HealthQuanrantineDeclare quanrantineDeclare, Header header) throws SystemException {
	
		try {
			insert2TempDocument(quanrantineDeclare, header);
			List<DeclarationOfHealth> declarationOfHealths = quanrantineDeclare.getDeclarationOfHealth();

			if (declarationOfHealths != null && declarationOfHealths.size() > 0) {
				for (DeclarationOfHealth item : declarationOfHealths) {
					try {
						TempDeclarationOfHealth tempDecOfHealth = new TempDeclarationOfHealthImpl();
						
						tempDecOfHealth.setRequestCode(header.getReference().getMessageId());
						
						tempDecOfHealth.setDocumentName(FormatData.convertToLong(item.getDocumentName()));
						tempDecOfHealth.setDocumentYear(FormatData.convertToInt(item.getDocumentYear()));
						tempDecOfHealth.setUserCreated(item.getUserCreated());
						tempDecOfHealth.setSubmittedPortCode(item.getSubmittedPortCode());
						tempDecOfHealth.setDateSubmitted(FormatData.parseStringToDate(item.getDateSubmitted()));
						tempDecOfHealth.setNameOfShip(item.getNameOfShip());
						tempDecOfHealth.setRegistration(item.getRegistration());
						tempDecOfHealth.setImoNumber(item.getIMONumber());
						tempDecOfHealth.setArrivingFrom(item.getArrivingFrom());
						tempDecOfHealth.setSailingTo(item.getSailingTo());
						tempDecOfHealth.setNationality(item.getNationality());
						tempDecOfHealth.setMasterName(item.getMasterName());
						tempDecOfHealth.setGrossTonnage(FormatData.convertToDouble(item.getGrossTonnage()));
						tempDecOfHealth.setGrossTonnageUnit(item.getGrossTonnageUnit());
						tempDecOfHealth.setTonnage(FormatData.convertToDouble(item.getTonnage()));
						tempDecOfHealth.setTonnageUnit(item.getTonnageUnit());
						tempDecOfHealth.setCertificatecarried(FormatData.convertToInt(item.getCertificateCarried()));
						tempDecOfHealth.setIssuedAt(item.getIssuedAt());
						tempDecOfHealth.setIssueDate(FormatData.parseStringToDate(item.getIssueDate()));
						tempDecOfHealth.setReInspectionrequired(FormatData.convertToInt(item.getReInspectionRequired()));
						tempDecOfHealth.setIsShipVisitedWHO(FormatData.convertToInt(item.getIsShipVisitedWHO()));
						tempDecOfHealth.setVisitedWHOPortCode(item.getVisitedWHOPortCode());
						tempDecOfHealth.setDateOfVisitedWHO(FormatData.parseStringToDate(item.getDateOfVisitedWHO()));
						tempDecOfHealth.setListPortName(item.getListPortName());
						tempDecOfHealth.setDoctorName(item.getDoctorName());
						tempDecOfHealth.setDoctorSigndate(FormatData.parseStringToDate(item.getDoctorSignDate()));
						tempDecOfHealth.setRequestState(CheckBusinessUtil.checkTrangThaiBanKhai(header));
						
						TempDeclarationOfHealthLocalServiceUtil.addTempDeclarationOfHealth(tempDecOfHealth);
					} catch (Exception e) {
						_log.error(e);
						
					}
				}
			}
			//???
			List<HealthCrewPassenger> healthCrewPassengers = quanrantineDeclare.getHealthCrewPassengerList().getHealthCrewPassenger();
			if (healthCrewPassengers != null && healthCrewPassengers.size() > 0) {
				for (HealthCrewPassenger item : healthCrewPassengers) {
					TempHealthCrewPassengerList crewPassengerList = new TempHealthCrewPassengerListImpl();
					
					crewPassengerList.setRequestCode(header.getReference().getMessageId());
					crewPassengerList.setHealthCrewPassengerCode(item.getHealthCrewPassengerCode());
					crewPassengerList.setPassengerOrCrewCode(item.getPassengerOrCrewCode());
					crewPassengerList.setPassengerOrCrewName(item.getPassengerOrCrewName());
					crewPassengerList.setClassOrRating(FormatData.convertToInt(item.getClassOrRating()));
					crewPassengerList.setStateVisitedCode(item.getStateVisitedCode());
					crewPassengerList.setPortVisitedCode(item.getPortVisitedCode());
					crewPassengerList.setFromDate(FormatData.parseStringToDate(item.getFromDate()));
					crewPassengerList.setToDate(FormatData.parseStringToDate(item.getToDate()));
					
					try {
						TempHealthCrewPassengerListLocalServiceUtil.addTempHealthCrewPassengerList(crewPassengerList);
					} catch (Exception e) {
						_log.error(e);
						
					}
				}
			}
			List<HealthQuestion> healthQuestions = quanrantineDeclare.getHealthQuestion();
			if (healthQuestions != null && healthQuestions.size() > 0) {
				for (HealthQuestion item : healthQuestions) {
					try {
						TempHealthQuestion healthQuestion = new TempHealthQuestionImpl();
						
						healthQuestion.setRequestCode(header.getReference().getMessageId());
						healthQuestion.setHealthQuestionCode(item.getHealthQuestionCode());
						healthQuestion.setPersonDied(FormatData.convertToInt(item.getPersonDied()));
						healthQuestion.setPersonDiedNo(FormatData.convertToInt(item.getPersonDiedNo()));
						healthQuestion.setPersonDiedReport(item.getPersonDiedReport());
						healthQuestion.setIsinfectious(FormatData.convertToInt(item.getIsInfectious()));
						healthQuestion.setInfectiousReport(item.getInfectiousReport());
						healthQuestion.setIllPassengersGreaterNomal(FormatData.convertToInt(item.getIllPassengersGreaterNomal()));
						healthQuestion.setIllPassengersNo(FormatData.convertToInt(item.getIllPassengersNo()));
						healthQuestion.setIllPersonsOnBoard(FormatData.convertToInt(item.getIllPersonsOnBoard()));
						healthQuestion.setIllPersonsReport(FormatData.convertToInt(item.getIllPersonsReport()));
						healthQuestion.setMedicalPractitionerConsulted(FormatData.convertToInt(item.getMedicalPractitionerConsulted()));
						healthQuestion.setMedicalTreatmentOrAdvice(item.getMedicalTreatmentOrAdvice());
						healthQuestion.setInfectionOrSpreadOfDisease(FormatData.convertToInt(item.getInfectionOrSpreadOfDisease()));
						healthQuestion.setInfectionsReport(item.getInfectionsReport());
						healthQuestion.setIsSanitary(FormatData.convertToInt(item.getIsSanitary()));
						healthQuestion.setSanitaryDes(item.getSanitaryDes());
						healthQuestion.setIsStowaways(FormatData.convertToInt(item.getIsStowaways()));
						healthQuestion.setJoinShip(item.getJoinShip());
						healthQuestion.setIsAnimal(FormatData.convertToInt(item.getIsAnimal()));
						
						TempHealthQuestionLocalServiceUtil.addTempHealthQuestion(healthQuestion);
					} catch (Exception e) {
						_log.error(e);
						
					}
				}
			}
			List<Attachment> attachments = quanrantineDeclare.getAttachmentDeclarationHealth().getAttachment();
			if (attachments != null && attachments.size() > 0) {
				for (Attachment item : attachments) {
					
					try {
						TempAttachmentDeclarationHealth tempAttDeclarationHealth = new TempAttachmentDeclarationHealthImpl();
						
						tempAttDeclarationHealth.setRequestCode(header.getReference().getMessageId());
						tempAttDeclarationHealth.setAttachmentCode(item.getAttachmentCode());
						tempAttDeclarationHealth.setPassengerOrCrewCode(item.getPassengerOrCrewCode());
						tempAttDeclarationHealth.setName(item.getName());
						tempAttDeclarationHealth.setAge(FormatData.convertToInt(item.getAge()));
						tempAttDeclarationHealth.setSex(FormatData.convertToInt(item.getSex()));
						tempAttDeclarationHealth.setNationality(item.getNationality());
						tempAttDeclarationHealth.setPortJoinVesselCode(item.getPortJoinVesselCode());
						tempAttDeclarationHealth.setDateJoinVessel(FormatData.parseStringToDate(item.getDateJoinVessel()));
						tempAttDeclarationHealth.setClassOrRating(FormatData.convertToInt(item.getClassOrRating()));
						tempAttDeclarationHealth.setNatureOfIllness(item.getNatureOfIllness());
						tempAttDeclarationHealth.setDateOfOnsetOfSymptom(FormatData.parseStringToDate(item.getDateOfOnsetOfSymptom()));
						tempAttDeclarationHealth.setReportedMedicalOfficer(FormatData.convertToInt(item.getReportedMedicalOfficer()));
						tempAttDeclarationHealth.setDisposalOfCase(item.getDisposalOfCase());
						tempAttDeclarationHealth.setMedicinesOrOther(item.getMedicinesOrOther());
						tempAttDeclarationHealth.setComments(item.getComments());
	
						TempAttachmentDeclarationHealthLocalServiceUtil.addTempAttachmentDeclarationHealth(tempAttDeclarationHealth);
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
	
	public void insert2TempDocument(HealthQuanrantineDeclare quanrantineDeclare, Header header) throws SystemException {
	
		TempDocument tempDocument = new TempDocumentImpl();

		tempDocument.setDocumentTypeCode(String.valueOf(header.getSubject().getDocumentType()));
		tempDocument.setRequestCode(header.getReference().getMessageId());
		
		if (quanrantineDeclare.getDeclarationOfHealth() != null && quanrantineDeclare.getDeclarationOfHealth().size() > 0) {
			DeclarationOfHealth declarationOfHealth = quanrantineDeclare.getDeclarationOfHealth().get(0);
			
			tempDocument.setDocumentName(FormatData.convertToLong(declarationOfHealth.getDocumentName()));
			tempDocument.setDocumentYear(FormatData.convertToInt(declarationOfHealth.getDocumentYear()));
			tempDocument.setUserCreated(declarationOfHealth.getUserCreated());
			tempDocument.setImo(declarationOfHealth.getIMONumber());
			tempDocument.setGrt(FormatData.convertToLong(declarationOfHealth.getGrossTonnage()));
			tempDocument.setUnitGRT(declarationOfHealth.getGrossTonnageUnit());
			tempDocument.setLastModifiedDate(new Date());
			BusinessUtils.insert2TempDocument(tempDocument, header, quanrantineDeclare);
		}
	}
}