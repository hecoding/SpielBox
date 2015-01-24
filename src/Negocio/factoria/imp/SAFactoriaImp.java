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
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void nuevoServicioPrograma() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void nuevoServicioPlataforma() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void nuevoServicioClasificacion() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

}
