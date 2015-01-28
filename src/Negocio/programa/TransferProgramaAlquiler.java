package Negocio.programa;


public class TransferProgramaAlquiler extends TransferPrograma {
	private float precioHora;

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float dineros) {
		precioHora = dineros;
	}
	
	public String toString() {
		return super.toString() + "Precio por hora: " + this.precioHora;
	}
}