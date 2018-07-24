package com.liferay.docs.guestbook.model.listener;

import com.liferay.docs.guestbook.model.Guestbook;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    service = ModelListener.class
	)
public class GuestbookModelListener extends BaseModelListener<Guestbook> {

		@Override
		public void onAfterCreate(Guestbook model) throws ModelListenerException {
			System.out.println("Se ha insertado un nuevo guestbook: " + model);
			
			//Provoca un Rollback
			//throw new ModelListenerException();
		}
	
}
