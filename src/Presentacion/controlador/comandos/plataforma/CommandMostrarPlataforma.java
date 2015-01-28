/**
 * 
 */
package Presentacion.controlador.comandos.plataforma;

import java.util.ArrayList;

import Negocio.factoria.SAFactoria;
import Negocio.plataforma.SAPlataforma;
import Negocio.plataforma.TransferPlataforma;
import Negocio.programa.TransferPrograma;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommandMostrarPlataforma implements Command {

	@Override
	public Object execute(Object datos) throws commandException {
		// TODO Auto-generated method stub
		SAPlataforma service = SAFactoria.getInstancia().nuevoServicioPlataforma();
		
		ArrayList<TransferPrograma> ret = service.mostrarPlataforma((TransferPlataforma) datos);
		
		return ret;
	}

}