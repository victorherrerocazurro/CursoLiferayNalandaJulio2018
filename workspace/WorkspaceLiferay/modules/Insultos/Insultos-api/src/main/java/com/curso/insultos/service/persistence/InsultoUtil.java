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

package com.curso.insultos.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.curso.insultos.model.Insulto;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the insulto service. This utility wraps {@link com.curso.insultos.service.persistence.impl.InsultoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InsultoPersistence
 * @see com.curso.insultos.service.persistence.impl.InsultoPersistenceImpl
 * @generated
 */
@ProviderType
public class InsultoUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Insulto insulto) {
		getPersistence().clearCache(insulto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Insulto> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Insulto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Insulto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Insulto> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Insulto update(Insulto insulto) {
		return getPersistence().update(insulto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Insulto update(Insulto insulto, ServiceContext serviceContext) {
		return getPersistence().update(insulto, serviceContext);
	}

	/**
	* Returns all the insultos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching insultos
	*/
	public static List<Insulto> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the insultos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @return the range of matching insultos
	*/
	public static List<Insulto> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the insultos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching insultos
	*/
	public static List<Insulto> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Insulto> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the insultos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching insultos
	*/
	public static List<Insulto> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Insulto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first insulto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public static Insulto findByUuid_First(java.lang.String uuid,
		OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first insulto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static Insulto fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Insulto> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last insulto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public static Insulto findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last insulto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static Insulto fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Insulto> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the insultos before and after the current insulto in the ordered set where uuid = &#63;.
	*
	* @param insultoId the primary key of the current insulto
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next insulto
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public static Insulto[] findByUuid_PrevAndNext(long insultoId,
		java.lang.String uuid, OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence()
				   .findByUuid_PrevAndNext(insultoId, uuid, orderByComparator);
	}

	/**
	* Removes all the insultos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of insultos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching insultos
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the insulto where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchInsultoException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public static Insulto findByUUID_G(java.lang.String uuid, long groupId)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the insulto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static Insulto fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the insulto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static Insulto fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the insulto where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the insulto that was removed
	*/
	public static Insulto removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of insultos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching insultos
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the insultos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching insultos
	*/
	public static List<Insulto> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the insultos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @return the range of matching insultos
	*/
	public static List<Insulto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the insultos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching insultos
	*/
	public static List<Insulto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Insulto> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the insultos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching insultos
	*/
	public static List<Insulto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Insulto> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public static Insulto findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static Insulto fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Insulto> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public static Insulto findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static Insulto fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Insulto> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the insultos before and after the current insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param insultoId the primary key of the current insulto
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next insulto
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public static Insulto[] findByUuid_C_PrevAndNext(long insultoId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(insultoId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the insultos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of insultos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching insultos
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the insultos where texto = &#63;.
	*
	* @param texto the texto
	* @return the matching insultos
	*/
	public static List<Insulto> findBytexto(java.lang.String texto) {
		return getPersistence().findBytexto(texto);
	}

	/**
	* Returns a range of all the insultos where texto = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param texto the texto
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @return the range of matching insultos
	*/
	public static List<Insulto> findBytexto(java.lang.String texto, int start,
		int end) {
		return getPersistence().findBytexto(texto, start, end);
	}

	/**
	* Returns an ordered range of all the insultos where texto = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param texto the texto
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching insultos
	*/
	public static List<Insulto> findBytexto(java.lang.String texto, int start,
		int end, OrderByComparator<Insulto> orderByComparator) {
		return getPersistence().findBytexto(texto, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the insultos where texto = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param texto the texto
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching insultos
	*/
	public static List<Insulto> findBytexto(java.lang.String texto, int start,
		int end, OrderByComparator<Insulto> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBytexto(texto, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first insulto in the ordered set where texto = &#63;.
	*
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public static Insulto findBytexto_First(java.lang.String texto,
		OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence().findBytexto_First(texto, orderByComparator);
	}

	/**
	* Returns the first insulto in the ordered set where texto = &#63;.
	*
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static Insulto fetchBytexto_First(java.lang.String texto,
		OrderByComparator<Insulto> orderByComparator) {
		return getPersistence().fetchBytexto_First(texto, orderByComparator);
	}

	/**
	* Returns the last insulto in the ordered set where texto = &#63;.
	*
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public static Insulto findBytexto_Last(java.lang.String texto,
		OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence().findBytexto_Last(texto, orderByComparator);
	}

	/**
	* Returns the last insulto in the ordered set where texto = &#63;.
	*
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public static Insulto fetchBytexto_Last(java.lang.String texto,
		OrderByComparator<Insulto> orderByComparator) {
		return getPersistence().fetchBytexto_Last(texto, orderByComparator);
	}

	/**
	* Returns the insultos before and after the current insulto in the ordered set where texto = &#63;.
	*
	* @param insultoId the primary key of the current insulto
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next insulto
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public static Insulto[] findBytexto_PrevAndNext(long insultoId,
		java.lang.String texto, OrderByComparator<Insulto> orderByComparator)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence()
				   .findBytexto_PrevAndNext(insultoId, texto, orderByComparator);
	}

	/**
	* Removes all the insultos where texto = &#63; from the database.
	*
	* @param texto the texto
	*/
	public static void removeBytexto(java.lang.String texto) {
		getPersistence().removeBytexto(texto);
	}

	/**
	* Returns the number of insultos where texto = &#63;.
	*
	* @param texto the texto
	* @return the number of matching insultos
	*/
	public static int countBytexto(java.lang.String texto) {
		return getPersistence().countBytexto(texto);
	}

	/**
	* Caches the insulto in the entity cache if it is enabled.
	*
	* @param insulto the insulto
	*/
	public static void cacheResult(Insulto insulto) {
		getPersistence().cacheResult(insulto);
	}

	/**
	* Caches the insultos in the entity cache if it is enabled.
	*
	* @param insultos the insultos
	*/
	public static void cacheResult(List<Insulto> insultos) {
		getPersistence().cacheResult(insultos);
	}

	/**
	* Creates a new insulto with the primary key. Does not add the insulto to the database.
	*
	* @param insultoId the primary key for the new insulto
	* @return the new insulto
	*/
	public static Insulto create(long insultoId) {
		return getPersistence().create(insultoId);
	}

	/**
	* Removes the insulto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto that was removed
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public static Insulto remove(long insultoId)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence().remove(insultoId);
	}

	public static Insulto updateImpl(Insulto insulto) {
		return getPersistence().updateImpl(insulto);
	}

	/**
	* Returns the insulto with the primary key or throws a {@link NoSuchInsultoException} if it could not be found.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public static Insulto findByPrimaryKey(long insultoId)
		throws com.curso.insultos.exception.NoSuchInsultoException {
		return getPersistence().findByPrimaryKey(insultoId);
	}

	/**
	* Returns the insulto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto, or <code>null</code> if a insulto with the primary key could not be found
	*/
	public static Insulto fetchByPrimaryKey(long insultoId) {
		return getPersistence().fetchByPrimaryKey(insultoId);
	}

	public static java.util.Map<java.io.Serializable, Insulto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the insultos.
	*
	* @return the insultos
	*/
	public static List<Insulto> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the insultos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @return the range of insultos
	*/
	public static List<Insulto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the insultos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of insultos
	*/
	public static List<Insulto> findAll(int start, int end,
		OrderByComparator<Insulto> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the insultos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InsultoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of insultos
	* @param end the upper bound of the range of insultos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of insultos
	*/
	public static List<Insulto> findAll(int start, int end,
		OrderByComparator<Insulto> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the insultos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of insultos.
	*
	* @return the number of insultos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static InsultoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<InsultoPersistence, InsultoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(InsultoPersistence.class);
}