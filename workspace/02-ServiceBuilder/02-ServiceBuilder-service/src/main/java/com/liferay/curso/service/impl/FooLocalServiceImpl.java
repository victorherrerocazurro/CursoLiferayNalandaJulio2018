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

package com.liferay.curso.service.impl;

import com.liferay.curso.model.Foo;
import com.liferay.curso.service.base.FooLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;

import java.util.List;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.curso.service.FooLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalServiceBaseImpl
 * @see com.liferay.curso.service.FooLocalServiceUtil
 */
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.curso.service.FooLocalServiceUtil} to access the foo local service.
	 */
	
	public List<Foo> buscarFoosPorField1(String field1, int begin, int end){
		return getFooFinder().findByField1(field1, begin, end);
	}
	
	public List<Foo> otraFormaDeBuscarFoosPorField1(String field1, int begin, int end){
		
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(Foo.class)
	            .add(RestrictionsFactoryUtil.eq("field1", field1))
	            .setProjection(ProjectionFactoryUtil.property("fooId"))
	            .addOrder(OrderFactoryUtil.desc("fooId"));

		return dynamicQuery(query,begin,end);
	}
	
	
	
}