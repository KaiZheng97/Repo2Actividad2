package javabeans;

/**
 * The purpose of this class is to <b>check</b> both, if a soldier 
 * has <b>enough bullets to shoot</b> and if a soldier <b>is dead</b>.
 * 
 * To achieve this we have two methods:
 * <ul>
 * 	<li>puedeDisparar</li>
 * 	<li>disparar</li>
 * </ul>
 * 
 * 
 *
 * 
 *@author Carol B. Sempere
 *@version 1.0
 */

public class Soldado {
	
    private boolean estaMuerto;
    private int numeroBalas;

   

    /**
     * This method checks if a soldier can shoot
     * according to the amount of bullets in the attribute 'numeroBalas'.
     * 
     * 
     * If the total amount of 'numeroBalas' is greater than 0, the soldier
     * is able to shoot. 
     * 
     * @return a boolean, true if 'numeroBalas' is greater than ', false if it isn't. 
     */

	public boolean puedeDisparar() {

      if(this.numeroBalas > 0) {
           return true;

       }                          
           return false;

    }

	
	/**
	 * This method determine if a soldier is dead.
	 * 
	 * When 'numeroBalas' decreases by one, 'sol' is dead.
	 * Then the attribute 'estaMuerto' which is a boolean,
	 * changes to true. Again, that means the soldier is dead.
	 * 
	 * @param sol. Is the Object from Soldado who is actually shot.
	 */
    public void disparar(Soldado sol) {
    	this.numeroBalas--;
    	sol.estaMuerto = true;

    }
    
    
    
    
    
    
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

	

}
