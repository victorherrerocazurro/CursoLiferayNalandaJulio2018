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

import com.curso.insultos.exception.NoSuchInsultoException;
import com.curso.insultos.model.Insulto;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the insulto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.curso.insultos.service.persistence.impl.InsultoPersistenceImpl
 * @see InsultoUtil
 * @generated
 */
@ProviderType
public interface InsultoPersistence extends BasePersistence<Insulto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InsultoUtil} to access the insulto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the insultos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching insultos
	*/
	public java.util.List<Insulto> findByUuid(java.lang.String uuid);

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
	public java.util.List<Insulto> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Insulto> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

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
	public java.util.List<Insulto> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first insulto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public Insulto findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Returns the first insulto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public Insulto fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

	/**
	* Returns the last insulto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public Insulto findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Returns the last insulto in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public Insulto fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

	/**
	* Returns the insultos before and after the current insulto in the ordered set where uuid = &#63;.
	*
	* @param insultoId the primary key of the current insulto
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next insulto
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public Insulto[] findByUuid_PrevAndNext(long insultoId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Removes all the insultos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of insultos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching insultos
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the insulto where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchInsultoException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public Insulto findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchInsultoException;

	/**
	* Returns the insulto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public Insulto fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the insulto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public Insulto fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the insulto where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the insulto that was removed
	*/
	public Insulto removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchInsultoException;

	/**
	* Returns the number of insultos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching insultos
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the insultos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching insultos
	*/
	public java.util.List<Insulto> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Insulto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Insulto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

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
	public java.util.List<Insulto> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public Insulto findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Returns the first insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public Insulto fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

	/**
	* Returns the last insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public Insulto findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Returns the last insulto in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public Insulto fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

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
	public Insulto[] findByUuid_C_PrevAndNext(long insultoId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Removes all the insultos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of insultos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching insultos
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the insultos where texto = &#63;.
	*
	* @param texto the texto
	* @return the matching insultos
	*/
	public java.util.List<Insulto> findBytexto(java.lang.String texto);

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
	public java.util.List<Insulto> findBytexto(java.lang.String texto,
		int start, int end);

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
	public java.util.List<Insulto> findBytexto(java.lang.String texto,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

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
	public java.util.List<Insulto> findBytexto(java.lang.String texto,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first insulto in the ordered set where texto = &#63;.
	*
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public Insulto findBytexto_First(java.lang.String texto,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Returns the first insulto in the ordered set where texto = &#63;.
	*
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public Insulto fetchBytexto_First(java.lang.String texto,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

	/**
	* Returns the last insulto in the ordered set where texto = &#63;.
	*
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto
	* @throws NoSuchInsultoException if a matching insulto could not be found
	*/
	public Insulto findBytexto_Last(java.lang.String texto,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Returns the last insulto in the ordered set where texto = &#63;.
	*
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching insulto, or <code>null</code> if a matching insulto could not be found
	*/
	public Insulto fetchBytexto_Last(java.lang.String texto,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

	/**
	* Returns the insultos before and after the current insulto in the ordered set where texto = &#63;.
	*
	* @param insultoId the primary key of the current insulto
	* @param texto the texto
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next insulto
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public Insulto[] findBytexto_PrevAndNext(long insultoId,
		java.lang.String texto,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator)
		throws NoSuchInsultoException;

	/**
	* Removes all the insultos where texto = &#63; from the database.
	*
	* @param texto the texto
	*/
	public void removeBytexto(java.lang.String texto);

	/**
	* Returns the number of insultos where texto = &#63;.
	*
	* @param texto the texto
	* @return the number of matching insultos
	*/
	public int countBytexto(java.lang.String texto);

	/**
	* Caches the insulto in the entity cache if it is enabled.
	*
	* @param insulto the insulto
	*/
	public void cacheResult(Insulto insulto);

	/**
	* Caches the insultos in the entity cache if it is enabled.
	*
	* @param insultos the insultos
	*/
	public void cacheResult(java.util.List<Insulto> insultos);

	/**
	* Creates a new insulto with the primary key. Does not add the insulto to the database.
	*
	* @param insultoId the primary key for the new insulto
	* @return the new insulto
	*/
	public Insulto create(long insultoId);

	/**
	* Removes the insulto with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto that was removed
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public Insulto remove(long insultoId) throws NoSuchInsultoException;

	public Insulto updateImpl(Insulto insulto);

	/**
	* Returns the insulto with the primary key or throws a {@link NoSuchInsultoException} if it could not be found.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto
	* @throws NoSuchInsultoException if a insulto with the primary key could not be found
	*/
	public Insulto findByPrimaryKey(long insultoId)
		throws NoSuchInsultoException;

	/**
	* Returns the insulto with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param insultoId the primary key of the insulto
	* @return the insulto, or <code>null</code> if a insulto with the primary key could not be found
	*/
	public Insulto fetchByPrimaryKey(long insultoId);

	@Override
	public java.util.Map<java.io.Serializable, Insulto> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the insultos.
	*
	* @return the insultos
	*/
	public java.util.List<Insulto> findAll();

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
	public java.util.List<Insulto> findAll(int start, int end);

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
	public java.util.List<Insulto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator);

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
	public java.util.List<Insulto> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Insulto> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the insultos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of insultos.
	*
	* @return the number of insultos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}