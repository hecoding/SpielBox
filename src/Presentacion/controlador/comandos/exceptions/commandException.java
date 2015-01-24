package Presentacion.controlador.comandos.exceptions;

@SuppressWarnings("serial")
public class commandException extends Exception {
	
	public commandException(String msg) {
		super(msg);
	}

	public commandException() {
		super();
	}
}
