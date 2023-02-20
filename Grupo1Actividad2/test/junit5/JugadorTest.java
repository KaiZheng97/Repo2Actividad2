package junit5;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabeans.Jugador;

class JugadorTest {
	
	private Jugador j1;
	
	@BeforeEach
	void creacion() throws Exception{
		
		// Sobreescribir el jugador 1 antes de cada ejecución de cada test de manera limpia
		
		j1 = new Jugador();
		
	
	}
	
	@AfterEach
		void limpiar() throws Exception{
		// Después de cada ejecución se limpiará el jugador  poniendo a null
		j1 = null;
	}
	
	
	@Test
	public void testPonerDorsalBien() {
		
		//Test para saber si el método ponerDorsal funciona cuando cumplen su condición 
		//El dorsal se pondrá siempre y cuando su valor esté entre 1 y 30 ambos incluidos, vamos a darle valor de 5
		j1.ponerDorsal(5);
		
		int resultadoEsperado = 5;
		int resultadoObtenido = j1.getDorsal();
		//Comprobamos que su contenido se haya modificado a 5
		
		assertEquals( resultadoEsperado,resultadoObtenido);				
	}
	
	@Test
	
	public void testPonerDorsalCero() {
		
		//Segundo test para ver que cuando declaramos el ponerDorsal a cero, debería darnos un -1 
		// Ya que no permite número fuera de su rango
		
		j1.ponerDorsal(0);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal();
		// Comprobamos que tiene un correcto funcionamiento
		
		assertEquals( resultadoEsperado,resultadoObtenido);
	}
	
	@Test
	
	 public void testPonerDorsalMal() {
		//Test para comprobar que cualquier número que no esté comprendido entre 0 y 30
		// NO se definirán en la variable dorsal
		
		j1.ponerDorsal(55);
		
		//Comprobamos que NO ha definido la variable dorsal a 55
		
		int resultadoNoEsperado = 55;
		int resultadoObtenido = j1.getDorsal();
		
		assertNotEquals( resultadoNoEsperado,resultadoObtenido);
		
	}
	
	@Test
	
	public void testExpulsadoAmarillas() {
		//Test método estaExpulsado 
		//Consiste si está expulsado o no el jugador según su variable numeroTarjetasAmarillas
		// Si la cantidad es de 2, su estado de expulsado pasará a ser true
		
		//Primero tendremos que setear su variable numeroTarjetasAmarillas a 2
		j1.setNumeroTarjetasAmarillas(2);
		
		boolean resultadoObtenido= j1.estaExpulsado();
		//Hacemos la comprobación de que el método estaExpulsado nos retorna valor de true
		assertTrue(resultadoObtenido);
		
	}
	
	@Test
	
	public void testExpulsadoRojas() {
		//Test método estaExpulsado 
		//Consiste si está expulsado o no el jugador según su variable numeroTarjetasRojas
				// Si la cantidad es de 1, su estado de expulsado pasará a ser true
				
				//Primero tendremos que setear su variable numeroTarjetasRojas a 1
				j1.setNumeroTarjetasRojas(1);
				
				boolean resultadoObtenido= j1.estaExpulsado();
				//Hacemos la comprobación de que el método estaExpulsado nos retorna valor de true
				
				assertTrue(resultadoObtenido);
		
	}
	
	@Test
	
	public void testUnaAmarilla() {
		//Test método estaExpulsado 
		//Que consiste en comprobar si está expulsado o no cuando su variable numeroTarjetasAmarillas sea 1
		j1.setNumeroTarjetasAmarillas(1);
		
		boolean resultadoObtenido = j1.estaExpulsado();
		
		//Comprobamos que nos devuelve valor de false
		
		assertFalse(resultadoObtenido);
	}
	
@Test
	
	public void testNingunaRoja() {
		//Test método estaExpulsado 
		//Que consiste en comprobar si está expulsado o no cuando su variable numeroTarjetasRojas sea 0
		j1.setNumeroTarjetasRojas(0);
		
		boolean resultadoObtenido = j1.estaExpulsado();
		
		//Comprobamos que nos devuelve valor de false
		
		assertFalse(resultadoObtenido);
	}
	
	public void testOtraCantTarjeta() {
		//Test método estaExpulsado
		//Consiste en probar cuando las variables numeroTarjetasRojas y numeroTarjetasAmarillas tienen otros valores
		j1.setNumeroTarjetasAmarillas(5);
		
		//En este caso nos debería retornar en un valor de false, aunque yo pondría más limitaciones
		// al método, para que funcionase sólo en un rango deseado
		
		boolean resultadoObtenido = j1.estaExpulsado();
		
		// Comprobamos que sea false 
		assertFalse(resultadoObtenido);
	}
}
