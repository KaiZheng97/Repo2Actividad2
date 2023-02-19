package javabeans;


	/**
	 * En esta clase diseñaremos la base para crear objetos Jugador de fútbol, 
	 * los cuales dispondrán de varios atributos y dos métodos que interactúan sobre dichos objetos.
	 * 
	 * @author Sergio
	 * @version 1.0
	 *
	 */
public class Jugador {
	//ATRIBUTOS DE CLASE
	
	/**
	 * Dato de tipo entero que hace referencia al número de dorsal del que dispondrá el Jugador.
	 */	
	private int dorsal;
	
	/**
	 * Dato de tipo entero que hace referencia a la cantidad de tarjetas amarillas que tiene el Jugador.
	 */
    private int numeroTarjetasAmarillas;
    
    /**
     * Dato de tipo entero que hace referencia a la cantidad de tarjetas rojas que tiene el Jugador.
     */
    private int numeroTarjetasRojas;

    
    //GETTER AND SETTER
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
	
	//METODOS DE CLASE
	
	/**
	 * Método que recibe un número entero para establecer el dorsal del jugador.
	 * Con un condicional if acotamos que el dorsal esté comprendido entre los números 1 y 30.
	 * En caso contrario establece el dorsal en -1.
	 * @param dorsal es el dorsal a establecer.
	 */
	
    public void ponerDorsal(int dorsal) {

    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
    	}else {
    		this.dorsal = -1;
    	}
    }

    /**
     * Método que determina si el jugador está o no expulsado en función del número de tarjetas amarillas o rojas que tenga.
     * @return True en caso de tener 2 tarjetas amarillas o 1 roja. False en caso de tener de 0 a 1 tarjetas amarillas o 0 tarjetas rojas.
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
