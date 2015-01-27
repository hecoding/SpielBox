package Negocio.clasificacion;

import java.util.ArrayList;

import Presentacion.controlador.comandos.exceptions.commandException;

public interface SAClasificacion {
	
	public void crearClasificacion(TransferClasificacion transfer) throws commandException;
	public void modificarClasificacion(TransferClasificacion transfer);
	public TransferClasificacion mostrarClasificacion (TransferClasificacion transfer);
	public ArrayList<TransferClasificacion> mostrarClasificaciones();
	public void eliminarClasificacion (TransferClasificacion transfer);
	
}