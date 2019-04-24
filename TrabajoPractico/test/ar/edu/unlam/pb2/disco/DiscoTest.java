package ar.edu.unlam.pb2.disco;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

public class DiscoTest 
{

	@Test
	public void testProbarPerimetroInterior () 
	{
		Disco miDisco = new Disco (5.0, 9.0);
		
		Double resultadoObtenido = miDisco.calcularPerimetroInterior ();
		Double resultadoEsperado = 31.4;
		
		Assert.assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}
	
	
	@Test
	public void testProbarPerimetroExterior () 
	{
		Disco miDisco = new Disco (8.0, 9.0);
		
		Double resultadoObtenido = miDisco.calcularPerimetroExterior();
		Double resultadoEsperado = 56.52;
		
		Assert.assertEquals(resultadoObtenido, resultadoEsperado);

	}
	
	
	@Test
	public void testProbarSuperficie () 
	{
		Disco miDisco = new Disco (13.4, 15.8);
		
		Double resultadoObtenido = miDisco.calcularSuperficie();
		Double resultadoEsperado = 220.05;
		
		Assert.assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
		
	}
	
}
