package Integracion.biblioteca.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Integracion.biblioteca.DAOBiblioteca;
import Integracion.transactionManager.TransactionManager;
import Negocio.biblioteca.TransferBiblioteca;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.Eventos;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOBibliotecaImp implements DAOBiblioteca {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void crearBiblioteca(TransferBiblioteca tBiblioteca) {
		String query ="INSERT INTO biblioteca VALUES ('"+ tBiblioteca.getID() +"', '"+ tBiblioteca.getID_usuario() + "', '" + tBiblioteca.getNombre()+"');";
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
	public void modificarBiblioteca(TransferBiblioteca tBiblioteca) {
		String query ="INSERT INTO biblioteca VALUES ('"+ tBiblioteca.getID() +"', '"+ tBiblioteca.getID_usuario() + "', '" + tBiblioteca.getNombre()+"');";
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
	 * @return 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferBiblioteca mostrarBiblioteca(int ID) {
		String query = "SELECT * FROM biblioteca WHERE biblioteca.ID = " + ID;
		Statement s = null;
		ResultSet datos = null;
		TransferBiblioteca transferDatos = null;
		
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			datos = s.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (s != null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		if (datos != null) {
			try {
				transferDatos = new TransferBiblioteca();
				
				transferDatos.setID(Integer.parseInt(datos.getString("ID")));
				transferDatos.setID_usuario(Integer.parseInt(datos.getString("usuario")));
				transferDatos.setNombre(datos.getString("nombre"));
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
			}
		}
		
		return transferDatos;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TransferBiblioteca> mostrarTodasBibliotecas() {
		String query = "SELECT * FROM biblioteca";
		Statement s = null;
		ResultSet datos = null;
		ArrayList<TransferBiblioteca> transfersDatos = null;
		
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
			datos = s.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (s != null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		if (datos != null) {
			try {
				transfersDatos = new ArrayList<TransferBiblioteca>();
				TransferBiblioteca transfer = new TransferBiblioteca();
				
				while(datos.next()) {
					transfer.setID(Integer.valueOf(datos.getString("ID")));
					transfer.setID_usuario(Integer.parseInt(datos.getString("usuario")));
					transfer.setNombre(datos.getString("nombre"));
					transfersDatos.add(transfer);
				}
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
			}
		}
		
		return transfersDatos;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void eliminarBiblioteca(TransferBiblioteca tBiblioteca) {
		String query ="DELETE FROM biblioteca WHERE biblioteca.ID = '" + tBiblioteca.getID() + "'";
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
	public void anadirVideojuegoBiblioteca(TransferVideojuego videojuego, TransferBiblioteca tBiblioteca) {
		String query ="INSERT INTO copia VALUES ('" + Eventos.Id_Unica + "', '" + videojuego.getID() + "'," + tBiblioteca.getID() + "')";
		Eventos.Id_Unica++;
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
	public void eliminarVideojuegoBiblioteca(TransferVideojuego videojuego, TransferBiblioteca tBiblioteca) {
		String query ="DELETE FROM copia WHERE videojuego = '" + videojuego.getID() + "' AND biblioteca = '" + tBiblioteca.getID() + "'";
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
	public boolean buscarBiblioteca(String nombre) {
		String query ="SELECT b FROM biblioteca WHERE b.nombre = " + nombre;
		Statement s = null;
		
		try {
			s = TransactionManager.getInstance().getTransaction().getResources().createStatement();
	        s.executeUpdate(query);
	        s.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if (s == null ) return false;
		else return true;
	}
}