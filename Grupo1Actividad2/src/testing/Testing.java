package testing;

import javabeans.Jugador;
import javabeans.Soldado;
/**
 * Testeo de las dos clases y sus métodos
 * 
 * @author Kai
 *
 */
public class Testing {

	/**
	 * Vamos a testear todas las posibilidades de cada Clase, tanto Jugador como Soldado
	 * @param args Método main sin argumentos
	 */
	public static void main(String[] args) {
		Soldado s1 = new Soldado();
		s1.setNumeroBalas(5);
		
		System.out.println(s1.puedeDisparar());
		System.out.println(s1.isEstaMuerto());
		
		Jugador j1 = new Jugador();
		j1.setDorsal(35);
		System.out.println(j1.getDorsal());
		j1.ponerDorsal(35);
		System.out.println(j1.getDorsal());
		System.out.println(j1.estaExpulsado());
	}

}
