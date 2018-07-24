package com.liferay.curso.portlet;

import com.liferay.curso.constants.CustomPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true, 
		property = { 
				"javax.portlet.name=" + CustomPortletKeys.Custom,
			"mvc.command.name=/custom/miAction" 
		}, 
		service = MVCActionCommand.class)
public class MiActionMVCCommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest arg0, ActionResponse arg1) throws PortletException {
		// TODO Auto-generated method stub
		return false;
	}

}
