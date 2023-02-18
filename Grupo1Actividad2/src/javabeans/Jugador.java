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
	
	
	private int dorsal;

    private int numeroTarjetasAmarillas;

    private int numeroTarjetasRojas;

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
