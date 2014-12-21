package Negocio.biblioteca.imp;
import java.util.ArrayList;

import Integracion.biblioteca.DAOBiblioteca;
import Integracion.factoria.DAOFactoria;
import Integracion.query.Query;
import Integracion.query.factoriaQuery;
import Integracion.transaction.Transaction;
import Integracion.transactionManager.TransactionManager;
import Integracion.usuario.DAOUsuario;
import Integracion.videojuego.DAOVideojuego;
import Negocio.biblioteca.SABiblioteca;
/**
 * 
 */
import Negocio.biblioteca.TransferBiblioteca;
import Negocio.usuario.TransferUsuario;
import Negocio.videojuego.TransferVideojuego;
import Presentacion.controlador.Eventos;
import Presentacion.controlador.comandos.exceptions.commandException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SABibliotecaImp implements SABiblioteca {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->

	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void crearBiblioteca(TransferBiblioteca nuevo) throws commandException {//
        ////transaccion
		
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        DAOBiblioteca daoBiblio = DAOFactoria.getInstancia().nuevoDaoBiblioteca();

        if (!daoBiblio.buscarBiblioteca(nuevo.getNombre())) { //BUSCA LA BIBLIOTECA Y SI NO ESTÁ CREA LA BIBLIOTECA
        	daoBiblio.crearBiblioteca(nuevo);
            transaccion.commit();
        } else{
            transaccion.rollback();
            throw new commandException("ERROR: Usuario existente");        	
        }
        TransactionManager.getInstance().eliminarTransaccion();
        
    	
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void modificarBiblioteca(TransferBiblioteca mod)throws commandException{
        ////transaccion
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        DAOBiblioteca daoBiblio = DAOFactoria.getInstancia().nuevoDaoBiblioteca();

        if (!daoBiblio.buscarBiblioteca(mod.getNombre())) { //BUSCA LA BIBLIOTECA Y SI NO ESTÁ YA UNA BIBLIO, MODIFICA LA EXISTENTE
        	daoBiblio.crearBiblioteca(mod);
            transaccion.commit();
        } else{
            transaccion.rollback();  
            throw new commandException("ERROR: Biblioteca existente");
        }
        TransactionManager.getInstance().eliminarTransaccion();
        
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TransferVideojuego> mostrarBiblioteca(TransferBiblioteca biblio) { // muestra todos los videojuegos
		DAOVideojuego daoV;
        ////transaccion
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        
        daoV = DAOFactoria.getInstancia().nuevoDaoVideojuego();		    
       ArrayList<TransferVideojuego> ret = daoV.mostrarTodosVideojuegos();
        
        TransactionManager.getInstance().eliminarTransaccion();
        return ret;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TransferBiblioteca> mostrarTodasBibliotecas() {
		DAOBiblioteca daoB;
        ////transaccion
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        
        daoB = DAOFactoria.getInstancia().nuevoDaoBiblioteca();		    
       ArrayList<TransferBiblioteca> ret = daoB.mostrarTodasBibliotecas();
        
        TransactionManager.getInstance().eliminarTransaccion();
        return ret;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void eliminarBiblioteca(TransferBiblioteca newParam) {
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        DAOBiblioteca daoBiblio = DAOFactoria.getInstancia().nuevoDaoBiblioteca();

        if (!daoBiblio.buscarBiblioteca(newParam.getNombre())) { //BUSCA LA BIBLIOTECA Y SI NO ESTÁ CREA LA BIBLIOTECA
        	daoBiblio.eliminarBiblioteca(newParam);
            transaccion.commit();
        } else{
            transaccion.rollback();       	
        }
        TransactionManager.getInstance().eliminarTransaccion();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void anadirVideojuegoBiblioteca(TransferVideojuego videojuego,TransferBiblioteca biblio) {
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        DAOBiblioteca daoBiblio = DAOFactoria.getInstancia().nuevoDaoBiblioteca();

        if (!daoBiblio.buscarBiblioteca(biblio.getNombre())){ //BUSCA LA BIBLIOTECA Y SI NO ESTÁ CREA LA BIBLIOTECA
        	daoBiblio.anadirVideojuegoBiblioteca(videojuego, biblio);
            transaccion.commit();
        } else{
            transaccion.rollback();       	
        }
        TransactionManager.getInstance().eliminarTransaccion();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void eliminarVideojuegoBiblioteca(TransferVideojuego videojuego,TransferBiblioteca biblio){
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        DAOBiblioteca daoBiblio = DAOFactoria.getInstancia().nuevoDaoBiblioteca();

        if (!daoBiblio.buscarBiblioteca(biblio.getNombre())){ //BUSCA LA BIBLIOTECA Y SI NO ESTÁ CREA LA BIBLIOTECA
        	daoBiblio.eliminarVideojuegoBiblioteca(videojuego, biblio);
            transaccion.commit();
        } else{
            transaccion.rollback();       	
        }
        TransactionManager.getInstance().eliminarTransaccion();
	}
	
	public ArrayList<TransferVideojuego> buscaBibliotecasNjuegos(int id){
		
        Transaction transaccion= TransactionManager.getInstance().nuevaTransaccion();
        transaccion.start();
		
        //Obtenemos el DAO
        
       Query query = factoriaQuery.getInstance().getQuery(Eventos.QUERY_BIBLIOTECA);		    
       ArrayList<TransferVideojuego> ret= (ArrayList<TransferVideojuego>) query.execute(id); //n videojuego
        
        TransactionManager.getInstance().eliminarTransaccion();
        
        return ret;
	}
}