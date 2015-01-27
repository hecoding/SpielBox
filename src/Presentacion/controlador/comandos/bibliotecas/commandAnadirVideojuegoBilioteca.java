package Presentacion.controlador.comandos.bibliotecas;

import java.util.ArrayList;

import Negocio.biblioteca.SABiblioteca;
import Negocio.biblioteca.TransferBiblioteca;
import Negocio.factoria.SAFactoria;
import Negocio.videojuego.TransferVideojuego;
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
public class commandAnadirVideojuegoBilioteca implements Command {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("unchecked")
	public Object execute(Object datos) throws commandException {
		
		SABiblioteca service = SAFactoria.getInstancia().nuevoServicioBiblioteca();		
		ArrayList<Object> transferVideojuego_biblioteca= (ArrayList<Object>) datos;
		//POSICION 1 TransferBiblioteca, POSICION 2 TransferVideojuego
		service.anadirVideojuegoBiblioteca((TransferVideojuego)transferVideojuego_biblioteca.get(0),(TransferBiblioteca)transferVideojuego_biblioteca.get(1));
          
		return true;
	}
}