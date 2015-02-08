package Presentacion.controlador.comandos.clasificacion;

import java.util.ArrayList;

import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.TransferClasificacion;
import Negocio.factoria.SAFactoria;
import Negocio.programa.TransferPrograma;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

public class CommandMostrarClasificacion implements Command {

	@Override
	public Object execute(Object datos) throws commandException {
		SAClasificacion sa = SAFactoria.getInstancia().nuevoServicioClasificacion();

		ArrayList<TransferPrograma> programas = sa.mostrarClasificacion ((TransferClasificacion) datos);
		String ret="";
		if(programas.size() == 0)
			ret="Esta clasificacion no tiene ningun programa asociado.";
		else
			for(int i=0;i < programas.size();i++)
				ret+=""+(i+1)+".- "+ programas.get(i).getNombre()+ System.lineSeparator();

		return ret; 
	}
}