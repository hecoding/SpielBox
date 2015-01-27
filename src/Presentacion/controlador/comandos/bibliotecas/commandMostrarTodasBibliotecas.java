package Presentacion.controlador.comandos.bibliotecas;

import java.util.ArrayList;

import Negocio.biblioteca.SABiblioteca;
import Negocio.biblioteca.TransferBiblioteca;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;
/**
 * 
 */
import Presentacion.controlador.comandos.exceptions.commandException;

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
	public Object execute(Object datos) throws commandException {
		SABiblioteca service = SAFactoria.getInstancia().nuevoServicioBiblioteca();
		
		ArrayList<TransferBiblioteca> ret = service.mostrarTodasBibliotecas();
          
		return ret;
	}
}