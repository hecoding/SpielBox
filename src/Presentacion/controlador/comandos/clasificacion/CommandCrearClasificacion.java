package Presentacion.controlador.comandos.clasificacion;

import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.TransferClasificacion;
import Negocio.factoria.SAFactoria;
import Presentacion.controlador.comandos.Command;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author H�ctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommandCrearClasificacion implements Command {

	@Override
	public Object execute(Object datos) {
		SAClasificacion sa = SAFactoria.getInstancia().nuevoServicioClasificacion();
		TransferClasificacion p =(TransferClasificacion) datos;
		sa.crearClasificacion((TransferClasificacion) datos);
		
		return (TransferClasificacion) datos; 
	}
}