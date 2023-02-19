package javabeans;

/**
 * This <b>'Jugador' class</b> is used both to determine if a <b>player is expelled</b> or not 
 * and to <b>add a number on their back</b>.
 * 
 * For that, we have some methods such as: 
 *<ul>
 * 	  <li>ponerDorsal()</li>
 *    <li>estaExpulsado()</li>
 *</ul>
 * 
 * 
 * 
 * @author Carol B. Sempere
 * @version 1.0
 *
 */



public class Jugador {
	
	private int dorsal;
    private int numeroTarjetasAmarillas;
    private int numeroTarjetasRojas;
    
    
    /**
     * Method to <b>set</b> a value to the 'dorsal' attribute 
     * 
     * The 'dorsal' attribute must be a number greater than or equal to 1 
     * and less than or equal to 30.
     * In case it is not between this values, the method sets it to -1.
     * 
     * 
     * 
     * @param dorsal, an integer which is the number we want to set.
     * 
     */

    public void ponerDorsal(int dorsal) {

        if(dorsal >= 1 && dorsal <= 30) {
           this.dorsal = dorsal;
            } else {
               this.dorsal = -1;
        }

    }
    
    /**
     * Method to check if a player is expelled or not
     * 
     * If the attribute numeroTarjetasAmarillas is equal to 2
     * or the attribute numeroTarjetasRojas is equal to 1 the player is expelled.
     *  
     * @return a boolean, true if the player is expelled, false if the player isn't. 
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
    
    public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	

}
