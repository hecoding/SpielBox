package Negocio.programa;

import Presentacion.controlador.comandos.exceptions.commandException;

public interface SAPrograma {
	
	public void crearPrograma(TransferPrograma datos);
	public void eliminarPrograma(TransferPrograma datos);
	public TransferPrograma mostrarPrograma(TransferPrograma datos);
	public Object mostrarProgramas();
	public void modificarPrograma(TransferPrograma datos) throws commandException;
	
}