package Presentacion.controlador.comandos.videojuegos;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Negocio.factoria.SAFactoria;
import Negocio.videojuego.SAVideojuego;
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
public class commandCrearVideojuego implements Command {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object execute(Object datos) throws commandException {
		
	SAVideojuego service = SAFactoria.getInstancia().nuevoServicioVideojuego();
		try {
			service.crearVideojuego((TransferVideojuego)datos);
		} catch (commandException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(new JPanel(), e.getMessage());
		}
		return (TransferVideojuego)datos; 
	}
}