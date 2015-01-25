package Presentacion.controlador.comandos.clasificacion;

import Negocio.clasificacion.SAClasificacion;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;

public class CommandMostrarTodasClasificaciones implements Command {

	@Override
	public Object execute(Object datos) {
		SAClasificacion sa = SAFactoria.getInstancia().nuevoServicioClasificacion();
		
		return sa.mostrarClasificaciones(); 
	}
	
}