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

package com.curso.insultos.service.impl;

import com.curso.insultos.model.Insulto;
import com.curso.insultos.service.base.InsultoServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the insulto remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.curso.insultos.service.InsultoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InsultoServiceBaseImpl
 * @see com.curso.insultos.service.InsultoServiceUtil
 */
public class InsultoServiceImpl extends InsultoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.curso.insultos.service.InsultoServiceUtil} to access the insulto remote service.
	 */
	
	public List<Insulto> buscarPorTexto(String texto){
		return getInsultoPersistence().findBytexto(texto);
	}
}