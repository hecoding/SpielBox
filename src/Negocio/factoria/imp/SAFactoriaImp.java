package Negocio.factoria.imp;

import Negocio.biblioteca.SABiblioteca;
import Negocio.biblioteca.imp.SABibliotecaImp;
import Negocio.factoria.SAFactoria;
import Negocio.usuario.SAUsuario;
import Negocio.usuario.imp.SAUsuarioImp;
import Negocio.videojuego.SAVideojuego;
import Negocio.videojuego.imp.SAVideojuegoImp;

public class SAFactoriaImp extends SAFactoria {

	@Override
	public SABiblioteca nuevoServicioBiblioteca() {
		// TODO Auto-generated method stub
		return new SABibliotecaImp();
	}

	@Override
	public SAUsuario nuevoServicioUsuario() {
		// TODO Auto-generated method stub
		return new SAUsuarioImp();
	}

	@Override
	public SAVideojuego nuevoServicioVideojuego() {
		// TODO Auto-generated method stub
		return new SAVideojuegoImp();
	}

}
