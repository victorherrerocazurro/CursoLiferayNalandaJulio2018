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

package com.curso.insultos.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InsultoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InsultoLocalService
 * @generated
 */
@ProviderType
public class InsultoLocalServiceWrapper implements InsultoLocalService,
	ServiceWrapper<InsultoLocalService> {
	public InsultoLocalServiceWrapper(InsultoLocalService insultoLocalService) {
		_insultoLocalService = insultoLocalService;
	}

	/**
	* Adds the insulto to the database. Also notifies the appropriate model listeners.
	*
	* @param insulto the insulto
	* @return the insulto that was added
	*/
	@Override
	public com.curso.insultos.model.Insulto addInsulto(
		com.curso.insultos.model.Insulto insulto) {
		return _insultoLocalService.addInsulto(insulto);
	}

	@Override
	public com.curso.insultos.model.Insulto create() {
		return _insultoLocalService.create();
	}

	/**
	* Creates a new insulto with the primary key. Does not add the insulto to the database.
	*
	* @param insultoId the primary key for the new insulto
	* @return the new insulto
	*/
	@Override
	public com.curso.insultos.model.Insulto createInsulto(long insultoId) {
		return _insultoLocalService.createInsulto(insultoId);
	}

	/**
	* Deletes the insulto from the database. Also notifies the appropriate model listeners.
	*
	* @param insulto the insulto
	* @return the insulto that was removed
	*/
	@Override
	public com.curso.insultos.model.Insulto deleteInsulto(
		com.curso.insultos.model.Insulto insulto) {
		return _insultoLocalService.deleteInsulto(insulto);
	}

	/**
	* Deletes the insulto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto that was removed
	* @throws PortalException if a insulto with the primary key could not be found
	*/
	@Override
	public com.curso.insultos.model.Insulto deleteInsulto(long insultoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _insultoLocalService.deleteInsulto(insultoId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _insultoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _insultoLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _insultoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.curso.insultos.model.impl.InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _insultoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.curso.insultos.model.impl.InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _insultoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _insultoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _insultoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.curso.insultos.model.Insulto fetchInsulto(long insultoId) {
		return _insultoLocalService.fetchInsulto(insultoId);
	}

	/**
	* Returns the insulto matching the UUID and group.
	*
	* @param uuid the insulto's UUID
	* @param groupId the primary key of the group
	* @return the matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	@Override
	public com.curso.insultos.model.Insulto fetchInsultoByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _insultoLocalService.fetchInsultoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _insultoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _insultoLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _insultoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the insulto with the primary key.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto
	* @throws PortalException if a insulto with the primary key could not be found
	*/
	@Override
	public com.curso.insultos.model.Insulto getInsulto(long insultoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _insultoLocalService.getInsulto(insultoId);
	}

	/**
	* Returns the insulto matching the UUID and group.
	*
	* @param uuid the insulto's UUID
	* @param groupId the primary key of the group
	* @return the matching insulto
	* @throws PortalException if a matching insulto could not be found
	*/
	@Override
	public com.curso.insultos.model.Insulto getInsultoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _insultoLocalService.getInsultoByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the insultos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.curso.insultos.model.impl.InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @return the range of insultos
	*/
	@Override
	public java.util.List<com.curso.insultos.model.Insulto> getInsultos(
		int start, int end) {
		return _insultoLocalService.getInsultos(start, end);
	}

	/**
	* Returns all the insultos matching the UUID and company.
	*
	* @param uuid the UUID of the insultos
	* @param companyId the primary key of the company
	* @return the matching insultos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.curso.insultos.model.Insulto> getInsultosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _insultoLocalService.getInsultosByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of insultos matching the UUID and company.
	*
	* @param uuid the UUID of the insultos
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching insultos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.curso.insultos.model.Insulto> getInsultosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.curso.insultos.model.Insulto> orderByComparator) {
		return _insultoLocalService.getInsultosByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of insultos.
	*
	* @return the number of insultos
	*/
	@Override
	public int getInsultosCount() {
		return _insultoLocalService.getInsultosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _insultoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _insultoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the insulto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param insulto the insulto
	* @return the insulto that was updated
	*/
	@Override
	public com.curso.insultos.model.Insulto updateInsulto(
		com.curso.insultos.model.Insulto insulto) {
		return _insultoLocalService.updateInsulto(insulto);
	}

	@Override
	public InsultoLocalService getWrappedService() {
		return _insultoLocalService;
	}

	@Override
	public void setWrappedService(InsultoLocalService insultoLocalService) {
		_insultoLocalService = insultoLocalService;
	}

	private InsultoLocalService _insultoLocalService;
}