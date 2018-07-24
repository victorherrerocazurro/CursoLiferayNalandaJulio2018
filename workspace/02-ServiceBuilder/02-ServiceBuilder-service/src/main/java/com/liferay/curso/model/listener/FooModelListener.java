package com.liferay.curso.model.listener;

import com.liferay.curso.model.Foo;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    service = ModelListener.class
	)
public class FooModelListener extends BaseModelListener<Foo> {

	private static Log log = LogFactoryUtil.getLog(FooModelListener.class);
	
	@Override
	public void onAfterCreate(Foo model) throws ModelListenerException {
		super.onAfterCreate(model);
		log.info("Se ha insertado un nuevo Foo: " + model);
	}
	
}
