package Presentacion.controlador.imp;
import javax.swing.JOptionPane;

import Presentacion.controlador.ControladorAplicacion;
/**
 * 
 */
import Presentacion.controlador.Dispatcher;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.CommandFactoria;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ControladorAplicacionImp extends ControladorAplicacion {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void accionVista(Integer evento, Object datos){
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		Dispatcher.getInstance().dispatch(evento, datos);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void accionCommand(Integer evento, Object datos) {
		//Obtienes comando dependiendo del evento que haya sido generado en la vista
		
		Command c = CommandFactoria.getInstance().getCommand(evento);
        Object retorno;
		try {
			retorno = c.execute(datos);
			Dispatcher.getInstance().dispatch(evento, retorno); // ACTUALIZA LA VISTA DEPENDIENDO DEL COMMANDO CORRESPONDIENTE
		} catch (commandException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
        
	}

}