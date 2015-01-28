package Negocio.programa;

import javax.persistence.Entity;

@Entity
public class ProgramaAlquiler extends Programa {
	private float precioHora;

	public void getPrecioFinal() {
		
	}

	public void setPrecioFinal() {
		
	}

	public ProgramaAlquiler() {
		
	}
	
	
	public float getPrecio() {
		
		return precioHora;
	}

	
	public void setPrecio(float dineros) {
		
		precioHora = dineros;
	}
	
	public String toString() {
		return super.toString() + "PRECIO HORA: " + precioHora;
	}
	
	
}