package Integracion.usuario.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Integracion.transactionManager.TransactionManager;
import Integracion.usuario.DAOUsuario;
import Negocio.usuario.TransferCliente;
import Negocio.usuario.TransferDesarrollador;
import Negocio.usuario.TransferUsuario;
import Presentacion.controlador.Generador;

public class DAOUsuarioImp implements DAOUsuario {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void crearUsuario(TransferUsuario nuevo) {
		nuevo.setID(Generador.generaIds());
		String query = null;
		if(nuevo.getClass() == TransferCliente.class) {
			query ="INSERT INTO cliente VALUES ('"+ nuevo.getID() + "', '" + nuevo.getNombre()+"', '"+ nuevo.getNick()+ "', '" + nuevo.getApellidos() + "', '" + nuevo.getEmail()+ "');";
		} else {
			query ="INSERT INTO desarrollador VALUES ('"+ nuevo.getID() + "', '" + nuevo.getNombre()+"', '"+ nuevo.getNick()+ "', '" + nuevo.getApellidos() + "', '" + nuevo.getEmail()+ "', '" + ((TransferDesarrollador) nuevo).getDescuento()+"');";
		}
		Statement s;
		
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
	        s.executeUpdate(query);
	        s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void modificarUsuario(TransferUsuario aModificar) {
		String query1;
		String query2;
		Statement s;
		try {
		s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
		if(aModificar.getClass() == TransferCliente.class) {
			query1 ="UPDATE cliente SET nombre = " + "'" + aModificar.getNombre() + "'" + " WHERE ID = " + "'" + String.valueOf(aModificar.getID()) + "';"; 
			query2 ="UPDATE cliente SET apellidos = " + "'" + aModificar.getApellidos() + "'" + " WHERE ID = " + "'" + String.valueOf(aModificar.getID()) + "';"; 
		} else {
			query1 ="UPDATE desarrollador SET nombre = " + "'" + aModificar.getNombre() + "'" + " WHERE ID = " + "'" + String.valueOf(aModificar.getID()) + "';"; 
			query2 ="UPDATE desarrollador SET apellidos = " + "'" + aModificar.getApellidos() + "'" + " WHERE ID = " + "'" + String.valueOf(aModificar.getID()) + "';"; 
		}
		
	        s.executeUpdate(query1);
	        s.executeUpdate(query2);
	        s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferUsuario mostrarUsuario(int ID) {
		TransferCliente transfer = new TransferCliente();
		TransferDesarrollador transfer2 =  new TransferDesarrollador();
		boolean existente =false;
		ResultSet rs;
		Statement s;
		
		String query = "SELECT * FROM cliente;";
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			rs = s.executeQuery(query);
			while(rs.next() && !existente) {
				if(ID == Integer.valueOf(rs.getString("ID"))) {
					existente = true;
					transfer.setID(Integer.valueOf(rs.getString("ID")));
					transfer.setApellidos(rs.getString("apellidos"));
					transfer.setNombre(rs.getString("nombre"));
					transfer.setEmail(rs.getString("email"));
					transfer.setNick(rs.getString("nick"));	
				}
			}
			if(!existente){
			query = "SELECT * FROM desarrollador;";
			rs = s.executeQuery(query);
			while(rs.next()) {
				if(ID == Integer.valueOf(rs.getString("ID"))) {		
					transfer2.setID(Integer.valueOf(rs.getString("ID")));
					transfer2.setApellidos(rs.getString("apellidos"));
					transfer2.setNombre(rs.getString("nombre"));
					transfer2.setEmail(rs.getString("email"));
					transfer2.setNick(rs.getString("nick"));				
					transfer2.setDescuento(rs.getString("descuento"));
				}
			}
			}
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// end-user-code
		if(existente == true)
			return transfer;
		else
			return transfer2;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TransferUsuario> mostrarTodosUsuarios() {
		ArrayList<TransferUsuario> ret = new ArrayList<TransferUsuario>();
		
		ResultSet rs;
		Statement s;
		String query = "SELECT * FROM cliente;";
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			rs = s.executeQuery(query);
			
			while(rs.next()) {
				TransferCliente transfer = new TransferCliente();
				transfer.setID(Integer.valueOf(rs.getString("ID")));
				transfer.setApellidos(rs.getString("apellidos"));
				transfer.setNombre(rs.getString("nombre"));
				transfer.setEmail(rs.getString("email"));
				transfer.setNick(rs.getString("nick"));				
				ret.add(transfer);
			}
			query = "SELECT * FROM desarrollador;";
			rs = s.executeQuery(query);
			while(rs.next()) {
				TransferDesarrollador transfer =  new TransferDesarrollador();
				transfer.setID(Integer.valueOf(rs.getString("ID")));
				transfer.setApellidos(rs.getString("apellidos"));
				transfer.setNombre(rs.getString("nombre"));
				transfer.setEmail(rs.getString("email"));
				transfer.setNick(rs.getString("nick"));				
				transfer.setDescuento(rs.getString("descuento"));
				ret.add(transfer);
			}
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// end-user-code
		return ret;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void eliminarUsuario(TransferUsuario aEliminar) {
		String query = null;
		if(aEliminar.getClass() == TransferCliente.class) {
			query ="DELETE FROM cliente WHERE ID = '" + String.valueOf(aEliminar.getID()) + "';";
		} else {
			query ="DELETE FROM desarrollador WHERE ID = '" + String.valueOf(aEliminar.getID()) + "';";
		}
		Statement s;
		
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
	        s.executeUpdate(query);
	        s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean buscarIDUsuario(int ID) {
		boolean existente = false;
		ResultSet rs;
		Statement s;
		String query = "SELECT ID FROM cliente;";
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			rs = s.executeQuery(query);
			while(rs.next() && !existente) {
				if(ID == Integer.valueOf(rs.getString("ID"))) {
					existente = true;
				}
			}
			if(!existente){
				query = "SELECT ID FROM desarrollador;";
				s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
				rs = s.executeQuery(query);
				while(rs.next() && !existente) {
					if(ID == Integer.valueOf(rs.getString("ID"))) {
						existente = true;
					}
				}				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return existente;
	}


}
