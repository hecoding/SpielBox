package Negocio.programa;

import javax.persistence.Entity;

@Entity
public class ProgramaPago extends Programa {
	private float precioFinal;

	public ProgramaPago() {
		
	}

	
	public float getPrecio() {
		
		return precioFinal;
	}
	
	
	public void setPrecio(float dineros) {
		
		precioFinal = dineros;
	}
}