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

package com.curso.insultos.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.curso.insultos.model.Insulto;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Insulto in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Insulto
 * @generated
 */
@ProviderType
public class InsultoCacheModel implements CacheModel<Insulto>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InsultoCacheModel)) {
			return false;
		}

		InsultoCacheModel insultoCacheModel = (InsultoCacheModel)obj;

		if (insultoId == insultoCacheModel.insultoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, insultoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", insultoId=");
		sb.append(insultoId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", texto=");
		sb.append(texto);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Insulto toEntityModel() {
		InsultoImpl insultoImpl = new InsultoImpl();

		if (uuid == null) {
			insultoImpl.setUuid("");
		}
		else {
			insultoImpl.setUuid(uuid);
		}

		insultoImpl.setInsultoId(insultoId);
		insultoImpl.setGroupId(groupId);
		insultoImpl.setCompanyId(companyId);
		insultoImpl.setUserId(userId);

		if (userName == null) {
			insultoImpl.setUserName("");
		}
		else {
			insultoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			insultoImpl.setCreateDate(null);
		}
		else {
			insultoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			insultoImpl.setModifiedDate(null);
		}
		else {
			insultoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (texto == null) {
			insultoImpl.setTexto("");
		}
		else {
			insultoImpl.setTexto(texto);
		}

		insultoImpl.resetOriginalValues();

		return insultoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		insultoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		texto = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(insultoId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (texto == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(texto);
		}
	}

	public String uuid;
	public long insultoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String texto;
}