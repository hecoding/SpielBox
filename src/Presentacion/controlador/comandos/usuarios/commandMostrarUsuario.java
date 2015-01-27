package Presentacion.controlador.comandos.usuarios;

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
public class commandMostrarUsuario implements Command {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object execute(Object datos) throws commandException {
		SAUsuario service = SAFactoria.getInstancia().nuevoServicioUsuario();
		TransferUsuario ret = service.mostrarUsuario((TransferUsuario) datos);  
		return ret;
	}
}