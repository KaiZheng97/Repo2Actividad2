package javabeans;


	/**
	 * En esta clase diseñaremos la base para crear objetos Jugador de fútbol, 
	 * los cuales dispondrán de varios atributos y dos métodos que intercactúan sobre dichos objetos.
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
	 * Dato de tipo entero que hace referencia al hecho de si el objeto Jugador
	 * posee tarjetas amarillas y su cantidad. 
	 */
    private int numeroTarjetasAmarillas;
    
    /**
     * Dato de tipo entero que hace referencia al hecho de si el objeto Jugador
	 * posee tarjetas rojas y su cantidad. 
     */
    private int numeroTarjetasRojas;

    
    //GETTER Y SETTER
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
	
    public void ponerDorsal(int dorsal) {

    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
    	}else {
    		this.dorsal = -1;
    	}
    }

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
