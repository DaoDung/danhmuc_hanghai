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

package vn.gt.dao.noticeandmessage.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempHealthQuestionServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempHealthQuestionServiceSoap
 * @generated
 */
public class TempHealthQuestionSoap implements Serializable {
	public static TempHealthQuestionSoap toSoapModel(TempHealthQuestion model) {
		TempHealthQuestionSoap soapModel = new TempHealthQuestionSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setHealthQuestionCode(model.getHealthQuestionCode());
		soapModel.setPersonDied(model.getPersonDied());
		soapModel.setPersonDiedNo(model.getPersonDiedNo());
		soapModel.setPersonDiedReport(model.getPersonDiedReport());
		soapModel.setIsinfectious(model.getIsinfectious());
		soapModel.setInfectiousReport(model.getInfectiousReport());
		soapModel.setIllPassengersGreaterNomal(model.getIllPassengersGreaterNomal());
		soapModel.setIllPassengersNo(model.getIllPassengersNo());
		soapModel.setIllPersonsOnBoard(model.getIllPersonsOnBoard());
		soapModel.setIllPersonsReport(model.getIllPersonsReport());
		soapModel.setMedicalPractitionerConsulted(model.getMedicalPractitionerConsulted());
		soapModel.setMedicalTreatmentOrAdvice(model.getMedicalTreatmentOrAdvice());
		soapModel.setInfectionOrSpreadOfDisease(model.getInfectionOrSpreadOfDisease());
		soapModel.setInfectionsReport(model.getInfectionsReport());
		soapModel.setIsSanitary(model.getIsSanitary());
		soapModel.setSanitaryDes(model.getSanitaryDes());
		soapModel.setIsStowaways(model.getIsStowaways());
		soapModel.setJoinShip(model.getJoinShip());
		soapModel.setIsAnimal(model.getIsAnimal());

		return soapModel;
	}

	public static TempHealthQuestionSoap[] toSoapModels(
		TempHealthQuestion[] models) {
		TempHealthQuestionSoap[] soapModels = new TempHealthQuestionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempHealthQuestionSoap[][] toSoapModels(
		TempHealthQuestion[][] models) {
		TempHealthQuestionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempHealthQuestionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempHealthQuestionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempHealthQuestionSoap[] toSoapModels(
		List<TempHealthQuestion> models) {
		List<TempHealthQuestionSoap> soapModels = new ArrayList<TempHealthQuestionSoap>(models.size());

		for (TempHealthQuestion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempHealthQuestionSoap[soapModels.size()]);
	}

	public TempHealthQuestionSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getRequestCode() {
		return _requestCode;
	}

	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	public String getHealthQuestionCode() {
		return _healthQuestionCode;
	}

	public void setHealthQuestionCode(String healthQuestionCode) {
		_healthQuestionCode = healthQuestionCode;
	}

	public int getPersonDied() {
		return _personDied;
	}

	public void setPersonDied(int personDied) {
		_personDied = personDied;
	}

	public int getPersonDiedNo() {
		return _personDiedNo;
	}

	public void setPersonDiedNo(int personDiedNo) {
		_personDiedNo = personDiedNo;
	}

	public String getPersonDiedReport() {
		return _personDiedReport;
	}

	public void setPersonDiedReport(String personDiedReport) {
		_personDiedReport = personDiedReport;
	}

	public int getIsinfectious() {
		return _isinfectious;
	}

	public void setIsinfectious(int isinfectious) {
		_isinfectious = isinfectious;
	}

	public String getInfectiousReport() {
		return _infectiousReport;
	}

	public void setInfectiousReport(String infectiousReport) {
		_infectiousReport = infectiousReport;
	}

	public int getIllPassengersGreaterNomal() {
		return _illPassengersGreaterNomal;
	}

	public void setIllPassengersGreaterNomal(int illPassengersGreaterNomal) {
		_illPassengersGreaterNomal = illPassengersGreaterNomal;
	}

	public int getIllPassengersNo() {
		return _illPassengersNo;
	}

	public void setIllPassengersNo(int illPassengersNo) {
		_illPassengersNo = illPassengersNo;
	}

	public int getIllPersonsOnBoard() {
		return _illPersonsOnBoard;
	}

	public void setIllPersonsOnBoard(int illPersonsOnBoard) {
		_illPersonsOnBoard = illPersonsOnBoard;
	}

	public int getIllPersonsReport() {
		return _illPersonsReport;
	}

	public void setIllPersonsReport(int illPersonsReport) {
		_illPersonsReport = illPersonsReport;
	}

	public int getMedicalPractitionerConsulted() {
		return _medicalPractitionerConsulted;
	}

	public void setMedicalPractitionerConsulted(
		int medicalPractitionerConsulted) {
		_medicalPractitionerConsulted = medicalPractitionerConsulted;
	}

	public String getMedicalTreatmentOrAdvice() {
		return _medicalTreatmentOrAdvice;
	}

	public void setMedicalTreatmentOrAdvice(String medicalTreatmentOrAdvice) {
		_medicalTreatmentOrAdvice = medicalTreatmentOrAdvice;
	}

	public int getInfectionOrSpreadOfDisease() {
		return _infectionOrSpreadOfDisease;
	}

	public void setInfectionOrSpreadOfDisease(int infectionOrSpreadOfDisease) {
		_infectionOrSpreadOfDisease = infectionOrSpreadOfDisease;
	}

	public String getInfectionsReport() {
		return _infectionsReport;
	}

	public void setInfectionsReport(String infectionsReport) {
		_infectionsReport = infectionsReport;
	}

	public int getIsSanitary() {
		return _isSanitary;
	}

	public void setIsSanitary(int isSanitary) {
		_isSanitary = isSanitary;
	}

	public String getSanitaryDes() {
		return _sanitaryDes;
	}

	public void setSanitaryDes(String sanitaryDes) {
		_sanitaryDes = sanitaryDes;
	}

	public int getIsStowaways() {
		return _isStowaways;
	}

	public void setIsStowaways(int isStowaways) {
		_isStowaways = isStowaways;
	}

	public String getJoinShip() {
		return _joinShip;
	}

	public void setJoinShip(String joinShip) {
		_joinShip = joinShip;
	}

	public int getIsAnimal() {
		return _isAnimal;
	}

	public void setIsAnimal(int isAnimal) {
		_isAnimal = isAnimal;
	}

	private long _id;
	private String _requestCode;
	private String _healthQuestionCode;
	private int _personDied;
	private int _personDiedNo;
	private String _personDiedReport;
	private int _isinfectious;
	private String _infectiousReport;
	private int _illPassengersGreaterNomal;
	private int _illPassengersNo;
	private int _illPersonsOnBoard;
	private int _illPersonsReport;
	private int _medicalPractitionerConsulted;
	private String _medicalTreatmentOrAdvice;
	private int _infectionOrSpreadOfDisease;
	private String _infectionsReport;
	private int _isSanitary;
	private String _sanitaryDes;
	private int _isStowaways;
	private String _joinShip;
	private int _isAnimal;
}