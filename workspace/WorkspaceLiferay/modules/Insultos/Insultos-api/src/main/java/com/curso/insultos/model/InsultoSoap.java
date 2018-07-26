/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.curso.insultos.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.curso.insultos.service.http.InsultoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.curso.insultos.service.http.InsultoServiceSoap
 * @generated
 */
@ProviderType
public class InsultoSoap implements Serializable {
	public static InsultoSoap toSoapModel(Insulto model) {
		InsultoSoap soapModel = new InsultoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setInsultoId(model.getInsultoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTexto(model.getTexto());

		return soapModel;
	}

	public static InsultoSoap[] toSoapModels(Insulto[] models) {
		InsultoSoap[] soapModels = new InsultoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InsultoSoap[][] toSoapModels(Insulto[][] models) {
		InsultoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InsultoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InsultoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InsultoSoap[] toSoapModels(List<Insulto> models) {
		List<InsultoSoap> soapModels = new ArrayList<InsultoSoap>(models.size());

		for (Insulto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InsultoSoap[soapModels.size()]);
	}

	public InsultoSoap() {
	}

	public long getPrimaryKey() {
		return _insultoId;
	}

	public void setPrimaryKey(long pk) {
		setInsultoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getInsultoId() {
		return _insultoId;
	}

	public void setInsultoId(long insultoId) {
		_insultoId = insultoId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTexto() {
		return _texto;
	}

	public void setTexto(String texto) {
		_texto = texto;
	}

	private String _uuid;
	private long _insultoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _texto;
}