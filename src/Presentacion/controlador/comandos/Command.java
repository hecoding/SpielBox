package Presentacion.controlador.comandos;

import Presentacion.controlador.comandos.exceptions.commandException;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface Command {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 * @param datos TODO
	 * @return TODO
	 * @throws commandException TODO
	 */
	public Object execute(Object datos) throws commandException;
}