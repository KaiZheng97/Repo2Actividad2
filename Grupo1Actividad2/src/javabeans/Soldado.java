package javabeans;


	/**	
	 * En esta clase diseñaremos la base para crear objetos Soldado, 
	 * los cuales dispondrán de varios atributos y dos métodos que interactúan con dichos objetos.
	 * @author Sergio
	 * @version 1.0
	 */
public class Soldado {
	
	//ATRIBUTOS DE CLASE
	
	/**
	 * Atributo de tipo boolean que determina si el soldado está vivo o no.
	 */
    private boolean estaMuerto;
    
    /**
     * Atributo de tipo entero que determina la cantidad de balas de las que dispone el soldado.
     */
    private int numeroBalas;
    
    
    //GETTER AND SETTER

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

	
	//METODOS DE CLASE
	
	/**
	 * Este método determina si el soldado puede disparar analizando si el número de balas del que dispones es mayor que 0.
	 * @return True si el número de balas es mayor a 0. False en caso contrario.
	 */
	public boolean puedeDisparar() {
		if(this.numeroBalas > 0) {
			return true;
		}                          
		return false;
    }

	/**
	 * Este método simula un disparo y recibe un Objeto sol de tipo Soldado.
	 * Reduce en una unidad el número de balas previamente establecidas.
	 * Declara el atributo estaMuerto del Objeto sol recibido en True.
	 * @param sol El Objeto Soldado al que se dispara.
	 */
    public void disparar(Soldado sol) {
    	this.numeroBalas--;
    	sol.estaMuerto = true;

    }
	

}
