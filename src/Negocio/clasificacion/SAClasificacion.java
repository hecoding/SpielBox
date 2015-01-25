package Negocio.clasificacion;

import java.util.ArrayList;

public interface SAClasificacion {
	
	public void crearClasificacion(TransferClasificacion transfer);
	public void modificarClasificacion(TransferClasificacion transfer);
	public TransferClasificacion mostrarClasificacion (TransferClasificacion transfer);
	public ArrayList<TransferClasificacion> mostrarClasificaciones();
	public void eliminarClasificacion (TransferClasificacion transfer);
	
}