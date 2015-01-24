package Presentacion.controlador.imp;
import Presentacion.controlador.ControladorAplicacion;
/**
 * 
 */
import Presentacion.controlador.Dispatcher;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.CommandFactoria;

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
	public void accionVista() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

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
        Object retorno = c.execute(datos); //Puede contener un arrayList o contenedor para actualizar la vista con el Dispatcher
        
        Dispatcher.getInstance().dispatch(evento, retorno); // ACTUALIZA LA VISTA DEPENDIENDO DEL COMMANDO CORRESPONDIENTE
	}

}