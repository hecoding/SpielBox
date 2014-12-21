package Negocio.biblioteca;

import java.util.ArrayList;

import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.comandos.exceptions.commandException;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface SABiblioteca {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 * @param nuevo TODO
	 * @return TODO
	 */
	public void crearBiblioteca(TransferBiblioteca nuevo)throws commandException;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 * @param mod TODO
	 */
	public void modificarBiblioteca(TransferBiblioteca mod)throws commandException;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 * @param biblio TODO
	 */
	public ArrayList<TransferVideojuego> mostrarBiblioteca(TransferBiblioteca biblio);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TransferBiblioteca> mostrarTodasBibliotecas();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 * @param newParam TODO
	 */
	public void eliminarBiblioteca(TransferBiblioteca del) ;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void anadirVideojuegoBiblioteca(TransferVideojuego nuevo, TransferBiblioteca anyadir);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void eliminarVideojuegoBiblioteca(TransferVideojuego nuevo, TransferBiblioteca anyadir);
	
	
	public ArrayList<TransferVideojuego> buscaBibliotecasNjuegos(int id);
}