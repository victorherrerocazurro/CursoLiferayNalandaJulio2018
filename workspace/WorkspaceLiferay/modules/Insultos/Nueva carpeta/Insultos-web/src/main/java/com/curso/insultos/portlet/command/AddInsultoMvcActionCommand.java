package com.curso.insultos.portlet.command;

import com.curso.insultos.model.Insulto;
import com.curso.insultos.service.InsultoLocalService;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate= true,
		properties= {
				"javax.portlet.name=insultosNormal",
				"templatePath=/insultos/add"
		},
		service = MVCActionCommand.class
)
public class AddInsultoMvcActionCommand implements MVCActionCommand {

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

		try {
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Insulto.class.getName(), actionRequest);

			String name = ParamUtil.getString(actionRequest, "texto");
			
			long groupId = serviceContext.getScopeGroupId();

			User user = _userService.getUserById(serviceContext.getUserId());

			Date now = new Date();
			
			//Trabajando con modulos de OSGI
			Insulto insulto = _insultoService.create();
			
			insulto.setUuid(serviceContext.getUuid());
			insulto.setUserId(serviceContext.getUserId());
			insulto.setGroupId(groupId);
			insulto.setCompanyId(user.getCompanyId());
			insulto.setUserName(user.getFullName());
			insulto.setCreateDate(serviceContext.getCreateDate(now));
			insulto.setModifiedDate(serviceContext.getModifiedDate(now));
			insulto.setTexto(name);
			
			_insultoService.addInsulto(insulto);//Guestbook(serviceContext.getUserId(), name, serviceContext);
				
			SessionMessages.add(actionRequest, "guestbookAdded");

			return true;
			
		} catch (Exception e) {

			Logger.getLogger(AddInsultoMvcActionCommand.class.getName()).log(Level.SEVERE, null, e);
			SessionErrors.add(actionRequest, e.getClass().getName());

			actionResponse.setRenderParameter("mvcPath", "/edit_insulto.jsp");
			
			return false;
		}
	}

	// Si se trabajase con el BUS sera opcional
	private InsultoLocalService _insultoService;

	@Reference(unbind = "-")
	public void set_insultoService(InsultoLocalService _insultoService) {
		this._insultoService = _insultoService;
	}

	private UserLocalService _userService;

	@Reference(unbind = "-")
	public void set_userService(UserLocalService _userService) {
		this._userService = _userService;
	}

	
	
	
	
	

}
