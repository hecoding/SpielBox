package Negocio.factoria;

import Negocio.biblioteca.SABiblioteca;
import Negocio.clasificacion.SAClasificacion;
import Negocio.factoria.imp.SAFactoriaImp;
import Negocio.plataforma.SAPlataforma;
import Negocio.programa.SAPrograma;
import Negocio.usuario.SAUsuario;
import Negocio.videojuego.SAVideojuego;

public abstract class SAFactoria {
	private static SAFactoria instancia;

	
	public abstract SABiblioteca nuevoServicioBiblioteca();
  
	public abstract SAUsuario nuevoServicioUsuario();
	
	public abstract SAVideojuego nuevoServicioVideojuego();
	
	////////////////////////////////////////////////////////

	public abstract SAPrograma nuevoServicioPrograma();

	public abstract SAPlataforma  nuevoServicioPlataforma();

	public abstract SAClasificacion nuevoServicioClasificacion();
	
	
	
	public static SAFactoria getInstancia() {
		if (instancia == null){
			instancia = new SAFactoriaImp();
		}
		return instancia;
	}
	
	
}
