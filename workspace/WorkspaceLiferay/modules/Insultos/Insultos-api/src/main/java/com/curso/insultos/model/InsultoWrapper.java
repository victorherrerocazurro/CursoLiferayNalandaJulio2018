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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Insulto}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Insulto
 * @generated
 */
@ProviderType
public class InsultoWrapper implements Insulto, ModelWrapper<Insulto> {
	public InsultoWrapper(Insulto insulto) {
		_insulto = insulto;
	}

	@Override
	public Class<?> getModelClass() {
		return Insulto.class;
	}

	@Override
	public String getModelClassName() {
		return Insulto.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("insultoId", getInsultoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("texto", getTexto());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long insultoId = (Long)attributes.get("insultoId");

		if (insultoId != null) {
			setInsultoId(insultoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String texto = (String)attributes.get("texto");

		if (texto != null) {
			setTexto(texto);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new InsultoWrapper((Insulto)_insulto.clone());
	}

	@Override
	public int compareTo(Insulto insulto) {
		return _insulto.compareTo(insulto);
	}

	/**
	* Returns the company ID of this insulto.
	*
	* @return the company ID of this insulto
	*/
	@Override
	public long getCompanyId() {
		return _insulto.getCompanyId();
	}

	/**
	* Returns the create date of this insulto.
	*
	* @return the create date of this insulto
	*/
	@Override
	public Date getCreateDate() {
		return _insulto.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _insulto.getExpandoBridge();
	}

	/**
	* Returns the group ID of this insulto.
	*
	* @return the group ID of this insulto
	*/
	@Override
	public long getGroupId() {
		return _insulto.getGroupId();
	}

	/**
	* Returns the insulto ID of this insulto.
	*
	* @return the insulto ID of this insulto
	*/
	@Override
	public long getInsultoId() {
		return _insulto.getInsultoId();
	}

	/**
	* Returns the modified date of this insulto.
	*
	* @return the modified date of this insulto
	*/
	@Override
	public Date getModifiedDate() {
		return _insulto.getModifiedDate();
	}

	/**
	* Returns the primary key of this insulto.
	*
	* @return the primary key of this insulto
	*/
	@Override
	public long getPrimaryKey() {
		return _insulto.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _insulto.getPrimaryKeyObj();
	}

	/**
	* Returns the texto of this insulto.
	*
	* @return the texto of this insulto
	*/
	@Override
	public java.lang.String getTexto() {
		return _insulto.getTexto();
	}

	/**
	* Returns the user ID of this insulto.
	*
	* @return the user ID of this insulto
	*/
	@Override
	public long getUserId() {
		return _insulto.getUserId();
	}

	/**
	* Returns the user name of this insulto.
	*
	* @return the user name of this insulto
	*/
	@Override
	public java.lang.String getUserName() {
		return _insulto.getUserName();
	}

	/**
	* Returns the user uuid of this insulto.
	*
	* @return the user uuid of this insulto
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _insulto.getUserUuid();
	}

	/**
	* Returns the uuid of this insulto.
	*
	* @return the uuid of this insulto
	*/
	@Override
	public java.lang.String getUuid() {
		return _insulto.getUuid();
	}

	@Override
	public int hashCode() {
		return _insulto.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _insulto.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _insulto.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _insulto.isNew();
	}

	@Override
	public void persist() {
		_insulto.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_insulto.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this insulto.
	*
	* @param companyId the company ID of this insulto
	*/
	@Override
	public void setCompanyId(long companyId) {
		_insulto.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this insulto.
	*
	* @param createDate the create date of this insulto
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_insulto.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_insulto.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_insulto.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_insulto.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this insulto.
	*
	* @param groupId the group ID of this insulto
	*/
	@Override
	public void setGroupId(long groupId) {
		_insulto.setGroupId(groupId);
	}

	/**
	* Sets the insulto ID of this insulto.
	*
	* @param insultoId the insulto ID of this insulto
	*/
	@Override
	public void setInsultoId(long insultoId) {
		_insulto.setInsultoId(insultoId);
	}

	/**
	* Sets the modified date of this insulto.
	*
	* @param modifiedDate the modified date of this insulto
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_insulto.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_insulto.setNew(n);
	}

	/**
	* Sets the primary key of this insulto.
	*
	* @param primaryKey the primary key of this insulto
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_insulto.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_insulto.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the texto of this insulto.
	*
	* @param texto the texto of this insulto
	*/
	@Override
	public void setTexto(java.lang.String texto) {
		_insulto.setTexto(texto);
	}

	/**
	* Sets the user ID of this insulto.
	*
	* @param userId the user ID of this insulto
	*/
	@Override
	public void setUserId(long userId) {
		_insulto.setUserId(userId);
	}

	/**
	* Sets the user name of this insulto.
	*
	* @param userName the user name of this insulto
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_insulto.setUserName(userName);
	}

	/**
	* Sets the user uuid of this insulto.
	*
	* @param userUuid the user uuid of this insulto
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_insulto.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this insulto.
	*
	* @param uuid the uuid of this insulto
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_insulto.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Insulto> toCacheModel() {
		return _insulto.toCacheModel();
	}

	@Override
	public Insulto toEscapedModel() {
		return new InsultoWrapper(_insulto.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _insulto.toString();
	}

	@Override
	public Insulto toUnescapedModel() {
		return new InsultoWrapper(_insulto.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _insulto.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InsultoWrapper)) {
			return false;
		}

		InsultoWrapper insultoWrapper = (InsultoWrapper)obj;

		if (Objects.equals(_insulto, insultoWrapper._insulto)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _insulto.getStagedModelType();
	}

	@Override
	public Insulto getWrappedModel() {
		return _insulto;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _insulto.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _insulto.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_insulto.resetOriginalValues();
	}

	private final Insulto _insulto;
}