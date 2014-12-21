package Integracion.videojuego.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Integracion.transactionManager.TransactionManager;
import Integracion.videojuego.DAOVideojuego;
/**
 * 
 */
import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.Generador;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOVideojuegoImp implements DAOVideojuego {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void crearVideojuego(TransferVideojuego t) {
		t.setID(Generador.generaIds());
		String query ="INSERT INTO videojuego VALUES ('"+ t.getID() + "', '" + t.getNombre() +"', '"+ t.getCategoria() +"', '"+ t.getCalificacion() +"', '"+ t.getPrecio() +"');";
		Statement s;
		
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
	        s.executeUpdate(query);
	        s.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void modificarVideojuego(TransferVideojuego t) {
		String query1, query2, query3, query4;
		query1 ="UPDATE videojuego SET nombre = " + "'" + t.getNombre() + "'" + " WHERE ID = " + "'" + String.valueOf(t.getID()) + "';"; 
		query2 ="UPDATE videojuego SET categoria =" + "'" + t.getCategoria() + "'" + " WHERE ID = " + "'" + String.valueOf(t.getID()) + "';"; 
		query3 ="UPDATE videojuego SET calificacion =" + "'" + String.valueOf(t.getCalificacion()) + "'" + " WHERE ID = " + "'" + String.valueOf(t.getID()) + "';"; 
		query4 ="UPDATE videojuego SET precio =" + "'" + String.valueOf(t.getPrecio()) + "'" + " WHERE ID = " + "'" + String.valueOf(t.getID()) + "';";
		Statement s;
		
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
	        s.executeUpdate(query1);
	        s.executeUpdate(query2);
	        s.executeUpdate(query3);
	        s.executeUpdate(query4);
	        s.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferVideojuego mostrarVideojuego(int ID) {

		TransferVideojuego ret = new TransferVideojuego();
		ResultSet rs;
		Statement s;
		String query = "SELECT * FROM videojuego WHERE ID = " + String.valueOf(ID) + ";";
		
		System.err.println(query);
		
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			rs = s.executeQuery(query);
			rs.next();
			ret.setID(Integer.valueOf(rs.getString("ID")));
			ret.setNombre(rs.getString("nombre"));
			ret.setCategoria(rs.getString("categoria"));
			ret.setCalificacion(Double.valueOf(rs.getString("calificacion")));
			ret.setPrecio(Double.valueOf(rs.getString("precio")));			
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
	public ArrayList<TransferVideojuego> mostrarTodosVideojuegos() {
		ArrayList<TransferVideojuego> ret = new ArrayList<TransferVideojuego>();
		TransferVideojuego transfer = new TransferVideojuego();
		ResultSet rs;
		Statement s;
		String query = "SELECT * FROM videojuego;";
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			rs = s.executeQuery(query);
			while(rs.next()) {
				transfer.setID(Integer.valueOf(rs.getString("ID")));
				transfer.setNombre(rs.getString("nombre"));
				transfer.setCalificacion(Double.valueOf(rs.getString("calificacion")));
				transfer.setPrecio(Double.valueOf(rs.getString("precio")));
				transfer.setCategoria(rs.getString("categoria"));
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
	public void eliminarVideojuego(TransferVideojuego transfer) {
		String query ="DELETE FROM videojuego WHERE ID = " + String.valueOf(transfer.getID()) + ";";
		Statement s;
		System.out.println(query);
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
	public boolean buscarIDVideojuego(int id) {
		boolean existente = false;
		ResultSet rs;
		Statement s;
		String query = "SELECT ID FROM videojuego;";
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			rs = s.executeQuery(query);
			while(rs.next() && !existente) {
				if(id == Integer.valueOf(rs.getString("ID"))) {
					existente = true;
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return existente;
	}
}