package testdoc;

import javabeans.Jugador;
import javabeans.Soldado;

public class TestJavadoc {

	public static void main(String[] args) {
		Jugador j1 = new Jugador();
		
		j1.ponerDorsal(5);
		
		j1.estaExpulsado();
		
		j1.getNumeroTarjetasAmarillas();
		j1.getNumeroTarjetasRojas();
		j1.getDorsal();
		
		
		Soldado s1 = new Soldado();
		Soldado s2 = new Soldado();
		
		s1.setNumeroBalas(4);
		s1.setEstaMuerto(false);
		
		s1.puedeDisparar();
		
		s1.disparar(s2);
		
		
		
		

	}

}
