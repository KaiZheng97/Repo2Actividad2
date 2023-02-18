package javabeans;

/**
 * Clase java que te hace saber si un soldado </b>está muerto o no, y el número de balas que tiene</b>
 * Con método a </b>disparar a otro soldado</b> y ver si puede  disparar según </b>si tiene o no balas</b>
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
  * @return
  */
    public boolean isEstaMuerto() {
		return estaMuerto;
	}
    /**
     * Nos deja modificar el estado del soldado 
     * 
     * @param estaMuerto  Si está muerto se pone true, sino le ponemos un false
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
	 * 
	 * @return Nos devuelve true si puede disparar, nos devuelve false, si su cargador está vacío
	 *
	 */
	public boolean puedeDisparar() {

                  if (this.numeroBalas > 0) {
 
                               return true;
                  }                          
                  return false;
					}

   
/**
 * 
 * Método que dispara a un soldado, resta una bala de su número de balas,
 *  y pone en estado de muerto al soldado disparado
 *  
 *  * @param sol  Este parámetro indica el soldado al va a disparar
 * 
 */
    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;
    }
	

}
