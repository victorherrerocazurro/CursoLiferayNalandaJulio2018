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

package com.liferay.curso.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BarLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BarLocalService
 * @generated
 */
@ProviderType
public class BarLocalServiceWrapper implements BarLocalService,
	ServiceWrapper<BarLocalService> {
	public BarLocalServiceWrapper(BarLocalService barLocalService) {
		_barLocalService = barLocalService;
	}

	/**
	* Adds the bar to the database. Also notifies the appropriate model listeners.
	*
	* @param bar the bar
	* @return the bar that was added
	*/
	@Override
	public com.liferay.curso.model.Bar addBar(com.liferay.curso.model.Bar bar) {
		return _barLocalService.addBar(bar);
	}

	@Override
	public void addFooBar(long fooId, com.liferay.curso.model.Bar bar) {
		_barLocalService.addFooBar(fooId, bar);
	}

	@Override
	public void addFooBar(long fooId, long barId) {
		_barLocalService.addFooBar(fooId, barId);
	}

	@Override
	public void addFooBars(long fooId,
		java.util.List<com.liferay.curso.model.Bar> bars) {
		_barLocalService.addFooBars(fooId, bars);
	}

	@Override
	public void addFooBars(long fooId, long[] barIds) {
		_barLocalService.addFooBars(fooId, barIds);
	}

	@Override
	public void clearFooBars(long fooId) {
		_barLocalService.clearFooBars(fooId);
	}

	/**
	* Creates a new bar with the primary key. Does not add the bar to the database.
	*
	* @param barId the primary key for the new bar
	* @return the new bar
	*/
	@Override
	public com.liferay.curso.model.Bar createBar(long barId) {
		return _barLocalService.createBar(barId);
	}

	/**
	* Deletes the bar from the database. Also notifies the appropriate model listeners.
	*
	* @param bar the bar
	* @return the bar that was removed
	*/
	@Override
	public com.liferay.curso.model.Bar deleteBar(
		com.liferay.curso.model.Bar bar) {
		return _barLocalService.deleteBar(bar);
	}

	/**
	* Deletes the bar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param barId the primary key of the bar
	* @return the bar that was removed
	* @throws PortalException if a bar with the primary key could not be found
	*/
	@Override
	public com.liferay.curso.model.Bar deleteBar(long barId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _barLocalService.deleteBar(barId);
	}

	@Override
	public void deleteFooBar(long fooId, com.liferay.curso.model.Bar bar) {
		_barLocalService.deleteFooBar(fooId, bar);
	}

	@Override
	public void deleteFooBar(long fooId, long barId) {
		_barLocalService.deleteFooBar(fooId, barId);
	}

	@Override
	public void deleteFooBars(long fooId,
		java.util.List<com.liferay.curso.model.Bar> bars) {
		_barLocalService.deleteFooBars(fooId, bars);
	}

	@Override
	public void deleteFooBars(long fooId, long[] barIds) {
		_barLocalService.deleteFooBars(fooId, barIds);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _barLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _barLocalService.dynamicQuery();
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
		return _barLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.curso.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _barLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.curso.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _barLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _barLocalService.dynamicQueryCount(dynamicQuery);
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
		return _barLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.curso.model.Bar fetchBar(long barId) {
		return _barLocalService.fetchBar(barId);
	}

	/**
	* Returns the bar matching the UUID and group.
	*
	* @param uuid the bar's UUID
	* @param groupId the primary key of the group
	* @return the matching bar, or <code>null</code> if a matching bar could not be found
	*/
	@Override
	public com.liferay.curso.model.Bar fetchBarByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _barLocalService.fetchBarByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _barLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the bar with the primary key.
	*
	* @param barId the primary key of the bar
	* @return the bar
	* @throws PortalException if a bar with the primary key could not be found
	*/
	@Override
	public com.liferay.curso.model.Bar getBar(long barId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _barLocalService.getBar(barId);
	}

	/**
	* Returns the bar matching the UUID and group.
	*
	* @param uuid the bar's UUID
	* @param groupId the primary key of the group
	* @return the matching bar
	* @throws PortalException if a matching bar could not be found
	*/
	@Override
	public com.liferay.curso.model.Bar getBarByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _barLocalService.getBarByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the bars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.curso.model.impl.BarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bars
	* @param end the upper bound of the range of bars (not inclusive)
	* @return the range of bars
	*/
	@Override
	public java.util.List<com.liferay.curso.model.Bar> getBars(int start,
		int end) {
		return _barLocalService.getBars(start, end);
	}

	/**
	* Returns all the bars matching the UUID and company.
	*
	* @param uuid the UUID of the bars
	* @param companyId the primary key of the company
	* @return the matching bars, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.curso.model.Bar> getBarsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _barLocalService.getBarsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of bars matching the UUID and company.
	*
	* @param uuid the UUID of the bars
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of bars
	* @param end the upper bound of the range of bars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching bars, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.curso.model.Bar> getBarsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.curso.model.Bar> orderByComparator) {
		return _barLocalService.getBarsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of bars.
	*
	* @return the number of bars
	*/
	@Override
	public int getBarsCount() {
		return _barLocalService.getBarsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _barLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public java.util.List<com.liferay.curso.model.Bar> getFooBars(long fooId) {
		return _barLocalService.getFooBars(fooId);
	}

	@Override
	public java.util.List<com.liferay.curso.model.Bar> getFooBars(long fooId,
		int start, int end) {
		return _barLocalService.getFooBars(fooId, start, end);
	}

	@Override
	public java.util.List<com.liferay.curso.model.Bar> getFooBars(long fooId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.curso.model.Bar> orderByComparator) {
		return _barLocalService.getFooBars(fooId, start, end, orderByComparator);
	}

	@Override
	public int getFooBarsCount(long fooId) {
		return _barLocalService.getFooBarsCount(fooId);
	}

	/**
	* Returns the fooIds of the foos associated with the bar.
	*
	* @param barId the barId of the bar
	* @return long[] the fooIds of foos associated with the bar
	*/
	@Override
	public long[] getFooPrimaryKeys(long barId) {
		return _barLocalService.getFooPrimaryKeys(barId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _barLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _barLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _barLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public boolean hasFooBar(long fooId, long barId) {
		return _barLocalService.hasFooBar(fooId, barId);
	}

	@Override
	public boolean hasFooBars(long fooId) {
		return _barLocalService.hasFooBars(fooId);
	}

	@Override
	public void setFooBars(long fooId, long[] barIds) {
		_barLocalService.setFooBars(fooId, barIds);
	}

	/**
	* Updates the bar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bar the bar
	* @return the bar that was updated
	*/
	@Override
	public com.liferay.curso.model.Bar updateBar(
		com.liferay.curso.model.Bar bar) {
		return _barLocalService.updateBar(bar);
	}

	@Override
	public BarLocalService getWrappedService() {
		return _barLocalService;
	}

	@Override
	public void setWrappedService(BarLocalService barLocalService) {
		_barLocalService = barLocalService;
	}

	private BarLocalService _barLocalService;
}