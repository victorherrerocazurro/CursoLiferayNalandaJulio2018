package com.liferay.docs.guestbook.bus;

import com.liferay.docs.guestbook.service.GuestbookLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component (
		immediate = true,
		property = {"destination.name=myDestinationName"},
service = MessageListener.class
)
public class GuestbookMessageListener implements MessageListener {

	private GuestbookLocalService _guestbookService;

	@Reference(unbind = "-")
	protected void setGuestbookService(GuestbookLocalService guestbookService) {
		_guestbookService = guestbookService;

	}
	
	@Override
	public void receive(Message message) throws MessageListenerException {
		long userId = message.getLong("userId");
		String name = message.getString("name");
		ServiceContext serviceContext = (ServiceContext) message.get("serviceContext");
		try {
			_guestbookService.addGuestbook(userId, name, serviceContext);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
