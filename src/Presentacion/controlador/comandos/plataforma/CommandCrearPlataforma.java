/**
 * 
 */
package Presentacion.controlador.comandos.plataforma;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Negocio.factoria.SAFactoria;
import Negocio.plataforma.SAPlataforma;
import Negocio.plataforma.TransferPlataforma;
import Negocio.videojuego.SAVideojuego;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommandCrearPlataforma implements Command {

	@Override
	public Object execute(Object datos) {
		// TODO Auto-generated method stub
		SAPlataforma service = SAFactoria.getInstancia().nuevoServicioPlataforma();
		String ret="";
		try {
			ret= service.crearPlataforma((TransferPlataforma)datos);
		} catch (commandException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, ret);
		}
		return (TransferPlataforma)datos; 
	}
}