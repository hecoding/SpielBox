package Presentacion.controlador.comandos.usuarios;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Negocio.factoria.SAFactoria;
import Negocio.usuario.SAUsuario;
import Negocio.usuario.TransferUsuario;
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
public class commandEliminarUsuario implements Command {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object execute(Object datos) throws commandException {
		SAUsuario service = SAFactoria.getInstancia().nuevoServicioUsuario();
		
		try {
			service.eliminarUsuario((TransferUsuario)datos);
		} catch (commandException e) {
			JOptionPane.showMessageDialog(new JPanel(), e.getMessage());
		}
          
		return (TransferUsuario)datos;
	}
}