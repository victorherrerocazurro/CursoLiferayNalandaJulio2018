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
 * Provides a wrapper for {@link FooLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalService
 * @generated
 */
@ProviderType
public class FooLocalServiceWrapper implements FooLocalService,
	ServiceWrapper<FooLocalService> {
	public FooLocalServiceWrapper(FooLocalService fooLocalService) {
		_fooLocalService = fooLocalService;
	}

	@Override
	public void addBarFoo(long barId, com.liferay.curso.model.Foo foo) {
		_fooLocalService.addBarFoo(barId, foo);
	}

	@Override
	public void addBarFoo(long barId, long fooId) {
		_fooLocalService.addBarFoo(barId, fooId);
	}

	@Override
	public void addBarFoos(long barId,
		java.util.List<com.liferay.curso.model.Foo> foos) {
		_fooLocalService.addBarFoos(barId, foos);
	}

	@Override
	public void addBarFoos(long barId, long[] fooIds) {
		_fooLocalService.addBarFoos(barId, fooIds);
	}

	/**
	* Adds the foo to the database. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was added
	*/
	@Override
	public com.liferay.curso.model.Foo addFoo(com.liferay.curso.model.Foo foo) {
		return _fooLocalService.addFoo(foo);
	}

	@Override
	public java.util.List<com.liferay.curso.model.Foo> buscarFoosPorField1(
		java.lang.String field1, int begin, int end) {
		return _fooLocalService.buscarFoosPorField1(field1, begin, end);
	}

	@Override
	public void clearBarFoos(long barId) {
		_fooLocalService.clearBarFoos(barId);
	}

	/**
	* Creates a new foo with the primary key. Does not add the foo to the database.
	*
	* @param fooId the primary key for the new foo
	* @return the new foo
	*/
	@Override
	public com.liferay.curso.model.Foo createFoo(long fooId) {
		return _fooLocalService.createFoo(fooId);
	}

	@Override
	public void deleteBarFoo(long barId, com.liferay.curso.model.Foo foo) {
		_fooLocalService.deleteBarFoo(barId, foo);
	}

	@Override
	public void deleteBarFoo(long barId, long fooId) {
		_fooLocalService.deleteBarFoo(barId, fooId);
	}

	@Override
	public void deleteBarFoos(long barId,
		java.util.List<com.liferay.curso.model.Foo> foos) {
		_fooLocalService.deleteBarFoos(barId, foos);
	}

	@Override
	public void deleteBarFoos(long barId, long[] fooIds) {
		_fooLocalService.deleteBarFoos(barId, fooIds);
	}

	/**
	* Deletes the foo from the database. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was removed
	*/
	@Override
	public com.liferay.curso.model.Foo deleteFoo(
		com.liferay.curso.model.Foo foo) {
		return _fooLocalService.deleteFoo(foo);
	}

	/**
	* Deletes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the foo
	* @return the foo that was removed
	* @throws PortalException if a foo with the primary key could not be found
	*/
	@Override
	public com.liferay.curso.model.Foo deleteFoo(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fooLocalService.deleteFoo(fooId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fooLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fooLocalService.dynamicQuery();
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
		return _fooLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.curso.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fooLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.curso.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fooLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _fooLocalService.dynamicQueryCount(dynamicQuery);
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
		return _fooLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.curso.model.Foo fetchFoo(long fooId) {
		return _fooLocalService.fetchFoo(fooId);
	}

	/**
	* Returns the foo matching the UUID and group.
	*
	* @param uuid the foo's UUID
	* @param groupId the primary key of the group
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	@Override
	public com.liferay.curso.model.Foo fetchFooByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _fooLocalService.fetchFooByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _fooLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.liferay.curso.model.Foo> getBarFoos(long barId) {
		return _fooLocalService.getBarFoos(barId);
	}

	@Override
	public java.util.List<com.liferay.curso.model.Foo> getBarFoos(long barId,
		int start, int end) {
		return _fooLocalService.getBarFoos(barId, start, end);
	}

	@Override
	public java.util.List<com.liferay.curso.model.Foo> getBarFoos(long barId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.curso.model.Foo> orderByComparator) {
		return _fooLocalService.getBarFoos(barId, start, end, orderByComparator);
	}

	@Override
	public int getBarFoosCount(long barId) {
		return _fooLocalService.getBarFoosCount(barId);
	}

	/**
	* Returns the barIds of the bars associated with the foo.
	*
	* @param fooId the fooId of the foo
	* @return long[] the barIds of bars associated with the foo
	*/
	@Override
	public long[] getBarPrimaryKeys(long fooId) {
		return _fooLocalService.getBarPrimaryKeys(fooId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _fooLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	* Returns the foo with the primary key.
	*
	* @param fooId the primary key of the foo
	* @return the foo
	* @throws PortalException if a foo with the primary key could not be found
	*/
	@Override
	public com.liferay.curso.model.Foo getFoo(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fooLocalService.getFoo(fooId);
	}

	/**
	* Returns the foo matching the UUID and group.
	*
	* @param uuid the foo's UUID
	* @param groupId the primary key of the group
	* @return the matching foo
	* @throws PortalException if a matching foo could not be found
	*/
	@Override
	public com.liferay.curso.model.Foo getFooByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fooLocalService.getFooByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.curso.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of foos
	*/
	@Override
	public java.util.List<com.liferay.curso.model.Foo> getFoos(int start,
		int end) {
		return _fooLocalService.getFoos(start, end);
	}

	/**
	* Returns all the foos matching the UUID and company.
	*
	* @param uuid the UUID of the foos
	* @param companyId the primary key of the company
	* @return the matching foos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.curso.model.Foo> getFoosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _fooLocalService.getFoosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of foos matching the UUID and company.
	*
	* @param uuid the UUID of the foos
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching foos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.curso.model.Foo> getFoosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.curso.model.Foo> orderByComparator) {
		return _fooLocalService.getFoosByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of foos.
	*
	* @return the number of foos
	*/
	@Override
	public int getFoosCount() {
		return _fooLocalService.getFoosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _fooLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _fooLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fooLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public boolean hasBarFoo(long barId, long fooId) {
		return _fooLocalService.hasBarFoo(barId, fooId);
	}

	@Override
	public boolean hasBarFoos(long barId) {
		return _fooLocalService.hasBarFoos(barId);
	}

	@Override
	public void setBarFoos(long barId, long[] fooIds) {
		_fooLocalService.setBarFoos(barId, fooIds);
	}

	/**
	* Updates the foo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was updated
	*/
	@Override
	public com.liferay.curso.model.Foo updateFoo(
		com.liferay.curso.model.Foo foo) {
		return _fooLocalService.updateFoo(foo);
	}

	@Override
	public FooLocalService getWrappedService() {
		return _fooLocalService;
	}

	@Override
	public void setWrappedService(FooLocalService fooLocalService) {
		_fooLocalService = fooLocalService;
	}

	private FooLocalService _fooLocalService;
}