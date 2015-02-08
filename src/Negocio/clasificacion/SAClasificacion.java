package Negocio.clasificacion;

import java.util.ArrayList;

import Negocio.programa.TransferPrograma;
import Presentacion.controlador.comandos.exceptions.commandException;

public interface SAClasificacion {
	
	public void crearClasificacion(TransferClasificacion transfer) throws commandException;
	public void modificarClasificacion(TransferClasificacion transfer) throws commandException;
	public ArrayList<TransferPrograma> mostrarClasificacion (TransferClasificacion transfer);
	public ArrayList<TransferClasificacion> mostrarClasificaciones();
	public void eliminarClasificacion (TransferClasificacion transfer);
	
}