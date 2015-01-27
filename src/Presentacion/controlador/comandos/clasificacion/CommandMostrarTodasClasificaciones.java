package Presentacion.controlador.comandos.clasificacion;

import Negocio.clasificacion.SAClasificacion;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

public class CommandMostrarTodasClasificaciones implements Command {

	@Override
	public Object execute(Object datos) throws commandException {
		SAClasificacion sa = SAFactoria.getInstancia().nuevoServicioClasificacion();
		
		return sa.mostrarClasificaciones(); 
	}
	
}