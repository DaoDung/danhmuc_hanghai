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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.noticeandmessage.service.TempHealthQuestionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class TempHealthQuestionClp extends BaseModelImpl<TempHealthQuestion>
	implements TempHealthQuestion {
	public TempHealthQuestionClp() {
	}

	public Class<?> getModelClass() {
		return TempHealthQuestion.class;
	}

	public String getModelClassName() {
		return TempHealthQuestion.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempHealthQuestionLocalServiceUtil.addTempHealthQuestion(this);
		}
		else {
			TempHealthQuestionLocalServiceUtil.updateTempHealthQuestion(this);
		}
	}

	@Override
	public TempHealthQuestion toEscapedModel() {
		return (TempHealthQuestion)Proxy.newProxyInstance(TempHealthQuestion.class.getClassLoader(),
			new Class[] { TempHealthQuestion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempHealthQuestionClp clone = new TempHealthQuestionClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setHealthQuestionCode(getHealthQuestionCode());
		clone.setPersonDied(getPersonDied());
		clone.setPersonDiedNo(getPersonDiedNo());
		clone.setPersonDiedReport(getPersonDiedReport());
		clone.setIsinfectious(getIsinfectious());
		clone.setInfectiousReport(getInfectiousReport());
		clone.setIllPassengersGreaterNomal(getIllPassengersGreaterNomal());
		clone.setIllPassengersNo(getIllPassengersNo());
		clone.setIllPersonsOnBoard(getIllPersonsOnBoard());
		clone.setIllPersonsReport(getIllPersonsReport());
		clone.setMedicalPractitionerConsulted(getMedicalPractitionerConsulted());
		clone.setMedicalTreatmentOrAdvice(getMedicalTreatmentOrAdvice());
		clone.setInfectionOrSpreadOfDisease(getInfectionOrSpreadOfDisease());
		clone.setInfectionsReport(getInfectionsReport());
		clone.setIsSanitary(getIsSanitary());
		clone.setSanitaryDes(getSanitaryDes());
		clone.setIsStowaways(getIsStowaways());
		clone.setJoinShip(getJoinShip());
		clone.setIsAnimal(getIsAnimal());

		return clone;
	}

	public int compareTo(TempHealthQuestion tempHealthQuestion) {
		int value = 0;

		if (getId() < tempHealthQuestion.getId()) {
			value = -1;
		}
		else if (getId() > tempHealthQuestion.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TempHealthQuestionClp tempHealthQuestion = null;

		try {
			tempHealthQuestion = (TempHealthQuestionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempHealthQuestion.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", healthQuestionCode=");
		sb.append(getHealthQuestionCode());
		sb.append(", personDied=");
		sb.append(getPersonDied());
		sb.append(", personDiedNo=");
		sb.append(getPersonDiedNo());
		sb.append(", personDiedReport=");
		sb.append(getPersonDiedReport());
		sb.append(", isinfectious=");
		sb.append(getIsinfectious());
		sb.append(", infectiousReport=");
		sb.append(getInfectiousReport());
		sb.append(", illPassengersGreaterNomal=");
		sb.append(getIllPassengersGreaterNomal());
		sb.append(", illPassengersNo=");
		sb.append(getIllPassengersNo());
		sb.append(", illPersonsOnBoard=");
		sb.append(getIllPersonsOnBoard());
		sb.append(", illPersonsReport=");
		sb.append(getIllPersonsReport());
		sb.append(", medicalPractitionerConsulted=");
		sb.append(getMedicalPractitionerConsulted());
		sb.append(", medicalTreatmentOrAdvice=");
		sb.append(getMedicalTreatmentOrAdvice());
		sb.append(", infectionOrSpreadOfDisease=");
		sb.append(getInfectionOrSpreadOfDisease());
		sb.append(", infectionsReport=");
		sb.append(getInfectionsReport());
		sb.append(", isSanitary=");
		sb.append(getIsSanitary());
		sb.append(", sanitaryDes=");
		sb.append(getSanitaryDes());
		sb.append(", isStowaways=");
		sb.append(getIsStowaways());
		sb.append(", joinShip=");
		sb.append(getJoinShip());
		sb.append(", isAnimal=");
		sb.append(getIsAnimal());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempHealthQuestion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>healthQuestionCode</column-name><column-value><![CDATA[");
		sb.append(getHealthQuestionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personDied</column-name><column-value><![CDATA[");
		sb.append(getPersonDied());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personDiedNo</column-name><column-value><![CDATA[");
		sb.append(getPersonDiedNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personDiedReport</column-name><column-value><![CDATA[");
		sb.append(getPersonDiedReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isinfectious</column-name><column-value><![CDATA[");
		sb.append(getIsinfectious());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infectiousReport</column-name><column-value><![CDATA[");
		sb.append(getInfectiousReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>illPassengersGreaterNomal</column-name><column-value><![CDATA[");
		sb.append(getIllPassengersGreaterNomal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>illPassengersNo</column-name><column-value><![CDATA[");
		sb.append(getIllPassengersNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>illPersonsOnBoard</column-name><column-value><![CDATA[");
		sb.append(getIllPersonsOnBoard());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>illPersonsReport</column-name><column-value><![CDATA[");
		sb.append(getIllPersonsReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medicalPractitionerConsulted</column-name><column-value><![CDATA[");
		sb.append(getMedicalPractitionerConsulted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medicalTreatmentOrAdvice</column-name><column-value><![CDATA[");
		sb.append(getMedicalTreatmentOrAdvice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infectionOrSpreadOfDisease</column-name><column-value><![CDATA[");
		sb.append(getInfectionOrSpreadOfDisease());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infectionsReport</column-name><column-value><![CDATA[");
		sb.append(getInfectionsReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isSanitary</column-name><column-value><![CDATA[");
		sb.append(getIsSanitary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sanitaryDes</column-name><column-value><![CDATA[");
		sb.append(getSanitaryDes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isStowaways</column-name><column-value><![CDATA[");
		sb.append(getIsStowaways());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>joinShip</column-name><column-value><![CDATA[");
		sb.append(getJoinShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isAnimal</column-name><column-value><![CDATA[");
		sb.append(getIsAnimal());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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