package Integracion.transactionManager.imp;

import java.util.concurrent.ConcurrentHashMap;

import Integracion.transaction.Transaction;
import Integracion.transaction.imp.TransactionImp;
import Integracion.transactionManager.TransactionManager;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Héctor
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransactionManagerImp extends TransactionManager {
	ConcurrentHashMap<Thread, Transaction> myConcurrentHashMap;
	
	public TransactionManagerImp() {
		myConcurrentHashMap = new ConcurrentHashMap<Thread, Transaction>();
	}
	
	
	@Override
	public Transaction nuevaTransaccion() {
		// TODO Auto-generated method stub
		Transaction t = new TransactionImp();
		myConcurrentHashMap.put(Thread.currentThread(),t);
		return getTransaction();
	}

	@Override
	public void eliminarTransaccion() {
		myConcurrentHashMap.remove(Thread.currentThread());
		
	}

	@Override
	public Transaction getTransaction() {
		// TODO Auto-generated method stub
		Transaction TransactionReturned = myConcurrentHashMap.get(Thread
				.currentThread());
	
		return TransactionReturned;
	}
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

}