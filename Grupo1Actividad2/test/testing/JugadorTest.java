package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabeans.Jugador;

class JugadorTest {
	
	
	Jugador jugador = new Jugador();
	
	/**
	 * Para probar si el método ponerDorsal() funciona lo haremos
	 * con un número positivo, otro menor que 1 y otro mayor que 30.
	 * 
	 * Así cubrimos los tres posibles casos en los que el método
	 * debe funcionar como se espera. 
	 * 
	 * No probaremos valores negativos porque se entiende que pasándole por valor 0 
	 * testamos los valores inferiores a uno.
	 */
	
	
	@Test
	void testPonerDorsal() {
		
		jugador.ponerDorsal(7);
		
		int expResult = 7;
		int result = jugador.getDorsal();
		
		assertEquals(expResult, result);
	}
	
	@Test 
	void testPonerDorsalMenorUno() {
		jugador.ponerDorsal(0);
		
		int expResult = -1;
		int result = jugador.getDorsal();
		
		assertEquals(expResult, result);
	}
	
	@Test 
	void testPonerDorsalMayorTreinta() {
		jugador.ponerDorsal(33);
		
		int expResult = -1;
		int result = jugador.getDorsal();
		
		assertEquals(expResult, result);
	}
	
	
	/**
	 * Para comprobar si el método estaExpulsado() funciona según
	 * lo esperado hemos creado tres pruebas:
	 * 
	 *1. Una primera en la que se espera que el resultado sea false, pasando valores menores
	 * 	 a dos en el caso de tarjetas amarillas y menores a 1 en el de tarjetas rojas.
	 *
	 *2. Otra, que también dará false y le pasaremos valores mayores que 2 para las tarjetas amarillas y 
	 * 	 mayores que uno para las rojas.
	 *
	 *3. La última, será para probar que cuando las tarjetas amarillas reciben el valor 2 y las rojas el 1
	 * 	 el resultado es true y, por lo tanto, el jugador está expulsado.
	 * 
	 * 
 	 */
	
	@Test 
	void testEstaExpulsadoFalse() {
		jugador.setNumeroTarjetasAmarillas(1);
		jugador.setNumeroTarjetasRojas(0);
		
		boolean expResult = false;
		boolean result = jugador.estaExpulsado();
		
		assertEquals(expResult, result);
	}
	
	@Test 
	void testEstaExpulsadoFalseDos() {
		jugador.setNumeroTarjetasAmarillas(3);
		jugador.setNumeroTarjetasRojas(2);
		
		boolean expResult = false;
		boolean result = jugador.estaExpulsado();
		
		assertEquals(expResult, result);
	}
	
	@Test 
	void testEstaExpulsadoTrue() {
		jugador.setNumeroTarjetasAmarillas(2);
		jugador.setNumeroTarjetasRojas(1);
		
		boolean expResult = true;
		boolean result = jugador.estaExpulsado();
		
		assertEquals(expResult, result);
	}

}
