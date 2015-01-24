package Negocio.videojuego;

import java.util.ArrayList;

import Presentacion.controlador.comandos.exceptions.commandException;

public interface SAVideojuego {
	
	public void crearVideojuego(TransferVideojuego t) throws commandException;

	
	public void modificarVideojuego(TransferVideojuego t) throws commandException;

	
	public TransferVideojuego mostrarVideojuego(TransferVideojuego t) throws commandException;

	
	public ArrayList<TransferVideojuego> mostrarTodosVideojuegos();

	
	public void eliminarVideojuego(TransferVideojuego t) throws commandException;
}