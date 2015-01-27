package Presentacion.controlador.comandos.clasificacion;

import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.TransferClasificacion;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

public class CommandEliminarClasificacion implements Command {
	@Override
	public Object execute(Object datos) throws commandException {
		SAClasificacion sa = SAFactoria.getInstancia().nuevoServicioClasificacion();
		
		sa.eliminarClasificacion((TransferClasificacion) datos);
		
		return (TransferClasificacion) datos; 
	}
}