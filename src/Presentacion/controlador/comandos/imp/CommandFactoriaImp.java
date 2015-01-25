package Presentacion.controlador.comandos.imp;

import Presentacion.controlador.Eventos;
import Presentacion.controlador.comandos.Command;
import Presentacion.controlador.comandos.CommandFactoria;
import Presentacion.controlador.comandos.bibliotecas.commandAnadirVideojuegoBilioteca;
import Presentacion.controlador.comandos.bibliotecas.commandCrearBiblioteca;
import Presentacion.controlador.comandos.bibliotecas.commandEliminarBiblioteca;
import Presentacion.controlador.comandos.bibliotecas.commandEliminarVideojuegoBiblioteca;
import Presentacion.controlador.comandos.bibliotecas.commandMostrarBiblioteca;
/**
 * 
 */
import Presentacion.controlador.comandos.bibliotecas.commandModificarBiblioteca;
import Presentacion.controlador.comandos.bibliotecas.commandQueryBiblioteca;
import Presentacion.controlador.comandos.plataforma.CommandAnadirProgramaPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandBorrarProgramaPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandCrearPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandEliminarPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandModificarPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandMostrarPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandMostrarPlataformas;
import Presentacion.controlador.comandos.usuarios.commandCrearUsuario;
import Presentacion.controlador.comandos.usuarios.commandEliminarUsuario;
import Presentacion.controlador.comandos.usuarios.commandModificarUsuario;
import Presentacion.controlador.comandos.usuarios.commandMostrarTodosUsuarios;
import Presentacion.controlador.comandos.usuarios.commandMostrarUsuario;
import Presentacion.controlador.comandos.usuarios.commandQueryDesarrollador;
import Presentacion.controlador.comandos.videojuegos.commandCrearVideojuego;
import Presentacion.controlador.comandos.videojuegos.commandEliminarVideojuego;
import Presentacion.controlador.comandos.videojuegos.commandModificarVideojuego;
import Presentacion.controlador.comandos.videojuegos.commandMostrarTodosVideojuegos;
import Presentacion.controlador.comandos.videojuegos.commandMostrarVideojuego;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author H�ctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CommandFactoriaImp extends CommandFactoria {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Command getCommand(Integer evento) {
		Command c = null;
		switch (evento.intValue()) {
		
		//Biblioteca
		case Eventos.CREAR_BIBLIOTECA:
        	c = new commandCrearBiblioteca();
        break;
		case Eventos.ELIMINAR_BIBLIOTECA:
        	c = new commandEliminarBiblioteca();
        break;
		case Eventos.MODIFICAR_BIBLIOTECA:
        	c = new commandModificarBiblioteca();
        break;
		case Eventos.MOSTRAR_BIBLIOTECA:
        	c = new commandMostrarBiblioteca();
        break;
		case Eventos.A�ADIR_VIDEOJUEGO_BIBLIOTECA:
        	c = new commandAnadirVideojuegoBilioteca();
        break;
		case Eventos.ELIMINAR_VIDEOJUEGO_BIBLIOTECA:
        	c = new commandEliminarVideojuegoBiblioteca();
        break;
        //videojuego
		case Eventos.CREAR_VIDEOJUEGO:
			c = new commandCrearVideojuego();
		break;
		case Eventos.ELIMINAR_VIDEOJUEGO:
			c = new commandEliminarVideojuego();
		break;
		case Eventos.MODIFICAR_VIDEOJUEGO:
			c = new commandModificarVideojuego();
		break;
		case Eventos.MOSTRAR_VIDEOJUEGO:
			c = new commandMostrarVideojuego();
		break;
		case Eventos.MOSTRAR_TODOS_VIDEOJUEGOS:
        	c = new commandMostrarTodosVideojuegos();
        break;
		case Eventos.CREAR_USUARIO:
        	c = new commandCrearUsuario();
        break;
		case Eventos.ELIMINAR_USUARIO:
        	c = new commandEliminarUsuario();
        break;
		case Eventos.MODIFICAR_USUARIO:
        	c = new commandModificarUsuario();
        break;
		case Eventos.MOSTRAR_USUARIO:
        	c = new commandMostrarUsuario();
        break;	
		case Eventos.MOSTRAR_TODOS_USUARIOS:
        	c = new commandMostrarTodosUsuarios();
        break;	
		case Eventos.QUERY_BIBLIOTECA:
        	c = new commandQueryBiblioteca();
        break;	
		case Eventos.QUERY_DESARROLLADOR:
        	c = new commandQueryDesarrollador();
        break;	
        //////////////segunda parte////////////////////////
        
		case Eventos.CREAR_PLATAFORMA:
        	c = new CommandCrearPlataforma();
        break;
        
		case Eventos.MODIFICAR_PLATAFORMA:
        	c = new CommandModificarPlataforma();
        break;
        
		case Eventos.MOSTRAR_PLATAFORMA:
        	c = new CommandMostrarPlataforma();
        break;
        
		case Eventos.MOSTRAR_PLATAFORMAS:
        	c = new CommandMostrarPlataformas();
        break;
        
		case Eventos.ELIMINAR_PLATAFORMA:
        	c = new CommandEliminarPlataforma();
        break;
        
		case Eventos.A�ADIR_PROGRAMA_PLATAFORMA:
        	c = new CommandAnadirProgramaPlataforma();
        break;
        
		case Eventos.BORRAR_PROGRAMA_PLATAFORMA:
        	c = new CommandBorrarProgramaPlataforma();
        break;
        
		}
		
		
		return c;
	}
}