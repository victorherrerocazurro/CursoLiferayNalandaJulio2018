package com.liferay.docs.guestbook.portlet.custom.attributes;

import com.liferay.docs.guestbook.model.Guestbook;
import com.liferay.docs.guestbook.portlet.constants.GuestbookPortletKeys;
import com.liferay.expando.kernel.model.BaseCustomAttributesDisplay;
import com.liferay.expando.kernel.model.CustomAttributesDisplay;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true, 
		property = "javax.portlet.name=" + GuestbookPortletKeys.GUESTBOOK,
		service = CustomAttributesDisplay.class
	)
public class GuestbookCustomAttributesDisplay extends BaseCustomAttributesDisplay {

	@Override
	public String getClassName() {
		return Guestbook.class.getName();
	}

}
