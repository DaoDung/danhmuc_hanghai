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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempAttachmentDeclarationHealthServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempAttachmentDeclarationHealthServiceSoap
 * @generated
 */
public class TempAttachmentDeclarationHealthSoap implements Serializable {
	public static TempAttachmentDeclarationHealthSoap toSoapModel(
		TempAttachmentDeclarationHealth model) {
		TempAttachmentDeclarationHealthSoap soapModel = new TempAttachmentDeclarationHealthSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setAttachmentCode(model.getAttachmentCode());
		soapModel.setPassengerOrCrewCode(model.getPassengerOrCrewCode());
		soapModel.setName(model.getName());
		soapModel.setAge(model.getAge());
		soapModel.setSex(model.getSex());
		soapModel.setNationality(model.getNationality());
		soapModel.setPortJoinVesselCode(model.getPortJoinVesselCode());
		soapModel.setDateJoinVessel(model.getDateJoinVessel());
		soapModel.setClassOrRating(model.getClassOrRating());
		soapModel.setNatureOfIllness(model.getNatureOfIllness());
		soapModel.setDateOfOnsetOfSymptom(model.getDateOfOnsetOfSymptom());
		soapModel.setReportedMedicalOfficer(model.getReportedMedicalOfficer());
		soapModel.setDisposalOfCase(model.getDisposalOfCase());
		soapModel.setMedicinesOrOther(model.getMedicinesOrOther());
		soapModel.setComments(model.getComments());

		return soapModel;
	}

	public static TempAttachmentDeclarationHealthSoap[] toSoapModels(
		TempAttachmentDeclarationHealth[] models) {
		TempAttachmentDeclarationHealthSoap[] soapModels = new TempAttachmentDeclarationHealthSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempAttachmentDeclarationHealthSoap[][] toSoapModels(
		TempAttachmentDeclarationHealth[][] models) {
		TempAttachmentDeclarationHealthSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempAttachmentDeclarationHealthSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempAttachmentDeclarationHealthSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempAttachmentDeclarationHealthSoap[] toSoapModels(
		List<TempAttachmentDeclarationHealth> models) {
		List<TempAttachmentDeclarationHealthSoap> soapModels = new ArrayList<TempAttachmentDeclarationHealthSoap>(models.size());

		for (TempAttachmentDeclarationHealth model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempAttachmentDeclarationHealthSoap[soapModels.size()]);
	}

	public TempAttachmentDeclarationHealthSoap() {
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

	public String getAttachmentCode() {
		return _attachmentCode;
	}

	public void setAttachmentCode(String attachmentCode) {
		_attachmentCode = attachmentCode;
	}

	public String getPassengerOrCrewCode() {
		return _passengerOrCrewCode;
	}

	public void setPassengerOrCrewCode(String passengerOrCrewCode) {
		_passengerOrCrewCode = passengerOrCrewCode;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		_age = age;
	}

	public int getSex() {
		return _sex;
	}

	public void setSex(int sex) {
		_sex = sex;
	}

	public String getNationality() {
		return _nationality;
	}

	public void setNationality(String nationality) {
		_nationality = nationality;
	}

	public String getPortJoinVesselCode() {
		return _portJoinVesselCode;
	}

	public void setPortJoinVesselCode(String portJoinVesselCode) {
		_portJoinVesselCode = portJoinVesselCode;
	}

	public Date getDateJoinVessel() {
		return _dateJoinVessel;
	}

	public void setDateJoinVessel(Date dateJoinVessel) {
		_dateJoinVessel = dateJoinVessel;
	}

	public int getClassOrRating() {
		return _classOrRating;
	}

	public void setClassOrRating(int classOrRating) {
		_classOrRating = classOrRating;
	}

	public String getNatureOfIllness() {
		return _natureOfIllness;
	}

	public void setNatureOfIllness(String natureOfIllness) {
		_natureOfIllness = natureOfIllness;
	}

	public Date getDateOfOnsetOfSymptom() {
		return _dateOfOnsetOfSymptom;
	}

	public void setDateOfOnsetOfSymptom(Date dateOfOnsetOfSymptom) {
		_dateOfOnsetOfSymptom = dateOfOnsetOfSymptom;
	}

	public int getReportedMedicalOfficer() {
		return _reportedMedicalOfficer;
	}

	public void setReportedMedicalOfficer(int reportedMedicalOfficer) {
		_reportedMedicalOfficer = reportedMedicalOfficer;
	}

	public String getDisposalOfCase() {
		return _disposalOfCase;
	}

	public void setDisposalOfCase(String disposalOfCase) {
		_disposalOfCase = disposalOfCase;
	}

	public String getMedicinesOrOther() {
		return _medicinesOrOther;
	}

	public void setMedicinesOrOther(String medicinesOrOther) {
		_medicinesOrOther = medicinesOrOther;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	private long _id;
	private String _requestCode;
	private String _attachmentCode;
	private String _passengerOrCrewCode;
	private String _name;
	private int _age;
	private int _sex;
	private String _nationality;
	private String _portJoinVesselCode;
	private Date _dateJoinVessel;
	private int _classOrRating;
	private String _natureOfIllness;
	private Date _dateOfOnsetOfSymptom;
	private int _reportedMedicalOfficer;
	private String _disposalOfCase;
	private String _medicinesOrOther;
	private String _comments;
}