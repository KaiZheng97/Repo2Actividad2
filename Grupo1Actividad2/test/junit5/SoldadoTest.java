package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabeans.Soldado;

class SoldadoTest {
			//Creamos una variable soldado
	private Soldado s1;
	
	//Cremos un nuevo objeto de la clase soldado que lo hará  al principio de cada Test
	@BeforeEach
	 void crear() throws Exception{
		s1 = new Soldado();
		
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
		
	public void TestDisparaASol(Soldado sol2) {
		//Test Método disparar, este método decrementa en 1 el valor numeroBalas
		// y además debe poner el valor de estaMuerto a true 
		s1.setNumeroBalas(5);
		boolean resultadoObtenido = s1.disparar(sol2);
		assertTrue(s1.disparar(sol2));
		
		
		
	}
	
	
	

}
