package com.ejemplo.liferay.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
