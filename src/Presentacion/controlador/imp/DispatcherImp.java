package Presentacion.controlador.imp;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import Negocio.biblioteca.TransferBiblioteca;
import Negocio.usuario.TransferCliente;
import Negocio.usuario.TransferDesarrollador;
import Negocio.usuario.TransferUsuario;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.biblioteca.JDialogMostrarBiblioteca;
import Presentacion.biblioteca.JPanelBiblioteca;
import Presentacion.biblioteca.JPanelBiblioteca.TableModelBiblioteca;
import Presentacion.controlador.Dispatcher;
import Presentacion.controlador.Eventos;
import Presentacion.controlador.comandos.plataforma.CommandAnadirProgramaPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandBorrarProgramaPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandCrearPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandEliminarPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandModificarPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandMostrarPlataforma;
import Presentacion.controlador.comandos.plataforma.CommandMostrarPlataformas;
import Presentacion.usuario.JPanelUsuarios;
import Presentacion.videojuego.JDialogMostrarVideojuego;
import Presentacion.videojuego.JPanelVideojuego;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DispatcherImp extends Dispatcher {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public void dispatch(Integer evento, Object datos) {
		// TODO Auto-generated method stub
		
		//DEPENDIENDO DE LA ENTIDAD QUE ESTEMOS TRATANDO ACTUALIZAREMOS LOS JTABLE o no...
		
		
		switch (evento.intValue()) {
		
		//Biblioteca
		case Eventos.CREAR_BIBLIOTECA:
			JPanelBiblioteca.getModelo().setValue((TransferBiblioteca)datos);			
        break;
        
		case Eventos.ELIMINAR_BIBLIOTECA:
			JPanelBiblioteca.getModelo().removeRow((TransferBiblioteca)datos);
        break;
        
		case Eventos.MODIFICAR_BIBLIOTECA:
			JPanelBiblioteca.getModelo().setValue((TransferBiblioteca)datos);			
        break;
        
		case Eventos.MOSTRAR_BIBLIOTECA:
			JPanelBiblioteca.getModeloVideojuegoBiblioteca().setValue((ArrayList<TransferVideojuego>) datos);
        break;
        
		case Eventos.AÑADIR_VIDEOJUEGO_BIBLIOTECA: 
			JOptionPane.showMessageDialog(new JPanel(), "Videojuego Añadido correctamente.");
			//JPanelBiblioteca.getModeloVideojuegoBiblioteca().setValue((TransferVideojuego) datos);
        break;
        
		case Eventos.ELIMINAR_VIDEOJUEGO_BIBLIOTECA:
			JOptionPane.showMessageDialog(new JPanel(), "Videojuego eliminado correctamente.");
			//JPanelBiblioteca.getModeloVideojuegoBiblioteca().removeRow((TransferVideojuego) datos);
        break;
		case Eventos.CREAR_VIDEOJUEGO:
			JPanelVideojuego.getModelo().setValue((TransferVideojuego)datos);
		break;
		case Eventos.ELIMINAR_VIDEOJUEGO:
			JPanelVideojuego.getModelo().removeRow((TransferVideojuego)datos);
		break;
		case Eventos.MODIFICAR_VIDEOJUEGO:
			JPanelVideojuego.getModelo().setValue((TransferVideojuego)datos);
		break;
		case Eventos.MOSTRAR_VIDEOJUEGO:
			TransferVideojuego ret =(TransferVideojuego)datos;
			JOptionPane.showMessageDialog(null, "ID: "+ret.getID()+ "\n" + 
			"Nombre: "+ ret.getNombre()+ "\n" +  "Categoria: "+ret.getCategoria()+"\n"+"Calificacion: "+ret.getCalificacion()+"\n"+"Precio: "+ ret.getPrecio());
			
			break;
		case Eventos.MOSTRAR_TODOS_VIDEOJUEGOS:
			JPanelVideojuego.getModelo().setValue((ArrayList<TransferVideojuego>) datos);
			break;
		
		case Eventos.CREAR_USUARIO:
			JPanelUsuarios.getTableModel().setValue((TransferUsuario)datos);			
        break;
        
		case Eventos.ELIMINAR_USUARIO:
			JPanelUsuarios.getTableModel().removeRow((TransferUsuario)datos);
        break;
        
		case Eventos.MODIFICAR_USUARIO:
			JPanelUsuarios.getTableModel().setValue((TransferUsuario)datos);			
        break;
        
		case Eventos.MOSTRAR_USUARIO:
			TransferUsuario ret2 =(TransferUsuario)datos;
			String msg= "ID: "+ret2.getID()+ "\n" + 
					"Nombre: "+ ret2.getNombre()+ "\n" +  "Apellido: "+ret2.getApellidos()+"\n"+"Nick: "+ret2.getNick()+"\n"+"Email: "+ ret2.getEmail()+"\n";
			String msg2 ="";		
			if(ret2.getClass() != TransferCliente.class) {
				msg2 = "Descuento: "+((TransferDesarrollador) ret2).getDescuento();
			}
			JOptionPane.showMessageDialog(null, msg+msg2);
			
        break;
        
		case Eventos.MOSTRAR_TODOS_USUARIOS:
			JPanelUsuarios.getTableModel().setValue((ArrayList<TransferUsuario>) datos);
			break;
		case Eventos.QUERY_BIBLIOTECA:
			//JPanelUsuarios.getTableUsuario().setValue(TransferUsuario) datos);
        break;
		
		case Eventos.QUERY_DESARROLLADOR:
			ArrayList<TransferUsuario> p =  new ArrayList<TransferUsuario>();
			JOptionPane.showMessageDialog(null,p.get(0).getID());
			//JPanelUsuarios.getTableUsuario().setValue(TransferUsuario) datos);
        break;
        
        
        /////////////////////////////////////////////////////////////
        //////////////    Segunda Parte /////////////////////////////
        /////////////////////////////////////////////////////////////
		case Eventos.CREAR_PLATAFORMA:
        	JOptionPane.showMessageDialog(null, "CREAR");
        break;
        
		case Eventos.MODIFICAR_PLATAFORMA:
			JOptionPane.showMessageDialog(null, "modicar");
        break;
        
		case Eventos.MOSTRAR_PLATAFORMA:
			JOptionPane.showMessageDialog(null, "mostrar");
        break;
        
		case Eventos.MOSTRAR_PLATAFORMAS:
        break;
        
		case Eventos.ELIMINAR_PLATAFORMA:
			JOptionPane.showMessageDialog(null, "delete");
        break;
        
		case Eventos.AÑADIR_PROGRAMA_PLATAFORMA:
			JOptionPane.showMessageDialog(null, "anaprogplat");
        break;
        
		case Eventos.BORRAR_PROGRAMA_PLATAFORMA:
			JOptionPane.showMessageDialog(null, "borraprofplat");
        break;       
        
        
		}
	}
}