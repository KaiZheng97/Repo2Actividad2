package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabeans.Soldado;

class SoldadoTest {
	/**
	 * Creamos dos objetos de la clase Soldado
	 * porque en el testing de disparar() necesitaremos
	 * otro objeto instanciado que reciba los disparos
	 * del objeto soldado. 
	 * 	 
	 * */
	Soldado soldado = new Soldado();
	Soldado soldier = new Soldado();
	
	
	/**
	 * Para comprobar que el método puedeDisparar() funciona adecuadamente
	 * lo haremos a traves de dos casuísticas: 
	 * <ol>
	 * <li>Un número mayor que cero</li>
	 * <li>Un número menor que cero</li>
	 * </ol>
	 * 
	 * En el primer caso deberíamos obtener un boolean true, en el segundo un boolean false.
	 */
	
	@Test
	void testPuedeDisparar() {
		soldado.setNumeroBalas(20);
		
		boolean expResult = true;
		boolean result = soldado.puedeDisparar();		
		assertEquals(expResult, result);
	}
	
	@Test
	void testPuedeDispararFalse() {
		soldado.setNumeroBalas(0);
		
		boolean expResult = false;
		boolean result = soldado.puedeDisparar();		
		assertEquals(expResult, result);
	}
	
	
	/**
	 * El testeo del método disparar() precisa del condicional if
	 * ya que dependemos del método puedeDisparar().
	 * 
 	 * Para comprobar el correcto funcionamiento, crearemos dos escenarios:
 	 *  <ol>
	 * <li>Poner el número de balas en positivo</li>
	 * <li>Poner el número de balas a 0</li>
	 * </ol>
 	 * 
 	 * En ambos casos, necesitamos validar si el soldado puede disparar. Cuando el
 	 * número de balas es un valor positivo soldado puede disparar a soldier,
 	 * cuando es negativo no. Por lo tanto, obtendremos true en el primer
 	 * caso y false en el segundo.
 	 * 
 	 * De este modo el valor de estaMuerto se cambia a true, el soldado está muerto.
	 * 
	 * 
	 */
	
	
	@Test
	void testDisparar() {
		soldado.setNumeroBalas(30);
		
		
		if(soldado.puedeDisparar() == true) {
			soldado.disparar(soldier);
		}
		boolean expResult = true;
		boolean result = soldier.isEstaMuerto();	
		
		assertEquals(expResult, result);
	}
	
	@Test
	void testDispararFalse() {
		soldado.setNumeroBalas(0);
		
		if(soldado.puedeDisparar() != false) {
			soldado.disparar(soldier);
		}
		boolean expResult = false;
		boolean result = soldier.isEstaMuerto();	
		
		assertEquals(expResult, result);
	}

}
