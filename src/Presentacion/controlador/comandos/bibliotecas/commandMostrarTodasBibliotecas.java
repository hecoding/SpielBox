package Presentacion.controlador.comandos.bibliotecas;

import java.util.ArrayList;

import Negocio.biblioteca.SABiblioteca;
import Negocio.biblioteca.TransferBiblioteca;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class commandMostrarTodasBibliotecas implements Command {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object execute(Object datos) {
		SABiblioteca service = SAFactoria.getInstancia().nuevoServicioBiblioteca();
		
		ArrayList<TransferBiblioteca> ret = service.mostrarTodasBibliotecas();
          
		return ret;
	}
}