package Negocio.programa;


public class TransferProgramaPago extends TransferPrograma {
	private float precioFinal;
	
	public float getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(float dineros) {
		precioFinal = dineros;
	}
	
	public String toString() {
		return super.toString() + "Precio Final: " + this.precioFinal;
	}
}