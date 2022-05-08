package com.fca.calidad.unitest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class CalculadoraTest {
	
	public Calculadora miCalculadora;

	@Before
	public void setUp() throws Exception {
		miCalculadora =  new Calculadora();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Este es el Teardown");
	}
	
	//Aquí están los test

	@Test
	public void sumaTest() {
		
		//ejercicio, llamada codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(1, 3);
		double resutadoEsperado = 4;
		
		//verificacion, comparar resultadoEjecucion
		assertThat(resultadoEjecucion, is(resutadoEsperado) );
	}
	
	@Test
	public void restaTest() {
		
		//ejercicio, llamada codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.resta(3, 1);
		double resutadoEsperado = 2;
		
		//verificacion, comparar resultadoEjecucion
		assertThat(resultadoEjecucion, is(resutadoEsperado) );
	}
	
	@Test
	public void multiTest() {
		//ejercicio, llamada codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.multiplicacion(4, 3);
		double resutadoEsperado = 12;
		
		//verificacion, comparar resultadoEjecucion
		assertThat(resultadoEjecucion, is(resutadoEsperado) );
	}
	
	@Test
	public void divTest() {
		
		//ejercicio, llamada codigo que vamos a probar
		double resultadoEjecucion = miCalculadora.division(4, 2);
		double resutadoEsperado = 2;
		
		//verificacion, comparar resultadoEjecucion
		assertThat(resultadoEjecucion, is(resutadoEsperado) );
	}
	
}
