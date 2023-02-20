package javabeans;

/**
 * <b>Clase Jugador.java </b> representa a un Jugador con sus atributos (privados).
 * En este caso son tanto valores numéricos como boolean, representando los distintos estados y características
 * que podría tener la figura de un Jugador. Dorsal, cuántas tarjetas amarillas o rojas acumula, o si está expulsado.
 * 
 * <b>Propósito de los métodos de la clase Jugador.java </b>
 * <ul>
 * Comprobar si el Jugador está expulsado devolviendo true or false.
 * Asignar un valor numérico tipo int que hará la función de dorsal del jugador.
 * </ul>
 * @author fgrhanny
 * @version 1.0
 */

public class Jugador {	
	// Atributos de la clase Jugador, privados.
	
	/**
	 *<b>Atributos de la clase</b>
	 *
	 * Este entero: <b>private int dorsal</b>, hace referencia al valor numérico de dorsal asignado al Jugador.
	 */
	
	private int dorsal;
	
	/**
	 * Este entero: <b>numeroTarjetasAmarillas</b> se refiere a la cantidad de tarjetas amarillas que 
	 * acumula el jugador.
	 */

    private int numeroTarjetasAmarillas;
     
    /**
     * <b>numeroTarjetasRojas</b> es otro atributo de tipo valor numérico entero que en este caso hace
     * referencia al número de tarjetas <b>rojas</b> que acumularía Jugador.
     */

    private int numeroTarjetasRojas;
   
    
    
    // Getters and setters.

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
	
	
	// Métodos propios de la clase Jugador.
	 
	/**
	 * 
	 * Este método <b>ponerDorsal</b> recibe el valor numérico de tipo int que establece el dorsal 
	 * del jugador,con el condicional <b> if </b> establece que el valor a asignar tiene 
	 * que estar comprendido entre los números 1 y 30, ambos inclusive y de no ser así, el valor se
	 * establece como negativo. 
	 *  
	 * @param dorsal es la variable donde guardamos el parámetro int establecido.
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
     * Método boolean: <b>estaExpulsado</b>. Este método indica si el jugador está o no expulsado en función
     * a las tarjetas que acumule. 
     * @return: <b>true</b>, en caso de que el jugador acumule dos tarjetas amarillas o una roja <b>false</b>
     * en caso de que el jugador tenga cero tarjetas rojas y cero o una tarjetas amarillas.
     */

    public boolean estaExpulsado() {

           boolean expulsado = false;                                                  

              if(numeroTarjetasAmarillas == 2){

                 expulsado = true;
                 }                          

              if(numeroTarjetasRojas == 1) {

                 expulsado = true;
                 }                          

           return expulsado;
    }         
}
