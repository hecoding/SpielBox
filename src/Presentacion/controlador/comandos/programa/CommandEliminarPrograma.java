/**
 * 
 */
package Presentacion.controlador.comandos.programa;

import Negocio.factoria.SAFactoria;
import Negocio.programa.SAPrograma;
import Negocio.programa.TransferPrograma;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommandEliminarPrograma implements Command {

	public Object execute(Object datos) throws commandException {
		SAPrograma sa = SAFactoria.getInstancia().nuevoServicioPrograma();

		sa.eliminarPrograma ((TransferPrograma) datos);

		return (TransferPrograma) datos;
	}
}