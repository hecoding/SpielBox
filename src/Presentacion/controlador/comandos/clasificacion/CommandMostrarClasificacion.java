package Presentacion.controlador.comandos.clasificacion;

import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.TransferClasificacion;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;

public class CommandMostrarClasificacion implements Command {
	
	@Override
	public Object execute(Object datos) {
		SAClasificacion sa = SAFactoria.getInstancia().nuevoServicioClasificacion();
		
		sa.mostrarClasificacion ((TransferClasificacion) datos);
		
		return (TransferClasificacion) datos; 
	}
}