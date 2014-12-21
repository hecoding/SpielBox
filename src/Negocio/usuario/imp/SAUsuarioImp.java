package Negocio.usuario.imp;

import java.util.ArrayList;

import Integracion.factoria.DAOFactoria;
import Integracion.query.Query;
import Integracion.query.factoriaQuery;
import Integracion.transaction.Transaction;
import Integracion.transactionManager.TransactionManager;
import Integracion.usuario.DAOUsuario;
import Negocio.usuario.SAUsuario;
/**
 * 
 */
import Negocio.usuario.TransferUsuario;
import Presentacion.controlador.Eventos;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAUsuarioImp implements SAUsuario {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String crearUsuario(TransferUsuario nuevo) throws commandException {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		DAOUsuario daoUsuario;
        String mensaje;
        ////transaccion
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO

       daoUsuario = DAOFactoria.getInstancia().nuevoDaoUsuario();
  

        if (!daoUsuario.buscarIDUsuario(nuevo.getID())){
        	daoUsuario.crearUsuario(nuevo);
            mensaje = "Usuario creado";
            transaccion.commit();
        } else {
            mensaje = "ERROR: Ya existe ese usuario";
            transaccion.rollback();
        }
        
        TransactionManager.getInstance().eliminarTransaccion();
        
        return mensaje;
		// end-user-code*/
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String modificarUsuario(TransferUsuario aModificar) throws commandException {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		DAOUsuario daoUsuario;
        String mensaje;
        ////transaccion
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        	daoUsuario = DAOFactoria.getInstancia().nuevoDaoUsuario();


        if (daoUsuario.buscarIDUsuario(aModificar.getID())) {
        	daoUsuario.modificarUsuario(aModificar);
            mensaje = "Usuario modificado";
            transaccion.commit();
        } else {
            mensaje = "ERROR: Usuario inexistente";
            transaccion.rollback();
        }
        
        TransactionManager.getInstance().eliminarTransaccion();
        
        return mensaje;
		// end-user-code*/
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferUsuario mostrarUsuario(TransferUsuario datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		DAOUsuario daoUsuario;
        ////transaccion
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        	daoUsuario = DAOFactoria.getInstancia().nuevoDaoUsuario();

        	TransferUsuario t = null;
        if (daoUsuario.buscarIDUsuario(datos.getID())) {
        	t=daoUsuario.mostrarUsuario(datos.getID());
            transaccion.commit();
        } else
            transaccion.rollback();
        
        
        TransactionManager.getInstance().eliminarTransaccion();
        
        return t;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return 
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	 public ArrayList<TransferUsuario> mostrarTodosUsuarios() {
			DAOUsuario daoUsuario;
	        ////transaccion
	        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
	        transaccion.start();
			
	        //Obtenemos el DAO
	        
	       daoUsuario = DAOFactoria.getInstancia().nuevoDaoUsuario();		    
	       ArrayList<TransferUsuario> ret = daoUsuario.mostrarTodosUsuarios();

	        
	        
	        TransactionManager.getInstance().eliminarTransaccion();
	        return ret;
	 }

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String eliminarUsuario(TransferUsuario aEliminar) throws commandException {
		// begin-user-code
				// TODO Apéndice de método generado automáticamente
				DAOUsuario daoUsuario;
		        String mensaje;
		        ////transaccion
		        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
		        transaccion.start();
				
		        //Obtenemos el DAO
		        
		       daoUsuario = DAOFactoria.getInstancia().nuevoDaoUsuario();		    

		        if (daoUsuario.buscarIDUsuario(aEliminar.getID())) {
		        	daoUsuario.eliminarUsuario(aEliminar);
		            mensaje = "Usuario eliminar";
		            transaccion.commit();
		        } else {
		            mensaje = "ERROR: Usuario inexistente";
		            transaccion.rollback();
		        }
		        
		        TransactionManager.getInstance().eliminarTransaccion();
		        
		        return mensaje;
	}

	@Override
	public ArrayList<TransferUsuario> buscarDesarroladorDescuento(int descuento) {
		// TODO Auto-generated method stub
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        
       Query query = factoriaQuery.getInstance().getQuery(Eventos.QUERY_DESARROLLADOR);		    
       ArrayList<TransferUsuario> ret= (ArrayList<TransferUsuario>) query.execute(descuento);
        
        TransactionManager.getInstance().eliminarTransaccion();
        
        return ret;
	}


}