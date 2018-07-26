package com.curso.insultos.application.list;

import com.curso.insultos.constants.InsultosWebPanelCategoryKeys;
import com.curso.insultos.constants.InsultosWebPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Victor
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + InsultosWebPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class InsultosWebPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return InsultosWebPortletKeys.InsultosWeb;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + InsultosWebPortletKeys.InsultosWeb + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}