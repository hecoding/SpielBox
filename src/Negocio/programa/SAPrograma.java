package Negocio.programa;

import Presentacion.controlador.comandos.exceptions.commandException;

public interface SAPrograma {
	
	public void crearPrograma(TransferPrograma datos) throws commandException;
	public void eliminarPrograma(TransferPrograma datos);
	public void mostrarPrograma(TransferPrograma datos) throws commandException;
	public Object mostrarProgramas();
	public void modificarPrograma(TransferPrograma datos) throws commandException;
	
}