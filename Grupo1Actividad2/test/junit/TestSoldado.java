package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javabeans.Soldado;


class TestSoldado {
	
	/**
	 * Para el testeo, crearemos dos objetos vacío de la clase Soldado.
	 * Con BeforeEach haremos que antes de cada test el objeto s1 sea nuevo.
	 * Con AfterEach ayudamos a la claúsula de BeforeEach.
	 * El soldado sol se utilizará para el test del método diaparar(), ya que este debe recibir un objeto de la clase Soldado.
	 */
	
	Soldado s1 = new Soldado();
	Soldado sol = new Soldado();
	
	@BeforeEach
	void inicio() {
		s1 = new Soldado();
	}
	@AfterEach
	void fin() {
		s1 = null;
	}
	
	/**
	 * Para el primer método (puedeDisparar()) probaremos 2 casos:
	 * 	1. Int numeroBalas mayor que 0.
	 * 	2. Int numeroBalas igual a 0.
	 * 
	 * Observamos que al usar un número mayor a 0 en el primer test, el método funciona correctamente y devuelve true, 
	 * indicando que puede realizar un disparo.
	 * Asimismo en el segundo test, con el valor 0 el método también opera correctamente devolviendo false.
	 * Se podría realiza un test extra pasando un número negativo, pero es el equivalente 
	 * para el método a recibir un 0, al ser la condición para true >0.
	 */
	@Test
	public void testPuedeDisparar1() {
		s1.setNumeroBalas(6);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	@Test
	public void testPuedeDisparar2() {
		s1.setNumeroBalas(0);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = s1.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/**
	 * El test del método disparar() es algo más complejo, ya que su funcionamiento depende del método puedeDisparar().
	 * Probamos dos casos:
	 * 1. s1.disparar = true al tener numero de balas > 0.
	 * 2. s2.disparar = false al tener 0 balas.
	 * 
	 * Utilizamos un condicional if para introducir el metodo puedeDisparar.
	 */
	@Test
	public void testDisparar1() {
		s1.setNumeroBalas(6);
		
	/**
	 * Este int balas lo usaremos en la comprobación final del método para indicar con cuantas balas se inicia el 
	 * Soldado s1 antes de la ejecución del método disparar(). Así además comprobamos que el método ejecuta correctamente las instrucciones.
	 */
		int balas = s1.getNumeroBalas();

		if (s1.puedeDisparar() == true) {
			s1.disparar(sol);
		}
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = sol.isEstaMuerto();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		System.out.println("Este soldado tenía " + balas + " balas y le quedan " + s1.getNumeroBalas() + " balas.");
	}
	
	/**
	 * Ejecutamos ahora el método pero declarando numeroBalas a 0 para que el método puede Disparar() resulte false. 
	 * Al ser false, dentro del if no se ejecuta el método disparar().
	 */
	@Test
	public void testDisparar2() {
		s1.setNumeroBalas(0);
		int balas = s1.getNumeroBalas();
		
		if (s1.puedeDisparar() == true) {
			s1.disparar(sol);
		}
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = sol.isEstaMuerto();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		System.out.println("Este soldado tenía " + balas + " balas y le quedan " + s1.getNumeroBalas() + " balas.");
	}

}
