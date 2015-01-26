/**
 * 
 */
package Presentacion.controlador.comandos.programa;

import Negocio.factoria.SAFactoria;
import Negocio.programa.SAPrograma;
import Presentacion.controlador.comandos.Command;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommandMostrarProgramas implements Command {


	@Override
	public Object execute(Object datos) {
		SAPrograma sa = SAFactoria.getInstancia().nuevoServicioPrograma();

		return sa.mostrarProgramas();
	}
}