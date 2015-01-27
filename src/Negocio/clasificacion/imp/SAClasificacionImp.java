package Negocio.clasificacion.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Negocio.clasificacion.Clasificacion;
import Negocio.clasificacion.SAClasificacion;
import Negocio.clasificacion.TransferClasificacion;
import Presentacion.controlador.comandos.exceptions.commandException;

public class SAClasificacionImp implements SAClasificacion {
	
	public void crearClasificacion(TransferClasificacion transfer) throws commandException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("SELECT x FROM Clasificacion x WHERE x.dificultad = ?1");
		query.setParameter (1, transfer.getDificultad());
		
		Clasificacion BOClasificacion;
		boolean ret = false;
		
		if (query.getResultList().isEmpty()) {
			BOClasificacion = new Clasificacion ();
			BOClasificacion.setDificultad(transfer.getDificultad());
			
			em.persist(BOClasificacion);
			em.getTransaction().commit();
			ret = true;
			transfer.setID(BOClasificacion.getID());
		}
		else {
			em.clear();
			em.getTransaction().rollback();
		}
		
		em.close();
		factory.close();
		
		if (!ret)
			throw new commandException("Ya existe esta clasificación.");
	}

	public void modificarClasificacion(TransferClasificacion transfer) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
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
		
		em.close();
		factory.close();
	}

	public TransferClasificacion mostrarClasificacion (TransferClasificacion transfer) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Clasificacion BOClasificacion = em.find(Clasificacion.class, transfer.getID());
		
		em.close();
		factory.close();
		
		if (BOClasificacion != null) {
			return transfer;
		} 
		else return null;
		
		
	}

	public ArrayList<TransferClasificacion> mostrarClasificaciones() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		TypedQuery<Clasificacion> query = em.createNamedQuery("SELECT c FROM clasificacion c", Clasificacion.class);
		List<Clasificacion> pl = query.getResultList();
		
		ArrayList<TransferClasificacion> clasificaciones = new ArrayList<TransferClasificacion>();
		
		for (int i = 0; i < pl.size(); i++){
			Clasificacion p = (Clasificacion) pl.get(i);
			TransferClasificacion all = new TransferClasificacion();
			all.setID (p.getID());
			all.setDificultad (p.getDificultad());
			clasificaciones.add(all);
		}
		
		em.close();
		factory.close();
		
		return clasificaciones;
	}

	public void eliminarClasificacion (TransferClasificacion transfer) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpielBox");
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
		
		em.close();
		factory.close();
	}
}