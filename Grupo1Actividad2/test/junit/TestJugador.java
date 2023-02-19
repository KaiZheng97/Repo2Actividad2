package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javabeans.Jugador;


class TestJugador {
	
	/**
	 * Para el testeo, crearemos un objeto vacío de la clase Jugador.
	 * Con BeforeEach haremos que antes de cada test el objeto sea nuevo.
	 * Con AfterEach ayudamos a la claúsula de BeforeEach.
	 */
	Jugador j1 = new Jugador();

	@BeforeEach
	void inicio() {
		j1 = new Jugador();
	}
	@AfterEach
	void fin() {
		j1 = null;
	}
	
	/**
	 * Para el primer método (ponerDorsal()) probaremos 2 casos:
	 * 	1. Int comprendido entre 1 y 30
	 * 	2. Int fuera de ese rango.
	 * Observamos que al usar ponerDorsal(17), el método funciona correctamente.
	 * Asimismo, con el valor 31 que está fuera del rango acotado con if, devuleve lo definido para este caso (-1).
	 */
			
	@Test	
	public void testPonerDorsalPos() {
		
		j1.ponerDorsal(17);
		
		int dorsalEsperado = 17;
		int dorsalObtenido = j1.getDorsal();
		
		assertEquals(dorsalEsperado, dorsalObtenido);
		
	}
	@Test
	public void testPonerDorsalNeg() {
		
		j1.ponerDorsal(31);
		
		int dorsalEsperado = -1;
		int dorsalObtenido = j1.getDorsal();
		
		assertEquals(dorsalEsperado, dorsalObtenido);
		
	}
	
	/**
	 * Para el segundo método (estaExpulsado()) se probarán 5 casos aunque con 3 sería suficiente:
	 *  1. El jugador tiene 1 tarjeta amarilla y 0 tarjetas rojas.
	 *  2. El jugador tiene 2 tarjetas amarillas.
	 *  3. El jugador tiene 1 tarjeta amarilla y 1 tarjeta roja.
	 *  4. El jugador tiene 0 tarjetas amarillas y 1 tarjeta roja.
	 *  5. El jugador no tiene tarjetas.
	 *
	 *
	 * Este primer test debería dar como resultado false (jugador no expulsado) acorde a la documentación del método.
	 */
	@Test
	public void testEstaExpulsado1() {
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(0);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	/**
	 * Este segundo test debería dar como resultado true (jugador expulsado).
	 */	
	@Test
	public void testEstaExpulsado2() {
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(0);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	/**
	 * El tercer test debería dar como resultado true (jugador expulsado).
	 */	
	@Test
	public void testEstaExpulsado3() {
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(1);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	/**
	 * El cuarto test debería dar como resultado true (jugador expulsado).
	 */		
	@Test
	public void testEstaExpulsado4() {
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);	
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	/**
	 * El quinto y último test debería dar como resultado false (jugador no expulsado).
	 */	
	@Test
	public void testEstaExpulsado5() {
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(0);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = j1.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
