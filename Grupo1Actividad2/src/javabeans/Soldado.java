package javabeans;

/**
 * <b>Clase Soldado.java </b> representa a un Soldado con sus atributos (privados).
 * En este caso son: un valor numérico (numeroBalas), y un boolean (estaMuerto). 
 * 
 * <b>Propósito de los métodos de la clase Soldado.java </b>
 * <ul>
 * Comprobar si el Soldado está muerto devolviendo true or false.
 * Comprobar si tiene suficientes balas para disparar.
 * </ul>
 * @author fgrhanny
 * @version 1.0
 */

public class Soldado {
	
	// Atributos de la clase.
	
	/**
	 *<b>Atributos de la clase</b>
	 *
	 * Este entero: <b>numeroBalas</b>, hace referencia al número restante de balas que tiene el Soldado en su posesión.
	 * Este boolean: <b>estaMuerto</b> devuelve el estado del Soldado.
	 */
	
    private boolean estaMuerto;
    private int numeroBalas;
    

    // Getters and setters.
   
    public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	
	// Métodos propios de la clase Soldado.

	/**
	 * <b> puedeDisparar </b> es un boolean que se ejecuta (true) si el número de balas es mayor que cero 
	 * @return true if el parámetro numeroBalas es mayor que cero, false if el parámetro numeroBalas no es mayor que cero.
	 */
	public boolean puedeDisparar() {

       if(this.numeroBalas > 0) {
    	   return true;
     }                          
       return false;
    }

	/**
	 * <ul>
	 * Esta función: Ejecuta un disparo recibiendo un parámetro de tipo Soldado que define como (Soldado sol)
	 * Declara como true la variable boolean con nombre estaMuerto
	 * Resta una unidad al dato entero numeroBalas
	 * </ul>
	 * 
	 * @param sol es el objeto Soldado al que se le dispara en específico.
	 */
	
    public void disparar(Soldado sol) {
    	this.numeroBalas -- ;
    	sol.estaMuerto = true;
    }
	
}
