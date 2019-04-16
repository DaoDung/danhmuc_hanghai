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

import vn.gt.dao.noticeandmessage.service.TempAttachmentDeclarationHealthLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempAttachmentDeclarationHealthClp extends BaseModelImpl<TempAttachmentDeclarationHealth>
	implements TempAttachmentDeclarationHealth {
	public TempAttachmentDeclarationHealthClp() {
	}

	public Class<?> getModelClass() {
		return TempAttachmentDeclarationHealth.class;
	}

	public String getModelClassName() {
		return TempAttachmentDeclarationHealth.class.getName();
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

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempAttachmentDeclarationHealthLocalServiceUtil.addTempAttachmentDeclarationHealth(this);
		}
		else {
			TempAttachmentDeclarationHealthLocalServiceUtil.updateTempAttachmentDeclarationHealth(this);
		}
	}

	@Override
	public TempAttachmentDeclarationHealth toEscapedModel() {
		return (TempAttachmentDeclarationHealth)Proxy.newProxyInstance(TempAttachmentDeclarationHealth.class.getClassLoader(),
			new Class[] { TempAttachmentDeclarationHealth.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempAttachmentDeclarationHealthClp clone = new TempAttachmentDeclarationHealthClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setAttachmentCode(getAttachmentCode());
		clone.setPassengerOrCrewCode(getPassengerOrCrewCode());
		clone.setName(getName());
		clone.setAge(getAge());
		clone.setSex(getSex());
		clone.setNationality(getNationality());
		clone.setPortJoinVesselCode(getPortJoinVesselCode());
		clone.setDateJoinVessel(getDateJoinVessel());
		clone.setClassOrRating(getClassOrRating());
		clone.setNatureOfIllness(getNatureOfIllness());
		clone.setDateOfOnsetOfSymptom(getDateOfOnsetOfSymptom());
		clone.setReportedMedicalOfficer(getReportedMedicalOfficer());
		clone.setDisposalOfCase(getDisposalOfCase());
		clone.setMedicinesOrOther(getMedicinesOrOther());
		clone.setComments(getComments());

		return clone;
	}

	public int compareTo(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		int value = 0;

		if (getId() < tempAttachmentDeclarationHealth.getId()) {
			value = -1;
		}
		else if (getId() > tempAttachmentDeclarationHealth.getId()) {
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

		TempAttachmentDeclarationHealthClp tempAttachmentDeclarationHealth = null;

		try {
			tempAttachmentDeclarationHealth = (TempAttachmentDeclarationHealthClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempAttachmentDeclarationHealth.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", attachmentCode=");
		sb.append(getAttachmentCode());
		sb.append(", passengerOrCrewCode=");
		sb.append(getPassengerOrCrewCode());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", age=");
		sb.append(getAge());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", portJoinVesselCode=");
		sb.append(getPortJoinVesselCode());
		sb.append(", dateJoinVessel=");
		sb.append(getDateJoinVessel());
		sb.append(", classOrRating=");
		sb.append(getClassOrRating());
		sb.append(", natureOfIllness=");
		sb.append(getNatureOfIllness());
		sb.append(", dateOfOnsetOfSymptom=");
		sb.append(getDateOfOnsetOfSymptom());
		sb.append(", reportedMedicalOfficer=");
		sb.append(getReportedMedicalOfficer());
		sb.append(", disposalOfCase=");
		sb.append(getDisposalOfCase());
		sb.append(", medicinesOrOther=");
		sb.append(getMedicinesOrOther());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append(
			"vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth");
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
			"<column><column-name>attachmentCode</column-name><column-value><![CDATA[");
		sb.append(getAttachmentCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerOrCrewCode</column-name><column-value><![CDATA[");
		sb.append(getPassengerOrCrewCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age</column-name><column-value><![CDATA[");
		sb.append(getAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portJoinVesselCode</column-name><column-value><![CDATA[");
		sb.append(getPortJoinVesselCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateJoinVessel</column-name><column-value><![CDATA[");
		sb.append(getDateJoinVessel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classOrRating</column-name><column-value><![CDATA[");
		sb.append(getClassOrRating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>natureOfIllness</column-name><column-value><![CDATA[");
		sb.append(getNatureOfIllness());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfOnsetOfSymptom</column-name><column-value><![CDATA[");
		sb.append(getDateOfOnsetOfSymptom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportedMedicalOfficer</column-name><column-value><![CDATA[");
		sb.append(getReportedMedicalOfficer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>disposalOfCase</column-name><column-value><![CDATA[");
		sb.append(getDisposalOfCase());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medicinesOrOther</column-name><column-value><![CDATA[");
		sb.append(getMedicinesOrOther());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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