package Negocio.clasificacion.imp;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Integracion.transaction.Transaction;
import Integracion.transactionManager.TransactionManager;
import Negocio.clasificacion.Clasificacion;
import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.TransferClasificacion;

public class SAClasificacionImp implements SAClasificacion {
	
	public void crearClasificacion(TransferClasificacion transfer) {
		Transaction transaccion = TransactionManager.getInstance().nuevaTransaccion();
		transaccion.start();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SAFactoryClasificacion");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Clasificacion BOClasificacion = em.find(Clasificacion.class, transfer.getID());
		
		if (BOClasificacion == null) {
			BOClasificacion = new Clasificacion ();
			BOClasificacion.setDificultad(transfer.getDificultad());
			
			em.persist(BOClasificacion);
			em.getTransaction().commit();
		}
		else {
			em.clear();
			em.getTransaction().rollback();
		}
	}

	public void modificarClasificacion(TransferClasificacion transfer) {
		Transaction transaccion = TransactionManager.getInstance().nuevaTransaccion();
		transaccion.start();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SAFactoryClasificacion");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Clasificacion BOClasificacion = em.find(Clasificacion.class, transfer.getID());
		
		if (BOClasificacion != null) {
			BOClasificacion = new Clasificacion ();
			BOClasificacion.setDificultad(transfer.getDificultad());
			
			em.persist(BOClasificacion);
			em.getTransaction().commit();
		}
		else {
			em.clear();
			em.getTransaction().rollback();
		}
	}

	public TransferClasificacion mostrarClasificacion (TransferClasificacion transfer) {
		Transaction transaccion = TransactionManager.getInstance().nuevaTransaccion();
		transaccion.start();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SAFactoryClasificacion");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Clasificacion BOClasificacion = em.find(Clasificacion.class, transfer.getID());
		
		if (BOClasificacion != null) {
			return transfer;
		} 
		else return null;
	}

	public ArrayList<TransferClasificacion> mostrarClasificaciones() {
		Transaction transaccion = TransactionManager.getInstance().nuevaTransaccion();
		transaccion.start();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SAFactoryClasificacion");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		TypedQuery query = em.createNamedQuery("SELECT c FROM clasificacion c", Clasificacion.class);
		
		return (ArrayList<TransferClasificacion>) query.getResultList(); // boom headshot MIRALO JEFF HIJOPUTA
	}

	public void eliminarClasificacion (TransferClasificacion transfer) {
		Transaction transaccion = TransactionManager.getInstance().nuevaTransaccion();
		transaccion.start();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SAFactoryClasificacion");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Clasificacion BOClasificacion = em.find(Clasificacion.class, transfer.getID());
		
		if (BOClasificacion != null) {
			em.remove(BOClasificacion);
			em.getTransaction().commit();
		}
		else {
			em.getTransaction().rollback();
		}
	}
}