package Presentacion.controlador.comandos.bibliotecas;

import Negocio.biblioteca.SABiblioteca;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

public class commandQueryBiblioteca implements Command{

	@Override
	public Object execute(Object datos) throws commandException {
		// TODO Auto-generated method stub
		SABiblioteca service = SAFactoria.getInstancia().nuevoServicioBiblioteca();
		
		return service.buscaBibliotecasNjuegos((int) datos);
	}

}
