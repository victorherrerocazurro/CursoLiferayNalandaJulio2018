package com.ejemplo.servicio.rest;

import static org.junit.Assert.*;

import com.ejemplo.liferay.application.Persona;
import com.ejemplo.liferay.application.RestServiceApplication;
import com.ejemplo.liferay.application.ServicioSaludos;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ServicioRestTest {

	@Test
	public void testHello() {
		
		RestServiceApplication sut = new RestServiceApplication();
		
		ServicioSaludos mock = mock(ServicioSaludos.class);
		
		when(mock.hello()).thenReturn("Good morning!");
		
		sut.setServicio(mock);
		
		String resultadoObtenido = sut.hello();
		
		String resultadoEsperado = "Good morning!";
		
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
		
		verify(mock).hello();
	}
	
	@Test(expected=Exception.class)
	public void testWorking() {
		
		RestServiceApplication sut = new RestServiceApplication();
		
		//String hello = sut.working();
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testMorning() {
		
		RestServiceApplication sut = new RestServiceApplication();
		
		//String hello = sut.morning(name, drink)();
		
		fail("Not yet implemented");
	}

}
