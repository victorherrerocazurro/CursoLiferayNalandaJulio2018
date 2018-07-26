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
 * Provides a wrapper for {@link InsultoService}.
 *
 * @author Brian Wing Shun Chan
 * @see InsultoService
 * @generated
 */
@ProviderType
public class InsultoServiceWrapper implements InsultoService,
	ServiceWrapper<InsultoService> {
	public InsultoServiceWrapper(InsultoService insultoService) {
		_insultoService = insultoService;
	}

	@Override
	public java.util.List<com.curso.insultos.model.Insulto> buscarPorTexto(
		java.lang.String texto) {
		return _insultoService.buscarPorTexto(texto);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _insultoService.getOSGiServiceIdentifier();
	}

	@Override
	public InsultoService getWrappedService() {
		return _insultoService;
	}

	@Override
	public void setWrappedService(InsultoService insultoService) {
		_insultoService = insultoService;
	}

	private InsultoService _insultoService;
}