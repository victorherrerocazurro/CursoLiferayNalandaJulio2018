package com.ejemplo.liferay.application;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = ServicioSaludos.class)
public class ServicioSaludosImpl implements ServicioSaludos{

	@Override
	public Persona working() {
		return new Persona("Victor");
	}

	@Override
	public String hello() {
		return "Good morning!";
	}


	@Override
	public String morning(
		String name,
		String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return greeting;
	}
}
