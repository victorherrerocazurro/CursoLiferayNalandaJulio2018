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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Insulto service. Represents a row in the &quot;Insultos_Insulto&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see InsultoModel
 * @see com.curso.insultos.model.impl.InsultoImpl
 * @see com.curso.insultos.model.impl.InsultoModelImpl
 * @generated
 */
@ImplementationClassName("com.curso.insultos.model.impl.InsultoImpl")
@ProviderType
public interface Insulto extends InsultoModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.curso.insultos.model.impl.InsultoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Insulto, Long> INSULTO_ID_ACCESSOR = new Accessor<Insulto, Long>() {
			@Override
			public Long get(Insulto insulto) {
				return insulto.getInsultoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Insulto> getTypeClass() {
				return Insulto.class;
			}
		};
}