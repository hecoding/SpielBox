package Negocio.factoria;

import Negocio.biblioteca.SABiblioteca;
import Negocio.factoria.imp.SAFactoriaImp;
import Negocio.usuario.SAUsuario;
import Negocio.videojuego.SAVideojuego;

public abstract class SAFactoria {
	private static SAFactoria instancia;

	
	public abstract SABiblioteca nuevoServicioBiblioteca();
  
	public abstract SAUsuario nuevoServicioUsuario();
	
	public abstract SAVideojuego nuevoServicioVideojuego();
	
	////////////////////////////////////////////////////////

	public abstract void nuevoServicioPrograma();

	public abstract void  nuevoServicioPlataforma();

	public abstract void nuevoServicioClasificacion();
	
	
	
	public static SAFactoria getInstancia() {
		if (instancia == null){
			instancia = new SAFactoriaImp();
		}
		return instancia;
	}
	
	
}
