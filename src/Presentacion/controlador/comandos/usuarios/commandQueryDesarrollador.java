package Presentacion.controlador.comandos.usuarios;

import Negocio.factoria.SAFactoria;
import Negocio.usuario.SAUsuario;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

public class commandQueryDesarrollador implements Command{

	@Override
	public Object execute(Object datos) throws commandException {
		// TODO Auto-generated method stub
		SAUsuario service = SAFactoria.getInstancia().nuevoServicioUsuario();
		return service.buscarDesarroladorDescuento((int) datos);
	}

}
