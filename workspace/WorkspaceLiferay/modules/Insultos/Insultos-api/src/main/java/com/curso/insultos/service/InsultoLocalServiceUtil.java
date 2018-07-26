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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Insulto. This utility wraps
 * {@link com.curso.insultos.service.impl.InsultoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see InsultoLocalService
 * @see com.curso.insultos.service.base.InsultoLocalServiceBaseImpl
 * @see com.curso.insultos.service.impl.InsultoLocalServiceImpl
 * @generated
 */
@ProviderType
public class InsultoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.curso.insultos.service.impl.InsultoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the insulto to the database. Also notifies the appropriate model listeners.
	*
	* @param insulto the insulto
	* @return the insulto that was added
	*/
	public static com.curso.insultos.model.Insulto addInsulto(
		com.curso.insultos.model.Insulto insulto) {
		return getService().addInsulto(insulto);
	}

	public static com.curso.insultos.model.Insulto create() {
		return getService().create();
	}

	/**
	* Creates a new insulto with the primary key. Does not add the insulto to the database.
	*
	* @param insultoId the primary key for the new insulto
	* @return the new insulto
	*/
	public static com.curso.insultos.model.Insulto createInsulto(long insultoId) {
		return getService().createInsulto(insultoId);
	}

	/**
	* Deletes the insulto from the database. Also notifies the appropriate model listeners.
	*
	* @param insulto the insulto
	* @return the insulto that was removed
	*/
	public static com.curso.insultos.model.Insulto deleteInsulto(
		com.curso.insultos.model.Insulto insulto) {
		return getService().deleteInsulto(insulto);
	}

	/**
	* Deletes the insulto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto that was removed
	* @throws PortalException if a insulto with the primary key could not be found
	*/
	public static com.curso.insultos.model.Insulto deleteInsulto(long insultoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteInsulto(insultoId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.curso.insultos.model.Insulto fetchInsulto(long insultoId) {
		return getService().fetchInsulto(insultoId);
	}

	/**
	* Returns the insulto matching the UUID and group.
	*
	* @param uuid the insulto's UUID
	* @param groupId the primary key of the group
	* @return the matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static com.curso.insultos.model.Insulto fetchInsultoByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchInsultoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the insulto with the primary key.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto
	* @throws PortalException if a insulto with the primary key could not be found
	*/
	public static com.curso.insultos.model.Insulto getInsulto(long insultoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getInsulto(insultoId);
	}

	/**
	* Returns the insulto matching the UUID and group.
	*
	* @param uuid the insulto's UUID
	* @param groupId the primary key of the group
	* @return the matching insulto
	* @throws PortalException if a matching insulto could not be found
	*/
	public static com.curso.insultos.model.Insulto getInsultoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getInsultoByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.curso.insultos.model.Insulto> getInsultos(
		int start, int end) {
		return getService().getInsultos(start, end);
	}

	/**
	* Returns all the insultos matching the UUID and company.
	*
	* @param uuid the UUID of the insultos
	* @param companyId the primary key of the company
	* @return the matching insultos, or an empty list if no matches were found
	*/
	public static java.util.List<com.curso.insultos.model.Insulto> getInsultosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getInsultosByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.curso.insultos.model.Insulto> getInsultosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.curso.insultos.model.Insulto> orderByComparator) {
		return getService()
				   .getInsultosByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of insultos.
	*
	* @return the number of insultos
	*/
	public static int getInsultosCount() {
		return getService().getInsultosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the insulto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param insulto the insulto
	* @return the insulto that was updated
	*/
	public static com.curso.insultos.model.Insulto updateInsulto(
		com.curso.insultos.model.Insulto insulto) {
		return getService().updateInsulto(insulto);
	}

	public static InsultoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<InsultoLocalService, InsultoLocalService> _serviceTracker =
		ServiceTrackerFactory.open(InsultoLocalService.class);
}