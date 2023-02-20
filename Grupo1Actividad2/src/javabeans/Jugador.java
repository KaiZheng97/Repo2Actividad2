package javabeans;

/**
 *Clase Jugador que nos hace saber, el dorsal del jugador, y la cantidad de faltas que ha cometido
 *y dependiendo de la cantidad, sabremos si está expulsado o no
 * 
 * @author Kai
 *@version 2.0
 *
 */
public class Jugador {
	
	/**
	 * Número entero que indica el dorsal que lleva el jugador
	 */
	private int dorsal;
	
	
	/**
	 *  Número entero que contiene la cantidad de tarjetas amarillas que le pongan al jugador
	 */
    private int numeroTarjetasAmarillas;
    
    /**
     * Número entero que contiene la cantidad de tarjetas rojas que le pongan al jugador
     */
    private int numeroTarjetasRojas;
    
/**
 * Método get para obtener el número dorsal del jugador
 * @return nos devuelve el número dorsal del jugador
 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * Método set que nos deja poner el número del dorsal del jugador
	 * @param dorsal Número entero para el dorsal del jugador
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	/**
	 * Nos devuelve la cantidad de amarillas que tiene el jugador
	 * @return  Número de tarjetas amarillas que tiene el jugador
	 */

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	/**
	 * Método set
	 * Método para modificar la cantidad de amarillas que tiene el jugador
	 * @param  numeroTarjetasAmarillas  número de tarjetas amarillas 
	 */
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	
	/**
	 * Método que nos permite ver la cantidad de rojas de un jugador
	 * @return nos devuelve la cantidad de rojas que tiene el jugador
	 */
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	
	/**
	 * Método que nos permite cambiar la cantidad de rojas que tiene un jugador
	 * @param numeroTarjetasRojas  Cantidad de rojas
	 */
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	

/**
 * Método que pone el número de dorsal a un jugador
 * sólo puedes poner un dorsal entre 1 a 30
 * sino se pondrá el dorsal a -1
 * @param dorsal Número de dorsal que quieres ponerle al jugador
 */
    public void ponerDorsal(int dorsal) {

                  if(dorsal >= 1 && dorsal <= 30) {
                                this.dorsal = dorsal;
                  }
                  else {
                                this.dorsal = -1;
                  }

    }

   /**
    * Método que comprueba si un jugador está expulsado según la cantidad
    * de tarjetas amarillas o tarjetas rojas que tenga el jugador 
    * @return En caso de que un jugador tenga numeroTarjetasAmarillas a 2, el valor que devuelve expulsado será true
    * En caso de que un jugador tenga numeroTarjetasRojas a 1, el valor que devuelve expulsado será true
    * En caso de que no cumpla ninguno de los dos casos, devolverá expulsado false
    */
    public boolean estaExpulsado() {
                  boolean expulsado = false;  
                  
                  if(numeroTarjetasAmarillas == 2) {
                                expulsado = true;
                  }                          
                  if(numeroTarjetasRojas == 1) {
                                expulsado = true;
                  }                          
                  return expulsado;
    }    
    
}
