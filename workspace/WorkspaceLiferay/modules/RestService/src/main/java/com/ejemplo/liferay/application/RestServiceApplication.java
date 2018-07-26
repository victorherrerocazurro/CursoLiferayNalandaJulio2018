package com.ejemplo.liferay.application;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Victor
 */
@ApplicationPath("/greetings")
@Component(immediate = true, service = Application.class)
public class RestServiceApplication extends Application {

	private ServicioSaludos servicio;
	
	@Reference(unbind="-")
	public void setServicio(ServicioSaludos servicio) {
		this.servicio = servicio;
	}

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	@Produces("application/json")
	public Persona working() {
		return servicio.working();
	}

	@GET
	@Path("/morning")
	@Produces("text/plain")
	public String hello() {
		return servicio.hello();
	}

	@GET
	@Path("/morning/{name}")
	@Produces("text/plain")
	public String morning(
		@PathParam("name") String name,
		@QueryParam("drink") String drink) {

		return servicio.morning(name, drink);
	}

}