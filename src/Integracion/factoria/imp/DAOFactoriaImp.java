package Integracion.factoria.imp;

import Integracion.biblioteca.DAOBiblioteca;
import Integracion.biblioteca.imp.DAOBibliotecaImp;
import Integracion.factoria.DAOFactoria;
/**
 * 
 */
import Integracion.usuario.DAOUsuario;
import Integracion.usuario.imp.DAOUsuarioImp;
import Integracion.videojuego.DAOVideojuego;
import Integracion.videojuego.imp.DAOVideojuegoImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOFactoriaImp extends DAOFactoria {

	@Override
	public DAOVideojuego nuevoDaoVideojuego() {
		// TODO Auto-generated method stub
		return new DAOVideojuegoImp();
	}

	@Override
	public DAOUsuario nuevoDaoUsuario() {
		// TODO Auto-generated method stub
		return new DAOUsuarioImp();
	}

	@Override
	public DAOBiblioteca nuevoDaoBiblioteca() {
		// TODO Auto-generated method stub
		return new DAOBibliotecaImp();
	}
}