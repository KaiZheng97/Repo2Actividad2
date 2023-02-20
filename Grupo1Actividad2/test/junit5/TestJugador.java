package junit5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import javabeans.Jugador;

public class TestJugador {
	
	

	@Test
	
	public void testPonerBienDorsal(){
		
		// En este método introducimos un valor entero correcto (dentro del rango entre 1 y 30).  
		Jugador j1 = new Jugador();
		
		j1.ponerDorsal(17);
		
		int resultadoEsperado = 17;
		int resultadoObtenido = j1.getDorsal();
		System.out.println(j1.getDorsal());
		
		// Comprobación de que su contenido se haya modificado correctamente
		
		assertEquals(resultadoEsperado, resultadoObtenido);
			
	
	} 
	
	@Test
	
	public void testPonerMalDorsal() {
		
		// Hacer una prueba poniendo número de dorsal fuera del rango
		
		Jugador j1 = new Jugador();
		
		j1.ponerDorsal(35);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal();
		System.out.println(j1.getDorsal());
		
		// Comprobación de que su contenido se haya modificado correctamente
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		

		
	}
	
	
	@Test 
	public void testExpConAmarillas() {
		
		Jugador j1 = new Jugador();
		
		j1.setNumeroTarjetasAmarillas(2);
		
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertTrue(resultadoObtenido);
		
		
		
	}
	
	
	@Test
	public void testExpConRojas() {
		
		Jugador j1 = new Jugador();
		
		j1.setNumeroTarjetasRojas(1);
		
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertTrue(resultadoObtenido);
	}
	
	
	@Test
	public void testConTarjetasACero() {
		
		Jugador j1 = new Jugador();
		
		j1.setNumeroTarjetasRojas(0);
		
		j1.setNumeroTarjetasAmarillas(0);
		
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertFalse(resultadoObtenido);
	}	
	
	
	
	
	
	

}
