package Integracion.transaction.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Integracion.transaction.Transaction;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransactionImp implements Transaction {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Connection conexion;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void start() {
		conexion = null;
		 try {
	           try {
	        	   
	                Class.forName("com.mysql.jdbc.Driver");
	                conexion = DriverManager.getConnection("jdbc:mysql://localhost/spielbox_videojuegos", "root", "");
	                conexion.setAutoCommit(false);
	                
	            } catch (ClassNotFoundException e) {
	            	
	                System.out.println("Error GeneralDao - getConnection - Clase no encontrada.");
	                e.printStackTrace();	               
	            }
	        }
		 catch (SQLException e) {
	        	
	            System.err.println("SQLException: " + e.getMessage());
	            System.err.println("SQLState: " + e.getSQLState());
	            System.err.println("VendorError: " + e.getErrorCode());
	        }
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void commit() {
		  try {
	          if (conexion != null) {
	        	  conexion.commit();
	        	  conexion.close();
	          }
	      } catch (SQLException e) {
	      }
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void rollback() {
		try {
	          if (conexion != null) {
	        	  conexion.rollback();
	        	  conexion.close();
	          }
	      } catch (SQLException e) {
	      }
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Connection getResources() {
		return conexion;
	}
}