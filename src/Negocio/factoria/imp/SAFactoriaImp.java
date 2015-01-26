package Negocio.factoria.imp;

import Negocio.biblioteca.SABiblioteca;
import Negocio.biblioteca.imp.SABibliotecaImp;
import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.imp.SAClasificacionImp;
import Negocio.factoria.SAFactoria;
import Negocio.plataforma.SAPlataforma;
import Negocio.plataforma.imp.SAPlataformaImp;
import Negocio.programa.SAPrograma;
import Negocio.programa.imp.SAProgramaImp;
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
	 * @return 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAPrograma nuevoServicioPrograma() {
		return new SAProgramaImp();
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAPlataforma nuevoServicioPlataforma() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
		return new SAPlataformaImp();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAClasificacion nuevoServicioClasificacion() {
		return new SAClasificacionImp();
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

}
