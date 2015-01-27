package Presentacion.controlador.comandos.videojuegos;

import Negocio.factoria.SAFactoria;
import Negocio.videojuego.SAVideojuego;
import Negocio.videojuego.TransferVideojuego;
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
public class commandMostrarVideojuego implements Command {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @throws commandException 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object execute(Object datos) throws commandException  {
		SAVideojuego service = SAFactoria.getInstancia().nuevoServicioVideojuego();
		
		TransferVideojuego ret = null;
		try {
			ret = service.mostrarVideojuego((TransferVideojuego) datos);
		} catch (commandException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}