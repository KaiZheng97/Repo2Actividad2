package junit5;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabeans.Soldado;

class SoldadoTest {
			//Creamos una variable soldado
	private Soldado s1;
	private Soldado s2;
	//Cremos un nuevo objeto de la clase soldado que lo hará  al principio de cada Test
	@BeforeEach
	 void crear() throws Exception{
		s1 = new Soldado();
		s2 = new Soldado();
		
	}
	
	// Esto se ejecutará al final de cada test para poner los valores a null de nuestro objeto de pruebas
	
	@AfterEach 
	void limpiar()throws Exception{
		s1 = null;
	}
	
	
	@Test
	public void TestsiDispara() {
		//Test método puedeDisparar
		//Vamos a comprobar que cuando la variable de tieneBalas es > de 0
		// El método nos devolverá un valor de true
		
		s1.setNumeroBalas(8);
		
		boolean resultadoObtenido = s1.puedeDisparar();
		
		//Comprobamos que nos devuelve valor de true
		
		assertTrue(resultadoObtenido);
	}
	
	@Test
		public void TestNoDispara() {
		//Test método puedeDisparar
		//Vamos a comprobar que cuando la variable de tieneBalas es < de 0
		// El método nos devolverá un valor de false
		
		s1.setNumeroBalas(0);
		
		boolean resultadoObtenido = s1.puedeDisparar();
		
		//Comprobamos que nos devuelve valor de false
		
		assertFalse(resultadoObtenido);
	}
	
	@Test
	public void TestDisparaASolVerMuerto() {
		//Test Método disparar, este método decrementa en 1 el valor numeroBalas a la variable que invoca
		// y además debe poner el valor de estaMuerto a true a la variable afectada
		//Primero ponemos numeroBalas a s1 a 5
		s1.setNumeroBalas(5);
		// Invocamos al método para que a s1 se le decrementa en 1 numeroBalas
		// Y cambia el estado de estaMuerto de s2 a true
 		s1.disparar(s2);
		boolean resultadoObtenido = s2.isEstaMuerto();
		//Vamos a comprobar que cuando numeroBalas es 5 si  cambia el valor de s2 de siEstaMuerto a true
		assertTrue(resultadoObtenido); 
			
	}
	
	@Test
	public void TestDisparaASolVerDecremento() {
		//Test Método disparar, este método decrementa en 1 el valor numeroBalas a la variable que invoca
		// y además debe poner el valor de estaMuerto a true a la variable afectada
		//Primero ponemos numeroBalas a s1 a 3
		s1.setNumeroBalas(3);
		// Invocamos al método para que a s1 se le decrementa en 1 numeroBalas
		// Y cambia el estado de estaMuerto de s2 a true
 		s1.disparar(s2);
		//Pero esta vez vamos a comprobar que ha decrementado en 1 numeroBalas
 		int resultadoObtenido = s1.getNumeroBalas();
 		int resultadoEsperado = 2;
 			
		//Vamos a comprobar que numeroBalas decrementa 1 cuando invocamos este método
 		assertEquals(resultadoEsperado,resultadoObtenido);
 		
	}
	
	@Test
	public void TestDisparaASolSinBalas() {
		//Test Método disparar, este método decrementa en 1 el valor numeroBalas
				// y además debe poner el valor de estaMuerto a true 
				//Primero ponemos numeroBalas a s1 a 0 
			s1.setNumeroBalas(0);
				// Usamos el método puedeDisparar para comprobar primero si puede disparar
				//Si no puede, no tendrá un decremento ni tampoco cambiará el estado de 
				// estaMuerto de s2 a true
				if (s1.puedeDisparar() == true){ 
					s1.disparar(s2);
				}
				boolean resultadoObtenido = s2.isEstaMuerto();
				
				//Como esperamos que no pueda disparar, 
				//Comprobamos que s2 tendrá la variable estaMuerto a false
				assertFalse(resultadoObtenido);
		
		
	}
	
	

}
