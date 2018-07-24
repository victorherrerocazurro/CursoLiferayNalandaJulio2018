package com.liferay.curso.portlet;

import com.liferay.curso.constants.CustomPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Victor
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=01-PortletMVC Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CustomPortletKeys.Custom,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CustomPortlet extends MVCPortlet {
	public void miAccion(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
	}
	
	public void otraAccion(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

	}
}