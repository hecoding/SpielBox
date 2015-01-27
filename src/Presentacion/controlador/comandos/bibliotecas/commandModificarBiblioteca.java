package Presentacion.controlador.comandos.bibliotecas;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
public class commandModificarBiblioteca implements Command {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object execute(Object datos) throws commandException {
		SABiblioteca service = SAFactoria.getInstancia().nuevoServicioBiblioteca();
		
		try { //No HACE FALTA DEVOLVER ALGO PORQUE SI HUBIESE ALGO MAL PRIMERO SALTARIA LA EXCEPCION
			service.modificarBiblioteca((TransferBiblioteca) datos);
		} catch (commandException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(new JPanel(), e.getMessage());
		}
          
		return (TransferBiblioteca) datos;
	}
}