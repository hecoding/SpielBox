package Negocio.programa;

import javax.persistence.Entity;

@Entity
public class ProgramaPago extends Programa {
	private float precioFinal;

	public ProgramaPago() {
		
	}

	public float getPrecioFinal() {
		
		return precioFinal;
	}

	public void setPrecioFinal(float precioFinal) {
		
		this.precioFinal = precioFinal;
	}
}