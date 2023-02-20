package javabeans;

/**
 * Clase de Soldado, contiene variable numeroBalas y estado de si está muerto o no 
 * Con 2 métodos  disparar a otro soldado y ver si puede disparar según si tiene o no balas
 * 
 * @author Kai
 *@version 1.0
 */

public class Soldado {
	
	/**
	 * Atributo booleano que nos dice si está muerto o no el Soldado
	 */
    private boolean estaMuerto;
    
    /**
     * Atributo número entero que representa el número de balas que tiene nuestro soldado
     */
    private int numeroBalas;

 /**
  * Nos devuelve el estado del soldado
  * @return nos devuelve el estado de la variable estaMuerto
  */
    public boolean isEstaMuerto() {
		return estaMuerto;
	}
    /**
     * Nos deja modificar el estado del soldado 
     * @param estaMuerto  Si está muerto se pone true, sino se  pone en false
     */
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	/**
	 * Muestra la cantidad de balas que tiene el soldado
	 * @return Nos devuelve la cantidad de balas
	 */
	public int getNumeroBalas() {
		return numeroBalas;
	}
	/**
	 * Método que nos permite poner cantidad de balas en el cargador
	 * @param numeroBalas Cantidad de balas que queremos poner, debe ser un número entero
	 */
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	/**
	 * Método que nos dice si nuestro soldado puede disparar, si el número de balas es mayor que 0
	 * @return Nos devuelve true si puede disparar, nos devuelve false, si el valor es menor de 0
	 *
	 */
	public boolean puedeDisparar() {

                  if (this.numeroBalas > 0) {
 
                               return true;
                  }                          
                  return false;
					}

   
/**
 * Método que nos permite disparar a un soldado, restando una bala de la variable numeroBalas
 * y además cambia de estado al soldado afectado a muerto
 * @param sol Este parámetro es el soldado al cuál queremos disparar
 */
    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;
    }
	

}
