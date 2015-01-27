package Presentacion.controlador.comandos.clasificacion;

import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.TransferClasificacion;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommandModificarClasificacion implements Command {

	@Override
	public Object execute(Object datos) throws commandException {
		SAClasificacion sa = SAFactoria.getInstancia().nuevoServicioClasificacion();
		
		sa.modificarClasificacion ((TransferClasificacion) datos);
		
		return (TransferClasificacion) datos; 
	}
	
}