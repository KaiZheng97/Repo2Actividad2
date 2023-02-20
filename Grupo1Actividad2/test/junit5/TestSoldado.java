package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javabeans.Soldado;

public class TestSoldado {
	
	@Test
	public void puedeDisp() {
		Soldado sol1 = new Soldado();
		
		sol1.setNumeroBalas(5);
		
		
		boolean resultadoObtenido = sol1.puedeDisparar();
		
		assertTrue(resultadoObtenido);
		
		
	}
	
	@Test
	public void NoPuedeDisp() {
		Soldado sol1 = new Soldado();
		
		sol1.setNumeroBalas(0);
		
		
		boolean resultadoObtenido = sol1.puedeDisparar();
		
		assertFalse(resultadoObtenido);
		
		
	}
	
	@Test 
	public void estaMuerto() {
		
		Soldado sol1 = new Soldado();
		
		Soldado sol2 = new Soldado();
		
		sol1.setNumeroBalas(5);
		
		sol1.disparar(sol2);
		
		boolean resultadoObtenido = sol2.isEstaMuerto();
		
		assertTrue(resultadoObtenido);
		
		
	}

	@Test
	public void restaBalas() {
		
		Soldado sol1 = new Soldado();
		
		Soldado sol2 = new Soldado();
		
		sol1.setNumeroBalas(5);
		
		sol1.disparar(sol2);
		
		int resultadoEsperado = 4;
		int resultadoObtenido = sol1.getNumeroBalas();
	
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		
		
	}
}
